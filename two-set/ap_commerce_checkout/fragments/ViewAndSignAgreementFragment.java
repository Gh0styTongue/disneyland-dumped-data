package com.disney.wdpro.ap_commerce_checkout.fragments;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.ap_commerce_checkout.errors.BookingApiErrorMessageProviderAPRenewal;
import com.disney.wdpro.ap_commerce_checkout.factory.contract.Cell;
import com.disney.wdpro.ap_commerce_checkout.factory.contract.CellFactory;
import com.disney.wdpro.ap_commerce_checkout.factory.contract.LinkCell;
import com.disney.wdpro.ap_commerce_checkout.p065di.APCommerceCheckoutProvider;
import com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.BookingApiErrorMessageInterface;
import com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment;
import com.disney.wdpro.base_sales_ui_lib.message_controller.MessageController;
import com.disney.wdpro.base_sales_ui_lib.views.ProgressLoaderNonBlocking;
import com.disney.wdpro.commons.permissions.Permissions;
import com.disney.wdpro.httpclient.C13323a0;
import com.disney.wdpro.httpclient.UnSuccessStatusException;
import com.disney.wdpro.support.accessibility.DisneyCheckBox;
import com.disney.wdpro.support.permissions.C20881j;
import com.disney.wdpro.support.permissions.C20886o;
import com.disney.wdpro.support.permissions.PermissionDialogConfig;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ContractResponse;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract.Contract;
import com.google.common.base.CaseFormat;
import com.squareup.otto.Subscribe;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes23.dex */
public class ViewAndSignAgreementFragment extends SalesLegalCopyBaseFragment implements LinkCell.OnSectionKeyPressedCallback {
    private static final int ACCESSIBILITY_FOCUS_DELAY_MILLIS = 300;
    private static final String ANALYTICS_PRODUCT_STRING = "ANALYTICS_PRODUCT_STRING";
    private static final double BOTTOM_BUFFER_FACTOR = 1.7d;
    private static final String CONTRACT_ERROR_BANNER_TITLE = "contract";
    private static final String CONTRACT_JS_TOGGLE = "javascript:toggleSignedContractState(%d)";
    private static final int INITIAL_SCROLL_POSITION = 0;
    private static final boolean IS_NOT_TRANSACTIONAL = false;
    private static final boolean IS_RETRY = true;
    private static final int PADDING_WEB_VIEW = 1000;
    private static final String PDF_NAME = "annual-pass-monthly-payment-contract.pdf";
    private static final String PERSISTED_CONTRACT = "PERSISTED_CONTRACT";
    private static final int SCALE_FACTOR = 8;
    private static final String TICKET_ORDER_FORM = "TICKET_ORDER_FORM";
    private static final double TOP_BUFFER_FACTOR = 0.5d;
    private static final int UNSUCCESS_STATUS = 500;
    private OnAgreementSignedCallback agreementSignedCallback;
    private String analyticsProductString;
    private APCommerceCheckoutManager apCommerceCheckoutManager;
    private BookingApiErrorMessageInterface bookingApiErrorMessageProvider;
    private Button closeButton;
    private ContractActionListener contractActionListener;
    private WebView contractForSave;
    private LinearLayout contractHolder;
    private TextView contractIntro;
    private ContractResponse contractResponse;
    private float contractSaveWebViewScaling;
    private DisneyCheckBox disneyCheckBox;
    private ProgressLoaderNonBlocking progressLoaderNonBlocking;
    private SaveAndShareView saveButton;
    private Button signButton;
    private Button signButtonOverlay;
    private TextView signInstruction;
    private TicketOrderForm ticketOrderForm;
    private final MessageController.MessageListener messageListener = new MessageController.MessageListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ViewAndSignAgreementFragment.1
        @Override // com.disney.wdpro.base_sales_ui_lib.message_controller.MessageController.MessageListener
        public void onNegativeButtonClick() {
            ViewAndSignAgreementFragment.this.getActivity().getSupportFragmentManager().m19739h1();
        }

