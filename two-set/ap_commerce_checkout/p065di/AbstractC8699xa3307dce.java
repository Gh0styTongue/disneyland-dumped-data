package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.fragments.SalesLegalCopyBaseFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {SalesLegalCopyBaseFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeSalesLegalCopyBaseFragment */
/* loaded from: classes23.dex */
public abstract class AbstractC8699xa3307dce {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeSalesLegalCopyBaseFragment$SalesLegalCopyBaseFragmentSubcomponent */
    public interface SalesLegalCopyBaseFragmentSubcomponent extends InterfaceC27136c<SalesLegalCopyBaseFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeSalesLegalCopyBaseFragment$SalesLegalCopyBaseFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<SalesLegalCopyBaseFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<SalesLegalCopyBaseFragment> create(@BindsInstance SalesLegalCopyBaseFragment salesLegalCopyBaseFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(SalesLegalCopyBaseFragment salesLegalCopyBaseFragment);
    }

    private AbstractC8699xa3307dce() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(SalesLegalCopyBaseFragmentSubcomponent.Factory factory);
}