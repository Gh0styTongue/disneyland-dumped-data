package com.disney.wdpro.universal_checkout_ui.models;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/UCAppConfig;", "", "pluginUrl", "", "pluginEnv", "domain", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getPluginEnv", "getPluginUrl", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "encode", "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes20.dex */
public final /* data */ class UCAppConfig {
    private final String domain;
    private final String pluginEnv;
    private final String pluginUrl;

    @JvmOverloads
    public UCAppConfig(String str, String str2, String str3) {
        this.pluginUrl = str;
        this.pluginEnv = str2;
        this.domain = str3;
    }

    public static /* synthetic */ UCAppConfig copy$default(UCAppConfig uCAppConfig, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uCAppConfig.pluginUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = uCAppConfig.pluginEnv;
        }
        if ((i10 & 4) != 0) {
            str3 = uCAppConfig.domain;
        }
        return uCAppConfig.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPluginUrl() {
        return this.pluginUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPluginEnv() {
        return this.pluginEnv;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    public final UCAppConfig copy(String pluginUrl, String pluginEnv, String domain) {
        return new UCAppConfig(pluginUrl, pluginEnv, domain);
    }

    public final String encode() throws UnsupportedEncodingException {
        String strEncode = URLEncoder.encode(toString(), "UTF-8");
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(toString(), \"UTF-8\")");
        return StringsKt.replace$default(strEncode, "+", "%20", false, 4, (Object) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UCAppConfig)) {
            return false;
        }
        UCAppConfig uCAppConfig = (UCAppConfig) other;
        return Intrinsics.areEqual(this.pluginUrl, uCAppConfig.pluginUrl) && Intrinsics.areEqual(this.pluginEnv, uCAppConfig.pluginEnv) && Intrinsics.areEqual(this.domain, uCAppConfig.domain);
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getPluginEnv() {
        return this.pluginEnv;
    }

    public final String getPluginUrl() {
        return this.pluginUrl;
    }

    public int hashCode() {
        String str = this.pluginUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pluginEnv;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.domain;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String json = GsonInstrumentation.toJson(new Gson(), this);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(this)");
        return json;
    }
}