package com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence;

import java.util.Collection;
import java.util.List;
import okhttp3.Cookie;

/* loaded from: classes21.dex */
public interface CookiePersistor {
    void clear();

    List<Cookie> loadAll();

    void removeAll(Collection<Cookie> collection);

    void saveAll(Collection<Cookie> collection);
}