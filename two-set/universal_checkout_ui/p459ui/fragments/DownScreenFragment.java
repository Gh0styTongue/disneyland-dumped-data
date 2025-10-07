package com.disney.wdpro.universal_checkout_ui.p459ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.universal_checkout_ui.C21435R;
import com.disney.wdpro.universal_checkout_ui.UniversalCheckoutConfiguration;
import com.disney.wdpro.universal_checkout_ui.p459ui.p460di.UniversalCheckoutComponentProvider;
import javax.inject.Inject;

/* loaded from: classes20.dex */
public class DownScreenFragment extends BaseFragment {

    @Inject
    protected UniversalCheckoutConfiguration configuration;

    public static final DownScreenFragment newInstance() {
        return new DownScreenFragment();
    }

    @Override // com.disney.wdpro.commons.BaseFragment
    public String getAnalyticsPageName() {
        return "";
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ((UniversalCheckoutComponentProvider) getActivity().getApplication()).getUniversalCheckoutComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C21435R.layout.universal_checkout_down_screen, viewGroup, false);
        ((TextView) viewInflate.findViewById(C21435R.id.txt_screen_name)).setText(getString(C21435R.string.universal_checkout_header_down_screen));
        ((TextView) viewInflate.findViewById(C21435R.id.down_screen_message)).setText(getString(C21435R.string.universal_checkout_message_down_screen, this.configuration.getHelpDeskPhoneNumber()));
        return viewInflate;
    }
}