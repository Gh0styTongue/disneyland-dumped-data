package com.disney.wdpro.photopass_plus.p399di;

import com.disney.wdpro.photopass_plus.fragments.PhotoPassOrderConfirmationFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {PhotoPassOrderConfirmationFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.photopass_plus.di.PhotoPassPlusInjectorModule_ContributePhotoPassOrderConfirmationFragment */
/* loaded from: classes15.dex */
public abstract class AbstractC18790x14f704bf {

    @Subcomponent
    /* renamed from: com.disney.wdpro.photopass_plus.di.PhotoPassPlusInjectorModule_ContributePhotoPassOrderConfirmationFragment$PhotoPassOrderConfirmationFragmentSubcomponent */
    public interface PhotoPassOrderConfirmationFragmentSubcomponent extends InterfaceC27136c<PhotoPassOrderConfirmationFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.photopass_plus.di.PhotoPassPlusInjectorModule_ContributePhotoPassOrderConfirmationFragment$PhotoPassOrderConfirmationFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<PhotoPassOrderConfirmationFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<PhotoPassOrderConfirmationFragment> create(@BindsInstance PhotoPassOrderConfirmationFragment photoPassOrderConfirmationFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(PhotoPassOrderConfirmationFragment photoPassOrderConfirmationFragment);
    }

    private AbstractC18790x14f704bf() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(PhotoPassOrderConfirmationFragmentSubcomponent.Factory factory);
}