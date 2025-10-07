package com.disney.wdpro.rate_app;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;
import com.google.common.base.C22462m;
import java.lang.Thread;

/* renamed from: com.disney.wdpro.rate_app.a */
/* loaded from: classes16.dex */
public class DialogInterfaceOnClickListenerC19482a implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    private static final String TAG = "AppRater";
    private DialogInterface.OnClickListener clickListener;
    private Activity hostActivity;
    private SharedPreferences preferences;
    private long versionCode;
    private AlertDialog.Builder dialogBuilder = null;
    private long minLaunchesUntilPrompt = 0;
    private long minDaysUntilPrompt = 0;
    private long daysToReset = -1;
    private long maxOccurrences = -1;
    private long intervalBetweenOccurrences = 0;
    private boolean showIfHasCrashed = true;
    private boolean showAgainIfPositive = true;
    private boolean showAgainIfNegative = true;

    public DialogInterfaceOnClickListenerC19482a(Activity activity) {
        this.hostActivity = activity;
        this.preferences = activity.getSharedPreferences("apprate_prefs", 0);
    }

    /* renamed from: a */
    private static final String m61132a(Context context) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "(unknown)");
    }

    /* renamed from: c */
    private void m61133c() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof C19483b) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C19483b(defaultUncaughtExceptionHandler, this.hostActivity));
    }

    /* renamed from: d */
    private void m61134d() {
        this.preferences.edit().clear().commit();
    }

    /* renamed from: m */
    private void m61135m() {
        new AlertDialog.Builder(this.hostActivity).setTitle("Rate " + m61132a(this.hostActivity.getApplicationContext())).setMessage("If you enjoy using " + m61132a(this.hostActivity.getApplicationContext()) + ", please take a moment to rate it. Thanks for your support!").setPositiveButton("Rate it !", this).setNegativeButton("No thanks", this).setNeutralButton("Remind me later", this).setOnCancelListener(this).create().show();
    }

    /* renamed from: n */
    private void m61136n(AlertDialog.Builder builder) {
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        String str = (String) alertDialogCreate.getButton(-1).getText();
        String str2 = (String) alertDialogCreate.getButton(-3).getText();
        String str3 = (String) alertDialogCreate.getButton(-2).getText();
        alertDialogCreate.setButton(-1, str, this);
        alertDialogCreate.setButton(-3, str2, this);
        alertDialogCreate.setButton(-2, str3, this);
        alertDialogCreate.setOnCancelListener(this);
    }

    /* renamed from: b */
    public void m61137b() {
        long j10 = this.preferences.getLong("date_firstlaunch", 0L);
        Long lValueOf = Long.valueOf(j10);
        if (this.daysToReset >= 0 && System.currentTimeMillis() >= (this.daysToReset * 86400000) + j10) {
            m61134d();
        }
        if (this.preferences.getBoolean("dont_show_again", false)) {
            return;
        }
        if (!this.preferences.getBoolean("pref_app_has_crashed", false) || this.showIfHasCrashed) {
            if (!this.showIfHasCrashed) {
                m61133c();
            }
            SharedPreferences.Editor editorEdit = this.preferences.edit();
            long j11 = this.preferences.getLong("launch_count", 0L) + 1;
            editorEdit.putLong("launch_count", j11);
            if (j10 == 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                lValueOf = Long.valueOf(jCurrentTimeMillis);
                editorEdit.putLong("date_firstlaunch", jCurrentTimeMillis);
            }
            if (j11 >= this.minLaunchesUntilPrompt && System.currentTimeMillis() >= lValueOf.longValue() + (this.minDaysUntilPrompt * 86400000)) {
                long j12 = j11 - this.minLaunchesUntilPrompt;
                long j13 = this.intervalBetweenOccurrences;
                if (j13 == 0 || j12 % j13 == 0) {
                    long j14 = this.preferences.getLong("occurrence_count", 0L) + 1;
                    long j15 = this.maxOccurrences;
                    if (j15 == -1 || j14 <= j15) {
                        editorEdit.putLong("occurrence_count", j14);
                        AlertDialog.Builder builder = this.dialogBuilder;
                        if (builder != null) {
                            m61136n(builder);
                        } else {
                            m61135m();
                        }
                    }
                }
            }
            editorEdit.commit();
        }
    }

    /* renamed from: e */
    public DialogInterfaceOnClickListenerC19482a m61138e(AlertDialog.Builder builder) {
        this.dialogBuilder = builder;
        return this;
    }

    /* renamed from: f */
    public DialogInterfaceOnClickListenerC19482a m61139f(long j10) {
        C22462m.m68673e(j10 >= -1, "daysToReset must be -1 or greater");
        this.daysToReset = j10;
        return this;
    }

    /* renamed from: g */
    public DialogInterfaceOnClickListenerC19482a m61140g(long j10) {
        C22462m.m68673e(j10 >= 0, "intervalBetweenOccurrences must be 0 or greater");
        this.intervalBetweenOccurrences = j10;
        return this;
    }

    /* renamed from: h */
    public DialogInterfaceOnClickListenerC19482a m61141h(long j10) {
        C22462m.m68673e(j10 >= -1, "maxOcurrences must be -1 or greater");
        this.maxOccurrences = j10;
        return this;
    }

    /* renamed from: i */
    public DialogInterfaceOnClickListenerC19482a m61142i(long j10) {
        C22462m.m68673e(j10 >= 0, "minDaysUntilPrompt must be 0 or greater");
        this.minDaysUntilPrompt = j10;
        return this;
    }

    /* renamed from: j */
    public DialogInterfaceOnClickListenerC19482a m61143j(long j10) {
        C22462m.m68673e(j10 >= 0, "minLaunchesUntilPrompt must be 0 or greater");
        this.minLaunchesUntilPrompt = j10;
        return this;
    }

    /* renamed from: k */
    public DialogInterfaceOnClickListenerC19482a m61144k(DialogInterface.OnClickListener onClickListener) {
        this.clickListener = onClickListener;
        return this;
    }

    /* renamed from: l */
    public DialogInterfaceOnClickListenerC19482a m61145l(boolean z10) {
        this.showIfHasCrashed = z10;
        return this;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        if (i10 == -3) {
            editorEdit.putLong("date_firstlaunch", System.currentTimeMillis());
            editorEdit.putLong("launch_count", 0L);
        } else if (i10 != -2) {
            if (i10 == -1) {
                try {
                    this.hostActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.hostActivity.getPackageName())));
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(this.hostActivity, "No Play Store installed on device", 0).show();
                }
                if (!this.showAgainIfPositive) {
                    editorEdit.putBoolean("dont_show_again", true);
                }
            }
        } else if (!this.showAgainIfNegative) {
            editorEdit.putBoolean("dont_show_again", true);
        }
        editorEdit.commit();
        dialogInterface.dismiss();
        DialogInterface.OnClickListener onClickListener = this.clickListener;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i10);
        }
    }
}