package com.disney.wdpro.rate_app;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.Thread;

/* renamed from: com.disney.wdpro.rate_app.b */
/* loaded from: classes16.dex */
public class C19483b implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler defaultExceptionHandler;
    SharedPreferences preferences;

    public C19483b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        this.preferences = context.getSharedPreferences("apprate_prefs", 0);
        this.defaultExceptionHandler = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.preferences.edit().putBoolean("pref_app_has_crashed", true).commit();
        this.defaultExceptionHandler.uncaughtException(thread, th2);
    }
}