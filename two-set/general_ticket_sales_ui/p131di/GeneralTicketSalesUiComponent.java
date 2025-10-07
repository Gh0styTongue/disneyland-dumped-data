package com.disney.wdpro.general_ticket_sales_ui.p131di;

import com.disney.wdpro.InterfaceC13600m;
import com.disney.wdpro.general_ticket_sales_ui.activities.DLRTicketSalesActivity;
import com.disney.wdpro.general_ticket_sales_ui.activities.GeneralTicketSalesActivity;
import com.disney.wdpro.general_ticket_sales_ui.activities.TicketSalesHybridActivity;
import com.disney.wdpro.general_ticket_sales_ui.fragment.DLRTicketSalesOrderConfirmationFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesOrderSummaryFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.WDWTicketSalesOrderConfirmationFragment;
import dagger.Subcomponent;

@Subcomponent
/* loaded from: classes28.dex */
public interface GeneralTicketSalesUiComponent {
    InterfaceC13600m getTicketSalesConfiguration();

    void inject(DLRTicketSalesActivity dLRTicketSalesActivity);

    void inject(GeneralTicketSalesActivity generalTicketSalesActivity);

    void inject(TicketSalesHybridActivity ticketSalesHybridActivity);

    void inject(DLRTicketSalesOrderConfirmationFragment dLRTicketSalesOrderConfirmationFragment);

    void inject(GeneralTicketSalesFragment generalTicketSalesFragment);

    void inject(GeneralTicketSalesOrderSummaryFragment generalTicketSalesOrderSummaryFragment);

    void inject(WDWTicketSalesOrderConfirmationFragment wDWTicketSalesOrderConfirmationFragment);
}