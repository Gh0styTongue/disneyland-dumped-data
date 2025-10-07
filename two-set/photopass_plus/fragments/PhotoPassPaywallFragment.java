package com.disney.wdpro.photopass_plus.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.C3337b1;
import com.disney.wdpro.base_sales_ui_lib.TicketSalesConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.AnalyticsConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsHelper;
import com.disney.wdpro.base_sales_ui_lib.analytics.parsers.PaywallOutsideBrickAbResponse;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketOptionListAdapter;
import com.disney.wdpro.base_sales_ui_lib.manager.TicketSalesFragmentDataEvent;
import com.disney.wdpro.base_sales_ui_lib.p069di.TicketSalesUIComponentProvider;
import com.disney.wdpro.base_sales_ui_lib.p070ui.providers.TicketSalesLayoutProvider;
import com.disney.wdpro.base_sales_ui_lib.product.manager.TicketSalesConfigManager;
import com.disney.wdpro.base_sales_ui_lib.utils.FlipCardAnimationUtils;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.photopass.services.dto.CBCustomizableText;
import com.disney.wdpro.photopass.services.dto.CBCustomizableTextStyle;
import com.disney.wdpro.photopass.services.dto.CBPhotopassProductsScreen;
import com.disney.wdpro.photopass.services.dto.CBStyleableCTA;
import com.disney.wdpro.photopass.services.p397cb.CBPhotoPassDocumentRepository;
import com.disney.wdpro.photopass_plus.C18785R;
import com.disney.wdpro.photopass_plus.abtesting.ExperienceActions;
import com.disney.wdpro.photopass_plus.abtesting.ExperienceType;
import com.disney.wdpro.photopass_plus.accessibility.AccessibilityDelegateManager;
import com.disney.wdpro.photopass_plus.analytics.PhotoPassAnalyticsConstants;
import com.disney.wdpro.photopass_plus.analytics.PhotoPassAnalyticsUtil;
import com.disney.wdpro.photopass_plus.models.CapturedMediaInfo;
import com.disney.wdpro.photopass_plus.models.PhotoPassProduct;
import com.disney.wdpro.photopass_plus.p399di.PhotoPassPlusUIComponentProvider;
import com.disney.wdpro.photopass_plus.p400ui.providers.PhotoPassPlusLayoutProvider;
import com.disney.wdpro.photopass_plus.utils.StringsProvider;
import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AffiliationType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductParameters;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseSelectionVASFragment;
import com.google.common.base.C22462m;
import com.google.common.base.Optional;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.collect.ImmutableList;
import com.squareup.otto.Subscribe;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;

/* loaded from: classes15.dex */
public class PhotoPassPaywallFragment extends BaseSelectionVASFragment {
    private static final int AB_TEST_EXPERIENCE_MM_CONSTANT = 2;
    private static final String ANALYTICS_PHOTO_PASS_SEARCH_DEFAULT = "1";
    private static final String ANALYTICS_TICKET_SALES_CART_ADD_DEFAULT = "1";
    private static final String ANALYTICS_TICKET_SALES_CART_OPEN_DEFAULT = "1";
    private static final String ANALYTICS_TICKET_SALES_CHECKOUT_DEFAULT = "1";
    private static final int ONE_DAY = 1;
    private LinearLayout abTestExperienceContainer;
    private PayWallActions actionListener;
    private View footerView;
    private View headerView;
    private PaywallOutsideBrickAbResponse paywallOutsideBrickAbResponse;

    @Inject
    CBPhotoPassDocumentRepository<CBPhotopassProductsScreen> photoPassDAO;
    private StringsProvider stringsProvider;

    @Inject
    C9248i vendomatic;

