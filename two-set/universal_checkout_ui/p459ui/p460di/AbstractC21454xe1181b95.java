package com.disney.wdpro.universal_checkout_ui.p459ui.p460di;

import com.disney.wdpro.universal_checkout_ui.p459ui.fragments.UniversalCheckoutFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {UniversalCheckoutFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.universal_checkout_ui.ui.di.UniversalCheckoutBindingModule_ContributeUniversalCheckoutFragment */
/* loaded from: classes20.dex */
public abstract class AbstractC21454xe1181b95 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.universal_checkout_ui.ui.di.UniversalCheckoutBindingModule_ContributeUniversalCheckoutFragment$UniversalCheckoutFragmentSubcomponent */
    public interface UniversalCheckoutFragmentSubcomponent extends InterfaceC27136c<UniversalCheckoutFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.universal_checkout_ui.ui.di.UniversalCheckoutBindingModule_ContributeUniversalCheckoutFragment$UniversalCheckoutFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<UniversalCheckoutFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<UniversalCheckoutFragment> create(@BindsInstance UniversalCheckoutFragment universalCheckoutFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(UniversalCheckoutFragment universalCheckoutFragment);
    }

    private AbstractC21454xe1181b95() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(UniversalCheckoutFragmentSubcomponent.Factory factory);
}