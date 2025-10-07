package com.disney.wdpro.friendsservices.model;

import com.google.common.base.InterfaceC22463n;
import java.util.List;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"com/disney/wdpro/friendsservices/model/Friend$Companion$getFilterByIdPredicate$1", "Lcom/google/common/base/n;", "Lcom/disney/wdpro/friendsservices/model/Friend;", "friend", "", "apply", "(Lcom/disney/wdpro/friendsservices/model/Friend;)Z", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final class Friend$Companion$getFilterByIdPredicate$1 implements InterfaceC22463n<Friend> {
    final /* synthetic */ List<String> $xids;

    Friend$Companion$getFilterByIdPredicate$1(List<String> list) {
        xids = list;
    }

    @Override // com.google.common.base.InterfaceC22463n
    public boolean apply(Friend friend) {
        String xid;
        if (friend == null || (xid = friend.getXid()) == null) {
            return false;
        }
        return xids.contains(xid);
    }
}