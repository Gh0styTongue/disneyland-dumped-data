package com.disney.wdpro.photopass_plus.p399di;

import com.disney.wdpro.photopass_plus.fragments.PhotoPassOrderSummaryFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {PhotoPassOrderSummaryFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.photopass_plus.di.PhotoPassPlusInjectorModule_ContributePhotoPassOrderSummaryFragment */
/* loaded from: classes15.dex */
public abstract class AbstractC18791x877d28bc {

    @Subcomponent
    /* renamed from: com.disney.wdpro.photopass_plus.di.PhotoPassPlusInjectorModule_ContributePhotoPassOrderSummaryFragment$PhotoPassOrderSummaryFragmentSubcomponent */
    public interface PhotoPassOrderSummaryFragmentSubcomponent extends InterfaceC27136c<PhotoPassOrderSummaryFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.photopass_plus.di.PhotoPassPlusInjectorModule_ContributePhotoPassOrderSummaryFragment$PhotoPassOrderSummaryFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<PhotoPassOrderSummaryFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<PhotoPassOrderSummaryFragment> create(@BindsInstance PhotoPassOrderSummaryFragment photoPassOrderSummaryFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(PhotoPassOrderSummaryFragment photoPassOrderSummaryFragment);
    }

    private AbstractC18791x877d28bc() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(PhotoPassOrderSummaryFragmentSubcomponent.Factory factory);
}