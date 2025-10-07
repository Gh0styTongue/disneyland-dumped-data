package com.disney.wdpro.photopass_plus.utils;

import android.content.Context;
import com.disney.wdpro.photopass_plus.C18785R;
import com.disney.wdpro.photopass_plus.models.CapturedMediaInfo;
import com.disney.wdpro.photopass_plus.models.PhotoPassProduct;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes15.dex */
public class PhotoPassOrderSummaryHelper {
    private static final String MM_ONE_DAY_EXPIRY_CHECKBOX_LABEL_DATE_FORMAT = "EEEE, MMMM d, yyyy";
    private CapturedMediaInfo capturedMediaInfo;
    private Context context;
    private String expirationPolicyCheckBoxLabel;
    private SelectedTicketProducts selectedTicketProducts;

    /* renamed from: com.disney.wdpro.photopass_plus.utils.PhotoPassOrderSummaryHelper$1 */
    static /* synthetic */ class C188051 {

        /* renamed from: $SwitchMap$com$disney$wdpro$ticket_sales_base_lib$business$product$ProductCategoryType */
        static final /* synthetic */ int[] f41728x3a53626;

        static {
            int[] iArr = new int[ProductCategoryType.values().length];
            f41728x3a53626 = iArr;
            try {
                iArr[ProductCategoryType.PHOTO_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41728x3a53626[ProductCategoryType.MEMORY_MAKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PhotoPassOrderSummaryHelper(Context context, CapturedMediaInfo capturedMediaInfo, SelectedTicketProducts selectedTicketProducts) {
        C22462m.m68685q(context, "Context is null!");
        C22462m.m68685q(capturedMediaInfo, "CapturedMediaInfo is null!");
        C22462m.m68685q(capturedMediaInfo.getCaptureDate(), "CapturedMediaInfo capture date is null!");
        C22462m.m68685q(selectedTicketProducts, "SelectedTicketProducts is null!");
        C22462m.m68685q(selectedTicketProducts.getProductCategoryType(), "ProductCategoryType product category type is null!");
        this.context = context;
        this.capturedMediaInfo = capturedMediaInfo;
        this.selectedTicketProducts = selectedTicketProducts;
        this.expirationPolicyCheckBoxLabel = checkProductForExpirationPolicyCheckBoxLabel();
    }

    private String checkProductForExpirationPolicyCheckBoxLabel() {
        ProductCategoryType productCategoryType = this.selectedTicketProducts.getProductCategoryType();
        PhotoPassProduct product = PhotoPassProduct.getProduct(this.selectedTicketProducts);
        int i10 = C188051.f41728x3a53626[productCategoryType.ordinal()];
        return i10 != 1 ? i10 != 2 ? "" : PhotoPassProduct.ONE_DAY_MEMORY_MAKER.equals(product) ? formatExpirationDateString(C18785R.string.order_confirm_memory_maker_one_day_expiration_policy) : PhotoPassProduct.MULTI_DAY_MEMORY_MAKER.equals(product) ? this.context.getString(C18785R.string.order_confirm_memory_maker_thirty_day_expiration_policy) : "" : PhotoPassProduct.ONE_DAY_MEMORY_MAKER.equals(product) ? formatExpirationDateString(C18785R.string.order_confirm_memory_maker_one_day_dlr_expiration_policy) : this.context.getString(C18785R.string.order_confirm_photo_pass_expiration_policy);
    }

    private String formatExpirationDateString(int i10) {
        return String.format(this.context.getString(i10), new SimpleDateFormat("EEEE, MMMM d, yyyy", Locale.ENGLISH).format(this.capturedMediaInfo.getCaptureDate()));
    }

    public String getExpirationPolicyCheckBoxLabel() {
        return this.expirationPolicyCheckBoxLabel;
    }

    public boolean isExpirationPolicyCheckBoxRequired() {
        return !C22466q.m68722b(this.expirationPolicyCheckBoxLabel);
    }
}