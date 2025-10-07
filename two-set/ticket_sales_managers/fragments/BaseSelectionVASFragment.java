package com.disney.wdpro.ticket_sales_managers.fragments;

import android.os.Bundle;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment;
import com.disney.wdpro.base_sales_ui_lib.manager.TicketSalesFragmentDataEvent;
import com.disney.wdpro.base_sales_ui_lib.p069di.TicketSalesUIComponentProvider;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesFragmentDataRequestParameters;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductParameters;
import com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager;
import com.disney.wdpro.ticket_sales_managers.p451di.TicketSalesManagersProvider;
import com.google.common.base.Optional;
import com.squareup.otto.Subscribe;
import javax.inject.Inject;

/* loaded from: classes19.dex */
public abstract class BaseSelectionVASFragment extends BaseSelectionFragment {
    private static final String KEY_PRODUCT_SERVICE_RESPONSE = "key_product_service_response";
    protected TicketSalesFragmentDataManager fragmentDataManager;

    @Inject
    C9350r time;

    protected final void addTicketProductsIfPresent(TicketProductParameters ticketProductParameters) {
        if (this.residentOfferManager.isSpecialOfferSelected()) {
            for (Optional<SelectedTicketProducts> optional : this.fragmentDataManager.getAllSelectedTicketProducts(ticketProductParameters, getServiceResponse())) {
                if (optional.isPresent()) {
                    getAdapter().add(optional.get());
                }
            }
            return;
        }
        Optional<SelectedTicketProducts> selectedTicketProducts = this.fragmentDataManager.getSelectedTicketProducts(ticketProductParameters, getServiceResponse());
        this.residentOfferManager.useDefaultAgeGroups();
        if (selectedTicketProducts.isPresent()) {
            getAdapter().add(selectedTicketProducts.get());
        }
    }

    protected final TicketSalesFragmentDataManager getFragmentDataManager() {
        return this.fragmentDataManager;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected final void loadTicketSalesFragmentData(TicketSalesFragmentDataRequestParameters ticketSalesFragmentDataRequestParameters) {
        this.fragmentDataManager.noCache().loadTicketSalesFragmentData(ticketSalesFragmentDataRequestParameters);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((TicketSalesUIComponentProvider) getActivity().getApplication()).getTicketSalesUIComponent().inject(this);
        this.fragmentDataManager = ((TicketSalesManagersProvider) getActivity().getApplication()).getTicketSalesManagersComponent().getTicketSalesFragmentDataManager();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    @Subscribe
    public void onFragmentDataCompletedEvent(TicketSalesFragmentDataEvent ticketSalesFragmentDataEvent) {
        this.residentOfferManager.init(ticketSalesFragmentDataEvent.getOfferList());
        super.onFragmentDataCompletedEvent(ticketSalesFragmentDataEvent);
    }
}