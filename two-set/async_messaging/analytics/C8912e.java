package com.disney.wdpro.async_messaging.analytics;

import android.content.Context;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.httpclient.authentication.model.UserBaseProfile;
import com.liveperson.monitoring.sdk.callbacks.MonitoringErrorType;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kw.MonitoringParams;
import mw.InterfaceC30578c;
import org.jose4j.jwk.RsaJsonWebKey;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p652iw.C29332c;
import p768n9.InterfaceC30633f;
import p780nw.C30755b;

@Metadata(m92037d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0017\u0018\u0000 $2\u00020\u0001:\u0002\u001f\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m92038d2 = {"Lcom/disney/wdpro/async_messaging/analytics/e;", "", "Landroid/content/Context;", "context", "Ln9/f;", "livePersonMonitoring", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authenticationManager", "Lcom/disney/wdpro/analytics/n;", "crashHelper", "<init>", "(Landroid/content/Context;Ln9/f;Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;Lcom/disney/wdpro/analytics/n;)V", "Lorg/json/JSONArray;", "sde", "", "extraSde", "", "d", "(Lorg/json/JSONArray;Ljava/lang/String;)V", "campaignId", "a", "(Ljava/lang/String;)Lorg/json/JSONArray;", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ln9/f;", "getLivePersonMonitoring", "()Ln9/f;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "b", "()Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "Lcom/disney/wdpro/analytics/n;", "c", "()Lcom/disney/wdpro/analytics/n;", "Companion", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.async_messaging.analytics.e */
/* loaded from: classes24.dex */
public class C8912e {
    public static final String ADOBE = "ADOBE";
    public static final String AFFILIATE = "affiliate";
    public static final String CAMPAIGN_ID = "campaignId";
    public static final String CUSTOMER = "ctmrinfo";
    public static final String CUSTOMER_ID = "customerId";
    public static final String FIRSTNAME = "firstname";
    public static final String INFO = "info";
    public static final String LASTNAME = "lastname";
    public static final String MARKET = "mrktInfo";
    public static final String PERSONAL = "personal";
    public static final String TYPE = "type";
    private final AuthenticationManager authenticationManager;
    private final Context context;
    private final InterfaceC8682n crashHelper;
    private final InterfaceC30633f livePersonMonitoring;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0096\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u00060\u0000R\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, m92038d2 = {"Lcom/disney/wdpro/async_messaging/analytics/e$a;", "", "", "campaignId", "<init>", "(Lcom/disney/wdpro/async_messaging/analytics/e;Ljava/lang/String;)V", "Lorg/json/JSONArray;", "a", "()Lorg/json/JSONArray;", "Lcom/disney/wdpro/async_messaging/analytics/e;", "b", "()Lcom/disney/wdpro/async_messaging/analytics/e$a;", "Ljava/lang/String;", "getCampaignId", "()Ljava/lang/String;", "Lcom/disney/wdpro/httpclient/authentication/model/UserBaseProfile;", "userBaseProfile", "Lcom/disney/wdpro/httpclient/authentication/model/UserBaseProfile;", "getUserBaseProfile", "()Lcom/disney/wdpro/httpclient/authentication/model/UserBaseProfile;", "sde", "Lorg/json/JSONArray;", "getSde", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.async_messaging.analytics.e$a */
    public class a {
        private final String campaignId;
        private final JSONArray sde = new JSONArray();
        private final UserBaseProfile userBaseProfile;

        public a(String str) {
            this.campaignId = str;
            this.userBaseProfile = (UserBaseProfile) C8912e.this.getAuthenticationManager().getUserData();
        }

        /* renamed from: a, reason: from getter */
        public final JSONArray getSde() {
            return this.sde;
        }

        /* renamed from: b */
        public final a m37830b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", C8912e.PERSONAL);
            JSONObject jSONObject2 = new JSONObject();
            UserBaseProfile userBaseProfile = this.userBaseProfile;
            jSONObject2.put(C8912e.FIRSTNAME, userBaseProfile != null ? userBaseProfile.getFirstName() : null);
            UserBaseProfile userBaseProfile2 = this.userBaseProfile;
            jSONObject2.put(C8912e.LASTNAME, userBaseProfile2 != null ? userBaseProfile2.getLastName() : null);
            jSONObject.put(C8912e.PERSONAL, jSONObject2);
            this.sde.put(jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", C8912e.CUSTOMER);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(C8912e.CUSTOMER_ID, C8912e.this.getAuthenticationManager().getUserSwid());
            jSONObject3.put("info", jSONObject4);
            this.sde.put(jSONObject3);
            String str = this.campaignId;
            if (str != null) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("type", C8912e.MARKET);
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(C8912e.AFFILIATE, C8912e.ADOBE);
                jSONObject6.put("campaignId", str);
                jSONObject5.put("info", jSONObject6);
                this.sde.put(jSONObject5);
            }
            return this;
        }
    }

    @Metadata(m92037d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m92038d2 = {"com/disney/wdpro/async_messaging/analytics/e$c", "Lmw/c;", "Lcom/liveperson/monitoring/sdk/callbacks/MonitoringErrorType;", "errorType", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "a", "(Lcom/liveperson/monitoring/sdk/callbacks/MonitoringErrorType;Ljava/lang/Exception;)V", "Lnw/b;", "lpSdeResponse", "d", "(Lnw/b;)V", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.async_messaging.analytics.e$c */
    public static final class c implements InterfaceC30578c {
        final /* synthetic */ JSONArray $sde;

        c(JSONArray jSONArray) {
            this.$sde = jSONArray;
        }

        @Override // mw.InterfaceC30577b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo37832b(MonitoringErrorType errorType, Exception exception) {
            Intrinsics.checkNotNullParameter(errorType, "errorType");
            C8912e.this.getCrashHelper().recordHandledException(exception);
            errorType.name();
        }

        @Override // mw.InterfaceC30578c
        /* renamed from: d */
        public void mo37833d(C30755b lpSdeResponse) {
            Intrinsics.checkNotNullParameter(lpSdeResponse, "lpSdeResponse");
            lpSdeResponse.getVisitorId();
            lpSdeResponse.getSessionId();
            Objects.toString(this.$sde);
        }
    }

    public C8912e(Context context, InterfaceC30633f livePersonMonitoring, AuthenticationManager authenticationManager, InterfaceC8682n crashHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(livePersonMonitoring, "livePersonMonitoring");
        Intrinsics.checkNotNullParameter(authenticationManager, "authenticationManager");
        Intrinsics.checkNotNullParameter(crashHelper, "crashHelper");
        this.context = context;
        this.livePersonMonitoring = livePersonMonitoring;
        this.authenticationManager = authenticationManager;
        this.crashHelper = crashHelper;
    }

    /* renamed from: d */
    private final void m37824d(JSONArray sde, String extraSde) {
        if (sde != null) {
            if (extraSde != null) {
                try {
                    JSONArray jSONArray = new JSONArray(extraSde);
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        sde.put(jSONArray.get(i10));
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (JSONException e10) {
                    this.crashHelper.recordHandledException(e10);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to parse the extraSde string:");
                    sb2.append(extraSde);
                }
            }
            MonitoringParams monitoringParams = new MonitoringParams(null, null, sde, 3, null);
            this.livePersonMonitoring.mo94443a(this.context, CollectionsKt.listOf(new C29332c(this.authenticationManager.getUserSwid(), "")), monitoringParams, new c(sde));
        }
    }

    /* renamed from: a */
    public JSONArray m37825a(String campaignId) {
        return new a(campaignId).m37830b().getSde();
    }

    /* renamed from: b, reason: from getter */
    public final AuthenticationManager getAuthenticationManager() {
        return this.authenticationManager;
    }

    /* renamed from: c, reason: from getter */
    public final InterfaceC8682n getCrashHelper() {
        return this.crashHelper;
    }

    /* renamed from: e */
    public final void m37828e(String campaignId, String extraSde) {
        m37824d(m37825a(campaignId), extraSde);
    }
}