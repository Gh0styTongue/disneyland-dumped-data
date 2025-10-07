package com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;

@SuppressLint({"CommitPrefEdits"})
/* loaded from: classes21.dex */
public class SharedPrefsCookiePersistor implements CookiePersistor {
    private final SharedPreferences sharedPreferences;

    public SharedPrefsCookiePersistor(Context context) {
        this(context.getSharedPreferences("CookiePersistence", 0));
    }

    private static String createCookieKey(Cookie cookie) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cookie.secure() ? "https" : "http");
        sb2.append("://");
        sb2.append(cookie.domain());
        sb2.append(cookie.path());
        sb2.append("|");
        sb2.append(cookie.name());
        return sb2.toString();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.CookiePersistor
    public void clear() {
        this.sharedPreferences.edit().clear().commit();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.CookiePersistor
    public List<Cookie> loadAll() throws Throwable {
        ArrayList arrayList = new ArrayList(this.sharedPreferences.getAll().size());
        Iterator<Map.Entry<String, ?>> it = this.sharedPreferences.getAll().entrySet().iterator();
        while (it.hasNext()) {
            Cookie cookieDecode = new SerializableCookie().decode((String) it.next().getValue());
            if (cookieDecode != null) {
                arrayList.add(cookieDecode);
            }
        }
        return arrayList;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.CookiePersistor
    public void removeAll(Collection<Cookie> collection) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        Iterator<Cookie> it = collection.iterator();
        while (it.hasNext()) {
            editorEdit.remove(createCookieKey(it.next()));
        }
        editorEdit.commit();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.CookiePersistor
    public void saveAll(Collection<Cookie> collection) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        for (Cookie cookie : collection) {
            editorEdit.putString(createCookieKey(cookie), new SerializableCookie().encode(cookie));
        }
        editorEdit.commit();
    }

    public SharedPrefsCookiePersistor(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }
}