package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.photopasslib.p419ui.util.PhotoPassNewRelic;
import com.newrelic.agent.android.hybrid.data.HexAttribute;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0080\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u000b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018¨\u0006<"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LalGuestLegacyDetailResponse;", "", "legacyId", "", "modelId", "", "zoneId", HexAttribute.HEX_ATTR_JSERROR_BUNDLEID, PhotoPassNewRelic.DownloadMetrics.MEDIA_ID, PhotoPassNewRelic.DownloadMetrics.GUEST_MEDIA_ID, "imageUrl", "isMine", "", "montagePhotos", "", "Lcom/disney/wdpro/photopass/services/model/LalMontagePhoto;", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getBundleId", "()Ljava/lang/String;", "setBundleId", "(Ljava/lang/String;)V", "getGuestMediaId", "()Ljava/lang/Long;", "setGuestMediaId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getImageUrl", "setImageUrl", "()Ljava/lang/Boolean;", "setMine", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLegacyId", "setLegacyId", "getMediaId", "setMediaId", "getModelId", "setModelId", "getMontagePhotos", "()Ljava/util/List;", "setMontagePhotos", "(Ljava/util/List;)V", "getZoneId", "setZoneId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lcom/disney/wdpro/photopass/services/model/LalGuestLegacyDetailResponse;", "equals", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LalGuestLegacyDetailResponse {
    private String bundleId;
    private Long guestMediaId;
    private String imageUrl;
    private Boolean isMine;
    private String legacyId;
    private String mediaId;
    private Long modelId;
    private List<LalMontagePhoto> montagePhotos;
    private Long zoneId;

    public LalGuestLegacyDetailResponse() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ LalGuestLegacyDetailResponse copy$default(LalGuestLegacyDetailResponse lalGuestLegacyDetailResponse, String str, Long l10, Long l11, String str2, String str3, Long l12, String str4, Boolean bool, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lalGuestLegacyDetailResponse.legacyId;
        }
        if ((i10 & 2) != 0) {
            l10 = lalGuestLegacyDetailResponse.modelId;
        }
        if ((i10 & 4) != 0) {
            l11 = lalGuestLegacyDetailResponse.zoneId;
        }
        if ((i10 & 8) != 0) {
            str2 = lalGuestLegacyDetailResponse.bundleId;
        }
        if ((i10 & 16) != 0) {
            str3 = lalGuestLegacyDetailResponse.mediaId;
        }
        if ((i10 & 32) != 0) {
            l12 = lalGuestLegacyDetailResponse.guestMediaId;
        }
        if ((i10 & 64) != 0) {
            str4 = lalGuestLegacyDetailResponse.imageUrl;
        }
        if ((i10 & 128) != 0) {
            bool = lalGuestLegacyDetailResponse.isMine;
        }
        if ((i10 & 256) != 0) {
            list = lalGuestLegacyDetailResponse.montagePhotos;
        }
        Boolean bool2 = bool;
        List list2 = list;
        Long l13 = l12;
        String str5 = str4;
        String str6 = str3;
        Long l14 = l11;
        return lalGuestLegacyDetailResponse.copy(str, l10, l14, str2, str6, l13, str5, bool2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLegacyId() {
        return this.legacyId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getModelId() {
        return this.modelId;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getZoneId() {
        return this.zoneId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBundleId() {
        return this.bundleId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMediaId() {
        return this.mediaId;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getGuestMediaId() {
        return this.guestMediaId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsMine() {
        return this.isMine;
    }

    public final List<LalMontagePhoto> component9() {
        return this.montagePhotos;
    }

    public final LalGuestLegacyDetailResponse copy(String legacyId, Long modelId, Long zoneId, String bundleId, String mediaId, Long guestMediaId, String imageUrl, Boolean isMine, List<LalMontagePhoto> montagePhotos) {
        return new LalGuestLegacyDetailResponse(legacyId, modelId, zoneId, bundleId, mediaId, guestMediaId, imageUrl, isMine, montagePhotos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LalGuestLegacyDetailResponse)) {
            return false;
        }
        LalGuestLegacyDetailResponse lalGuestLegacyDetailResponse = (LalGuestLegacyDetailResponse) other;
        return Intrinsics.areEqual(this.legacyId, lalGuestLegacyDetailResponse.legacyId) && Intrinsics.areEqual(this.modelId, lalGuestLegacyDetailResponse.modelId) && Intrinsics.areEqual(this.zoneId, lalGuestLegacyDetailResponse.zoneId) && Intrinsics.areEqual(this.bundleId, lalGuestLegacyDetailResponse.bundleId) && Intrinsics.areEqual(this.mediaId, lalGuestLegacyDetailResponse.mediaId) && Intrinsics.areEqual(this.guestMediaId, lalGuestLegacyDetailResponse.guestMediaId) && Intrinsics.areEqual(this.imageUrl, lalGuestLegacyDetailResponse.imageUrl) && Intrinsics.areEqual(this.isMine, lalGuestLegacyDetailResponse.isMine) && Intrinsics.areEqual(this.montagePhotos, lalGuestLegacyDetailResponse.montagePhotos);
    }

    public final String getBundleId() {
        return this.bundleId;
    }

    public final Long getGuestMediaId() {
        return this.guestMediaId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLegacyId() {
        return this.legacyId;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final Long getModelId() {
        return this.modelId;
    }

    public final List<LalMontagePhoto> getMontagePhotos() {
        return this.montagePhotos;
    }

    public final Long getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        String str = this.legacyId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.modelId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.zoneId;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.bundleId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mediaId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l12 = this.guestMediaId;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str4 = this.imageUrl;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isMine;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<LalMontagePhoto> list = this.montagePhotos;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final Boolean isMine() {
        return this.isMine;
    }

    public final void setBundleId(String str) {
        this.bundleId = str;
    }

    public final void setGuestMediaId(Long l10) {
        this.guestMediaId = l10;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setLegacyId(String str) {
        this.legacyId = str;
    }

    public final void setMediaId(String str) {
        this.mediaId = str;
    }

    public final void setMine(Boolean bool) {
        this.isMine = bool;
    }

    public final void setModelId(Long l10) {
        this.modelId = l10;
    }

    public final void setMontagePhotos(List<LalMontagePhoto> list) {
        this.montagePhotos = list;
    }

    public final void setZoneId(Long l10) {
        this.zoneId = l10;
    }

    public String toString() {
        return "LalGuestLegacyDetailResponse(legacyId=" + this.legacyId + ", modelId=" + this.modelId + ", zoneId=" + this.zoneId + ", bundleId=" + this.bundleId + ", mediaId=" + this.mediaId + ", guestMediaId=" + this.guestMediaId + ", imageUrl=" + this.imageUrl + ", isMine=" + this.isMine + ", montagePhotos=" + this.montagePhotos + ")";
    }

    public LalGuestLegacyDetailResponse(String str, Long l10, Long l11, String str2, String str3, Long l12, String str4, Boolean bool, List<LalMontagePhoto> list) {
        this.legacyId = str;
        this.modelId = l10;
        this.zoneId = l11;
        this.bundleId = str2;
        this.mediaId = str3;
        this.guestMediaId = l12;
        this.imageUrl = str4;
        this.isMine = bool;
        this.montagePhotos = list;
    }

    public /* synthetic */ LalGuestLegacyDetailResponse(String str, Long l10, Long l11, String str2, String str3, Long l12, String str4, Boolean bool, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : l10, (i10 & 4) != 0 ? null : l11, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : l12, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : bool, (i10 & 256) != 0 ? null : list);
    }
}