package com.disney.wdpro.analytics;

import android.content.Context;
import com.google.common.base.C22456g;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.InterfaceC22815x2;
import com.newrelic.agent.android.FeatureFlag;
import com.newrelic.agent.android.NewRelic;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.disney.wdpro.analytics.o */
/* loaded from: classes23.dex */
public class C8683o implements InterfaceC8682n {
    private static final String BACKGROUND = "wasBackgrounded";
    private static final String ENERGY_STATE = "EnergyState";
    private static final String EVENT_TYPE = "LoadTimeTracking";
    private static final String MOBILE_PERFORMANCE = "MobilePerformance";
    private static final String TIME_VARIABLE = "time";
    private static final String VISITED_SCREENS = "visitedScreens";
    private static final String WAS_BACKGROUNDED = "1";
    private final Context appContext;
    private final String appVersion;
    private final String buildInfo;
    private boolean isNRNativeCrashReportEnabled;
    private final String newRelicToken;
    private InterfaceC22815x2<String, String, Object> timedEventData;
    private List<String> visitedScreens;

    public C8683o(Context context, String str, String str2, String str3) {
        this(context, str, str2, str3, false);
    }

    /* renamed from: a */
    private void m37441a(String str, String str2, Map<String, Object> map) {
        if (MOBILE_PERFORMANCE.equals(str) && ENERGY_STATE.equals(str2)) {
            if (map.containsKey(VISITED_SCREENS)) {
                map.remove(VISITED_SCREENS);
                this.visitedScreens.clear();
            } else {
                if (this.visitedScreens.isEmpty()) {
                    return;
                }
                map.put(VISITED_SCREENS, C22456g.m68633k(",").m68637f(this.visitedScreens));
                this.visitedScreens.clear();
            }
        }
    }

    /* renamed from: b */
    private synchronized void m37442b(String str) {
        Iterator it = new HashSet(this.timedEventData.row(str).keySet()).iterator();
        while (it.hasNext()) {
            this.timedEventData.remove(str, (String) it.next());
        }
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n
    public String getCurrentSessionId() {
        return NewRelic.currentSessionId();
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n
    public void init() {
        if (NewRelic.isStarted()) {
            return;
        }
        NewRelic.enableFeature(FeatureFlag.NetworkRequests);
        if (this.isNRNativeCrashReportEnabled) {
            NewRelic.enableFeature(FeatureFlag.NativeReporting);
        }
        NewRelic.withApplicationToken(this.newRelicToken).withApplicationVersion(this.appVersion).withApplicationBuild(this.buildInfo).start(this.appContext);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n
    public void logHandledException(Throwable th2) {
        if (th2 instanceof Exception) {
            recordHandledException((Exception) th2);
        }
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n
    public boolean recordBreadcrumb(String str, Map<String, Object> map) {
        C22462m.m68673e(!C22466q.m68722b(str), "breadcrumb name parameter cannot be null or empty.");
        return NewRelic.isStarted() && NewRelic.recordBreadcrumb(str, map);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n, com.disney.wdpro.dlog.InterfaceC10158c
    public boolean recordCustomEvent(String str, String str2, Map<String, Object> map) {
        C22462m.m68684p(str);
        m37441a(str, str2, map);
        return NewRelic.isStarted() && NewRelic.recordCustomEvent(str, str2, map);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n
    public void recordHandledException(Exception exc) {
        if (!NewRelic.isStarted() || exc == null) {
            return;
        }
        NewRelic.recordHandledException(exc);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n
    public void removeAttribute(String str) {
        NewRelic.removeAttribute(str);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n
    public void sendBreadcrumb(String str) {
        C22462m.m68673e(!C22466q.m68722b(str), "crumb parameter cannot be null or empty.");
        if (NewRelic.isStarted()) {
            NewRelic.startInteraction(str);
        }
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n
    public void setAttribute(String str, String str2) {
        NewRelic.setAttribute(str, str2);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n
    public void trackTimedActionEnd(String str) {
        trackTimedActionEnd("LoadTimeTracking", str);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n
    public void trackTimedActionStart(String str, Map<String, Object> map) {
        m37442b(str);
        this.timedEventData.put(str, "time", Long.valueOf(System.currentTimeMillis()));
        if (map != null) {
            for (String str2 : map.keySet()) {
                this.timedEventData.put(str, str2, map.get(str2));
            }
        }
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n
    public void trackTimedActionUpdate(String str, Map<String, Object> map) {
        if (this.timedEventData.containsRow(str)) {
            for (String str2 : map.keySet()) {
                this.timedEventData.put(str, str2, map.get(str2));
            }
        }
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n
    public void trackTimedActionsFlagAsBackgrounded() {
        Iterator<String> it = this.timedEventData.rowKeySet().iterator();
        while (it.hasNext()) {
            this.timedEventData.put(it.next(), BACKGROUND, "1");
        }
    }

    public C8683o(Context context, String str, String str2, String str3, boolean z10) {
        this.newRelicToken = (String) C22462m.m68684p(str);
        this.appVersion = (String) C22462m.m68684p(str2);
        this.appContext = (Context) C22462m.m68684p(context);
        this.buildInfo = (String) C22462m.m68684p(str3);
        this.timedEventData = HashBasedTable.create();
        this.visitedScreens = new ArrayList();
        this.isNRNativeCrashReportEnabled = z10;
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n
    public void trackTimedActionEnd(String str, String str2) {
        if (NewRelic.isStarted() && this.timedEventData.contains(str2, "time")) {
            this.timedEventData.put(str2, "time", Long.valueOf(System.currentTimeMillis() - ((Long) this.timedEventData.get(str2, "time")).longValue()));
            NewRelic.recordCustomEvent(str, str2, this.timedEventData.row(str2));
            m37442b(str2);
        }
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8682n
    public void sendBreadcrumb(String str, boolean z10) {
        if (z10) {
            this.visitedScreens.add(str);
        }
        sendBreadcrumb(str);
    }
}