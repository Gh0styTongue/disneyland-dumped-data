package com.disney.wdpro.httpclient.authentication;

import android.content.Context;
import android.text.TextUtils;
import com.disney.wdpro.httpclient.C13322a;
import com.disney.wdpro.httpclient.authentication.model.DisneyApplication;
import com.disney.wdpro.httpclient.authentication.model.DisneyApplications;
import com.disney.wdpro.httpclient.authentication.model.DisneyToken;
import com.disney.wdpro.httpclient.authentication.model.DisneyUser;
import com.google.common.base.C22462m;
import com.google.common.base.Optional;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.util.HashMap;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@Instrumented
/* loaded from: classes23.dex */
public class DisneyAccountManager {
    public static final String KEY_CLIENT_ID = "KEY_CLIENT_ID";
    private AuthenticatorListener authListener;
    private C13322a authenticationAnalyticsHelper;
    private UserDataStorage userDataStorage;

    @Inject
    public DisneyAccountManager(Context context, AuthConfig authConfig, AuthenticatorListener authenticatorListener, C13322a c13322a, UserDataStorage userDataStorage) {
        C22462m.m68684p(context);
        C22462m.m68684p(authConfig);
        this.authListener = (AuthenticatorListener) C22462m.m68684p(authenticatorListener);
        this.userDataStorage = userDataStorage;
        this.authenticationAnalyticsHelper = c13322a;
    }

    private void createEmptyAccount() {
        this.userDataStorage.storeUserData(new DisneyUser.Builder().build());
        this.authListener.onNewUserData();
    }

    private void createUserDataIfAbsent() {
        if (this.userDataStorage.getUserData() == null) {
            createEmptyAccount();
        }
    }

    private void saveApplications(DisneyApplications disneyApplications) {
        String json = GsonInstrumentation.toJson(new Gson(), disneyApplications);
        this.userDataStorage.storeApplicationData("com.disney.account.applications_data", disneyApplications);
        this.authenticationAnalyticsHelper.m55551c(json, null, false);
    }

    private void saveAuthToken(String str, DisneyToken disneyToken) {
        if (!TextUtils.isEmpty(disneyToken.getTTL())) {
            try {
                this.userDataStorage.storePublicToken(str, new PublicToken(disneyToken.getValue(), (Long.parseLong(disneyToken.getTTL()) * 1000) + System.currentTimeMillis()));
            } catch (NumberFormatException unused) {
                this.userDataStorage.storePublicToken(str, new PublicToken(disneyToken.getValue(), -1L));
            }
        }
        this.authenticationAnalyticsHelper.m55552d(C13322a.EVENT_TOKEN_UPDATE, str, disneyToken.getType(), null, disneyToken.getValue() != null, false);
    }

    private synchronized void saveUserData(DisneyUser disneyUser) {
        this.userDataStorage.storeUserData(disneyUser);
        this.authenticationAnalyticsHelper.m55551c(null, "com.disney.account.user", false);
    }

    public void clearAllJwt() {
        DisneyUser userData = getUserData();
        if (userData != null) {
            userData.clearAllJwt();
            saveUserData(userData);
        }
    }

    public void clearJwt(@Nullable String str) {
        DisneyUser userData = getUserData();
        if (userData != null) {
            userData.clearJwt(str);
        }
    }

    synchronized void deleteAccount() {
        this.userDataStorage.deleteApplicationData("com.disney.account.applications_data");
        this.userDataStorage.deleteUserData();
    }

    synchronized void deleteCurrentApp(String str, String str2) {
        deleteAccount();
    }

    @Nullable
    DisneyApplications getApplications() {
        return this.userDataStorage.getApplicationData("com.disney.account.applications_data");
    }

    @Nullable
    String getAuthToken(String str, String str2) {
        PublicToken publicToken = this.userDataStorage.getPublicToken(str);
        this.authenticationAnalyticsHelper.m55552d(C13322a.EVENT_RETRIEVE_TOKENS, str, str2, publicToken == null ? null : Long.toString(publicToken.getExpired()), publicToken != null, false);
        if (publicToken != null && publicToken.getExpired() < System.currentTimeMillis()) {
            this.userDataStorage.deletePublicToken(str);
            return null;
        }
        if (publicToken == null) {
            return null;
        }
        return publicToken.getValue();
    }

    @Nullable
    public String getJwtToken(@Nullable String str) {
        DisneyUser userData = getUserData();
        if (userData != null) {
            return userData.getJwt(str);
        }
        return null;
    }

    @Nullable
    public HashMap<String, String> getJwtTokens() {
        DisneyUser userData = getUserData();
        if (userData != null) {
            return userData.getJwt();
        }
        return null;
    }

    @Nullable
    public DisneyUser getUserData() {
        return this.userDataStorage.getUserData();
    }

    void invalidateAuthTokenType(String str, String str2) {
        this.userDataStorage.deletePublicToken(str);
    }

    void invalidateInformationRequired(String str, String str2) {
        saveApplicationData(new DisneyApplication(str, str2, false));
    }

    boolean isInformationRequired(String str) {
        DisneyApplications applications = getApplications();
        if (applications != null) {
            Optional<DisneyApplication> application = applications.getApplication(str);
            if (application.isPresent() && application.get().isInformationRequired()) {
                return true;
            }
        }
        return false;
    }

    boolean isSSOEnabled() {
        return false;
    }

    Optional<String> peekAuthToken(String str, String str2) {
        String authToken = getAuthToken(str, str2);
        return TextUtils.isEmpty(authToken) ? Optional.absent() : Optional.m68592of(authToken);
    }

    void saveAccount(DisneyUser disneyUser, DisneyApplication disneyApplication, DisneyToken disneyToken) {
        saveUserData(disneyUser);
        saveApplicationData(disneyApplication);
    }

    synchronized void saveApplicationData(DisneyApplication disneyApplication) {
        try {
            DisneyApplications applications = getApplications();
            if (applications == null) {
                applications = new DisneyApplications();
            }
            applications.updateApplication(disneyApplication);
            saveApplications(applications);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void saveAuthTokens(String str, DisneyToken... disneyTokenArr) {
        for (DisneyToken disneyToken : disneyTokenArr) {
            saveAuthToken(str, disneyToken);
        }
    }

    public void setJwtToken(@Nullable String str, String str2) {
        DisneyUser userData = getUserData();
        if (userData != null) {
            userData.setJwt(str, str2);
            saveUserData(userData);
        }
    }

    boolean verifyApplicationData(String str) {
        DisneyApplications applications = getApplications();
        return applications != null && applications.containsApplication(str);
    }

    <T> void saveUserData(String str, String str2, T t10) {
        saveUserData(new DisneyUser.Builder().swid(str).email(str2).data(t10).build());
        this.authListener.onNewUserData();
    }

    <T> T saveUserData(T t10) {
        DisneyUser userData = getUserData();
        if (t10 != null && userData != null) {
            userData.setData(t10);
            saveUserData(userData);
        }
        return t10;
    }
}