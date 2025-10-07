package com.disney.wdpro.oneclicklib.orderconfirmation.p351ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.C3337b1;
import androidx.fragment.app.FragmentActivity;
import androidx.view.AbstractC0205r;
import androidx.view.C0215t;
import androidx.view.C3821v0;
import androidx.view.C3827w0;
import androidx.view.OnBackPressedDispatcher;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.oneclicklib.common.viewmodel.OneClickViewModel;
import com.disney.wdpro.photopass.services.dto.CBCta;
import com.disney.wdpro.photopass.services.dto.CBOrderConfirmationScreen;
import com.disney.wdpro.photopass.services.dto.CBTax;
import com.disney.wdpro.photopass.services.dto.CBText;
import com.disney.wdpro.photopass.services.dto.CBTitleMessage;
import com.disney.wdpro.photopasscommons.ext.AndroidExtKt;
import com.disney.wdpro.photopasscommons.ext.C18816j;
import com.disney.wdpro.support.views.HyperionButton;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import mk.C30536a;
import mk.C30537b;
import mk.C30538c;
import p1043wk.OneClickOrderConfirmationUI;
import p1079xk.C33248a;
import p878qk.AbstractC31720c;
import p878qk.OneClickCCData;
import p914rk.C31917a;
import p914rk.C31919c;
import uk.InterfaceC32450b;

