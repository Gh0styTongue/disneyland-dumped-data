package com.disney.wdpro.ticket_sales_base_lib;

import com.disney.wdpro.httpclient.C13352x;
import com.disney.wdpro.midichlorian.ExceptionAwareEvent;
import com.google.common.base.C22462m;

/* loaded from: classes18.dex */
public abstract class ResponseEvent<T> implements ExceptionAwareEvent {
    private T payload;
    private boolean success;
    private Throwable throwable;

    public T getPayload() {
        return this.payload;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public boolean isSuccess() {
        return this.success;
    }

    @Override // com.disney.wdpro.midichlorian.ExceptionAwareEvent
    public void setException(Throwable th2) {
        C22462m.m68685q(th2, "The exception cannot be null on a fail event.");
        this.success = false;
        this.throwable = th2;
    }

    public void setResult(boolean z10) {
        this.success = z10;
    }

    public void setResult(C13352x<T> c13352x) {
        C22462m.m68685q(c13352x, "The response cannot be null on a success event.");
        this.payload = c13352x.m55683c();
        this.success = true;
    }

    public void setResult(T t10) {
        C22462m.m68685q(t10, "The payload cannot be null on a success event.");
        this.payload = t10;
        this.success = true;
    }
}