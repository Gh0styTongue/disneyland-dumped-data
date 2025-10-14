package com.disney.wdpro.async_messaging.analytics;

import com.adobe.marketing.mobile.AdobeCallback;
import com.adobe.marketing.mobile.edge.identity.C6490c;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, m92038d2 = {"Lcom/disney/wdpro/async_messaging/analytics/b;", "", "<init>", "()V", "", "c", "", "campaignId", "Ljava/lang/String;", "b", "()Ljava/lang/String;", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "(Ljava/lang/String;)V", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.async_messaging.analytics.b */
/* loaded from: classes24.dex */
public class C8909b {
    public static final int $stable = 8;
    private String campaignId;

    @Inject
    public C8909b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m37800d(C8909b c8909b, String str) {
        c8909b.m37803e(str);
    }

    /* renamed from: b, reason: from getter */
    public String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: c */
    public void m37802c() {
        C6490c.m31189b(new AdobeCallback() { // from class: com.disney.wdpro.async_messaging.analytics.a
            @Override // com.adobe.marketing.mobile.AdobeCallback
            /* renamed from: a */
            public final void mo30322a(Object obj) {
                C8909b.m37800d(this.f29543a, (String) obj);
            }
        });
    }

    /* renamed from: e */
    public void m37803e(String str) {
        this.campaignId = str;
    }
}