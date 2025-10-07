package com.disney.wdpro.universal_checkout_ui.error;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.disney.wdpro.support.dialog.Banner;
import com.disney.wdpro.support.dialog.ErrorBannerFragment;
import com.disney.wdpro.support.util.C20932b;
import com.disney.wdpro.universal_checkout_ui.C21435R;
import com.disney.wdpro.universal_checkout_ui.UniversalCheckoutConfiguration;
import com.google.common.base.C22466q;

/* loaded from: classes20.dex */
public class UniversalCheckoutErrorBannerHelper {
    private FragmentActivity activity;
    private ErrorBannerFragment errorBannerFragment;
    private String helpDeskPhoneNumber;
    private UniversalCheckoutConfiguration universalCheckoutConfiguration;

    public UniversalCheckoutErrorBannerHelper(FragmentActivity fragmentActivity, UniversalCheckoutConfiguration universalCheckoutConfiguration, String str) {
        this.activity = fragmentActivity;
        this.universalCheckoutConfiguration = universalCheckoutConfiguration;
        this.helpDeskPhoneNumber = str;
    }

    private String getAccessibilityErrorPrefix(String str, Context context) {
        String strM68725e = C22466q.m68725e(str);
        if (!C20932b.m63194q(context).m63203t()) {
            return strM68725e;
        }
        return context.getString(C21435R.string.accessibility_error) + " " + strM68725e;
    }

    public boolean isErrorBannerDisplayed() {
        ErrorBannerFragment errorBannerFragment = this.errorBannerFragment;
        return errorBannerFragment != null && errorBannerFragment.isVisible();
    }

    public void showConnectivityErrorBanner() throws Resources.NotFoundException {
        if (isErrorBannerDisplayed()) {
            this.errorBannerFragment.dismiss();
        }
        ErrorBannerFragment errorBannerFragmentM62498f = Banner.m62485j(this.activity).m62499g().m62498f();
        this.errorBannerFragment = errorBannerFragmentM62498f;
        errorBannerFragmentM62498f.show(this.activity.getSupportFragmentManager(), this.activity.getLocalClassName());
    }

    public void showCreateOrderErrorBanner() {
        if (isErrorBannerDisplayed()) {
            return;
        }
        ErrorBannerFragment errorBannerFragmentM62498f = Banner.m62482g(getAccessibilityErrorPrefix(this.activity.getString(C21435R.string.universal_checkout_common_error_message, this.helpDeskPhoneNumber), this.activity), this.activity).m62499g().m62495c(new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.universal_checkout_ui.error.UniversalCheckoutErrorBannerHelper.2
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String str) {
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String str) {
            }
        }).m62498f();
        this.errorBannerFragment = errorBannerFragmentM62498f;
        errorBannerFragmentM62498f.show(this.activity.getSupportFragmentManager(), this.activity.getLocalClassName());
    }

    public void showErrorBannerExitUC() {
        if (isErrorBannerDisplayed()) {
            return;
        }
        ErrorBannerFragment errorBannerFragmentM62498f = Banner.m62482g(getAccessibilityErrorPrefix(this.activity.getString(C21435R.string.universal_checkout_common_error_message, this.helpDeskPhoneNumber), this.activity), this.activity).m62499g().m62495c(new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.universal_checkout_ui.error.UniversalCheckoutErrorBannerHelper.3
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String str) {
                UniversalCheckoutErrorBannerHelper.this.activity.finish();
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String str) {
            }
        }).m62498f();
        this.errorBannerFragment = errorBannerFragmentM62498f;
        errorBannerFragmentM62498f.show(this.activity.getSupportFragmentManager(), this.activity.getLocalClassName());
    }

    public void showUnderAgeErrorBanner() {
        if (isErrorBannerDisplayed()) {
            return;
        }
        ErrorBannerFragment.InterfaceC20694d interfaceC20694d = new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.universal_checkout_ui.error.UniversalCheckoutErrorBannerHelper.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String str) {
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String str) {
            }
        };
        String string = this.activity.getString(C21435R.string.wdw_universal_checkout_error_not_adult_message);
        if (this.universalCheckoutConfiguration.getDestinationCode().equals("DLR")) {
            string = this.activity.getString(C21435R.string.dlr_universal_checkout_error_not_adult_message);
        }
        ErrorBannerFragment errorBannerFragmentM62498f = Banner.m62482g(getAccessibilityErrorPrefix(string, this.activity), this.activity).m62499g().m62495c(interfaceC20694d).m62498f();
        this.errorBannerFragment = errorBannerFragmentM62498f;
        errorBannerFragmentM62498f.show(this.activity.getSupportFragmentManager(), this.activity.getLocalClassName());
    }
}