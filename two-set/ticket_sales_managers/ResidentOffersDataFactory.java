package com.disney.wdpro.ticket_sales_managers;

import com.disney.wdpro.base_sales_ui_lib.model.Feature;
import com.disney.wdpro.base_sales_ui_lib.model.Offer;
import com.disney.wdpro.ticket_sales_base_lib.business.product.FeatureDto;
import com.disney.wdpro.ticket_sales_base_lib.business.product.OfferDto;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductAffiliationDto;
import com.google.common.base.C22466q;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;

/* loaded from: classes19.dex */
public class ResidentOffersDataFactory {
    public static final String EMPTY_STRING = "";

    @Inject
    public ResidentOffersDataFactory() {
    }

    private List<Feature> buildFeatureList(List<String> list, Map<String, FeatureDto> map) {
        ArrayList arrayListM69268i = Lists.m69268i();
        if (map != null) {
            for (String str : list) {
                if (map.containsKey(str)) {
                    FeatureDto featureDto = map.get(str);
                    arrayListM69268i.add(new Feature(str, featureDto.getDescription(), getFeatureMobileDescriptionBody(featureDto.getDescriptions()), featureDto.getSubType()));
                }
            }
        }
        return arrayListM69268i;
    }

    private Offer buildOffer(String str, OfferDto offerDto, Map<String, FeatureDto> map, String str2) {
        return new Offer(offerDto.getDisplayName(), str, offerDto.getPriorityOrder(), offerDto.getAvailableNumDays(), buildTicketDaysList(offerDto.getTicketDaysDtoList()), buildOfferProductType(offerDto.getProductTypeDtoMap(), map), offerDto.getOfferDetails(), offerDto.isSpecialOffer(), offerDto.getDiscountGroupId(), str2);
    }

    private Set<Offer.ProductType> buildOfferProductType(Map<String, OfferDto.ProductTypeDto> map, Map<String, FeatureDto> map2) {
        HashSet hashSetM69460g = Sets.m69460g();
        if (map != null) {
            Iterator<Map.Entry<String, OfferDto.ProductTypeDto>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                hashSetM69460g.add(buildProductType(it.next().getValue(), map2));
            }
        }
        return hashSetM69460g;
    }

    private Offer.ProductType buildProductType(OfferDto.ProductTypeDto productTypeDto, Map<String, FeatureDto> map) {
        return new Offer.ProductType(productTypeDto.getId(), buildFeatureList(productTypeDto.getFeatureIds(), map));
    }

    private Offer.TicketDay.StartingFromPrice buildStartingFromPrice(OfferDto.TicketDayDto.StartingFromPriceDto startingFromPriceDto) {
        return new Offer.TicketDay.StartingFromPrice(startingFromPriceDto.getSubtotal(), startingFromPriceDto.getTax(), startingFromPriceDto.getTotal(), startingFromPriceDto.getCurrency(), startingFromPriceDto.getPricePerDay());
    }

    private Offer.TicketDay buildTicketDays(OfferDto.TicketDayDto ticketDayDto) {
        return new Offer.TicketDay(ticketDayDto.getDay(), ticketDayDto.isTiered(), buildStartingFromPrice(ticketDayDto.getStartingFromPriceDto()), ticketDayDto.getCalendarId(), ticketDayDto.getPolicyIds());
    }

    private List<Offer.TicketDay> buildTicketDaysList(List<OfferDto.TicketDayDto> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<OfferDto.TicketDayDto> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(buildTicketDays(it.next()));
            }
        }
        return arrayList;
    }

    private String getFeatureMobileDescriptionBody(Map<String, FeatureDto.DescriptionDto> map) {
        for (Map.Entry<String, FeatureDto.DescriptionDto> entry : map.entrySet()) {
            FeatureDto.DescriptionDto value = entry.getValue();
            if ("description".equals(entry.getKey()) && value != null && "mobileDescription".equals(value.getType())) {
                return C22466q.m68725e(value.getText());
            }
        }
        return "";
    }

    private Map<String, String> mapOfferIdAffiliationId(Map<String, ProductAffiliationDto> map) {
        HashMap mapM69381r = Maps.m69381r();
        for (Map.Entry<String, ProductAffiliationDto> entry : map.entrySet()) {
            Iterator<String> it = entry.getValue().getOfferIds().iterator();
            while (it.hasNext()) {
                mapM69381r.put(it.next(), entry.getKey());
            }
        }
        return mapM69381r;
    }

    public List<Offer> buildOfferList(Map<String, OfferDto> map, Map<String, FeatureDto> map2, Map<String, ProductAffiliationDto> map3) {
        Map<String, String> mapMapOfferIdAffiliationId = mapOfferIdAffiliationId(map3);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, OfferDto> entry : map.entrySet()) {
            if (mapMapOfferIdAffiliationId.containsKey(entry.getKey())) {
                arrayList.add(buildOffer(entry.getKey(), entry.getValue(), map2, mapMapOfferIdAffiliationId.get(entry.getKey())));
            }
        }
        return arrayList;
    }
}