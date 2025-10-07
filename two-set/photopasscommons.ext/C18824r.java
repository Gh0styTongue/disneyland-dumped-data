package com.disney.wdpro.photopasscommons.ext;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0011\u001a\u00020\u0005*\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m92038d2 = {"Landroid/view/View;", "", "animated", "", "animDuration", "", "c", "(Landroid/view/View;ZJ)V", "f", "show", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "(Landroid/view/View;Z)V", "a", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "Lkotlin/Function1;", "action", "b", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "DEFAULT_ANIMATION_DURATION", "J", "photopasscommons_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.r */
/* loaded from: classes15.dex */
public final class C18824r {
    private static final long DEFAULT_ANIMATION_DURATION = 300;

    @Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m92038d2 = {"com/disney/wdpro/photopasscommons/ext/r$a", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "p0", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationCancel", "onAnimationRepeat", "animator", "onAnimationEnd", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.photopasscommons.ext.r$a */
    public static final class a implements Animator.AnimatorListener {
        final /* synthetic */ View $this_hideView;

        a(View view) {
            this.$this_hideView = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.$this_hideView.setVisibility(8);
            animator.removeAllListeners();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m92038d2 = {"com/disney/wdpro/photopasscommons/ext/r$b", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "p0", "", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationCancel", "onAnimationRepeat", "animator", "onAnimationEnd", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.photopasscommons.ext.r$b */
    public static final class b implements Animator.AnimatorListener {
        final /* synthetic */ View $this_showView;

        b(View view) {
            this.$this_showView = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.$this_showView.setVisibility(0);
            animator.removeAllListeners();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
        }
    }

    /* renamed from: a */
    public static final void m60602a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(view.getVisibility() == 0 ? 8 : 0);
    }

    /* renamed from: b */
    public static final void m60603b(ViewGroup viewGroup, Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(i)");
            action.invoke(childAt);
        }
    }

    /* renamed from: c */
    public static final void m60604c(View view, boolean z10, long j10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!z10) {
            view.setVisibility(8);
            return;
        }
        ViewPropertyAnimator listener = view.animate().alpha(0.0f).setDuration(j10).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new a(view));
        Intrinsics.checkNotNullExpressionValue(listener, "View.hideView(animated: …         }\n            })");
        listener.start();
    }

    /* renamed from: d */
    public static /* synthetic */ void m60605d(View view, boolean z10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            j10 = 300;
        }
        m60604c(view, z10, j10);
    }

    /* renamed from: e */
    public static final void m60606e(View view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z10 ? 0 : 8);
    }

    /* renamed from: f */
    public static final void m60607f(View view, boolean z10, long j10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!z10) {
            view.setVisibility(0);
            return;
        }
        ViewPropertyAnimator listener = view.animate().alpha(1.0f).setDuration(j10).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new b(view));
        Intrinsics.checkNotNullExpressionValue(listener, "View.showView(animated: …         }\n            })");
        listener.start();
    }

    /* renamed from: g */
    public static /* synthetic */ void m60608g(View view, boolean z10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            j10 = 300;
        }
        m60607f(view, z10, j10);
    }
}