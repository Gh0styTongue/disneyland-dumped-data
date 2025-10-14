package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.recommender.core.RecommenderConstants;
import com.google.common.base.Optional;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003JS\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0004HÖ\u0001R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006'"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/MetadataInfo;", "", RecommenderConstants.RESORTS, "", "", "parks", "encounters", "lastCapture", "Lcom/google/common/base/Optional;", "hasOwnedMedia", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/common/base/Optional;Z)V", "getEncounters", "()Ljava/util/List;", "setEncounters", "(Ljava/util/List;)V", "getHasOwnedMedia", "()Z", "setHasOwnedMedia", "(Z)V", "getLastCapture", "()Lcom/google/common/base/Optional;", "setLastCapture", "(Lcom/google/common/base/Optional;)V", "getParks", "setParks", "getResorts", "setResorts", "component1", "component2", "component3", "component4", "component5", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MetadataInfo {
    private List<String> encounters;
    private boolean hasOwnedMedia;
    private Optional<String> lastCapture;
    private List<String> parks;
    private List<String> resorts;

    public MetadataInfo() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ MetadataInfo copy$default(MetadataInfo metadataInfo, List list, List list2, List list3, Optional optional, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = metadataInfo.resorts;
        }
        if ((i10 & 2) != 0) {
            list2 = metadataInfo.parks;
        }
        if ((i10 & 4) != 0) {
            list3 = metadataInfo.encounters;
        }
        if ((i10 & 8) != 0) {
            optional = metadataInfo.lastCapture;
        }
        if ((i10 & 16) != 0) {
            z10 = metadataInfo.hasOwnedMedia;
        }
        boolean z11 = z10;
        List list4 = list3;
        return metadataInfo.copy(list, list2, list4, optional, z11);
    }

    public final List<String> component1() {
        return this.resorts;
    }

    public final List<String> component2() {
        return this.parks;
    }

    public final List<String> component3() {
        return this.encounters;
    }

    public final Optional<String> component4() {
        return this.lastCapture;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasOwnedMedia() {
        return this.hasOwnedMedia;
    }

    public final MetadataInfo copy(List<String> resorts, List<String> parks, List<String> encounters, Optional<String> lastCapture, boolean hasOwnedMedia) {
        Intrinsics.checkNotNullParameter(resorts, "resorts");
        Intrinsics.checkNotNullParameter(parks, "parks");
        Intrinsics.checkNotNullParameter(encounters, "encounters");
        Intrinsics.checkNotNullParameter(lastCapture, "lastCapture");
        return new MetadataInfo(resorts, parks, encounters, lastCapture, hasOwnedMedia);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetadataInfo)) {
            return false;
        }
        MetadataInfo metadataInfo = (MetadataInfo) other;
        return Intrinsics.areEqual(this.resorts, metadataInfo.resorts) && Intrinsics.areEqual(this.parks, metadataInfo.parks) && Intrinsics.areEqual(this.encounters, metadataInfo.encounters) && Intrinsics.areEqual(this.lastCapture, metadataInfo.lastCapture) && this.hasOwnedMedia == metadataInfo.hasOwnedMedia;
    }

    public final List<String> getEncounters() {
        return this.encounters;
    }

    public final boolean getHasOwnedMedia() {
        return this.hasOwnedMedia;
    }

    public final Optional<String> getLastCapture() {
        return this.lastCapture;
    }

    public final List<String> getParks() {
        return this.parks;
    }

    public final List<String> getResorts() {
        return this.resorts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((this.resorts.hashCode() * 31) + this.parks.hashCode()) * 31) + this.encounters.hashCode()) * 31) + this.lastCapture.hashCode()) * 31;
        boolean z10 = this.hasOwnedMedia;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public final void setEncounters(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.encounters = list;
    }

    public final void setHasOwnedMedia(boolean z10) {
        this.hasOwnedMedia = z10;
    }

    public final void setLastCapture(Optional<String> optional) {
        Intrinsics.checkNotNullParameter(optional, "<set-?>");
        this.lastCapture = optional;
    }

    public final void setParks(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.parks = list;
    }

    public final void setResorts(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.resorts = list;
    }

    public String toString() {
        return "MetadataInfo(resorts=" + this.resorts + ", parks=" + this.parks + ", encounters=" + this.encounters + ", lastCapture=" + this.lastCapture + ", hasOwnedMedia=" + this.hasOwnedMedia + ")";
    }

    public MetadataInfo(List<String> resorts, List<String> parks, List<String> encounters, Optional<String> lastCapture, boolean z10) {
        Intrinsics.checkNotNullParameter(resorts, "resorts");
        Intrinsics.checkNotNullParameter(parks, "parks");
        Intrinsics.checkNotNullParameter(encounters, "encounters");
        Intrinsics.checkNotNullParameter(lastCapture, "lastCapture");
        this.resorts = resorts;
        this.parks = parks;
        this.encounters = encounters;
        this.lastCapture = lastCapture;
        this.hasOwnedMedia = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MetadataInfo(List list, List list2, List list3, Optional optional, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        list = (i10 & 1) != 0 ? CollectionsKt.emptyList() : list;
        list2 = (i10 & 2) != 0 ? CollectionsKt.emptyList() : list2;
        list3 = (i10 & 4) != 0 ? CollectionsKt.emptyList() : list3;
        if ((i10 & 8) != 0) {
            optional = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optional, "absent<String>()");
        }
        this(list, list2, list3, optional, (i10 & 16) != 0 ? false : z10);
    }
}