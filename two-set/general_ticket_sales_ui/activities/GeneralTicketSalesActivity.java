package com.disney.wdpro.general_ticket_sales_ui.activities;

import android.os.Bundle;
import android.view.View;
import com.disney.wdpro.aligator.C8665e;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.aligator.ScreenType;
import com.disney.wdpro.base_sales_ui_lib.PurchaseFlowType;
import com.disney.wdpro.base_sales_ui_lib.SalesLauncher;
import com.disney.wdpro.base_sales_ui_lib.activities.TicketSalesActivity;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.Parties;
import com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketAssignModel;
import com.disney.wdpro.base_sales_ui_lib.manager.ResidentOfferManager;
import com.disney.wdpro.base_sales_ui_lib.p070ui.models.OrderWarning;
import com.disney.wdpro.base_sales_ui_lib.p070ui.providers.TicketSalesLayoutProvider;
import com.disney.wdpro.bookingservices.model.CommerceCheckoutEnvironment;
import com.disney.wdpro.commercecheckout.C9058R;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.disney.wdpro.general_ticket_sales_ui.GeneralTicketSalesLauncher;
import com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesOrderSummaryFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.MaxPassSalesDownFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderWarningFragment;
import com.disney.wdpro.general_ticket_sales_ui.p131di.GeneralTicketSalesUiComponentProvider;
import com.disney.wdpro.support.activities.InterfaceC20534h;
import com.disney.wdpro.support.anim.SnowballNextFlowAnimation;
import com.disney.wdpro.support.widget.AnimatedFloatingButton;
import com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesParams;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.SupportedPaymentType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductParameters;
import com.disney.wdpro.ticket_sales_managers.activities.AssignTicketIntentHelper;
import com.disney.wdpro.ticket_sales_managers.fragments.MaxPassLearnMoreFragment;
import com.disney.wdpro.ticket_sales_managers.fragments.PartyFilterFragment;
import com.disney.wdpro.ticket_sales_managers.models.MaxPassProductGroup;
import com.disney.wdpro.ticket_sales_managers.util.CommerceCheckoutMaxPassIntentProvider;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;

/* loaded from: classes28.dex */
public abstract class GeneralTicketSalesActivity extends TicketSalesActivity implements GeneralTicketSalesOrderSummaryFragment.GeneralOrderSummaryActions, PartyFilterFragment.PartyFilterFragmentActions, TicketSalesOrderWarningFragment.OrderWarningFragmentActions, TicketSalesOrderConfirmationFragment.TicketSalesOrderConfirmationFragmentActions, InterfaceC20534h {
    private AnimatedFloatingButton chatCTA;

    @Inject
    CommerceCheckoutEnvironment commerceCheckoutEnvironment;

    @Inject
    CommerceCheckoutMaxPassIntentProvider commerceCheckoutMaxPassIntentProvider;
    private PartyFilterFragment partyFilterFragment;

    @Inject
    ResidentOfferManager residentOfferManager;

