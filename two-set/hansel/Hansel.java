package com.disney.wdpro.hansel;

import android.content.Context;
import android.net.Uri;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;

@Instrumented
/* loaded from: classes28.dex */
public class Hansel {
    private static final String LEVEL_DEBUG = "d";
    private static final String LEVEL_ERROR = "e";
    private static final String LEVEL_WARNING = "w";
    private static final String TAG = "Hansel";
    private static final int TOKEN = 10;
    private static String appName = null;
    private static AsyncContentResolver asyncContentResolver = null;
    private static Uri gretelUri = null;
    private static boolean isHanselRunning = false;

    private Hansel() {
    }

    /* renamed from: d */
    public static void m50246d(String str, String str2, Object... objArr) {
        log("d", str, formatArgs(str2, objArr));
    }

    /* renamed from: e */
    public static void m50247e(String str, String str2, Object... objArr) {
        log("e", str, formatArgs(str2, objArr));
    }

    private static String formatArgs(String str, Object... objArr) {
        return str == null ? "" : (objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
    }

    public static void init(Context context) {
        asyncContentResolver = new AsyncContentResolver(context.getContentResolver());
        gretelUri = Uri.parse(context.getString(C12052R.string.gretel_uri_authority));
        appName = context.getString(C12052R.string.app_name);
        isHanselRunning = GretelContentProviderChecker.isProviderInstalled(context);
    }

    private static void log(String str, String str2, String str3) {
        if (!isHanselRunning) {
            LogInstrumentation.m79024d(TAG, "Hansel is not working as the method init(...) was not called OR Gretel App is not installed in this device.");
            return;
        }
        if (Strings.isNullOrEmpty(str2) || Strings.isNullOrEmpty(str3)) {
            LogInstrumentation.m79024d(TAG, "category or message cannot be null or empty.");
            return;
        }
        try {
            asyncContentResolver.startInsert(10, null, gretelUri, GretelContract.wrap(appName, str, str2, str3));
        } catch (Exception e10) {
            isHanselRunning = false;
            LogInstrumentation.m79026e(TAG, e10.getMessage());
        }
    }

    /* renamed from: w */
    public static void m50248w(String str, String str2, Object... objArr) {
        log(LEVEL_WARNING, str, formatArgs(str2, objArr));
    }

    static void init(AsyncContentResolver asyncContentResolver2, Uri uri, String str, boolean z10) {
        asyncContentResolver = asyncContentResolver2;
        gretelUri = uri;
        appName = str;
        isHanselRunning = z10;
    }
}