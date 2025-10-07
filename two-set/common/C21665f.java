package com.disney.wdpro.virtualqueue.p462ui.common;

import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import java.util.Comparator;

/* renamed from: com.disney.wdpro.virtualqueue.ui.common.f */
/* loaded from: classes20.dex */
public final /* synthetic */ class C21665f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return LinkedGuestUtils.Companion.getSortComparator$lambda$0((LinkedGuest) obj, (LinkedGuest) obj2);
    }
}