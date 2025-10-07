package com.disney.wdpro.ticket_sales_managers.util;

import mx.InterfaceC30583e;

/* loaded from: classes19.dex */
public final class CommerceCheckoutMaxPassIntentProvider_Factory implements InterfaceC30583e<CommerceCheckoutMaxPassIntentProvider> {

    private static final class InstanceHolder {
        private static final CommerceCheckoutMaxPassIntentProvider_Factory INSTANCE = new CommerceCheckoutMaxPassIntentProvider_Factory();

        private InstanceHolder() {
        }
    }

    public static CommerceCheckoutMaxPassIntentProvider_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CommerceCheckoutMaxPassIntentProvider newInstance() {
        return new CommerceCheckoutMaxPassIntentProvider();
    }

    @Override // javax.inject.Provider
    public CommerceCheckoutMaxPassIntentProvider get() {
        return newInstance();
    }
}