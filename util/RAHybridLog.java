package com.wdpr.p479ee.p480ra.rahybrid.util;

import android.content.Context;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;

@Instrumented
/* loaded from: classes21.dex */
public class RAHybridLog {
    private static boolean isDebuggable = false;

    private RAHybridLog() {
        throw new AssertionError();
    }

    /* renamed from: d */
    public static void m85711d(String str, String str2) {
        if (isDebuggable) {
            LogInstrumentation.m79024d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m85712e(String str, String str2) {
        if (isDebuggable) {
            LogInstrumentation.m79026e(str, str2);
        }
    }

    /* renamed from: i */
    public static void m85714i(String str, String str2) {
        if (isDebuggable) {
            longInfo(str, str2);
        }
    }

    public static void initRAHybridLog(Context context) {
        isDebuggable = DebuggableUtil.isAppDebuggable(context);
    }

    private static void longInfo(String str, String str2) {
        if (str2.length() <= 4000) {
            LogInstrumentation.m79028i(str, str2);
        } else {
            LogInstrumentation.m79028i(str, str2.substring(0, 4000));
            longInfo(str, str2.substring(4000));
        }
    }

    /* renamed from: v */
    public static void m85715v(String str, String str2) {
        if (isDebuggable) {
            LogInstrumentation.m79030v(str, str2);
        }
    }

    /* renamed from: w */
    public static void m85716w(String str, String str2) {
        if (isDebuggable) {
            LogInstrumentation.m79032w(str, str2);
        }
    }

    /* renamed from: e */
    public static void m85713e(String str, String str2, Throwable th2) {
        if (isDebuggable) {
            LogInstrumentation.m79027e(str, str2, th2);
        }
    }
}