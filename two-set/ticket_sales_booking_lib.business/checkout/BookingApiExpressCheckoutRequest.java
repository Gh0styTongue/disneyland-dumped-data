package com.disney.wdpro.ticket_sales_booking_lib.business.checkout;

import com.disney.wdpro.httpclient.InterfaceC13336h;
import com.disney.wdpro.service.model.BillingAddress;
import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.service.model.payment.CardPaymentMethod;
import com.disney.wdpro.service.util.CreditCardUtils;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.SettablePersonName;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.PaymentCard;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry.IGuestEntry;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes18.dex */
public final class BookingApiExpressCheckoutRequest {
    private final String bookingTermsAndConditions;
    private final ImmutableList<EmailEntry> confirmationEmails;
    private final String geoLocationCountry;
    private final ImmutableList<IGuestEntry> guests;
    private final ImmutableList<PaymentEntry> payments;

    private static class BillingPhoneSerializer implements JsonSerializer<Phone> {
        private BillingPhoneSerializer() {
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Phone phone, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonElement jsonTree = new Gson().toJsonTree(phone);
            jsonTree.getAsJsonObject().remove("id");
            return jsonTree;
        }
    }

    private static class BookingPaymentReference {
        private static final String CANADA_BOOKING_SERVICE_COUNTRY_CODE = "CAN";
        private static final String CANADA_PROFILE_COUNTRY_CODE = "CA";
        private final BillingAddress billingAddress;
        private final PersonName billingName;
        private final String cardSubType;
        private final String cardholderName;
        private final String cvv2;

        /* renamed from: id */
        private final String f44021id;
        private final String key;
        private final boolean paymentCardScan;

        BookingPaymentReference(CardPaymentMethod cardPaymentMethod, PersonName personName, boolean z10) {
            this.f44021id = cardPaymentMethod.getPaymentReference().getId();
            this.key = cardPaymentMethod.getPaymentReference().getKey();
            this.cvv2 = cardPaymentMethod.getCard().getCvv2();
            this.cardSubType = cardPaymentMethod.getCard().getCardType();
            this.cardholderName = cardPaymentMethod.getCard().getCardholderName();
            BillingAddress billingAddress = cardPaymentMethod.getCard().getBillingAddress();
            this.billingAddress = billingAddress != null ? processCanadaCountryCodeBillingAddress(billingAddress) : billingAddress;
            this.billingName = personName;
            this.paymentCardScan = z10;
        }

        private BillingAddress processCanadaCountryCodeBillingAddress(BillingAddress billingAddress) {
            BillingAddress.BillingAddressBuilder billingAddressBuilder = new BillingAddress.BillingAddressBuilder();
            if ("CA".equals(billingAddress.getCountry())) {
                billingAddressBuilder.setCountry(CANADA_BOOKING_SERVICE_COUNTRY_CODE);
            } else {
                billingAddressBuilder.setCountry(billingAddress.getCountry());
            }
            billingAddressBuilder.setAddressLine1(billingAddress.getLine1());
            billingAddressBuilder.setAddressLine2(billingAddress.getAddressLine2());
            billingAddressBuilder.setCity(billingAddress.getCity());
            billingAddressBuilder.setPostalCode(billingAddress.getPostalCode());
            billingAddressBuilder.setStateOrProvince(billingAddress.getStateOrProvince());
            return new BillingAddress(billingAddressBuilder);
        }
    }

    public static class Builder {
        private String bookingTermsAndConditions;
        private ImmutableList<EmailEntry> confirmationEmailList;
        private String geoLocationCountry;
        private ImmutableList<PaymentEntry> paymentList;
        private PersonName purchaserName;
        private final List<IGuestEntry> guestList = Lists.m69268i();
        private final List<Integer> nonPrimaryGuestIndexWithNoName = Lists.m69268i();
        private final ImmutableList.C22583a<EmailEntry> confirmationEmailListBuilder = ImmutableList.builder();
        private final ImmutableList.C22583a<PaymentEntry> paymentListBuilder = ImmutableList.builder();

        public Builder addEmail(String str, String str2) {
            C22462m.m68673e(!C22466q.m68722b(str), "email == null or empty");
            C22462m.m68673e(!C22466q.m68722b(str2), "confirmationEmail == null or empty");
            C22462m.m68673e(str.equals(str2), "email != confirmationEmail");
            this.confirmationEmailListBuilder.mo69026a(new EmailEntry(str, str2));
            return this;
        }

        public Builder addGuest(IGuestEntry iGuestEntry) {
            C22462m.m68685q(iGuestEntry, "guestEntry == null");
            if (!iGuestEntry.isPrimary() && !SettablePersonName.isProperName(iGuestEntry.getName())) {
                this.nonPrimaryGuestIndexWithNoName.add(Integer.valueOf(this.guestList.size()));
            }
            this.guestList.add(iGuestEntry);
            return this;
        }

        public Builder addPayment(PaymentCard paymentCard, CardPaymentMethod cardPaymentMethod, String str, Price price, Phone phone, boolean z10) {
            C22462m.m68673e((cardPaymentMethod == null && paymentCard != null) || (cardPaymentMethod != null && paymentCard == null), "onlyPaymentCardPresent || cardCardPaymentMethod");
            C22462m.m68673e(!C22466q.m68722b(str), "billingEmail == null or empty");
            C22462m.m68685q(price, "totalPrice == null");
            this.paymentListBuilder.mo69026a(new PaymentEntry(paymentCard, cardPaymentMethod != null ? new BookingPaymentReference(cardPaymentMethod, this.purchaserName, z10) : null, str, price, phone));
            return this;
        }

