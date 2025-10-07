package com.disney.wdpro.general_ticket_sales_ui.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.disney.wdpro.base_sales_ui_lib.EntitlementType;
import com.disney.wdpro.base_sales_ui_lib.TicketSalesConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment;
import com.disney.wdpro.base_sales_ui_lib.interfaces.BaseSalesActions;
import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlementManager;
import com.disney.wdpro.base_sales_ui_lib.p070ui.models.OrderWarning;
import com.disney.wdpro.base_sales_ui_lib.utils.TicketSalesAnalyticsUtil;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.google.common.base.C22462m;
import java.util.Map;

/* loaded from: classes28.dex */
public class TicketSalesOrderWarningFragment extends SalesBaseFragment {
    private static final String KEY_ORDER_WARNING = "orderWarning";
    private static final String KEY_PRODUCT_CATEGORY_DETAILS = "product_category_details";
    private static final String KEY_SESSION_ID = "session_id";
    private OrderWarningFragmentActions actionListener;
    private OrderWarning orderWarning;
    private ProductCategoryType productCategoryType;
    private String sessionId;
    private WebStoreId webStoreId;

    private static class ArgumentBuilder {
        private OrderWarning orderWarning;
        private ProductCategoryType productCategoryType;
        private String sessionId;
        private WebStoreId webStoreId;

        protected Bundle build() {
            Bundle bundle = new Bundle();
            bundle.putString("session_id", this.sessionId);
            bundle.putSerializable(TicketSalesConstants.KEY_ARG_WEB_STORE_ID, this.webStoreId);
            bundle.putSerializable(TicketSalesOrderWarningFragment.KEY_PRODUCT_CATEGORY_DETAILS, this.productCategoryType);
            bundle.putSerializable(TicketSalesOrderWarningFragment.KEY_ORDER_WARNING, this.orderWarning);
            return bundle;
        }

        ArgumentBuilder withOrderWarning(OrderWarning orderWarning) {
            this.orderWarning = orderWarning;
            return this;
        }

