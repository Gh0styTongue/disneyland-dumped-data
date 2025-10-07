package com.disney.wdpro.virtualqueue.core.fragments;

import java.util.ArrayList;

/* renamed from: com.disney.wdpro.virtualqueue.core.fragments.n */
/* loaded from: classes20.dex */
public final /* synthetic */ class RunnableC21612n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f45241a;

    public /* synthetic */ RunnableC21612n(ArrayList arrayList) {
        arrayList = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SelectQueueFragment.setupParkSelection$lambda$3(arrayList);
    }
}