package com.disney.wdpro.general_ticket_sales_ui.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.C4937g;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.base_sales_ui_lib.TicketSalesConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.AnalyticsConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.ResidentOffersAnalyticsUtils;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsHelper;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.BlockOutDatesActionListener;
import com.disney.wdpro.base_sales_ui_lib.fragments.Parties;
import com.disney.wdpro.base_sales_ui_lib.fragments.PartyMixActions;
import com.disney.wdpro.base_sales_ui_lib.fragments.SelectedProductsUIHelper;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketOptionListAdapter;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesPartyMixFragment;
import com.disney.wdpro.base_sales_ui_lib.manager.CMSTicketSalesManager;
import com.disney.wdpro.base_sales_ui_lib.manager.ResidentOfferManager;
import com.disney.wdpro.base_sales_ui_lib.manager.TicketSalesFragmentDataEvent;
import com.disney.wdpro.base_sales_ui_lib.manager.TicketSalesHeroImageEvent;
import com.disney.wdpro.base_sales_ui_lib.model.cms.CMSTicketSalesManagerImpl;
import com.disney.wdpro.base_sales_ui_lib.model.cms.CMSTicketSalesResponse;
import com.disney.wdpro.base_sales_ui_lib.p069di.TicketSalesUIComponentProvider;
import com.disney.wdpro.base_sales_ui_lib.p070ui.BLockOutDatesCTAClickableSpan;
import com.disney.wdpro.base_sales_ui_lib.p070ui.models.SpannableAboutElement;
import com.disney.wdpro.base_sales_ui_lib.p070ui.providers.ThemeParkPricePerTicketCreator;
import com.disney.wdpro.base_sales_ui_lib.p070ui.providers.TicketSalesLayoutProvider;
import com.disney.wdpro.base_sales_ui_lib.product.manager.TicketSalesConfigManager;
import com.disney.wdpro.base_sales_ui_lib.product.manager.TicketSelectionCalendarLegend;
import com.disney.wdpro.base_sales_ui_lib.utils.AnimationControls;
import com.disney.wdpro.base_sales_ui_lib.utils.DisplayPriceFormatter;
import com.disney.wdpro.base_sales_ui_lib.utils.FlipCardAnimationUtils;
import com.disney.wdpro.base_sales_ui_lib.utils.SharedPreferenceUtility;
import com.disney.wdpro.base_sales_ui_lib.utils.TicketSalesAnalyticsUtil;
import com.disney.wdpro.base_sales_ui_lib.views.CustomRadioButtonNumberOfDaysSelection;
import com.disney.wdpro.base_sales_ui_lib.views.StateViewRadioButton;
import com.disney.wdpro.commercecheckout.p076ui.activities.CheckoutActivity;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.disney.wdpro.general_ticket_sales_ui.activities.TicketSalesHybridActivity;
import com.disney.wdpro.general_ticket_sales_ui.calendar.delta.PriceCalendarMonthCellViewAdapter;
import com.disney.wdpro.general_ticket_sales_ui.calendar.delta.PriceCell;
import com.disney.wdpro.general_ticket_sales_ui.calendar.delta.PriceSelectedItemDecoration;
import com.disney.wdpro.general_ticket_sales_ui.p131di.GeneralTicketSalesUiComponentProvider;
import com.disney.wdpro.general_ticket_sales_ui.p132ui.OfferSelectionUiHelper;
import com.disney.wdpro.general_ticket_sales_ui.p132ui.linkhelper.AffiliationCTAClickableSpan;
import com.disney.wdpro.general_ticket_sales_ui.p132ui.linkhelper.RichTextView;
import com.disney.wdpro.general_ticket_sales_ui.p132ui.providers.GeneralBrickTitleCreator;
import com.disney.wdpro.payments.models.PaymentsEnvironment;
import com.disney.wdpro.profile_ui.ProfileConfiguration;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.secommerce.util.DateTimeUtil;
import com.disney.wdpro.support.C20813g;
import com.disney.wdpro.support.accessibility.C20511d;
import com.disney.wdpro.support.anim.SnowballNextFlowAnimation;
import com.disney.wdpro.support.calendar.AbstractC20589a;
import com.disney.wdpro.support.calendar.DisneyCalendarView;
import com.disney.wdpro.support.calendar.configurations.C20596e;
import com.disney.wdpro.support.calendar.configurations.C20602k;
import com.disney.wdpro.support.calendar.configurations.InterfaceC20601j;
import com.disney.wdpro.support.calendar.internal.MonthModeRecyclerView;
import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.calendar.TieredTicketsCalendar;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.AboutElement;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AffiliationType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AgeGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DiscountGroupType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PricePerDay;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductParameters;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.TicketTierName;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.TicketTierNameDescription;
import com.disney.wdpro.ticket_sales_base_lib.utils.DateUtils;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketDay;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketProductServiceResponse;
import com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseSelectionVASFragment;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.google.common.base.C22459j;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.squareup.otto.Subscribe;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import javax.inject.Inject;
import p1082xn.C33259a;
import p1117yn.C33668c;
import p1117yn.C33670e;

/* loaded from: classes28.dex */
public class GeneralTicketSalesFragment extends BaseSelectionVASFragment implements AffiliationCTAClickableSpan.AffiliationCTAClickableSpanListener, OfferSelectionUiHelper.OfferSelectionListener, BlockOutDatesActionListener {
    private static final String ANALYTICS_TICKET_SALES_CARTADD_DEFAULT = "1";
    private static final String ANALYTICS_TICKET_SALES_CARTOPEN_DEFAULT = "1";
    private static final String ANALYTICS_TICKET_SALES_CHECKOUT_DEFAULT = "1";
    private static final String ANALYTICS_TICKET_SALES_PRODUCT_ATS_DEFAULT = "MYW";
    private static final String ANALYTICS_TICKET_SALES_PRODUCT_PRICE_DEFAULT = "0.00";
    private static final String ANALYTICS_TICKET_SALES_SEARCH_DEFAULT = "1";
    private static final int AUTO_VERTICAL_SCROLL_DURATION = 300;
    private static final double BASELINE_FACTOR = 4.0d;
    private static final String BLOCK_OUT_DATES_STRING = "blockout dates";
    private static final int DEFAULT_LAYOUT_HEIGHT = 0;
    private static final int DEFAULT_LOWEST_PRIORITY = 1;
    private static final boolean ENABLE_TICKET_SALES = true;
    private static final int FADE_DURATION = 1000;
    private static final boolean IS_TIERED_DAY = true;
    private static final String KEY_CHECKED_STATE_PICK_DATE_BUTTON = "key_checked_state_pick_date_button";
    private static final String KEY_CHECKED_STATE_TODAY_BUTTON = "key_checked_state_today_button";
    private static final String KEY_SELECTED_DATE = "key_selected_date";
    private static final String KEY_SELECTED_DATE_TIME_ZONE = "key_selected_date_timezone";
    private static final String KEY_SELECTED_DAY_COUNT = "key_selected_day_count";
    private static final int NO_ID = -1;
    private static final int POSITION_OF_DAY_SELECTION = 0;
    private static final int PRIORITY_1 = 1;
    private static final float PROPORTION = 0.8f;
    private static final int SCROLL_ANIMATION_DURATION = 800;
    private static final int SELECTION_ANIMATION_DELAY = 600;
    private static final int SINGLE_DAY = 1;
    private static final int SINGLE_TIER = 1;
    private static final int SLIDE_PRICE_ANIMATION_DELAY = 50;
    private static final int SLIDE_PRICE_ANIMATION_DURATION = 1000;
    private static final int SLIDE_PRICE_ANIMATION_INITIAL_DELAY = 600;
    private Button aboutTieredDayTicketButton;
    private TicketSalesActions actionListener;
    private AnimationControls animationControls;
    private LinearLayout authenticationCTA;
    private RichTextView authenticationCTAMessage;
    private TextView availCalendarCTA;
    private TextView availCalendarDescription;
    private CardView availCalendarSection;
    private TextView availCalendarTitle;
    private StateViewRadioButton btnPickDate;
    private StateViewRadioButton btnToday;
    private LinearLayout calendarContainerLayout;
    private LinearLayout calendarDrawerLayout;
    private ClickableSpan clickableSpan;
    protected CMSTicketSalesManager cmsTicketSalesManager;
    private RelativeLayout dateOptionsLayout;
    private RadioGroup dateOptionsRadioGroup;
    private String disclaimerTierLegendMobile;
    private DisneyCalendarView disneyCalendar;
    private View dividerAfterHeader;
    private Calendar endDate;
    private TextView headerBelowImage;
    private ImageView heroImage;
    private boolean heroImageLoaded;
    private boolean isPickDateChecked;
    private boolean isTodayChecked;
    private TextView numberOfDaysHeader;
    private OfferSelectionUiHelper offerSelectorUiHelper;
    private TextView oneDayNote;
    private boolean onlyDateChanged;
    private PartyMixActions partyMixActions;

    @Inject
    PaymentsEnvironment paymentsEnvironment;
    private String pepTieredCalendarSeasonalContentMobile;
    private String pepTieredCalendarSeasonalTitleMobile;
    private PriceCalendarMonthCellViewAdapter priceCalendarMonthCellViewAdapter;
    private Map<String, PriceCell> priceCells;

    @Inject
    ProfileConfiguration profileConfiguration;
    private TextView selectParkThemeTitle;
    private LinearLayout selectTicketSelectionHeaderLayout;
    private Calendar selectedDate;
    private TicketDay selectedDayCount;
    private String selectedTier;
    private String tierHighValidityDetailMobile;
    private String tierLowValidityDetailMobile;
    private LinearLayout tieredContainerLayout;

    @Inject
    C9350r time;

    @Inject
    UniversalCheckoutDataManager universalCheckoutDataManager;
    private String validityTitleMobile;

    @Inject
    C9248i vendomatic;
    private int viewIdForScroll = -1;

    /* renamed from: H0 */
    public static /* synthetic */ RecyclerView.AbstractC4909l m50182H0() {
        return new C4937g();
    }

    /* renamed from: I0 */
    public static /* synthetic */ int m50183I0(Map.Entry entry, Map.Entry entry2) {
        return ((TicketTierNameDescription) entry2.getValue()).getPriority() - ((TicketTierNameDescription) entry.getValue()).getPriority();
    }

    private void addRangeByCategory(TieredTicketsCalendar.TieredTicketDate tieredTicketDate, TieredTicketsCalendar.TieredTicketDate tieredTicketDate2, List<C33670e> list, List<C33670e> list2, List<C33670e> list3, List<C33670e> list4) {
        if (this.vendomatic.m38730W()) {
            list4.add(new C33670e(tieredTicketDate.getDate(), tieredTicketDate2.getDate()));
            return;
        }
        if (tieredTicketDate.getTicketTierName().equals(TicketTierName.VALUE.name())) {
            list.add(new C33670e(tieredTicketDate.getDate(), tieredTicketDate2.getDate()));
        } else if (tieredTicketDate.getTicketTierName().equals(TicketTierName.REGULAR.name())) {
            list2.add(new C33670e(tieredTicketDate.getDate(), tieredTicketDate2.getDate()));
        } else if (tieredTicketDate.getTicketTierName().equals(TicketTierName.PEAK.name())) {
            list3.add(new C33670e(tieredTicketDate.getDate(), tieredTicketDate2.getDate()));
        }
    }

