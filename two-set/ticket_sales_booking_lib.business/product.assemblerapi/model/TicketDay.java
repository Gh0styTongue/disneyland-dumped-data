package com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model;

import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PolicyGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.assemblerapi.model.PolicyImpl;
import com.disney.wdpro.ticket_sales_base_lib.business.product.assemblerapi.model.PolicyMap;
import com.google.common.base.C22459j;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.google.common.collect.AbstractC22794s1;
import com.google.common.reflect.TypeToken;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

@SuppressFBWarnings({"NP_NULL_PARAM_DEREF"})
/* loaded from: classes18.dex */
public class TicketDay implements Comparable<TicketDay>, Serializable {
    private static final long serialVersionUID = 1;
    private final String calendarId;
    private final Boolean isTieredDay;
    private final Integer numDay;
    private final List<String> policyIds;
    private String policyText;
    private final Price startingFromPrice;

    public TicketDay(Boolean bool, Integer num, Price price, String str, List<String> list) {
        this.isTieredDay = bool;
        this.numDay = num;
        this.startingFromPrice = price;
        this.calendarId = C22466q.m68721a(str);
        this.policyIds = list;
    }

    public static Object getDeserializer() {
        return new JsonDeserializer<TicketDay>() { // from class: com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketDay.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.JsonDeserializer
            public TicketDay deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                boolean z10;
                boolean z11;
                Pricing pricing;
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                Integer numValueOf = Integer.valueOf(asJsonObject.get("day").getAsInt());
                if (asJsonObject.has("isTiered") && asJsonObject.get("isTiered").getAsBoolean()) {
                    z10 = true;
                    z11 = true;
                } else {
                    z10 = false;
                    z11 = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z10);
                try {
                    pricing = (Pricing) jsonDeserializationContext.deserialize(asJsonObject.get("startingFromPrice"), Pricing.class);
                } catch (Exception unused) {
                }
                Price priceOrNull = pricing != null ? pricing.getSubtotal().orNull() : null;
                String asString = asJsonObject.has("calendarId") ? asJsonObject.get("calendarId").getAsString() : null;
                boolean zM68722b = z11 ^ C22466q.m68722b(asString);
                if (z10 == zM68722b) {
                    return new TicketDay(boolValueOf, numValueOf, priceOrNull, asString, asJsonObject.has("policyIds") ? (List) jsonDeserializationContext.deserialize(asJsonObject.get("policyIds"), new TypeToken<List<String>>() { // from class: com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketDay.1.1
                    }.getType()) : null);
                }
                throw new JsonParseException(String.format("Tiered day boolean [%s] should be equal to calendar present boolean [%s].", boolValueOf, Boolean.valueOf(zM68722b)));
            }
        };
    }

    public boolean equals(Object obj) {
        if (obj instanceof TicketDay) {
            return C22459j.m68660a(this.numDay, ((TicketDay) obj).numDay);
        }
        return false;
    }

    public Optional<String> getCalendarId() {
        return Optional.fromNullable(this.calendarId);
    }

    public Integer getNumDay() {
        return this.numDay;
    }

    public Optional<String> getPolicyText() {
        return Optional.fromNullable(this.policyText);
    }

    public Optional<Price> getStartingFromPrice() {
        return Optional.fromNullable(this.startingFromPrice);
    }

    public int hashCode() {
        return C22459j.m68661b(this.numDay);
    }

    public Boolean isTieredDay() {
        return this.isTieredDay;
    }

    void resolvePolicyLinks(PolicyMap policyMap) {
        StringBuilder sb2 = new StringBuilder();
        List<String> list = this.policyIds;
        if (list == null) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            PolicyImpl policyImpl = policyMap.get(it.next());
            if (policyImpl != null) {
                sb2.append(policyImpl.getPolicyDescriptionMap().get(PolicyGroup.PolicyDescriptionKey.TICKET_SELECTION_DAY_POLICY_DESCRIPTION));
            }
        }
        this.policyText = sb2.toString();
    }

    public String toString() {
        String strM68725e = C22466q.m68725e(this.calendarId);
        Price price = this.startingFromPrice;
        return String.format("[num %d tiered[%s] %s %s] ids = [%s]", this.numDay, this.isTieredDay, strM68725e, price != null ? price.toString() : "", this.policyText);
    }

    @Override // java.lang.Comparable
    public int compareTo(TicketDay ticketDay) {
        return AbstractC22794s1.m69671k().mo69674f(this.numDay, ticketDay.numDay).mo69678j();
    }
}