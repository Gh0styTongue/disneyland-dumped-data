package com.disney.wdpro.ticket_sales_managers;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.base_sales_ui_lib.manager.TicketSalesFragmentDataEvent;
import com.disney.wdpro.base_sales_ui_lib.manager.TicketSalesHeroImageEvent;
import com.disney.wdpro.base_sales_ui_lib.product.manager.TicketSelectionCalendarLegend;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesFragmentDataRequestParameters;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.calendar.TieredTicketCalendarMap;
import com.disney.wdpro.ticket_sales_base_lib.business.calendar.TieredTicketsCalendar;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DiscountGroupType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.HeroImageResponse;
import com.disney.wdpro.ticket_sales_base_lib.business.product.OfferDto;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PricePerDay;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductAffiliationDto;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductParameters;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.TicketTierName;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.TicketTierNameDescription;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.ProductAssemblerApiClient;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketDay;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketProductServiceResponse;
import com.google.common.base.C22462m;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;

/* loaded from: classes19.dex */
public class TicketSalesFragmentDataManagerImpl implements TicketSalesFragmentDataManager {
    private static final Set<Integer> DAYS_WITH_TIERED_TICKETS = ImmutableSet.m69130of(1);
    private final InterfaceC8682n crashHelper;
    private HeroImageResponse heroImageResponse;
    private final ProductAssemblerApiClient productAssemblerApiClient;
    private final ResidentOffersDataFactory residentOffersDataFactory;
    private final C9248i vendomatic;

    @Inject
    public TicketSalesFragmentDataManagerImpl(ProductAssemblerApiClient productAssemblerApiClient, InterfaceC8682n interfaceC8682n, C9248i c9248i, ResidentOffersDataFactory residentOffersDataFactory) {
        this.productAssemblerApiClient = productAssemblerApiClient;
        this.crashHelper = interfaceC8682n;
        this.vendomatic = c9248i;
        this.residentOffersDataFactory = residentOffersDataFactory;
    }

    /* renamed from: a */
    public static /* synthetic */ int m64385a(Map.Entry entry, Map.Entry entry2) {
        return ((TicketTierNameDescription) entry.getValue()).getPriority() - ((TicketTierNameDescription) entry2.getValue()).getPriority();
    }

    private String getHeroImageUrl(HeroImageResponse heroImageResponse) {
        return heroImageResponse.getMdpi().isPresent() ? heroImageResponse.getMdpi().get() : heroImageResponse.getHdpi().isPresent() ? heroImageResponse.getHdpi().get() : heroImageResponse.getXhdpi().isPresent() ? heroImageResponse.getXhdpi().get() : heroImageResponse.getXxhdpi().isPresent() ? heroImageResponse.getXxhdpi().get() : heroImageResponse.getXxxhdpi().isPresent() ? heroImageResponse.getXxxhdpi().get() : "";
    }

    private TicketProductServiceResponse getTicketProducts(TicketSalesFragmentDataRequestParameters ticketSalesFragmentDataRequestParameters) throws IOException {
        ProductCategoryDetails productCategory = ticketSalesFragmentDataRequestParameters.getProductCategory();
        WebStoreId webStoreId = ticketSalesFragmentDataRequestParameters.getWebStoreId();
        return new TicketProductServiceResponseImpl(this.productAssemblerApiClient.getTicketProducts(productCategory.getProductCategoryType(), ticketSalesFragmentDataRequestParameters.getDestinationId(), webStoreId, ticketSalesFragmentDataRequestParameters.getAffiliationType(), ticketSalesFragmentDataRequestParameters.getSessionId(), ticketSalesFragmentDataRequestParameters.getSellableOnDate(), this.vendomatic.m38675C0(), this.vendomatic.m38788r1()));
    }

