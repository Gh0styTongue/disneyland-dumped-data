package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.google.common.base.Optional;

/* loaded from: classes18.dex */
public class HeroImageResponse {
    private Optional<String> xxxhdpi = Optional.absent();
    private Optional<String> xxhdpi = Optional.absent();
    private Optional<String> xhdpi = Optional.absent();
    private Optional<String> hdpi = Optional.absent();
    private Optional<String> mdpi = Optional.absent();

    public Optional<String> getHdpi() {
        return this.hdpi;
    }

    public Optional<String> getMdpi() {
        return this.mdpi;
    }

    public Optional<String> getXhdpi() {
        return this.xhdpi;
    }

    public Optional<String> getXxhdpi() {
        return this.xxhdpi;
    }

    public Optional<String> getXxxhdpi() {
        return this.xxxhdpi;
    }
}