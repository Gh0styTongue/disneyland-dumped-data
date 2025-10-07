package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.service.business.APIConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eJ\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\u0006\u0010\u001f\u001a\u00020\u001eJ$\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040%2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\t\u0010&\u001a\u00020'HÖ\u0001J\u000e\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0004J\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0006\u0010,\u001a\u00020\tJ\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\u0006\u0010.\u001a\u00020'J\t\u0010/\u001a\u00020\u001eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n¨\u00060"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/FriendEntries;", "Ljava/io/Serializable;", APIConstants.JsonKeys.ENTRIES, "", "Lcom/disney/wdpro/friendsservices/model/Friend;", "(Ljava/util/List;)V", "getEntries", "()Ljava/util/List;", "isEmpty", "", "()Z", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "", "filterFamily", "", "filterFamilyAndFriends", "filterFriend", "filterInvitePendingStatus", "Lcom/disney/wdpro/friendsservices/model/Invite;", "invites", "filterManagedAll", "filterMyPlans", "filterOutInvitationPending", "filterRegisteredAll", "filterSelected", "filterTertiary", "getXidsForHomeMyPlans", "", "myXid", "getXidsForManagedFriends", "xid", "getXidsForManagedFriendsAndI", "getXidsList", "filteredFriendsList", "", "hashCode", "", "remove", "friend", "removeAlreadyConnectedFriends", "friendsOfFriend", "removeArchivedEntries", "renameTertiaries", "size", "toString", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nFriendEntries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendEntries.kt\ncom/disney/wdpro/friendsservices/model/FriendEntries\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n766#2:155\n857#2,2:156\n766#2:158\n857#2,2:159\n766#2:161\n857#2,2:162\n766#2:164\n857#2,2:165\n766#2:167\n857#2,2:168\n766#2:170\n857#2,2:171\n766#2:173\n857#2,2:174\n766#2:176\n857#2,2:177\n766#2:179\n857#2,2:180\n766#2:182\n857#2,2:183\n2634#2:185\n766#2:187\n857#2,2:188\n1603#2,9:190\n1855#2:199\n1856#2:201\n1612#2:202\n1#3:186\n1#3:200\n1#3:203\n*S KotlinDebug\n*F\n+ 1 FriendEntries.kt\ncom/disney/wdpro/friendsservices/model/FriendEntries\n*L\n33#1:155\n33#1:156,2\n40#1:158\n40#1:159,2\n47#1:161\n47#1:162,2\n54#1:164\n54#1:165,2\n61#1:167\n61#1:168,2\n68#1:170\n68#1:171,2\n75#1:173\n75#1:174,2\n81#1:176\n81#1:177,2\n87#1:179\n87#1:180,2\n93#1:182\n93#1:183,2\n100#1:185\n127#1:187\n127#1:188,2\n151#1:190,9\n151#1:199\n151#1:201\n151#1:202\n100#1:186\n151#1:200\n*E\n"})
/* loaded from: classes28.dex */
public final /* data */ class FriendEntries implements Serializable {
    private final List<Friend> entries;
    private final boolean isEmpty;

    public FriendEntries() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FriendEntries copy$default(FriendEntries friendEntries, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = friendEntries.entries;
        }
        return friendEntries.copy(list);
    }

    private final List<String> getXidsList(Iterable<? extends Friend> filteredFriendsList, String myXid) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Friend> it = filteredFriendsList.iterator();
        while (it.hasNext()) {
            String xid = it.next().getXid();
            if (xid != null) {
                arrayList.add(xid);
            }
        }
        List<String> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        mutableList.add(myXid);
        return mutableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeAlreadyConnectedFriends$lambda$12(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeArchivedEntries$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    public final List<Friend> component1() {
        return this.entries;
    }

    public final FriendEntries copy(List<Friend> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new FriendEntries(entries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FriendEntries) && Intrinsics.areEqual(this.entries, ((FriendEntries) other).entries);
    }

    public final List<Friend> filterFamily() {
        List<Friend> list = this.entries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Friend friend = (Friend) obj;
            if (friend.isFamily() && !friend.isTertiary()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Friend> filterFamilyAndFriends() {
        List<Friend> list = this.entries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((Friend) obj).isTertiary()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Friend> filterFriend() {
        List<Friend> list = this.entries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Friend friend = (Friend) obj;
            if (!friend.isFamily() && !friend.isTertiary()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Invite> filterInvitePendingStatus(List<? extends Invite> invites) {
        Intrinsics.checkNotNullParameter(invites, "invites");
        ArrayList arrayList = new ArrayList();
        for (Object obj : invites) {
            if (Intrinsics.areEqual(((Invite) obj).getStatus(), Invite.STATUS_PENDING)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Friend> filterManagedAll() {
        List<Friend> list = this.entries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((Friend) obj).isRegistered()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Friend> filterMyPlans() {
        List<Friend> list = this.entries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Friend) obj).isManaged()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Friend> filterOutInvitationPending(List<? extends Invite> invites) {
        Intrinsics.checkNotNullParameter(invites, "invites");
        List<Friend> list = this.entries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Friend.INSTANCE.isPendingInvite((Friend) obj, invites)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Friend> filterRegisteredAll() {
        List<Friend> list = this.entries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Friend) obj).isRegistered()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Friend> filterSelected() {
        List<Friend> list = this.entries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Friend) obj).getIsSelected()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Friend> filterTertiary() {
        List<Friend> list = this.entries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Friend) obj).isTertiary()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Friend> getEntries() {
        return this.entries;
    }

    public final List<String> getXidsForHomeMyPlans(String myXid) {
        Intrinsics.checkNotNullParameter(myXid, "myXid");
        return getXidsList(filterManagedAll(), myXid);
    }

    public final String getXidsForManagedFriends(String xid) {
        Intrinsics.checkNotNullParameter(xid, "xid");
        return CollectionsKt.joinToString$default(getXidsForManagedFriendsAndI(xid), ",", null, null, 0, null, null, 62, null);
    }

    public final List<String> getXidsForManagedFriendsAndI(String myXid) {
        Intrinsics.checkNotNullParameter(myXid, "myXid");
        List<Friend> listFilterManagedAll = filterManagedAll();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFilterManagedAll) {
            if (!((Friend) obj).hasViewShared()) {
                arrayList.add(obj);
            }
        }
        return getXidsList(arrayList, myXid);
    }

    public int hashCode() {
        return this.entries.hashCode();
    }

    /* renamed from: isEmpty, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    public final boolean remove(Friend friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        return this.entries.remove(friend);
    }

    public final List<Friend> removeAlreadyConnectedFriends(List<Friend> friendsOfFriend) {
        Intrinsics.checkNotNullParameter(friendsOfFriend, "friendsOfFriend");
        final Function1<Friend, Boolean> function1 = new Function1<Friend, Boolean>() { // from class: com.disney.wdpro.friendsservices.model.FriendEntries.removeAlreadyConnectedFriends.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Friend it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(FriendEntries.this.getEntries().contains(it));
            }
        };
        friendsOfFriend.removeIf(new Predicate() { // from class: com.disney.wdpro.friendsservices.model.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FriendEntries.removeAlreadyConnectedFriends$lambda$12(function1, obj);
            }
        });
        return friendsOfFriend;
    }

    public final boolean removeArchivedEntries() {
        List<Friend> list = this.entries;
        final C119661 c119661 = new Function1<Friend, Boolean>() { // from class: com.disney.wdpro.friendsservices.model.FriendEntries.removeArchivedEntries.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Friend it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.isArchived());
            }
        };
        return list.removeIf(new Predicate() { // from class: com.disney.wdpro.friendsservices.model.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FriendEntries.removeArchivedEntries$lambda$0(c119661, obj);
            }
        });
    }

    public final List<Friend> renameTertiaries() {
        List<Friend> listFilterTertiary = filterTertiary();
        for (Friend friend : listFilterTertiary) {
            friend.setFirstName("Guest");
            friend.setLastName(friend.getMepSerialNumber() != null ? "Pass " + friend.getMepSerialNumber() : "Pass");
        }
        return listFilterTertiary;
    }

    public final int size() {
        return this.entries.size();
    }

    public String toString() {
        return "FriendEntries(entries=" + this.entries + ")";
    }

    public FriendEntries(List<Friend> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.entries = entries;
        this.isEmpty = entries.isEmpty();
    }

    public /* synthetic */ FriendEntries(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }
}