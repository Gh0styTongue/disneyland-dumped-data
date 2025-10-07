package com.disney.wdpro.ticket_sales_managers.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.disney.wdpro.base_sales_ui_lib.fragments.CommonFragmentActions;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.ticket_sales_managers.C21167R;
import com.disney.wdpro.ticket_sales_managers.util.StringUtil;
import java.util.ArrayList;

/* loaded from: classes19.dex */
public class MaxPassLearnMoreFragment extends BaseFragment {
    private String createFormattedDetailsString() {
        int[] iArr = {C21167R.string.ticket_sales_learn_more_max_pass_header_item_1, C21167R.string.ticket_sales_learn_more_max_pass_header_item_2, C21167R.string.ticket_sales_learn_more_max_pass_header_item_3, C21167R.string.ticket_sales_learn_more_max_pass_header_item_4, C21167R.string.ticket_sales_learn_more_max_pass_header_item_5, C21167R.string.ticket_sales_learn_more_max_pass_header_item_6, C21167R.string.ticket_sales_learn_more_max_pass_header_item_7, C21167R.string.ticket_sales_learn_more_max_pass_header_item_8, C21167R.string.ticket_sales_learn_more_max_pass_header_item_9};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 9; i10++) {
            arrayList.add(getString(iArr[i10]));
        }
        return StringUtil.createList((String[]) arrayList.toArray(new String[0]), getString(C21167R.string.ticket_sales_newline), getString(C21167R.string.ticket_sales_double_tab), getString(C21167R.string.ticket_sales_bullet_symbol), getString(C21167R.string.ticket_sales_bullet_word));
    }

    @Override // com.disney.wdpro.commons.BaseFragment
    public String getAnalyticsPageName() {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C21167R.layout.ticket_sales_max_pass_learn_more, viewGroup, false);
        ((TextView) viewInflate.findViewById(C21167R.id.max_pass_bullet_details)).setText(createFormattedDetailsString());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CommonFragmentActions commonFragmentActions = (CommonFragmentActions) getActivity();
        if (commonFragmentActions != null) {
            commonFragmentActions.setTitle(getString(C21167R.string.ticket_sales_important_details_header_title), view);
        }
    }
}