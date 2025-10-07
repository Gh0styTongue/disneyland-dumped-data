package com.disney.wdpro.magicble.common.vendo;

import com.disney.wdpro.commons.config.C9248i;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, m92038d2 = {"Lcom/disney/wdpro/magicble/common/vendo/MbleDefaultVendoConfigProvider;", "Lcom/disney/wdpro/magicble/common/vendo/MbleVendoConfigProvider;", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/google/gson/Gson;", "gson", "<init>", "(Lcom/disney/wdpro/commons/config/i;Lcom/google/gson/Gson;)V", "Lcom/disney/wdpro/magicble/common/vendo/MbleVendoBeaconConfig;", "parseMbleVendoConfig", "(Lcom/disney/wdpro/commons/config/i;Lcom/google/gson/Gson;)Lcom/disney/wdpro/magicble/common/vendo/MbleVendoBeaconConfig;", "Lcom/disney/wdpro/magicble/common/vendo/MbleVendoCastAreaConfig;", "parseMbleCastAreaVendoConfig", "(Lcom/disney/wdpro/commons/config/i;Lcom/google/gson/Gson;)Lcom/disney/wdpro/magicble/common/vendo/MbleVendoCastAreaConfig;", "getMbleVendoCastAreaConfig", "()Lcom/disney/wdpro/magicble/common/vendo/MbleVendoCastAreaConfig;", "getMbleVendoBeaconConfig", "()Lcom/disney/wdpro/magicble/common/vendo/MbleVendoBeaconConfig;", "Lcom/disney/wdpro/commons/config/i;", "Lcom/google/gson/Gson;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes13.dex */
public final class MbleDefaultVendoConfigProvider implements MbleVendoConfigProvider {
    private final Gson gson;
    private final C9248i vendomatic;

    @Inject
    public MbleDefaultVendoConfigProvider(C9248i vendomatic, Gson gson) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.vendomatic = vendomatic;
        this.gson = gson;
    }

    private final MbleVendoCastAreaConfig parseMbleCastAreaVendoConfig(C9248i vendomatic, Gson gson) {
        try {
            String strM38762j = vendomatic.m38762j();
            return (MbleVendoCastAreaConfig) (gson == null ? gson.fromJson(strM38762j, MbleVendoCastAreaConfig.class) : GsonInstrumentation.fromJson(gson, strM38762j, MbleVendoCastAreaConfig.class));
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    private final MbleVendoBeaconConfig parseMbleVendoConfig(C9248i vendomatic, Gson gson) {
        try {
            String strM38756h = vendomatic.m38756h();
            return (MbleVendoBeaconConfig) (gson == null ? gson.fromJson(strM38756h, MbleVendoBeaconConfig.class) : GsonInstrumentation.fromJson(gson, strM38756h, MbleVendoBeaconConfig.class));
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    @Override // com.disney.wdpro.magicble.common.vendo.MbleVendoConfigProvider
    public MbleVendoBeaconConfig getMbleVendoBeaconConfig() {
        return parseMbleVendoConfig(this.vendomatic, this.gson);
    }

    @Override // com.disney.wdpro.magicble.common.vendo.MbleVendoConfigProvider
    public MbleVendoCastAreaConfig getMbleVendoCastAreaConfig() {
        return parseMbleCastAreaVendoConfig(this.vendomatic, this.gson);
    }
}