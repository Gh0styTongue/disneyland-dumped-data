package com.disney.wdpro.ticketsaleshybrid.p452ui.fragment;

import com.disney.p063id.android.OneID;
import com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.SSOPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, m92038d2 = {"com/disney/wdpro/ticketsaleshybrid/ui/fragment/TicketSalesHybridFragment$ssoTokenUpdateListener$1", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$SSOTokenUpdateListener;", "onTokenUpdateFailure", "", "ssoPlugin", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin;", "error", "", "onTokenUpdateReady", "entryPointsConfig", "Lcom/wdpr/ee/ra/rahybrid/model/EntryPointsConfig;", "onTokenUpdateSuccess", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final class TicketSalesHybridFragment$ssoTokenUpdateListener$1 implements SSOPlugin.SSOTokenUpdateListener {
    TicketSalesHybridFragment$ssoTokenUpdateListener$1() {
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateFailure(SSOPlugin ssoPlugin, String error) {
        Intrinsics.checkNotNullParameter(ssoPlugin, "ssoPlugin");
        Intrinsics.checkNotNullParameter(error, "error");
        RAHybridLog.m85712e(TicketSalesHybridFragment.TAG, "onTokenUpdateFailure(): " + error);
        this.this$0.onFinishLoadingScreen();
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateReady(SSOPlugin ssoPlugin, EntryPointsConfig entryPointsConfig) {
        Intrinsics.checkNotNullParameter(ssoPlugin, "ssoPlugin");
        Intrinsics.checkNotNullParameter(entryPointsConfig, "entryPointsConfig");
        RAHybridLog.m85711d(TicketSalesHybridFragment.TAG, "onTokenUpdateReady() startUrl : " + entryPointsConfig.getStartUrl());
        RAHybridLog.m85711d(TicketSalesHybridFragment.TAG, "Called when url redirects to /login/?returnUrl=");
        UniversalCheckoutHelper universalCheckoutHelper = null;
        this.this$0.getUniversalCheckoutDataManager().setJwt(null);
        if (!this.this$0.isUserLoggedIn() || OneID.INSTANCE.shared().isLowTrust()) {
            this.this$0.navigateToLogin();
        } else {
            this.this$0.getProfileManager().fetchUserAccessInfo();
        }
        UniversalCheckoutHelper universalCheckoutHelper2 = this.this$0.universalCheckoutHelper;
        if (universalCheckoutHelper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
        } else {
            universalCheckoutHelper = universalCheckoutHelper2;
        }
        universalCheckoutHelper.initPopUpBridgeForPayPal();
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateSuccess(SSOPlugin ssoPlugin, EntryPointsConfig entryPointsConfig) {
        Intrinsics.checkNotNullParameter(ssoPlugin, "ssoPlugin");
        Intrinsics.checkNotNullParameter(entryPointsConfig, "entryPointsConfig");
        RAHybridLog.m85711d(TicketSalesHybridFragment.TAG, "onTokenUpdateSuccess(): Successfully fetched token and request to load : " + entryPointsConfig.getStartUrl());
        UniversalCheckoutHelper universalCheckoutHelper = this.this$0.universalCheckoutHelper;
        if (universalCheckoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper = null;
        }
        universalCheckoutHelper.initPopUpBridgeForPayPal();
    }
}