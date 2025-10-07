package com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.cache;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import okhttp3.Cookie;

/* loaded from: classes21.dex */
public class SetCookieCache implements CookieCache {
    private Set<IdentifiableCookie> cookies = new HashSet();

    private class SetCookieCacheIterator implements Iterator<Cookie> {
        private Iterator<IdentifiableCookie> iterator;

        public SetCookieCacheIterator() {
            this.iterator = SetCookieCache.this.cookies.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iterator.remove();
        }

        @Override // java.util.Iterator
        public Cookie next() {
            return this.iterator.next().getCookie();
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.cache.CookieCache
    public void addAll(Collection<Cookie> collection) {
        for (IdentifiableCookie identifiableCookie : IdentifiableCookie.decorateAll(collection)) {
            this.cookies.remove(identifiableCookie);
            this.cookies.add(identifiableCookie);
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.cache.CookieCache
    public void clear() {
        this.cookies.clear();
    }

    @Override // java.lang.Iterable
    public Iterator<Cookie> iterator() {
        return new SetCookieCacheIterator();
    }
}