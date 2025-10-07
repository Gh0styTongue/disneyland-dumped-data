package com.disney.wdpro.queueit;

import android.app.Activity;
import android.webkit.WebView;

/* renamed from: com.disney.wdpro.queueit.t */
/* loaded from: classes16.dex */
public class C19480t {
    private static String DeviceUserAgent = null;
    public static final String SDKVersion = "com.disney.wdpro.queueit@2.0.0";

    private C19480t() {
    }

    /* renamed from: a */
    public static String m61130a() {
        return DeviceUserAgent + " (sdk: " + SDKVersion + ")";
    }

    /* renamed from: b */
    public static void m61131b(Activity activity) {
        DeviceUserAgent = new WebView(activity).getSettings().getUserAgentString();
    }
}