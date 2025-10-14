package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.photopasslib.p419ui.util.PhotoPassNewRelic;
import com.newrelic.agent.android.hybrid.data.HexAttribute;
import com.venuenext.vncoredata.data.storage.StorageUtil;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011¨\u00066"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LalCreateLegacyRequest;", "Ljava/io/Serializable;", "swid", "", "modelId", "", PhotoPassNewRelic.DownloadMetrics.GUEST_MEDIA_ID, HexAttribute.HEX_ATTR_JSERROR_BUNDLEID, "zoneId", "zoneName", "guestConsent", "", StorageUtil.StorageKeyNames.IMAGE, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getBundleId", "()Ljava/lang/String;", "setBundleId", "(Ljava/lang/String;)V", "getGuestConsent", "()Ljava/lang/Boolean;", "setGuestConsent", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getGuestMediaId", "()Ljava/lang/Long;", "setGuestMediaId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getImage", "setImage", "getModelId", "setModelId", "getSwid", "setSwid", "getZoneId", "setZoneId", "getZoneName", "setZoneName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/disney/wdpro/photopass/services/model/LalCreateLegacyRequest;", "equals", "other", "", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LalCreateLegacyRequest implements Serializable {
    private String bundleId;
    private Boolean guestConsent;
    private Long guestMediaId;
    private String image;
    private Long modelId;
    private String swid;
    private Long zoneId;
    private String zoneName;

    public LalCreateLegacyRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ LalCreateLegacyRequest copy$default(LalCreateLegacyRequest lalCreateLegacyRequest, String str, Long l10, Long l11, String str2, Long l12, String str3, Boolean bool, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lalCreateLegacyRequest.swid;
        }
        if ((i10 & 2) != 0) {
            l10 = lalCreateLegacyRequest.modelId;
        }
        if ((i10 & 4) != 0) {
            l11 = lalCreateLegacyRequest.guestMediaId;
        }
        if ((i10 & 8) != 0) {
            str2 = lalCreateLegacyRequest.bundleId;
        }
        if ((i10 & 16) != 0) {
            l12 = lalCreateLegacyRequest.zoneId;
        }
        if ((i10 & 32) != 0) {
            str3 = lalCreateLegacyRequest.zoneName;
        }
        if ((i10 & 64) != 0) {
            bool = lalCreateLegacyRequest.guestConsent;
        }
        if ((i10 & 128) != 0) {
            str4 = lalCreateLegacyRequest.image;
        }
        Boolean bool2 = bool;
        String str5 = str4;
        Long l13 = l12;
        String str6 = str3;
        return lalCreateLegacyRequest.copy(str, l10, l11, str2, l13, str6, bool2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSwid() {
        return this.swid;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getModelId() {
        return this.modelId;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getGuestMediaId() {
        return this.guestMediaId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBundleId() {
        return this.bundleId;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getZoneId() {
        return this.zoneId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getZoneName() {
        return this.zoneName;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getGuestConsent() {
        return this.guestConsent;
    }

    /* renamed from: component8, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final LalCreateLegacyRequest copy(String swid, Long modelId, Long guestMediaId, String bundleId, Long zoneId, String zoneName, Boolean guestConsent, String image) {
        return new LalCreateLegacyRequest(swid, modelId, guestMediaId, bundleId, zoneId, zoneName, guestConsent, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LalCreateLegacyRequest)) {
            return false;
        }
        LalCreateLegacyRequest lalCreateLegacyRequest = (LalCreateLegacyRequest) other;
        return Intrinsics.areEqual(this.swid, lalCreateLegacyRequest.swid) && Intrinsics.areEqual(this.modelId, lalCreateLegacyRequest.modelId) && Intrinsics.areEqual(this.guestMediaId, lalCreateLegacyRequest.guestMediaId) && Intrinsics.areEqual(this.bundleId, lalCreateLegacyRequest.bundleId) && Intrinsics.areEqual(this.zoneId, lalCreateLegacyRequest.zoneId) && Intrinsics.areEqual(this.zoneName, lalCreateLegacyRequest.zoneName) && Intrinsics.areEqual(this.guestConsent, lalCreateLegacyRequest.guestConsent) && Intrinsics.areEqual(this.image, lalCreateLegacyRequest.image);
    }

    public final String getBundleId() {
        return this.bundleId;
    }

    public final Boolean getGuestConsent() {
        return this.guestConsent;
    }

    public final Long getGuestMediaId() {
        return this.guestMediaId;
    }

    public final String getImage() {
        return this.image;
    }

    public final Long getModelId() {
        return this.modelId;
    }

    public final String getSwid() {
        return this.swid;
    }

    public final Long getZoneId() {
        return this.zoneId;
    }

    public final String getZoneName() {
        return this.zoneName;
    }

    public int hashCode() {
        String str = this.swid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.modelId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.guestMediaId;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.bundleId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.zoneId;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.zoneName;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.guestConsent;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.image;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBundleId(String str) {
        this.bundleId = str;
    }

    public final void setGuestConsent(Boolean bool) {
        this.guestConsent = bool;
    }

    public final void setGuestMediaId(Long l10) {
        this.guestMediaId = l10;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setModelId(Long l10) {
        this.modelId = l10;
    }

    public final void setSwid(String str) {
        this.swid = str;
    }

    public final void setZoneId(Long l10) {
        this.zoneId = l10;
    }

    public final void setZoneName(String str) {
        this.zoneName = str;
    }

    public String toString() {
        return "LalCreateLegacyRequest(swid=" + this.swid + ", modelId=" + this.modelId + ", guestMediaId=" + this.guestMediaId + ", bundleId=" + this.bundleId + ", zoneId=" + this.zoneId + ", zoneName=" + this.zoneName + ", guestConsent=" + this.guestConsent + ", image=" + this.image + ")";
    }

    public LalCreateLegacyRequest(String str, Long l10, Long l11, String str2, Long l12, String str3, Boolean bool, String str4) {
        this.swid = str;
        this.modelId = l10;
        this.guestMediaId = l11;
        this.bundleId = str2;
        this.zoneId = l12;
        this.zoneName = str3;
        this.guestConsent = bool;
        this.image = str4;
    }

    public /* synthetic */ LalCreateLegacyRequest(String str, Long l10, Long l11, String str2, Long l12, String str3, Boolean bool, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : l10, (i10 & 4) != 0 ? null : l11, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : l12, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : str4);
    }
}