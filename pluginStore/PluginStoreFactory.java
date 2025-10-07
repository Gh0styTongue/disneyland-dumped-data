package com.wdpr.p479ee.p480ra.rahybrid.pluginStore;

import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.RAPluginFactory;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes21.dex */
public class PluginStoreFactory {
    public static final String TAG = "PluginStoreFactory";
    private static PluginStore pluginStore;

    private static Plugin getPluginInstance(Class<? extends Plugin> cls, PluginConfig pluginConfig) {
        try {
            return cls.getConstructor(PluginConfig.class).newInstance(pluginConfig);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            e10.printStackTrace();
            RAHybridLog.m85713e(TAG, e10.getMessage(), e10);
            return null;
        }
    }

    public static PluginStore getPluginStore() {
        return pluginStore;
    }

    public static PluginStore makePluginStore(List<PluginConfig> list, List<Class<? extends Plugin>> list2) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        if (list2 == null) {
            list2 = Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(RAPluginFactory.makePlugins(list));
        for (PluginConfig pluginConfig : list) {
            Iterator<Class<? extends Plugin>> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Plugin pluginInstance = getPluginInstance(it.next(), pluginConfig);
                if (pluginInstance != null && pluginInstance.getId().equals(pluginConfig.getId())) {
                    arrayList.add(pluginInstance);
                    break;
                }
            }
        }
        InMemoryPluginStore inMemoryPluginStore = new InMemoryPluginStore(arrayList);
        pluginStore = inMemoryPluginStore;
        return inMemoryPluginStore;
    }
}