@Metadata(m92037d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 V2\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u00108\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u00109\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u00106R\u0016\u0010:\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u00106R\u0016\u0010;\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u00106R\u0016\u0010<\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u00106R\u0016\u0010=\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u00106R\u0016\u0010>\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u00106R\u0016\u0010?\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u00106R\u0016\u0010@\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u00106R\u0016\u0010A\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u00106R\u0016\u0010B\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u00106R\u0016\u0010C\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u00106R\u0016\u0010D\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u00103R\u0016\u0010E\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u00106R\u0016\u0010F\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u00106R\u0016\u0010G\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u00106R\u0016\u0010H\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u00106R\u0016\u0010I\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u00106R\u0016\u0010J\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u00106R\u0016\u0010K\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u00106R\u0016\u0010L\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u00106R\u0016\u0010M\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u00106R\u0016\u0010N\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u00106R\u0016\u0010O\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u00106R\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/orderconfirmation/ui/OneClickOrderConfirmationFragment;", "Lcom/disney/wdpro/commons/BaseFragment;", "<init>", "()V", "", "setUpObservers", "setUpListeners", "Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "setUpUI", "(Landroid/view/View;)V", "Lcom/disney/wdpro/photopass/services/dto/CBOrderConfirmationScreen;", "data", "B0", "(Lcom/disney/wdpro/photopass/services/dto/CBOrderConfirmationScreen;)V", "A0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getAnalyticsPageName", "()Ljava/lang/String;", "Landroidx/lifecycle/v0$c;", "viewModelFactory", "Landroidx/lifecycle/v0$c;", "getViewModelFactory", "()Landroidx/lifecycle/v0$c;", "setViewModelFactory", "(Landroidx/lifecycle/v0$c;)V", "Lxk/a;", "oneClickOrderConfirmationViewModel$delegate", "Lkotlin/Lazy;", "x0", "()Lxk/a;", "oneClickOrderConfirmationViewModel", "Lcom/disney/wdpro/oneclicklib/common/viewmodel/OneClickViewModel;", "oneClickViewModel$delegate", "y0", "()Lcom/disney/wdpro/oneclicklib/common/viewmodel/OneClickViewModel;", "oneClickViewModel", "Landroid/widget/ImageView;", "headerConfirmationImage", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "title", "Landroid/widget/TextView;", "confirmationMessageTv", "orderConfirmationNumber", "orderConfirmationDate", "orderConfirmationEmail", "confirmationEmail", "orderConfirmationPhone", "ticketSubtotal", "taxTotal", "totalOrderPriceTotal", "paidWithCardName", "paidWithValue", "orderConfirmationLabel", "orderConfirmationDateLabel", "cardImage", "authValue", "rrnValue", "emailLabelTv", "phoneLabelTv", "subTotalLabelTv", "taxLabelTv", "totalOrderLabel", "paidLabelTv", "withLabelTv", "authLabel", "rrnLabelTv", "Lcom/disney/wdpro/support/views/HyperionButton;", "confirmCTA", "Lcom/disney/wdpro/support/views/HyperionButton;", "Lwk/a;", "orderConfirmed", "Lwk/a;", "Companion", "a", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes3.dex */
public final class OneClickOrderConfirmationFragment extends BaseFragment {
    public static final String ORDER_CONFIRMED = "order_confirmed";
    private TextView authLabel;
    private TextView authValue;
    private ImageView cardImage;
    private HyperionButton confirmCTA;
    private TextView confirmationEmail;
    private TextView confirmationMessageTv;
    private TextView emailLabelTv;
    private ImageView headerConfirmationImage;

    /* renamed from: oneClickOrderConfirmationViewModel$delegate, reason: from kotlin metadata */
    private final Lazy oneClickOrderConfirmationViewModel = LazyKt.lazy(new Function0<C33248a>() { // from class: com.disney.wdpro.oneclicklib.orderconfirmation.ui.OneClickOrderConfirmationFragment$oneClickOrderConfirmationViewModel$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C33248a invoke() {
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return (C33248a) C3827w0.m20290f(fragmentActivityRequireActivity, this.this$0.getViewModelFactory()).m20262a(C33248a.class);
        }
    });

    /* renamed from: oneClickViewModel$delegate, reason: from kotlin metadata */
    private final Lazy oneClickViewModel = LazyKt.lazy(new Function0<OneClickViewModel>() { // from class: com.disney.wdpro.oneclicklib.orderconfirmation.ui.OneClickOrderConfirmationFragment$oneClickViewModel$2
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
    private TextView orderConfirmationDate;
    private TextView orderConfirmationDateLabel;
    private TextView orderConfirmationEmail;
    private TextView orderConfirmationLabel;
    private TextView orderConfirmationNumber;
    private TextView orderConfirmationPhone;
    private OneClickOrderConfirmationUI orderConfirmed;
    private TextView paidLabelTv;
    private TextView paidWithCardName;
    private TextView paidWithValue;
    private TextView phoneLabelTv;
    private TextView rrnLabelTv;
    private TextView rrnValue;
    private TextView subTotalLabelTv;
    private TextView taxLabelTv;
    private TextView taxTotal;
    private TextView ticketSubtotal;
    private TextView title;
    private TextView totalOrderLabel;
    private TextView totalOrderPriceTotal;

    @Inject
    public C3821v0.c viewModelFactory;
    private TextView withLabelTv;

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.orderconfirmation.ui.OneClickOrderConfirmationFragment$setUpObservers$1 */
    /* synthetic */ class C166211 extends FunctionReferenceImpl implements Function1<CBOrderConfirmationScreen, Unit> {
        C166211(Object obj) {
            super(1, obj, OneClickOrderConfirmationFragment.class, "setUpUIData", "setUpUIData(Lcom/disney/wdpro/photopass/services/dto/CBOrderConfirmationScreen;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CBOrderConfirmationScreen cBOrderConfirmationScreen) {
            invoke2(cBOrderConfirmationScreen);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CBOrderConfirmationScreen p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((OneClickOrderConfirmationFragment) this.receiver).m56547B0(p02);
        }
    }

    /* renamed from: A0 */
    private final void m56546A0(CBOrderConfirmationScreen data) {
        ImageView imageView;
        String iconUrl;
        TextView textView;
        CBText title;
        if (this.orderConfirmed == null || !isAdded()) {
            return;
        }
        OneClickOrderConfirmationUI oneClickOrderConfirmationUI = this.orderConfirmed;
        if (oneClickOrderConfirmationUI == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderConfirmed");
            oneClickOrderConfirmationUI = null;
        }
        String string = getString(C30538c.order_confirmation_total_format, oneClickOrderConfirmationUI.getTotal(), oneClickOrderConfirmationUI.getCurrency());
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.order…_format, total, currency)");
        int i10 = C30538c.order_confirmation_paid_with_card_name_format;
        OneClickCCData cardHolderData = oneClickOrderConfirmationUI.getCardHolderData();
        String text = cardHolderData != null ? cardHolderData.getText() : null;
        CBTitleMessage endingInLabel = data.getEndingInLabel();
        String string2 = getString(i10, text, (endingInLabel == null || (title = endingInLabel.getTitle()) == null) ? null : title.getText(), oneClickOrderConfirmationUI.getCardMaskNumber());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.order…          cardMaskNumber)");
        C31919c c31919c = C31919c.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        String strM98089a = c31919c.m98089a(contextRequireContext, oneClickOrderConfirmationUI.getPhoneNumberPrefix(), oneClickOrderConfirmationUI.getPhoneNumber());
        TextView textView2 = this.orderConfirmationNumber;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderConfirmationNumber");
            textView2 = null;
        }
        textView2.setText(oneClickOrderConfirmationUI.getId());
        TextView textView3 = this.orderConfirmationDate;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderConfirmationDate");
            textView3 = null;
        }
        textView3.setText(oneClickOrderConfirmationUI.getOrderDate());
        TextView textView4 = this.orderConfirmationEmail;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderConfirmationEmail");
            textView4 = null;
        }
        textView4.setText(oneClickOrderConfirmationUI.getEmail());
        TextView textView5 = this.confirmationEmail;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmationEmail");
            textView5 = null;
        }
        textView5.setText(oneClickOrderConfirmationUI.getEmail());
        TextView textView6 = this.orderConfirmationPhone;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderConfirmationPhone");
            textView6 = null;
        }
        textView6.setText(strM98089a);
        TextView textView7 = this.ticketSubtotal;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ticketSubtotal");
            textView7 = null;
        }
        textView7.setText(oneClickOrderConfirmationUI.getSubTotal());
        TextView textView8 = this.taxTotal;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taxTotal");
            textView8 = null;
        }
        textView8.setText(oneClickOrderConfirmationUI.getTax());
        TextView textView9 = this.totalOrderPriceTotal;
        if (textView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("totalOrderPriceTotal");
            textView9 = null;
        }
        textView9.setText(string);
        TextView textView10 = this.paidWithValue;
        if (textView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paidWithValue");
            textView10 = null;
        }
        textView10.setText(oneClickOrderConfirmationUI.getTotal());
        TextView textView11 = this.authValue;
        if (textView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authValue");
            textView11 = null;
        }
        OneClickOrderConfirmationUI oneClickOrderConfirmationUI2 = oneClickOrderConfirmationUI;
        textView11.setText(oneClickOrderConfirmationUI2.getAuth());
        TextView textView12 = this.rrnValue;
        if (textView12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rrnValue");
            textView12 = null;
        }
        textView12.setText(oneClickOrderConfirmationUI2.getRrn());
        TextView textView13 = this.paidWithCardName;
        if (textView13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paidWithCardName");
            textView13 = null;
        }
        textView13.setText(string2);
        ImageView imageView2 = this.cardImage;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardImage");
            imageView = null;
        } else {
            imageView = imageView2;
        }
        OneClickCCData cardHolderData2 = oneClickOrderConfirmationUI2.getCardHolderData();
        if (cardHolderData2 == null || (iconUrl = cardHolderData2.getIconUrl()) == null) {
            iconUrl = "";
        }
        C18816j.m60580b(imageView, iconUrl, 0, 0, 6, null);
        TextView textView14 = this.orderConfirmationNumber;
        if (textView14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderConfirmationNumber");
            textView14 = null;
        }
        textView14.setContentDescription(oneClickOrderConfirmationUI2.getId());
        TextView textView15 = this.orderConfirmationDate;
        if (textView15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderConfirmationDate");
            textView15 = null;
        }
        textView15.setContentDescription(oneClickOrderConfirmationUI2.getOrderDate());
        TextView textView16 = this.orderConfirmationEmail;
        if (textView16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderConfirmationEmail");
            textView16 = null;
        }
        textView16.setContentDescription(oneClickOrderConfirmationUI2.getEmail());
        TextView textView17 = this.confirmationEmail;
        if (textView17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmationEmail");
            textView17 = null;
        }
        textView17.setContentDescription(oneClickOrderConfirmationUI2.getEmail());
        TextView textView18 = this.orderConfirmationPhone;
        if (textView18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderConfirmationPhone");
            textView18 = null;
        }
        textView18.setContentDescription(strM98089a);
        TextView textView19 = this.ticketSubtotal;
        if (textView19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ticketSubtotal");
            textView19 = null;
        }
        textView19.setContentDescription(oneClickOrderConfirmationUI2.getSubTotal());
        TextView textView20 = this.taxTotal;
        if (textView20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taxTotal");
            textView20 = null;
        }
        textView20.setContentDescription(oneClickOrderConfirmationUI2.getTax());
        TextView textView21 = this.totalOrderPriceTotal;
        if (textView21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("totalOrderPriceTotal");
            textView21 = null;
        }
        textView21.setContentDescription(string);
        TextView textView22 = this.paidWithValue;
        if (textView22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paidWithValue");
            textView22 = null;
        }
        textView22.setContentDescription(oneClickOrderConfirmationUI2.getTotal());
        TextView textView23 = this.authValue;
        if (textView23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authValue");
            textView23 = null;
        }
        textView23.setContentDescription(oneClickOrderConfirmationUI2.getAuth());
        TextView textView24 = this.rrnValue;
        if (textView24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rrnValue");
            textView24 = null;
        }
        textView24.setContentDescription(oneClickOrderConfirmationUI2.getRrn());
        TextView textView25 = this.paidWithCardName;
        if (textView25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paidWithCardName");
            textView = null;
        } else {
            textView = textView25;
        }
        textView.setContentDescription(string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public final void m56547B0(CBOrderConfirmationScreen data) {
        ImageView imageView;
        CBText title;
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
        CBText title21;
        CBText title22;
        CBText title23;
        CBText title24;
        CBText title25;
        CBText title26;
        TextView textView = this.title;
        String accessibility = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title");
            textView = null;
        }
        CBText screenTitle = data.getScreenTitle();
        textView.setText(screenTitle != null ? screenTitle.getText() : null);
        TextView textView2 = this.title;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title");
            textView2 = null;
        }
        CBText screenTitle2 = data.getScreenTitle();
        textView2.setContentDescription(screenTitle2 != null ? screenTitle2.getAccessibility() : null);
        TextView textView3 = this.title;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title");
            textView3 = null;
        }
        C3337b1.m17277s0(textView3, true);
        ImageView imageView2 = this.headerConfirmationImage;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerConfirmationImage");
            imageView = null;
        } else {
            imageView = imageView2;
        }
        String orderConfirmationHeader = data.getOrderConfirmationHeader();
        if (orderConfirmationHeader == null) {
            orderConfirmationHeader = "";
        }
        C18816j.m60580b(imageView, orderConfirmationHeader, 0, 0, 6, null);
        TextView textView4 = this.confirmationMessageTv;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmationMessageTv");
            textView4 = null;
        }
        CBTitleMessage confirmationMessage = data.getConfirmationMessage();
        textView4.setText((confirmationMessage == null || (title26 = confirmationMessage.getTitle()) == null) ? null : title26.getText());
        TextView textView5 = this.confirmationMessageTv;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmationMessageTv");
            textView5 = null;
        }
        CBTitleMessage confirmationMessage2 = data.getConfirmationMessage();
        textView5.setContentDescription((confirmationMessage2 == null || (title25 = confirmationMessage2.getTitle()) == null) ? null : title25.getAccessibility());
        TextView textView6 = this.orderConfirmationLabel;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderConfirmationLabel");
            textView6 = null;
        }
        CBTitleMessage confirmationNumber = data.getConfirmationNumber();
        textView6.setText((confirmationNumber == null || (title24 = confirmationNumber.getTitle()) == null) ? null : title24.getText());
        TextView textView7 = this.orderConfirmationLabel;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderConfirmationLabel");
            textView7 = null;
        }
        CBTitleMessage confirmationNumber2 = data.getConfirmationNumber();
        textView7.setContentDescription((confirmationNumber2 == null || (title23 = confirmationNumber2.getTitle()) == null) ? null : title23.getAccessibility());
        TextView textView8 = this.orderConfirmationDateLabel;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderConfirmationDateLabel");
            textView8 = null;
        }
        CBTitleMessage orderDateLabel = data.getOrderDateLabel();
        textView8.setText((orderDateLabel == null || (title22 = orderDateLabel.getTitle()) == null) ? null : title22.getText());
        TextView textView9 = this.orderConfirmationDateLabel;
        if (textView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderConfirmationDateLabel");
            textView9 = null;
        }
        CBTitleMessage orderDateLabel2 = data.getOrderDateLabel();
        textView9.setContentDescription((orderDateLabel2 == null || (title21 = orderDateLabel2.getTitle()) == null) ? null : title21.getAccessibility());
        TextView textView10 = this.emailLabelTv;
        if (textView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emailLabelTv");
            textView10 = null;
        }
        CBTitleMessage emailLabel = data.getEmailLabel();
        textView10.setText((emailLabel == null || (title20 = emailLabel.getTitle()) == null) ? null : title20.getText());
        TextView textView11 = this.emailLabelTv;
        if (textView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emailLabelTv");
            textView11 = null;
        }
        CBTitleMessage emailLabel2 = data.getEmailLabel();
        textView11.setContentDescription((emailLabel2 == null || (title19 = emailLabel2.getTitle()) == null) ? null : title19.getAccessibility());
        TextView textView12 = this.phoneLabelTv;
        if (textView12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phoneLabelTv");
            textView12 = null;
        }
        CBTitleMessage phoneLabel = data.getPhoneLabel();
        textView12.setText((phoneLabel == null || (title18 = phoneLabel.getTitle()) == null) ? null : title18.getText());
        TextView textView13 = this.phoneLabelTv;
        if (textView13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phoneLabelTv");
            textView13 = null;
        }
        CBTitleMessage phoneLabel2 = data.getPhoneLabel();
        textView13.setContentDescription((phoneLabel2 == null || (title17 = phoneLabel2.getTitle()) == null) ? null : title17.getAccessibility());
        TextView textView14 = this.subTotalLabelTv;
        if (textView14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subTotalLabelTv");
            textView14 = null;
        }
        CBTitleMessage subTotalLabel = data.getSubTotalLabel();
        textView14.setText((subTotalLabel == null || (title16 = subTotalLabel.getTitle()) == null) ? null : title16.getText());
        TextView textView15 = this.subTotalLabelTv;
        if (textView15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subTotalLabelTv");
            textView15 = null;
        }
        CBTitleMessage subTotalLabel2 = data.getSubTotalLabel();
        textView15.setContentDescription((subTotalLabel2 == null || (title15 = subTotalLabel2.getTitle()) == null) ? null : title15.getAccessibility());
        TextView textView16 = this.taxLabelTv;
        if (textView16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taxLabelTv");
            textView16 = null;
        }
        CBTax taxLabel = data.getTaxLabel();
        textView16.setText((taxLabel == null || (title14 = taxLabel.getTitle()) == null) ? null : title14.getText());
        TextView textView17 = this.taxLabelTv;
        if (textView17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taxLabelTv");
            textView17 = null;
        }
        CBTax taxLabel2 = data.getTaxLabel();
        textView17.setContentDescription((taxLabel2 == null || (title13 = taxLabel2.getTitle()) == null) ? null : title13.getAccessibility());
        TextView textView18 = this.totalOrderLabel;
        if (textView18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("totalOrderLabel");
            textView18 = null;
        }
        CBTitleMessage totalOrderPriceLabel = data.getTotalOrderPriceLabel();
        textView18.setText((totalOrderPriceLabel == null || (title12 = totalOrderPriceLabel.getTitle()) == null) ? null : title12.getText());
        TextView textView19 = this.totalOrderLabel;
        if (textView19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("totalOrderLabel");
            textView19 = null;
        }
        CBTitleMessage totalOrderPriceLabel2 = data.getTotalOrderPriceLabel();
        textView19.setContentDescription((totalOrderPriceLabel2 == null || (title11 = totalOrderPriceLabel2.getTitle()) == null) ? null : title11.getAccessibility());
        TextView textView20 = this.paidLabelTv;
        if (textView20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paidLabelTv");
            textView20 = null;
        }
        CBTitleMessage paidLabel = data.getPaidLabel();
        textView20.setText((paidLabel == null || (title10 = paidLabel.getTitle()) == null) ? null : title10.getText());
        TextView textView21 = this.paidLabelTv;
        if (textView21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paidLabelTv");
            textView21 = null;
        }
        CBTitleMessage paidLabel2 = data.getPaidLabel();
        textView21.setContentDescription((paidLabel2 == null || (title9 = paidLabel2.getTitle()) == null) ? null : title9.getAccessibility());
        TextView textView22 = this.withLabelTv;
        if (textView22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("withLabelTv");
            textView22 = null;
        }
        CBTitleMessage withLabel = data.getWithLabel();
        textView22.setText((withLabel == null || (title8 = withLabel.getTitle()) == null) ? null : title8.getText());
        TextView textView23 = this.withLabelTv;
        if (textView23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("withLabelTv");
            textView23 = null;
        }
        CBTitleMessage withLabel2 = data.getWithLabel();
        textView23.setContentDescription((withLabel2 == null || (title7 = withLabel2.getTitle()) == null) ? null : title7.getAccessibility());
        TextView textView24 = this.authLabel;
        if (textView24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authLabel");
            textView24 = null;
        }
        CBTitleMessage authorizationLabel = data.getAuthorizationLabel();
        textView24.setText((authorizationLabel == null || (title6 = authorizationLabel.getTitle()) == null) ? null : title6.getText());
        TextView textView25 = this.authLabel;
        if (textView25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authLabel");
            textView25 = null;
        }
        CBTitleMessage authorizationLabel2 = data.getAuthorizationLabel();
        textView25.setContentDescription((authorizationLabel2 == null || (title5 = authorizationLabel2.getTitle()) == null) ? null : title5.getAccessibility());
        TextView textView26 = this.rrnLabelTv;
        if (textView26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rrnLabelTv");
            textView26 = null;
        }
        CBTitleMessage rrnLabel = data.getRrnLabel();
        textView26.setText((rrnLabel == null || (title4 = rrnLabel.getTitle()) == null) ? null : title4.getText());
        TextView textView27 = this.rrnLabelTv;
        if (textView27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rrnLabelTv");
            textView27 = null;
        }
        CBTitleMessage rrnLabel2 = data.getRrnLabel();
        textView27.setContentDescription((rrnLabel2 == null || (title3 = rrnLabel2.getTitle()) == null) ? null : title3.getAccessibility());
        HyperionButton hyperionButton = this.confirmCTA;
        if (hyperionButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmCTA");
            hyperionButton = null;
        }
        CBCta orderConfirmationCTA = data.getOrderConfirmationCTA();
        hyperionButton.setText((orderConfirmationCTA == null || (title2 = orderConfirmationCTA.getTitle()) == null) ? null : title2.getText());
        HyperionButton hyperionButton2 = this.confirmCTA;
        if (hyperionButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmCTA");
            hyperionButton2 = null;
        }
        CBCta orderConfirmationCTA2 = data.getOrderConfirmationCTA();
        if (orderConfirmationCTA2 != null && (title = orderConfirmationCTA2.getTitle()) != null) {
            accessibility = title.getAccessibility();
        }
        hyperionButton2.setContentDescription(accessibility);
        m56546A0(data);
    }

    private final void setUpListeners() {
        HyperionButton hyperionButton = this.confirmCTA;
        if (hyperionButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmCTA");
            hyperionButton = null;
        }
        hyperionButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.oneclicklib.orderconfirmation.ui.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneClickOrderConfirmationFragment.m56552z0(this.f40294a, view);
            }
        });
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "requireActivity().onBackPressedDispatcher");
        C0215t.m889b(onBackPressedDispatcher, null, false, new Function1<AbstractC0205r, Unit>() { // from class: com.disney.wdpro.oneclicklib.orderconfirmation.ui.OneClickOrderConfirmationFragment.setUpListeners.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC0205r abstractC0205r) {
                invoke2(abstractC0205r);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AbstractC0205r addCallback) {
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                if (OneClickOrderConfirmationFragment.this.isVisible()) {
                    OneClickOrderConfirmationFragment.this.requireActivity().finish();
                }
            }
        }, 3, null);
    }

    private final void setUpObservers() {
        AndroidExtKt.m60560a(this, m56550x0().m101160x(), new C166211(this));
    }

    private final void setUpUI(View view) {
        View viewFindViewById = view.findViewById(C30536a.one_click_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.one_click_title)");
        this.title = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(C30536a.image_header_confirmation);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.image_header_confirmation)");
        this.headerConfirmationImage = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(C30536a.confirmation_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.confirmation_message)");
        this.confirmationMessageTv = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(C30536a.order_confirmation_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.order_confirmation_number)");
        this.orderConfirmationNumber = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(C30536a.order_confirmation_date);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.order_confirmation_date)");
        this.orderConfirmationDate = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(C30536a.order_confirmation_email);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(R.id.order_confirmation_email)");
        this.orderConfirmationEmail = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(C30536a.confirmation_email);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(R.id.confirmation_email)");
        this.confirmationEmail = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(C30536a.order_confirmation_phone);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(R.id.order_confirmation_phone)");
        this.orderConfirmationPhone = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(C30536a.ticket_subtotal);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(R.id.ticket_subtotal)");
        this.ticketSubtotal = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(C30536a.tax_total);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(R.id.tax_total)");
        this.taxTotal = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(C30536a.total_order_price_total);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(R.id.total_order_price_total)");
        this.totalOrderPriceTotal = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(C30536a.paid_with_card_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(R.id.paid_with_card_label)");
        this.paidWithCardName = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(C30536a.paid_with_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(R.id.paid_with_value)");
        this.paidWithValue = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(C30536a.order_confirmation_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(R.id.order_confirmation_label)");
        this.orderConfirmationLabel = (TextView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(C30536a.order_confirmation_date_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(R.id.order_confirmation_date_label)");
        this.orderConfirmationDateLabel = (TextView) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(C30536a.auth_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(R.id.auth_number)");
        this.authValue = (TextView) viewFindViewById16;
        View viewFindViewById17 = view.findViewById(C30536a.RRN_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(R.id.RRN_number)");
        this.rrnValue = (TextView) viewFindViewById17;
        View viewFindViewById18 = view.findViewById(C30536a.order_confirmation_email_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(R.id.order_confirmation_email_title)");
        this.emailLabelTv = (TextView) viewFindViewById18;
        View viewFindViewById19 = view.findViewById(C30536a.order_confirmation_phone_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(R.id.order_confirmation_phone_title)");
        this.phoneLabelTv = (TextView) viewFindViewById19;
        View viewFindViewById20 = view.findViewById(C30536a.subtotal_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(R.id.subtotal_text)");
        this.subTotalLabelTv = (TextView) viewFindViewById20;
        View viewFindViewById21 = view.findViewById(C30536a.sales_tax_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById21, "findViewById(R.id.sales_tax_text)");
        this.taxLabelTv = (TextView) viewFindViewById21;
        View viewFindViewById22 = view.findViewById(C30536a.total_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById22, "findViewById(R.id.total_text)");
        this.totalOrderLabel = (TextView) viewFindViewById22;
        View viewFindViewById23 = view.findViewById(C30536a.paid_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById23, "findViewById(R.id.paid_label)");
        this.paidLabelTv = (TextView) viewFindViewById23;
        View viewFindViewById24 = view.findViewById(C30536a.with_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById24, "findViewById(R.id.with_label)");
        this.withLabelTv = (TextView) viewFindViewById24;
        View viewFindViewById25 = view.findViewById(C30536a.auth_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById25, "findViewById(R.id.auth_label)");
        this.authLabel = (TextView) viewFindViewById25;
        View viewFindViewById26 = view.findViewById(C30536a.RRN_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById26, "findViewById(R.id.RRN_label)");
        this.rrnLabelTv = (TextView) viewFindViewById26;
        View viewFindViewById27 = view.findViewById(C30536a.order_screen_primary_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById27, "findViewById(R.id.order_screen_primary_button)");
        this.confirmCTA = (HyperionButton) viewFindViewById27;
        View viewFindViewById28 = view.findViewById(C30536a.card_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById28, "findViewById(R.id.card_image)");
        this.cardImage = (ImageView) viewFindViewById28;
    }

    /* renamed from: x0 */
    private final C33248a m56550x0() {
        return (C33248a) this.oneClickOrderConfirmationViewModel.getValue();
    }

    /* renamed from: y0 */
    private final OneClickViewModel m56551y0() {
        return (OneClickViewModel) this.oneClickViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static final void m56552z0(OneClickOrderConfirmationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C31917a c31917a = C31917a.INSTANCE;
        InterfaceC8679k analyticsHelper = this$0.analyticsHelper;
        Intrinsics.checkNotNullExpressionValue(analyticsHelper, "analyticsHelper");
        c31917a.m98086a(analyticsHelper, this$0.m56550x0().getOrderConfirmationAnalytics(), "content/photopass/ARplus/Legacy/OneClickCheckout/Purchase/OrderConfirmation");
        String ctaDeeplink = this$0.m56550x0().getCtaDeeplink();
        if (ctaDeeplink != null) {
            this$0.m56551y0().m56520Q(new AbstractC31720c.NavigateToDeeplink(ctaDeeplink));
        }
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
        View viewInflate = inflater.inflate(C30537b.fragment_one_click_order_confirmation, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflater.inflate(R.layou…mation, container, false)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setUpUI(view);
        setUpObservers();
        setUpListeners();
        C31917a c31917a = C31917a.INSTANCE;
        InterfaceC8679k analyticsHelper = this.analyticsHelper;
        Intrinsics.checkNotNullExpressionValue(analyticsHelper, "analyticsHelper");
        c31917a.m98086a(analyticsHelper, m56550x0().getOrderConfirmationScreenAnalytics(), "content/photopass/ARplus/Legacy/OneClickCheckout/Purchase/OrderConfirmation");
    }
}