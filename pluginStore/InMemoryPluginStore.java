package com.wdpr.p479ee.p480ra.rahybrid.pluginStore;

import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes21.dex */
public class InMemoryPluginStore implements PluginStore {
    private final Map<String, Plugin> pluginsMap = new HashMap();

    public InMemoryPluginStore(List<Plugin> list) {
        for (Plugin plugin : list) {
            this.pluginsMap.put(plugin.getId(), plugin);
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.pluginStore.PluginStore
    public Plugin getPlugin(String str) {
        return this.pluginsMap.get(str);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.pluginStore.PluginStore
    public Collection<Plugin> getPlugins() {
        return this.pluginsMap.values();
    }
}