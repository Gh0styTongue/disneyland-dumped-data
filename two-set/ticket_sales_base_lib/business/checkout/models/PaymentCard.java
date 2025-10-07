package com.disney.wdpro.ticket_sales_base_lib.business.checkout.models;

import com.disney.wdpro.httpclient.OptionalTypeAdapterFactory;
import com.disney.wdpro.service.model.Card;
import com.disney.wdpro.service.model.PersonName;
import com.google.common.base.C22462m;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;

@Instrumented
/* loaded from: classes18.dex */
public class PaymentCard extends Card {
    private PersonName billingName;

    private PaymentCard() {
    }

    public static PaymentCard createFromCard(Card card, PersonName personName) {
        C22462m.m68685q(card, "card == null");
        C22462m.m68685q(personName, "billingName == null");
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(new OptionalTypeAdapterFactory());
        gsonBuilder.serializeNulls();
        Gson gsonCreate = gsonBuilder.create();
        String json = gsonCreate == null ? gsonCreate.toJson(card) : GsonInstrumentation.toJson(gsonCreate, card);
        PaymentCard paymentCard = (PaymentCard) (gsonCreate == null ? gsonCreate.fromJson(json, PaymentCard.class) : GsonInstrumentation.fromJson(gsonCreate, json, PaymentCard.class));
        paymentCard.billingName = personName;
        return paymentCard;
    }

    @Override // com.disney.wdpro.service.model.Card
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public PersonName getBillingName() {
        return this.billingName;
    }

    @Override // com.disney.wdpro.service.model.Card
    public int hashCode() {
        return super.hashCode();
    }
}