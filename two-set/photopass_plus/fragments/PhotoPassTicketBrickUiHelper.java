package com.disney.wdpro.photopass_plus.fragments;

import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.C3337b1;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsHelper;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper;
import com.disney.wdpro.base_sales_ui_lib.product.manager.TicketSalesConfigManager;
import com.disney.wdpro.base_sales_ui_lib.utils.DisplayPriceFormatter;
import com.disney.wdpro.base_sales_ui_lib.utils.FlipCardAnimationUtils;
import com.disney.wdpro.base_sales_ui_lib.utils.URLSpanNoUnderline;
import com.disney.wdpro.photopass_plus.C18785R;
import com.disney.wdpro.photopass_plus.accessibility.AccessibilityDelegateManager;
import com.disney.wdpro.photopass_plus.accessibility.BackBrickItemContentDescriptionBuilder;
import com.disney.wdpro.photopass_plus.accessibility.FrontBrickItemContentDescriptionBuilder;
import com.disney.wdpro.photopass_plus.analytics.PhotoPassAnalyticsConstants;
import com.disney.wdpro.photopass_plus.analytics.PhotoPassAnalyticsUtil;
import com.disney.wdpro.photopass_plus.models.CapturedMediaInfo;
import com.disney.wdpro.photopass_plus.models.PhotoPassProduct;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNameMap;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNames;
import com.disney.wdpro.ticket_sales_base_lib.business.product.Policy;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PolicyGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.google.common.base.C22462m;
import com.google.common.base.Optional;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes15.dex */
class PhotoPassTicketBrickUiHelper implements TicketBrickUiHelper {
    private static final String ANALYTICS_TICKET_SALES_PRODVIEW_DEFAULT = "1";
    private static final SimpleDateFormat BRICK_DATE_FORMAT = new SimpleDateFormat("EEEE, MMM dd, yyyy");
    private static final String BRICK_SELECTED_DATE_FORMAT = "EEEE, MMM dd, yyyy";
    private AccessibilityDelegateManager accessibilityDelegateManager;
    private TicketSalesAnalyticsHelper analyticsHelper;
    private CapturedMediaInfo capturedMediaInfo;
    private final FlipCardAnimationUtils.FlippedViewVisibilityNotifier flippedViewVisibilityNotifier;

    static class ViewHolderItem {
        BackBrickItemContentDescriptionBuilder backBrickItemContentDescriptionBuilder;
        ImageView backOfCardButton;
        TextView backOfCardDescription;
        RelativeLayout backViewContainer;
        TextView capturedDateBack;
        TextView capturedDateFront;
        FrontBrickItemContentDescriptionBuilder frontBrickItemContentDescriptionBuilder;
        ImageView frontOfCardButton;
        ViewGroup frontViewContainer;
        ViewGroup listItem;
        SelectedTicketProducts selectedTicketProducts;
        View ticketBuyButton;
        TextView ticketCaptionTextItem;
        TextView ticketCaptionTextItemBack;
        View ticketCheckoutButton;
        TextView ticketNameTextItem;
        TextView ticketNameTextItemBack;
        TextView ticketPriceLabel;
        TextView ticketPriceLabelBack;
        TextView ticketPriceTextItem;
        TextView ticketPriceTextItemBack;
        TextView ticketSubCaptionTextItem;

        ViewHolderItem() {
        }
    }

    PhotoPassTicketBrickUiHelper(FlipCardAnimationUtils.FlippedViewVisibilityNotifier flippedViewVisibilityNotifier, TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper) {
        this.flippedViewVisibilityNotifier = flippedViewVisibilityNotifier;
        this.analyticsHelper = (TicketSalesAnalyticsHelper) C22462m.m68685q(ticketSalesAnalyticsHelper, "analyticsHelper == null");
    }

    private String getHtmlPolicy(ImmutableList<Policy> immutableList) {
        StringBuilder sb2 = new StringBuilder();
        AbstractC22726b3<Policy> it = immutableList.iterator();
        while (it.hasNext()) {
            String strReplace = it.next().getPolicyDescriptionMap().get(PolicyGroup.PolicyDescriptionKey.TERMS_OF_USE_DESCRIPTION).replace("\\\\", "");
            if (!TextUtils.isEmpty(strReplace)) {
                sb2.append(strReplace);
            }
        }
        return sb2.toString();
    }

    private void setTotalPriceLabel(Optional<Price> optional, TextView textView) {
        if (!optional.isPresent() || BigDecimal.ZERO.compareTo(optional.get().getValue()) == 0) {
            textView.setText(C18785R.string.ticket_sales_total_price_without_tax_description);
        } else {
            textView.setText(C18785R.string.ticket_sales_total_price_including_tax_description);
        }
    }

