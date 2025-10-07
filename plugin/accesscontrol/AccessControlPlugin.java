package com.wdpr.p479ee.p480ra.rahybrid.plugin.accesscontrol;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.wdpr.p479ee.p480ra.rahybrid.WhiteList;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.NavigationActionDecidable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.util.Constants;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes21.dex */
public class AccessControlPlugin extends Plugin implements NavigationActionDecidable {
    private static final List<String> ALLOWED_ACCESS_SCHEMES = Arrays.asList("http", "https", Constants.ABOUT_SCHEME);
    private static final String CONFIG_ACCESS_KEY = "access";
    private static final String CONFIG_INTENT_KEY = "intent";

    /* renamed from: ID */
    public static final String f71773ID = "AccessControlPlugin";
    private static final String TAG = "AccessControlPlugin";
    private AccessControlPluginListener accessControlPluginListener;
    private WhiteList accessWhiteList;
    private Activity activity;
    private WhiteList intentWhiteList;

    public interface AccessControlPluginListener {
        void onFailAccessWhitelistForURL(AccessControlPlugin accessControlPlugin, String str);

        void onFailIntentWhitelistForURL(AccessControlPlugin accessControlPlugin, String str);

        default void onIntentRequireOpeningForURL(AccessControlPlugin accessControlPlugin, String str) {
            accessControlPlugin.handleIntentRequireOpeningForURL(str);
        }
    }

    public AccessControlPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        if (pluginConfig.getConfig() != null) {
            Map<String, Object> config = pluginConfig.getConfig();
            if (config.get("access") != null) {
                ArrayList arrayList = (ArrayList) config.get("access");
                this.accessWhiteList = new WhiteList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        this.accessWhiteList.addWhiteListEntry((String) it.next());
                    } catch (Exception unused) {
                        RAHybridLog.m85712e(TAG, "Unable to add pattern to whitelist");
                    }
                }
            }
            if (config.get(CONFIG_INTENT_KEY) != null) {
                ArrayList arrayList2 = (ArrayList) config.get(CONFIG_INTENT_KEY);
                this.intentWhiteList = new WhiteList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        this.intentWhiteList.addWhiteListEntry((String) it2.next());
                    } catch (Exception unused2) {
                        RAHybridLog.m85712e(TAG, "Unable to add pattern to whitelist");
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleIntentRequireOpeningForURL(String str) {
        if (this.activity == null || TextUtils.isEmpty(str)) {
            RAHybridLog.m85712e(TAG, "You didn't set activity, Please call setActivity(Activity) from your app");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(this.activity.getPackageManager()) != null) {
            this.activity.startActivity(intent);
            return;
        }
        RAHybridLog.m85712e(TAG, "Cannot open intent: " + str);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.NavigationActionDecidable
    public int decidePolicy(String str) {
        if (str == null) {
            return 0;
        }
        String scheme = Uri.parse(str).getScheme();
        if (scheme == null) {
            scheme = "https";
        }
        if (ALLOWED_ACCESS_SCHEMES.contains(scheme)) {
            WhiteList whiteList = this.accessWhiteList;
            if (whiteList != null) {
                if (whiteList.isUrlWhiteListed(str)) {
                    return 1;
                }
                AccessControlPluginListener accessControlPluginListener = this.accessControlPluginListener;
                if (accessControlPluginListener != null) {
                    accessControlPluginListener.onFailAccessWhitelistForURL(this, str);
                }
                return 0;
            }
        } else {
            WhiteList whiteList2 = this.intentWhiteList;
            if (whiteList2 == null || whiteList2.isUrlWhiteListed(str)) {
                AccessControlPluginListener accessControlPluginListener2 = this.accessControlPluginListener;
                if (accessControlPluginListener2 != null) {
                    accessControlPluginListener2.onIntentRequireOpeningForURL(this, str);
                } else {
                    handleIntentRequireOpeningForURL(str);
                }
            } else {
                AccessControlPluginListener accessControlPluginListener3 = this.accessControlPluginListener;
                if (accessControlPluginListener3 != null) {
                    accessControlPluginListener3.onFailIntentWhitelistForURL(this, str);
                }
            }
        }
        return 0;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return f71773ID;
    }

    public void setAccessControlPluginListener(AccessControlPluginListener accessControlPluginListener) {
        this.accessControlPluginListener = accessControlPluginListener;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}