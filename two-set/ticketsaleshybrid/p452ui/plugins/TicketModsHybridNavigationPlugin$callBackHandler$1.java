package com.disney.wdpro.ticketsaleshybrid.p452ui.plugins;

import com.disney.wdpro.ticketsaleshybrid.p452ui.plugins.TicketModsHybridNavigationPlugin;
import com.disney.wdpro.ticketsaleshybrid.utils.HybridUtilities;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m92038d2 = {"com/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketModsHybridNavigationPlugin$callBackHandler$1", "Lcom/wdpr/ee/ra/rahybrid/CallbackHandler;", "", "onMessage", "", "commandName", "data", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final class TicketModsHybridNavigationPlugin$callBackHandler$1 extends CallbackHandler<String> {
    TicketModsHybridNavigationPlugin$callBackHandler$1() {
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
    public void onMessage(String commandName, String data) {
        Intrinsics.checkNotNullParameter(commandName, "commandName");
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.areEqual(commandName, HybridUtilities.COMMAND_NAME_TICKET_MODS_DISMISS_BUTTON)) {
            TicketModsHybridNavigationPlugin.TicketModsHybridNavigationPluginListener ticketModsHybridNavigationPluginListener = this.this$0.listener;
            Intrinsics.checkNotNull(ticketModsHybridNavigationPluginListener);
            ticketModsHybridNavigationPluginListener.dismiss();
        }
    }
}