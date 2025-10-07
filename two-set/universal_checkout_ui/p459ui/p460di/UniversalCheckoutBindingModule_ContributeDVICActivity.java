package com.disney.wdpro.universal_checkout_ui.p459ui.p460di;

import com.disney.wdpro.universal_checkout_ui.p459ui.activities.DVICActivity;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {DVICActivitySubcomponent.class})
/* loaded from: classes20.dex */
public abstract class UniversalCheckoutBindingModule_ContributeDVICActivity {

    @Subcomponent
    public interface DVICActivitySubcomponent extends InterfaceC27136c<DVICActivity> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<DVICActivity> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<DVICActivity> create(@BindsInstance DVICActivity dVICActivity);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(DVICActivity dVICActivity);
    }

    private UniversalCheckoutBindingModule_ContributeDVICActivity() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(DVICActivitySubcomponent.Factory factory);
}