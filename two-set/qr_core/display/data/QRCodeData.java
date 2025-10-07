package com.disney.wdpro.qr_core.display.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.disney.wdpro.facility.model.FacilityFacet;
import com.disney.wdpro.family_and_friends_ui.p127ui.activity.QRFindMatchActivity;
import com.disney.wdpro.friendsservices.business.FriendApiClientImpl;
import com.disney.wdpro.qr_core.display.rest.AgeBand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001,B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b&\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b'\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/display/data/b;", "Landroid/os/Parcelable;", "", QRFindMatchActivity.QR_CODE, "otp", "expiresInSec", "Lcom/disney/wdpro/qr_core/display/rest/AgeBand;", FriendApiClientImpl.AGE_BAND_PARAM, "name", FacilityFacet.VirtualFacets.PLAY_APP_DEEP_LINK_FACET_GROUP, "Lcom/disney/wdpro/qr_core/display/data/a;", "guestAvatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/disney/wdpro/qr_core/display/rest/AgeBand;Ljava/lang/String;Ljava/lang/String;Lcom/disney/wdpro/qr_core/display/data/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getQrCode", "g", "d", "Lcom/disney/wdpro/qr_core/display/rest/AgeBand;", "b", "()Lcom/disney/wdpro/qr_core/display/rest/AgeBand;", "f", "c", "Lcom/disney/wdpro/qr_core/display/data/a;", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "()Lcom/disney/wdpro/qr_core/display/data/a;", "Companion", "a", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.qr_core.display.data.b, reason: from toString */
/* loaded from: classes16.dex */
public final /* data */ class QRCodeData implements Parcelable {
    private final AgeBand ageBand;
    private final String deepLink;
    private final String expiresInSec;
    private final Avatar guestAvatar;
    private final String name;
    private final String otp;
    private final String qrCode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<QRCodeData> CREATOR = new b();
    private static final String QR_CODE_ID_PARAM = "id";

    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/display/data/b$a;", "", "<init>", "()V", "", "QR_CODE_ID_PARAM", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.qr_core.display.data.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m60879a() {
            return QRCodeData.QR_CODE_ID_PARAM;
        }

        private Companion() {
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.qr_core.display.data.b$b */
    public static final class b implements Parcelable.Creator<QRCodeData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final QRCodeData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QRCodeData(parcel.readString(), parcel.readString(), parcel.readString(), AgeBand.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Avatar.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final QRCodeData[] newArray(int i10) {
            return new QRCodeData[i10];
        }
    }

    public QRCodeData(String qrCode, String otp, String expiresInSec, AgeBand ageBand, String name, String deepLink, Avatar guestAvatar) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(expiresInSec, "expiresInSec");
        Intrinsics.checkNotNullParameter(ageBand, "ageBand");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(guestAvatar, "guestAvatar");
        this.qrCode = qrCode;
        this.otp = otp;
        this.expiresInSec = expiresInSec;
        this.ageBand = ageBand;
        this.name = name;
        this.deepLink = deepLink;
        this.guestAvatar = guestAvatar;
    }

    /* renamed from: b, reason: from getter */
    public final AgeBand getAgeBand() {
        return this.ageBand;
    }

    /* renamed from: c, reason: from getter */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* renamed from: d, reason: from getter */
    public final String getExpiresInSec() {
        return this.expiresInSec;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final Avatar getGuestAvatar() {
        return this.guestAvatar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QRCodeData)) {
            return false;
        }
        QRCodeData qRCodeData = (QRCodeData) other;
        return Intrinsics.areEqual(this.qrCode, qRCodeData.qrCode) && Intrinsics.areEqual(this.otp, qRCodeData.otp) && Intrinsics.areEqual(this.expiresInSec, qRCodeData.expiresInSec) && this.ageBand == qRCodeData.ageBand && Intrinsics.areEqual(this.name, qRCodeData.name) && Intrinsics.areEqual(this.deepLink, qRCodeData.deepLink) && Intrinsics.areEqual(this.guestAvatar, qRCodeData.guestAvatar);
    }

    /* renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: g, reason: from getter */
    public final String getOtp() {
        return this.otp;
    }

    public int hashCode() {
        return (((((((((((this.qrCode.hashCode() * 31) + this.otp.hashCode()) * 31) + this.expiresInSec.hashCode()) * 31) + this.ageBand.hashCode()) * 31) + this.name.hashCode()) * 31) + this.deepLink.hashCode()) * 31) + this.guestAvatar.hashCode();
    }

    public String toString() {
        return "QRCodeData(qrCode=" + this.qrCode + ", otp=" + this.otp + ", expiresInSec=" + this.expiresInSec + ", ageBand=" + this.ageBand + ", name=" + this.name + ", deepLink=" + this.deepLink + ", guestAvatar=" + this.guestAvatar + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.qrCode);
        parcel.writeString(this.otp);
        parcel.writeString(this.expiresInSec);
        parcel.writeString(this.ageBand.name());
        parcel.writeString(this.name);
        parcel.writeString(this.deepLink);
        this.guestAvatar.writeToParcel(parcel, flags);
    }
}