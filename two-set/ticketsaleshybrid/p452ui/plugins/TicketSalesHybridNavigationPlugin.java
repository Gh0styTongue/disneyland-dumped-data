package com.disney.wdpro.ticketsaleshybrid.p452ui.plugins;

import com.disney.wdpro.ticketsaleshybrid.p452ui.plugins.TicketSalesHybridNavigationPlugin;
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
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(m92037d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u001a\u001bB\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\rH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketSalesHybridNavigationPlugin;", "Lcom/wdpr/ee/ra/rahybrid/plugin/Plugin;", "Lcom/wdpr/ee/ra/rahybrid/plugin/capabilities/WebMessageReceivable;", "Lcom/wdpr/ee/ra/rahybrid/plugin/capabilities/WebMessageSendable;", "config", "Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;", "(Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketSalesHybridNavigationPlugin$TicketSalesHybridNavigationPluginListener;", "messageSender", "Lcom/wdpr/ee/ra/rahybrid/WebMessageSender;", "webMessageHandlers", "", "", "Lcom/wdpr/ee/ra/rahybrid/CallbackHandler;", "getId", "getMessageSender", "getPageName", "data", "getWebMessageHandlers", "", "loginFailed", "", "sendWebBackWasPressed", "setListener", "setMessageSender", "Companion", "TicketSalesHybridNavigationPluginListener", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final class TicketSalesHybridNavigationPlugin extends Plugin implements WebMessageReceivable, WebMessageSendable {

    /* renamed from: Id */
    public static final String f44285Id = "TixSalesNavigationPlugin";
    private TicketSalesHybridNavigationPluginListener listener;
    private WebMessageSender messageSender;
    private final Map<String, CallbackHandler<?>> webMessageHandlers;

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketSalesHybridNavigationPlugin$TicketSalesHybridNavigationPluginListener;", "", "dismiss", "", "navigateBack", "navigateToLogin", HybridUtilities.KEY_NAME_TRIGGER_NAVIGATION_ANALYTICS, "analyticsPageName", "", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface TicketSalesHybridNavigationPluginListener {
        void dismiss();

        void navigateBack();

        void navigateToLogin();

        void triggerNavigationAnalytics(String analyticsPageName);
    }

    public TicketSalesHybridNavigationPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        HashMap map = new HashMap();
        this.webMessageHandlers = map;
        CallbackHandler<String> callbackHandler = new CallbackHandler<String>() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketSalesHybridNavigationPlugin$callBackHandler$1
            @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
            public void onMessage(String commandName, String data) {
                Intrinsics.checkNotNullParameter(commandName, "commandName");
                if (Intrinsics.areEqual(commandName, HybridUtilities.COMMAND_NAME_TICKET_SALES_DISMISS_BUTTON)) {
                    TicketSalesHybridNavigationPlugin.TicketSalesHybridNavigationPluginListener ticketSalesHybridNavigationPluginListener = this.this$0.listener;
                    Intrinsics.checkNotNull(ticketSalesHybridNavigationPluginListener);
                    ticketSalesHybridNavigationPluginListener.dismiss();
                } else if (Intrinsics.areEqual(commandName, HybridUtilities.COMMAND_NAME_TICKET_SALES_TRIGGER_NAVIGATION_ANALYTICS)) {
                    TicketSalesHybridNavigationPlugin.TicketSalesHybridNavigationPluginListener ticketSalesHybridNavigationPluginListener2 = this.this$0.listener;
                    Intrinsics.checkNotNull(ticketSalesHybridNavigationPluginListener2);
                    ticketSalesHybridNavigationPluginListener2.triggerNavigationAnalytics(this.this$0.getPageName(data));
                }
            }
        };
        map.put("dismissButton", callbackHandler);
        map.put(HybridUtilities.KEY_NAME_TRIGGER_NAVIGATION_ANALYTICS, callbackHandler);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "TixSalesNavigationPlugin";
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    /* renamed from: getMessageSender */
    public WebMessageSender getWebMessageSender() {
        return null;
    }

    public final String getPageName(String data) {
        try {
            return new JSONObject(data).get("pageName").toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler<?>> getWebMessageHandlers() {
        return this.webMessageHandlers;
    }

    public final void loginFailed() {
        WebMessageSender webMessageSender = this.messageSender;
        if (webMessageSender != null) {
            Intrinsics.checkNotNull(webMessageSender);
            webMessageSender.send(HybridUtilities.CALLBACK_TIX_SALES, new String[]{HybridUtilities.LOGIN_DID_FAIL});
        }
    }

    public final void sendWebBackWasPressed() {
        WebMessageSender webMessageSender = this.messageSender;
        if (webMessageSender != null) {
            Intrinsics.checkNotNull(webMessageSender);
            webMessageSender.send(HybridUtilities.CALLBACK_TIX_SALES, new String[]{HybridUtilities.NATIVE_BACK_BUTTON_EVENT});
        }
    }

    public final void setListener(TicketSalesHybridNavigationPluginListener listener) {
        this.listener = listener;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    public void setMessageSender(WebMessageSender messageSender) {
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.messageSender = messageSender;
    }
}