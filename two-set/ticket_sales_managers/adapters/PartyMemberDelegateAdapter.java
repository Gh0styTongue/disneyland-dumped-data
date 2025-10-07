package com.disney.wdpro.ticket_sales_managers.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.base_sales_ui_lib.EntitlementType;
import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlement;
import com.disney.wdpro.ticket_sales_managers.C21167R;
import com.disney.wdpro.ticket_sales_managers.models.PartyMember;
import com.disney.wdpro.ticket_sales_managers.models.ViewTypeDelegateAdapter;

/* loaded from: classes19.dex */
public class PartyMemberDelegateAdapter implements ViewTypeDelegateAdapter<PartyMemberViewHolder, PartyMember> {
    private Drawable annualPassIcon;
    private Drawable themeParkIcon;

    public final class PartyMemberViewHolder extends RecyclerView.AbstractC4902e0 {
        private CheckBox chooseToBuy;
        private View.OnClickListener clickListener;
        private final Context context;
        private ImageView entitlementType;
        private PartyMember partyMember;
        private TextView partyMemberName;

        private PartyMemberViewHolder(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(C21167R.layout.ticket_sales_party_member_list_item, viewGroup, false));
            this.context = viewGroup.getContext();
            this.partyMemberName = (TextView) this.itemView.findViewById(C21167R.id.entitlement_lable);
            this.entitlementType = (ImageView) this.itemView.findViewById(C21167R.id.entitlement_type);
            this.chooseToBuy = (CheckBox) this.itemView.findViewById(C21167R.id.check_shouldbuy);
            this.clickListener = new View.OnClickListener() { // from class: com.disney.wdpro.ticket_sales_managers.adapters.PartyMemberDelegateAdapter.PartyMemberViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    PartyMemberViewHolder.this.itemView.setOnClickListener(null);
                    PartyMemberViewHolder.this.partyMember.changeStatus(!PartyMemberViewHolder.this.chooseToBuy.isChecked());
                }
            };
        }
    }

    private String getPartyMemberAllSetContentDescription(PartyMemberViewHolder partyMemberViewHolder, PartyMember partyMember) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(partyMember.getEntitlement().getEntitlementType() == EntitlementType.ANNUAL_PASS ? partyMemberViewHolder.context.getString(C21167R.string.ticket_sales_accessibility_pass_holder) : partyMemberViewHolder.context.getString(C21167R.string.ticket_sales_accessibility_ticket_holder));
        sb2.append(partyMemberViewHolder.context.getString(C21167R.string.ticket_sales_comma));
        sb2.append(partyMember.getEntitlement().getTicketAssignmentLabel());
        return sb2.toString();
    }

    private String getPartyMemberSelectableContentDescription(PartyMemberViewHolder partyMemberViewHolder, PartyMember partyMember) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(partyMemberViewHolder.chooseToBuy.isChecked() ? partyMemberViewHolder.context.getString(C21167R.string.accessibility_checkbox_checked) : partyMemberViewHolder.context.getString(C21167R.string.accessibility_checkbox_not_checked));
        sb2.append(partyMemberViewHolder.context.getString(C21167R.string.ticket_sales_comma));
        sb2.append(partyMember.getEntitlement().getEntitlementType() == EntitlementType.ANNUAL_PASS ? partyMemberViewHolder.context.getString(C21167R.string.ticket_sales_accessibility_pass_holder) : partyMemberViewHolder.context.getString(C21167R.string.ticket_sales_accessibility_ticket_holder));
        sb2.append(partyMemberViewHolder.context.getString(C21167R.string.ticket_sales_comma));
        sb2.append(partyMember.getEntitlement().getTicketAssignmentLabel());
        sb2.append(partyMemberViewHolder.context.getString(C21167R.string.ticket_sales_comma));
        sb2.append(partyMemberViewHolder.context.getString(C21167R.string.accessibility_checkbox));
        return sb2.toString();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.ViewTypeDelegateAdapter
    public void onBindViewHolder(PartyMemberViewHolder partyMemberViewHolder, PartyMember partyMember) {
        partyMemberViewHolder.partyMember = partyMember;
        partyMemberViewHolder.partyMemberName.setText(partyMember.getEntitlement().getTicketAssignmentLabel());
        partyMemberViewHolder.entitlementType.setImageDrawable(partyMember.getEntitlement().getEntitlementType() == EntitlementType.ANNUAL_PASS ? this.annualPassIcon : this.themeParkIcon);
        if (partyMember.getEntitlement().hasMaxPassEntitlement()) {
            partyMemberViewHolder.chooseToBuy.setVisibility(8);
            partyMemberViewHolder.itemView.setContentDescription(getPartyMemberAllSetContentDescription(partyMemberViewHolder, partyMember));
        } else {
            partyMemberViewHolder.itemView.setOnClickListener(partyMemberViewHolder.clickListener);
            partyMemberViewHolder.chooseToBuy.setVisibility(0);
            partyMemberViewHolder.chooseToBuy.setChecked(partyMember.getEntitlement().getEntitlementState() == TicketUpgradeEntitlement.EntitlementState.CHOSEN_FOR_UPGRADE);
            partyMemberViewHolder.itemView.setContentDescription(getPartyMemberSelectableContentDescription(partyMemberViewHolder, partyMember));
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.models.ViewTypeDelegateAdapter
    public PartyMemberViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.annualPassIcon = context.getResources().getDrawable(C21167R.drawable.ts_dlr_annual_pass_icon, context.getTheme());
        this.themeParkIcon = context.getResources().getDrawable(C21167R.drawable.icon_ticket_dark, context.getTheme());
        return new PartyMemberViewHolder(viewGroup);
    }
}