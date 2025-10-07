package com.disney.wdpro.photopass_plus.p399di;

import com.disney.wdpro.photopass_plus.fragments.PhotoPassPaywallFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {PhotoPassPaywallFragmentSubcomponent.class})
/* loaded from: classes15.dex */
public abstract class PhotoPassPlusInjectorModule_ContributePhotoPassPaywallFragment {

    @Subcomponent
    public interface PhotoPassPaywallFragmentSubcomponent extends InterfaceC27136c<PhotoPassPaywallFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<PhotoPassPaywallFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<PhotoPassPaywallFragment> create(@BindsInstance PhotoPassPaywallFragment photoPassPaywallFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(PhotoPassPaywallFragment photoPassPaywallFragment);
    }

    private PhotoPassPlusInjectorModule_ContributePhotoPassPaywallFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(PhotoPassPaywallFragmentSubcomponent.Factory factory);
}