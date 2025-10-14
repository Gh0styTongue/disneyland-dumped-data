package com.disney.wdpro.analytics;

import android.app.Application;
import android.content.Context;
import android.location.Location;
import android.net.Uri;
import com.adobe.marketing.mobile.AdobeCallback;
import com.adobe.marketing.mobile.Analytics;
import com.adobe.marketing.mobile.Edge;
import com.adobe.marketing.mobile.ExperienceEvent;
import com.adobe.marketing.mobile.MobileCore;
import com.disney.wdpro.analytics.C8681m;
import com.disney.wdpro.apcommerce.util.APCommerceConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.AnalyticsConstants;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import p638i9.C28830d;
import p666j9.C29387a;
import p677jl.C29439a;

@Singleton
/* renamed from: com.disney.wdpro.analytics.f */
/* loaded from: classes23.dex */
public class C8674f implements InterfaceC8679k {
    private static final String ACP_BEACON_MAJOR = "a.beacon.major";
    private static final String ACP_BEACON_MINOR = "a.beacon.minor";
    private static final String ACP_BEACON_PROXIMITY = "a.beacon.prox";
    private static final String ACP_BEACON_UUID = "a.beacon.uuid";
    public static final String ACTION_TRACK_LOCATION = "Location";
    public static final String CURRENT_REGION_PREF_KEY = "currentRegion";
    public static final String KEY_LATITUDE = "latitude";
    public static final String KEY_LONGITUDE = "longitude";
    public static final String KEY_PRODUCTS = "&&products";
    public static final String KEY_TRACK_ACTION = "action";
    public static final String KEY_TRACK_EVEN_TYPE = "eventType";
    public static final String KEY_TRACK_STATE = "state";
    public static final String PLACES_PREFERENCES = "places";
    private static boolean initCompleted;
    private C29387a adobeTrackingHelper;
    private Map<String, String> analyticsDefaultContext;
    private ExecutorService analyticsExecutor;
    private InterfaceC8680l analyticsListener;
    private Context context;
    private final InterfaceC8682n crashHelper;
    private final InterfaceC8678j environment;
    private String previousAction;
    private String previousState;
    private C28830d productsCustomFormattingUtil;
    private List<C8681m> trackActionPendingList;

    public C8674f(InterfaceC8678j interfaceC8678j, InterfaceC8682n interfaceC8682n, C28830d c28830d, @Nullable InterfaceC8680l interfaceC8680l, AnalyticsSecretConfig analyticsSecretConfig) {
        this.analyticsExecutor = Executors.newSingleThreadExecutor();
        this.trackActionPendingList = Lists.m69268i();
        InterfaceC8678j interfaceC8678j2 = (InterfaceC8678j) C22462m.m68684p(interfaceC8678j);
        this.environment = interfaceC8678j2;
        this.crashHelper = (InterfaceC8682n) C22462m.m68684p(interfaceC8682n);
        this.productsCustomFormattingUtil = (C28830d) C22462m.m68684p(c28830d);
        this.analyticsListener = interfaceC8680l;
        HashMap mapM69381r = Maps.m69381r();
        this.analyticsDefaultContext = mapM69381r;
        mapM69381r.put(C29439a.APP_INSTALLATION_ID, interfaceC8678j2.mo37430b());
        this.analyticsDefaultContext.put("buildinfo", m37397t());
        this.adobeTrackingHelper = new C29387a(analyticsSecretConfig);
    }

    /* renamed from: A */
    private final void m37394A(String str, String str2, String str3, String str4, String str5, String str6) throws NumberFormatException {
        C22462m.m68685q(str2, "To track the service the url is required");
        String string = Uri.parse(str2).buildUpon().clearQuery().toString();
        Map<String, String> mapMo37420q = mo37420q();
        mapMo37420q.put("service.name", string);
        if (str3 != null) {
            mapMo37420q.put("service.time", str3);
        }
        if (str4 != null) {
            mapMo37420q.put("service.payloadsize", str4);
        }
        if (str5 != null) {
            mapMo37420q.put("conversationid", str5);
        }
        if (str6 != null) {
            mapMo37420q.put("httpstatus", str6);
        }
        mo37410g(str, str + ":" + string, mapMo37420q);
    }

