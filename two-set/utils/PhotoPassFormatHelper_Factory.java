package com.disney.wdpro.photopass.services.utils;

import com.disney.wdpro.photopass.services.configuration.PhotoPassServicesConfig;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes15.dex */
public final class PhotoPassFormatHelper_Factory implements InterfaceC30583e<PhotoPassFormatHelper> {
    private final Provider<PhotoPassServicesConfig> configProvider;

    public PhotoPassFormatHelper_Factory(Provider<PhotoPassServicesConfig> provider) {
        this.configProvider = provider;
    }

    public static PhotoPassFormatHelper_Factory create(Provider<PhotoPassServicesConfig> provider) {
        return new PhotoPassFormatHelper_Factory(provider);
    }

    public static PhotoPassFormatHelper newInstance(PhotoPassServicesConfig photoPassServicesConfig) {
        return new PhotoPassFormatHelper(photoPassServicesConfig);
    }

    @Override // javax.inject.Provider
    public PhotoPassFormatHelper get() {
        return newInstance(this.configProvider.get());
    }
}