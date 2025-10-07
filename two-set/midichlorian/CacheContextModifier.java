package com.disney.wdpro.midichlorian;

/* loaded from: classes2.dex */
public interface CacheContextModifier<T> {
    T noCache();

    T preload();
}