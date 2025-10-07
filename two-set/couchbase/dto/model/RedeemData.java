package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.disney.wdpro.recommender.services.RecommenderServiceConstants;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b'\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001c\u0010?\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001c\u0010B\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001c\u0010E\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\b¨\u0006I"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/RedeemData;", "", "()V", "anonymousPartyName", "", "getAnonymousPartyName", "()Ljava/lang/String;", "setAnonymousPartyName", "(Ljava/lang/String;)V", RecommenderServiceConstants.ANONYMOUS_PARTY_SIZE, "getAnonymousPartySize", "setAnonymousPartySize", "bgEndColor", "getBgEndColor", "setBgEndColor", "bgStartColor", "getBgStartColor", "setBgStartColor", "bgTextColor", "getBgTextColor", "setBgTextColor", "fullName", "getFullName", "setFullName", "group", "getGroup", "setGroup", "groupAllDay", "getGroupAllDay", "setGroupAllDay", "headerAccessibility", "getHeaderAccessibility", "setHeaderAccessibility", "headerImageUrlData", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "getHeaderImageUrlData", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "setHeaderImageUrlData", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;)V", "imageUrlData", "getImageUrlData", "setImageUrlData", "loading", "getLoading", "setLoading", "loadingErrorDetail", "getLoadingErrorDetail", "setLoadingErrorDetail", "loadingErrorTitle", "getLoadingErrorTitle", "setLoadingErrorTitle", "mainCta", "getMainCta", "setMainCta", "overviewAccessibility", "getOverviewAccessibility", "setOverviewAccessibility", "placeholderBgColor", "getPlaceholderBgColor", "setPlaceholderBgColor", "placeholderIconColor", "getPlaceholderIconColor", "setPlaceholderIconColor", "returnAnytime", "getReturnAnytime", "setReturnAnytime", "returnBy", "getReturnBy", "setReturnBy", "ticketIndicator", "getTicketIndicator", "setTicketIndicator", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class RedeemData {
    public static final String HEADER_IMAGE_KEY = "headerImageUrl";
    public static final String IMAGE_KEY = "imageUrl";
    public static final String KEY = "redeemV2";
    private String anonymousPartyName;
    private String anonymousPartySize;
    private String bgEndColor;
    private String bgStartColor;
    private String bgTextColor;
    private String fullName;
    private String group;
    private String groupAllDay;
    private String headerAccessibility;
    private ImageUrlData headerImageUrlData;
    private ImageUrlData imageUrlData;
    private String loading;
    private String loadingErrorDetail;
    private String loadingErrorTitle;
    private String mainCta;
    private String overviewAccessibility;
    private String placeholderBgColor;
    private String placeholderIconColor;
    private String returnAnytime;
    private String returnBy;
    private String ticketIndicator;
    public static final int $stable = 8;

    public final String getAnonymousPartyName() {
        return this.anonymousPartyName;
    }

    public final String getAnonymousPartySize() {
        return this.anonymousPartySize;
    }

    public final String getBgEndColor() {
        return this.bgEndColor;
    }

    public final String getBgStartColor() {
        return this.bgStartColor;
    }

    public final String getBgTextColor() {
        return this.bgTextColor;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getGroup() {
        return this.group;
    }

    public final String getGroupAllDay() {
        return this.groupAllDay;
    }

    public final String getHeaderAccessibility() {
        return this.headerAccessibility;
    }

    public final ImageUrlData getHeaderImageUrlData() {
        return this.headerImageUrlData;
    }

    public final ImageUrlData getImageUrlData() {
        return this.imageUrlData;
    }

    public final String getLoading() {
        return this.loading;
    }

    public final String getLoadingErrorDetail() {
        return this.loadingErrorDetail;
    }

    public final String getLoadingErrorTitle() {
        return this.loadingErrorTitle;
    }

    public final String getMainCta() {
        return this.mainCta;
    }

    public final String getOverviewAccessibility() {
        return this.overviewAccessibility;
    }

    public final String getPlaceholderBgColor() {
        return this.placeholderBgColor;
    }

    public final String getPlaceholderIconColor() {
        return this.placeholderIconColor;
    }

    public final String getReturnAnytime() {
        return this.returnAnytime;
    }

    public final String getReturnBy() {
        return this.returnBy;
    }

    public final String getTicketIndicator() {
        return this.ticketIndicator;
    }

    public final void setAnonymousPartyName(String str) {
        this.anonymousPartyName = str;
    }

    public final void setAnonymousPartySize(String str) {
        this.anonymousPartySize = str;
    }

    public final void setBgEndColor(String str) {
        this.bgEndColor = str;
    }

    public final void setBgStartColor(String str) {
        this.bgStartColor = str;
    }

    public final void setBgTextColor(String str) {
        this.bgTextColor = str;
    }

    public final void setFullName(String str) {
        this.fullName = str;
    }

    public final void setGroup(String str) {
        this.group = str;
    }

    public final void setGroupAllDay(String str) {
        this.groupAllDay = str;
    }

    public final void setHeaderAccessibility(String str) {
        this.headerAccessibility = str;
    }

    public final void setHeaderImageUrlData(ImageUrlData imageUrlData) {
        this.headerImageUrlData = imageUrlData;
    }

    public final void setImageUrlData(ImageUrlData imageUrlData) {
        this.imageUrlData = imageUrlData;
    }

    public final void setLoading(String str) {
        this.loading = str;
    }

    public final void setLoadingErrorDetail(String str) {
        this.loadingErrorDetail = str;
    }

    public final void setLoadingErrorTitle(String str) {
        this.loadingErrorTitle = str;
    }

    public final void setMainCta(String str) {
        this.mainCta = str;
    }

    public final void setOverviewAccessibility(String str) {
        this.overviewAccessibility = str;
    }

    public final void setPlaceholderBgColor(String str) {
        this.placeholderBgColor = str;
    }

    public final void setPlaceholderIconColor(String str) {
        this.placeholderIconColor = str;
    }

    public final void setReturnAnytime(String str) {
        this.returnAnytime = str;
    }

    public final void setReturnBy(String str) {
        this.returnBy = str;
    }

    public final void setTicketIndicator(String str) {
        this.ticketIndicator = str;
    }
}