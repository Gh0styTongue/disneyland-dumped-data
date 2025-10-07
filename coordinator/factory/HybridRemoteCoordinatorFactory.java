package com.wdpr.p479ee.p480ra.rahybrid.coordinator.factory;

import android.content.Context;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridFragment;
import com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridInteractor;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.print.PrintPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.pluginStore.PluginStore;

/* loaded from: classes21.dex */
final class HybridRemoteCoordinatorFactory implements HybridCoordinatorFactory {
    private Context context;

    HybridRemoteCoordinatorFactory(Context context) {
        this.context = context;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.coordinator.factory.HybridCoordinatorFactory
    public HybridCoordinator makeHybridCoordinator(PluginStore pluginStore, HybridWebConfig hybridWebConfig) {
        HybridFragment hybridFragment = new HybridFragment();
        hybridFragment.setInteractor(new HybridInteractor(hybridFragment, pluginStore));
        ((PrintPlugin) pluginStore.getPlugin(PrintPlugin.f71779ID)).setPrintContext(this.context);
        return new HybridCoordinator(hybridFragment, pluginStore, hybridWebConfig);
    }
}