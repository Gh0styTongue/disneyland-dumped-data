package com.disney.wdpro.general_ticket_sales_ui.p132ui.utils;

import android.content.Context;
import com.disney.wdpro.commons.InterfaceC9309f;
import com.disney.wdpro.commons.InterfaceC9310g;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.monitor.C9332g;
import com.google.common.base.C22466q;
import java.util.Locale;
import java.util.MissingResourceException;

/* loaded from: classes28.dex */
public class TicketSalesAvailability implements InterfaceC9309f {
    private Context context;
    private Locale originalDeviceLocale;
    private InterfaceC9310g ticketSalesGeolocationConfiguration;
    private C9248i vendomatic;

    public TicketSalesAvailability(Context context, InterfaceC9310g interfaceC9310g, Locale locale, C9248i c9248i) {
        this.context = context;
        this.ticketSalesGeolocationConfiguration = interfaceC9310g;
        this.originalDeviceLocale = locale;
        this.vendomatic = c9248i;
    }

    private boolean isCurrentLocationAllowed() {
        String strM38995b = C9332g.m38995b(this.context);
        if (!C22466q.m68722b(strM38995b)) {
            return this.ticketSalesGeolocationConfiguration.isTicketSalesAllowedInCountryCode(strM38995b);
        }
        try {
            return this.ticketSalesGeolocationConfiguration.isTicketSalesAllowedInCountryCode(this.originalDeviceLocale.getCountry());
        } catch (MissingResourceException unused) {
            return false;
        }
    }

    @Override // com.disney.wdpro.commons.InterfaceC9309f
    public String getCountryCode() {
        String strM38995b = C9332g.m38995b(this.context);
        return C22466q.m68722b(strM38995b) ? this.originalDeviceLocale.getCountry() : strM38995b;
    }

    @Override // com.disney.wdpro.commons.InterfaceC9309f
    public boolean isAPCommerceAvailable() {
        return isCurrentLocationAllowed() && this.vendomatic.m38809z();
    }

    public boolean isBuyAnnualPassesAvailable() {
        return isAPCommerceAvailable() && this.vendomatic.m38687H();
    }

    @Override // com.disney.wdpro.commons.InterfaceC9309f
    public boolean isTicketSalesAvailable() {
        return isCurrentLocationAllowed();
    }
}