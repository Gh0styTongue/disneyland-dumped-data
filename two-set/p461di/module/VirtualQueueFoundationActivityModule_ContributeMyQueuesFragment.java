package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {MyQueuesFragmentSubcomponent.class})
/* loaded from: classes20.dex */
public abstract class VirtualQueueFoundationActivityModule_ContributeMyQueuesFragment {

    @Subcomponent(modules = {MyQueueFragmentModule.class})
    public interface MyQueuesFragmentSubcomponent extends InterfaceC27136c<MyQueuesFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<MyQueuesFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<MyQueuesFragment> create(@BindsInstance MyQueuesFragment myQueuesFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(MyQueuesFragment myQueuesFragment);
    }

    private VirtualQueueFoundationActivityModule_ContributeMyQueuesFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(MyQueuesFragmentSubcomponent.Factory factory);
}