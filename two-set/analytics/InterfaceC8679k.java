package com.disney.wdpro.analytics;

import android.app.Application;
import android.location.Location;
import java.util.Map;

/* renamed from: com.disney.wdpro.analytics.k */
/* loaded from: classes23.dex */
public interface InterfaceC8679k {
    public static final String IGNORE = "ignore";

    /* renamed from: a */
    void mo37404a(Application application);

    /* renamed from: b */
    void mo37405b(String str, Map<String, String> map);

    /* renamed from: c */
    void mo37406c(String str, String str2, Map<String, String> map);

    /* renamed from: d */
    void mo37407d(String str, Map.Entry<String, String>... entryArr);

    /* renamed from: e */
    void mo37408e(String str, String str2, String str3);

    /* renamed from: f */
    void mo37409f(Application application);

    /* renamed from: g */
    void mo37410g(String str, String str2, Map<String, String> map);

    /* renamed from: h */
    void mo37411h(String str, String str2, Map.Entry<String, String>... entryArr);

    /* renamed from: i */
    void mo37412i(String str, String str2);

    /* renamed from: j */
    void mo37413j();

    /* renamed from: k */
    void mo37414k(C8681m c8681m);

    /* renamed from: l */
    default void mo37415l(Boolean bool) {
    }

    /* renamed from: m */
    void mo37416m(String str, String str2, String str3, String str4, String str5);

    /* renamed from: n */
    void mo37417n(String str, Map.Entry<String, String>... entryArr);

    /* renamed from: o */
    void mo37418o(Location location, Map<String, String> map);

    /* renamed from: p */
    void mo37419p();

    /* renamed from: q */
    Map<String, String> mo37420q();

    default void trackTimedActionEnd(String str) {
    }

    default void trackTimedActionStart(String str, Map<String, Object> map) {
    }
}