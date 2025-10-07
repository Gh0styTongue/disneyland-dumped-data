package com.disney.wdpro.httpclient.authentication;

import android.accounts.AuthenticatorException;
import android.accounts.NetworkErrorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.disney.p063id.android.Token;
import com.disney.wdpro.httpclient.C13322a;
import com.disney.wdpro.httpclient.UnSuccessStatusException;
import com.disney.wdpro.httpclient.authentication.model.AccessTokenStatus;
import com.disney.wdpro.httpclient.authentication.model.DisneyApplication;
import com.disney.wdpro.httpclient.authentication.model.DisneyApplications;
import com.disney.wdpro.httpclient.authentication.model.DisneyToken;
import com.disney.wdpro.httpclient.authentication.model.DisneyUser;
import com.disney.wdpro.httpclient.authentication.model.LoginResponse;
import com.disney.wdpro.httpclient.authentication.model.UserBaseProfile;
import com.google.common.base.C22462m;
import com.google.common.base.Optional;
import com.google.common.collect.C22787q2;
import java.io.IOException;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes23.dex */
public class OAuthAuthenticationManager implements AuthenticationManager {
    private static final String PEPCOM_JWT = "default";
    private final String appId;
    private C13322a authenticationAnalyticsHelper;
    private final AuthenticationApiClient authenticationApiClient;
    private final AuthenticationDataProvider authenticationDataProvider;
    private final AuthenticatorListener authenticatorListener;
    private final String clientId;
    private final DisneyAccountManager disneyAccountManager;
    private boolean previousCallRequiredSecureScope;
    private final UserDataProvider<?> userDataProvider;
    private static final Object SIGNIN_LOCK = new Object();
    private static final Semaphore MUTEX_GUEST_TOKEN = new Semaphore(1, true);
    private static final Queue<Thread> GUEST_TOKEN_THREADS = C22787q2.m69657a();

    public OAuthAuthenticationManager(Context context, DisneyAccountManager disneyAccountManager, AuthEnvironment authEnvironment, AuthenticationApiClient authenticationApiClient, AuthenticatorListener authenticatorListener, AuthenticationDataProvider authenticationDataProvider, UserDataProvider<?> userDataProvider, C13322a c13322a) {
        C22462m.m68684p(context);
        C22462m.m68684p(authEnvironment);
        this.disneyAccountManager = (DisneyAccountManager) C22462m.m68684p(disneyAccountManager);
        this.clientId = authEnvironment.getAuthzClientId();
        String packageName = context.getPackageName();
        this.appId = packageName;
        this.authenticatorListener = (AuthenticatorListener) C22462m.m68684p(authenticatorListener);
        this.authenticationApiClient = (AuthenticationApiClient) C22462m.m68684p(authenticationApiClient);
        this.authenticationDataProvider = (AuthenticationDataProvider) C22462m.m68684p(authenticationDataProvider);
        this.userDataProvider = userDataProvider;
        this.authenticationAnalyticsHelper = c13322a;
        if (disneyAccountManager.isInformationRequired(packageName)) {
            logoutCurrentApp();
        }
    }

    private void checkSwid(String str, String str2) throws AuthenticatorException {
        if (!TextUtils.equals(str, str2)) {
            throw new AuthenticatorException("SWID mismatch");
        }
    }

    private DisneyUser getDisneyUser() {
        DisneyUser userData = this.disneyAccountManager.getUserData();
        if (userData == null || userData.isCurrentVersion()) {
            return userData;
        }
        logout();
        return this.disneyAccountManager.getUserData();
    }

