package com.disney.wdpro.virtualqueue.core.fragments;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.support.anim.SnowballNextFlowAnimation;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingAttribute;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingEventName;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingScreenName;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentHowToVisitBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegate;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegateKt;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQImageUrlType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import p498da.InterfaceC27132a;

@Metadata(m92037d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0001ZB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001d\u0010Q\u001a\u0004\u0018\u00010L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR.\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020S0R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y¨\u0006["}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/HowToVisitFragment;", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueBaseFragment;", "Lda/a;", "<init>", "()V", "", "updateQueueInfo", "showNextScreen", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", "onBackPressed", "()Z", "", "getAnalyticsPageName", "()Ljava/lang/String;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "virtualQueueManager", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "getVirtualQueueManager", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "setVirtualQueueManager", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "getVirtualQueueAnalytics", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "setVirtualQueueAnalytics", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "getPicassoUtils", "()Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "setPicassoUtils", "(Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;)V", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/commons/j;", "getParkAppConfiguration", "()Lcom/disney/wdpro/commons/j;", "setParkAppConfiguration", "(Lcom/disney/wdpro/commons/j;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "performanceTracking", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "getPerformanceTracking", "()Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "setPerformanceTracking", "(Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;)V", "Landroid/graphics/Point;", "screenSize", "Landroid/graphics/Point;", "getScreenSize", "()Landroid/graphics/Point;", "setScreenSize", "(Landroid/graphics/Point;)V", "Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentHowToVisitBinding;", "binding$delegate", "Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentHowToVisitBinding;", "binding", "", "", "eventAttributes", "Ljava/util/Map;", "getEventAttributes", "()Ljava/util/Map;", "setEventAttributes", "(Ljava/util/Map;)V", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class HowToVisitFragment extends VirtualQueueBaseFragment implements InterfaceC27132a {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding = FragmentViewBindingDelegateKt.viewBinding(this, HowToVisitFragment$binding$2.INSTANCE);
    private Map<String, Object> eventAttributes = new LinkedHashMap();

    @Inject
    public C9314j parkAppConfiguration;

    @Inject
    public PerformanceTracking performanceTracking;

    @Inject
    public PicassoUtils picassoUtils;

    @Inject
    @Named("ScreenSize")
    public Point screenSize;

    @Inject
    public SharedPreferences sharedPreferences;

    @Inject
    public VirtualQueueAnalytics virtualQueueAnalytics;

    @Inject
    public VirtualQueueManager virtualQueueManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(HowToVisitFragment.class, "binding", "getBinding()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentHowToVisitBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/HowToVisitFragment$Companion;", "", "()V", "newInstance", "Lcom/disney/wdpro/virtualqueue/core/fragments/HowToVisitFragment;", "data", "Landroid/os/Bundle;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HowToVisitFragment newInstance(Bundle data) {
            HowToVisitFragment howToVisitFragment = new HowToVisitFragment();
            howToVisitFragment.setArguments(data);
            return howToVisitFragment;
        }

        private Companion() {
        }
    }

    private final VqFragmentHowToVisitBinding getBinding() {
        return (VqFragmentHowToVisitBinding) this.binding.getValue2((Fragment) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(HowToVisitFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getSharedPreferences().edit().putBoolean(VirtualQueueConstants.HAS_SHOWN_OVERVIEW_PAGE, true).apply();
        this$0.showNextScreen();
    }

    private final void showNextScreen() {
        getVirtualQueueAnalytics().trackContinueOverview();
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("queueId", "") : null;
        if (StringsKt.isBlank(string != null ? string : "")) {
            ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), SelectQueueFragment.INSTANCE.newInstance(getArguments()), new SnowballNextFlowAnimation(), false, false, false, 28, null);
        } else {
            ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), ReviewDetailsFragment.INSTANCE.newInstance(getArguments()), null, false, false, false, 30, null);
        }
    }

    private final void updateQueueInfo() {
        ImageView it;
        ImageView imageView;
        TextView textView;
        TextView textView2;
        TextView textView3;
        VirtualQueueThemer vqThemer = getVqThemer();
        VQStringType vQStringType = VQStringType.HowToVisitTitle;
        if (StringsKt.isBlank(VirtualQueueThemer.getString$default(vqThemer, vQStringType, null, false, 6, null))) {
            VqFragmentHowToVisitBinding binding = getBinding();
            TextView textView4 = binding != null ? binding.title : null;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        } else {
            VqFragmentHowToVisitBinding binding2 = getBinding();
            TextView textView5 = binding2 != null ? binding2.title : null;
            if (textView5 != null) {
                textView5.setText(VirtualQueueThemer.getString$default(vqThemer, vQStringType, null, false, 6, null));
            }
            VqFragmentHowToVisitBinding binding3 = getBinding();
            TextView textView6 = binding3 != null ? binding3.title : null;
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
        }
        VqFragmentHowToVisitBinding binding4 = getBinding();
        TextView textView7 = binding4 != null ? binding4.joinBullet : null;
        if (textView7 != null) {
            textView7.setText(VirtualQueueThemer.getString$default(vqThemer, VQStringType.HowToVisitBullet1, null, false, 6, null));
        }
        VqFragmentHowToVisitBinding binding5 = getBinding();
        TextView textView8 = binding5 != null ? binding5.notificationBullet : null;
        if (textView8 != null) {
            textView8.setText(VirtualQueueThemer.getString$default(vqThemer, VQStringType.HowToVisitBullet2, null, false, 6, null));
        }
        VqFragmentHowToVisitBinding binding6 = getBinding();
        TextView textView9 = binding6 != null ? binding6.scanText : null;
        if (textView9 != null) {
            textView9.setText(VirtualQueueThemer.getString$default(vqThemer, VQStringType.HowToVisitBullet3, null, false, 6, null));
        }
        VqFragmentHowToVisitBinding binding7 = getBinding();
        LinearLayout linearLayout = binding7 != null ? binding7.joinWrapper : null;
        if (linearLayout != null) {
            VqFragmentHowToVisitBinding binding8 = getBinding();
            linearLayout.setContentDescription((binding8 == null || (textView3 = binding8.joinBullet) == null) ? null : textView3.getText());
        }
        VqFragmentHowToVisitBinding binding9 = getBinding();
        LinearLayout linearLayout2 = binding9 != null ? binding9.notificationWrapper : null;
        if (linearLayout2 != null) {
            VqFragmentHowToVisitBinding binding10 = getBinding();
            linearLayout2.setContentDescription((binding10 == null || (textView2 = binding10.notificationBullet) == null) ? null : textView2.getText());
        }
        VqFragmentHowToVisitBinding binding11 = getBinding();
        LinearLayout linearLayout3 = binding11 != null ? binding11.scanWrapper : null;
        if (linearLayout3 != null) {
            VqFragmentHowToVisitBinding binding12 = getBinding();
            linearLayout3.setContentDescription((binding12 == null || (textView = binding12.scanText) == null) ? null : textView.getText());
        }
        VqFragmentHowToVisitBinding binding13 = getBinding();
        TextView textView10 = binding13 != null ? binding13.bullet1Icon : null;
        if (textView10 != null) {
            textView10.setText(VirtualQueueThemer.getPeptasiaIcon$default(vqThemer, VQIconType.HowToVisitBullet1Icon, null, 2, null));
        }
        VqFragmentHowToVisitBinding binding14 = getBinding();
        TextView textView11 = binding14 != null ? binding14.notificationIcon : null;
        if (textView11 != null) {
            textView11.setText(VirtualQueueThemer.getPeptasiaIcon$default(vqThemer, VQIconType.HowToVisitBullet2Icon, null, 2, null));
        }
        VqFragmentHowToVisitBinding binding15 = getBinding();
        TextView textView12 = binding15 != null ? binding15.bullet2Icon : null;
        if (textView12 != null) {
            textView12.setText(VirtualQueueThemer.getPeptasiaIcon$default(vqThemer, VQIconType.HowToVisitBullet3Icon, null, 2, null));
        }
        VqFragmentHowToVisitBinding binding16 = getBinding();
        TextView textView13 = binding16 != null ? binding16.heroPlaceholder : null;
        if (textView13 != null) {
            textView13.setText(VirtualQueueThemer.getPeptasiaIcon$default(vqThemer, VQIconType.HowToVisitPlaceholderIcon, null, 2, null));
        }
        VQStringType vQStringType2 = VQStringType.HowToVisitDisclaimer;
        if (StringsKt.isBlank(VirtualQueueThemer.getString$default(vqThemer, vQStringType2, null, false, 6, null))) {
            VqFragmentHowToVisitBinding binding17 = getBinding();
            TextView textView14 = binding17 != null ? binding17.disclaimerText : null;
            if (textView14 != null) {
                textView14.setVisibility(8);
            }
        } else {
            VqFragmentHowToVisitBinding binding18 = getBinding();
            TextView textView15 = binding18 != null ? binding18.disclaimerText : null;
            if (textView15 != null) {
                textView15.setText(VirtualQueueThemer.getString$default(vqThemer, vQStringType2, null, false, 6, null));
            }
            VqFragmentHowToVisitBinding binding19 = getBinding();
            TextView textView16 = binding19 != null ? binding19.disclaimerText : null;
            if (textView16 != null) {
                textView16.setVisibility(0);
            }
        }
        VqFragmentHowToVisitBinding binding20 = getBinding();
        ImageView imageView2 = binding20 != null ? binding20.heroImage : null;
        if (imageView2 != null) {
            imageView2.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) (getScreenSize().x * 0.5625f)));
        }
        VqFragmentHowToVisitBinding binding21 = getBinding();
        TextView textView17 = binding21 != null ? binding21.heroPlaceholder : null;
        if (textView17 != null) {
            VqFragmentHowToVisitBinding binding22 = getBinding();
            textView17.setLayoutParams((binding22 == null || (imageView = binding22.heroImage) == null) ? null : imageView.getLayoutParams());
        }
        VqFragmentHowToVisitBinding binding23 = getBinding();
        if (binding23 != null && (it = binding23.heroImage) != null) {
            PicassoUtils picassoUtils = getPicassoUtils();
            String imageUrl$default = VirtualQueueThemer.getImageUrl$default(vqThemer, VQImageUrlType.HowToVisitImageUrl, null, 2, null);
            Intrinsics.checkNotNullExpressionValue(it, "it");
            VqFragmentHowToVisitBinding binding24 = getBinding();
            PicassoUtils.loadImage$default(picassoUtils, imageUrl$default, it, null, binding24 != null ? binding24.heroPlaceholder : null, null, 20, null);
        }
        ActivityActions.DefaultImpls.setTitle$default(getActivityActions(), VirtualQueueThemer.getString$default(vqThemer, VQStringType.HowToVisitHeader, null, false, 6, null), false, 2, null);
        VqFragmentHowToVisitBinding binding25 = getBinding();
        Button button = binding25 != null ? binding25.continueButton : null;
        if (button == null) {
            return;
        }
        button.setText(VirtualQueueThemer.getString$default(vqThemer, VQStringType.HowToVisitMainCta, null, false, 6, null));
    }

    @Override // com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment, com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return "tools/virtualqueue/landing";
    }

    public final Map<String, Object> getEventAttributes() {
        return this.eventAttributes;
    }

    public final C9314j getParkAppConfiguration() {
        C9314j c9314j = this.parkAppConfiguration;
        if (c9314j != null) {
            return c9314j;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parkAppConfiguration");
        return null;
    }

    public final PerformanceTracking getPerformanceTracking() {
        PerformanceTracking performanceTracking = this.performanceTracking;
        if (performanceTracking != null) {
            return performanceTracking;
        }
        Intrinsics.throwUninitializedPropertyAccessException("performanceTracking");
        return null;
    }

    public final PicassoUtils getPicassoUtils() {
        PicassoUtils picassoUtils = this.picassoUtils;
        if (picassoUtils != null) {
            return picassoUtils;
        }
        Intrinsics.throwUninitializedPropertyAccessException("picassoUtils");
        return null;
    }

    public final Point getScreenSize() {
        Point point = this.screenSize;
        if (point != null) {
            return point;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenSize");
        return null;
    }

    public final SharedPreferences getSharedPreferences() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        return null;
    }

    public final VirtualQueueAnalytics getVirtualQueueAnalytics() {
        VirtualQueueAnalytics virtualQueueAnalytics = this.virtualQueueAnalytics;
        if (virtualQueueAnalytics != null) {
            return virtualQueueAnalytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("virtualQueueAnalytics");
        return null;
    }

    public final VirtualQueueManager getVirtualQueueManager() {
        VirtualQueueManager virtualQueueManager = this.virtualQueueManager;
        if (virtualQueueManager != null) {
            return virtualQueueManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("virtualQueueManager");
        return null;
    }

    @Override // p498da.InterfaceC27132a
    public boolean onBackPressed() {
        getVirtualQueueAnalytics().trackCloseOverview();
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        return false;
    }

    @Override // com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C21487R.layout.vq_fragment_how_to_visit, container, false);
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        PerformanceTracking performanceTracking = getPerformanceTracking();
        PerformanceTrackingScreenName performanceTrackingScreenName = PerformanceTrackingScreenName.HOW_TO_VISIT_SCREEN;
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "this.requireView()");
        PerformanceTracking.logLoadTime$default(performanceTracking, performanceTrackingScreenName, viewRequireView, "", true, false, 16, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Button button;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        VqFragmentHowToVisitBinding binding = getBinding();
        if (binding != null && (button = binding.continueButton) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.core.fragments.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    HowToVisitFragment.onViewCreated$lambda$0(this.f45227a, view2);
                }
            });
        }
        this.eventAttributes.put(PerformanceTrackingAttribute.LOAD_TIME_SCREEN_NAME.getAttrName(), PerformanceTrackingScreenName.HOW_TO_VISIT_SCREEN.getScreenName());
        getPerformanceTracking().logTimedActionStart(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        updateQueueInfo();
    }

    public final void setEventAttributes(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.eventAttributes = map;
    }

    public final void setParkAppConfiguration(C9314j c9314j) {
        Intrinsics.checkNotNullParameter(c9314j, "<set-?>");
        this.parkAppConfiguration = c9314j;
    }

    public final void setPerformanceTracking(PerformanceTracking performanceTracking) {
        Intrinsics.checkNotNullParameter(performanceTracking, "<set-?>");
        this.performanceTracking = performanceTracking;
    }

    public final void setPicassoUtils(PicassoUtils picassoUtils) {
        Intrinsics.checkNotNullParameter(picassoUtils, "<set-?>");
        this.picassoUtils = picassoUtils;
    }

    public final void setScreenSize(Point point) {
        Intrinsics.checkNotNullParameter(point, "<set-?>");
        this.screenSize = point;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setVirtualQueueAnalytics(VirtualQueueAnalytics virtualQueueAnalytics) {
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "<set-?>");
        this.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public final void setVirtualQueueManager(VirtualQueueManager virtualQueueManager) {
        Intrinsics.checkNotNullParameter(virtualQueueManager, "<set-?>");
        this.virtualQueueManager = virtualQueueManager;
    }
}