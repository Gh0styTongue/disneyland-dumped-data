package com.wdpr.p479ee.p480ra.rahybrid.activity;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.newrelic.agent.android.api.p476v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.hybridFactory.HybridFactory;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.accesscontrol.AccessControlPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.pageEvents.PageEventsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.SSOPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.model.OAuthTokenModel;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.net.HttpCookie;
import java.util.List;
import java.util.Map;

@Instrumented
/* loaded from: classes21.dex */
public abstract class WebViewBaseActivity extends AppCompatActivity implements WebViewLifecyclePluginListener, SSOPlugin.RequestTokenForSSOListener, SSOPlugin.SSOTokenUpdateListener, WebAnalyticsPluginListener, PageEventsPlugin.PageEventsPluginListener, AccessControlPlugin.AccessControlPluginListener, TraceFieldInterface {
    private static final String TAG = "WebViewBaseActivity";
    public Trace _nr_trace;
    public HybridCoordinator hybridCoordinator;

    private void setupAllPluginListener() {
        this.hybridCoordinator.getWebViewLifecyclePlugin().setWebViewLifecyclePluginListener(this);
        this.hybridCoordinator.getPageEventsPlugin().setPageEventsPluginListener(this);
        this.hybridCoordinator.getWebAnalyticsPlugin().setWebAnalyticsPluginListener(this);
        AccessControlPlugin accessControlPlugin = this.hybridCoordinator.getAccessControlPlugin();
        if (accessControlPlugin != null) {
            accessControlPlugin.setActivity(this);
            accessControlPlugin.setAccessControlPluginListener(this);
        }
        SSOPlugin sSOPlugin = this.hybridCoordinator.getSSOPlugin();
        if (sSOPlugin != null) {
            sSOPlugin.setRequestTokenForSSOListener(this);
            sSOPlugin.addSSOTokenUpdateListener(this);
        }
    }

