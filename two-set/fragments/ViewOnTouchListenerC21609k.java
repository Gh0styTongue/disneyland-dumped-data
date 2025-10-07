package com.disney.wdpro.virtualqueue.core.fragments;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Ref;

/* renamed from: com.disney.wdpro.virtualqueue.core.fragments.k */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewOnTouchListenerC21609k implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ Ref.IntRef f45236b;

    /* renamed from: c */
    public final /* synthetic */ RedeemFragment f45237c;

    public /* synthetic */ ViewOnTouchListenerC21609k(Ref.IntRef intRef, RedeemFragment redeemFragment) {
        intRef2 = intRef;
        this = redeemFragment;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return RedeemFragment.showTickets$lambda$9(intRef, intRef2, this, view, motionEvent);
    }
}