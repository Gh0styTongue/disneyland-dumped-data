package com.disney.wdpro.ap_commerce_checkout.fragments;

import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.ap_commerce_checkout.p066ui.StringLegalCopyConfig;
import com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView;
import com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment;
import com.disney.wdpro.base_sales_ui_lib.utils.ListTagHandler;
import com.disney.wdpro.base_sales_ui_lib.utils.URLSpanNoUnderline;
import com.disney.wdpro.commons.permissions.Permissions;
import com.disney.wdpro.support.permissions.C20881j;
import com.disney.wdpro.support.permissions.C20886o;
import com.disney.wdpro.support.permissions.PermissionDialogConfig;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import java.util.Map;

/* loaded from: classes23.dex */
public class StringLegalCopyFragment extends SalesLegalCopyBaseFragment {
    private static final boolean IS_NOT_TRANSACTIONAL = false;
    private static final String KEY_IS_SAVE_AND_SHARE_ENABLE = "key_save_and_share_enable";
    private static final String KEY_SCREEN_HEADER_SHOWN = "key_screen_header_shown";
    private static final String KEY_STRING_LEGAL_COPY = "key_string_legal_copy";
    private static final String KEY_TICKET_ORDER_FORM = "key_ticket_order_form";
    private static final String KEY_TITLE = "key_title";
    private String fileName;
    private String legalStringCopy;
    private boolean saveAndShareEnabled;
    private boolean screenHeaderShown;
    private TicketOrderForm ticketOrderForm;
    private String title;

    public static StringLegalCopyFragment newInstance(StringLegalCopyConfig stringLegalCopyConfig) {
        Bundle bundle = new Bundle();
        StringLegalCopyFragment stringLegalCopyFragment = new StringLegalCopyFragment();
        bundle.putString(KEY_TITLE, stringLegalCopyConfig.getTitle());
        bundle.putString(KEY_STRING_LEGAL_COPY, stringLegalCopyConfig.getLegalStringCopy());
        bundle.putSerializable(KEY_TICKET_ORDER_FORM, stringLegalCopyConfig.getTicketOrderForm());
        bundle.putBoolean(KEY_IS_SAVE_AND_SHARE_ENABLE, stringLegalCopyConfig.isSaveAndShareEnabled());
        bundle.putBoolean(KEY_SCREEN_HEADER_SHOWN, stringLegalCopyConfig.isScreenHeaderShown());
        stringLegalCopyFragment.setArguments(bundle);
        return stringLegalCopyFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showErrorMessage(String str, String str2, boolean z10) {
        showAlert(str, str2, z10, false, getString(C8689R.string.retry_button), null, null);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return StringLegalCopyFragment.class.getSimpleName();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return this.title;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        TicketOrderForm ticketOrderForm;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.title = arguments.getString(KEY_TITLE);
            this.legalStringCopy = arguments.getString(KEY_STRING_LEGAL_COPY);
            this.ticketOrderForm = (TicketOrderForm) arguments.getSerializable(KEY_TICKET_ORDER_FORM);
            this.saveAndShareEnabled = arguments.getBoolean(KEY_IS_SAVE_AND_SHARE_ENABLE);
            this.screenHeaderShown = arguments.getBoolean(KEY_SCREEN_HEADER_SHOWN);
        }
        if (this.title != null && this.legalStringCopy != null && (ticketOrderForm = this.ticketOrderForm) != null) {
            this.ticketSalesAnalyticsHelper.initHelper(ticketOrderForm.getWebStoreId());
            this.fileName = getTitle().toString().trim().toLowerCase().replace(' ', '-') + ".pdf";
            return;
        }
        String simpleName = StringLegalCopyFragment.class.getSimpleName();
        throw new IllegalArgumentException(simpleName + " launched without arguments. Please use " + simpleName + ".newInstance() method.");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C8689R.layout.ap_commerce_string_legal_copy_fragment_layout, viewGroup, false);
        final TextView textView = (TextView) viewInflate.findViewById(C8689R.id.ap_commerce_legal_copy_text_view);
        Spannable spannableReplaceURLSpans = URLSpanNoUnderline.replaceURLSpans((Spannable) Html.fromHtml(this.legalStringCopy, 63, null, new ListTagHandler()));
        textView.setText(spannableReplaceURLSpans);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setContentDescription(spannableReplaceURLSpans.toString().replace(getString(C8689R.string.ticket_sales_cd_hyphen), getString(C8689R.string.ticket_sales_cd_through)));
        viewInflate.findViewById(C8689R.id.save_and_share_view_divider).setVisibility(this.saveAndShareEnabled ? 0 : 8);
        SaveAndShareView saveAndShareView = (SaveAndShareView) viewInflate.findViewById(C8689R.id.save_and_share_view);
        saveAndShareView.setVisibility(this.saveAndShareEnabled ? 0 : 8);
        saveAndShareView.setShareViewStatusListener(new SaveAndShareView.ShareViewStatusListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.StringLegalCopyFragment.1
            @Override // com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView.ShareViewStatusListener
            public void onResult(int i10) {
                if (i10 != -1) {
                    StringLegalCopyFragment stringLegalCopyFragment = StringLegalCopyFragment.this;
                    stringLegalCopyFragment.showErrorMessage(stringLegalCopyFragment.getString(C8689R.string.ap_commerce_save_success_title), String.format(StringLegalCopyFragment.this.getString(C8689R.string.ap_commerce_save_success_body), StringLegalCopyFragment.this.title), false);
                } else {
                    StringLegalCopyFragment stringLegalCopyFragment2 = StringLegalCopyFragment.this;
                    stringLegalCopyFragment2.showErrorMessage(stringLegalCopyFragment2.getString(C8689R.string.ap_commerce_save_failure_title), String.format(StringLegalCopyFragment.this.getString(C8689R.string.ap_commerce_save_failure_body), StringLegalCopyFragment.this.title), false);
                }
            }

            @Override // com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView.ShareViewStatusListener
            public void onStart() {
                StringLegalCopyFragment.this.externalDocWritePermission();
            }
        });
        saveAndShareView.setSaveAndShareViewClient(new SaveAndShareView.SaveAndShareViewClient<TextView>() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.StringLegalCopyFragment.2
            @Override // com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView.SaveAndShareViewClient
            public SaveAndShareView.MetaData getMetaData() {
                return new SaveAndShareView.MetaData.MetaDataBuilder().withOutputFileName(StringLegalCopyFragment.this.fileName).withOutputFileType(SaveAndShareView.MetaData.OutputFileType.PDF).build();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView.SaveAndShareViewClient
            public TextView getDataToShare() {
                Map<String, String> defaultContext = ((SalesBaseFragment) StringLegalCopyFragment.this).ticketSalesAnalyticsHelper.getDefaultContext();
                defaultContext.put("link.category", StringLegalCopyFragment.this.ticketOrderForm.getProductCategoryType().getAnalyticsLinkCategory());
                ((SalesBaseFragment) StringLegalCopyFragment.this).ticketSalesAnalyticsHelper.trackAction("SaveAsPDF", defaultContext);
                return textView;
            }
        });
        viewInflate.findViewById(C8689R.id.screen_header).setVisibility(this.screenHeaderShown ? 0 : 8);
        viewInflate.findViewById(C8689R.id.screen_header_divider).setVisibility(this.screenHeaderShown ? 0 : 8);
        return viewInflate;
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
}