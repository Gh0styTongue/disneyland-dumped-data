package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder;

import com.disney.wdpro.httpclient.InterfaceC13334f;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import com.disney.wdpro.paymentsui.constants.PaymentsConstants;
import com.disney.wdpro.service.business.APIConstants;
import com.disney.wdpro.service.model.Address;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.TotalDepositDue;
import com.disney.wdpro.ticket_sales_base_lib.business.calendar.TieredTicketCalendarMap;
import com.disney.wdpro.ticket_sales_base_lib.business.calendar.TieredTicketsCalendar;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.VisitDayName;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.DeliveryOption;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.PaymentUsed;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlement;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlementImpl;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketSalesAddressDeserializer;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNameMap;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.MonthlyPaymentAmount;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.TicketTierNameDescription;
import com.disney.wdpro.ticket_sales_base_lib.utils.JsonUtils;
import com.disney.wdpro.ticket_sales_booking_lib.business.calendar.Name;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ConfirmationPolicy;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.GuestInOrder;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.annualPass.AnnualPassOrderItemComponent;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.generalSales.TicketOrderItemComponent;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import edu.umd.cs.findbugs.annotations.SuppressWarnings;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@SuppressWarnings(justification = "The fields in this class are written using gson.", value = {"UWF_UNWRITTEN_FIELD"})
/* loaded from: classes18.dex */
public class TicketOrderResponse implements Serializable {
    private static final SimpleDateFormat DATE_PARSER = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    private static final Map<ProductCategoryType, Class<? extends OrderItemComponent>> ORDER_ITEM_COMPONENT_MODEL_MAP = createOrderItemComponentModel();
    private static final String TERM_TYPE_DLR_FLEX = "dlr-flex-annual";
    private static final long serialVersionUID = 1;
    private Calendar bookingDate;
    private BookingStatus bookingStatus;
    private String bookingTermsAndConditions;
    private Optional<String> calendarIds;
    private Map<VisitDayName, Name> calendarNames;
    private String confirmationEmail;
    private List<ConfirmationPolicy> confirmationPolicies;
    private String flexPassTermsAndCondition;
    private Map<String, GuestInOrder> guestsInOrder;

    /* renamed from: id */
    private String f44022id;
    private MonthlyPaymentAmount monthlyPaymentAmount;
    private String[] nameTitles;
    private List<OrderItem> orderItems;
    private PaymentUsed paymentUsedMasked;
    private Pricing pricing;
    private DeliveryOption selectedDeliveryOption;
    private Calendar sellableOnDate;
    private String sessionId;
    private String storeId;
    private String supportedDeliveryOptionsLink;
    private LinkedHashSet<TicketEntitlement> ticketEntitlements;
    private TieredTicketCalendarMap tieredTicketCalendarMap;
    private Map<String, String> titleToGenderMap;
    private TotalDepositDue totalDepositDue;
    private int totalNumberOfItems;

    private static class BookingServiceResponseDeserializer implements JsonDeserializer<TicketOrderResponse> {
        private final ProductCategoryType categoryType;
        private final Calendar sellableOnDate;
        private final String sessionId;

        BookingServiceResponseDeserializer(String str, Calendar calendar, ProductCategoryType productCategoryType) {
            this.sessionId = str;
            this.sellableOnDate = calendar;
            this.categoryType = productCategoryType;
        }

        private static String getUrlFromLinks(JsonObject jsonObject, String str) {
            return jsonObject.getAsJsonObject(str).get(APIConstants.JsonKeys.HREF).getAsString();
        }

        private static String idFromLinks(JsonObject jsonObject, String str) {
            return TicketOrderResponse.getLastSegment(getUrlFromLinks(jsonObject.getAsJsonObject(OTUXParamsKeys.OT_UX_LINKS), str));
        }

