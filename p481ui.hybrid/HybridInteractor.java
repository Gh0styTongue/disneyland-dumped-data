package com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid;

import android.content.Context;
import android.print.PrintAttributes;
import android.print.PrintJob;
import android.print.PrintManager;
import android.webkit.WebView;
import com.wdpr.p479ee.p480ra.rahybrid.C26961R;
import com.wdpr.p479ee.p480ra.rahybrid.WebViewBridge;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.workers.WebViewBridgeWorker;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.FileChooserDelegable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.geolocation.GeoLocationPermissionPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.geolocation.GeoLocationPermissionPluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.print.PrintPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.print.PrintPluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.SSOPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecycleObservable;
import com.wdpr.p479ee.p480ra.rahybrid.pluginStore.PluginStore;
import com.wdpr.p479ee.p480ra.rahybrid.util.CookiesAndHeadersUtil;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes21.dex */
public class HybridInteractor extends HybridInteractorLogic implements SSOPlugin.SSOTokenUpdateListener, PrintPluginListener {
    public static final String TAG = "HybridInteractor";
    private HybridFragment hybridFragment;
    private PluginStore pluginStore;
    private List<PrintJob> printJobs;

    public HybridInteractor(HybridFragment hybridFragment, PluginStore pluginStore) {
        this.hybridFragment = hybridFragment;
        this.pluginStore = pluginStore;
        setNavigationInteractor(new HybridNavigationInteractor(pluginStore));
        this.printJobs = new ArrayList();
    }

    /* renamed from: a */
    public static /* synthetic */ void m85710a(HybridInteractor hybridInteractor, WebView webView, String str, PrintManager printManager) {
        hybridInteractor.getClass();
        hybridInteractor.printJobs.add(printManager.print(str, webView.createPrintDocumentAdapter(str), new PrintAttributes.Builder().build()));
    }

    private void printCurrentPage() {
        String str = TAG;
        RAHybridLog.m85711d(str, "Initiate print from WebView");
        PrintPlugin printPlugin = (PrintPlugin) this.pluginStore.getPlugin(PrintPlugin.f71779ID);
        Context printContext = printPlugin.requirePrintContext() ? printPlugin.getPrintContext() : this.hybridFragment.getContext();
        if (printContext == null) {
            RAHybridLog.m85712e(str, "printCurrentPage() no print context detected!");
            return;
        }
        final PrintManager printManager = (PrintManager) printContext.getSystemService("print");
        final String str2 = C26961R.string.app_name + " Document";
        final WebView webView = this.hybridFragment.getWebView();
        if (webView == null || printManager == null) {
            return;
        }
        webView.post(new Runnable() { // from class: com.wdpr.ee.ra.rahybrid.ui.hybrid.a
            @Override // java.lang.Runnable
            public final void run() {
                HybridInteractor.m85710a(this.f71789a, webView, str2, printManager);
            }
        });
    }

    public HybridFragment getHybridPresenter() {
        return this.hybridFragment;
    }

    public PluginStore getPluginStore() {
        return this.pluginStore;
    }

    public List<PrintJob> getPrintJobs() {
        return this.printJobs;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.print.PrintPluginListener
    public void onReceivedPrintCommand() {
        printCurrentPage();
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateFailure(SSOPlugin sSOPlugin, String str) {
        RAHybridLog.m85712e(TAG, "onTokenUpdateFailure() : " + str);
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateReady(SSOPlugin sSOPlugin, EntryPointsConfig entryPointsConfig) {
        RAHybridLog.m85711d(TAG, "onTokenUpdateReady() entryPointsConfig : " + entryPointsConfig.toString());
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateSuccess(SSOPlugin sSOPlugin, EntryPointsConfig entryPointsConfig) {
        RAHybridLog.m85711d(TAG, "onTokenUpdateSuccess() : Loading cookies, httpHeaders and Redirecting to " + entryPointsConfig.getStartUrl());
        this.hybridFragment.loadUrl(entryPointsConfig, CookiesAndHeadersUtil.gatherCookies(this.pluginStore), CookiesAndHeadersUtil.gatherHTTPHeaders(this.pluginStore));
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridInteractorLogic
    public void onViewCreated() {
        SSOPlugin sSOPlugin = (SSOPlugin) this.pluginStore.getPlugin("SSOPlugin");
        if (sSOPlugin != null) {
            sSOPlugin.addSSOTokenUpdateListener(this);
        }
        PrintPlugin printPlugin = (PrintPlugin) this.pluginStore.getPlugin(PrintPlugin.f71779ID);
        if (printPlugin != null) {
            printPlugin.setPrintPluginListener(this);
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridInteractorLogic
    public void webViewCreated(WebView webView) {
        ArrayList arrayList = new ArrayList();
        FileChooserDelegable fileChooserDelegable = null;
        GeoLocationPermissionPluginListener geoLocationPermissionPluginListener = null;
        for (Object obj : this.pluginStore.getPlugins()) {
            if (obj instanceof WebViewLifecycleObservable) {
                arrayList.add((WebViewLifecycleObservable) obj);
            }
            if (obj instanceof FileChooserDelegable) {
                fileChooserDelegable = (FileChooserDelegable) obj;
            }
            if (obj instanceof GeoLocationPermissionPlugin) {
                geoLocationPermissionPluginListener = ((GeoLocationPermissionPlugin) obj).getGeoLocationPermissionPluginListener();
            }
        }
        WebViewBridge webViewBridgeBuild = new WebViewBridge.Builder().setWebView(webView).setWebViewLifecycleObservableList(arrayList).setNavigationInteractor(this.navigationInteractor).setFileChooserDelegable(fileChooserDelegable).setGeoLocationPermissionPluginListener(geoLocationPermissionPluginListener).build();
        Collection<Plugin> plugins = this.pluginStore.getPlugins();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Plugin> it = plugins.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getId());
        }
        webViewBridgeBuild.setPluginList(arrayList2);
        WebViewBridgeWorker.inject(this.pluginStore, webViewBridgeBuild);
        this.navigationInteractor.setWebViewBridge(webViewBridgeBuild);
    }
}