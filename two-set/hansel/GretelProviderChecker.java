package com.disney.wdpro.hansel;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;

/* loaded from: classes28.dex */
public class GretelProviderChecker {
    public static boolean isProviderInstalled(Context context) {
        String string;
        try {
            string = context.getString(C12052R.string.gretel_uri_authority);
        } catch (Exception unused) {
        }
        if (string.isEmpty()) {
            return false;
        }
        for (PackageInfo packageInfo : context.getPackageManager().getInstalledPackages(8)) {
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (string.contains(packageInfo.packageName) && providerInfoArr != null && providerInfoArr.length > 0) {
                for (ProviderInfo providerInfo : providerInfoArr) {
                    if (string.contains(providerInfo.authority)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}