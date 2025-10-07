package com.disney.wdpro.virtualqueue.service.model;

import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuestList;", "Ljava/io/Serializable;", "guests", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "(Ljava/util/List;)V", "getGuests", "()Ljava/util/List;", "setGuests", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class LinkedGuestList implements Serializable {
    public static final int $stable = 8;
    private List<LinkedGuest> guests;

    public LinkedGuestList(List<LinkedGuest> guests) {
        Intrinsics.checkNotNullParameter(guests, "guests");
        this.guests = guests;
    }

    public final List<LinkedGuest> getGuests() {
        List<LinkedGuest> list = this.guests;
        if (list != null) {
            return list;
        }
        ArrayList arrayListM69268i = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i, "newArrayList()");
        return arrayListM69268i;
    }

    public final void setGuests(List<LinkedGuest> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.guests = list;
    }
}