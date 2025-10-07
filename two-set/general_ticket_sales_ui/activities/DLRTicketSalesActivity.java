package com.disney.wdpro.general_ticket_sales_ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.disney.wdpro.InterfaceC13600m;
import com.disney.wdpro.aligator.C8663c;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.aligator.ScreenType;
import com.disney.wdpro.analytics.InterfaceC8669a;
import com.disney.wdpro.base_sales_ui_lib.C8920R;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.Parties;
import com.disney.wdpro.base_sales_ui_lib.manager.ResidentOfferManager;
import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlement;
import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlementManager;
import com.disney.wdpro.base_sales_ui_lib.providers.DLRCommerceCheckoutResourceProvider;
import com.disney.wdpro.bookingservices.model.TicketBody;
import com.disney.wdpro.commercecheckout.p076ui.activities.CheckoutActivity;
import com.disney.wdpro.commercecheckout.p076ui.activities.CheckoutLauncher;
import com.disney.wdpro.commercecheckout.p076ui.config.CheckoutConfig;
import com.disney.wdpro.commercecheckout.p076ui.config.ExitCtaAction;
import com.disney.wdpro.commercecheckout.p076ui.mvp.presenters.model.MaxPassExtraData;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.deeplink.DeepLinkFastPass;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.disney.wdpro.general_ticket_sales_ui.fragment.DLRTicketSalesOrderConfirmationFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesOrderSummaryFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment;
import com.disney.wdpro.general_ticket_sales_ui.helpers.SalesConfigurationHelper;
import com.disney.wdpro.general_ticket_sales_ui.helpers.TicketOrderItemHelper;
import com.disney.wdpro.general_ticket_sales_ui.p131di.GeneralTicketSalesUiComponentProvider;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.AboutElement;
import com.disney.wdpro.ticket_sales_base_lib.business.host_app.GuestGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AddOnOption;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DiscountGroupType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductParameters;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductType;
import com.disney.wdpro.universal_checkout_ui.p459ui.activities.UniversalCheckoutActivity;
import com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutToggleUtils;
import com.google.common.base.InterfaceC22463n;
import com.google.common.collect.C22747g2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;

@Instrumented
/* loaded from: classes28.dex */
public class DLRTicketSalesActivity extends GeneralTicketSalesActivity {
    private static final String URI_DLR = "dlr://";

    @Inject
    SalesConfigurationHelper salesConfigurationHelper;

    @Inject
    TicketOrderItemHelper ticketOrderItemHelper;
    private InterfaceC13600m ticketSalesConfiguration;

    private CheckoutConfig buildCheckoutConfig(TicketBody ticketBody, String str) {
        return new CheckoutConfig.Builder().setReviewAndPurchaseConfiguration(this.salesConfigurationHelper.getReviewAndPurchaseConfiguration()).setConfirmationConfiguration(this.salesConfigurationHelper.getConfirmationConfiguration()).setAnalyticsConfiguration(this.salesConfigurationHelper.getAnalyticsConfiguration(this.ticketSalesParams.isNewRelicAnalyticsTrackerEnabled())).setCheckoutBody(ticketBody).setSellableOnDate(this.ticketSalesParams.getSellableOnDate().orNull()).setCommerceCheckoutResourceProvider(DLRCommerceCheckoutResourceProvider.getCommerceResourceProvider(this).setTermsAndConditionsContent(str).build()).build();
    }

    private ExitCtaAction buildExitCtaAction() {
        return new ExitCtaAction.Builder().setText(getString(C8920R.string.confirmation_exit_cta_text)).setNavigationEntry(this.ticketSalesConfiguration.getTicketAndPassesNavigationEntry()).setActionForAnalytics("MyTickets").setIconResource(C8920R.drawable.barcodescan).setTextResource(C8920R.string.confirmation_exit_cta_text).build();
    }

