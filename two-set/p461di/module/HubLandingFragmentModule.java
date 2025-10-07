package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActions;
import com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActionsImpl;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.p462ui.common.VirtualQueueSecretTapAdapter;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCard;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCardAdapter;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCardImpl;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueMainAdapter;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\tJ\b\u0010\n\u001a\u00020\u000bH\u0007J\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0012J%\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0019¨\u0006\u001a"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/di/module/HubLandingFragmentModule;", "", "()V", "providePeekViewActions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;", "proxyFactory", "Lcom/disney/wdpro/midichlorian/ProxyFactory;", "peekViewActionsImpl", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActionsImpl;", "providePeekViewActions$virtual_queue_lib_release", "provideSelectQueueCard", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCard;", "provideSelectQueueMainAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter$Factory;", "secretTapAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$Factory;", "selectQueueCardAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$Factory;", "provideSelectQueueMainAdapterFactory$virtual_queue_lib_release", "provideVirtualQueueSecretVirtualQueueSecretTapAdapterFactory", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "actions", "provideVirtualQueueSecretVirtualQueueSecretTapAdapterFactory$virtual_queue_lib_release", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module
/* loaded from: classes20.dex */
public final class HubLandingFragmentModule {
    public static final int $stable = 0;

    @Provides
    public final PeekViewActions providePeekViewActions$virtual_queue_lib_release(ProxyFactory proxyFactory, PeekViewActionsImpl peekViewActionsImpl) {
        Intrinsics.checkNotNullParameter(proxyFactory, "proxyFactory");
        Intrinsics.checkNotNullParameter(peekViewActionsImpl, "peekViewActionsImpl");
        Object objCreateProxy = proxyFactory.createProxy(peekViewActionsImpl);
        Intrinsics.checkNotNullExpressionValue(objCreateProxy, "proxyFactory.createProxy(peekViewActionsImpl)");
        return (PeekViewActions) objCreateProxy;
    }

    @Provides
    public final SelectQueueCard provideSelectQueueCard() {
        return new SelectQueueCardImpl();
    }

    @Provides
    public final SelectQueueMainAdapter.Factory provideSelectQueueMainAdapterFactory$virtual_queue_lib_release(VirtualQueueSecretTapAdapter.Factory secretTapAdapterFactory, SelectQueueCardAdapter.Factory selectQueueCardAdapterFactory) {
        Intrinsics.checkNotNullParameter(secretTapAdapterFactory, "secretTapAdapterFactory");
        Intrinsics.checkNotNullParameter(selectQueueCardAdapterFactory, "selectQueueCardAdapterFactory");
        return new SelectQueueMainAdapter.Factory(secretTapAdapterFactory, selectQueueCardAdapterFactory);
    }

    @Provides
    /* renamed from: provideVirtualQueueSecretVirtualQueueSecretTapAdapterFactory$virtual_queue_lib_release */
    public final VirtualQueueSecretTapAdapter.Factory m64836x103b78b8(VirtualQueueThemer vqThemer, VirtualQueueAnalytics virtualQueueAnalytics, PeekViewActions actions) {
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "virtualQueueAnalytics");
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new VirtualQueueSecretTapAdapter.Factory(vqThemer, virtualQueueAnalytics, actions);
    }
}