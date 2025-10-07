package com.disney.wdpro.photopass_plus.p399di;

import com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityWDW;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {PhotoPassPlusActivityWDWSubcomponent.class})
/* loaded from: classes15.dex */
public abstract class PhotoPassPlusInjectorModule_ContributePhotoPassPlusActivityWDW {

    @Subcomponent
    public interface PhotoPassPlusActivityWDWSubcomponent extends InterfaceC27136c<PhotoPassPlusActivityWDW> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<PhotoPassPlusActivityWDW> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<PhotoPassPlusActivityWDW> create(@BindsInstance PhotoPassPlusActivityWDW photoPassPlusActivityWDW);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(PhotoPassPlusActivityWDW photoPassPlusActivityWDW);
    }

    private PhotoPassPlusInjectorModule_ContributePhotoPassPlusActivityWDW() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(PhotoPassPlusActivityWDWSubcomponent.Factory factory);
}