package com.disney.wdpro.ticketsaleshybrid.p452ui.plugins;

import com.disney.wdpro.ticketsaleshybrid.p452ui.plugins.TicketModsHybridNavigationPlugin;
import com.disney.wdpro.ticketsaleshybrid.utils.HybridUtilities;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.WebMessageSender;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0016\u0017B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\rH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\nH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketModsHybridNavigationPlugin;", "Lcom/wdpr/ee/ra/rahybrid/plugin/Plugin;", "Lcom/wdpr/ee/ra/rahybrid/plugin/capabilities/WebMessageReceivable;", "Lcom/wdpr/ee/ra/rahybrid/plugin/capabilities/WebMessageSendable;", "config", "Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;", "(Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketModsHybridNavigationPlugin$TicketModsHybridNavigationPluginListener;", "messageSender", "Lcom/wdpr/ee/ra/rahybrid/WebMessageSender;", "webMessageHandlers", "", "", "Lcom/wdpr/ee/ra/rahybrid/CallbackHandler;", "getId", "getMessageSender", "getWebMessageHandlers", "", "setListener", "", "setMessageSender", "Companion", "TicketModsHybridNavigationPluginListener", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final class TicketModsHybridNavigationPlugin extends Plugin implements WebMessageReceivable, WebMessageSendable {

    /* renamed from: Id */
    public static final String f44284Id = "TixModsNavigationPlugin";
    private TicketModsHybridNavigationPluginListener listener;
    private WebMessageSender messageSender;
    private final Map<String, CallbackHandler<?>> webMessageHandlers;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketModsHybridNavigationPlugin$TicketModsHybridNavigationPluginListener;", "", "dismiss", "", "navigateBack", "navigateToLogin", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface TicketModsHybridNavigationPluginListener {
        void dismiss();

        void navigateBack();

        void navigateToLogin();
    }

    public TicketModsHybridNavigationPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        HashMap map = new HashMap();
        this.webMessageHandlers = map;
        map.put("dismissButton", new CallbackHandler<String>() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketModsHybridNavigationPlugin$callBackHandler$1
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
        });
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "TixModsNavigationPlugin";
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    /* renamed from: getMessageSender */
    public WebMessageSender getWebMessageSender() {
        return null;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler<?>> getWebMessageHandlers() {
        return this.webMessageHandlers;
    }

    public final void setListener(TicketModsHybridNavigationPluginListener listener) {
        this.listener = listener;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    public void setMessageSender(WebMessageSender messageSender) {
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.messageSender = messageSender;
    }
}