package com.disney.wdpro.oneclicklib.checkout.p349ui;

import al.C0119a;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.view.C3821v0;
import androidx.view.C3827w0;
import com.disney.wdpro.bookingservices.checkout.CheckoutConstants;
import com.disney.wdpro.dinecheckin.analytics.CheckInEventHelper;
import com.disney.wdpro.oneclicklib.common.OneClickPaymentEvent;
import com.disney.wdpro.oneclicklib.common.viewmodel.OneClickViewModel;
import com.disney.wdpro.payments.models.BaseCardDetails;
import com.disney.wdpro.payments.models.ProcessedCards;
import com.disney.wdpro.payments.models.enums.CardTypeEnum;
import com.disney.wdpro.paymentsui.constants.PaymentsAnalyticsEvent;
import com.disney.wdpro.paymentsui.fragments.PaymentFragment;
import com.disney.wdpro.paymentsui.model.BasicCardDetails;
import com.disney.wdpro.paymentsui.model.DisplayCard;
import com.disney.wdpro.paymentsui.utils.DpayHighTrustError;
import com.disney.wdpro.photopass.services.model.LexVASDiscountGroupSTD;
import com.disney.wdpro.photopass.services.model.LexVASTicket;
import com.disney.wdpro.photopasscommons.ext.C18811e;
import com.disney.wdpro.support.activities.FoundationStackActivity;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p773nk.InterfaceC30666a;
import p804ok.LexVASUIData;
import p804ok.OneClickProductData;
import p878qk.AbstractC31719b;
import pk.C31542a;
import uk.InterfaceC32450b;

