package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.friendsservices.model.dto.AccessClassificationTypeToDTO;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÂ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\rHÖ\u0001R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/FriendIdentifier;", "", "groupClassification", "Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;", "accessClassificationTo", "Lcom/disney/wdpro/friendsservices/model/dto/AccessClassificationTypeToDTO;", "guestIdentifiers", "", "Lcom/disney/wdpro/friendsservices/model/GuestIdentifier;", "(Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;Lcom/disney/wdpro/friendsservices/model/dto/AccessClassificationTypeToDTO;Ljava/util/List;)V", "getGroupClassification", "()Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;", "xid", "", "getXid", "()Ljava/lang/String;", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "getAccessClassificationTo", "Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;", "hashCode", "", "toString", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class FriendIdentifier {

    @SerializedName("classificationTo")
    private final AccessClassificationTypeToDTO accessClassificationTo;

    @SerializedName("groupClassificationCode")
    private final GroupClassificationType groupClassification;
    private final List<GuestIdentifier> guestIdentifiers;

    public FriendIdentifier() {
        this(null, null, null, 7, null);
    }

    /* renamed from: component2, reason: from getter */
    private final AccessClassificationTypeToDTO getAccessClassificationTo() {
        return this.accessClassificationTo;
    }

    private final List<GuestIdentifier> component3() {
        return this.guestIdentifiers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FriendIdentifier copy$default(FriendIdentifier friendIdentifier, GroupClassificationType groupClassificationType, AccessClassificationTypeToDTO accessClassificationTypeToDTO, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            groupClassificationType = friendIdentifier.groupClassification;
        }
        if ((i10 & 2) != 0) {
            accessClassificationTypeToDTO = friendIdentifier.accessClassificationTo;
        }
        if ((i10 & 4) != 0) {
            list = friendIdentifier.guestIdentifiers;
        }
        return friendIdentifier.copy(groupClassificationType, accessClassificationTypeToDTO, list);
    }

    /* renamed from: component1, reason: from getter */
    public final GroupClassificationType getGroupClassification() {
        return this.groupClassification;
    }

    public final FriendIdentifier copy(GroupClassificationType groupClassification, AccessClassificationTypeToDTO accessClassificationTo, List<GuestIdentifier> guestIdentifiers) {
        return new FriendIdentifier(groupClassification, accessClassificationTo, guestIdentifiers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendIdentifier)) {
            return false;
        }
        FriendIdentifier friendIdentifier = (FriendIdentifier) other;
        return this.groupClassification == friendIdentifier.groupClassification && Intrinsics.areEqual(this.accessClassificationTo, friendIdentifier.accessClassificationTo) && Intrinsics.areEqual(this.guestIdentifiers, friendIdentifier.guestIdentifiers);
    }

    public final AccessClassificationType getAccessClassificationTo() {
        AccessClassificationType accessClassification;
        AccessClassificationTypeToDTO accessClassificationTypeToDTO = this.accessClassificationTo;
        return (accessClassificationTypeToDTO == null || (accessClassification = accessClassificationTypeToDTO.getAccessClassification()) == null) ? AccessClassificationType.UNKNOWN : accessClassification;
    }

    public final GroupClassificationType getGroupClassification() {
        return this.groupClassification;
    }

    public final String getXid() {
        Object next;
        List<GuestIdentifier> list = this.guestIdentifiers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (StringsKt.equals(((GuestIdentifier) next).getType(), "xid", true)) {
                    break;
                }
            }
            GuestIdentifier guestIdentifier = (GuestIdentifier) next;
            if (guestIdentifier != null) {
                return guestIdentifier.getValue();
            }
        }
        return null;
    }

    public int hashCode() {
        GroupClassificationType groupClassificationType = this.groupClassification;
        int iHashCode = (groupClassificationType == null ? 0 : groupClassificationType.hashCode()) * 31;
        AccessClassificationTypeToDTO accessClassificationTypeToDTO = this.accessClassificationTo;
        int iHashCode2 = (iHashCode + (accessClassificationTypeToDTO == null ? 0 : accessClassificationTypeToDTO.hashCode())) * 31;
        List<GuestIdentifier> list = this.guestIdentifiers;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "FriendIdentifier(groupClassification=" + this.groupClassification + ", accessClassificationTo=" + this.accessClassificationTo + ", guestIdentifiers=" + this.guestIdentifiers + ")";
    }

    public FriendIdentifier(GroupClassificationType groupClassificationType, AccessClassificationTypeToDTO accessClassificationTypeToDTO, List<GuestIdentifier> list) {
        this.groupClassification = groupClassificationType;
        this.accessClassificationTo = accessClassificationTypeToDTO;
        this.guestIdentifiers = list;
    }

    public /* synthetic */ FriendIdentifier(GroupClassificationType groupClassificationType, AccessClassificationTypeToDTO accessClassificationTypeToDTO, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : groupClassificationType, (i10 & 2) != 0 ? null : accessClassificationTypeToDTO, (i10 & 4) != 0 ? null : list);
    }
}