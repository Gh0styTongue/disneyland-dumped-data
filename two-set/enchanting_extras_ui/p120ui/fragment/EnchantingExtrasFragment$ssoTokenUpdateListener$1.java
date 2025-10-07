package com.disney.wdpro.enchanting_extras_ui.p120ui.fragment;

import com.disney.p063id.android.OneID;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.SSOPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, m92038d2 = {"com/disney/wdpro/enchanting_extras_ui/ui/fragment/EnchantingExtrasFragment$ssoTokenUpdateListener$1", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$SSOTokenUpdateListener;", "onTokenUpdateFailure", "", "ssoPlugin", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin;", "error", "", "onTokenUpdateReady", "entryPointsConfig", "Lcom/wdpr/ee/ra/rahybrid/model/EntryPointsConfig;", "onTokenUpdateSuccess", "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes25.dex */
public final class EnchantingExtrasFragment$ssoTokenUpdateListener$1 implements SSOPlugin.SSOTokenUpdateListener {
    final /* synthetic */ EnchantingExtrasFragment this$0;

    EnchantingExtrasFragment$ssoTokenUpdateListener$1(EnchantingExtrasFragment enchantingExtrasFragment) {
        this.this$0 = enchantingExtrasFragment;
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateFailure(SSOPlugin ssoPlugin, String error) {
        Intrinsics.checkNotNullParameter(ssoPlugin, "ssoPlugin");
        Intrinsics.checkNotNullParameter(error, "error");
        RAHybridLog.m85712e(EnchantingExtrasFragment.TAG, "onTokenUpdateFailure(): " + error);
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateReady(SSOPlugin ssoPlugin, EntryPointsConfig entryPointsConfig) {
        Intrinsics.checkNotNullParameter(ssoPlugin, "ssoPlugin");
        Intrinsics.checkNotNullParameter(entryPointsConfig, "entryPointsConfig");
        RAHybridLog.m85711d(EnchantingExtrasFragment.TAG, "onTokenUpdateReady() startUrl : " + entryPointsConfig.getStartUrl());
        RAHybridLog.m85711d(EnchantingExtrasFragment.TAG, "Called when url redirects to /login/?returnUrl=");
        this.this$0.getUniversalCheckoutDataManager().setJwt(null);
        if (!this.this$0.isUserLoggedIn() || OneID.INSTANCE.shared().isLowTrust()) {
            this.this$0.navigateToLogin();
        } else {
            this.this$0.getProfileManager().fetchUserAccessInfo();
        }
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
    public void onTokenUpdateSuccess(SSOPlugin ssoPlugin, EntryPointsConfig entryPointsConfig) {
        Intrinsics.checkNotNullParameter(ssoPlugin, "ssoPlugin");
        Intrinsics.checkNotNullParameter(entryPointsConfig, "entryPointsConfig");
        RAHybridLog.m85711d(EnchantingExtrasFragment.TAG, "onTokenUpdateSuccess(): Successfully fetched token and request to load : " + entryPointsConfig.getStartUrl());
    }
}