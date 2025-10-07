package com.disney.wdpro.universal_checkout_ui.p459ui.activities;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractC3694e0;
import androidx.fragment.app.Fragment;
import co.C6205a;
import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.utils.C9384u;
import com.disney.wdpro.my_plans_ui.p348ui.activity.ItineraryHybridActivity;
import com.disney.wdpro.profile_ui.ProfileConfiguration;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.recommender.core.themer.RecommenderThemerConstants;
import com.disney.wdpro.support.activities.FoundationStackActivity;
import com.disney.wdpro.support.dialog.C20700f;
import com.disney.wdpro.support.widget.SnowballHeader;
import com.disney.wdpro.universal_checkout_ui.C21435R;
import com.disney.wdpro.universal_checkout_ui.UniversalCheckoutConfiguration;
import com.disney.wdpro.universal_checkout_ui.daohybrid.HybridUtils;
import com.disney.wdpro.universal_checkout_ui.daohybrid.JSWebViewBridge;
import com.disney.wdpro.universal_checkout_ui.daohybrid.JSWebViewBridgeMapping;
import com.disney.wdpro.universal_checkout_ui.daohybrid.PdfViewerHelper;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.disney.wdpro.universal_checkout_ui.p459ui.p460di.UniversalCheckoutComponentProvider;
import com.disney.wdpro.universal_checkout_ui.p459ui.views.SuperscriptSpanAdjuster;
import com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.base.C22466q;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import com.squareup.otto.Subscribe;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridFragment;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.print.PrintPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.util.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import javax.inject.Inject;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u008a\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0005J9\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010\u0005J\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010\u0005J\u000f\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010\u0005J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010\u0005J\u0017\u00101\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\t2\u0006\u00103\u001a\u00020\u001d¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\t¢\u0006\u0004\b6\u0010\u0005J\u0017\u00108\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b8\u00109J1\u0010;\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u00010\u00122\u0006\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020=H\u0007¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0012H\u0007¢\u0006\u0004\bA\u00109J\u0017\u0010B\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0012H\u0007¢\u0006\u0004\bB\u00109J#\u0010E\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u00107\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_R\"\u0010a\u001a\u00020`8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010h\u001a\u00020g8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010o\u001a\u00020n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010v\u001a\u00020u8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R%\u0010}\u001a\u00020|8\u0006@\u0006X\u0087.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R*\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008b\u0001"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/ui/activities/ChaseActivity;", "Lcom/disney/wdpro/support/activities/FoundationStackActivity;", "Lcom/disney/wdpro/universal_checkout_ui/utils/UniversalCheckoutHelper$UniversalCheckoutHelperListener;", "Lcom/disney/wdpro/universal_checkout_ui/utils/UniversalCheckoutHelper$DVICNativeInterstitialListener;", "<init>", "()V", "", "canWebViewGoBack", "()Z", "", "webViewGoBack", "loadChase", "showBackNavigation", "Landroid/graphics/drawable/Drawable;", "drawable", "setNavigationDrawable", "(Landroid/graphics/drawable/Drawable;)V", "handlePdfDisplayError", "", "initialScriptToEvaluate", "Landroid/webkit/ValueCallback;", "callback", "", "", ItineraryHybridActivity.ALL_QUERY_PARAMS, "performEvaluation", "(Ljava/lang/String;Landroid/webkit/ValueCallback;[Ljava/lang/Object;)Z", "Landroid/text/SpannableString;", "spannableString", "", RecommenderThemerConstants.INDEX, Constants.resourcePathKey, "adjustSuperScriptAppearance", "(Landroid/text/SpannableString;ILjava/lang/String;)V", "Landroid/content/Context;", "base", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initWebHybrid", "onResume", "onBackPressed", "onReadyForRequestItems", "onDestroy", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager$LoginDataEvent;", "loginDataEvent", "onLoginEvent", "(Lcom/disney/wdpro/profile_ui/manager/ProfileManager$LoginDataEvent;)V", "progressValue", "showLoader", "(I)V", "hideLoader", "url", "updateHeaderUrl", "(Ljava/lang/String;)V", "onFinishedCalled", "updateWebViewUI", "(Ljava/lang/String;ZIZ)V", "Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager$JwtTokenResponseEvent;", "event", "onFetchJwtToken", "(Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager$JwtTokenResponseEvent;)V", "getPDFDocument", "onFinish", "", VirtualQueueConstants.ALERT_MESSAGE, "onShowDialog", "(Ljava/lang/CharSequence;Ljava/lang/String;)V", "startUrl", "Ljava/lang/String;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Lcom/wdpr/ee/ra/rahybrid/coordinator/HybridCoordinator;", "coordinator", "Lcom/wdpr/ee/ra/rahybrid/coordinator/HybridCoordinator;", "Lcom/disney/wdpro/universal_checkout_ui/utils/UniversalCheckoutHelper;", "universalCheckoutHelper", "Lcom/disney/wdpro/universal_checkout_ui/utils/UniversalCheckoutHelper;", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ProgressBar;", "Landroid/widget/FrameLayout;", "contentContainer", "Landroid/widget/FrameLayout;", "Lcom/disney/wdpro/support/widget/SnowballHeader;", "webViewHeader", "Lcom/disney/wdpro/support/widget/SnowballHeader;", "Lcom/disney/wdpro/universal_checkout_ui/daohybrid/JSWebViewBridge;", "jsWebViewBridge", "Lcom/disney/wdpro/universal_checkout_ui/daohybrid/JSWebViewBridge;", "originalContext", "Landroid/content/Context;", "Lcom/disney/wdpro/universal_checkout_ui/ui/Settings/UniversalCheckoutEnvironment;", "environment", "Lcom/disney/wdpro/universal_checkout_ui/ui/Settings/UniversalCheckoutEnvironment;", "getEnvironment", "()Lcom/disney/wdpro/universal_checkout_ui/ui/Settings/UniversalCheckoutEnvironment;", "setEnvironment", "(Lcom/disney/wdpro/universal_checkout_ui/ui/Settings/UniversalCheckoutEnvironment;)V", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager;", "profileManager", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager;", "getProfileManager", "()Lcom/disney/wdpro/profile_ui/manager/ProfileManager;", "setProfileManager", "(Lcom/disney/wdpro/profile_ui/manager/ProfileManager;)V", "Lcom/disney/wdpro/profile_ui/ProfileConfiguration;", "profileConfiguration", "Lcom/disney/wdpro/profile_ui/ProfileConfiguration;", "getProfileConfiguration", "()Lcom/disney/wdpro/profile_ui/ProfileConfiguration;", "setProfileConfiguration", "(Lcom/disney/wdpro/profile_ui/ProfileConfiguration;)V", "Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;", "universalCheckoutDataManager", "Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;", "getUniversalCheckoutDataManager", "()Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;", "setUniversalCheckoutDataManager", "(Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;)V", "Lcom/disney/wdpro/universal_checkout_ui/UniversalCheckoutConfiguration;", "universalCheckoutConfiguration", "Lcom/disney/wdpro/universal_checkout_ui/UniversalCheckoutConfiguration;", "getUniversalCheckoutConfiguration", "()Lcom/disney/wdpro/universal_checkout_ui/UniversalCheckoutConfiguration;", "setUniversalCheckoutConfiguration", "(Lcom/disney/wdpro/universal_checkout_ui/UniversalCheckoutConfiguration;)V", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/disney/wdpro/commons/config/i;", "getVendomatic", "()Lcom/disney/wdpro/commons/config/i;", "setVendomatic", "(Lcom/disney/wdpro/commons/config/i;)V", "Companion", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
@SourceDebugExtension({"SMAP\nChaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChaseActivity.kt\ncom/disney/wdpro/universal_checkout_ui/ui/activities/ChaseActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,469:1\n1#2:470\n*E\n"})
/* loaded from: classes20.dex */
public final class ChaseActivity extends FoundationStackActivity implements UniversalCheckoutHelper.UniversalCheckoutHelperListener, UniversalCheckoutHelper.DVICNativeInterstitialListener {
    private static final String BUNDLE_URL = "BUNDLE_URL";
    public static final int CHASE_REQUEST_CODE = 10000;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int DISMISS_DVIC_RESULT_CODE = 20000;
    private FrameLayout contentContainer;
    private HybridCoordinator coordinator;

