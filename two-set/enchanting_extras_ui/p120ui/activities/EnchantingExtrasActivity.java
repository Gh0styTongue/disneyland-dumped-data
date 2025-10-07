package com.disney.wdpro.enchanting_extras_ui.p120ui.activities;

import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import androidx.fragment.app.Fragment;
import com.disney.wdpro.aligator.C8663c;
import com.disney.wdpro.aligator.C8665e;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.aligator.ScreenType;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.utils.C9384u;
import com.disney.wdpro.enchanting_extras_ui.C10500R;
import com.disney.wdpro.enchanting_extras_ui.p120ui.fragment.DownScreenFragment;
import com.disney.wdpro.enchanting_extras_ui.p120ui.fragment.EnchantingExtrasFragment;
import com.disney.wdpro.enchanting_extras_ui.p120ui.p121di.EnchantingExtrasComponent;
import com.disney.wdpro.enchanting_extras_ui.p120ui.p121di.EnchantingExtrasComponentProvider;
import com.disney.wdpro.enchanting_extras_ui.utils.Constants;
import com.disney.wdpro.enchanting_extras_ui.utils.HybridUtilities;
import com.disney.wdpro.enchanting_extras_ui.utils.TextUtils;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import com.disney.wdpro.profile_ui.ProfileConfiguration;
import com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks;
import com.disney.wdpro.support.activities.FoundationStackActivity;
import com.disney.wdpro.support.anim.SnowballNextFlowAnimation;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.disney.wdpro.universal_checkout_ui.utils.ActivityResultUtils;
import com.google.common.collect.Lists;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J)\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J/\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\tR\u0018\u00101\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00102R\u0018\u00107\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00102R\u0018\u00108\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00102R\u0018\u00109\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00102R\u0018\u0010:\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00102R\u0014\u0010;\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010>\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, m92038d2 = {"Lcom/disney/wdpro/enchanting_extras_ui/ui/activities/EnchantingExtrasActivity;", "Lcom/disney/wdpro/support/activities/FoundationStackActivity;", "Lcom/disney/wdpro/enchanting_extras_ui/ui/fragment/EnchantingExtrasFragment$OnEnchantingExtrasFragmentListener;", "<init>", "()V", "Landroid/content/Context;", "base", "", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", OrionDeepLinkConstants.FINISH_KEY, "", OrionDeepLinkConstants.REQUEST_CODE_KEY, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroy", "onDismissPressed", "onBackNavigation", "onLoginPressed", "", "park", "facilityId", "entityType", "", "withBackNavigation", "navigateToFinderDetail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/disney/wdpro/commons/config/i;", "Lcom/disney/wdpro/profile_ui/ProfileConfiguration;", "profileConfiguration", "Lcom/disney/wdpro/profile_ui/ProfileConfiguration;", "Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;", "universalCheckoutDataManager", "Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;", "originalContext", "Landroid/content/Context;", "getOriginalContext", "()Landroid/content/Context;", "setOriginalContext", "entryPointId", "Ljava/lang/String;", EnchantingExtrasActivity.BUNDLE_URL_FRIENDLY_ID, "presentationType", "ageGroups", "quantities", "startDate", "endDate", "timeString", "deeplink", "finishExitAnimation", "I", "finishEnterAnimation", "isScreenEnabled", "()Z", "Companion", "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes25.dex */
public final class EnchantingExtrasActivity extends FoundationStackActivity implements EnchantingExtrasFragment.OnEnchantingExtrasFragmentListener {
    private static final String BUNDLE_AGE_GROUPS = "ageGroups";
    private static final String BUNDLE_DEEPLINK = "deeplink";
    private static final String BUNDLE_END_DATE = "endDate";
    private static final String BUNDLE_ENTRY_POINT_KEY = "entryPoint";
    private static final String BUNDLE_PRESENTATION = "presentation";
    private static final String BUNDLE_QUANTITIES = "quantities";
    private static final String BUNDLE_START_DATE = "startDate";
    private static final String BUNDLE_TIME = "time";
    private static final String BUNDLE_URL_FRIENDLY_ID = "urlFriendlyId";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String ageGroups;
    private String deeplink;
    private String endDate;
    private String entryPointId;
    public Context originalContext;
    private String presentationType;

    @Inject
    @JvmField
    public ProfileConfiguration profileConfiguration;
    private String quantities;
    private String startDate;
    private String timeString;

    @Inject
    @JvmField
    public UniversalCheckoutDataManager universalCheckoutDataManager;
    private String urlFriendlyId;

    @Inject
    @JvmField
    public C9248i vendomatic;
    private final int finishExitAnimation = C10500R.anim.slide_out_to_right;
    private final int finishEnterAnimation = C10500R.anim.do_nothing;

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007Jb\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/enchanting_extras_ui/ui/activities/EnchantingExtrasActivity$Companion;", "", "()V", "BUNDLE_AGE_GROUPS", "", "BUNDLE_DEEPLINK", "BUNDLE_END_DATE", "BUNDLE_ENTRY_POINT_KEY", "BUNDLE_PRESENTATION", "BUNDLE_QUANTITIES", "BUNDLE_START_DATE", "BUNDLE_TIME", "BUNDLE_URL_FRIENDLY_ID", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "entryPointId", EnchantingExtrasActivity.BUNDLE_URL_FRIENDLY_ID, "ageGroups", "quantities", "startDate", "endDate", "time", "deeplink", "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Intent createIntent(Context context, String entryPointId, String urlFriendlyId) {
            Intent intent = new Intent(context, (Class<?>) EnchantingExtrasActivity.class);
            intent.putExtra("entryPoint", entryPointId);
            intent.putExtra(EnchantingExtrasActivity.BUNDLE_URL_FRIENDLY_ID, urlFriendlyId);
            return intent;
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent createIntent(Context context, String entryPointId) {
            return createIntent(context, entryPointId, null);
        }

        @JvmStatic
        public final Intent createIntent(Context context, String entryPointId, String urlFriendlyId, String ageGroups, String quantities, String startDate, String endDate, String time, String deeplink) {
            Intent intent = new Intent(context, (Class<?>) EnchantingExtrasActivity.class);
            intent.putExtra("entryPoint", entryPointId);
            intent.putExtra(EnchantingExtrasActivity.BUNDLE_URL_FRIENDLY_ID, urlFriendlyId);
            intent.putExtra("ageGroups", ageGroups);
            intent.putExtra("quantities", quantities);
            intent.putExtra("startDate", startDate);
            intent.putExtra("endDate", endDate);
            intent.putExtra("time", time);
            intent.putExtra("deeplink", deeplink);
            return intent;
        }
    }

    @JvmStatic
    public static final Intent createIntent(Context context, String str) {
        return INSTANCE.createIntent(context, str);
    }

    private final boolean isScreenEnabled() {
        if (Intrinsics.areEqual(Constants.LIST_PAGE_ENTRYPOINT, this.entryPointId)) {
            C9248i c9248i = this.vendomatic;
            Intrinsics.checkNotNull(c9248i);
            if (c9248i.m38790s0()) {
                return true;
            }
        }
        if (Intrinsics.areEqual(Constants.CONFIG_PAGE_ENTRYPOINT, this.entryPointId)) {
            C9248i c9248i2 = this.vendomatic;
            Intrinsics.checkNotNull(c9248i2);
            if (c9248i2.m38787r0()) {
                return true;
            }
        }
        return Intrinsics.areEqual(Constants.PROFILE_PAGE_ENTRYPOINT, this.entryPointId) || Intrinsics.areEqual("checkout-landing-page", this.entryPointId);
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        setOriginalContext(base);
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, android.app.Activity, com.disney.wdpro.apcommerce.ui.plugins.APHybridNavigationPlugin.APHybridNavigationPluginListener, com.disney.wdpro.apcommerce.ui.plugins.MagicKeyHybridNavigationPlugin.APHybridNavigationPluginListener, com.disney.wdpro.apcommerce.ui.plugins.PassSalesNavigationPlugin.PassSalesNavigationPluginListener
    public void finish() {
        super.finish();
        overridePendingTransition(this.finishEnterAnimation, this.finishExitAnimation);
    }

    public final Context getOriginalContext() {
        Context context = this.originalContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("originalContext");
        return null;
    }

    @Override // com.disney.wdpro.enchanting_extras_ui.ui.fragment.EnchantingExtrasFragment.OnEnchantingExtrasFragmentListener
    public void navigateToFinderDetail(String park, String facilityId, String entityType, boolean withBackNavigation) {
        Intrinsics.checkNotNullParameter(park, "park");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Uri finderPathUri = TextUtils.INSTANCE.getFinderPathUri(park, facilityId, entityType);
        C8663c.b bVar = new C8663c.b(finderPathUri);
        Bundle bundle = new Bundle();
        bundle.putSerializable(C8666f.EXTRA_SCREEN_TYPE, ScreenType.STACK);
        if (withBackNavigation) {
            bundle.putStringArrayList(Constants.BACK_NAVIGATION_IDENTIFIERS_KEY, Lists.m69271l("bookreservation"));
        }
        bVar.m37296j(bundle);
        LogInstrumentation.m79024d("EECDetailPlugin", "Uri: " + finderPathUri);
        try {
            this.navigator.m37382o(bVar.build());
        } catch (ActivityNotFoundException unused) {
        }
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Fragment fragmentM19752n0 = getSupportFragmentManager().m19752n0(C10500R.id.fragment_container);
        EnchantingExtrasFragment enchantingExtrasFragment = fragmentM19752n0 instanceof EnchantingExtrasFragment ? (EnchantingExtrasFragment) fragmentM19752n0 : null;
        if (enchantingExtrasFragment != null) {
            enchantingExtrasFragment.onActivityResult(ActivityResultUtils.internalAndroidRequestCodeToFragment(requestCode), resultCode, data);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.disney.wdpro.enchanting_extras_ui.ui.fragment.EnchantingExtrasFragment.OnEnchantingExtrasFragmentListener
    public void onBackNavigation() {
        onBackPressed();
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentM19752n0 = getSupportFragmentManager().m19752n0(C10500R.id.fragment_container);
        if (!(fragmentM19752n0 instanceof EnchantingExtrasFragment)) {
            super.onBackPressed();
            return;
        }
        EnchantingExtrasFragment enchantingExtrasFragment = (EnchantingExtrasFragment) fragmentM19752n0;
        String webViewUrl = enchantingExtrasFragment.getWebViewUrl();
        if (enchantingExtrasFragment.isModalOpened()) {
            enchantingExtrasFragment.sendBackButtonEvent();
            return;
        }
        if (enchantingExtrasFragment.isConfirmationLoaded()) {
            enchantingExtrasFragment.dismiss();
            return;
        }
        if ((StringsKt.equals(Constants.LIST_PAGE_ENTRYPOINT, this.entryPointId, true) && StringsKt.endsWith$default(webViewUrl, "enchanting-extras-collection", false, 2, (Object) null)) || ((StringsKt.equals(Constants.LIST_PAGE_ENTRYPOINT, this.entryPointId, true) && StringsKt.endsWith$default(webViewUrl, Constants.ENCHANTING_EXTRAS_COLLECTION_NATIVE_LOADER, false, 2, (Object) null)) || (StringsKt.equals(Constants.CONFIG_PAGE_ENTRYPOINT, this.entryPointId, true) && (StringsKt.endsWith$default(webViewUrl, HybridUtilities.REFERRER_DETAIL, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) webViewUrl, (CharSequence) "enchanting-extras-collection", false, 2, (Object) null))))) {
            super.onBackPressed();
            return;
        }
        if (StringsKt.contains$default((CharSequence) webViewUrl, (CharSequence) "enchanting-extras-collection", false, 2, (Object) null)) {
            enchantingExtrasFragment.navigateToListScreen();
        } else if (enchantingExtrasFragment.canWebViewGoBack()) {
            enchantingExtrasFragment.webViewGoBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        ComponentCallbacks2 application = getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.disney.wdpro.enchanting_extras_ui.ui.di.EnchantingExtrasComponentProvider");
        EnchantingExtrasComponent enchantingExtrasComponent = ((EnchantingExtrasComponentProvider) application).getEnchantingExtrasComponent();
        if (enchantingExtrasComponent != null) {
            enchantingExtrasComponent.inject(this);
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.entryPointId = extras.getString("entryPoint");
            this.urlFriendlyId = extras.getString(BUNDLE_URL_FRIENDLY_ID);
            this.presentationType = extras.getString(BUNDLE_PRESENTATION);
            this.ageGroups = extras.getString("ageGroups");
            this.quantities = extras.getString("quantities");
            this.startDate = extras.getString("startDate");
            this.endDate = extras.getString("endDate");
            this.timeString = extras.getString("time");
            this.deeplink = extras.getString("deeplink");
        }
        super.onCreate(savedInstanceState);
        setContentView(C10500R.layout.enchanting_extras_main_activity);
        try {
            getStackComponent().getToolbar().hide();
        } catch (UnsupportedOperationException e10) {
            e10.getMessage();
        }
        if (!isScreenEnabled()) {
            this.navigator.m37387v(DownScreenFragment.INSTANCE.newInstance()).m37330h().navigate();
            return;
        }
        C8667g c8667g = this.navigator;
        EnchantingExtrasFragment.Companion companion = EnchantingExtrasFragment.INSTANCE;
        String str = this.entryPointId;
        Intrinsics.checkNotNull(str);
        C8665e.b bVarM37330h = c8667g.m37387v(companion.newInstance(str, this.urlFriendlyId, this.presentationType, this.ageGroups, this.quantities, this.startDate, this.endDate, this.timeString, this.deeplink)).m37330h();
        if (StringsKt.equals(Constants.CONFIG_PAGE_ENTRYPOINT, this.entryPointId, true)) {
            bVarM37330h.withAnimations(new SnowballNextFlowAnimation());
        }
        bVarM37330h.navigate();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        if (C9384u.INSTANCE.m39212a()) {
            HybridUtilities hybridUtilities = HybridUtilities.INSTANCE;
            CookieManager cookieManager = CookieManager.getInstance();
            Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance()");
            hybridUtilities.clearCookies(cookieManager);
        }
        super.onDestroy();
    }

    @Override // com.disney.wdpro.enchanting_extras_ui.ui.fragment.EnchantingExtrasFragment.OnEnchantingExtrasFragmentListener
    public void onDismissPressed() {
        finish();
    }

    @Override // com.disney.wdpro.enchanting_extras_ui.ui.fragment.EnchantingExtrasFragment.OnEnchantingExtrasFragmentListener
    public void onLoginPressed() {
        ProfileConfiguration profileConfiguration = this.profileConfiguration;
        Intrinsics.checkNotNull(profileConfiguration);
        navigate(null, profileConfiguration.getProfileNavEntriesBuilderProvider().getNavigationEntryForSecondarySignIn(this).withCallbacks(new LightBoxCallbacks() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.activities.EnchantingExtrasActivity.onLoginPressed.1
            @Override // com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks
            public boolean onCancel() {
                Fragment fragmentM19752n0 = EnchantingExtrasActivity.this.getSupportFragmentManager().m19752n0(C10500R.id.fragment_container);
                if (fragmentM19752n0 instanceof EnchantingExtrasFragment) {
                    EnchantingExtrasFragment enchantingExtrasFragment = (EnchantingExtrasFragment) fragmentM19752n0;
                    enchantingExtrasFragment.onFinishLoadingScreen();
                    String webViewUrl = enchantingExtrasFragment.getWebViewUrl();
                    if (webViewUrl != null && StringsKt.contains$default((CharSequence) webViewUrl, (CharSequence) "checkout-booking", false, 2, (Object) null)) {
                        enchantingExtrasFragment.webViewGoBack();
                    }
                }
                return true;
            }

            @Override // com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks
            public boolean onError() {
                return false;
            }

            @Override // com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks
            public boolean onSuccess() {
                return false;
            }
        }).build());
    }

    public final void setOriginalContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.originalContext = context;
    }

    @JvmStatic
    public static final Intent createIntent(Context context, String str, String str2) {
        return INSTANCE.createIntent(context, str, str2);
    }

    @JvmStatic
    public static final Intent createIntent(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return INSTANCE.createIntent(context, str, str2, str3, str4, str5, str6, str7, str8);
    }
}