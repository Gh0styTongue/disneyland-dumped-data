package com.disney.wdpro.ap_commerce_checkout.p066ui;

import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.google.common.base.C22462m;

/* loaded from: classes23.dex */
public final class StringLegalCopyConfig {
    private String legalStringCopy;
    private boolean saveAndShareEnabled;
    private boolean screenHeaderShown;
    private TicketOrderForm ticketOrderForm;
    private String title;

    public static class Builder {
        private String legalStringCopy;
        private boolean saveAndShareEnabled;
        private boolean screenHeaderShown = true;
        private TicketOrderForm ticketOrderForm;
        private String title;

        public StringLegalCopyConfig build() {
            C22462m.m68685q(this.title, "The field title is required by StringLegalCopyFragment");
            C22462m.m68685q(this.legalStringCopy, "The field legalStringCopy is required by StringLegalCopyFragment");
            C22462m.m68685q(this.ticketOrderForm, "The field ticketOrderForm is required by StringLegalCopyFragment");
            return new StringLegalCopyConfig(this);
        }

        public Builder enableSaveAndShare() {
            this.saveAndShareEnabled = true;
            return this;
        }

        public Builder hideScreenHeader() {
            this.screenHeaderShown = false;
            return this;
        }

        public Builder legalStringCopy(String str) {
            this.legalStringCopy = str;
            return this;
        }

        public Builder ticketOrderForm(TicketOrderForm ticketOrderForm) {
            this.ticketOrderForm = ticketOrderForm;
            return this;
        }

        public Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getLegalStringCopy() {
        return this.legalStringCopy;
    }

    public TicketOrderForm getTicketOrderForm() {
        return this.ticketOrderForm;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isSaveAndShareEnabled() {
        return this.saveAndShareEnabled;
    }

    public boolean isScreenHeaderShown() {
        return this.screenHeaderShown;
    }

    private StringLegalCopyConfig(Builder builder) {
        this.title = builder.title;
        this.legalStringCopy = builder.legalStringCopy;
        this.ticketOrderForm = builder.ticketOrderForm;
        this.saveAndShareEnabled = builder.saveAndShareEnabled;
        this.screenHeaderShown = builder.screenHeaderShown;
    }
}