    private void bounceChatButton() {
        if (this.chatCTA == null || !this.vendomatic.m38811z1()) {
            return;
        }
        this.chatCTA.m63835j();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.os.Bundle generateSalesChatSharedInformation() {
        /*
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.e0 r1 = r5.getSupportFragmentManager()
            int r2 = com.disney.wdpro.general_ticket_sales_ui.C11971R.id.fragment_container
            androidx.fragment.app.Fragment r1 = r1.m19752n0(r2)
            java.lang.String r2 = "commerce/tktsales/choosetkts"
            java.lang.String r3 = "SDE"
            if (r1 == 0) goto L2d
            boolean r4 = r1 instanceof com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
            if (r4 == 0) goto L2d
            com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment r1 = (com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment) r1
            com.disney.wdpro.commercecheckout.ui.model.saleschat.Error r4 = r1.getSalesChatErrorInformation()
            if (r4 == 0) goto L2d
            com.disney.wdpro.commercecheckout.ui.model.saleschat.Error r1 = r1.getSalesChatErrorInformation()
            java.lang.String r1 = com.disney.wdpro.commercecheckout.p076ui.utils.SalesChatSharedInformationUtil.getPageIdInfo(r2, r1)
            r0.putString(r3, r1)
            goto L34
        L2d:
            java.lang.String r1 = com.disney.wdpro.commercecheckout.p076ui.utils.SalesChatSharedInformationUtil.getPageIdInfo(r2)
            r0.putString(r3, r1)
        L34:
            java.lang.String r1 = com.disney.wdpro.commercecheckout.p076ui.utils.SalesChatSharedInformationUtil.getPageIdInfo(r2)
            r0.putString(r3, r1)
            java.lang.String r1 = "permissionsExtension"
            r2 = 1
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "LiveChatTileExtension"
            r0.putBoolean(r1, r2)
            com.disney.wdpro.bookingservices.model.CommerceCheckoutEnvironment r1 = r5.commerceCheckoutEnvironment
            long r1 = r1.getSalesChatCampaignId()
            java.lang.String r3 = "campaignId"
            r0.putLong(r3, r1)
            com.disney.wdpro.bookingservices.model.CommerceCheckoutEnvironment r5 = r5.commerceCheckoutEnvironment
            long r1 = r5.getSalesChatTicketSalesEngagementId()
            java.lang.String r5 = "engagementId"
            r0.putLong(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.general_ticket_sales_ui.activities.GeneralTicketSalesActivity.generateSalesChatSharedInformation():android.os.Bundle");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        trackSalesChatClickAction();
        navigateToSalesChatScreen(generateSalesChatSharedInformation());
    }

    private void trackSalesChatClickAction() {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("link.category", "TicketSales");
        mapMo37420q.put("page.detailname", TicketSalesAnalyticsConstants.TICKET_SALES_CHOOSE_TICKETS_PAGE_DETAIL_NAME);
        this.ticketSalesAnalyticsHelper.trackAction("Chat_Start", mapMo37420q);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public ImmutableList<TicketProductParameters> getDatedTicketProducts(Parties parties, Calendar calendar) {
        return ImmutableList.m69034of();
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity
    public int getLayoutResourceId() {
        return C11971R.layout.activity_general_ticket_sales;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.PartyFilterFragment.PartyFilterFragmentActions
    public int getMaxNumberOfTicketsSupported() {
        return new TicketSalesLayoutProvider(this.ticketSalesParams.getWebStoreId()).getMaxNumberOfTicketsSupported();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected C8665e.b getNavigationBuilderForFirstFragment(boolean z10, String str, TicketSalesParams ticketSalesParams) {
        C8665e.b bVarM37387v;
        if (ticketSalesParams.getProductCategoryDetails().getProductCategoryType() != ProductCategoryType.MAX_PASS) {
            bVarM37387v = this.navigator.m37387v(GeneralTicketSalesFragment.newInstance(ticketSalesParams.getProductCategoryDetails(), ticketSalesParams.getWebStoreId(), ticketSalesParams.getDestinationId(), ticketSalesParams.getAffiliationType(), str, ticketSalesParams.getSellableOnDate().orNull()));
        } else if (z10) {
            bVarM37387v = this.navigator.m37387v(GeneralTicketSalesOrderSummaryFragment.newInstance(str, Integer.MIN_VALUE, getSupportedPaymentTypeMap(), ticketSalesParams)).withLoginCheck();
        } else {
            PartyFilterFragment partyFilterFragmentNewInstance = PartyFilterFragment.newInstance(str, ticketSalesParams.getWebStoreId(), ticketSalesParams.getProductCategoryDetails(), ticketSalesParams.getDestinationId(), ticketSalesParams.getAffiliationType(), ticketSalesParams.getSellableOnDate().orNull());
            this.partyFilterFragment = partyFilterFragmentNewInstance;
            bVarM37387v = this.navigator.m37387v(partyFilterFragmentNewInstance).withLoginCheck();
        }
        return bVarM37387v.m37330h();
    }

    public abstract TicketSalesOrderConfirmationFragment getOrderConfirmationFragment(SelectedTicketProducts selectedTicketProducts, Long l10, boolean z10, String str);

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected BaseOrderSummaryFragment getOrderSummaryFragment(SelectedTicketProducts selectedTicketProducts, int i10, HashMap<SupportedPaymentType, Class<?>> map, Calendar calendar) {
        return GeneralTicketSalesOrderSummaryFragment.newInstance(selectedTicketProducts, i10, map, calendar, getProductCategoryDetails());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.base_sales_ui_lib.fragments.CommonFragmentActions
    public ProductCategoryDetails getProductCategoryDetails() {
        ProductCategoryDetails productCategoryDetails = super.getProductCategoryDetails();
        return this.residentOfferManager.shouldHandleResidentOffer() ? new ProductCategoryDetails(productCategoryDetails.getProductCategoryType(), Sets.m69461h(this.residentOfferManager.getSelectedOffer().getProductTypeIds())) : productCategoryDetails;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.TicketSalesActivity
    protected SalesLauncher getTicketSalesLauncher() {
        return new GeneralTicketSalesLauncher(this);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.PartyFilterFragment.PartyFilterFragmentActions
    public void navigateToCommerceCheckout(MaxPassProductGroup maxPassProductGroup) {
        this.navigator.m37388w(this.commerceCheckoutMaxPassIntentProvider.getIntent(maxPassProductGroup, this, this.ticketUpgradeEntitlementManager.getChosenForUpgradeEntitlements(), getMaxNumberOfTicketsSupported(), this.ticketSalesParams.getSellableOnDate().orNull(), this.ticketSalesParams.isNewRelicAnalyticsTrackerEnabled())).m37364r(ScreenType.STACK).m37363q(109).navigate();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.PartyFilterFragment.PartyFilterFragmentActions
    public void navigateToOrderSummaryFragment(String str) {
        this.navigator.m37387v(GeneralTicketSalesOrderSummaryFragment.newInstance(str, Integer.MIN_VALUE, getSupportedPaymentTypeMap(), this.ticketSalesParams)).withAnimations(new SnowballNextFlowAnimation()).navigate();
        bounceChatButton();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.PartyFilterFragment.PartyFilterFragmentActions
    public void navigateToTicketSalesOrderWarning(String str) {
        this.navigator.m37387v(TicketSalesOrderWarningFragment.newInstance(new OrderWarning(getString(C11971R.string.ticket_sales_order_warning_header), getString(C11971R.string.ticket_sales_order_warning_title), getString(C11971R.string.ticket_sales_order_warning_text)), str, this.ticketSalesParams.getWebStoreId(), this.ticketSalesParams.getProductCategoryDetails().getProductCategoryType())).withAnimations(new SnowballNextFlowAnimation()).navigate();
        bounceChatButton();
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment.TicketSalesOrderConfirmationFragmentActions
    public void onBuyMoreTickets(String str) {
        if (this.purchaseFlowType != PurchaseFlowType.PURCHASE_STANDALONE_FP) {
            throw new UnsupportedOperationException("Right now only MP upgrade flow has usecase of more that 15 tickets.");
        }
        resetFlow();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.base_sales_ui_lib.activities.SalesBaseActivity, com.disney.wdpro.support.activities.FoundationStackActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((GeneralTicketSalesUiComponentProvider) getApplication()).getGeneralTicketSalesUiComponent().inject(this);
        if (this.vendomatic.m38811z1()) {
            AnimatedFloatingButton animatedFloatingButton = (AnimatedFloatingButton) findViewById(C11971R.id.tixsale_chat_button);
            this.chatCTA = animatedFloatingButton;
            if (animatedFloatingButton != null) {
                animatedFloatingButton.m63836n(getString(C11971R.string.animated_chat_button_chat_text), new View.OnClickListener() { // from class: com.disney.wdpro.general_ticket_sales_ui.activities.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f32768a.lambda$onCreate$0(view);
                    }
                });
                this.chatCTA.m63838p();
                this.chatCTA.setAccessibilityTraversalAfter(C9058R.id.snowball_header_screen_name);
            }
        }
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderWarningFragment.OrderWarningFragmentActions
    public void proceedToNextActionAfterOrderWarning(String str) {
        this.navigator.m37377j();
        PartyFilterFragment partyFilterFragment = this.partyFilterFragment;
        if (partyFilterFragment != null) {
            partyFilterFragment.navigateToCheckoutFlow(str);
        } else {
            navigateToOrderSummaryFragment(str);
        }
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesOrderSummaryFragment.GeneralOrderSummaryActions
    public void showAssignFriendScreen(TicketOrderForm ticketOrderForm, TicketAssignModel ticketAssignModel) {
        C8666f.b bVar = new C8666f.b(this.navigator, AssignTicketIntentHelper.constructIntent(this, getAssignFriendActivityClass(), ticketOrderForm, ticketAssignModel));
        setInExternalTicketAssignmentFlow(true);
        this.navigator.m37382o(bVar.m37363q(55).build());
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.PartyFilterFragment.PartyFilterFragmentActions
    public void showMaxPassLearnMoreScreen() {
        this.navigator.m37387v(new MaxPassLearnMoreFragment()).withAnimations(new SnowballNextFlowAnimation()).navigate();
        bounceChatButton();
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesOrderSummaryFragment.GeneralOrderSummaryActions
    public void showOrderConfirmationScreen(SelectedTicketProducts selectedTicketProducts, Long l10, boolean z10, String str) {
        this.navigator.m37387v(getOrderConfirmationFragment(selectedTicketProducts, l10, z10, str)).withAnimations(new SnowballNextFlowAnimation()).navigate();
        bounceChatButton();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.TicketSalesActivity, com.disney.wdpro.base_sales_ui_lib.fragments.CommonFragmentActions
    public void showSalesDownScreen(SalesBaseFragment.DownScreenReasons downScreenReasons, PurchaseFlowType purchaseFlowType) {
        if (purchaseFlowType != PurchaseFlowType.PURCHASE_STANDALONE_FP) {
            super.showSalesDownScreen(downScreenReasons, purchaseFlowType);
            return;
        }
        navigateOneStepBack();
        this.navigator.m37387v(MaxPassSalesDownFragment.newInstance(downScreenReasons, this.ticketSalesParams.getWebStoreId(), this.ticketSalesParams.getProductCategoryDetails())).m37330h().navigate();
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesOrderSummaryFragment.GeneralOrderSummaryActions
    public void updateActivityResult() {
        setActivityResult();
    }
}