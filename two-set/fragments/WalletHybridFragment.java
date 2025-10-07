package com.wdpr.p479ee.wallet.p482ui.fragments;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.api.p476v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.hybridFactory.HybridFactory;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.pageEvents.PageEventsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.SSOPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import com.wdpr.p479ee.wallet.p482ui.activities.WalletHybridActivity;
import com.wdpr.p479ee.wallet.p482ui.plugins.SSOTokenUpdateNotifyPlugin;
import com.wdpr.p479ee.wallet.p482ui.plugins.WalletHybridSendMessagePlugin;
import com.wdpr.p479ee.wallet.p482ui.plugins.WalletHybridTriggerPlugin;
import com.wdpr.p479ee.wallet.p482ui.plugins.WalletModalSendMessagePlugin;
import com.wdpr.p479ee.wallet.p482ui.plugins.WalletModalTriggerPlugin;
import com.wdpr.p479ee.wallet.p482ui.plugins.WalletTokenUpdateNotifyPlugin;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpCookie;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p716kx.C30263a;
import p716kx.C30264b;
import p716kx.C30265c;

@Instrumented
/* loaded from: classes21.dex */
public class WalletHybridFragment extends Fragment implements PageEventsPlugin.PageEventsPluginListener, SSOPlugin.RequestTokenForSSOListener, WebAnalyticsPluginListener, WebViewLifecyclePluginListener, TraceFieldInterface {

    /* renamed from: n */
    private static final String f71795n = WalletHybridActivity.class.getSimpleName();

    /* renamed from: a */
    public SSOPlugin.SSOTokenUpdateListener f71796a = new C27002a();

    /* renamed from: b */
    public HybridCoordinator f71797b;

    /* renamed from: c */
    public SSOPlugin.RequestTokenReadyForSSOListener f71798c;

    /* renamed from: d */
    public SSOTokenUpdateNotifyPlugin f71799d;

    /* renamed from: e */
    public WalletTokenUpdateNotifyPlugin f71800e;

    /* renamed from: f */
    public WalletModalSendMessagePlugin f71801f;

    /* renamed from: g */
    public WalletModalTriggerPlugin f71802g;

    /* renamed from: h */
    public WalletHybridTriggerPlugin f71803h;

    /* renamed from: i */
    public WalletHybridSendMessagePlugin f71804i;

    /* renamed from: j */
    public Activity f71805j;

    /* renamed from: k */
    private TextView f71806k;

    /* renamed from: l */
    private TextView f71807l;

    /* renamed from: m */
    public Trace f71808m;

    @Instrumented
    /* renamed from: com.wdpr.ee.wallet.ui.fragments.WalletHybridFragment$a */
    class C27002a implements SSOPlugin.SSOTokenUpdateListener {
        C27002a() {
        }

        @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
        public void onTokenUpdateFailure(SSOPlugin sSOPlugin, String str) {
            LogInstrumentation.m79026e(WalletHybridFragment.f71795n, "onTokenUpdateFailure(): " + str);
        }

        @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
        public void onTokenUpdateReady(SSOPlugin sSOPlugin, EntryPointsConfig entryPointsConfig) {
            LogInstrumentation.m79024d(WalletHybridFragment.f71795n, "onTokenUpdateReady(): Start url is " + entryPointsConfig.getStartUrl());
        }

        @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
        public void onTokenUpdateSuccess(SSOPlugin sSOPlugin, EntryPointsConfig entryPointsConfig) {
            LogInstrumentation.m79024d(WalletHybridFragment.f71795n, "onTokenUpdateSuccess(): Successfully updated access token and request to load : " + entryPointsConfig.getStartUrl());
        }
    }

