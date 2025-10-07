package com.disney.wdpro.friendsservices.model;

import java.util.function.Predicate;

/* renamed from: com.disney.wdpro.friendsservices.model.b */
/* loaded from: classes28.dex */
public final /* synthetic */ class C11968b implements Predicate {
    public /* synthetic */ C11968b() {
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return FriendEntries.removeAlreadyConnectedFriends$lambda$12(function1, obj);
    }
}