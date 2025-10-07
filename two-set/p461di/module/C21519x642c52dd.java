package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.SelectLinkedGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.leave_queue.LeaveQueueMainAdapter;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.LeaveQueueFragmentModule_ProvideLeaveQueueMainAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21519x642c52dd implements InterfaceC30583e<LeaveQueueMainAdapter.Factory> {
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final LeaveQueueFragmentModule module;
    private final Provider<SelectLinkedGuestAdapter.Factory> selectLinkedGuestAdapterFactoryProvider;

    public C21519x642c52dd(LeaveQueueFragmentModule leaveQueueFragmentModule, Provider<LinkedGuestUtils> provider, Provider<SelectLinkedGuestAdapter.Factory> provider2) {
        this.module = leaveQueueFragmentModule;
        this.linkedGuestUtilsProvider = provider;
        this.selectLinkedGuestAdapterFactoryProvider = provider2;
    }

    public static C21519x642c52dd create(LeaveQueueFragmentModule leaveQueueFragmentModule, Provider<LinkedGuestUtils> provider, Provider<SelectLinkedGuestAdapter.Factory> provider2) {
        return new C21519x642c52dd(leaveQueueFragmentModule, provider, provider2);
    }

    public static LeaveQueueMainAdapter.Factory provideLeaveQueueMainAdapterFactory$virtual_queue_lib_release(LeaveQueueFragmentModule leaveQueueFragmentModule, LinkedGuestUtils linkedGuestUtils, SelectLinkedGuestAdapter.Factory factory) {
        return (LeaveQueueMainAdapter.Factory) C30587i.m94207e(leaveQueueFragmentModule.provideLeaveQueueMainAdapterFactory$virtual_queue_lib_release(linkedGuestUtils, factory));
    }

    @Override // javax.inject.Provider
    public LeaveQueueMainAdapter.Factory get() {
        return provideLeaveQueueMainAdapterFactory$virtual_queue_lib_release(this.module, this.linkedGuestUtilsProvider.get(), this.selectLinkedGuestAdapterFactoryProvider.get());
    }
}