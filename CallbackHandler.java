package com.wdpr.p479ee.p480ra.rahybrid;

import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;

/* loaded from: classes21.dex */
public abstract class CallbackHandler<T> implements ICallbackHandler<T> {
    @Override // com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
    public void onError(String str, Throwable th2) {
        RAHybridLog.m85713e(str, "CallbackHandler Error", th2);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
    public void onMessage(String str, T t10) {
    }
}