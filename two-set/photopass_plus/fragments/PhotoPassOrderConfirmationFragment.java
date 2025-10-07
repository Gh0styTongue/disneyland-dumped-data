package com.disney.wdpro.photopass_plus.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsHelper;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper;
import com.disney.wdpro.base_sales_ui_lib.utils.FlipCardAnimationUtils;
import com.disney.wdpro.base_sales_ui_lib.utils.URLSpanNoUnderline;
import com.disney.wdpro.base_sales_ui_lib.views.BaseCreditCardInformation;
import com.disney.wdpro.base_sales_ui_lib.views.CreditCardInformation;
import com.disney.wdpro.photopass_plus.C18785R;
import com.disney.wdpro.photopass_plus.abtesting.ExperienceActions;
import com.disney.wdpro.photopass_plus.analytics.PhotoPassAnalyticsConstants;
import com.disney.wdpro.photopass_plus.analytics.PhotoPassAnalyticsUtil;
import com.disney.wdpro.photopass_plus.fragments.PhotoPassPaywallFragment;
import com.disney.wdpro.photopass_plus.models.CapturedMediaInfo;
import com.disney.wdpro.photopass_plus.models.PhotoPassProduct;
import com.disney.wdpro.photopass_plus.utils.ConfirmationMessageHelper;
import com.disney.wdpro.photopass_plus.utils.StringsProvider;
import com.disney.wdpro.support.accessibility.C20511d;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.PaymentUsed;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.PurchaseConfirmation;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes15.dex */
public class PhotoPassOrderConfirmationFragment extends BaseConfirmationManagerFragment {
    private static final String ANALYTICS_TICKET_SALES_M_PURCHASE_DEFAULT = "1";
    private static final String ANALYTICS_TICKET_SALES_ORDER_PENDING_DEFAULT = "1";
    private CreditCardInformation ccInfo;
    private TextView deliveryInstructionsBody;
    private TextView deliveryInstructionsHeader;
    private View deliveryInstructionsSeparator;
    private ExperienceActions experienceActions;
    private TextView goToGalleryButton;
    private OrderConfirmationActions orderConfirmationActions;
    private TextView orderConfirmationHeader;
    private TextView orderConfirmationNumber;
    private ViewGroup orderConfirmationNumberContainer;
    private TextView orderDate;
    private TextView orderPlacedHeader;
    private TextView orderPlacedText;
    private PhotoPassPaywallFragment.PayWallActions payWallActions;
    private ViewGroup selectedProductsHeader;
    private View selectedProductsView;
    private StringsProvider stringsProvider;

    public interface OrderConfirmationActions {
        void setPurchaseResult(BookingStatus bookingStatus, PhotoPassProduct photoPassProduct);
    }

