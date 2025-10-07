package com.disney.wdpro.universal_checkout_ui.p459ui.p460di;

import com.disney.wdpro.universal_checkout_ui.p459ui.activities.ChaseActivity;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {ChaseActivitySubcomponent.class})
/* loaded from: classes20.dex */
public abstract class UniversalCheckoutBindingModule_ContributeChaseActivity {

    @Subcomponent
    public interface ChaseActivitySubcomponent extends InterfaceC27136c<ChaseActivity> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<ChaseActivity> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<ChaseActivity> create(@BindsInstance ChaseActivity chaseActivity);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(ChaseActivity chaseActivity);
    }

    private UniversalCheckoutBindingModule_ContributeChaseActivity() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(ChaseActivitySubcomponent.Factory factory);
}