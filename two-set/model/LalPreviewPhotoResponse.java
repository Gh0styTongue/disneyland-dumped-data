package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.photopasslib.p419ui.util.PhotoPassNewRelic;
import com.newrelic.agent.android.hybrid.data.HexAttribute;
import com.venuenext.vncoredata.data.storage.StorageUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018Jb\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\n\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014¨\u00060"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LalPreviewPhotoResponse;", "", "modelId", "", "zoneId", HexAttribute.HEX_ATTR_JSERROR_BUNDLEID, "", PhotoPassNewRelic.DownloadMetrics.MEDIA_ID, PhotoPassNewRelic.DownloadMetrics.GUEST_MEDIA_ID, StorageUtil.StorageKeyNames.IMAGE, "isMine", "", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBundleId", "()Ljava/lang/String;", "setBundleId", "(Ljava/lang/String;)V", "getGuestMediaId", "()Ljava/lang/Long;", "setGuestMediaId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getImage", "setImage", "()Ljava/lang/Boolean;", "setMine", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMediaId", "setMediaId", "getModelId", "setModelId", "getZoneId", "setZoneId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/disney/wdpro/photopass/services/model/LalPreviewPhotoResponse;", "equals", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LalPreviewPhotoResponse {
    private String bundleId;
    private Long guestMediaId;
    private String image;
    private Boolean isMine;
    private String mediaId;
    private Long modelId;
    private Long zoneId;

    public LalPreviewPhotoResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ LalPreviewPhotoResponse copy$default(LalPreviewPhotoResponse lalPreviewPhotoResponse, Long l10, Long l11, String str, String str2, Long l12, String str3, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = lalPreviewPhotoResponse.modelId;
        }
        if ((i10 & 2) != 0) {
            l11 = lalPreviewPhotoResponse.zoneId;
        }
        if ((i10 & 4) != 0) {
            str = lalPreviewPhotoResponse.bundleId;
        }
        if ((i10 & 8) != 0) {
            str2 = lalPreviewPhotoResponse.mediaId;
        }
        if ((i10 & 16) != 0) {
            l12 = lalPreviewPhotoResponse.guestMediaId;
        }
        if ((i10 & 32) != 0) {
            str3 = lalPreviewPhotoResponse.image;
        }
        if ((i10 & 64) != 0) {
            bool = lalPreviewPhotoResponse.isMine;
        }
        String str4 = str3;
        Boolean bool2 = bool;
        Long l13 = l12;
        String str5 = str;
        return lalPreviewPhotoResponse.copy(l10, l11, str5, str2, l13, str4, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getModelId() {
        return this.modelId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getZoneId() {
        return this.zoneId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBundleId() {
        return this.bundleId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMediaId() {
        return this.mediaId;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getGuestMediaId() {
        return this.guestMediaId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsMine() {
        return this.isMine;
    }

    public final LalPreviewPhotoResponse copy(Long modelId, Long zoneId, String bundleId, String mediaId, Long guestMediaId, String image, Boolean isMine) {
        return new LalPreviewPhotoResponse(modelId, zoneId, bundleId, mediaId, guestMediaId, image, isMine);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LalPreviewPhotoResponse)) {
            return false;
        }
        LalPreviewPhotoResponse lalPreviewPhotoResponse = (LalPreviewPhotoResponse) other;
        return Intrinsics.areEqual(this.modelId, lalPreviewPhotoResponse.modelId) && Intrinsics.areEqual(this.zoneId, lalPreviewPhotoResponse.zoneId) && Intrinsics.areEqual(this.bundleId, lalPreviewPhotoResponse.bundleId) && Intrinsics.areEqual(this.mediaId, lalPreviewPhotoResponse.mediaId) && Intrinsics.areEqual(this.guestMediaId, lalPreviewPhotoResponse.guestMediaId) && Intrinsics.areEqual(this.image, lalPreviewPhotoResponse.image) && Intrinsics.areEqual(this.isMine, lalPreviewPhotoResponse.isMine);
    }

    public final String getBundleId() {
        return this.bundleId;
    }

    public final Long getGuestMediaId() {
        return this.guestMediaId;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final Long getModelId() {
        return this.modelId;
    }

    public final Long getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        Long l10 = this.modelId;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.zoneId;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.bundleId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mediaId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.guestMediaId;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.image;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isMine;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
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

    public final void setImage(String str) {
        this.image = str;
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

    public final void setZoneId(Long l10) {
        this.zoneId = l10;
    }

    public String toString() {
        return "LalPreviewPhotoResponse(modelId=" + this.modelId + ", zoneId=" + this.zoneId + ", bundleId=" + this.bundleId + ", mediaId=" + this.mediaId + ", guestMediaId=" + this.guestMediaId + ", image=" + this.image + ", isMine=" + this.isMine + ")";
    }

    public LalPreviewPhotoResponse(Long l10, Long l11, String str, String str2, Long l12, String str3, Boolean bool) {
        this.modelId = l10;
        this.zoneId = l11;
        this.bundleId = str;
        this.mediaId = str2;
        this.guestMediaId = l12;
        this.image = str3;
        this.isMine = bool;
    }

    public /* synthetic */ LalPreviewPhotoResponse(Long l10, Long l11, String str, String str2, Long l12, String str3, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : l11, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : l12, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : bool);
    }
}