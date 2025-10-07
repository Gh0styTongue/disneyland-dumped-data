package com.wdpr.p479ee.p480ra.rahybrid.coordinator.factory;

import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.pluginStore.PluginStore;

/* loaded from: classes21.dex */
public interface HybridCoordinatorFactory {
    HybridCoordinator makeHybridCoordinator(PluginStore pluginStore, HybridWebConfig hybridWebConfig);
}