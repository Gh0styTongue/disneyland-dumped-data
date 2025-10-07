package com.disney.wdpro.qr_core.p424ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
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
import tm.C32309d;

@Metadata(m92037d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 22\u00020\u0001:\u00013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ!\u0010\u0014\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0016\u0010!\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0016\u0010\"\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u0016\u0010#\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0016\u0010$\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0016\u0010%\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001bR\u0016\u0010&\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001bR\u0016\u0010'\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001bR\u0016\u0010(\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001bR\u0016\u0010)\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001bR\u0016\u0010*\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001bR\u0016\u0010+\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001bR\u0016\u0010,\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001bR\u0016\u0010-\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001bR\u0016\u0010\u0016\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010.R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100¨\u00064"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/ui/ExpandableTextViewIcons;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "i", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "j", "()V", "h", "g", "Lkotlin/Function1;", "", "action", "setExpandCallback", "(Lkotlin/jvm/functions/Function1;)V", "expanded", "setState", "(Z)V", "Landroid/widget/TextView;", "expandIcon", "Landroid/widget/TextView;", "expandText", "expandQRCodeDisclaimer", "expandCallback", "Lkotlin/jvm/functions/Function1;", "expandQRCodeDisclaimerTwo", "expandIconIconLink", "expandQRCodeDisclaimerThree", "expandIconAllParks", "expandQRCodeDisclaimerFour", "expandIconAllParksTwo", "expandQRCodeDisclaimerBullet", "expandQRCodeDisclaimerBulletTwo", "expandQRCodeDisclaimerBulletThree", "expandQRCodeDisclaimerBulletFour", "expandQRCodeDisclaimerBulletFive", "expandIconFriendsFamily", "expandQRCodeDisclaimerFive", "expandQRCodeDisclaimerSix", "Z", "expandAnimation", "I", "collapseAnimation", "Companion", "a", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nExpandableTextViewIcons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpandableTextViewIcons.kt\ncom/disney/wdpro/qr_core/ui/ExpandableTextViewIcons\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,190:1\n233#2,3:191\n233#2:194\n233#2,3:195\n234#2,2:198\n*S KotlinDebug\n*F\n+ 1 ExpandableTextViewIcons.kt\ncom/disney/wdpro/qr_core/ui/ExpandableTextViewIcons\n*L\n76#1:191,3\n93#1:194\n95#1:195,3\n93#1:198,2\n*E\n"})
/* loaded from: classes16.dex */
public final class ExpandableTextViewIcons extends LinearLayout {
    private static final int ICON_LEFT = 0;
    private static final int ICON_RIGHT = 1;
    private int collapseAnimation;
    private int expandAnimation;
    private Function1<? super Boolean, Unit> expandCallback;
    private TextView expandIcon;
    private TextView expandIconAllParks;
    private TextView expandIconAllParksTwo;
    private TextView expandIconFriendsFamily;
    private TextView expandIconIconLink;
    private TextView expandQRCodeDisclaimer;
    private TextView expandQRCodeDisclaimerBullet;
    private TextView expandQRCodeDisclaimerBulletFive;
    private TextView expandQRCodeDisclaimerBulletFour;
    private TextView expandQRCodeDisclaimerBulletThree;
    private TextView expandQRCodeDisclaimerBulletTwo;
    private TextView expandQRCodeDisclaimerFive;
    private TextView expandQRCodeDisclaimerFour;
    private TextView expandQRCodeDisclaimerSix;
    private TextView expandQRCodeDisclaimerThree;
    private TextView expandQRCodeDisclaimerTwo;
    private TextView expandText;
    private boolean expanded;

    @Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m92038d2 = {"com/disney/wdpro/qr_core/ui/ExpandableTextViewIcons$b", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.qr_core.ui.ExpandableTextViewIcons$b */
    public static final class AnimationAnimationListenerC19454b implements Animation.AnimationListener {
        AnimationAnimationListenerC19454b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Function1 function1 = ExpandableTextViewIcons.this.expandCallback;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(ExpandableTextViewIcons.this.expanded));
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
    public ExpandableTextViewIcons(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m61003c(ExpandableTextViewIcons this$0, View view) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m61010j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m61004d(ExpandableTextViewIcons this$0, View view) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m61010j();
    }

    /* renamed from: g */
    private final void m61007g() throws Resources.NotFoundException {
        this.expanded = false;
        this.expandQRCodeDisclaimer.setVisibility(8);
        this.expandQRCodeDisclaimerTwo.setVisibility(8);
        this.expandIconIconLink.setVisibility(8);
        this.expandQRCodeDisclaimerThree.setVisibility(8);
        this.expandIconAllParks.setVisibility(8);
        this.expandIconAllParksTwo.setVisibility(8);
        this.expandQRCodeDisclaimerFour.setVisibility(8);
        this.expandQRCodeDisclaimerBullet.setVisibility(8);
        this.expandQRCodeDisclaimerBulletTwo.setVisibility(8);
        this.expandQRCodeDisclaimerBulletThree.setVisibility(8);
        this.expandQRCodeDisclaimerBulletFour.setVisibility(8);
        this.expandQRCodeDisclaimerBulletFive.setVisibility(8);
        this.expandIconFriendsFamily.setVisibility(8);
        this.expandQRCodeDisclaimerFive.setVisibility(8);
        this.expandQRCodeDisclaimerSix.setVisibility(8);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), this.collapseAnimation);
        animationLoadAnimation.setFillAfter(true);
        this.expandIcon.startAnimation(animationLoadAnimation);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC19454b());
    }

    /* renamed from: h */
    private final void m61008h() throws Resources.NotFoundException {
        this.expanded = true;
        this.expandQRCodeDisclaimer.setVisibility(0);
        this.expandQRCodeDisclaimerTwo.setVisibility(0);
        this.expandIconIconLink.setVisibility(0);
        this.expandQRCodeDisclaimerThree.setVisibility(0);
        this.expandIconAllParks.setVisibility(0);
        this.expandIconAllParksTwo.setVisibility(0);
        this.expandQRCodeDisclaimerFour.setVisibility(0);
        this.expandQRCodeDisclaimerBullet.setVisibility(0);
        this.expandQRCodeDisclaimerBulletTwo.setVisibility(0);
        this.expandQRCodeDisclaimerBulletThree.setVisibility(0);
        this.expandQRCodeDisclaimerBulletFour.setVisibility(0);
        this.expandQRCodeDisclaimerBulletFive.setVisibility(0);
        this.expandIconFriendsFamily.setVisibility(0);
        this.expandQRCodeDisclaimerFive.setVisibility(0);
        this.expandQRCodeDisclaimerSix.setVisibility(0);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), this.expandAnimation);
        animationLoadAnimation.setFillAfter(true);
        this.expandIcon.startAnimation(animationLoadAnimation);
    }

    /* renamed from: i */
    private final void m61009i(Context context, AttributeSet attrs) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C31931j.ExpandableTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…eable.ExpandableTextView)");
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, C31931j.TextAppearance);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…styleable.TextAppearance)");
        int color = typedArrayObtainStyledAttributes2.getColor(C31931j.TextAppearance_android_textColor, PhotoPassExtensionsUtils.QR_DEFAULT_FILLED_COLOR);
        typedArrayObtainStyledAttributes2.recycle();
        this.expandText.setText(typedArrayObtainStyledAttributes.getString(C31931j.ExpandableTextView_expandText));
        this.expandText.setContentDescription(typedArrayObtainStyledAttributes.getString(C31931j.ExpandableTextView_expandAccessibilityText));
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(C31931j.ExpandableTextView_expandTextStyle);
        if (typedValuePeekValue != null) {
            Intrinsics.checkNotNullExpressionValue(typedValuePeekValue, "peekValue(R.styleable.Ex…TextView_expandTextStyle)");
            this.expandText.setTextAppearance(typedValuePeekValue.resourceId);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(C31931j.ExpandableTextView_expandTextColor);
        if (typedValuePeekValue2 != null) {
            Intrinsics.checkNotNullExpressionValue(typedValuePeekValue2, "peekValue(R.styleable.Ex…TextView_expandTextColor)");
            color = getResources().getColor(typedValuePeekValue2.resourceId, null);
        }
        this.expandIcon.setTextColor(color);
        this.expandText.setTextColor(color);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: j */
    private final void m61010j() throws Resources.NotFoundException {
        if (this.expanded) {
            m61007g();
        } else {
            m61008h();
        }
    }

    public final void setExpandCallback(Function1<? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.expandCallback = action;
    }

    public final void setState(boolean expanded) {
        this.expanded = expanded;
        m61010j();
    }

    public /* synthetic */ ExpandableTextViewIcons(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpandableTextViewIcons(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.expandAnimation = C31924c.left_expand_textview;
        this.collapseAnimation = C31924c.left_collapse_textview;
        C32309d c32309dM98951c = C32309d.m98951c(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c32309dM98951c, "inflate(LayoutInflater.from(context), this, true)");
        TextView textView = c32309dM98951c.expandIconLeft;
        Intrinsics.checkNotNullExpressionValue(textView, "binder.expandIconLeft");
        this.expandIcon = textView;
        TextView textView2 = c32309dM98951c.expandText;
        Intrinsics.checkNotNullExpressionValue(textView2, "binder.expandText");
        this.expandText = textView2;
        TextView textView3 = c32309dM98951c.tvQrDisclaimer1;
        Intrinsics.checkNotNullExpressionValue(textView3, "binder.tvQrDisclaimer1");
        this.expandQRCodeDisclaimer = textView3;
        TextView textView4 = c32309dM98951c.tvQrDisclaimer2;
        Intrinsics.checkNotNullExpressionValue(textView4, "binder.tvQrDisclaimer2");
        this.expandQRCodeDisclaimerTwo = textView4;
        TextView textView5 = c32309dM98951c.iconLinkExistingReservation;
        Intrinsics.checkNotNullExpressionValue(textView5, "binder.iconLinkExistingReservation");
        this.expandIconIconLink = textView5;
        TextView textView6 = c32309dM98951c.tvQrDisclaimer3;
        Intrinsics.checkNotNullExpressionValue(textView6, "binder.tvQrDisclaimer3");
        this.expandQRCodeDisclaimerThree = textView6;
        TextView textView7 = c32309dM98951c.allParksIcon;
        Intrinsics.checkNotNullExpressionValue(textView7, "binder.allParksIcon");
        this.expandIconAllParks = textView7;
        TextView textView8 = c32309dM98951c.tvQrDisclaimer4;
        Intrinsics.checkNotNullExpressionValue(textView8, "binder.tvQrDisclaimer4");
        this.expandQRCodeDisclaimerFour = textView8;
        TextView textView9 = c32309dM98951c.allParksIconTwo;
        Intrinsics.checkNotNullExpressionValue(textView9, "binder.allParksIconTwo");
        this.expandIconAllParksTwo = textView9;
        TextView textView10 = c32309dM98951c.tvDisclaimerBullet1;
        Intrinsics.checkNotNullExpressionValue(textView10, "binder.tvDisclaimerBullet1");
        this.expandQRCodeDisclaimerBullet = textView10;
        TextView textView11 = c32309dM98951c.tvDisclaimerBullet2;
        Intrinsics.checkNotNullExpressionValue(textView11, "binder.tvDisclaimerBullet2");
        this.expandQRCodeDisclaimerBulletTwo = textView11;
        TextView textView12 = c32309dM98951c.tvDisclaimerBullet3;
        Intrinsics.checkNotNullExpressionValue(textView12, "binder.tvDisclaimerBullet3");
        this.expandQRCodeDisclaimerBulletThree = textView12;
        TextView textView13 = c32309dM98951c.tvDisclaimerBullet4;
        Intrinsics.checkNotNullExpressionValue(textView13, "binder.tvDisclaimerBullet4");
        this.expandQRCodeDisclaimerBulletFour = textView13;
        TextView textView14 = c32309dM98951c.tvDisclaimerBullet5;
        Intrinsics.checkNotNullExpressionValue(textView14, "binder.tvDisclaimerBullet5");
        this.expandQRCodeDisclaimerBulletFive = textView14;
        TextView textView15 = c32309dM98951c.tvQrDisclaimer5;
        Intrinsics.checkNotNullExpressionValue(textView15, "binder.tvQrDisclaimer5");
        this.expandQRCodeDisclaimerFive = textView15;
        TextView textView16 = c32309dM98951c.iconFriendsFamily;
        Intrinsics.checkNotNullExpressionValue(textView16, "binder.iconFriendsFamily");
        this.expandIconFriendsFamily = textView16;
        TextView textView17 = c32309dM98951c.tvQrDisclamer6;
        Intrinsics.checkNotNullExpressionValue(textView17, "binder.tvQrDisclamer6");
        this.expandQRCodeDisclaimerSix = textView17;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31931j.ExpandableTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…eable.ExpandableTextView)");
        if (typedArrayObtainStyledAttributes.getInt(C31931j.ExpandableTextView_expandIcon, 0) == 1) {
            this.expandIcon.setVisibility(8);
            TextView textView18 = c32309dM98951c.expandIconRight;
            Intrinsics.checkNotNullExpressionValue(textView18, "binder.expandIconRight");
            this.expandIcon = textView18;
            textView18.setVisibility(0);
            this.expandAnimation = C31924c.right_expand_textview;
            this.collapseAnimation = C31924c.right_collapse_textview;
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        m61009i(context, attributeSet);
        this.expandIcon.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.qr_core.ui.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ExpandableTextViewIcons.m61003c(this.f42298a, view);
            }
        });
        this.expandText.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.qr_core.ui.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ExpandableTextViewIcons.m61004d(this.f42299a, view);
            }
        });
    }
}