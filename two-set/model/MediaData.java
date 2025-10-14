package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/MediaData;", "", "uri", "", "analyticsUri", OTUXParamsKeys.OT_UX_WIDTH, "", "height", "renditionType", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getAnalyticsUri", "()Ljava/lang/String;", "getHeight", "()I", "getRenditionType", "getUri", "getWidth", "component1", "component2", "component3", "component4", "component5", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MediaData {
    private final String analyticsUri;
    private final int height;
    private final String renditionType;
    private final String uri;
    private final int width;

    public MediaData(String uri, String analyticsUri, int i10, int i11, String renditionType) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(analyticsUri, "analyticsUri");
        Intrinsics.checkNotNullParameter(renditionType, "renditionType");
        this.uri = uri;
        this.analyticsUri = analyticsUri;
        this.width = i10;
        this.height = i11;
        this.renditionType = renditionType;
    }

    public static /* synthetic */ MediaData copy$default(MediaData mediaData, String str, String str2, int i10, int i11, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = mediaData.uri;
        }
        if ((i12 & 2) != 0) {
            str2 = mediaData.analyticsUri;
        }
        if ((i12 & 4) != 0) {
            i10 = mediaData.width;
        }
        if ((i12 & 8) != 0) {
            i11 = mediaData.height;
        }
        if ((i12 & 16) != 0) {
            str3 = mediaData.renditionType;
        }
        String str4 = str3;
        int i13 = i10;
        return mediaData.copy(str, str2, i13, i11, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAnalyticsUri() {
        return this.analyticsUri;
    }

    /* renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRenditionType() {
        return this.renditionType;
    }

    public final MediaData copy(String uri, String analyticsUri, int width, int height, String renditionType) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(analyticsUri, "analyticsUri");
        Intrinsics.checkNotNullParameter(renditionType, "renditionType");
        return new MediaData(uri, analyticsUri, width, height, renditionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaData)) {
            return false;
        }
        MediaData mediaData = (MediaData) other;
        return Intrinsics.areEqual(this.uri, mediaData.uri) && Intrinsics.areEqual(this.analyticsUri, mediaData.analyticsUri) && this.width == mediaData.width && this.height == mediaData.height && Intrinsics.areEqual(this.renditionType, mediaData.renditionType);
    }

    public final String getAnalyticsUri() {
        return this.analyticsUri;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getRenditionType() {
        return this.renditionType;
    }

    public final String getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((this.uri.hashCode() * 31) + this.analyticsUri.hashCode()) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + this.renditionType.hashCode();
    }

    public String toString() {
        return "MediaData(uri=" + this.uri + ", analyticsUri=" + this.analyticsUri + ", width=" + this.width + ", height=" + this.height + ", renditionType=" + this.renditionType + ")";
    }
}