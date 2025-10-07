package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÂ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÂ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÂ\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001JA\u0010\u0016\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0086\u0002J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0006\u0010\u001f\u001a\u00020\u001eJ\t\u0010 \u001a\u00020!HÖ\u0001R\u001c\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/MyRelativeFriends;", "", "hisFriendsMap", "", "Lcom/disney/wdpro/friendsservices/model/Friend;", "Lcom/disney/wdpro/friendsservices/model/FriendEntries;", "myFriends", "", "myFamily", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "addFamily", "", "familyMember", "theirFriends", "addFriend", "friend", "component1", "component2", "component3", "containsKey", "", "key", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "get", "getMyFamily", "", "getMyFriends", "hashCode", "", "size", "toString", "", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class MyRelativeFriends {
    private final Map<Friend, FriendEntries> hisFriendsMap;
    private final List<Friend> myFamily;
    private final List<Friend> myFriends;

    public MyRelativeFriends() {
        this(null, null, null, 7, null);
    }

    private final Map<Friend, FriendEntries> component1() {
        return this.hisFriendsMap;
    }

    private final List<Friend> component2() {
        return this.myFriends;
    }

    private final List<Friend> component3() {
        return this.myFamily;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MyRelativeFriends copy$default(MyRelativeFriends myRelativeFriends, Map map, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = myRelativeFriends.hisFriendsMap;
        }
        if ((i10 & 2) != 0) {
            list = myRelativeFriends.myFriends;
        }
        if ((i10 & 4) != 0) {
            list2 = myRelativeFriends.myFamily;
        }
        return myRelativeFriends.copy(map, list, list2);
    }

    public final void addFamily(Friend familyMember, FriendEntries theirFriends) {
        Intrinsics.checkNotNullParameter(familyMember, "familyMember");
        this.myFamily.add(familyMember);
        this.hisFriendsMap.put(familyMember, theirFriends);
    }

    public final void addFriend(Friend friend, FriendEntries theirFriends) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        this.myFriends.add(friend);
        this.hisFriendsMap.put(friend, theirFriends);
    }

    public final boolean containsKey(Object key) {
        return this.hisFriendsMap.containsKey(key);
    }

    public final MyRelativeFriends copy(Map<Friend, FriendEntries> hisFriendsMap, List<Friend> myFriends, List<Friend> myFamily) {
        Intrinsics.checkNotNullParameter(hisFriendsMap, "hisFriendsMap");
        Intrinsics.checkNotNullParameter(myFriends, "myFriends");
        Intrinsics.checkNotNullParameter(myFamily, "myFamily");
        return new MyRelativeFriends(hisFriendsMap, myFriends, myFamily);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyRelativeFriends)) {
            return false;
        }
        MyRelativeFriends myRelativeFriends = (MyRelativeFriends) other;
        return Intrinsics.areEqual(this.hisFriendsMap, myRelativeFriends.hisFriendsMap) && Intrinsics.areEqual(this.myFriends, myRelativeFriends.myFriends) && Intrinsics.areEqual(this.myFamily, myRelativeFriends.myFamily);
    }

    public final FriendEntries get(Friend friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        return this.hisFriendsMap.get(friend);
    }

    public final List<Friend> getMyFamily() {
        return CollectionsKt.toList(this.myFamily);
    }

    public final List<Friend> getMyFriends() {
        return CollectionsKt.toList(this.myFriends);
    }

    public int hashCode() {
        return (((this.hisFriendsMap.hashCode() * 31) + this.myFriends.hashCode()) * 31) + this.myFamily.hashCode();
    }

    public final int size() {
        return this.hisFriendsMap.size();
    }

    public String toString() {
        return "MyRelativeFriends(hisFriendsMap=" + this.hisFriendsMap + ", myFriends=" + this.myFriends + ", myFamily=" + this.myFamily + ")";
    }

    public MyRelativeFriends(Map<Friend, FriendEntries> hisFriendsMap, List<Friend> myFriends, List<Friend> myFamily) {
        Intrinsics.checkNotNullParameter(hisFriendsMap, "hisFriendsMap");
        Intrinsics.checkNotNullParameter(myFriends, "myFriends");
        Intrinsics.checkNotNullParameter(myFamily, "myFamily");
        this.hisFriendsMap = hisFriendsMap;
        this.myFriends = myFriends;
        this.myFamily = myFamily;
    }

    public /* synthetic */ MyRelativeFriends(Map map, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new HashMap() : map, (i10 & 2) != 0 ? new ArrayList() : list, (i10 & 4) != 0 ? new ArrayList() : list2);
    }
}