        @Override // com.disney.wdpro.base_sales_ui_lib.message_controller.MessageController.MessageListener
        public void onPositiveButtonClick() {
            ViewAndSignAgreementFragment.this.apCommerceCheckoutManager.fetchContract(ViewAndSignAgreementFragment.this.ticketOrderForm, ((SalesBaseFragment) ViewAndSignAgreementFragment.this).productCategoryDetails);
        }
    };
    private WebViewClient contractForSaveWebViewClient = new WebViewClient() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ViewAndSignAgreementFragment.2
        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            webView.loadUrl(String.format(ViewAndSignAgreementFragment.CONTRACT_JS_TOGGLE, Integer.valueOf(ViewAndSignAgreementFragment.this.ticketOrderForm.isMonthlyContractSigned() ? 1 : 0)));
            ViewAndSignAgreementFragment.this.progressLoaderNonBlocking.setVisibility(8);
            int i10 = ViewAndSignAgreementFragment.this.ticketOrderForm.isMonthlyContractSigned() ? 8 : 0;
            ViewAndSignAgreementFragment.this.disneyCheckBox.setVisibility(i10);
            ViewAndSignAgreementFragment.this.signInstruction.setVisibility(i10);
            webView.loadUrl("javascript:(function(){document.body.style.paddingBottom = '1000px'})();");
            ViewAndSignAgreementFragment.this.saveButton.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f10, float f11) {
            ViewAndSignAgreementFragment.this.contractSaveWebViewScaling = f11;
        }
    };
    private SaveAndShareView.ShareViewStatusListener shareViewStatusListener = new SaveAndShareView.ShareViewStatusListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ViewAndSignAgreementFragment.3
        @Override // com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView.ShareViewStatusListener
        public void onResult(int i10) {
            ViewAndSignAgreementFragment.this.progressLoaderNonBlocking.setVisibility(8);
            if (i10 == -1) {
                ViewAndSignAgreementFragment viewAndSignAgreementFragment = ViewAndSignAgreementFragment.this;
                viewAndSignAgreementFragment.showErrorMessage(viewAndSignAgreementFragment.getString(C8689R.string.ap_commerce_save_failure_title), String.format(ViewAndSignAgreementFragment.this.getString(C8689R.string.ap_commerce_save_failure_body), ViewAndSignAgreementFragment.CONTRACT_ERROR_BANNER_TITLE), false, (MessageController.MessageListener) null);
            } else if (i10 != 0) {
                ViewAndSignAgreementFragment viewAndSignAgreementFragment2 = ViewAndSignAgreementFragment.this;
                viewAndSignAgreementFragment2.showErrorMessage(viewAndSignAgreementFragment2.getString(C8689R.string.ap_commerce_save_success_title), String.format(ViewAndSignAgreementFragment.this.getString(C8689R.string.ap_commerce_save_success_body), ViewAndSignAgreementFragment.CONTRACT_ERROR_BANNER_TITLE), false, (MessageController.MessageListener) null);
            } else {
                ViewAndSignAgreementFragment viewAndSignAgreementFragment3 = ViewAndSignAgreementFragment.this;
                viewAndSignAgreementFragment3.showErrorMessage(viewAndSignAgreementFragment3.getString(C8689R.string.ap_commerce_save_running_title), ViewAndSignAgreementFragment.this.getString(C8689R.string.ap_commerce_save_contract_running_body), false, (MessageController.MessageListener) null);
            }
        }

        @Override // com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView.ShareViewStatusListener
        public void onStart() {
            if (ViewAndSignAgreementFragment.this.externalDocWritePermission()) {
                ViewAndSignAgreementFragment.this.progressLoaderNonBlocking.setMessage(ViewAndSignAgreementFragment.this.getString(C8689R.string.ap_commerce_saving));
                ViewAndSignAgreementFragment.this.progressLoaderNonBlocking.setVisibility(0);
            }
        }
    };

    public interface ContractActionListener {
        void onContractPersisted(ContractResponse contractResponse);

        void onKeySectionClicked(String str, Contract contract);
    }

    public interface OnAgreementSignedCallback {
        void onAgreementSigned(boolean z10);
    }

    private void initializeContract() throws UnsupportedEncodingException {
        try {
            List listAsList = Arrays.asList(this.contractResponse.getContract());
            for (int i10 = 0; i10 < listAsList.size(); i10++) {
                Contract contract = (Contract) listAsList.get(i10);
                LinearLayout linearLayout = new LinearLayout(getActivity());
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.setOrientation(1);
                if (contract.getAttributes().getBorderStyleKey() != null) {
                    int thicknessKey = contract.getAttributes().getBorderStyleKey().getThicknessKey();
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setStroke(thicknessKey, getActivity().getResources().getColor(C8689R.color.black));
                    linearLayout.setBackground(gradientDrawable);
                    int dimension = (int) getContext().getResources().getDimension(C8689R.dimen.ap_commerce_checkout_contract_break_padding);
                    int dimension2 = (int) getContext().getResources().getDimension(C8689R.dimen.ap_commerce_checkout_contract_padding);
                    if (thicknessKey == 0) {
                        linearLayout.setPadding(0, dimension, 0, dimension);
                    } else {
                        linearLayout.setPadding(dimension2, dimension, dimension2, dimension);
                    }
                }
                Cell cell = new CellFactory().getCell(contract.getCellType());
                cell.setMonthlyContractSigned(this.ticketOrderForm.isMonthlyContractSigned());
                cell.create(this, contract, linearLayout);
                this.contractHolder.addView(linearLayout);
            }
            String contractForWeb = this.contractResponse.getContractForWeb();
            try {
                contractForWeb = URLDecoder.decode(contractForWeb, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                e10.getMessage();
            }
            this.contractForSave.loadData(contractForWeb, "text/html", "UTF-8");
            this.contractForSave.setWebViewClient(this.contractForSaveWebViewClient);
        } catch (Exception e11) {
            this.progressLoaderNonBlocking.setVisibility(8);
            showServiceFailureAlert();
            e11.getMessage();
        }
    }

    public static ViewAndSignAgreementFragment newInstance(TicketOrderForm ticketOrderForm, ContractResponse contractResponse, String str) {
        ViewAndSignAgreementFragment viewAndSignAgreementFragment = new ViewAndSignAgreementFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(TICKET_ORDER_FORM, ticketOrderForm);
        bundle.putSerializable(PERSISTED_CONTRACT, contractResponse);
        bundle.putString(ANALYTICS_PRODUCT_STRING, str);
        viewAndSignAgreementFragment.setArguments(bundle);
        return viewAndSignAgreementFragment;
    }

    private void populateContract() throws UnsupportedEncodingException {
        if (this.contractResponse == null) {
            this.apCommerceCheckoutManager.fetchContract(this.ticketOrderForm, this.productCategoryDetails);
            return;
        }
        this.progressLoaderNonBlocking.setVisibility(8);
        this.saveButton.setVisibility(0);
        initializeContract();
    }

    private void showErrorMessage(String str, String str2, boolean z10) {
        showAlert(str, str2, z10, false, getString(C8689R.string.retry_button), null, this.messageListener);
    }

    private void showFetchContractTimeOutAlert() {
        showErrorMessage(getString(C8689R.string.ticket_sales_try_again_title), getString(C8689R.string.ap_commerce_contract_fetch_error), true);
    }

    private void showNonRetriableAlertMessage(BookingApiErrorMessageInterface.ErrorMessage errorMessage) {
        showErrorMessage(errorMessage.title, errorMessage.body, false);
    }

    private void showServiceFailureAlert() {
        String string = getString(C8689R.string.ticket_sales_try_again_title);
        String string2 = getString(C8689R.string.wdw_ap_renewal_help_desk_phone_number_locale);
        if (!WebStoreId.isWDW(this.ticketOrderForm.getWebStoreId())) {
            string2 = getString(C8689R.string.dlr_ap_renewal_help_desk_phone_number_locale);
        }
        showErrorMessage(string, String.format(getString(C8689R.string.ap_commerce_contract_service_failure_connection), string2), true);
    }

    private void trackState() {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("&&products", this.analyticsProductString);
        defaultContext.put("party.size", String.valueOf(this.ticketOrderForm.getTicketCount()));
        this.ticketSalesAnalyticsHelper.trackStateWithSTEM(getAnalyticsPage(), getClass().getSimpleName(), defaultContext);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return this.analyticsManager.getViewAndSignAgreementState();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return getString(C8689R.string.view_and_sign_agreement_title);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) throws UnsupportedEncodingException {
        super.onActivityCreated(bundle);
        this.bookingApiErrorMessageProvider = new BookingApiErrorMessageProviderAPRenewal(getContext(), this.formatters);
        this.agreementSignedCallback = (OnAgreementSignedCallback) getTargetFragment();
        populateContract();
        trackState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.SalesLegalCopyBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.contractActionListener = (ContractActionListener) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context.toString() + " must implement ContractActionListener");
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.apCommerceCheckoutManager = ((APCommerceCheckoutProvider) getActivity().getApplication()).getAPCommerceCheckoutComponent().getAPCommerceCheckoutManager();
        Bundle arguments = getArguments();
        if (bundle != null) {
            this.ticketOrderForm = (TicketOrderForm) bundle.getSerializable(TICKET_ORDER_FORM);
            this.contractResponse = (ContractResponse) bundle.getSerializable(PERSISTED_CONTRACT);
            this.analyticsProductString = bundle.getString(ANALYTICS_PRODUCT_STRING);
        } else if (arguments != null) {
            TicketOrderForm ticketOrderForm = (TicketOrderForm) arguments.getSerializable(TICKET_ORDER_FORM);
            this.ticketOrderForm = ticketOrderForm;
            this.contractResponse = ticketOrderForm.isMonthlyContractSigned() ? (ContractResponse) arguments.getSerializable(PERSISTED_CONTRACT) : null;
            this.analyticsProductString = arguments.getString(ANALYTICS_PRODUCT_STRING);
        }
        TicketOrderForm ticketOrderForm2 = this.ticketOrderForm;
        if (ticketOrderForm2 != null && this.analyticsProductString != null) {
            this.ticketSalesAnalyticsHelper.initHelper(ticketOrderForm2.getWebStoreId());
            return;
        }
        String simpleName = ViewAndSignAgreementFragment.class.getSimpleName();
        throw new IllegalArgumentException(simpleName + " launched without arguments. Please use " + simpleName + ".newInstance() method.");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C8689R.layout.ap_commerce_fragment_view_and_sign_layout, viewGroup, false);
        this.progressLoaderNonBlocking = (ProgressLoaderNonBlocking) viewInflate.findViewById(C8689R.id.progress_spinner);
        this.disneyCheckBox = (DisneyCheckBox) viewInflate.findViewById(C8689R.id.checkbox_select);
        this.signInstruction = (TextView) viewInflate.findViewById(C8689R.id.sign_instruction);
        this.signButton = (Button) viewInflate.findViewById(C8689R.id.button_sign);
        Button button = (Button) viewInflate.findViewById(C8689R.id.button_sign_overlay);
        this.signButtonOverlay = button;
        button.setVisibility(0);
        this.contractIntro = (TextView) viewInflate.findViewById(C8689R.id.contract_intro);
        this.contractHolder = (LinearLayout) viewInflate.findViewById(C8689R.id.contract_holder);
        this.contractForSave = (WebView) viewInflate.findViewById(C8689R.id.contract_for_save);
        WebView.enableSlowWholeDocumentDraw();
        this.contractForSave.getSettings().setJavaScriptEnabled(true);
        this.contractForSave.setSaveEnabled(true);
        this.contractForSave.getSettings().setBuiltInZoomControls(true);
        getActivity().getWindowManager().getDefaultDisplay().getSize(new Point());
        this.contractForSave.setInitialScale((int) (r5.x / 8.0f));
        this.closeButton = (Button) viewInflate.findViewById(C8689R.id.button_close);
        SaveAndShareView saveAndShareView = (SaveAndShareView) viewInflate.findViewById(C8689R.id.save_and_share_view_contract);
        this.saveButton = saveAndShareView;
        saveAndShareView.setShareViewStatusListener(this.shareViewStatusListener);
        if (this.ticketOrderForm.isMonthlyContractSigned()) {
            this.signButton.setVisibility(8);
            this.signButtonOverlay.setVisibility(8);
            this.closeButton.setVisibility(0);
        } else {
            this.closeButton.setVisibility(8);
        }
        this.disneyCheckBox.setText(getString(C8689R.string.ap_commerce_18_years_of_age));
        this.disneyCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ViewAndSignAgreementFragment.4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                if (ViewAndSignAgreementFragment.this.progressLoaderNonBlocking.getVisibility() == 0) {
                    ViewAndSignAgreementFragment.this.signButtonOverlay.setEnabled(true);
                    ViewAndSignAgreementFragment.this.signButton.setEnabled(false);
                } else {
                    ViewAndSignAgreementFragment.this.signButtonOverlay.setVisibility(z10 ? 8 : 0);
                    ViewAndSignAgreementFragment.this.signButton.setEnabled(z10);
                }
            }
        });
        this.signButtonOverlay.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ViewAndSignAgreementFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewAndSignAgreementFragment viewAndSignAgreementFragment = ViewAndSignAgreementFragment.this;
                viewAndSignAgreementFragment.showErrorMessage("", viewAndSignAgreementFragment.getString(C8689R.string.ap_commerce_agree_and_sign_legal_validation_message), false, (MessageController.MessageListener) null);
            }
        });
        this.signButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ViewAndSignAgreementFragment.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!ViewAndSignAgreementFragment.this.ticketOrderForm.isMonthlyContractSigned()) {
                    ViewAndSignAgreementFragment.this.contractActionListener.onContractPersisted(ViewAndSignAgreementFragment.this.contractResponse);
                }
                ViewAndSignAgreementFragment.this.agreementSignedCallback.onAgreementSigned(true);
                Map<String, String> defaultContext = ((SalesBaseFragment) ViewAndSignAgreementFragment.this).ticketSalesAnalyticsHelper.getDefaultContext();
                defaultContext.put("link.category", ViewAndSignAgreementFragment.this.ticketOrderForm.getProductCategoryType().getAnalyticsLinkCategory());
                ((SalesBaseFragment) ViewAndSignAgreementFragment.this).ticketSalesAnalyticsHelper.trackAction("SignAgreement", defaultContext);
            }
        });
        this.closeButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ViewAndSignAgreementFragment.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewAndSignAgreementFragment.this.getActivity().getSupportFragmentManager().m19739h1();
            }
        });
        this.saveButton.setSaveAndShareViewClient(new SaveAndShareView.SaveAndShareViewClient<WebView>() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ViewAndSignAgreementFragment.8
            @Override // com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView.SaveAndShareViewClient
            public SaveAndShareView.MetaData getMetaData() {
                return new SaveAndShareView.MetaData.MetaDataBuilder().withOutputFileName(ViewAndSignAgreementFragment.PDF_NAME).withOutputFileType(SaveAndShareView.MetaData.OutputFileType.PDF).addExtra(SaveAndShareView.MetaData.Extra.VERTICAL_PADDING, 1000).addExtra(SaveAndShareView.MetaData.Extra.VERTICAL_SCALING, Float.valueOf(ViewAndSignAgreementFragment.this.contractSaveWebViewScaling)).build();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView.SaveAndShareViewClient
            public WebView getDataToShare() {
                Map<String, String> defaultContext = ((SalesBaseFragment) ViewAndSignAgreementFragment.this).ticketSalesAnalyticsHelper.getDefaultContext();
                defaultContext.put("link.category", ViewAndSignAgreementFragment.this.ticketOrderForm.getProductCategoryType().getAnalyticsLinkCategory());
                ((SalesBaseFragment) ViewAndSignAgreementFragment.this).ticketSalesAnalyticsHelper.trackAction("SaveAsPDF", defaultContext);
                return ViewAndSignAgreementFragment.this.contractForSave;
            }
        });
        return viewInflate;
    }

    @Subscribe
    public void onFetchContract(APCommerceCheckoutManager.ContractEvent contractEvent) throws UnsupportedEncodingException {
        this.crashHelper.trackTimedActionEnd("LoadTimeCommerce", "ViewAndSignAgreementContactPreview");
        if (contractEvent.isSuccess()) {
            ContractResponse payload = contractEvent.getPayload();
            this.contractResponse = payload;
            if (payload != null) {
                initializeContract();
                return;
            }
            return;
        }
        Throwable throwable = contractEvent.getThrowable();
        if (!(throwable instanceof UnSuccessStatusException)) {
            if (!(throwable instanceof SocketTimeoutException)) {
                showServiceFailureAlert();
                contractEvent.getThrowable();
                return;
            } else {
                showFetchContractTimeOutAlert();
                contractEvent.getThrowable();
                ((SocketTimeoutException) throwable).getMessage();
                return;
            }
        }
        UnSuccessStatusException unSuccessStatusException = (UnSuccessStatusException) throwable;
        try {
            if (unSuccessStatusException.getStatusCode() == 500) {
                showServiceFailureAlert();
                contractEvent.getThrowable();
                unSuccessStatusException.getStatusMessage();
            } else {
                C13323a0.a aVar = ((C13323a0) unSuccessStatusException.getServiceError()).getErrors().get(0);
                if (aVar.getSystemErrorCode() == null || !aVar.getSystemErrorCode().equals("074443")) {
                    showNonRetriableAlertMessage(this.bookingApiErrorMessageProvider.getMessage(aVar));
                } else {
                    showNonRetriableAlertMessage(this.bookingApiErrorMessageProvider.getMessage(aVar), true);
                }
            }
        } catch (Exception unused) {
            showServiceFailureAlert();
            contractEvent.getThrowable();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 808) {
            C20881j c20881j = new C20881j();
            c20881j.m63026a(Permissions.STORAGE, new PermissionDialogConfig(null, getString(C8689R.string.permission_denied_storage_message)));
            C20886o.m63042j(this, strArr, iArr, c20881j, this.analyticsHelper, this);
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable(TICKET_ORDER_FORM, this.ticketOrderForm);
        bundle.putSerializable(PERSISTED_CONTRACT, this.contractResponse);
        bundle.putString(ANALYTICS_PRODUCT_STRING, this.analyticsProductString);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.factory.contract.LinkCell.OnSectionKeyPressedCallback
    public void onSectionKeyPressed(String str, Contract contract) {
        String strM68589to = CaseFormat.LOWER_HYPHEN.m68589to(CaseFormat.UPPER_CAMEL, str.replace(getString(C8689R.string.ap_commerce_whitespace_regex), getString(C8689R.string.ticket_sales_cd_hyphen)));
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("link.category", this.ticketOrderForm.getProductCategoryType().getAnalyticsLinkCategory());
        this.ticketSalesAnalyticsHelper.trackAction(strM68589to, defaultContext);
        this.contractActionListener.onKeySectionClicked(str, contract);
    }

    private void showErrorMessage(String str, String str2, boolean z10, boolean z11) {
        showAlert(str, str2, z10, z11, getString(C8689R.string.retry_button), null, this.messageListener);
    }

    private void showNonRetriableAlertMessage(BookingApiErrorMessageInterface.ErrorMessage errorMessage, boolean z10) {
        showErrorMessage(errorMessage.title, errorMessage.body, false, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showErrorMessage(String str, String str2, boolean z10, MessageController.MessageListener messageListener) {
        showAlert(str, str2, z10, false, getString(C8689R.string.retry_button), null, messageListener);
    }
}