package com.disney.wdpro.universal_checkout_ui.p459ui.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractC3694e0;
import androidx.fragment.app.Fragment;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.utils.C9384u;
import com.disney.wdpro.profile_ui.ProfileConfiguration;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.support.activities.FoundationStackActivity;
import com.disney.wdpro.support.dialog.C20700f;
import com.disney.wdpro.support.widget.SnowballHeader;
import com.disney.wdpro.universal_checkout_ui.C21435R;
import com.disney.wdpro.universal_checkout_ui.UniversalCheckoutConfiguration;
import com.disney.wdpro.universal_checkout_ui.p459ui.Constants;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.disney.wdpro.universal_checkout_ui.p459ui.p460di.UniversalCheckoutComponentProvider;
import com.disney.wdpro.universal_checkout_ui.p459ui.views.SuperscriptSpanAdjuster;
import com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper;
import com.google.android.material.appbar.AppBarLayout;
import com.squareup.otto.Subscribe;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridFragment;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.print.PrintPlugin;
import javax.inject.Inject;

/* loaded from: classes20.dex */
public class DVICActivity extends FoundationStackActivity implements UniversalCheckoutHelper.UniversalCheckoutHelperListener, UniversalCheckoutHelper.DVICNativeInterstitialListener {
    private static final String BUNDLE_URL = "BUNDLE_URL";
    private HybridCoordinator coordinator;

    @Inject
    protected UniversalCheckoutEnvironment environment;
    private LinearLayout loader;
    private Context originalContext;

    @Inject
    protected ProfileConfiguration profileConfiguration;

    @Inject
    protected ProfileManager profileManager;
    private ProgressBar progressBar;
    private String startUrl;

    @Inject
    protected UniversalCheckoutConfiguration universalCheckoutConfiguration;

    @Inject
    protected UniversalCheckoutDataManager universalCheckoutDataManager;
    private UniversalCheckoutHelper universalCheckoutHelper;

    @Inject
    protected C9248i vendomatic;
    private WebView webView;
    private SnowballHeader webViewHeader;

    private void adjustSuperScriptAppearance(SpannableString spannableString, int i10, String str) {
        if (i10 != -1) {
            spannableString.setSpan(new SuperscriptSpanAdjuster(), i10, str.length() + i10, 33);
        }
    }

    private boolean canWebViewGoBack() {
        WebView webView = this.webView;
        return (webView == null || webView.getUrl() == null || this.webView.getUrl().contains(this.startUrl) || !this.webView.canGoBack()) ? false : true;
    }

