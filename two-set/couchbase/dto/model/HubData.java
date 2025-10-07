package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000e¨\u00061"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/HubData;", "", "()V", "backButtonAccessibility", "", "getBackButtonAccessibility", "()Ljava/lang/String;", "setBackButtonAccessibility", "(Ljava/lang/String;)V", "backgroundImageUrlData", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "getBackgroundImageUrlData", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "setBackgroundImageUrlData", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;)V", "bgEndColor", "getBgEndColor", "setBgEndColor", "bgStartColor", "getBgStartColor", "setBgStartColor", "description", "getDescription", "setDescription", "headerColor", "getHeaderColor", "setHeaderColor", "locatedAt", "getLocatedAt", "setLocatedAt", "mainCta", "getMainCta", "setMainCta", "noQueuesDetail", "getNoQueuesDetail", "setNoQueuesDetail", "subpark", "getSubpark", "setSubpark", "thumbIcon", "getThumbIcon", "setThumbIcon", "thumbUrl", "getThumbUrl", "setThumbUrl", "thumbUrlData", "getThumbUrlData", "setThumbUrlData", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class HubData {
    public static final String BACKGROUND_IMAGE_KEY = "backgroundImageUrl";
    public static final String KEY = "hub";
    public static final String THUMB_URL_KEY = "thumbUrl";
    private String backButtonAccessibility;
    private ImageUrlData backgroundImageUrlData;
    private String bgEndColor;
    private String bgStartColor;
    private String description;
    private String headerColor;
    private String locatedAt;
    private String mainCta;
    private String noQueuesDetail;
    private String subpark;
    private String thumbIcon;
    private String thumbUrl;
    private ImageUrlData thumbUrlData;
    public static final int $stable = 8;

    public final String getBackButtonAccessibility() {
        return this.backButtonAccessibility;
    }

    public final ImageUrlData getBackgroundImageUrlData() {
        return this.backgroundImageUrlData;
    }

    public final String getBgEndColor() {
        return this.bgEndColor;
    }

    public final String getBgStartColor() {
        return this.bgStartColor;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHeaderColor() {
        return this.headerColor;
    }

    public final String getLocatedAt() {
        return this.locatedAt;
    }

    public final String getMainCta() {
        return this.mainCta;
    }

    public final String getNoQueuesDetail() {
        return this.noQueuesDetail;
    }

    public final String getSubpark() {
        return this.subpark;
    }

    public final String getThumbIcon() {
        return this.thumbIcon;
    }

    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    public final ImageUrlData getThumbUrlData() {
        return this.thumbUrlData;
    }

    public final void setBackButtonAccessibility(String str) {
        this.backButtonAccessibility = str;
    }

    public final void setBackgroundImageUrlData(ImageUrlData imageUrlData) {
        this.backgroundImageUrlData = imageUrlData;
    }

    public final void setBgEndColor(String str) {
        this.bgEndColor = str;
    }

    public final void setBgStartColor(String str) {
        this.bgStartColor = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setHeaderColor(String str) {
        this.headerColor = str;
    }

    public final void setLocatedAt(String str) {
        this.locatedAt = str;
    }

    public final void setMainCta(String str) {
        this.mainCta = str;
    }

    public final void setNoQueuesDetail(String str) {
        this.noQueuesDetail = str;
    }

    public final void setSubpark(String str) {
        this.subpark = str;
    }

    public final void setThumbIcon(String str) {
        this.thumbIcon = str;
    }

    public final void setThumbUrl(String str) {
        this.thumbUrl = str;
    }

    public final void setThumbUrlData(ImageUrlData imageUrlData) {
        this.thumbUrlData = imageUrlData;
    }
}