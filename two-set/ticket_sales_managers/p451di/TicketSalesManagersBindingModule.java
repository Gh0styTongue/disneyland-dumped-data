package com.disney.wdpro.ticket_sales_managers.p451di;

import com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseSelectionVASFragment;
import com.disney.wdpro.ticket_sales_managers.fragments.MaxPassLearnMoreFragment;
import com.disney.wdpro.ticket_sales_managers.fragments.PartyFilterFragment;
import dagger.Module;

@Module
/* loaded from: classes19.dex */
public abstract class TicketSalesManagersBindingModule {
    abstract BaseConfirmationManagerFragment contributeBaseConfirmationManagerFragment();

    abstract BaseOrderSummaryManagersFragment contributeBaseOrderSummaryManagersFragment();

    abstract BaseSelectionVASFragment contributeBaseSelectionVASFragment();

    abstract MaxPassLearnMoreFragment contributeMaxPassLearnMoreFragment();

    abstract PartyFilterFragment contributePartyFilterFragment();
}