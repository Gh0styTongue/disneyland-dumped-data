package com.disney.wdpro.midichlorian;

import android.os.Looper;
import com.disney.wdpro.midichlorian.ProxyFactory;

/* loaded from: classes2.dex */
public class UIThreadEnforcer implements ProxyFactory.ExecutionThreadEnforcer {
    @Override // com.disney.wdpro.midichlorian.ProxyFactory.ExecutionThreadEnforcer
    public void enforceNonUI(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException(str + " accessed from the main thread, only @UIEvent methods can be executed from the main thread");
    }

    @Override // com.disney.wdpro.midichlorian.ProxyFactory.ExecutionThreadEnforcer
    public void enforceUI(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("UIEvent " + str + " accessed from non-main thread " + Looper.myLooper());
    }
}