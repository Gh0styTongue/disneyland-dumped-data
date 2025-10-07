package com.disney.wdpro.ticketsaleshybrid.p452ui.plugins;

import android.webkit.WebView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0002\u001b\u001cB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J0\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0016J \u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016J \u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0016J(\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketSalesHybridWebViewLifecyclePlugin;", "Lcom/wdpr/ee/ra/rahybrid/plugin/webviewlifecycle/WebViewLifecyclePlugin;", "Lcom/wdpr/ee/ra/rahybrid/plugin/webviewlifecycle/WebViewLifecyclePluginListener;", "config", "Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;", "(Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketSalesHybridWebViewLifecyclePlugin$TicketSalesHybridWebViewLifecyclePluginListener;", "getId", "", "onCancel", "", "webView", "Landroid/webkit/WebView;", "i", "", "s", "onDisabled", "onError", "i1", "s1", "onFinish", "onLoading", "onReady", "onStart", "onTimeout", "setListener", "Companion", "TicketSalesHybridWebViewLifecyclePluginListener", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final class TicketSalesHybridWebViewLifecyclePlugin extends WebViewLifecyclePlugin implements WebViewLifecyclePluginListener {

    /* renamed from: Id */
    public static final String f44286Id = "TicketSalesHybridWebViewLifecyclePlugin";
    private TicketSalesHybridWebViewLifecyclePluginListener listener;
    private static final String TAG = TicketSalesHybridWebViewLifecyclePlugin.class.getSimpleName();

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketSalesHybridWebViewLifecyclePlugin$TicketSalesHybridWebViewLifecyclePluginListener;", "", "onDisabledWebView", "", "onFinishLoadingScreen", "onStartLoadingScreen", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface TicketSalesHybridWebViewLifecyclePluginListener {
        void onDisabledWebView();

        void onFinishLoadingScreen();

        void onStartLoadingScreen();
    }

    public TicketSalesHybridWebViewLifecyclePlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        setWebViewLifecyclePluginListener(this);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePlugin, com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "TicketSalesHybridWebViewLifecyclePlugin";
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onCancel(WebView webView, int i10, String s10) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(s10, "s");
        TicketSalesHybridWebViewLifecyclePluginListener ticketSalesHybridWebViewLifecyclePluginListener = this.listener;
        Intrinsics.checkNotNull(ticketSalesHybridWebViewLifecyclePluginListener);
        ticketSalesHybridWebViewLifecyclePluginListener.onFinishLoadingScreen();
        RAHybridLog.m85711d(TAG, "onCancel() Cancelled because of : " + i10 + ", URL : " + s10);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onDisabled() {
        TicketSalesHybridWebViewLifecyclePluginListener ticketSalesHybridWebViewLifecyclePluginListener = this.listener;
        Intrinsics.checkNotNull(ticketSalesHybridWebViewLifecyclePluginListener);
        ticketSalesHybridWebViewLifecyclePluginListener.onFinishLoadingScreen();
        TicketSalesHybridWebViewLifecyclePluginListener ticketSalesHybridWebViewLifecyclePluginListener2 = this.listener;
        Intrinsics.checkNotNull(ticketSalesHybridWebViewLifecyclePluginListener2);
        ticketSalesHybridWebViewLifecyclePluginListener2.onDisabledWebView();
        RAHybridLog.m85711d(TAG, "onDisabled()");
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onError(WebView webView, int i10, int i12, String s10, String s12) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(s10, "s");
        Intrinsics.checkNotNullParameter(s12, "s1");
        TicketSalesHybridWebViewLifecyclePluginListener ticketSalesHybridWebViewLifecyclePluginListener = this.listener;
        Intrinsics.checkNotNull(ticketSalesHybridWebViewLifecyclePluginListener);
        ticketSalesHybridWebViewLifecyclePluginListener.onFinishLoadingScreen();
        RAHybridLog.m85712e(TAG, "onError() Type: " + i10 + ", Error Code: " + i12 + ", Description: " + s10 + ", URL : " + s12);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onFinish(WebView webView, String s10) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(s10, "s");
        RAHybridLog.m85711d(TAG, "onFinish URL : " + s10);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onLoading(WebView webView, int i10, String s10) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(s10, "s");
        RAHybridLog.m85711d(TAG, "onLoading() progress : " + i10 + ", URL : " + s10);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onReady(WebView webView, String s10, String s12) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(s10, "s");
        Intrinsics.checkNotNullParameter(s12, "s1");
        TicketSalesHybridWebViewLifecyclePluginListener ticketSalesHybridWebViewLifecyclePluginListener = this.listener;
        Intrinsics.checkNotNull(ticketSalesHybridWebViewLifecyclePluginListener);
        ticketSalesHybridWebViewLifecyclePluginListener.onFinishLoadingScreen();
        RAHybridLog.m85711d(TAG, "onReady() JSON Response: " + s10 + ", URL : " + s12);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onStart(WebView webView, String s10) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(s10, "s");
        TicketSalesHybridWebViewLifecyclePluginListener ticketSalesHybridWebViewLifecyclePluginListener = this.listener;
        Intrinsics.checkNotNull(ticketSalesHybridWebViewLifecyclePluginListener);
        ticketSalesHybridWebViewLifecyclePluginListener.onStartLoadingScreen();
        RAHybridLog.m85711d(TAG, "onStart() URL : $url");
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onTimeout(WebView webView, int i10, String s10, String s12) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(s10, "s");
        Intrinsics.checkNotNullParameter(s12, "s1");
        TicketSalesHybridWebViewLifecyclePluginListener ticketSalesHybridWebViewLifecyclePluginListener = this.listener;
        Intrinsics.checkNotNull(ticketSalesHybridWebViewLifecyclePluginListener);
        ticketSalesHybridWebViewLifecyclePluginListener.onFinishLoadingScreen();
        RAHybridLog.m85712e(TAG, "onTimeout() time : " + i10 + ", Description : " + s10 + ", URL : " + s12);
    }

    public final void setListener(TicketSalesHybridWebViewLifecyclePluginListener listener) {
        this.listener = listener;
    }
}