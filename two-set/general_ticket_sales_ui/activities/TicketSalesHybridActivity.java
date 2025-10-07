package com.disney.wdpro.general_ticket_sales_ui.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractC3694e0;
import androidx.fragment.app.Fragment;
import com.disney.wdpro.commons.BaseActivity;
import com.disney.wdpro.commons.utils.C9384u;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.disney.wdpro.general_ticket_sales_ui.p131di.GeneralTicketSalesUiComponentProvider;
import com.disney.wdpro.general_ticket_sales_ui.p132ui.utils.HybridUtilities;
import com.disney.wdpro.general_ticket_sales_ui.plugins.AvailCalendarNavigationPlugin;
import com.disney.wdpro.support.util.C20952u;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.hybridFactory.HybridFactory;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridFragment;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.cookie.CookiePlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes28.dex */
public class TicketSalesHybridActivity extends BaseActivity implements WebAnalyticsPluginListener, WebViewLifecyclePluginListener, AvailCalendarNavigationPlugin.AvailCalendarNavigationPluginListener {
    public static final String BUNDLE_ENTRY_POINT_KEY = "entryPoint";
    private static final String BUNDLE_URL = "url";
    private HybridWebConfig config;
    private HybridCoordinator coordinator;
    private String entryPoint;
    private LinearLayout loader;
    private List<Class<? extends Plugin>> pluginClasses;
    private String url;

    public static Intent createIntent(Activity activity, String str, String str2) {
        Intent intent = new Intent(activity, (Class<?>) TicketSalesHybridActivity.class);
        intent.putExtra("entryPoint", str);
        intent.putExtra("url", str2);
        return intent;
    }

    private void hideLoader() {
        this.loader.setVisibility(8);
    }

    private void setPluginListeners(HybridCoordinator hybridCoordinator) {
        hybridCoordinator.getWebAnalyticsPlugin().setWebAnalyticsPluginListener(this);
        hybridCoordinator.getWebViewLifecyclePlugin().setWebViewLifecyclePluginListener(new C20952u(this, "", this));
        ((AvailCalendarNavigationPlugin) hybridCoordinator.getPlugin("AvailCalendarNavigationPlugin")).setListener(this);
    }

    private void showLoader() {
        this.loader.setVisibility(0);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(C11971R.anim.slide_in_from_left, C11971R.anim.slide_out_to_right);
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.plugins.AvailCalendarNavigationPlugin.AvailCalendarNavigationPluginListener
    public void navigateBack() {
        finish();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onCancel(WebView webView, int i10, String str) {
        hideLoader();
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        ((GeneralTicketSalesUiComponentProvider) getApplication()).getGeneralTicketSalesUiComponent().inject(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.entryPoint = extras.getString("entryPoint");
            this.url = extras.getString("url");
        }
        super.onCreate(bundle);
        setContentView(C11971R.layout.activity_ticket_sales_hybrid);
        this.loader = (LinearLayout) findViewById(C11971R.id.loader);
        this.config = HybridUtilities.createHybridWebConfig(this.entryPoint, this.url);
        ArrayList arrayList = new ArrayList();
        this.pluginClasses = arrayList;
        arrayList.add(WebAnalyticsPlugin.class);
        this.pluginClasses.add(CookiePlugin.class);
        this.pluginClasses.add(AvailCalendarNavigationPlugin.class);
        HybridCoordinator hybridCoordinatorMakeCoordinator = HybridFactory.makeCoordinator(this, this.config, this.pluginClasses, (List<HttpCookie>) null);
        this.coordinator = hybridCoordinatorMakeCoordinator;
        setPluginListeners(hybridCoordinatorMakeCoordinator);
        this.navigator.m37387v(this.coordinator.getHybridFragment()).m37332j(C11971R.id.hybridfragment).m37330h().navigate();
        getSupportFragmentManager().m19767t1(new AbstractC3694e0.m() { // from class: com.disney.wdpro.general_ticket_sales_ui.activities.TicketSalesHybridActivity.1
            @Override // androidx.fragment.app.AbstractC3694e0.m
            public void onFragmentViewCreated(AbstractC3694e0 abstractC3694e0, Fragment fragment, View view, Bundle bundle2) {
                super.onFragmentViewCreated(abstractC3694e0, fragment, view, bundle2);
                if (fragment instanceof HybridFragment) {
                    TicketSalesHybridActivity.this.coordinator.load(TicketSalesHybridActivity.this.entryPoint, Collections.EMPTY_MAP);
                }
            }
        }, false);
        if (C9384u.INSTANCE.m39212a()) {
            return;
        }
        this.coordinator.load(this.entryPoint, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (C9384u.INSTANCE.m39212a()) {
            HybridUtilities.clearCookies(CookieManager.getInstance());
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onDisabled() {
        hideLoader();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onError(WebView webView, int i10, int i11, String str, String str2) {
        hideLoader();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onFinish(WebView webView, String str) {
        hideLoader();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onLoading(WebView webView, int i10, String str) {
        showLoader();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onReady(WebView webView, String str, String str2) {
        hideLoader();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedTrackActionData(WebAnalyticsPlugin webAnalyticsPlugin, String str, Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            entry.setValue(String.valueOf(entry.getValue()));
        }
        this.analyticsHelper.mo37405b(str, (HashMap) map);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedTrackStateData(WebAnalyticsPlugin webAnalyticsPlugin, String str, Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            entry.setValue(String.valueOf(entry.getValue()));
        }
        this.analyticsHelper.mo37406c(str, getClass().getSimpleName(), (HashMap) map);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onStart(WebView webView, String str) {
        showLoader();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onTimeout(WebView webView, int i10, String str, String str2) {
        hideLoader();
    }
}