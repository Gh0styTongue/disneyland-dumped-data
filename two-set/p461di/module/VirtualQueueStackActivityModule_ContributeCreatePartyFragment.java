package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {CreatePartyFragmentSubcomponent.class})
/* loaded from: classes20.dex */
public abstract class VirtualQueueStackActivityModule_ContributeCreatePartyFragment {

    @Subcomponent(modules = {CreatePartyFragmentModule.class})
    public interface CreatePartyFragmentSubcomponent extends InterfaceC27136c<CreatePartyFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<CreatePartyFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<CreatePartyFragment> create(@BindsInstance CreatePartyFragment createPartyFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(CreatePartyFragment createPartyFragment);
    }

    private VirtualQueueStackActivityModule_ContributeCreatePartyFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(CreatePartyFragmentSubcomponent.Factory factory);
}