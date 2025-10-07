package com.disney.wdpro.universal_checkout_ui.p459ui.custom_views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C3296a;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.support.accessibility.C20511d;
import com.disney.wdpro.support.util.C20933b0;
import com.disney.wdpro.universal_checkout_ui.C21435R;

/* loaded from: classes20.dex */
public class SnowballHeader extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private View mDivider;
    private LottieAnimationView mHeaderViewLogo;
    private TextSwitcher mHeaderViewTitle;
    private RelativeLayout mRightViewContainer;
    private Toolbar mToolbar;
    private View viewOpacity;

    public SnowballHeader(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ View lambda$new$0(Context context, AttributeSet attributeSet, int i10) {
        TextView textView = new TextView(context);
        textView.setTextAppearance(context, getTitleTextAppearance(context, attributeSet, i10));
        textView.setGravity(17);
        textView.setFocusableInTouchMode(false);
        textView.setFocusable(false);
        textView.setImportantForAccessibility(2);
        return textView;
    }

    private void setDisplayNavigationDrawerIcon(AppCompatActivity appCompatActivity) {
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo913y(true);
            supportActionBar.mo910v(true);
        }
    }

    private void setSnowballHeaderTitlePadding(boolean z10) {
        int dimension = z10 ? (int) getContext().getResources().getDimension(C21435R.dimen.snowball_title_padding_right) : 0;
        getHeaderViewLogo().setPadding(0, 0, dimension, 0);
        getHeaderViewTitle().setPadding(0, 0, dimension, 0);
    }

    public void addRightView(View view) {
        this.mRightViewContainer.addView(view);
        this.mRightViewContainer.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void announceTitleContentDescription() {
        this.mHeaderViewTitle.post(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.custom_views.SnowballHeader.2
            @Override // java.lang.Runnable
            public void run() {
                SnowballHeader.this.mHeaderViewTitle.announceForAccessibility(SnowballHeader.this.mHeaderViewTitle.getContentDescription());
            }
        });
    }

    public void disable(float f10) {
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        layoutParams.height = childAt.getHeight();
        this.viewOpacity.setLayoutParams(layoutParams);
        this.viewOpacity.setAlpha(f10);
        addView(this.viewOpacity);
    }

    public void enable() {
        removeView(this.viewOpacity);
    }

    public void focusTitleInAccessibilityMode() {
        this.mHeaderViewTitle.post(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.custom_views.SnowballHeader.3
            @Override // java.lang.Runnable
            public void run() {
                SnowballHeader.this.mHeaderViewTitle.sendAccessibilityEvent(8);
            }
        });
    }

    public View getDividerView() {
        return this.mDivider;
    }

    public LottieAnimationView getHeaderViewLogo() {
        return this.mHeaderViewLogo;
    }

    public TextSwitcher getHeaderViewTitle() {
        return this.mHeaderViewTitle;
    }

    protected int getResourceLayoutId() {
        return C21435R.layout.universal_checkout_snowball_header_view;
    }

    public RelativeLayout getRightViewContainer() {
        return this.mRightViewContainer;
    }

    protected int getTitleTextAppearance(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C21435R.styleable.SnowballHeader, i10, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C21435R.styleable.SnowballHeader_titleTextAppearance, C21435R.style.TWDCFont_Roman_H2_D_Bold_ExtraBold);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public Toolbar getToolbar() {
        return this.mToolbar;
    }

    public void hide() {
        setVisibility(8);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.mRightViewContainer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int width = this.mRightViewContainer.getWidth() + ((int) getContext().getResources().getDimension(C21435R.dimen.snowball_horizontal_margin));
        if (this.mToolbar.getNavigationIcon() == null) {
            getHeaderViewLogo().setPadding(width, 0, width, 0);
            getHeaderViewTitle().setPadding(width, 0, width, 0);
            return;
        }
        int dimension = (int) getContext().getResources().getDimension(C21435R.dimen.snowball_title_padding_right);
        if (dimension < width) {
            int i10 = width - dimension;
            getHeaderViewLogo().setPadding(i10, 0, width, 0);
            getHeaderViewTitle().setPadding(i10, 0, width, 0);
        }
    }

    public void setHeaderLogoAnim(int i10) {
        this.mHeaderViewLogo.setAnimation(i10);
        onGlobalLayout();
    }

    public void setHeaderLogoImage(int i10) {
        this.mHeaderViewLogo.setImageResource(i10);
        onGlobalLayout();
    }

    public void setHeaderTitle(CharSequence charSequence) {
        this.mHeaderViewTitle.setText(charSequence);
        setTitleContentDescription(String.valueOf(charSequence));
        onGlobalLayout();
    }

    public void setHeaderViewLogo(LottieAnimationView lottieAnimationView) {
        this.mHeaderViewLogo = lottieAnimationView;
    }

    public void setHeaderViewTitle(TextSwitcher textSwitcher) {
        this.mHeaderViewTitle = textSwitcher;
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(C3296a.getDrawable(getContext(), i10));
    }

    public void setNavigationIconColor(int i10) {
        if (this.mToolbar.getNavigationIcon() != null) {
            this.mToolbar.getNavigationIcon().setColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setScreenTitleContentDescriptionWithoutHeading(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHeaderViewTitle.setContentDescription(new C20511d(getContext()).m62027f(str).m62034m());
    }

    public void setTitleAnimation(int i10, int i11) {
        this.mHeaderViewTitle.setInAnimation(getContext(), i10);
        this.mHeaderViewTitle.setOutAnimation(getContext(), i11);
    }

    public void setTitleContentDescription(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHeaderViewTitle.setContentDescription(new C20511d(getContext()).m62027f(str).m62029h(C21435R.string.accessibility_heading_suffix).m62034m());
    }

    public void setTitleContentDescriptionAndAnnounce(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHeaderViewTitle.post(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.custom_views.SnowballHeader.1
            @Override // java.lang.Runnable
            public void run() {
                SnowballHeader.this.setTitleContentDescription(str);
                SnowballHeader.this.mHeaderViewTitle.announceForAccessibility(str);
            }
        });
    }

    public void setTitleInAnimation(int i10) {
        this.mHeaderViewTitle.setInAnimation(getContext(), i10);
    }

    public void setTitleOutAnimation(int i10) {
        this.mHeaderViewTitle.setOutAnimation(getContext(), i10);
    }

    public void setToolbar(Toolbar toolbar) {
        this.mToolbar = toolbar;
    }

    public void setUpNavigationDrawer(AppCompatActivity appCompatActivity) {
        setUpSnowBallHeaderAsActionBar(appCompatActivity);
        setSnowballHeaderTitlePadding(true);
        setDisplayNavigationDrawerIcon(appCompatActivity);
    }

    public void setUpSnowBallHeaderAsActionBar(AppCompatActivity appCompatActivity) {
        if (appCompatActivity != null) {
            appCompatActivity.setSupportActionBar(getToolbar());
        }
    }

    public void show() {
        setVisibility(0);
    }

    public SnowballHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SnowballHeader(final Context context, final AttributeSet attributeSet, final int i10) {
        super(context, attributeSet, i10);
        View viewInflate = LayoutInflater.from(context).inflate(getResourceLayoutId(), (ViewGroup) this, true);
        this.mToolbar = (Toolbar) viewInflate.findViewById(C21435R.id.uc_snowball_toolbar);
        this.mHeaderViewLogo = (LottieAnimationView) viewInflate.findViewById(C21435R.id.uc_snowball_header_screen_logo);
        TextSwitcher textSwitcher = (TextSwitcher) viewInflate.findViewById(C21435R.id.uc_snowball_header_screen_name);
        this.mHeaderViewTitle = textSwitcher;
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.disney.wdpro.universal_checkout_ui.ui.custom_views.a
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                return this.f45077a.lambda$new$0(context, attributeSet, i10);
            }
        });
        this.mHeaderViewTitle.setInAnimation(context, R.anim.fade_in);
        this.mHeaderViewTitle.setOutAnimation(context, R.anim.fade_out);
        this.mRightViewContainer = (RelativeLayout) viewInflate.findViewById(C21435R.id.uc_snowball_header_right_container);
        this.mDivider = viewInflate.findViewById(C21435R.id.uc_snowball_header_hr);
        View view = new View(context);
        this.viewOpacity = view;
        view.setClickable(false);
        this.viewOpacity.setBackgroundColor(C3296a.getColor(context, C21435R.color.white));
        C20933b0.m63231x(this.viewOpacity);
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            drawable.setColorFilter(0, PorterDuff.Mode.DST);
        }
        this.mToolbar.setNavigationIcon(drawable);
        setSnowballHeaderTitlePadding(drawable != null);
    }
}