package com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.cache;

import com.snap.camerakit.internal.h76;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;

/* loaded from: classes21.dex */
class IdentifiableCookie {
    private Cookie cookie;

    IdentifiableCookie(Cookie cookie) {
        this.cookie = cookie;
    }

    static List<IdentifiableCookie> decorateAll(Collection<Cookie> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<Cookie> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new IdentifiableCookie(it.next()));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IdentifiableCookie)) {
            return false;
        }
        IdentifiableCookie identifiableCookie = (IdentifiableCookie) obj;
        return identifiableCookie.cookie.name().equals(this.cookie.name()) && identifiableCookie.cookie.domain().equals(this.cookie.domain()) && identifiableCookie.cookie.path().equals(this.cookie.path()) && identifiableCookie.cookie.secure() == this.cookie.secure() && identifiableCookie.cookie.hostOnly() == this.cookie.hostOnly();
    }

    Cookie getCookie() {
        return this.cookie;
    }

    public int hashCode() {
        return ((((((((h76.SEND_CHANNEL_VERIFICATION_CODE_ATTEMPT_FIELD_NUMBER + this.cookie.name().hashCode()) * 31) + this.cookie.domain().hashCode()) * 31) + this.cookie.path().hashCode()) * 31) + (!this.cookie.secure() ? 1 : 0)) * 31) + (!this.cookie.hostOnly() ? 1 : 0);
    }
}