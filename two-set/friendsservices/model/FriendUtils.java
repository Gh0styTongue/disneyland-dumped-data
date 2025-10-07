package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.facility.model.Avatar;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0004H\u0007¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0007J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J \u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/FriendUtils;", "", "()V", "clone", "T", RsaJsonWebKey.FACTOR_CRT_COEFFICIENT, "(Ljava/lang/Object;)Ljava/lang/Object;", "getAvatarImageUrl", "", "profile", "Lcom/disney/wdpro/friendsservices/model/Profile;", "friendEntries", "Lcom/disney/wdpro/friendsservices/model/FriendEntries;", "getFamilyAndFriendsPlusMeIds", "", "friends", "", "Lcom/disney/wdpro/friendsservices/model/Friend;", "xid", "getFriend", "getFriendByXid", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nFriendUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendUtils.kt\ncom/disney/wdpro/friendsservices/model/FriendUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1#2:89\n1#2:104\n288#3,2:90\n288#3,2:92\n1603#3,9:94\n1855#3:103\n1856#3:105\n1612#3:106\n*S KotlinDebug\n*F\n+ 1 FriendUtils.kt\ncom/disney/wdpro/friendsservices/model/FriendUtils\n*L\n54#1:104\n29#1:90,2\n47#1:92,2\n54#1:94,9\n54#1:103\n54#1:105\n54#1:106\n*E\n"})
/* loaded from: classes28.dex */
public final class FriendUtils {
    public static final FriendUtils INSTANCE = new FriendUtils();

    private FriendUtils() {
    }

    @JvmStatic
    public static final <T> T clone(T t10) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(t10);
            objectOutputStream.close();
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            try {
                T t11 = (T) objectInputStream.readObject();
                objectInputStream.close();
                return t11;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    @JvmStatic
    public static final String getAvatarImageUrl(Profile profile, FriendEntries friendEntries) {
        Avatar avatar;
        String imageAvatar;
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(friendEntries, "friendEntries");
        Friend friend = getFriend(profile, friendEntries);
        return (friend == null || (avatar = friend.getAvatar()) == null || (imageAvatar = avatar.getImageAvatar()) == null) ? "" : imageAvatar;
    }

    @JvmStatic
    public static final List<String> getFamilyAndFriendsPlusMeIds(List<? extends Friend> friends, String xid) {
        Intrinsics.checkNotNullParameter(friends, "friends");
        Intrinsics.checkNotNullParameter(xid, "xid");
        ArrayList arrayList = new ArrayList();
        arrayList.add(xid);
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = friends.iterator();
        while (it.hasNext()) {
            String xid2 = ((Friend) it.next()).getXid();
            if (xid2 != null) {
                arrayList2.add(xid2);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    @JvmStatic
    public static final Friend getFriend(Profile profile, FriendEntries friendEntries) {
        Object next;
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(friendEntries, "friendEntries");
        Iterator<T> it = friendEntries.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Friend friend = (Friend) next;
            boolean z10 = false;
            boolean z11 = profile.getXid() != null && Intrinsics.areEqual(profile.getXid(), friend.getXid());
            boolean z12 = profile.getSwid() != null && Intrinsics.areEqual(profile.getSwid(), friend.getSwid());
            if (profile.getGuid() != null && Intrinsics.areEqual(profile.getGuid(), friend.getGuid())) {
                z10 = true;
            }
            if (z11 || z12 || z10) {
                break;
            }
        }
        return (Friend) next;
    }

    @JvmStatic
    public static final Friend getFriendByXid(String xid, List<? extends Friend> friends) {
        Object next;
        Intrinsics.checkNotNullParameter(xid, "xid");
        Intrinsics.checkNotNullParameter(friends, "friends");
        Iterator<T> it = friends.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Friend friend = (Friend) next;
            if (Intrinsics.areEqual(xid, friend.getXid()) || Intrinsics.areEqual(xid, friend.getFormattedXid())) {
                break;
            }
        }
        return (Friend) next;
    }
}