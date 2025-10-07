package com.wdpr.p479ee.p480ra.rahybrid.plugin;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes21.dex */
public interface NavigationActionDecidable {
    public static final int ALLOW = 1;
    public static final int CANCEL = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface NavigationActionPolicy {
    }

    int decidePolicy(String str);
}