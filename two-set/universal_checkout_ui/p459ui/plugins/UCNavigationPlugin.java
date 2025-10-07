package com.disney.wdpro.universal_checkout_ui.p459ui.plugins;

import android.os.Handler;
import android.os.Looper;
import com.disney.wdpro.universal_checkout_ui.utils.HybridUtilities;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.WebMessageSender;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes20.dex */
public class UCNavigationPlugin extends Plugin implements WebMessageReceivable, WebMessageSendable {

    /* renamed from: Id */
    public static final String f45086Id = "UCNavigationPlugin";
    protected CallbackHandler callBackHandler;
    protected UCNavigationPluginListener listener;
    private WebMessageSender messageSender;
    private Map<String, CallbackHandler> webMessageHandlers;

    public interface UCNavigationPluginListener {
        void dismiss();

        void navigateBack();

        void onConfirmationLoaded();

        void onReadyForRequestItems();

        void paymentSheetFinish();

        void setShouldShowDismissModal();
    }

    public UCNavigationPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        this.webMessageHandlers = new HashMap();
        CallbackHandler<String> callbackHandler = new CallbackHandler<String>() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.UCNavigationPlugin.1
            @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
            public void onMessage(String str, String str2) {
                str.getClass();
                switch (str) {
                    case "UCNavigationPlugin.ucConfirmationLoaded":
                        UCNavigationPlugin.this.onConfirmationLoaded();
                        break;
                    case "UCNavigationPlugin.backButton":
                        UCNavigationPlugin.this.navigateBack();
                        break;
                    case "UCNavigationPlugin.readyForRequestItems":
                        UCNavigationPlugin.this.retrieveRequestItems();
                        break;
                    case "UCNavigationPlugin.dismissButton":
                        UCNavigationPlugin.this.dismiss();
                        break;
                    case "UCNavigationPlugin.shouldShowDismissModal":
                        UCNavigationPlugin.this.setShouldShowDismissModal();
                        break;
                    case "UCNavigationPlugin.paymentSheetFinish":
                        UCNavigationPlugin.this.paymentSheetFinish();
                        break;
                }
            }
        };
        this.callBackHandler = callbackHandler;
        this.webMessageHandlers.put("backButton", callbackHandler);
        this.webMessageHandlers.put("dismissButton", this.callBackHandler);
        this.webMessageHandlers.put(HybridUtilities.KEY_NAME_PAYMENT_SHEET_FINISH, this.callBackHandler);
        this.webMessageHandlers.put(HybridUtilities.KEY_NAME_CONFIRMATION_LOADED, this.callBackHandler);
        this.webMessageHandlers.put(HybridUtilities.KEY_NAME_SHOULD_SHOW_DISMISS_MODAL, this.callBackHandler);
        this.webMessageHandlers.put(HybridUtilities.KEY_NAME_READY_FOR_REQUEST_ITEMS, this.callBackHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismiss() {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f45101a.lambda$dismiss$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$1() {
        this.listener.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$navigateBack$0() {
        this.listener.navigateBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConfirmationLoaded$3() {
        this.listener.onConfirmationLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$paymentSheetFinish$2() {
        this.listener.paymentSheetFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$retrieveRequestItems$5() {
        this.listener.onReadyForRequestItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setShouldShowDismissModal$4() {
        this.listener.setShouldShowDismissModal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void navigateBack() {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f45100a.lambda$navigateBack$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onConfirmationLoaded() {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f45102a.lambda$onConfirmationLoaded$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void paymentSheetFinish() {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f45098a.lambda$paymentSheetFinish$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void retrieveRequestItems() {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f45097a.lambda$retrieveRequestItems$5();
            }
        });
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldShowDismissModal() {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f45099a.lambda$setShouldShowDismissModal$4();
            }
        });
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "UCNavigationPlugin";
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    public WebMessageSender getMessageSender() {
        return this.messageSender;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler> getWebMessageHandlers() {
        return this.webMessageHandlers;
    }

    public void sendMessageToShowDismissModal() {
        WebMessageSender webMessageSender = this.messageSender;
        if (webMessageSender != null) {
            webMessageSender.send(HybridUtilities.KEY_CALL_BACK_UC, new String[]{"{\"callbackType\": \"showDismissModal\"}"});
        }
    }

    public void sendRequestItems(String str) {
        WebMessageSender webMessageSender = this.messageSender;
        if (webMessageSender != null) {
            webMessageSender.send(HybridUtilities.KEY_CALL_BACK_UC, new String[]{"{\"callbackType\":\"checkoutRequestItems\", \"items\": " + str + "}"});
        }
    }

    public void setListener(UCNavigationPluginListener uCNavigationPluginListener) {
        this.listener = uCNavigationPluginListener;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    public void setMessageSender(WebMessageSender webMessageSender) {
        this.messageSender = webMessageSender;
    }
}