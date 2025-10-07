package com.disney.wdpro.enchanting_extras_ui.p120ui.plugins;

import com.disney.wdpro.enchanting_extras_ui.utils.Constants;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, m92038d2 = {"com/disney/wdpro/enchanting_extras_ui/ui/plugins/EECDetailPlugin$callBackHandler$1", "Lcom/wdpr/ee/ra/rahybrid/CallbackHandler;", "", "onMessage", "", "commandName", "data", "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes25.dex */
public final class EECDetailPlugin$callBackHandler$1 extends CallbackHandler<String> {
    EECDetailPlugin$callBackHandler$1() {
    }

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
}