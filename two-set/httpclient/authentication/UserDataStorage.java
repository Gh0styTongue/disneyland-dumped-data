package com.disney.wdpro.httpclient.authentication;

import com.disney.wdpro.dine.util.DineCrashHelper;
import com.disney.wdpro.httpclient.Constants$SessionEvent;
import com.disney.wdpro.httpclient.authentication.model.DisneyApplications;
import com.disney.wdpro.httpclient.authentication.model.DisneyUser;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0003H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J!\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH&¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0005H&J\b\u0010\u0013\u001a\u00020\u0014H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0014H&J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u000bH&J\u001f\u0010\u001c\u001a\u00020\u0003\"\b\b\u0000\u0010\r*\u00020\u00012\u0006\u0010\u001d\u001a\u0002H\rH&¢\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0012H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0016H&¨\u0006#"}, m92038d2 = {"Lcom/disney/wdpro/httpclient/authentication/UserDataStorage;", "", "deleteApplicationData", "", AnalyticsAttribute.APP_NAME_ATTRIBUTE, "", "deleteCompactProfile", "deletePublicToken", DineCrashHelper.DINE_APP_CLIENT_ID, "deleteUserData", "getApplicationData", "Lcom/disney/wdpro/httpclient/authentication/model/DisneyApplications;", "getCompactProfile", "T", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "getPublicToken", "Lcom/disney/wdpro/httpclient/authentication/PublicToken;", "getSessionEvent", "Lcom/disney/wdpro/httpclient/Constants$SessionEvent;", "getUserData", "Lcom/disney/wdpro/httpclient/authentication/model/DisneyUser;", "resetSessionEvent", "setSessionEvent", "sessionEvent", "storeApplicationData", "data", "storeCompactProfile", "compactProfile", "(Ljava/lang/Object;)V", "storePublicToken", "token", "storeUserData", "user", "oauth-http-client_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes23.dex */
public interface UserDataStorage {
    void deleteApplicationData(String appName);

    void deleteCompactProfile();

    void deletePublicToken(String clientId);

    void deleteUserData();

    DisneyApplications getApplicationData(String appName);

    <T> T getCompactProfile(Type type);

    PublicToken getPublicToken(String clientId);

    Constants$SessionEvent getSessionEvent();

    DisneyUser getUserData();

    void resetSessionEvent();

    void setSessionEvent(Constants$SessionEvent sessionEvent);

    void storeApplicationData(String appName, DisneyApplications data);

    <T> void storeCompactProfile(T compactProfile);

    void storePublicToken(String clientId, PublicToken token);

    void storeUserData(DisneyUser user);
}