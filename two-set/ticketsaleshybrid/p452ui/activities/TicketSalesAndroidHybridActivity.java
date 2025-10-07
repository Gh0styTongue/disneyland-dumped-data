package com.disney.wdpro.ticketsaleshybrid.p452ui.activities;

import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.disney.wdpro.aligator.C8663c;
import com.disney.wdpro.aligator.C8665e;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.aligator.ScreenType;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.deeplink.DeepLinkAsyncMessaging;
import com.disney.wdpro.commons.utils.C9384u;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import com.disney.wdpro.profile_ui.ProfileConfiguration;
import com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks;
import com.disney.wdpro.queueit.AbstractC19472l;
import com.disney.wdpro.queueit.C19467g;
import com.disney.wdpro.queueit.C19471k;
import com.disney.wdpro.queueit.C19473m;
import com.disney.wdpro.queueit.Error;
import com.disney.wdpro.queueit.QueueITException;
import com.disney.wdpro.support.activities.FoundationStackActivity;
import com.disney.wdpro.support.anim.SnowballNextFlowAnimation;
import com.disney.wdpro.ticketsaleshybrid.C21188R;
import com.disney.wdpro.ticketsaleshybrid.p452ui.AnalyticsConfiguration;
import com.disney.wdpro.ticketsaleshybrid.p452ui.Settings.TicketSalesAndroidHybridEnvironment;
import com.disney.wdpro.ticketsaleshybrid.p452ui.fragment.TicketSalesHybridFragment;
import com.disney.wdpro.ticketsaleshybrid.p452ui.p453di.TicketSalesAndroidHybridComponent;
import com.disney.wdpro.ticketsaleshybrid.p452ui.p453di.TicketSalesAndroidHybridComponentProvider;
import com.disney.wdpro.ticketsaleshybrid.utils.Constants;
import com.disney.wdpro.ticketsaleshybrid.utils.HybridUtilities;
import com.disney.wdpro.ticketsaleshybrid.utils.SalesChatSharedInformationUtil;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.disney.wdpro.universal_checkout_ui.utils.ActivityResultUtils;
import com.google.common.base.C22466q;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u0004R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u00105\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010\u0017R\u0014\u0010:\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010=\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0011R\u0011\u0010A\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006C"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/activities/TicketSalesAndroidHybridActivity;", "Lcom/disney/wdpro/support/activities/FoundationStackActivity;", "Lcom/disney/wdpro/ticketsaleshybrid/ui/fragment/TicketSalesHybridFragment$TicketSalesAndroidHybridFragmentListener;", "<init>", "()V", "", "initializeQueueIt", "startFlow", "loadTicketSalesHybrid", "Landroid/os/Bundle;", "generateSalesChatSharedInformation", "()Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "needsToQueue", "()Z", "onBackPressed", OrionDeepLinkConstants.FINISH_KEY, "Landroid/content/Context;", "base", "attachBaseContext", "(Landroid/content/Context;)V", "", OrionDeepLinkConstants.REQUEST_CODE_KEY, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroy", "onDismissPressed", "onBackNavigation", "onLoginPressed", "navigateToSalesChatScreen", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/disney/wdpro/commons/config/i;", "Lcom/disney/wdpro/profile_ui/ProfileConfiguration;", "profileConfiguration", "Lcom/disney/wdpro/profile_ui/ProfileConfiguration;", "Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;", "universalCheckoutDataManager", "Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;", "Lcom/disney/wdpro/ticketsaleshybrid/ui/Settings/TicketSalesAndroidHybridEnvironment;", "ticketSalesAndroidHybridEnvironment", "Lcom/disney/wdpro/ticketsaleshybrid/ui/Settings/TicketSalesAndroidHybridEnvironment;", "", "entryPointId", "Ljava/lang/String;", "shouldLoadPage", "Z", "originalContext", "Landroid/content/Context;", "getOriginalContext", "()Landroid/content/Context;", "setOriginalContext", "finishExitAnimation", "I", "finishEnterAnimation", "isTicketSalesScreenEnabled", "Lcom/disney/wdpro/ticketsaleshybrid/ui/AnalyticsConfiguration;", "getAnalyticsConfiguration", "()Lcom/disney/wdpro/ticketsaleshybrid/ui/AnalyticsConfiguration;", "analyticsConfiguration", "Companion", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final class TicketSalesAndroidHybridActivity extends FoundationStackActivity implements TicketSalesHybridFragment.TicketSalesAndroidHybridFragmentListener {
    private static final String BUNDLE_ENTRY_POINT_KEY = "entryPoint";
    private static final String BUNDLE_URL_FRIENDLY_ID = "urlFriendlyId";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public Context originalContext;

    @Inject
    @JvmField
    public ProfileConfiguration profileConfiguration;
    private boolean shouldLoadPage;

    @Inject
    @JvmField
    public TicketSalesAndroidHybridEnvironment ticketSalesAndroidHybridEnvironment;

    @Inject
    @JvmField
    public UniversalCheckoutDataManager universalCheckoutDataManager;

    @Inject
    @JvmField
    public C9248i vendomatic;
    private String entryPointId = Constants.TICKET_SALES_ENTRYPOINT;
    private final int finishExitAnimation = C21188R.anim.slide_out_to_right;
    private final int finishEnterAnimation = C21188R.anim.do_nothing;

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/activities/TicketSalesAndroidHybridActivity$Companion;", "", "()V", "BUNDLE_ENTRY_POINT_KEY", "", "BUNDLE_URL_FRIENDLY_ID", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "entryPointId", TicketSalesAndroidHybridActivity.BUNDLE_URL_FRIENDLY_ID, "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Intent createIntent(Context context, String entryPointId) {
            return createIntent(context, entryPointId, null);
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent createIntent(Context context, String entryPointId, String urlFriendlyId) {
            Intent intent = new Intent(context, (Class<?>) TicketSalesAndroidHybridActivity.class);
            intent.putExtra("entryPoint", entryPointId);
            intent.putExtra(TicketSalesAndroidHybridActivity.BUNDLE_URL_FRIENDLY_ID, urlFriendlyId);
            intent.putExtra(C8666f.EXTRA_SCREEN_TYPE, ScreenType.STACK);
            return intent;
        }
    }

    @JvmStatic
    public static final Intent createIntent(Context context, String str) {
        return INSTANCE.createIntent(context, str);
    }

    private final Bundle generateSalesChatSharedInformation() {
        Bundle bundle = new Bundle();
        Fragment fragmentM19752n0 = getSupportFragmentManager().m19752n0(C21188R.id.fragment_container);
        if (fragmentM19752n0 != null) {
            TicketSalesHybridFragment ticketSalesHybridFragment = (TicketSalesHybridFragment) fragmentM19752n0;
            if (ticketSalesHybridFragment.getSalesChatErrorInformation() != null) {
                String str = getAnalyticsConfiguration().getTrackStateStem() + ticketSalesHybridFragment.getAnalyticsPageName();
                Error salesChatErrorInformation = ticketSalesHybridFragment.getSalesChatErrorInformation();
                Intrinsics.checkNotNull(salesChatErrorInformation);
                bundle.putString("SDE", SalesChatSharedInformationUtil.getPageIdInfo(str, salesChatErrorInformation));
            } else {
                bundle.putString("SDE", SalesChatSharedInformationUtil.getPageIdInfo(getAnalyticsConfiguration().getTrackStateStem() + ticketSalesHybridFragment.getAnalyticsPageName()));
            }
        }
        bundle.putBoolean("permissionsExtension", true);
        bundle.putBoolean("LiveChatTileExtension", true);
        TicketSalesAndroidHybridEnvironment ticketSalesAndroidHybridEnvironment = this.ticketSalesAndroidHybridEnvironment;
        Intrinsics.checkNotNull(ticketSalesAndroidHybridEnvironment);
        bundle.putLong("campaignId", ticketSalesAndroidHybridEnvironment.getSalesChatCampaignId());
        TicketSalesAndroidHybridEnvironment ticketSalesAndroidHybridEnvironment2 = this.ticketSalesAndroidHybridEnvironment;
        Intrinsics.checkNotNull(ticketSalesAndroidHybridEnvironment2);
        bundle.putLong("engagementId", ticketSalesAndroidHybridEnvironment2.getSalesChatTicketSalesEngagementId());
        return bundle;
    }

    private final void initializeQueueIt() {
        this.shouldLoadPage = false;
        C19471k c19471k = new C19471k();
        c19471k.m61112d(false);
        C9248i c9248i = this.vendomatic;
        Intrinsics.checkNotNull(c9248i);
        String strM38804x = c9248i.m38804x();
        C9248i c9248i2 = this.vendomatic;
        Intrinsics.checkNotNull(c9248i2);
        try {
            new C19467g(this, strM38804x, c9248i2.m38798v(), null, null, new AbstractC19472l() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.activities.TicketSalesAndroidHybridActivity$initializeQueueIt$queueItEngine$1
                @Override // com.disney.wdpro.queueit.AbstractC19472l
                protected void onError(Error error, String errorMessage) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                    this.this$0.shouldLoadPage = true;
                    this.this$0.loadTicketSalesHybrid();
                }

                @Override // com.disney.wdpro.queueit.AbstractC19472l
                protected void onQueueActivityClosed() {
                    if (this.this$0.shouldLoadPage) {
                        return;
                    }
                    this.this$0.finish();
                }

                public void onQueueDisabled() {
                    this.this$0.shouldLoadPage = true;
                    this.this$0.loadTicketSalesHybrid();
                }

                @Override // com.disney.wdpro.queueit.AbstractC19472l
                public void onQueueItUnavailable() {
                    this.this$0.shouldLoadPage = true;
                    this.this$0.loadTicketSalesHybrid();
                }

                @Override // com.disney.wdpro.queueit.AbstractC19472l
                public void onQueuePassed(C19473m queuePassedInfo) {
                    Intrinsics.checkNotNullParameter(queuePassedInfo, "queuePassedInfo");
                    this.this$0.shouldLoadPage = true;
                    this.this$0.loadTicketSalesHybrid();
                }

                @Override // com.disney.wdpro.queueit.AbstractC19472l
                public void onQueueViewWillOpen() {
                }

                @Override // com.disney.wdpro.queueit.AbstractC19472l
                protected void onSessionRestart(C19467g queueITEngine) {
                    Intrinsics.checkNotNullParameter(queueITEngine, "queueITEngine");
                    TicketSalesAndroidHybridActivity ticketSalesAndroidHybridActivity = this.this$0;
                    if (ticketSalesAndroidHybridActivity != null) {
                        try {
                            queueITEngine.run(ticketSalesAndroidHybridActivity);
                        } catch (QueueITException unused) {
                            Toast.makeText(this.this$0, "Please try again.", 1).show();
                        }
                    }
                }

                @Override // com.disney.wdpro.queueit.AbstractC19472l
                public void onUserExited() {
                }

                @Override // com.disney.wdpro.queueit.AbstractC19472l
                public void onWebViewClosed() {
                }
            }, c19471k).run(this);
        } catch (QueueITException e10) {
            e10.printStackTrace();
            Toast.makeText(this, "Please try again.", 1).show();
        }
    }

    private final boolean isTicketSalesScreenEnabled() {
        C9248i c9248i = this.vendomatic;
        Intrinsics.checkNotNull(c9248i);
        return c9248i.m38806x1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadTicketSalesHybrid() {
        C8667g c8667g = this.navigator;
        TicketSalesHybridFragment.Companion companion = TicketSalesHybridFragment.INSTANCE;
        String str = this.entryPointId;
        Intrinsics.checkNotNull(str);
        C8665e.b bVarM37330h = c8667g.m37387v(companion.newInstance(str)).m37330h();
        if (StringsKt.equals(Constants.TICKET_SALES_ENTRYPOINT, this.entryPointId, true) || StringsKt.equals(Constants.TICKET_MODS_ENTRYPOINT, this.entryPointId, true)) {
            bVarM37330h.withAnimations(new SnowballNextFlowAnimation());
        }
        bVarM37330h.navigate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r0.m38682F0(r1.m38771m(), false) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void startFlow() {
        /*
            r3 = this;
            java.lang.String r0 = r3.entryPointId
            java.lang.String r1 = "ticket-sales-entry-point"
            r2 = 1
            boolean r0 = kotlin.text.StringsKt.equals(r1, r0, r2)
            if (r0 == 0) goto L11
            boolean r0 = r3.isTicketSalesScreenEnabled()
            if (r0 != 0) goto L30
        L11:
            java.lang.String r0 = "ticket-mods-entry-point"
            java.lang.String r1 = r3.entryPointId
            boolean r0 = kotlin.text.StringsKt.equals(r0, r1, r2)
            if (r0 == 0) goto L45
            com.disney.wdpro.commons.config.i r0 = r3.vendomatic
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            com.disney.wdpro.commons.config.i r1 = r3.vendomatic
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.String r1 = r1.m38771m()
            r2 = 0
            boolean r0 = r0.m38682F0(r1, r2)
            if (r0 == 0) goto L45
        L30:
            com.disney.wdpro.support.activities.j r0 = r3.getStackComponent()
            r0.hideHeaderNoAnimation()
            boolean r0 = r3.needsToQueue()
            if (r0 == 0) goto L41
            r3.initializeQueueIt()
            return
        L41:
            r3.loadTicketSalesHybrid()
            return
        L45:
            com.disney.wdpro.support.activities.j r0 = r3.getStackComponent()
            r0.showHeader()
            com.disney.wdpro.aligator.g r0 = r3.navigator
            com.disney.wdpro.ticketsaleshybrid.ui.fragment.DownScreenFragment$Companion r1 = com.disney.wdpro.ticketsaleshybrid.p452ui.fragment.DownScreenFragment.INSTANCE
            java.lang.String r3 = r3.entryPointId
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            com.disney.wdpro.ticketsaleshybrid.ui.fragment.DownScreenFragment r3 = r1.newInstance(r3)
            com.disney.wdpro.aligator.e$b r3 = r0.m37387v(r3)
            com.disney.wdpro.aligator.e$b r3 = r3.m37330h()
            r3.navigate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.ticketsaleshybrid.p452ui.activities.TicketSalesAndroidHybridActivity.startFlow():void");
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

    public final AnalyticsConfiguration getAnalyticsConfiguration() {
        String string = getString(C21188R.string.ticket_sales_link_category);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.ticket_sales_link_category)");
        String string2 = getString(C21188R.string.ticket_sales_analytics_stem);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.ticket_sales_analytics_stem)");
        return new AnalyticsConfiguration(string, string2, false);
    }

    public final Context getOriginalContext() {
        Context context = this.originalContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("originalContext");
        return null;
    }

    @Override // com.disney.wdpro.ticketsaleshybrid.ui.fragment.TicketSalesHybridFragment.TicketSalesAndroidHybridFragmentListener
    public void navigateToSalesChatScreen() {
        try {
            this.navigator.m37382o(new C8663c.b().m37291e(DeepLinkAsyncMessaging.ASYNC_MESSAGING.getLink()).m37296j(generateSalesChatSharedInformation()).build());
        } catch (ActivityNotFoundException unused) {
        }
    }

    public final boolean needsToQueue() {
        C9248i c9248i = this.vendomatic;
        Intrinsics.checkNotNull(c9248i);
        if (!c9248i.m38673B1()) {
            return false;
        }
        C9248i c9248i2 = this.vendomatic;
        Intrinsics.checkNotNull(c9248i2);
        return !C22466q.m68722b(c9248i2.m38798v());
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Fragment fragmentM19752n0 = getSupportFragmentManager().m19752n0(C21188R.id.fragment_container);
        TicketSalesHybridFragment ticketSalesHybridFragment = fragmentM19752n0 instanceof TicketSalesHybridFragment ? (TicketSalesHybridFragment) fragmentM19752n0 : null;
        if (ticketSalesHybridFragment != null) {
            ticketSalesHybridFragment.onActivityResult(ActivityResultUtils.internalAndroidRequestCodeToFragment(requestCode), resultCode, data);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.disney.wdpro.ticketsaleshybrid.ui.fragment.TicketSalesHybridFragment.TicketSalesAndroidHybridFragmentListener
    public void onBackNavigation() {
        onBackPressed();
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentM19752n0 = getSupportFragmentManager().m19752n0(C21188R.id.fragment_container);
        if (!(fragmentM19752n0 instanceof TicketSalesHybridFragment)) {
            super.onBackPressed();
            return;
        }
        TicketSalesHybridFragment ticketSalesHybridFragment = (TicketSalesHybridFragment) fragmentM19752n0;
        String webViewUrl = ticketSalesHybridFragment.getWebViewUrl();
        if (ticketSalesHybridFragment.isModalOpened()) {
            ticketSalesHybridFragment.sendBackButtonEvent();
            return;
        }
        if (ticketSalesHybridFragment.isConfirmationLoaded()) {
            ticketSalesHybridFragment.dismiss();
            return;
        }
        if (!ticketSalesHybridFragment.canWebViewGoBack()) {
            super.onBackPressed();
            return;
        }
        if (StringsKt.contains$default((CharSequence) webViewUrl, (CharSequence) "checkout-booking", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) webViewUrl, (CharSequence) Constants.CHANGE_TICKETS_URL, false, 2, (Object) null)) {
            ticketSalesHybridFragment.webViewGoBack();
        } else if (StringsKt.contains$default((CharSequence) webViewUrl, (CharSequence) Constants.ADMISSIONS_TICKETS_DATES_URL, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) webViewUrl, (CharSequence) Constants.ADMISSIONS_TICKETS_ADDONS_URL, false, 2, (Object) null)) {
            ticketSalesHybridFragment.sendWebBackButtonWasClickedEvent();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        ComponentCallbacks2 application = getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridComponentProvider");
        TicketSalesAndroidHybridComponent ticketSalesAndroidHybridComponent = ((TicketSalesAndroidHybridComponentProvider) application).getTicketSalesAndroidHybridComponent();
        if (ticketSalesAndroidHybridComponent != null) {
            ticketSalesAndroidHybridComponent.inject(this);
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.entryPointId = extras.getString("entryPoint");
        }
        super.onCreate(savedInstanceState);
        setContentView(C21188R.layout.ticket_sales_android_hybrid_main_activity);
        startFlow();
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

    @Override // com.disney.wdpro.ticketsaleshybrid.ui.fragment.TicketSalesHybridFragment.TicketSalesAndroidHybridFragmentListener
    public void onDismissPressed() {
        finish();
    }

    @Override // com.disney.wdpro.ticketsaleshybrid.ui.fragment.TicketSalesHybridFragment.TicketSalesAndroidHybridFragmentListener
    public void onLoginPressed() {
        ProfileConfiguration profileConfiguration = this.profileConfiguration;
        Intrinsics.checkNotNull(profileConfiguration);
        navigate(null, profileConfiguration.getProfileNavEntriesBuilderProvider().getNavigationEntryForSecondarySignIn(this).withCallbacks(new LightBoxCallbacks() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.activities.TicketSalesAndroidHybridActivity.onLoginPressed.1
            @Override // com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks
            public boolean onCancel() {
                Fragment fragmentM19752n0 = TicketSalesAndroidHybridActivity.this.getSupportFragmentManager().m19752n0(C21188R.id.fragment_container);
                if (fragmentM19752n0 instanceof TicketSalesHybridFragment) {
                    TicketSalesHybridFragment ticketSalesHybridFragment = (TicketSalesHybridFragment) fragmentM19752n0;
                    ticketSalesHybridFragment.loginFailed();
                    ticketSalesHybridFragment.onFinishLoadingScreen();
                    String webViewUrl = ticketSalesHybridFragment.getWebViewUrl();
                    if (webViewUrl != null && StringsKt.contains$default((CharSequence) webViewUrl, (CharSequence) "checkout-booking", false, 2, (Object) null)) {
                        ticketSalesHybridFragment.webViewGoBack();
                    }
                    if (StringsKt.equals(Constants.TICKET_MODS_ENTRYPOINT, TicketSalesAndroidHybridActivity.this.entryPointId, true)) {
                        TicketSalesAndroidHybridActivity.this.finish();
                    }
                }
                return true;
            }

            @Override // com.disney.wdpro.profile_ui.lightbox.LightBoxCallbacks
            public boolean onError() {
                Fragment fragmentM19752n0 = TicketSalesAndroidHybridActivity.this.getSupportFragmentManager().m19752n0(C21188R.id.fragment_container);
                if (!(fragmentM19752n0 instanceof TicketSalesHybridFragment)) {
                    return false;
                }
                ((TicketSalesHybridFragment) fragmentM19752n0).loginFailed();
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
}