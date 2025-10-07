package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.friendsservices.utils.Constants;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/CreateInvitations;", "", "invitations", "", "Lcom/disney/wdpro/friendsservices/model/Invitation;", "(Ljava/util/List;)V", "getInvitations", "()Ljava/util/List;", "setInvitations", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "InvitationType", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class CreateInvitations {
    private List<Invitation> invitations;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/CreateInvitations$InvitationType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Convert", "FRIEND_FAMILY", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public enum InvitationType {
        Convert(Constants.CONVERT),
        FRIEND_FAMILY(Constants.FRIEND_FAMILY);

        private final String value;

        InvitationType(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public CreateInvitations() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateInvitations copy$default(CreateInvitations createInvitations, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = createInvitations.invitations;
        }
        return createInvitations.copy(list);
    }

    public final List<Invitation> component1() {
        return this.invitations;
    }

    public final CreateInvitations copy(List<Invitation> invitations) {
        return new CreateInvitations(invitations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateInvitations) && Intrinsics.areEqual(this.invitations, ((CreateInvitations) other).invitations);
    }

    public final List<Invitation> getInvitations() {
        return this.invitations;
    }

    public int hashCode() {
        List<Invitation> list = this.invitations;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setInvitations(List<Invitation> list) {
        this.invitations = list;
    }

    public String toString() {
        return "CreateInvitations(invitations=" + this.invitations + ")";
    }

    public CreateInvitations(List<Invitation> list) {
        this.invitations = list;
    }

    public /* synthetic */ CreateInvitations(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list);
    }
}