    private void showCaptureDate(ViewHolderItem viewHolderItem) {
        if (this.capturedMediaInfo == null || viewHolderItem.selectedTicketProducts.getNumberOfSelectedDays().intValue() != 1) {
            TextView textView = viewHolderItem.capturedDateFront;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = viewHolderItem.capturedDateBack;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        if (viewHolderItem.capturedDateFront != null) {
            String str = BRICK_DATE_FORMAT.format(Long.valueOf(this.capturedMediaInfo.getCaptureDate().getTime()));
            viewHolderItem.capturedDateFront.setText(str);
            viewHolderItem.frontBrickItemContentDescriptionBuilder.appendCaptureDate(str);
            viewHolderItem.capturedDateFront.setVisibility(0);
        }
        TextView textView3 = viewHolderItem.capturedDateBack;
        if (textView3 != null) {
            textView3.setText(BRICK_DATE_FORMAT.format(Long.valueOf(this.capturedMediaInfo.getCaptureDate().getTime())));
            viewHolderItem.capturedDateBack.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackBackOfCardClicked(SelectedTicketProducts selectedTicketProducts, TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper) {
        Map<String, String> defaultContext = ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("&&products", PhotoPassAnalyticsUtil.getAnalyticsProductString(selectedTicketProducts));
        defaultContext.put("link.category", "PhotoPass");
        defaultContext.put("store", PhotoPassAnalyticsUtil.getAnalyticsStoreName());
        if (this.capturedMediaInfo != null) {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", locale);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mma", locale);
            defaultContext.put("experienceid", this.capturedMediaInfo.getExperienceId());
            defaultContext.put("location", this.capturedMediaInfo.getLocation());
            defaultContext.put("search.window", String.valueOf(this.capturedMediaInfo.getSearchWindow()));
            defaultContext.put("assetid", this.capturedMediaInfo.getAssetId());
            defaultContext.put("photo.type", this.capturedMediaInfo.getMediaCategory());
            String str = simpleDateFormat.format(this.capturedMediaInfo.getCaptureDate());
            String str2 = simpleDateFormat2.format(this.capturedMediaInfo.getCaptureDate());
            defaultContext.put("search.date", str);
            defaultContext.put("search.time", str2);
        }
        ticketSalesAnalyticsHelper.trackAction(PhotoPassAnalyticsConstants.PHOTO_PASS_ACTION_DETAIL_CLOSE, defaultContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackFrontOfCardClicked(SelectedTicketProducts selectedTicketProducts, TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper) {
        Map<String, String> defaultContext = ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("&&products", PhotoPassAnalyticsUtil.getAnalyticsProductString(selectedTicketProducts));
        defaultContext.put("link.category", "PhotoPass");
        defaultContext.put("prodview", "1");
        defaultContext.put("store", PhotoPassAnalyticsUtil.getAnalyticsStoreName());
        if (this.capturedMediaInfo != null) {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", locale);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mma", locale);
            defaultContext.put("experienceid", this.capturedMediaInfo.getExperienceId());
            defaultContext.put("location", this.capturedMediaInfo.getLocation());
            defaultContext.put("search.window", String.valueOf(this.capturedMediaInfo.getSearchWindow()));
            defaultContext.put("assetid", this.capturedMediaInfo.getAssetId());
            defaultContext.put("photo.type", this.capturedMediaInfo.getMediaCategory());
            String str = simpleDateFormat.format(this.capturedMediaInfo.getCaptureDate());
            String str2 = simpleDateFormat2.format(this.capturedMediaInfo.getCaptureDate());
            defaultContext.put("search.date", str);
            defaultContext.put("search.time", str2);
        }
        ticketSalesAnalyticsHelper.trackAction(PhotoPassAnalyticsConstants.PHOTO_PASS_ACTION_DETAIL, defaultContext);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper
    public View createSelectedProductsView(LayoutInflater layoutInflater, ViewGroup viewGroup, SelectedTicketProducts selectedTicketProducts) {
        int i10 = C18785R.layout.ppp_option_list_item;
        if (PhotoPassProduct.LEGACY_MEMORY_MAKER.equals(PhotoPassProduct.getProduct(selectedTicketProducts))) {
            i10 = C18785R.layout.mm_option_list_item;
        }
        this.accessibilityDelegateManager = new AccessibilityDelegateManager();
        View viewInflate = layoutInflater.inflate(i10, viewGroup, false);
        ViewHolderItem viewHolderItem = new ViewHolderItem();
        viewHolderItem.selectedTicketProducts = selectedTicketProducts;
        viewHolderItem.listItem = (ViewGroup) viewInflate.findViewById(C18785R.id.memory_maker_item_container);
        viewHolderItem.frontViewContainer = (ViewGroup) viewInflate.findViewById(C18785R.id.ticket_sales_front_brick_container);
        viewHolderItem.backViewContainer = (RelativeLayout) viewInflate.findViewById(C18785R.id.price_information_section);
        viewHolderItem.ticketNameTextItem = (TextView) viewInflate.findViewById(C18785R.id.memory_maker_name_text_item);
        viewHolderItem.ticketNameTextItemBack = (TextView) viewInflate.findViewById(C18785R.id.ticket_name_text_item_back);
        viewHolderItem.ticketCaptionTextItem = (TextView) viewInflate.findViewById(C18785R.id.memory_maker_text_title_caption);
        viewHolderItem.ticketCaptionTextItemBack = (TextView) viewInflate.findViewById(C18785R.id.memory_maker_text_caption_back);
        viewHolderItem.ticketSubCaptionTextItem = (TextView) viewInflate.findViewById(C18785R.id.memory_maker_text_subcaption);
        viewHolderItem.ticketPriceTextItem = (TextView) viewInflate.findViewById(C18785R.id.memory_maker_price_text_item);
        viewHolderItem.ticketPriceLabel = (TextView) viewInflate.findViewById(C18785R.id.memory_maker_text_price_label);
        viewHolderItem.ticketPriceLabelBack = (TextView) viewInflate.findViewById(C18785R.id.memory_maker_text_price_label_back);
        viewHolderItem.frontOfCardButton = (ImageView) viewInflate.findViewById(C18785R.id.memory_maker_more_information_icon_front);
        viewHolderItem.backOfCardButton = (ImageView) viewInflate.findViewById(C18785R.id.memory_maker_more_information_icon_back);
        viewHolderItem.backOfCardDescription = (TextView) viewInflate.findViewById(C18785R.id.memory_maker_ticket_description_and_policies);
        viewHolderItem.ticketBuyButton = viewInflate.findViewById(C18785R.id.imageView);
        viewHolderItem.ticketCheckoutButton = viewInflate.findViewById(C18785R.id.photo_pass_plus_buy_button_back);
        viewHolderItem.capturedDateFront = (TextView) viewInflate.findViewById(C18785R.id.memory_maker_text_date_front);
        viewHolderItem.capturedDateBack = (TextView) viewInflate.findViewById(C18785R.id.memory_maker_text_date_back);
        viewHolderItem.ticketPriceTextItemBack = (TextView) viewInflate.findViewById(C18785R.id.memory_maker_ticket_price_text_item);
        viewHolderItem.frontBrickItemContentDescriptionBuilder = new FrontBrickItemContentDescriptionBuilder(viewGroup.getContext());
        viewHolderItem.backBrickItemContentDescriptionBuilder = new BackBrickItemContentDescriptionBuilder(viewGroup.getContext());
        viewInflate.setTag(viewHolderItem);
        C3337b1.m17275r0(viewHolderItem.frontOfCardButton, this.accessibilityDelegateManager);
        return viewInflate;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper
    public void populateSelectedTicketHeader(TicketSalesConfigManager ticketSalesConfigManager, View view, boolean z10, String str, boolean z11) {
        Spanned spannedFromHtml;
        Spanned spannedFromHtml2;
        Spanned spannedFromHtml3;
        view.getContext();
        final ViewHolderItem viewHolderItem = (ViewHolderItem) view.getTag();
        DisplayNames displayNames = viewHolderItem.selectedTicketProducts.getTicketDisplayNames().get();
        Price price = viewHolderItem.selectedTicketProducts.getCombinedTotal().get();
        Optional<Price> combinedTax = viewHolderItem.selectedTicketProducts.getCombinedTax();
        if (displayNames.getTicketTitle().isPresent()) {
            DisplayNames.TicketTitle ticketTitle = displayNames.getTicketTitle().get();
            DisplayNameMap.Type type = DisplayNameMap.Type.HTML;
            spannedFromHtml = Html.fromHtml(ticketTitle.getTitle(type));
            spannedFromHtml3 = Html.fromHtml(ticketTitle.getCaption(type));
            spannedFromHtml2 = Html.fromHtml(ticketTitle.getSubCaption(type));
        } else {
            spannedFromHtml = null;
            spannedFromHtml2 = null;
            spannedFromHtml3 = null;
        }
        viewHolderItem.ticketNameTextItem.setText(spannedFromHtml);
        viewHolderItem.ticketCaptionTextItem.setText(spannedFromHtml3);
        viewHolderItem.ticketSubCaptionTextItem.setText(spannedFromHtml2);
        viewHolderItem.ticketPriceTextItem.setText(DisplayPriceFormatter.formatDisplayPrice(price));
        setTotalPriceLabel(combinedTax, viewHolderItem.ticketPriceLabel);
        ImmutableList<Policy> matchingPolicies = viewHolderItem.selectedTicketProducts.getMatchingPolicies(ImmutableSet.m69130of(PolicyGroup.TERMS_OF_USE), ImmutableSet.m69130of(PolicyGroup.PolicySubGroup.MATCH_ALL));
        View view2 = viewHolderItem.ticketBuyButton;
        if (view2 != null) {
            view2.setVisibility(z10 ? 0 : 4);
        }
        viewHolderItem.frontBrickItemContentDescriptionBuilder.appendPositionInList(str).appendProductCaption(spannedFromHtml3).appendProductName(spannedFromHtml).appendProductSubCaption(spannedFromHtml2).appendPrice(price).appendButtonSuffix();
        showCaptureDate(viewHolderItem);
        viewHolderItem.frontViewContainer.setContentDescription(viewHolderItem.frontBrickItemContentDescriptionBuilder.build());
        viewHolderItem.listItem.setAccessibilityTraversalAfter(C18785R.id.photo_pass_plus_buy_button_back);
        if (matchingPolicies.isEmpty()) {
            viewHolderItem.frontOfCardButton.setVisibility(4);
            return;
        }
        viewHolderItem.frontOfCardButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.photopass_plus.fragments.PhotoPassTicketBrickUiHelper.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                viewHolderItem.frontOfCardButton.setEnabled(false);
                new FlipCardAnimationUtils(PhotoPassTicketBrickUiHelper.this.flippedViewVisibilityNotifier).flipCard(FlipCardAnimationUtils.FlipDegrees.CARD_POSITION.getDegrees(), FlipCardAnimationUtils.FlipDegrees.MID_FLIP_FRONT_OF_CARD_POSITION.getDegrees(), viewHolderItem.listItem);
                viewHolderItem.backOfCardButton.setEnabled(true);
                PhotoPassTicketBrickUiHelper photoPassTicketBrickUiHelper = PhotoPassTicketBrickUiHelper.this;
                photoPassTicketBrickUiHelper.trackFrontOfCardClicked(viewHolderItem.selectedTicketProducts, photoPassTicketBrickUiHelper.analyticsHelper);
            }
        });
        Spannable spannableReplaceURLSpans = URLSpanNoUnderline.replaceURLSpans((Spannable) Html.fromHtml(getHtmlPolicy(matchingPolicies)));
        viewHolderItem.backOfCardDescription.setText(spannableReplaceURLSpans);
        viewHolderItem.backOfCardDescription.setMovementMethod(LinkMovementMethod.getInstance());
        viewHolderItem.ticketPriceTextItemBack.setText(DisplayPriceFormatter.formatDisplayPrice(price));
        viewHolderItem.ticketNameTextItemBack.setText(spannedFromHtml);
        viewHolderItem.ticketCaptionTextItemBack.setText(spannedFromHtml3);
        setTotalPriceLabel(combinedTax, viewHolderItem.ticketPriceLabelBack);
        viewHolderItem.backBrickItemContentDescriptionBuilder.appendPositionInList(str).appendProductCaption(spannedFromHtml3).appendProductName(spannedFromHtml).appendProductFullDescription(spannableReplaceURLSpans).appendPrice(price).appendButtonSuffix();
        viewHolderItem.backViewContainer.setContentDescription(viewHolderItem.backBrickItemContentDescriptionBuilder.build());
        viewHolderItem.backOfCardButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.photopass_plus.fragments.PhotoPassTicketBrickUiHelper.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                viewHolderItem.backOfCardButton.setEnabled(false);
                new FlipCardAnimationUtils(PhotoPassTicketBrickUiHelper.this.flippedViewVisibilityNotifier).flipCard(FlipCardAnimationUtils.FlipDegrees.CARD_POSITION.getDegrees(), FlipCardAnimationUtils.FlipDegrees.MID_FLIP_BACK_OF_CARD_POSITION.getDegrees(), viewHolderItem.listItem);
                viewHolderItem.frontOfCardButton.setEnabled(true);
                PhotoPassTicketBrickUiHelper photoPassTicketBrickUiHelper = PhotoPassTicketBrickUiHelper.this;
                photoPassTicketBrickUiHelper.trackBackOfCardClicked(viewHolderItem.selectedTicketProducts, photoPassTicketBrickUiHelper.analyticsHelper);
            }
        });
        View view3 = viewHolderItem.ticketCheckoutButton;
        if (view3 != null) {
            view3.setVisibility(z10 ? 0 : 4);
        }
    }

    public PhotoPassTicketBrickUiHelper withCaptureMediaInfo(CapturedMediaInfo capturedMediaInfo) {
        this.capturedMediaInfo = capturedMediaInfo;
        return this;
    }
}