package com.disney.wdpro.friendsservices.model.dto;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/dto/FriendEntriesDTO;", "", "friends", "", "Lcom/disney/wdpro/friendsservices/model/dto/FriendDTO;", "(Ljava/util/List;)V", "getFriends", "()Ljava/util/List;", "setFriends", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class FriendEntriesDTO {
    private List<FriendDTO> friends;

    public FriendEntriesDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FriendEntriesDTO copy$default(FriendEntriesDTO friendEntriesDTO, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = friendEntriesDTO.friends;
        }
        return friendEntriesDTO.copy(list);
    }

    public final List<FriendDTO> component1() {
        return this.friends;
    }

    public final FriendEntriesDTO copy(List<FriendDTO> friends) {
        return new FriendEntriesDTO(friends);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FriendEntriesDTO) && Intrinsics.areEqual(this.friends, ((FriendEntriesDTO) other).friends);
    }

    public final List<FriendDTO> getFriends() {
        return this.friends;
    }

    public int hashCode() {
        List<FriendDTO> list = this.friends;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setFriends(List<FriendDTO> list) {
        this.friends = list;
    }

    public String toString() {
        return "FriendEntriesDTO(friends=" + this.friends + ")";
    }

    public FriendEntriesDTO(List<FriendDTO> list) {
        this.friends = list;
    }

    public /* synthetic */ FriendEntriesDTO(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list);
    }
}