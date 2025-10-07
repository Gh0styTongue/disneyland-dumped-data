package com.disney.wdpro.ticket_sales_managers.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.ticket_sales_managers.C21167R;
import com.disney.wdpro.ticket_sales_managers.models.PartyMembersSection;
import com.disney.wdpro.ticket_sales_managers.models.ViewTypeDelegateAdapter;

/* loaded from: classes19.dex */
public class PartyMembersSectionDelegateAdapter implements ViewTypeDelegateAdapter<PartyMembersSectionViewHolder, PartyMembersSection> {

    public final class PartyMembersSectionViewHolder extends RecyclerView.AbstractC4902e0 {
        private Context context;
        private TextView count;
        private TextView title;

        private PartyMembersSectionViewHolder(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(C21167R.layout.ticket_sales_party_members_section_list_item, viewGroup, false));
            this.context = viewGroup.getContext();
            this.title = (TextView) this.itemView.findViewById(C21167R.id.section_title);
            this.count = (TextView) this.itemView.findViewById(C21167R.id.section_item_count);
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.ViewTypeDelegateAdapter
    public void onBindViewHolder(PartyMembersSectionViewHolder partyMembersSectionViewHolder, PartyMembersSection partyMembersSection) throws Resources.NotFoundException {
        partyMembersSectionViewHolder.title.setText(partyMembersSection.getSectionHeaderText());
        partyMembersSectionViewHolder.itemView.setContentDescription(partyMembersSectionViewHolder.context.getResources().getString(C21167R.string.ticket_sales_party_filter_section_header_content_description, partyMembersSection.getSectionHeaderText(), Integer.valueOf(partyMembersSection.getSectionItemCount())));
        partyMembersSectionViewHolder.count.setText(partyMembersSectionViewHolder.context.getResources().getString(C21167R.string.ticket_sales_party_filter_section_header, Integer.valueOf(partyMembersSection.getSectionItemCount())));
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.ViewTypeDelegateAdapter
    public PartyMembersSectionViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        return new PartyMembersSectionViewHolder(viewGroup);
    }
}