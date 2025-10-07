package com.disney.wdpro.photopass_plus.activities;

import android.content.Context;
import android.content.Intent;
import com.disney.wdpro.bookingservices.model.PhotopassCheckoutBody;
import com.disney.wdpro.photopass_plus.analytics.PhotoPassAnalyticsUtil;
import com.disney.wdpro.photopass_plus.models.CapturedMediaInfo;
import com.disney.wdpro.photopass_plus.models.PhotoPassProduct;
import com.disney.wdpro.photopass_plus.utils.ConfirmationMessageHelper;
import com.disney.wdpro.photopass_plus.utils.PhotoPassOrderSummaryHelper;
import com.disney.wdpro.photopass_plus.utils.StringsProvider;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes15.dex */
public class CommerceCheckoutDelegate {
    private static final String ANALYTICS_TICKET_SALES_M_PURCHASE_DEFAULT = "1";
    public static final int COMMERCE_CHECKOUT_REQUEST_CODE_FINISH_FLOW = 355;
    private PhotoPassProduct photoPassProduct;

    private PhotopassCheckoutBody.AnalyticsContextData buildAnalyticsContextData(SelectedTicketProducts selectedTicketProducts, CapturedMediaInfo capturedMediaInfo) {
        return new PhotopassCheckoutBody.AnalyticsContextData(buildProductString(selectedTicketProducts), buildLifetimeValueIncreaseContext(selectedTicketProducts), buildAnalyticsExtras(capturedMediaInfo));
    }

    private Map<String, String> buildAnalyticsExtras(CapturedMediaInfo capturedMediaInfo) {
        HashMap map = new HashMap();
        if (capturedMediaInfo != null) {
            map.put("experienceid", capturedMediaInfo.getExperienceId());
            map.put("location", capturedMediaInfo.getLocation());
            map.put("search.window", String.valueOf(capturedMediaInfo.getSearchWindow()));
            map.put("assetid", capturedMediaInfo.getAssetId());
            map.put("photo.type", capturedMediaInfo.getMediaCategory());
            try {
                Locale locale = Locale.US;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", locale);
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mma", locale);
                String str = simpleDateFormat.format(capturedMediaInfo.getCaptureDate());
                String str2 = simpleDateFormat2.format(capturedMediaInfo.getCaptureDate());
                map.put("search.date", str);
                map.put("search.time", str2);
            } catch (IllegalArgumentException unused) {
            }
        }
        return map;
    }

    private Map<String, String> buildLifetimeValueIncreaseContext(SelectedTicketProducts selectedTicketProducts) {
        HashMap map = new HashMap();
        Price priceOrNull = selectedTicketProducts.getCombinedTotal().orNull();
        BigDecimal value = priceOrNull != null ? priceOrNull.getValue() : BigDecimal.ZERO;
        map.put("photopass.purchase", "1");
        map.put("store", PhotoPassAnalyticsUtil.getAnalyticsStoreName());
        map.put("price", String.valueOf(value));
        return map;
    }

    private String buildProductString(SelectedTicketProducts selectedTicketProducts) {
        return PhotoPassAnalyticsUtil.getAnalyticsProductString(selectedTicketProducts);
    }

    private String getCongratulationsText(Context context, StringsProvider stringsProvider, SelectedTicketProducts selectedTicketProducts, CapturedMediaInfo capturedMediaInfo) {
        return new ConfirmationMessageHelper(context, stringsProvider).getMessage(PhotoPassProduct.getProduct(selectedTicketProducts), capturedMediaInfo);
    }

    private String getTermsAndConditionsCheckLabel(Context context, SelectedTicketProducts selectedTicketProducts, CapturedMediaInfo capturedMediaInfo) {
        return capturedMediaInfo != null ? new PhotoPassOrderSummaryHelper(context, capturedMediaInfo, selectedTicketProducts).getExpirationPolicyCheckBoxLabel() : "";
    }

    public Intent buildPhotoPassCheckoutAppIntent(Context context, StringsProvider stringsProvider, SelectedTicketProducts selectedTicketProducts, Calendar calendar, CapturedMediaInfo capturedMediaInfo, boolean z10) {
        this.photoPassProduct = PhotoPassProduct.getProduct(selectedTicketProducts);
        return CommerceCheckoutIntentProvider.getIntent(context, selectedTicketProducts, calendar, getTermsAndConditionsCheckLabel(context, selectedTicketProducts, capturedMediaInfo), capturedMediaInfo, getCongratulationsText(context, stringsProvider, selectedTicketProducts, capturedMediaInfo), buildAnalyticsContextData(selectedTicketProducts, capturedMediaInfo), z10);
    }

    public PhotoPassProduct getPhotoPassProduct() {
        return this.photoPassProduct;
    }
}