package com.disney.wdpro.ticket_sales_managers.p451di;

import com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesEnvironment;
import com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManager;
import com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment;
import com.disney.wdpro.ticket_sales_managers.fragments.PartyFilterFragment;
import dagger.Subcomponent;

@Subcomponent
/* loaded from: classes19.dex */
public interface TicketSalesManagersComponent {
    GeneralTicketSalesCheckoutManager getTicketSalesCheckoutManager();

    TicketSalesEnvironment getTicketSalesEnvironment();

    TicketSalesFragmentDataManager getTicketSalesFragmentDataManager();

    void inject(BaseConfirmationManagerFragment baseConfirmationManagerFragment);

    void inject(PartyFilterFragment partyFilterFragment);
}