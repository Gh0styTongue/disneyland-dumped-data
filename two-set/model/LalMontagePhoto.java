package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.photopasslib.p419ui.util.PhotoPassNewRelic;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJV\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000e¨\u0006*"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LalMontagePhoto;", "", "sequenceId", "", PhotoPassNewRelic.DownloadMetrics.MEDIA_ID, "", PhotoPassNewRelic.DownloadMetrics.GUEST_MEDIA_ID, "imageUrl", OTUXParamsKeys.OT_UX_WIDTH, "height", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getGuestMediaId", "()Ljava/lang/Long;", "setGuestMediaId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getHeight", "setHeight", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "getMediaId", "setMediaId", "getSequenceId", "setSequenceId", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "component5", "component6", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/disney/wdpro/photopass/services/model/LalMontagePhoto;", "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LalMontagePhoto {
    private Long guestMediaId;
    private Long height;
    private String imageUrl;
    private String mediaId;
    private Long sequenceId;
    private Long width;

    public LalMontagePhoto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ LalMontagePhoto copy$default(LalMontagePhoto lalMontagePhoto, Long l10, String str, Long l11, String str2, Long l12, Long l13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = lalMontagePhoto.sequenceId;
        }
        if ((i10 & 2) != 0) {
            str = lalMontagePhoto.mediaId;
        }
        if ((i10 & 4) != 0) {
            l11 = lalMontagePhoto.guestMediaId;
        }
        if ((i10 & 8) != 0) {
            str2 = lalMontagePhoto.imageUrl;
        }
        if ((i10 & 16) != 0) {
            l12 = lalMontagePhoto.width;
        }
        if ((i10 & 32) != 0) {
            l13 = lalMontagePhoto.height;
        }
        Long l14 = l12;
        Long l15 = l13;
        return lalMontagePhoto.copy(l10, str, l11, str2, l14, l15);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getSequenceId() {
        return this.sequenceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMediaId() {
        return this.mediaId;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getGuestMediaId() {
        return this.guestMediaId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getWidth() {
        return this.width;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getHeight() {
        return this.height;
    }

    public final LalMontagePhoto copy(Long sequenceId, String mediaId, Long guestMediaId, String imageUrl, Long width, Long height) {
        return new LalMontagePhoto(sequenceId, mediaId, guestMediaId, imageUrl, width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LalMontagePhoto)) {
            return false;
        }
        LalMontagePhoto lalMontagePhoto = (LalMontagePhoto) other;
        return Intrinsics.areEqual(this.sequenceId, lalMontagePhoto.sequenceId) && Intrinsics.areEqual(this.mediaId, lalMontagePhoto.mediaId) && Intrinsics.areEqual(this.guestMediaId, lalMontagePhoto.guestMediaId) && Intrinsics.areEqual(this.imageUrl, lalMontagePhoto.imageUrl) && Intrinsics.areEqual(this.width, lalMontagePhoto.width) && Intrinsics.areEqual(this.height, lalMontagePhoto.height);
    }

    public final Long getGuestMediaId() {
        return this.guestMediaId;
    }

    public final Long getHeight() {
        return this.height;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final Long getSequenceId() {
        return this.sequenceId;
    }

    public final Long getWidth() {
        return this.width;
    }

    public int hashCode() {
        Long l10 = this.sequenceId;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.mediaId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.guestMediaId;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.width;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.height;
        return iHashCode5 + (l13 != null ? l13.hashCode() : 0);
    }

    public final void setGuestMediaId(Long l10) {
        this.guestMediaId = l10;
    }

    public final void setHeight(Long l10) {
        this.height = l10;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setMediaId(String str) {
        this.mediaId = str;
    }

    public final void setSequenceId(Long l10) {
        this.sequenceId = l10;
    }

    public final void setWidth(Long l10) {
        this.width = l10;
    }

    public String toString() {
        return "LalMontagePhoto(sequenceId=" + this.sequenceId + ", mediaId=" + this.mediaId + ", guestMediaId=" + this.guestMediaId + ", imageUrl=" + this.imageUrl + ", width=" + this.width + ", height=" + this.height + ")";
    }

    public LalMontagePhoto(Long l10, String str, Long l11, String str2, Long l12, Long l13) {
        this.sequenceId = l10;
        this.mediaId = str;
        this.guestMediaId = l11;
        this.imageUrl = str2;
        this.width = l12;
        this.height = l13;
    }

    public /* synthetic */ LalMontagePhoto(Long l10, String str, Long l11, String str2, Long l12, Long l13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : l11, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : l12, (i10 & 32) != 0 ? null : l13);
    }
}