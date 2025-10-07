package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/InvitedGuestName;", "", "title", "", "firstName", "middleName", "lastName", "suffix", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "getLastName", "setLastName", "getMiddleName", "setMiddleName", "getSuffix", "setSuffix", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class InvitedGuestName {
    private String firstName;
    private String lastName;
    private String middleName;
    private String suffix;
    private String title;

    public InvitedGuestName() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ InvitedGuestName copy$default(InvitedGuestName invitedGuestName, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = invitedGuestName.title;
        }
        if ((i10 & 2) != 0) {
            str2 = invitedGuestName.firstName;
        }
        if ((i10 & 4) != 0) {
            str3 = invitedGuestName.middleName;
        }
        if ((i10 & 8) != 0) {
            str4 = invitedGuestName.lastName;
        }
        if ((i10 & 16) != 0) {
            str5 = invitedGuestName.suffix;
        }
        String str6 = str5;
        String str7 = str3;
        return invitedGuestName.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMiddleName() {
        return this.middleName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    public final InvitedGuestName copy(String title, String firstName, String middleName, String lastName, String suffix) {
        return new InvitedGuestName(title, firstName, middleName, lastName, suffix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvitedGuestName)) {
            return false;
        }
        InvitedGuestName invitedGuestName = (InvitedGuestName) other;
        return Intrinsics.areEqual(this.title, invitedGuestName.title) && Intrinsics.areEqual(this.firstName, invitedGuestName.firstName) && Intrinsics.areEqual(this.middleName, invitedGuestName.middleName) && Intrinsics.areEqual(this.lastName, invitedGuestName.lastName) && Intrinsics.areEqual(this.suffix, invitedGuestName.suffix);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.suffix;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final void setMiddleName(String str) {
        this.middleName = str;
    }

    public final void setSuffix(String str) {
        this.suffix = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "InvitedGuestName(title=" + this.title + ", firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName=" + this.lastName + ", suffix=" + this.suffix + ")";
    }

    public InvitedGuestName(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.suffix = str5;
    }

    public /* synthetic */ InvitedGuestName(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}