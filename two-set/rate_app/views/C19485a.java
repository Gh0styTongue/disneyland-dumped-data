package com.disney.wdpro.rate_app.views;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.rate_app.C19484c;
import com.disney.wdpro.rate_app.DialogInterfaceOnClickListenerC19482a;
import com.google.common.collect.Maps;

/* renamed from: com.disney.wdpro.rate_app.views.a */
/* loaded from: classes16.dex */
public class C19485a {
    private static final String DAYS_TO_RESET = "days_to_reset";
    public static final int DEFAULT_DAYS_TO_RESET = 365;
    public static final int DEFAULT_INTERVAL_LAUNCHES = 7;
    public static final int DEFAULT_MAX_OCURRENCES = 3;
    public static final int DEFAULT_MIN_DAYS = 0;
    public static final int DEFAULT_MIN_LAUNCHES = 7;
    public static final int DEFAULT_VERSION_CODE = 0;
    private static final String INTERVAL_LAUNCHES_TO_SHOW = "interval_launches_to_show";
    private static final String MAX_OCURRENCES = "max_ocurrences_before_reset";
    private static final String MIN_DAYS = "days_until_show";
    private static final String MIN_LAUNCHES = "launches_until_show";
    private static final String VERSION_CODE = "version_code";
    private Activity activity;
    private InterfaceC8679k analyticsHelper;
    private String message;

    /* renamed from: com.disney.wdpro.rate_app.views.a$a */
    private static class a implements DialogInterface.OnClickListener {
        InterfaceC8679k analyticsHelper;

        a(InterfaceC8679k interfaceC8679k) {
            this.analyticsHelper = interfaceC8679k;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.analyticsHelper.mo37407d(i10 != -3 ? i10 != -2 ? i10 != -1 ? "" : "Send feedback now" : "No, Thanks" : "Remind me later", Maps.m69372i("link.category", "Feedback Prompt"));
        }
    }

    private C19485a(Activity activity, String str, InterfaceC8679k interfaceC8679k) {
        this.activity = activity;
        this.message = str;
        this.analyticsHelper = interfaceC8679k;
    }

    /* renamed from: a */
    public static C19485a m61146a(Activity activity, String str, InterfaceC8679k interfaceC8679k) {
        return new C19485a(activity, str, interfaceC8679k);
    }

    /* renamed from: b */
    public C19485a m61147b(int i10) {
        PreferenceManager.getDefaultSharedPreferences(this.activity).edit().putInt(DAYS_TO_RESET, i10).commit();
        return this;
    }

    /* renamed from: c */
    public C19485a m61148c(int i10) {
        PreferenceManager.getDefaultSharedPreferences(this.activity).edit().putInt(INTERVAL_LAUNCHES_TO_SHOW, i10).commit();
        return this;
    }

    /* renamed from: d */
    public C19485a m61149d(int i10) {
        PreferenceManager.getDefaultSharedPreferences(this.activity).edit().putInt(MAX_OCURRENCES, i10).commit();
        return this;
    }

    /* renamed from: e */
    public C19485a m61150e(int i10) {
        PreferenceManager.getDefaultSharedPreferences(this.activity).edit().putInt(MIN_DAYS, i10).commit();
        return this;
    }

    /* renamed from: f */
    public C19485a m61151f(int i10) {
        PreferenceManager.getDefaultSharedPreferences(this.activity).edit().putInt(MIN_LAUNCHES, i10).commit();
        return this;
    }

    /* renamed from: g */
    public void m61152g() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.activity);
        new DialogInterfaceOnClickListenerC19482a(this.activity).m61138e(new AlertDialog.Builder(this.activity).setTitle(this.activity.getString(C19484c.rate_app_dialog_title)).setMessage(this.message).setPositiveButton(this.activity.getString(C19484c.rate_app_positive_btn), (DialogInterface.OnClickListener) null).setNegativeButton(this.activity.getString(C19484c.rate_app_negative_btn), (DialogInterface.OnClickListener) null)).m61145l(false).m61143j(defaultSharedPreferences.getInt(MIN_LAUNCHES, 7)).m61142i(defaultSharedPreferences.getInt(MIN_DAYS, 0)).m61139f(defaultSharedPreferences.getInt(DAYS_TO_RESET, 365)).m61141h(defaultSharedPreferences.getInt(MAX_OCURRENCES, 3)).m61140g(defaultSharedPreferences.getInt(INTERVAL_LAUNCHES_TO_SHOW, 7)).m61144k(new a(this.analyticsHelper)).m61137b();
    }
}