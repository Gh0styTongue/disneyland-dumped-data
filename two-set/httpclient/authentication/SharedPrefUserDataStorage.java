package com.disney.wdpro.httpclient.authentication;

import android.content.Context;
import android.content.SharedPreferences;
import com.disney.wdpro.dine.util.DineCrashHelper;
import com.disney.wdpro.httpclient.C13349u;
import com.disney.wdpro.httpclient.Constants$SessionEvent;
import com.disney.wdpro.httpclient.authentication.model.DisneyApplications;
import com.disney.wdpro.httpclient.authentication.model.DisneyUser;
import com.google.common.base.C22466q;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.lang.reflect.Type;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0016J!\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\b\b\u0000\u0010\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0002\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002J%\u0010\u0018\u001a\u0004\u0018\u0001H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\n\u0010 \u001a\u0004\u0018\u00010!H\u0016J\"\u0010\"\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u001dH\u0016J\u0018\u0010'\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0010H\u0016J\u001f\u0010)\u001a\u00020\u0006\"\b\b\u0000\u0010\u0012*\u00020\u00132\u0006\u0010*\u001a\u0002H\u0012H\u0016¢\u0006\u0002\u0010+J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u001bH\u0016J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020!H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m92038d2 = {"Lcom/disney/wdpro/httpclient/authentication/SharedPrefUserDataStorage;", "Lcom/disney/wdpro/httpclient/authentication/UserDataStorage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "deleteApplicationData", "", AnalyticsAttribute.APP_NAME_ATTRIBUTE, "", "deleteCompactProfile", "deleteObject", "key", "deletePublicToken", DineCrashHelper.DINE_APP_CLIENT_ID, "deleteUserData", "getApplicationData", "Lcom/disney/wdpro/httpclient/authentication/model/DisneyApplications;", "getCompactProfile", "T", "", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "getDeobfuscated", "getObject", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "getPublicToken", "Lcom/disney/wdpro/httpclient/authentication/PublicToken;", "getSessionEvent", "Lcom/disney/wdpro/httpclient/Constants$SessionEvent;", "getSharedPref", "Landroid/content/SharedPreferences;", "getUserData", "Lcom/disney/wdpro/httpclient/authentication/model/DisneyUser;", "putObject", "o", "resetSessionEvent", "setSessionEvent", "sessionEvent", "storeApplicationData", "data", "storeCompactProfile", "compactProfile", "(Ljava/lang/Object;)V", "storePublicToken", "token", "storeUserData", "user", "oauth-http-client_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes23.dex */
public final class SharedPrefUserDataStorage implements UserDataStorage {
    private final Context context;

    public SharedPrefUserDataStorage(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final void deleteObject(String key) {
        getSharedPref().edit().remove(key).apply();
    }

    private final String getDeobfuscated(String key) {
        try {
            String string = getSharedPref().getString(key, "");
            Intrinsics.checkNotNull(string);
            if (!C22466q.m68722b(string)) {
                return C13349u.INSTANCE.m55679a(string);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private final <T> T getObject(String key, Type type) {
        try {
            String string = getSharedPref().getString(key, "");
            Intrinsics.checkNotNull(string);
            if (!C22466q.m68722b(string)) {
                return (T) GsonInstrumentation.fromJson(new Gson(), C13349u.INSTANCE.m55679a(string), type);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private final SharedPreferences getSharedPref() {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences("user_data_pref", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private final void putObject(String key, Object o10, Type type) throws JsonIOException {
        String json = GsonInstrumentation.toJson(new Gson(), o10, type);
        SharedPreferences.Editor editorEdit = getSharedPref().edit();
        C13349u c13349u = C13349u.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(json, "json");
        editorEdit.putString(key, c13349u.m55680b(json)).apply();
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public void deleteApplicationData(String appName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        deleteObject("disney_app_key" + appName);
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public void deleteCompactProfile() {
        deleteObject("disney_compact_profile");
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public void deletePublicToken(String clientId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        deleteObject("disney_public_token" + clientId);
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public void deleteUserData() {
        deleteObject("disney_user_key");
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public DisneyApplications getApplicationData(String appName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        DisneyApplications disneyApplications = (DisneyApplications) getObject("disney_app_key" + appName, DisneyApplications.class);
        Objects.toString(disneyApplications);
        return disneyApplications;
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public <T> T getCompactProfile(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return (T) getObject("disney_compact_profile", type);
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public PublicToken getPublicToken(String clientId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        PublicToken publicToken = (PublicToken) getObject("disney_public_token" + clientId, PublicToken.class);
        Objects.toString(publicToken);
        return publicToken;
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public Constants$SessionEvent getSessionEvent() {
        SharedPreferences sharedPref = getSharedPref();
        Constants$SessionEvent constants$SessionEvent = Constants$SessionEvent.GENERIC;
        String string = sharedPref.getString("sessionEvent", constants$SessionEvent.name());
        if (string == null) {
            string = constants$SessionEvent.name();
        }
        return Constants$SessionEvent.valueOf(string);
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public DisneyUser getUserData() {
        try {
            return DisneyUser.fromJson(getDeobfuscated("disney_user_key"));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public void resetSessionEvent() {
        getSharedPref().edit().putString("sessionEvent", Constants$SessionEvent.GENERIC.name()).apply();
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public void setSessionEvent(Constants$SessionEvent sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "sessionEvent");
        Objects.toString(sessionEvent);
        getSharedPref().edit().putString("sessionEvent", sessionEvent.name()).apply();
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public void storeApplicationData(String appName, DisneyApplications data) throws JsonIOException {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(data, "data");
        Objects.toString(data);
        putObject("disney_app_key" + appName, data, DisneyApplications.class);
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public <T> void storeCompactProfile(T compactProfile) throws JsonIOException {
        Intrinsics.checkNotNullParameter(compactProfile, "compactProfile");
        Objects.toString(compactProfile);
        putObject("disney_compact_profile", compactProfile, compactProfile.getClass());
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public void storePublicToken(String clientId, PublicToken token) throws JsonIOException {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(token, "token");
        Objects.toString(token);
        putObject("disney_public_token" + clientId, token, PublicToken.class);
    }

    @Override // com.disney.wdpro.httpclient.authentication.UserDataStorage
    public void storeUserData(DisneyUser user) throws JsonIOException {
        Intrinsics.checkNotNullParameter(user, "user");
        Objects.toString(user);
        putObject("disney_user_key", user, DisneyUser.class);
    }
}