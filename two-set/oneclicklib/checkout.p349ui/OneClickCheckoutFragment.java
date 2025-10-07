package com.disney.wdpro.oneclicklib.checkout.p349ui;

import al.C0119a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.C3337b1;
import androidx.fragment.app.FragmentActivity;
import androidx.view.C3821v0;
import androidx.view.C3827w0;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.oneclicklib.common.OneClickBaseFragment;
import com.disney.wdpro.oneclicklib.common.OneClickPaymentEvent;
import com.disney.wdpro.oneclicklib.common.viewmodel.OneClickViewModel;
import com.disney.wdpro.payments.models.enums.IssuerNameEnum;
import com.disney.wdpro.paymentsui.model.BasicCardDetails;
import com.disney.wdpro.photopass.services.dto.CBAnalytics;
import com.disney.wdpro.photopass.services.dto.CBAssets;
import com.disney.wdpro.photopass.services.dto.CBEnableCTA;
import com.disney.wdpro.photopass.services.dto.CBErrors;
import com.disney.wdpro.photopass.services.dto.CBPaymentError;
import com.disney.wdpro.photopass.services.dto.CBReviewAndPurchaseScreen;
import com.disney.wdpro.photopass.services.dto.CBText;
import com.disney.wdpro.photopass.services.dto.CBTitleMessage;
import com.disney.wdpro.photopasscommons.ext.AndroidExtKt;
import com.disney.wdpro.photopasscommons.ext.C18816j;
import com.disney.wdpro.photopasscommons.ext.C18821o;
import com.disney.wdpro.photopasscommons.ext.C18823q;
import com.disney.wdpro.photopasscommons.ext.C18824r;
import com.disney.wdpro.support.dialog.Banner;
import com.disney.wdpro.support.widget.ProgressWheel;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import mk.C30538c;
import p804ok.LexVASUIData;
import p804ok.OneClickCheckoutUIData;
import p804ok.OneClickGuestNumberAndEmail;
import p878qk.AbstractC31720c;
import p878qk.AbstractC31721d;
import p878qk.OneClickCCData;
import p878qk.OneClickToken;
import p914rk.C31917a;
import pk.C31542a;
import tk.C32298a;
import uk.InterfaceC32450b;