    private Optional<SelectedTicketProducts> validateSelectedProducts(SelectedTicketProducts selectedTicketProducts, TicketProductParameters ticketProductParameters) {
        boolean z10 = true;
        boolean z11 = ticketProductParameters.getNumAdultTickets() <= 0 || selectedTicketProducts.getAdultProductInstanceId().isPresent();
        boolean z12 = ticketProductParameters.getNumChildTickets() <= 0 || selectedTicketProducts.getChildProductInstanceId().isPresent();
        if (ticketProductParameters.getNumAllAgesTickets() > 0 && !selectedTicketProducts.getAllAgesProductInstanceId().isPresent()) {
            z10 = false;
        }
        return (z11 && z12 && z10 && selectedTicketProducts.getCombinedTotal().isPresent()) ? Optional.m68592of(selectedTicketProducts) : Optional.absent();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager
    public List<Optional<SelectedTicketProducts>> getAllSelectedTicketProducts(TicketProductParameters ticketProductParameters, TicketProductServiceResponse ticketProductServiceResponse) {
        ArrayList arrayList = new ArrayList();
        C22462m.m68685q(ticketProductServiceResponse, "response must not be null");
        C22462m.m68685q(ticketProductParameters, "parameters must not be null");
        Iterator<SelectedTicketProducts> it = ((TicketProductServiceResponseImpl) ticketProductServiceResponse).getAllSelectedTicketProducts(ticketProductParameters).iterator();
        while (it.hasNext()) {
            arrayList.add(validateSelectedProducts(it.next(), ticketProductParameters));
        }
        return arrayList;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager
    public ImmutableMap<String, TicketTierCalendarResourceBundle> getAvailableTicketTierCalendarResources(TicketProductServiceResponse ticketProductServiceResponse, TicketDay ticketDay) {
        ImmutableMap.C22588b c22588bBuilder = ImmutableMap.builder();
        Optional<TieredTicketsCalendar> calendarForDay = getCalendarForDay(ticketProductServiceResponse, ticketDay);
        if (calendarForDay.isPresent()) {
            for (String str : calendarForDay.get().getTierNameToTierDescriptionMap().keySet()) {
                c22588bBuilder.mo69013h(str, new TicketTierCalendarResourceBundle(str));
            }
        }
        return c22588bBuilder.mo69009a();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager
    public ImmutableMap<String, TicketTierNameDescription> getAvailableTicketTierDeltaData(TicketProductServiceResponse ticketProductServiceResponse, TicketDay ticketDay) {
        C22462m.m68685q(ticketProductServiceResponse, "response must not be null");
        LinkedHashMap linkedHashMapM69385v = Maps.m69385v();
        Optional<TieredTicketsCalendar> calendarForDay = getCalendarForDay((TicketProductServiceResponseImpl) ticketProductServiceResponse, ticketDay);
        if (calendarForDay.isPresent()) {
            LinkedList<Map.Entry> linkedList = new LinkedList(calendarForDay.get().getTierNameToTierDescriptionMap().entrySet());
            Collections.sort(linkedList, new Comparator() { // from class: com.disney.wdpro.ticket_sales_managers.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return TicketSalesFragmentDataManagerImpl.m64385a((Map.Entry) obj, (Map.Entry) obj2);
                }
            });
            for (Map.Entry entry : linkedList) {
                linkedHashMapM69385v.put((String) entry.getKey(), (TicketTierNameDescription) entry.getValue());
            }
        }
        return ImmutableMap.copyOf((Map) linkedHashMapM69385v);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager
    public ImmutableMap<TicketTierName, TicketSelectionCalendarLegend> getAvailableTicketTierLegendData(TicketProductServiceResponse ticketProductServiceResponse, TicketDay ticketDay) {
        C22462m.m68685q(ticketProductServiceResponse, "response must not be null");
        LinkedHashMap linkedHashMapM69385v = Maps.m69385v();
        Optional<TieredTicketsCalendar> calendarForDay = getCalendarForDay((TicketProductServiceResponseImpl) ticketProductServiceResponse, ticketDay);
        if (calendarForDay.isPresent()) {
            Map<String, TicketTierNameDescription> tierNameToTierDescriptionMap = calendarForDay.get().getTierNameToTierDescriptionMap();
            TicketTierName ticketTierName = TicketTierName.VALUE;
            if (tierNameToTierDescriptionMap.containsKey(ticketTierName.name())) {
                TicketTierNameDescription ticketTierNameDescription = tierNameToTierDescriptionMap.get(ticketTierName.name());
                linkedHashMapM69385v.put(ticketTierName, new TicketSelectionCalendarLegend(ticketTierName, ticketTierNameDescription.getTextName().mo68583or(ticketTierNameDescription.getHtmlName()).orNull(), ticketTierNameDescription.getStartingFromPrice().orNull(), ticketTierNameDescription.getTierId().orNull(), ticketTierNameDescription.getPriority()));
            }
            TicketTierName ticketTierName2 = TicketTierName.REGULAR;
            if (tierNameToTierDescriptionMap.containsKey(ticketTierName2.name())) {
                TicketTierNameDescription ticketTierNameDescription2 = tierNameToTierDescriptionMap.get(ticketTierName2.name());
                linkedHashMapM69385v.put(ticketTierName2, new TicketSelectionCalendarLegend(ticketTierName2, ticketTierNameDescription2.getTextName().mo68583or(ticketTierNameDescription2.getHtmlName()).orNull(), ticketTierNameDescription2.getStartingFromPrice().orNull(), ticketTierNameDescription2.getTierId().orNull(), ticketTierNameDescription2.getPriority()));
            }
            TicketTierName ticketTierName3 = TicketTierName.PEAK;
            if (tierNameToTierDescriptionMap.containsKey(ticketTierName3.name())) {
                TicketTierNameDescription ticketTierNameDescription3 = tierNameToTierDescriptionMap.get(ticketTierName3.name());
                linkedHashMapM69385v.put(ticketTierName3, new TicketSelectionCalendarLegend(ticketTierName3, ticketTierNameDescription3.getTextName().mo68583or(ticketTierNameDescription3.getHtmlName()).orNull(), ticketTierNameDescription3.getStartingFromPrice().orNull(), ticketTierNameDescription3.getTierId().orNull(), ticketTierNameDescription3.getPriority()));
            }
        }
        return ImmutableMap.copyOf((Map) linkedHashMapM69385v);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager
    public Optional<TieredTicketsCalendar> getCalendarForDay(TicketProductServiceResponse ticketProductServiceResponse, TicketDay ticketDay) {
        C22462m.m68685q(ticketProductServiceResponse, "response must not be null");
        C22462m.m68685q(ticketDay, "day must not be null");
        Optional<TieredTicketCalendarMap> tieredTicketProductsCalendars = ((TicketProductServiceResponseImpl) ticketProductServiceResponse).getTieredTicketProductsCalendars();
        return (tieredTicketProductsCalendars.isPresent() && ticketDay.getCalendarId().isPresent()) ? Optional.fromNullable(tieredTicketProductsCalendars.get().get(ticketDay.getCalendarId().get())) : Optional.absent();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager
    public ImmutableList<TicketDay> getNumberOfSupportedDays(TicketProductServiceResponse ticketProductServiceResponse) {
        C22462m.m68685q(ticketProductServiceResponse, "response must not be null");
        return ((TicketProductServiceResponseImpl) ticketProductServiceResponse).getNumberOfSupportedDays();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager
    public PricePerDay getPricePerDay(TicketProductParameters ticketProductParameters, TicketProductServiceResponse ticketProductServiceResponse) {
        C22462m.m68685q(ticketProductServiceResponse, "response must not be null");
        return ((TicketProductServiceResponseImpl) ticketProductServiceResponse).getPricePerDay(ticketProductParameters);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager
    public String getProductIdByTier(TicketProductServiceResponse ticketProductServiceResponse, String str) {
        return ticketProductServiceResponse.getProductIdByTier(DiscountGroupType.STD_GST.getDiscountGroupId()).get(str);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager
    public Optional<SelectedTicketProducts> getSelectedTicketProducts(TicketProductParameters ticketProductParameters, TicketProductServiceResponse ticketProductServiceResponse) {
        C22462m.m68685q(ticketProductServiceResponse, "response must not be null");
        C22462m.m68685q(ticketProductParameters, "parameters must not be null");
        return validateSelectedProducts(((TicketProductServiceResponseImpl) ticketProductServiceResponse).getSelectedTicketProducts(ticketProductParameters), ticketProductParameters);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager
    public ImmutableMap<Integer, String> getTierNameByPriority(TicketProductServiceResponse ticketProductServiceResponse, TicketDay ticketDay) {
        ImmutableMap<String, TicketTierNameDescription> availableTicketTierDeltaData = getAvailableTicketTierDeltaData(ticketProductServiceResponse, ticketDay);
        LinkedHashMap linkedHashMapM69385v = Maps.m69385v();
        for (Map.Entry<String, TicketTierNameDescription> entry : availableTicketTierDeltaData.entrySet()) {
            int priority = entry.getValue().getPriority();
            linkedHashMapM69385v.put(Integer.valueOf(priority), entry.getValue().getTextName().get());
        }
        return ImmutableMap.copyOf((Map) linkedHashMapM69385v);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager
    public boolean isTieredDay(int i10, TicketProductServiceResponse ticketProductServiceResponse) {
        return DAYS_WITH_TIERED_TICKETS.contains(Integer.valueOf(i10));
    }

    @Override // com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager
    public boolean isTieredTicketsEnabled(TicketProductServiceResponse ticketProductServiceResponse) {
        C22462m.m68685q(ticketProductServiceResponse, "response must not be null");
        return ((TicketProductServiceResponseImpl) ticketProductServiceResponse).isTieredTicketsEnabled();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager
    public TicketSalesFragmentDataEvent loadTicketSalesFragmentData(TicketSalesFragmentDataRequestParameters ticketSalesFragmentDataRequestParameters) {
        TicketSalesFragmentDataEvent ticketSalesFragmentDataEvent = new TicketSalesFragmentDataEvent(ticketSalesFragmentDataRequestParameters.getRequestId());
        try {
            TicketProductServiceResponse ticketProducts = getTicketProducts(ticketSalesFragmentDataRequestParameters);
            ticketSalesFragmentDataEvent.setResult((TicketSalesFragmentDataEvent) ticketProducts);
            Optional<HashMap<String, OfferDto>> offers = ticketProducts.getOffers();
            Optional<HashMap<String, ProductAffiliationDto>> affiliations = ticketProducts.getAffiliations();
            if (offers.isPresent() && affiliations.isPresent()) {
                ticketSalesFragmentDataEvent.setOfferList(this.residentOffersDataFactory.buildOfferList(offers.get(), ticketProducts.getFeatureDtoMap(), affiliations.get()));
            }
            this.crashHelper.trackTimedActionEnd("LoadTimeCommerce", "ProductTypes");
            return ticketSalesFragmentDataEvent;
        } catch (Exception e10) {
            this.crashHelper.logHandledException(e10);
            ticketSalesFragmentDataEvent.setException(e10);
            return ticketSalesFragmentDataEvent;
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager
    public TicketSalesHeroImageEvent loadTicketSalesHeroImageUrlEvent() {
        TicketSalesHeroImageEvent ticketSalesHeroImageEvent = new TicketSalesHeroImageEvent();
        HeroImageResponse heroImageResponse = this.heroImageResponse;
        if (heroImageResponse != null) {
            ticketSalesHeroImageEvent.setResult((TicketSalesHeroImageEvent) getHeroImageUrl(heroImageResponse));
            return ticketSalesHeroImageEvent;
        }
        try {
            HeroImageResponse ticketSalesHeroImage = this.productAssemblerApiClient.getTicketSalesHeroImage();
            this.heroImageResponse = ticketSalesHeroImage;
            ticketSalesHeroImageEvent.setResult((TicketSalesHeroImageEvent) getHeroImageUrl(ticketSalesHeroImage));
            return ticketSalesHeroImageEvent;
        } catch (Exception e10) {
            this.crashHelper.logHandledException(e10);
            ticketSalesHeroImageEvent.setException(e10);
            return ticketSalesHeroImageEvent;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.disney.wdpro.midichlorian.CacheContextModifier
    public TicketSalesFragmentDataManager noCache() {
        throw new UnsupportedOperationException("Should be handled by proxy");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.disney.wdpro.midichlorian.CacheContextModifier
    public TicketSalesFragmentDataManager preload() {
        throw new UnsupportedOperationException("Should be handled by proxy");
    }
}