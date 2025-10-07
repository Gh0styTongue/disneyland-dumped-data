package com.wdpr.p479ee.wallet.p482ui.activities;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.api.p476v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.hybridFactory.HybridFactory;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.pageEvents.PageEventsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.SSOPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
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
import p741lx.C30399a;

@Instrumented
/* loaded from: classes21.dex */
public class WalletHybridActivity extends AppCompatActivity implements PageEventsPlugin.PageEventsPluginListener, SSOPlugin.RequestTokenForSSOListener, WebAnalyticsPluginListener, WebViewLifecyclePluginListener, TraceFieldInterface {
    private static final String TAG = "WalletHybridActivity";
    public Trace _nr_trace;
    public HybridCoordinator mHybridCoordinator;
    public SSOPlugin.RequestTokenReadyForSSOListener mRequestTokenReadyForSSOListener;
    public SSOPlugin.SSOTokenUpdateListener mSSOTokenUpdateListener = new C27000a();
    public SSOTokenUpdateNotifyPlugin mSSOTokenUpdateNotifyPlugin;
    public WalletHybridSendMessagePlugin mWalletHybridSendMessagePlugin;
    public WalletHybridTriggerPlugin mWalletHybridTriggerPlugin;
    public WalletModalSendMessagePlugin mWalletModalSendMessagePlugin;
    public WalletModalTriggerPlugin mWalletModalTriggerPlugin;
    public WalletTokenUpdateNotifyPlugin mWalletTokenUpdateNotifyPlugin;

    @Instrumented
    /* renamed from: com.wdpr.ee.wallet.ui.activities.WalletHybridActivity$a */
    class C27000a implements SSOPlugin.SSOTokenUpdateListener {
        C27000a() {
        }

        @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
        public void onTokenUpdateFailure(SSOPlugin sSOPlugin, String str) {
            LogInstrumentation.m79026e(WalletHybridActivity.TAG, "SSOPlugin.RequestTokenForSSOListener.onTokenUpdateFailure(): " + str);
        }

        @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
        public void onTokenUpdateReady(SSOPlugin sSOPlugin, EntryPointsConfig entryPointsConfig) {
            LogInstrumentation.m79024d(WalletHybridActivity.TAG, "SSOPlugin.RequestTokenForSSOListener.onTokenUpdateReady(): Start url is " + entryPointsConfig.getStartUrl());
        }

        @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
        public void onTokenUpdateSuccess(SSOPlugin sSOPlugin, EntryPointsConfig entryPointsConfig) {
            LogInstrumentation.m79024d(WalletHybridActivity.TAG, "SSOPlugin.RequestTokenForSSOListener.onTokenUpdateSuccess(): Successfully updated access token and request to load : " + entryPointsConfig.getStartUrl());
        }
    }

