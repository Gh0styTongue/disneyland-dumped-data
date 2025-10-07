package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/InvitedGuestProfile;", "", "name", "Lcom/disney/wdpro/friendsservices/model/InvitedGuestName;", "age", "", "(Lcom/disney/wdpro/friendsservices/model/InvitedGuestName;S)V", "getAge", "()S", "setAge", "(S)V", "getName", "()Lcom/disney/wdpro/friendsservices/model/InvitedGuestName;", "setName", "(Lcom/disney/wdpro/friendsservices/model/InvitedGuestName;)V", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class InvitedGuestProfile {
    private short age;
    private InvitedGuestName name;

    public InvitedGuestProfile() {
        this(null, (short) 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InvitedGuestProfile copy$default(InvitedGuestProfile invitedGuestProfile, InvitedGuestName invitedGuestName, short s10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            invitedGuestName = invitedGuestProfile.name;
        }
        if ((i10 & 2) != 0) {
            s10 = invitedGuestProfile.age;
        }
        return invitedGuestProfile.copy(invitedGuestName, s10);
    }

    /* renamed from: component1, reason: from getter */
    public final InvitedGuestName getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final short getAge() {
        return this.age;
    }

    public final InvitedGuestProfile copy(InvitedGuestName name, short age) {
        return new InvitedGuestProfile(name, age);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvitedGuestProfile)) {
            return false;
        }
        InvitedGuestProfile invitedGuestProfile = (InvitedGuestProfile) other;
        return Intrinsics.areEqual(this.name, invitedGuestProfile.name) && this.age == invitedGuestProfile.age;
    }

    public final short getAge() {
        return this.age;
    }

    public final InvitedGuestName getName() {
        return this.name;
    }

    public int hashCode() {
        InvitedGuestName invitedGuestName = this.name;
        return ((invitedGuestName == null ? 0 : invitedGuestName.hashCode()) * 31) + Short.hashCode(this.age);
    }

    public final void setAge(short s10) {
        this.age = s10;
    }

    public final void setName(InvitedGuestName invitedGuestName) {
        this.name = invitedGuestName;
    }

    public String toString() {
        return "InvitedGuestProfile(name=" + this.name + ", age=" + ((int) this.age) + ")";
    }

    public InvitedGuestProfile(InvitedGuestName invitedGuestName, short s10) {
        this.name = invitedGuestName;
        this.age = s10;
    }

    public /* synthetic */ InvitedGuestProfile(InvitedGuestName invitedGuestName, short s10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : invitedGuestName, (i10 & 2) != 0 ? (short) 0 : s10);
    }
}