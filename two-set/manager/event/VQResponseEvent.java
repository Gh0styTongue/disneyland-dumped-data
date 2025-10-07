package com.disney.wdpro.virtualqueue.core.manager.event;

import com.couchbase.lite.internal.core.C4Replicator;
import com.disney.wdpro.commons.AbstractC9344n;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0007\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR6\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/event/VQResponseEvent;", "T", "Lcom/disney/wdpro/commons/n;", "<init>", "()V", "", "headerKey", "getHeaderValue", "(Ljava/lang/String;)Ljava/lang/String;", "", "", C4Replicator.REPLICATOR_OPTION_EXTRA_HEADERS, "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public class VQResponseEvent<T> extends AbstractC9344n<T> {
    public static final int $stable = 8;
    private Map<String, ? extends List<String>> headers;

    public final String getHeaderValue(String headerKey) {
        List<String> list;
        Intrinsics.checkNotNullParameter(headerKey, "headerKey");
        Map<String, ? extends List<String>> map = this.headers;
        return String.valueOf((map == null || (list = map.get(headerKey)) == null) ? null : list.get(0));
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final void setHeaders(Map<String, ? extends List<String>> map) {
        this.headers = map;
    }
}