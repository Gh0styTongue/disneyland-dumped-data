package com.disney.wdpro.qr_core.p424ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.photopasslib.p419ui.util.PhotoPassExtensionsUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p916rm.C31924c;
import p916rm.C31931j;
import tm.C32308c;

@Metadata(m92037d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 $2\u00020\u0001:\u0001%B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ!\u0010\u0014\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0016\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006&"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/ui/ExpandableTextView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "i", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "j", "()V", "h", "g", "Lkotlin/Function1;", "", "action", "setExpandCallback", "(Lkotlin/jvm/functions/Function1;)V", "expanded", "setState", "(Z)V", "Landroid/widget/TextView;", "expandIcon", "Landroid/widget/TextView;", "expandText", "expandableText", "expandCallback", "Lkotlin/jvm/functions/Function1;", "Z", "expandAnimation", "I", "collapseAnimation", "Companion", "a", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nExpandableTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpandableTextView.kt\ncom/disney/wdpro/qr_core/ui/ExpandableTextView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,155:1\n233#2,3:156\n233#2,3:159\n233#2,3:162\n*S KotlinDebug\n*F\n+ 1 ExpandableTextView.kt\ncom/disney/wdpro/qr_core/ui/ExpandableTextView\n*L\n46#1:156,3\n63#1:159,3\n67#1:162,3\n*E\n"})
/* loaded from: classes16.dex */
public final class ExpandableTextView extends LinearLayout {
    private static final int ICON_LEFT = 0;
    private static final int ICON_RIGHT = 1;
    private int collapseAnimation;
    private int expandAnimation;
    private Function1<? super Boolean, Unit> expandCallback;
    private TextView expandIcon;
    private TextView expandText;
    private TextView expandableText;
    private boolean expanded;

    @Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m92038d2 = {"com/disney/wdpro/qr_core/ui/ExpandableTextView$b", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.qr_core.ui.ExpandableTextView$b */
    public static final class AnimationAnimationListenerC19452b implements Animation.AnimationListener {
        AnimationAnimationListenerC19452b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Function1 function1 = ExpandableTextView.this.expandCallback;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(ExpandableTextView.this.expanded));
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m60993c(ExpandableTextView this$0, View view) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m61000j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m60994d(ExpandableTextView this$0, View view) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m61000j();
    }