@Metadata(m92037d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001^B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00052\b\b\u0003\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J!\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u0002012\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0005H\u0016¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\rH\u0016¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0005¢\u0006\u0004\b8\u0010\u0004R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010T\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010SR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010[\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006_"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/checkout/ui/OneClickCheckoutFragment;", "Lcom/disney/wdpro/oneclicklib/common/OneClickBaseFragment;", "Ltk/a;", "<init>", "()V", "", "setUpObservers", "setUpView", "setUpListeners", "Lok/b;", "screenData", "U0", "(Lok/b;)V", "", "content", "", "K0", "(Ljava/lang/String;)Ljava/util/List;", "", "linkPosition", "O0", "(Ljava/lang/String;I)V", "message", "showErrorBanner", "(I)V", "Lqk/d;", "Lcom/disney/wdpro/paymentsui/model/BasicCardDetails;", "oneClickState", "L0", "(Lqk/d;)V", "Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent;", "event", "M0", "(Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent;)V", "Lqk/e;", "oneClickToken", "N0", "(Lqk/e;)V", "Lok/c;", "guestNumberAndEmail", "Q0", "(Lok/c;)V", "Lcom/disney/wdpro/photopass/services/dto/CBAnalytics;", "I0", "(Ljava/lang/String;)Lcom/disney/wdpro/photopass/services/dto/CBAnalytics;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "getAnalyticsPageName", "()Ljava/lang/String;", "P0", "Landroidx/lifecycle/v0$c;", "viewModelFactory", "Landroidx/lifecycle/v0$c;", "getViewModelFactory", "()Landroidx/lifecycle/v0$c;", "setViewModelFactory", "(Landroidx/lifecycle/v0$c;)V", "Lal/a;", "bannerHelper", "Lal/a;", "G0", "()Lal/a;", "setBannerHelper", "(Lal/a;)V", "Lpk/a;", "checkoutViewModel$delegate", "Lkotlin/Lazy;", "H0", "()Lpk/a;", "checkoutViewModel", "Lcom/disney/wdpro/oneclicklib/common/viewmodel/OneClickViewModel;", "oneClickViewModel$delegate", "J0", "()Lcom/disney/wdpro/oneclicklib/common/viewmodel/OneClickViewModel;", "oneClickViewModel", "importantDetailsBodyText", "Ljava/lang/String;", "termsAndConditionsBodyText", "Lcom/disney/wdpro/photopass/services/dto/CBAssets;", "assetsData", "Lcom/disney/wdpro/photopass/services/dto/CBAssets;", "Lcom/disney/wdpro/photopass/services/dto/CBPaymentError;", "declinedPaymentError", "Lcom/disney/wdpro/photopass/services/dto/CBPaymentError;", "generalPaymentError", "Lcom/disney/wdpro/photopass/services/dto/CBAnalytics;", "Companion", "a", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nOneClickCheckoutFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneClickCheckoutFragment.kt\ncom/disney/wdpro/oneclicklib/checkout/ui/OneClickCheckoutFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
/* loaded from: classes3.dex */
public final class OneClickCheckoutFragment extends OneClickBaseFragment<C32298a> {
    public static final long ANIM_DURATION = 400;
    public static final String CONTEXT_DATA = "PhotoPassARplusOneClick";
    public static final int FIRST_URL_LINK_TERMS_CONDITIONS = 0;
    public static final String LINK_CATEGORY = "link.category";
    public static final String PURCHASE_ANALYTICS_ACTION = "Purchase";
    public static final int SECOND_URL_LINK_IMPORTANT_NOTICE = 1;
    public static final String URL_LINK_REGEX = "(?<=href=\")[^\"]+(?=\")";
    private CBAssets assetsData;

    @Inject
    public C0119a bannerHelper;

    /* renamed from: checkoutViewModel$delegate, reason: from kotlin metadata */
    private final Lazy checkoutViewModel;
    private CBPaymentError declinedPaymentError;
    private CBAnalytics generalPaymentError;
    private String importantDetailsBodyText;

    /* renamed from: oneClickViewModel$delegate, reason: from kotlin metadata */
    private final Lazy oneClickViewModel;
    private String termsAndConditionsBodyText;

    @Inject
    public C3821v0.c viewModelFactory;

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutFragment$1 */
    /* synthetic */ class C165981 extends FunctionReferenceImpl implements Function1<LayoutInflater, C32298a> {
        public static final C165981 INSTANCE = new C165981();

        C165981() {
            super(1, C32298a.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/disney/wdpro/oneclicklib/databinding/FragmentOneClickCheckoutBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final C32298a invoke(LayoutInflater p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return C32298a.m98926c(p02);
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutFragment$setUpObservers$1 */
    /* synthetic */ class C166001 extends FunctionReferenceImpl implements Function1<AbstractC31721d<? extends BasicCardDetails>, Unit> {
        C166001(Object obj) {
            super(1, obj, OneClickCheckoutFragment.class, "onCheckoutDataState", "onCheckoutDataState(Lcom/disney/wdpro/oneclicklib/common/OneClickState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC31721d<? extends BasicCardDetails> abstractC31721d) {
            invoke2((AbstractC31721d<BasicCardDetails>) abstractC31721d);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AbstractC31721d<BasicCardDetails> p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((OneClickCheckoutFragment) this.receiver).m56478L0(p02);
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutFragment$setUpObservers$2 */
    /* synthetic */ class C166012 extends FunctionReferenceImpl implements Function1<OneClickCheckoutUIData, Unit> {
        C166012(Object obj) {
            super(1, obj, OneClickCheckoutFragment.class, "setUpUIData", "setUpUIData(Lcom/disney/wdpro/oneclicklib/checkout/ui/model/OneClickCheckoutUIData;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OneClickCheckoutUIData oneClickCheckoutUIData) {
            invoke2(oneClickCheckoutUIData);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OneClickCheckoutUIData p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((OneClickCheckoutFragment) this.receiver).m56486U0(p02);
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutFragment$setUpObservers$3 */
    /* synthetic */ class C166023 extends FunctionReferenceImpl implements Function1<OneClickGuestNumberAndEmail, Unit> {
        C166023(Object obj) {
            super(1, obj, OneClickCheckoutFragment.class, "setNumberAndEmail", "setNumberAndEmail(Lcom/disney/wdpro/oneclicklib/checkout/ui/model/OneClickGuestNumberAndEmail;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OneClickGuestNumberAndEmail oneClickGuestNumberAndEmail) throws Resources.NotFoundException {
            invoke2(oneClickGuestNumberAndEmail);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OneClickGuestNumberAndEmail p02) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((OneClickCheckoutFragment) this.receiver).m56482Q0(p02);
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutFragment$setUpObservers$4 */
    /* synthetic */ class C166034 extends FunctionReferenceImpl implements Function1<OneClickPaymentEvent, Unit> {
        C166034(Object obj) {
            super(1, obj, OneClickCheckoutFragment.class, "onProcessPaymentEvent", "onProcessPaymentEvent(Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OneClickPaymentEvent oneClickPaymentEvent) {
            invoke2(oneClickPaymentEvent);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OneClickPaymentEvent p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((OneClickCheckoutFragment) this.receiver).m56479M0(p02);
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutFragment$setUpObservers$5 */
    /* synthetic */ class C166045 extends FunctionReferenceImpl implements Function1<OneClickToken, Unit> {
        C166045(Object obj) {
            super(1, obj, OneClickCheckoutFragment.class, "onToken", "onToken(Lcom/disney/wdpro/oneclicklib/common/OneClickToken;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OneClickToken oneClickToken) {
            invoke2(oneClickToken);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OneClickToken p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((OneClickCheckoutFragment) this.receiver).m56480N0(p02);
        }
    }

    public OneClickCheckoutFragment() {
        super(C165981.INSTANCE);
        this.checkoutViewModel = LazyKt.lazy(new Function0<C31542a>() { // from class: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutFragment$checkoutViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C31542a invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                return (C31542a) C3827w0.m20290f(fragmentActivityRequireActivity, this.this$0.getViewModelFactory()).m20262a(C31542a.class);
            }
        });
        this.oneClickViewModel = LazyKt.lazy(new Function0<OneClickViewModel>() { // from class: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutFragment$oneClickViewModel$2
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public final C31542a m56474H0() {
        return (C31542a) this.checkoutViewModel.getValue();
    }

    /* renamed from: I0 */
    private final CBAnalytics m56475I0(String message) {
        CBText title;
        CBPaymentError cBPaymentError = this.declinedPaymentError;
        if (!Intrinsics.areEqual(message, (cBPaymentError == null || (title = cBPaymentError.getTitle()) == null) ? null : title.getText())) {
            return this.generalPaymentError;
        }
        CBPaymentError cBPaymentError2 = this.declinedPaymentError;
        if (cBPaymentError2 != null) {
            return cBPaymentError2.getAnalytics();
        }
        return null;
    }

    /* renamed from: J0 */
    private final OneClickViewModel m56476J0() {
        return (OneClickViewModel) this.oneClickViewModel.getValue();
    }

    /* renamed from: K0 */
    private final List<String> m56477K0(String content) {
        return SequencesKt.toList(SequencesKt.map(Regex.findAll$default(new Regex(URL_LINK_REGEX), content, 0, 2, null), new Function1<MatchResult, String>() { // from class: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutFragment$getWebLinksFromText$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(MatchResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getValue();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public final void m56478L0(AbstractC31721d<BasicCardDetails> oneClickState) {
        OneClickCCData oneClickCCDataM56507A;
        if (oneClickState instanceof AbstractC31721d.Success) {
            ConstraintLayout constraintLayout = m56494v0().detailContainer;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.detailContainer");
            C18824r.m60608g(constraintLayout, false, 0L, 3, null);
            BasicCardDetails basicCardDetails = (BasicCardDetails) ((AbstractC31721d.Success) oneClickState).m97379a();
            m56494v0().cardNumber.setText(basicCardDetails.getMaskedCardNumber());
            IssuerNameEnum issuer = basicCardDetails.getIssuer();
            if (issuer == null || (oneClickCCDataM56507A = m56476J0().m56507A(issuer, this.assetsData)) == null) {
                return;
            }
            ImageView imageView = m56494v0().cardImage;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.cardImage");
            C18816j.m60580b(imageView, oneClickCCDataM56507A.getIconUrl(), 0, 0, 6, null);
            return;
        }
        if (oneClickState instanceof AbstractC31721d.Error) {
            m56474H0().m96948B(((AbstractC31721d.Error) oneClickState).getType());
            return;
        }
        if (oneClickState instanceof AbstractC31721d.Loading) {
            if (((AbstractC31721d.Loading) oneClickState).getShowLoader()) {
                ProgressWheel progressWheel = m56494v0().loaderCheckout;
                Intrinsics.checkNotNullExpressionValue(progressWheel, "binding.loaderCheckout");
                C18824r.m60607f(progressWheel, true, 400L);
            } else {
                ProgressWheel progressWheel2 = m56494v0().loaderCheckout;
                Intrinsics.checkNotNullExpressionValue(progressWheel2, "binding.loaderCheckout");
                C18824r.m60604c(progressWheel2, true, 400L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public final void m56479M0(OneClickPaymentEvent event) {
        if (event instanceof OneClickPaymentEvent.PaymentFailed) {
            C32298a c32298aM56494v0 = m56494v0();
            LinearLayout productInfo = c32298aM56494v0.productInfo;
            Intrinsics.checkNotNullExpressionValue(productInfo, "productInfo");
            C18824r.m60605d(productInfo, false, 0L, 3, null);
            ConstraintLayout errorContainer = c32298aM56494v0.errorContainer;
            Intrinsics.checkNotNullExpressionValue(errorContainer, "errorContainer");
            C18824r.m60608g(errorContainer, false, 0L, 3, null);
            OneClickPaymentEvent.PaymentFailed paymentFailed = (OneClickPaymentEvent.PaymentFailed) event;
            c32298aM56494v0.errorMessage.setText(paymentFailed.getMessage());
            String message = paymentFailed.getMessage();
            if (message != null) {
                C31917a c31917a = C31917a.INSTANCE;
                InterfaceC8679k analyticsHelper = this.analyticsHelper;
                Intrinsics.checkNotNullExpressionValue(analyticsHelper, "analyticsHelper");
                c31917a.m98086a(analyticsHelper, m56475I0(message), "content/photopass/ARplus/Legacy/OneClickCheckout/Purchase");
            }
            if (paymentFailed.getCanRetry()) {
                return;
            }
            Group group = m56494v0().cantRetryContainer;
            Intrinsics.checkNotNullExpressionValue(group, "binding.cantRetryContainer");
            C18824r.m60605d(group, false, 0L, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public final void m56480N0(OneClickToken oneClickToken) {
        m56476J0().m56522S(oneClickToken.getToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public final void m56481O0(String content, int linkPosition) {
        Context context;
        try {
            List<String> listM56477K0 = m56477K0(content);
            if (listM56477K0.isEmpty() || (context = getContext()) == null) {
                return;
            }
            C18823q.m60601e(context, listM56477K0.get(linkPosition));
        } catch (IndexOutOfBoundsException unused) {
            m56487V0(this, 0, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public final void m56482Q0(OneClickGuestNumberAndEmail guestNumberAndEmail) throws Resources.NotFoundException {
        m56494v0().contactEmail.setText(guestNumberAndEmail.getEmail());
        if (guestNumberAndEmail.getPhoneNumberPrefix() == null || guestNumberAndEmail.getPhoneNumber() == null) {
            return;
        }
        TextView textView = m56494v0().contactNumber;
        String string = getResources().getString(C30538c.contact_number);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.contact_number)");
        String str = String.format(string, Arrays.copyOf(new Object[]{guestNumberAndEmail.getPhoneNumberPrefix(), guestNumberAndEmail.getPhoneNumber()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public static final void m56483R0(OneClickCheckoutFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = this$0.importantDetailsBodyText;
        if (str != null) {
            this$0.m56476J0().m56520Q(new AbstractC31720c.NavigateToImportantDetails(str));
        }
        C31917a c31917a = C31917a.INSTANCE;
        InterfaceC8679k analyticsHelper = this$0.analyticsHelper;
        Intrinsics.checkNotNullExpressionValue(analyticsHelper, "analyticsHelper");
        c31917a.m98086a(analyticsHelper, this$0.m56474H0().getImportantDetailsAnalytics(), "content/photopass/ARplus/Legacy/OneClickCheckout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public static final void m56484S0(OneClickCheckoutFragment this$0, CompoundButton compoundButton, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.m56494v0().blurPurchaseButton;
        Intrinsics.checkNotNullExpressionValue(view, "binding.blurPurchaseButton");
        C18824r.m60606e(view, !z10);
        this$0.m56476J0().m56527X(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public static final void m56485T0(OneClickCheckoutFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m56476J0().m56520Q(AbstractC31720c.c.INSTANCE);
        C31917a c31917a = C31917a.INSTANCE;
        InterfaceC8679k analyticsHelper = this$0.analyticsHelper;
        Intrinsics.checkNotNullExpressionValue(analyticsHelper, "analyticsHelper");
        c31917a.m98086a(analyticsHelper, this$0.m56474H0().getOtherPaymentAnalytics(), "content/photopass/ARplus/Legacy/OneClickCheckout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public final void m56486U0(OneClickCheckoutUIData screenData) {
        CBPaymentError generalPaymentError;
        CBText title;
        String text;
        CBText title2;
        CBText title3;
        CBText title4;
        CBText title5;
        CBText title6;
        CBText title7;
        CBText title8;
        CBText title9;
        CBText title10;
        CBText title11;
        CBText title12;
        CBText title13;
        CBText title14;
        CBText title15;
        CBText title16;
        CBText title17;
        CBText title18;
        CBText title19;
        CBText title20;
        this.assetsData = screenData.getAssets();
        CBErrors errors = screenData.getErrors();
        if (errors != null) {
            m56476J0().m56526W(errors);
        }
        final CBReviewAndPurchaseScreen reviewAndPurchaseScreen = screenData.getReviewAndPurchaseScreen();
        CBAnalytics analytics = null;
        if (reviewAndPurchaseScreen != null) {
            C32298a c32298aM56494v0 = m56494v0();
            TextView textView = c32298aM56494v0.toolbarContainer.oneClickTitle;
            CBText screenTitle = reviewAndPurchaseScreen.getScreenTitle();
            textView.setText(screenTitle != null ? screenTitle.getText() : null);
            TextView textView2 = c32298aM56494v0.toolbarContainer.oneClickTitle;
            CBText screenTitle2 = reviewAndPurchaseScreen.getScreenTitle();
            textView2.setContentDescription(screenTitle2 != null ? screenTitle2.getAccessibility() : null);
            C3337b1.m17277s0(c32298aM56494v0.oneClickCheckoutContainer, true);
            TextView textView3 = c32298aM56494v0.importantDetailsText;
            CBEnableCTA productTermsCTA = reviewAndPurchaseScreen.getProductTermsCTA();
            textView3.setText((productTermsCTA == null || (title20 = productTermsCTA.getTitle()) == null) ? null : title20.getText());
            TextView textView4 = c32298aM56494v0.importantDetailsText;
            CBEnableCTA productTermsCTA2 = reviewAndPurchaseScreen.getProductTermsCTA();
            textView4.setContentDescription((productTermsCTA2 == null || (title19 = productTermsCTA2.getTitle()) == null) ? null : title19.getAccessibility());
            TextView textView5 = c32298aM56494v0.contactTitle;
            CBTitleMessage contactInfoLabel = reviewAndPurchaseScreen.getContactInfoLabel();
            textView5.setText((contactInfoLabel == null || (title18 = contactInfoLabel.getTitle()) == null) ? null : title18.getText());
            TextView textView6 = c32298aM56494v0.contactTitle;
            CBTitleMessage contactInfoLabel2 = reviewAndPurchaseScreen.getContactInfoLabel();
            textView6.setContentDescription((contactInfoLabel2 == null || (title17 = contactInfoLabel2.getTitle()) == null) ? null : title17.getAccessibility());
            TextView textView7 = c32298aM56494v0.cardTitle;
            CBTitleMessage cardOnFileLabel = reviewAndPurchaseScreen.getCardOnFileLabel();
            textView7.setText((cardOnFileLabel == null || (title16 = cardOnFileLabel.getTitle()) == null) ? null : title16.getText());
            TextView textView8 = c32298aM56494v0.cardTitle;
            CBTitleMessage cardOnFileLabel2 = reviewAndPurchaseScreen.getCardOnFileLabel();
            textView8.setContentDescription((cardOnFileLabel2 == null || (title15 = cardOnFileLabel2.getTitle()) == null) ? null : title15.getAccessibility());
            TextView textView9 = c32298aM56494v0.subtotalText;
            CBTitleMessage subTotalLabel = reviewAndPurchaseScreen.getSubTotalLabel();
            textView9.setText((subTotalLabel == null || (title14 = subTotalLabel.getTitle()) == null) ? null : title14.getText());
            TextView textView10 = c32298aM56494v0.subtotalText;
            CBTitleMessage subTotalLabel2 = reviewAndPurchaseScreen.getSubTotalLabel();
            textView10.setContentDescription((subTotalLabel2 == null || (title13 = subTotalLabel2.getTitle()) == null) ? null : title13.getAccessibility());
            TextView textView11 = c32298aM56494v0.salesTaxText;
            CBTitleMessage salesTaxLabel = reviewAndPurchaseScreen.getSalesTaxLabel();
            textView11.setText((salesTaxLabel == null || (title12 = salesTaxLabel.getTitle()) == null) ? null : title12.getText());
            TextView textView12 = c32298aM56494v0.salesTaxText;
            CBTitleMessage salesTaxLabel2 = reviewAndPurchaseScreen.getSalesTaxLabel();
            textView12.setContentDescription((salesTaxLabel2 == null || (title11 = salesTaxLabel2.getTitle()) == null) ? null : title11.getAccessibility());
            TextView textView13 = c32298aM56494v0.totalText;
            CBTitleMessage totalLabel = reviewAndPurchaseScreen.getTotalLabel();
            textView13.setText((totalLabel == null || (title10 = totalLabel.getTitle()) == null) ? null : title10.getText());
            TextView textView14 = c32298aM56494v0.totalText;
            CBTitleMessage totalLabel2 = reviewAndPurchaseScreen.getTotalLabel();
            textView14.setContentDescription((totalLabel2 == null || (title9 = totalLabel2.getTitle()) == null) ? null : title9.getAccessibility());
            TextView extraTermsAndConditions = c32298aM56494v0.extraTermsAndConditions;
            Intrinsics.checkNotNullExpressionValue(extraTermsAndConditions, "extraTermsAndConditions");
            C18821o.m60590a(extraTermsAndConditions, reviewAndPurchaseScreen.getAdditionalTermsAndConditions());
            c32298aM56494v0.extraTermsAndConditions.setContentDescription(reviewAndPurchaseScreen.getAdditionalTermsAndConditions());
            TextView textView15 = c32298aM56494v0.visaText;
            CBPaymentError sponsoredCard = reviewAndPurchaseScreen.getSponsoredCard();
            textView15.setText((sponsoredCard == null || (title8 = sponsoredCard.getTitle()) == null) ? null : title8.getText());
            TextView textView16 = c32298aM56494v0.visaText;
            CBPaymentError sponsoredCard2 = reviewAndPurchaseScreen.getSponsoredCard();
            textView16.setContentDescription((sponsoredCard2 == null || (title7 = sponsoredCard2.getTitle()) == null) ? null : title7.getAccessibility());
            TextView textView17 = c32298aM56494v0.differentPaymentMethod;
            CBEnableCTA otherPaymentMethodCTA = reviewAndPurchaseScreen.getOtherPaymentMethodCTA();
            textView17.setText((otherPaymentMethodCTA == null || (title6 = otherPaymentMethodCTA.getTitle()) == null) ? null : title6.getText());
            TextView textView18 = c32298aM56494v0.differentPaymentMethod;
            CBEnableCTA otherPaymentMethodCTA2 = reviewAndPurchaseScreen.getOtherPaymentMethodCTA();
            textView18.setContentDescription((otherPaymentMethodCTA2 == null || (title5 = otherPaymentMethodCTA2.getTitle()) == null) ? null : title5.getAccessibility());
            CBEnableCTA usTermsCheckCTA = reviewAndPurchaseScreen.getUsTermsCheckCTA();
            if (usTermsCheckCTA != null && (title2 = usTermsCheckCTA.getTitle()) != null && title2.getText() != null) {
                TextView textView19 = m56494v0().termsAndConditionsText;
                CBEnableCTA usTermsCheckCTA2 = reviewAndPurchaseScreen.getUsTermsCheckCTA();
                textView19.setText((usTermsCheckCTA2 == null || (title4 = usTermsCheckCTA2.getTitle()) == null) ? null : title4.getAccessibility());
                TextView textView20 = m56494v0().termsAndConditionsText;
                CBEnableCTA usTermsCheckCTA3 = reviewAndPurchaseScreen.getUsTermsCheckCTA();
                textView20.setContentDescription((usTermsCheckCTA3 == null || (title3 = usTermsCheckCTA3.getTitle()) == null) ? null : title3.getAccessibility());
            }
            String termsAndConditionsLinkRange = reviewAndPurchaseScreen.getTermsAndConditionsLinkRange();
            if (termsAndConditionsLinkRange != null) {
                TextView setUpUIData$lambda$14$lambda$11$lambda$10 = m56494v0().termsAndConditionsText;
                CharSequence text2 = setUpUIData$lambda$14$lambda$11$lambda$10.getText();
                Intrinsics.checkNotNullExpressionValue(text2, "text");
                if (StringsKt.contains$default(text2, (CharSequence) termsAndConditionsLinkRange, false, 2, (Object) null)) {
                    Intrinsics.checkNotNullExpressionValue(setUpUIData$lambda$14$lambda$11$lambda$10, "setUpUIData$lambda$14$lambda$11$lambda$10");
                    C18821o.m60592c(setUpUIData$lambda$14$lambda$11$lambda$10, termsAndConditionsLinkRange, false, new Function0<Unit>() { // from class: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutFragment$setUpUIData$2$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            CBText title21;
                            String text3;
                            C31917a c31917a = C31917a.INSTANCE;
                            InterfaceC8679k analyticsHelper = this.this$0.analyticsHelper;
                            Intrinsics.checkNotNullExpressionValue(analyticsHelper, "analyticsHelper");
                            c31917a.m98086a(analyticsHelper, this.this$0.m56474H0().getUsTermsAndConditionsAnalytics(), "content/photopass/ARplus/Legacy/OneClickCheckout");
                            CBEnableCTA usTermsCheckCTA4 = reviewAndPurchaseScreen.getUsTermsCheckCTA();
                            if (usTermsCheckCTA4 == null || (title21 = usTermsCheckCTA4.getTitle()) == null || (text3 = title21.getText()) == null) {
                                return;
                            }
                            this.this$0.m56481O0(text3, 0);
                        }
                    }, 2, null);
                }
            }
            CBEnableCTA importantNoticeMoMLinkRange = reviewAndPurchaseScreen.getImportantNoticeMoMLinkRange();
            if (importantNoticeMoMLinkRange != null && (title = importantNoticeMoMLinkRange.getTitle()) != null && (text = title.getText()) != null) {
                TextView setUpUIData$lambda$14$lambda$13$lambda$12 = m56494v0().termsAndConditionsText;
                CharSequence text3 = setUpUIData$lambda$14$lambda$13$lambda$12.getText();
                Intrinsics.checkNotNullExpressionValue(text3, "text");
                if (StringsKt.contains$default(text3, (CharSequence) text, false, 2, (Object) null)) {
                    Intrinsics.checkNotNullExpressionValue(setUpUIData$lambda$14$lambda$13$lambda$12, "setUpUIData$lambda$14$lambda$13$lambda$12");
                    C18821o.m60592c(setUpUIData$lambda$14$lambda$13$lambda$12, text, false, new Function0<Unit>() { // from class: com.disney.wdpro.oneclicklib.checkout.ui.OneClickCheckoutFragment$setUpUIData$2$4$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            CBText title21;
                            String text4;
                            C31917a c31917a = C31917a.INSTANCE;
                            InterfaceC8679k analyticsHelper = this.this$0.analyticsHelper;
                            Intrinsics.checkNotNullExpressionValue(analyticsHelper, "analyticsHelper");
                            c31917a.m98086a(analyticsHelper, this.this$0.m56474H0().getImportantNoticeMoMAnalytics(), "content/photopass/ARplus/Legacy/OneClickCheckout");
                            CBEnableCTA usTermsCheckCTA4 = reviewAndPurchaseScreen.getUsTermsCheckCTA();
                            if (usTermsCheckCTA4 == null || (title21 = usTermsCheckCTA4.getTitle()) == null || (text4 = title21.getText()) == null) {
                                return;
                            }
                            this.this$0.m56481O0(text4, 1);
                        }
                    }, 2, null);
                }
            }
        }
        CBErrors errors2 = screenData.getErrors();
        this.declinedPaymentError = errors2 != null ? errors2.getDeclinedPaymentError() : null;
        CBErrors errors3 = screenData.getErrors();
        if (errors3 != null && (generalPaymentError = errors3.getGeneralPaymentError()) != null) {
            analytics = generalPaymentError.getAnalytics();
        }
        this.generalPaymentError = analytics;
        C31917a c31917a = C31917a.INSTANCE;
        InterfaceC8679k analyticsHelper = this.analyticsHelper;
        Intrinsics.checkNotNullExpressionValue(analyticsHelper, "analyticsHelper");
        c31917a.m98086a(analyticsHelper, m56474H0().getReviewAndPurchaseScreenAnalytics(), "content/photopass/ARplus/Legacy/OneClickCheckout");
    }

    /* renamed from: V0 */
    static /* synthetic */ void m56487V0(OneClickCheckoutFragment oneClickCheckoutFragment, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = C30538c.generic_error;
        }
        oneClickCheckoutFragment.showErrorBanner(i10);
    }

    private final void setUpListeners() {
        C32298a c32298aM56494v0 = m56494v0();
        c32298aM56494v0.importantDetailsText.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.oneclicklib.checkout.ui.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneClickCheckoutFragment.m56483R0(this.f40291a, view);
            }
        });
        c32298aM56494v0.purchaseCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.disney.wdpro.oneclicklib.checkout.ui.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                OneClickCheckoutFragment.m56484S0(this.f40292a, compoundButton, z10);
            }
        });
        c32298aM56494v0.differentPaymentMethod.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.oneclicklib.checkout.ui.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneClickCheckoutFragment.m56485T0(this.f40293a, view);
            }
        });
    }

    private final void setUpObservers() {
        AndroidExtKt.m60560a(this, m56476J0().m56508B(), new C166001(this));
        AndroidExtKt.m60560a(this, m56474H0().m96955z(), new C166012(this));
        AndroidExtKt.m60560a(this, m56476J0().m56511E(), new C166023(this));
        AndroidExtKt.m60560a(this, m56476J0().getPaymentEventsLiveData(), new C166034(this));
        AndroidExtKt.m60560a(this, m56476J0().m56515I(), new C166045(this));
    }

    private final void setUpView() throws Resources.NotFoundException {
        Bundle arguments = getArguments();
        LexVASUIData lexVASUIData = arguments != null ? (LexVASUIData) arguments.getParcelable("product") : null;
        if (lexVASUIData != null) {
            C32298a c32298aM56494v0 = m56494v0();
            c32298aM56494v0.tagline.setText(lexVASUIData.getTagline());
            c32298aM56494v0.summaryTitle.setText(lexVASUIData.getName());
            c32298aM56494v0.summaryDescription.setText(lexVASUIData.getDescription());
            c32298aM56494v0.subtotal.setText(lexVASUIData.getSubTotal());
            c32298aM56494v0.ticketTotal.setText(lexVASUIData.getTotal());
            c32298aM56494v0.salesTax.setText(lexVASUIData.getTaxes());
            TextView textView = c32298aM56494v0.total;
            String string = getResources().getString(C30538c.total_number);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.total_number)");
            String str = String.format(string, Arrays.copyOf(new Object[]{lexVASUIData.getTotal()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
            this.importantDetailsBodyText = lexVASUIData.getImportantDetailsBody();
            this.termsAndConditionsBodyText = lexVASUIData.getTermsAndConditionsBody();
            m56476J0().m56529Z(lexVASUIData.getTermsAndConditionsBody());
        }
    }

    private final void showErrorBanner(int message) {
        C0119a c0119aM56492G0 = m56492G0();
        String string = getString(message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(message)");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        C0119a.m552b(c0119aM56492G0, string, fragmentActivityRequireActivity, Banner.Hierarchy.LEGACY_ALERT, null, 8, null);
    }

    /* renamed from: G0 */
    public final C0119a m56492G0() {
        C0119a c0119a = this.bannerHelper;
        if (c0119a != null) {
            return c0119a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bannerHelper");
        return null;
    }

    /* renamed from: P0 */
    public final void m56493P0() {
        CBAnalytics cBAnalytics = new CBAnalytics("Purchase", MapsKt.mapOf(new Pair("link.category", CONTEXT_DATA)));
        C31917a c31917a = C31917a.INSTANCE;
        InterfaceC8679k analyticsHelper = this.analyticsHelper;
        Intrinsics.checkNotNullExpressionValue(analyticsHelper, "analyticsHelper");
        c31917a.m98086a(analyticsHelper, cBAnalytics, "content/photopass/ARplus/Legacy/OneClickCheckout");
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

    @Override // com.disney.wdpro.oneclicklib.common.OneClickBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        m56476J0().m56521R();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setUpView();
        setUpListeners();
        setUpObservers();
    }
}