    private Intent createCheckoutIntent(SelectedTicketProducts selectedTicketProducts, C9350r c9350r, String str) {
        HashMap mapM69381r = Maps.m69381r();
        return new CheckoutLauncher(this, buildCheckoutConfig(new TicketBody(selectedTicketProducts.getDestinationId().getId(), selectedTicketProducts.getWebStoreId().getId(), selectedTicketProducts.getDtiStoreId(), this.authenticationManager.getUserSwid(), false, this.ticketOrderItemHelper.getTicketOrderItems(selectedTicketProducts, getResources().getString(C8920R.string.dlr_ticket_sales_learn_more_header)), mapM69381r, "yyyy-MM-dd"), str), buildExitCtaAction()).buildCheckoutIntent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendUnifiedCheckoutABTestingRequest$0(SelectedTicketProducts selectedTicketProducts, int i10, Calendar calendar, C9350r c9350r, String str, String str2) {
        if (str2 != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    Map map = (Map) GsonInstrumentation.fromJson(new Gson(), str2, Map.class);
                    if (!map.containsKey("enableUnifiedCheckout") || !((Boolean) map.get("enableUnifiedCheckout")).booleanValue()) {
                        goToNativeCheckout(selectedTicketProducts, i10, calendar, c9350r, str);
                        return;
                    } else {
                        goToUnifiedCheckout(selectedTicketProducts);
                        Objects.toString(map.get("enableUnifiedCheckout"));
                        return;
                    }
                }
            } catch (JsonSyntaxException unused) {
                goToNativeCheckout(selectedTicketProducts, i10, calendar, c9350r, str);
                return;
            }
        }
        goToNativeCheckout(selectedTicketProducts, i10, calendar, c9350r, str);
    }

    private void navigateToConfirmAndPurchase(SelectedTicketProducts selectedTicketProducts, String str, int i10, Calendar calendar) {
        ProductCategoryType productCategoryType = selectedTicketProducts.getProductCategoryType();
        if (!UniversalCheckoutToggleUtils.isUnifiedCheckoutTicketSalesEnabled(this.vendomatic, this.unifiedCheckoutSecretConfig) || !ProductCategoryType.THEME_PARK_GENERAL_ADMISSIONS.equals(productCategoryType)) {
            goToNativeCheckout(selectedTicketProducts, i10, calendar, this.time, str);
        } else if (this.vendomatic.m38683F1()) {
            sendUnifiedCheckoutABTestingRequest(selectedTicketProducts, i10, calendar, this.time, str);
        } else {
            goToUnifiedCheckout(selectedTicketProducts);
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public List<AboutElement> getAboutTierTicketsContent(String str) {
        return Lists.m69271l(new AboutElement(null, getString(C11971R.string.dlr_ticket_sales_about_header)), new AboutElement(getString(C11971R.string.ticket_sales_for_peak_title), getString(C11971R.string.dlr_ticket_sales_for_peak_content)), new AboutElement(getString(C11971R.string.ticket_sales_for_regular_title), getString(C11971R.string.dlr_ticket_sales_for_regular_content)), new AboutElement(getString(C11971R.string.ticket_sales_for_value_title), getString(C11971R.string.dlr_ticket_sales_for_value_content)), new AboutElement(null, getString(C11971R.string.dlr_ticket_sales_about_sub_footer, str)), new AboutElement(getString(C11971R.string.ticket_sales_about_multi_day_title), getString(C11971R.string.dlr_ticket_sales_about_multi_day_content)));
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public int getDaySelectorPricePerDayContentDescriptionStringId() {
        return C11971R.string.dlr_ticket_sales_cd_per_day;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public int getDaySelectorPricePerDayStringId() {
        return C11971R.string.dlr_ticket_sales_per_day;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public int getDaySelectorPricePerDayStringIdForChild() {
        return C11971R.string.dlr_ticket_sales_per_day_child;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected GuestGroup getGuestGroup() {
        return GuestGroup.DLR;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public int getLegendPricePerDayStringId() {
        return C11971R.string.dlr_ticket_sales_price_per_ticket_note;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public int getOneDayVaryNoteStringId() {
        return this.vendomatic.m38730W() ? C11971R.string.dlr_ticket_sales_delta_one_day_note : C11971R.string.dlr_ticket_sales_bravo_one_day_note;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    public BaseConfirmationFragment getOrderConfirmationFragment(SelectedTicketProducts selectedTicketProducts, Long l10) {
        return DLRTicketSalesOrderConfirmationFragment.newInstance(selectedTicketProducts, l10);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected Set<TicketProductType.ProductId> getProductIds(ProductCategoryType productCategoryType) {
        HashSet hashSetM69460g = Sets.m69460g();
        if (productCategoryType != ProductCategoryType.THEME_PARK_GENERAL_ADMISSIONS) {
            if (productCategoryType == ProductCategoryType.MAX_PASS) {
                hashSetM69460g.add(TicketProductType.ProductId.DLR_MAX_PASS);
            }
            return hashSetM69460g;
        }
        hashSetM69460g.add(TicketProductType.ProductId.DLR_THEME_PARK);
        hashSetM69460g.add(TicketProductType.ProductId.DLR_THEME_PARK_VALUE);
        hashSetM69460g.add(TicketProductType.ProductId.DLR_THEME_PARK_REGULAR);
        hashSetM69460g.add(TicketProductType.ProductId.DLR_THEME_PARK_PEAK);
        return hashSetM69460g;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public TicketProductParameters getTicketProductParameterForPricePerDay(int i10, String str, String str2) {
        return TicketProductParameters.builder().setTicketProductType(i10 == 1 ? new TicketProductType(str2) : new TicketProductType(TicketProductType.ProductId.DLR_THEME_PARK.getId())).setNumberOfDays(i10).setTier(str).setDiscountGroupType(DiscountGroupType.STD_GST.getDiscountGroupId()).build();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public ImmutableList<TicketProductParameters> getTicketProducts(int i10, Parties parties, String str, ResidentOfferManager residentOfferManager, Set<String> set) {
        ImmutableList.C22583a c22583aBuilder = ImmutableList.builder();
        ArrayList arrayList = new ArrayList();
        if (!residentOfferManager.isResidentOffersEnabled()) {
            arrayList = new ArrayList(set);
        } else if (residentOfferManager.getSelectedOffer() != null) {
            arrayList.addAll(residentOfferManager.getSelectedOffer().getProductTypeIds());
        } else {
            arrayList.addAll(residentOfferManager.getProductIdSetByDiscountGroup(DiscountGroupType.STD_GST.getDiscountGroupId()));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DLRTicketSalesActivity dLRTicketSalesActivity = this;
            c22583aBuilder.mo69026a(dLRTicketSalesActivity.getTicketParams(i10, parties, new TicketProductType((String) it.next()), str, new HashSet()));
            this = dLRTicketSalesActivity;
        }
        DLRTicketSalesActivity dLRTicketSalesActivity2 = this;
        HashSet hashSet = new HashSet();
        hashSet.add(AddOnOption.PARK_HOPPER);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c22583aBuilder.mo69026a(dLRTicketSalesActivity2.getTicketParams(i10, parties, new TicketProductType((String) it2.next()), str, hashSet));
        }
        HashSet hashSet2 = new HashSet();
        hashSet2.add(AddOnOption.MAX_PASS);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            c22583aBuilder.mo69026a(dLRTicketSalesActivity2.getTicketParams(i10, parties, new TicketProductType((String) it3.next()), str, hashSet2));
        }
        HashSet hashSet3 = new HashSet();
        hashSet3.add(AddOnOption.MAX_PASS);
        hashSet3.add(AddOnOption.PARK_HOPPER);
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            c22583aBuilder.mo69026a(dLRTicketSalesActivity2.getTicketParams(i10, parties, new TicketProductType((String) it4.next()), str, hashSet3));
        }
        return c22583aBuilder.m69053m();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected void goToNativeCheckout(SelectedTicketProducts selectedTicketProducts, int i10, Calendar calendar, C9350r c9350r, String str) {
        this.navigator.m37388w(createCheckoutIntent(selectedTicketProducts, c9350r, str)).m37364r(ScreenType.STACK).m37363q(109).navigate();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected void goToUnifiedCheckout(SelectedTicketProducts selectedTicketProducts) {
        this.navigator.m37388w(UniversalCheckoutActivity.createIntent(this, createTicketOrder(selectedTicketProducts).encodeTicketOrder(), this.ticketSalesParams.getSellableOnDate().orNull(), this.salesConfigurationHelper.getUCAnalyticsConfiguration(), true)).m37363q(UniversalCheckoutActivity.UC_REQUEST_CODE).navigate();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected final boolean isInOrderSummaryScreen() {
        return getSupportFragmentManager().m19755o0(GeneralTicketSalesOrderSummaryFragment.class.getSimpleName()) != null;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        TicketUpgradeEntitlementManager ticketUpgradeEntitlementManager;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 109 && i11 == 101 && intent != null && intent.hasExtra(CheckoutActivity.FINISH_FLOW_EXTRA_DATA) && (ticketUpgradeEntitlementManager = this.ticketUpgradeEntitlementManager) != null) {
            ImmutableSortedSet<TicketUpgradeEntitlement> chosenForUpgradeEntitlements = ticketUpgradeEntitlementManager.getChosenForUpgradeEntitlements();
            Iterator<List<String>> it = ((MaxPassExtraData) intent.getSerializableExtra(CheckoutActivity.FINISH_FLOW_EXTRA_DATA)).getEntitlementIds().iterator();
            while (it.hasNext()) {
                for (final String str : it.next()) {
                    TicketUpgradeEntitlement ticketUpgradeEntitlement = (TicketUpgradeEntitlement) C22747g2.m69540h(chosenForUpgradeEntitlements, new InterfaceC22463n() { // from class: com.disney.wdpro.general_ticket_sales_ui.activities.b
                        @Override // com.google.common.base.InterfaceC22463n
                        public final boolean apply(Object obj) {
                            return str.equals(((TicketUpgradeEntitlement) obj).getEntitlementId());
                        }
                    }, null);
                    if (ticketUpgradeEntitlement != null) {
                        this.ticketUpgradeEntitlementManager.updateEntitlementState(ticketUpgradeEntitlement, TicketUpgradeEntitlement.EntitlementState.HAS_UPGRADED_ENTITLEMENT);
                    }
                }
            }
            updateActivityResult();
            if (this.ticketUpgradeEntitlementManager.hasAllEntitlementsUpgraded()) {
                showNextCallToActionScreen();
            } else {
                onBuyMoreTickets(this.sessionId);
            }
        }
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.activities.GeneralTicketSalesActivity, com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.base_sales_ui_lib.activities.SalesBaseActivity, com.disney.wdpro.support.activities.FoundationStackActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ((GeneralTicketSalesUiComponentProvider) getApplication()).getGeneralTicketSalesUiComponent().inject(this);
        super.onCreate(bundle);
        this.ticketSalesConfiguration = ((GeneralTicketSalesUiComponentProvider) getApplicationContext()).getGeneralTicketSalesUiComponent().getTicketSalesConfiguration();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected void sendUnifiedCheckoutABTestingRequest(final SelectedTicketProducts selectedTicketProducts, final int i10, final Calendar calendar, final C9350r c9350r, final String str) {
        this.abTestingHelper.mo37390a(this.parkAppConfiguration.m38908h().equals("WDW") || this.parkAppConfiguration.m38908h().equals("Walt Disney World") ? "MDX_Mobile_Unified_Checkout_Mbox" : "DLR_Mobile_Unified_Checkout_Mbox", "", new HashMap(), new InterfaceC8669a.a() { // from class: com.disney.wdpro.general_ticket_sales_ui.activities.a
            @Override // com.disney.wdpro.analytics.InterfaceC8669a.a
            public final void processResponse(String str2) {
                this.f32761a.lambda$sendUnifiedCheckoutABTestingRequest$0(selectedTicketProducts, i10, calendar, c9350r, str, str2);
            }
        });
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected boolean shouldBackPressResultInResetFlow() {
        return getSupportFragmentManager().m19755o0(DLRTicketSalesOrderConfirmationFragment.class.getSimpleName()) != null;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.PartyFilterFragment.PartyFilterFragmentActions
    public void showFastPassAvailabilityList() {
        C8663c.b bVarM37291e = new C8663c.b().m37291e(DeepLinkFastPass.AVAILABILITY_LIST.getLink());
        Bundle bundle = new Bundle();
        bundle.putSerializable(C8666f.EXTRA_SCREEN_TYPE, ScreenType.STACK);
        bVarM37291e.m37296j(bundle);
        this.navigator.m37382o(bVarM37291e.build());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment.SalesActions
    public void showOrderSummaryScreen(SelectedTicketProducts selectedTicketProducts, int i10, Calendar calendar, C9350r c9350r, String str) {
        if (this.residentOfferManager.isSpecialOfferSelected()) {
            navigateToConfirmAndPurchase(selectedTicketProducts, str, i10, calendar);
        } else {
            navigateToConfirmAndPurchase(selectedTicketProducts, str, i10, calendar);
        }
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.activities.GeneralTicketSalesActivity
    public TicketSalesOrderConfirmationFragment getOrderConfirmationFragment(SelectedTicketProducts selectedTicketProducts, Long l10, boolean z10, String str) {
        return DLRTicketSalesOrderConfirmationFragment.newInstance(selectedTicketProducts, l10, z10, str);
    }
}