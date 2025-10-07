package com.disney.wdpro.photopass_plus.p399di;

import com.disney.wdpro.photopass_plus.fragments.PhotoPassTermsAndConditionsFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {PhotoPassTermsAndConditionsFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.photopass_plus.di.PhotoPassPlusInjectorModule_ContributePhotoPassTermsAndConditionsFragment */
/* loaded from: classes15.dex */
public abstract class AbstractC18792x856a0aec {

    @Subcomponent
    /* renamed from: com.disney.wdpro.photopass_plus.di.PhotoPassPlusInjectorModule_ContributePhotoPassTermsAndConditionsFragment$PhotoPassTermsAndConditionsFragmentSubcomponent */
    public interface PhotoPassTermsAndConditionsFragmentSubcomponent extends InterfaceC27136c<PhotoPassTermsAndConditionsFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.photopass_plus.di.PhotoPassPlusInjectorModule_ContributePhotoPassTermsAndConditionsFragment$PhotoPassTermsAndConditionsFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<PhotoPassTermsAndConditionsFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<PhotoPassTermsAndConditionsFragment> create(@BindsInstance PhotoPassTermsAndConditionsFragment photoPassTermsAndConditionsFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(PhotoPassTermsAndConditionsFragment photoPassTermsAndConditionsFragment);
    }

    private AbstractC18792x856a0aec() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(PhotoPassTermsAndConditionsFragmentSubcomponent.Factory factory);
}