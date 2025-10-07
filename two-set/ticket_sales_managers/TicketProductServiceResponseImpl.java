package com.disney.wdpro.ticket_sales_managers;

import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.calendar.TieredTicketCalendarMap;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AgeGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNameMap;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNames;
import com.disney.wdpro.ticket_sales_base_lib.business.product.FeatureDto;
import com.disney.wdpro.ticket_sales_base_lib.business.product.OfferDto;
import com.disney.wdpro.ticket_sales_base_lib.business.product.Policy;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PricePerDay;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PricePerTicket;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductAffiliationDto;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductParameters;
import com.disney.wdpro.ticket_sales_base_lib.business.product.assemblerapi.model.ProductInstanceKey;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.ProductInstance;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketAssemblerResponse;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketDay;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketProductServiceResponse;
import com.google.common.base.C22462m;
import com.google.common.base.Optional;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes19.dex */
public class TicketProductServiceResponseImpl implements TicketProductServiceResponse {
    private static final boolean GOV_ID_REQUIRED = true;
    private final TicketAssemblerResponse rawResponse;

    public TicketProductServiceResponseImpl(TicketAssemblerResponse ticketAssemblerResponse) {
        this.rawResponse = (TicketAssemblerResponse) C22462m.m68685q(ticketAssemblerResponse, "The payload cannot be null on a success event.");
    }

    private Price addNullablePrices(Price price, Price price2) {
        if (price == null) {
            price = null;
        }
        return price2 != null ? price != null ? price.add(price2) : price2 : price;
    }

    private DisplayNames createDisplayNames(ProductInstance productInstance, ProductInstance productInstance2, ProductInstance productInstance3) {
        DisplayNames.TicketTitle ticketTitle = productInstance != null ? new DisplayNames.TicketTitle(productInstance.getDisplayNames()) : productInstance2 != null ? new DisplayNames.TicketTitle(productInstance2.getDisplayNames()) : productInstance3 != null ? new DisplayNames.TicketTitle(productInstance3.getDisplayNames()) : null;
        DisplayNames.AssignTicketAgeGroupLabels.Builder builder = new DisplayNames.AssignTicketAgeGroupLabels.Builder();
        if (productInstance != null) {
            builder.setAgeLabel(AgeGroup.ADULT, productInstance.getDisplayNames().getName(DisplayNameMap.KEY_PRODUCT_ASSIGN_TICKET_AGEGROUP_LABEL));
        }
        if (productInstance2 != null) {
            builder.setAgeLabel(AgeGroup.CHILD, productInstance2.getDisplayNames().getName(DisplayNameMap.KEY_PRODUCT_ASSIGN_TICKET_AGEGROUP_LABEL));
        }
        return new DisplayNames(ticketTitle, builder.build());
    }

