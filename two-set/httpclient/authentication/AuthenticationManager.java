package com.disney.wdpro.httpclient.authentication;

import android.accounts.AuthenticatorException;
import android.accounts.NetworkErrorException;
import com.disney.wdpro.httpclient.authentication.model.AccessTokenStatus;
import com.disney.wdpro.httpclient.authentication.model.DisneyApplications;
import com.disney.wdpro.httpclient.authentication.model.LoginResponse;
import com.disney.wdpro.httpclient.authentication.model.UserBaseProfile;
import com.google.common.base.Optional;
import java.io.IOException;
import java.util.HashMap;
import javax.annotation.Nullable;
import org.json.JSONException;

/* loaded from: classes23.dex */
public interface AuthenticationManager {
    void continuePendingRequest();

    void finishIncrementalRegistration();

    @Nullable
    AccessTokenStatus getAccessTokenStatus(String str) throws IOException;

    @Nullable
    String getAuthToken(String str, String str2, boolean z10) throws AuthenticatorException;

    @Nullable
    String getAuthZJwtToken();

    @Nullable
    DisneyApplications getDisneyApplications();

    @Nullable
    AccessTokenStatus getGuestAuthTokenStatus() throws IOException;

    @Nullable
    @Deprecated
    String getJwtToken();

    @Nullable
    @Deprecated
    String getJwtToken(String str);

    @Deprecated
    HashMap<String, String> getJwtTokens();

    String getPublicToken(String str) throws JSONException, IOException;

    @Nullable
    @Deprecated
    <T> T getUserData();

    @Nullable
    @Deprecated
    String getUserEmail();

    @Nullable
    String getUserSwid();

    boolean hasSecurityExceptions();

    void invalidateAuthToken(String str);

    void invalidateTokens(String str);

    boolean isInformationRequired();

    boolean isSSOAuthenticationRequired();

    boolean isSSOEnabled();

    boolean isUserAuthenticated();

    @Nullable
    LoginResponse loginWithRefreshTokenPepcomJwt() throws JSONException, IOException, AuthenticatorException;

    void logout();

    void logoutCurrentApp();

    Optional<String> peekAuthToken(String str, String str2);

    @Nullable
    String refreshGuestToken(String str, String str2) throws JSONException, IOException;

    @Deprecated
    String refreshJwtToken() throws NetworkErrorException, AuthenticatorException;

    @Deprecated
    String refreshJwtToken(String str) throws NetworkErrorException, AuthenticatorException;

    @Nullable
    @Deprecated
    <T> T refreshUserData(UserBaseProfile userBaseProfile) throws IOException, AuthenticatorException;

    void removeApplicationFromAccount(String str);

    void removePendingRequests();

    <T> void saveUserData(String str, String str2, T t10);

    void setJwtToken(String str, String str2);

    @Nullable
    <T> T updateUserData(T t10);
}