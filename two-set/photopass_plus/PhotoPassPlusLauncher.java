package com.disney.wdpro.photopass_plus;

import android.content.Context;
import android.content.Intent;
import com.disney.wdpro.aligator.NavigationEntry;
import com.disney.wdpro.base_sales_ui_lib.SalesLauncher;
import com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity;
import com.disney.wdpro.photopass_plus.abtesting.ExperienceType;
import com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityDLR;
import com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityWDW;
import com.disney.wdpro.photopass_plus.models.CapturedMediaInfo;
import com.disney.wdpro.photopass_plus.models.PurchasedProduct;
import com.disney.wdpro.ticket_sales_base_lib.business.host_app.GuestGroup;

/* loaded from: classes15.dex */
public class PhotoPassPlusLauncher extends SalesLauncher {
    public static final String PURCHASED_PRODUCT_KEY = "purchased_product_key";
    private ExperienceType experienceType;
    private NavigationEntry<?> linkPhotosNavigation;
    private NavigationEntry<?> linkTicketNavigation;
    private CapturedMediaInfo mediaInfo;
    private boolean multiDayAlreadyPurchased;
    private NavigationEntry<?> pullDownButtonNavigation;

    public PhotoPassPlusLauncher(Context context) {
        super(context);
        this.multiDayAlreadyPurchased = false;
    }

    public static PurchasedProduct getPurchasedProduct(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (PurchasedProduct) intent.getSerializableExtra(PURCHASED_PRODUCT_KEY);
    }

    public PhotoPassPlusLauncher forABTestingExperience(ExperienceType experienceType) {
        this.experienceType = experienceType;
        return this;
    }

    public PhotoPassPlusLauncher forSpecificMedia(CapturedMediaInfo capturedMediaInfo) {
        this.mediaInfo = capturedMediaInfo;
        return this;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.SalesLauncher
    public Intent getIntent() {
        Intent intent = super.getIntent();
        intent.putExtra(PhotoPassPlusActivityWDW.KEY_MULTI_DAY_ALREADY_PURCHASED, this.multiDayAlreadyPurchased);
        intent.putExtra(PhotoPassPlusActivityWDW.KEY_GUEST_MEDIA_INFO, this.mediaInfo);
        intent.putExtra(PhotoPassPlusActivityWDW.KEY_AB_EXPERIENCE_TYPE, this.experienceType);
        NavigationEntry<?> navigationEntry = this.linkTicketNavigation;
        if (navigationEntry != null) {
            intent.putExtra(PhotoPassPlusActivityWDW.KEY_LINK_TICKET_NAVIGATION_ENTRY, navigationEntry);
        }
        NavigationEntry<?> navigationEntry2 = this.linkPhotosNavigation;
        if (navigationEntry2 != null) {
            intent.putExtra(PhotoPassPlusActivityWDW.KEY_LINK_PHOTOS_NAVIGATION_ENTRY, navigationEntry2);
        }
        NavigationEntry<?> navigationEntry3 = this.pullDownButtonNavigation;
        if (navigationEntry3 == null) {
            return intent;
        }
        intent.putExtra(PhotoPassPlusActivityWDW.KEY_PULL_DOWN_BUTTON_NAVIGATION_ENTRY, navigationEntry3);
        return intent;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.SalesLauncher
    protected Class<? extends SalesActivity> getSalesClass(GuestGroup guestGroup) {
        return guestGroup == GuestGroup.DLR ? PhotoPassPlusActivityDLR.class : PhotoPassPlusActivityWDW.class;
    }

    public PhotoPassPlusLauncher withLinkPhotosNavigation(NavigationEntry<?> navigationEntry) {
        this.linkPhotosNavigation = navigationEntry;
        return this;
    }

    public PhotoPassPlusLauncher withLinkTicketNavigation(NavigationEntry<?> navigationEntry) {
        this.linkTicketNavigation = navigationEntry;
        return this;
    }

    public PhotoPassPlusLauncher withMultiDayAlreadyPurchased() {
        this.multiDayAlreadyPurchased = true;
        return this;
    }

    public PhotoPassPlusLauncher withPullDownButtonNavigation(NavigationEntry<?> navigationEntry) {
        this.pullDownButtonNavigation = navigationEntry;
        return this;
    }
}