package com.disney.wdpro.virtualqueue.p462ui.common;

import android.animation.Animator;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.airbnb.lottie.InterfaceC6925p0;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.recommender.core.themer.RecommenderThemerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001AB=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0016¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\u0016¢\u0006\u0004\b#\u0010!J\u0019\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010*J\u0017\u0010-\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b-\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00140;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00103R\u0016\u0010?\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00102R\u0016\u0010@\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00102¨\u0006B"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/LottieFlow;", "Landroid/animation/Animator$AnimatorListener;", "Lcom/airbnb/lottie/p0;", "", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "utils", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieAnimationView", "Landroid/widget/TextView;", "placeholder", "", "pauseOnLoad", "", "progressState", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;Lcom/airbnb/lottie/LottieAnimationView;Landroid/widget/TextView;ZI)V", "isAccessibilityEnabled", "()Z", "", "anim", "", "addAnimation", "(Ljava/lang/String;)V", "", "anims", "addAnimations", "(Ljava/util/List;)V", "state", "setLoopLastAnimation", "(Z)V", RecommenderThemerConstants.START, "()V", "pause", "clear", "result", "onResult", "(Ljava/lang/Throwable;)V", "Landroid/animation/Animator;", "animation", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/widget/TextView;", "Z", "I", "Lcom/disney/wdpro/virtualqueue/ui/common/LottieFlow$LottieFlowListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/disney/wdpro/virtualqueue/ui/common/LottieFlow$LottieFlowListener;", "getListener", "()Lcom/disney/wdpro/virtualqueue/ui/common/LottieFlow$LottieFlowListener;", "setListener", "(Lcom/disney/wdpro/virtualqueue/ui/common/LottieFlow$LottieFlowListener;)V", "", "animations", "Ljava/util/List;", "currentAnimation", "loopLastAnimation", "hasStarted", "LottieFlowListener", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class LottieFlow implements Animator.AnimatorListener, InterfaceC6925p0<Throwable> {
    public static final int $stable = 8;
    private final List<String> animations;
    private final Context context;
    private int currentAnimation;
    private boolean hasStarted;
    private LottieFlowListener listener;
    private boolean loopLastAnimation;
    private final LottieAnimationView lottieAnimationView;
    private final boolean pauseOnLoad;
    private final TextView placeholder;
    private final int progressState;
    private final PicassoUtils utils;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/LottieFlow$LottieFlowListener;", "", "lottieLoadingFailed", "", "lottieLoadingFinished", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface LottieFlowListener {
        void lottieLoadingFailed();

        void lottieLoadingFinished();
    }

    public LottieFlow(Context context, PicassoUtils utils, LottieAnimationView lottieAnimationView, TextView textView, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(lottieAnimationView, "lottieAnimationView");
        this.context = context;
        this.utils = utils;
        this.lottieAnimationView = lottieAnimationView;
        this.placeholder = textView;
        this.pauseOnLoad = z10;
        this.progressState = i10;
        this.animations = new ArrayList();
    }

    private final boolean isAccessibilityEnabled() {
        Object systemService = this.context.getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public final void addAnimation(String anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        this.animations.add(anim);
    }

    public final void addAnimations(List<String> anims) {
        Intrinsics.checkNotNullParameter(anims, "anims");
        this.animations.addAll(anims);
    }

    public final void clear() {
        this.lottieAnimationView.cancelAnimation();
        this.lottieAnimationView.removeAllAnimatorListeners();
        this.animations.clear();
        this.hasStarted = false;
    }

    public final LottieFlowListener getListener() {
        return this.listener;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.lottieAnimationView.setRepeatCount(0);
        this.loopLastAnimation = false;
        this.animations.clear();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.loopLastAnimation && !isAccessibilityEnabled()) {
            this.lottieAnimationView.setRepeatCount(-1);
            this.lottieAnimationView.setRepeatMode(1);
            if (this.animations.size() > 0) {
                PicassoUtils picassoUtils = this.utils;
                List<String> list = this.animations;
                picassoUtils.loadLottieAnimation(list.get(list.size() - 1), this.lottieAnimationView, null, this, this, this.pauseOnLoad);
                return;
            }
            return;
        }
        int i10 = this.currentAnimation + 1;
        this.currentAnimation = i10;
        if (i10 >= this.animations.size()) {
            if (isAccessibilityEnabled()) {
                this.lottieAnimationView.pauseAnimation();
                return;
            }
            this.currentAnimation = 0;
        }
        if (this.animations.size() > 1 || this.loopLastAnimation) {
            this.utils.loadLottieAnimation(this.animations.get(this.currentAnimation), this.lottieAnimationView, null, this, this, this.pauseOnLoad);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.progressState == 5) {
            this.lottieAnimationView.removeAllAnimatorListeners();
            this.lottieAnimationView.cancelAnimation();
            String str = (String) CollectionsKt.lastOrNull((List) this.animations);
            if (str != null) {
                this.lottieAnimationView.setRepeatCount(-1);
                this.lottieAnimationView.setRepeatMode(1);
                this.utils.loadLottieAnimation(str, this.lottieAnimationView, null, this, this, this.pauseOnLoad);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.hasStarted) {
            return;
        }
        LottieFlowListener lottieFlowListener = this.listener;
        if (lottieFlowListener != null) {
            lottieFlowListener.lottieLoadingFinished();
        }
        this.hasStarted = true;
    }

    public final void pause() {
        this.lottieAnimationView.pauseAnimation();
        this.hasStarted = false;
    }

    public final void setListener(LottieFlowListener lottieFlowListener) {
        this.listener = lottieFlowListener;
    }

    public final void setLoopLastAnimation(boolean state) {
        this.loopLastAnimation = state;
    }

    public final void start() {
        if (this.animations.isEmpty()) {
            return;
        }
        this.currentAnimation = 0;
        this.lottieAnimationView.setRepeatCount(0);
        this.lottieAnimationView.setRepeatMode(1);
        this.hasStarted = false;
        this.utils.loadLottieAnimation(this.animations.get(this.currentAnimation), this.lottieAnimationView, this.placeholder, this, this, this.pauseOnLoad);
    }

    @Override // com.airbnb.lottie.InterfaceC6925p0
    public void onResult(Throwable result) {
        LottieFlowListener lottieFlowListener = this.listener;
        if (lottieFlowListener != null) {
            lottieFlowListener.lottieLoadingFailed();
        }
    }

    public /* synthetic */ LottieFlow(Context context, PicassoUtils picassoUtils, LottieAnimationView lottieAnimationView, TextView textView, boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, picassoUtils, lottieAnimationView, (i11 & 8) != 0 ? null : textView, (i11 & 16) != 0 ? false : z10, i10);
    }
}