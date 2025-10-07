package com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes21.dex */
public @interface TimeoutType {
    public static final int PAGE_READY_TIMED_OUT = 5001;
    public static final int WEBVIEW_FINISH_TIMEOUT = 2002;
}