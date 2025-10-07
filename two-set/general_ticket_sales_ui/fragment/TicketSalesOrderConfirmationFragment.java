package com.disney.wdpro.general_ticket_sales_ui.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.disney.wdpro.general_ticket_sales_ui.product.manager.OrderConfirmationCalendarResourceBundle;
import com.disney.wdpro.support.calendar.AbstractC20589a;
import com.disney.wdpro.support.calendar.DisneyCalendarView;
import com.disney.wdpro.support.calendar.configurations.C20592a;
import com.disney.wdpro.ticket_sales_base_lib.business.calendar.TieredTicketsCalendar;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.VisitDayName;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_booking_lib.business.calendar.Name;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.PurchaseConfirmation;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.TicketOrderResponse;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment;
import com.google.common.base.InterfaceC22455f;
import com.google.common.collect.C22747g2;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p1117yn.C33668c;
import p1117yn.C33670e;

/* loaded from: classes28.dex */
public abstract class TicketSalesOrderConfirmationFragment extends BaseConfirmationManagerFragment {
    private static final String SAVE_SESSION_ID = "SAVE_SESSION_ID";
    private static final String SAVE_SHOW_PARTY_FILTER_SCREEN = "SAVE_SHOW_PARTY_FILTER_SCREEN";
    protected TicketSalesOrderConfirmationFragmentActions actionListener;
    protected boolean buyMoreTickets;
    protected String sessionId;

    protected static class TicketSalesOrderConfirmationArgumentBuilder extends BaseConfirmationFragment.ArgumentBuilder {
        private boolean buyMoreTickets;
        private String sessionId;

        protected TicketSalesOrderConfirmationArgumentBuilder() {
        }

        public static TicketSalesOrderConfirmationArgumentBuilder createInstance() {
            return new TicketSalesOrderConfirmationArgumentBuilder();
        }

        @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment.ArgumentBuilder
        public Bundle build() {
            Bundle bundleBuild = super.build();
            bundleBuild.putBoolean(TicketSalesOrderConfirmationFragment.SAVE_SHOW_PARTY_FILTER_SCREEN, this.buyMoreTickets);
            bundleBuild.putString(TicketSalesOrderConfirmationFragment.SAVE_SESSION_ID, this.sessionId);
            return bundleBuild;
        }

        public TicketSalesOrderConfirmationArgumentBuilder withBuyMoreTickets(boolean z10) {
            this.buyMoreTickets = z10;
            return this;
        }

        public TicketSalesOrderConfirmationArgumentBuilder withSessionId(String str) {
            this.sessionId = str;
            return this;
        }
    }

    public interface TicketSalesOrderConfirmationFragmentActions extends BaseConfirmationFragment.BaseOrderConfirmationActions {
        void onBuyMoreTickets(String str);
    }

    private void addRangeByCategory(TieredTicketsCalendar.TieredTicketDate tieredTicketDate, TieredTicketsCalendar.TieredTicketDate tieredTicketDate2, List<C33670e> list, List<C33670e> list2) {
        if (tieredTicketDate.getCalendarName().get().getId().equals(VisitDayName.GOOD_TO_GO.getId())) {
            list.add(new C33670e(tieredTicketDate.getDate(), tieredTicketDate2.getDate()));
        } else if (tieredTicketDate.getCalendarName().get().getId().equals(VisitDayName.BLOCKED_OUT.getId())) {
            list2.add(new C33670e(tieredTicketDate.getDate(), tieredTicketDate2.getDate()));
        }
    }

