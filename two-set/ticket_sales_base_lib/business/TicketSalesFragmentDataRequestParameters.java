package com.disney.wdpro.ticket_sales_base_lib.business;

import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes18.dex */
public final class TicketSalesFragmentDataRequestParameters {
    private final List<String> affiliationType;
    private final DestinationId destinationId;
    private final ProductCategoryDetails productCategoryDetails;
    private final long requestId;
    private final Calendar sellableOnDate;
    private final String sessionId;
    private final WebStoreId webStoreId;

    public static final class Builder {
        private List<String> affiliationType;
        private DestinationId destinationId;
        private ProductCategoryDetails productCategoryDetails;
        private long requestId;
        private Calendar sellableOnDate;
        private String sessionId;
        private WebStoreId webStoreId;

        Builder() {
        }

        public TicketSalesFragmentDataRequestParameters build() {
            return new TicketSalesFragmentDataRequestParameters(this);
        }

        public Builder setAffiliationType(List<String> list) {
            this.affiliationType = list;
            return this;
        }

        public Builder setDestinationId(DestinationId destinationId) {
            this.destinationId = destinationId;
            return this;
        }

        public Builder setProductCategory(ProductCategoryDetails productCategoryDetails) {
            this.productCategoryDetails = productCategoryDetails;
            return this;
        }

        public Builder setRequestId(long j10) {
            this.requestId = j10;
            return this;
        }

        public Builder setSellableOnDate(Calendar calendar) {
            this.sellableOnDate = calendar;
            return this;
        }

        public Builder setSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        public Builder setWebStoreId(WebStoreId webStoreId) {
            this.webStoreId = webStoreId;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<String> getAffiliationType() {
        return this.affiliationType;
    }

    public DestinationId getDestinationId() {
        return this.destinationId;
    }

    public ProductCategoryDetails getProductCategory() {
        return this.productCategoryDetails;
    }

    public long getRequestId() {
        return this.requestId;
    }

    public Calendar getSellableOnDate() {
        return this.sellableOnDate;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public WebStoreId getWebStoreId() {
        return this.webStoreId;
    }

    private TicketSalesFragmentDataRequestParameters(Builder builder) {
        this.productCategoryDetails = builder.productCategoryDetails;
        this.webStoreId = builder.webStoreId;
        this.destinationId = builder.destinationId;
        this.affiliationType = builder.affiliationType;
        this.sessionId = builder.sessionId;
        this.sellableOnDate = builder.sellableOnDate;
        this.requestId = builder.requestId;
    }
}