        ArgumentBuilder withProductCategoryType(ProductCategoryType productCategoryType) {
            this.productCategoryType = productCategoryType;
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

    public interface OrderWarningFragmentActions extends BaseSalesActions {
        void proceedToNextActionAfterOrderWarning(String str);
    }

    public static TicketSalesOrderWarningFragment newInstance(OrderWarning orderWarning, String str, WebStoreId webStoreId, ProductCategoryType productCategoryType) {
        C22462m.m68685q(orderWarning, "orderWarning == null");
        C22462m.m68685q(productCategoryType, "productCategoryType == null");
        C22462m.m68685q(webStoreId, "webStoreId == null");
        TicketSalesOrderWarningFragment ticketSalesOrderWarningFragment = new TicketSalesOrderWarningFragment();
        ArgumentBuilder argumentBuilder = new ArgumentBuilder();
        argumentBuilder.withSessionId(str).withWebStoreId(webStoreId).withProductCategoryType(productCategoryType).withOrderWarning(orderWarning);
        ticketSalesOrderWarningFragment.setArguments(argumentBuilder.build());
        return ticketSalesOrderWarningFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackNoButton() {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("link.category", this.productCategoryType.getAnalyticsLinkCategory());
        this.ticketSalesAnalyticsHelper.trackAction("NoGoBack", defaultContext);
    }

    private void trackOrderWarningState() {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        TicketUpgradeEntitlementManager ticketUpgradeEntitlementManager = this.actionListener.getTicketUpgradeEntitlementManager();
        String analyticsDefaultProductString = TicketSalesAnalyticsUtil.getAnalyticsDefaultProductString(ticketUpgradeEntitlementManager.getChosenForUpgradeEntitlements().size());
        defaultContext.put("store", "Consumer");
        defaultContext.put("party.size", String.valueOf(this.actionListener.getTicketUpgradeEntitlementManager().getAllEntitlements().size()));
        if (!ticketUpgradeEntitlementManager.getEntitlementTypeToEntitlementMap().isEmpty()) {
            defaultContext.put(TicketSalesAnalyticsConstants.TICKET_SALES_KEY_TOTAL_PASSES, String.valueOf(ticketUpgradeEntitlementManager.getEntitlementTypeToEntitlementMap().get(EntitlementType.ANNUAL_PASS).size()));
            defaultContext.put(TicketSalesAnalyticsConstants.TICKET_SALES_KEY_TOTAL_TICKETS, String.valueOf(ticketUpgradeEntitlementManager.getEntitlementTypeToEntitlementMap().get(EntitlementType.THEME_PARK_TICKET).size()));
        }
        defaultContext.put("&&products", analyticsDefaultProductString);
        defaultContext.put("alert.message", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_PARTY_OVER_FIFTEEN);
        this.ticketSalesAnalyticsHelper.trackStateWithSTEM(TicketSalesAnalyticsConstants.TICKET_SALES_STATE_ORDER_WARNING, getClass().getSimpleName(), defaultContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackYesButton() {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("link.category", this.productCategoryType.getAnalyticsLinkCategory());
        this.ticketSalesAnalyticsHelper.trackAction(TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_YES_PROCEED, defaultContext);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return null;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return this.orderWarning.getScreenHeader();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        trackOrderWarningState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.actionListener = (OrderWarningFragmentActions) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement OrderWarningFragmentActions");
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (bundle != null) {
            this.orderWarning = (OrderWarning) bundle.getSerializable(KEY_ORDER_WARNING);
            this.sessionId = bundle.getString("session_id", this.sessionId);
            this.webStoreId = (WebStoreId) bundle.getSerializable(TicketSalesConstants.KEY_ARG_WEB_STORE_ID);
            this.productCategoryType = (ProductCategoryType) bundle.getSerializable(KEY_PRODUCT_CATEGORY_DETAILS);
        } else if (arguments != null) {
            this.orderWarning = (OrderWarning) arguments.getSerializable(KEY_ORDER_WARNING);
            this.sessionId = arguments.getString("session_id", this.sessionId);
            this.webStoreId = (WebStoreId) arguments.getSerializable(TicketSalesConstants.KEY_ARG_WEB_STORE_ID);
            this.productCategoryType = (ProductCategoryType) arguments.getSerializable(KEY_PRODUCT_CATEGORY_DETAILS);
        }
        if (this.orderWarning == null) {
            throw new IllegalArgumentException("TicketSalesOrderWarningFragment launched without arguments. Please use TicketSalesOrderWarningFragment.newInstance() method.");
        }
        this.ticketSalesAnalyticsHelper.initHelper(this.webStoreId);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C11971R.layout.ticket_sales_fragment_order_warning, viewGroup, false);
        ((TextView) viewInflate.findViewById(C11971R.id.order_warning_title_text_view)).setText(this.orderWarning.getTitle());
        ((TextView) viewInflate.findViewById(C11971R.id.order_warning_content_text_view)).setText(this.orderWarning.getContent());
        TextView textView = (TextView) viewInflate.findViewById(C11971R.id.order_warning_button_yes);
        TextView textView2 = (TextView) viewInflate.findViewById(C11971R.id.order_warning_button_no);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderWarningFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TicketSalesOrderWarningFragment.this.actionListener.proceedToNextActionAfterOrderWarning(TicketSalesOrderWarningFragment.this.sessionId);
                TicketSalesOrderWarningFragment.this.trackYesButton();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderWarningFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TicketSalesOrderWarningFragment.this.actionListener.navigateOneStepBack();
                TicketSalesOrderWarningFragment.this.trackNoButton();
            }
        });
        textView.setContentDescription(getString(C11971R.string.ticket_sales_cd_button_postfix, getString(C11971R.string.ticket_sales_yes_proceed)));
        textView2.setContentDescription(getString(C11971R.string.ticket_sales_cd_button_postfix, getString(C11971R.string.ticket_sales_go_back)));
        return viewInflate;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable(KEY_ORDER_WARNING, this.orderWarning);
        bundle.putString("session_id", this.sessionId);
        bundle.putSerializable(KEY_PRODUCT_CATEGORY_DETAILS, this.productCategoryType);
        bundle.putSerializable(TicketSalesConstants.KEY_ARG_WEB_STORE_ID, this.webStoreId);
    }
}