@Metadata(m92037d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001JB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u000e2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\rJ+\u0010(\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0004\b(\u0010)R\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/checkout/ui/OneClickCheckoutActivity;", "Lcom/disney/wdpro/support/activities/FoundationStackActivity;", "Lcom/disney/wdpro/paymentsui/fragments/PaymentFragment$OnPaymentReadyListener;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/disney/wdpro/paymentsui/model/DisplayCard;", "card", "onAppliedAmountChange", "(Lcom/disney/wdpro/paymentsui/model/DisplayCard;)V", "", "canModify", "onCanModifyAmount", "(Z)V", "processed", "Lcom/disney/wdpro/payments/models/ProcessedCards;", "cards", "", "error", "canRetry", "onCardsProcessed", "(ZLcom/disney/wdpro/payments/models/ProcessedCards;Ljava/lang/Throwable;Z)V", "ready", "", "Lcom/disney/wdpro/paymentsui/model/BasicCardDetails;", "onReadyToProcess", "(ZLjava/util/List;)V", "loaded", "onSessionLoaded", "(ZLjava/lang/Throwable;)V", "onOneClickPaymentEvent", "Lcom/disney/wdpro/paymentsui/constants/PaymentsAnalyticsEvent;", CheckoutConstants.ANALYTICS_COMMERCE_EVENT_NAME_KEY, "", "", "contextMap", CheckInEventHelper.CHECK_IN_TRACK_ACTION, "(Lcom/disney/wdpro/paymentsui/constants/PaymentsAnalyticsEvent;Ljava/util/Map;)V", "Landroidx/lifecycle/v0$c;", "viewModelFactory", "Landroidx/lifecycle/v0$c;", "getViewModelFactory", "()Landroidx/lifecycle/v0$c;", "setViewModelFactory", "(Landroidx/lifecycle/v0$c;)V", "Lal/a;", "bannerHelper", "Lal/a;", "getBannerHelper", "()Lal/a;", "setBannerHelper", "(Lal/a;)V", "Lpk/a;", "checkoutViewModel$delegate", "Lkotlin/Lazy;", "W", "()Lpk/a;", "checkoutViewModel", "Lcom/disney/wdpro/oneclicklib/common/viewmodel/OneClickViewModel;", "oneClickViewModel$delegate", "getOneClickViewModel", "()Lcom/disney/wdpro/oneclicklib/common/viewmodel/OneClickViewModel;", "oneClickViewModel", "Lcom/disney/wdpro/paymentsui/fragments/PaymentFragment;", "dPayFragment", "Lcom/disney/wdpro/paymentsui/fragments/PaymentFragment;", "Lcom/disney/wdpro/oneclicklib/checkout/ui/OneClickCheckoutFragment;", "oneClickCheckoutFragment", "Lcom/disney/wdpro/oneclicklib/checkout/ui/OneClickCheckoutFragment;", "Companion", "a", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes3.dex */
public final class OneClickCheckoutActivity extends FoundationStackActivity implements PaymentFragment.OnPaymentReadyListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String ONE_CLICK_PRODUCT_DATA = "OneClickProductData";
    public static final String PRODUCT = "product";
    private static InterfaceC30666a oneClickNavigator;

    @Inject
    public C0119a bannerHelper;
    private PaymentFragment dPayFragment;
    private OneClickCheckoutFragment oneClickCheckoutFragment;

    @Inject
    public C3821v0.c viewModelFactory;

    /* renamed from: checkoutViewModel$delegate, reason: from kotlin metadata */
    private final Lazy checkoutViewModel = LazyKt.lazy(new Function0<C31542a>() { // from class: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutActivity$checkoutViewModel$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C31542a invoke() {
            OneClickCheckoutActivity oneClickCheckoutActivity = this.this$0;
            return (C31542a) C3827w0.m20290f(oneClickCheckoutActivity, oneClickCheckoutActivity.getViewModelFactory()).m20262a(C31542a.class);
        }
    });

    /* renamed from: oneClickViewModel$delegate, reason: from kotlin metadata */
    private final Lazy oneClickViewModel = LazyKt.lazy(new Function0<OneClickViewModel>() { // from class: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutActivity$oneClickViewModel$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final OneClickViewModel invoke() {
            OneClickCheckoutActivity oneClickCheckoutActivity = this.this$0;
            return (OneClickViewModel) C3827w0.m20290f(oneClickCheckoutActivity, oneClickCheckoutActivity.getViewModelFactory()).m20262a(OneClickViewModel.class);
        }
    });

    @Metadata(m92037d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u0017"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/checkout/ui/OneClickCheckoutActivity$a;", "", "<init>", "()V", "Lcom/disney/wdpro/photopass/services/model/LexVASTicket;", "lexVASTicket", "Lok/a;", "a", "(Lcom/disney/wdpro/photopass/services/model/LexVASTicket;)Lok/a;", "Landroid/content/Context;", "context", "Lok/d;", "oneClickProductData", "Lnk/a;", "oneClickNavigator", "Landroid/content/Intent;", "b", "(Landroid/content/Context;Lcom/disney/wdpro/photopass/services/model/LexVASTicket;Lok/d;Lnk/a;)Landroid/content/Intent;", "", "ONE_CLICK_PRODUCT_DATA", "Ljava/lang/String;", "PRODUCT", "Lnk/a;", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final LexVASUIData m56466a(LexVASTicket lexVASTicket) {
            LexVASDiscountGroupSTD lexVASDiscountGroupSTD = (LexVASDiscountGroupSTD) CollectionsKt.first((List) lexVASTicket.getDiscountGroups().getSTD_GST());
            return new LexVASUIData(lexVASDiscountGroupSTD.getNames().getWdproMobileCaption().getText(), lexVASDiscountGroupSTD.getNames().getWdproMobileName().getText(), lexVASDiscountGroupSTD.getNames().getWdproMobileSubCaption().getText(), C18811e.m60570a(lexVASDiscountGroupSTD.getTotal()), lexVASTicket.getPolicies().getDisneyMemoryProductMobilePolicy().getDescriptions().getDisneyMemoryProductMobileDescription().getText(), lexVASTicket.getPolicies().getOnlineTicketTermsAndConditionsMuralOfMemoriesMobile().getDescriptions().getOnlineTicketTermsAndConditionsMuralOfMemoriesMobileTA().getText(), C18811e.m60570a(lexVASDiscountGroupSTD.getSubtotal()), C18811e.m60570a(lexVASDiscountGroupSTD.getTax()));
        }

        @JvmStatic
        /* renamed from: b */
        public final Intent m56467b(Context context, LexVASTicket lexVASTicket, OneClickProductData oneClickProductData, InterfaceC30666a oneClickNavigator) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(lexVASTicket, "lexVASTicket");
            Intrinsics.checkNotNullParameter(oneClickProductData, "oneClickProductData");
            OneClickCheckoutActivity.oneClickNavigator = oneClickNavigator;
            Intent intent = new Intent(context, (Class<?>) OneClickCheckoutActivity.class);
            intent.putExtra("product", OneClickCheckoutActivity.INSTANCE.m56466a(lexVASTicket));
            intent.putExtra(OneClickCheckoutActivity.ONE_CLICK_PRODUCT_DATA, oneClickProductData);
            return intent;
        }

        private Companion() {
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutActivity$b */
    public /* synthetic */ class C16597b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentsAnalyticsEvent.values().length];
            try {
                iArr[PaymentsAnalyticsEvent.Purchase.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: W */
    private final C31542a m56465W() {
        return (C31542a) this.checkoutViewModel.getValue();
    }

    private final OneClickViewModel getOneClickViewModel() {
        return (OneClickViewModel) this.oneClickViewModel.getValue();
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void canUseNavLink(boolean z10, CardTypeEnum cardTypeEnum) {
        PaymentFragment.OnPaymentReadyListener.DefaultImpls.canUseNavLink(this, z10, cardTypeEnum);
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void displayErrorMessage(String str) {
        PaymentFragment.OnPaymentReadyListener.DefaultImpls.displayErrorMessage(this, str);
    }

    public final C3821v0.c getViewModelFactory() {
        C3821v0.c cVar = this.viewModelFactory;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void isViewCompact(boolean z10) {
        PaymentFragment.OnPaymentReadyListener.DefaultImpls.isViewCompact(this, z10);
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void onAppliedAmountChange(DisplayCard card) {
        Intrinsics.checkNotNullParameter(card, "card");
        LogInstrumentation.m79024d("DPAY", "onAppliedAmountChange: " + card);
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void onCameraRequest() {
        PaymentFragment.OnPaymentReadyListener.DefaultImpls.onCameraRequest(this);
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void onCanModifyAmount(boolean canModify) {
        LogInstrumentation.m79024d("DPAY", "onCanModifyAmount: " + canModify);
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void onCardsProcessed(boolean processed, ProcessedCards cards, Throwable error, boolean canRetry) {
        LogInstrumentation.m79024d("DPAY", "onCardsProcessed: " + processed);
        if (processed && cards != null) {
            getOneClickViewModel().m56523T(cards);
        } else {
            Map<String, BaseCardDetails> declined = cards != null ? cards.getDeclined() : null;
            getOneClickViewModel().m56525V((declined == null || declined.isEmpty()) ? error instanceof DpayHighTrustError ? OneClickPaymentEvent.PaymentFailed.FailureType.HIGH_TRUST : OneClickPaymentEvent.PaymentFailed.FailureType.OTHER : OneClickPaymentEvent.PaymentFailed.FailureType.DECLINED);
        }
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentCallbacks2 application = getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.disney.wdpro.oneclicklib.di.OneClickComponentProvider");
        ((InterfaceC32450b) application).m99489a();
        throw null;
    }

    @Override // com.disney.wdpro.paymentsui.utils.DpayListener
    public void onError(String str, String str2, Throwable th2) {
        PaymentFragment.OnPaymentReadyListener.DefaultImpls.onError(this, str, str2, th2);
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void onLoading(boolean z10) {
        PaymentFragment.OnPaymentReadyListener.DefaultImpls.onLoading(this, z10);
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void onOneClickPaymentEvent(DisplayCard card) {
        Intrinsics.checkNotNullParameter(card, "card");
        PaymentFragment.OnPaymentReadyListener.DefaultImpls.onOneClickPaymentEvent(this, card);
        if (getOneClickViewModel().getIsChecked()) {
            LogInstrumentation.m79024d("DPAY", "PaymentEvent");
            getOneClickViewModel().m56524U();
        }
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void onReadyToProcess(boolean ready, List<BasicCardDetails> cards) {
        Unit unit;
        LogInstrumentation.m79024d("DPAY", "onReadyToProcess: " + ready);
        if (!ready || cards == null) {
            return;
        }
        Iterator<T> it = cards.iterator();
        if (it.hasNext()) {
            getOneClickViewModel().m56519P((BasicCardDetails) it.next());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
        }
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void onSessionLoaded(boolean loaded, Throwable error) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onSessionLoaded: ");
        sb2.append(loaded);
        getOneClickViewModel().m56517N();
        if (loaded || error == null) {
            return;
        }
        String localizedMessage = error.getLocalizedMessage();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("onSessionLoaded with error: ");
        sb3.append(localizedMessage);
        m56465W().m96948B(new AbstractC31719b.ClassicBanner(null, 1, null));
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void onTimerStarted(double d10) {
        PaymentFragment.OnPaymentReadyListener.DefaultImpls.onTimerStarted(this, d10);
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void onUserEvent(PaymentsAnalyticsEvent paymentsAnalyticsEvent) {
        PaymentFragment.OnPaymentReadyListener.DefaultImpls.onUserEvent(this, paymentsAnalyticsEvent);
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void sessionNeedsExtending() {
        PaymentFragment.OnPaymentReadyListener.DefaultImpls.sessionNeedsExtending(this);
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void trackAction(PaymentsAnalyticsEvent eventName, Map<String, String> contextMap) {
        OneClickCheckoutFragment oneClickCheckoutFragment;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(contextMap, "contextMap");
        if (C16597b.$EnumSwitchMapping$0[eventName.ordinal()] != 1 || (oneClickCheckoutFragment = this.oneClickCheckoutFragment) == null) {
            return;
        }
        oneClickCheckoutFragment.m56493P0();
    }

    @Override // com.disney.wdpro.paymentsui.fragments.PaymentFragment.OnPaymentReadyListener
    public void updatePaymentHeader(String str) {
        PaymentFragment.OnPaymentReadyListener.DefaultImpls.updatePaymentHeader(this, str);
    }
}