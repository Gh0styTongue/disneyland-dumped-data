package com.disney.wdpro.photopass_plus.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.disney.wdpro.base_sales_ui_lib.TicketSalesConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseSalesDownFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment;
import com.disney.wdpro.photopass_plus.C18785R;
import com.disney.wdpro.photopass_plus.utils.StringsProvider;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;

/* loaded from: classes15.dex */
public class PhotoPassDownFragment extends BaseSalesDownFragment {
    private StringsProvider stringsProvider;

    public static final PhotoPassDownFragment newInstance(SalesBaseFragment.DownScreenReasons downScreenReasons, WebStoreId webStoreId, ProductCategoryDetails productCategoryDetails) {
        PhotoPassDownFragment photoPassDownFragment = new PhotoPassDownFragment();
        Bundle bundle = new Bundle();
        bundle.putString("DOWN_SCREEN_REASONS_KEY", downScreenReasons.name());
        bundle.putSerializable(TicketSalesConstants.KEY_ARG_PRODUCT_CATEGORY_DETAILS, productCategoryDetails);
        bundle.putSerializable(TicketSalesConstants.KEY_ARG_WEB_STORE_ID, webStoreId);
        photoPassDownFragment.setArguments(bundle);
        return photoPassDownFragment;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSalesDownFragment
    protected void displayDownUI() {
        this.goToUrlButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.photopass_plus.fragments.PhotoPassDownFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((BaseSalesDownFragment) PhotoPassDownFragment.this).actionListener.goToBrowser(Uri.parse(((BaseSalesDownFragment) PhotoPassDownFragment.this).actionListener.getMobileWebTicketsUrl()));
                PhotoPassDownFragment.this.sendButtonAnalyticsAction(TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_BUY_WEB);
            }
        });
        this.downMessage.setText(getString(this.stringsProvider.getCustomResId(C18785R.string.photo_pass_plus_down_message)));
        this.buttonText.setText(getString(this.stringsProvider.getCustomResId(C18785R.string.photo_pass_plus_down_buy_tickets), getString(((BaseSalesDownFragment) this).actionListener.getButtonTextResourceIdForMobileWebUrl())));
        this.analyticsPageName = TicketSalesAnalyticsConstants.PHOTO_PASS_STATE_NONPURCHASE_APP;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSalesDownFragment
    protected void displayUpgradeUI() {
        this.goToUrlButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.photopass_plus.fragments.PhotoPassDownFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((BaseSalesDownFragment) PhotoPassDownFragment.this).actionListener.goToMarket();
                PhotoPassDownFragment.this.sendButtonAnalyticsAction(TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_UPDATE_APP);
            }
        });
        this.downMessage.setText(this.stringsProvider.getCustomResId(C18785R.string.photo_pass_plus_down_upgrade_message));
        this.buttonText.setText(getString(C18785R.string.ticket_sales_down_update_my_app));
        this.buyTicketsMessage.setText(getString(C18785R.string.photo_pass_plus_down_buy_tickets, getString(((BaseSalesDownFragment) this).actionListener.getButtonTextResourceIdForMobileWebUrl())));
        this.buyTicketsMessage.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.photopass_plus.fragments.PhotoPassDownFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((BaseSalesDownFragment) PhotoPassDownFragment.this).actionListener.goToBrowser(Uri.parse(((BaseSalesDownFragment) PhotoPassDownFragment.this).actionListener.getMobileWebTicketsUrl()));
                PhotoPassDownFragment.this.sendButtonAnalyticsAction(TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_BUY_WEB);
            }
        });
        this.buyTicketsMessage.setVisibility(0);
        this.analyticsPageName = TicketSalesAnalyticsConstants.PHOTO_PASS_STATE_UPGRADE_APP;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment
    public String getAnalyticsPageName() {
        return this.analyticsPageName;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return getText(this.stringsProvider.getCustomResId(C18785R.string.photo_pass_plus_down_title));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSalesDownFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.stringsProvider = (StringsProvider) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement StringsProvider");
        }
    }
}