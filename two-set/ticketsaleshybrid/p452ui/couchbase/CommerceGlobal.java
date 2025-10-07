package com.disney.wdpro.ticketsaleshybrid.p452ui.couchbase;

import com.disney.wdpro.dash.dao.C9460w;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CommerceGlobal;", "Ljava/io/Serializable;", "()V", C9460w.STRING_PROPERTY, "Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CommerceGlobal$Strings;", "getStrings", "()Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CommerceGlobal$Strings;", "Companion", "Dfm", "Strings", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final class CommerceGlobal implements Serializable {
    private static final long serialVersionUID = -1;
    private final Strings strings;

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CommerceGlobal$Dfm;", "Ljava/io/Serializable;", "()V", "ticketMods", "", "", "getTicketMods", "()Ljava/util/Map;", "ticketSales", "getTicketSales", "Companion", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Dfm implements Serializable {
        private static final long serialVersionUID = -1;
        private final Map<String, String> ticketMods;
        private final Map<String, String> ticketSales;

        public final Map<String, String> getTicketMods() {
            return this.ticketMods;
        }

        public final Map<String, String> getTicketSales() {
            return this.ticketSales;
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CommerceGlobal$Strings;", "Ljava/io/Serializable;", "()V", "dfm", "Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CommerceGlobal$Dfm;", "getDfm", "()Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CommerceGlobal$Dfm;", "Companion", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Strings implements Serializable {
        private static final long serialVersionUID = -1;
        private final Dfm dfm;

        public final Dfm getDfm() {
            return this.dfm;
        }
    }

    public final Strings getStrings() {
        return this.strings;
    }
}