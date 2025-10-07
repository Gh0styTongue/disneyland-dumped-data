package com.disney.wdpro.photopass_plus.activities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.disney.wdpro.aligator.C8665e;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.aligator.NavigationEntry;
import com.disney.wdpro.aligator.ScreenType;
import com.disney.wdpro.analytics.InterfaceC8669a;
import com.disney.wdpro.base_sales_ui_lib.PurchaseFlowType;
import com.disney.wdpro.base_sales_ui_lib.SalesLauncher;
import com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.Formatters;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.photopass_plus.C18785R;
import com.disney.wdpro.photopass_plus.PhotoPassPlusLauncher;
import com.disney.wdpro.photopass_plus.abtesting.ExperienceActions;
import com.disney.wdpro.photopass_plus.abtesting.ExperienceConstants;
import com.disney.wdpro.photopass_plus.abtesting.ExperienceHelper;
import com.disney.wdpro.photopass_plus.abtesting.ExperienceType;
import com.disney.wdpro.photopass_plus.fragments.PhotoPassDownFragment;
import com.disney.wdpro.photopass_plus.fragments.PhotoPassOrderConfirmationFragment;
import com.disney.wdpro.photopass_plus.fragments.PhotoPassOrderSummaryFragment;
import com.disney.wdpro.photopass_plus.fragments.PhotoPassPaywallFragment;
import com.disney.wdpro.photopass_plus.fragments.PhotoPassTermsAndConditionsFragment;
import com.disney.wdpro.photopass_plus.host_app.PhotoPassPlusHostContext;
import com.disney.wdpro.photopass_plus.models.CapturedMediaInfo;
import com.disney.wdpro.photopass_plus.models.PhotoPassProduct;
import com.disney.wdpro.photopass_plus.models.PurchasedProduct;
import com.disney.wdpro.photopass_plus.p399di.PhotoPassPlusUIComponent;
import com.disney.wdpro.photopass_plus.p399di.PhotoPassPlusUIComponentProvider;
import com.disney.wdpro.photopass_plus.utils.StringsProvider;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.ticket_sales_base_lib.business.PhotoPassPlusEnvironment;
import com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesParams;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.SupportedPaymentType;
import com.disney.wdpro.ticket_sales_base_lib.business.host_app.GuestGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DiscountGroupType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.Policy;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductParameters;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductType;
import com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutToggleUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.squareup.otto.Subscribe;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Instrumented
/* loaded from: classes15.dex */
public class PhotoPassPlusActivityWDW extends SalesActivity implements PhotoPassOrderConfirmationFragment.OrderConfirmationActions, BaseSelectionFragment.SalesActions, PhotoPassPaywallFragment.PayWallActions, ExperienceActions, StringsProvider {
    private static final DiscountGroupType DISCOUNT_GROUP_TYPE = DiscountGroupType.STD_GST;
    public static final String KEY_AB_EXPERIENCE_TYPE = "key_ab_experience_type";
    public static final String KEY_GUEST_MEDIA_INFO = "key_guest_media_info";
    public static final String KEY_LINK_PHOTOS_NAVIGATION_ENTRY = "key_link_photos_navigation_entry";
    public static final String KEY_LINK_TICKET_NAVIGATION_ENTRY = "key_link_ticket_navigation_entry";
    public static final String KEY_MULTI_DAY_ALREADY_PURCHASED = "key_multi_day_already_purchased";
    private static final String KEY_NEXT_STEP_KEY = "key_next_step";
    public static final String KEY_PULL_DOWN_BUTTON_NAVIGATION_ENTRY = "key_pull_down_button_navigation_entry";

    @Deprecated
    public static final int MEMORYMAKER_BOOKED_ORDER = 200;

    @Deprecated
    public static final int MEMORYMAKER_PENDED_ORDER = 150;
    private static final int NUM_ALL_AGES_TICKETS = 1;
    protected static final int REQUEST_CODE_LINK_PASSES = 32435;
    protected static final int REQUEST_CODE_LINK_PHOTOS = 32436;
    protected static final String SHOW_LINK_SUCCESSFUL = "SHOW_LINK_SUCCESSFUL";
    private static final int UNDEFINED_VERSION_CODE = -1;
    private ExperienceHelper abExperienceHelper;
    private ExperienceType abExperienceType;
    protected CommerceCheckoutDelegate commerceCheckoutDelegate;
    private NavigationEntry<?> linkItToYourTicketAndPasses;
    private NavigationEntry<?> linkYourPhotos;
    protected CapturedMediaInfo mediaInfo;
    private boolean multiDayAlreadyPurchased;
    private NextStep nextStep = NextStep.NOT_DEFINED;
    private PhotoPassPlusEnvironment photoPassPlusEnvironment;
    private PhotoPassPlusHostContext photoPassPlusHostContext;
    private PhotoPassPlusUIComponent photoPassPlusUIComponent;
    private NavigationEntry<?> pullDownButtonNavigation;

