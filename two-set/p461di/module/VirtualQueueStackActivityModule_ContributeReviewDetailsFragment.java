package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {ReviewDetailsFragmentSubcomponent.class})
/* loaded from: classes20.dex */
public abstract class VirtualQueueStackActivityModule_ContributeReviewDetailsFragment {

    @Subcomponent(modules = {ReviewDetailsFragmentModule.class})
    public interface ReviewDetailsFragmentSubcomponent extends InterfaceC27136c<ReviewDetailsFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<ReviewDetailsFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<ReviewDetailsFragment> create(@BindsInstance ReviewDetailsFragment reviewDetailsFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(ReviewDetailsFragment reviewDetailsFragment);
    }

    private VirtualQueueStackActivityModule_ContributeReviewDetailsFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(ReviewDetailsFragmentSubcomponent.Factory factory);
}