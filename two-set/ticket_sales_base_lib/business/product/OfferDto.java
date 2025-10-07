package com.disney.wdpro.ticket_sales_base_lib.business.product;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@SuppressFBWarnings
/* loaded from: classes18.dex */
public class OfferDto {
    private List<Integer> availableNumDays;
    private String discountGroupId;
    private String displayName;
    private boolean isSpecialOffer;
    private String offerDetails;
    private int priorityOrder;
    private Map<String, ProductTypeDto> productTypes;
    private List<TicketDayDto> ticketDays;

    public static class ProductTypeDto {
        private List<String> featureIds;

        /* renamed from: id */
        private String f43910id;

        public List<String> getFeatureIds() {
            return this.featureIds;
        }

        public String getId() {
            return this.f43910id;
        }
    }

    public static class TicketDayDto {
        private String calendarId;
        private int day;
        private boolean isTiered;
        private List<String> policyIds;
        private StartingFromPriceDto startingFromPrice;

        public static class StartingFromPriceDto {
            private String currency;
            private BigDecimal pricePerDay;
            private BigDecimal subtotal;
            private BigDecimal tax;
            private BigDecimal total;

            public String getCurrency() {
                return this.currency;
            }

            public BigDecimal getPricePerDay() {
                return this.pricePerDay;
            }

            public BigDecimal getSubtotal() {
                return this.subtotal;
            }

            public BigDecimal getTax() {
                return this.tax;
            }

            public BigDecimal getTotal() {
                return this.total;
            }
        }

        public String getCalendarId() {
            return this.calendarId;
        }

        public int getDay() {
            return this.day;
        }

        public List<String> getPolicyIds() {
            return this.policyIds;
        }

        public StartingFromPriceDto getStartingFromPriceDto() {
            return this.startingFromPrice;
        }

        public boolean isTiered() {
            return this.isTiered;
        }
    }

    public List<Integer> getAvailableNumDays() {
        return this.availableNumDays;
    }

    public String getDiscountGroupId() {
        return this.discountGroupId;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getOfferDetails() {
        return this.offerDetails;
    }

    public int getPriorityOrder() {
        return this.priorityOrder;
    }

    public Map<String, ProductTypeDto> getProductTypeDtoMap() {
        return this.productTypes;
    }

    public List<TicketDayDto> getTicketDaysDtoList() {
        return this.ticketDays;
    }

    public boolean isSpecialOffer() {
        return this.isSpecialOffer;
    }
}