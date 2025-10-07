package com.disney.wdpro.virtualqueue.p462ui.common;

import android.animation.Animator;
import android.widget.TextView;
import com.airbnb.lottie.C6894i;
import com.airbnb.lottie.InterfaceC6925p0;

/* renamed from: com.disney.wdpro.virtualqueue.ui.common.g */
/* loaded from: classes20.dex */
public final /* synthetic */ class C21666g implements InterfaceC6925p0 {

    /* renamed from: b */
    public final /* synthetic */ Animator.AnimatorListener f45264b;

    /* renamed from: c */
    public final /* synthetic */ TextView f45265c;

    /* renamed from: d */
    public final /* synthetic */ boolean f45266d;

    public /* synthetic */ C21666g(Animator.AnimatorListener animatorListener, TextView textView, boolean z10) {
        listener = animatorListener;
        placeholder = textView;
        pauseOnLoad = z10;
    }

    @Override // com.airbnb.lottie.InterfaceC6925p0
    public final void onResult(Object obj) {
        PicassoUtils.loadLottieAnimation$lambda$1(lottieView, listener, placeholder, pauseOnLoad, (C6894i) obj);
    }
}