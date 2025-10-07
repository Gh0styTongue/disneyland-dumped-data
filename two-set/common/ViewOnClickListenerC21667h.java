package com.disney.wdpro.virtualqueue.p462ui.common;

import android.view.View;
import com.disney.wdpro.virtualqueue.databinding.VqCommonSelectAllBinding;

/* renamed from: com.disney.wdpro.virtualqueue.ui.common.h */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewOnClickListenerC21667h implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ VqCommonSelectAllBinding f45268b;

    /* renamed from: c */
    public final /* synthetic */ SelectAllAdapter f45269c;

    public /* synthetic */ ViewOnClickListenerC21667h(VqCommonSelectAllBinding vqCommonSelectAllBinding, SelectAllAdapter selectAllAdapter) {
        binding = vqCommonSelectAllBinding;
        this = selectAllAdapter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SelectAllAdapter.onBindViewHolder$lambda$1$lambda$0(item, binding, this, view);
    }
}