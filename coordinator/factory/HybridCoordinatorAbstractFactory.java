package com.wdpr.p479ee.p480ra.rahybrid.coordinator.factory;

import android.content.Context;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.server.HybridContentServer;

/* loaded from: classes21.dex */
public class HybridCoordinatorAbstractFactory {
    public static HybridCoordinatorFactory factory(Context context, HybridWebConfig hybridWebConfig) {
        return hybridWebConfig.getBundle() == null ? new HybridRemoteCoordinatorFactory(context) : new HybridEmbeddedCoordinatorFactory(context, new HybridContentServer(context, hybridWebConfig));
    }
}