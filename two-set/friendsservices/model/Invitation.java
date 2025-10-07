package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.friendsservices.utils.Constants;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tHÆ\u0003Ju\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"¨\u00064"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/Invitation;", "", "invitationType", "", "guestIdType", "guestIdValue", "accessClassification", "groupClassification", "shareClassification", "", "managedGuest", "Lcom/disney/wdpro/friendsservices/model/InvitedManagedGuest;", "verificationFactors", "Lcom/disney/wdpro/friendsservices/model/VerificationFactor;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/disney/wdpro/friendsservices/model/InvitedManagedGuest;Ljava/util/List;)V", "getAccessClassification", "()Ljava/lang/String;", "setAccessClassification", "(Ljava/lang/String;)V", "getGroupClassification", "setGroupClassification", "getGuestIdType", "setGuestIdType", "getGuestIdValue", "setGuestIdValue", "getInvitationType", "setInvitationType", "getManagedGuest", "()Lcom/disney/wdpro/friendsservices/model/InvitedManagedGuest;", "setManagedGuest", "(Lcom/disney/wdpro/friendsservices/model/InvitedManagedGuest;)V", "getShareClassification", "()Ljava/util/List;", "setShareClassification", "(Ljava/util/List;)V", "getVerificationFactors", "setVerificationFactors", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class Invitation {

    @SerializedName("access-classification")
    private String accessClassification;

    @SerializedName("group-classification")
    private String groupClassification;

    @SerializedName("guest-id-type")
    private String guestIdType;

    @SerializedName("guest-id-value")
    private String guestIdValue;

    @SerializedName("invitation-type")
    private String invitationType;

    @SerializedName(Constants.MANAGED_GUEST)
    private InvitedManagedGuest managedGuest;

    @SerializedName("share-classification")
    private List<String> shareClassification;
    private List<VerificationFactor> verificationFactors;

    public Invitation() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ Invitation copy$default(Invitation invitation, String str, String str2, String str3, String str4, String str5, List list, InvitedManagedGuest invitedManagedGuest, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = invitation.invitationType;
        }
        if ((i10 & 2) != 0) {
            str2 = invitation.guestIdType;
        }
        if ((i10 & 4) != 0) {
            str3 = invitation.guestIdValue;
        }
        if ((i10 & 8) != 0) {
            str4 = invitation.accessClassification;
        }
        if ((i10 & 16) != 0) {
            str5 = invitation.groupClassification;
        }
        if ((i10 & 32) != 0) {
            list = invitation.shareClassification;
        }
        if ((i10 & 64) != 0) {
            invitedManagedGuest = invitation.managedGuest;
        }
        if ((i10 & 128) != 0) {
            list2 = invitation.verificationFactors;
        }
        InvitedManagedGuest invitedManagedGuest2 = invitedManagedGuest;
        List list3 = list2;
        String str6 = str5;
        List list4 = list;
        return invitation.copy(str, str2, str3, str4, str6, list4, invitedManagedGuest2, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInvitationType() {
        return this.invitationType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGuestIdType() {
        return this.guestIdType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGuestIdValue() {
        return this.guestIdValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccessClassification() {
        return this.accessClassification;
    }

    /* renamed from: component5, reason: from getter */
    public final String getGroupClassification() {
        return this.groupClassification;
    }

    public final List<String> component6() {
        return this.shareClassification;
    }

    /* renamed from: component7, reason: from getter */
    public final InvitedManagedGuest getManagedGuest() {
        return this.managedGuest;
    }

    public final List<VerificationFactor> component8() {
        return this.verificationFactors;
    }

    public final Invitation copy(String invitationType, String guestIdType, String guestIdValue, String accessClassification, String groupClassification, List<String> shareClassification, InvitedManagedGuest managedGuest, List<VerificationFactor> verificationFactors) {
        return new Invitation(invitationType, guestIdType, guestIdValue, accessClassification, groupClassification, shareClassification, managedGuest, verificationFactors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Invitation)) {
            return false;
        }
        Invitation invitation = (Invitation) other;
        return Intrinsics.areEqual(this.invitationType, invitation.invitationType) && Intrinsics.areEqual(this.guestIdType, invitation.guestIdType) && Intrinsics.areEqual(this.guestIdValue, invitation.guestIdValue) && Intrinsics.areEqual(this.accessClassification, invitation.accessClassification) && Intrinsics.areEqual(this.groupClassification, invitation.groupClassification) && Intrinsics.areEqual(this.shareClassification, invitation.shareClassification) && Intrinsics.areEqual(this.managedGuest, invitation.managedGuest) && Intrinsics.areEqual(this.verificationFactors, invitation.verificationFactors);
    }

    public final String getAccessClassification() {
        return this.accessClassification;
    }

    public final String getGroupClassification() {
        return this.groupClassification;
    }

    public final String getGuestIdType() {
        return this.guestIdType;
    }

    public final String getGuestIdValue() {
        return this.guestIdValue;
    }

    public final String getInvitationType() {
        return this.invitationType;
    }

    public final InvitedManagedGuest getManagedGuest() {
        return this.managedGuest;
    }

    public final List<String> getShareClassification() {
        return this.shareClassification;
    }

    public final List<VerificationFactor> getVerificationFactors() {
        return this.verificationFactors;
    }

    public int hashCode() {
        String str = this.invitationType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.guestIdType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.guestIdValue;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accessClassification;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.groupClassification;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.shareClassification;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        InvitedManagedGuest invitedManagedGuest = this.managedGuest;
        int iHashCode7 = (iHashCode6 + (invitedManagedGuest == null ? 0 : invitedManagedGuest.hashCode())) * 31;
        List<VerificationFactor> list2 = this.verificationFactors;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setAccessClassification(String str) {
        this.accessClassification = str;
    }

    public final void setGroupClassification(String str) {
        this.groupClassification = str;
    }

    public final void setGuestIdType(String str) {
        this.guestIdType = str;
    }

    public final void setGuestIdValue(String str) {
        this.guestIdValue = str;
    }

    public final void setInvitationType(String str) {
        this.invitationType = str;
    }

    public final void setManagedGuest(InvitedManagedGuest invitedManagedGuest) {
        this.managedGuest = invitedManagedGuest;
    }

    public final void setShareClassification(List<String> list) {
        this.shareClassification = list;
    }

    public final void setVerificationFactors(List<VerificationFactor> list) {
        this.verificationFactors = list;
    }

    public String toString() {
        return "Invitation(invitationType=" + this.invitationType + ", guestIdType=" + this.guestIdType + ", guestIdValue=" + this.guestIdValue + ", accessClassification=" + this.accessClassification + ", groupClassification=" + this.groupClassification + ", shareClassification=" + this.shareClassification + ", managedGuest=" + this.managedGuest + ", verificationFactors=" + this.verificationFactors + ")";
    }

    public Invitation(String str, String str2, String str3, String str4, String str5, List<String> list, InvitedManagedGuest invitedManagedGuest, List<VerificationFactor> list2) {
        this.invitationType = str;
        this.guestIdType = str2;
        this.guestIdValue = str3;
        this.accessClassification = str4;
        this.groupClassification = str5;
        this.shareClassification = list;
        this.managedGuest = invitedManagedGuest;
        this.verificationFactors = list2;
    }

    public /* synthetic */ Invitation(String str, String str2, String str3, String str4, String str5, List list, InvitedManagedGuest invitedManagedGuest, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : list, (i10 & 64) != 0 ? null : invitedManagedGuest, (i10 & 128) != 0 ? null : list2);
    }
}