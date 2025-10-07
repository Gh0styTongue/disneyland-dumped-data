package com.disney.wdpro.ticket_sales_managers.fragments;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.base_sales_ui_lib.EntitlementType;
import com.disney.wdpro.base_sales_ui_lib.TicketSalesConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.base_sales_ui_lib.fragments.CommonFragmentActions;
import com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment;
import com.disney.wdpro.base_sales_ui_lib.interfaces.BaseSalesActions;
import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlementManager;
import com.disney.wdpro.base_sales_ui_lib.utils.TicketSalesAnalyticsUtil;
import com.disney.wdpro.commercecheckout.C9058R;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.service.model.Profile;
import com.disney.wdpro.support.dialog.Banner;
import com.disney.wdpro.support.dialog.ErrorBannerFragment;
import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AffiliationType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.disney.wdpro.ticket_sales_managers.C21167R;
import com.disney.wdpro.ticket_sales_managers.MaxPassManager;
import com.disney.wdpro.ticket_sales_managers.adapters.PartyFilterAdapter;
import com.disney.wdpro.ticket_sales_managers.models.MaxPassProductGroup;
import com.disney.wdpro.ticket_sales_managers.p451di.TicketSalesManagersProvider;
import com.google.common.collect.Lists;
import com.squareup.otto.Subscribe;
import java.util.Calendar;
import java.util.Map;
import javax.inject.Inject;
import p860q1.C31640h;

