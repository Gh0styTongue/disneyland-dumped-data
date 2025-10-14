package com.disney.wdpro.analytics;

import com.adobe.marketing.mobile.AdobeCallback;
import com.adobe.marketing.mobile.Target;
import com.adobe.marketing.mobile.target.C6823n;
import com.adobe.marketing.mobile.target.C6824o;
import com.adobe.marketing.mobile.target.C6830u;
import com.adobe.marketing.mobile.target.C6831v;
import com.disney.wdpro.analytics.InterfaceC8669a;
import com.disney.wdpro.opp.dine.data.services.order.model.DinePlanCouponCode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.disney.wdpro.analytics.d */
/* loaded from: classes23.dex */
public class C8672d implements InterfaceC8669a {
    private Map<String, String> defaultParameters = new HashMap();

    @Override // com.disney.wdpro.analytics.InterfaceC8669a
    /* renamed from: a */
    public void mo37390a(String str, String str2, Map<String, String> map, final InterfaceC8669a.a aVar) {
        map.putAll(this.defaultParameters);
        C6824o c6824oM32353e = new C6824o.b().m32355g(map).m32353e();
        Objects.requireNonNull(aVar);
        Target.m30672d(Collections.singletonList(new C6831v(str, c6824oM32353e, str2, new AdobeCallback() { // from class: com.disney.wdpro.analytics.b
            @Override // com.adobe.marketing.mobile.AdobeCallback
            /* renamed from: a */
            public final void mo30322a(Object obj) {
                aVar.processResponse((String) obj);
            }
        })), new C6824o.b().m32353e());
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8669a
    /* renamed from: b */
    public void mo37391b(final C8684p c8684p) {
        C6824o c6824oM32353e = new C6824o.b().m32354f(new C6823n(c8684p.m37455m(), c8684p.m37456n(), c8684p.m37461s())).m32355g(c8684p.m37457o()).m32356h(new C6830u(c8684p.m37459q(), c8684p.m37458p())).m32357i(c8684p.m37460r()).m32353e();
        Target.m30672d(Collections.singletonList(new C6831v(c8684p.m37454l(), c6824oM32353e, c8684p.m37453k(), new AdobeCallback() { // from class: com.disney.wdpro.analytics.c
            @Override // com.adobe.marketing.mobile.AdobeCallback
            /* renamed from: a */
            public final void mo30322a(Object obj) {
                c8684p.m37462t().processResponse((String) obj);
            }
        })), c6824oM32353e);
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8669a
    /* renamed from: c */
    public void mo37392c(boolean z10) {
        this.defaultParameters.put("mboxHost", z10 ? "PROD" : DinePlanCouponCode.QS_ADULT);
    }
}