package com.disney.wdpro.ticket_sales_managers.models;

import android.content.Context;
import com.disney.wdpro.ticket_sales_managers.models.SectionViewType;
import com.google.common.base.C22462m;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes19.dex */
public class PartyMembersSection implements SectionViewType<PartyMember> {
    private final SectionViewType.SectionUpdateListener adapter;
    private final Context context;
    private final TreeSet<PartyMember> items;
    private final SectionViewType.SectionType sectionType;

    public PartyMembersSection(Context context, SectionViewType.SectionType sectionType, SectionViewType.SectionUpdateListener sectionUpdateListener, List<PartyMember> list) {
        this.context = (Context) C22462m.m68685q(context, "Context cannot be null");
        this.sectionType = (SectionViewType.SectionType) C22462m.m68685q(sectionType, "Section type cannot be null");
        this.adapter = (SectionViewType.SectionUpdateListener) C22462m.m68685q(sectionUpdateListener, "Listener cannot be null");
        TreeSet<PartyMember> treeSetM69468o = Sets.m69468o();
        this.items = treeSetM69468o;
        treeSetM69468o.addAll(list);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.SectionViewType
    public CharSequence getSectionHeaderText() {
        return this.context.getResources().getString(this.sectionType.getSectionHeaderTextResource());
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.SectionViewType
    public int getSectionItemCount() {
        return this.items.size();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.SectionViewType
    public TreeSet<PartyMember> getSectionItemViews() {
        return this.items;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.SectionViewType
    public SectionViewType.SectionType getSectionType() {
        return this.sectionType;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.ViewType
    public int getViewType() {
        return 1;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.SectionViewType
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.SectionViewType
    public void addSectionItem(PartyMember partyMember, boolean z10) {
        if (this.items.add(partyMember) && z10) {
            this.adapter.onSectionItemInserted(this, partyMember, this.items.size() == 1);
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.SectionViewType
    public void removeSectionItem(PartyMember partyMember, boolean z10) {
        if (this.items.remove(partyMember) && z10) {
            this.adapter.onSectionItemRemoved(this, partyMember, this.items.isEmpty());
        }
    }
}