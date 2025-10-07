package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b!\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001c\u0010'\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000e¨\u0006+"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/DashboardData;", "", "()V", "bannerImageUrlData", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "getBannerImageUrlData", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "setBannerImageUrlData", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;)V", "ctaAnalyticsActionName", "", "getCtaAnalyticsActionName", "()Ljava/lang/String;", "setCtaAnalyticsActionName", "(Ljava/lang/String;)V", "ctaDeeplinkURL", "getCtaDeeplinkURL", "setCtaDeeplinkURL", "details", "getDetails", "setDetails", "primaryCtaAnalyticsActionName", "getPrimaryCtaAnalyticsActionName", "setPrimaryCtaAnalyticsActionName", "primaryCtaDeeplinkURL", "getPrimaryCtaDeeplinkURL", "setPrimaryCtaDeeplinkURL", "primaryCtaTitle", "getPrimaryCtaTitle", "setPrimaryCtaTitle", "secondaryCtaAnalyticsActionName", "getSecondaryCtaAnalyticsActionName", "setSecondaryCtaAnalyticsActionName", "secondaryCtaDeeplinkURL", "getSecondaryCtaDeeplinkURL", "setSecondaryCtaDeeplinkURL", "secondaryCtaTitle", "getSecondaryCtaTitle", "setSecondaryCtaTitle", "title", "getTitle", "setTitle", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class DashboardData {
    public static final String BANNER_IMAGE_KEY = "imageUrl";
    public static final String KEY = "dashboard";
    private ImageUrlData bannerImageUrlData;
    private String ctaAnalyticsActionName;
    private String ctaDeeplinkURL;
    private String details;
    private String primaryCtaAnalyticsActionName;
    private String primaryCtaDeeplinkURL;
    private String primaryCtaTitle;
    private String secondaryCtaAnalyticsActionName;
    private String secondaryCtaDeeplinkURL;
    private String secondaryCtaTitle;
    private String title;
    public static final int $stable = 8;

    public final ImageUrlData getBannerImageUrlData() {
        return this.bannerImageUrlData;
    }

    public final String getCtaAnalyticsActionName() {
        return this.ctaAnalyticsActionName;
    }

    public final String getCtaDeeplinkURL() {
        return this.ctaDeeplinkURL;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getPrimaryCtaAnalyticsActionName() {
        return this.primaryCtaAnalyticsActionName;
    }

    public final String getPrimaryCtaDeeplinkURL() {
        return this.primaryCtaDeeplinkURL;
    }

    public final String getPrimaryCtaTitle() {
        return this.primaryCtaTitle;
    }

    public final String getSecondaryCtaAnalyticsActionName() {
        return this.secondaryCtaAnalyticsActionName;
    }

    public final String getSecondaryCtaDeeplinkURL() {
        return this.secondaryCtaDeeplinkURL;
    }

    public final String getSecondaryCtaTitle() {
        return this.secondaryCtaTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBannerImageUrlData(ImageUrlData imageUrlData) {
        this.bannerImageUrlData = imageUrlData;
    }

    public final void setCtaAnalyticsActionName(String str) {
        this.ctaAnalyticsActionName = str;
    }

    public final void setCtaDeeplinkURL(String str) {
        this.ctaDeeplinkURL = str;
    }

    public final void setDetails(String str) {
        this.details = str;
    }

    public final void setPrimaryCtaAnalyticsActionName(String str) {
        this.primaryCtaAnalyticsActionName = str;
    }

    public final void setPrimaryCtaDeeplinkURL(String str) {
        this.primaryCtaDeeplinkURL = str;
    }

    public final void setPrimaryCtaTitle(String str) {
        this.primaryCtaTitle = str;
    }

    public final void setSecondaryCtaAnalyticsActionName(String str) {
        this.secondaryCtaAnalyticsActionName = str;
    }

    public final void setSecondaryCtaDeeplinkURL(String str) {
        this.secondaryCtaDeeplinkURL = str;
    }

    public final void setSecondaryCtaTitle(String str) {
        this.secondaryCtaTitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}