    private String getGuestAuthToken(String str, boolean z10) throws InterruptedException, OperationCanceledException, IOException, AuthenticatorException {
        String strProvideAccessToken;
        Queue<Thread> queue = GUEST_TOKEN_THREADS;
        queue.offer(Thread.currentThread());
        boolean z11 = z10 && !this.previousCallRequiredSecureScope;
        Semaphore semaphore = MUTEX_GUEST_TOKEN;
        semaphore.acquire();
        this.previousCallRequiredSecureScope = z11;
        if (z11) {
            strProvideAccessToken = null;
        } else {
            try {
                strProvideAccessToken = this.authenticationDataProvider.provideAccessToken();
            } catch (Throwable th2) {
                this.previousCallRequiredSecureScope = false;
                GUEST_TOKEN_THREADS.remove(Thread.currentThread());
                MUTEX_GUEST_TOKEN.release();
                throw th2;
            }
        }
        if (TextUtils.isEmpty(strProvideAccessToken)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.disney.wdpro.httpclient.authentication.OAuthAuthenticationManager.1
                @Override // java.lang.Runnable
                public void run() {
                    OAuthAuthenticationManager.this.authenticatorListener.showSignIn();
                }
            });
            Object obj = SIGNIN_LOCK;
            synchronized (obj) {
                obj.wait();
            }
            checkSwid(str, getUserSwid());
            strProvideAccessToken = this.authenticationDataProvider.provideAccessToken();
        }
        this.previousCallRequiredSecureScope = false;
        queue.remove(Thread.currentThread());
        semaphore.release();
        return strProvideAccessToken;
    }

    private <T> T getServerUserData(UserBaseProfile userBaseProfile, String str) throws IOException {
        UserDataProvider<?> userDataProvider = this.userDataProvider;
        if (userDataProvider != null) {
            return (T) userDataProvider.provideUserData(userBaseProfile, str);
        }
        return null;
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public void continuePendingRequest() {
        Object obj = SIGNIN_LOCK;
        synchronized (obj) {
            obj.notify();
        }
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public void finishIncrementalRegistration() {
        this.disneyAccountManager.invalidateInformationRequired(this.appId, this.clientId);
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public AccessTokenStatus getAccessTokenStatus(String str) throws IOException {
        return this.authenticationDataProvider.provideAccessTokenStatus(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getAuthToken(java.lang.String r5, java.lang.String r6, boolean r7) throws android.accounts.AuthenticatorException {
        /*
            r4 = this;
            boolean r0 = r4.hasSecurityExceptions()
            if (r0 == 0) goto L8
            r4 = 0
            return r4
        L8:
            java.lang.String r0 = r4.clientId     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            com.google.common.base.Optional r0 = r4.peekAuthToken(r0, r5)     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            if (r7 != 0) goto L1d
            boolean r1 = r0.isPresent()     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            if (r1 == 0) goto L1d
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            return r4
        L1d:
            int r0 = r5.hashCode()     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            r1 = -2019520052(0xffffffff87a091cc, float:-2.4159816E-34)
            r2 = 1
            r3 = 2
            if (r0 == r1) goto L47
            r1 = 1378905531(0x52306dbb, float:1.894388E11)
            if (r0 == r1) goto L3d
            r1 = 2076953845(0x7bcbccf5, float:2.1163866E36)
            if (r0 == r1) goto L33
            goto L51
        L33:
            java.lang.String r0 = "com.disney.android.public"
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            if (r0 == 0) goto L51
            r0 = r3
            goto L52
        L3d:
            java.lang.String r0 = "com.disney.android.jwt"
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            if (r0 == 0) goto L51
            r0 = r2
            goto L52
        L47:
            java.lang.String r0 = "com.disney.android.guest"
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            if (r0 == 0) goto L51
            r0 = 0
            goto L52
        L51:
            r0 = -1
        L52:
            if (r0 == 0) goto L7b
            if (r0 == r2) goto L71
            if (r0 == r3) goto L5f
            com.disney.wdpro.httpclient.authentication.AuthenticationDataProvider r4 = r4.authenticationDataProvider     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            java.lang.String r4 = r4.provideAccessToken()     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            return r4
        L5f:
            com.disney.wdpro.httpclient.authentication.DisneyAccountManager r6 = r4.disneyAccountManager     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            java.lang.String r7 = r4.clientId     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            java.lang.String r5 = r6.getAuthToken(r7, r5)     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            if (r5 != 0) goto L70
            java.lang.String r5 = r4.clientId     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            java.lang.String r4 = r4.getPublicToken(r5)     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            return r4
        L70:
            return r5
        L71:
            r4.getGuestAuthToken(r6, r7)     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            java.lang.String r5 = "async-messaging"
            java.lang.String r4 = r4.getJwtToken(r5)     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            return r4
        L7b:
            java.lang.String r4 = r4.getGuestAuthToken(r6, r7)     // Catch: java.lang.Throwable -> L80 java.lang.InterruptedException -> L89
            return r4
        L80:
            r4 = move-exception
            android.accounts.AuthenticatorException r5 = new android.accounts.AuthenticatorException
            java.lang.String r6 = "Auth Failure"
            r5.<init>(r6, r4)
            throw r5
        L89:
            r4 = move-exception
            com.disney.wdpro.httpclient.authentication.InterruptedThreadException r5 = new com.disney.wdpro.httpclient.authentication.InterruptedThreadException
            java.lang.String r6 = "Interrupted while getting the auth token. User must've canceled the SignIn"
            r5.<init>(r6, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.httpclient.authentication.OAuthAuthenticationManager.getAuthToken(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public String getAuthZJwtToken() {
        return this.authenticationDataProvider.provideAuthZJwtToken();
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public DisneyApplications getDisneyApplications() {
        return this.disneyAccountManager.getApplications();
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public AccessTokenStatus getGuestAuthTokenStatus() throws IOException {
        String strProvideAccessToken = this.authenticationDataProvider.provideAccessToken();
        return !TextUtils.isEmpty(strProvideAccessToken) ? getAccessTokenStatus(strProvideAccessToken) : new AccessTokenStatus(null, AccessTokenStatus.MISSING_TOKEN_ERROR);
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public String getJwtToken() {
        return getJwtToken("async-messaging");
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public HashMap<String, String> getJwtTokens() {
        HashMap<String, String> jwtTokens;
        return (hasSecurityExceptions() || (jwtTokens = this.disneyAccountManager.getJwtTokens()) == null) ? new HashMap<>() : jwtTokens;
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public String getPublicToken(String str) throws JSONException, IOException {
        JSONObject jSONObjectPublicAuthentication = this.authenticationApiClient.publicAuthentication(str);
        String string = jSONObjectPublicAuthentication.getString(Token.ACCESS_TOKEN);
        this.disneyAccountManager.saveAuthTokens(str, new DisneyToken("com.disney.android.public", string, jSONObjectPublicAuthentication.getString("expires_in")));
        return string;
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public <T> T getUserData() {
        DisneyUser disneyUser = getDisneyUser();
        if (disneyUser == null) {
            return null;
        }
        return (T) disneyUser.getData();
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public String getUserEmail() {
        DisneyUser userData = this.disneyAccountManager.getUserData();
        if (userData == null) {
            return null;
        }
        return userData.getEmail();
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public String getUserSwid() {
        return this.authenticationDataProvider.provideUserSwid();
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public boolean hasSecurityExceptions() {
        return false;
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public void invalidateAuthToken(String str) {
        this.disneyAccountManager.invalidateAuthTokenType(this.clientId, str);
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public void invalidateTokens(String str) {
        throw new UnsupportedOperationException("invalidateTokens not implemented");
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public boolean isInformationRequired() {
        return this.disneyAccountManager.isInformationRequired(this.appId);
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public boolean isSSOAuthenticationRequired() {
        if (hasSecurityExceptions() || !isSSOEnabled() || getUserSwid() == null || this.disneyAccountManager.verifyApplicationData(this.appId)) {
            return false;
        }
        return !TextUtils.isEmpty(this.authenticationDataProvider.provideRefreshToken());
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public boolean isSSOEnabled() {
        return this.authenticationDataProvider.isSSOEnabled();
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public boolean isUserAuthenticated() {
        DisneyUser userData = this.disneyAccountManager.getUserData();
        return (!this.authenticationDataProvider.isUserLoggedIn() || userData == null || userData.getData() == null) ? false : true;
    }

    LoginResponse loginWithRefreshToken(String str, String str2) throws JSONException, IOException, AuthenticatorException {
        LoginResponse loginResponseLoginWithRefreshToken;
        Optional<String> optionalPeekAuthToken = peekAuthToken(str, "com.disney.android.guest.refresh");
        if (!optionalPeekAuthToken.isPresent()) {
            return null;
        }
        try {
            loginResponseLoginWithRefreshToken = this.authenticationApiClient.loginWithRefreshToken(this, str, optionalPeekAuthToken.get(), str2);
        } catch (UnSuccessStatusException e10) {
            loginResponseLoginWithRefreshToken = (LoginResponse) e10.getServiceError();
        }
        this.authenticationAnalyticsHelper.m55550a(C13322a.EVENT_SERVICE_REQUEST, loginResponseLoginWithRefreshToken, true);
        return loginResponseLoginWithRefreshToken;
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public LoginResponse loginWithRefreshTokenPepcomJwt() throws JSONException, IOException, AuthenticatorException {
        return loginWithRefreshToken(this.clientId, "default");
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public void logout() {
        this.disneyAccountManager.deleteAccount();
        removePendingRequests();
        this.authenticationAnalyticsHelper.m55550a(C13322a.EVENT_USER_SIGN_OUT, null, false);
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public void logoutCurrentApp() {
        this.disneyAccountManager.deleteCurrentApp(this.appId, this.clientId);
        removePendingRequests();
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public Optional<String> peekAuthToken(String str, String str2) {
        str2.getClass();
        switch (str2) {
        }
        return this.disneyAccountManager.peekAuthToken(str, str2);
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public String refreshGuestToken(String str, String str2) throws JSONException, IOException {
        new DisneyToken("com.disney.android.jwt", null, null);
        return null;
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public String refreshJwtToken() throws NetworkErrorException, AuthenticatorException {
        return refreshJwtToken("async-messaging");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public <T> T refreshUserData(UserBaseProfile userBaseProfile) throws IOException, AuthenticatorException {
        String userSwid = getUserSwid();
        if (userSwid == null) {
            throw new AuthenticatorException();
        }
        checkSwid(userSwid, userBaseProfile.getSwid());
        try {
            return (T) updateUserData(getServerUserData(userBaseProfile, this.authenticationDataProvider.provideAccessToken()));
        } catch (InterruptedThreadException unused) {
            throw new AuthenticatorException();
        }
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public void removeApplicationFromAccount(String str) {
        DisneyApplications disneyApplications = getDisneyApplications();
        if (disneyApplications != null) {
            Optional<DisneyApplication> application = disneyApplications.getApplication(str);
            if (application.isPresent()) {
                DisneyApplication disneyApplication = application.get();
                this.disneyAccountManager.deleteCurrentApp(disneyApplication.getId(), disneyApplication.getClientId());
            }
        }
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public void removePendingRequests() {
        while (true) {
            Queue<Thread> queue = GUEST_TOKEN_THREADS;
            if (queue.isEmpty()) {
                return;
            } else {
                queue.poll().interrupt();
            }
        }
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public <T> void saveUserData(String str, String str2, T t10) {
        this.disneyAccountManager.saveUserData(str, str2, t10);
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public void setJwtToken(String str, String str2) {
        this.disneyAccountManager.setJwtToken(str, str2);
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public <T> T updateUserData(T t10) {
        return (T) this.disneyAccountManager.saveUserData((DisneyAccountManager) t10);
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public String getJwtToken(String str) {
        return this.disneyAccountManager.getJwtToken(str);
    }

    @Override // com.disney.wdpro.httpclient.authentication.AuthenticationManager
    public String refreshJwtToken(String str) throws NetworkErrorException, AuthenticatorException {
        C22462m.m68684p(str);
        String userSwid = getUserSwid();
        String strProvideAccessToken = this.authenticationDataProvider.provideAccessToken();
        if (userSwid == null || strProvideAccessToken == null) {
            throw new AuthenticatorException("refreshJwtToken() requires a logged in user");
        }
        try {
            String strRefreshJwtToken = this.userDataProvider.refreshJwtToken(userSwid, strProvideAccessToken, str);
            this.disneyAccountManager.setJwtToken(str, strRefreshJwtToken);
            return strRefreshJwtToken;
        } catch (IOException e10) {
            throw new NetworkErrorException(e10);
        }
    }
}