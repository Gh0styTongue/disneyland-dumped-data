package com.disney.wdpro.universal_checkout_ui.p459ui.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.CookieManager;
import androidx.fragment.app.Fragment;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.aligator.ScreenType;
import com.disney.wdpro.commons.utils.C9384u;
import com.disney.wdpro.support.activities.FoundationStackActivity;
import com.disney.wdpro.universal_checkout_ui.C21435R;
import com.disney.wdpro.universal_checkout_ui.analytics.UniversalCheckoutAnalyticsConfiguration;
import com.disney.wdpro.universal_checkout_ui.p459ui.fragments.DownScreenFragment;
import com.disney.wdpro.universal_checkout_ui.p459ui.fragments.UniversalCheckoutFragment;
import com.disney.wdpro.universal_checkout_ui.p459ui.p460di.UniversalCheckoutComponentProvider;
import com.disney.wdpro.universal_checkout_ui.utils.ActivityResultUtils;
import com.disney.wdpro.universal_checkout_ui.utils.HybridUtilities;
import java.util.Calendar;

/* loaded from: classes20.dex */
public class UniversalCheckoutActivity extends FoundationStackActivity {
    private static final String BUNDLE_UC_ANALYTICS_CONFIGURATION_KEY = "ucAnalyticsConfiguration";
    private static final String BUNDLE_UC_CONFIGURATION_KEY = "ucConfiguration";
    private static final String BUNDLE_UC_CUSTOM_HELP_PHONE_NUMBER_TYPE = "customHelpPhoneNumberType";
    private static final String BUNDLE_UC_ENTER_EXIT_ANIMATION_KEY = "enterExitAnimationKey";
    private static final String BUNDLE_UC_EXIT_ANIMATION_KEY = "exitAnimationKey";
    private static final String BUNDLE_UC_SYSTEM_TIME_KEY = "setSystemTime";
    private static final String BUNDLE_UC_TOGGLE_KEY = "ucToggle";
    public static final int ERROR_CREATE_ORDER = 1;
    public static final int ERROR_UNDERAGE = 2;
    public static final int RESULT_FINISH_SUCCESS = 3;
    public static final int RESULT_MODS = 5;
    public static final int RESULT_MODS_HUB = 6;
    public static final int RESULT_TICKET_SALES = 4;
    public static final int UC_REQUEST_CODE = 9687;
    private Context originalContext;
    private int finishExitAnimation = 0;
    private int finishEnterAnimation = 0;

