package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.DetailFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {DetailFragmentSubcomponent.class})
/* loaded from: classes20.dex */
public abstract class VirtualQueueFoundationActivityModule_ContributeDetailFragment {

    @Subcomponent(modules = {DetailFragmentModule.class})
    public interface DetailFragmentSubcomponent extends InterfaceC27136c<DetailFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<DetailFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<DetailFragment> create(@BindsInstance DetailFragment detailFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(DetailFragment detailFragment);
    }

    private VirtualQueueFoundationActivityModule_ContributeDetailFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(DetailFragmentSubcomponent.Factory factory);
}