        private void parseAmountToPay(JsonDeserializationContext jsonDeserializationContext, TicketOrderResponse ticketOrderResponse, JsonObject jsonObject) {
            if (jsonObject.has("monthlyPaymentAmount")) {
                ticketOrderResponse.totalDepositDue = (TotalDepositDue) jsonDeserializationContext.deserialize(jsonObject.get("totalDepositDue"), TotalDepositDue.class);
                ticketOrderResponse.monthlyPaymentAmount = (MonthlyPaymentAmount) jsonDeserializationContext.deserialize(jsonObject.get("monthlyPaymentAmount"), MonthlyPaymentAmount.class);
            }
            ticketOrderResponse.pricing = (Pricing) jsonDeserializationContext.deserialize(jsonObject.get(OrionDeepLinkConstants.PAM_PURCHASE_PRICING), Pricing.class);
        }

        private void parseCalendarInformation(TicketOrderResponse ticketOrderResponse, JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            JsonElement jsonElement;
            if (jsonObject.has("calendarIds") && (jsonElement = jsonObject.get("calendarIds")) != null) {
                ticketOrderResponse.calendarIds = Optional.fromNullable(jsonElement.getAsString());
            }
            JsonElement jsonElement2 = jsonObject.get("calendars");
            if (jsonElement2 != null) {
                ticketOrderResponse.tieredTicketCalendarMap = (TieredTicketCalendarMap) jsonDeserializationContext.deserialize(jsonElement2, TieredTicketCalendarMap.class);
            }
            JsonElement jsonElement3 = jsonObject.get("calendarNames");
            if (jsonElement3 != null) {
                ticketOrderResponse.calendarNames = Maps.m69381r();
                JsonUtils.populateMapFromJson(jsonElement3.getAsJsonObject(), jsonDeserializationContext, new JsonUtils.KeyDeserializer<VisitDayName>() { // from class: com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.TicketOrderResponse.BookingServiceResponseDeserializer.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.disney.wdpro.ticket_sales_base_lib.utils.JsonUtils.KeyDeserializer
                    public VisitDayName deserialize(String str) {
                        return VisitDayName.findById(str);
                    }
                }, Name.class, ticketOrderResponse.calendarNames);
            }
        }

        private void parseGuestsInOrder(ProductCategoryType productCategoryType, TicketOrderResponse ticketOrderResponse, JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            JsonArray asJsonArray = jsonObject.getAsJsonArray("guests");
            if (asJsonArray == null) {
                if (productCategoryType == ProductCategoryType.ANNUAL_PASS_RENEWALS || productCategoryType == ProductCategoryType.ANNUAL_PASS_UPGRADE) {
                    throw new JsonParseException("Guests not returned in AnnualPass renewals/upgrades");
                }
            } else {
                ticketOrderResponse.guestsInOrder = Maps.m69381r();
                for (int i10 = 0; i10 < asJsonArray.size(); i10++) {
                    GuestInOrder guestInOrder = (GuestInOrder) jsonDeserializationContext.deserialize(asJsonArray.get(i10), GuestInOrder.class);
                    ticketOrderResponse.guestsInOrder.put(guestInOrder.getParticipantId(), guestInOrder);
                }
            }
        }

        private void parseNameTitles(TicketOrderResponse ticketOrderResponse, JsonObject jsonObject) {
            ProductCategoryType productCategoryType = this.categoryType;
            if (productCategoryType == ProductCategoryType.ANNUAL_PASS_UPGRADE || productCategoryType == ProductCategoryType.ANNUAL_PASS_SALES) {
                try {
                    JsonArray asJsonArray = jsonObject.getAsJsonObject(APIConstants.JsonKeys.ORDER_ITEMS).getAsJsonArray(APIConstants.JsonKeys.ENTRIES);
                    JsonArray asJsonArray2 = asJsonArray.get(0).getAsJsonObject().getAsJsonObject("guestInfoForm").getAsJsonObject("form").getAsJsonObject("guestInfo1").getAsJsonObject("prefix").getAsJsonArray("options");
                    if (asJsonArray2 == null || asJsonArray2.size() == 0) {
                        throw new JsonParseException("Prefix name titles are missing");
                    }
                    ArrayList arrayListM69268i = Lists.m69268i();
                    for (int i10 = 0; i10 < asJsonArray2.size(); i10++) {
                        JsonObject asJsonObject = asJsonArray2.get(i10).getAsJsonObject();
                        String strReplace = asJsonObject.get("text").toString().replace("\"", "");
                        if (!C22466q.m68722b(strReplace)) {
                            arrayListM69268i.add(strReplace);
                            JsonElement jsonElement = asJsonObject.get("info");
                            if (jsonElement == null || jsonElement.getAsJsonObject().get("gender") == null) {
                                throw new JsonParseException("Gender not found, corresponding to the title: " + strReplace);
                            }
                            ticketOrderResponse.titleToGenderMap.put(strReplace, jsonElement.getAsJsonObject().get("gender").getAsString());
                        }
                    }
                    ticketOrderResponse.nameTitles = new String[arrayListM69268i.size()];
                    arrayListM69268i.toArray(ticketOrderResponse.nameTitles);
                } catch (Exception unused) {
                    throw new JsonParseException("Exception trying to parse the name titles");
                }
            }
        }

