package com.disney.wdpro.enchanting_extras_ui.p120ui.plugins;

import android.os.Handler;
import android.os.Looper;
import com.disney.wdpro.enchanting_extras_ui.utils.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0002\u001a\u001bB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\fH\u0016J\u001c\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\r0\u0010H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m92038d2 = {"Lcom/disney/wdpro/enchanting_extras_ui/ui/plugins/EECDetailPlugin;", "Lcom/wdpr/ee/ra/rahybrid/plugin/Plugin;", "Lcom/wdpr/ee/ra/rahybrid/plugin/capabilities/WebMessageReceivable;", "config", "Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;", "(Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/disney/wdpro/enchanting_extras_ui/ui/plugins/EECDetailPlugin$EECDetailPluginListener;", "parser", "Lcom/google/gson/JsonParser;", "webMessageHandlers", "", "", "Lcom/wdpr/ee/ra/rahybrid/CallbackHandler;", "getId", "getWebMessageHandlers", "", "navigateFinderDetail", "", "facilityId", "entityType", Constants.DETAIL_FLOW_KEY, "runOnUIThread", "runnable", "Ljava/lang/Runnable;", "setListener", "Companion", "EECDetailPluginListener", "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes25.dex */
public final class EECDetailPlugin extends Plugin implements WebMessageReceivable {

    /* renamed from: Id */
    public static final String f31643Id = "EECDetailPlugin";
    private EECDetailPluginListener listener;
    private final JsonParser parser;
    private final Map<String, CallbackHandler<String>> webMessageHandlers;

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/enchanting_extras_ui/ui/plugins/EECDetailPlugin$EECDetailPluginListener;", "", "navigateFinderDetail", "", "facilityId", "", "entityType", Constants.DETAIL_FLOW_KEY, "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface EECDetailPluginListener {
        void navigateFinderDetail(String facilityId, String entityType, String detailFlow);
    }

    public EECDetailPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        this.parser = new JsonParser();
        HashMap map = new HashMap();
        this.webMessageHandlers = map;
        map.put("detail", new CallbackHandler<String>() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.plugins.EECDetailPlugin$callBackHandler$1
            @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
            public void onMessage(String commandName, String data) {
                try {
                    JsonElement jsonElement = this.this$0.parser.parse(data);
                    Intrinsics.checkNotNull(jsonElement, "null cannot be cast to non-null type com.google.gson.JsonObject");
                    JsonObject jsonObject = (JsonObject) jsonElement;
                    String facilityId = jsonObject.get("facilityId").getAsString();
                    String entityType = jsonObject.get("entityType").getAsString();
                    String detailFlow = jsonObject.get(Constants.DETAIL_FLOW_KEY).getAsString();
                    EECDetailPlugin eECDetailPlugin = this.this$0;
                    Intrinsics.checkNotNullExpressionValue(facilityId, "facilityId");
                    Intrinsics.checkNotNullExpressionValue(entityType, "entityType");
                    Intrinsics.checkNotNullExpressionValue(detailFlow, "detailFlow");
                    eECDetailPlugin.navigateFinderDetail(facilityId, entityType, detailFlow);
                    LogInstrumentation.m79024d("EECDetailPlugin", "callback working. CommandName: " + commandName + " , data: " + data);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateFinderDetail(final String facilityId, final String entityType, final String detailFlow) {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.plugins.a
            @Override // java.lang.Runnable
            public final void run() {
                EECDetailPlugin.navigateFinderDetail$lambda$0(this.f31646a, facilityId, entityType, detailFlow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void navigateFinderDetail$lambda$0(EECDetailPlugin this$0, String facilityId, String entityType, String detailFlow) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(facilityId, "$facilityId");
        Intrinsics.checkNotNullParameter(entityType, "$entityType");
        Intrinsics.checkNotNullParameter(detailFlow, "$detailFlow");
        EECDetailPluginListener eECDetailPluginListener = this$0.listener;
        Intrinsics.checkNotNull(eECDetailPluginListener);
        eECDetailPluginListener.navigateFinderDetail(facilityId, entityType, detailFlow);
    }

    private final void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "EECDetailPlugin";
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler<String>> getWebMessageHandlers() {
        return this.webMessageHandlers;
    }

    public final void setListener(EECDetailPluginListener listener) {
        this.listener = listener;
    }
}