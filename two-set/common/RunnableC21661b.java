package com.disney.wdpro.virtualqueue.p462ui.common;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.disney.wdpro.virtualqueue.ui.common.b */
/* loaded from: classes20.dex */
public final /* synthetic */ class RunnableC21661b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ RecyclerView.AbstractC4902e0 f45252b;

    /* renamed from: c */
    public final /* synthetic */ AccessibleAdapter f45253c;

    /* renamed from: d */
    public final /* synthetic */ String f45254d;

    public /* synthetic */ RunnableC21661b(RecyclerView.AbstractC4902e0 abstractC4902e0, AccessibleAdapter accessibleAdapter, String str) {
        holder = abstractC4902e0;
        this = accessibleAdapter;
        contentDescription = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AccessibleAdapter.handleAccessibilityUpdate$lambda$1(item, holder, this, contentDescription);
    }
}