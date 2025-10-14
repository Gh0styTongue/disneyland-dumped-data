package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.paymentsui.constants.PaymentsConstants;
import com.newrelic.agent.android.hybrid.data.HexAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/PreviewWallMedia;", "", HexAttribute.HEX_ATTR_JSERROR_BUNDLEID, "", PaymentsConstants.CONFIRM, "", "captureDate", "thumbUri", "mediumUri", "status", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBundleId", "()Ljava/lang/String;", "getCaptureDate", "getConfirm", "()Z", "getMediumUri", "getStatus", "getThumbUri", "component1", "component2", "component3", "component4", "component5", "component6", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PreviewWallMedia {
    private final String bundleId;
    private final String captureDate;
    private final boolean confirm;
    private final String mediumUri;
    private final String status;
    private final String thumbUri;

    public PreviewWallMedia(String bundleId, boolean z10, String captureDate, String thumbUri, String mediumUri, String status) {
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(captureDate, "captureDate");
        Intrinsics.checkNotNullParameter(thumbUri, "thumbUri");
        Intrinsics.checkNotNullParameter(mediumUri, "mediumUri");
        Intrinsics.checkNotNullParameter(status, "status");
        this.bundleId = bundleId;
        this.confirm = z10;
        this.captureDate = captureDate;
        this.thumbUri = thumbUri;
        this.mediumUri = mediumUri;
        this.status = status;
    }

    public static /* synthetic */ PreviewWallMedia copy$default(PreviewWallMedia previewWallMedia, String str, boolean z10, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = previewWallMedia.bundleId;
        }
        if ((i10 & 2) != 0) {
            z10 = previewWallMedia.confirm;
        }
        if ((i10 & 4) != 0) {
            str2 = previewWallMedia.captureDate;
        }
        if ((i10 & 8) != 0) {
            str3 = previewWallMedia.thumbUri;
        }
        if ((i10 & 16) != 0) {
            str4 = previewWallMedia.mediumUri;
        }
        if ((i10 & 32) != 0) {
            str5 = previewWallMedia.status;
        }
        String str6 = str4;
        String str7 = str5;
        return previewWallMedia.copy(str, z10, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBundleId() {
        return this.bundleId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getConfirm() {
        return this.confirm;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCaptureDate() {
        return this.captureDate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getThumbUri() {
        return this.thumbUri;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMediumUri() {
        return this.mediumUri;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final PreviewWallMedia copy(String bundleId, boolean confirm, String captureDate, String thumbUri, String mediumUri, String status) {
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(captureDate, "captureDate");
        Intrinsics.checkNotNullParameter(thumbUri, "thumbUri");
        Intrinsics.checkNotNullParameter(mediumUri, "mediumUri");
        Intrinsics.checkNotNullParameter(status, "status");
        return new PreviewWallMedia(bundleId, confirm, captureDate, thumbUri, mediumUri, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewWallMedia)) {
            return false;
        }
        PreviewWallMedia previewWallMedia = (PreviewWallMedia) other;
        return Intrinsics.areEqual(this.bundleId, previewWallMedia.bundleId) && this.confirm == previewWallMedia.confirm && Intrinsics.areEqual(this.captureDate, previewWallMedia.captureDate) && Intrinsics.areEqual(this.thumbUri, previewWallMedia.thumbUri) && Intrinsics.areEqual(this.mediumUri, previewWallMedia.mediumUri) && Intrinsics.areEqual(this.status, previewWallMedia.status);
    }

    public final String getBundleId() {
        return this.bundleId;
    }

    public final String getCaptureDate() {
        return this.captureDate;
    }

    public final boolean getConfirm() {
        return this.confirm;
    }

    public final String getMediumUri() {
        return this.mediumUri;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getThumbUri() {
        return this.thumbUri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.bundleId.hashCode() * 31;
        boolean z10 = this.confirm;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((((iHashCode + i10) * 31) + this.captureDate.hashCode()) * 31) + this.thumbUri.hashCode()) * 31) + this.mediumUri.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "PreviewWallMedia(bundleId=" + this.bundleId + ", confirm=" + this.confirm + ", captureDate=" + this.captureDate + ", thumbUri=" + this.thumbUri + ", mediumUri=" + this.mediumUri + ", status=" + this.status + ")";
    }

    public /* synthetic */ PreviewWallMedia(String str, boolean z10, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? false : z10, str2, str3, str4, str5);
    }
}