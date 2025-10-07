package com.disney.wdpro.general_ticket_sales_ui.activities;

import com.disney.wdpro.analytics.InterfaceC8669a;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import java.util.Calendar;

/* renamed from: com.disney.wdpro.general_ticket_sales_ui.activities.a */
/* loaded from: classes28.dex */
public final /* synthetic */ class C11973a implements InterfaceC8669a.a {

    /* renamed from: b */
    public final /* synthetic */ SelectedTicketProducts f32762b;

    /* renamed from: c */
    public final /* synthetic */ int f32763c;

    /* renamed from: d */
    public final /* synthetic */ Calendar f32764d;

    /* renamed from: e */
    public final /* synthetic */ C9350r f32765e;

    /* renamed from: f */
    public final /* synthetic */ String f32766f;

    public /* synthetic */ C11973a(SelectedTicketProducts selectedTicketProducts, int i10, Calendar calendar, C9350r c9350r, String str) {
        selectedTicketProducts = selectedTicketProducts;
        i10 = i10;
        calendar = calendar;
        c9350r = c9350r;
        str = str;
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8669a.a
    public final void processResponse(String str) {
        this.f32761a.lambda$sendUnifiedCheckoutABTestingRequest$0(selectedTicketProducts, i10, calendar, c9350r, str, str);
    }
}