        public BookingApiExpressCheckoutRequest build() throws IllegalArgumentException {
            this.confirmationEmailList = this.confirmationEmailListBuilder.m69053m();
            this.paymentList = this.paymentListBuilder.m69053m();
            C22462m.m68673e(this.guestList.size() > 0, "guestList.size() == 0");
            C22462m.m68673e(this.confirmationEmailList.size() > 0, "confirmationEmailList.size() == 0");
            C22462m.m68673e(this.paymentList.size() > 0, "paymentList.size() == 0");
            if (this.guestList.size() == this.nonPrimaryGuestIndexWithNoName.size()) {
                Iterator<Integer> it = this.nonPrimaryGuestIndexWithNoName.iterator();
                while (it.hasNext()) {
                    this.guestList.get(it.next().intValue());
                }
            }
            return new BookingApiExpressCheckoutRequest(this);
        }

        public Builder setBookingTermsAndConditions(String str) {
            this.bookingTermsAndConditions = str;
            return this;
        }

        public Builder setGeoLocationCountry(String str) {
            this.geoLocationCountry = str;
            return this;
        }

        public Builder setPurchaserName(PersonName personName) {
            this.purchaserName = personName;
            SettablePersonName.isProperName(personName);
            return this;
        }
    }

    private static final class EmailEntry {
        private final String confirmEmail;
        private final String email;

        private EmailEntry(String str, String str2) {
            this.email = str;
            this.confirmEmail = str2;
        }
    }

    private static class PaymentCardSerializer implements JsonSerializer<PaymentCard> {
        private PaymentCardSerializer() {
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(PaymentCard paymentCard, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonElement jsonTree = new Gson().toJsonTree(paymentCard);
            jsonTree.getAsJsonObject().add("billingName", jsonSerializationContext.serialize(paymentCard.getBillingName(), PersonName.class));
            jsonTree.getAsJsonObject().addProperty("cardType", paymentCard.getPaymentMethodType());
            jsonTree.getAsJsonObject().addProperty("cardSubType", CreditCardUtils.CreditCardType.getFromName(paymentCard.getCardType()).getShortName());
            jsonTree.getAsJsonObject().addProperty("expirationYear", CreditCardUtils.ensureFourDigitYear(paymentCard.getExpirationYear()));
            return jsonTree;
        }
    }

    private static final class PaymentEntry {
        private final BigDecimal amount;
        private final String billingEmail;
        private final Phone billingPhone;
        private final String currency;
        private final PaymentCard paymentCard;
        private final BookingPaymentReference paymentReference;

        private PaymentEntry(PaymentCard paymentCard, BookingPaymentReference bookingPaymentReference, String str, Price price, Phone phone) {
            this.paymentCard = paymentCard;
            this.paymentReference = bookingPaymentReference;
            this.billingEmail = str;
            this.amount = price.getValue();
            this.currency = price.getCurrency().getCurrencyCode();
            this.billingPhone = phone;
        }
    }

    private static class PersonNameSerializer implements JsonSerializer<PersonName> {
        private PersonNameSerializer() {
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(PersonName personName, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = new JsonObject();
            String strMo68585or = personName.getTitle().mo68585or((Optional<String>) "");
            String strMo68585or2 = personName.getFirstName().mo68585or((Optional<String>) "");
            String strMo68585or3 = personName.getMiddleName().mo68585or((Optional<String>) "");
            String strMo68585or4 = personName.getLastName().mo68585or((Optional<String>) "");
            String strMo68585or5 = personName.getSuffix().mo68585or((Optional<String>) "");
            if (C22466q.m68722b(strMo68585or) && C22466q.m68722b(strMo68585or2) && C22466q.m68722b(strMo68585or3) && C22466q.m68722b(strMo68585or4) && C22466q.m68722b(strMo68585or5)) {
                return null;
            }
            jsonObject.addProperty("prefix", strMo68585or);
            jsonObject.addProperty("firstName", strMo68585or2);
            jsonObject.addProperty("middleName", strMo68585or3);
            jsonObject.addProperty("lastName", strMo68585or4);
            jsonObject.addProperty("suffix", strMo68585or5);
            return jsonObject;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InterfaceC13336h getEncoder() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(PaymentCard.class, new PaymentCardSerializer());
        gsonBuilder.registerTypeAdapter(PersonName.class, new PersonNameSerializer());
        gsonBuilder.registerTypeAdapter(Phone.class, new BillingPhoneSerializer());
        return new InterfaceC13336h.b(gsonBuilder);
    }

    private BookingApiExpressCheckoutRequest(Builder builder) {
        this.guests = ImmutableList.copyOf((Collection) builder.guestList);
        this.payments = builder.paymentList;
        this.confirmationEmails = builder.confirmationEmailList;
        this.bookingTermsAndConditions = builder.bookingTermsAndConditions;
        this.geoLocationCountry = builder.geoLocationCountry;
    }
}