package com.disney.wdpro.ticket_sales_base_lib.business.checkout.models;

import com.google.common.base.C22453d;
import com.google.common.base.Optional;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* loaded from: classes18.dex */
public enum BookingStatus {
    UNSUBMITTED,
    PENDED,
    BOOKED,
    FAILED,
    IN_PROGRESS,
    PARTIALLY_BOOKED,
    PENDING_PAYMENT,
    UNKNOWN;

    public static class BookingStatusDeserializer implements JsonDeserializer<BookingStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public BookingStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Optional optionalM68628b = C22453d.m68628b(BookingStatus.class, jsonElement.getAsString());
            return optionalM68628b.isPresent() ? (BookingStatus) optionalM68628b.get() : BookingStatus.UNKNOWN;
        }
    }
}