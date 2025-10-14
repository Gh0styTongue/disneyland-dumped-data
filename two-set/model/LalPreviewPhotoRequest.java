package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.photopasslib.p419ui.util.PhotoPassNewRelic;
import com.newrelic.agent.android.hybrid.data.HexAttribute;
import com.venuenext.vncoredata.data.storage.StorageUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011¨\u0006&"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LalPreviewPhotoRequest;", "", "swid", "", PhotoPassNewRelic.DownloadMetrics.GUEST_MEDIA_ID, "", HexAttribute.HEX_ATTR_JSERROR_BUNDLEID, "zoneId", StorageUtil.StorageKeyNames.IMAGE, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getBundleId", "()Ljava/lang/String;", "setBundleId", "(Ljava/lang/String;)V", "getGuestMediaId", "()Ljava/lang/Long;", "setGuestMediaId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getImage", "setImage", "getSwid", "setSwid", "getZoneId", "setZoneId", "component1", "component2", "component3", "component4", "component5", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/disney/wdpro/photopass/services/model/LalPreviewPhotoRequest;", "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LalPreviewPhotoRequest {
    private String bundleId;
    private Long guestMediaId;
    private String image;
    private String swid;
    private Long zoneId;

    public LalPreviewPhotoRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ LalPreviewPhotoRequest copy$default(LalPreviewPhotoRequest lalPreviewPhotoRequest, String str, Long l10, String str2, Long l11, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lalPreviewPhotoRequest.swid;
        }
        if ((i10 & 2) != 0) {
            l10 = lalPreviewPhotoRequest.guestMediaId;
        }
        if ((i10 & 4) != 0) {
            str2 = lalPreviewPhotoRequest.bundleId;
        }
        if ((i10 & 8) != 0) {
            l11 = lalPreviewPhotoRequest.zoneId;
        }
        if ((i10 & 16) != 0) {
            str3 = lalPreviewPhotoRequest.image;
        }
        String str4 = str3;
        String str5 = str2;
        return lalPreviewPhotoRequest.copy(str, l10, str5, l11, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSwid() {
        return this.swid;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getGuestMediaId() {
        return this.guestMediaId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBundleId() {
        return this.bundleId;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getZoneId() {
        return this.zoneId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final LalPreviewPhotoRequest copy(String swid, Long guestMediaId, String bundleId, Long zoneId, String image) {
        return new LalPreviewPhotoRequest(swid, guestMediaId, bundleId, zoneId, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LalPreviewPhotoRequest)) {
            return false;
        }
        LalPreviewPhotoRequest lalPreviewPhotoRequest = (LalPreviewPhotoRequest) other;
        return Intrinsics.areEqual(this.swid, lalPreviewPhotoRequest.swid) && Intrinsics.areEqual(this.guestMediaId, lalPreviewPhotoRequest.guestMediaId) && Intrinsics.areEqual(this.bundleId, lalPreviewPhotoRequest.bundleId) && Intrinsics.areEqual(this.zoneId, lalPreviewPhotoRequest.zoneId) && Intrinsics.areEqual(this.image, lalPreviewPhotoRequest.image);
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

    public final String getSwid() {
        return this.swid;
    }

    public final Long getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        String str = this.swid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.guestMediaId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.bundleId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.zoneId;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.image;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
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

    public final void setSwid(String str) {
        this.swid = str;
    }

    public final void setZoneId(Long l10) {
        this.zoneId = l10;
    }

    public String toString() {
        return "LalPreviewPhotoRequest(swid=" + this.swid + ", guestMediaId=" + this.guestMediaId + ", bundleId=" + this.bundleId + ", zoneId=" + this.zoneId + ", image=" + this.image + ")";
    }

    public LalPreviewPhotoRequest(String str, Long l10, String str2, Long l11, String str3) {
        this.swid = str;
        this.guestMediaId = l10;
        this.bundleId = str2;
        this.zoneId = l11;
        this.image = str3;
    }

    public /* synthetic */ LalPreviewPhotoRequest(String str, Long l10, String str2, Long l11, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : l10, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : l11, (i10 & 16) != 0 ? null : str3);
    }
}