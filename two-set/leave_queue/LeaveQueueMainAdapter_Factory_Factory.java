package com.disney.wdpro.virtualqueue.p462ui.leave_queue;

import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.SelectLinkedGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.leave_queue.LeaveQueueMainAdapter;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class LeaveQueueMainAdapter_Factory_Factory implements InterfaceC30583e<LeaveQueueMainAdapter.Factory> {
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final Provider<SelectLinkedGuestAdapter.Factory> selectLinkedGuestAdapterFactoryProvider;

    public LeaveQueueMainAdapter_Factory_Factory(Provider<LinkedGuestUtils> provider, Provider<SelectLinkedGuestAdapter.Factory> provider2) {
        this.linkedGuestUtilsProvider = provider;
        this.selectLinkedGuestAdapterFactoryProvider = provider2;
    }

    public static LeaveQueueMainAdapter_Factory_Factory create(Provider<LinkedGuestUtils> provider, Provider<SelectLinkedGuestAdapter.Factory> provider2) {
        return new LeaveQueueMainAdapter_Factory_Factory(provider, provider2);
    }

    public static LeaveQueueMainAdapter.Factory newInstance(LinkedGuestUtils linkedGuestUtils, SelectLinkedGuestAdapter.Factory factory) {
        return new LeaveQueueMainAdapter.Factory(linkedGuestUtils, factory);
    }

    @Override // javax.inject.Provider
    public LeaveQueueMainAdapter.Factory get() {
        return newInstance(this.linkedGuestUtilsProvider.get(), this.selectLinkedGuestAdapterFactoryProvider.get());
    }
}