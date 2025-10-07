package com.disney.wdpro.virtualqueue.p462ui.conflict;

import android.view.View;
import com.disney.wdpro.virtualqueue.p462ui.conflict.ConflictGuestAdapter;

/* renamed from: com.disney.wdpro.virtualqueue.ui.conflict.a */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewOnClickListenerC21673a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ConflictGuestAdapter.ConflictGuestViewItem f45275b;

    public /* synthetic */ ViewOnClickListenerC21673a(ConflictGuestAdapter.ConflictGuestViewItem conflictGuestViewItem) {
        item = conflictGuestViewItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ConflictGuestAdapter.onBindViewHolder$lambda$2$lambda$0(this.f45274a, item, view);
    }
}