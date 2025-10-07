package com.disney.wdpro.friendsservices.model;

import java.util.function.Predicate;

/* renamed from: com.disney.wdpro.friendsservices.model.a */
/* loaded from: classes28.dex */
public final /* synthetic */ class C11967a implements Predicate {
    public /* synthetic */ C11967a() {
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return FriendEntries.removeArchivedEntries$lambda$0(c119661, obj);
    }
}