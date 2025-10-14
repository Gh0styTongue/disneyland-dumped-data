package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.fragments.StringLegalCopyFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {StringLegalCopyFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeStringLegalCopyFragment */
/* loaded from: classes23.dex */
public abstract class AbstractC8700xe9ff7fc2 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeStringLegalCopyFragment$StringLegalCopyFragmentSubcomponent */
    public interface StringLegalCopyFragmentSubcomponent extends InterfaceC27136c<StringLegalCopyFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeStringLegalCopyFragment$StringLegalCopyFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<StringLegalCopyFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<StringLegalCopyFragment> create(@BindsInstance StringLegalCopyFragment stringLegalCopyFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(StringLegalCopyFragment stringLegalCopyFragment);
    }

    private AbstractC8700xe9ff7fc2() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(StringLegalCopyFragmentSubcomponent.Factory factory);
}