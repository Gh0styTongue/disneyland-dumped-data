package com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar;

import okhttp3.CookieJar;

/* loaded from: classes21.dex */
public interface ClearableCookieJar extends CookieJar {
    void clear();

    void clearSession();
}