    public static Intent createIntent(Activity activity, String str, Calendar calendar, UniversalCheckoutAnalyticsConfiguration universalCheckoutAnalyticsConfiguration, boolean z10, String str2, int i10, int i11) {
        Intent intent = new Intent(activity, (Class<?>) UniversalCheckoutActivity.class);
        intent.putExtra(BUNDLE_UC_CONFIGURATION_KEY, str);
        intent.putExtra(BUNDLE_UC_SYSTEM_TIME_KEY, calendar);
        intent.putExtra(BUNDLE_UC_ANALYTICS_CONFIGURATION_KEY, universalCheckoutAnalyticsConfiguration);
        intent.putExtra(BUNDLE_UC_TOGGLE_KEY, z10);
        intent.putExtra(C8666f.EXTRA_SCREEN_TYPE, ScreenType.STACK);
        intent.putExtra(BUNDLE_UC_CUSTOM_HELP_PHONE_NUMBER_TYPE, str2);
        intent.putExtra(BUNDLE_UC_ENTER_EXIT_ANIMATION_KEY, i10);
        intent.putExtra(BUNDLE_UC_EXIT_ANIMATION_KEY, i11);
        return intent;
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.originalContext = context;
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, android.app.Activity, com.disney.wdpro.apcommerce.ui.plugins.APHybridNavigationPlugin.APHybridNavigationPluginListener, com.disney.wdpro.apcommerce.ui.plugins.MagicKeyHybridNavigationPlugin.APHybridNavigationPluginListener, com.disney.wdpro.apcommerce.ui.plugins.PassSalesNavigationPlugin.PassSalesNavigationPluginListener
    public void finish() {
        int i10;
        super.finish();
        int i11 = this.finishExitAnimation;
        if (i11 == 0 || (i10 = this.finishEnterAnimation) == 0) {
            return;
        }
        overridePendingTransition(i10, i11);
    }

    public Context getOriginalContext() {
        return this.originalContext;
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        getSupportFragmentManager().m19752n0(C21435R.id.fragment_container).onActivityResult(ActivityResultUtils.internalAndroidRequestCodeToFragment(i10), i11, intent);
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentM19752n0 = getSupportFragmentManager().m19752n0(C21435R.id.fragment_container);
        if (!(fragmentM19752n0 instanceof UniversalCheckoutFragment)) {
            super.onBackPressed();
            return;
        }
        UniversalCheckoutFragment universalCheckoutFragment = (UniversalCheckoutFragment) fragmentM19752n0;
        if (universalCheckoutFragment.isModalOpened()) {
            universalCheckoutFragment.sendBackButtonEvent();
            return;
        }
        if (universalCheckoutFragment.isConfirmationLoaded()) {
            universalCheckoutFragment.dismiss();
            return;
        }
        if (universalCheckoutFragment.shouldShowDismissModal()) {
            universalCheckoutFragment.sendMessageToShowDismissModal();
        } else if (universalCheckoutFragment.canWebViewGoBack()) {
            universalCheckoutFragment.webViewGoBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String string;
        boolean z10;
        Calendar calendar;
        UniversalCheckoutAnalyticsConfiguration universalCheckoutAnalyticsConfiguration;
        String string2;
        ((UniversalCheckoutComponentProvider) getApplication()).getUniversalCheckoutComponent().inject(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            string = extras.getString(BUNDLE_UC_CONFIGURATION_KEY);
            calendar = (Calendar) extras.getSerializable(BUNDLE_UC_SYSTEM_TIME_KEY);
            universalCheckoutAnalyticsConfiguration = (UniversalCheckoutAnalyticsConfiguration) extras.getSerializable(BUNDLE_UC_ANALYTICS_CONFIGURATION_KEY);
            z10 = extras.getBoolean(BUNDLE_UC_TOGGLE_KEY);
            string2 = extras.getString(BUNDLE_UC_CUSTOM_HELP_PHONE_NUMBER_TYPE);
            this.finishEnterAnimation = extras.getInt(BUNDLE_UC_ENTER_EXIT_ANIMATION_KEY);
            this.finishExitAnimation = extras.getInt(BUNDLE_UC_EXIT_ANIMATION_KEY);
        } else {
            string = null;
            z10 = false;
            calendar = null;
            universalCheckoutAnalyticsConfiguration = null;
            string2 = null;
        }
        super.onCreate(bundle);
        setContentView(C21435R.layout.universal_checkout_main_activity);
        try {
            getStackComponent().getToolbar().hide();
        } catch (UnsupportedOperationException e10) {
            e10.getMessage();
        }
        if (z10) {
            this.navigator.m37387v(UniversalCheckoutFragment.newInstance(string, calendar, universalCheckoutAnalyticsConfiguration, string2)).m37330h().navigate();
        } else {
            this.navigator.m37387v(DownScreenFragment.newInstance()).m37330h().navigate();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        if (C9384u.INSTANCE.m39212a()) {
            HybridUtilities.clearCookies(CookieManager.getInstance());
        }
        super.onDestroy();
    }

    public static Intent createIntent(Activity activity, String str, Calendar calendar, UniversalCheckoutAnalyticsConfiguration universalCheckoutAnalyticsConfiguration, boolean z10, String str2) {
        return createIntent(activity, str, calendar, universalCheckoutAnalyticsConfiguration, z10, str2, 0, 0);
    }

    public static Intent createIntent(Activity activity, String str, Calendar calendar, UniversalCheckoutAnalyticsConfiguration universalCheckoutAnalyticsConfiguration, boolean z10) {
        return createIntent(activity, str, calendar, universalCheckoutAnalyticsConfiguration, z10, null, 0, 0);
    }
}