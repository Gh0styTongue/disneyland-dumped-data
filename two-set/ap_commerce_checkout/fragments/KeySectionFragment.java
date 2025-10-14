package com.disney.wdpro.ap_commerce_checkout.fragments;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.ap_commerce_checkout.factory.contract.CellFactory;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract.Contract;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes23.dex */
public class KeySectionFragment extends SalesLegalCopyBaseFragment {
    private static final String BODY_CONTENT = "BODY_CONTENT";
    private static final String TITLE_FRAGMENT = "TITLE_FRAGMENT";
    private Contract contractContent;
    private LinearLayout contractHolder;
    private String title;

    public static KeySectionFragment newInstance(String str, Contract contract) {
        KeySectionFragment keySectionFragment = new KeySectionFragment();
        Bundle bundle = new Bundle();
        bundle.putString(TITLE_FRAGMENT, str);
        bundle.putSerializable(BODY_CONTENT, contract);
        keySectionFragment.setArguments(bundle);
        return keySectionFragment;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return null;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return this.title;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (bundle != null) {
            this.title = bundle.getString(TITLE_FRAGMENT);
            this.contractContent = (Contract) bundle.getSerializable(BODY_CONTENT);
        } else if (arguments != null) {
            this.title = arguments.getString(TITLE_FRAGMENT);
            this.contractContent = (Contract) arguments.getSerializable(BODY_CONTENT);
        }
        if (this.title == null || this.contractContent == null) {
            String simpleName = KeySectionFragment.class.getSimpleName();
            throw new IllegalArgumentException(simpleName + " launched without arguments. Please use " + simpleName + ".newInstance() method.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C8689R.layout.ap_commerce_fragment_key_section, viewGroup, false);
        this.contractHolder = (LinearLayout) viewInflate.findViewById(C8689R.id.key_section_holder);
        List listAsList = Arrays.asList(this.contractContent.getAttributes().getDetailCellsKey());
        for (int i10 = 0; i10 < listAsList.size(); i10++) {
            Contract contract = (Contract) listAsList.get(i10);
            LinearLayout linearLayout = new LinearLayout(getActivity());
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            if (contract.getAttributes().getBorderStyleKey() != null) {
                int thicknessKey = contract.getAttributes().getBorderStyleKey().getThicknessKey();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setStroke(thicknessKey, getActivity().getResources().getColor(C8689R.color.black));
                linearLayout.setBackground(gradientDrawable);
                int dimension = (int) getContext().getResources().getDimension(C8689R.dimen.ap_commerce_checkout_contract_break_padding);
                int dimension2 = (int) getContext().getResources().getDimension(C8689R.dimen.ap_commerce_checkout_contract_padding);
                if (thicknessKey == 0) {
                    linearLayout.setPadding(0, dimension, 0, dimension);
                } else {
                    linearLayout.setPadding(dimension2, dimension, dimension2, dimension);
                }
            }
            new CellFactory().getCell(contract.getCellType()).create(this, contract, linearLayout);
            this.contractHolder.addView(linearLayout);
        }
        return viewInflate;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(TITLE_FRAGMENT, this.title);
        bundle.putSerializable(BODY_CONTENT, this.contractContent);
    }
}