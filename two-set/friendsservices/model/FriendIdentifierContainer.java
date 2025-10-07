package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/FriendIdentifierContainer;", "", "friends", "", "Lcom/disney/wdpro/friendsservices/model/FriendIdentifier;", "(Ljava/util/List;)V", "getFriends", "()Ljava/util/List;", "setFriends", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class FriendIdentifierContainer {
    private List<FriendIdentifier> friends;

    public FriendIdentifierContainer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FriendIdentifierContainer copy$default(FriendIdentifierContainer friendIdentifierContainer, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = friendIdentifierContainer.friends;
        }
        return friendIdentifierContainer.copy(list);
    }

    public final List<FriendIdentifier> component1() {
        return this.friends;
    }

    public final FriendIdentifierContainer copy(List<FriendIdentifier> friends) {
        Intrinsics.checkNotNullParameter(friends, "friends");
        return new FriendIdentifierContainer(friends);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FriendIdentifierContainer) && Intrinsics.areEqual(this.friends, ((FriendIdentifierContainer) other).friends);
    }

    public final List<FriendIdentifier> getFriends() {
        return this.friends;
    }

    public int hashCode() {
        return this.friends.hashCode();
    }

    public final void setFriends(List<FriendIdentifier> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.friends = list;
    }

    public String toString() {
        return "FriendIdentifierContainer(friends=" + this.friends + ")";
    }

    public FriendIdentifierContainer(List<FriendIdentifier> friends) {
        Intrinsics.checkNotNullParameter(friends, "friends");
        this.friends = friends;
    }

    public /* synthetic */ FriendIdentifierContainer(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}