package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models;

import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.calendar.TieredTicketCalendarMap;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.VisitDayName;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.DeliveryOption;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.PaymentUsed;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlement;
import com.disney.wdpro.ticket_sales_booking_lib.business.calendar.Name;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.TicketOrderResponse;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@SuppressFBWarnings({"NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE"})
/* loaded from: classes18.dex */
public final class PurchaseConfirmation implements Serializable {
    private static final long serialVersionUID = 1;
    private final Price amountPaid;
    private final Calendar bookingDate;
    private final BookingStatus bookingStatus;
    private final Optional<Map<VisitDayName, Name>> calendarNamesMap;
    private final String confirmationEmail;
    private final Optional<Set<String>> confirmationNumbers;
    private final Optional<List<ConfirmationPolicy>> confirmationPolicy;
    private final Price monthlyAmount;
    private final String orderId;
    private final ImmutableList<TicketOrderResponse.OrderItem> orderItems;
    private final Optional<PaymentUsed> paymentCard;
    private final Optional<DeliveryOption> selectedDeliveryOption;
    private final Optional<ImmutableList<TicketEntitlement>> ticketEntitlements;
    private final Optional<TieredTicketCalendarMap> tieredTicketCalendarMap;

    public static class Builder {
        private Price amountPaid;
        private Calendar bookingDate;
        private BookingStatus bookingStatus;
        private Optional<Map<VisitDayName, Name>> calendarNamesMap;
        private String confirmationEmail;
        private Optional<Set<String>> confirmationNumbers;
        private Optional<List<ConfirmationPolicy>> confirmationPolicy;
        private Price monthlyAmount;
        private String orderId;
        private ImmutableList<TicketOrderResponse.OrderItem> orderItems;
        private Optional<PaymentUsed> paymentCard;
        private Optional<DeliveryOption> selectedDeliveryOption;
        private Optional<ImmutableList<TicketEntitlement>> ticketEntitlements;
        private Optional<TieredTicketCalendarMap> tieredTicketCalendarMap;

        private void createListOfConfirmationNumbers() {
            HashSet hashSetM69460g = Sets.m69460g();
            AbstractC22726b3<TicketOrderResponse.OrderItem> it = this.orderItems.iterator();
            while (it.hasNext()) {
                TicketOrderResponse.OrderItem next = it.next();
                if (next.getConfirmationNumber().isPresent()) {
                    hashSetM69460g.add(next.getConfirmationNumber().get());
                }
            }
            this.confirmationNumbers = Optional.m68592of(hashSetM69460g);
        }

        public PurchaseConfirmation build() {
            C22462m.m68685q(this.selectedDeliveryOption, "selectedDeliveryOption == null");
            C22462m.m68685q(this.paymentCard, "paymentCard == null");
            C22462m.m68685q(this.amountPaid, "amountPaid == null");
            C22462m.m68685q(this.bookingDate, "bookingDate == null");
            C22462m.m68685q(this.bookingStatus, "bookingStatus == null");
            C22462m.m68685q(this.ticketEntitlements, "ticketEntitlements == null");
            C22462m.m68673e(!C22466q.m68722b(this.confirmationEmail), "confirmationEmail is null or empty");
            C22462m.m68673e(!C22466q.m68722b(this.orderId), "order id is null or empty");
            C22462m.m68685q(this.tieredTicketCalendarMap, "tieredTicketCalendarMap == null");
            C22462m.m68685q(this.orderItems, "orderItems == null");
            C22462m.m68685q(this.calendarNamesMap, "calendarNamesMap == null");
            createListOfConfirmationNumbers();
            return new PurchaseConfirmation(this);
        }

        public Builder setAmountPaid(Price price) {
            this.amountPaid = price;
            return this;
        }

        public Builder setBookingDate(Calendar calendar) {
            this.bookingDate = calendar;
            return this;
        }

        public Builder setBookingStatus(BookingStatus bookingStatus) {
            this.bookingStatus = bookingStatus;
            return this;
        }

        public Builder setCalendarNamesMap(@Nullable Map<VisitDayName, Name> map) {
            this.calendarNamesMap = Optional.fromNullable(map);
            return this;
        }

        public Builder setConfirmationEmail(String str) {
            this.confirmationEmail = str;
            return this;
        }

