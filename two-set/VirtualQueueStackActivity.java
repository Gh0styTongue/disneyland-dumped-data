package com.disney.wdpro.virtualqueue.core;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.core.content.C3296a;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC5017f;
import co.C6205a;
import com.disney.wdpro.aligator.C8665e;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.aligator.InterfaceC8662b;
import com.disney.wdpro.aligator.NavigationEntry;
import com.disney.wdpro.aligator.ScreenType;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commons.permissions.C9348a;
import com.disney.wdpro.commons.permissions.Permissions;
import com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionsMonitor;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import com.disney.wdpro.support.C20856k;
import com.disney.wdpro.support.activities.FoundationStackActivity;
import com.disney.wdpro.support.widget.SnowballHeader;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
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

@Metadata(m92037d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\r\b\u0007\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001LB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0006\u0010'\u001a\u00020$J\b\u0010(\u001a\u00020$H\u0016J2\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0016J\u001a\u0010)\u001a\u00020$2\u0010\u00102\u001a\f\u0012\u0006\b\u0001\u0012\u000204\u0018\u000103H\u0016J\b\u00105\u001a\u00020$H\u0016J\u0012\u00106\u001a\u00020$2\b\u00107\u001a\u0004\u0018\u000108H\u0014J+\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020;2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=2\u0006\u0010?\u001a\u00020@H\u0016¢\u0006\u0002\u0010AJ\b\u0010B\u001a\u00020$H\u0016J\b\u0010C\u001a\u00020$H\u0016J\b\u0010D\u001a\u00020$H\u0016J\u0018\u0010E\u001a\u00020$2\u0006\u0010F\u001a\u00020>2\u0006\u0010G\u001a\u00020/H\u0016J\u0018\u0010E\u001a\u00020$2\u0006\u0010F\u001a\u00020>2\u0006\u0010H\u001a\u00020>H\u0002J\u0006\u0010I\u001a\u00020$J\u0012\u0010J\u001a\u00020$2\b\u0010K\u001a\u0004\u0018\u000108H\u0002R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006M"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/VirtualQueueStackActivity;", "Lcom/disney/wdpro/support/activities/FoundationStackActivity;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/ActivityActions;", "()V", "<anonymous parameter 0>", "Lcom/disney/wdpro/support/widget/SnowballHeader;", "header", "getHeader", "()Lcom/disney/wdpro/support/widget/SnowballHeader;", "setHeader", "(Lcom/disney/wdpro/support/widget/SnowballHeader;)V", "locationRegionsMonitor", "Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionsMonitor;", "getLocationRegionsMonitor", "()Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionsMonitor;", "setLocationRegionsMonitor", "(Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionsMonitor;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "vqRegions", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "getVqRegions", "()Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "setVqRegions", "(Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;)V", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "getVqThemer", "()Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "setVqThemer", "(Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "addHeaderRightView", "", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "Landroid/view/View;", "hideDismissNavigation", "navigateBack", "navigateTo", "fragment", "Landroidx/fragment/app/Fragment;", "withAnims", "Lcom/disney/wdpro/aligator/NavigationEntry$CustomAnimations;", "noPush", "", "clearHistory", "withLoginCheck", "navigationEntry", "Lcom/disney/wdpro/aligator/NavigationEntry;", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", OrionDeepLinkConstants.REQUEST_CODE_KEY, "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestEnableBluetooth", "requestEnableLocation", "requestEnablePushNotifications", "setTitle", "title", "addPtrHint", "contentDescription", "showDismissNavigation", "startFlow", "data", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@InterfaceC8662b
/* loaded from: classes20.dex */
public final class VirtualQueueStackActivity extends FoundationStackActivity implements ActivityActions {

    @Inject
    public DisneyLocationRegionsMonitor locationRegionsMonitor;

    @Inject
    public SharedPreferences sharedPreferences;

    @Inject
    public VirtualQueueRegions vqRegions;

    @Inject
    public VirtualQueueThemer vqThemer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/VirtualQueueStackActivity$Companion;", "", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent createIntent(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) VirtualQueueStackActivity.class);
            intent.putExtra(C8666f.EXTRA_SCREEN_TYPE, ScreenType.STACK);
            return intent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1$lambda$0(VirtualQueueStackActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void startFlow(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.virtualqueue.core.VirtualQueueStackActivity.startFlow(android.os.Bundle):void");
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
        return (SnowballHeader) findViewById(C21487R.id.toolbar);
    }

    public final DisneyLocationRegionsMonitor getLocationRegionsMonitor() {
        DisneyLocationRegionsMonitor disneyLocationRegionsMonitor = this.locationRegionsMonitor;
        if (disneyLocationRegionsMonitor != null) {
            return disneyLocationRegionsMonitor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationRegionsMonitor");
        return null;
    }

    public final SharedPreferences getSharedPreferences() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        return null;
    }

    public final VirtualQueueRegions getVqRegions() {
        VirtualQueueRegions virtualQueueRegions = this.vqRegions;
        if (virtualQueueRegions != null) {
            return virtualQueueRegions;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vqRegions");
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

    public final void hideDismissNavigation() {
        SnowballHeader header = getHeader();
        if (header != null) {
            header.setNavigationIcon((Drawable) null);
        }
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void navigateBack() {
        ActivityActions.DefaultImpls.setTitle$default(this, "", false, 2, null);
        this.navigator.m37377j();
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void navigateTo(Fragment fragment, NavigationEntry.CustomAnimations withAnims, boolean noPush, boolean clearHistory, boolean withLoginCheck) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        ActivityActions.DefaultImpls.setTitle$default(this, "", false, 2, null);
        C8665e.b bVarM37387v = this.navigator.m37387v(fragment);
        if (withAnims != null) {
            bVarM37387v.withAnimations(withAnims);
        }
        if (noPush) {
            bVarM37387v.m37330h();
        }
        if (clearHistory) {
            bVarM37387v.m37329g();
        }
        if (withLoginCheck) {
            bVarM37387v.withLoginCheck();
        }
        bVarM37387v.navigate();
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
        final VirtualQueueStackActivity virtualQueueStackActivity;
        super.onCreate(savedInstanceState);
        SnowballHeader header = getHeader();
        if (header != null) {
            virtualQueueStackActivity = this;
            header.setNavigationIcon(new C6205a(virtualQueueStackActivity, C21487R.font.peptasia, C20856k.icon_close, 17.0f, (Integer) null, 16, (DefaultConstructorMarker) null));
            header.setNavigationIconColor(C3296a.getColor(virtualQueueStackActivity, C21487R.color.disney_blue));
            header.getToolbar().setNavigationContentDescription("Close");
            header.getToolbar().setNavigationOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.core.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VirtualQueueStackActivity.onCreate$lambda$1$lambda$0(this.f45224a, view);
                }
            });
            header.enable();
        } else {
            virtualQueueStackActivity = this;
        }
        virtualQueueStackActivity.startFlow(virtualQueueStackActivity.getIntent().getExtras());
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
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void requestEnableLocation() {
        if (!getVqRegions().isLocationPermissionDeniedPermanently(this) && getVqRegions().isLocationEnabled()) {
            C9348a.m39057j(this, 1002, Permissions.LOCATION, Permissions.BACKGROUND_LOCATION);
            return;
        }
        Intent intent = new Intent(VirtualQueueFoundationActivity.APP_LOCATION_SETTINGS);
        intent.putExtra(VirtualQueueFoundationActivity.APP_PACKAGE, getPackageName());
        intent.putExtra(VirtualQueueFoundationActivity.APP_UID, getApplicationInfo().uid);
        intent.putExtra(VirtualQueueFoundationActivity.EXTRA_APP_PACKAGE, getPackageName());
        startActivity(intent);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void requestEnablePushNotifications() {
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void setHeader(SnowballHeader snowballHeader) {
    }

    public final void setLocationRegionsMonitor(DisneyLocationRegionsMonitor disneyLocationRegionsMonitor) {
        Intrinsics.checkNotNullParameter(disneyLocationRegionsMonitor, "<set-?>");
        this.locationRegionsMonitor = disneyLocationRegionsMonitor;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
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

    public final void setVqRegions(VirtualQueueRegions virtualQueueRegions) {
        Intrinsics.checkNotNullParameter(virtualQueueRegions, "<set-?>");
        this.vqRegions = virtualQueueRegions;
    }

    public final void setVqThemer(VirtualQueueThemer virtualQueueThemer) {
        Intrinsics.checkNotNullParameter(virtualQueueThemer, "<set-?>");
        this.vqThemer = virtualQueueThemer;
    }

    public final void showDismissNavigation() {
        SnowballHeader header = getHeader();
        if (header != null) {
            header.setNavigationIcon(new C6205a(this, C21487R.font.peptasia, C21487R.string.icon_close, 17.0f, (Integer) null, 16, (DefaultConstructorMarker) null));
        }
    }

    private final void setTitle(String title, String contentDescription) {
        ViewTreeObserver viewTreeObserver;
        SnowballHeader header = getHeader();
        if (header != null) {
            header.setHeaderTitle(title);
            header.setScreenTitleContentDescriptionWithoutHeading(contentDescription);
            super.setTitle(contentDescription);
            getWindow().getDecorView().sendAccessibilityEvent(32);
            RelativeLayout rightViewContainer = header.getRightViewContainer();
            if (rightViewContainer != null) {
                rightViewContainer.removeAllViews();
            }
            RelativeLayout rightViewContainer2 = header.getRightViewContainer();
            if (rightViewContainer2 == null || (viewTreeObserver = rightViewContainer2.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(header);
        }
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions
    public void navigateTo(NavigationEntry<? extends Object> navigationEntry) {
        if (navigationEntry != null) {
            ActivityActions.DefaultImpls.setTitle$default(this, "", false, 2, null);
            this.navigator.m37382o(navigationEntry);
        }
    }
}