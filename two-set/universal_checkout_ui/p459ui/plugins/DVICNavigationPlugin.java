package com.disney.wdpro.universal_checkout_ui.p459ui.plugins;

import android.os.Handler;
import android.os.Looper;
import com.disney.wdpro.support.util.C20933b0;
import com.disney.wdpro.universal_checkout_ui.models.DVICNavigationData;
import com.disney.wdpro.universal_checkout_ui.models.RememberMeCookie;
import com.disney.wdpro.universal_checkout_ui.utils.HybridUtilities;
import com.google.common.base.C22466q;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.WebMessageSender;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes20.dex */
public class DVICNavigationPlugin extends Plugin implements WebMessageSendable, WebMessageReceivable {

    /* renamed from: Id */
    public static final String f45084Id = "DVICNavigationPlugin";
    protected CallbackHandler callBackHandler;
    protected DVICNavigationPluginListener listener;
    private Map<String, CallbackHandler> webMessageHandlers;
    private WebMessageSender webMessageSender;

    public interface DVICNavigationPluginListener {
        void hideLoader();

        void navigateBack();

        void navigateToChaseScreen(String str);

        void navigateToLoginNoRefresh();

        void navigateToNewLogin();

        void sendCancelButtonEvent();

        void sendContinueButtonEvent();

        void sendSecondaryLoginResult(RememberMeCookie rememberMeCookie);

        void showDialog(CharSequence charSequence, String str);
    }

    public DVICNavigationPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        this.webMessageHandlers = new HashMap();
        CallbackHandler<String> callbackHandler = new CallbackHandler<String>() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.DVICNavigationPlugin.1
            @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
            public void onMessage(String str, String str2) {
                DVICNavigationData dVICNavigationData;
                dVICNavigationData = (DVICNavigationData) GsonInstrumentation.fromJson(new Gson(), str2, DVICNavigationData.class);
                str.getClass();
                switch (str) {
                    case "DVICNavigationPlugin.showLoginModal":
                        DVICNavigationPlugin.this.navigateToNewLogin();
                        break;
                    case "DVICNavigationPlugin.openInterstitial":
                        if (!C22466q.m68722b(dVICNavigationData.getInterstitialText()) && !C22466q.m68722b(dVICNavigationData.getUrl())) {
                            DVICNavigationPlugin.this.showDialog(dVICNavigationData);
                            break;
                        }
                        break;
                    case "DVICNavigationPlugin.showDvicContent":
                        DVICNavigationPlugin.this.hideLoader();
                        break;
                    case "DVICNavigationPlugin.requestSecondaryLogin":
                        DVICNavigationPlugin.this.navigateToLoginNoRefresh();
                        break;
                    case "DVICNavigationPlugin.openChase":
                        if (!C22466q.m68722b(dVICNavigationData.getUrl())) {
                            DVICNavigationPlugin.this.navigateToChaseScreen(dVICNavigationData.getUrl());
                            break;
                        }
                        break;
                    case "DVICNavigationPlugin.dismissButton":
                        DVICNavigationPlugin.this.navigateBack();
                        break;
                }
            }
        };
        this.callBackHandler = callbackHandler;
        this.webMessageHandlers.put(HybridUtilities.KEY_NAME_OPEN_CHASE, callbackHandler);
        this.webMessageHandlers.put("dismissButton", this.callBackHandler);
        this.webMessageHandlers.put(HybridUtilities.KEY_NAME_SHOW_DVIC_CONTENT, this.callBackHandler);
        this.webMessageHandlers.put(HybridUtilities.KEY_NAME_SHOW_DVIC_LOGIN, this.callBackHandler);
        this.webMessageHandlers.put(HybridUtilities.KEY_NAME_OPEN_INTERSTITIAL, this.callBackHandler);
        this.webMessageHandlers.put(HybridUtilities.KEY_NAME_REQUEST_SECONDARY_LOGIN, this.callBackHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideLoader() {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f45096a.lambda$hideLoader$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideLoader$0() {
        this.listener.hideLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$navigateBack$2() {
        this.listener.navigateBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$navigateToChaseScreen$5(String str) {
        this.listener.navigateToChaseScreen(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$navigateToLoginNoRefresh$4() {
        this.listener.navigateToLoginNoRefresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$navigateToNewLogin$3() {
        this.listener.navigateToNewLogin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDialog$1(DVICNavigationData dVICNavigationData) {
        this.listener.showDialog(C20933b0.m63218k(dVICNavigationData.getInterstitialText()), dVICNavigationData.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void navigateBack() {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f45092a.lambda$navigateBack$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void navigateToChaseScreen(final String str) {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f45094a.lambda$navigateToChaseScreen$5(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void navigateToLoginNoRefresh() {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f45093a.lambda$navigateToLoginNoRefresh$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void navigateToNewLogin() {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f45091a.lambda$navigateToNewLogin$3();
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
    public void showDialog(final DVICNavigationData dVICNavigationData) {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f45089a.lambda$showDialog$1(dVICNavigationData);
            }
        });
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "DVICNavigationPlugin";
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    public WebMessageSender getMessageSender() {
        return this.webMessageSender;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler> getWebMessageHandlers() {
        return this.webMessageHandlers;
    }

    public void sendMessageToDvic(String str, String[] strArr) {
        WebMessageSender webMessageSender = this.webMessageSender;
        if (webMessageSender != null) {
            webMessageSender.send(str, strArr);
        }
    }

    public void setListener(DVICNavigationPluginListener dVICNavigationPluginListener) {
        this.listener = dVICNavigationPluginListener;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    public void setMessageSender(WebMessageSender webMessageSender) {
        this.webMessageSender = webMessageSender;
    }
}