package com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.cache;

import java.util.Collection;
import okhttp3.Cookie;

/* loaded from: classes21.dex */
public interface CookieCache extends Iterable<Cookie> {
    void addAll(Collection<Cookie> collection);

    void clear();
}