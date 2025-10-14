package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.recommender.core.RecommenderConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003Ji\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000bHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0011\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0014R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011¨\u0006."}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/Encounter;", "", "originPark", "", "encounterName", "encounterId", "park", "resort", RecommenderConstants.EntityType.attraction, "attractionId", "encounterCount", "", "mediaList", "", "Lcom/disney/wdpro/photopass/services/model/MediaItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getAttraction", "()Ljava/lang/String;", "getAttractionId", "setAttractionId", "(Ljava/lang/String;)V", "getEncounterCount", "()I", "getEncounterId", "getEncounterName", "setEncounterName", "getMediaList", "()Ljava/util/List;", "getOriginPark", "getPark", "getResort", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Encounter {
    private final String attraction;
    private String attractionId;
    private final int encounterCount;
    private final String encounterId;
    private String encounterName;
    private final List<MediaItem> mediaList;
    private final String originPark;
    private final String park;
    private final String resort;

    public Encounter(String originPark, String encounterName, String encounterId, String park, String resort, String attraction, String attractionId, int i10, List<MediaItem> mediaList) {
        Intrinsics.checkNotNullParameter(originPark, "originPark");
        Intrinsics.checkNotNullParameter(encounterName, "encounterName");
        Intrinsics.checkNotNullParameter(encounterId, "encounterId");
        Intrinsics.checkNotNullParameter(park, "park");
        Intrinsics.checkNotNullParameter(resort, "resort");
        Intrinsics.checkNotNullParameter(attraction, "attraction");
        Intrinsics.checkNotNullParameter(attractionId, "attractionId");
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        this.originPark = originPark;
        this.encounterName = encounterName;
        this.encounterId = encounterId;
        this.park = park;
        this.resort = resort;
        this.attraction = attraction;
        this.attractionId = attractionId;
        this.encounterCount = i10;
        this.mediaList = mediaList;
    }

    public static /* synthetic */ Encounter copy$default(Encounter encounter, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = encounter.originPark;
        }
        if ((i11 & 2) != 0) {
            str2 = encounter.encounterName;
        }
        if ((i11 & 4) != 0) {
            str3 = encounter.encounterId;
        }
        if ((i11 & 8) != 0) {
            str4 = encounter.park;
        }
        if ((i11 & 16) != 0) {
            str5 = encounter.resort;
        }
        if ((i11 & 32) != 0) {
            str6 = encounter.attraction;
        }
        if ((i11 & 64) != 0) {
            str7 = encounter.attractionId;
        }
        if ((i11 & 128) != 0) {
            i10 = encounter.encounterCount;
        }
        if ((i11 & 256) != 0) {
            list = encounter.mediaList;
        }
        int i12 = i10;
        List list2 = list;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return encounter.copy(str, str2, str11, str4, str10, str8, str9, i12, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOriginPark() {
        return this.originPark;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEncounterName() {
        return this.encounterName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEncounterId() {
        return this.encounterId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPark() {
        return this.park;
    }

    /* renamed from: component5, reason: from getter */
    public final String getResort() {
        return this.resort;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAttraction() {
        return this.attraction;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAttractionId() {
        return this.attractionId;
    }

    /* renamed from: component8, reason: from getter */
    public final int getEncounterCount() {
        return this.encounterCount;
    }

    public final List<MediaItem> component9() {
        return this.mediaList;
    }

    public final Encounter copy(String originPark, String encounterName, String encounterId, String park, String resort, String attraction, String attractionId, int encounterCount, List<MediaItem> mediaList) {
        Intrinsics.checkNotNullParameter(originPark, "originPark");
        Intrinsics.checkNotNullParameter(encounterName, "encounterName");
        Intrinsics.checkNotNullParameter(encounterId, "encounterId");
        Intrinsics.checkNotNullParameter(park, "park");
        Intrinsics.checkNotNullParameter(resort, "resort");
        Intrinsics.checkNotNullParameter(attraction, "attraction");
        Intrinsics.checkNotNullParameter(attractionId, "attractionId");
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        return new Encounter(originPark, encounterName, encounterId, park, resort, attraction, attractionId, encounterCount, mediaList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Encounter)) {
            return false;
        }
        Encounter encounter = (Encounter) other;
        return Intrinsics.areEqual(this.originPark, encounter.originPark) && Intrinsics.areEqual(this.encounterName, encounter.encounterName) && Intrinsics.areEqual(this.encounterId, encounter.encounterId) && Intrinsics.areEqual(this.park, encounter.park) && Intrinsics.areEqual(this.resort, encounter.resort) && Intrinsics.areEqual(this.attraction, encounter.attraction) && Intrinsics.areEqual(this.attractionId, encounter.attractionId) && this.encounterCount == encounter.encounterCount && Intrinsics.areEqual(this.mediaList, encounter.mediaList);
    }

    public final String getAttraction() {
        return this.attraction;
    }

    public final String getAttractionId() {
        return this.attractionId;
    }

    public final int getEncounterCount() {
        return this.encounterCount;
    }

    public final String getEncounterId() {
        return this.encounterId;
    }

    public final String getEncounterName() {
        return this.encounterName;
    }

    public final List<MediaItem> getMediaList() {
        return this.mediaList;
    }

    public final String getOriginPark() {
        return this.originPark;
    }

    public final String getPark() {
        return this.park;
    }

    public final String getResort() {
        return this.resort;
    }

    public int hashCode() {
        return (((((((((((((((this.originPark.hashCode() * 31) + this.encounterName.hashCode()) * 31) + this.encounterId.hashCode()) * 31) + this.park.hashCode()) * 31) + this.resort.hashCode()) * 31) + this.attraction.hashCode()) * 31) + this.attractionId.hashCode()) * 31) + Integer.hashCode(this.encounterCount)) * 31) + this.mediaList.hashCode();
    }

    public final void setAttractionId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.attractionId = str;
    }

    public final void setEncounterName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.encounterName = str;
    }

    public String toString() {
        return "Encounter(originPark=" + this.originPark + ", encounterName=" + this.encounterName + ", encounterId=" + this.encounterId + ", park=" + this.park + ", resort=" + this.resort + ", attraction=" + this.attraction + ", attractionId=" + this.attractionId + ", encounterCount=" + this.encounterCount + ", mediaList=" + this.mediaList + ")";
    }

    public /* synthetic */ Encounter(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i11 & 128) != 0 ? 0 : i10, (i11 & 256) != 0 ? CollectionsKt.emptyList() : list);
    }
}