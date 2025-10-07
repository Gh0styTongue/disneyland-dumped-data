package com.disney.wdpro.virtualqueue.p462ui.conflict;

import android.view.View;
import com.disney.wdpro.virtualqueue.databinding.VqConflictGuestBinding;

/* renamed from: com.disney.wdpro.virtualqueue.ui.conflict.b */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewOnClickListenerC21674b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ VqConflictGuestBinding f45277b;

    public /* synthetic */ ViewOnClickListenerC21674b(VqConflictGuestBinding vqConflictGuestBinding) {
        binding = vqConflictGuestBinding;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ConflictGuestAdapter.onBindViewHolder$lambda$2$lambda$1(this.f45276a, binding, view);
    }
}