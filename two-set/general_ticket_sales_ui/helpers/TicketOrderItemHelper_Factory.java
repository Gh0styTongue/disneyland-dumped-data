package com.disney.wdpro.general_ticket_sales_ui.helpers;

import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class TicketOrderItemHelper_Factory implements InterfaceC30583e<TicketOrderItemHelper> {

    private static final class InstanceHolder {
        private static final TicketOrderItemHelper_Factory INSTANCE = new TicketOrderItemHelper_Factory();

        private InstanceHolder() {
        }
    }

    public static TicketOrderItemHelper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TicketOrderItemHelper newInstance() {
        return new TicketOrderItemHelper();
    }

    @Override // javax.inject.Provider
    public TicketOrderItemHelper get() {
        return newInstance();
    }
}