    @Inject
    public UniversalCheckoutEnvironment environment;
    private JSWebViewBridge jsWebViewBridge;
    private Context originalContext;

    @Inject
    public ProfileConfiguration profileConfiguration;

    @Inject
    public ProfileManager profileManager;
    private ProgressBar progressBar;
    private String startUrl;

    @Inject
    public UniversalCheckoutConfiguration universalCheckoutConfiguration;

    @Inject
    public UniversalCheckoutDataManager universalCheckoutDataManager;
    private UniversalCheckoutHelper universalCheckoutHelper;

    @Inject
    public C9248i vendomatic;
    private WebView webView;
    private SnowballHeader webViewHeader;

    @Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/ui/activities/ChaseActivity$Companion;", "", "()V", ChaseActivity.BUNDLE_URL, "", "CHASE_REQUEST_CODE", "", "DISMISS_DVIC_RESULT_CODE", "createIntent", "Landroid/content/Intent;", "currentActivity", "Landroid/app/Activity;", "url", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Intent createIntent(Activity currentActivity, String url) {
            Intent intent = new Intent(currentActivity, (Class<?>) ChaseActivity.class);
            intent.putExtra(ChaseActivity.BUNDLE_URL, url);
            return intent;
        }

        private Companion() {
        }
    }

    private final void adjustSuperScriptAppearance(SpannableString spannableString, int index, String path) {
        if (index != -1) {
            spannableString.setSpan(new SuperscriptSpanAdjuster(), index, path.length() + index, 33);
        }
    }

    private final boolean canWebViewGoBack() {
        boolean zAreEqual;
        String url;
        WebView webView = this.webView;
        Boolean boolValueOf = null;
        if ((webView != null ? webView.getUrl() : null) != null) {
            String str = this.startUrl;
            if (str != null) {
                WebView webView2 = this.webView;
                if (webView2 != null && (url = webView2.getUrl()) != null) {
                    Intrinsics.checkNotNullExpressionValue(url, "url");
                    boolValueOf = Boolean.valueOf(StringsKt.contains$default((CharSequence) url, (CharSequence) str, false, 2, (Object) null));
                }
                zAreEqual = Intrinsics.areEqual(boolValueOf, Boolean.FALSE);
            } else {
                zAreEqual = false;
            }
            if (zAreEqual) {
                WebView webView3 = this.webView;
                if (webView3 != null && webView3.canGoBack()) {
                    return true;
                }
            }
        }
        return false;
    }

    @JvmStatic
    public static final Intent createIntent(Activity activity, String str) {
        return INSTANCE.createIntent(activity, str);
    }

    private final void handlePdfDisplayError() {
        runOnUiThread(new Runnable() { // from class: com.disney.wdpro.universal_checkout_ui.ui.activities.b
            @Override // java.lang.Runnable
            public final void run() {
                ChaseActivity.handlePdfDisplayError$lambda$5(this.f45070a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handlePdfDisplayError$lambda$5(ChaseActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.performEvaluation(HybridUtils.SCRIPT_CALL_SHOULD_NATIVE_HANDLE_BUTTON_PRESSED, new ValueCallback() { // from class: com.disney.wdpro.universal_checkout_ui.ui.activities.e
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    ChaseActivity.handlePdfDisplayError$lambda$5$lambda$4((String) obj);
                }
            }, HybridUtils.PDF_DISPLAY_ERROR_JS_BRIDGE_STATUS);
        } catch (Exception e10) {
            ExceptionsKt.stackTraceToString(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handlePdfDisplayError$lambda$5$lambda$4(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadChase() throws SecurityException {
        HybridFragment hybridFragment;
        if (this.webView == null) {
            HybridCoordinator hybridCoordinator = this.coordinator;
            WebView webView = (hybridCoordinator == null || (hybridFragment = hybridCoordinator.getHybridFragment()) == null) ? null : hybridFragment.webView;
            this.webView = webView;
            WebSettings settings = webView != null ? webView.getSettings() : null;
            if (settings != null) {
                settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
            }
            WebView webView2 = this.webView;
            WebSettings settings2 = webView2 != null ? webView2.getSettings() : null;
            if (settings2 != null) {
                settings2.setLoadWithOverviewMode(true);
            }
            WebView webView3 = this.webView;
            WebSettings settings3 = webView3 != null ? webView3.getSettings() : null;
            if (settings3 != null) {
                settings3.setUseWideViewPort(true);
            }
            if (getVendomatic().m38725U()) {
                JSWebViewBridge jSWebViewBridge = new JSWebViewBridge();
                this.jsWebViewBridge = jSWebViewBridge;
                Intrinsics.checkNotNull(jSWebViewBridge);
                jSWebViewBridge.buildJSBridge(this);
                WebView webView4 = this.webView;
                if (webView4 != null) {
                    webView4.addJavascriptInterface(this, JSWebViewBridge.APP_JS_BRIDGE);
                }
            }
            UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
            if (universalCheckoutHelper != null) {
                universalCheckoutHelper.lambda$requestTokenForSSO$0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(ChaseActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onShowDialog$lambda$6(String str, ChaseActivity this$0, DialogInterface dialogInterface, int i10) {
        UniversalCheckoutHelper universalCheckoutHelper;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(str);
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) com.disney.wdpro.universal_checkout_ui.p459ui.Constants.CHASE_GATEWAY_PATH, false, 2, (Object) null) && (universalCheckoutHelper = this$0.universalCheckoutHelper) != null) {
            universalCheckoutHelper.sendContinueButtonEvent();
        }
        UniversalCheckoutHelper universalCheckoutHelper2 = this$0.universalCheckoutHelper;
        if (universalCheckoutHelper2 != null) {
            universalCheckoutHelper2.navigateToChaseScreen(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onShowDialog$lambda$7(ChaseActivity this$0, DialogInterface dialog, int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        UniversalCheckoutHelper universalCheckoutHelper = this$0.universalCheckoutHelper;
        if (universalCheckoutHelper != null) {
            universalCheckoutHelper.sendCancelButtonEvent();
        }
        dialog.dismiss();
    }

    private final boolean performEvaluation(String initialScriptToEvaluate, ValueCallback<String> callback, Object... params) {
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf = Arrays.copyOf(params, params.length);
            String str = String.format(initialScriptToEvaluate, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            WebView webView = this.webView;
            if (webView == null) {
                return true;
            }
            webView.evaluateJavascript(str, callback);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private final void setNavigationDrawable(Drawable drawable) {
        SnowballHeader snowballHeader = this.webViewHeader;
        if (snowballHeader != null) {
            snowballHeader.setNavigationIcon(drawable);
        }
    }

    private final void showBackNavigation() {
        setNavigationDrawable(new C6205a(this, C21435R.font.peptasia, C21435R.string.icon_previous, 17.0f, (Integer) null));
    }

    private final void webViewGoBack() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.goBack();
        }
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        this.originalContext = base;
    }

    public final UniversalCheckoutEnvironment getEnvironment() {
        UniversalCheckoutEnvironment universalCheckoutEnvironment = this.environment;
        if (universalCheckoutEnvironment != null) {
            return universalCheckoutEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("environment");
        return null;
    }

    @JavascriptInterface
    @JSWebViewBridgeMapping("getPDFDocument")
    public final void getPDFDocument(String params) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(params, "params");
        HybridUtils hybridUtils = HybridUtils.INSTANCE;
        Map<String, String> mapConvertJavaScriptParamsToMap = hybridUtils.convertJavaScriptParamsToMap(params);
        if (mapConvertJavaScriptParamsToMap == null) {
            LogInstrumentation.m79026e(ChaseActivity.class.getSimpleName(), "paramsMap is null");
            handlePdfDisplayError();
            return;
        }
        String str = mapConvertJavaScriptParamsToMap.get(AnalyticsAttribute.CONTENT_TYPE_ATTRIBUTE);
        String str2 = mapConvertJavaScriptParamsToMap.get("url");
        String str3 = mapConvertJavaScriptParamsToMap.get("data");
        if (str3 != null && str3.length() != 0) {
            try {
                PdfViewerHelper.getInstance().viewPdfFile(PdfViewerHelper.getInstance().writeBytesAsFile(this, Base64.decode(URLDecoder.decode(str3, StandardCharsets.UTF_8.name()), 0)), this, hybridUtils.getPdfAuthority(this));
                return;
            } catch (Exception e10) {
                ExceptionsKt.stackTraceToString(e10);
                handlePdfDisplayError();
                return;
            }
        }
        if (str2 == null || str2.length() == 0) {
            handlePdfDisplayError();
            return;
        }
        try {
            if (StringsKt.equals(str, "pdf", true)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(Uri.parse(URLDecoder.decode(str2, StandardCharsets.UTF_8.name())), "application/pdf");
                intent.addFlags(1);
                startActivity(intent);
                return;
            }
            if (!StringsKt.equals(str, "html", true)) {
                handlePdfDisplayError();
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(URLDecoder.decode(str2, StandardCharsets.UTF_8.name())));
            intent2.addFlags(1);
            startActivity(intent2);
        } catch (Exception e11) {
            ExceptionsKt.stackTraceToString(e11);
            handlePdfDisplayError();
        }
    }

    public final ProfileConfiguration getProfileConfiguration() {
        ProfileConfiguration profileConfiguration = this.profileConfiguration;
        if (profileConfiguration != null) {
            return profileConfiguration;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profileConfiguration");
        return null;
    }

    public final ProfileManager getProfileManager() {
        ProfileManager profileManager = this.profileManager;
        if (profileManager != null) {
            return profileManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profileManager");
        return null;
    }

    public final UniversalCheckoutConfiguration getUniversalCheckoutConfiguration() {
        UniversalCheckoutConfiguration universalCheckoutConfiguration = this.universalCheckoutConfiguration;
        if (universalCheckoutConfiguration != null) {
            return universalCheckoutConfiguration;
        }
        Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutConfiguration");
        return null;
    }

    public final UniversalCheckoutDataManager getUniversalCheckoutDataManager() {
        UniversalCheckoutDataManager universalCheckoutDataManager = this.universalCheckoutDataManager;
        if (universalCheckoutDataManager != null) {
            return universalCheckoutDataManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutDataManager");
        return null;
    }

    public final C9248i getVendomatic() {
        C9248i c9248i = this.vendomatic;
        if (c9248i != null) {
            return c9248i;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vendomatic");
        return null;
    }

    public final void hideLoader() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            return;
        }
        progressBar.setVisibility(8);
    }

    @Override // com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.UniversalCheckoutHelperListener
    public void initWebHybrid() {
        UniversalCheckoutHelper universalCheckoutHelper = new UniversalCheckoutHelper(this, getEnvironment(), this.navigator, this.analyticsHelper, this.authenticationManager, true, getProfileManager(), getUniversalCheckoutDataManager(), getUniversalCheckoutConfiguration(), getVendomatic());
        this.universalCheckoutHelper = universalCheckoutHelper;
        universalCheckoutHelper.initWebHybrid(com.disney.wdpro.universal_checkout_ui.p459ui.Constants.CHASE_LANDING_PAGE_ENTRYPOINT, this.startUrl, null);
        UniversalCheckoutHelper universalCheckoutHelper2 = this.universalCheckoutHelper;
        if (universalCheckoutHelper2 != null) {
            universalCheckoutHelper2.setUniversalCheckoutHelperListener(this);
        }
        UniversalCheckoutHelper universalCheckoutHelper3 = this.universalCheckoutHelper;
        if (universalCheckoutHelper3 != null) {
            universalCheckoutHelper3.setDVICNativeInterstitialListener(this);
        }
        UniversalCheckoutHelper universalCheckoutHelper4 = this.universalCheckoutHelper;
        HybridCoordinator coordinator = universalCheckoutHelper4 != null ? universalCheckoutHelper4.getCoordinator() : null;
        this.coordinator = coordinator;
        Plugin plugin = coordinator != null ? coordinator.getPlugin(PrintPlugin.f71779ID) : null;
        PrintPlugin printPlugin = plugin instanceof PrintPlugin ? (PrintPlugin) plugin : null;
        if (printPlugin != null) {
            Context context = this.originalContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("originalContext");
                context = null;
            }
            printPlugin.setPrintContext(context);
        }
        C8667g c8667g = this.navigator;
        HybridCoordinator hybridCoordinator = this.coordinator;
        c8667g.m37387v(hybridCoordinator != null ? hybridCoordinator.getHybridFragment() : null).m37332j(C21435R.id.hybridfragment).m37330h().navigate();
        getSupportFragmentManager().m19767t1(new AbstractC3694e0.m() { // from class: com.disney.wdpro.universal_checkout_ui.ui.activities.ChaseActivity.initWebHybrid.1
            @Override // androidx.fragment.app.AbstractC3694e0.m
            public void onFragmentViewCreated(AbstractC3694e0 fm2, Fragment f10, View v10, Bundle savedInstanceState) throws SecurityException {
                Intrinsics.checkNotNullParameter(fm2, "fm");
                Intrinsics.checkNotNullParameter(f10, "f");
                Intrinsics.checkNotNullParameter(v10, "v");
                super.onFragmentViewCreated(fm2, f10, v10, savedInstanceState);
                if (f10 instanceof HybridFragment) {
                    ChaseActivity.this.loadChase();
                }
            }
        }, false);
        if (C9384u.INSTANCE.m39212a()) {
            return;
        }
        UniversalCheckoutHelper universalCheckoutHelper5 = this.universalCheckoutHelper;
        if (universalCheckoutHelper5 != null) {
            universalCheckoutHelper5.onFinishLoadingScreen(null, false);
        }
        UniversalCheckoutHelper universalCheckoutHelper6 = this.universalCheckoutHelper;
        if (universalCheckoutHelper6 != null) {
            universalCheckoutHelper6.onDisabledWebView();
        }
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        HybridCoordinator hybridCoordinator = this.coordinator;
        if (hybridCoordinator != null) {
            Intrinsics.checkNotNull(hybridCoordinator);
            if (hybridCoordinator.getHybridFragment() != null) {
                UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
                Intrinsics.checkNotNull(universalCheckoutHelper);
                if (universalCheckoutHelper.isModalOpened()) {
                    HybridCoordinator hybridCoordinator2 = this.coordinator;
                    Intrinsics.checkNotNull(hybridCoordinator2);
                    hybridCoordinator2.getHybridFragment().sendBackButtonEvent();
                    return;
                }
            }
        }
        if (canWebViewGoBack()) {
            webViewGoBack();
            return;
        }
        SnowballHeader snowballHeader = this.webViewHeader;
        if (snowballHeader != null && snowballHeader.getVisibility() == 8) {
            getUniversalCheckoutDataManager().setReloadUC(true);
            setResult(DISMISS_DVIC_RESULT_CODE);
        }
        super.onBackPressed();
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Toolbar toolbar;
        Toolbar toolbar2;
        ComponentCallbacks2 application = getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.disney.wdpro.universal_checkout_ui.ui.di.UniversalCheckoutComponentProvider");
        ((UniversalCheckoutComponentProvider) application).getUniversalCheckoutComponent().inject(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.startUrl = extras.getString(BUNDLE_URL);
        }
        super.onCreate(savedInstanceState);
        if (!getUniversalCheckoutConfiguration().isScreenRecordingEnabled()) {
            getWindow().setFlags(8192, 8192);
        }
        setContentView(C21435R.layout.universal_checkout_hybrid_view_with_header_activity);
        try {
            getStackComponent().getToolbar().hide();
        } catch (UnsupportedOperationException e10) {
            e10.getMessage();
        }
        this.progressBar = (ProgressBar) findViewById(C21435R.id.progress);
        this.webViewHeader = (SnowballHeader) findViewById(C21435R.id.toolbar);
        FrameLayout frameLayout = (FrameLayout) findViewById(C21435R.id.container);
        this.contentContainer = frameLayout;
        ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        CoordinatorLayout.C3257e c3257e = layoutParams instanceof CoordinatorLayout.C3257e ? (CoordinatorLayout.C3257e) layoutParams : null;
        if (c3257e != null) {
            c3257e.m16687o(new AppBarLayout.ScrollingViewBehavior());
        }
        showBackNavigation();
        SnowballHeader snowballHeader = this.webViewHeader;
        if (snowballHeader != null && (toolbar2 = snowballHeader.getToolbar()) != null) {
            toolbar2.setNavigationContentDescription(C21435R.string.back_button);
        }
        SnowballHeader snowballHeader2 = this.webViewHeader;
        if (snowballHeader2 != null && (toolbar = snowballHeader2.getToolbar()) != null) {
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.universal_checkout_ui.ui.activities.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChaseActivity.onCreate$lambda$0(this.f45069a, view);
                }
            });
        }
        initWebHybrid();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        PdfViewerHelper.getInstance().deletePdfAgreementsDir(PdfViewerHelper.getInstance().getPdfAgreementsDir(this));
        WebView webView = this.webView;
        if (webView != null) {
            webView.clearCache(true);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.stopLoading();
        }
    }

    @Subscribe
    public final void onFetchJwtToken(UniversalCheckoutDataManager.JwtTokenResponseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper != null) {
            universalCheckoutHelper.onReadyForSSO();
        }
    }

    @JavascriptInterface
    @JSWebViewBridgeMapping("onFinish")
    public final void onFinish(String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        getUniversalCheckoutDataManager().setReloadUC(true);
        setResult(DISMISS_DVIC_RESULT_CODE);
        finish();
    }

    @Subscribe
    public final void onLoginEvent(ProfileManager.LoginDataEvent loginDataEvent) {
        Intrinsics.checkNotNullParameter(loginDataEvent, "loginDataEvent");
        if (loginDataEvent.isSuccess()) {
            getUniversalCheckoutDataManager().setJwt(null);
            UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
            if (universalCheckoutHelper != null) {
                universalCheckoutHelper.lambda$requestTokenForSSO$0();
                return;
            }
            return;
        }
        hideLoader();
        UniversalCheckoutHelper universalCheckoutHelper2 = this.universalCheckoutHelper;
        if (universalCheckoutHelper2 != null) {
            universalCheckoutHelper2.showErrorBanner(true);
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.UniversalCheckoutHelperListener
    public void onReadyForRequestItems() {
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper != null) {
            universalCheckoutHelper.updateScreenFlag();
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.DVICNativeInterstitialListener
    public void onShowDialog(CharSequence alertMessage, final String url) {
        SpannableString spannableString = new SpannableString(StringsKt.replace$default(String.valueOf(alertMessage), "®", "®", false, 4, (Object) null));
        String string = spannableString.toString();
        Intrinsics.checkNotNullExpressionValue(string, "spannableString.toString()");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string, "®", 0, false, 6, (Object) null);
        String string2 = spannableString.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "spannableString.toString()");
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) string2, "®", 0, false, 6, (Object) null);
        adjustSuperScriptAppearance(spannableString, iIndexOf$default, "®");
        adjustSuperScriptAppearance(spannableString, iLastIndexOf$default, "®");
        new C20700f.a(this).m62550g(spannableString).m62548e(false).m62553j(C21435R.string.universal_checkout_common_continue, new DialogInterface.OnClickListener() { // from class: com.disney.wdpro.universal_checkout_ui.ui.activities.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ChaseActivity.onShowDialog$lambda$6(url, this, dialogInterface, i10);
            }
        }).m62551h(getString(C21435R.string.universal_checkout_common_cancel), new DialogInterface.OnClickListener() { // from class: com.disney.wdpro.universal_checkout_ui.ui.activities.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ChaseActivity.onShowDialog$lambda$7(this.f45073a, dialogInterface, i10);
            }
        }).m62557n();
    }

    public final void setEnvironment(UniversalCheckoutEnvironment universalCheckoutEnvironment) {
        Intrinsics.checkNotNullParameter(universalCheckoutEnvironment, "<set-?>");
        this.environment = universalCheckoutEnvironment;
    }

    public final void setProfileConfiguration(ProfileConfiguration profileConfiguration) {
        Intrinsics.checkNotNullParameter(profileConfiguration, "<set-?>");
        this.profileConfiguration = profileConfiguration;
    }

    public final void setProfileManager(ProfileManager profileManager) {
        Intrinsics.checkNotNullParameter(profileManager, "<set-?>");
        this.profileManager = profileManager;
    }

    public final void setUniversalCheckoutConfiguration(UniversalCheckoutConfiguration universalCheckoutConfiguration) {
        Intrinsics.checkNotNullParameter(universalCheckoutConfiguration, "<set-?>");
        this.universalCheckoutConfiguration = universalCheckoutConfiguration;
    }

    public final void setUniversalCheckoutDataManager(UniversalCheckoutDataManager universalCheckoutDataManager) {
        Intrinsics.checkNotNullParameter(universalCheckoutDataManager, "<set-?>");
        this.universalCheckoutDataManager = universalCheckoutDataManager;
    }

    public final void setVendomatic(C9248i c9248i) {
        Intrinsics.checkNotNullParameter(c9248i, "<set-?>");
        this.vendomatic = c9248i;
    }

    public final void showLoader(int progressValue) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 == null) {
            return;
        }
        progressBar2.setProgress(progressValue);
    }

    public final void updateHeaderUrl(String url) {
        String host;
        if (C22466q.m68722b(url)) {
            host = null;
        } else {
            try {
                host = new URI(url).getHost();
            } catch (URISyntaxException e10) {
                e10.printStackTrace();
            }
        }
        SnowballHeader snowballHeader = this.webViewHeader;
        if (snowballHeader != null) {
            snowballHeader.setHeaderTitle(host);
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.UniversalCheckoutHelperListener
    public void updateWebViewUI(String url, boolean showLoader, int progressValue, boolean onFinishedCalled) {
        WebView webView;
        if (url == null || !StringsKt.contains$default((CharSequence) url, (CharSequence) com.disney.wdpro.universal_checkout_ui.p459ui.Constants.VISA_CARD_PATH, false, 2, (Object) null)) {
            SnowballHeader snowballHeader = this.webViewHeader;
            if (snowballHeader != null) {
                snowballHeader.setVisibility(0);
            }
        } else {
            SnowballHeader snowballHeader2 = this.webViewHeader;
            if (snowballHeader2 != null) {
                snowballHeader2.setVisibility(8);
            }
        }
        if (showLoader) {
            showLoader(progressValue);
        } else {
            hideLoader();
            if (getVendomatic().m38725U() && onFinishedCalled && (webView = this.webView) != null) {
                JSWebViewBridge jSWebViewBridge = this.jsWebViewBridge;
                webView.loadUrl("javascript:" + (jSWebViewBridge != null ? jSWebViewBridge.generateApiFromRegisteredMethods() : null));
            }
        }
        if (url != null) {
            updateHeaderUrl(url);
        }
    }
}