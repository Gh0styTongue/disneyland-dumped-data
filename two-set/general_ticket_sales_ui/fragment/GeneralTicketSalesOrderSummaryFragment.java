package com.disney.wdpro.general_ticket_sales_ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.disney.wdpro.base_sales_ui_lib.PurchaseFlowType;
import com.disney.wdpro.base_sales_ui_lib.TicketSalesConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsHelper;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.BookingApiErrorMessageInterface;
import com.disney.wdpro.base_sales_ui_lib.checkout.manager.TicketSalesCheckoutManager;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.BlockOutDatesActionListener;
import com.disney.wdpro.base_sales_ui_lib.fragments.SelectedProductsUIHelper;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketAssignModel;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper;
import com.disney.wdpro.base_sales_ui_lib.manager.ProfileManager;
import com.disney.wdpro.base_sales_ui_lib.manager.ResidentOfferManager;
import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlement;
import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlementManager;
import com.disney.wdpro.base_sales_ui_lib.p070ui.providers.TicketSalesLayoutProvider;
import com.disney.wdpro.base_sales_ui_lib.product.manager.TicketSalesConfigManager;
import com.disney.wdpro.base_sales_ui_lib.utils.FlipCardAnimationUtils;
import com.disney.wdpro.base_sales_ui_lib.utils.TicketSalesAnalyticsUtil;
import com.disney.wdpro.base_sales_ui_lib.views.TicketAssignViewItem;
import com.disney.wdpro.base_sales_ui_lib.views.TicketAssignViewItemFactory;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.monitor.InterfaceC9336k;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.disney.wdpro.general_ticket_sales_ui.checkout.errors.BookingApiErrorMessageProvider;
import com.disney.wdpro.general_ticket_sales_ui.p131di.GeneralTicketSalesUiComponentProvider;
import com.disney.wdpro.general_ticket_sales_ui.p132ui.providers.GeneralBrickTitleCreator;
import com.disney.wdpro.ticket_sales_base_lib.FetchFPTicketEvent;
import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesParams;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderFormBuilder;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserDataContainer;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.SupportedPaymentType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AffiliationType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AgeGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNameMap;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNames;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.utils.DateUtils;
import com.disney.wdpro.ticket_sales_managers.CreateTicketOrderEvent;
import com.disney.wdpro.ticket_sales_managers.PurchaseTicketOrderEvent;
import com.disney.wdpro.ticket_sales_managers.activities.AssignTicketIntentHelper;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment;
import com.google.common.base.C22456g;
import com.google.common.base.C22462m;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Lists;
import com.squareup.otto.Subscribe;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;

/* loaded from: classes28.dex */
public class GeneralTicketSalesOrderSummaryFragment extends BaseOrderSummaryManagersFragment implements TicketAssignViewItem.TicketAssignViewItemActions, BlockOutDatesActionListener {
    private static final String AFFILIATION_TYPE = "TS_ORDER_SUMMARY_AFFILIATION_TYPE";
    private static final String DESTINATION_ID = "TS_ORDER_SUMMARY_DESTINATION_ID";
    private static final String DISCOUNT_GROUP_TYPE = "TS_ORDER_SUMMARY_DISCOUNT_GROUP_TYPE";
    private static final String SESSION_ID = "TS_ORDER_SUMMARY_SESSION_ID";
    private static final int SINGLE_DAY = 1;
    private GeneralOrderSummaryActions actionListener;
    private AffiliationType affiliationType;
    private BookingApiErrorMessageInterface bookingApiErrorMessageProvider;
    private ArrayList<TicketUpgradeEntitlement> currentUpgradeEntitlements;
    private DestinationId destinationId;
    private String discountGroupType;

    @Inject
    protected InterfaceC9336k locationMonitor;
    private View orderSummaryAssignList;
    private ProductCategoryDetails productCategoryDetails;