    /* renamed from: A0 */
    private void m85717A0(String str, String str2, Map<String, Object> map) {
        LogInstrumentation.m79024d(f71795n, str + ": State Title : " + str2);
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String str3 = f71795n;
                LogInstrumentation.m79024d(str3, str + ": Key : " + entry.getKey());
                LogInstrumentation.m79024d(str3, str + ": Data Value : " + entry.getValue());
                LogInstrumentation.m79024d(str3, "------------------------------------------------------------------------------");
            }
        }
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.pageEvents.PageEventsPlugin.PageEventsPluginListener
    public void didReceiveClose(String str) {
        LogInstrumentation.m79028i(f71795n, "WalletHybridFragment: Web sent close message with parameters: " + str);
        this.f71797b.getHybridFragment().getActivity().finish();
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.pageEvents.PageEventsPlugin.PageEventsPluginListener
    public void didReceiveError(String str) {
        LogInstrumentation.m79026e(f71795n, "Web sent error message with parameters: " + str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f71805j = activity;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onCancel(WebView webView, int i10, String str) {
        String str2 = i10 != 3001 ? i10 != 3002 ? "" : "Blocked" : "Navigation";
        LogInstrumentation.m79024d(f71795n, "WebViewLifecyclePluginListener.onCancel(): Cancelled because of " + str2 + ", URL is " + str);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            TraceMachine.enterMethod(this.f71808m, "WalletHybridFragment#onCreateView", null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod(null, "WalletHybridFragment#onCreateView", null);
        }
        View viewInflate = layoutInflater.inflate(C30264b.fragment_wallet_ui, viewGroup, false);
        this.f71806k = (TextView) viewInflate.findViewById(C30263a.title_web_view_disabled);
        this.f71807l = (TextView) viewInflate.findViewById(C30263a.description_web_view_disabled);
        m85719w0();
        m85721y0();
        m85722z0();
        TraceMachine.exitMethod();
        return viewInflate;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onDisabled() {
        LogInstrumentation.m79024d(f71795n, "WebView is disabled on current device " + Build.MODEL);
        this.f71806k.setVisibility(0);
        this.f71807l.setVisibility(0);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onError(WebView webView, int i10, int i11, String str, String str2) {
        String str3 = i10 != 4001 ? i10 != 4002 ? "" : "Status Code" : "System";
        LogInstrumentation.m79026e(f71795n, "onError() Type: " + str3 + ", Error Code: " + i11 + ", Description: " + str + ", URL : " + str2);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onFinish(WebView webView, String str) {
        LogInstrumentation.m79024d(f71795n, "WebViewLifecyclePluginListener.onFinish(): URL is " + str);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onLoading(WebView webView, int i10, String str) {
        LogInstrumentation.m79024d(f71795n, "WebViewLifecyclePluginListener.onLoading(): Progress is " + i10 + ", URL : " + str);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onReady(WebView webView, String str, String str2) {
        LogInstrumentation.m79024d(f71795n, "WebViewLifecyclePluginListener.onReady(): JSON Response: is " + str + ", URL is " + str2);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedData(WebAnalyticsPlugin webAnalyticsPlugin, String str) {
        String str2 = f71795n;
        RAHybridLog.m85711d(str2, "WebAnalyticsPluginListener.onReceivedData() Received web analytics raw data: " + str);
        Map map = (Map) GsonInstrumentation.fromJson(new Gson(), str, new TypeToken<Map<String, String>>() { // from class: com.wdpr.ee.wallet.ui.fragments.WalletHybridFragment.2
        }.getType());
        String str3 = "Received web analytics message: ";
        if (map.containsKey("screen-viewed")) {
            str3 = "Received web analytics message: " + ((String) map.get("screen-viewed"));
        } else if (map.containsKey("button-click")) {
            str3 = "Received web analytics message: " + ((String) map.get("button-click"));
        }
        LogInstrumentation.m79024d(str2, str3);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedTrackActionData(WebAnalyticsPlugin webAnalyticsPlugin, String str, Map<String, Object> map) {
        m85717A0("WebAnalyticsPluginListener.onReceivedTrackActionData()", str, map);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedTrackStateData(WebAnalyticsPlugin webAnalyticsPlugin, String str, Map<String, Object> map) {
        m85717A0("WebAnalyticsPluginListener.onReceivedTrackStateData()", str, map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onTimeout(WebView webView, int i10, String str, String str2) {
        String str3 = i10 != 2002 ? i10 != 5001 ? "" : "Page Ready Timed-out" : "WebView Finish Timed-out";
        LogInstrumentation.m79026e(f71795n, "WebViewLifecyclePluginListener.onTimeout() Time : " + str3 + ", Description : " + str + ", URL : " + str2);
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.RequestTokenForSSOListener
    public void requestTokenForSSO(SSOPlugin.RequestTokenReadyForSSOListener requestTokenReadyForSSOListener) {
        LogInstrumentation.m79024d(f71795n, "Called tokenForSSO");
        this.f71798c = requestTokenReadyForSSOListener;
    }

    /* renamed from: w0 */
    public void m85719w0() {
        HybridCoordinator hybridCoordinatorMakeCoordinator = HybridFactory.makeCoordinator(getContext(), (HybridWebConfig) GsonInstrumentation.fromJson(new Gson(), (Reader) new BufferedReader(new InputStreamReader(getResources().openRawResource(C30265c.wallet_hybrid_config))), HybridWebConfig.class), (List<Class<? extends Plugin>>) Arrays.asList(SSOTokenUpdateNotifyPlugin.class, WalletTokenUpdateNotifyPlugin.class, WalletModalSendMessagePlugin.class, WalletModalTriggerPlugin.class, WalletHybridSendMessagePlugin.class, WalletHybridTriggerPlugin.class), (List<HttpCookie>) Collections.EMPTY_LIST);
        this.f71797b = hybridCoordinatorMakeCoordinator;
        this.f71799d = (SSOTokenUpdateNotifyPlugin) hybridCoordinatorMakeCoordinator.getPlugin("SSOTokenUpdateNotifyPlugin");
        this.f71800e = (WalletTokenUpdateNotifyPlugin) this.f71797b.getPlugin("WalletTokenUpdateNotifyPlugin");
        this.f71801f = (WalletModalSendMessagePlugin) this.f71797b.getPlugin("WalletModalSendMessagePlugin");
        m85720x0(this.f71797b);
        ((PageEventsPlugin) this.f71797b.getPlugin(PageEventsPlugin.f71778ID)).setPageEventsPluginListener(this);
        getChildFragmentManager().m19761r().m19871v(C30263a.fragment_wallet_ui, this.f71797b.getHybridFragment()).mo19611k();
    }

    /* renamed from: x0 */
    public void m85720x0(HybridCoordinator hybridCoordinator) {
        this.f71801f = (WalletModalSendMessagePlugin) hybridCoordinator.getPlugin("WalletModalSendMessagePlugin");
        WalletModalTriggerPlugin walletModalTriggerPlugin = (WalletModalTriggerPlugin) hybridCoordinator.getPlugin("WalletModalTriggerPlugin");
        this.f71802g = walletModalTriggerPlugin;
        walletModalTriggerPlugin.f71825c = this.f71805j;
        walletModalTriggerPlugin.f71824b = hybridCoordinator;
    }

    /* renamed from: y0 */
    public void m85721y0() {
        SSOPlugin sSOPlugin = this.f71797b.getSSOPlugin();
        sSOPlugin.setRequestTokenForSSOListener(this);
        sSOPlugin.addSSOTokenUpdateListener(this.f71796a);
    }

    /* renamed from: z0 */
    public void m85722z0() {
        this.f71804i = (WalletHybridSendMessagePlugin) this.f71797b.getPlugin("WalletHybridSendMessagePlugin");
        WalletHybridTriggerPlugin walletHybridTriggerPlugin = (WalletHybridTriggerPlugin) this.f71797b.getPlugin("WalletHybridTriggerPlugin");
        this.f71803h = walletHybridTriggerPlugin;
        walletHybridTriggerPlugin.f71817c = this.f71805j;
        walletHybridTriggerPlugin.f71816b = this.f71797b;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onStart(WebView webView, String str) {
        LogInstrumentation.m79024d(f71795n, "WebViewLifecyclePluginListener.onStart(): URL is " + str);
    }
}