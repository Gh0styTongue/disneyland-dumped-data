package com.wdpr.p479ee.p480ra.rahybrid.plugin;

import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;

/* loaded from: classes21.dex */
public abstract class Plugin {
    private PluginConfig config;

    public Plugin(PluginConfig pluginConfig) {
        this.config = pluginConfig;
    }

    public abstract String getId();
}