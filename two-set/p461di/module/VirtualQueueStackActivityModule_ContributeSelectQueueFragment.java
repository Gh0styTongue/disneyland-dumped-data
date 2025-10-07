package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {SelectQueueFragmentSubcomponent.class})
/* loaded from: classes20.dex */
public abstract class VirtualQueueStackActivityModule_ContributeSelectQueueFragment {

    @Subcomponent(modules = {SelectQueueFragmentModule.class})
    public interface SelectQueueFragmentSubcomponent extends InterfaceC27136c<SelectQueueFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<SelectQueueFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<SelectQueueFragment> create(@BindsInstance SelectQueueFragment selectQueueFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(SelectQueueFragment selectQueueFragment);
    }

    private VirtualQueueStackActivityModule_ContributeSelectQueueFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(SelectQueueFragmentSubcomponent.Factory factory);
}