    @Inject
    protected ResidentOfferManager residentOfferManager;
    private String sessionId;
    private TextView ticketAssignTitle;
    private ViewGroup ticketAssignViewGroup;
    private TextView ticketNotRefundable;
    private TextView ticketReassignSubtitle;
    private TicketUpgradeEntitlementManager ticketUpgradeEntitlementManager;

    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesOrderSummaryFragment$1 */
    static /* synthetic */ class C120081 {

        /* renamed from: $SwitchMap$com$disney$wdpro$ticket_sales_base_lib$business$product$ProductCategoryType */
        static final /* synthetic */ int[] f32769x3a53626;

        static {
            int[] iArr = new int[ProductCategoryType.values().length];
            f32769x3a53626 = iArr;
            try {
                iArr[ProductCategoryType.MAX_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32769x3a53626[ProductCategoryType.THEME_PARK_GENERAL_ADMISSIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface GeneralOrderSummaryActions extends BaseOrderSummaryFragment.BaseOrderSummaryActions {
        void showAssignFriendScreen(TicketOrderForm ticketOrderForm, TicketAssignModel ticketAssignModel);

        void showOrderConfirmationScreen(SelectedTicketProducts selectedTicketProducts, Long l10, boolean z10, String str);

        void updateActivityResult();
    }

    protected static class GeneralTicketSalesArgumentBuilder extends BaseOrderSummaryFragment.ArgumentBuilder<GeneralTicketSalesArgumentBuilder> {
        private AffiliationType affiliationType;
        private DestinationId destinationId;
        private String discountGroupType;
        private ProductCategoryDetails productCategoryDetails;
        private String sessionId;

        protected GeneralTicketSalesArgumentBuilder() {
        }

        public static GeneralTicketSalesArgumentBuilder createNewInstance() {
            return new GeneralTicketSalesArgumentBuilder();
        }

        @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment.ArgumentBuilder
        public Bundle build() {
            Bundle bundleBuild = super.build();
            bundleBuild.putSerializable(TicketSalesConstants.KEY_ARG_PRODUCT_CATEGORY_DETAILS, this.productCategoryDetails);
            bundleBuild.putSerializable(GeneralTicketSalesOrderSummaryFragment.AFFILIATION_TYPE, this.affiliationType);
            bundleBuild.putString(GeneralTicketSalesOrderSummaryFragment.DISCOUNT_GROUP_TYPE, this.discountGroupType);
            bundleBuild.putString(GeneralTicketSalesOrderSummaryFragment.SESSION_ID, this.sessionId);
            bundleBuild.putSerializable(GeneralTicketSalesOrderSummaryFragment.DESTINATION_ID, this.destinationId);
            return bundleBuild;
        }

        public GeneralTicketSalesArgumentBuilder withAffiliationType(AffiliationType affiliationType) {
            this.affiliationType = affiliationType;
            return this;
        }

        public GeneralTicketSalesArgumentBuilder withDestinationId(DestinationId destinationId) {
            this.destinationId = destinationId;
            return this;
        }

        public GeneralTicketSalesArgumentBuilder withDiscountGroupType(String str) {
            this.discountGroupType = str;
            return this;
        }

        public GeneralTicketSalesArgumentBuilder withProductCategoryDetails(ProductCategoryDetails productCategoryDetails) {
            this.productCategoryDetails = productCategoryDetails;
            return this;
        }

        public GeneralTicketSalesArgumentBuilder withSessionId(String str) {
            this.sessionId = str;
            return this;
        }
    }

    private TicketAssignModel createTicketAssignModel(SelectedTicketProducts selectedTicketProducts, AgeGroup ageGroup, String str, int i10, TicketUpgradeEntitlement ticketUpgradeEntitlement) {
        DisplayNames displayNames = selectedTicketProducts.getTicketDisplayNames().get();
        String title = displayNames.getTicketTitle().isPresent() ? displayNames.getTicketTitle().get().getTitle(DisplayNameMap.Type.PLAIN_TEXT) : "";
        UserDataContainer userDataContainerForTicketIndex = getTicketOrderForm().getUserDataContainerForTicketIndex(i10);
        if (userDataContainerForTicketIndex == null) {
            userDataContainerForTicketIndex = UserDataContainer.newBuilder().setGuestLocalId(String.valueOf(i10)).build();
        }
        return TicketAssignModel.newBuilder().setTicketDisplayTitle(title).setAgeGroup(ageGroup).setNumberOfSelectedDays(selectedTicketProducts.getNumberOfSelectedDays()).setUserDataContainer(userDataContainerForTicketIndex).setAtsCode(str).setTicketIndex(i10).setTicketUpgradeEntitlement(ticketUpgradeEntitlement).setAvatar(userDataContainerForTicketIndex.getAvatar()).build();
    }

    private ArrayList<TicketUpgradeEntitlement> extractUpgradeEntitlements() {
        ArrayList<TicketUpgradeEntitlement> arrayListM69268i = Lists.m69268i();
        ImmutableSortedSet<TicketUpgradeEntitlement> chosenForUpgradeEntitlements = this.ticketUpgradeEntitlementManager.getChosenForUpgradeEntitlements();
        Iterator<TicketUpgradeEntitlement> it = chosenForUpgradeEntitlements.iterator();
        int iMin = Math.min(chosenForUpgradeEntitlements.size(), new TicketSalesLayoutProvider(getWebStoreId()).getMaxNumberOfTicketsSupported());
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayListM69268i.add(it.next());
        }
        return arrayListM69268i;
    }

    private List<TicketAssignModel> getTicketAssignModelList(SelectedTicketProducts selectedTicketProducts, ArrayList<TicketUpgradeEntitlement> arrayList) {
        ArrayList arrayListM69268i = Lists.m69268i();
        int numberOfAdultTickets = selectedTicketProducts.getNumberOfAdultTickets();
        int numberOfChildTickets = selectedTicketProducts.getNumberOfChildTickets();
        int numberOfSeniorTickets = selectedTicketProducts.getNumberOfSeniorTickets();
        int numberOfAllAgesTickets = selectedTicketProducts.getNumberOfAllAgesTickets();
        if (this.purchaseFlowType == PurchaseFlowType.PURCHASE_STANDALONE_FP) {
            Iterator<TicketUpgradeEntitlement> it = arrayList.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                arrayListM69268i.add(createTicketAssignModel(selectedTicketProducts, AgeGroup.ADULT, selectedTicketProducts.getAdultATSCode().orNull(), i10, it.next()));
                i10++;
            }
        } else {
            int i11 = 0;
            for (int i12 = 0; i12 < numberOfAdultTickets; i12++) {
                arrayListM69268i.add(createTicketAssignModel(selectedTicketProducts, AgeGroup.ADULT, selectedTicketProducts.getAdultATSCode().orNull(), i11, null));
                i11++;
            }
            for (int i13 = 0; i13 < numberOfSeniorTickets; i13++) {
                arrayListM69268i.add(createTicketAssignModel(selectedTicketProducts, AgeGroup.SENIOR, selectedTicketProducts.getSeniorATSCode().orNull(), i11, null));
                i11++;
            }
            for (int i14 = 0; i14 < numberOfChildTickets; i14++) {
                arrayListM69268i.add(createTicketAssignModel(selectedTicketProducts, AgeGroup.CHILD, selectedTicketProducts.getChildATSCode().orNull(), i11, null));
                i11++;
            }
            for (int i15 = 0; i15 < numberOfAllAgesTickets; i15++) {
                arrayListM69268i.add(createTicketAssignModel(selectedTicketProducts, AgeGroup.ALL_AGES, selectedTicketProducts.getAllAgesATSCode().orNull(), i11, null));
                i11++;
            }
        }
        return arrayListM69268i;
    }

    public static GeneralTicketSalesOrderSummaryFragment newInstance(SelectedTicketProducts selectedTicketProducts, int i10, HashMap<SupportedPaymentType, Class<?>> map, Calendar calendar, ProductCategoryDetails productCategoryDetails) {
        GeneralTicketSalesOrderSummaryFragment generalTicketSalesOrderSummaryFragment = new GeneralTicketSalesOrderSummaryFragment();
        generalTicketSalesOrderSummaryFragment.setArguments(GeneralTicketSalesArgumentBuilder.createNewInstance().withSelectedTicket(selectedTicketProducts).withViewLocation(i10).withSellableOnDate(calendar).withProductCategoryDetails(productCategoryDetails).withSupportedPaymentTypes(map).build());
        return generalTicketSalesOrderSummaryFragment;
    }

    private void processEntitlementUpgrade() {
        ImmutableSortedSet<TicketUpgradeEntitlement> chosenForUpgradeEntitlements = this.ticketUpgradeEntitlementManager.getChosenForUpgradeEntitlements();
        Iterator<TicketUpgradeEntitlement> it = this.currentUpgradeEntitlements.iterator();
        while (it.hasNext()) {
            TicketUpgradeEntitlement next = it.next();
            if (!chosenForUpgradeEntitlements.contains(next)) {
                throw new IllegalStateException("Found a ticket which was not chosen for upgrade.");
            }
            this.ticketUpgradeEntitlementManager.updateEntitlementState(next, TicketUpgradeEntitlement.EntitlementState.HAS_UPGRADED_ENTITLEMENT);
        }
        this.actionListener.updateActivityResult();
        this.currentUpgradeEntitlements = null;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.views.TicketAssignViewItem.TicketAssignViewItemActions
    public void assignFriends(TicketAssignModel ticketAssignModel) {
        if (getTicketOrderForm() != null) {
            this.actionListener.showAssignFriendScreen(getTicketOrderForm(), ticketAssignModel);
        } else {
            displayErrors(getString(C11971R.string.ticket_sales_try_again_title), this.formatters.helpDeskPhoneNumberFormatter.format(getString(C11971R.string.ticket_sales_common_error_message)), BaseOrderSummaryFragment.FragmentStateOnError.CLOSE, false, false, getString(C11971R.string.common_ok), null);
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void assignTicketToPurchaser(SelectedTicketProducts selectedTicketProducts) {
        TicketOrderForm ticketOrderForm = getTicketOrderForm();
        C22462m.m68691w(ticketOrderForm.getTicketCount() > 0, "No tickets found in ticket order.");
        if (selectedTicketProducts.getNumberOfAdultTickets() + selectedTicketProducts.getNumberOfAllAgesTickets() <= 0 || ticketOrderForm.getUserDataContainerForTicketIndex(0) != null) {
            return;
        }
        ticketOrderForm.assignTicket(0, ticketOrderForm.getPurchaser().get());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected TicketOrderForm buildOrder(TicketSalesCheckoutManager ticketSalesCheckoutManager, SelectedTicketProducts selectedTicketProducts) {
        TicketOrderFormBuilder ticketOrderFormBuilderNewTicketOrderFormBuilder = ticketSalesCheckoutManager.newTicketOrderFormBuilder(getWebStoreId(), this.productCategoryDetails.getProductCategoryType());
        if (selectedTicketProducts == null && this.purchaseFlowType == PurchaseFlowType.PURCHASE_STANDALONE_FP) {
            ticketOrderFormBuilderNewTicketOrderFormBuilder.setSessionId(this.sessionId).setPurchaserSwid(this.authenticationManager.getUserSwid()).setDestinationId(this.destinationId).setSellableOnDate(this.sellableOnDate);
        } else {
            ticketSalesCheckoutManager.populateOrderBuilder(ticketOrderFormBuilderNewTicketOrderFormBuilder, selectedTicketProducts, this.authenticationManager.getUserSwid());
        }
        return ticketOrderFormBuilderNewTicketOrderFormBuilder.build();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected final void createOrderOnServer() {
        int i10 = C120081.f32769x3a53626[this.productCategoryDetails.getProductCategoryType().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                showGenericError();
                return;
            } else {
                super.createOrderOnServer();
                return;
            }
        }
        this.currentUpgradeEntitlements = extractUpgradeEntitlements();
        if (getTicketOrderForm() == null || this.ticketSalesCheckoutManager.getSafeOrderId(Long.valueOf(getTicketOrderForm().getFormId())) == null) {
            this.ticketSalesCheckoutManager.noCache().fetchFPTicketsAndCreateUpgradeTicketOrder(getTicketOrderForm(), this.sessionId, this.destinationId, getWebStoreId(), this.affiliationType, this.discountGroupType, this.productCategoryDetails, this.currentUpgradeEntitlements, this.sellableOnDate);
            startProgressCreateOrder();
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected TicketBrickUiHelper createTicketBrickUiHelper(FlipCardAnimationUtils.FlippedViewVisibilityNotifier flippedViewVisibilityNotifier, TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper) {
        return new SelectedProductsUIHelper(null, ticketSalesAnalyticsHelper, new GeneralBrickTitleCreator(), this.actionListener.getPricePerViewCreator(), this.residentOfferManager, this, false);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment
    protected BookingApiErrorMessageInterface getErrorMessageProvider() {
        return this.bookingApiErrorMessageProvider;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return getText(C11971R.string.ticket_sales_order_summary_title);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void moveToConfirmationScreen() {
        if (this.purchaseFlowType != PurchaseFlowType.PURCHASE_STANDALONE_FP) {
            super.moveToConfirmationScreen();
        } else {
            processEntitlementUpgrade();
            this.actionListener.showOrderConfirmationScreen(this.selectedTicketProducts, Long.valueOf(getTicketOrderForm().getFormId()), !this.ticketUpgradeEntitlementManager.getChosenForUpgradeEntitlements().isEmpty(), this.sessionId);
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BlockOutDatesActionListener
    public void navigateToBlockOutDates(SelectedTicketProducts selectedTicketProducts, boolean z10) {
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) throws Resources.NotFoundException {
        super.onActivityCreated(bundle);
        if (this.ticketUpgradeEntitlementManager == null) {
            this.ticketUpgradeEntitlementManager = this.actionListener.getTicketUpgradeEntitlementManager();
        }
        this.bookingApiErrorMessageProvider = new BookingApiErrorMessageProvider(getActivity(), this.formatters);
        if (this.ticketAssignTitle == null && this.purchaseFlowType == PurchaseFlowType.PURCHASE_STANDALONE_FP) {
            this.ticketAssignTitle = (TextView) getView().findViewById(C11971R.id.ticket_assign_title);
            this.ticketAssignTitle.setContentDescription(String.format(getString(C11971R.string.ticket_sales_accessibility_buy_for_these_guests), Integer.toString(this.ticketUpgradeEntitlementManager.getChosenForUpgradeEntitlements().size()), getResources().getQuantityString(C11971R.plurals.ticket_sales_guests, this.ticketUpgradeEntitlementManager.getChosenForUpgradeEntitlements().size())));
            this.ticketAssignTitle.setText(getString(C11971R.string.ticket_sales_upgrade_entitlements_title));
            this.ticketNotRefundable.setText(getString(C11971R.string.ticket_sales_bundles_not_refundable));
            this.ticketAssignViewGroup.setImportantForAccessibility(1);
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        int ticketIndexFromResult;
        if (i10 == 55 && i11 == -1 && (ticketIndexFromResult = AssignTicketIntentHelper.getTicketIndexFromResult(intent)) >= 0 && ticketIndexFromResult < getTicketOrderForm().getTicketCount()) {
            getTicketOrderForm().assignTicket(ticketIndexFromResult, AssignTicketIntentHelper.getSelectedFriendFromResult(intent));
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ((GeneralTicketSalesUiComponentProvider) context.getApplicationContext()).getGeneralTicketSalesUiComponent().inject(this);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (bundle != null) {
            this.productCategoryDetails = (ProductCategoryDetails) bundle.getSerializable(TicketSalesConstants.KEY_ARG_PRODUCT_CATEGORY_DETAILS);
            this.sessionId = bundle.getString(SESSION_ID);
            this.destinationId = (DestinationId) bundle.getSerializable(DESTINATION_ID);
            this.affiliationType = (AffiliationType) bundle.getSerializable(AFFILIATION_TYPE);
            this.discountGroupType = bundle.getString(DISCOUNT_GROUP_TYPE);
            return;
        }
        if (arguments != null) {
            this.affiliationType = (AffiliationType) arguments.getSerializable(AFFILIATION_TYPE);
            this.productCategoryDetails = (ProductCategoryDetails) arguments.getSerializable(TicketSalesConstants.KEY_ARG_PRODUCT_CATEGORY_DETAILS);
            this.sessionId = arguments.getString(SESSION_ID);
            this.destinationId = (DestinationId) arguments.getSerializable(DESTINATION_ID);
            this.discountGroupType = arguments.getString(DISCOUNT_GROUP_TYPE);
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment
    @Subscribe
    public void onCreateTicketOrderEvent(CreateTicketOrderEvent createTicketOrderEvent) {
        super.onCreateTicketOrderEvent(createTicketOrderEvent);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.orderSummaryAssignList = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C11971R.layout.ticket_sales_fragment_assign_list, (ViewGroup) viewOnCreateView.findViewById(C11971R.id.order_summary_assign_purchaser_container), true);
        this.ticketNotRefundable = (TextView) viewOnCreateView.findViewById(C11971R.id.tickets_not_refundable);
        this.ticketNotRefundable.setText(WebStoreId.DLR_MOBILE.equals(getWebStoreId()) ? getString(C11971R.string.ticket_sales_dlr_non_refundable) : getString(C11971R.string.ticket_sales_tickets_not_refundable));
        this.ticketNotRefundable.setVisibility(0);
        this.ticketAssignViewGroup = (ViewGroup) viewOnCreateView.findViewById(C11971R.id.ticket_assign_view_group);
        TextView textView = (TextView) viewOnCreateView.findViewById(C11971R.id.ticket_reassign_subtitle);
        this.ticketReassignSubtitle = textView;
        textView.setVisibility(WebStoreId.isDLR(getWebStoreId()) ? 0 : 8);
        return viewOnCreateView;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    @Subscribe
    public void onFetchFPTicketAndOrderForm(FetchFPTicketEvent fetchFPTicketEvent) {
        super.onFetchFPTicketAndOrderForm(fetchFPTicketEvent);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    @Subscribe
    public void onFetchUserIdentificationProfileAndPayment(ProfileManager.UserIdProfileAndPaymentEvent userIdProfileAndPaymentEvent) {
        super.onFetchUserIdentificationProfileAndPayment(userIdProfileAndPaymentEvent);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.views.TicketAssignViewItem.TicketAssignViewItemActions
    public final void onNameAdded(TicketAssignModel ticketAssignModel) {
        getTicketOrderForm().assignTicket(ticketAssignModel.getTicketIndex(), ticketAssignModel.getUserDataContainer());
        validateForm();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.views.TicketAssignViewItem.TicketAssignViewItemActions
    public final void onNameRemoved(TicketAssignModel ticketAssignModel) {
        getTicketOrderForm().removeTicket(ticketAssignModel.getTicketIndex());
        validateForm();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment
    @Subscribe
    public void onPurchaseTicketOrderEvent(PurchaseTicketOrderEvent purchaseTicketOrderEvent) {
        super.onPurchaseTicketOrderEvent(purchaseTicketOrderEvent);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable(TicketSalesConstants.KEY_ARG_PRODUCT_CATEGORY_DETAILS, this.productCategoryDetails);
        bundle.putString(SESSION_ID, this.sessionId);
        bundle.putSerializable(DESTINATION_ID, this.destinationId);
        bundle.putSerializable(AFFILIATION_TYPE, this.affiliationType);
        bundle.putString(DISCOUNT_GROUP_TYPE, this.discountGroupType);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void populateTicketAssignList(SelectedTicketProducts selectedTicketProducts, TicketSalesConfigManager ticketSalesConfigManager) {
        this.ticketAssignViewGroup.removeAllViews();
        List<TicketAssignModel> ticketAssignModelList = getTicketAssignModelList(this.selectedTicketProducts, this.currentUpgradeEntitlements);
        TicketAssignViewItemFactory ticketAssignViewItemFactory = new TicketAssignViewItemFactory(getActivity(), ticketSalesConfigManager, selectedTicketProducts, this.ticketSalesAnalyticsHelper, this, this.purchaseFlowType);
        Iterator<TicketAssignModel> it = ticketAssignModelList.iterator();
        while (it.hasNext()) {
            this.ticketAssignViewGroup.addView(ticketAssignViewItemFactory.createTicketAssignViewItem(it.next()));
        }
        this.orderSummaryAssignList.setVisibility(ticketAssignModelList.size() > 0 ? 0 : 8);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void trackOrderSummaryState(SelectedTicketProducts selectedTicketProducts) {
        Map<String, String> mapPopulateOrderSummaryTrackStateContext = this.analyticsManager.populateOrderSummaryTrackStateContext(selectedTicketProducts, this.currentUpgradeEntitlements, this.ticketSalesAnalyticsHelper, this.ticketSalesCheckoutManager.getOrderId(Long.valueOf(getTicketOrderForm().getFormId())));
        if (this.purchaseFlowType == PurchaseFlowType.PURCHASE_STANDALONE_FP) {
            mapPopulateOrderSummaryTrackStateContext.put("&&products", TicketSalesAnalyticsUtil.getAnalyticsProductStringWithEvar36(selectedTicketProducts));
        } else {
            mapPopulateOrderSummaryTrackStateContext.put("&&products", TicketSalesAnalyticsUtil.getAnalyticsProductString(selectedTicketProducts));
            if (selectedTicketProducts.getNumberOfSelectedDays().intValue() == 1) {
                mapPopulateOrderSummaryTrackStateContext.put("ticket.tier", this.ticketSalesCheckoutManager.getCalendarIds(Long.valueOf(getTicketOrderForm().getFormId())).orNull());
            }
        }
        if (this.residentOfferManager.shouldHandleResidentOffer()) {
            mapPopulateOrderSummaryTrackStateContext.put("offer", this.residentOfferManager.getSelectedOffer().getDisplayName());
            if (this.residentOfferManager.getUserAffiliationIdList() != null) {
                mapPopulateOrderSummaryTrackStateContext.put("affiliation", C22456g.m68633k(",").m68637f(this.residentOfferManager.getUserAffiliationIdList()));
            }
            Calendar selectedDate = this.residentOfferManager.getSelectedDate();
            if (selectedDate != null) {
                mapPopulateOrderSummaryTrackStateContext.put("cal.date", new C9350r(selectedDate.getTimeZone(), Locale.US).m39105x().format(selectedDate.getTime()));
                mapPopulateOrderSummaryTrackStateContext.put("cal.window", String.valueOf(DateUtils.subtractDays(selectedDate, Calendar.getInstance(selectedDate.getTimeZone()))));
            }
        }
        this.ticketSalesAnalyticsHelper.trackStateWithSTEM(this.analyticsManager.getOrderSummaryState(), getClass().getSimpleName(), mapPopulateOrderSummaryTrackStateContext);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void trackPurchase(SelectedTicketProducts selectedTicketProducts) {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("&&products", TicketSalesAnalyticsUtil.getAnalyticsProductString(selectedTicketProducts));
        defaultContext.put("link.category", TicketSalesAnalyticsUtil.getAnalyticsLinkCategory(selectedTicketProducts));
        defaultContext.put(TicketSalesAnalyticsConstants.TICKET_SALES_KEY_TICKET_DAYS, String.valueOf(selectedTicketProducts.getNumberOfSelectedDays()));
        defaultContext.put("store", "Consumer");
        if (this.residentOfferManager.isResidentOffersEnabled()) {
            this.ticketSalesAnalyticsHelper.trackLocation(this.locationMonitor.mo38959c(true), this.ticketSalesAnalyticsHelper.getDefaultContext());
            TicketSalesAnalyticsUtil.m38039xcbd692c5(defaultContext, selectedTicketProducts);
        }
        this.ticketSalesAnalyticsHelper.trackAction(this.analyticsManager.getPurchaseAction(), defaultContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            GeneralOrderSummaryActions generalOrderSummaryActions = (GeneralOrderSummaryActions) activity;
            this.actionListener = generalOrderSummaryActions;
            this.ticketUpgradeEntitlementManager = generalOrderSummaryActions.getTicketUpgradeEntitlementManager();
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement GeneralOrderSummaryActions");
        }
    }

    public static GeneralTicketSalesOrderSummaryFragment newInstance(String str, int i10, HashMap<SupportedPaymentType, Class<?>> map, TicketSalesParams ticketSalesParams) {
        GeneralTicketSalesOrderSummaryFragment generalTicketSalesOrderSummaryFragment = new GeneralTicketSalesOrderSummaryFragment();
        generalTicketSalesOrderSummaryFragment.setArguments(GeneralTicketSalesArgumentBuilder.createNewInstance().withAffiliationType(ticketSalesParams.getAffiliationType()).withDiscountGroupType(ticketSalesParams.getDiscountGroupType()).withProductCategoryDetails(ticketSalesParams.getProductCategoryDetails()).withSessionId(str).withDestinationId(ticketSalesParams.getDestinationId()).withViewLocation(i10).withWebstoreId(ticketSalesParams.getWebStoreId()).withSellableOnDate(ticketSalesParams.getSellableOnDate().orNull()).withSupportedPaymentTypes(map).build());
        return generalTicketSalesOrderSummaryFragment;
    }
}