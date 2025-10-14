package com.disney.wdpro.analytics;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.disney.wdpro.analytics.i */
/* loaded from: classes23.dex */
public class C8677i {
    private boolean allowNull;
    private List<Map.Entry<String, Object>> entries;

    public C8677i(boolean z10) {
        this(z10, null);
    }

    /* renamed from: a */
    public C8677i m37423a(Map<? extends String, String> map) {
        if (map != null) {
            Iterator<Map.Entry<? extends String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                m37426d(it.next());
            }
        }
        return this;
    }

    /* renamed from: b */
    public C8677i m37424b(String str, int i10) {
        m37425c(str, Integer.valueOf(i10));
        return this;
    }

    /* renamed from: c */
    public C8677i m37425c(String str, Object obj) {
        if (!this.allowNull && (str == null || obj == null)) {
            return this;
        }
        this.entries.add(new AbstractMap.SimpleImmutableEntry(str, obj));
        return this;
    }

    /* renamed from: d */
    public C8677i m37426d(Map.Entry<? extends String, ?> entry) {
        if (!this.allowNull && (entry == null || entry.getKey() == null || entry.getValue() == null)) {
            return this;
        }
        this.entries.add(new AbstractMap.SimpleImmutableEntry(entry));
        return this;
    }

    /* renamed from: e */
    public Map.Entry<String, Object>[] m37427e() {
        Map.Entry<String, Object>[] entryArr = new Map.Entry[this.entries.size()];
        this.entries.toArray(entryArr);
        return entryArr;
    }

    /* renamed from: f */
    public Map<String, String> m37428f() {
        HashMap mapM69381r = Maps.m69381r();
        for (Map.Entry<String, Object> entry : this.entries) {
            mapM69381r.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return mapM69381r;
    }

    public C8677i(boolean z10, Map<? extends String, String> map) {
        this.entries = Lists.m69268i();
        this.allowNull = z10;
        m37423a(map);
    }
}