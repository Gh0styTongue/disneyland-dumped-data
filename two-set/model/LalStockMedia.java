package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.photopasslib.p419ui.util.PhotoPassNewRelic;
import com.disney.wdpro.recommender.core.RecommenderConstants;
import com.newrelic.agent.android.hybrid.data.HexAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LalStockMedia;", "", PhotoPassNewRelic.DownloadMetrics.MEDIA_ID, "", HexAttribute.HEX_ATTR_JSERROR_BUNDLEID, PhotoPassNewRelic.DownloadMetrics.GUEST_MEDIA_ID, "", "park", RecommenderConstants.EntityType.attraction, "captureDate", "thumb", "medium", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAttraction", "()Ljava/lang/String;", "getBundleId", "getCaptureDate", "getGuestMediaId", "()J", "getMediaId", "getMedium", "getPark", "getThumb", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LalStockMedia {
    private final String attraction;
    private final String bundleId;
    private final String captureDate;
    private final long guestMediaId;
    private final String mediaId;
    private final String medium;
    private final String park;
    private final String thumb;

    public LalStockMedia(String mediaId, String bundleId, long j10, String park, String attraction, String captureDate, String thumb, String medium) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(park, "park");
        Intrinsics.checkNotNullParameter(attraction, "attraction");
        Intrinsics.checkNotNullParameter(captureDate, "captureDate");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        Intrinsics.checkNotNullParameter(medium, "medium");
        this.mediaId = mediaId;
        this.bundleId = bundleId;
        this.guestMediaId = j10;
        this.park = park;
        this.attraction = attraction;
        this.captureDate = captureDate;
        this.thumb = thumb;
        this.medium = medium;
    }

    public static /* synthetic */ LalStockMedia copy$default(LalStockMedia lalStockMedia, String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lalStockMedia.mediaId;
        }
        if ((i10 & 2) != 0) {
            str2 = lalStockMedia.bundleId;
        }
        if ((i10 & 4) != 0) {
            j10 = lalStockMedia.guestMediaId;
        }
        if ((i10 & 8) != 0) {
            str3 = lalStockMedia.park;
        }
        if ((i10 & 16) != 0) {
            str4 = lalStockMedia.attraction;
        }
        if ((i10 & 32) != 0) {
            str5 = lalStockMedia.captureDate;
        }
        if ((i10 & 64) != 0) {
            str6 = lalStockMedia.thumb;
        }
        if ((i10 & 128) != 0) {
            str7 = lalStockMedia.medium;
        }
        String str8 = str7;
        String str9 = str5;
        String str10 = str3;
        long j11 = j10;
        return lalStockMedia.copy(str, str2, j11, str10, str4, str9, str6, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMediaId() {
        return this.mediaId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBundleId() {
        return this.bundleId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getGuestMediaId() {
        return this.guestMediaId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPark() {
        return this.park;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAttraction() {
        return this.attraction;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCaptureDate() {
        return this.captureDate;
    }

    /* renamed from: component7, reason: from getter */
    public final String getThumb() {
        return this.thumb;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMedium() {
        return this.medium;
    }

    public final LalStockMedia copy(String mediaId, String bundleId, long guestMediaId, String park, String attraction, String captureDate, String thumb, String medium) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(park, "park");
        Intrinsics.checkNotNullParameter(attraction, "attraction");
        Intrinsics.checkNotNullParameter(captureDate, "captureDate");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        Intrinsics.checkNotNullParameter(medium, "medium");
        return new LalStockMedia(mediaId, bundleId, guestMediaId, park, attraction, captureDate, thumb, medium);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LalStockMedia)) {
            return false;
        }
        LalStockMedia lalStockMedia = (LalStockMedia) other;
        return Intrinsics.areEqual(this.mediaId, lalStockMedia.mediaId) && Intrinsics.areEqual(this.bundleId, lalStockMedia.bundleId) && this.guestMediaId == lalStockMedia.guestMediaId && Intrinsics.areEqual(this.park, lalStockMedia.park) && Intrinsics.areEqual(this.attraction, lalStockMedia.attraction) && Intrinsics.areEqual(this.captureDate, lalStockMedia.captureDate) && Intrinsics.areEqual(this.thumb, lalStockMedia.thumb) && Intrinsics.areEqual(this.medium, lalStockMedia.medium);
    }

    public final String getAttraction() {
        return this.attraction;
    }

    public final String getBundleId() {
        return this.bundleId;
    }

    public final String getCaptureDate() {
        return this.captureDate;
    }

    public final long getGuestMediaId() {
        return this.guestMediaId;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final String getMedium() {
        return this.medium;
    }

    public final String getPark() {
        return this.park;
    }

    public final String getThumb() {
        return this.thumb;
    }

    public int hashCode() {
        return (((((((((((((this.mediaId.hashCode() * 31) + this.bundleId.hashCode()) * 31) + Long.hashCode(this.guestMediaId)) * 31) + this.park.hashCode()) * 31) + this.attraction.hashCode()) * 31) + this.captureDate.hashCode()) * 31) + this.thumb.hashCode()) * 31) + this.medium.hashCode();
    }

    public String toString() {
        return "LalStockMedia(mediaId=" + this.mediaId + ", bundleId=" + this.bundleId + ", guestMediaId=" + this.guestMediaId + ", park=" + this.park + ", attraction=" + this.attraction + ", captureDate=" + this.captureDate + ", thumb=" + this.thumb + ", medium=" + this.medium + ")";
    }
}