    public static Intent createIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) DVICActivity.class);
        intent.putExtra(BUNDLE_URL, str);
        return intent;
    }

    private void hideNavigationHeader() {
        this.webViewHeader.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onShowDialog$0(String str, DialogInterface dialogInterface, int i10) {
        if (str.contains(Constants.CHASE_GATEWAY_PATH)) {
            this.universalCheckoutHelper.sendContinueButtonEvent();
        }
        this.universalCheckoutHelper.navigateToChaseScreen(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onShowDialog$1(DialogInterface dialogInterface, int i10) {
        this.universalCheckoutHelper.sendCancelButtonEvent();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadDVIC() {
        if (this.webView == null) {
            this.webView = this.coordinator.getHybridFragment().webView;
            this.universalCheckoutHelper.lambda$requestTokenForSSO$0();
        }
    }

    private void setNavigationDrawable(Drawable drawable) {
        this.webViewHeader.setNavigationIcon(drawable);
    }

    private void webViewGoBack() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.goBack();
        }
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.originalContext = context;
    }

    public void hideLoader() {
        this.loader.setVisibility(8);
        this.progressBar.setVisibility(8);
    }

    @Override // com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.UniversalCheckoutHelperListener
    public void initWebHybrid() {
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10000 && i11 == 20000) {
            finish();
        }
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        HybridCoordinator hybridCoordinator = this.coordinator;
        if (hybridCoordinator != null && hybridCoordinator.getHybridFragment() != null && this.universalCheckoutHelper.isModalOpened()) {
            this.coordinator.getHybridFragment().sendBackButtonEvent();
        } else if (canWebViewGoBack()) {
            webViewGoBack();
        } else {
            this.universalCheckoutDataManager.setReloadUC(true);
            super.onBackPressed();
        }
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ((UniversalCheckoutComponentProvider) getApplication()).getUniversalCheckoutComponent().inject(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.startUrl = extras.getString(BUNDLE_URL);
        }
        super.onCreate(bundle);
        setContentView(C21435R.layout.universal_checkout_hybrid_view_with_header_activity);
        try {
            getStackComponent().getToolbar().hide();
        } catch (UnsupportedOperationException e10) {
            e10.getMessage();
        }
        this.loader = (LinearLayout) findViewById(C21435R.id.loader);
        this.progressBar = (ProgressBar) findViewById(C21435R.id.progress);
        this.webViewHeader = (SnowballHeader) findViewById(C21435R.id.toolbar);
        ((CoordinatorLayout.C3257e) ((FrameLayout) findViewById(C21435R.id.container)).getLayoutParams()).m16687o(new AppBarLayout.ScrollingViewBehavior());
        showLoader(0);
        hideNavigationHeader();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.webView;
        if (webView != null) {
            webView.stopLoading();
        }
    }

    @Subscribe
    public void onFetchJwtToken(UniversalCheckoutDataManager.JwtTokenResponseEvent jwtTokenResponseEvent) {
        this.universalCheckoutHelper.onReadyForSSO();
    }

    @Subscribe
    public void onLoginEvent(ProfileManager.LoginDataEvent loginDataEvent) {
        DVICActivity dVICActivity;
        if (loginDataEvent.isSuccess()) {
            this.universalCheckoutDataManager.setJwt(null);
            this.universalCheckoutDataManager.fetchProfile();
            return;
        }
        hideLoader();
        if (this.universalCheckoutHelper == null) {
            dVICActivity = this;
            dVICActivity.universalCheckoutHelper = new UniversalCheckoutHelper(dVICActivity, this.environment, this.navigator, this.analyticsHelper, this.authenticationManager, true, this.profileManager, this.universalCheckoutDataManager, this.universalCheckoutConfiguration, this.vendomatic);
        } else {
            dVICActivity = this;
        }
        dVICActivity.universalCheckoutHelper.showErrorBanner(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    @com.squareup.otto.Subscribe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onProfileLoaded(com.disney.wdpro.universal_checkout_ui.ui.managers.UniversalCheckoutDataManager.ProfileEvent r9) {
        /*
            r8 = this;
            boolean r0 = r9.isSuccess()
            if (r0 == 0) goto L6e
            java.lang.Object r9 = r9.getPayload()
            com.disney.wdpro.service.model.Profile r9 = (com.disney.wdpro.service.model.Profile) r9
            if (r9 == 0) goto L5e
            com.disney.wdpro.service.model.PersonName r0 = r9.getName()
            if (r0 == 0) goto L5e
            com.disney.wdpro.httpclient.authentication.AuthenticationManager r0 = r8.authenticationManager
            java.lang.String r0 = r0.getUserSwid()
            boolean r0 = com.google.common.base.C22466q.m68722b(r0)
            if (r0 != 0) goto L5e
            r0 = 0
            r8.webView = r0
            com.disney.wdpro.universal_checkout_ui.models.RememberMeCookie r1 = new com.disney.wdpro.universal_checkout_ui.models.RememberMeCookie
            com.disney.wdpro.service.model.PersonName r2 = r9.getName()
            com.google.common.base.Optional r2 = r2.getFirstName()
            java.lang.Object r2 = r2.orNull()
            java.lang.String r2 = (java.lang.String) r2
            com.disney.wdpro.service.model.PersonName r3 = r9.getName()
            com.google.common.base.Optional r3 = r3.getLastName()
            java.lang.Object r3 = r3.orNull()
            java.lang.String r3 = (java.lang.String) r3
            com.disney.wdpro.service.model.Avatar r4 = r9.getAvatar()
            if (r4 == 0) goto L4f
            com.disney.wdpro.service.model.Avatar r0 = r9.getAvatar()
            java.lang.String r0 = r0.getId()
        L4f:
            r4 = r0
            com.disney.wdpro.httpclient.authentication.AuthenticationManager r0 = r8.authenticationManager
            java.lang.String r5 = r0.getUserSwid()
            java.lang.String r6 = r9.getEmail()
            r1.<init>(r2, r3, r4, r5, r6)
            goto L7e
        L5e:
            com.disney.wdpro.universal_checkout_ui.models.RememberMeCookie r2 = new com.disney.wdpro.universal_checkout_ui.models.RememberMeCookie
            com.disney.wdpro.httpclient.authentication.AuthenticationManager r9 = r8.authenticationManager
            java.lang.String r6 = r9.getUserSwid()
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L7d
        L6e:
            com.disney.wdpro.universal_checkout_ui.models.RememberMeCookie r2 = new com.disney.wdpro.universal_checkout_ui.models.RememberMeCookie
            com.disney.wdpro.httpclient.authentication.AuthenticationManager r9 = r8.authenticationManager
            java.lang.String r6 = r9.getUserSwid()
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
        L7d:
            r1 = r2
        L7e:
            com.disney.wdpro.universal_checkout_ui.ui.managers.UniversalCheckoutDataManager r9 = r8.universalCheckoutDataManager
            boolean r9 = r9.hasRequestedForSecondaryLogin()
            if (r9 == 0) goto L92
            com.disney.wdpro.universal_checkout_ui.ui.managers.UniversalCheckoutDataManager r9 = r8.universalCheckoutDataManager
            r0 = 0
            r9.setHasRequestedForSecondaryLogin(r0)
            com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper r8 = r8.universalCheckoutHelper
            r8.sendSecondaryLoginResult(r1)
            return
        L92:
            java.lang.String r9 = r1.encode()
            r8.initWebHybrid(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.universal_checkout_ui.p459ui.activities.DVICActivity.onProfileLoaded(com.disney.wdpro.universal_checkout_ui.ui.managers.UniversalCheckoutDataManager$ProfileEvent):void");
    }

    @Override // com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.UniversalCheckoutHelperListener
    public void onReadyForRequestItems() {
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper != null) {
            universalCheckoutHelper.updateScreenFlag();
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.DVICNativeInterstitialListener
    public void onShowDialog(CharSequence charSequence, final String str) {
        SpannableString spannableString = new SpannableString(charSequence.toString().replace("®", "®"));
        int iIndexOf = spannableString.toString().indexOf("®");
        int iLastIndexOf = spannableString.toString().lastIndexOf("®");
        adjustSuperScriptAppearance(spannableString, iIndexOf, "®");
        adjustSuperScriptAppearance(spannableString, iLastIndexOf, "®");
        new C20700f.a(this).m62550g(spannableString).m62548e(false).m62553j(C21435R.string.universal_checkout_common_continue, new DialogInterface.OnClickListener() { // from class: com.disney.wdpro.universal_checkout_ui.ui.activities.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f45074a.lambda$onShowDialog$0(str, dialogInterface, i10);
            }
        }).m62551h(getString(C21435R.string.universal_checkout_common_cancel), new DialogInterface.OnClickListener() { // from class: com.disney.wdpro.universal_checkout_ui.ui.activities.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f45076a.lambda$onShowDialog$1(dialogInterface, i10);
            }
        }).m62557n();
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.webView == null) {
            if (this.authenticationManager.isUserAuthenticated()) {
                this.universalCheckoutDataManager.fetchProfile();
            } else {
                initWebHybrid(null);
            }
        }
    }

    public void showLoader(int i10) {
        this.loader.setVisibility(0);
    }

    @Override // com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.UniversalCheckoutHelperListener
    public void updateWebViewUI(String str, boolean z10, int i10, boolean z11) {
        if (!z10 || this.loader.getVisibility() == 8) {
            hideLoader();
        } else {
            showLoader(i10);
        }
    }

    private void initWebHybrid(String str) {
        UniversalCheckoutHelper universalCheckoutHelper = new UniversalCheckoutHelper(this, this.environment, this.navigator, this.analyticsHelper, this.authenticationManager, true, this.profileManager, this.universalCheckoutDataManager, this.universalCheckoutConfiguration, this.vendomatic);
        this.universalCheckoutHelper = universalCheckoutHelper;
        universalCheckoutHelper.setUniversalCheckoutHelperListener(this);
        this.universalCheckoutHelper.setDVICNativeInterstitialListener(this);
        this.universalCheckoutHelper.initWebHybrid(Constants.DVIC_LANDING_PAGE_ENTRYPOINT, this.startUrl, str);
        HybridCoordinator coordinator = this.universalCheckoutHelper.getCoordinator();
        this.coordinator = coordinator;
        PrintPlugin printPlugin = (PrintPlugin) coordinator.getPlugin(PrintPlugin.f71779ID);
        if (printPlugin != null) {
            printPlugin.setPrintContext(this.originalContext);
        }
        this.navigator.m37387v(this.coordinator.getHybridFragment()).m37332j(C21435R.id.hybridfragment).m37330h().navigate();
        getSupportFragmentManager().m19767t1(new AbstractC3694e0.m() { // from class: com.disney.wdpro.universal_checkout_ui.ui.activities.DVICActivity.1
            @Override // androidx.fragment.app.AbstractC3694e0.m
            public void onFragmentViewCreated(AbstractC3694e0 abstractC3694e0, Fragment fragment, View view, Bundle bundle) {
                super.onFragmentViewCreated(abstractC3694e0, fragment, view, bundle);
                if (fragment instanceof HybridFragment) {
                    DVICActivity.this.universalCheckoutHelper.updateScreenFlag();
                    DVICActivity.this.showLoader(0);
                    DVICActivity.this.loadDVIC();
                }
            }
        }, false);
        if (C9384u.INSTANCE.m39212a()) {
            return;
        }
        this.universalCheckoutHelper.onFinishLoadingScreen(null, false);
        this.universalCheckoutHelper.onDisabledWebView();
    }
}