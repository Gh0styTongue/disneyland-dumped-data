package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.SelectLinkedGuestAdapter;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.ReviewDetailsFragmentModule_ProvideSelectLinkedGuestAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21531x676e6ccd implements InterfaceC30583e<SelectLinkedGuestAdapter.Factory> {
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final ReviewDetailsFragmentModule module;
    private final Provider<C9314j> parkAppConfigurationProvider;

    public C21531x676e6ccd(ReviewDetailsFragmentModule reviewDetailsFragmentModule, Provider<C9314j> provider, Provider<LinkedGuestUtils> provider2) {
        this.module = reviewDetailsFragmentModule;
        this.parkAppConfigurationProvider = provider;
        this.linkedGuestUtilsProvider = provider2;
    }

    public static C21531x676e6ccd create(ReviewDetailsFragmentModule reviewDetailsFragmentModule, Provider<C9314j> provider, Provider<LinkedGuestUtils> provider2) {
        return new C21531x676e6ccd(reviewDetailsFragmentModule, provider, provider2);
    }

    public static SelectLinkedGuestAdapter.Factory provideSelectLinkedGuestAdapterFactory$virtual_queue_lib_release(ReviewDetailsFragmentModule reviewDetailsFragmentModule, C9314j c9314j, LinkedGuestUtils linkedGuestUtils) {
        return (SelectLinkedGuestAdapter.Factory) C30587i.m94207e(reviewDetailsFragmentModule.provideSelectLinkedGuestAdapterFactory$virtual_queue_lib_release(c9314j, linkedGuestUtils));
    }

    @Override // javax.inject.Provider
    public SelectLinkedGuestAdapter.Factory get() {
        return provideSelectLinkedGuestAdapterFactory$virtual_queue_lib_release(this.module, this.parkAppConfigurationProvider.get(), this.linkedGuestUtilsProvider.get());
    }
}