    /* renamed from: g */
    private final void m60997g() throws Resources.NotFoundException {
        this.expanded = false;
        this.expandableText.setVisibility(8);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), this.collapseAnimation);
        animationLoadAnimation.setFillAfter(true);
        this.expandIcon.startAnimation(animationLoadAnimation);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC19452b());
    }

    /* renamed from: h */
    private final void m60998h() throws Resources.NotFoundException {
        this.expanded = true;
        this.expandableText.setVisibility(0);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), this.expandAnimation);
        animationLoadAnimation.setFillAfter(true);
        this.expandIcon.startAnimation(animationLoadAnimation);
    }

    /* renamed from: i */
    private final void m60999i(Context context, AttributeSet attrs) throws Resources.NotFoundException {
        int color;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C31931j.TextAppearance);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…styleable.TextAppearance)");
        int color2 = typedArrayObtainStyledAttributes.getColor(C31931j.TextAppearance_android_textColor, PhotoPassExtensionsUtils.QR_DEFAULT_FILLED_COLOR);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, C31931j.ExpandableTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…eable.ExpandableTextView)");
        this.expandText.setText(typedArrayObtainStyledAttributes2.getString(C31931j.ExpandableTextView_expandText));
        this.expandableText.setText(typedArrayObtainStyledAttributes2.getString(C31931j.ExpandableTextView_expandableText));
        this.expandText.setContentDescription(typedArrayObtainStyledAttributes2.getString(C31931j.ExpandableTextView_expandAccessibilityText));
        this.expandableText.setContentDescription(typedArrayObtainStyledAttributes2.getString(C31931j.ExpandableTextView_expandableAccessibilityText));
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes2.peekValue(C31931j.ExpandableTextView_expandTextStyle);
        if (typedValuePeekValue != null) {
            Intrinsics.checkNotNullExpressionValue(typedValuePeekValue, "peekValue(R.styleable.Ex…TextView_expandTextStyle)");
            this.expandText.setTextAppearance(typedValuePeekValue.resourceId);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes2.peekValue(C31931j.ExpandableTextView_expandableTextStyle);
        if (typedValuePeekValue2 != null) {
            Intrinsics.checkNotNullExpressionValue(typedValuePeekValue2, "peekValue(R.styleable.Ex…View_expandableTextStyle)");
            this.expandableText.setTextAppearance(typedValuePeekValue2.resourceId);
        }
        TypedValue typedValuePeekValue3 = typedArrayObtainStyledAttributes2.peekValue(C31931j.ExpandableTextView_expandTextColor);
        if (typedValuePeekValue3 != null) {
            Intrinsics.checkNotNullExpressionValue(typedValuePeekValue3, "peekValue(R.styleable.Ex…TextView_expandTextColor)");
            color = getResources().getColor(typedValuePeekValue3.resourceId, null);
        } else {
            color = color2;
        }
        this.expandIcon.setTextColor(color);
        this.expandText.setTextColor(color);
        TextView textView = this.expandableText;
        TypedValue typedValuePeekValue4 = typedArrayObtainStyledAttributes2.peekValue(C31931j.ExpandableTextView_expandableTextColor);
        if (typedValuePeekValue4 != null) {
            Intrinsics.checkNotNullExpressionValue(typedValuePeekValue4, "peekValue(R.styleable.Ex…View_expandableTextColor)");
            color2 = Integer.valueOf(getResources().getColor(typedValuePeekValue4.resourceId, null)).intValue();
        }
        textView.setTextColor(color2);
        TypedValue typedValuePeekValue5 = typedArrayObtainStyledAttributes2.peekValue(C31931j.ExpandableTextView_expandableTextMarginTop);
        if (typedValuePeekValue5 != null) {
            Intrinsics.checkNotNullExpressionValue(typedValuePeekValue5, "peekValue(R.styleable.Ex…_expandableTextMarginTop)");
            ViewGroup.LayoutParams layoutParams = this.expandableText.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = getResources().getDimensionPixelSize(typedValuePeekValue5.resourceId);
            Unit unit = Unit.INSTANCE;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* renamed from: j */
    private final void m61000j() throws Resources.NotFoundException {
        if (this.expanded) {
            m60997g();
        } else {
            m60998h();
        }
    }

    public final void setExpandCallback(Function1<? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.expandCallback = action;
    }

    public final void setState(boolean expanded) throws Resources.NotFoundException {
        this.expanded = expanded;
        m61000j();
    }

    public /* synthetic */ ExpandableTextView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpandableTextView(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.expandAnimation = C31924c.left_expand_textview;
        this.collapseAnimation = C31924c.left_collapse_textview;
        C32308c c32308cM98948c = C32308c.m98948c(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c32308cM98948c, "inflate(LayoutInflater.from(context), this, true)");
        TextView textView = c32308cM98948c.expandIconLeft;
        Intrinsics.checkNotNullExpressionValue(textView, "binder.expandIconLeft");
        this.expandIcon = textView;
        TextView textView2 = c32308cM98948c.expandText;
        Intrinsics.checkNotNullExpressionValue(textView2, "binder.expandText");
        this.expandText = textView2;
        TextView textView3 = c32308cM98948c.expandableText;
        Intrinsics.checkNotNullExpressionValue(textView3, "binder.expandableText");
        this.expandableText = textView3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31931j.ExpandableTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…eable.ExpandableTextView)");
        if (typedArrayObtainStyledAttributes.getInt(C31931j.ExpandableTextView_expandIcon, 0) == 1) {
            this.expandIcon.setVisibility(8);
            TextView textView4 = c32308cM98948c.expandIconRight;
            Intrinsics.checkNotNullExpressionValue(textView4, "binder.expandIconRight");
            this.expandIcon = textView4;
            textView4.setVisibility(0);
            this.expandAnimation = C31924c.right_expand_textview;
            this.collapseAnimation = C31924c.right_collapse_textview;
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        m60999i(context, attributeSet);
        this.expandIcon.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.qr_core.ui.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ExpandableTextView.m60993c(this.f42296a, view);
            }
        });
        this.expandText.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.qr_core.ui.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ExpandableTextView.m60994d(this.f42297a, view);
            }
        });
    }
}