package com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar;

import com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.cache.CookieCache;
import com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.CookiePersistor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

/* loaded from: classes21.dex */
public class PersistentCookieJar implements ClearableCookieJar {
    private CookieCache cache;
    private CookiePersistor persistor;

    public PersistentCookieJar(CookieCache cookieCache, CookiePersistor cookiePersistor) {
        this.cache = cookieCache;
        this.persistor = cookiePersistor;
        cookieCache.addAll(cookiePersistor.loadAll());
    }

    private static List<Cookie> filterPersistentCookies(List<Cookie> list) {
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie : list) {
            if (cookie.persistent()) {
                arrayList.add(cookie);
            }
        }
        return arrayList;
    }

    private static boolean isCookieExpired(Cookie cookie) {
        return cookie.expiresAt() < System.currentTimeMillis();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.ClearableCookieJar
    public synchronized void clear() {
        this.cache.clear();
        this.persistor.clear();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.ClearableCookieJar
    public synchronized void clearSession() {
        this.cache.clear();
        this.cache.addAll(this.persistor.loadAll());
    }

    @Override // okhttp3.CookieJar
    public synchronized List<Cookie> loadForRequest(HttpUrl httpUrl) {
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = new ArrayList();
            arrayList = new ArrayList();
            Iterator<Cookie> it = this.cache.iterator();
            while (it.hasNext()) {
                Cookie next = it.next();
                if (isCookieExpired(next)) {
                    arrayList2.add(next);
                    it.remove();
                } else if (next.matches(httpUrl)) {
                    arrayList.add(next);
                }
            }
            this.persistor.removeAll(arrayList2);
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public synchronized void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        this.cache.addAll(list);
        this.persistor.saveAll(filterPersistentCookies(list));
    }
}