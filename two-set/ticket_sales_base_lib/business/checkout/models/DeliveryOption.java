package com.disney.wdpro.ticket_sales_base_lib.business.checkout.models;

import com.disney.wdpro.httpclient.InterfaceC13334f;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.google.gson.GsonBuilder;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;

@SuppressFBWarnings({"NP_NULL_PARAM_DEREF_NONVIRTUAL"})
/* loaded from: classes18.dex */
public class DeliveryOption implements Serializable {
    private static final long serialVersionUID = 1;
    private String deliveryItemDescription;
    private String deliveryMethodDescription;
    private String deliveryMethodDescriptionMobile;
    private String deliveryMethodDescriptionMobileBody;
    private String deliveryMethodDescriptionMobileHeader;
    private String deliveryShippingDescription;
    private String eTicketDescriptionMobile;

    /* renamed from: id */
    private String f43903id;
    private int leadTime;
    private String name;
    private String pickupArea;
    private Pricing pricing;
    private String salesType;

    public static final class DisplayDeliveryMethodDescription implements Serializable {
        private static final long serialVersionUID = 1;
        private final Optional<String> body;
        private final Optional<String> header;

        public Optional<String> getBody() {
            return this.body;
        }

        public Optional<String> getHeader() {
            return this.header;
        }

        private DisplayDeliveryMethodDescription(String str, String str2) {
            this.header = Optional.fromNullable(str);
            this.body = Optional.fromNullable(str2);
        }
    }

    public static final InterfaceC13334f getDecoder() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Pricing.class, new Pricing.PricingDeserializer());
        return new InterfaceC13334f.a(gsonBuilder);
    }

    public DisplayDeliveryMethodDescription getDisplayDeliveryMethodDescriptionMobile() {
        byte b10 = 0;
        byte b11 = 0;
        if (!C22466q.m68722b(this.deliveryMethodDescriptionMobileBody)) {
            return new DisplayDeliveryMethodDescription(this.deliveryMethodDescriptionMobileHeader, this.deliveryMethodDescriptionMobileBody);
        }
        return new DisplayDeliveryMethodDescription(b11 == true ? 1 : 0, this.deliveryMethodDescriptionMobile);
    }

    public Optional<String> getFinePrint() {
        return Optional.fromNullable(this.eTicketDescriptionMobile);
    }

    public String getId() {
        return this.f43903id;
    }

    public String getName() {
        return this.name;
    }

    public Pricing getPricing() {
        return this.pricing;
    }

    public String toString() {
        return String.format("id[%s], pickupArea[%s], salesType[%s], leadTime[%s], pricing[%s], deliveryMethodDescription[%s], name[%s], deliveryItemDescription[%s], deliveryShippingDescription[%s], deliveryMethodDescriptionMobile[%s], deliveryMethodDescriptionMobileHeader[%s], deliveryMethodDescriptionMobileBody[%s], eTicketDescriptionMobile[%s]", this.f43903id, this.pickupArea, this.salesType, Integer.valueOf(this.leadTime), this.pricing, this.deliveryMethodDescription, this.name, this.deliveryItemDescription, this.deliveryShippingDescription, this.deliveryMethodDescriptionMobile, this.deliveryMethodDescriptionMobileHeader, this.deliveryMethodDescriptionMobileBody, this.eTicketDescriptionMobile);
    }
}