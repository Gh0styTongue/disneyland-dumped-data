package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.support.util.C20935d;
import com.disney.wdpro.support.widget.pull_to_refresh.indicator.C21107a;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrBaseContainer;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p559fa.InterfaceC27942e;
import p708ko.InterfaceC29612c;

@Metadata(m92037d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ/\u0010#\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010\u001bR$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader;", "Landroid/widget/FrameLayout;", "Lko/c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initView", "()V", "", "fromPrepareRefresh", "startRefreshAnimation", "(Z)V", "", "textToAnnounce", "sendAnnouncementEvent", "(Ljava/lang/String;)V", "Lcom/disney/wdpro/support/widget/pull_to_refresh/view/PtrBaseContainer;", "frame", "onUIRefreshPrepare", "(Lcom/disney/wdpro/support/widget/pull_to_refresh/view/PtrBaseContainer;)V", "onUIRefreshBegin", "onUIRefreshComplete", "isUnderTouch", "", "status", "Lcom/disney/wdpro/support/widget/pull_to_refresh/indicator/a;", "ptrIndicator", "onUIPositionChange", "(Lcom/disney/wdpro/support/widget/pull_to_refresh/view/PtrBaseContainer;ZBLcom/disney/wdpro/support/widget/pull_to_refresh/indicator/a;)V", "onUIReset", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "getVqThemer", "()Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "setVqThemer", "(Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "Lcom/disney/wdpro/virtualqueue/themer/VQStringType;", "loadingStringType", "Lcom/disney/wdpro/virtualqueue/themer/VQStringType;", "getLoadingStringType", "()Lcom/disney/wdpro/virtualqueue/themer/VQStringType;", "setLoadingStringType", "(Lcom/disney/wdpro/virtualqueue/themer/VQStringType;)V", "Landroid/widget/TextView;", "messageTextView", "Landroid/widget/TextView;", "Lcom/airbnb/lottie/LottieAnimationView;", "ptrLoader", "Lcom/airbnb/lottie/LottieAnimationView;", "getPtrLoader", "()Lcom/airbnb/lottie/LottieAnimationView;", "setPtrLoader", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "Ljava/util/Date;", InterfaceC27942e.LAST_UPDATE, "Ljava/util/Date;", "Ljava/text/SimpleDateFormat;", "ptrDateFormat$delegate", "Lkotlin/Lazy;", "getPtrDateFormat", "()Ljava/text/SimpleDateFormat;", "ptrDateFormat", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class PtrMyQueuesHeader extends FrameLayout implements InterfaceC29612c {
    public static final int $stable = 8;
    private Date lastUpdate;
    private VQStringType loadingStringType;
    private TextView messageTextView;

    /* renamed from: ptrDateFormat$delegate, reason: from kotlin metadata */
    private final Lazy ptrDateFormat;
    public LottieAnimationView ptrLoader;
    private VirtualQueueThemer vqThemer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PtrMyQueuesHeader(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.loadingStringType = VQStringType.MyLinesLoading;
        this.ptrDateFormat = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.PtrMyQueuesHeader$ptrDateFormat$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final SimpleDateFormat invoke() {
                String string$default;
                VirtualQueueThemer vqThemer = this.this$0.getVqThemer();
                if (vqThemer == null || (string$default = VirtualQueueThemer.getString$default(vqThemer, VQStringType.MyLinesLastUpdatedDateFormat, null, false, 6, null)) == null) {
                    string$default = "";
                }
                return new SimpleDateFormat(string$default, Locale.US);
            }
        });
        initView();
    }

    private final SimpleDateFormat getPtrDateFormat() {
        return (SimpleDateFormat) this.ptrDateFormat.getValue();
    }

    private final void initView() {
        View viewInflate = View.inflate(getContext(), C21487R.layout.vq_my_queues_ptr_header, null);
        View viewFindViewById = viewInflate.findViewById(C21487R.id.loadingMessage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "header.findViewById(R.id.loadingMessage)");
        this.messageTextView = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(C21487R.id.loaderAnimationView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "header.findViewById(R.id.loaderAnimationView)");
        setPtrLoader((LottieAnimationView) viewFindViewById2);
        addView(viewInflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAnnouncementEvent(String textToAnnounce) {
        Object systemService = getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.setClassName(PtrMyQueuesHeader.class.getName());
            accessibilityEventObtain.setPackageName(getContext().getPackageName());
            accessibilityEventObtain.getText().add(textToAnnounce);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
    }

    private final void startRefreshAnimation(boolean fromPrepareRefresh) {
        TextView textView = this.messageTextView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageTextView");
            textView = null;
        }
        ObjectAnimator objectAnimatorM63241g = C20935d.m63241g(textView, new AnimatorListenerAdapter() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.PtrMyQueuesHeader$startRefreshAnimation$textAppearAnimator$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                String string$default;
                String string$default2;
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                TextView textView2 = this.this$0.messageTextView;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageTextView");
                    textView2 = null;
                }
                VirtualQueueThemer vqThemer = this.this$0.getVqThemer();
                String str = "";
                if (vqThemer == null || (string$default = VirtualQueueThemer.getString$default(vqThemer, this.this$0.getLoadingStringType(), null, false, 6, null)) == null) {
                    string$default = "";
                }
                textView2.setText(string$default);
                PtrMyQueuesHeader ptrMyQueuesHeader = this.this$0;
                VirtualQueueThemer vqThemer2 = ptrMyQueuesHeader.getVqThemer();
                if (vqThemer2 != null && (string$default2 = VirtualQueueThemer.getString$default(vqThemer2, VQStringType.MyLinesLoadingAccessibility, null, false, 6, null)) != null) {
                    str = string$default2;
                }
                ptrMyQueuesHeader.sendAnnouncementEvent(str);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationStart(animation);
                TextView textView2 = this.this$0.messageTextView;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageTextView");
                    textView2 = null;
                }
                textView2.setText("");
                this.this$0.getPtrLoader().setVisibility(4);
            }
        });
        ObjectAnimator objectAnimatorM63241g2 = C20935d.m63241g(getPtrLoader(), new AnimatorListenerAdapter() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.PtrMyQueuesHeader$startRefreshAnimation$progressAppearAnimator$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                this.this$0.getPtrLoader().setVisibility(0);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        if (fromPrepareRefresh) {
            animatorSet.playSequentially(objectAnimatorM63241g, objectAnimatorM63241g2);
        } else {
            animatorSet.playTogether(objectAnimatorM63241g, objectAnimatorM63241g2);
        }
        animatorSet.setStartDelay(getResources().getInteger(R.integer.config_shortAnimTime));
        animatorSet.start();
    }

    public final VQStringType getLoadingStringType() {
        return this.loadingStringType;
    }

    public final LottieAnimationView getPtrLoader() {
        LottieAnimationView lottieAnimationView = this.ptrLoader;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ptrLoader");
        return null;
    }

    public final VirtualQueueThemer getVqThemer() {
        return this.vqThemer;
    }

    @Override // p708ko.InterfaceC29612c
    public void onUIPositionChange(PtrBaseContainer frame, boolean isUnderTouch, byte status, C21107a ptrIndicator) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(ptrIndicator, "ptrIndicator");
    }

    @Override // p708ko.InterfaceC29612c
    public void onUIRefreshBegin(PtrBaseContainer frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        startRefreshAnimation(false);
    }

    @Override // p708ko.InterfaceC29612c
    public void onUIRefreshComplete(PtrBaseContainer frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        this.lastUpdate = new Date();
        final String str = getPtrDateFormat().format(this.lastUpdate);
        ObjectAnimator objectAnimatorM63242h = C20935d.m63242h(getPtrLoader(), new AnimatorListenerAdapter() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.PtrMyQueuesHeader$onUIRefreshComplete$progressDisappearAnimator$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                this.this$0.getPtrLoader().setVisibility(4);
            }
        });
        TextView textView = this.messageTextView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageTextView");
            textView = null;
        }
        ObjectAnimator objectAnimatorM63242h2 = C20935d.m63242h(textView, new AnimatorListenerAdapter() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.PtrMyQueuesHeader$onUIRefreshComplete$textDisappearAnimator$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                TextView textView3 = this.this$0.messageTextView;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageTextView");
                    textView3 = null;
                }
                textView3.setText("");
                this.this$0.getPtrLoader().setVisibility(4);
            }
        });
        objectAnimatorM63242h2.setStartDelay(getResources().getInteger(R.integer.config_shortAnimTime));
        TextView textView3 = this.messageTextView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageTextView");
        } else {
            textView2 = textView3;
        }
        ObjectAnimator objectAnimatorM63241g = C20935d.m63241g(textView2, new AnimatorListenerAdapter() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.PtrMyQueuesHeader$onUIRefreshComplete$textAppearAnimator$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                TextView textView4 = this.this$0.messageTextView;
                TextView textView5 = null;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageTextView");
                    textView4 = null;
                }
                VirtualQueueThemer vqThemer = this.this$0.getVqThemer();
                textView4.setText(vqThemer != null ? VirtualQueueThemer.getString$default(vqThemer, VQStringType.MyLinesLoadingLastUpdated, MapsKt.mapOf(TuplesKt.m92045to("date", str)), null, false, 12, null) : null);
                PtrMyQueuesHeader ptrMyQueuesHeader = this.this$0;
                TextView textView6 = ptrMyQueuesHeader.messageTextView;
                if (textView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageTextView");
                } else {
                    textView5 = textView6;
                }
                ptrMyQueuesHeader.sendAnnouncementEvent(textView5.getText().toString());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorM63242h, objectAnimatorM63242h2, objectAnimatorM63241g);
        animatorSet.start();
    }

    @Override // p708ko.InterfaceC29612c
    public void onUIRefreshPrepare(PtrBaseContainer frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        getPtrLoader().setVisibility(4);
        if (this.lastUpdate == null) {
            startRefreshAnimation(true);
            return;
        }
        final String str = getPtrDateFormat().format(this.lastUpdate);
        TextView textView = this.messageTextView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageTextView");
            textView = null;
        }
        ObjectAnimator objectAnimatorM63241g = C20935d.m63241g(textView, new AnimatorListenerAdapter() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.PtrMyQueuesHeader$onUIRefreshPrepare$textAppearAnimator$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                String string$default;
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                TextView textView2 = this.this$0.messageTextView;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageTextView");
                    textView2 = null;
                }
                VirtualQueueThemer vqThemer = this.this$0.getVqThemer();
                if (vqThemer == null || (string$default = VirtualQueueThemer.getString$default(vqThemer, VQStringType.MyLinesLoadingLastUpdated, MapsKt.mapOf(TuplesKt.m92045to("date", str)), null, false, 12, null)) == null) {
                    string$default = "";
                }
                textView2.setText(string$default);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationStart(animation);
                TextView textView2 = this.this$0.messageTextView;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageTextView");
                    textView2 = null;
                }
                textView2.setText("");
                this.this$0.getPtrLoader().setVisibility(4);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorM63241g);
        animatorSet.start();
    }

    @Override // p708ko.InterfaceC29612c
    public void onUIReset(PtrBaseContainer frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    public final void setLoadingStringType(VQStringType vQStringType) {
        Intrinsics.checkNotNullParameter(vQStringType, "<set-?>");
        this.loadingStringType = vQStringType;
    }

    public final void setPtrLoader(LottieAnimationView lottieAnimationView) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "<set-?>");
        this.ptrLoader = lottieAnimationView;
    }

    public final void setVqThemer(VirtualQueueThemer virtualQueueThemer) {
        this.vqThemer = virtualQueueThemer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PtrMyQueuesHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.loadingStringType = VQStringType.MyLinesLoading;
        this.ptrDateFormat = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.PtrMyQueuesHeader$ptrDateFormat$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final SimpleDateFormat invoke() {
                String string$default;
                VirtualQueueThemer vqThemer = this.this$0.getVqThemer();
                if (vqThemer == null || (string$default = VirtualQueueThemer.getString$default(vqThemer, VQStringType.MyLinesLastUpdatedDateFormat, null, false, 6, null)) == null) {
                    string$default = "";
                }
                return new SimpleDateFormat(string$default, Locale.US);
            }
        });
        initView();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PtrMyQueuesHeader(Context context, AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.loadingStringType = VQStringType.MyLinesLoading;
        this.ptrDateFormat = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.PtrMyQueuesHeader$ptrDateFormat$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final SimpleDateFormat invoke() {
                String string$default;
                VirtualQueueThemer vqThemer = this.this$0.getVqThemer();
                if (vqThemer == null || (string$default = VirtualQueueThemer.getString$default(vqThemer, VQStringType.MyLinesLastUpdatedDateFormat, null, false, 6, null)) == null) {
                    string$default = "";
                }
                return new SimpleDateFormat(string$default, Locale.US);
            }
        });
        initView();
    }
}