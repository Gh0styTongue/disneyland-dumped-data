package com.disney.wdpro.virtualqueue.p462ui.common;

import android.view.View;
import com.disney.wdpro.virtualqueue.databinding.VqCommonGuestSelectItemBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.SelectLinkedGuestAdapter;

/* renamed from: com.disney.wdpro.virtualqueue.ui.common.i */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewOnClickListenerC21668i implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ SelectLinkedGuestAdapter.SelectLinkedGuestViewItem f45271b;

    /* renamed from: c */
    public final /* synthetic */ VqCommonGuestSelectItemBinding f45272c;

    public /* synthetic */ ViewOnClickListenerC21668i(SelectLinkedGuestAdapter.SelectLinkedGuestViewItem selectLinkedGuestViewItem, VqCommonGuestSelectItemBinding vqCommonGuestSelectItemBinding) {
        item = selectLinkedGuestViewItem;
        binding = vqCommonGuestSelectItemBinding;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SelectLinkedGuestAdapter.onBindViewHolder$lambda$1$lambda$0(this.f45270a, item, binding, view);
    }
}