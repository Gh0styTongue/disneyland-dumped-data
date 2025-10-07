package com.disney.wdpro.virtualqueue.core.interfaces;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.disney.wdpro.aligator.NavigationEntry;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.support.widget.SnowballHeader;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\tH&J:\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H&J\u001a\u0010\r\u001a\u00020\t2\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0017H&J\b\u0010\u0018\u001a\u00020\tH&J\b\u0010\u0019\u001a\u00020\tH&J\b\u0010\u001a\u001a\u00020\tH&J\u001a\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u0013H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u001f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/ActivityActions;", "", "header", "Lcom/disney/wdpro/support/widget/SnowballHeader;", "getHeader", "()Lcom/disney/wdpro/support/widget/SnowballHeader;", "setHeader", "(Lcom/disney/wdpro/support/widget/SnowballHeader;)V", "addHeaderRightView", "", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "Landroid/view/View;", "navigateBack", "navigateTo", "fragment", "Landroidx/fragment/app/Fragment;", "withAnims", "Lcom/disney/wdpro/aligator/NavigationEntry$CustomAnimations;", "noPush", "", "clearHistory", "withLoginCheck", "navigationEntry", "Lcom/disney/wdpro/aligator/NavigationEntry;", "requestEnableBluetooth", "requestEnableLocation", "requestEnablePushNotifications", "setTitle", "title", "", "addPtrHint", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface ActivityActions {

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void navigateTo$default(ActivityActions activityActions, Fragment fragment, NavigationEntry.CustomAnimations customAnimations, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateTo");
            }
            if ((i10 & 2) != 0) {
                customAnimations = null;
            }
            activityActions.navigateTo(fragment, customAnimations, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? false : z12);
        }

        public static /* synthetic */ void setTitle$default(ActivityActions activityActions, String str, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTitle");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            activityActions.setTitle(str, z10);
        }
    }

    void addHeaderRightView(View view);

    SnowballHeader getHeader();

    void navigateBack();

    void navigateTo(Fragment fragment, NavigationEntry.CustomAnimations withAnims, boolean noPush, boolean clearHistory, boolean withLoginCheck);

    void navigateTo(NavigationEntry<? extends Object> navigationEntry);

    void requestEnableBluetooth();

    void requestEnableLocation();

    void requestEnablePushNotifications();

    void setHeader(SnowballHeader snowballHeader);

    void setTitle(String title, boolean addPtrHint);
}