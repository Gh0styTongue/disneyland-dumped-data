package com.disney.wdpro.photopass_plus.activities;

import com.disney.wdpro.analytics.InterfaceC8669a;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import java.util.Calendar;

/* renamed from: com.disney.wdpro.photopass_plus.activities.a */
/* loaded from: classes15.dex */
public final /* synthetic */ class C18787a implements InterfaceC8669a.a {

    /* renamed from: b */
    public final /* synthetic */ SelectedTicketProducts f41720b;

    /* renamed from: c */
    public final /* synthetic */ int f41721c;

    /* renamed from: d */
    public final /* synthetic */ Calendar f41722d;

    /* renamed from: e */
    public final /* synthetic */ C9350r f41723e;

    /* renamed from: f */
    public final /* synthetic */ String f41724f;

    public /* synthetic */ C18787a(SelectedTicketProducts selectedTicketProducts, int i10, Calendar calendar, C9350r c9350r, String str) {
        selectedTicketProducts = selectedTicketProducts;
        i10 = i10;
        calendar = calendar;
        c9350r = c9350r;
        str = str;
    }

    @Override // com.disney.wdpro.analytics.InterfaceC8669a.a
    public final void processResponse(String str) {
        this.f41719a.lambda$sendUnifiedCheckoutABTestingRequest$0(selectedTicketProducts, i10, calendar, c9350r, str, str);
    }
}