    /* renamed from: com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityWDW$1 */
    static /* synthetic */ class C187861 {

        /* renamed from: $SwitchMap$com$disney$wdpro$photopass_plus$activities$PhotoPassPlusActivityWDW$NextStep */
        static final /* synthetic */ int[] f41718x8111b8ab;

        static {
            int[] iArr = new int[NextStep.values().length];
            f41718x8111b8ab = iArr;
            try {
                iArr[NextStep.LINK_PASSES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41718x8111b8ab[NextStep.LINK_PHOTOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41718x8111b8ab[NextStep.PULL_DOWN_BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41718x8111b8ab[NextStep.NOT_DEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum NextStep {
        NOT_DEFINED,
        LINK_PASSES,
        LINK_PHOTOS,
        PULL_DOWN_BUTTON
    }

    private NavigationEntry<?> generateNavigationPhotoPassLinkPhotos(NavigationEntry<?> navigationEntry) {
        C8666f.b bVar = new C8666f.b((Intent) navigationEntry.getTarget());
        bVar.withAnimations(navigationEntry.getAnimations()).m37363q(REQUEST_CODE_LINK_PHOTOS);
        if (navigationEntry.isSticky()) {
            bVar.sticky();
        }
        return bVar.build();
    }

    private NavigationEntry<?> generateNavigationPullDownButton(NavigationEntry<?> navigationEntry) {
        C8666f.b bVar = new C8666f.b((Intent) navigationEntry.getTarget());
        bVar.withAnimations(navigationEntry.getAnimations()).m37364r(ScreenType.STACK);
        if (navigationEntry.isSticky()) {
            bVar.sticky();
        }
        return bVar.build();
    }

    private NavigationEntry<?> generateNavigationTicketAndPasses(NavigationEntry<?> navigationEntry) {
        C8666f.b bVar = new C8666f.b((Intent) navigationEntry.getTarget());
        bVar.withAnimations(navigationEntry.getAnimations()).m37364r(ScreenType.STACK).m37363q(REQUEST_CODE_LINK_PASSES);
        if (navigationEntry.isSticky()) {
            bVar.sticky();
        }
        return bVar.build();
    }

    private int getVersionCode() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendUnifiedCheckoutABTestingRequest$0(SelectedTicketProducts selectedTicketProducts, int i10, Calendar calendar, C9350r c9350r, String str, String str2) {
        if (str2 != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    Map map = (Map) GsonInstrumentation.fromJson(new Gson(), str2, Map.class);
                    if (!map.containsKey("enableUnifiedCheckout") || !((Boolean) map.get("enableUnifiedCheckout")).booleanValue()) {
                        goToNativeCheckout(selectedTicketProducts, i10, calendar, c9350r, str);
                        return;
                    } else {
                        goToUnifiedCheckout(selectedTicketProducts);
                        Objects.toString(map.get("enableUnifiedCheckout"));
                        return;
                    }
                }
            } catch (JsonSyntaxException unused) {
                goToNativeCheckout(selectedTicketProducts, i10, calendar, c9350r, str);
                return;
            }
        }
        goToNativeCheckout(selectedTicketProducts, i10, calendar, c9350r, str);
    }

    private void setActivityResult(PurchasedProduct purchasedProduct) {
        Intent intent = new Intent();
        intent.putExtra(PhotoPassPlusLauncher.PURCHASED_PRODUCT_KEY, purchasedProduct);
        setResult(-1, intent);
    }

    private void setConfirmationExitNavigationData(PurchasedProduct purchasedProduct) {
        if (getExitNavigation() != null) {
            ((Intent) getExitNavigation().getTarget()).putExtra(PhotoPassPlusLauncher.PURCHASED_PRODUCT_KEY, purchasedProduct);
        }
    }

    private void setPullDownExitNavigationData(PurchasedProduct purchasedProduct) {
        NavigationEntry<?> navigationEntry = this.pullDownButtonNavigation;
        if (navigationEntry != null) {
            ((Intent) navigationEntry.getTarget()).putExtra(PhotoPassPlusLauncher.PURCHASED_PRODUCT_KEY, purchasedProduct);
        }
    }

    private void setupExperience() {
        String userSwid;
        try {
            userSwid = this.authenticationManager.getUserSwid();
        } catch (NullPointerException e10) {
            e10.toString();
            userSwid = "";
        }
        this.abExperienceType = (ExperienceType) getIntent().getSerializableExtra(KEY_AB_EXPERIENCE_TYPE);
        this.abExperienceHelper = new ExperienceHelper(userSwid, getApplication(), getVersionCode(), this.abExperienceType);
    }

    private boolean shouldShowAlaCarte() {
        CapturedMediaInfo capturedMediaInfo = this.mediaInfo;
        boolean z10 = capturedMediaInfo != null && capturedMediaInfo.isPicture();
        ExperienceType experienceType = this.abExperienceType;
        return z10 && (experienceType != null ? ExperienceType.A_LA_CARTE.equals(experienceType) : true);
    }

    @Override // com.disney.wdpro.photopass_plus.fragments.PhotoPassPaywallFragment.PayWallActions
    public CapturedMediaInfo getCaptureMediaInfo() {
        return this.mediaInfo;
    }

    public int getCustomResId(int i10) {
        return i10;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected GuestGroup getGuestGroup() {
        return GuestGroup.WDW;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.base_sales_ui_lib.fragments.CommonFragmentActions
    public Formatters getMessageFormatter() {
        return new Formatters(this.photoPassPlusHostContext.getHelpDeskPhoneNumber());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.base_sales_ui_lib.fragments.BaseSalesDownFragment.SalesDownActions
    public String getMobileWebTicketsUrl() {
        return this.photoPassPlusEnvironment.getMobileWebPhotoPassPlusUrl();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected C8665e.b getNavigationBuilderForFirstFragment(boolean z10, String str, TicketSalesParams ticketSalesParams) {
        return this.navigator.m37387v(PhotoPassPaywallFragment.newInstance(ticketSalesParams.getProductCategoryDetails(), ticketSalesParams.getWebStoreId(), ticketSalesParams.getDestinationId(), ticketSalesParams.getAffiliationType(), str, ticketSalesParams.getSellableOnDate().orNull())).m37330h();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    public BaseConfirmationFragment getOrderConfirmationFragment(SelectedTicketProducts selectedTicketProducts, Long l10) {
        return PhotoPassOrderConfirmationFragment.newInstance(selectedTicketProducts, l10);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    public BaseOrderSummaryFragment getOrderSummaryFragment(SelectedTicketProducts selectedTicketProducts, int i10, HashMap<SupportedPaymentType, Class<?>> map, Calendar calendar) {
        return PhotoPassOrderSummaryFragment.newInstance(selectedTicketProducts, i10, map);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected final Set<TicketProductType.ProductId> getProductIds(ProductCategoryType productCategoryType) {
        HashSet hashSetM69460g = Sets.m69460g();
        if (productCategoryType == ProductCategoryType.PHOTO_PASS) {
            hashSetM69460g.add(TicketProductType.ProductId.PHOTO_PASS_PLUS);
            return hashSetM69460g;
        }
        if (productCategoryType == ProductCategoryType.MEMORY_MAKER) {
            hashSetM69460g.add(TicketProductType.ProductId.MEMORY_MAKER);
        }
        return hashSetM69460g;
    }

    protected TicketProductParameters getTicketForAllAges(int i10, TicketProductType ticketProductType) {
        return TicketProductParameters.builder().setTicketProductType(ticketProductType).setNumberOfDays(i10).setNumAllAgesTickets(1).setDiscountGroupType(DISCOUNT_GROUP_TYPE.getDiscountGroupId()).build();
    }

    public ImmutableList<TicketProductParameters> getTicketProducts() {
        TicketProductType ticketProductType = new TicketProductType(TicketProductType.ProductId.MEMORY_MAKER.getId());
        ImmutableList.C22583a c22583aBuilder = ImmutableList.builder();
        ArrayList arrayList = new ArrayList();
        TicketProductParameters ticketForAllAges = getTicketForAllAges(1, ticketProductType);
        this.multiDayAlreadyPurchased = false;
        arrayList.add(getTicketForAllAges(14, ticketProductType));
        arrayList.add(ticketForAllAges);
        if (shouldShowAlaCarte()) {
            arrayList.add(getTicketForAllAges(0, ticketProductType));
        }
        if (this.vendomatic.m38761i1()) {
            arrayList.remove(ticketForAllAges);
            arrayList.add(0, ticketForAllAges);
        }
        return c22583aBuilder.m69051k(arrayList).m69053m();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected void goToNativeCheckout(SelectedTicketProducts selectedTicketProducts, int i10, Calendar calendar, C9350r c9350r, String str) {
        this.navigator.m37388w(this.commerceCheckoutDelegate.buildPhotoPassCheckoutAppIntent(this, this, selectedTicketProducts, calendar, this.mediaInfo, this.ticketSalesParams.isNewRelicAnalyticsTrackerEnabled())).m37364r(ScreenType.STACK).m37363q(355).navigate();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected boolean isInOrderSummaryScreen() {
        return getSupportFragmentManager().m19755o0(PhotoPassOrderSummaryFragment.class.getSimpleName()) != null;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == REQUEST_CODE_LINK_PASSES && i11 == -1) {
            setConfirmationExitNavigationDataForLinkingFlow();
            showNextCallToActionScreen();
        } else if (i10 == REQUEST_CODE_LINK_PHOTOS && i11 == -1) {
            finish();
        } else if (i10 != 355 || i11 != 101) {
            super.onActivityResult(i10, i11, intent);
        } else {
            setPurchaseResult(BookingStatus.BOOKED, this.commerceCheckoutDelegate.getPhotoPassProduct());
            showNextCallToActionScreen();
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.base_sales_ui_lib.activities.SalesBaseActivity, com.disney.wdpro.support.activities.FoundationStackActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setupExperience();
        setResult(0);
        PhotoPassPlusUIComponent photoPassUIComponent = ((PhotoPassPlusUIComponentProvider) getApplication()).getPhotoPassUIComponent();
        this.photoPassPlusUIComponent = photoPassUIComponent;
        this.photoPassPlusEnvironment = photoPassUIComponent.getPhotoPassPlusEnvironment();
        this.photoPassPlusHostContext = this.photoPassPlusUIComponent.getPhotoPassPlusHostContext();
        this.commerceCheckoutDelegate = new CommerceCheckoutDelegate();
        this.mediaInfo = (CapturedMediaInfo) getIntent().getSerializableExtra(KEY_GUEST_MEDIA_INFO);
        this.multiDayAlreadyPurchased = getIntent().getBooleanExtra(KEY_MULTI_DAY_ALREADY_PURCHASED, false);
        this.linkItToYourTicketAndPasses = (NavigationEntry) getIntent().getParcelableExtra(KEY_LINK_TICKET_NAVIGATION_ENTRY);
        this.linkYourPhotos = (NavigationEntry) getIntent().getParcelableExtra(KEY_LINK_PHOTOS_NAVIGATION_ENTRY);
        this.pullDownButtonNavigation = (NavigationEntry) getIntent().getParcelableExtra(KEY_PULL_DOWN_BUTTON_NAVIGATION_ENTRY);
        if (bundle != null) {
            this.nextStep = (NextStep) bundle.getSerializable(KEY_NEXT_STEP_KEY);
        }
    }

    @Subscribe
    public void onLoginEvent(ProfileManager.LoginDataEvent loginDataEvent) {
        if (loginDataEvent.isSuccess()) {
            int i10 = C187861.f41718x8111b8ab[this.nextStep.ordinal()];
            if (i10 == 1) {
                showTicketAndPasses();
            } else if (i10 == 2) {
                showLinkPhotos();
            } else {
                if (i10 != 3) {
                    return;
                }
                showPullDownButtonNavigation();
            }
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.base_sales_ui_lib.activities.SalesBaseActivity, com.disney.wdpro.commons.BaseActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable(KEY_GUEST_MEDIA_INFO, this.mediaInfo);
        bundle.putSerializable(KEY_NEXT_STEP_KEY, this.nextStep);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.interfaces.BaseSalesActions
    public void resetFlow() {
        cleanupData();
        if (!shouldBackPressResultInResetFlow()) {
            SalesLauncher salesLauncherWithNewRelicAnalyticsTracker = new PhotoPassPlusLauncher(this).withLinkTicketNavigation(this.linkItToYourTicketAndPasses).withLinkPhotosNavigation(this.linkYourPhotos).withPullDownButtonNavigation(this.pullDownButtonNavigation).forSpecificMedia(this.mediaInfo).withGuestGroup(getGuestGroup()).withProductCategoryType(this.ticketSalesParams.getProductCategoryDetails().getProductCategoryType()).withHomeNavigation(getHomeNavigation()).withConfirmationExitNavigation(getExitNavigation()).withSellableOnDate(this.ticketSalesParams.getSellableOnDate().orNull()).withNewRelicAnalyticsTracker(this.ticketSalesParams.isNewRelicAnalyticsTrackerEnabled());
            for (Map.Entry<SupportedPaymentType, Class<?>> entry : this.ticketSalesParams.getSupportedPaymentTypes().entrySet()) {
                salesLauncherWithNewRelicAnalyticsTracker.withSupportedPaymentType(entry.getKey(), entry.getValue());
            }
            this.navigator.m37388w(salesLauncherWithNewRelicAnalyticsTracker.getIntent()).m37364r(ScreenType.STACK).navigate();
        }
        finish();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected void sendUnifiedCheckoutABTestingRequest(final SelectedTicketProducts selectedTicketProducts, final int i10, final Calendar calendar, final C9350r c9350r, final String str) {
        this.abTestingHelper.mo37390a(this.parkAppConfiguration.m38908h().equals("WDW") || this.parkAppConfiguration.m38908h().equals("Walt Disney World") ? "MDX_Mobile_Unified_Checkout_Mbox" : "DLR_Mobile_Unified_Checkout_Mbox", "", new HashMap(), new InterfaceC8669a.a() { // from class: com.disney.wdpro.photopass_plus.activities.a
            @Override // com.disney.wdpro.analytics.InterfaceC8669a.a
            public final void processResponse(String str2) {
                this.f41719a.lambda$sendUnifiedCheckoutABTestingRequest$0(selectedTicketProducts, i10, calendar, c9350r, str, str2);
            }
        });
    }

    protected void setConfirmationExitNavigationDataForLinkingFlow() {
        if (getExitNavigation() != null) {
            ((Intent) getExitNavigation().getTarget()).putExtra("SHOW_LINK_SUCCESSFUL", true);
        }
    }

    public void setLinkItToYourPhotosButtonVisibility(View view) {
        view.setVisibility(8);
    }

    @Override // com.disney.wdpro.photopass_plus.fragments.PhotoPassOrderConfirmationFragment.OrderConfirmationActions
    public void setPurchaseResult(BookingStatus bookingStatus, PhotoPassProduct photoPassProduct) {
        PurchasedProduct purchasedProduct = new PurchasedProduct(photoPassProduct, bookingStatus, getCaptureMediaInfo() != null ? getCaptureMediaInfo().getGuestMediaId() : null);
        setActivityResult(purchasedProduct);
        setConfirmationExitNavigationData(purchasedProduct);
        setPullDownExitNavigationData(purchasedProduct);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected boolean shouldBackPressResultInResetFlow() {
        return getSupportFragmentManager().m19755o0(PhotoPassOrderConfirmationFragment.class.getSimpleName()) != null;
    }

    @Override // com.disney.wdpro.photopass_plus.fragments.PhotoPassPaywallFragment.PayWallActions
    public void showLinkPhotos() {
        if (!this.authenticationManager.isUserAuthenticated()) {
            this.nextStep = NextStep.LINK_PHOTOS;
            showSignInActivity();
            return;
        }
        this.nextStep = NextStep.NOT_DEFINED;
        NavigationEntry<?> navigationEntry = this.linkYourPhotos;
        if (navigationEntry != null) {
            this.navigator.m37382o(generateNavigationPhotoPassLinkPhotos(navigationEntry));
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment.SalesActions
    public void showOrderSummaryScreen(SelectedTicketProducts selectedTicketProducts, int i10, Calendar calendar, C9350r c9350r, String str) {
        if (!ProductCategoryType.MEMORY_MAKER.equals(selectedTicketProducts.getProductCategoryType()) || !UniversalCheckoutToggleUtils.isUnifiedCheckoutMemoryMakerEnabled(this.vendomatic, this.unifiedCheckoutSecretConfig)) {
            goToNativeCheckout(selectedTicketProducts, i10, calendar, c9350r, str);
        } else if (this.vendomatic.m38683F1()) {
            sendUnifiedCheckoutABTestingRequest(selectedTicketProducts, i10, calendar, c9350r, str);
        } else {
            goToUnifiedCheckout(selectedTicketProducts);
        }
    }

    @Override // com.disney.wdpro.photopass_plus.fragments.PhotoPassPaywallFragment.PayWallActions
    public void showPullDownButtonNavigation() {
        if (!this.authenticationManager.isUserAuthenticated()) {
            this.nextStep = NextStep.PULL_DOWN_BUTTON;
            showSignInActivity();
            return;
        }
        this.nextStep = NextStep.NOT_DEFINED;
        NavigationEntry<?> navigationEntry = this.pullDownButtonNavigation;
        if (navigationEntry == null) {
            finish();
        } else {
            this.navigator.m37382o(generateNavigationPullDownButton(navigationEntry));
            overridePendingTransition(C18785R.anim.do_nothing, C18785R.anim.pull_down_to_bottom);
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.CommonFragmentActions
    public void showSalesDownScreen(SalesBaseFragment.DownScreenReasons downScreenReasons, PurchaseFlowType purchaseFlowType) {
        this.navigator.m37387v(PhotoPassDownFragment.newInstance(downScreenReasons, this.ticketSalesParams.getWebStoreId(), this.ticketSalesParams.getProductCategoryDetails())).m37330h().navigate();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment.SalesActions
    public void showSignInActivity() {
        this.navigator.m37382o(this.profileConfiguration.getProfileNavEntriesBuilderProvider().getNavigationEntryForSecondarySignIn(this).build());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment.BaseOrderSummaryActions
    public void showTermsAndConditionsScreen(Fragment fragment, boolean z10, boolean z11, ImmutableList<Policy> immutableList, WebStoreId webStoreId) {
        PhotoPassTermsAndConditionsFragment photoPassTermsAndConditionsFragmentNewInstance = PhotoPassTermsAndConditionsFragment.newInstance(immutableList, z10, z11, webStoreId);
        photoPassTermsAndConditionsFragmentNewInstance.setTargetFragment(fragment, 1);
        C8665e.b bVarM37387v = this.navigator.m37387v(photoPassTermsAndConditionsFragmentNewInstance);
        int i10 = C18785R.anim.ts_slide_in_right;
        int i11 = C18785R.anim.ts_slide_out_left;
        bVarM37387v.withAnimations(new NavigationEntry.CustomAnimations(i10, i11, i10, i11)).navigate();
    }

    @Override // com.disney.wdpro.photopass_plus.fragments.PhotoPassPaywallFragment.PayWallActions
    public void showTicketAndPasses() {
        if (!this.authenticationManager.isUserAuthenticated()) {
            this.nextStep = NextStep.LINK_PASSES;
            showSignInActivity();
            return;
        }
        this.nextStep = NextStep.NOT_DEFINED;
        NavigationEntry<?> navigationEntry = this.linkItToYourTicketAndPasses;
        if (navigationEntry != null) {
            this.navigator.m37382o(generateNavigationTicketAndPasses(navigationEntry));
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected void trackCreditCardAddedByScan() {
        this.analyticsHelper.mo37407d("Paymentmethod_added", new Map.Entry[0]);
    }

    public void trackOrderConfirmationAction(String str, String str2, String str3) {
        if (this.abExperienceType != null) {
            this.abExperienceHelper.trackOrderConfirmationAction(ExperienceConstants.MDX_ENTRY_CONFIRMATION, str, str2, str3);
        }
    }

    public void trackOrderSummaryAction() {
        if (this.abExperienceType != null) {
            this.abExperienceHelper.trackOrderSummaryAction(ExperienceConstants.MDX_ENTRY_CONFIRM_AND_PURCHARSE);
        }
    }

    public void trackPaywallAction() {
        ExperienceType experienceType = this.abExperienceType;
        if (experienceType == null || experienceType == ExperienceType.UNDEFINED) {
            return;
        }
        this.abExperienceHelper.trackPaywallAction(ExperienceConstants.MDX_ENTRY_PAYWALL);
    }
}