    private void addToPriceCells(Map<String, TicketTierNameDescription> map, Optional<TieredTicketsCalendar> optional, TieredTicketsCalendar.TieredTicketDate tieredTicketDate) {
        if (this.vendomatic.m38730W()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", this.time.m39099q());
            Map<Calendar, TieredTicketsCalendar.TieredTicketDate> dateToTicketTierNameMap = optional.get().getDateToTicketTierNameMap();
            TicketTierNameDescription ticketTierNameDescription = dateToTicketTierNameMap.get(tieredTicketDate.getDate()) != null ? map.get(dateToTicketTierNameMap.get(tieredTicketDate.getDate()).getTicketTierName()) : null;
            if (ticketTierNameDescription != null && ticketTierNameDescription.getTextName().isPresent() && ticketTierNameDescription.getStartingFromPrice().isPresent()) {
                this.priceCells.put(simpleDateFormat.format(tieredTicketDate.getDate().getTime()), new PriceCell(tieredTicketDate.getDate(), ticketTierNameDescription.getTextName().get(), ticketTierNameDescription.getStartingFromPrice().get().getFormatCurrencyWithoutDecimals(), ticketTierNameDescription.getPriority()));
            }
        }
    }

    private AbstractC20589a calendarAdapter(final Optional<TieredTicketsCalendar> optional, final List<C33670e> list, final List<C33670e> list2, final List<C33670e> list3, final List<C33670e> list4) {
        return new AbstractC20589a() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.12
            @Override // com.disney.wdpro.support.calendar.AbstractC20589a
            public List<C33670e> getDateRangeListForCategory(C33668c c33668c) {
                if (optional.isPresent()) {
                    String strM101642d = c33668c.m101642d();
                    if (C20602k.SELECTABLE_CATEGORY.equals(strM101642d)) {
                        return list4;
                    }
                    if (GeneralTicketSalesFragment.this.compareCategory(strM101642d, optional, TicketTierName.VALUE.name())) {
                        return list;
                    }
                    if (GeneralTicketSalesFragment.this.compareCategory(strM101642d, optional, TicketTierName.REGULAR.name())) {
                        return list2;
                    }
                    if (GeneralTicketSalesFragment.this.compareCategory(strM101642d, optional, TicketTierName.PEAK.name())) {
                        return list3;
                    }
                }
                return new ArrayList();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTieredDaySelections() {
        this.selectedTier = null;
        this.dateOptionsRadioGroup.clearCheck();
        getAdapter().clear();
        this.selectParkThemeTitle.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean compareCategory(String str, Optional<TieredTicketsCalendar> optional, String str2) {
        return (optional.get().getTierNameToTierDescriptionMap() == null || optional.get().getTierNameToTierDescriptionMap().get(str2) == null || optional.get().getTierNameToTierDescriptionMap().get(str2).getTextName() == null || !str.equals(optional.get().getTierNameToTierDescriptionMap().get(str2).getTextName().get())) ? false : true;
    }

    private void createDaysSelection() throws Resources.NotFoundException {
        final ViewGroup viewGroup = (LinearLayout) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.days_view_group);
        if (viewGroup.getChildCount() > 0) {
            return;
        }
        ImmutableList<TicketDay> offerTicketDayList = (this.residentOfferManager.isResidentOffersEnabled() && this.residentOfferManager.isSpecialOfferSelected()) ? this.residentOfferManager.getOfferTicketDayList() : getFragmentDataManager().getNumberOfSupportedDays(getServiceResponse());
        if (offerTicketDayList != null && offerTicketDayList.size() > 1) {
            TextView textView = this.numberOfDaysHeader;
            int i10 = C11971R.string.ticket_sales_number_of_days_header;
            Integer numDay = offerTicketDayList.get(0).getNumDay();
            numDay.intValue();
            Integer numDay2 = offerTicketDayList.get(offerTicketDayList.size() - 1).getNumDay();
            numDay2.intValue();
            textView.setContentDescription(getString(i10, numDay, numDay2));
        }
        updateHeaderLayoutVisibility(offerTicketDayList);
        AbstractC22726b3<TicketDay> it = offerTicketDayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            TicketDay next = it.next();
            if (!next.getCalendarId().isPresent() || getFragmentDataManager().getCalendarForDay(getServiceResponse(), next).isPresent()) {
                final CustomRadioButtonNumberOfDaysSelection customRadioButtonNumberOfDaysSelection = new CustomRadioButtonNumberOfDaysSelection(getActivity(), null);
                customRadioButtonNumberOfDaysSelection.setTag(next);
                customRadioButtonNumberOfDaysSelection.setNumberOfDays(String.valueOf(next.getNumDay()));
                if (C22459j.m68660a(next, this.selectedDayCount)) {
                    this.selectedDayCount = next;
                    z10 = true;
                }
                setTextBelowDayButton(next, customRadioButtonNumberOfDaysSelection);
                customRadioButtonNumberOfDaysSelection.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        View viewForCurrentDaysSelection;
                        int iIntValue = GeneralTicketSalesFragment.this.selectedDayCount.getNumDay().intValue();
                        if (C22459j.m68660a(customRadioButtonNumberOfDaysSelection.getTag(), GeneralTicketSalesFragment.this.selectedDayCount) || GeneralTicketSalesFragment.this.animationControls.isAnimationInProgress()) {
                            return;
                        }
                        customRadioButtonNumberOfDaysSelection.setSelected(true);
                        if (iIntValue > 0 && (viewForCurrentDaysSelection = GeneralTicketSalesFragment.this.getViewForCurrentDaysSelection(viewGroup)) != null) {
                            viewForCurrentDaysSelection.setSelected(false);
                        }
                        GeneralTicketSalesFragment.this.selectedDayCount = (TicketDay) customRadioButtonNumberOfDaysSelection.getTag();
                        GeneralTicketSalesFragment.this.focusDaySelected(customRadioButtonNumberOfDaysSelection);
                        GeneralTicketSalesFragment.this.sendAnalyticDaysSelection();
                        GeneralTicketSalesFragment.this.clearTieredDaySelections();
                        if (((BaseSelectionFragment) GeneralTicketSalesFragment.this).residentOfferManager.isResidentOffersEnabled()) {
                            GeneralTicketSalesFragment.this.getListView().smoothScrollToPositionFromTop(0, GeneralTicketSalesFragment.this.partyMixActions.getView().getTop() - (GeneralTicketSalesFragment.this.partyMixActions.getView().findViewById(C11971R.id.senior_tickets_picker).getBottom() + GeneralTicketSalesFragment.this.partyMixActions.getView().getHeight()), 300);
                        }
                        GeneralTicketSalesFragment.this.restoreDateOption();
                        GeneralTicketSalesFragment.this.displayCalendarIfNeeded();
                    }
                });
                customRadioButtonNumberOfDaysSelection.setClickable(false);
                viewGroup.addView(customRadioButtonNumberOfDaysSelection);
            }
        }
        if (!z10) {
            this.selectedDayCount = createEmptyDay();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_X, viewGroup.getWidth(), 0.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                GeneralTicketSalesFragment.this.displayCalendarIfNeeded();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                viewGroup.setVisibility(0);
            }
        });
        objectAnimatorOfFloat.start();
        int i11 = 600;
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            i11 += 50;
            ((CustomRadioButtonNumberOfDaysSelection) viewGroup.getChildAt(i12)).startPriceAnimation(i11);
        }
        if (viewGroup.getChildCount() <= 0 || this.selectedDayCount.getNumDay().intValue() <= 0) {
            makeChildClickable(viewGroup);
            clearTieredDaySelections();
        } else {
            final View viewForCurrentDaysSelection = getViewForCurrentDaysSelection(viewGroup);
            focusDaySelected(viewForCurrentDaysSelection);
            new Handler().postDelayed(new Runnable() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.4
                @Override // java.lang.Runnable
                public void run() {
                    View view = viewForCurrentDaysSelection;
                    if (view != null) {
                        view.setSelected(true);
                    } else {
                        GeneralTicketSalesFragment.this.clearTieredDaySelections();
                    }
                    GeneralTicketSalesFragment.this.makeChildClickable(viewGroup);
                }
            }, (this.selectedDayCount.getNumDay().intValue() * 50) + 600);
        }
        TextView textView2 = (TextView) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.price_per_day_note);
        textView2.setText(getString(this.actionListener.getDaySelectorPricePerDayStringId(), Integer.valueOf(this.ticketSalesConfigManager.getLowerBoundForAdultAge())));
        textView2.setVisibility(0);
        if (offerTicketDayList.size() == 1) {
            viewGroup.getChildAt(0).performClick();
        }
    }

    private TicketDay createEmptyDay() {
        return new TicketDay(Boolean.FALSE, Integer.valueOf(this.ticketSalesConfigManager.getDefaultNumberOfDays()), null, null, null);
    }

    private Map<String, String> createSalesAnalyticContext() {
        String analyticsDefaultProductString = TicketSalesAnalyticsUtil.getAnalyticsDefaultProductString(this.partyMixActions.getParties().getTotalNumberOfTickets());
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("&&products", analyticsDefaultProductString);
        mapMo37420q.put("link.category", this.productCategoryDetails.getProductCategoryType().getAnalyticsLinkCategory());
        mapMo37420q.put(TicketSalesAnalyticsConstants.TICKET_SALES_KEY_TICKET_DAYS, String.valueOf(this.selectedDayCount.getNumDay()));
        mapMo37420q.put("store", "Consumer");
        return mapMo37420q;
    }

    private Spannable createSpannableString(String str, String str2) {
        C22462m.m68685q(str, "resident message cannot be null");
        C22462m.m68685q(str2, "cta message cannot be null");
        SpannableString spannableString = new SpannableString(String.format(str, str2));
        int length = spannableString.length() - str2.length();
        if (length < 0) {
            length = 0;
        }
        spannableString.setSpan(this.clickableSpan, length, spannableString.length(), 33);
        return spannableString;
    }

    private void displayAvailCalendarInformation(String str, String str2, final String str3, final String str4) {
        this.availCalendarTitle.setText(str);
        this.availCalendarDescription.setText(str2);
        this.availCalendarCTA.setText(str3);
        this.availCalendarCTA.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32776a.lambda$displayAvailCalendarInformation$6(str3, str4, view);
            }
        });
    }

    private void displayCalendar(AnimatorListenerAdapter animatorListenerAdapter) {
        TicketProductServiceResponse serviceResponse = getServiceResponse();
        TicketSalesFragmentDataManager fragmentDataManager = getFragmentDataManager();
        Optional<TieredTicketsCalendar> calendarForDay = fragmentDataManager.getCalendarForDay(serviceResponse, this.selectedDayCount);
        if (!calendarForDay.isPresent()) {
            this.animationControls.hideViewWithObjectAnimator(this.calendarContainerLayout, AnimationControls.Direction.FADE_OUT, getActivity(), null);
            return;
        }
        if (this.vendomatic.m38730W()) {
            populateDisneyCalendar(calendarForDay, fragmentDataManager.getAvailableTicketTierDeltaData(serviceResponse, this.selectedDayCount));
        } else {
            populateDisneyCalendar(calendarForDay, fragmentDataManager.getAvailableTicketTierLegendData(serviceResponse, this.selectedDayCount));
        }
        if (this.selectedDate == null || this.calendarContainerLayout.getVisibility() != 0) {
            this.animationControls.showViewWithObjectAnimator(this.calendarContainerLayout, AnimationControls.Direction.FADE_IN, getActivity(), animatorListenerAdapter);
            return;
        }
        MonthModeRecyclerView monthModeRecyclerView = (MonthModeRecyclerView) this.disneyCalendar.findViewById(C11971R.id.calendar_month_mode_recycler);
        if (monthModeRecyclerView == null || monthModeRecyclerView.getSelectedDate() != null) {
            return;
        }
        this.disneyCalendar.setSelectedDate(this.selectedDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displayCalendarIfNeeded() {
        if (isTieredTicketsEnabled()) {
            updateTieredTicketsEnabledUI();
        } else {
            clearTieredDaySelections();
            updateTieredTicketsDisabledUI();
        }
    }

    private void displayPartyMixAndTickets(final AnimatorListenerAdapter animatorListenerAdapter) {
        if (isVisible()) {
            if (this.partyMixActions.getView() == null || this.partyMixActions.getView().getVisibility() == 0) {
                updateListWithTicketSelection();
                return;
            }
            updatePartyMixView();
            this.animationControls.showViewWithObjectAnimator(this.partyMixActions.getView(), AnimationControls.Direction.FAST_FADE_IN, getActivity(), new AnimatorListenerAdapter() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.13
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    GeneralTicketSalesFragment.this.updateListWithTicketSelection();
                    AnimatorListenerAdapter animatorListenerAdapter2 = animatorListenerAdapter;
                    if (animatorListenerAdapter2 != null) {
                        animatorListenerAdapter2.onAnimationEnd(animator);
                    }
                }
            });
            if (!this.residentOfferManager.isResidentOffersEnabled() || this.btnToday.getVisibility() == 0) {
                return;
            }
            this.viewIdForScroll = C11971R.id.divider_after_fragment_ticket_sales_days_selector;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displayPartyMixIfDaysSelected() {
        if (this.selectedDayCount.getNumDay().intValue() > 0) {
            displayPartyMixAndTickets(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void focusDaySelected(final View view) {
        if (view == null) {
            return;
        }
        final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.days_scroll_view);
        new Handler().post(new Runnable() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.5
            @Override // java.lang.Runnable
            public void run() {
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(horizontalScrollView, "scrollX", view.getLeft() - view.getWidth());
                objectAnimatorOfInt.setDuration(800L);
                objectAnimatorOfInt.start();
            }
        });
    }

    private AbstractC20589a getCalendarAdapter(Optional<TieredTicketsCalendar> optional, Map map) {
        GeneralTicketSalesFragment generalTicketSalesFragment;
        TieredTicketsCalendar.TieredTicketDate tieredTicketDate;
        TieredTicketsCalendar.TieredTicketDate tieredTicketDate2;
        TieredTicketsCalendar.TieredTicketDate tieredTicketDate3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.priceCells.clear();
        if (optional.isPresent()) {
            Iterator<Map.Entry<Calendar, TieredTicketsCalendar.TieredTicketDate>> it = optional.get().getDateToTicketTierNameMap().entrySet().iterator();
            if (it.hasNext()) {
                TieredTicketsCalendar.TieredTicketDate value = it.next().getValue();
                TieredTicketsCalendar.TieredTicketDate tieredTicketDate4 = value;
                TieredTicketsCalendar.TieredTicketDate tieredTicketDate5 = tieredTicketDate4;
                String ticketTierName = value.getTicketTierName();
                TieredTicketsCalendar.TieredTicketDate tieredTicketDate6 = tieredTicketDate5;
                while (it.hasNext()) {
                    this.addToPriceCells(map, optional, tieredTicketDate5);
                    if (ticketTierName.equals(tieredTicketDate6.getTicketTierName())) {
                        generalTicketSalesFragment = this;
                        if (tieredTicketDate4.getTicketTierName().equals(ticketTierName)) {
                            tieredTicketDate4 = tieredTicketDate5;
                        }
                    } else {
                        generalTicketSalesFragment = this;
                        generalTicketSalesFragment.addRangeByCategory(tieredTicketDate6, tieredTicketDate4, arrayList, arrayList2, arrayList3, arrayList4);
                        tieredTicketDate6 = tieredTicketDate5;
                        tieredTicketDate4 = tieredTicketDate6;
                    }
                    TieredTicketsCalendar.TieredTicketDate value2 = it.next().getValue();
                    ticketTierName = value2.getTicketTierName();
                    if (generalTicketSalesFragment.time.m39088e(tieredTicketDate5.getDate().getTime(), value2.getDate().getTime()) > 1) {
                        generalTicketSalesFragment.addRangeByCategory(tieredTicketDate6, tieredTicketDate4, arrayList, arrayList2, arrayList3, arrayList4);
                        tieredTicketDate6 = value2;
                        tieredTicketDate4 = tieredTicketDate6;
                    }
                    if (it.hasNext()) {
                        tieredTicketDate = tieredTicketDate6;
                        tieredTicketDate2 = tieredTicketDate4;
                        tieredTicketDate3 = value2;
                    } else {
                        generalTicketSalesFragment.addRangeByCategory(tieredTicketDate6, tieredTicketDate4, arrayList, arrayList2, arrayList3, arrayList4);
                        tieredTicketDate = tieredTicketDate6;
                        tieredTicketDate2 = tieredTicketDate4;
                        tieredTicketDate3 = value2;
                        generalTicketSalesFragment.addRangeByCategory(tieredTicketDate3, value2, arrayList, arrayList2, arrayList3, arrayList4);
                        generalTicketSalesFragment.addToPriceCells(map, optional, tieredTicketDate3);
                    }
                    TieredTicketsCalendar.TieredTicketDate tieredTicketDate7 = tieredTicketDate;
                    tieredTicketDate5 = tieredTicketDate3;
                    tieredTicketDate6 = tieredTicketDate7;
                    this = generalTicketSalesFragment;
                    tieredTicketDate4 = tieredTicketDate2;
                }
            }
        }
        return this.calendarAdapter(optional, arrayList, arrayList2, arrayList3, arrayList4);
    }

    private Optional<Calendar> getCurrentDateAtThePark(TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        SimpleDateFormat dateFormat = getDateFormat(timeZone);
        try {
            calendar.setTime(dateFormat.parse(dateFormat.format(calendar.getTime())));
            return Optional.fromNullable(calendar);
        } catch (ParseException unused) {
            return Optional.absent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SimpleDateFormat getDateFormat(TimeZone timeZone) {
        return getDateFormat(timeZone, Locale.getDefault());
    }

    private SpannableString getFormattedPrice(TicketSelectionCalendarLegend ticketSelectionCalendarLegend) {
        return SpannableString.valueOf(new SpannableStringBuilder(getString(C11971R.string.ticket_sales_starting_from)).append((CharSequence) " ").append((CharSequence) DisplayPriceFormatter.formatDisplayPriceAndExtraText(ticketSelectionCalendarLegend.getStartingFromPrice().get(), getString(C11971R.string.ticket_sales_dagger))));
    }

    private Optional<Spanned> getMinDisplayPricePerDay(TicketDay ticketDay) {
        TicketProductParameters ticketProductParameterForPricePerDay;
        Price minDisplayPricePerDay;
        SpannableString displayPriceAndExtraText = (ticketDay.getStartingFromPrice().isPresent() && C22459j.m68660a(1, ticketDay.getNumDay())) ? DisplayPriceFormatter.formatDisplayPriceAndExtraText(ticketDay.getStartingFromPrice().get(), getString(C11971R.string.ticket_sales_dagger)) : null;
        if (this.residentOfferManager.isResidentOffersEnabled() && this.residentOfferManager.isSpecialOfferSelected() && (minDisplayPricePerDay = this.residentOfferManager.getMinDisplayPricePerDay(ticketDay, getServiceResponse())) != null) {
            displayPriceAndExtraText = DisplayPriceFormatter.formatDisplayPriceAndExtraText(minDisplayPricePerDay, getString(C11971R.string.ticket_sales_dagger));
        }
        if (displayPriceAndExtraText == null) {
            if (C22459j.m68660a(1, ticketDay.getNumDay())) {
                String str = this.fragmentDataManager.getTierNameByPriority(getServiceResponse(), this.selectedDayCount).get(1);
                ticketProductParameterForPricePerDay = this.actionListener.getTicketProductParameterForPricePerDay(ticketDay.getNumDay().intValue(), str, this.fragmentDataManager.getProductIdByTier(getServiceResponse(), str));
            } else {
                ticketProductParameterForPricePerDay = this.actionListener.getTicketProductParameterForPricePerDay(ticketDay.getNumDay().intValue(), null, null);
            }
            PricePerDay pricePerDay = getFragmentDataManager().getPricePerDay(ticketProductParameterForPricePerDay, getServiceResponse());
            if (pricePerDay.getAdultPricePerDay().isPresent() || pricePerDay.getChildPricePerDay().isPresent()) {
                displayPriceAndExtraText = DisplayPriceFormatter.formatDisplayPriceAndExtraText(pricePerDay.getAdultPricePerDay().get(), getString(C11971R.string.ticket_sales_dagger));
            }
        }
        return Optional.fromNullable(displayPriceAndExtraText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getViewForCurrentDaysSelection(ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            if (C22459j.m68660a(viewGroup.getChildAt(i10).getTag(), this.selectedDayCount)) {
                return viewGroup.getChildAt(i10);
            }
        }
        return null;
    }

    private void hideCalendarDrawerFadeOutAnimation() {
        this.animationControls.hideViewWithObjectAnimator(this.calendarDrawerLayout, AnimationControls.Direction.FAST_FADE_OUT, getActivity(), null);
    }

    private void hidePartyMixAndTickets(AnimatorListenerAdapter animatorListenerAdapter, boolean z10) {
        if (isVisible()) {
            getAdapter().clear();
            getAdapter().notifyDataSetChanged();
            this.selectParkThemeTitle.setVisibility(8);
            if (z10) {
                this.animationControls.hideViewWithObjectAnimator(this.partyMixActions.getView(), AnimationControls.Direction.FADE_OUT, getActivity(), animatorListenerAdapter);
            } else {
                this.partyMixActions.getView().setVisibility(8);
            }
        }
    }

    private boolean isTieredTicketsEnabled() {
        return getFragmentDataManager().isTieredTicketsEnabled(getServiceResponse());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$displayAvailCalendarInformation$6(String str, String str2, View view) {
        sendAnalyticsViewCalendar(str);
        navigateToAvailCalendar(str2, "&int_cmp=ILC_DLRapp_reopening_ticketlisting");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewDetailClicked$2(String str, View view) {
        ResidentOfferManager residentOfferManager = this.residentOfferManager;
        this.actionListener.showAboutFragment(Lists.m69271l(new AboutElement(null, residentOfferManager.getBlockOutDatesMessage(residentOfferManager.getOfferById(str)))), getString(C11971R.string.blockout_dates));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCalendarViewListener$4(Calendar calendar) {
        if (!this.vendomatic.m38730W() || this.selectedDate == null) {
            return;
        }
        showCalendarDrawerFadeInAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCalendarViewListener$5() {
        if (this.vendomatic.m38730W()) {
            hideCalendarDrawerFadeOutAnimation();
            Calendar calendar = this.endDate;
            if (calendar != null) {
                Calendar calendar2 = (Calendar) calendar.clone();
                calendar2.add(2, 1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateTimeUtil.MONTH_FORMAT);
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy");
                TextView textView = (TextView) this.disneyCalendar.findViewById(C11971R.id.calendar_month_header);
                TextView textView2 = (TextView) this.disneyCalendar.findViewById(C11971R.id.calendar_year_header);
                textView.setText(simpleDateFormat.format(calendar2.getTime()));
                textView2.setText(simpleDateFormat2.format(calendar2.getTime()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateAboutTieredDayTicketsButton$0(String str, View view) {
        this.actionListener.showAboutFragment(getAboutTierTicketsContent(str), getString(C11971R.string.ticket_sales_about_tier_tickets_fragment_title), true);
        sendAnalyticsAboutTieredDay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeChildClickable(ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            viewGroup.getChildAt(i10).setClickable(true);
        }
    }

    private void navigateToAuthentication() {
        clearProductSelectionActionPending();
        this.childNavigator.m37382o(this.profileConfiguration.getProfileNavEntriesBuilderProvider().getNavigationEntryForSecondarySignIn(getActivity()).build());
    }

    private void navigateToAvailCalendar(String str, String str2) {
        String str3;
        if (this.paymentsEnvironment.getPaymentServiceEnvironment() == PaymentsEnvironment.PaymentServiceEnv.PROD) {
            str3 = "";
        } else {
            str3 = this.paymentsEnvironment.getPaymentServiceEnvironment().getName() + ".";
        }
        String strReplace = str.replace("[environment]", str3);
        this.childNavigator.m37388w(TicketSalesHybridActivity.createIntent(getActivity(), "reservationAvailCalendar", strReplace + str2)).withAnimations(new SnowballNextFlowAnimation()).navigate();
    }

    public static final GeneralTicketSalesFragment newInstance(ProductCategoryDetails productCategoryDetails, WebStoreId webStoreId, DestinationId destinationId, AffiliationType affiliationType, String str, Calendar calendar) {
        C22462m.m68685q(productCategoryDetails, "categoryDetails == null");
        C22462m.m68685q(webStoreId, "webStoreId == null");
        C22462m.m68685q(destinationId, "destinationId == null");
        C22462m.m68685q(affiliationType, "affiliationType == null");
        GeneralTicketSalesFragment generalTicketSalesFragment = new GeneralTicketSalesFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(TicketSalesConstants.KEY_ARG_PRODUCT_CATEGORY_DETAILS, productCategoryDetails);
        bundle.putString(TicketSalesConstants.KEY_ARG_WEB_STORE_ID, webStoreId.name());
        bundle.putSerializable("key_sellable_on_date", calendar);
        bundle.putSerializable(TicketSalesConstants.KEY_ARG_DESTINATION_ID, destinationId);
        bundle.putString(TicketSalesConstants.KEY_ARG_AFFILIATION_TYPE, affiliationType.name());
        bundle.putString(TicketSalesConstants.KEY_ARG_SESSION_ID, str);
        generalTicketSalesFragment.setArguments(bundle);
        return generalTicketSalesFragment;
    }

    private void populateDisneyCalendar(Optional<TieredTicketsCalendar> optional, Map map) {
        TimeZone timeZone = optional.get().getTimeZone();
        this.endDate = getLastTieredTicketDate(optional.get().getDateToTicketTierNameMap());
        if (this.vendomatic.m38730W()) {
            AbstractC20589a calendarAdapter = getCalendarAdapter(optional, map);
            if (this.priceCalendarMonthCellViewAdapter == null) {
                this.priceCalendarMonthCellViewAdapter = new PriceCalendarMonthCellViewAdapter(this.time.m39099q());
            }
            this.priceCalendarMonthCellViewAdapter.setPrices(this.priceCells);
            this.disneyCalendar.configure(new C20602k.a().m62227o(C11971R.style.CalendarDateText).m62226n(C11971R.style.CalendarDateDisabledText).m62228p(C11971R.style.CalendarDateSelectedText).m62221f(new C33259a(getContext())).m62221f(new PriceSelectedItemDecoration(getContext())).m62223k(this.pepTieredCalendarSeasonalTitleMobile, this.pepTieredCalendarSeasonalContentMobile).m62213a(calendarAdapter).m62214b(this.endDate).m62217e(timeZone).m62224l(this.priceCalendarMonthCellViewAdapter).m62225m(new InterfaceC20601j() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.f
                @Override // com.disney.wdpro.support.calendar.configurations.InterfaceC20601j
                /* renamed from: a */
                public final RecyclerView.AbstractC4909l mo50229a() {
                    return GeneralTicketSalesFragment.m50182H0();
                }
            }).m62222g());
            return;
        }
        C20596e.a aVar = new C20596e.a();
        TicketTierName ticketTierName = TicketTierName.VALUE;
        if (map.get(ticketTierName) != null) {
            aVar.m62208g(new C33668c.a().m101654j(((TicketSelectionCalendarLegend) map.get(ticketTierName)).getGuestFacingTierName().get()).m101655k(getFormattedPrice((TicketSelectionCalendarLegend) map.get(ticketTierName))).m101651g(getString(C11971R.string.ticket_sales_cd_ticket_starting_at, ((TicketSelectionCalendarLegend) map.get(ticketTierName)).getStartingFromPrice().get().getDisplayPrice())).m101652h(getString(C11971R.string.ticket_sales_cd_price_for_one_park_suffix, String.valueOf(this.ticketSalesConfigManager.getLowerBoundForAdultAge()))).m101656l(C11971R.drawable.value_legend_background_selector).m101653i());
        }
        TicketTierName ticketTierName2 = TicketTierName.REGULAR;
        if (map.get(ticketTierName2) != null) {
            aVar.m62210i(new C33668c.a().m101654j(((TicketSelectionCalendarLegend) map.get(ticketTierName2)).getGuestFacingTierName().get()).m101655k(getFormattedPrice((TicketSelectionCalendarLegend) map.get(ticketTierName2))).m101651g(getString(C11971R.string.ticket_sales_cd_ticket_starting_at, ((TicketSelectionCalendarLegend) map.get(ticketTierName2)).getStartingFromPrice().get().getDisplayPrice())).m101652h(getString(C11971R.string.ticket_sales_cd_price_for_one_park_suffix, String.valueOf(this.ticketSalesConfigManager.getLowerBoundForAdultAge()))).m101656l(C11971R.drawable.regular_legend_background_selector).m101653i());
        }
        TicketTierName ticketTierName3 = TicketTierName.PEAK;
        if (map.get(ticketTierName3) != null) {
            aVar.m62209h(new C33668c.a().m101654j(((TicketSelectionCalendarLegend) map.get(ticketTierName3)).getGuestFacingTierName().get()).m101655k(getFormattedPrice((TicketSelectionCalendarLegend) map.get(ticketTierName3))).m101651g(getString(C11971R.string.ticket_sales_cd_ticket_starting_at, ((TicketSelectionCalendarLegend) map.get(ticketTierName3)).getStartingFromPrice().get().getDisplayPrice())).m101652h(getString(C11971R.string.ticket_sales_cd_price_for_one_park_suffix, String.valueOf(this.ticketSalesConfigManager.getLowerBoundForAdultAge()))).m101656l(C11971R.drawable.peak_legend_background_selector).m101653i());
        }
        aVar.m62211j(this.pepTieredCalendarSeasonalTitleMobile, getString(C11971R.string.ticket_sales_bravo_end_of_calendar_message_body)).m62213a(getCalendarAdapter(optional, null)).m62214b(this.endDate).m62217e(timeZone).m62212k(6);
        this.disneyCalendar.configure(aVar.m62207f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreDateOption() {
        if (this.selectedDayCount.isTieredDay().booleanValue()) {
            this.btnPickDate.setChecked(this.isPickDateChecked);
            this.btnToday.setChecked(this.isTodayChecked);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreSelectedCalendarDate() throws ParseException {
        String string = SharedPreferenceUtility.getString(getActivity(), KEY_SELECTED_DATE, null);
        String string2 = SharedPreferenceUtility.getString(getActivity(), KEY_SELECTED_DATE_TIME_ZONE, null);
        TimeZone timeZone = !C22466q.m68722b(string2) ? TimeZone.getTimeZone(string2) : TimeZone.getDefault();
        this.selectedDate = null;
        if (C22466q.m68722b(string)) {
            return;
        }
        try {
            Date date = getDateFormat(timeZone).parse(string);
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date);
            this.selectedDate = (Calendar) calendar.clone();
        } catch (ParseException unused) {
        }
    }

    private void retrieveAndDisplayHeaderImage(String str) {
        Context context = getContext();
        if (C22466q.m68722b(str) || context == null) {
            setHeroImageFromResources();
        } else {
            new Picasso.Builder(context).build().load(str).placeholder(getResources().getDrawable(C11971R.drawable.ticket_sales_landing_header_dlr)).into(this.heroImage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveSelectedCalendarDate() {
        Calendar calendar = this.selectedDate;
        if (calendar != null) {
            SharedPreferenceUtility.putString(getActivity(), KEY_SELECTED_DATE, getDateFormat(calendar.getTimeZone()).format(this.selectedDate.getTime()));
            SharedPreferenceUtility.putString(getActivity(), KEY_SELECTED_DATE_TIME_ZONE, this.selectedDate.getTimeZone().getID());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAnalyticDaysSelection() {
        Parties parties = this.partyMixActions.getParties();
        int totalNumberOfTickets = parties.getTotalNumberOfTickets();
        Map<String, String> mapCreateSalesAnalyticContext = createSalesAnalyticContext();
        mapCreateSalesAnalyticContext.put("party.size", String.valueOf(totalNumberOfTickets));
        mapCreateSalesAnalyticContext.put("ticketsales.search", "1");
        mapCreateSalesAnalyticContext.put("party.makeup", String.format(TicketSalesAnalyticsConstants.TICKET_SALES_VALUE_PARTY_MAKEUP, Integer.valueOf(parties.getNumberOfTickets(AgeGroup.ADULT)), Integer.valueOf(parties.getNumberOfTickets(AgeGroup.CHILD))));
        this.ticketSalesAnalyticsHelper.trackAction("ticketsales.search", mapCreateSalesAnalyticContext);
    }

    private void sendAnalyticsAboutTieredDay() {
        String analyticsDefaultProductString = TicketSalesAnalyticsUtil.getAnalyticsDefaultProductString(this.partyMixActions.getParties().getTotalNumberOfTickets());
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("&&products", analyticsDefaultProductString);
        mapMo37420q.put("link.category", this.productCategoryDetails.getProductCategoryType().getAnalyticsLinkCategory());
        mapMo37420q.put("prodview", "1");
        mapMo37420q.put("store", "Consumer");
        mapMo37420q.put("ticket.tier", this.selectedTier);
        this.analyticsHelper.mo37405b(TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_ABOUT_1DAY_TICKET, mapMo37420q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAnalyticsDateSelectedOnCalendar() {
        Map<String, String> mapCreateSalesAnalyticContext = createSalesAnalyticContext();
        mapCreateSalesAnalyticContext.put("cal.date", getDateFormat(this.selectedDate.getTimeZone(), Locale.US).format(this.selectedDate.getTime()));
        Calendar calendar = this.selectedDate;
        mapCreateSalesAnalyticContext.put("cal.window", String.valueOf(DateUtils.subtractDays(calendar, Calendar.getInstance(calendar.getTimeZone()))));
        mapCreateSalesAnalyticContext.put("ticket.tier", this.selectedTier);
        mapCreateSalesAnalyticContext.put("ticketsales.search", "1");
        this.analyticsHelper.mo37405b(TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_CAL_PICK_A_DATE, mapCreateSalesAnalyticContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAnalyticsPickADate() {
        Map<String, String> mapCreateSalesAnalyticContext = createSalesAnalyticContext();
        mapCreateSalesAnalyticContext.put("ticketsales.search", "1");
        this.analyticsHelper.mo37405b(TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_PICK_A_DATE, mapCreateSalesAnalyticContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAnalyticsToday() {
        Map<String, String> mapCreateSalesAnalyticContext = createSalesAnalyticContext();
        mapCreateSalesAnalyticContext.put("ticket.tier", this.selectedTier);
        mapCreateSalesAnalyticContext.put("cal.date", getDateFormat(this.selectedDate.getTimeZone(), Locale.US).format(new Date()));
        mapCreateSalesAnalyticContext.put("cal.window", "0");
        mapCreateSalesAnalyticContext.put("ticketsales.search", "1");
        this.analyticsHelper.mo37405b(TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_TODAY, mapCreateSalesAnalyticContext);
    }

    private void sendAnalyticsViewCalendar(String str) {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("link.category", TicketSalesAnalyticsConstants.TICKET_LISTING);
        mapMo37420q.put("link.type", "Content:" + str);
        mapMo37420q.put("templateType", "parkavailabilitycalendar_reopening");
        mapMo37420q.put("assetid", "None");
        mapMo37420q.put("page.detailname", "Park Availability Calendar");
        this.ticketSalesAnalyticsHelper.trackAction("ModuleClick", mapMo37420q);
    }

    private void setCalendarViewListener() {
        this.disneyCalendar.setOnDateSelectedListener(new DisneyCalendarView.InterfaceC20586e() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.11
            @Override // com.disney.wdpro.support.calendar.DisneyCalendarView.InterfaceC20586e
            public boolean onDateSelected(Calendar calendar, C33668c c33668c) throws Resources.NotFoundException {
                TimeZone timeZone = calendar.getTimeZone();
                Calendar calendar2 = (Calendar) calendar.clone();
                SimpleDateFormat dateFormat = GeneralTicketSalesFragment.this.getDateFormat(timeZone);
                try {
                    calendar2.setTime(dateFormat.parse(dateFormat.format(calendar2.getTime())));
                } catch (ParseException unused) {
                }
                calendar2.setTime(calendar2.getTime());
                calendar2.setTimeZone(timeZone);
                GeneralTicketSalesFragment.this.selectedDate = calendar2;
                if (GeneralTicketSalesFragment.this.vendomatic.m38730W()) {
                    GeneralTicketSalesFragment.this.priceCalendarMonthCellViewAdapter.setSelectedDate(GeneralTicketSalesFragment.this.selectedDate);
                    GeneralTicketSalesFragment.this.updateCalendarDrawerItem();
                    GeneralTicketSalesFragment.this.showCalendarDrawerFadeInAnimation();
                }
                ((BaseSelectionFragment) GeneralTicketSalesFragment.this).residentOfferManager.setSelectedDate(GeneralTicketSalesFragment.this.selectedDate);
                GeneralTicketSalesFragment.this.onlyDateChanged = true;
                GeneralTicketSalesFragment.this.viewIdForScroll = C11971R.id.divider_after_calendar;
                GeneralTicketSalesFragment.this.updateUI();
                GeneralTicketSalesFragment.this.onlyDateChanged = false;
                GeneralTicketSalesFragment.this.sendAnalyticsDateSelectedOnCalendar();
                GeneralTicketSalesFragment.this.saveSelectedCalendarDate();
                return true;
            }

            @Override // com.disney.wdpro.support.calendar.DisneyCalendarView.InterfaceC20586e
            public void onNonSelectableDateTapped() {
            }

            @Override // com.disney.wdpro.support.calendar.DisneyCalendarView.InterfaceC20586e
            public void onSelectionCleared() {
            }
        });
        this.disneyCalendar.setOnMonthChangedListener(new DisneyCalendarView.InterfaceC20588g() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.d
            @Override // com.disney.wdpro.support.calendar.DisneyCalendarView.InterfaceC20588g
            /* renamed from: a */
            public final void mo50227a(Calendar calendar) {
                this.f32774a.lambda$setCalendarViewListener$4(calendar);
            }
        });
        this.disneyCalendar.setOnEndOfCalendarDisplayedListener(new DisneyCalendarView.InterfaceC20587f() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.e
            @Override // com.disney.wdpro.support.calendar.DisneyCalendarView.InterfaceC20587f
            /* renamed from: a */
            public final void mo50228a() {
                this.f32775a.lambda$setCalendarViewListener$5();
            }
        });
    }

    private void setHeroImageFromResources() {
        this.heroImage.setBackground(getResources().getDrawable(C11971R.drawable.ticket_sales_landing_header_dlr));
    }

    private void setTextBelowDayButton(TicketDay ticketDay, CustomRadioButtonNumberOfDaysSelection customRadioButtonNumberOfDaysSelection) throws Resources.NotFoundException {
        String quantityString = getResources().getQuantityString(C11971R.plurals.days, ticketDay.getNumDay().intValue(), ticketDay.getNumDay());
        if (ticketDay.getPolicyText().isPresent()) {
            customRadioButtonNumberOfDaysSelection.setPolicyText(ticketDay.getPolicyText().get());
            C20511d c20511d = new C20511d(getContext());
            c20511d.m62027f(ticketDay.getNumDay().toString()).m62027f(quantityString).m62027f(ticketDay.getPolicyText().get()).m62031j(getString(C11971R.string.accessibility_button_suffix));
            customRadioButtonNumberOfDaysSelection.setContentDescription(c20511d.toString());
            return;
        }
        Optional<Spanned> minDisplayPricePerDay = getMinDisplayPricePerDay(ticketDay);
        if (!minDisplayPricePerDay.isPresent()) {
            customRadioButtonNumberOfDaysSelection.hidePriceTextViews();
        } else {
            customRadioButtonNumberOfDaysSelection.setMinimumTextPricePerDay(minDisplayPricePerDay.get());
            customRadioButtonNumberOfDaysSelection.setContentDescription(getString(this.actionListener.getDaySelectorPricePerDayContentDescriptionStringId(), ticketDay.getNumDay(), quantityString, minDisplayPricePerDay.get(), Integer.valueOf(this.ticketSalesConfigManager.getLowerBoundForAdultAge())));
        }
    }

    private void showCalendar(AnimatorListenerAdapter animatorListenerAdapter) {
        if (!this.onlyDateChanged) {
            displayCalendar(animatorListenerAdapter);
        }
        updateAboutTieredDayTicketsButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCalendarDrawerFadeInAnimation() {
        this.animationControls.showViewWithObjectAnimator(this.calendarDrawerLayout, AnimationControls.Direction.FADE_IN, getActivity(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void smoothScroll(int i10) {
        int i11 = this.viewIdForScroll;
        if (i11 != -1) {
            getListView().smoothScrollToPositionFromTop(0, this.selectTicketSelectionHeaderLayout.getTop() - (this.selectTicketSelectionHeaderLayout.findViewById(i11).getBottom() + i10), 300);
            this.viewIdForScroll = -1;
        }
    }

    private void swapPartyMixWithPickDate(boolean z10) {
        if (this.partyMixActions.getView() == null || !this.partyMixActions.getView().isShown()) {
            this.animationControls.showViewWithObjectAnimator(this.tieredContainerLayout, AnimationControls.Direction.FADE_IN, getActivity(), null);
            return;
        }
        if (!z10) {
            this.animationControls.showViewWithObjectAnimator(this.tieredContainerLayout, AnimationControls.Direction.FADE_IN, getActivity(), null);
        }
        hidePartyMixAndTickets(new AnimatorListenerAdapter() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.14
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                GeneralTicketSalesFragment.this.animationControls.showViewWithObjectAnimator(GeneralTicketSalesFragment.this.tieredContainerLayout, AnimationControls.Direction.FADE_IN, GeneralTicketSalesFragment.this.getActivity(), null);
            }
        }, z10);
    }

    @SuppressLint({"StringFormatMatches"})
    private void updateAboutTieredDayTicketsButton() {
        TextView textView = (TextView) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.price_per_ticket_note);
        final String strM68725e = C22466q.m68725e(this.vendomatic.m38774n());
        if (this.disclaimerTierLegendMobile.contains("%2$")) {
            String str = this.ticketSalesConfigManager.getLowerBoundForAdultAge() + "+";
            if (this.residentOfferManager.getAgeGroups().contains(AgeGroup.CHILD) && !this.residentOfferManager.getAgeGroups().contains(AgeGroup.ADULT)) {
                str = this.ticketSalesConfigManager.getLowerBoundForChildAge() + "-" + this.ticketSalesConfigManager.getUpperBoundForChildAge();
            }
            textView.setText(String.format(this.disclaimerTierLegendMobile.replaceAll("@", "s"), str, strM68725e));
        } else {
            textView.setText(String.format(this.disclaimerTierLegendMobile.replaceAll("@", "s"), strM68725e));
        }
        if (C22459j.m68660a(1, this.selectedDayCount.getNumDay())) {
            this.aboutTieredDayTicketButton.setText(getString(C11971R.string.ticket_sales_about_tiered_day_tickets_label, this.selectedDayCount.getNumDay()));
            this.aboutTieredDayTicketButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32770a.lambda$updateAboutTieredDayTicketsButton$0(strM68725e, view);
                }
            });
            this.aboutTieredDayTicketButton.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCalendarDrawerItem() {
        TextView textView = (TextView) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.tv_calendarts_valid_for);
        TextView textView2 = (TextView) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.tv_calendarts_validity);
        TextView textView3 = (TextView) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.tv_calendarts_tier);
        TextView textView4 = (TextView) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.tv_calendarts_price_per_ticket);
        textView.setText(this.validityTitleMobile);
        PriceCell priceCellSelected = this.priceCalendarMonthCellViewAdapter.getPriceCellSelected();
        if (priceCellSelected != null) {
            if (priceCellSelected.getPriority() == 1) {
                textView2.setText(String.format(this.tierLowValidityDetailMobile.replaceAll("@", "s"), priceCellSelected.getTierName()));
            } else {
                textView2.setText(String.format(this.tierHighValidityDetailMobile.replaceAll("@", "s"), priceCellSelected.getTierName()));
            }
            textView3.setText(getString(C11971R.string.ticket_sales_tier_calendar_drawer, priceCellSelected.getTierName()));
            textView4.setText(getString(C11971R.string.ticket_sales_price_calendar_drawer, priceCellSelected.getPrice()));
            C20511d c20511d = new C20511d(getContext());
            c20511d.m62031j(getString(C11971R.string.ticket_sales_valid_calendar)).m62031j(textView2.getText().toString()).m62031j(getString(C11971R.string.ticket_sales_tier_calendar_drawer, priceCellSelected.getTierName())).m62031j(getString(C11971R.string.ticket_sales_price_calendar_drawer, priceCellSelected.getPrice()));
            this.calendarDrawerLayout.setImportantForAccessibility(1);
            this.calendarDrawerLayout.setContentDescription(c20511d.toString());
        }
    }

    private void updateHeaderLayoutVisibility(ImmutableList<TicketDay> immutableList) {
        this.selectTicketSelectionHeaderLayout.setVisibility((immutableList == null || immutableList.isEmpty()) ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"StringFormatMatches"})
    public void updateListWithTicketSelection() {
        if (isVisible()) {
            getAdapter().clear();
            if (getServiceResponse() == null || this.selectedDayCount.getNumDay().intValue() < 1 || this.partyMixActions.getParties().getTotalNumberOfTickets() < 1 || (this.selectedDayCount.getNumDay().intValue() == 1 && this.selectedDate == null)) {
                this.selectParkThemeTitle.setVisibility(8);
                return;
            }
            this.selectParkThemeTitle.setVisibility(0);
            AbstractC22726b3<TicketProductParameters> it = this.actionListener.getTicketProducts(this.selectedDayCount.getNumDay().intValue(), this.partyMixActions.getParties(), this.selectedTier, this.residentOfferManager, getServiceResponse().getProductIdList(DiscountGroupType.STD_GST.getDiscountGroupId())).iterator();
            while (it.hasNext()) {
                addTicketProductsIfPresent(it.next());
            }
            getAdapter().notifyDataSetChanged();
            this.selectParkThemeTitle.setContentDescription(getString(C11971R.string.ticket_sales_cd_ticket_selection_title, getString(C11971R.string.ticket_sales_ticket_selection_title) + getString(C11971R.string.ticket_sales_accessibility_heading), Integer.valueOf(getAdapter().getCount())));
        }
    }

    private void updatePartyMixView() {
        if (this.residentOfferManager.shouldHandleResidentOffer()) {
            this.residentOfferManager.updateAgeGroups(getServiceResponse());
            if (this.residentOfferManager.getAgeGroups().contains(AgeGroup.CHILD) && !this.residentOfferManager.getAgeGroups().contains(AgeGroup.ADULT)) {
                ((TextView) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.price_per_day_note)).setText(getString(this.actionListener.getDaySelectorPricePerDayStringIdForChild(), Integer.valueOf(this.ticketSalesConfigManager.getLowerBoundForChildAge()), Integer.valueOf(this.ticketSalesConfigManager.getUpperBoundForChildAge())));
            }
        } else {
            this.residentOfferManager.useDefaultAgeGroups();
        }
        this.partyMixActions.setTextChangeListener(new TextWatcher() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.16
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                GeneralTicketSalesFragment.this.updateListWithTicketSelection();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        });
        if (this.selectedDayCount.getNumDay().intValue() != 0) {
            this.partyMixActions.updatePickers();
        } else {
            hidePartyMixAndTickets(null, true);
        }
    }

    private void updateTieredTicketsDisabledUI() {
        this.tieredContainerLayout.setVisibility(8);
        displayPartyMixAndTickets(null);
    }

    private void updateTieredTicketsEnabledUI() {
        if (!this.selectedDayCount.isTieredDay().booleanValue()) {
            this.dateOptionsRadioGroup.clearCheck();
            if (this.tieredContainerLayout.getVisibility() != 0) {
                displayPartyMixIfDaysSelected();
                return;
            } else {
                this.animationControls.hideViewWithObjectAnimator(this.tieredContainerLayout, AnimationControls.Direction.FAST_FADE_OUT, getActivity(), new AnimatorListenerAdapter() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.6
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        GeneralTicketSalesFragment.this.displayPartyMixIfDaysSelected();
                    }
                });
                return;
            }
        }
        TieredTicketsCalendar tieredTicketsCalendar = getFragmentDataManager().getCalendarForDay(getServiceResponse(), this.selectedDayCount).get();
        Optional<Calendar> currentDateAtThePark = getCurrentDateAtThePark(tieredTicketsCalendar.getTimeZone());
        Map<Calendar, TieredTicketsCalendar.TieredTicketDate> dateToTicketTierNameMap = tieredTicketsCalendar.getDateToTicketTierNameMap();
        this.btnToday.setVisibility((currentDateAtThePark.isPresent() && dateToTicketTierNameMap.containsKey(currentDateAtThePark.get())) ? 0 : 8);
        TieredTicketsCalendar.TieredTicketDate tieredTicketDate = dateToTicketTierNameMap.get(this.selectedDate);
        this.selectedTier = null;
        if (tieredTicketDate != null) {
            this.selectedTier = tieredTicketDate.getTicketTierName();
        }
        int checkedRadioButtonId = this.dateOptionsRadioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonId == -1) {
            this.calendarContainerLayout.setVisibility(8);
            swapPartyMixWithPickDate(false);
            return;
        }
        if (checkedRadioButtonId == C11971R.id.btn_today) {
            this.animationControls.hideViewWithObjectAnimator(this.calendarContainerLayout, AnimationControls.Direction.FADE_OUT, getActivity(), null);
            this.animationControls.showViewWithObjectAnimator(this.tieredContainerLayout, AnimationControls.Direction.FADE_IN, getActivity(), null);
            displayPartyMixAndTickets(new AnimatorListenerAdapter() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.7
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
                    super.onAnimationEnd(animator);
                    GeneralTicketSalesFragment generalTicketSalesFragment = GeneralTicketSalesFragment.this;
                    generalTicketSalesFragment.smoothScroll(generalTicketSalesFragment.dateOptionsLayout.getHeight());
                    GeneralTicketSalesFragment.this.updateTodayTicketSelection();
                }
            });
        } else if (checkedRadioButtonId == C11971R.id.btn_pick_date) {
            if (this.tieredContainerLayout.getVisibility() != 0) {
                this.tieredContainerLayout.setVisibility(4);
            }
            if (this.selectedDate == null) {
                swapPartyMixWithPickDate(true);
                showCalendar(new AnimatorListenerAdapter() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.10
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        GeneralTicketSalesFragment generalTicketSalesFragment = GeneralTicketSalesFragment.this;
                        generalTicketSalesFragment.smoothScroll(generalTicketSalesFragment.dateOptionsLayout.getHeight());
                    }
                });
            } else {
                this.animationControls.showViewWithObjectAnimator(this.tieredContainerLayout, AnimationControls.Direction.FADE_IN, getActivity(), null);
                showCalendar(new AnimatorListenerAdapter() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.8
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        GeneralTicketSalesFragment.this.disneyCalendar.setSelectedDate(GeneralTicketSalesFragment.this.selectedDate);
                    }
                });
                displayPartyMixAndTickets(new AnimatorListenerAdapter() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.9
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTodayTicketSelection() throws Resources.NotFoundException {
        this.selectParkThemeTitle.setVisibility(8);
        if (this.priceCalendarMonthCellViewAdapter != null && this.vendomatic.m38730W()) {
            this.priceCalendarMonthCellViewAdapter.setCalendarToDefaultView();
            hideCalendarDrawerFadeOutAnimation();
        }
        this.selectedDate = getCurrentDateAtThePark(getFragmentDataManager().getCalendarForDay(getServiceResponse(), this.selectedDayCount).get().getTimeZone()).get();
        this.viewIdForScroll = C11971R.id.divider_after_fragment_ticket_sales_days_selector;
        updateUI();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void cleanDateSelection() {
        SharedPreferenceUtility.remove(getActivity(), KEY_SELECTED_DATE);
        SharedPreferenceUtility.remove(getActivity(), KEY_SELECTED_DATE_TIME_ZONE);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void cleanGuestSelection() {
        SharedPreferenceUtility.remove(getActivity(), KEY_SELECTED_DAY_COUNT);
        SharedPreferenceUtility.remove(getActivity(), KEY_CHECKED_STATE_TODAY_BUTTON);
        SharedPreferenceUtility.remove(getActivity(), KEY_CHECKED_STATE_PICK_DATE_BUTTON);
        cleanDateSelection();
    }

    public List<AboutElement> getAboutTierTicketsContent(String str) {
        if (!this.vendomatic.m38730W()) {
            return Lists.m69271l(new AboutElement(null, getString(C11971R.string.dlr_ticket_sales_about_header)), new AboutElement(getString(C11971R.string.ticket_sales_for_peak_title), getString(C11971R.string.dlr_ticket_sales_for_peak_content)), new AboutElement(getString(C11971R.string.ticket_sales_for_regular_title), getString(C11971R.string.dlr_ticket_sales_for_regular_content)), new AboutElement(getString(C11971R.string.ticket_sales_for_value_title), getString(C11971R.string.dlr_ticket_sales_for_value_content)), new AboutElement(null, getString(C11971R.string.dlr_ticket_sales_about_sub_footer, str)), new AboutElement(getString(C11971R.string.ticket_sales_about_multi_day_title), getString(C11971R.string.dlr_ticket_sales_about_multi_day_content)));
        }
        ImmutableMap<String, TicketTierNameDescription> availableTicketTierDeltaData = this.fragmentDataManager.getAvailableTicketTierDeltaData(getServiceResponse(), this.selectedDayCount);
        LinkedHashMap linkedHashMapM69385v = Maps.m69385v();
        StringBuilder sb2 = new StringBuilder();
        LinkedHashMap linkedHashMapM69385v2 = Maps.m69385v();
        LinkedList linkedList = new LinkedList(availableTicketTierDeltaData.entrySet());
        Collections.sort(linkedList, new Comparator() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return GeneralTicketSalesFragment.m50183I0((Map.Entry) obj, (Map.Entry) obj2);
            }
        });
        int i10 = 0;
        int i11 = 1;
        while (i10 < linkedList.size()) {
            Map.Entry entry = (Map.Entry) linkedList.get(i10);
            int priority = ((TicketTierNameDescription) entry.getValue()).getPriority();
            String str2 = ((TicketTierNameDescription) entry.getValue()).getTextName().get();
            if (i10 == 0 || i10 == linkedList.size() - 1) {
                sb2.append(i10 == 0 ? str2 : " or " + str2);
            } else {
                sb2.append(", " + str2);
            }
            linkedHashMapM69385v.put((String) entry.getKey(), (TicketTierNameDescription) entry.getValue());
            linkedHashMapM69385v2.put(Integer.valueOf(priority), str2);
            i10++;
            i11 = priority;
        }
        ArrayList arrayListM69268i = Lists.m69268i();
        arrayListM69268i.add(new AboutElement(null, getString(C11971R.string.dlr_ticket_sales_delta_about_header, Integer.valueOf(availableTicketTierDeltaData.size()), sb2.toString())));
        Iterator it = linkedHashMapM69385v.entrySet().iterator();
        while (it.hasNext()) {
            TicketTierNameDescription ticketTierNameDescription = (TicketTierNameDescription) ((Map.Entry) it.next()).getValue();
            if (ticketTierNameDescription.getTextName().isPresent()) {
                String str3 = ticketTierNameDescription.getTextName().get();
                int priority2 = ticketTierNameDescription.getPriority();
                StringBuilder sb3 = new StringBuilder();
                for (int i12 = priority2; i12 > 0; i12--) {
                    if (i12 == priority2 || i12 == i11) {
                        sb3.append((linkedHashMapM69385v2.size() <= 1 || i12 != i11 || i12 == priority2) ? (String) linkedHashMapM69385v2.get(Integer.valueOf(i12)) : " or " + ((String) linkedHashMapM69385v2.get(Integer.valueOf(i12))));
                    } else {
                        sb3.append(", " + ((String) linkedHashMapM69385v2.get(Integer.valueOf(i12))));
                    }
                }
                arrayListM69268i.add(new AboutElement(getString(C11971R.string.ticket_sales_tier_calendar_drawer, str3), getString(C11971R.string.dlr_ticket_sales_delta_content, str3, sb3.toString())));
            }
        }
        arrayListM69268i.add(new AboutElement(null, getString(C11971R.string.dlr_ticket_sales_delta_about_sub_footer, sb2.toString(), str, sb2.toString())));
        arrayListM69268i.add(new AboutElement(getString(C11971R.string.ticket_sales_about_multi_day_title), getString(C11971R.string.dlr_ticket_sales_about_multi_day_content)));
        return arrayListM69268i;
    }

    public Calendar getLastTieredTicketDate(Map<Calendar, TieredTicketsCalendar.TieredTicketDate> map) {
        Iterator<Map.Entry<Calendar, TieredTicketsCalendar.TieredTicketDate>> it = map.entrySet().iterator();
        TieredTicketsCalendar.TieredTicketDate value = it.next().getValue();
        TieredTicketsCalendar.TieredTicketDate tieredTicketDate = value;
        while (it.hasNext()) {
            if (value.getDate().getTimeInMillis() >= tieredTicketDate.getDate().getTimeInMillis()) {
                tieredTicketDate = value;
                value = it.next().getValue();
            }
        }
        return value.getDate();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected TicketSalesLayoutProvider getLayoutProvider(WebStoreId webStoreId) {
        return new TicketSalesLayoutProvider(webStoreId);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected TicketOptionListAdapter getNewAdapter(Context context, int i10, TicketSalesConfigManager ticketSalesConfigManager, TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper, FlipCardAnimationUtils.FlippedViewVisibilityNotifier flippedViewVisibilityNotifier, TicketOptionListAdapter.CheckoutButtonListener checkoutButtonListener) {
        GeneralBrickTitleCreator generalBrickTitleCreator = new GeneralBrickTitleCreator();
        ThemeParkPricePerTicketCreator themeParkPricePerTicketCreator = new ThemeParkPricePerTicketCreator();
        ResidentOfferManager residentOfferManager = this.residentOfferManager;
        return new TicketOptionListAdapter(getActivity(), this.ticketSalesLayoutProvider.getBrickListItemLayoutID().intValue(), ticketSalesConfigManager, checkoutButtonListener, new SelectedProductsUIHelper(flippedViewVisibilityNotifier, ticketSalesAnalyticsHelper, generalBrickTitleCreator, themeParkPricePerTicketCreator, residentOfferManager, this, residentOfferManager.isResidentOffersEnabled()));
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected View getTicketOptionListFooterView(LayoutInflater layoutInflater) {
        return null;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected View getTicketOptionListHeaderView(LayoutInflater layoutInflater, ListView listView) {
        View viewInflate = layoutInflater.inflate(C11971R.layout.ticket_sales_fragment_ticket_selection_header, (ViewGroup) listView, false);
        this.animationControls = new AnimationControls();
        this.authenticationCTA = (LinearLayout) viewInflate.findViewById(C11971R.id.authentication_cta_item);
        this.authenticationCTAMessage = (RichTextView) viewInflate.findViewById(C11971R.id.authentication_cta_message);
        this.dividerAfterHeader = viewInflate.findViewById(C11971R.id.divider_after_header);
        CardView cardView = (CardView) viewInflate.findViewById(C11971R.id.avail_calendar_layout);
        this.availCalendarSection = cardView;
        this.availCalendarTitle = (TextView) cardView.findViewById(C11971R.id.avail_calendar_title);
        this.availCalendarDescription = (TextView) this.availCalendarSection.findViewById(C11971R.id.avail_calendar_description);
        this.availCalendarCTA = (TextView) this.availCalendarSection.findViewById(C11971R.id.view_calendar_cta);
        this.selectParkThemeTitle = (TextView) viewInflate.findViewById(C11971R.id.select_park_theme_title);
        this.selectTicketSelectionHeaderLayout = (LinearLayout) viewInflate.findViewById(C11971R.id.fragment_ticket_sales_ticket_selection_header);
        updateHeaderLayoutVisibility(null);
        this.selectParkThemeTitle.setVisibility(8);
        this.tieredContainerLayout = (LinearLayout) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.tier_container);
        this.calendarContainerLayout = (LinearLayout) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.calendar_container);
        this.calendarDrawerLayout = (LinearLayout) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.item_calendar_drawer_layout);
        this.numberOfDaysHeader = (TextView) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.select_number_of_days_title);
        RelativeLayout relativeLayout = (RelativeLayout) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.today_pick_date);
        this.dateOptionsLayout = relativeLayout;
        this.btnToday = (StateViewRadioButton) relativeLayout.findViewById(C11971R.id.btn_today);
        this.btnPickDate = (StateViewRadioButton) this.dateOptionsLayout.findViewById(C11971R.id.btn_pick_date);
        this.dateOptionsRadioGroup = (RadioGroup) this.dateOptionsLayout.findViewById(C11971R.id.group_day_pick_date);
        DisneyCalendarView disneyCalendarView = (DisneyCalendarView) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.month_view_calendar);
        this.disneyCalendar = disneyCalendarView;
        final MonthModeRecyclerView monthModeRecyclerView = (MonthModeRecyclerView) disneyCalendarView.findViewById(C20813g.calendar_month_mode_recycler);
        monthModeRecyclerView.addOnScrollListener(new RecyclerView.AbstractC4916s() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4916s
            public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
                if (i10 == 1) {
                    monthModeRecyclerView.m62308I();
                }
            }
        });
        setCalendarViewListener();
        this.aboutTieredDayTicketButton = (Button) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.btn_about_tiered_day_ticket);
        this.headerBelowImage = (TextView) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.header_below_image);
        this.heroImage = (ImageView) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.ticket_sales_header_image);
        this.priceCells = Maps.m69381r();
        return viewInflate;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return getText(C11971R.string.ticket_sales_title);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BlockOutDatesActionListener
    public void navigateToBlockOutDates(SelectedTicketProducts selectedTicketProducts, boolean z10) {
        ArrayList arrayListM69271l = Lists.m69271l(new AboutElement(null, this.residentOfferManager.getBlockOutDatesMessage(selectedTicketProducts)));
        ResidentOffersAnalyticsUtils.trackActionBlockOutDates(this.ticketSalesAnalyticsHelper, selectedTicketProducts, z10 ? TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_BRICK_BACK_BLOCK_OUT_DATES : TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_BRICK_FRONT_BLOCK_OUT_DATES);
        this.actionListener.showAboutFragment(arrayListM69271l, getString(C11971R.string.blockout_dates), TicketSalesAnalyticsConstants.TICKET_SALES_STATE_BLOCK_OUT_DATES, getWebStoreId());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.clickableSpan = new AffiliationCTAClickableSpan(getContext(), this);
        this.authenticationCTAMessage.setText(createSpannableString(getString(C11971R.string.login_cta_message), getString(C11971R.string.login_cta_action_message)), TextView.BufferType.SPANNABLE);
        this.oneDayNote = (TextView) this.dateOptionsLayout.findViewById(C11971R.id.txt_one_day_note);
        this.dateOptionsLayout.findViewById(C11971R.id.pick_day_header).setContentDescription(getString(C11971R.string.ticket_sales_one_day_prices_title) + getString(C11971R.string.ticket_sales_newline) + getString(this.actionListener.getOneDayVaryNoteStringId()));
        setupDateOptionsSelection();
        this.cmsTicketSalesManager.fetchCMSContent(CMSTicketSalesManagerImpl.TICKET_SALES_CATEGORY);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (isProductSelectionActionPending()) {
            super.onActivityResult(i10, i11, intent);
            return;
        }
        if (i10 == 109 && i11 == 101 && intent != null && intent.hasExtra(CheckoutActivity.FINISH_FLOW_EXTRA_DATA)) {
            this.selectedDate = null;
            cleanDateSelection();
            this.selectParkThemeTitle.setVisibility(8);
            if (this.priceCalendarMonthCellViewAdapter == null || !this.vendomatic.m38730W()) {
                return;
            }
            this.priceCalendarMonthCellViewAdapter.setCalendarToDefaultView();
            hideCalendarDrawerFadeOutAnimation();
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ((GeneralTicketSalesUiComponentProvider) context.getApplicationContext()).getGeneralTicketSalesUiComponent().inject(this);
        ActivityCompat.OnRequestPermissionsResultCallback activity = getActivity();
        try {
            this.actionListener = (TicketSalesActions) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement TicketSalesActions");
        }
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.ui.linkhelper.AffiliationCTAClickableSpan.AffiliationCTAClickableSpanListener
    public void onAuthenticationCTAClick(View view) {
        navigateToAuthentication();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseSelectionVASFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.cmsTicketSalesManager = ((TicketSalesUIComponentProvider) getActivity().getApplication()).getTicketSalesUIComponent().getFetchTicketSalesContentManager();
        this.pepTieredCalendarSeasonalTitleMobile = getString(C11971R.string.ticket_sales_end_of_calendar_message_title);
        this.pepTieredCalendarSeasonalContentMobile = getString(C11971R.string.ticket_sales_delta_end_of_calendar_message_body);
        this.validityTitleMobile = getString(C11971R.string.ticket_sales_valid_calendar);
        this.tierLowValidityDetailMobile = getString(C11971R.string.ticket_sales_any_date_in_tier);
        this.tierHighValidityDetailMobile = getString(C11971R.string.ticket_sales_any_date_or_lower);
        this.disclaimerTierLegendMobile = getString(C11971R.string.dlr_ticket_sales_price_per_ticket_note);
        TicketSalesPartyMixFragment ticketSalesPartyMixFragment = (TicketSalesPartyMixFragment) this.actionListener.getPartyMixFragment(getWebStoreId(), this.residentOfferManager);
        this.partyMixActions = ticketSalesPartyMixFragment;
        getChildFragmentManager().m19761r().m19862c(C11971R.id.ticket_sales_number_of_tickets_placeholder, ticketSalesPartyMixFragment, null).mo19611k();
        this.hideSnowballHeaderTitle = this.residentOfferManager.isResidentOffersEnabled();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Subscribe
    public void onFetchAffiliationEvent(ProfileManager.FetchAffiliationEvent fetchAffiliationEvent) {
        if (!fetchAffiliationEvent.isSuccess()) {
            showContentAndHideLoadingViews();
            showGenericErrorDialogAndClose();
            return;
        }
        if (this.residentOfferManager.isResidentOffersEnabled()) {
            this.residentOfferManager.setUserAffiliationsId(fetchAffiliationEvent.getPayload().getAffiliationsList());
            this.residentOfferManager.clearSelectedOffer();
            this.offerSelectorUiHelper.clearResidentOffersRadioButtons();
        }
        processNextLoadingStepWithUpdatedAffiliations();
    }

    @Subscribe
    public void onFetchCMSContent(CMSTicketSalesManager.CMSTicketSalesDataEvent cMSTicketSalesDataEvent) {
        if (cMSTicketSalesDataEvent == null || !cMSTicketSalesDataEvent.isSuccess() || cMSTicketSalesDataEvent.getPayload() == null) {
            return;
        }
        CMSTicketSalesResponse payload = cMSTicketSalesDataEvent.getPayload();
        if (CMSTicketSalesManagerImpl.TICKETS_CATEGORY.equals(cMSTicketSalesDataEvent.getCategory()) && this.vendomatic.m38784q0()) {
            this.oneDayNote.setText(payload.getLearnMoreOneDayTicketsMobile().mo68585or((Optional<String>) ""));
            this.pepTieredCalendarSeasonalTitleMobile = payload.getPepTieredCalendarSeasonalTitleMobile().mo68585or((Optional<String>) getString(C11971R.string.ticket_sales_end_of_calendar_message_title));
            this.pepTieredCalendarSeasonalContentMobile = payload.getPepTieredCalendarSeasonalContentMobile().mo68585or((Optional<String>) getString(C11971R.string.ticket_sales_delta_end_of_calendar_message_body));
            this.validityTitleMobile = payload.getValidityTitleMobile().mo68585or((Optional<String>) getString(C11971R.string.ticket_sales_valid_calendar));
            this.tierLowValidityDetailMobile = payload.getTierLowValidityDetailMobile().mo68585or((Optional<String>) getString(C11971R.string.ticket_sales_any_date_in_tier));
            this.tierHighValidityDetailMobile = payload.getTierHighValidityDetailMobile().mo68585or((Optional<String>) getString(C11971R.string.ticket_sales_any_date_or_lower));
            this.disclaimerTierLegendMobile = payload.getDisclaimerTierLegendMobile().mo68585or((Optional<String>) getString(C11971R.string.dlr_ticket_sales_price_per_ticket_note));
            return;
        }
        if (CMSTicketSalesManagerImpl.TICKET_SALES_CATEGORY.equals(cMSTicketSalesDataEvent.getCategory())) {
            if (!this.vendomatic.m38803w1()) {
                this.dividerAfterHeader.setVisibility(0);
                this.availCalendarSection.setVisibility(8);
            } else {
                this.dividerAfterHeader.setVisibility(8);
                this.availCalendarSection.setVisibility(0);
                displayAvailCalendarInformation(payload.getBlockoutNotificationTitle().mo68585or((Optional<String>) getString(C11971R.string.avail_calendar_title)), payload.getBlockoutNotificationDescription().mo68585or((Optional<String>) getString(C11971R.string.avail_calendar_description)), payload.getBlockoutNotificationButtonText().mo68585or((Optional<String>) getString(C11971R.string.avail_calendar_link_text)), payload.getBlockoutNotificationUrl().mo68585or((Optional<String>) TicketSalesConstants.RESERVATION_AVAIL_CALENDAR_URL_FOR_TICKETS));
            }
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseSelectionVASFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    @Subscribe
    public void onFragmentDataCompletedEvent(TicketSalesFragmentDataEvent ticketSalesFragmentDataEvent) {
        super.onFragmentDataCompletedEvent(ticketSalesFragmentDataEvent);
    }

    @Subscribe
    public void onHeroImageEvent(TicketSalesHeroImageEvent ticketSalesHeroImageEvent) {
        this.crashHelper.trackTimedActionEnd("LoadTimeCommerce", "HeroImages");
        if (this.heroImageLoaded) {
            return;
        }
        retrieveAndDisplayHeaderImage(ticketSalesHeroImageEvent.getPayload());
        this.heroImageLoaded = true;
    }

    @Subscribe
    public void onLoginEvent(ProfileManager.LoginDataEvent loginDataEvent) throws ParseException {
        if (loginDataEvent.isSuccess()) {
            processNextLoadingStep();
            if (this.residentOfferManager.isResidentOffersEnabled()) {
                this.offerSelectorUiHelper.initialize();
                restoreGuestSelection();
            }
            this.cmsTicketSalesManager.fetchCMSContent(CMSTicketSalesManagerImpl.TICKETS_CATEGORY);
            this.universalCheckoutDataManager.setJwt(null);
            this.universalCheckoutDataManager.fetchJwtToken();
        }
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.ui.OfferSelectionUiHelper.OfferSelectionListener
    public void onOfferRadioButtonsUpdate(String str) throws Resources.NotFoundException {
        ((LinearLayout) this.selectTicketSelectionHeaderLayout.findViewById(C11971R.id.days_view_group)).removeAllViews();
        clearTieredDaySelections();
        ResidentOffersAnalyticsUtils.sendAnalyticsPickAnOffer(this.analyticsHelper, this.productCategoryDetails.getProductCategoryType().getAnalyticsLinkCategory(), str);
        updateUI();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() throws ParseException {
        super.onResume();
        if (this.residentOfferManager.isResidentOffersEnabled()) {
            this.offerSelectorUiHelper.initialize();
            restoreGuestSelection();
        }
        this.cmsTicketSalesManager.fetchCMSContent(CMSTicketSalesManagerImpl.TICKETS_CATEGORY);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.offerSelectorUiHelper = new OfferSelectionUiHelper(this.residentOfferManager, (LinearLayout) view.findViewById(C11971R.id.ts_offer_selection), this);
        if (this.residentOfferManager.isResidentOffersEnabled()) {
            this.heroImageLoaded = false;
            getFragmentDataManager().loadTicketSalesHeroImageUrlEvent();
        }
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.ui.OfferSelectionUiHelper.OfferSelectionListener
    public void onViewDetailClicked(final String str) {
        int iIndexOf;
        ArrayList arrayListM69268i = Lists.m69268i();
        SpannableString spannableString = new SpannableString(Html.fromHtml(this.residentOfferManager.getOfferById(str).getOfferDetails()));
        if (this.residentOfferManager.isResidentOffersEnabled()) {
            ResidentOfferManager residentOfferManager = this.residentOfferManager;
            if (residentOfferManager.areThereBlockOutDates(residentOfferManager.getOfferById(str)) && (iIndexOf = spannableString.toString().toLowerCase().indexOf(BLOCK_OUT_DATES_STRING)) != -1) {
                spannableString.setSpan(new BLockOutDatesCTAClickableSpan(getContext(), new BLockOutDatesCTAClickableSpan.BLockOutDatesCTAClickableSpanListener() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.c
                    @Override // com.disney.wdpro.base_sales_ui_lib.ui.BLockOutDatesCTAClickableSpan.BLockOutDatesCTAClickableSpanListener
                    public final void onBlockOutDatesCTAClick(View view) {
                        this.f32772a.lambda$onViewDetailClicked$2(str, view);
                    }
                }), iIndexOf, iIndexOf + 14, 33);
            }
        }
        arrayListM69268i.add(new SpannableAboutElement(null, spannableString));
        ResidentOffersAnalyticsUtils.sendAnalyticsViewOfferDetails(this.analyticsHelper, this.productCategoryDetails.getProductCategoryType().getAnalyticsLinkCategory());
        this.actionListener.showSpannableAboutFragment(arrayListM69268i, getString(C11971R.string.offer_details), str, this.residentOfferManager.getUserAffiliationForAnalytics(), getWebStoreId());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void restoreGuestSelection() throws ParseException {
        TicketDay ticketDayCreateEmptyDay = (TicketDay) SharedPreferenceUtility.getObject(getActivity(), KEY_SELECTED_DAY_COUNT, (String) null, TicketDay.class);
        if (ticketDayCreateEmptyDay == null) {
            ticketDayCreateEmptyDay = createEmptyDay();
        }
        this.selectedDayCount = ticketDayCreateEmptyDay;
        this.isTodayChecked = SharedPreferenceUtility.getBoolean(getActivity(), KEY_CHECKED_STATE_TODAY_BUTTON, false);
        this.isPickDateChecked = SharedPreferenceUtility.getBoolean(getActivity(), KEY_CHECKED_STATE_PICK_DATE_BUTTON, false);
        String string = SharedPreferenceUtility.getString(getActivity(), KEY_SELECTED_DATE_TIME_ZONE, null);
        TimeZone timeZone = !C22466q.m68722b(string) ? TimeZone.getTimeZone(string) : TimeZone.getDefault();
        this.selectedDate = null;
        if (this.isTodayChecked) {
            this.selectedDate = getCurrentDateAtThePark(timeZone).orNull();
        } else {
            restoreSelectedCalendarDate();
        }
        this.residentOfferManager.setSelectedDate(this.selectedDate);
        this.selectedTier = null;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void saveGuestDaySelection() throws IOException {
        SharedPreferenceUtility.putObject(getActivity(), KEY_SELECTED_DAY_COUNT, this.selectedDayCount, TicketDay.class);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void saveGuestSelection() throws IOException {
        SharedPreferenceUtility.putObject(getActivity(), KEY_SELECTED_DAY_COUNT, this.selectedDayCount, TicketDay.class);
        SharedPreferenceUtility.putBoolean(getActivity(), KEY_CHECKED_STATE_TODAY_BUTTON, this.btnToday.isChecked());
        SharedPreferenceUtility.putBoolean(getActivity(), KEY_CHECKED_STATE_PICK_DATE_BUTTON, this.btnPickDate.isChecked());
        if (this.btnPickDate.isChecked()) {
            saveSelectedCalendarDate();
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void sendAnalyticCardCheckout(String str, SelectedTicketProducts selectedTicketProducts) {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("&&products", TicketSalesAnalyticsUtil.getAnalyticsProductString(selectedTicketProducts));
        defaultContext.put("link.category", TicketSalesAnalyticsUtil.getAnalyticsLinkCategory(selectedTicketProducts));
        defaultContext.put(TicketSalesAnalyticsConstants.TICKET_SALES_KEY_TICKET_DAYS, String.valueOf(this.selectedDayCount.getNumDay()));
        defaultContext.put("store", "Consumer");
        defaultContext.put("cardtype", str);
        defaultContext.put("cartopen", "1");
        defaultContext.put("cartadd", "1");
        defaultContext.put("checkout", "1");
        if (this.selectedDayCount.isTieredDay().booleanValue()) {
            defaultContext.put("cal.date", getDateFormat(this.selectedDate.getTimeZone(), Locale.US).format(this.selectedDate.getTime()));
            Calendar calendar = this.selectedDate;
            defaultContext.put("cal.window", String.valueOf(DateUtils.subtractDays(calendar, Calendar.getInstance(calendar.getTimeZone()))));
            defaultContext.put("ticket.tier", this.selectedTier);
        }
        this.ticketSalesAnalyticsHelper.trackAction(TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_CHECKOUT, defaultContext);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void sendAnalyticsTrackState() {
        String analyticsDefaultProductString = TicketSalesAnalyticsUtil.getAnalyticsDefaultProductString(this.partyMixActions.getParties().getTotalNumberOfTickets());
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("&&products", analyticsDefaultProductString);
        defaultContext.put("store", "Consumer");
        defaultContext.put("affiliation", this.residentOfferManager.getUserAffiliationForAnalytics());
        defaultContext.put("offer", this.residentOfferManager.getResidentOffersForAnalytics());
        if (this.vendomatic.m38811z1()) {
            defaultContext.put("chat.option", "1");
        }
        this.ticketSalesAnalyticsHelper.trackStateWithSTEM(TicketSalesAnalyticsConstants.TICKET_SALES_STATE_SELECTION, getClass().getSimpleName(), defaultContext);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void setupDateOptionsSelection() {
        this.btnToday.setChecked(this.isTodayChecked);
        this.btnPickDate.setChecked(this.isPickDateChecked);
        this.dateOptionsRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment.15
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(RadioGroup radioGroup, int i10) throws Resources.NotFoundException, ParseException {
                if (GeneralTicketSalesFragment.this.btnToday.isChecked() && GeneralTicketSalesFragment.this.btnToday.getVisibility() == 0 && !GeneralTicketSalesFragment.this.animationControls.isAnimationInProgress()) {
                    GeneralTicketSalesFragment.this.updateTodayTicketSelection();
                    GeneralTicketSalesFragment.this.sendAnalyticsToday();
                } else if (GeneralTicketSalesFragment.this.btnPickDate.isChecked() && !GeneralTicketSalesFragment.this.animationControls.isAnimationInProgress()) {
                    GeneralTicketSalesFragment.this.restoreSelectedCalendarDate();
                    GeneralTicketSalesFragment.this.viewIdForScroll = C11971R.id.divider_after_fragment_ticket_sales_days_selector;
                    GeneralTicketSalesFragment.this.updateUI();
                    GeneralTicketSalesFragment.this.sendAnalyticsPickADate();
                    GeneralTicketSalesFragment.this.isPickDateChecked = true;
                }
                ((BaseSelectionFragment) GeneralTicketSalesFragment.this).residentOfferManager.setSelectedDate(GeneralTicketSalesFragment.this.selectedDate);
            }
        });
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void trackReportServiceError(String str, String str2, TicketSalesFragmentDataEvent ticketSalesFragmentDataEvent) {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("failed.service", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_ERROR_ON_LOAD_TICKETS_DATA);
        TicketSalesAnalyticsUtil.addEventDataToContext(defaultContext, ticketSalesFragmentDataEvent);
        defaultContext.put("alert.title", str);
        defaultContext.put("alert.message", str2);
        this.ticketSalesAnalyticsHelper.trackAction(AnalyticsConstants.ACTION_SERVICE_ERROR, defaultContext);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment
    protected void updateUI() throws Resources.NotFoundException {
        if (isVisible()) {
            if (this.residentOfferManager.isResidentOffersEnabled()) {
                this.headerBelowImage.setVisibility(0);
                this.offerSelectorUiHelper.createResidentOffersRadioButtons();
                if (this.residentOfferManager.isUserAuthenticated()) {
                    this.authenticationCTA.setVisibility(8);
                } else {
                    this.authenticationCTA.setVisibility(0);
                }
            }
            createDaysSelection();
            updatePartyMixView();
            displayCalendarIfNeeded();
        }
    }

    private SimpleDateFormat getDateFormat(TimeZone timeZone, Locale locale) {
        return new C9350r(timeZone, locale).m39105x();
    }
}