    /* renamed from: r */
    public static /* synthetic */ void m37395r(Long l10) {
        if (l10.longValue() > 0) {
            Analytics.m30326c();
        }
    }

    /* renamed from: s */
    private String m37396s() {
        String swid = this.environment.getSwid();
        return C22466q.m68722b(swid) ? "SwidNotPassed" : swid;
    }

    /* renamed from: t */
    private String m37397t() {
        return String.format("%s %s (%s)", this.environment.mo37431c(), this.environment.getVersionName(), this.environment.mo37429a());
    }

    /* renamed from: u */
    private Map<String, String> m37398u(Map<String, String> map) {
        Map<String, String> mapM37399v = m37399v();
        if (map != null) {
            mapM37399v.putAll(map);
        }
        return mapM37399v;
    }

    /* renamed from: v */
    private synchronized Map<String, String> m37399v() {
        try {
            this.analyticsDefaultContext.put("guest.swid", m37396s());
            String str = this.previousState;
            if (str != null) {
                this.analyticsDefaultContext.put("previous.page", str);
            }
            String str2 = this.previousAction;
            if (str2 != null) {
                this.analyticsDefaultContext.put("previous.action", str2);
            }
            if (!this.environment.mo37432d()) {
                this.analyticsDefaultContext.put("uniqueHitID", this.environment.mo37430b() + APCommerceConstants.UNDERLINE + System.currentTimeMillis());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return Maps.m69382s(this.analyticsDefaultContext);
    }

    /* renamed from: w */
    private void m37400w(String str, Map<String, String> map) throws NumberFormatException {
        if (this.adobeTrackingHelper.m91404e()) {
            m37401x(str, map, "action");
        }
        if (this.adobeTrackingHelper.m91403c()) {
            MobileCore.m30582q(str, map);
        }
        InterfaceC8680l interfaceC8680l = this.analyticsListener;
        if (interfaceC8680l != null) {
            interfaceC8680l.mo37433a(str, map);
        }
    }

    /* renamed from: x */
    private void m37401x(String str, Map<String, String> map, String str2) throws NumberFormatException {
        HashMap map2 = new HashMap(map);
        if (map.containsKey("&&products")) {
            map2.put(this.productsCustomFormattingUtil.getMasterKey(), this.productsCustomFormattingUtil.m89121h(map.get("&&products")));
        }
        map2.put(str2, str);
        map2.put("eventType", str2);
        Edge.m30343c(new ExperienceEvent.Builder().m30484b(map2).m30483a(), null);
    }

    /* renamed from: y */
    private void m37402y(String str, Map<String, String> map) throws NumberFormatException {
        if (this.adobeTrackingHelper.m91404e()) {
            m37401x(str, map, "state");
        }
        if (this.adobeTrackingHelper.m91403c()) {
            MobileCore.m30583r(str, map);
        }
        InterfaceC8680l interfaceC8680l = this.analyticsListener;
        if (interfaceC8680l != null) {
            interfaceC8680l.mo37434b(str, map);
        }
    }

    /* renamed from: z */
    private void m37403z(String str, Map<String, String> map, boolean z10) throws NumberFormatException {
        C22462m.m68691w(!C22466q.m68722b(str), "Action must be specified.");
        Map<String, String> mapMo37420q = mo37420q();
        if (z10) {
            map = m37398u(map);
        } else if (map == null) {
            map = mapMo37420q;
        }
        if (initCompleted) {
            m37400w(str, map);
            this.previousAction = str;
        }
        this.crashHelper.sendBreadcrumb(str);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: a */
    public synchronized void mo37404a(Application application) {
        if (initCompleted) {
            return;
        }
        this.context = application;
        this.adobeTrackingHelper.m91402b(application);
        initCompleted = true;
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: b */
    public void mo37405b(String str, Map<String, String> map) throws NumberFormatException {
        m37403z(str, map, true);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: c */
    public void mo37406c(String str, String str2, Map<String, String> map) throws NumberFormatException {
        if (InterfaceC8679k.IGNORE.equals(str)) {
            return;
        }
        Map<String, String> mapM37398u = m37398u(map);
        if (C22466q.m68722b(str)) {
            return;
        }
        if (initCompleted) {
            m37402y(str, mapM37398u);
            this.previousState = str;
        }
        this.crashHelper.sendBreadcrumb(str, true);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: d */
    public final void mo37407d(String str, Map.Entry<String, String>... entryArr) throws NumberFormatException {
        Map<String, String> mapMo37420q = mo37420q();
        if (entryArr != null) {
            for (Map.Entry<String, String> entry : entryArr) {
                mapMo37420q.put(entry.getKey(), entry.getValue());
            }
        }
        m37403z(str, mapMo37420q, true);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: e */
    public final void mo37408e(String str, String str2, String str3) throws NumberFormatException {
        if (initCompleted) {
            m37394A(AnalyticsConstants.ACTION_SERVICE_ERROR, str, str2, null, null, str3);
        }
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: f */
    public void mo37409f(Application application) {
        MobileCore.m30579n(application);
        MobileCore.m30575j(null);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: g */
    public void mo37410g(String str, String str2, Map<String, String> map) throws NumberFormatException {
        C22462m.m68691w(!C22466q.m68722b(str), "Action must be specified.");
        Map<String, String> mapM37398u = m37398u(map);
        if (initCompleted) {
            m37400w(str, mapM37398u);
        }
        this.crashHelper.sendBreadcrumb(str2);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: h */
    public final void mo37411h(String str, String str2, Map.Entry<String, String>... entryArr) throws NumberFormatException {
        Map<String, String> mapMo37420q = mo37420q();
        if (entryArr != null) {
            for (Map.Entry<String, String> entry : entryArr) {
                mapMo37420q.put(entry.getKey(), entry.getValue());
            }
        }
        mo37406c(str, str2, mapMo37420q);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: i */
    public void mo37412i(String str, String str2) {
        this.analyticsDefaultContext.put(str, str2);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: j */
    public void mo37413j() {
        MobileCore.m30574i();
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: k */
    public void mo37414k(C8681m c8681m) throws NumberFormatException {
        C22462m.m68691w(c8681m != null, "analyticsModel must be specified.");
        Map<String, String> mapMo37420q = mo37420q();
        mapMo37420q.putAll(c8681m.m37436b());
        m37403z(c8681m.m37435a(), mapMo37420q, true);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: l */
    public void mo37415l(Boolean bool) {
        this.adobeTrackingHelper.m91405f(bool.booleanValue(), this.context);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: m */
    public final void mo37416m(String str, String str2, String str3, String str4, String str5) throws NumberFormatException {
        if (initCompleted) {
            m37394A("Service Call", str, str2, str3, str4, str5);
        }
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: n */
    public void mo37417n(String str, Map.Entry<String, String>... entryArr) {
        C8681m.a aVar = new C8681m.a(str);
        aVar.m37437a(m37399v()).m37438b(entryArr);
        this.trackActionPendingList.add(aVar.m37440d());
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: o */
    public void mo37418o(Location location, Map<String, String> map) throws NumberFormatException {
        if (!initCompleted || location == null) {
            return;
        }
        Map<String, String> mapM37398u = m37398u(map);
        mapM37398u.put(KEY_LATITUDE, String.valueOf(location.getLatitude()));
        mapM37398u.put(KEY_LONGITUDE, String.valueOf(location.getLongitude()));
        m37400w("Location", mapM37398u);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: p */
    public void mo37419p() {
        Analytics.m30325b(new AdobeCallback() { // from class: com.disney.wdpro.analytics.e
            @Override // com.adobe.marketing.mobile.AdobeCallback
            /* renamed from: a */
            public final void mo30322a(Object obj) {
                C8674f.m37395r((Long) obj);
            }
        });
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8679k
    /* renamed from: q */
    public Map<String, String> mo37420q() {
        return new HashMap();
    }

    @Inject
    public C8674f(InterfaceC8678j interfaceC8678j, InterfaceC8682n interfaceC8682n, C28830d c28830d) {
        this(interfaceC8678j, interfaceC8682n, c28830d, null, null);
    }
}