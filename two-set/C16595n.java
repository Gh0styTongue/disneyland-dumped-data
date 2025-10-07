package com.disney.wdpro;

import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.aligator.NavigationEntry;

/* renamed from: com.disney.wdpro.n */
/* loaded from: classes23.dex */
public class C16595n {
    private NavigationEntry ticketAndPassesNavigationEntry;

    /* renamed from: com.disney.wdpro.n$a */
    class a implements InterfaceC13600m {
        a() {
        }

        @Override // com.disney.wdpro.InterfaceC13600m
        public NavigationEntry getTicketAndPassesNavigationEntry() {
            return C16595n.this.ticketAndPassesNavigationEntry;
        }
    }

    /* renamed from: b */
    public InterfaceC13600m m56462b() {
        return new a();
    }

    /* renamed from: c */
    public C16595n m56463c(C8666f c8666f) {
        this.ticketAndPassesNavigationEntry = c8666f;
        return this;
    }
}