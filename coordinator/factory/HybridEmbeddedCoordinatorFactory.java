package com.wdpr.p479ee.p480ra.rahybrid.coordinator.factory;

import android.content.Context;
import android.text.TextUtils;
import com.wdpr.p479ee.p480ra.rahybrid.WebServer;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.factory.ContentBundleFactory;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.model.Bundle;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridEmbeddedInteractor;
import com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridFragment;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.print.PrintPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.pluginStore.PluginStore;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;

/* loaded from: classes21.dex */
final class HybridEmbeddedCoordinatorFactory implements HybridCoordinatorFactory {
    private static final String TAG = "HybridEmbeddedCoordinatorFactory";
    private ContentBundleFactory contentBundleFactory;
    private Context context;
    private WebServer webServer;

    HybridEmbeddedCoordinatorFactory(Context context, WebServer webServer) {
        this.contentBundleFactory = ContentBundleFactory.getInstance(context);
        this.webServer = webServer;
        this.context = context;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.coordinator.factory.HybridCoordinatorFactory
    public HybridCoordinator makeHybridCoordinator(PluginStore pluginStore, HybridWebConfig hybridWebConfig) {
        String id2 = hybridWebConfig.getId();
        Bundle bundle = hybridWebConfig.getBundle();
        if (bundle == null) {
            RAHybridLog.m85712e(TAG, "No bundle config found for configID: " + id2);
            return null;
        }
        try {
            if (!TextUtils.isEmpty(this.contentBundleFactory.getContentBundle(id2, bundle.getWebContentSyncConfig().getLocalManifestName(), bundle).getActiveVersionPath())) {
                HybridFragment hybridFragment = new HybridFragment();
                hybridFragment.setInteractor(new HybridEmbeddedInteractor(hybridFragment, pluginStore, this.webServer));
                hybridFragment.setWebServer(this.webServer);
                ((PrintPlugin) pluginStore.getPlugin(PrintPlugin.f71779ID)).setPrintContext(this.context);
                return new HybridCoordinator(hybridFragment, pluginStore, hybridWebConfig);
            }
            RAHybridLog.m85712e(TAG, "Active version path not set for configID: " + id2);
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            RAHybridLog.m85713e(TAG, "contentBundleFactory.getContentBundle() Exception : " + e10.getMessage(), e10);
            return null;
        }
    }
}