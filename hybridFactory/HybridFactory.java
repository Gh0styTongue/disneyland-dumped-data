package com.wdpr.p479ee.p480ra.rahybrid.hybridFactory;

import android.content.Context;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.ContentBundle;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.ContentBundleCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.factory.ContentBundleFactory;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.factory.HybridCoordinatorAbstractFactory;
import com.wdpr.p479ee.p480ra.rahybrid.model.Bundle;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebContentSyncConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.cookie.CookiePlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.header.HTTPHeaderPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.pluginStore.PluginStore;
import com.wdpr.p479ee.p480ra.rahybrid.pluginStore.PluginStoreFactory;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpCookie;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* loaded from: classes21.dex */
public final class HybridFactory {
    private static final String TAG = "HybridFactory";

    private static ContentBundle makeContentBundle(Context context, HybridWebConfig hybridWebConfig) throws Exception {
        ContentBundleFactory contentBundleFactory = ContentBundleFactory.getInstance(context);
        Bundle bundle = hybridWebConfig.getBundle();
        return contentBundleFactory.getContentBundle(hybridWebConfig.getId(), bundle.getWebContentSyncConfig().getLocalManifestName(), bundle);
    }

    public static ContentBundleCoordinator makeContentBundleCoordinator(Context context, InputStream inputStream, String str) {
        try {
            return makeContentBundleCoordinator(context, HybridWebConfig.loadConfigFileFromInputStream(inputStream), str);
        } catch (JsonIOException | JsonSyntaxException | IOException e10) {
            e10.printStackTrace();
            RAHybridLog.m85711d(TAG, "Cannot load config: " + inputStream.toString());
            return null;
        }
    }

    public static HybridCoordinator makeCoordinator(Context context, URL url, List<Class<? extends Plugin>> list, List<HttpCookie> list2) {
        try {
            return makeCoordinator(context, HybridWebConfig.loadConfigFileFromUrl(url), list, list2, (Map<String, String>) null);
        } catch (IOException | URISyntaxException e10) {
            e10.printStackTrace();
            RAHybridLog.m85711d(TAG, "Cannot load config: " + url.toString());
            return null;
        }
    }

    public static ContentBundleCoordinator makeContentBundleCoordinator(Context context, HybridWebConfig hybridWebConfig, String str) {
        try {
            ContentBundle contentBundleMakeContentBundle = makeContentBundle(context, hybridWebConfig);
            HybridWebContentSyncConfig webContentSyncConfig = contentBundleMakeContentBundle.getBundle().getWebContentSyncConfig();
            webContentSyncConfig.setPublicKey(webContentSyncConfig.getPublicKey());
            return new ContentBundleCoordinator(context, contentBundleMakeContentBundle, str);
        } catch (Exception e10) {
            e10.printStackTrace();
            RAHybridLog.m85713e(TAG, "makeContentBundleCoordinator() Exception : " + e10.getMessage(), e10);
            return null;
        }
    }

    public static HybridCoordinator makeCoordinator(Context context, URL url, List<Class<? extends Plugin>> list, List<HttpCookie> list2, Map<String, String> map) {
        try {
            return makeCoordinator(context, HybridWebConfig.loadConfigFileFromUrl(url), list, list2, map);
        } catch (IOException | URISyntaxException e10) {
            e10.printStackTrace();
            RAHybridLog.m85711d(TAG, "Cannot load config: " + url.toString());
            return null;
        }
    }

    public static HybridCoordinator makeCoordinator(Context context, HybridWebConfig hybridWebConfig, List<Class<? extends Plugin>> list, List<HttpCookie> list2) {
        PluginStore pluginStoreMakePluginStore = PluginStoreFactory.makePluginStore(hybridWebConfig.getPlugins(), list);
        if (list2 != null) {
            ((CookiePlugin) pluginStoreMakePluginStore.getPlugin(CookiePlugin.f71775ID)).setCookies(list2);
        }
        return HybridCoordinatorAbstractFactory.factory(context, hybridWebConfig).makeHybridCoordinator(pluginStoreMakePluginStore, hybridWebConfig);
    }

    public static HybridCoordinator makeCoordinator(Context context, HybridWebConfig hybridWebConfig, List<Class<? extends Plugin>> list, List<HttpCookie> list2, Map<String, String> map) {
        PluginStore pluginStoreMakePluginStore = PluginStoreFactory.makePluginStore(hybridWebConfig.getPlugins(), list);
        if (list2 != null) {
            ((CookiePlugin) pluginStoreMakePluginStore.getPlugin(CookiePlugin.f71775ID)).setCookies(list2);
        }
        if (map != null) {
            ((HTTPHeaderPlugin) pluginStoreMakePluginStore.getPlugin(HTTPHeaderPlugin.f71777ID)).setHTTPHeaders(map);
        }
        return HybridCoordinatorAbstractFactory.factory(context, hybridWebConfig).makeHybridCoordinator(pluginStoreMakePluginStore, hybridWebConfig);
    }
}