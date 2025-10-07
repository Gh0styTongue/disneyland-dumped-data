package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/FriendsByPlans;", "Ljava/io/Serializable;", "friends", "Lcom/disney/wdpro/friendsservices/model/FriendsByPlans$FriendsList;", "(Lcom/disney/wdpro/friendsservices/model/FriendsByPlans$FriendsList;)V", "allFriends", "", "Lcom/disney/wdpro/friendsservices/model/ConnectedFriend;", "getAllFriends", "()Ljava/util/List;", "friendsWithPlans", "getFriendsWithPlans", "friendsWithoutPlans", "getFriendsWithoutPlans", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "", "FriendsList", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class FriendsByPlans implements Serializable {
    private final FriendsList friends;

    @Metadata(m92037d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/FriendsByPlans$FriendsList;", "Ljava/io/Serializable;", "withoutPlans", "", "Lcom/disney/wdpro/friendsservices/model/ConnectedFriend;", "withPlans", "(Ljava/util/List;Ljava/util/List;)V", "getWithPlans", "()Ljava/util/List;", "getWithoutPlans", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class FriendsList implements Serializable {
        private final List<ConnectedFriend> withPlans;
        private final List<ConnectedFriend> withoutPlans;

        public FriendsList(List<ConnectedFriend> withoutPlans, List<ConnectedFriend> withPlans) {
            Intrinsics.checkNotNullParameter(withoutPlans, "withoutPlans");
            Intrinsics.checkNotNullParameter(withPlans, "withPlans");
            this.withoutPlans = withoutPlans;
            this.withPlans = withPlans;
        }

        public final List<ConnectedFriend> getWithPlans() {
            return this.withPlans;
        }

        public final List<ConnectedFriend> getWithoutPlans() {
            return this.withoutPlans;
        }
    }

    public FriendsByPlans() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final FriendsList getFriends() {
        return this.friends;
    }

    public static /* synthetic */ FriendsByPlans copy$default(FriendsByPlans friendsByPlans, FriendsList friendsList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            friendsList = friendsByPlans.friends;
        }
        return friendsByPlans.copy(friendsList);
    }

    public final FriendsByPlans copy(FriendsList friends) {
        return new FriendsByPlans(friends);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FriendsByPlans) && Intrinsics.areEqual(this.friends, ((FriendsByPlans) other).friends);
    }

    public final List<ConnectedFriend> getAllFriends() {
        ArrayList arrayList = new ArrayList(getFriendsWithPlans());
        arrayList.addAll(getFriendsWithoutPlans());
        return arrayList;
    }

    public final List<ConnectedFriend> getFriendsWithPlans() {
        List<ConnectedFriend> withPlans;
        FriendsList friendsList = this.friends;
        if (friendsList != null && (withPlans = friendsList.getWithPlans()) != null) {
            return withPlans;
        }
        ArrayList arrayListM69268i = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i, "newArrayList()");
        return arrayListM69268i;
    }

    public final List<ConnectedFriend> getFriendsWithoutPlans() {
        List<ConnectedFriend> withoutPlans;
        FriendsList friendsList = this.friends;
        if (friendsList != null && (withoutPlans = friendsList.getWithoutPlans()) != null) {
            return withoutPlans;
        }
        ArrayList arrayListM69268i = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i, "newArrayList()");
        return arrayListM69268i;
    }

    public int hashCode() {
        FriendsList friendsList = this.friends;
        if (friendsList == null) {
            return 0;
        }
        return friendsList.hashCode();
    }

    public String toString() {
        return "FriendsByPlans(friends=" + this.friends + ")";
    }

    public FriendsByPlans(FriendsList friendsList) {
        this.friends = friendsList;
    }

    public /* synthetic */ FriendsByPlans(FriendsList friendsList, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : friendsList);
    }
}