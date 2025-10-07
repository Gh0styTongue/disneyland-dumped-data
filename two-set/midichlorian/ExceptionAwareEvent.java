package com.disney.wdpro.midichlorian;

import com.google.common.base.C22462m;

/* loaded from: classes2.dex */
public interface ExceptionAwareEvent {

    public static final class DefaultExceptionAwareEvent implements ExceptionAwareEvent {
        private Throwable exception;

        DefaultExceptionAwareEvent(Throwable th2) {
            this.exception = th2;
        }

        public Throwable getException() {
            return this.exception;
        }

        @Override // com.disney.wdpro.midichlorian.ExceptionAwareEvent
        public void setException(Throwable th2) {
            throw new UnsupportedOperationException("setException is not supported on DefaultExceptionAwareEvent.");
        }
    }

    public static final class Factory {
        private Factory() {
        }

        public static ExceptionAwareEvent createExceptionEvent(Class<?> cls) {
            C22462m.m68685q(cls, "the type cannot be null");
            try {
                return (ExceptionAwareEvent) cls.newInstance();
            } catch (Exception e10) {
                cls.getName();
                return new DefaultExceptionAwareEvent(e10);
            }
        }
    }

    void setException(Throwable th2);
}