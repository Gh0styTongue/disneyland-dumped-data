package com.wdpr.p479ee.p480ra.rahybrid.plugin.cookie;

import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.CookieInjectable;
import java.net.HttpCookie;
import java.util.List;

/* loaded from: classes21.dex */
public class CookiePlugin extends Plugin implements CookieInjectable {

    /* renamed from: ID */
    public static final String f71775ID = "CookiePlugin";
    private List<HttpCookie> cookies;

    public CookiePlugin(PluginConfig pluginConfig, List<HttpCookie> list) {
        super(pluginConfig);
        this.cookies = list;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.CookieInjectable
    public List<HttpCookie> getCookies() {
        return this.cookies;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return f71775ID;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.CookieInjectable
    public void setCookies(List<HttpCookie> list) {
        this.cookies = list;
    }

    public CookiePlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        this.cookies = null;
    }
}