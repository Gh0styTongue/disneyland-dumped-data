package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.PeekViewModalFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {PeekViewModalFragmentSubcomponent.class})
/* loaded from: classes20.dex */
public abstract class VirtualQueueStackActivityModule_ContributePeekViewModalFragment {

    @Subcomponent
    public interface PeekViewModalFragmentSubcomponent extends InterfaceC27136c<PeekViewModalFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<PeekViewModalFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<PeekViewModalFragment> create(@BindsInstance PeekViewModalFragment peekViewModalFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(PeekViewModalFragment peekViewModalFragment);
    }

    private VirtualQueueStackActivityModule_ContributePeekViewModalFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(PeekViewModalFragmentSubcomponent.Factory factory);
}