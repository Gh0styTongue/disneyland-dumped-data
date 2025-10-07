package com.wdpr.p479ee.p480ra.rahybrid.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* loaded from: classes21.dex */
public final class DebuggableUtil {
    public static boolean isAppDebuggable(Context context) throws PackageManager.NameNotFoundException {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
                if (applicationInfo != null) {
                    if ((applicationInfo.flags & 2) != 0) {
                        return true;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }
}