package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0004R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "", "urlMap", "", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData$ImageDensity;", "", "(Ljava/util/Map;)V", "hasUrls", "", "url", "density", "ImageDensity", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class ImageUrlData {
    public static final int $stable = 8;
    private final Map<ImageDensity, String> urlMap;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData$ImageDensity;", "", "suffix", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getSuffix", "()Ljava/lang/String;", "MDPI", "HDPI", "XHDPI", "XXHDPI", "XXXHDPI", "DEFAULT", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public enum ImageDensity {
        MDPI("-1x"),
        HDPI("-1.5x"),
        XHDPI("-2x"),
        XXHDPI("-3x"),
        XXXHDPI("-4x"),
        DEFAULT("-onesize");

        private final String suffix;

        ImageDensity(String str) {
            this.suffix = str;
        }

        public final String getSuffix() {
            return this.suffix;
        }
    }

    public ImageUrlData(Map<ImageDensity, String> urlMap) {
        Intrinsics.checkNotNullParameter(urlMap, "urlMap");
        this.urlMap = urlMap;
    }

    public final boolean hasUrls() {
        return !this.urlMap.isEmpty();
    }

    public final String url(ImageDensity density) {
        Intrinsics.checkNotNullParameter(density, "density");
        String str = this.urlMap.get(density);
        return str == null ? this.urlMap.get(ImageDensity.DEFAULT) : str;
    }
}