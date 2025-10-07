package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.annualPass;

import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNameMap;
import com.google.common.base.Optional;
import com.google.gson.annotations.SerializedName;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes18.dex */
public final class AnnualPassOrderItemComponent implements ApOrderItemComponent {

    @SerializedName("annualpass")
    private AnnualPassItem annualPass;

    public static final class AnnualPassItem implements Serializable {
        private static final long serialVersionUID = 1;
        private Pricing baseUnitPrice;
        private Price deposit;
        private DisplayNameMap names;
        private boolean paymentPlan;
        private Price pricePerMonth;

        @SerializedName("id")
        private String productInstanceId;
        private int quantity;

        @SerializedName("ticketUpgradeData")
        private Map<String, TicketUpgradeData> ticketUpgradeDataMap;

        @SuppressFBWarnings
        public static final class TicketUpgradeData implements Serializable {
            private static final long serialVersionUID = 1;
            private Price deposit;
            private String expirationDate;
            private Price pricePerMonth;
            private Pricing unitPrice;

            private TicketUpgradeData() {
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && TicketUpgradeData.class == obj.getClass()) {
                    TicketUpgradeData ticketUpgradeData = (TicketUpgradeData) obj;
                    if (Objects.equals(this.deposit, ticketUpgradeData.deposit) && Objects.equals(this.pricePerMonth, ticketUpgradeData.pricePerMonth) && Objects.equals(this.unitPrice, ticketUpgradeData.unitPrice)) {
                        return true;
                    }
                }
                return false;
            }

            public Price getDeposit() {
                return this.deposit;
            }

            public String getExpirationDate() throws ParseException {
                Date date;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM dd, yyyy");
                try {
                    date = simpleDateFormat.parse(this.expirationDate);
                } catch (ParseException e10) {
                    e10.printStackTrace();
                    date = null;
                }
                return simpleDateFormat2.format(date);
            }

            public Price getPricePerMonth() {
                return this.pricePerMonth;
            }

            public Pricing getUnitPrice() {
                return this.unitPrice;
            }

            public int hashCode() {
                return Objects.hash(this.deposit, this.pricePerMonth, this.unitPrice);
            }

            public String toString() {
                return String.format(TicketUpgradeData.class.getSimpleName() + ": deposit[%s] pricePerMonth[%s] unitPrice[%s] expirationDate[%s]", this.deposit, this.pricePerMonth, this.unitPrice, this.expirationDate);
            }
        }

        private AnnualPassItem() {
        }

        public String toString() {
            return new StringBuilder(String.format(AnnualPassItem.class.getSimpleName() + ": productInstanceId[%s] quantity[%s] paymentPlan[%s] names[%s] deposit[%s] pricePerMonth[%s] unitPrice[%s] ticketUpgradeDataMap[%s]", this.productInstanceId, Integer.valueOf(this.quantity), Boolean.valueOf(this.paymentPlan), this.names, this.deposit, this.pricePerMonth, this.baseUnitPrice, this.ticketUpgradeDataMap)).toString();
        }
    }

    private AnnualPassOrderItemComponent() {
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.OrderItemComponent
    public Optional<String> getCalendarId() {
        return Optional.absent();
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.annualPass.ApOrderItemComponent
    public Price getDeposit() {
        return this.annualPass.deposit;
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.OrderItemComponent
    public String getItemName() {
        return this.annualPass.names == null ? "" : DisplayNameMap.DisplayName.getString(this.annualPass.names.getName(DisplayNameMap.KEY_PRODUCT_TICKET_BRICK_AGEGROUP_LABEL), DisplayNameMap.Type.PLAIN_TEXT);
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.annualPass.ApOrderItemComponent
    public Price getPricePerMonth() {
        return this.annualPass.pricePerMonth;
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.OrderItemComponent
    public Set<String> getProductInstanceIds() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.annualPass.productInstanceId);
        return hashSet;
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.OrderItemComponent
    public int getQuantity() {
        return this.annualPass.quantity;
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.annualPass.ApOrderItemComponent
    public Map<String, AnnualPassItem.TicketUpgradeData> getTicketUpgradeDataMap() {
        return this.annualPass.ticketUpgradeDataMap;
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.annualPass.ApOrderItemComponent
    public Pricing getUnitPrice() {
        return this.annualPass.baseUnitPrice;
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.annualPass.ApOrderItemComponent
    public boolean isPaymentPlan() {
        return this.annualPass.paymentPlan;
    }

    public String toString() {
        return String.format(AnnualPassOrderItemComponent.class.getSimpleName() + ": annualPassItem[%s]", this.annualPass);
    }
}