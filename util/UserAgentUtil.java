package com.wdpr.p479ee.p480ra.rahybrid.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.webkit.WebView;

/* loaded from: classes21.dex */
public class UserAgentUtil {
    private static final String SEPARATOR = "/";
    private static final String SINGLE_SPACE = " ";
    public static final String TAG = "UserAgentUtil";
    private static final String USER_AGENT = "DisneyRAWebView/Android";

    public static String buildUserAgentString(WebView webView) {
        String userAgentString = webView.getSettings().getUserAgentString();
        String customUserAgentString = getCustomUserAgentString(webView.getContext());
        if (userAgentString.contains(customUserAgentString)) {
            return userAgentString;
        }
        return userAgentString + " " + customUserAgentString;
    }

    public static String getAppInfo(Context context) throws PackageManager.NameNotFoundException {
        if (context == null) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo.packageName + "/" + packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            RAHybridLog.m85713e(TAG, "Error on reading package information", e10);
            return "";
        }
    }

    public static String getCustomUserAgentString(Context context) {
        return getAppInfo(context) + " " + getFrameworkInfo() + " DisneyRAWebView/Android";
    }

    public static String getFrameworkInfo() {
        return "com.wdpr.ee.ra.rahybrid/8.6.3";
    }
}