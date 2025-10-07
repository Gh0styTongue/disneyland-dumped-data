package com.disney.wdpro.photopass_plus.activities;

import android.content.Intent;
import android.view.View;
import com.disney.wdpro.base_sales_ui_lib.TicketSalesConstants;
import com.disney.wdpro.photopass_plus.models.CapturedMediaInfo;
import com.disney.wdpro.photopass_plus.utils.StringProviderDLR;
import com.disney.wdpro.ticket_sales_base_lib.business.host_app.GuestGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductParameters;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductType;
import com.google.common.collect.ImmutableList;

/* loaded from: classes15.dex */
public class PhotoPassPlusActivityDLR extends PhotoPassPlusActivityWDW {
    @Override // com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityWDW, com.disney.wdpro.photopass_plus.utils.StringsProvider
    public int getCustomResId(int i10) {
        return StringProviderDLR.getCustomResId(i10);
    }

    @Override // com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityWDW, com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected GuestGroup getGuestGroup() {
        return GuestGroup.DLR;
    }

    @Override // com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityWDW, com.disney.wdpro.photopass_plus.fragments.PhotoPassPaywallFragment.PayWallActions
    public ImmutableList<TicketProductParameters> getTicketProducts() {
        TicketProductType ticketProductType = new TicketProductType(TicketProductType.ProductId.PHOTO_PASS_PLUS.getId());
        ImmutableList.C22583a c22583aBuilder = ImmutableList.builder();
        if (this.vendomatic.m38758h1()) {
            c22583aBuilder.mo69026a(getTicketForAllAges(1, ticketProductType));
        }
        CapturedMediaInfo capturedMediaInfo = this.mediaInfo;
        if (capturedMediaInfo != null && capturedMediaInfo.isPicture()) {
            c22583aBuilder.mo69026a(getTicketForAllAges(0, ticketProductType));
        }
        return c22583aBuilder.m69053m();
    }

    @Override // com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityWDW, com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 32435 && i11 == -1 && getExitNavigation() != null) {
            setConfirmationExitNavigationDataForLinkingFlow();
            this.navigator.m37372e(TicketSalesConstants.KEY_CONFIRMATION_EXIT_NAVIGATION_ENTRY);
        }
    }

    @Override // com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityWDW, com.disney.wdpro.photopass_plus.fragments.PhotoPassPaywallFragment.PayWallActions
    public void setLinkItToYourPhotosButtonVisibility(View view) {
        view.setVisibility(0);
    }

    @Override // com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityWDW, com.disney.wdpro.photopass_plus.abtesting.ExperienceActions
    public void trackOrderConfirmationAction(String str, String str2, String str3) {
    }

    @Override // com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityWDW, com.disney.wdpro.photopass_plus.abtesting.ExperienceActions
    public void trackOrderSummaryAction() {
    }

    @Override // com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityWDW, com.disney.wdpro.photopass_plus.abtesting.ExperienceActions
    public void trackPaywallAction() {
    }
}