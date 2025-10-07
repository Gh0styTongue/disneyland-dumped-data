package com.disney.wdpro.general_ticket_sales_ui.fragment;

import android.os.Bundle;
import android.view.View;
import com.disney.wdpro.base_sales_ui_lib.TicketSalesConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseSalesDownFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;

/* loaded from: classes28.dex */
public class MaxPassSalesDownFragment extends BaseSalesDownFragment {
    public static final MaxPassSalesDownFragment newInstance(SalesBaseFragment.DownScreenReasons downScreenReasons, WebStoreId webStoreId, ProductCategoryDetails productCategoryDetails) {
        MaxPassSalesDownFragment maxPassSalesDownFragment = new MaxPassSalesDownFragment();
        Bundle bundle = new Bundle();
        bundle.putString("DOWN_SCREEN_REASONS_KEY", downScreenReasons.name());
        bundle.putSerializable(TicketSalesConstants.KEY_ARG_PRODUCT_CATEGORY_DETAILS, productCategoryDetails);
        bundle.putSerializable(TicketSalesConstants.KEY_ARG_WEB_STORE_ID, webStoreId);
        maxPassSalesDownFragment.setArguments(bundle);
        return maxPassSalesDownFragment;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSalesDownFragment
    protected void displayDownUI() {
        this.goToUrlButton.setVisibility(8);
        this.downMessage.setText(getString(C11971R.string.ticket_sales_max_pass_down_message));
        this.buttonText.setVisibility(8);
        this.analyticsPageName = TicketSalesAnalyticsConstants.MAX_PASS_STATE_NONPURCHASE_APP;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSalesDownFragment
    protected void displayUpgradeUI() {
        this.goToUrlButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.MaxPassSalesDownFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((BaseSalesDownFragment) MaxPassSalesDownFragment.this).actionListener.goToMarket();
                MaxPassSalesDownFragment.this.sendButtonAnalyticsAction(TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_UPDATE_APP);
            }
        });
        this.downMessage.setText(getString(C11971R.string.ticket_sales_max_pass_down_upgrade_message));
        this.buttonText.setText(getString(C11971R.string.ticket_sales_max_pass_down_update_now));
        this.analyticsPageName = "commerce/digitalbundle/purchasebundle";
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment
    public String getAnalyticsPageName() {
        return this.analyticsPageName;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return getString(C11971R.string.ticket_sales_max_pass_down_screen_title);
    }
}