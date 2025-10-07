package com.disney.wdpro.general_ticket_sales_ui.activities;

import android.view.View;
import android.widget.TextView;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.Parties;
import com.disney.wdpro.base_sales_ui_lib.manager.ResidentOfferManager;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesOrderSummaryFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment;
import com.disney.wdpro.general_ticket_sales_ui.fragment.WDWTicketSalesOrderConfirmationFragment;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.AboutElement;
import com.disney.wdpro.ticket_sales_base_lib.business.host_app.GuestGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AddOnOption;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductParameters;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductType;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes28.dex */
public class WDWTicketSalesActivity extends GeneralTicketSalesActivity {
    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public List<AboutElement> getAboutTierTicketsContent(String str) {
        return Lists.m69271l(new AboutElement(null, getString(C11971R.string.wdw_ticket_sales_about_header)), new AboutElement(getString(C11971R.string.ticket_sales_for_peak_title), getString(C11971R.string.wdw_ticket_sales_for_peak_content)), new AboutElement(getString(C11971R.string.ticket_sales_for_regular_title), getString(C11971R.string.wdw_ticket_sales_for_regular_content)), new AboutElement(getString(C11971R.string.ticket_sales_for_value_title), getString(C11971R.string.wdw_ticket_sales_for_value_content)), new AboutElement(null, getString(C11971R.string.wdw_ticket_sales_about_sub_footer, str)), new AboutElement(getString(C11971R.string.ticket_sales_about_multi_day_title), getString(C11971R.string.wdw_ticket_sales_about_multi_day_content)));
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public int getDaySelectorPricePerDayContentDescriptionStringId() {
        return C11971R.string.ticket_sales_cd_per_day;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public int getDaySelectorPricePerDayStringId() {
        return C11971R.string.wdw_ticket_sales_per_day;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public int getDaySelectorPricePerDayStringIdForChild() {
        return C11971R.string.wdw_ticket_sales_per_day_child;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected GuestGroup getGuestGroup() {
        return GuestGroup.WDW;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public int getLegendPricePerDayStringId() {
        return C11971R.string.wdw_ticket_sales_price_per_ticket_note;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public int getOneDayVaryNoteStringId() {
        return C11971R.string.wdw_ticket_sales_one_day_note;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    public BaseConfirmationFragment getOrderConfirmationFragment(SelectedTicketProducts selectedTicketProducts, Long l10) {
        return WDWTicketSalesOrderConfirmationFragment.newInstance(selectedTicketProducts, l10);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected Set<TicketProductType.ProductId> getProductIds(ProductCategoryType productCategoryType) {
        HashSet hashSetM69460g = Sets.m69460g();
        if (productCategoryType == ProductCategoryType.THEME_PARK_GENERAL_ADMISSIONS) {
            hashSetM69460g.add(TicketProductType.ProductId.WDW_MAGIC_KINGDOM_SINGLE_DAY);
            hashSetM69460g.add(TicketProductType.ProductId.WDW_MAGIC_KINGDOM_SINGLE_DAY_VALUE);
            hashSetM69460g.add(TicketProductType.ProductId.WDW_MAGIC_KINGDOM_SINGLE_DAY_REGULAR);
            hashSetM69460g.add(TicketProductType.ProductId.WDW_MAGIC_KINGDOM_SINGLE_DAY_PEAK);
            hashSetM69460g.add(TicketProductType.ProductId.WDW_NON_MAGIC_KINGDOM_SINGLE_DAY);
            hashSetM69460g.add(TicketProductType.ProductId.WDW_NON_MAGIC_KINGDOM_SINGLE_DAY_VALUE);
            hashSetM69460g.add(TicketProductType.ProductId.WDW_NON_MAGIC_KINGDOM_SINGLE_DAY_REGULAR);
            hashSetM69460g.add(TicketProductType.ProductId.WDW_NON_MAGIC_KINGDOM_SINGLE_DAY_PEAK);
            hashSetM69460g.add(TicketProductType.ProductId.WDW_ALL_THEME_PARKS_MULTI_DAY);
            hashSetM69460g.add(TicketProductType.ProductId.WDW_ALL_THEME_PARKS_MULTI_DAY_VALUE);
            hashSetM69460g.add(TicketProductType.ProductId.WDW_ALL_THEME_PARKS_MULTI_DAY_REGULAR);
            hashSetM69460g.add(TicketProductType.ProductId.WDW_ALL_THEME_PARKS_MULTI_DAY_PEAK);
        }
        return hashSetM69460g;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public TicketProductParameters getTicketProductParameterForPricePerDay(int i10, String str, String str2) {
        return TicketProductParameters.builder().setTicketProductType(i10 == 1 ? new TicketProductType(TicketProductType.ProductId.WDW_NON_MAGIC_KINGDOM_SINGLE_DAY_VALUE.getId()) : new TicketProductType(TicketProductType.ProductId.WDW_ALL_THEME_PARKS_MULTI_DAY.getId())).setNumberOfDays(i10).setTier(str).setDiscountGroupType(this.ticketSalesParams.getDiscountGroupType()).build();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesActions
    public ImmutableList<TicketProductParameters> getTicketProducts(int i10, Parties parties, String str, ResidentOfferManager residentOfferManager, Set<String> set) {
        int i11 = 0;
        TicketProductType.ProductId[] productIdArr = i10 == 1 ? new TicketProductType.ProductId[]{TicketProductType.ProductId.WDW_MAGIC_KINGDOM_SINGLE_DAY, TicketProductType.ProductId.WDW_MAGIC_KINGDOM_SINGLE_DAY_VALUE, TicketProductType.ProductId.WDW_MAGIC_KINGDOM_SINGLE_DAY_REGULAR, TicketProductType.ProductId.WDW_MAGIC_KINGDOM_SINGLE_DAY_PEAK, TicketProductType.ProductId.WDW_NON_MAGIC_KINGDOM_SINGLE_DAY, TicketProductType.ProductId.WDW_NON_MAGIC_KINGDOM_SINGLE_DAY_VALUE, TicketProductType.ProductId.WDW_NON_MAGIC_KINGDOM_SINGLE_DAY_REGULAR, TicketProductType.ProductId.WDW_NON_MAGIC_KINGDOM_SINGLE_DAY_PEAK} : new TicketProductType.ProductId[]{TicketProductType.ProductId.WDW_ALL_THEME_PARKS_MULTI_DAY, TicketProductType.ProductId.WDW_ALL_THEME_PARKS_MULTI_DAY_VALUE, TicketProductType.ProductId.WDW_ALL_THEME_PARKS_MULTI_DAY_REGULAR, TicketProductType.ProductId.WDW_ALL_THEME_PARKS_MULTI_DAY_PEAK};
        ImmutableList.C22583a c22583aBuilder = ImmutableList.builder();
        for (TicketProductType.ProductId productId : productIdArr) {
            c22583aBuilder.mo69026a(getTicketParams(i10, parties, new TicketProductType(productId.getId()), str, new HashSet()));
        }
        TicketProductType.ProductId[] productIdArr2 = {TicketProductType.ProductId.WDW_ALL_THEME_PARKS_MULTI_DAY, TicketProductType.ProductId.WDW_ALL_THEME_PARKS_MULTI_DAY_VALUE, TicketProductType.ProductId.WDW_ALL_THEME_PARKS_MULTI_DAY_REGULAR, TicketProductType.ProductId.WDW_ALL_THEME_PARKS_MULTI_DAY_PEAK};
        HashSet hashSet = new HashSet();
        hashSet.add(AddOnOption.PARK_HOPPER);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(AddOnOption.PARK_HOPPER_PLUS);
        while (i11 < 4) {
            TicketProductType.ProductId productId2 = productIdArr2[i11];
            HashSet hashSet3 = hashSet;
            c22583aBuilder.mo69026a(getTicketParams(i10, parties, new TicketProductType(productId2.getId()), str, hashSet));
            HashSet hashSet4 = hashSet2;
            c22583aBuilder.mo69026a(getTicketParams(i10, parties, new TicketProductType(productId2.getId()), str, hashSet4));
            i11++;
            hashSet2 = hashSet4;
            hashSet = hashSet3;
        }
        return c22583aBuilder.m69053m();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected final boolean isInOrderSummaryScreen() {
        return getSupportFragmentManager().m19755o0(GeneralTicketSalesOrderSummaryFragment.class.getSimpleName()) != null;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity, com.disney.wdpro.base_sales_ui_lib.fragments.CommonFragmentActions
    public void setTitle(CharSequence charSequence, View view) {
        TextView textView = (TextView) view.findViewById(C11971R.id.txt_screen_name);
        if (getActionBar() == null) {
            super.setTitle(charSequence, view);
            return;
        }
        setTitle(charSequence);
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.activities.SalesActivity
    protected boolean shouldBackPressResultInResetFlow() {
        return getSupportFragmentManager().m19755o0(WDWTicketSalesOrderConfirmationFragment.class.getSimpleName()) != null;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.PartyFilterFragment.PartyFilterFragmentActions
    public void showFastPassAvailabilityList() {
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.activities.GeneralTicketSalesActivity
    public TicketSalesOrderConfirmationFragment getOrderConfirmationFragment(SelectedTicketProducts selectedTicketProducts, Long l10, boolean z10, String str) {
        throw new UnsupportedOperationException("Functionality not supported.");
    }
}