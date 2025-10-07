package com.disney.wdpro.photopass_plus.p399di;

import com.disney.wdpro.photopass_plus.fragments.PhotoPassDownFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {PhotoPassDownFragmentSubcomponent.class})
/* loaded from: classes15.dex */
public abstract class PhotoPassPlusInjectorModule_ContributePhotoPassDownFragment {

    @Subcomponent
    public interface PhotoPassDownFragmentSubcomponent extends InterfaceC27136c<PhotoPassDownFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<PhotoPassDownFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<PhotoPassDownFragment> create(@BindsInstance PhotoPassDownFragment photoPassDownFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(PhotoPassDownFragment photoPassDownFragment);
    }

    private PhotoPassPlusInjectorModule_ContributePhotoPassDownFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(PhotoPassDownFragmentSubcomponent.Factory factory);
}