    private Price.SupportedCurrency extractCurrencyCode() {
        String currencyCode = !this.rawResponse.getProductInstanceMap().isEmpty() ? this.rawResponse.getProductInstanceMap().values().iterator().next().getPricing().getCurrencyCode() : null;
        if (currencyCode == null) {
            AbstractC22726b3<TicketDay> it = this.rawResponse.getNumberOfSupportedDays().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TicketDay next = it.next();
                if (next.getStartingFromPrice().isPresent()) {
                    currencyCode = next.getStartingFromPrice().get().getCurrency().getCurrencyCode();
                    break;
                }
            }
        }
        C22462m.m68691w(currencyCode != null, "Currency not found");
        Price.SupportedCurrency supportedCurrencyFindByCode = Price.SupportedCurrency.findByCode(currencyCode);
        C22462m.m68678j(supportedCurrencyFindByCode != null, "Currency with code %s not supported", currencyCode);
        return supportedCurrencyFindByCode;
    }

    private PricePerTicket getPricePerTicket(TicketProductParameters ticketProductParameters) {
        ProductInstanceKey key = getKey(ticketProductParameters, ticketProductParameters.getNumAdultTickets(), AgeGroup.ADULT);
        ProductInstanceKey key2 = getKey(ticketProductParameters, ticketProductParameters.getNumChildTickets(), AgeGroup.CHILD);
        ProductInstanceKey key3 = getKey(ticketProductParameters, ticketProductParameters.getNumSeniorTickets(), AgeGroup.SENIOR);
        ProductInstanceKey key4 = getKey(ticketProductParameters, ticketProductParameters.getNumAllAgesTickets(), AgeGroup.ALL_AGES);
        Map<ProductInstanceKey, ProductInstance> productInstanceMap = this.rawResponse.getProductInstanceMap();
        ProductInstance productInstance = productInstanceMap.get(key);
        ProductInstance productInstance2 = productInstanceMap.get(key2);
        ProductInstance productInstance3 = productInstanceMap.get(key3);
        ProductInstance productInstance4 = productInstanceMap.get(key4);
        Optional<Price> optionalAbsent = Optional.absent();
        Optional<Price> subtotal = productInstance != null ? productInstance.getPricing().getSubtotal() : optionalAbsent;
        Optional<Price> subtotal2 = productInstance2 != null ? productInstance2.getPricing().getSubtotal() : optionalAbsent;
        Optional<Price> subtotal3 = productInstance3 != null ? productInstance3.getPricing().getSubtotal() : optionalAbsent;
        if (productInstance4 != null) {
            optionalAbsent = productInstance4.getPricing().getSubtotal();
        }
        return new PricePerTicket(subtotal.orNull(), subtotal2.orNull(), subtotal3.orNull(), optionalAbsent.orNull());
    }

    private ProductCategoryType getProductCategoryType() {
        return this.rawResponse.getProductCategoryType();
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketProductServiceResponse
    public Optional<HashMap<String, ProductAffiliationDto>> getAffiliations() {
        return this.rawResponse.getAffiliations();
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketProductServiceResponse
    public Map<String, Collection<AgeGroup>> getAgeGroupsByProductId() {
        return this.rawResponse.getAgeGroupsByProductId();
    }

    public List<SelectedTicketProducts> getAllSelectedTicketProducts(TicketProductParameters ticketProductParameters) {
        ArrayList arrayList = new ArrayList();
        AbstractC22726b3<String> it = this.rawResponse.getDiscountGroupTypes().iterator();
        while (it.hasNext()) {
            ticketProductParameters.setDiscountGroupType(it.next());
            arrayList.add(getSelectedTicketProducts(ticketProductParameters));
        }
        return arrayList;
    }

    public DestinationId getDestinationId() {
        return this.rawResponse.getDestinationId();
    }

    public String getDtiStoreId() {
        return this.rawResponse.getDtiStoreId();
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketProductServiceResponse
    public Map<String, FeatureDto> getFeatureDtoMap() {
        return this.rawResponse.getFeatureDtoMap();
    }

    ProductInstanceKey getKey(TicketProductParameters ticketProductParameters, int i10, AgeGroup ageGroup) {
        if (i10 == 0) {
            return null;
        }
        return new ProductInstanceKey(ticketProductParameters.getTicketProductType(), ticketProductParameters.getDiscountGroupType(), ageGroup, ticketProductParameters.getNumberOfDays(), ticketProductParameters.getAddOnOptions(), ticketProductParameters.getTier());
    }

    public ImmutableList<TicketDay> getNumberOfSupportedDays() {
        return this.rawResponse.getNumberOfSupportedDays();
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketProductServiceResponse
    public Optional<HashMap<String, OfferDto>> getOffers() {
        return this.rawResponse.getOffers();
    }

    public PricePerDay getPricePerDay(TicketProductParameters ticketProductParameters) {
        ProductInstanceKey key = getKey(ticketProductParameters, 1, AgeGroup.ADULT);
        ProductInstanceKey key2 = getKey(ticketProductParameters, 1, AgeGroup.CHILD);
        Map<ProductInstanceKey, ProductInstance> productInstanceMap = this.rawResponse.getProductInstanceMap();
        ProductInstance productInstance = productInstanceMap.get(key);
        ProductInstance productInstance2 = productInstanceMap.get(key2);
        return new PricePerDay(productInstance != null ? productInstance.getSubTotalPricePerDay() : null, productInstance2 != null ? productInstance2.getSubTotalPricePerDay() : null);
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketProductServiceResponse
    public Map<String, String> getProductIdByTier(String str) {
        return this.rawResponse.getProductIdByTier(str);
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketProductServiceResponse
    public Set<String> getProductIdList(String str) {
        return this.rawResponse.getProductIdList(str);
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketProductServiceResponse
    public Map<ProductInstanceKey, ProductInstance> getProductInstanceMap() {
        return this.rawResponse.getProductInstanceMap();
    }

    protected TicketAssemblerResponse getRawResponse() {
        return this.rawResponse;
    }

    public Calendar getResponseDateTime() {
        return this.rawResponse.getResponseDateTime();
    }

    public SelectedTicketProducts getSelectedTicketProducts(TicketProductParameters ticketProductParameters) {
        ProductInstanceKey key = getKey(ticketProductParameters, ticketProductParameters.getNumAdultTickets(), AgeGroup.ADULT);
        ProductInstanceKey key2 = getKey(ticketProductParameters, ticketProductParameters.getNumChildTickets(), AgeGroup.CHILD);
        ProductInstanceKey key3 = getKey(ticketProductParameters, ticketProductParameters.getNumAllAgesTickets(), AgeGroup.ALL_AGES);
        Map<ProductInstanceKey, ProductInstance> productInstanceMap = this.rawResponse.getProductInstanceMap();
        ProductInstance productInstance = productInstanceMap.get(key);
        ProductInstance productInstance2 = productInstanceMap.get(key2);
        ProductInstance productInstance3 = productInstanceMap.get(key3);
        Price.SupportedCurrency supportedCurrencyExtractCurrencyCode = extractCurrencyCode();
        Pricing pricing = productInstance != null ? productInstance.getPricing() : Pricing.ZERO_VALUES.get(supportedCurrencyExtractCurrencyCode);
        Pricing pricing2 = productInstance2 != null ? productInstance2.getPricing() : Pricing.ZERO_VALUES.get(supportedCurrencyExtractCurrencyCode);
        Pricing pricing3 = productInstance3 != null ? productInstance3.getPricing() : Pricing.ZERO_VALUES.get(supportedCurrencyExtractCurrencyCode);
        Pricing pricingMultiply = pricing.multiply(ticketProductParameters.getNumAdultTickets());
        Pricing pricingMultiply2 = pricing2.multiply(ticketProductParameters.getNumChildTickets());
        Pricing pricingMultiply3 = pricing3.multiply(ticketProductParameters.getNumAllAgesTickets());
        Price priceAdd = pricingMultiply.getTotal().add(pricingMultiply2.getTotal()).add(pricingMultiply3.getTotal());
        Price priceAddNullablePrices = addNullablePrices(addNullablePrices(pricingMultiply.getSubtotal().isPresent() ? pricingMultiply.getSubtotal().get() : null, pricingMultiply2.getSubtotal().isPresent() ? pricingMultiply2.getSubtotal().get() : null), pricingMultiply3.getSubtotal().isPresent() ? pricingMultiply3.getSubtotal().get() : null);
        Price priceAddNullablePrices2 = addNullablePrices(addNullablePrices(pricingMultiply.getTax().isPresent() ? pricingMultiply.getTax().get() : null, pricingMultiply2.getTax().isPresent() ? pricingMultiply2.getTax().get() : null), pricingMultiply3.getTax().isPresent() ? pricingMultiply3.getTax().get() : null);
        DisplayNames displayNamesCreateDisplayNames = createDisplayNames(productInstance, productInstance2, productInstance3);
        Optional.absent();
        SelectedTicketProducts.Builder builder = new SelectedTicketProducts.Builder();
        builder.setAdultProductInstanceId(productInstance != null ? productInstance.getProductInstanceId() : null).setChildProductInstanceId(productInstance2 != null ? productInstance2.getProductInstanceId() : null).setAllAgesProductInstanceId(productInstance3 != null ? productInstance3.getProductInstanceId() : null).setAdultATSCode(productInstance != null ? productInstance.getATSCode() : null).setChildATSCode(productInstance2 != null ? productInstance2.getATSCode() : null).setAllAgesATSCode(productInstance3 != null ? productInstance3.getATSCode() : null).setAdultCategoryId(productInstance != null ? productInstance.getCategoryId() : null).setChildCategoryId(productInstance2 != null ? productInstance2.getCategoryId() : null).setAllAgesCategoryId(productInstance3 != null ? productInstance3.getCategoryId() : null).setAdultCombinedSubtotal(pricingMultiply.getSubtotal().orNull()).setChildCombinedSubtotal(pricingMultiply2.getSubtotal().orNull()).setAllAgesCombinedSubtotal(pricingMultiply3.getSubtotal().orNull()).setNumberOfAdultTickets(ticketProductParameters.getNumAdultTickets()).setNumberOfChildTickets(ticketProductParameters.getNumChildTickets()).setNumberOfSeniorTickets(ticketProductParameters.getNumSeniorTickets()).setNumberOfAllAgesTickets(ticketProductParameters.getNumAllAgesTickets()).setNumberOfSelectedDays(Integer.valueOf(ticketProductParameters.getNumberOfDays())).setPricePerTicket(getPricePerTicket(ticketProductParameters)).setCombinedSubtotal(priceAddNullablePrices).setCombinedTax(priceAddNullablePrices2).setCombinedTotal(priceAdd).setTicketDisplayNames(displayNamesCreateDisplayNames).setOneDayDisplayDate(null).setIsGovIdRequired(false).setTwoDayDisplayDate(null).setDiscountGroupType(ticketProductParameters.getDiscountGroupType());
        builder.setWebStoreId(getWebStoreId());
        builder.setDtiStoreId(getDtiStoreId());
        builder.setSessionId(getSessionId());
        builder.setDestinationId(getDestinationId());
        builder.setSellableOnDate(getSellableOnDate().orNull());
        builder.setProductCategoryType(getProductCategoryType());
        builder.setResponseDateTime(getResponseDateTime());
        if (productInstance != null) {
            builder.setProductId(productInstance.getProductIdString());
            Iterator<Policy> it = productInstance.getPolicies().iterator();
            while (it.hasNext()) {
                builder.addPolicy(it.next());
            }
        }
        if (productInstance2 != null) {
            builder.setProductId(productInstance2.getProductIdString());
            Iterator<Policy> it2 = productInstance2.getPolicies().iterator();
            while (it2.hasNext()) {
                builder.addPolicy(it2.next());
            }
        }
        if (productInstance3 != null) {
            builder.setProductId(productInstance3.getProductIdString());
            Iterator<Policy> it3 = productInstance3.getPolicies().iterator();
            while (it3.hasNext()) {
                builder.addPolicy(it3.next());
            }
        }
        return builder.build();
    }

    public Optional<Calendar> getSellableOnDate() {
        return this.rawResponse.getSellableOnDate();
    }

    public String getSessionId() {
        return this.rawResponse.getSessionId();
    }

    public Optional<TieredTicketCalendarMap> getTieredTicketProductsCalendars() {
        return this.rawResponse.getTieredTicketProductsCalendars();
    }

    public WebStoreId getWebStoreId() {
        return this.rawResponse.getWebStoreId();
    }

    public boolean isTieredTicketsEnabled() {
        return this.rawResponse.isTieredTicketsEnabled();
    }
}