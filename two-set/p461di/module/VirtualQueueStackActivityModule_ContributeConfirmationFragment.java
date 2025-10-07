package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.VirtualQueueConfirmationFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {VirtualQueueConfirmationFragmentSubcomponent.class})
/* loaded from: classes20.dex */
public abstract class VirtualQueueStackActivityModule_ContributeConfirmationFragment {

    @Subcomponent(modules = {VirtualQueueConfirmationFragmentModule.class})
    public interface VirtualQueueConfirmationFragmentSubcomponent extends InterfaceC27136c<VirtualQueueConfirmationFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<VirtualQueueConfirmationFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<VirtualQueueConfirmationFragment> create(@BindsInstance VirtualQueueConfirmationFragment virtualQueueConfirmationFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(VirtualQueueConfirmationFragment virtualQueueConfirmationFragment);
    }

    private VirtualQueueStackActivityModule_ContributeConfirmationFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(VirtualQueueConfirmationFragmentSubcomponent.Factory factory);
}