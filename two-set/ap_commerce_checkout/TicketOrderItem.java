package com.disney.wdpro.ap_commerce_checkout;

import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes23.dex */
public final class TicketOrderItem {
    private final String displayName;
    private final List<PriceDetail> priceDetailList;

    public static class Builder {
        private String displayName;
        private List<PriceDetail> priceDetailList = new ArrayList();

        public Builder addPriceDetailLine(Price price, Price price2, Pricing pricing, int i10) {
            PriceDetail priceDetail = new PriceDetail();
            priceDetail.deposit = price;
            priceDetail.pricePerMonth = price2;
            priceDetail.unitPrice = pricing;
            priceDetail.quantity = i10;
            this.priceDetailList.add(priceDetail);
            return this;
        }

        public TicketOrderItem build() {
            return new TicketOrderItem(this);
        }

        public Builder displayName(String str) {
            this.displayName = str;
            return this;
        }
    }

    public static final class PriceDetail {
        private Price deposit;
        private Price pricePerMonth;
        private int quantity;
        private Pricing unitPrice;

        public Price getDeposit() {
            return this.deposit;
        }

        public Price getPricePerMonth() {
            return this.pricePerMonth;
        }

        public int getQuantity() {
            return this.quantity;
        }

        public Pricing getUnitPrice() {
            return this.unitPrice;
        }

        private PriceDetail() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public ImmutableList<PriceDetail> getPriceDetailList() {
        return ImmutableList.copyOf((Collection) this.priceDetailList);
    }

    private TicketOrderItem(Builder builder) {
        this.displayName = builder.displayName;
        this.priceDetailList = builder.priceDetailList;
    }
}