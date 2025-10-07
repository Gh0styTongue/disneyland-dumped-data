package com.disney.wdpro.virtualqueue.p462ui.common;

import android.view.View;
import com.disney.wdpro.virtualqueue.databinding.VqCommonAnonymousPartySizeBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AnonymousPartySizeAdapter;

/* renamed from: com.disney.wdpro.virtualqueue.ui.common.c */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewOnClickListenerC21662c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ AnonymousPartySizeAdapter f45256b;

    /* renamed from: c */
    public final /* synthetic */ VqCommonAnonymousPartySizeBinding f45257c;

    /* renamed from: d */
    public final /* synthetic */ AnonymousPartySizeAdapter.AnonymousPartySizeViewHolder f45258d;

    public /* synthetic */ ViewOnClickListenerC21662c(AnonymousPartySizeAdapter anonymousPartySizeAdapter, VqCommonAnonymousPartySizeBinding vqCommonAnonymousPartySizeBinding, AnonymousPartySizeAdapter.AnonymousPartySizeViewHolder anonymousPartySizeViewHolder) {
        this = anonymousPartySizeAdapter;
        binding = vqCommonAnonymousPartySizeBinding;
        holder = anonymousPartySizeViewHolder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AnonymousPartySizeAdapter.onBindViewHolder$lambda$2$lambda$0(item, this, binding, holder, view);
    }
}