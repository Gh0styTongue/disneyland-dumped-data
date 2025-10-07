package com.disney.wdpro.virtualqueue.core;

import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.core.VirtualQueueDestinationProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProviderImpl;", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProvider;", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "<init>", "(Lcom/disney/wdpro/commons/j;)V", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProvider$VQDestination;", "getDestination", "()Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProvider$VQDestination;", "Lcom/disney/wdpro/commons/j;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class VirtualQueueDestinationProviderImpl implements VirtualQueueDestinationProvider {
    public static final int $stable = 8;
    private final C9314j parkAppConfiguration;

    @Inject
    public VirtualQueueDestinationProviderImpl(C9314j parkAppConfiguration) {
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        this.parkAppConfiguration = parkAppConfiguration;
    }

    @Override // com.disney.wdpro.virtualqueue.core.VirtualQueueDestinationProvider
    public VirtualQueueDestinationProvider.VQDestination getDestination() {
        String strM38908h = this.parkAppConfiguration.m38908h();
        return Intrinsics.areEqual(strM38908h, "WDW") ? VirtualQueueDestinationProvider.VQDestination.WDW : Intrinsics.areEqual(strM38908h, "DLR") ? VirtualQueueDestinationProvider.VQDestination.DLR : VirtualQueueDestinationProvider.VQDestination.DLR;
    }
}