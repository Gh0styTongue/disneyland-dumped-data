package com.disney.wdpro.hansel;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m92038d2 = {"isProviderInstalled", "", "context", "Landroid/content/Context;", "hansel_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
@JvmName(name = "GretelContentProviderChecker")
@SourceDebugExtension({"SMAP\nGretelContentProviderChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GretelContentProviderChecker.kt\ncom/disney/wdpro/hansel/GretelContentProviderChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,37:1\n766#2:38\n857#2,2:39\n1855#2:41\n1856#2:44\n13579#3,2:42\n*S KotlinDebug\n*F\n+ 1 GretelContentProviderChecker.kt\ncom/disney/wdpro/hansel/GretelContentProviderChecker\n*L\n23#1:38\n23#1:39,2\n26#1:41\n26#1:44\n27#1:42,2\n*E\n"})
/* loaded from: classes28.dex */
public final class GretelContentProviderChecker {
    public static final boolean isProviderInstalled(Context context) {
        ProviderInfo[] providers;
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C12052R.string.gretel_uri_authority);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.gretel_uri_authority)");
        if (string.length() == 0) {
            return false;
        }
        try {
            List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(8);
            Intrinsics.checkNotNullExpressionValue(installedPackages, "context.packageManager.g…ageManager.GET_PROVIDERS)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : installedPackages) {
                String str = ((PackageInfo) obj).packageName;
                Intrinsics.checkNotNullExpressionValue(str, "packageInfo.packageName");
                if (StringsKt.contains((CharSequence) str, (CharSequence) "gretel", true)) {
                    arrayList.add(obj);
                }
            }
            boolean z10 = false;
            for (PackageInfo packageInfo : CollectionsKt.toList(arrayList)) {
                try {
                    if (packageInfo != null && (providers = packageInfo.providers) != null) {
                        Intrinsics.checkNotNullExpressionValue(providers, "providers");
                        for (ProviderInfo providerInfo : providers) {
                            String str2 = providerInfo.authority;
                            Intrinsics.checkNotNullExpressionValue(str2, "it.authority");
                            if (StringsKt.contains((CharSequence) string, (CharSequence) str2, true)) {
                                z10 = true;
                            }
                        }
                    }
                } catch (Exception unused) {
                    return z10;
                }
            }
            return z10;
        } catch (Exception unused2) {
            return false;
        }
    }
}