    public static PhotoPassOrderConfirmationFragment newInstance(SelectedTicketProducts selectedTicketProducts, Long l10) {
        PhotoPassOrderConfirmationFragment photoPassOrderConfirmationFragment = new PhotoPassOrderConfirmationFragment();
        photoPassOrderConfirmationFragment.setArguments(BaseConfirmationFragment.ArgumentBuilder.createInstance().withSelectedTicket(selectedTicketProducts).withTicketOrderForm(l10).build());
        return photoPassOrderConfirmationFragment;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment
    protected TicketBrickUiHelper createTicketBrickUiHelper(FlipCardAnimationUtils.FlippedViewVisibilityNotifier flippedViewVisibilityNotifier, TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper) {
        PhotoPassTicketBrickUiHelper photoPassTicketBrickUiHelper = new PhotoPassTicketBrickUiHelper(null, ticketSalesAnalyticsHelper);
        CapturedMediaInfo captureMediaInfo = this.payWallActions.getCaptureMediaInfo();
        if (captureMediaInfo != null) {
            photoPassTicketBrickUiHelper.withCaptureMediaInfo(captureMediaInfo);
        }
        return photoPassTicketBrickUiHelper;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected BaseCreditCardInformation getCCInfo() {
        return this.ccInfo;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected BaseConfirmationManagerFragment.ConfirmationTitles getConfirmationTitles(PurchaseConfirmation purchaseConfirmation) {
        return new BaseConfirmationManagerFragment.ConfirmationTitles(C18785R.string.ticket_sales_order_confirmation_title, C18785R.string.ticket_sales_order_pending_title);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected CharSequence getDeliveryInstructionsBodySpanned(String str, String str2) {
        return URLSpanNoUnderline.replaceURLSpans((Spannable) Html.fromHtml(str));
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected BaseConfirmationManagerFragment.OrderPlacedUiHelper getOrderPlacedHelper() {
        return new BaseConfirmationManagerFragment.OrderPlacedUiHelper() { // from class: com.disney.wdpro.photopass_plus.fragments.PhotoPassOrderConfirmationFragment.2
            @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment.OrderPlacedUiHelper
            public void updateOrderPlacedUi(PurchaseConfirmation purchaseConfirmation) {
                if (purchaseConfirmation.getOrderStatus() != BookingStatus.BOOKED) {
                    PhotoPassOrderConfirmationFragment.this.orderPlacedHeader.setText(PhotoPassOrderConfirmationFragment.this.getString(C18785R.string.ticket_sales_order_confirmation_pending_header));
                    PhotoPassOrderConfirmationFragment.this.orderPlacedText.setText(PhotoPassOrderConfirmationFragment.this.getString(C18785R.string.order_confirmation_pending_text));
                    return;
                }
                PhotoPassOrderConfirmationFragment.this.orderPlacedText.setText(PhotoPassOrderConfirmationFragment.this.getString(C18785R.string.order_confirmation_message, new ConfirmationMessageHelper(PhotoPassOrderConfirmationFragment.this.getContext(), PhotoPassOrderConfirmationFragment.this.stringsProvider).getMessage(PhotoPassProduct.getProduct(PhotoPassOrderConfirmationFragment.this.getSelectedTicketProducts()), PhotoPassOrderConfirmationFragment.this.payWallActions.getCaptureMediaInfo()), purchaseConfirmation.getConfirmationEmail()));
                PhotoPassOrderConfirmationFragment.this.orderPlacedHeader.setText(PhotoPassOrderConfirmationFragment.this.getString(C18785R.string.ticket_sales_order_confirmation_placed_header));
            }
        };
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment
    protected View getTicketBrickView() {
        if (this.selectedProductsView == null) {
            View selectedProductView = getSelectedProductView(getLayoutInflater(), this.selectedProductsHeader);
            this.selectedProductsView = selectedProductView;
            this.selectedProductsHeader.addView(selectedProductView);
        }
        return this.selectedProductsView;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return null;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.payWallActions = (PhotoPassPaywallFragment.PayWallActions) activity;
            this.orderConfirmationActions = (OrderConfirmationActions) activity;
            this.experienceActions = (ExperienceActions) activity;
            this.stringsProvider = (StringsProvider) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement PayWallActions and ExperienceActions");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C18785R.layout.ppp_fragment_order_confirmation, viewGroup, false);
        this.selectedProductsHeader = (ViewGroup) viewInflate.findViewById(C18785R.id.order_confirmation_header);
        this.orderPlacedHeader = (TextView) viewInflate.findViewById(C18785R.id.order_placed_header);
        this.orderPlacedText = (TextView) viewInflate.findViewById(C18785R.id.order_placed_text);
        this.deliveryInstructionsHeader = (TextView) viewInflate.findViewById(C18785R.id.delivery_instructions_header);
        this.deliveryInstructionsBody = (TextView) viewInflate.findViewById(C18785R.id.delivery_instructions_body);
        this.deliveryInstructionsSeparator = viewInflate.findViewById(C18785R.id.delivery_instructions_separator);
        this.orderDate = (TextView) viewInflate.findViewById(C18785R.id.confirmation_date_value);
        this.ccInfo = (CreditCardInformation) viewInflate.findViewById(C18785R.id.credit_card_information);
        this.orderConfirmationHeader = (TextView) viewInflate.findViewById(C18785R.id.order_confirmation_code_header);
        this.orderConfirmationNumber = (TextView) viewInflate.findViewById(C18785R.id.order_confirmation_code_text);
        this.orderConfirmationNumberContainer = (ViewGroup) viewInflate.findViewById(C18785R.id.accessibility_confirmation_code_layout);
        TextView textView = (TextView) viewInflate.findViewById(C18785R.id.btn_go_to_gallery);
        this.goToGalleryButton = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.photopass_plus.fragments.PhotoPassOrderConfirmationFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PhotoPassOrderConfirmationFragment.this.setNextButtonAction();
            }
        });
        return viewInflate;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void renderRemainingUi(PurchaseConfirmation purchaseConfirmation) {
        this.orderConfirmationActions.setPurchaseResult(purchaseConfirmation.getOrderStatus(), PhotoPassProduct.getProduct(getSelectedTicketProducts()));
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void sendAnalyticsOrderConfirmationState(PurchaseConfirmation purchaseConfirmation, SelectedTicketProducts selectedTicketProducts) {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("&&products", PhotoPassAnalyticsUtil.getAnalyticsProductString(selectedTicketProducts));
        mapMo37420q.put("store", PhotoPassAnalyticsUtil.getAnalyticsStoreName());
        Optional<PaymentUsed> paymentUsed = purchaseConfirmation.getPaymentUsed();
        mapMo37420q.put("paymentmethod", paymentUsed.isPresent() ? C22466q.m68725e(paymentUsed.get().getCardSubType()) : "");
        if (purchaseConfirmation.getOrderStatus() == BookingStatus.PENDED) {
            mapMo37420q.put("orderpending", "1");
            mapMo37420q.put("m.purchaseid", purchaseConfirmation.getOrderId());
        } else {
            mapMo37420q.put("m.purchaseid", formatConfirmationNumbers(purchaseConfirmation));
        }
        mapMo37420q.put("m.purchase", "1");
        CapturedMediaInfo captureMediaInfo = this.payWallActions.getCaptureMediaInfo();
        if (captureMediaInfo != null) {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", locale);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mma", locale);
            mapMo37420q.put("experienceid", captureMediaInfo.getExperienceId());
            mapMo37420q.put("location", captureMediaInfo.getLocation());
            mapMo37420q.put("search.window", String.valueOf(captureMediaInfo.getSearchWindow()));
            mapMo37420q.put("assetid", captureMediaInfo.getAssetId());
            mapMo37420q.put("photo.type", captureMediaInfo.getMediaCategory());
            String str = simpleDateFormat.format(captureMediaInfo.getCaptureDate());
            String str2 = simpleDateFormat2.format(captureMediaInfo.getCaptureDate());
            mapMo37420q.put("search.date", str);
            mapMo37420q.put("search.time", str2);
        }
        this.analyticsHelper.mo37406c(PhotoPassAnalyticsConstants.PHOTO_PASS_STATE_CONFIRMATION, getClass().getSimpleName(), mapMo37420q);
        Price priceOrNull = selectedTicketProducts.getCombinedTotal().orNull();
        this.experienceActions.trackOrderConfirmationAction(formatConfirmationNumbers(purchaseConfirmation), (priceOrNull != null ? priceOrNull.getValue() : BigDecimal.ZERO).toString(), PhotoPassAnalyticsUtil.getAnalyticsProductString(selectedTicketProducts));
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void setConfirmationDate(CharSequence charSequence) {
        this.orderDate.setText(charSequence);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment
    protected void trackNextAction() {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("link.category", "PhotoPass");
        this.analyticsHelper.mo37405b(PhotoPassAnalyticsConstants.PHOTO_PASS_ACTION_RETURN_GALLERY, mapMo37420q);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void updateConfirmationNumberUi(String str) {
        String string = getString(C18785R.string.order_confirmation_number);
        String strM68721a = C22466q.m68721a(str);
        updateHeaderBodyUi(BaseConfirmationManagerFragment.TextViewPair.create(this.orderConfirmationHeader, string), BaseConfirmationManagerFragment.TextViewPair.create(this.orderConfirmationNumber, strM68721a), null);
        C20511d c20511d = new C20511d(getContext());
        c20511d.m62026e(string, " ");
        if (!C22466q.m68722b(strM68721a)) {
            c20511d.m62033l(strM68721a);
        }
        this.orderConfirmationNumberContainer.setContentDescription(c20511d.toString());
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void updateDeliveryInstructionsUi(CharSequence charSequence, CharSequence charSequence2, String str) {
        updateHeaderBodyUi(BaseConfirmationManagerFragment.TextViewPair.create(this.deliveryInstructionsHeader, charSequence), BaseConfirmationManagerFragment.TextViewPair.create(this.deliveryInstructionsBody, charSequence2), this.deliveryInstructionsSeparator);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void updateNextCallToActionUi(PurchaseConfirmation purchaseConfirmation) {
    }
}