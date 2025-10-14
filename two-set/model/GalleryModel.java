package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/GalleryModel;", "", "encounters", "", "Lcom/disney/wdpro/photopass/services/model/Encounter;", "metadataInfo", "Lcom/disney/wdpro/photopass/services/model/MetadataInfo;", "bannerType", "Lcom/disney/wdpro/photopass/services/model/PhotopassGalleryBannerType;", "(Ljava/util/List;Lcom/disney/wdpro/photopass/services/model/MetadataInfo;Lcom/disney/wdpro/photopass/services/model/PhotopassGalleryBannerType;)V", "getBannerType", "()Lcom/disney/wdpro/photopass/services/model/PhotopassGalleryBannerType;", "getEncounters", "()Ljava/util/List;", "getMetadataInfo", "()Lcom/disney/wdpro/photopass/services/model/MetadataInfo;", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GalleryModel {
    private final PhotopassGalleryBannerType bannerType;
    private final List<Encounter> encounters;
    private final MetadataInfo metadataInfo;

    public GalleryModel(List<Encounter> encounters, MetadataInfo metadataInfo, PhotopassGalleryBannerType photopassGalleryBannerType) {
        Intrinsics.checkNotNullParameter(encounters, "encounters");
        this.encounters = encounters;
        this.metadataInfo = metadataInfo;
        this.bannerType = photopassGalleryBannerType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GalleryModel copy$default(GalleryModel galleryModel, List list, MetadataInfo metadataInfo, PhotopassGalleryBannerType photopassGalleryBannerType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = galleryModel.encounters;
        }
        if ((i10 & 2) != 0) {
            metadataInfo = galleryModel.metadataInfo;
        }
        if ((i10 & 4) != 0) {
            photopassGalleryBannerType = galleryModel.bannerType;
        }
        return galleryModel.copy(list, metadataInfo, photopassGalleryBannerType);
    }

    public final List<Encounter> component1() {
        return this.encounters;
    }

    /* renamed from: component2, reason: from getter */
    public final MetadataInfo getMetadataInfo() {
        return this.metadataInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final PhotopassGalleryBannerType getBannerType() {
        return this.bannerType;
    }

    public final GalleryModel copy(List<Encounter> encounters, MetadataInfo metadataInfo, PhotopassGalleryBannerType bannerType) {
        Intrinsics.checkNotNullParameter(encounters, "encounters");
        return new GalleryModel(encounters, metadataInfo, bannerType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryModel)) {
            return false;
        }
        GalleryModel galleryModel = (GalleryModel) other;
        return Intrinsics.areEqual(this.encounters, galleryModel.encounters) && Intrinsics.areEqual(this.metadataInfo, galleryModel.metadataInfo) && this.bannerType == galleryModel.bannerType;
    }

    public final PhotopassGalleryBannerType getBannerType() {
        return this.bannerType;
    }

    public final List<Encounter> getEncounters() {
        return this.encounters;
    }

    public final MetadataInfo getMetadataInfo() {
        return this.metadataInfo;
    }

    public int hashCode() {
        int iHashCode = this.encounters.hashCode() * 31;
        MetadataInfo metadataInfo = this.metadataInfo;
        int iHashCode2 = (iHashCode + (metadataInfo == null ? 0 : metadataInfo.hashCode())) * 31;
        PhotopassGalleryBannerType photopassGalleryBannerType = this.bannerType;
        return iHashCode2 + (photopassGalleryBannerType != null ? photopassGalleryBannerType.hashCode() : 0);
    }

    public String toString() {
        return "GalleryModel(encounters=" + this.encounters + ", metadataInfo=" + this.metadataInfo + ", bannerType=" + this.bannerType + ")";
    }
}