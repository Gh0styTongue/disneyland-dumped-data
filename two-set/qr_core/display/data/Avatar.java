package com.disney.wdpro.qr_core.display.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/display/data/a;", "Landroid/os/Parcelable;", "", "id", "name", "Lcom/disney/wdpro/qr_core/display/data/a$b;", "media", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/disney/wdpro/qr_core/display/data/a$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getName", "Lcom/disney/wdpro/qr_core/display/data/a$b;", "a", "()Lcom/disney/wdpro/qr_core/display/data/a$b;", "b", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.qr_core.display.data.a, reason: from toString */
/* loaded from: classes16.dex */
public final /* data */ class Avatar implements Parcelable {
    public static final Parcelable.Creator<Avatar> CREATOR = new a();
    private final String id;
    private final Media media;
    private final String name;

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.qr_core.display.data.a$a */
    public static final class a implements Parcelable.Creator<Avatar> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Avatar createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Avatar(parcel.readString(), parcel.readString(), Media.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Avatar[] newArray(int i10) {
            return new Avatar[i10];
        }
    }

    @Metadata(m92037d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f¨\u0006#"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/display/data/a$b;", "Landroid/os/Parcelable;", "", "characterBannerMobile", "characterExtraSmall", "characterTransparent", "avatarMobileSquare", "characterCircle", "avatarPopCircle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCharacterBannerMobile", "getCharacterExtraSmall", "getCharacterTransparent", "a", "getCharacterCircle", "getAvatarPopCircle", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.qr_core.display.data.a$b, reason: from toString */
    public static final /* data */ class Media implements Parcelable {
        public static final Parcelable.Creator<Media> CREATOR = new a();
        private final String avatarMobileSquare;
        private final String avatarPopCircle;
        private final String characterBannerMobile;
        private final String characterCircle;
        private final String characterExtraSmall;
        private final String characterTransparent;

        @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
        /* renamed from: com.disney.wdpro.qr_core.display.data.a$b$a */
        public static final class a implements Parcelable.Creator<Media> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Media createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Media(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Media[] newArray(int i10) {
                return new Media[i10];
            }
        }

        public Media(String str, String str2, String str3, String str4, String str5, String str6) {
            this.characterBannerMobile = str;
            this.characterExtraSmall = str2;
            this.characterTransparent = str3;
            this.avatarMobileSquare = str4;
            this.characterCircle = str5;
            this.avatarPopCircle = str6;
        }

        /* renamed from: a, reason: from getter */
        public final String getAvatarMobileSquare() {
            return this.avatarMobileSquare;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Media)) {
                return false;
            }
            Media media = (Media) other;
            return Intrinsics.areEqual(this.characterBannerMobile, media.characterBannerMobile) && Intrinsics.areEqual(this.characterExtraSmall, media.characterExtraSmall) && Intrinsics.areEqual(this.characterTransparent, media.characterTransparent) && Intrinsics.areEqual(this.avatarMobileSquare, media.avatarMobileSquare) && Intrinsics.areEqual(this.characterCircle, media.characterCircle) && Intrinsics.areEqual(this.avatarPopCircle, media.avatarPopCircle);
        }

        public int hashCode() {
            String str = this.characterBannerMobile;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.characterExtraSmall;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.characterTransparent;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.avatarMobileSquare;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.characterCircle;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.avatarPopCircle;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Media(characterBannerMobile=" + this.characterBannerMobile + ", characterExtraSmall=" + this.characterExtraSmall + ", characterTransparent=" + this.characterTransparent + ", avatarMobileSquare=" + this.avatarMobileSquare + ", characterCircle=" + this.characterCircle + ", avatarPopCircle=" + this.avatarPopCircle + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.characterBannerMobile);
            parcel.writeString(this.characterExtraSmall);
            parcel.writeString(this.characterTransparent);
            parcel.writeString(this.avatarMobileSquare);
            parcel.writeString(this.characterCircle);
            parcel.writeString(this.avatarPopCircle);
        }
    }

    public Avatar(String id2, String name, Media media) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(media, "media");
        this.id = id2;
        this.name = name;
        this.media = media;
    }

    /* renamed from: a, reason: from getter */
    public final Media getMedia() {
        return this.media;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) other;
        return Intrinsics.areEqual(this.id, avatar.id) && Intrinsics.areEqual(this.name, avatar.name) && Intrinsics.areEqual(this.media, avatar.media);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.media.hashCode();
    }

    public String toString() {
        return "Avatar(id=" + this.id + ", name=" + this.name + ", media=" + this.media + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        this.media.writeToParcel(parcel, flags);
    }
}