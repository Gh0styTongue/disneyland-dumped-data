package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/VerificationFactor;", "Ljava/io/Serializable;", "type", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getValue", "setValue", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "Companion", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class VerificationFactor implements Serializable {
    public static final String TYPE_EMAIL_ADDRESS = "email-address";
    public static final String TYPE_FRIENDS_FRIENDS = "friends-friends";
    public static final String TYPE_PHONE_NUMBER = "phone-number";
    public static final String TYPE_RESORT_RESERVATION_ID = "resort-reservation-id";
    private String type;
    private String value;

    public VerificationFactor(String type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.value = str;
    }

    public static /* synthetic */ VerificationFactor copy$default(VerificationFactor verificationFactor, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = verificationFactor.type;
        }
        if ((i10 & 2) != 0) {
            str2 = verificationFactor.value;
        }
        return verificationFactor.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final VerificationFactor copy(String type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new VerificationFactor(type, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationFactor)) {
            return false;
        }
        VerificationFactor verificationFactor = (VerificationFactor) other;
        return Intrinsics.areEqual(this.type, verificationFactor.type) && Intrinsics.areEqual(this.value, verificationFactor.value);
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.value;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "VerificationFactor(type=" + this.type + ", value=" + this.value + ")";
    }

    public /* synthetic */ VerificationFactor(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}