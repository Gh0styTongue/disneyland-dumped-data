package com.disney.wdpro.midichlorian;

import java.util.Set;

/* loaded from: classes2.dex */
public interface StickyEventPoster {
    Set<String> getStickyListenerIds(Class cls);

    void postEvent(Object obj, Set<String> set);
}