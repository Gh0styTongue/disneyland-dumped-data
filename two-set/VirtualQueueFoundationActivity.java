package com.disney.wdpro.virtualqueue.core;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC5017f;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.aligator.InterfaceC8662b;
import com.disney.wdpro.aligator.NavigationEntry;
import com.disney.wdpro.aligator.ScreenType;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commons.permissions.C9348a;
import com.disney.wdpro.commons.permissions.Permissions;
import com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionsMonitor;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import com.disney.wdpro.support.activities.FoundationStackActivity;
import com.disney.wdpro.support.widget.SnowballHeader;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.fragments.DetailFragment;
import com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p498da.InterfaceC27132a;

@Metadata(m92037d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J2\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0016J\u001a\u0010\u001d\u001a\u00020\u00172\u0010\u0010&\u001a\f\u0012\u0006\b\u0001\u0012\u00020(\u0018\u00010'H\u0016J\"\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001b2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\u0017H\u0016J\u0012\u0010/\u001a\u00020\u00172\b\u00100\u001a\u0004\u0018\u000101H\u0014J+\u00102\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u001b2\f\u00103\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00106\u001a\u000207H\u0016¢\u0006\u0002\u00108J\b\u00109\u001a\u00020\u0017H\u0016J\b\u0010:\u001a\u00020\u0017H\u0016J\b\u0010;\u001a\u00020\u0017H\u0016J\u0018\u0010<\u001a\u00020\u00172\u0006\u0010=\u001a\u0002052\u0006\u0010>\u001a\u00020#H\u0016J\u0018\u0010<\u001a\u00020\u00172\u0006\u0010=\u001a\u0002052\u0006\u0010?\u001a\u000205H\u0002J\u0012\u0010@\u001a\u00020\u00172\b\u0010,\u001a\u0004\u0018\u000101H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006B"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/VirtualQueueFoundationActivity;", "Lcom/disney/wdpro/support/activities/FoundationStackActivity;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/ActivityActions;", "()V", "header", "Lcom/disney/wdpro/support/widget/SnowballHeader;", "getHeader", "()Lcom/disney/wdpro/support/widget/SnowballHeader;", "setHeader", "(Lcom/disney/wdpro/support/widget/SnowballHeader;)V", "locationRegionsMonitor", "Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionsMonitor;", "getLocationRegionsMonitor", "()Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionsMonitor;", "setLocationRegionsMonitor", "(Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionsMonitor;)V", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "getVqThemer", "()Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "setVqThemer", "(Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "addHeaderRightView", "", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "Landroid/view/View;", "getLayoutResourceId", "", "navigateBack", "navigateTo", "fragment", "Landroidx/fragment/app/Fragment;", "withAnims", "Lcom/disney/wdpro/aligator/NavigationEntry$CustomAnimations;", "noPush", "", "clearHistory", "withLoginCheck", "navigationEntry", "Lcom/disney/wdpro/aligator/NavigationEntry;", "", "onActivityResult", OrionDeepLinkConstants.REQUEST_CODE_KEY, "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestEnableBluetooth", "requestEnableLocation", "requestEnablePushNotifications", "setTitle", "title", "addPtrHint", "contentDescription", "startFlow", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@InterfaceC8662b
/* loaded from: classes20.dex */
public final class VirtualQueueFoundationActivity extends FoundationStackActivity implements ActivityActions {
    public static final String APP_LOCATION_SETTINGS = "android.settings.LOCATION_SOURCE_SETTINGS";
    public static final String APP_NOTIFICATIONS_SETTINGS = "android.settings.APP_NOTIFICATION_SETTINGS";
    public static final String APP_PACKAGE = "app_package";
    public static final String APP_UID = "app_uid";
    public static final String EXTRA_APP_PACKAGE = "android.provider.extra.APP_PACKAGE";
    public static final int REQUEST_ENABLE_BLUETOOTH = 1001;
    public static final int REQUEST_ENABLE_LOCATION = 1002;
    private SnowballHeader header;

    @Inject
    public DisneyLocationRegionsMonitor locationRegionsMonitor;

    @Inject
    public VirtualQueueThemer vqThemer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/VirtualQueueFoundationActivity$Companion;", "", "()V", "APP_LOCATION_SETTINGS", "", "APP_NOTIFICATIONS_SETTINGS", "APP_PACKAGE", "APP_UID", "EXTRA_APP_PACKAGE", "REQUEST_ENABLE_BLUETOOTH", "", "REQUEST_ENABLE_LOCATION", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent createIntent(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) VirtualQueueFoundationActivity.class);
            intent.putExtra(C8666f.EXTRA_SCREEN_TYPE, ScreenType.FOUNDATION);
            return intent;
        }

        private Companion() {
        }
    }

    private final void startFlow(Bundle data) {
        this.navigator.m37387v((data != null ? data.getInt(VirtualQueueConstants.FLOW_PARAM, -1) : -1) == 20007 ? DetailFragment.INSTANCE.newInstance(data) : MyQueuesFragment.INSTANCE.newInstance(data)).m37330h().navigate();
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void addHeaderRightView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        SnowballHeader header = getHeader();
        if (header != null) {
            header.addRightView(view);
        }
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public SnowballHeader getHeader() {
        return this.header;
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity
    public int getLayoutResourceId() {
        return C21487R.layout.vq_foundation_base;
    }

    public final DisneyLocationRegionsMonitor getLocationRegionsMonitor() {
        DisneyLocationRegionsMonitor disneyLocationRegionsMonitor = this.locationRegionsMonitor;
        if (disneyLocationRegionsMonitor != null) {
            return disneyLocationRegionsMonitor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationRegionsMonitor");
        return null;
    }

    public final VirtualQueueThemer getVqThemer() {
        VirtualQueueThemer virtualQueueThemer = this.vqThemer;
        if (virtualQueueThemer != null) {
            return virtualQueueThemer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vqThemer");
        return null;
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void navigateBack() {
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void navigateTo(Fragment fragment, NavigationEntry.CustomAnimations withAnims, boolean noPush, boolean clearHistory, boolean withLoginCheck) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(resultCode, resultCode, data);
        if (requestCode == 1001 && resultCode == -1) {
            startFlow(null);
        }
        if (resultCode == -1) {
            if ((data != null ? data.getExtras() : null) != null) {
                List<Fragment> listM19680E0 = getSupportFragmentManager().m19680E0();
                Intrinsics.checkNotNullExpressionValue(listM19680E0, "supportFragmentManager.fragments");
                for (Fragment fragment : listM19680E0) {
                    if (fragment instanceof MyQueuesFragment) {
                        ((MyQueuesFragment) fragment).refresh(data.getExtras());
                    }
                }
            }
        }
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        List<Fragment> listM19680E0 = getSupportFragmentManager().m19680E0();
        Intrinsics.checkNotNullExpressionValue(listM19680E0, "supportFragmentManager.fragments");
        for (InterfaceC5017f interfaceC5017f : listM19680E0) {
            if ((interfaceC5017f instanceof InterfaceC27132a) && ((InterfaceC27132a) interfaceC5017f).onBackPressed()) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHeader((SnowballHeader) findViewById(C21487R.id.snowballHeader));
        SnowballHeader header = getHeader();
        if (header != null) {
            header.enable();
        }
        startFlow(getIntent().getExtras());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1002) {
            if ((grantResults.length == 0) || grantResults[0] != 0) {
                return;
            }
            getLocationRegionsMonitor().startTracking();
        }
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void requestEnableBluetooth() {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1001);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void requestEnableLocation() {
        Permissions permissions = Permissions.LOCATION;
        if (!C9348a.m39050c(this, permissions)) {
            C9348a.m39057j(this, 1002, permissions, Permissions.BACKGROUND_LOCATION);
            return;
        }
        Intent intent = new Intent(APP_LOCATION_SETTINGS);
        intent.putExtra(APP_PACKAGE, getPackageName());
        intent.putExtra(APP_UID, getApplicationInfo().uid);
        intent.putExtra(EXTRA_APP_PACKAGE, getPackageName());
        startActivity(intent);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void requestEnablePushNotifications() {
        Intent intent = new Intent(APP_NOTIFICATIONS_SETTINGS);
        intent.putExtra(APP_PACKAGE, getPackageName());
        intent.putExtra(APP_UID, getApplicationInfo().uid);
        intent.putExtra(EXTRA_APP_PACKAGE, getPackageName());
        startActivity(intent);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void setHeader(SnowballHeader snowballHeader) {
        this.header = snowballHeader;
    }

    public final void setLocationRegionsMonitor(DisneyLocationRegionsMonitor disneyLocationRegionsMonitor) {
        Intrinsics.checkNotNullParameter(disneyLocationRegionsMonitor, "<set-?>");
        this.locationRegionsMonitor = disneyLocationRegionsMonitor;
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void setTitle(String title, boolean addPtrHint) {
        String str;
        Intrinsics.checkNotNullParameter(title, "title");
        String string$default = VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.CommonHeadingAccessibility, MapsKt.mapOf(TuplesKt.m92045to("headerTitle", title)), null, false, 12, null);
        String string$default2 = VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.CommonPTRTitleAccessibility, null, false, 6, null);
        if (addPtrHint) {
            str = string$default + ", " + string$default2;
        } else {
            str = "";
        }
        setTitle(title, str);
    }

    public final void setVqThemer(VirtualQueueThemer virtualQueueThemer) {
        Intrinsics.checkNotNullParameter(virtualQueueThemer, "<set-?>");
        this.vqThemer = virtualQueueThemer;
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void navigateTo(NavigationEntry<? extends Object> navigationEntry) {
        if (navigationEntry != null) {
            this.navigator.m37382o(navigationEntry);
        }
    }

    private final void setTitle(String title, String contentDescription) {
        SnowballHeader header = getHeader();
        if (header != null) {
            header.setHeaderTitle(title);
            header.setScreenTitleContentDescriptionWithoutHeading(contentDescription);
            super.setTitle(contentDescription);
            getWindow().getDecorView().sendAccessibilityEvent(32);
        }
    }
}