package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.p462ui.common.IneligibleGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.ReviewDetailsFragmentModule_ProvideIneligibleGuestAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21530x4e0d2114 implements InterfaceC30583e<IneligibleGuestAdapter.Factory> {
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final ReviewDetailsFragmentModule module;

    public C21530x4e0d2114(ReviewDetailsFragmentModule reviewDetailsFragmentModule, Provider<LinkedGuestUtils> provider) {
        this.module = reviewDetailsFragmentModule;
        this.linkedGuestUtilsProvider = provider;
    }

    public static C21530x4e0d2114 create(ReviewDetailsFragmentModule reviewDetailsFragmentModule, Provider<LinkedGuestUtils> provider) {
        return new C21530x4e0d2114(reviewDetailsFragmentModule, provider);
    }

    public static IneligibleGuestAdapter.Factory provideIneligibleGuestAdapterFactory$virtual_queue_lib_release(ReviewDetailsFragmentModule reviewDetailsFragmentModule, LinkedGuestUtils linkedGuestUtils) {
        return (IneligibleGuestAdapter.Factory) C30587i.m94207e(reviewDetailsFragmentModule.provideIneligibleGuestAdapterFactory$virtual_queue_lib_release(linkedGuestUtils));
    }

    @Override // javax.inject.Provider
    public IneligibleGuestAdapter.Factory get() {
        return provideIneligibleGuestAdapterFactory$virtual_queue_lib_release(this.module, this.linkedGuestUtilsProvider.get());
    }
}