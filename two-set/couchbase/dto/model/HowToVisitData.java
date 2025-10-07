package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000e¨\u0006)"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/HowToVisitData;", "", "()V", "bannerImageData", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "getBannerImageData", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "setBannerImageData", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;)V", "bullet1", "", "getBullet1", "()Ljava/lang/String;", "setBullet1", "(Ljava/lang/String;)V", "bullet2", "getBullet2", "setBullet2", "bullet3", "getBullet3", "setBullet3", "disclaimer", "getDisclaimer", "setDisclaimer", "header", "getHeader", "setHeader", "icons", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/HowToVisitData$HowToVisitIcons;", "getIcons", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/HowToVisitData$HowToVisitIcons;", "setIcons", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/HowToVisitData$HowToVisitIcons;)V", "mainCta", "getMainCta", "setMainCta", "title", "getTitle", "setTitle", "Companion", "HowToVisitIcons", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class HowToVisitData {
    public static final String BANNER_IMAGE_KEY = "imageUrl";
    public static final String KEY = "howToVisit";
    private ImageUrlData bannerImageData;
    private String bullet1;
    private String bullet2;
    private String bullet3;
    private String disclaimer;
    private String header;
    private HowToVisitIcons icons = new HowToVisitIcons();
    private String mainCta;
    private String title;
    public static final int $stable = 8;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/HowToVisitData$HowToVisitIcons;", "", "()V", "bullet1Icon", "", "getBullet1Icon", "()Ljava/lang/String;", "setBullet1Icon", "(Ljava/lang/String;)V", "bullet2Icon", "getBullet2Icon", "setBullet2Icon", "bullet3Icon", "getBullet3Icon", "setBullet3Icon", "imagePlaceholderIcon", "getImagePlaceholderIcon", "setImagePlaceholderIcon", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public static final class HowToVisitIcons {
        public static final int $stable = 8;
        private String bullet1Icon;
        private String bullet2Icon;
        private String bullet3Icon;
        private String imagePlaceholderIcon;

        public final String getBullet1Icon() {
            return this.bullet1Icon;
        }

        public final String getBullet2Icon() {
            return this.bullet2Icon;
        }

        public final String getBullet3Icon() {
            return this.bullet3Icon;
        }

        public final String getImagePlaceholderIcon() {
            return this.imagePlaceholderIcon;
        }

        public final void setBullet1Icon(String str) {
            this.bullet1Icon = str;
        }

        public final void setBullet2Icon(String str) {
            this.bullet2Icon = str;
        }

        public final void setBullet3Icon(String str) {
            this.bullet3Icon = str;
        }

        public final void setImagePlaceholderIcon(String str) {
            this.imagePlaceholderIcon = str;
        }
    }

    public final ImageUrlData getBannerImageData() {
        return this.bannerImageData;
    }

    public final String getBullet1() {
        return this.bullet1;
    }

    public final String getBullet2() {
        return this.bullet2;
    }

    public final String getBullet3() {
        return this.bullet3;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getHeader() {
        return this.header;
    }

    public final HowToVisitIcons getIcons() {
        return this.icons;
    }

    public final String getMainCta() {
        return this.mainCta;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBannerImageData(ImageUrlData imageUrlData) {
        this.bannerImageData = imageUrlData;
    }

    public final void setBullet1(String str) {
        this.bullet1 = str;
    }

    public final void setBullet2(String str) {
        this.bullet2 = str;
    }

    public final void setBullet3(String str) {
        this.bullet3 = str;
    }

    public final void setDisclaimer(String str) {
        this.disclaimer = str;
    }

    public final void setHeader(String str) {
        this.header = str;
    }

    public final void setIcons(HowToVisitIcons howToVisitIcons) {
        Intrinsics.checkNotNullParameter(howToVisitIcons, "<set-?>");
        this.icons = howToVisitIcons;
    }

    public final void setMainCta(String str) {
        this.mainCta = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}