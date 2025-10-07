package com.wdpr.p479ee.p480ra.rahybrid.plugin.header;

import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.HTTPHeaderInjectable;
import java.util.Map;

/* loaded from: classes21.dex */
public class HTTPHeaderPlugin extends Plugin implements HTTPHeaderInjectable {

    /* renamed from: ID */
    public static final String f71777ID = "HTTPHeaderPlugin";
    private Map<String, String> httpHeaders;

    public HTTPHeaderPlugin(PluginConfig pluginConfig, Map<String, String> map) {
        super(pluginConfig);
        this.httpHeaders = map;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.HTTPHeaderInjectable
    public Map<String, String> getHTTPHeaders() {
        return this.httpHeaders;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return f71777ID;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.HTTPHeaderInjectable
    public void setHTTPHeaders(Map<String, String> map) {
        this.httpHeaders = map;
    }

    public HTTPHeaderPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        this.httpHeaders = null;
    }
}