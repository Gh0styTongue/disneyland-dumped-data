package com.disney.wdpro.experiences.plugins;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.service.business.APIConstants;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/experiences/plugins/k;", "", "Lcom/disney/wdpro/analytics/n;", "crashHelper", "<init>", "(Lcom/disney/wdpro/analytics/n;)V", "", "eventType", "name", "", APIConstants.UrlParams.ATTRIBUTES, "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/disney/wdpro/analytics/n;", "experiences-android_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.experiences.plugins.k */
/* loaded from: classes27.dex */
public final class C10636k {
    public static final int $stable = 8;
    private final InterfaceC8682n crashHelper;

    @Inject
    public C10636k(InterfaceC8682n crashHelper) {
        Intrinsics.checkNotNullParameter(crashHelper, "crashHelper");
        this.crashHelper = crashHelper;
    }

    /* renamed from: a */
    public void m45818a(String eventType, String name, Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.crashHelper.recordCustomEvent(eventType, name, attributes);
    }
}