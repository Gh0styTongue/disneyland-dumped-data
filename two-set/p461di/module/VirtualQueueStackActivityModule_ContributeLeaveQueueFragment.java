package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.LeaveQueueFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {LeaveQueueFragmentSubcomponent.class})
/* loaded from: classes20.dex */
public abstract class VirtualQueueStackActivityModule_ContributeLeaveQueueFragment {

    @Subcomponent(modules = {LeaveQueueFragmentModule.class})
    public interface LeaveQueueFragmentSubcomponent extends InterfaceC27136c<LeaveQueueFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<LeaveQueueFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<LeaveQueueFragment> create(@BindsInstance LeaveQueueFragment leaveQueueFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(LeaveQueueFragment leaveQueueFragment);
    }

    private VirtualQueueStackActivityModule_ContributeLeaveQueueFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(LeaveQueueFragmentSubcomponent.Factory factory);
}