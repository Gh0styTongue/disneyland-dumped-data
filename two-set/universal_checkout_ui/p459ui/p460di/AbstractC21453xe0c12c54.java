package com.disney.wdpro.universal_checkout_ui.p459ui.p460di;

import com.disney.wdpro.universal_checkout_ui.p459ui.activities.UniversalCheckoutActivity;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {UniversalCheckoutActivitySubcomponent.class})
/* renamed from: com.disney.wdpro.universal_checkout_ui.ui.di.UniversalCheckoutBindingModule_ContributeUniversalCheckoutActivity */
/* loaded from: classes20.dex */
public abstract class AbstractC21453xe0c12c54 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.universal_checkout_ui.ui.di.UniversalCheckoutBindingModule_ContributeUniversalCheckoutActivity$UniversalCheckoutActivitySubcomponent */
    public interface UniversalCheckoutActivitySubcomponent extends InterfaceC27136c<UniversalCheckoutActivity> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.universal_checkout_ui.ui.di.UniversalCheckoutBindingModule_ContributeUniversalCheckoutActivity$UniversalCheckoutActivitySubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<UniversalCheckoutActivity> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<UniversalCheckoutActivity> create(@BindsInstance UniversalCheckoutActivity universalCheckoutActivity);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(UniversalCheckoutActivity universalCheckoutActivity);
    }

    private AbstractC21453xe0c12c54() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(UniversalCheckoutActivitySubcomponent.Factory factory);
}