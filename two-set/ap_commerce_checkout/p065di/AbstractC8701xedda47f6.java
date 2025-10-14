package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.fragments.ViewAndSignAgreementFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {ViewAndSignAgreementFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeViewAndSignAgreementFragment */
/* loaded from: classes23.dex */
public abstract class AbstractC8701xedda47f6 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeViewAndSignAgreementFragment$ViewAndSignAgreementFragmentSubcomponent */
    public interface ViewAndSignAgreementFragmentSubcomponent extends InterfaceC27136c<ViewAndSignAgreementFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeViewAndSignAgreementFragment$ViewAndSignAgreementFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<ViewAndSignAgreementFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<ViewAndSignAgreementFragment> create(@BindsInstance ViewAndSignAgreementFragment viewAndSignAgreementFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(ViewAndSignAgreementFragment viewAndSignAgreementFragment);
    }

    private AbstractC8701xedda47f6() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(ViewAndSignAgreementFragmentSubcomponent.Factory factory);
}