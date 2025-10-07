package com.disney.wdpro.photopass_plus.analytics;

import android.text.TextUtils;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketOptionListAdapter;
import com.disney.wdpro.httpclient.UnSuccessStatusException;
import com.disney.wdpro.ticket_sales_base_lib.ResponseEvent;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.google.common.base.Optional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(m92037d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0007J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u0012\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m92038d2 = {"Lcom/disney/wdpro/photopass_plus/analytics/PhotoPassAnalyticsUtil;", "", "()V", "ANALYTICS_DATE_FORMAT", "", "ANALYTICS_PHOTO_PASS_PRODUCT_ATS_DEFAULT", "ANALYTICS_PHOTO_PASS_PRODUCT_PRICE_DEFAULT", "ANALYTICS_TIME_FORMAT", "DELIMITER", "ONE_DAY", "", "analyticsStoreName", "getAnalyticsStoreName$annotations", "getAnalyticsStoreName", "()Ljava/lang/String;", "addEventDataToContext", "", "analyticsContext", "", "event", "Lcom/disney/wdpro/ticket_sales_base_lib/ResponseEvent;", "getAnalyticsProductString", "selectedTicketProducts", "Lcom/disney/wdpro/ticket_sales_base_lib/business/product/SelectedTicketProducts;", "getAnalyticsProductsString", "ticketOptionListAdapter", "Lcom/disney/wdpro/base_sales_ui_lib/fragments/TicketOptionListAdapter;", "photopass-plus_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final class PhotoPassAnalyticsUtil {
    public static final String ANALYTICS_DATE_FORMAT = "yyyy/MM/dd";
    private static final String ANALYTICS_PHOTO_PASS_PRODUCT_ATS_DEFAULT = "PP";
    private static final String ANALYTICS_PHOTO_PASS_PRODUCT_PRICE_DEFAULT = "0.00";
    public static final String ANALYTICS_TIME_FORMAT = "hh:mma";
    private static final String DELIMITER = ",";
    public static final PhotoPassAnalyticsUtil INSTANCE = new PhotoPassAnalyticsUtil();
    private static final int ONE_DAY = 1;

    private PhotoPassAnalyticsUtil() {
    }

    @JvmStatic
    public static final void addEventDataToContext(Map<String, String> analyticsContext, ResponseEvent<?> event) {
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        Intrinsics.checkNotNullParameter(event, "event");
        Throwable throwable = event.getThrowable();
        if (throwable == null || !(throwable instanceof UnSuccessStatusException)) {
            return;
        }
        analyticsContext.put("error.statuscode", String.valueOf(((UnSuccessStatusException) throwable).getStatusCode()));
    }

    @JvmStatic
    public static final String getAnalyticsProductString(SelectedTicketProducts selectedTicketProducts) {
        Price price;
        StringBuilder sb2 = new StringBuilder();
        if (selectedTicketProducts != null) {
            Optional<Price> combinedTotal = selectedTicketProducts.getCombinedTotal();
            int numberOfAllAgesTickets = selectedTicketProducts.getNumberOfAllAgesTickets();
            if (numberOfAllAgesTickets > 0) {
                String strOrNull = selectedTicketProducts.getAllAgesATSCode().orNull();
                BigDecimal value = (combinedTotal == null || (price = combinedTotal.get()) == null) ? null : price.getValue();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(PhotoPassAnalyticsConstants.PHOTO_PASS_VALUE_PRODUCT_STRING, Arrays.copyOf(new Object[]{strOrNull, Integer.valueOf(numberOfAllAgesTickets), value}, 3));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                sb2.append(str);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "productString.toString()");
        return string;
    }

    @JvmStatic
    public static final String getAnalyticsProductsString(TicketOptionListAdapter ticketOptionListAdapter) {
        StringBuilder sb2 = new StringBuilder();
        if (ticketOptionListAdapter == null || ticketOptionListAdapter.isEmpty()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(PhotoPassAnalyticsConstants.PHOTO_PASS_VALUE_PRODUCT_STRING, Arrays.copyOf(new Object[]{ANALYTICS_PHOTO_PASS_PRODUCT_ATS_DEFAULT, 1, "0.00"}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            sb2.append(str);
        } else {
            ArrayList arrayList = new ArrayList();
            int count = ticketOptionListAdapter.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                arrayList.add(getAnalyticsProductString((SelectedTicketProducts) ticketOptionListAdapter.getItem(i10)));
            }
            sb2.append(TextUtils.join(",", arrayList));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "productString.toString()");
        return string;
    }

    public static final String getAnalyticsStoreName() {
        return "Consumer";
    }

    @JvmStatic
    public static /* synthetic */ void getAnalyticsStoreName$annotations() {
    }
}