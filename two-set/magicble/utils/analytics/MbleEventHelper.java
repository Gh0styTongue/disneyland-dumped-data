package com.disney.wdpro.magicble.utils.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.bookingservices.checkout.CheckoutConstants;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.HttpApiClient;
import com.disney.wdpro.service.business.APIConstants;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(m92037d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2&\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\f2&\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\"\u0010\u001a\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010#\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\"\u0010&\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR\"\u0010)\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u0016\u0010-\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.¨\u00060"}, m92038d2 = {"Lcom/disney/wdpro/magicble/utils/analytics/MbleEventHelper;", "", "Lcom/disney/wdpro/analytics/n;", "crashHelper", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/disney/wdpro/httpclient/HttpApiClient;", "httpApiClient", "<init>", "(Lcom/disney/wdpro/analytics/n;Landroid/content/Context;Lcom/disney/wdpro/commons/config/i;Lcom/disney/wdpro/httpclient/HttpApiClient;)V", "", "eventType", CheckoutConstants.ANALYTICS_COMMERCE_EVENT_NAME_KEY, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", APIConstants.UrlParams.ATTRIBUTES, "", "recordCustomEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "recordMbleEvent", "(Ljava/lang/String;Ljava/util/HashMap;)V", "Lcom/disney/wdpro/analytics/n;", "Lcom/disney/wdpro/commons/config/i;", "Lcom/disney/wdpro/httpclient/HttpApiClient;", "swid", "Ljava/lang/String;", "getSwid$magic_ble_lib_release", "()Ljava/lang/String;", "setSwid$magic_ble_lib_release", "(Ljava/lang/String;)V", "tokenNumber", "getTokenNumber$magic_ble_lib_release", "setTokenNumber$magic_ble_lib_release", "token", "getToken$magic_ble_lib_release", "setToken$magic_ble_lib_release", "expirationTTL", "getExpirationTTL$magic_ble_lib_release", "setExpirationTTL$magic_ble_lib_release", "dropTTL", "getDropTTL$magic_ble_lib_release", "setDropTTL$magic_ble_lib_release", "Landroid/content/SharedPreferences;", "agentPrefs", "Landroid/content/SharedPreferences;", "attributeStorePrefs", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes13.dex */
public final class MbleEventHelper {
    private final SharedPreferences agentPrefs;
    private final SharedPreferences attributeStorePrefs;
    private final InterfaceC8682n crashHelper;
    private String dropTTL;
    private String expirationTTL;
    private final HttpApiClient httpApiClient;
    private String swid;
    private String token;
    private String tokenNumber;
    private final C9248i vendomatic;

    @Inject
    public MbleEventHelper(InterfaceC8682n crashHelper, Context context, C9248i vendomatic, HttpApiClient httpApiClient) {
        Intrinsics.checkNotNullParameter(crashHelper, "crashHelper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(httpApiClient, "httpApiClient");
        this.crashHelper = crashHelper;
        this.vendomatic = vendomatic;
        this.httpApiClient = httpApiClient;
        this.swid = new String();
        this.tokenNumber = new String();
        this.token = new String();
        this.expirationTTL = new String();
        this.dropTTL = new String();
        this.agentPrefs = context.getSharedPreferences("com.newrelic.android.agent.v1_" + context.getPackageName(), 0);
        this.attributeStorePrefs = context.getSharedPreferences("NRAnalyticsAttributeStore", 0);
    }

    private final void recordCustomEvent(String eventType, String eventName, HashMap<String, Object> attributes) {
        HttpApiClient.C13320c c13320cM55530t;
        HttpApiClient.C13320c c13320cM55530t2;
        HttpApiClient.C13320c c13320cM55530t3;
        HttpApiClient.C13320c c13320cM55526p;
        if (this.vendomatic.m38697K0() && !this.crashHelper.recordCustomEvent(eventType, eventName, attributes)) {
            attributes.put("name", eventName);
            attributes.put("eventType", eventType);
            SharedPreferences sharedPreferences = this.attributeStorePrefs;
            attributes.put("swid", sharedPreferences != null ? sharedPreferences.getString("swid", this.swid) : null);
            SharedPreferences sharedPreferences2 = this.agentPrefs;
            attributes.put("appVersion", sharedPreferences2 != null ? sharedPreferences2.getString("appVersion", "") : null);
            SharedPreferences sharedPreferences3 = this.agentPrefs;
            attributes.put("deviceUuid", sharedPreferences3 != null ? sharedPreferences3.getString("deviceId", "") : null);
            SharedPreferences sharedPreferences4 = this.agentPrefs;
            attributes.put(AnalyticsAttribute.OS_VERSION_ATTRIBUTE, sharedPreferences4 != null ? sharedPreferences4.getString(AnalyticsAttribute.OS_VERSION_ATTRIBUTE, "") : null);
            SharedPreferences sharedPreferences5 = this.agentPrefs;
            attributes.put(AnalyticsAttribute.OS_NAME_ATTRIBUTE, sharedPreferences5 != null ? sharedPreferences5.getString(AnalyticsAttribute.OS_NAME_ATTRIBUTE, "") : null);
            SharedPreferences sharedPreferences6 = this.agentPrefs;
            attributes.put(AnalyticsAttribute.APP_NAME_ATTRIBUTE, sharedPreferences6 != null ? sharedPreferences6.getString(AnalyticsAttribute.APP_NAME_ATTRIBUTE, "") : null);
            SharedPreferences sharedPreferences7 = this.agentPrefs;
            attributes.put(AnalyticsAttribute.DEVICE_MODEL_ATTRIBUTE, sharedPreferences7 != null ? sharedPreferences7.getString(AnalyticsAttribute.DEVICE_MODEL_ATTRIBUTE, "") : null);
            String string = JSONObjectInstrumentation.toString(new JSONObject((Map<?, ?>) attributes));
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject(attributes).toString()");
            HttpApiClient.C13320c c13320cM55506i = this.httpApiClient.m55506i(EventsConstantsKt.NEWRELIC_EVENT_URL, String.class);
            if (c13320cM55506i == null || (c13320cM55530t = c13320cM55506i.m55530t("Content-Type", "application/json")) == null || (c13320cM55530t2 = c13320cM55530t.m55530t("Accept-Encoding", "gzip, deflate, br")) == null || (c13320cM55530t3 = c13320cM55530t2.m55530t("Api-Key", EventsConstantsKt.NEWRELIC_API_KEY)) == null || (c13320cM55526p = c13320cM55530t3.m55526p(string)) == null) {
                return;
            }
            c13320cM55526p.m55522j();
        }
    }

    /* renamed from: getDropTTL$magic_ble_lib_release, reason: from getter */
    public final String getDropTTL() {
        return this.dropTTL;
    }

    /* renamed from: getExpirationTTL$magic_ble_lib_release, reason: from getter */
    public final String getExpirationTTL() {
        return this.expirationTTL;
    }

    /* renamed from: getSwid$magic_ble_lib_release, reason: from getter */
    public final String getSwid() {
        return this.swid;
    }

    /* renamed from: getToken$magic_ble_lib_release, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: getTokenNumber$magic_ble_lib_release, reason: from getter */
    public final String getTokenNumber() {
        return this.tokenNumber;
    }

    public final void recordMbleEvent(String eventName, HashMap<String, Object> attributes) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        recordCustomEvent(EventsConstantsKt.EVENT_TYPE_EVENTS, eventName, attributes);
    }

    public final void setDropTTL$magic_ble_lib_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dropTTL = str;
    }

    public final void setExpirationTTL$magic_ble_lib_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expirationTTL = str;
    }

    public final void setSwid$magic_ble_lib_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.swid = str;
    }

    public final void setToken$magic_ble_lib_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    public final void setTokenNumber$magic_ble_lib_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tokenNumber = str;
    }
}