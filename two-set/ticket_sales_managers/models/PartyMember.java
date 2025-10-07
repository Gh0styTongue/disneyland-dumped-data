package com.disney.wdpro.ticket_sales_managers.models;

import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlement;
import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlementManager;
import com.google.common.base.C22462m;

/* loaded from: classes19.dex */
public class PartyMember implements ViewType, Comparable<PartyMember> {
    private final TicketUpgradeEntitlement entitlement;
    private final TicketUpgradeEntitlementManager entitlementManager;
    private final PartyMemberStatusChangedListener partyMemberStatusChangeListener;

    public interface PartyMemberStatusChangedListener {
        void onPartyMemberStatusChanged(PartyMember partyMember);
    }

    public PartyMember(TicketUpgradeEntitlement ticketUpgradeEntitlement, PartyMemberStatusChangedListener partyMemberStatusChangedListener, TicketUpgradeEntitlementManager ticketUpgradeEntitlementManager) {
        this.entitlement = (TicketUpgradeEntitlement) C22462m.m68685q(ticketUpgradeEntitlement, "Entitlement cannot be null.");
        this.partyMemberStatusChangeListener = (PartyMemberStatusChangedListener) C22462m.m68685q(partyMemberStatusChangedListener, "Change listener cannot be null.");
        this.entitlementManager = (TicketUpgradeEntitlementManager) C22462m.m68685q(ticketUpgradeEntitlementManager, "Entitlement manager cannot be null.");
    }

    public void changeStatus(boolean z10) {
        this.entitlementManager.updateEntitlementState(this.entitlement, z10 ? TicketUpgradeEntitlement.EntitlementState.CHOSEN_FOR_UPGRADE : TicketUpgradeEntitlement.EntitlementState.NOT_CHOSEN_FOR_UPGRADE);
        this.partyMemberStatusChangeListener.onPartyMemberStatusChanged(this);
    }

    public TicketUpgradeEntitlement getEntitlement() {
        return this.entitlement;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.ViewType
    public int getViewType() {
        return 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(PartyMember partyMember) {
        return this.entitlement.compareTo(partyMember.getEntitlement());
    }
}