package com.disney.wdpro.ap_commerce_checkout.p066ui;

import android.content.Context;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;

/* loaded from: classes23.dex */
public class APConfirmationScreenUIHelper extends APFlowUIHelper {
    public APConfirmationScreenUIHelper(Context context, SelectedTicketProducts selectedTicketProducts, Boolean bool) {
        super(context, selectedTicketProducts, bool);
    }

    public String getConfirmationDeliveryInstructions(String str) {
        switch (this.type) {
            case 1:
            case 2:
                return this.context.getString(C8689R.string.ap_upgrades_confirmation_delivery_instructions_body_WDW);
            case 3:
            case 4:
                return this.context.getString(C8689R.string.ap_sales_confirmation_delivery_instructions_body_WDW);
            case 5:
            case 6:
            case 11:
            case 12:
                return this.context.getString(C8689R.string.ap_commerce_renewals_confirmation_delivery_instructions_body, str);
            case 7:
            case 8:
                return this.context.getString(C8689R.string.ap_upgrades_confirmation_delivery_instructions_body_DLR);
            case 9:
            case 10:
                return this.context.getString(C8689R.string.ap_sales_confirmation_delivery_instructions_body_DLR);
            default:
                return this.emptyString;
        }
    }

    public boolean shouldDisplayGuestAvatar() {
        switch (this.type) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
                return true;
            case 7:
            case 8:
            default:
                return false;
        }
    }

    public boolean shouldDisplayTicketAndPassesSection(BookingStatus bookingStatus) {
        switch (this.type) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
                break;
            case 7:
            case 8:
            default:
                if (bookingStatus == BookingStatus.BOOKED) {
                }
                break;
        }
        return true;
    }

    public boolean shouldDisplayWelcomeText() {
        int i10 = this.type;
        return i10 == 3 || i10 == 4 || i10 == 9 || i10 == 10;
    }
}