package com.disney.wdpro.ticket_sales_managers;

import mx.InterfaceC30583e;

/* loaded from: classes19.dex */
public final class ResidentOffersDataFactory_Factory implements InterfaceC30583e<ResidentOffersDataFactory> {

    private static final class InstanceHolder {
        private static final ResidentOffersDataFactory_Factory INSTANCE = new ResidentOffersDataFactory_Factory();

        private InstanceHolder() {
        }
    }

    public static ResidentOffersDataFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ResidentOffersDataFactory newInstance() {
        return new ResidentOffersDataFactory();
    }

    @Override // javax.inject.Provider
    public ResidentOffersDataFactory get() {
        return newInstance();
    }
}