package com.disney.wdpro.ap_commerce_checkout.fragments.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.disney.wdpro.analytics.C8677i;
import com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager;
import com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment;
import com.disney.wdpro.base_sales_ui_lib.utils.TicketSalesAnalyticsUtil;
import com.disney.wdpro.profile_ui.ProfileNavEntriesBuilderProvider;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.profile_ui.p420di.ProfileUIComponentProvider;
import com.disney.wdpro.profile_ui.p421ui.activities.ResidencyVerificationActivity;
import com.disney.wdpro.profile_ui.utils.ResidencyVerificationResponse;
import com.disney.wdpro.profile_ui.utils.ResidencyVerificationStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.squareup.otto.Subscribe;
import java.util.Map;

/* loaded from: classes23.dex */
public abstract class BaseResidencyValidationFragment extends APBaseOrderSummaryFragment {
    protected boolean mustCallCreateOrder;
    protected boolean mustCloseFlowFromWebView;
    protected ProfileNavEntriesBuilderProvider profileNavEntriesBuilderProvider;
    protected ProfileManager profileRemoteManager;
    protected ResidencyVerificationStatus residencyVerificationStatus;
    private String residentValidationEntryValue;

    /* renamed from: com.disney.wdpro.ap_commerce_checkout.fragments.base.BaseResidencyValidationFragment$1 */
    static /* synthetic */ class C87391 {

        /* renamed from: $SwitchMap$com$disney$wdpro$profile_ui$utils$ResidencyVerificationStatus */
        static final /* synthetic */ int[] f29266xaed914b;

        static {
            int[] iArr = new int[ResidencyVerificationStatus.values().length];
            f29266xaed914b = iArr;
            try {
                iArr[ResidencyVerificationStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29266xaed914b[ResidencyVerificationStatus.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29266xaed914b[ResidencyVerificationStatus.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void checkResidencyValidation() {
        this.residencyVerificationStatus = null;
        this.mustCloseFlowFromWebView = false;
        this.mustCallCreateOrder = false;
        this.apCommerceCheckoutManager.needsFLValidation(this.authenticationManager.getUserSwid(), this.profileRemoteManager, this.ticketItems);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment, com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void createOrderOnServer() {
        if (this.mustCallCreateOrder) {
            super.createOrderOnServer();
        }
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void moveToConfirmationScreen() {
        ((APBaseOrderSummaryFragment) this).actionListener.showOrderConfirmationScreen(this.selectedTicketProducts, Long.valueOf(getTicketOrderForm().getFormId()), this.passHolderDemographicDataManager.getPassholderItemList());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1822) {
            if (i11 != -1 || !intent.hasExtra(ResidencyVerificationActivity.RESIDENCY_VERIFICATION_RESPONSE)) {
                this.mustCloseFlowFromWebView = true;
                this.mustCallCreateOrder = false;
            } else {
                this.residencyVerificationStatus = ((ResidencyVerificationResponse) intent.getSerializableExtra(ResidencyVerificationActivity.RESIDENCY_VERIFICATION_RESPONSE)).getStatus();
                this.mustCallCreateOrder = true;
                trackFinishIdMeFlow();
            }
        }
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment, com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) throws IllegalArgumentException {
        super.onCreate(bundle);
        ProfileUIComponentProvider profileUIComponentProvider = (ProfileUIComponentProvider) getActivity().getApplication();
        this.profileRemoteManager = profileUIComponentProvider.getProfileUiComponent().getProfileManager();
        this.profileNavEntriesBuilderProvider = profileUIComponentProvider.getProfileUiComponent().getProfileConfiguration().getProfileNavEntriesBuilderProvider();
        checkResidencyValidation();
    }

    @Subscribe
    public void onNeedValidateResidenceResponse(APCommerceCheckoutManager.ResidencyVerificationEvent residencyVerificationEvent) {
        if (residencyVerificationEvent.isSuccess()) {
            trackStartIdMeFlow();
            navigate(null, this.profileNavEntriesBuilderProvider.getResidencyVerificationNavigationEntry(getContext()));
        } else {
            this.mustCallCreateOrder = true;
            createOrderOnServer();
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.mustCloseFlowFromWebView) {
            ((APBaseOrderSummaryFragment) this).actionListener.closeCheckoutFlow();
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void populateOrderSummaryHeader(LayoutInflater layoutInflater, View view) {
        try {
            super.populateOrderSummaryHeader(layoutInflater, view);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
        }
    }

    public void trackFinishIdMeFlow() {
        C8677i c8677i = new C8677i(false);
        c8677i.m37425c("link.category", TicketSalesAnalyticsUtil.getAnalyticsLinkCategory(this.selectedTicketProducts));
        int i10 = C87391.f29266xaed914b[this.residencyVerificationStatus.ordinal()];
        if (i10 == 1) {
            c8677i.m37425c("resident.validation", "success");
            this.analyticsHelper.mo37405b("FLResVerification_Finish", c8677i.m37428f());
        } else if (i10 == 2) {
            c8677i.m37425c("resident.validation", "fail");
            this.analyticsHelper.mo37405b("FLResVerification_Finish", c8677i.m37428f());
        } else {
            if (i10 != 3) {
                return;
            }
            c8677i.m37425c("resident.validation", "cancel");
            this.analyticsHelper.mo37405b("FLResVerification_Finish", c8677i.m37428f());
        }
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void trackPurchase(SelectedTicketProducts selectedTicketProducts) {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("link.category", TicketSalesAnalyticsUtil.getAnalyticsLinkCategory(selectedTicketProducts));
        defaultContext.put("&&products", this.analyticsProductString);
        boolean zUserNeedsToValidateResidency = this.apCommerceCheckoutManager.userNeedsToValidateResidency();
        this.residentValidationEntryValue = null;
        if (zUserNeedsToValidateResidency) {
            ResidencyVerificationStatus residencyVerificationStatus = this.residencyVerificationStatus;
            if (residencyVerificationStatus != null) {
                int i10 = C87391.f29266xaed914b[residencyVerificationStatus.ordinal()];
                if (i10 == 1) {
                    this.residentValidationEntryValue = "success";
                } else if (i10 == 2) {
                    this.residentValidationEntryValue = "fail";
                } else if (i10 == 3) {
                    this.residentValidationEntryValue = "cancel";
                }
            }
        } else {
            this.residentValidationEntryValue = "exists";
        }
        String str = this.residentValidationEntryValue;
        if (str != null) {
            this.profileManager.setResidentValidationEntryValue(str);
            defaultContext.put("resident.validation", this.residentValidationEntryValue);
        }
        this.ticketSalesAnalyticsHelper.trackAction(this.analyticsManager.getPurchaseAction(), defaultContext);
    }

    public void trackStartIdMeFlow() {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("link.category", TicketSalesAnalyticsUtil.getAnalyticsLinkCategory(this.selectedTicketProducts));
        this.analyticsHelper.mo37405b("FLResVerification_Start", defaultContext);
    }
}