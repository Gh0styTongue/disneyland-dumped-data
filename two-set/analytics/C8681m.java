package com.disney.wdpro.analytics;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

/* renamed from: com.disney.wdpro.analytics.m */
/* loaded from: classes23.dex */
public class C8681m {
    private Map<String, String> analyticsContext = Maps.m69381r();
    protected final a builder;

    /* renamed from: com.disney.wdpro.analytics.m$a */
    public static class a {
        protected String action;
        protected List<Map.Entry<String, String>> contextEntries = Lists.m69268i();
        protected boolean removeNullValues;

        public a(String str) {
            this.action = str;
        }

        /* renamed from: a */
        public a m37437a(Map<String, String> map) {
            return (map == null || map.isEmpty()) ? this : m37438b((Map.Entry[]) map.entrySet().toArray(new Map.Entry[map.size()]));
        }

        /* renamed from: b */
        public a m37438b(Map.Entry<String, String>... entryArr) {
            if (entryArr != null) {
                this.contextEntries.addAll(Lists.m69271l(entryArr));
            }
            return this;
        }

        /* renamed from: c */
        public a m37439c(String str, String str2) {
            if (str != null) {
                List<Map.Entry<String, String>> list = this.contextEntries;
                if (str2 == null) {
                    str2 = "";
                }
                list.add(Maps.m69372i(str, str2));
            }
            return this;
        }

        /* renamed from: d */
        public C8681m m37440d() {
            return new C8681m(this);
        }
    }

    protected C8681m(a aVar) {
        this.builder = aVar;
        for (Map.Entry<String, String> entry : aVar.contextEntries) {
            if (!aVar.removeNullValues || entry.getValue() != null) {
                this.analyticsContext.put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: a */
    public String m37435a() {
        return this.builder.action;
    }

    /* renamed from: b */
    public Map<String, String> m37436b() {
        return this.analyticsContext;
    }
}