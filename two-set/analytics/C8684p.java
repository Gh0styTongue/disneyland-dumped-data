package com.disney.wdpro.analytics;

import com.disney.wdpro.analytics.InterfaceC8669a;
import java.util.List;
import java.util.Map;

/* renamed from: com.disney.wdpro.analytics.p */
/* loaded from: classes23.dex */
public class C8684p {
    private String defaultContent;
    private String name;
    private String orderId;
    private double orderTotal;
    private Map<String, String> parameters;
    private String productCategoryId;
    private String productId;
    private Map<String, String> profileParameters;
    private List<String> purchasedIds;
    private InterfaceC8669a.a result;

    /* renamed from: com.disney.wdpro.analytics.p$a */
    public static class a {
        private String defaultContent;
        private String name;
        private String orderId;
        private double orderTotal;
        private Map<String, String> parameters;
        private String productCategoryId;
        private String productId;
        private Map<String, String> profileParameters;
        private List<String> purchasedIds;
        private InterfaceC8669a.a result;

        public a(String str, String str2, double d10) {
            this.name = str;
            this.orderId = str2;
            this.orderTotal = d10;
        }

        /* renamed from: a */
        public C8684p m37463a() {
            C8684p c8684p = new C8684p();
            c8684p.name = this.name;
            c8684p.orderId = this.orderId;
            c8684p.orderTotal = this.orderTotal;
            c8684p.purchasedIds = this.purchasedIds;
            c8684p.productId = this.productId;
            c8684p.productCategoryId = this.productCategoryId;
            c8684p.defaultContent = this.defaultContent;
            c8684p.parameters = this.parameters;
            c8684p.profileParameters = this.profileParameters;
            c8684p.result = this.result;
            return c8684p;
        }

        /* renamed from: b */
        public a m37464b(InterfaceC8669a.a aVar) {
            this.result = aVar;
            return this;
        }

        /* renamed from: c */
        public a m37465c(Map<String, String> map) {
            this.parameters = map;
            return this;
        }

        /* renamed from: d */
        public a m37466d(List<String> list) {
            this.purchasedIds = list;
            return this;
        }
    }

    /* renamed from: k */
    public String m37453k() {
        return this.defaultContent;
    }

    /* renamed from: l */
    public String m37454l() {
        return this.name;
    }

    /* renamed from: m */
    public String m37455m() {
        return this.orderId;
    }

    /* renamed from: n */
    public double m37456n() {
        return this.orderTotal;
    }

    /* renamed from: o */
    public Map<String, String> m37457o() {
        return this.parameters;
    }

    /* renamed from: p */
    public String m37458p() {
        return this.productCategoryId;
    }

    /* renamed from: q */
    public String m37459q() {
        return this.productId;
    }

    /* renamed from: r */
    public Map<String, String> m37460r() {
        return this.profileParameters;
    }

    /* renamed from: s */
    public List<String> m37461s() {
        return this.purchasedIds;
    }

    /* renamed from: t */
    public InterfaceC8669a.a m37462t() {
        return this.result;
    }
}