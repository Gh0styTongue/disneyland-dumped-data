package com.disney.wdpro.photopass_plus.p399di;

import com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityDLR;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {PhotoPassPlusActivityDLRSubcomponent.class})
/* loaded from: classes15.dex */
public abstract class PhotoPassPlusInjectorModule_ContributePhotoPassPlusActivityDLR {

    @Subcomponent
    public interface PhotoPassPlusActivityDLRSubcomponent extends InterfaceC27136c<PhotoPassPlusActivityDLR> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<PhotoPassPlusActivityDLR> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<PhotoPassPlusActivityDLR> create(@BindsInstance PhotoPassPlusActivityDLR photoPassPlusActivityDLR);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(PhotoPassPlusActivityDLR photoPassPlusActivityDLR);
    }

    private PhotoPassPlusInjectorModule_ContributePhotoPassPlusActivityDLR() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(PhotoPassPlusActivityDLRSubcomponent.Factory factory);
}