package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.google.common.base.C22462m;
import com.google.common.collect.ImmutableSet;
import java.util.Calendar;

/* loaded from: classes18.dex */
public final class TicketProductParameters {
    private final ImmutableSet<AddOnOption> addOnOptionsSet;
    private String discountGroupType;
    private final int numAdultTickets;
    private final int numAllAgesTickets;
    private final int numChildTickets;
    private final int numSeniorTickets;
    private final int numberOfDays;
    private final Calendar selectedDate;
    private final String ticketProductType;
    private final String tier;

    public static class Builder {
        private static final int VALUE_NOT_SET = 0;
        private ImmutableSet<AddOnOption> addOnOptionsSet;
        private String discountGroupType;
        private Calendar selectedDate;
        private TicketProductType ticketProductType;
        private String tier;
        private int numAdultTickets = 0;
        private int numChildTickets = 0;
        private int numAllAgesTickets = 0;
        private int numSeniorTickets = 0;
        private int numberOfDays = 0;
        private final ImmutableSet.C22601a<AddOnOption> addOnOptionsBuilder = ImmutableSet.builder();

        public Builder addAddOnOption(AddOnOption addOnOption) {
            C22462m.m68685q(addOnOption, "addOnOption == null");
            this.addOnOptionsBuilder.mo69029f(addOnOption);
            return this;
        }

        public TicketProductParameters build() throws IllegalArgumentException, NullPointerException {
            C22462m.m68685q(this.ticketProductType, "ticketProductType == null");
            C22462m.m68685q(this.discountGroupType, "discountGroupType == null");
            C22462m.m68673e(this.numAdultTickets >= 0, "numAdultTickets < 0");
            C22462m.m68673e(this.numChildTickets >= 0, "numChildTickets < 0");
            C22462m.m68673e(this.numSeniorTickets >= 0, "numSeniorTickets < 0");
            C22462m.m68673e(this.numAllAgesTickets >= 0, "numAllAgesTickets < 0");
            this.addOnOptionsSet = this.addOnOptionsBuilder.mo69141n();
            return new TicketProductParameters(this);
        }

        public Builder setDiscountGroupType(String str) {
            this.discountGroupType = str;
            return this;
        }

        public Builder setNumAdultTickets(int i10) {
            this.numAdultTickets = i10;
            return this;
        }

        public Builder setNumAllAgesTickets(int i10) {
            this.numAllAgesTickets = i10;
            return this;
        }

        public Builder setNumChildTickets(int i10) {
            this.numChildTickets = i10;
            return this;
        }

        public Builder setNumSeniorTickets(int i10) {
            this.numSeniorTickets = i10;
            return this;
        }

        public Builder setNumberOfDays(int i10) {
            this.numberOfDays = i10;
            return this;
        }

        public Builder setSelectedDate(Calendar calendar) {
            this.selectedDate = calendar;
            return this;
        }

        public Builder setTicketProductType(TicketProductType ticketProductType) {
            this.ticketProductType = ticketProductType;
            return this;
        }

        public Builder setTier(String str) {
            this.tier = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public ImmutableSet<AddOnOption> getAddOnOptions() {
        return this.addOnOptionsSet;
    }

    public String getDiscountGroupType() {
        return this.discountGroupType;
    }

    public int getNumAdultTickets() {
        return this.numAdultTickets;
    }

    public int getNumAllAgesTickets() {
        return this.numAllAgesTickets;
    }

    public int getNumChildTickets() {
        return this.numChildTickets;
    }

    public int getNumSeniorTickets() {
        return this.numSeniorTickets;
    }

    public int getNumberOfDays() {
        return this.numberOfDays;
    }

    public Calendar getSelectedDate() {
        return this.selectedDate;
    }

    public String getTicketProductType() {
        return this.ticketProductType;
    }

    public String getTier() {
        return this.tier;
    }

    public void setDiscountGroupType(String str) {
        this.discountGroupType = str;
    }

    public String toString() {
        return String.format("[DG[%s],c[%d],a[%d],%dD,P[%s],AO[%s],T[%s]", this.discountGroupType, Integer.valueOf(this.numChildTickets), Integer.valueOf(this.numAdultTickets), Integer.valueOf(this.numberOfDays), this.ticketProductType, this.addOnOptionsSet, this.tier);
    }

    private TicketProductParameters(Builder builder) {
        this.ticketProductType = builder.ticketProductType.getProductId();
        this.discountGroupType = builder.discountGroupType;
        this.numAdultTickets = builder.numAdultTickets;
        this.numChildTickets = builder.numChildTickets;
        this.numSeniorTickets = builder.numSeniorTickets;
        this.numAllAgesTickets = builder.numAllAgesTickets;
        this.numberOfDays = builder.numberOfDays;
        this.addOnOptionsSet = builder.addOnOptionsSet;
        this.tier = builder.tier;
        this.selectedDate = builder.selectedDate;
    }
}