package com.disney.wdpro.general_ticket_sales_ui.activities;

import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlement;
import com.google.common.base.InterfaceC22463n;

/* renamed from: com.disney.wdpro.general_ticket_sales_ui.activities.b */
/* loaded from: classes28.dex */
public final /* synthetic */ class C11974b implements InterfaceC22463n {

    /* renamed from: a */
    public final /* synthetic */ String f32767a;

    public /* synthetic */ C11974b(String str) {
        str = str;
    }

    @Override // com.google.common.base.InterfaceC22463n
    public final boolean apply(Object obj) {
        return str.equals(((TicketUpgradeEntitlement) obj).getEntitlementId());
    }
}