        private void parseTermsAndCondition(TicketOrderResponse ticketOrderResponse, JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            String asString = null;
            if (jsonObject.has("termsAndConditionsAdditional")) {
                Iterator<JsonElement> it = jsonObject.getAsJsonArray("termsAndConditionsAdditional").iterator();
                while (it.hasNext()) {
                    JsonObject asJsonObject = it.next().getAsJsonObject();
                    if (asJsonObject.has("termType") && asJsonObject.get("termType").getAsString().equals(TicketOrderResponse.TERM_TYPE_DLR_FLEX)) {
                        asString = asJsonObject.get("policyIds").getAsJsonArray().get(0).getAsString();
                    }
                }
            }
            if (!jsonObject.has("termsAndConditions")) {
                throw new JsonParseException("termsAndConditions missing");
            }
            JsonElement jsonElement = jsonObject.get("termsAndConditions");
            JsonArray asJsonArray = jsonElement.getAsJsonObject().getAsJsonArray("confirmationPolicies");
            if (asJsonArray != null) {
                ticketOrderResponse.confirmationPolicies = Lists.m69268i();
                Iterator<JsonElement> it2 = asJsonArray.iterator();
                while (it2.hasNext()) {
                    ticketOrderResponse.confirmationPolicies.add((ConfirmationPolicy) jsonDeserializationContext.deserialize(it2.next(), ConfirmationPolicy.class));
                }
            }
            Iterator<JsonElement> it3 = jsonElement.getAsJsonObject().getAsJsonArray("policies").iterator();
            while (it3.hasNext()) {
                JsonObject asJsonObject2 = it3.next().getAsJsonObject();
                if (asJsonObject2.has("id") && asJsonObject2.has("descriptions") && asJsonObject2.get("id").getAsString().equals(asString)) {
                    JsonArray asJsonArray2 = asJsonObject2.get("descriptions").getAsJsonArray();
                    if (asJsonArray2.size() > 0) {
                        JsonObject asJsonObject3 = asJsonArray2.get(0).getAsJsonObject();
                        if (asJsonObject3.has("description")) {
                            ticketOrderResponse.flexPassTermsAndCondition = asJsonObject3.get("description").getAsJsonObject().get("text").getAsString();
                        }
                    }
                }
            }
        }

