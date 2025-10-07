package com.disney.wdpro.virtualqueue.core.p461di.module;

import android.graphics.Point;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.deeplink.DeepLinkConfig;
import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActions;
import com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActionsImpl;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.QueuesPositionsAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.VirtualQueueSecretTapAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyListAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PositionAdapter;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0016\u0010\u0017JQ\u0010)\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0015H\u0001¢\u0006\u0004\b'\u0010(J'\u0010.\u001a\u00020+2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\bH\u0001¢\u0006\u0004\b,\u0010-J\u001f\u00104\u001a\u0002012\u0006\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020&H\u0001¢\u0006\u0004\b2\u00103¨\u00065"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/di/module/VirtualQueueConfirmationFragmentModule;", "", "<init>", "()V", "Lcom/disney/wdpro/midichlorian/ProxyFactory;", "proxyFactory", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActionsImpl;", "peekViewActionsImpl", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;", "providePeekViewActions$virtual_queue_lib_release", "(Lcom/disney/wdpro/midichlorian/ProxyFactory;Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActionsImpl;)Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;", "providePeekViewActions", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "linkedGuestUtils", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$Factory;", "providesPartyGuestAdapterFactory$virtual_queue_lib_release", "(Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;)Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$Factory;", "providesPartyGuestAdapterFactory", "partyGuestAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;", "providesPartyListAdapterFactory$virtual_queue_lib_release", "(Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyGuestAdapter$Factory;)Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;", "providesPartyListAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Landroid/graphics/Point;", "screenSize", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/commons/deeplink/b;", "deepLinkConfig", "partyListAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$Factory;", "providesPositionAdapterFactory$virtual_queue_lib_release", "(Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;Landroid/graphics/Point;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/commons/deeplink/b;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;)Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$Factory;", "providesPositionAdapterFactory", "actions", "Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$Factory;", "provideVirtualQueueSecretVirtualQueueSecretTapAdapterFactory$virtual_queue_lib_release", "(Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;)Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$Factory;", "provideVirtualQueueSecretVirtualQueueSecretTapAdapterFactory", "secretTapFactory", "positionAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;", "providesQueuesPositionsAdapterFactory$virtual_queue_lib_release", "(Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$Factory;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$Factory;)Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;", "providesQueuesPositionsAdapterFactory", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module
/* loaded from: classes20.dex */
public final class VirtualQueueConfirmationFragmentModule {
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
    /* renamed from: provideVirtualQueueSecretVirtualQueueSecretTapAdapterFactory$virtual_queue_lib_release */
    public final VirtualQueueSecretTapAdapter.Factory m64842x103b78b8(VirtualQueueThemer vqThemer, VirtualQueueAnalytics virtualQueueAnalytics, PeekViewActions actions) {
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "virtualQueueAnalytics");
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new VirtualQueueSecretTapAdapter.Factory(vqThemer, virtualQueueAnalytics, actions);
    }

    @Provides
    public final PartyGuestAdapter.Factory providesPartyGuestAdapterFactory$virtual_queue_lib_release(C9314j parkAppConfiguration, LinkedGuestUtils linkedGuestUtils) {
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
        return new PartyGuestAdapter.Factory(parkAppConfiguration, linkedGuestUtils);
    }

    @Provides
    public final PartyListAdapter.Factory providesPartyListAdapterFactory$virtual_queue_lib_release(PartyGuestAdapter.Factory partyGuestAdapterFactory) {
        Intrinsics.checkNotNullParameter(partyGuestAdapterFactory, "partyGuestAdapterFactory");
        return new PartyListAdapter.Factory(partyGuestAdapterFactory);
    }

    @Provides
    public final PositionAdapter.Factory providesPositionAdapterFactory$virtual_queue_lib_release(PicassoUtils picassoUtils, VirtualQueueAnalytics virtualQueueAnalytics, C9314j parkAppConfiguration, FacilityUtils facilityUtils, @Named("ScreenSize") Point screenSize, VirtualQueueThemer vqThemer, DeepLinkConfig deepLinkConfig, PartyListAdapter.Factory partyListAdapterFactory) {
        Intrinsics.checkNotNullParameter(picassoUtils, "picassoUtils");
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "virtualQueueAnalytics");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(deepLinkConfig, "deepLinkConfig");
        Intrinsics.checkNotNullParameter(partyListAdapterFactory, "partyListAdapterFactory");
        return new PositionAdapter.Factory(picassoUtils, virtualQueueAnalytics, parkAppConfiguration, facilityUtils, screenSize, vqThemer, deepLinkConfig, partyListAdapterFactory);
    }

    @Provides
    public final QueuesPositionsAdapter.Factory providesQueuesPositionsAdapterFactory$virtual_queue_lib_release(VirtualQueueSecretTapAdapter.Factory secretTapFactory, PositionAdapter.Factory positionAdapterFactory) {
        Intrinsics.checkNotNullParameter(secretTapFactory, "secretTapFactory");
        Intrinsics.checkNotNullParameter(positionAdapterFactory, "positionAdapterFactory");
        return new QueuesPositionsAdapter.Factory(secretTapFactory, positionAdapterFactory);
    }
}