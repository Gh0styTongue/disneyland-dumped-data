package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.fragments.ap_sales.ApSalesOrderSummaryFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {ApSalesOrderSummaryFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeApSalesOrderSummaryFragment */
/* loaded from: classes23.dex */
public abstract class AbstractC8696xc06a17ba {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeApSalesOrderSummaryFragment$ApSalesOrderSummaryFragmentSubcomponent */
    public interface ApSalesOrderSummaryFragmentSubcomponent extends InterfaceC27136c<ApSalesOrderSummaryFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeApSalesOrderSummaryFragment$ApSalesOrderSummaryFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<ApSalesOrderSummaryFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<ApSalesOrderSummaryFragment> create(@BindsInstance ApSalesOrderSummaryFragment apSalesOrderSummaryFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(ApSalesOrderSummaryFragment apSalesOrderSummaryFragment);
    }

    private AbstractC8696xc06a17ba() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(ApSalesOrderSummaryFragmentSubcomponent.Factory factory);
}