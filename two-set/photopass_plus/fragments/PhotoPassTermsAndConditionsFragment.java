package com.disney.wdpro.photopass_plus.fragments;

import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesTermsAndConditionsFragment;
import com.disney.wdpro.base_sales_ui_lib.utils.ListTagHandler;
import com.disney.wdpro.base_sales_ui_lib.utils.URLSpanNoUnderline;
import com.disney.wdpro.photopass_plus.analytics.PhotoPassAnalyticsConstants;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.product.Policy;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PolicyGroup;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes15.dex */
public class PhotoPassTermsAndConditionsFragment extends TicketSalesTermsAndConditionsFragment {
    private static final String NEW_HTML_LINE = "<br>";

    private String getHtmlPolicy(List<Policy> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strReplace = list.get(i10).getPolicyDescriptionMap().get(PolicyGroup.PolicyDescriptionKey.GUEST_POLICY_DESCRIPTION).replace("\\\\", "");
            if (!TextUtils.isEmpty(strReplace)) {
                sb2.append(strReplace);
                if (i10 + 1 < size) {
                    sb2.append("<br>");
                }
            }
        }
        return sb2.toString();
    }

    public static PhotoPassTermsAndConditionsFragment newInstance(ImmutableList<Policy> immutableList, boolean z10, boolean z11, WebStoreId webStoreId) {
        PhotoPassTermsAndConditionsFragment photoPassTermsAndConditionsFragment = new PhotoPassTermsAndConditionsFragment();
        photoPassTermsAndConditionsFragment.setArguments(TicketSalesTermsAndConditionsFragment.getArguments(immutableList, z10, z11, webStoreId));
        return photoPassTermsAndConditionsFragment;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesTermsAndConditionsFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment
    public String getAnalyticsPageName() {
        return PhotoPassAnalyticsConstants.PHOTO_PASS_STATE_TERMS_CONDITIONS;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesTermsAndConditionsFragment
    protected CharSequence parsePolicies(List<Policy> list) {
        return URLSpanNoUnderline.replaceURLSpans((Spannable) Html.fromHtml(getHtmlPolicy(list), null, new ListTagHandler()));
    }
}