        private void parseTheOrderItems(TicketOrderResponse ticketOrderResponse, JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            ticketOrderResponse.orderItems = Lists.m69268i();
            ticketOrderResponse.totalNumberOfItems = jsonObject.get("totalNumberOfItems").getAsInt();
            JsonArray asJsonArray = jsonObject.getAsJsonObject(APIConstants.JsonKeys.ORDER_ITEMS).getAsJsonArray(APIConstants.JsonKeys.ENTRIES);
            for (int i10 = 0; i10 < asJsonArray.size(); i10++) {
                JsonObject asJsonObject = asJsonArray.get(i10).getAsJsonObject();
                OrderItem orderItem = new OrderItem();
                if (asJsonObject.has("confirmationNumber")) {
                    orderItem.confirmationNumber = asJsonObject.get("confirmationNumber").getAsString();
                }
                orderItem.f44023id = idFromLinks(asJsonObject, "self");
                orderItem.orderItemComponent = (OrderItemComponent) jsonDeserializationContext.deserialize(asJsonObject.get("components"), (Type) TicketOrderResponse.ORDER_ITEM_COMPONENT_MODEL_MAP.get(this.categoryType));
                orderItem.orderItemComponent.toString();
                boolean z10 = true;
                C22462m.m68673e(orderItem.getQuantity() > 0, "Should have at least 1 order item.");
                if (((ParticipantComponents) jsonDeserializationContext.deserialize(asJsonObject.get("participants"), ParticipantComponents.class)).getParticipants().size() <= 0) {
                    z10 = false;
                }
                C22462m.m68673e(z10, "(participantComponents.getParticipants().size() == 0)");
                orderItem.entitlementAssignment = (OrderItem.GuestsWithThisOrderItem) jsonDeserializationContext.deserialize(asJsonObject.get("entitlementAssignment"), OrderItem.GuestsWithThisOrderItem.class);
                ticketOrderResponse.orderItems.add(orderItem);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public TicketOrderResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException, ParseException {
            try {
                TicketOrderResponse ticketOrderResponse = new TicketOrderResponse();
                ticketOrderResponse.sessionId = this.sessionId;
                ticketOrderResponse.sellableOnDate = this.sellableOnDate;
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                ticketOrderResponse.f44022id = idFromLinks(asJsonObject, "self");
                JsonObject asJsonObject2 = asJsonObject.getAsJsonObject(OTUXParamsKeys.OT_UX_LINKS);
                if (asJsonObject2.has("supportedDeliveryOptions")) {
                    ticketOrderResponse.supportedDeliveryOptionsLink = getUrlFromLinks(asJsonObject2, "supportedDeliveryOptions");
                } else if (asJsonObject2.has("deliveryOption")) {
                    ticketOrderResponse.selectedDeliveryOption = (DeliveryOption) jsonDeserializationContext.deserialize(asJsonObject.get("deliveryOption"), DeliveryOption.class);
                }
                parseAmountToPay(jsonDeserializationContext, ticketOrderResponse, asJsonObject);
                ticketOrderResponse.bookingStatus = (BookingStatus) jsonDeserializationContext.deserialize(asJsonObject.get("status"), BookingStatus.class);
                if (ticketOrderResponse.bookingStatus == BookingStatus.BOOKED && asJsonObject.has("ticketAssignments")) {
                    try {
                        TicketOrderResponse.parseTicketEntitlements(jsonDeserializationContext, ticketOrderResponse, asJsonObject);
                    } catch (Exception unused) {
                    }
                }
                if (asJsonObject.has("payments")) {
                    ArrayList arrayListM69268i = Lists.m69268i();
                    Iterator<JsonElement> it = asJsonObject.getAsJsonArray("payments").iterator();
                    while (it.hasNext()) {
                        JsonElement next = it.next();
                        if (next.getAsJsonObject().has(PaymentsConstants.EXTRA_PAY_WITH_CARD) && next.getAsJsonObject().has("paymentReference")) {
                            throw new JsonParseException("More then one payment was found.");
                        }
                        if (next.getAsJsonObject().has(PaymentsConstants.EXTRA_PAY_WITH_CARD)) {
                            arrayListM69268i.add((PaymentUsed) jsonDeserializationContext.deserialize(next.getAsJsonObject().get(PaymentsConstants.EXTRA_PAY_WITH_CARD), PaymentUsed.class));
                        } else if (next.getAsJsonObject().has("paymentReference")) {
                            arrayListM69268i.add((PaymentUsed) jsonDeserializationContext.deserialize(next.getAsJsonObject().get("paymentReference"), PaymentUsed.class));
                        }
                    }
                    if (arrayListM69268i.size() > 0) {
                        ticketOrderResponse.paymentUsedMasked = (PaymentUsed) arrayListM69268i.get(0);
                    }
                }
                if (asJsonObject.has("storeId")) {
                    ticketOrderResponse.storeId = asJsonObject.get("storeId").getAsString();
                }
                if (asJsonObject.has("bookingDate")) {
                    try {
                        Date date = TicketOrderResponse.DATE_PARSER.parse(asJsonObject.get("bookingDate").getAsString());
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        ticketOrderResponse.bookingDate = calendar;
                    } catch (ParseException e10) {
                        throw new JsonParseException(e10);
                    }
                }
                if (asJsonObject.has("confirmationEmails")) {
                    JsonArray asJsonArray = asJsonObject.getAsJsonArray("confirmationEmails");
                    if (asJsonArray.size() > 0) {
                        ticketOrderResponse.confirmationEmail = asJsonArray.get(0).getAsJsonObject().get("emailAddress").getAsString();
                    }
                }
                parseTermsAndCondition(ticketOrderResponse, asJsonObject, jsonDeserializationContext);
                JsonElement jsonElement2 = asJsonObject.get("bookingTermsAndConditions");
                if (jsonElement2 == null || jsonElement2.isJsonNull()) {
                    throw new JsonParseException("Booking T&C Id missing");
                }
                ticketOrderResponse.bookingTermsAndConditions = jsonElement2.getAsString();
                parseCalendarInformation(ticketOrderResponse, asJsonObject, jsonDeserializationContext);
                parseTheOrderItems(ticketOrderResponse, asJsonObject, jsonDeserializationContext);
                parseNameTitles(ticketOrderResponse, asJsonObject);
                parseGuestsInOrder(this.categoryType, ticketOrderResponse, asJsonObject, jsonDeserializationContext);
                return ticketOrderResponse;
            } catch (NullPointerException e11) {
                throw new JsonParseException(e11);
            }
        }
    }

    public static final class OrderItem implements Serializable {
        private static final long serialVersionUID = 1;
        private String confirmationNumber;
        private GuestsWithThisOrderItem entitlementAssignment;

        /* renamed from: id */
        private String f44023id;
        private OrderItemComponent orderItemComponent;

        private static class GuestsWithThisOrderItem implements Serializable {
            private static final long serialVersionUID = 1;
            private List<String> guestReferenceIds;

            private GuestsWithThisOrderItem() {
            }
        }

        public Optional<String> getCalendarId() {
            return this.orderItemComponent.getCalendarId();
        }

        public Optional<String> getConfirmationNumber() {
            String strM68721a = C22466q.m68721a(this.confirmationNumber);
            this.confirmationNumber = strM68721a;
            return Optional.fromNullable(strM68721a);
        }

        @Nullable
        public List<String> getGuestParticipantIdsWithThisOrderItem() {
            GuestsWithThisOrderItem guestsWithThisOrderItem = this.entitlementAssignment;
            if (guestsWithThisOrderItem != null) {
                return guestsWithThisOrderItem.guestReferenceIds;
            }
            return null;
        }

        public Optional<String> getItemName() {
            return Optional.fromNullable(this.orderItemComponent.getItemName());
        }

        public OrderItemComponent getOrderItemComponent() {
            return this.orderItemComponent;
        }

        public String getOrderItemId() {
            return this.f44023id;
        }

        public Set<String> getProductInstanceIds() {
            return this.orderItemComponent.getProductInstanceIds();
        }

        public int getQuantity() {
            return this.orderItemComponent.getQuantity();
        }

        public String toString() {
            return "Order Item = " + this.f44023id + " PIBI = " + getProductInstanceIds();
        }

        private OrderItem() {
        }
    }

    private static final class ParticipantComponents implements Serializable {
        private static final long serialVersionUID = 1;
        private List<ParticipantEntry> entries;
        private Links links;

        private static final class ParticipantEntry implements Serializable {
            private static final long serialVersionUID = 1;
            private Links links;
            private Participant participant;

            private static final class Participant implements Serializable {
                private static final long serialVersionUID = 1;
                private String participantId;

                private Participant() {
                }
            }

            private ParticipantEntry() {
            }

            private Participant getParticipant() {
                return this.participant;
            }
        }

        private ParticipantComponents() {
        }

        private Links getLinks() {
            return this.links;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ImmutableList<ParticipantEntry> getParticipants() {
            return ImmutableList.copyOf((Collection) this.entries);
        }
    }

    public static final class TermsAndConditionsLink implements Serializable {
        private static final long serialVersionUID = 1;
        private String termsAndConditionsId;
        private String ticketStoreLink;

        private TermsAndConditionsLink() {
        }

        public String getTermsAndConditionsId() {
            return this.termsAndConditionsId;
        }

        public String getTicketStoreLink() {
            return this.ticketStoreLink;
        }
    }

    private static Map<ProductCategoryType, Class<? extends OrderItemComponent>> createOrderItemComponentModel() {
        HashMap mapM69381r = Maps.m69381r();
        mapM69381r.put(ProductCategoryType.THEME_PARK_GENERAL_ADMISSIONS, TicketOrderItemComponent.class);
        mapM69381r.put(ProductCategoryType.MAX_PASS, TicketOrderItemComponent.class);
        mapM69381r.put(ProductCategoryType.MEMORY_MAKER, TicketOrderItemComponent.class);
        mapM69381r.put(ProductCategoryType.PHOTO_PASS, TicketOrderItemComponent.class);
        mapM69381r.put(ProductCategoryType.ANNUAL_PASS_RENEWALS, AnnualPassOrderItemComponent.class);
        mapM69381r.put(ProductCategoryType.ANNUAL_PASS_UPGRADE, AnnualPassOrderItemComponent.class);
        mapM69381r.put(ProductCategoryType.ANNUAL_PASS_SALES, AnnualPassOrderItemComponent.class);
        if (mapM69381r.size() == ProductCategoryType.values().length) {
            return mapM69381r;
        }
        throw new IllegalStateException("Not all product category types are mapped to OrderItemComponent.");
    }

    public static InterfaceC13334f getDecoder(String str, Calendar calendar, ProductCategoryType productCategoryType) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(TicketOrderResponse.class, new BookingServiceResponseDeserializer(str, calendar, productCategoryType));
        gsonBuilder.registerTypeAdapter(BookingStatus.class, new BookingStatus.BookingStatusDeserializer());
        gsonBuilder.registerTypeAdapter(Pricing.class, new Pricing.PricingDeserializer());
        gsonBuilder.registerTypeAdapter(Price.class, new Price.PriceDeserializer());
        gsonBuilder.registerTypeAdapter(TotalDepositDue.class, new TotalDepositDue.TotalDepositDueDeserializer());
        gsonBuilder.registerTypeAdapter(TicketEntitlementImpl.class, new TicketEntitlementImpl.TicketEntitlementDeserializer());
        gsonBuilder.registerTypeAdapter(TieredTicketCalendarMap.class, TieredTicketCalendarMap.getDeserializer());
        gsonBuilder.registerTypeAdapter(TieredTicketsCalendar.class, TieredTicketsCalendar.getDeserializer());
        gsonBuilder.registerTypeAdapter(TicketTierNameDescription.class, TicketTierNameDescription.getDeserializer());
        gsonBuilder.registerTypeAdapter(GuestInOrder.class, new GuestInOrder.GuestInOrderDeserializer());
        gsonBuilder.registerTypeAdapter(DisplayNameMap.class, new DisplayNameMap.DisplayNameMapDeserializer());
        gsonBuilder.registerTypeAdapter(MonthlyPaymentAmount.class, new MonthlyPaymentAmount.MonthlyPaymentAmountDeserializer());
        gsonBuilder.registerTypeAdapter(ConfirmationPolicy.class, new ConfirmationPolicy.ConfirmationPolicyDeserializer());
        gsonBuilder.registerTypeAdapter(Address.class, new TicketSalesAddressDeserializer());
        return new InterfaceC13334f.a(gsonBuilder);
    }

    public static String getLastSegment(String str) {
        try {
            String path = new URI(str).getPath();
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (URISyntaxException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void parseTicketEntitlements(JsonDeserializationContext jsonDeserializationContext, TicketOrderResponse ticketOrderResponse, JsonObject jsonObject) {
        ticketOrderResponse.ticketEntitlements = Sets.m69466m();
        Iterator<JsonElement> it = jsonObject.getAsJsonArray("ticketAssignments").iterator();
        while (it.hasNext()) {
            try {
                TicketEntitlement ticketEntitlement = (TicketEntitlement) jsonDeserializationContext.deserialize(it.next(), TicketEntitlementImpl.class);
                if (ticketEntitlement != null) {
                    ticketOrderResponse.ticketEntitlements.add(ticketEntitlement);
                }
            } catch (Exception unused) {
            }
        }
    }

    public Optional<Calendar> getBookingDate() {
        return Optional.fromNullable(this.bookingDate);
    }

    public BookingStatus getBookingStatus() {
        return this.bookingStatus;
    }

    public String getBookingTermsAndConditionsId() {
        return this.bookingTermsAndConditions;
    }

    public Optional<String> getCalendarIds() {
        return this.calendarIds;
    }

    public Optional<Map<VisitDayName, Name>> getCalendarNames() {
        return Optional.fromNullable(this.calendarNames);
    }

    public Optional<TieredTicketCalendarMap> getCalendars() {
        return Optional.fromNullable(this.tieredTicketCalendarMap);
    }

    public String getConfirmationEmail() {
        return this.confirmationEmail;
    }

    public Optional<List<ConfirmationPolicy>> getConfirmationPolicies() {
        return Optional.fromNullable(this.confirmationPolicies);
    }

    public String getFlexPassTermsAndCondition() {
        return this.flexPassTermsAndCondition;
    }

    @Nullable
    public Map<String, GuestInOrder> getGuestsInOrder() {
        return this.guestsInOrder;
    }

    public Optional<MonthlyPaymentAmount> getMonthlyPaymentAmount() {
        return Optional.fromNullable(this.monthlyPaymentAmount);
    }

    public String[] getNameTitles() {
        return (String[]) this.nameTitles.clone();
    }

    public String getOrderId() {
        return this.f44022id;
    }

    public ImmutableList<OrderItem> getOrderItems() {
        return ImmutableList.copyOf((Collection) this.orderItems);
    }

    public Optional<PaymentUsed> getPaymentUsed() {
        return Optional.fromNullable(this.paymentUsedMasked);
    }

    public Pricing getPricing() {
        return this.pricing;
    }

    public DeliveryOption getSelectedDeliveryOption() {
        return this.selectedDeliveryOption;
    }

    public Optional<Calendar> getSellableOnDate() {
        return Optional.fromNullable(this.sellableOnDate);
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getSupportedDeliveryOptionsLink() {
        return this.supportedDeliveryOptionsLink;
    }

    public Optional<ImmutableList<TicketEntitlement>> getTicketEntitlements() {
        LinkedHashSet<TicketEntitlement> linkedHashSet = this.ticketEntitlements;
        return (linkedHashSet == null || linkedHashSet.isEmpty()) ? Optional.absent() : Optional.m68592of(ImmutableList.copyOf((Collection) this.ticketEntitlements));
    }

    public int getTicketsQuantity() {
        Iterator<OrderItem> it = this.orderItems.iterator();
        int quantity = 0;
        while (it.hasNext()) {
            quantity += it.next().getQuantity();
        }
        return quantity;
    }

    public String getTitleGender(String str) {
        return this.titleToGenderMap.get(str);
    }

    public Map<String, String> getTitleToGenderMap() {
        return Maps.m69382s(this.titleToGenderMap);
    }

    public Optional<TotalDepositDue> getTotalDepositDue() {
        return Optional.fromNullable(this.totalDepositDue);
    }

    public int getTotalNumberOfItems() {
        return this.totalNumberOfItems;
    }

    public boolean isGuestOnMonthlyPaymentPlan() {
        return (this.monthlyPaymentAmount == null || this.totalDepositDue == null) ? false : true;
    }

    private TicketOrderResponse() {
        this.titleToGenderMap = Maps.m69381r();
        this.calendarIds = Optional.absent();
    }
}