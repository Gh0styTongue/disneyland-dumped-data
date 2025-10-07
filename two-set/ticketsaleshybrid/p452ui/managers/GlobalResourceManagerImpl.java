package com.disney.wdpro.ticketsaleshybrid.p452ui.managers;

import com.disney.wdpro.ticketsaleshybrid.p452ui.couchbase.CommerceGlobal;
import com.disney.wdpro.ticketsaleshybrid.p452ui.couchbase.CommerceGlobalRepository;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/managers/GlobalResourceManagerImpl;", "Lcom/disney/wdpro/ticketsaleshybrid/ui/managers/GlobalResourceManager;", "commerceGlobalRepository", "Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CommerceGlobalRepository;", "(Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CommerceGlobalRepository;)V", "getDfmTicketModsText", "", "key", "getDfmTicketSalesText", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final class GlobalResourceManagerImpl implements GlobalResourceManager {
    private final CommerceGlobalRepository commerceGlobalRepository;

    public GlobalResourceManagerImpl(CommerceGlobalRepository commerceGlobalRepository) {
        Intrinsics.checkNotNullParameter(commerceGlobalRepository, "commerceGlobalRepository");
        this.commerceGlobalRepository = commerceGlobalRepository;
    }

    @Override // com.disney.wdpro.ticketsaleshybrid.p452ui.managers.GlobalResourceManager
    public String getDfmTicketModsText(String key) {
        CommerceGlobal.Strings strings;
        CommerceGlobal.Dfm dfm;
        Map<String, String> ticketMods;
        String orDefault;
        Intrinsics.checkNotNullParameter(key, "key");
        CommerceGlobal commerceGlobal = (CommerceGlobal) CollectionsKt.firstOrNull((List) this.commerceGlobalRepository.getCommerceGlobal());
        return (commerceGlobal == null || (strings = commerceGlobal.getStrings()) == null || (dfm = strings.getDfm()) == null || (ticketMods = dfm.getTicketMods()) == null || (orDefault = ticketMods.getOrDefault(key, "")) == null) ? "" : orDefault;
    }

    @Override // com.disney.wdpro.ticketsaleshybrid.p452ui.managers.GlobalResourceManager
    public String getDfmTicketSalesText(String key) {
        CommerceGlobal.Strings strings;
        CommerceGlobal.Dfm dfm;
        Map<String, String> ticketSales;
        String orDefault;
        Intrinsics.checkNotNullParameter(key, "key");
        CommerceGlobal commerceGlobal = (CommerceGlobal) CollectionsKt.firstOrNull((List) this.commerceGlobalRepository.getCommerceGlobal());
        return (commerceGlobal == null || (strings = commerceGlobal.getStrings()) == null || (dfm = strings.getDfm()) == null || (ticketSales = dfm.getTicketSales()) == null || (orDefault = ticketSales.getOrDefault(key, "")) == null) ? "" : orDefault;
    }
}