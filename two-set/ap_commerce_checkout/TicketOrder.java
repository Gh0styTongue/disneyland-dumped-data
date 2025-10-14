package com.disney.wdpro.ap_commerce_checkout;

import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.TotalDepositDue;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.MonthlyPaymentAmount;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes23.dex */
public final class TicketOrder {
    private final boolean guestOnMonthlyPaymentPlan;
    private final MonthlyPaymentAmount monthlyPaymentAmount;
    private final Pricing pricing;
    private final List<TicketOrderItem> ticketOrderItemList;
    private final TotalDepositDue totalDepositDue;

    public static class Builder {
        private boolean guestOnMonthlyPaymentPlan;
        private MonthlyPaymentAmount monthlyPaymentAmount;
        private Pricing pricing;
        private List<TicketOrderItem> ticketOrderItemList = new ArrayList();
        private TotalDepositDue totalDepositDue;

        public TicketOrder build() {
            return new TicketOrder(this);
        }

        public Builder guestOnMonthlyPaymentPlan(boolean z10) {
            this.guestOnMonthlyPaymentPlan = z10;
            return this;
        }

        public Builder monthlyPaymentAmount(MonthlyPaymentAmount monthlyPaymentAmount) {
            this.monthlyPaymentAmount = monthlyPaymentAmount;
            return this;
        }

        public Builder pricing(Pricing pricing) {
            this.pricing = pricing;
            return this;
        }

        public Builder ticketOrderItemList(List<TicketOrderItem> list) {
            this.ticketOrderItemList = list;
            return this;
        }

        public Builder totalDepositDue(TotalDepositDue totalDepositDue) {
            this.totalDepositDue = totalDepositDue;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public MonthlyPaymentAmount getMonthlyPaymentAmount() {
        return this.monthlyPaymentAmount;
    }

    public Pricing getPricing() {
        return this.pricing;
    }

    public ImmutableList<TicketOrderItem> getTicketOrderItemList() {
        return ImmutableList.copyOf((Collection) this.ticketOrderItemList);
    }

    public TotalDepositDue getTotalDepositDue() {
        return this.totalDepositDue;
    }

    public boolean isGuestOnMonthlyPaymentPlan() {
        return this.guestOnMonthlyPaymentPlan;
    }

    private TicketOrder(Builder builder) {
        this.pricing = builder.pricing;
        this.monthlyPaymentAmount = builder.monthlyPaymentAmount;
        this.totalDepositDue = builder.totalDepositDue;
        this.guestOnMonthlyPaymentPlan = builder.guestOnMonthlyPaymentPlan;
        this.ticketOrderItemList = builder.ticketOrderItemList;
    }
}