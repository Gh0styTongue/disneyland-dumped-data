package com.disney.wdpro.ticket_sales_managers.models;

import com.disney.wdpro.ticket_sales_managers.C21167R;
import com.disney.wdpro.ticket_sales_managers.models.ViewType;
import java.util.TreeSet;

/* loaded from: classes19.dex */
public interface SectionViewType<T extends ViewType> extends ViewType {

    public enum SectionType {
        SELECTED_PARTY_MEMBERS(C21167R.string.ticket_sales_party_member_buy_for),
        UNSELECTED_MEMBERS(C21167R.string.ticket_sales_party_member_do_not_buy_for),
        ALL_SET_MEMBERS(C21167R.string.ticket_sales_party_member_has_entitlement);

        private final int sectionHeaderTextResource;

        SectionType(int i10) {
            this.sectionHeaderTextResource = i10;
        }

        public int getSectionHeaderTextResource() {
            return this.sectionHeaderTextResource;
        }
    }

    public interface SectionUpdateListener<S extends SectionViewType, T extends ViewType> {
        void onSectionItemInserted(S s10, T t10, boolean z10);

        void onSectionItemRemoved(S s10, T t10, boolean z10);
    }

    void addSectionItem(T t10, boolean z10);

    CharSequence getSectionHeaderText();

    int getSectionItemCount();

    TreeSet<T> getSectionItemViews();

    SectionType getSectionType();

    boolean isEmpty();

    void removeSectionItem(T t10, boolean z10);
}