/* loaded from: classes19.dex */
public class PartyFilterFragment extends SalesBaseFragment implements TicketUpgradeEntitlementManager.UpgradeEntitlementManagerUpdateListener {
    private static final String AFFILIATION_TYPE = "affiliation_type";
    private static final String DESTINATION_ID = "destination_id";
    private static final String PRODUCT_CATEGORY_DETAILS = "product_category_details";
    private static final String SELLABLE_ON_DATE = "sellable_on_date";
    private static final String SESSION_ID = "session_id";
    private static final String TAG = "PartyFilterFragment";
    private PartyFilterFragmentActions actionListener;
    private AffiliationType affiliationType;
    private TextView btnContinue;
    private CheckBox chooseAll;
    private CompoundButton.OnCheckedChangeListener chooseAllCheckChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: com.disney.wdpro.ticket_sales_managers.fragments.PartyFilterFragment.1
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (compoundButton.isPressed()) {
                PartyFilterFragment.this.partyFilterAdapter.chooseAllPartyMembers(z10);
                PartyFilterFragment.this.trackChooseAllAction(z10);
            }
        }
    };
    private DestinationId destinationId;
    private CommonFragmentActions headerActionListener;
    private TextView learnMore;
    private View loaderLayout;

    @Inject
    MaxPassManager maxPassManager;
    private PartyFilterAdapter partyFilterAdapter;
    private ProductCategoryDetails productCategoryDetails;
    private Profile profile;
    private RecyclerView recyclerView;
    private TextView seeFastPassAvailability;
    private Calendar sellableOnDate;
    private String sessionId;
    private TicketUpgradeEntitlementManager upgradeEntitlementManager;

    @Inject
    C9248i vendomatic;
    private WebStoreId webStoreId;

    private static class ArgumentBuilder {
        private AffiliationType affiliationType;
        private DestinationId destinationId;
        private ProductCategoryDetails productCategoryDetails;
        private Calendar sellableOnDate;
        private String sessionId;
        private WebStoreId webStoreId;

        protected Bundle build() {
            Bundle bundle = new Bundle();
            bundle.putString("session_id", this.sessionId);
            bundle.putSerializable(TicketSalesConstants.KEY_ARG_WEB_STORE_ID, this.webStoreId);
            bundle.putSerializable(PartyFilterFragment.PRODUCT_CATEGORY_DETAILS, this.productCategoryDetails);
            bundle.putSerializable(PartyFilterFragment.DESTINATION_ID, this.destinationId);
            bundle.putSerializable(PartyFilterFragment.AFFILIATION_TYPE, this.affiliationType);
            bundle.putSerializable(PartyFilterFragment.SELLABLE_ON_DATE, this.sellableOnDate);
            return bundle;
        }

        ArgumentBuilder withAffiliationType(AffiliationType affiliationType) {
            this.affiliationType = affiliationType;
            return this;
        }

        ArgumentBuilder withDestinationId(DestinationId destinationId) {
            this.destinationId = destinationId;
            return this;
        }

        ArgumentBuilder withProductCategoryDetails(ProductCategoryDetails productCategoryDetails) {
            this.productCategoryDetails = productCategoryDetails;
            return this;
        }

        ArgumentBuilder withSellableOnDate(Calendar calendar) {
            this.sellableOnDate = calendar;
            return this;
        }

        ArgumentBuilder withSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        ArgumentBuilder withWebStoreId(WebStoreId webStoreId) {
            this.webStoreId = webStoreId;
            return this;
        }

        private ArgumentBuilder() {
        }
    }

    public interface PartyFilterFragmentActions extends BaseSalesActions {
        int getMaxNumberOfTicketsSupported();

        void navigateToCommerceCheckout(MaxPassProductGroup maxPassProductGroup);

        void navigateToOrderSummaryFragment(String str);

        void navigateToTicketSalesOrderWarning(String str);

        void showFastPassAvailabilityList();

        void showMaxPassLearnMoreScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchMaxPassProductsAndNavigateToCheckout() {
        this.loaderLayout.setVisibility(0);
        this.maxPassManager.fetchMaxPassProducts(this.productCategoryDetails.getProductCategoryType(), this.destinationId, this.webStoreId, Lists.m69271l(this.affiliationType.getId()), this.sessionId, this.sellableOnDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(View view) {
        showNextScreenAfterPartyFilter(this.sessionId);
        trackContinueAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$1(View view) {
        this.actionListener.showMaxPassLearnMoreScreen();
        trackLearnMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$2(View view) {
        this.actionListener.showFastPassAvailabilityList();
    }

    private void loadProfile() {
        try {
            this.profile = this.originalProfileManager.getAggregatedProfileAsync().m88998b();
        } catch (Exception e10) {
            e10.getMessage();
        }
        Profile profile = this.profile;
        if (profile == null) {
            navigateToCheckoutFlow(this.sessionId);
        } else if (profile == null || profile.isAdult()) {
            navigateToCheckoutFlow(this.sessionId);
        } else {
            showUnderAgeErrorBanner();
        }
    }

    public static PartyFilterFragment newInstance(String str, WebStoreId webStoreId, ProductCategoryDetails productCategoryDetails, DestinationId destinationId, AffiliationType affiliationType, Calendar calendar) {
        PartyFilterFragment partyFilterFragment = new PartyFilterFragment();
        ArgumentBuilder argumentBuilder = new ArgumentBuilder();
        argumentBuilder.withSessionId(str).withWebStoreId(webStoreId).withProductCategoryDetails(productCategoryDetails).withDestinationId(destinationId).withAffiliationType(affiliationType).withSellableOnDate(calendar);
        partyFilterFragment.setArguments(argumentBuilder.build());
        return partyFilterFragment;
    }

    private void showErrorBanner() {
        ErrorBannerFragment.InterfaceC20694d interfaceC20694d = new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.ticket_sales_managers.fragments.PartyFilterFragment.2
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String str) {
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String str) {
                PartyFilterFragment.this.fetchMaxPassProductsAndNavigateToCheckout();
            }
        };
        String string = getString(C21167R.string.checkout_out_of_time_error_message);
        Banner.m62482g(string, getActivity()).m62494C(getString(C21167R.string.checkout_out_of_time_error_title)).m62493B().m62518z().m62514v().m62495c(interfaceC20694d).m62498f().show(getChildFragmentManager(), TAG);
    }

    private void showUnderAgeErrorBanner() {
        Banner.m62482g(getString(C21167R.string.max_pass_error_not_adult_message), getActivity()).m62494C(getString(C21167R.string.max_pass_error_not_adult_title)).m62499g().m62495c(new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.ticket_sales_managers.fragments.PartyFilterFragment.3
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String str) {
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String str) {
            }
        }).m62498f().show(getChildFragmentManager(), TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackChooseAllAction(boolean z10) {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("link.category", this.productCategoryDetails.getProductCategoryType().getAnalyticsLinkCategory());
        this.ticketSalesAnalyticsHelper.trackAction(z10 ? "SelectAll" : TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_UNSELECT_ALL, defaultContext);
    }

    private void trackContinueAction() {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        int size = this.upgradeEntitlementManager.getChosenForUpgradeEntitlements().size();
        String analyticsDefaultProductString = TicketSalesAnalyticsUtil.getAnalyticsDefaultProductString(size);
        defaultContext.put("store", "Consumer");
        defaultContext.put("link.category", this.productCategoryDetails.getProductCategoryType().getAnalyticsLinkCategory());
        defaultContext.put("search.partysize", String.valueOf(size));
        defaultContext.put("party.size", String.valueOf(this.actionListener.getTicketUpgradeEntitlementManager().getAllEntitlements().size()));
        defaultContext.put(TicketSalesAnalyticsConstants.TICKET_SALES_KEY_TOTAL_PASSES, String.valueOf(this.upgradeEntitlementManager.getEntitlementTypeToEntitlementMap().get(EntitlementType.ANNUAL_PASS).size()));
        defaultContext.put(TicketSalesAnalyticsConstants.TICKET_SALES_KEY_TOTAL_TICKETS, String.valueOf(this.upgradeEntitlementManager.getEntitlementTypeToEntitlementMap().get(EntitlementType.THEME_PARK_TICKET).size()));
        defaultContext.put("&&products", analyticsDefaultProductString);
        this.ticketSalesAnalyticsHelper.trackAction("Continue", defaultContext);
    }

    private void trackLearnMore() {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("link.category", this.productCategoryDetails.getProductCategoryType().getAnalyticsLinkCategory());
        this.ticketSalesAnalyticsHelper.trackAction("LearnMore", defaultContext);
    }

    private void trackPartyFilterState() {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        String analyticsDefaultProductString = TicketSalesAnalyticsUtil.getAnalyticsDefaultProductString(this.upgradeEntitlementManager.getChosenForUpgradeEntitlements().size());
        defaultContext.put("store", "Consumer");
        defaultContext.put("party.size", String.valueOf(this.actionListener.getTicketUpgradeEntitlementManager().getAllEntitlements().size()));
        if (!this.upgradeEntitlementManager.getEntitlementTypeToEntitlementMap().isEmpty()) {
            defaultContext.put(TicketSalesAnalyticsConstants.TICKET_SALES_KEY_TOTAL_PASSES, String.valueOf(this.upgradeEntitlementManager.getEntitlementTypeToEntitlementMap().get(EntitlementType.ANNUAL_PASS).size()));
            defaultContext.put(TicketSalesAnalyticsConstants.TICKET_SALES_KEY_TOTAL_TICKETS, String.valueOf(this.upgradeEntitlementManager.getEntitlementTypeToEntitlementMap().get(EntitlementType.THEME_PARK_TICKET).size()));
        }
        defaultContext.put("&&products", analyticsDefaultProductString);
        this.ticketSalesAnalyticsHelper.trackStateWithSTEM("commerce/digitalbundle/purchasebundle", getClass().getSimpleName(), defaultContext);
    }

    private void updateViewState() {
        this.chooseAll.setChecked(this.upgradeEntitlementManager.getNotChosenForUpgradeEntitlements().isEmpty());
        this.btnContinue.setEnabled(!this.upgradeEntitlementManager.getChosenForUpgradeEntitlements().isEmpty());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return null;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return null;
    }

    public void navigateToCheckoutFlow(String str) {
        fetchMaxPassProductsAndNavigateToCheckout();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.upgradeEntitlementManager = this.actionListener.getTicketUpgradeEntitlementManager();
        this.partyFilterAdapter = new PartyFilterAdapter(getContext(), this.upgradeEntitlementManager);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this.recyclerView.getContext()));
        this.recyclerView.setAdapter(this.partyFilterAdapter);
        updateViewState();
        trackPartyFilterState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.actionListener = (PartyFilterFragmentActions) activity;
            this.headerActionListener = (CommonFragmentActions) activity;
            ((TicketSalesManagersProvider) getActivity().getApplication()).getTicketSalesManagersComponent().inject(this);
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement PartyFilterFragmentActions and CommonFragmentActions");
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (bundle != null) {
            this.sessionId = bundle.getString("session_id");
            this.webStoreId = (WebStoreId) bundle.getSerializable(TicketSalesConstants.KEY_ARG_WEB_STORE_ID);
            this.productCategoryDetails = (ProductCategoryDetails) bundle.getSerializable(PRODUCT_CATEGORY_DETAILS);
            this.destinationId = (DestinationId) bundle.getSerializable(DESTINATION_ID);
            this.affiliationType = (AffiliationType) bundle.getSerializable(AFFILIATION_TYPE);
            this.sellableOnDate = (Calendar) bundle.getSerializable(SELLABLE_ON_DATE);
        } else if (arguments != null) {
            this.sessionId = arguments.getString("session_id");
            this.webStoreId = (WebStoreId) arguments.getSerializable(TicketSalesConstants.KEY_ARG_WEB_STORE_ID);
            this.productCategoryDetails = (ProductCategoryDetails) arguments.getSerializable(PRODUCT_CATEGORY_DETAILS);
            this.destinationId = (DestinationId) arguments.getSerializable(DESTINATION_ID);
            this.affiliationType = (AffiliationType) arguments.getSerializable(AFFILIATION_TYPE);
            this.sellableOnDate = (Calendar) arguments.getSerializable(SELLABLE_ON_DATE);
        }
        this.ticketSalesAnalyticsHelper.initHelper(this.webStoreId);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(C21167R.layout.ticket_sales_party_filter_fragment, viewGroup, false);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(C21167R.id.check_choose_all);
        this.chooseAll = checkBox;
        checkBox.setOnCheckedChangeListener(this.chooseAllCheckChangeListener);
        View view = this.loaderLayout;
        int visibility = view != null ? view.getVisibility() : 8;
        View viewFindViewById = viewInflate.findViewById(C21167R.id.loadingLayout);
        this.loaderLayout = viewFindViewById;
        viewFindViewById.setVisibility(visibility);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C21167R.id.party_filter_recycler_view);
        this.recyclerView = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewInflate.findViewById(C21167R.id.btn_continue);
        this.btnContinue = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ticket_sales_managers.fragments.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f44162a.lambda$onCreateView$0(view2);
            }
        });
        Typeface typefaceM97205h = C31640h.m97205h(getContext(), C9058R.font.peptasia);
        TextView textView2 = (TextView) viewInflate.findViewById(C21167R.id.learn_more_icon);
        TextView textView3 = (TextView) viewInflate.findViewById(C21167R.id.see_availability_list_icon);
        textView2.setTypeface(typefaceM97205h);
        textView3.setTypeface(typefaceM97205h);
        TextView textView4 = (TextView) viewInflate.findViewById(C21167R.id.learn_more_about_mp);
        this.learnMore = textView4;
        textView4.setText(C21167R.string.ticket_sales_see_important_details_label);
        this.learnMore.setContentDescription(getString(C21167R.string.ticket_sales_learn_more_about_digital_bundle).concat(getString(C21167R.string.accessibility_label_separator)).concat(getString(C21167R.string.accessibility_button_suffix)));
        this.learnMore.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ticket_sales_managers.fragments.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f44163a.lambda$onCreateView$1(view2);
            }
        });
        TextView textView5 = (TextView) viewInflate.findViewById(C21167R.id.see_fast_pass_availability);
        this.seeFastPassAvailability = textView5;
        textView5.setContentDescription(getString(C21167R.string.ticket_sales_see_fast_pass_availability_content_description).concat(getString(C21167R.string.accessibility_label_separator)).concat(getString(C21167R.string.accessibility_button_suffix)));
        this.seeFastPassAvailability.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ticket_sales_managers.fragments.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f44164a.lambda$onCreateView$2(view2);
            }
        });
        return viewInflate;
    }

    @Subscribe
    public void onMaxPassProducts(MaxPassManager.MaxPassProductEvent maxPassProductEvent) {
        this.loaderLayout.setVisibility(8);
        if (!maxPassProductEvent.isSuccess()) {
            showErrorBanner();
        } else {
            this.actionListener.navigateToCommerceCheckout(maxPassProductEvent.getPayload());
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.upgradeEntitlementManager.unregisterListener(this);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.headerActionListener.hideHeaderTitle();
        this.upgradeEntitlementManager.registerUpdateListener(this);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("session_id", this.sessionId);
        bundle.putSerializable(TicketSalesConstants.KEY_ARG_WEB_STORE_ID, this.webStoreId);
        bundle.putSerializable(PRODUCT_CATEGORY_DETAILS, this.productCategoryDetails);
        bundle.putSerializable(DESTINATION_ID, this.destinationId);
        bundle.putSerializable(AFFILIATION_TYPE, this.affiliationType);
        bundle.putSerializable(SELLABLE_ON_DATE, this.sellableOnDate);
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.headerActionListener.showHeaderTitle();
        super.onStop();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlementManager.UpgradeEntitlementManagerUpdateListener
    public void onUpgradeEntitlementStateUpdated() {
        updateViewState();
    }

    public void showNextScreenAfterPartyFilter(String str) {
        if (this.actionListener.getTicketUpgradeEntitlementManager().getChosenForUpgradeEntitlements().size() > this.actionListener.getMaxNumberOfTicketsSupported()) {
            this.actionListener.navigateToTicketSalesOrderWarning(str);
        } else {
            loadProfile();
        }
    }
}