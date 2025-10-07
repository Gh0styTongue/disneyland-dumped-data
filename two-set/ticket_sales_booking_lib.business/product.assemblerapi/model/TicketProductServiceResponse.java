package com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model;

import com.disney.wdpro.ticket_sales_base_lib.business.product.AgeGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.FeatureDto;
import com.disney.wdpro.ticket_sales_base_lib.business.product.OfferDto;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductAffiliationDto;
import com.disney.wdpro.ticket_sales_base_lib.business.product.assemblerapi.model.ProductInstanceKey;
import com.google.common.base.Optional;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes18.dex */
public interface TicketProductServiceResponse extends Serializable {
    Optional<HashMap<String, ProductAffiliationDto>> getAffiliations();

    Map<String, Collection<AgeGroup>> getAgeGroupsByProductId();

    Map<String, FeatureDto> getFeatureDtoMap();

    Optional<HashMap<String, OfferDto>> getOffers();

    Map<String, String> getProductIdByTier(String str);

    Set<String> getProductIdList(String str);

    Map<ProductInstanceKey, ProductInstance> getProductInstanceMap();
}