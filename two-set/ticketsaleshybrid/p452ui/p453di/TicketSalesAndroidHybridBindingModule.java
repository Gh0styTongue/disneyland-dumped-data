package com.disney.wdpro.ticketsaleshybrid.p452ui.p453di;

import com.disney.wdpro.ticketsaleshybrid.p452ui.activities.TicketSalesAndroidHybridActivity;
import com.disney.wdpro.ticketsaleshybrid.p452ui.fragment.DownScreenFragment;
import com.disney.wdpro.ticketsaleshybrid.p452ui.fragment.TicketSalesHybridFragment;
import dagger.Module;

@Module
/* loaded from: classes19.dex */
public abstract class TicketSalesAndroidHybridBindingModule {
    abstract DownScreenFragment contributeDownScreenFragment();

    abstract TicketSalesAndroidHybridActivity contributeTicketSalesAndroidHybridActivity();

    abstract TicketSalesHybridFragment contributeTicketSalesHybridFragment();
}