    /* renamed from: com.disney.wdpro.photopass_plus.fragments.PhotoPassPaywallFragment$1 */
    static /* synthetic */ class C187991 {

        /* renamed from: $SwitchMap$com$disney$wdpro$photopass_plus$abtesting$ExperienceType */
        static final /* synthetic */ int[] f41725xba7ca016;

        static {
            int[] iArr = new int[ExperienceType.values().length];
            f41725xba7ca016 = iArr;
            try {
                iArr[ExperienceType.EXPERIENCE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41725xba7ca016[ExperienceType.EXPERIENCE_B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41725xba7ca016[ExperienceType.EXPERIENCE_C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41725xba7ca016[ExperienceType.CONTROL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface PayWallActions {
        CapturedMediaInfo getCaptureMediaInfo();

        ImmutableList<TicketProductParameters> getTicketProducts();

        void setLinkItToYourPhotosButtonVisibility(View view);

        void showLinkPhotos();

        void showPullDownButtonNavigation();

        void showTicketAndPasses();
    }

    private void addAbTestExperienceView() {
        PaywallOutsideBrickAbResponse paywallOutsideBrickAbResponse;
        if (!WebStoreId.isWDW(getWebStoreId()) || (paywallOutsideBrickAbResponse = this.paywallOutsideBrickAbResponse) == null) {
            return;
        }
        Optional<String> experience = paywallOutsideBrickAbResponse.getExperience();
        if (experience.isPresent()) {
            int i10 = C187991.f41725xba7ca016[ExperienceType.valueOf(experience.get()).ordinal()];
            if (i10 == 1) {
                createExperienceView(ExperienceType.EXPERIENCE_A);
                return;
            }
            if (i10 == 2) {
                createExperienceView(ExperienceType.EXPERIENCE_B);
            } else if (i10 != 3) {
                createExperienceView(ExperienceType.CONTROL);
            } else {
                createExperienceView(ExperienceType.EXPERIENCE_C);
            }
        }
    }

    private void addPayWallAbBullets(LinearLayout linearLayout, PaywallOutsideBrickAbResponse paywallOutsideBrickAbResponse) {
        if (!paywallOutsideBrickAbResponse.getValues().isPresent() || paywallOutsideBrickAbResponse.getValues().get().size() == 0 || linearLayout.getChildCount() == paywallOutsideBrickAbResponse.getValues().get().size()) {
            return;
        }
        for (String str : paywallOutsideBrickAbResponse.getValues().get()) {
            LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(getContext()).inflate(C18785R.layout.paywall_bullets_chid, (ViewGroup) null, false);
            ((TextView) linearLayout2.findViewById(C18785R.id.bullets_text)).setText(str);
            linearLayout.addView(linearLayout2);
        }
    }

    private void addPayWallBullets(LinearLayout linearLayout, String[] strArr) {
        if (strArr.length == 0 || linearLayout.getChildCount() == strArr.length) {
            return;
        }
        for (String str : strArr) {
            LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(getContext()).inflate(C18785R.layout.paywall_bullets_chid, (ViewGroup) null, false);
            ((TextView) linearLayout2.findViewById(C18785R.id.bullets_text)).setText(str);
            linearLayout.addView(linearLayout2);
        }
    }

    private void checkLegacyMemoryMakerProduct() {
        if (!this.vendomatic.m38755g1() && this.actionListener.getCaptureMediaInfo() == null && WebStoreId.WDW_MOBILE.getId().equals(getWebStoreId().getId())) {
            for (int i10 = 0; i10 < getAdapter().getCount(); i10++) {
                SelectedTicketProducts selectedTicketProducts = (SelectedTicketProducts) getAdapter().getItem(i10);
                if (selectedTicketProducts.getNumberOfSelectedDays().intValue() == 1 && !PhotoPassProduct.LEGACY_MEMORY_MAKER.equals(PhotoPassProduct.getProduct(selectedTicketProducts))) {
                    getAdapter().remove(selectedTicketProducts);
                }
            }
        }
    }

    private void createExperienceView(ExperienceType experienceType) {
        TextView textView = (TextView) this.headerView.findViewById(C18785R.id.paywall_abtest_title);
        ImageView imageView = (ImageView) this.headerView.findViewById(C18785R.id.imageViewPayWall);
        ImageView imageView2 = (ImageView) this.headerView.findViewById(C18785R.id.base_line_header_image);
        LinearLayout linearLayout = (LinearLayout) this.headerView.findViewById(C18785R.id.paywall_bullet_points_container);
        LinearLayout linearLayout2 = (LinearLayout) this.headerView.findViewById(C18785R.id.paywall_ab_test_container);
        setABTastingResultsVisible(8);
        imageView.setVisibility(8);
        int i10 = C187991.f41725xba7ca016[experienceType.ordinal()];
        if (i10 == 1) {
            textView.setText(this.paywallOutsideBrickAbResponse.getHeaderSubTitle().get());
            addPayWallAbBullets(linearLayout, this.paywallOutsideBrickAbResponse);
            linearLayout2.setVisibility(0);
            imageView2.setVisibility(0);
            imageView.setVisibility(8);
            return;
        }
        if (i10 == 2) {
            if (this.paywallOutsideBrickAbResponse.getValues().isPresent() && this.paywallOutsideBrickAbResponse.isEnableBanner()) {
                imageView.setVisibility(0);
                imageView2.setVisibility(8);
                linearLayout2.setVisibility(8);
                return;
            }
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            this.abTestExperienceContainer.setVisibility(8);
        } else {
            if (!this.paywallOutsideBrickAbResponse.getValues().isPresent() || this.paywallOutsideBrickAbResponse.getValues().get().size() == 0) {
                return;
            }
            textView.setText(this.paywallOutsideBrickAbResponse.getHeaderSubTitle().get());
            addPayWallAbBullets(linearLayout, this.paywallOutsideBrickAbResponse);
            linearLayout2.setVisibility(0);
            imageView2.setVisibility(0);
            if (this.paywallOutsideBrickAbResponse.isEnableBanner()) {
                imageView.setVisibility(0);
            }
        }
    }

    private void hasMemoryMakerProduct() {
        if (this.paywallOutsideBrickAbResponse == null || !WebStoreId.WDW_MOBILE.getId().equals(getWebStoreId().getId())) {
            return;
        }
        for (int i10 = 0; i10 < getAdapter().getCount(); i10++) {
            SelectedTicketProducts selectedTicketProducts = (SelectedTicketProducts) getAdapter().getItem(i10);
            if (selectedTicketProducts != null) {
                Optional<String> allAgesCategoryId = selectedTicketProducts.getAllAgesCategoryId();
                if (getAdapter().getCount() == 2 && allAgesCategoryId.isPresent() && allAgesCategoryId.get().equals(ProductCategoryType.MEMORY_MAKER.getId())) {
                    this.abTestExperienceContainer.setVisibility(0);
                    if (this.paywallOutsideBrickAbResponse.getHeaderTitle().isPresent() && this.abTestExperienceContainer.getVisibility() == 0) {
                        setTitle(this.paywallOutsideBrickAbResponse.getHeaderTitle().get());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getTicketOptionListFooterView$0(View view) {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("link.category", "PhotoPass");
        this.analyticsHelper.mo37405b(PhotoPassAnalyticsConstants.PHOTO_PASS_ACTION_LINK_TO_ACCOUNT, mapMo37420q);
        this.actionListener.showTicketAndPasses();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getTicketOptionListFooterView$1(View view) {
        this.actionListener.showLinkPhotos();
    }

    public static final PhotoPassPaywallFragment newInstance(ProductCategoryDetails productCategoryDetails, WebStoreId webStoreId, DestinationId destinationId, AffiliationType affiliationType, String str, Calendar calendar) {
        C22462m.m68685q(productCategoryDetails, "categoryType == null");
        C22462m.m68685q(webStoreId, "webStoreId == null");
        C22462m.m68685q(destinationId, "destinationId == null");
        C22462m.m68685q(affiliationType, "affiliationType == null");
        PhotoPassPaywallFragment photoPassPaywallFragment = new PhotoPassPaywallFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(TicketSalesConstants.KEY_ARG_PRODUCT_CATEGORY_DETAILS, productCategoryDetails);
        bundle.putString(TicketSalesConstants.KEY_ARG_WEB_STORE_ID, webStoreId.name());
        bundle.putSerializable("key_sellable_on_date", calendar);
        bundle.putSerializable(TicketSalesConstants.KEY_ARG_DESTINATION_ID, destinationId);
        bundle.putString(TicketSalesConstants.KEY_ARG_AFFILIATION_TYPE, affiliationType.name());
        bundle.putString(TicketSalesConstants.KEY_ARG_SESSION_ID, str);
        photoPassPaywallFragment.setArguments(bundle);
        return photoPassPaywallFragment;
    }

    private void removeAllPayWallBullets(LinearLayout linearLayout) {
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
    }

    private void setABTastingResultsVisible(int i10) {
        TextView textView = (TextView) this.headerView.findViewById(C18785R.id.paywall_abtest_title);
        TextView textView2 = (TextView) this.headerView.findViewById(C18785R.id.paywall_abtest_header);
        ImageView imageView = (ImageView) this.headerView.findViewById(C18785R.id.base_line_header_image);
        LinearLayout linearLayout = (LinearLayout) this.headerView.findViewById(C18785R.id.paywall_bullet_points_container);
        LinearLayout linearLayout2 = (LinearLayout) this.headerView.findViewById(C18785R.id.paywall_ab_test_container);
        textView.setText(C18785R.string.photo_pass_ab_testing_header_sub_checklist_title);
        textView2.setVisibility(i10);
        textView2.setText(C18785R.string.photo_pass_ab_testing_header_sub_title);
        if (i10 != 0) {
            removeAllPayWallBullets(linearLayout);
        } else if (this.vendomatic.m38764j1()) {
            addPayWallBullets(linearLayout, getResources().getStringArray(C18785R.array.photo_pass_ab_testing_bullets_toggle_on_storybook_on));
        } else {
            addPayWallBullets(linearLayout, getResources().getStringArray(C18785R.array.photo_pass_ab_testing_bullets_toggle_on));
        }
        linearLayout.setVisibility(i10);
        linearLayout2.setVisibility(i10);
        imageView.setVisibility(i10);
        this.abTestExperienceContainer.setVisibility(i10);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void cleanDateSelection() {
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void cleanGuestSelection() {
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected int getCommonErrorMessageResource() {
        return this.stringsProvider.getCustomResId(C18785R.string.photo_pass_plus_common_error_message);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected int getDataNotLoadedMessageResource() {
        return this.stringsProvider.getCustomResId(C18785R.string.photo_pass_plus_data_not_loaded_message);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected TicketSalesLayoutProvider getLayoutProvider(WebStoreId webStoreId) {
        return new PhotoPassPlusLayoutProvider(webStoreId);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected TicketOptionListAdapter getNewAdapter(Context context, int i10, TicketSalesConfigManager ticketSalesConfigManager, TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper, FlipCardAnimationUtils.FlippedViewVisibilityNotifier flippedViewVisibilityNotifier, TicketOptionListAdapter.CheckoutButtonListener checkoutButtonListener) {
        PhotoPassTicketOptionListAdapter photoPassTicketOptionListAdapter = new PhotoPassTicketOptionListAdapter(getActivity(), i10, ticketSalesConfigManager, checkoutButtonListener, new PhotoPassTicketBrickUiHelper(flippedViewVisibilityNotifier, ticketSalesAnalyticsHelper));
        CapturedMediaInfo captureMediaInfo = this.actionListener.getCaptureMediaInfo();
        if (captureMediaInfo != null) {
            photoPassTicketOptionListAdapter.withCaptureMediaInfo(captureMediaInfo);
        }
        return photoPassTicketOptionListAdapter;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected View getTicketOptionListFooterView(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(C18785R.layout.ppp_product_list_footer, (ViewGroup) null, false);
        this.footerView = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(C18785R.id.text_view_footer_title);
        AccessibilityDelegateManager accessibilityDelegateManager = new AccessibilityDelegateManager();
        accessibilityDelegateManager.setIsFocusable(true);
        C3337b1.m17275r0(textView, accessibilityDelegateManager);
        textView.setImportantForAccessibility(1);
        Button button = (Button) this.footerView.findViewById(C18785R.id.btn_link_your_account);
        Button button2 = (Button) this.footerView.findViewById(C18785R.id.btn_link_your_photos);
        CBPhotopassProductsScreen cBPhotopassProductsScreen = (CBPhotopassProductsScreen) this.photoPassDAO.getDocument();
        try {
            CBCustomizableText footer = cBPhotopassProductsScreen.getFooter();
            textView.setText(footer.getText());
            textView.setTypeface(textView.getTypeface(), CBCustomizableTextStyle.INSTANCE.getStyle(footer.getStyle()));
            textView.setTextSize(2, footer.getSize().floatValue());
        } catch (NullPointerException unused) {
        }
        try {
            CBStyleableCTA linkAccount = cBPhotopassProductsScreen.getCtas().getLinkAccount();
            button.setText(linkAccount.getTitle());
            button.setTypeface(button.getTypeface(), CBCustomizableTextStyle.INSTANCE.getStyle(linkAccount.getStyle()));
            button.setEnabled(linkAccount.getActive().booleanValue());
            button.setTextSize(2, linkAccount.getSize().floatValue());
        } catch (NullPointerException unused2) {
        }
        try {
            CBStyleableCTA linkPhoto = cBPhotopassProductsScreen.getCtas().getLinkPhoto();
            button2.setText(linkPhoto.getTitle());
            button2.setTypeface(button2.getTypeface(), CBCustomizableTextStyle.INSTANCE.getStyle(linkPhoto.getStyle()));
            button2.setEnabled(linkPhoto.getActive().booleanValue());
            button2.setTextSize(2, linkPhoto.getSize().floatValue());
        } catch (NullPointerException unused3) {
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.photopass_plus.fragments.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f41726a.lambda$getTicketOptionListFooterView$0(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.photopass_plus.fragments.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f41727a.lambda$getTicketOptionListFooterView$1(view);
            }
        });
        this.actionListener.setLinkItToYourPhotosButtonVisibility(button2);
        this.footerView.setVisibility(8);
        this.footerView.setOnClickListener(null);
        return this.footerView;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected View getTicketOptionListHeaderView(LayoutInflater layoutInflater, ListView listView) {
        View viewInflate = layoutInflater.inflate(C18785R.layout.ppp_product_list_header, (ViewGroup) null, false);
        this.headerView = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(C18785R.id.paywall_introduction_text_view);
        this.abTestExperienceContainer = (LinearLayout) this.headerView.findViewById(C18785R.id.abTestExperienceContainer);
        textView.setText(this.stringsProvider.getCustomResId(C18785R.string.paywall_introduction));
        ((ImageView) this.headerView.findViewById(C18785R.id.imageViewPayWall)).setVisibility(8);
        if (WebStoreId.isWDW(getWebStoreId())) {
            setABTastingResultsVisible(0);
        }
        addAbTestExperienceView();
        this.headerView.setVisibility(8);
        return this.headerView;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return WebStoreId.isWDW(getWebStoreId()) ? getText(C18785R.string.paywall_title) : getText(C18785R.string.paywall_title_dlr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.actionListener = (PayWallActions) activity;
            this.stringsProvider = (StringsProvider) activity;
            ((ExperienceActions) activity).trackPaywallAction();
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement PayWallActions, StringsProvider and ExperienceActions");
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseSelectionVASFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((PhotoPassPlusUIComponentProvider) getActivity().getApplicationContext()).getPhotoPassUIComponent().inject(this);
        this.paywallOutsideBrickAbResponse = ((TicketSalesUIComponentProvider) getActivity().getApplicationContext()).getTicketSalesUIComponent().getAdobeTargetUtils().getMemoryMakerOutsideBrickAbtest();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseSelectionVASFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    @Subscribe
    public void onFragmentDataCompletedEvent(TicketSalesFragmentDataEvent ticketSalesFragmentDataEvent) {
        super.onFragmentDataCompletedEvent(ticketSalesFragmentDataEvent);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void restoreGuestSelection() {
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void saveGuestDaySelection() {
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void saveGuestSelection() {
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void sendAnalyticCardCheckout(String str, SelectedTicketProducts selectedTicketProducts) {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("cardtype", str);
        mapMo37420q.put("&&products", PhotoPassAnalyticsUtil.getAnalyticsProductString(selectedTicketProducts));
        mapMo37420q.put("link.category", "PhotoPass");
        mapMo37420q.put("cartopen", "1");
        mapMo37420q.put("cartadd", "1");
        mapMo37420q.put("checkout", "1");
        mapMo37420q.put("store", PhotoPassAnalyticsUtil.getAnalyticsStoreName());
        CapturedMediaInfo captureMediaInfo = this.actionListener.getCaptureMediaInfo();
        if (captureMediaInfo != null) {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", locale);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mma", locale);
            mapMo37420q.put("experienceid", captureMediaInfo.getExperienceId());
            mapMo37420q.put("location", captureMediaInfo.getLocation());
            mapMo37420q.put("search.window", String.valueOf(captureMediaInfo.getSearchWindow()));
            mapMo37420q.put("assetid", captureMediaInfo.getAssetId());
            mapMo37420q.put("photo.type", captureMediaInfo.getMediaCategory());
            String str2 = simpleDateFormat.format(captureMediaInfo.getCaptureDate());
            String str3 = simpleDateFormat2.format(captureMediaInfo.getCaptureDate());
            mapMo37420q.put("search.date", str2);
            mapMo37420q.put("search.time", str3);
        }
        this.analyticsHelper.mo37405b(PhotoPassAnalyticsConstants.PHOTO_PASS_ACTION_CHECKOUT, mapMo37420q);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void sendAnalyticsTrackState() {
        String analyticsProductsString = PhotoPassAnalyticsUtil.getAnalyticsProductsString(getAdapter());
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("store", PhotoPassAnalyticsUtil.getAnalyticsStoreName());
        mapMo37420q.put("ticketsales.search", "1");
        mapMo37420q.put("&&products", analyticsProductsString);
        CapturedMediaInfo captureMediaInfo = this.actionListener.getCaptureMediaInfo();
        if (captureMediaInfo != null) {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", locale);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mma", locale);
            mapMo37420q.put("experienceid", captureMediaInfo.getExperienceId());
            mapMo37420q.put("location", captureMediaInfo.getLocation());
            mapMo37420q.put("search.window", String.valueOf(captureMediaInfo.getSearchWindow()));
            mapMo37420q.put("assetid", captureMediaInfo.getAssetId());
            mapMo37420q.put("photo.type", captureMediaInfo.getMediaCategory());
            String str = simpleDateFormat.format(captureMediaInfo.getCaptureDate());
            String str2 = simpleDateFormat2.format(captureMediaInfo.getCaptureDate());
            mapMo37420q.put("search.date", str);
            mapMo37420q.put("search.time", str2);
        }
        this.analyticsHelper.mo37406c(PhotoPassAnalyticsConstants.PHOTO_PASS_STATE_SELECTION, getClass().getSimpleName(), mapMo37420q);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void setupDateOptionsSelection() {
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void trackReportServiceError(String str, String str2, TicketSalesFragmentDataEvent ticketSalesFragmentDataEvent) {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("failed.service", PhotoPassAnalyticsConstants.PHOTO_PASS_KEY_ERROR_ON_LOAD_TICKETS_DATA);
        PhotoPassAnalyticsUtil.addEventDataToContext(mapMo37420q, ticketSalesFragmentDataEvent);
        mapMo37420q.put("alert.title", str);
        mapMo37420q.put("alert.message", str2);
        this.analyticsHelper.mo37405b(AnalyticsConstants.ACTION_SERVICE_ERROR, mapMo37420q);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void updateUI() {
        if (isVisible()) {
            getAdapter().clear();
            if (getServiceResponse() == null) {
                return;
            }
            AbstractC22726b3<TicketProductParameters> it = this.actionListener.getTicketProducts().iterator();
            while (it.hasNext()) {
                addTicketProductsIfPresent(it.next());
            }
            checkLegacyMemoryMakerProduct();
            if (getAdapter().isEmpty()) {
                displayErrorLoadingMessage(getString(getDataNotLoadedMessageResource()));
                return;
            }
            hasMemoryMakerProduct();
            if (this.headerView.getVisibility() != 0) {
                this.headerView.setVisibility(0);
            }
            if (this.footerView.getVisibility() != 0) {
                this.footerView.setVisibility(0);
            }
            getAdapter().notifyDataSetChanged();
        }
    }
}