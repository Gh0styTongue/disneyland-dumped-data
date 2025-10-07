package com.disney.wdpro.photopass_plus.fragments;

import android.content.Context;
import android.view.View;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketOptionListAdapter;
import com.disney.wdpro.base_sales_ui_lib.p070ui.providers.TicketSalesLayoutProvider;
import com.disney.wdpro.base_sales_ui_lib.product.manager.TicketSalesConfigManager;
import com.disney.wdpro.photopass_plus.C18785R;
import com.disney.wdpro.photopass_plus.accessibility.PhotoPassTicketOptionAccessibilityHelperImpl;
import com.disney.wdpro.photopass_plus.models.CapturedMediaInfo;
import com.disney.wdpro.photopass_plus.p400ui.providers.PhotoPassPlusLayoutProvider;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;

/* loaded from: classes15.dex */
public class PhotoPassTicketOptionListAdapter extends TicketOptionListAdapter {
    private PhotoPassTicketBrickUiHelper photoPassTicketBrickUiHelper;

    public PhotoPassTicketOptionListAdapter(Context context, int i10, TicketSalesConfigManager ticketSalesConfigManager, TicketOptionListAdapter.CheckoutButtonListener checkoutButtonListener, PhotoPassTicketBrickUiHelper photoPassTicketBrickUiHelper) {
        super(context, i10, ticketSalesConfigManager, checkoutButtonListener, photoPassTicketBrickUiHelper, new PhotoPassTicketOptionAccessibilityHelperImpl());
        this.photoPassTicketBrickUiHelper = photoPassTicketBrickUiHelper;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketOptionListAdapter
    protected View getCheckoutView(View view) {
        return view.findViewById(C18785R.id.photo_pass_plus_buy_button_back);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketOptionListAdapter
    protected TicketSalesLayoutProvider getLayoutProvider(WebStoreId webStoreId) {
        return new PhotoPassPlusLayoutProvider(webStoreId);
    }

    public PhotoPassTicketOptionListAdapter withCaptureMediaInfo(CapturedMediaInfo capturedMediaInfo) {
        this.photoPassTicketBrickUiHelper.withCaptureMediaInfo(capturedMediaInfo);
        return this;
    }
}