        public Builder setConfirmationPolicy(@Nullable List<ConfirmationPolicy> list) {
            this.confirmationPolicy = Optional.fromNullable(list);
            return this;
        }

        public Builder setMonthlyPrice(Price price) {
            this.monthlyAmount = price;
            return this;
        }

        public Builder setOrderId(String str) {
            this.orderId = str;
            return this;
        }

        public Builder setOrderItems(ImmutableList<TicketOrderResponse.OrderItem> immutableList) {
            this.orderItems = immutableList;
            return this;
        }

        public Builder setPaymentCard(@Nullable PaymentUsed paymentUsed) {
            this.paymentCard = Optional.fromNullable(paymentUsed);
            return this;
        }

        public Builder setSelectedDeliveryOption(@Nullable DeliveryOption deliveryOption) {
            this.selectedDeliveryOption = Optional.fromNullable(deliveryOption);
            return this;
        }

        public Builder setTicketEntitlements(@Nullable ImmutableList<TicketEntitlement> immutableList) {
            this.ticketEntitlements = Optional.fromNullable(immutableList);
            return this;
        }

        public Builder setTieredTicketCalendarMap(@Nullable TieredTicketCalendarMap tieredTicketCalendarMap) {
            this.tieredTicketCalendarMap = Optional.fromNullable(tieredTicketCalendarMap);
            return this;
        }
    }

    public Price getAmountPaid() {
        return this.amountPaid;
    }

    public Calendar getBookingDate() {
        return Calendar.getInstance(this.bookingDate.getTimeZone());
    }

    public Optional<Map<VisitDayName, Name>> getCalendarNamesMap() {
        return this.calendarNamesMap;
    }

    public String getConfirmationEmail() {
        return this.confirmationEmail;
    }

    public Optional<Set<String>> getConfirmationNumbers() {
        return this.confirmationNumbers;
    }

    public Optional<List<ConfirmationPolicy>> getConfirmationPolicy() {
        return this.confirmationPolicy.isPresent() ? this.confirmationPolicy : Optional.absent();
    }

    public Optional<String> getFinePrint() {
        return this.selectedDeliveryOption.isPresent() ? this.selectedDeliveryOption.get().getFinePrint() : Optional.absent();
    }

    @Nullable
    public Price getMonthlyAmount() {
        return this.monthlyAmount;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public ImmutableList<TicketOrderResponse.OrderItem> getOrderItems() {
        return this.orderItems;
    }

    public BookingStatus getOrderStatus() {
        return this.bookingStatus;
    }

    public Optional<PaymentUsed> getPaymentUsed() {
        return this.paymentCard;
    }

    public Optional<ImmutableList<TicketEntitlement>> getTicketEntitlements() {
        return (!this.ticketEntitlements.isPresent() || this.ticketEntitlements.get().isEmpty()) ? Optional.absent() : this.ticketEntitlements;
    }

    public Optional<TieredTicketCalendarMap> getTieredTicketCalendarMap() {
        return this.tieredTicketCalendarMap;
    }

    public Optional<DeliveryOption.DisplayDeliveryMethodDescription> getWillCallDeliveryMethodDescription() {
        return this.selectedDeliveryOption.isPresent() ? Optional.fromNullable(this.selectedDeliveryOption.get().getDisplayDeliveryMethodDescriptionMobile()) : Optional.absent();
    }

    public boolean isGuestOnMonthlyPlan() {
        return this.monthlyAmount != null;
    }

    private PurchaseConfirmation(Builder builder) {
        this.selectedDeliveryOption = builder.selectedDeliveryOption;
        this.confirmationNumbers = builder.confirmationNumbers;
        this.paymentCard = builder.paymentCard;
        this.amountPaid = builder.amountPaid;
        this.bookingDate = builder.bookingDate;
        this.bookingStatus = builder.bookingStatus;
        this.ticketEntitlements = builder.ticketEntitlements;
        this.confirmationEmail = builder.confirmationEmail;
        this.orderId = builder.orderId;
        this.tieredTicketCalendarMap = builder.tieredTicketCalendarMap;
        this.orderItems = builder.orderItems;
        this.calendarNamesMap = builder.calendarNamesMap;
        this.monthlyAmount = builder.monthlyAmount;
        this.confirmationPolicy = builder.confirmationPolicy;
    }
}