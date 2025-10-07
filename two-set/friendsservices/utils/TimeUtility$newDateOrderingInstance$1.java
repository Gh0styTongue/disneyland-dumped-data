package com.disney.wdpro.friendsservices.utils;

import com.google.common.collect.Ordering;
import java.util.Date;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, m92038d2 = {"com/disney/wdpro/friendsservices/utils/TimeUtility$newDateOrderingInstance$1", "Lcom/google/common/collect/Ordering;", "Ljava/util/Date;", "compare", "", "left", "right", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final class TimeUtility$newDateOrderingInstance$1 extends Ordering<Date> {
    TimeUtility$newDateOrderingInstance$1() {
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Date left, Date right) {
        if (left == null) {
            return -1;
        }
        if (right == null) {
            return 1;
        }
        return left.compareTo(right);
    }
}