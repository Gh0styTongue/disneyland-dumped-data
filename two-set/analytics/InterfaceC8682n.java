package com.disney.wdpro.analytics;

import com.disney.wdpro.dlog.InterfaceC10156a;
import com.disney.wdpro.dlog.InterfaceC10158c;
import java.util.Map;

/* renamed from: com.disney.wdpro.analytics.n */
/* loaded from: classes23.dex */
public interface InterfaceC8682n extends InterfaceC10156a, InterfaceC10158c {
    public static final String CONVERSATION_ID = "conversationID";
    public static final String SWID = "swid";

    default String getCurrentSessionId() {
        return null;
    }

    void init();

    @Deprecated
    void logHandledException(Throwable th2);

    default boolean recordBreadcrumb(String str, Map<String, Object> map) {
        return false;
    }

    @Override // com.disney.wdpro.dlog.InterfaceC10158c
    boolean recordCustomEvent(String str, String str2, Map<String, Object> map);

    default void recordHandledException(Exception exc) {
    }

    default void removeAttribute(String str) {
    }

    void sendBreadcrumb(String str);

    default void sendBreadcrumb(String str, boolean z10) {
        sendBreadcrumb(str);
    }

    default void setAttribute(String str, String str2) {
    }

    default void trackTimedActionEnd(String str) {
    }

    default void trackTimedActionStart(String str, Map<String, Object> map) {
    }

    default void trackTimedActionUpdate(String str, Map<String, Object> map) {
    }

    default void trackTimedActionsFlagAsBackgrounded() {
    }

    default void trackTimedActionEnd(String str, String str2) {
    }
}