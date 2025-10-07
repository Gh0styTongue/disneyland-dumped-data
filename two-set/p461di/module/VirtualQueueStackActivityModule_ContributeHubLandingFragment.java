package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.HubLandingFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {HubLandingFragmentSubcomponent.class})
/* loaded from: classes20.dex */
public abstract class VirtualQueueStackActivityModule_ContributeHubLandingFragment {

    @Subcomponent(modules = {HubLandingFragmentModule.class})
    public interface HubLandingFragmentSubcomponent extends InterfaceC27136c<HubLandingFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<HubLandingFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<HubLandingFragment> create(@BindsInstance HubLandingFragment hubLandingFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(HubLandingFragment hubLandingFragment);
    }

    private VirtualQueueStackActivityModule_ContributeHubLandingFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(HubLandingFragmentSubcomponent.Factory factory);
}