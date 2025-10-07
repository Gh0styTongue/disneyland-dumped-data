package com.disney.wdpro.ticket_sales_managers;

import android.content.Context;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes19.dex */
public final class BookingApiSessionStore_Factory implements InterfaceC30583e<BookingApiSessionStore> {
    private final Provider<Context> appContextProvider;

    public BookingApiSessionStore_Factory(Provider<Context> provider) {
        this.appContextProvider = provider;
    }

    public static BookingApiSessionStore_Factory create(Provider<Context> provider) {
        return new BookingApiSessionStore_Factory(provider);
    }

    public static BookingApiSessionStore newInstance(Context context) {
        return new BookingApiSessionStore(context);
    }

    @Override // javax.inject.Provider
    public BookingApiSessionStore get() {
        return newInstance(this.appContextProvider.get());
    }
}