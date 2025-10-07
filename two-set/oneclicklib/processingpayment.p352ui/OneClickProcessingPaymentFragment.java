package com.disney.wdpro.oneclicklib.processingpayment.p352ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.view.C3821v0;
import androidx.view.C3827w0;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.oneclicklib.common.OneClickPaymentEvent;
import com.disney.wdpro.oneclicklib.common.viewmodel.OneClickViewModel;
import com.disney.wdpro.photopass.services.dto.CBAssets;
import com.disney.wdpro.photopass.services.dto.CBProcessPayment;
import com.disney.wdpro.photopass.services.dto.CBProcessing;
import com.disney.wdpro.photopass.services.dto.CBText;
import com.disney.wdpro.photopasscommons.ext.AndroidExtKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mk.C30536a;
import mk.C30537b;
import p1043wk.OneClickOrderConfirmationUI;
import p1114yk.OneClickProcessingPaymentUIData;
import p1148zk.C34016a;
import p878qk.AbstractC31720c;
import p878qk.AbstractC31721d;
import p914rk.C31917a;
import uk.InterfaceC32450b;

@Metadata(m92037d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 A2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00109R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/processingpayment/ui/OneClickProcessingPaymentFragment;", "Lcom/disney/wdpro/commons/BaseFragment;", "<init>", "()V", "", "setUpObservers", "Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "setUpUI", "(Landroid/view/View;)V", "Lyk/a;", "screenData", "D0", "(Lyk/a;)V", "Lqk/d;", "Lwk/a;", "confirmOrderState", "y0", "(Lqk/d;)V", "order", "B0", "(Lwk/a;)V", "Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent;", "event", "C0", "(Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getAnalyticsPageName", "()Ljava/lang/String;", "Landroidx/lifecycle/v0$c;", "viewModelFactory", "Landroidx/lifecycle/v0$c;", "getViewModelFactory", "()Landroidx/lifecycle/v0$c;", "setViewModelFactory", "(Landroidx/lifecycle/v0$c;)V", "Lzk/a;", "oneClickProcessingPaymentViewModel$delegate", "Lkotlin/Lazy;", "z0", "()Lzk/a;", "oneClickProcessingPaymentViewModel", "Lcom/disney/wdpro/oneclicklib/common/viewmodel/OneClickViewModel;", "oneClickViewModel$delegate", "A0", "()Lcom/disney/wdpro/oneclicklib/common/viewmodel/OneClickViewModel;", "oneClickViewModel", "Lcom/airbnb/lottie/LottieAnimationView;", "processingPaymentAnimation", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/widget/TextView;", "processingPaymentText", "Landroid/widget/TextView;", "Companion", "a", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes3.dex */
public final class OneClickProcessingPaymentFragment extends BaseFragment {
    public static final String lottieRepeatCount = "ONCE";

    /* renamed from: oneClickProcessingPaymentViewModel$delegate, reason: from kotlin metadata */
    private final Lazy oneClickProcessingPaymentViewModel = LazyKt.lazy(new Function0<C34016a>() { // from class: com.disney.wdpro.oneclicklib.processingpayment.ui.OneClickProcessingPaymentFragment$oneClickProcessingPaymentViewModel$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C34016a invoke() {
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return (C34016a) C3827w0.m20290f(fragmentActivityRequireActivity, this.this$0.getViewModelFactory()).m20262a(C34016a.class);
        }
    });

    /* renamed from: oneClickViewModel$delegate, reason: from kotlin metadata */
    private final Lazy oneClickViewModel = LazyKt.lazy(new Function0<OneClickViewModel>() { // from class: com.disney.wdpro.oneclicklib.processingpayment.ui.OneClickProcessingPaymentFragment$oneClickViewModel$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final OneClickViewModel invoke() {
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return (OneClickViewModel) C3827w0.m20290f(fragmentActivityRequireActivity, this.this$0.getViewModelFactory()).m20262a(OneClickViewModel.class);
        }
    });
    private LottieAnimationView processingPaymentAnimation;
    private TextView processingPaymentText;

    @Inject
    public C3821v0.c viewModelFactory;

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.processingpayment.ui.OneClickProcessingPaymentFragment$setUpObservers$1 */
    /* synthetic */ class C166251 extends FunctionReferenceImpl implements Function1<OneClickProcessingPaymentUIData, Unit> {
        C166251(Object obj) {
            super(1, obj, OneClickProcessingPaymentFragment.class, "setUpUIData", "setUpUIData(Lcom/disney/wdpro/oneclicklib/processingpayment/model/OneClickProcessingPaymentUIData;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OneClickProcessingPaymentUIData oneClickProcessingPaymentUIData) {
            invoke2(oneClickProcessingPaymentUIData);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OneClickProcessingPaymentUIData p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((OneClickProcessingPaymentFragment) this.receiver).m56556D0(p02);
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.processingpayment.ui.OneClickProcessingPaymentFragment$setUpObservers$2 */
    /* synthetic */ class C166262 extends FunctionReferenceImpl implements Function1<AbstractC31721d<? extends OneClickOrderConfirmationUI>, Unit> {
        C166262(Object obj) {
            super(1, obj, OneClickProcessingPaymentFragment.class, "confirmOrderState", "confirmOrderState(Lcom/disney/wdpro/oneclicklib/common/OneClickState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC31721d<? extends OneClickOrderConfirmationUI> abstractC31721d) {
            invoke2((AbstractC31721d<OneClickOrderConfirmationUI>) abstractC31721d);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AbstractC31721d<OneClickOrderConfirmationUI> p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((OneClickProcessingPaymentFragment) this.receiver).m56560y0(p02);
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.processingpayment.ui.OneClickProcessingPaymentFragment$setUpObservers$3 */
    /* synthetic */ class C166273 extends FunctionReferenceImpl implements Function1<OneClickPaymentEvent, Unit> {
        C166273(Object obj) {
            super(1, obj, OneClickProcessingPaymentFragment.class, "onProcessPaymentEvent", "onProcessPaymentEvent(Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OneClickPaymentEvent oneClickPaymentEvent) {
            invoke2(oneClickPaymentEvent);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OneClickPaymentEvent p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((OneClickProcessingPaymentFragment) this.receiver).m56555C0(p02);
        }
    }

    /* renamed from: A0 */
    private final OneClickViewModel m56553A0() {
        return (OneClickViewModel) this.oneClickViewModel.getValue();
    }

    /* renamed from: B0 */
    private final void m56554B0(OneClickOrderConfirmationUI order) {
        getParentFragmentManager().m19739h1();
        m56553A0().m56520Q(new AbstractC31720c.NavigateToOrderConfirmation(order));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public final void m56555C0(OneClickPaymentEvent event) {
        if (event instanceof OneClickPaymentEvent.PaymentFailed) {
            getParentFragmentManager().m19739h1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public final void m56556D0(OneClickProcessingPaymentUIData screenData) {
        CBProcessPayment processingPaymentScreen = screenData.getProcessingPaymentScreen();
        LottieAnimationView lottieAnimationView = null;
        if (processingPaymentScreen != null) {
            TextView textView = this.processingPaymentText;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("processingPaymentText");
                textView = null;
            }
            CBText inlineLoaderMessage = processingPaymentScreen.getInlineLoaderMessage();
            textView.setText(inlineLoaderMessage != null ? inlineLoaderMessage.getText() : null);
            CBText inlineLoaderMessage2 = processingPaymentScreen.getInlineLoaderMessage();
            textView.setContentDescription(inlineLoaderMessage2 != null ? inlineLoaderMessage2.getAccessibility() : null);
            textView.requestFocus();
            textView.sendAccessibilityEvent(8);
        }
        CBAssets assets = screenData.getAssets();
        if (assets != null) {
            LottieAnimationView lottieAnimationView2 = this.processingPaymentAnimation;
            if (lottieAnimationView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("processingPaymentAnimation");
                lottieAnimationView2 = null;
            }
            CBProcessing processingPayment = assets.getProcessingPayment();
            lottieAnimationView2.setAnimationFromUrl(processingPayment != null ? processingPayment.getSrc() : null);
            CBProcessing processingPayment2 = assets.getProcessingPayment();
            if (StringsKt.equals$default(processingPayment2 != null ? processingPayment2.getRepeatMode() : null, lottieRepeatCount, false, 2, null)) {
                LottieAnimationView lottieAnimationView3 = this.processingPaymentAnimation;
                if (lottieAnimationView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("processingPaymentAnimation");
                } else {
                    lottieAnimationView = lottieAnimationView3;
                }
                lottieAnimationView.setRepeatCount(1);
                return;
            }
            LottieAnimationView lottieAnimationView4 = this.processingPaymentAnimation;
            if (lottieAnimationView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("processingPaymentAnimation");
            } else {
                lottieAnimationView = lottieAnimationView4;
            }
            lottieAnimationView.setRepeatCount(-1);
        }
    }

    private final void setUpObservers() {
        AndroidExtKt.m60560a(this, m56561z0().m102914v(), new C166251(this));
        AndroidExtKt.m60560a(this, m56553A0().m56509C(), new C166262(this));
        AndroidExtKt.m60560a(this, m56553A0().getPaymentEventsLiveData(), new C166273(this));
    }

    private final void setUpUI(View view) {
        View viewFindViewById = view.findViewById(C30536a.processing_payment_lottie_animation);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.proces…payment_lottie_animation)");
        this.processingPaymentAnimation = (LottieAnimationView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(C30536a.processing_payment_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.processing_payment_text)");
        this.processingPaymentText = (TextView) viewFindViewById2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public final void m56560y0(AbstractC31721d<OneClickOrderConfirmationUI> confirmOrderState) {
        if (confirmOrderState instanceof AbstractC31721d.Success) {
            m56554B0((OneClickOrderConfirmationUI) ((AbstractC31721d.Success) confirmOrderState).m97379a());
        } else if (confirmOrderState instanceof AbstractC31721d.Error) {
            m56553A0().generateGeneralPaymentError();
        }
    }

    /* renamed from: z0 */
    private final C34016a m56561z0() {
        return (C34016a) this.oneClickProcessingPaymentViewModel.getValue();
    }

    @Override // com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return "";
    }

    public final C3821v0.c getViewModelFactory() {
        C3821v0.c cVar = this.viewModelFactory;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentActivity activity = getActivity();
        Object applicationContext = activity != null ? activity.getApplicationContext() : null;
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type com.disney.wdpro.oneclicklib.di.OneClickComponentProvider");
        ((InterfaceC32450b) applicationContext).m99489a();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C30537b.fragment_one_click_processing_payment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflater.inflate(R.layou…ayment, container, false)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setUpUI(view);
        setUpObservers();
        C31917a c31917a = C31917a.INSTANCE;
        InterfaceC8679k analyticsHelper = this.analyticsHelper;
        Intrinsics.checkNotNullExpressionValue(analyticsHelper, "analyticsHelper");
        c31917a.m98086a(analyticsHelper, m56561z0().getProcessPaymentAnalytics(), "content/photopass/ARplus/Legacy/OneClickCheckout/Purchase");
    }
}