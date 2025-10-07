package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.generalSales;

import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.Links;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.OrderItemComponent;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.TicketOrderResponse;
import com.google.common.base.Optional;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressFBWarnings
/* loaded from: classes18.dex */
public final class TicketOrderItemComponent implements OrderItemComponent {
    private static final long serialVersionUID = 1;
    private Ticket ticket;

    @SuppressFBWarnings
    private static final class Ticket implements Serializable {
        private static final long serialVersionUID = 1;
        private List<ProductEntry> products;

        @SuppressFBWarnings
        private static final class ProductEntry implements Serializable {
            private static final long serialVersionUID = 1;
            private String calendarId;
            private Links links;
            private int quantity;

            private ProductEntry() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public Optional<String> getCalendarId() {
                return Optional.fromNullable(this.calendarId);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public String getInstanceId() {
                if (this.links.getSelfLink().isPresent() && this.links.getSelfLink().get().getHrefUrl().isPresent()) {
                    return TicketOrderResponse.getLastSegment(this.links.getSelfLink().get().getHrefUrl().get());
                }
                return null;
            }
        }

        private Ticket() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ImmutableList<ProductEntry> getProducts() {
            return ImmutableList.copyOf((Collection) this.products);
        }
    }

    private TicketOrderItemComponent() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.OrderItemComponent
    public Optional<String> getCalendarId() {
        return ((Ticket.ProductEntry) this.ticket.getProducts().get(0)).getCalendarId();
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.OrderItemComponent
    public String getItemName() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.OrderItemComponent
    public Set<String> getProductInstanceIds() {
        HashSet hashSetM69460g = Sets.m69460g();
        ImmutableList products = this.ticket.getProducts();
        products.size();
        AbstractC22726b3 it = products.iterator();
        while (it.hasNext()) {
            hashSetM69460g.add(((Ticket.ProductEntry) it.next()).getInstanceId());
        }
        return hashSetM69460g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.OrderItemComponent
    public int getQuantity() {
        AbstractC22726b3 it = this.ticket.getProducts().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((Ticket.ProductEntry) it.next()).quantity;
        }
        return i10;
    }
}