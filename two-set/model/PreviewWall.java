package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.recommender.core.RecommenderConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/PreviewWall;", "", "groupId", "", "park", RecommenderConstants.EntityType.attraction, "stockImageUri", "hasVideo", "", "previewWallMedia", "", "Lcom/disney/wdpro/photopass/services/model/PreviewWallMedia;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getAttraction", "()Ljava/lang/String;", "getGroupId", "getHasVideo", "()Z", "getPark", "getPreviewWallMedia", "()Ljava/util/List;", "getStockImageUri", "component1", "component2", "component3", "component4", "component5", "component6", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PreviewWall {
    private final String attraction;
    private final String groupId;
    private final boolean hasVideo;
    private final String park;
    private final List<PreviewWallMedia> previewWallMedia;
    private final String stockImageUri;

    public PreviewWall(String groupId, String park, String attraction, String stockImageUri, boolean z10, List<PreviewWallMedia> previewWallMedia) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(park, "park");
        Intrinsics.checkNotNullParameter(attraction, "attraction");
        Intrinsics.checkNotNullParameter(stockImageUri, "stockImageUri");
        Intrinsics.checkNotNullParameter(previewWallMedia, "previewWallMedia");
        this.groupId = groupId;
        this.park = park;
        this.attraction = attraction;
        this.stockImageUri = stockImageUri;
        this.hasVideo = z10;
        this.previewWallMedia = previewWallMedia;
    }

    public static /* synthetic */ PreviewWall copy$default(PreviewWall previewWall, String str, String str2, String str3, String str4, boolean z10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = previewWall.groupId;
        }
        if ((i10 & 2) != 0) {
            str2 = previewWall.park;
        }
        if ((i10 & 4) != 0) {
            str3 = previewWall.attraction;
        }
        if ((i10 & 8) != 0) {
            str4 = previewWall.stockImageUri;
        }
        if ((i10 & 16) != 0) {
            z10 = previewWall.hasVideo;
        }
        if ((i10 & 32) != 0) {
            list = previewWall.previewWallMedia;
        }
        boolean z11 = z10;
        List list2 = list;
        return previewWall.copy(str, str2, str3, str4, z11, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPark() {
        return this.park;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAttraction() {
        return this.attraction;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStockImageUri() {
        return this.stockImageUri;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasVideo() {
        return this.hasVideo;
    }

    public final List<PreviewWallMedia> component6() {
        return this.previewWallMedia;
    }

    public final PreviewWall copy(String groupId, String park, String attraction, String stockImageUri, boolean hasVideo, List<PreviewWallMedia> previewWallMedia) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(park, "park");
        Intrinsics.checkNotNullParameter(attraction, "attraction");
        Intrinsics.checkNotNullParameter(stockImageUri, "stockImageUri");
        Intrinsics.checkNotNullParameter(previewWallMedia, "previewWallMedia");
        return new PreviewWall(groupId, park, attraction, stockImageUri, hasVideo, previewWallMedia);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewWall)) {
            return false;
        }
        PreviewWall previewWall = (PreviewWall) other;
        return Intrinsics.areEqual(this.groupId, previewWall.groupId) && Intrinsics.areEqual(this.park, previewWall.park) && Intrinsics.areEqual(this.attraction, previewWall.attraction) && Intrinsics.areEqual(this.stockImageUri, previewWall.stockImageUri) && this.hasVideo == previewWall.hasVideo && Intrinsics.areEqual(this.previewWallMedia, previewWall.previewWallMedia);
    }

    public final String getAttraction() {
        return this.attraction;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final boolean getHasVideo() {
        return this.hasVideo;
    }

    public final String getPark() {
        return this.park;
    }

    public final List<PreviewWallMedia> getPreviewWallMedia() {
        return this.previewWallMedia;
    }

    public final String getStockImageUri() {
        return this.stockImageUri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((this.groupId.hashCode() * 31) + this.park.hashCode()) * 31) + this.attraction.hashCode()) * 31) + this.stockImageUri.hashCode()) * 31;
        boolean z10 = this.hasVideo;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((iHashCode + i10) * 31) + this.previewWallMedia.hashCode();
    }

    public String toString() {
        return "PreviewWall(groupId=" + this.groupId + ", park=" + this.park + ", attraction=" + this.attraction + ", stockImageUri=" + this.stockImageUri + ", hasVideo=" + this.hasVideo + ", previewWallMedia=" + this.previewWallMedia + ")";
    }

    public /* synthetic */ PreviewWall(String str, String str2, String str3, String str4, boolean z10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? false : z10, list);
    }
}