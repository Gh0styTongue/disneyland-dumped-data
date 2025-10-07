package com.disney.wdpro.photopasscommons.ext;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m92038d2 = {"Landroid/content/Context;", "", "b", "(Landroid/content/Context;)Z", "Landroid/view/View;", "", "c", "(Landroid/view/View;)V", "photopasscommons_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.b */
/* loaded from: classes15.dex */
public final class C18808b {
    /* renamed from: b */
    public static final boolean m60562b(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> serviceInfoList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        Intrinsics.checkNotNullExpressionValue(serviceInfoList, "serviceInfoList");
        return !serviceInfoList.isEmpty();
    }

    /* renamed from: c */
    public static final void m60563c(final View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.post(new Runnable() { // from class: com.disney.wdpro.photopasscommons.ext.a
            @Override // java.lang.Runnable
            public final void run() {
                C18808b.m60564d(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m60564d(View this_requestAccessibilityFocus) {
        Intrinsics.checkNotNullParameter(this_requestAccessibilityFocus, "$this_requestAccessibilityFocus");
        this_requestAccessibilityFocus.sendAccessibilityEvent(8);
    }
}