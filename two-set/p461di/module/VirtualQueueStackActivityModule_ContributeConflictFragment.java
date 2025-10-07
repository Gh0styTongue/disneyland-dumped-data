package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.ConflictFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {ConflictFragmentSubcomponent.class})
/* loaded from: classes20.dex */
public abstract class VirtualQueueStackActivityModule_ContributeConflictFragment {

    @Subcomponent(modules = {ConflictFragmentModule.class})
    public interface ConflictFragmentSubcomponent extends InterfaceC27136c<ConflictFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<ConflictFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<ConflictFragment> create(@BindsInstance ConflictFragment conflictFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(ConflictFragment conflictFragment);
    }

    private VirtualQueueStackActivityModule_ContributeConflictFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(ConflictFragmentSubcomponent.Factory factory);
}