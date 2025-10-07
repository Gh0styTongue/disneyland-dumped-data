package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.HowToVisitFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {HowToVisitFragmentSubcomponent.class})
/* loaded from: classes20.dex */
public abstract class VirtualQueueStackActivityModule_ContributeHowToVisitFragment {

    @Subcomponent
    public interface HowToVisitFragmentSubcomponent extends InterfaceC27136c<HowToVisitFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<HowToVisitFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<HowToVisitFragment> create(@BindsInstance HowToVisitFragment howToVisitFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(HowToVisitFragment howToVisitFragment);
    }

    private VirtualQueueStackActivityModule_ContributeHowToVisitFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(HowToVisitFragmentSubcomponent.Factory factory);
}