    @Override // com.newrelic.agent.android.api.p476v2.TraceFieldInterface
    public void _nr_setTrace(Trace trace) {
        try {
            this._nr_trace = trace;
        } catch (Exception unused) {
        }
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.pageEvents.PageEventsPlugin.PageEventsPluginListener
    public void didReceiveClose(String str) {
        RAHybridLog.m85711d(TAG, "didReceiveClose(String commandParameters): " + str);
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.pageEvents.PageEventsPlugin.PageEventsPluginListener
    public void didReceiveError(String str) {
        RAHybridLog.m85712e(TAG, "didReceiveError(String commandParameters): " + str);
    }

    protected List<HttpCookie> getCookies() {
        return null;
    }

    protected Map<String, String> getHttpHeaders() {
        return null;
    }

    protected abstract HybridWebConfig getHybridWebConfig();

    protected List<Class<? extends Plugin>> getPluginClasses() {
        return null;
    }

    protected abstract int getWebViewContainerId();

    protected final void jwtReadyForSSO(String str, SSOPlugin.RequestTokenReadyForSSOListener requestTokenReadyForSSOListener) {
        requestTokenReadyForSSOListener.onJWTReadyForSSO(str);
    }

    protected final void loadWebView(String str, Map<String, String> map) {
        this.hybridCoordinator.load(str, map);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onCancel(WebView webView, int i10, String str) {
        String str2 = i10 != 3001 ? i10 != 3002 ? "" : "Blocked" : "Navigation";
        RAHybridLog.m85711d(TAG, "onCancel() Cancelled because of : " + str2 + ", URL : " + str);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        TraceMachine.startTracing("WebViewBaseActivity");
        try {
            TraceMachine.enterMethod(this._nr_trace, "WebViewBaseActivity#onCreate", null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod(null, "WebViewBaseActivity#onCreate", null);
        }
        super.onCreate(bundle);
        setupPlugins(getHybridWebConfig(), getPluginClasses(), getCookies(), getHttpHeaders());
        getSupportFragmentManager().m19761r().m19871v(getWebViewContainerId(), this.hybridCoordinator.getHybridFragment()).mo19611k();
        TraceMachine.exitMethod();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onDisabled() {
        RAHybridLog.m85712e(TAG, "WebView is disabled on current device " + Build.MODEL);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onError(WebView webView, int i10, int i11, String str, String str2) {
        String str3 = i10 != 4001 ? i10 != 4002 ? "" : "Status Code" : "System";
        RAHybridLog.m85712e(TAG, "onError() Type: " + str3 + ", Error Code: " + i11 + ", Description: " + str + ", URL : " + str2);
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.accesscontrol.AccessControlPlugin.AccessControlPluginListener
    public void onFailAccessWhitelistForURL(AccessControlPlugin accessControlPlugin, String str) {
        RAHybridLog.m85712e(TAG, "onFailAccessWhitelistForURL(AccessControlPlugin accessControlPlugin, String url): " + str);
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.accesscontrol.AccessControlPlugin.AccessControlPluginListener
    public void onFailIntentWhitelistForURL(AccessControlPlugin accessControlPlugin, String str) {
        RAHybridLog.m85712e(TAG, "onFailIntentWhitelistForURL(AccessControlPlugin accessControlPlugin, String url): " + str);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onFinish(WebView webView, String str) {
        RAHybridLog.m85711d(TAG, "onFinish() URL : " + str);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onLoading(WebView webView, int i10, String str) {
        RAHybridLog.m85711d(TAG, "onLoading() progress : " + i10 + ", URL : " + str);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onReady(WebView webView, String str, String str2) {
        RAHybridLog.m85711d(TAG, "onReady() JSON Response: " + str + ", URL : " + str2);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedData(WebAnalyticsPlugin webAnalyticsPlugin, String str) {
        RAHybridLog.m85711d(TAG, "onReceivedData(WebAnalyticsPlugin webAnalyticsPlugin, String data): " + str);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedTrackActionData(WebAnalyticsPlugin webAnalyticsPlugin, String str, Map<String, Object> map) {
        RAHybridLog.m85711d(TAG, "onReceivedTrackActionData(): " + str + ", Data Map : " + map);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedTrackStateData(WebAnalyticsPlugin webAnalyticsPlugin, String str, Map<String, Object> map) {
        RAHybridLog.m85711d(TAG, "onReceivedTrackStateData(): " + str + ", Data Map : " + map);
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

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onTimeout(WebView webView, int i10, String str, String str2) {
        String str3 = i10 != 2002 ? i10 != 5001 ? "" : "Page Ready Timed-out" : "WebView Finish Timed-out";
        RAHybridLog.m85712e(TAG, "onTimeout() time : " + str3 + ", Description : " + str + ", URL : " + str2);
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateFailure(SSOPlugin sSOPlugin, String str) {
        RAHybridLog.m85712e(TAG, "onTokenUpdateFailure(@NonNull SSOPlugin ssoPlugin, @NonNull String error): " + str);
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateReady(SSOPlugin sSOPlugin, EntryPointsConfig entryPointsConfig) {
        RAHybridLog.m85711d(TAG, "onTokenUpdateReady(@NonNull SSOPlugin ssoPlugin, @NonNull EntryPointsConfig entryPointsConfig): " + entryPointsConfig.getStartUrl());
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateSuccess(SSOPlugin sSOPlugin, EntryPointsConfig entryPointsConfig) {
        RAHybridLog.m85711d(TAG, "onTokenUpdateSuccess(@NonNull SSOPlugin ssoPlugin, @NonNull EntryPointsConfig entryPointsConfig): " + entryPointsConfig.getStartUrl());
    }

    protected final void requestToGenerateJWT(String str, String str2, SSOPlugin.RequestTokenReadyForSSOListener requestTokenReadyForSSOListener) {
        requestTokenReadyForSSOListener.onOAuthTokenReadyForSSO(new OAuthTokenModel(str, str2));
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.RequestTokenForSSOListener
    public void requestTokenForSSO(SSOPlugin.RequestTokenReadyForSSOListener requestTokenReadyForSSOListener) {
        RAHybridLog.m85711d(TAG, "requestTokenForSSO(SSOPlugin.RequestTokenReadyForSSOListener requestTokenReadyForSSOListener)");
    }

    public final void setupPlugins(HybridWebConfig hybridWebConfig, List<Class<? extends Plugin>> list, List<HttpCookie> list2, Map<String, String> map) {
        this.hybridCoordinator = HybridFactory.makeCoordinator(this, hybridWebConfig, list, list2, map);
        setupAllPluginListener();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onStart(WebView webView, String str) {
        RAHybridLog.m85711d(TAG, "onStart() URL : " + str);
    }
}