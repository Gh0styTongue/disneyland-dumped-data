package com.disney.wdpro.general_ticket_sales_ui.p131di;

import com.disney.wdpro.general_ticket_sales_ui.activities.DLRTicketSalesActivity;
import com.disney.wdpro.general_ticket_sales_ui.activities.GeneralTicketSalesActivity;
import com.disney.wdpro.general_ticket_sales_ui.activities.TicketSalesHybridActivity;
import com.disney.wdpro.general_ticket_sales_ui.activities.WDWTicketSalesActivity;
import com.disney.wdpro.general_ticket_sales_ui.fragment.DLRTicketSalesOrderConfirmationFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesOrderSummaryFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.MaxPassSalesDownFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderWarningFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.WDWTicketSalesOrderConfirmationFragment;
import dagger.Module;

@Module
/* loaded from: classes28.dex */
public abstract class GeneralTicketSalesUIBindingModule {
    abstract DLRTicketSalesActivity contributeDLRTicketSalesActivity();

    abstract DLRTicketSalesOrderConfirmationFragment contributeDLRTicketSalesOrderConfirmationFragment();

    abstract GeneralTicketSalesActivity contributeGeneralTicketSalesActivity();

    abstract GeneralTicketSalesFragment contributeGeneralTicketSalesFragment();

    abstract GeneralTicketSalesOrderSummaryFragment contributeGeneralTicketSalesOrderSummaryFragment();

    abstract MaxPassSalesDownFragment contributeMaxPassSalesDownFragment();

    abstract TicketSalesHybridActivity contributeTicketSalesHybridActivity();

    abstract TicketSalesOrderConfirmationFragment contributeTicketSalesOrderConfirmationFragment();

    abstract TicketSalesOrderWarningFragment contributeTicketSalesOrderWarningFragment();

    abstract WDWTicketSalesActivity contributeWDWTicketSalesActivity();

    abstract WDWTicketSalesOrderConfirmationFragment contributeWDWTicketSalesOrderConfirmationFragment();
}