package com.disney.wdpro.ap_commerce_checkout.p066ui;

import android.content.Context;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;

/* loaded from: classes23.dex */
public abstract class APFlowUIHelper {
    protected static final int DLR_RENEWALS_MONTHLY = 11;
    protected static final int DLR_RENEWALS_SINGLE = 12;
    protected static final int DLR_SALES_MONTHLY = 9;
    protected static final int DLR_SALES_SINGLE = 10;
    protected static final int DLR_UPGRADES_MONTHLY = 7;
    protected static final int DLR_UPGRADES_SINGLE = 8;
    protected static final int UNDEFINED_FLOW = 0;
    protected static final int WDW_RENEWALS_MONTHLY = 5;
    protected static final int WDW_RENEWALS_SINGLE = 6;
    protected static final int WDW_SALES_MONTHLY = 3;
    protected static final int WDW_SALES_SINGLE = 4;
    protected static final int WDW_UPGRADES_MONTHLY = 1;
    protected static final int WDW_UPGRADES_SINGLE = 2;
    protected final Context context;
    protected final String emptyString;
    protected final Boolean paymentPlan;
    protected final int type;

    /* renamed from: com.disney.wdpro.ap_commerce_checkout.ui.APFlowUIHelper$1 */
    static /* synthetic */ class C87431 {

        /* renamed from: $SwitchMap$com$disney$wdpro$ticket_sales_base_lib$business$product$ProductCategoryType */
        static final /* synthetic */ int[] f29271x3a53626;

        static {
            int[] iArr = new int[ProductCategoryType.values().length];
            f29271x3a53626 = iArr;
            try {
                iArr[ProductCategoryType.ANNUAL_PASS_UPGRADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29271x3a53626[ProductCategoryType.ANNUAL_PASS_SALES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29271x3a53626[ProductCategoryType.ANNUAL_PASS_RENEWALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public APFlowUIHelper(Context context, SelectedTicketProducts selectedTicketProducts, Boolean bool) {
        this.context = context.getApplicationContext();
        this.paymentPlan = bool;
        this.type = getFlowType(selectedTicketProducts);
        this.emptyString = context.getString(C8689R.string.empty_string);
    }

    private int getFlowType(SelectedTicketProducts selectedTicketProducts) {
        ProductCategoryType productCategoryType = selectedTicketProducts.getProductCategoryType();
        if (WebStoreId.isWDW(selectedTicketProducts.getWebStoreId())) {
            int i10 = C87431.f29271x3a53626[productCategoryType.ordinal()];
            if (i10 == 1) {
                return this.paymentPlan.booleanValue() ? 1 : 2;
            }
            if (i10 == 2) {
                return this.paymentPlan.booleanValue() ? 3 : 4;
            }
            if (i10 != 3) {
                return 0;
            }
            return this.paymentPlan.booleanValue() ? 5 : 6;
        }
        if (!WebStoreId.isDLR(selectedTicketProducts.getWebStoreId())) {
            return 0;
        }
        int i11 = C87431.f29271x3a53626[productCategoryType.ordinal()];
        if (i11 == 1) {
            return this.paymentPlan.booleanValue() ? 7 : 8;
        }
        if (i11 == 2) {
            return this.paymentPlan.booleanValue() ? 9 : 10;
        }
        if (i11 != 3) {
            return 0;
        }
        return this.paymentPlan.booleanValue() ? 11 : 12;
    }
}