    private AbstractC20589a calendarCategoryAdapter(final Map<VisitDayName, OrderConfirmationCalendarResourceBundle> map, final List<C33670e> list, final List<C33670e> list2) {
        return new AbstractC20589a() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment.2
            @Override // com.disney.wdpro.support.calendar.AbstractC20589a
            public List<C33670e> getDateRangeListForCategory(C33668c c33668c) {
                TicketSalesOrderConfirmationFragment ticketSalesOrderConfirmationFragment = TicketSalesOrderConfirmationFragment.this;
                Map map2 = map;
                VisitDayName visitDayName = VisitDayName.GOOD_TO_GO;
                if (ticketSalesOrderConfirmationFragment.hasTextName(map2, visitDayName) && ((OrderConfirmationCalendarResourceBundle) map.get(visitDayName)).getNameText().get().equals(c33668c.m101642d())) {
                    return list;
                }
                TicketSalesOrderConfirmationFragment ticketSalesOrderConfirmationFragment2 = TicketSalesOrderConfirmationFragment.this;
                Map map3 = map;
                VisitDayName visitDayName2 = VisitDayName.BLOCKED_OUT;
                return (ticketSalesOrderConfirmationFragment2.hasTextName(map3, visitDayName2) && ((OrderConfirmationCalendarResourceBundle) map.get(visitDayName2)).getNameText().get().equals(c33668c.m101642d())) ? list2 : new ArrayList();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC20589a getCalendarCategoryAdapter(TieredTicketsCalendar tieredTicketsCalendar, Map<VisitDayName, OrderConfirmationCalendarResourceBundle> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Map.Entry<Calendar, TieredTicketsCalendar.TieredTicketDate>> it = tieredTicketsCalendar.getDateToTicketTierNameMap().entrySet().iterator();
        if (it.hasNext()) {
            TieredTicketsCalendar.TieredTicketDate value = it.next().getValue();
            TieredTicketsCalendar.TieredTicketDate value2 = value;
            String id2 = value.getCalendarName().get().getId();
            TieredTicketsCalendar.TieredTicketDate tieredTicketDate = value2;
            while (it.hasNext()) {
                if (!id2.equals(value.getCalendarName().get().getId())) {
                    addRangeByCategory(value, tieredTicketDate, arrayList, arrayList2);
                    value = value2;
                    tieredTicketDate = value;
                } else if (tieredTicketDate.getCalendarName().get().getId().equals(id2)) {
                    tieredTicketDate = value2;
                }
                value2 = it.next().getValue();
                id2 = value2.getCalendarName().get().getId();
                if (!it.hasNext()) {
                    addRangeByCategory(value, tieredTicketDate, arrayList, arrayList2);
                    addRangeByCategory(value2, value2, arrayList, arrayList2);
                }
            }
        }
        return calendarCategoryAdapter(map, arrayList, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<VisitDayName, OrderConfirmationCalendarResourceBundle> getDayLegends(PurchaseConfirmation purchaseConfirmation) {
        LinkedHashMap linkedHashMapM69385v = Maps.m69385v();
        if (purchaseConfirmation.getCalendarNamesMap().isPresent()) {
            for (Map.Entry<VisitDayName, Name> entry : purchaseConfirmation.getCalendarNamesMap().get().entrySet()) {
                linkedHashMapM69385v.put(entry.getKey(), new OrderConfirmationCalendarResourceBundle(entry.getKey(), entry.getValue().getText().mo68583or(entry.getValue().getHtml()).orNull()));
            }
        }
        return linkedHashMapM69385v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasTextName(Map<VisitDayName, OrderConfirmationCalendarResourceBundle> map, VisitDayName visitDayName) {
        return map.get(visitDayName).getNameText().isPresent();
    }

    protected Iterable<Pair<TicketOrderResponse.OrderItem, DisneyCalendarView>> createCollectionOfCalendarViews(final PurchaseConfirmation purchaseConfirmation) {
        return C22747g2.m69554v(purchaseConfirmation.getOrderItems(), new InterfaceC22455f<TicketOrderResponse.OrderItem, Pair<TicketOrderResponse.OrderItem, DisneyCalendarView>>() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment.1
            @Override // com.google.common.base.InterfaceC22455f
            public Pair<TicketOrderResponse.OrderItem, DisneyCalendarView> apply(TicketOrderResponse.OrderItem orderItem) {
                String strOrNull = orderItem.getCalendarId().orNull();
                if (!purchaseConfirmation.getTieredTicketCalendarMap().isPresent()) {
                    return Pair.create(orderItem, null);
                }
                TieredTicketsCalendar tieredTicketsCalendar = purchaseConfirmation.getTieredTicketCalendarMap().get().get(strOrNull);
                if (tieredTicketsCalendar == null) {
                    return Pair.create(orderItem, null);
                }
                Map dayLegends = TicketSalesOrderConfirmationFragment.this.getDayLegends(purchaseConfirmation);
                DisneyCalendarView disneyCalendarView = new DisneyCalendarView(TicketSalesOrderConfirmationFragment.this.getActivity(), null);
                disneyCalendarView.configure(new C20592a.a().m62203h(new C33668c.a().m101654j(((OrderConfirmationCalendarResourceBundle) dayLegends.get(VisitDayName.GOOD_TO_GO)).getNameText().get()).m101653i()).m62202g(new C33668c.a().m101654j(((OrderConfirmationCalendarResourceBundle) dayLegends.get(VisitDayName.BLOCKED_OUT)).getNameText().get()).m101653i()).m62214b(TicketSalesOrderConfirmationFragment.this.getLastDate(tieredTicketsCalendar.getDateToTicketTierNameMap())).m62217e(tieredTicketsCalendar.getTimeZone()).m62213a(TicketSalesOrderConfirmationFragment.this.getCalendarCategoryAdapter(tieredTicketsCalendar, dayLegends)).m62201f());
                disneyCalendarView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                disneyCalendarView.setVisibility(0);
                return Pair.create(orderItem, disneyCalendarView);
            }
        });
    }

    public Calendar getLastDate(Map<Calendar, TieredTicketsCalendar.TieredTicketDate> map) {
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

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected BaseConfirmationManagerFragment.OrderPlacedUiHelper getOrderPlacedHelper() {
        return new BaseConfirmationManagerFragment.OrderPlacedUiHelper() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment.3
            @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment.OrderPlacedUiHelper
            public void updateOrderPlacedUi(PurchaseConfirmation purchaseConfirmation) {
                if (purchaseConfirmation.getOrderStatus() == BookingStatus.BOOKED) {
                    TicketSalesOrderConfirmationFragment ticketSalesOrderConfirmationFragment = TicketSalesOrderConfirmationFragment.this;
                    ticketSalesOrderConfirmationFragment.updateOrderPlacedUiWithText(ticketSalesOrderConfirmationFragment.getString(C11971R.string.ticket_sales_order_confirmation_placed_header), TicketSalesOrderConfirmationFragment.this.getString(C11971R.string.ticket_sales_order_confirmation_placed_text, purchaseConfirmation.getConfirmationEmail()));
                } else if (((SalesBaseFragment) TicketSalesOrderConfirmationFragment.this).productCategoryDetails.getProductCategoryType() == ProductCategoryType.MAX_PASS) {
                    TicketSalesOrderConfirmationFragment ticketSalesOrderConfirmationFragment2 = TicketSalesOrderConfirmationFragment.this;
                    ticketSalesOrderConfirmationFragment2.updateOrderPlacedUiWithText(ticketSalesOrderConfirmationFragment2.getString(C11971R.string.ticket_sales_fast_pass_order_confirmation_pending_header), TicketSalesOrderConfirmationFragment.this.getString(C11971R.string.ticket_sales_fast_pass_order_confirmation_pending_text));
                } else {
                    TicketSalesOrderConfirmationFragment ticketSalesOrderConfirmationFragment3 = TicketSalesOrderConfirmationFragment.this;
                    ticketSalesOrderConfirmationFragment3.updateOrderPlacedUiWithText(ticketSalesOrderConfirmationFragment3.getString(C11971R.string.ticket_sales_order_confirmation_pending_header), TicketSalesOrderConfirmationFragment.this.getString(C11971R.string.ticket_sales_order_confirmation_pending_text));
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.actionListener = (TicketSalesOrderConfirmationFragmentActions) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement TicketSalesOrderConfirmationFragmentActions");
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (bundle != null) {
            this.buyMoreTickets = bundle.getBoolean(SAVE_SHOW_PARTY_FILTER_SCREEN);
            this.sessionId = bundle.getString(SAVE_SESSION_ID);
        } else {
            this.buyMoreTickets = arguments.getBoolean(SAVE_SHOW_PARTY_FILTER_SCREEN);
            this.sessionId = arguments.getString(SAVE_SESSION_ID);
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(SAVE_SESSION_ID, this.sessionId);
        bundle.putBoolean(SAVE_SHOW_PARTY_FILTER_SCREEN, this.buyMoreTickets);
    }

    protected abstract void renderCalendars(PurchaseConfirmation purchaseConfirmation);

    protected abstract void renderParkSpecificUi(PurchaseConfirmation purchaseConfirmation);

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected final void renderRemainingUi(PurchaseConfirmation purchaseConfirmation) {
        if (purchaseConfirmation.getOrderStatus() == BookingStatus.BOOKED) {
            renderCalendars(purchaseConfirmation);
        }
        renderParkSpecificUi(purchaseConfirmation);
    }

    protected abstract void updateOrderPlacedUiWithText(String str, String str2);
}