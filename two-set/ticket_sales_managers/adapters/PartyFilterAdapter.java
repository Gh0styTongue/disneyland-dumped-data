package com.disney.wdpro.ticket_sales_managers.adapters;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlement;
import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlementManager;
import com.disney.wdpro.ticket_sales_managers.models.PartyMember;
import com.disney.wdpro.ticket_sales_managers.models.PartyMembersSection;
import com.disney.wdpro.ticket_sales_managers.models.SectionViewType;
import com.disney.wdpro.ticket_sales_managers.models.ViewType;
import com.disney.wdpro.ticket_sales_managers.models.ViewTypeDelegateAdapter;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes19.dex */
public class PartyFilterAdapter extends RecyclerView.Adapter<RecyclerView.AbstractC4902e0> implements PartyMember.PartyMemberStatusChangedListener, SectionViewType.SectionUpdateListener<PartyMembersSection, PartyMember> {
    private static final int SECTION_MEMBER_WITH_HEADER_SIZE = 2;
    private static final boolean SHOULD_NOTIFY = true;
    private final PartyMembersSection allSetPartyMembersSection;
    private final SparseArray<ViewTypeDelegateAdapter> delegateAdapters;
    private final ArrayList<ViewType> items;
    private final PartyMembersSection selectedPartyMembersSection;
    private final PartyMembersSection unSelectedPartyMembersSection;

    /* renamed from: com.disney.wdpro.ticket_sales_managers.adapters.PartyFilterAdapter$1 */
    static /* synthetic */ class C211701 {

        /* renamed from: $SwitchMap$com$disney$wdpro$base_sales_ui_lib$maxpass$model$TicketUpgradeEntitlement$EntitlementState */
        static final /* synthetic */ int[] f44161xd6b0dec7;

        static {
            int[] iArr = new int[TicketUpgradeEntitlement.EntitlementState.values().length];
            f44161xd6b0dec7 = iArr;
            try {
                iArr[TicketUpgradeEntitlement.EntitlementState.HAS_UPGRADED_ENTITLEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44161xd6b0dec7[TicketUpgradeEntitlement.EntitlementState.CHOSEN_FOR_UPGRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44161xd6b0dec7[TicketUpgradeEntitlement.EntitlementState.NOT_CHOSEN_FOR_UPGRADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PartyFilterAdapter(Context context, TicketUpgradeEntitlementManager ticketUpgradeEntitlementManager) {
        SparseArray<ViewTypeDelegateAdapter> sparseArray = new SparseArray<>();
        this.delegateAdapters = sparseArray;
        this.items = Lists.m69268i();
        sparseArray.put(0, new PartyMemberDelegateAdapter());
        sparseArray.put(1, new PartyMembersSectionDelegateAdapter());
        ArrayList arrayListM69268i = Lists.m69268i();
        ArrayList arrayListM69268i2 = Lists.m69268i();
        ArrayList arrayListM69268i3 = Lists.m69268i();
        for (TicketUpgradeEntitlement ticketUpgradeEntitlement : ticketUpgradeEntitlementManager.getAllEntitlements()) {
            PartyMember partyMember = new PartyMember(ticketUpgradeEntitlement, this, ticketUpgradeEntitlementManager);
            int i10 = C211701.f44161xd6b0dec7[ticketUpgradeEntitlement.getEntitlementState().ordinal()];
            if (i10 == 1) {
                arrayListM69268i3.add(partyMember);
            } else if (i10 == 2) {
                arrayListM69268i.add(partyMember);
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Entitlement is in unknown state.");
                }
                arrayListM69268i2.add(partyMember);
            }
        }
        this.selectedPartyMembersSection = new PartyMembersSection(context, SectionViewType.SectionType.SELECTED_PARTY_MEMBERS, this, arrayListM69268i);
        this.unSelectedPartyMembersSection = new PartyMembersSection(context, SectionViewType.SectionType.UNSELECTED_MEMBERS, this, arrayListM69268i2);
        this.allSetPartyMembersSection = new PartyMembersSection(context, SectionViewType.SectionType.ALL_SET_MEMBERS, this, arrayListM69268i3);
        updateList();
    }

    private void updateList() {
        this.items.clear();
        if (!this.selectedPartyMembersSection.isEmpty()) {
            this.items.add(this.selectedPartyMembersSection);
            this.items.addAll(this.selectedPartyMembersSection.getSectionItemViews());
        }
        if (!this.unSelectedPartyMembersSection.isEmpty()) {
            this.items.add(this.unSelectedPartyMembersSection);
            this.items.addAll(this.unSelectedPartyMembersSection.getSectionItemViews());
        }
        if (this.allSetPartyMembersSection.isEmpty()) {
            return;
        }
        this.items.add(this.allSetPartyMembersSection);
        this.items.addAll(this.allSetPartyMembersSection.getSectionItemViews());
    }

    public void chooseAllPartyMembers(boolean z10) {
        Iterator it = new ArrayList((z10 ? this.unSelectedPartyMembersSection : this.selectedPartyMembersSection).getSectionItemViews()).iterator();
        while (it.hasNext()) {
            ((PartyMember) it.next()).changeStatus(z10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return this.items.get(i10).getViewType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, int i10) {
        this.delegateAdapters.get(this.items.get(i10).getViewType()).onBindViewHolder(abstractC4902e0, this.items.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC4902e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return this.delegateAdapters.get(i10).onCreateViewHolder(viewGroup);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.PartyMember.PartyMemberStatusChangedListener
    public void onPartyMemberStatusChanged(PartyMember partyMember) {
        if (partyMember.getEntitlement().getEntitlementState() == TicketUpgradeEntitlement.EntitlementState.CHOSEN_FOR_UPGRADE) {
            this.unSelectedPartyMembersSection.removeSectionItem(partyMember, true);
            this.selectedPartyMembersSection.addSectionItem(partyMember, true);
        } else {
            this.selectedPartyMembersSection.removeSectionItem(partyMember, true);
            this.unSelectedPartyMembersSection.addSectionItem(partyMember, true);
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.SectionViewType.SectionUpdateListener
    public void onSectionItemInserted(PartyMembersSection partyMembersSection, PartyMember partyMember, boolean z10) {
        updateList();
        if (z10) {
            notifyItemRangeInserted(this.items.indexOf(partyMembersSection), 2);
        } else {
            notifyItemInserted(this.items.indexOf(partyMember));
            notifyItemChanged(this.items.indexOf(partyMembersSection));
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.SectionViewType.SectionUpdateListener
    public void onSectionItemRemoved(PartyMembersSection partyMembersSection, PartyMember partyMember, boolean z10) {
        if (z10) {
            notifyItemRangeRemoved(this.items.indexOf(partyMembersSection), 2);
        } else {
            notifyItemRemoved(this.items.indexOf(partyMember));
            notifyItemChanged(this.items.indexOf(partyMembersSection));
        }
        updateList();
    }
}