    private void showLogMessage(String str, String str2, Map<String, Object> map) {
        LogInstrumentation.m79024d(TAG, str + ": State Title : " + str2);
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String str3 = TAG;
                LogInstrumentation.m79024d(str3, str + ": Key : " + entry.getKey());
                LogInstrumentation.m79024d(str3, str + ": Data Value : " + entry.getValue());
                LogInstrumentation.m79024d(str3, "------------------------------------------------------------------------------");
            }
        }
    }

    private List<PluginConfig> updatePluginList(List<PluginConfig> list) {
        PluginConfig pluginConfig = new PluginConfig();
        PluginConfig pluginConfig2 = new PluginConfig();
        PluginConfig pluginConfig3 = new PluginConfig();
        PluginConfig pluginConfig4 = new PluginConfig();
        pluginConfig.setId("WalletModalSendMessagePlugin");
        pluginConfig2.setId("WalletModalTriggerPlugin");
        pluginConfig3.setId("WalletHybridSendMessagePlugin");
        pluginConfig4.setId("WalletHybridTriggerPlugin");
        list.add(pluginConfig);
        list.add(pluginConfig2);
        list.add(pluginConfig3);
        list.add(pluginConfig4);
        return list;
    }

    public void didReceiveClose(String str) {
        LogInstrumentation.m79028i(TAG, "WalletHybridActivity: Web sent close message with parameters: " + str);
        this.mHybridCoordinator.getHybridFragment().getActivity().finish();
    }

    public void didReceiveError(String str) {
        LogInstrumentation.m79026e(TAG, "ERROR: Web sent error message with parameters: " + str);
    }

    public void onCancel(WebView webView, int i10, String str) {
        String str2 = i10 != 3001 ? i10 != 3002 ? "" : "Blocked" : "Navigation";
        LogInstrumentation.m79024d(TAG, "WebViewLifecyclePluginListener.onCancel(): Cancelled because of " + str2 + ", URL is " + str);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        TraceMachine.startTracing("WalletHybridActivity");
        try {
            TraceMachine.enterMethod(this._nr_trace, "WalletHybridActivity#onCreate", null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod(null, "WalletHybridActivity#onCreate", null);
        }
        super.onCreate(bundle);
        setContentView(C30264b.activity_wallet_ui);
        setupHybridCoordinator();
        setupSSOPlugin();
        setupWalletHybridMessaging();
        TraceMachine.exitMethod();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onDisabled() {
        LogInstrumentation.m79024d(TAG, "WebView is disabled on current device " + Build.MODEL);
        setContentView(C30264b.activity_no_webview_ui);
    }

    public void onError(WebView webView, int i10, int i11, String str, String str2) {
        String str3 = i10 != 4001 ? i10 != 4002 ? "" : "Status Code" : "System";
        LogInstrumentation.m79026e(TAG, "WebViewLifecyclePluginListener.onError() Type: " + str3 + ", Error Code: " + i11 + ", Description: " + str + ", URL : " + str2);
    }

    public void onFinish(WebView webView, String str) {
        LogInstrumentation.m79024d(TAG, "WebViewLifecyclePluginListener.onFinish(): URL is " + str);
    }

    public void onLoading(WebView webView, int i10, String str) {
        LogInstrumentation.m79024d(TAG, "WebViewLifecyclePluginListener.onLoading(): Progress is " + i10 + ", URL : " + str);
    }

    public void onReady(WebView webView, String str, String str2) {
        LogInstrumentation.m79024d(TAG, "WebViewLifecyclePluginListener.onReady(): JSON Response: is " + str + ", URL is " + str2);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedData(WebAnalyticsPlugin webAnalyticsPlugin, String str) {
        String str2 = TAG;
        RAHybridLog.m85711d(str2, "WebAnalyticsPluginListener.onReceivedData() Received web analytics raw data: " + str);
        Map map = (Map) GsonInstrumentation.fromJson(new Gson(), str, new TypeToken<Map<String, String>>() { // from class: com.wdpr.ee.wallet.ui.activities.WalletHybridActivity.2
        }.getType());
        String str3 = "Received web analytics message: ";
        if (map.containsKey("screen-viewed")) {
            str3 = "Received web analytics message: " + ((String) map.get("screen-viewed"));
        } else if (map.containsKey("button-click")) {
            str3 = "Received web analytics message: " + ((String) map.get("button-click"));
        }
        LogInstrumentation.m79024d(str2, str3);
    }

    public void onReceivedTrackActionData(WebAnalyticsPlugin webAnalyticsPlugin, String str, Map<String, Object> map) {
        showLogMessage("WebAnalyticsPluginListener.onReceivedTrackActionData()", str, map);
    }

    public void onReceivedTrackStateData(WebAnalyticsPlugin webAnalyticsPlugin, String str, Map<String, Object> map) {
        showLogMessage("WebAnalyticsPluginListener.onReceivedTrackStateData()", str, map);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        ApplicationStateMonitor.getInstance().activityStarted();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        ApplicationStateMonitor.getInstance().activityStopped();
    }

    public void onTimeout(WebView webView, int i10, String str, String str2) {
        String str3 = i10 != 2002 ? i10 != 5001 ? "" : "Page Ready Timed-out" : "WebView Finish Timed-out";
        LogInstrumentation.m79026e(TAG, "WebViewLifecyclePluginListener.onTimeout() Time : " + str3 + ", Description : " + str + ", URL : " + str2);
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.RequestTokenForSSOListener
    public void requestTokenForSSO(SSOPlugin.RequestTokenReadyForSSOListener requestTokenReadyForSSOListener) {
        LogInstrumentation.m79024d(TAG, "Called requestTokenForSSO");
        this.mRequestTokenReadyForSSOListener = requestTokenReadyForSSOListener;
    }

    public void setupHybridCoordinator() {
        HybridCoordinator hybridCoordinatorMakeCoordinator = HybridFactory.makeCoordinator(this, (HybridWebConfig) GsonInstrumentation.fromJson(new Gson(), (Reader) new BufferedReader(new InputStreamReader(getResources().openRawResource(C30265c.wallet_hybrid_config))), HybridWebConfig.class), (List<Class<? extends Plugin>>) Arrays.asList(SSOTokenUpdateNotifyPlugin.class, WalletTokenUpdateNotifyPlugin.class, WalletModalSendMessagePlugin.class, WalletModalTriggerPlugin.class, WalletHybridSendMessagePlugin.class, WalletHybridTriggerPlugin.class), (List<HttpCookie>) Collections.EMPTY_LIST);
        this.mHybridCoordinator = hybridCoordinatorMakeCoordinator;
        this.mSSOTokenUpdateNotifyPlugin = (SSOTokenUpdateNotifyPlugin) hybridCoordinatorMakeCoordinator.getPlugin("SSOTokenUpdateNotifyPlugin");
        this.mWalletTokenUpdateNotifyPlugin = (WalletTokenUpdateNotifyPlugin) this.mHybridCoordinator.getPlugin("WalletTokenUpdateNotifyPlugin");
        ((PageEventsPlugin) this.mHybridCoordinator.getPlugin(PageEventsPlugin.f71778ID)).setPageEventsPluginListener(this);
        setupNativeModal(this.mHybridCoordinator);
        getSupportFragmentManager().m19761r().m19871v(C30263a.activity_wallet_ui_frame_layout, this.mHybridCoordinator.getHybridFragment()).mo19611k();
    }

    public void setupNativeModal(HybridCoordinator hybridCoordinator) {
        this.mWalletModalSendMessagePlugin = (WalletModalSendMessagePlugin) hybridCoordinator.getPlugin("WalletModalSendMessagePlugin");
        WalletModalTriggerPlugin walletModalTriggerPlugin = (WalletModalTriggerPlugin) hybridCoordinator.getPlugin("WalletModalTriggerPlugin");
        this.mWalletModalTriggerPlugin = walletModalTriggerPlugin;
        walletModalTriggerPlugin.f71825c = this;
        walletModalTriggerPlugin.f71824b = hybridCoordinator;
    }

    public void setupSSOPlugin() {
        SSOPlugin sSOPlugin = this.mHybridCoordinator.getSSOPlugin();
        sSOPlugin.setRequestTokenForSSOListener(this);
        sSOPlugin.addSSOTokenUpdateListener(this.mSSOTokenUpdateListener);
    }

    public void setupWalletHybridMessaging() {
        this.mWalletHybridSendMessagePlugin = (WalletHybridSendMessagePlugin) this.mHybridCoordinator.getPlugin("WalletHybridSendMessagePlugin");
        WalletHybridTriggerPlugin walletHybridTriggerPlugin = (WalletHybridTriggerPlugin) this.mHybridCoordinator.getPlugin("WalletHybridTriggerPlugin");
        this.mWalletHybridTriggerPlugin = walletHybridTriggerPlugin;
        walletHybridTriggerPlugin.f71817c = this;
        walletHybridTriggerPlugin.f71816b = this.mHybridCoordinator;
    }

    public void updateAuthToken(String str) {
        try {
            this.mRequestTokenReadyForSSOListener.onJWTReadyForSSO(str);
        } catch (Exception e10) {
            if (e10.getMessage().contains("MissingWebViewPackage")) {
                setContentView(C30264b.activity_no_webview_ui);
            }
            LogInstrumentation.m79026e(TAG, "WalletHybridActivity UpdateAuthToken: exception" + e10.getStackTrace());
        }
    }

    public void onStart(WebView webView, String str) {
        LogInstrumentation.m79024d(TAG, "WebViewLifecyclePluginListener.onStart(): URL is " + str);
    }

    public void setupHybridCoordinator(C30399a c30399a) {
        c30399a.f77741e.setPlugins(updatePluginList(c30399a.f77741e.getPlugins()));
        HybridCoordinator hybridCoordinatorMakeCoordinator = HybridFactory.makeCoordinator(this, c30399a.f77741e, (List<Class<? extends Plugin>>) Arrays.asList(SSOTokenUpdateNotifyPlugin.class, WalletTokenUpdateNotifyPlugin.class, WalletModalSendMessagePlugin.class, WalletModalTriggerPlugin.class, WalletHybridSendMessagePlugin.class, WalletHybridTriggerPlugin.class), (List<HttpCookie>) Collections.EMPTY_LIST);
        this.mHybridCoordinator = hybridCoordinatorMakeCoordinator;
        this.mSSOTokenUpdateNotifyPlugin = (SSOTokenUpdateNotifyPlugin) hybridCoordinatorMakeCoordinator.getPlugin("SSOTokenUpdateNotifyPlugin");
        this.mWalletTokenUpdateNotifyPlugin = (WalletTokenUpdateNotifyPlugin) this.mHybridCoordinator.getPlugin("WalletTokenUpdateNotifyPlugin");
        setupNativeModal(this.mHybridCoordinator);
        ((PageEventsPlugin) this.mHybridCoordinator.getPlugin(PageEventsPlugin.f71778ID)).setPageEventsPluginListener(this);
        getSupportFragmentManager().m19761r().m19871v(C30263a.activity_wallet_ui_frame_layout, this.mHybridCoordinator.getHybridFragment()).mo19611k();
    }
}