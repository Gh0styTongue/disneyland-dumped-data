package com.disney.wdpro.general_ticket_sales_ui;

import android.content.Context;
import com.disney.wdpro.base_sales_ui_lib.SalesLauncher;
import com.disney.wdpro.base_sales_ui_lib.activities.TicketSalesActivity;
import com.disney.wdpro.general_ticket_sales_ui.activities.DLRTicketSalesActivity;
import com.disney.wdpro.general_ticket_sales_ui.activities.WDWTicketSalesActivity;
import com.disney.wdpro.ticket_sales_base_lib.business.host_app.GuestGroup;

/* loaded from: classes28.dex */
public class GeneralTicketSalesLauncher extends SalesLauncher {

    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.GeneralTicketSalesLauncher$1 */
    static /* synthetic */ class C119701 {

        /* renamed from: $SwitchMap$com$disney$wdpro$ticket_sales_base_lib$business$host_app$GuestGroup */
        static final /* synthetic */ int[] f32619x8acba315;

        static {
            int[] iArr = new int[GuestGroup.values().length];
            f32619x8acba315 = iArr;
            try {
                iArr[GuestGroup.DLR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32619x8acba315[GuestGroup.WDW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public GeneralTicketSalesLauncher(Context context) {
        super(context);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.SalesLauncher
    protected Class<? extends TicketSalesActivity> getSalesClass(GuestGroup guestGroup) {
        int i10 = C119701.f32619x8acba315[guestGroup.ordinal()];
        if (i10 == 1) {
            return DLRTicketSalesActivity.class;
        }
        if (i10 == 2) {
            return WDWTicketSalesActivity.class;
        }
        throw new IllegalArgumentException("Guestgroup does not exist");
    }
}