package com.disney.wdpro.ticket_sales_booking_lib.business.checkout;

import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.collect.ImmutableList;
import com.google.gson.annotations.SerializedName;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressFBWarnings({"NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS"})
/* loaded from: classes18.dex */
public final class BookingApiCreateOrderRequest {
    private final String destinationId;
    private final boolean paymentPlan;
    private final ImmutableList<ProductEntry> products;

    @SerializedName("swid")
    private final String purchaserSwid;

    @SerializedName("storeId")
    private final String webStoreId;

    public static class Builder {
        private DestinationId destinationId;
        private boolean paymentPlan;
        private ImmutableList<ProductEntry> productEntryList;
        private final ImmutableList.C22583a<ProductEntry> productEntryListBuilder = ImmutableList.builder();
        private String purchaserSwid;
        private String webStoreId;

        public Builder addTicketProduct(String str, String str2, String str3) {
            addTicketProduct(str, 1, str2, str3, null);
            return this;
        }

        public BookingApiCreateOrderRequest build() throws IllegalArgumentException, NullPointerException {
            ImmutableList<ProductEntry> immutableListM69053m = this.productEntryListBuilder.m69053m();
            this.productEntryList = immutableListM69053m;
            C22462m.m68673e(immutableListM69053m.size() > 0, "productEntryList.size() == 0");
            C22462m.m68685q(this.destinationId, "destinationId == null");
            C22462m.m68673e(!C22466q.m68722b(this.webStoreId), "webStoreId null or empty");
            return new BookingApiCreateOrderRequest(this);
        }

        public Builder setDestinationId(DestinationId destinationId) {
            this.destinationId = destinationId;
            return this;
        }

        public Builder setIsGuestOnPaymentPlan(boolean z10) {
            this.paymentPlan = z10;
            return this;
        }

        public Builder setPurchaserSwid(String str) {
            this.purchaserSwid = str;
            return this;
        }

        public Builder setWebStoreId(String str) {
            this.webStoreId = str;
            return this;
        }

        public Builder addTicketProduct(String str, int i10, String str2, String str3) {
            addTicketProduct(str, i10, str2, str3, null);
            return this;
        }

        public Builder addTicketProduct(String str, int i10, String str2, String str3, String str4) {
            addTicketProduct(str, i10, str2, str3, str4, null);
            return this;
        }

        public Builder addTicketProduct(String str, int i10, String str2, String str3, String str4, String str5) {
            addTicketProduct(str, i10, str2, str3, str4, str5, null);
            return this;
        }

        public Builder addTicketProduct(String str, int i10, String str2, String str3, String str4, String str5, String str6) {
            addTicketProduct(str, i10, str2, str3, str4, str5, str6, null, null);
            return this;
        }

        public Builder addTicketProduct(String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            C22462m.m68673e(!C22466q.m68722b(str), "productId == null or empty");
            C22462m.m68673e(i10 > 0, "quantity <= 0");
            this.productEntryListBuilder.mo69026a(new ProductEntry(str, str2, str3, i10, str4, str5, str6, str7, str8));
            return this;
        }
    }

    private static final class ProductEntry {
        private final String avatarImage;

        @SerializedName("contextId")
        private final String bookingContextId;
        private final String categoryId;
        private final String entitlementId;
        private final String guestId;
        private final String guestIdType;

        /* renamed from: id */
        private final String f44020id;
        private List<ImageEntry> images;
        private final int quantity;

        private static final class ImageEntry {
            private final String mediaId;

            private ImageEntry(String str) {
                this.mediaId = str;
            }
        }

        private ProductEntry(String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8) {
            this.images = null;
            this.f44020id = str;
            this.bookingContextId = str2;
            this.categoryId = str3;
            this.quantity = i10;
            this.entitlementId = str5;
            this.avatarImage = str6;
            this.guestId = str7;
            this.guestIdType = str8;
            if (C22466q.m68722b(str4)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            this.images = arrayList;
            arrayList.add(new ImageEntry(str4));
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private BookingApiCreateOrderRequest(Builder builder) {
        this.products = builder.productEntryList;
        this.destinationId = builder.destinationId.getId();
        this.webStoreId = builder.webStoreId;
        this.purchaserSwid = builder.purchaserSwid;
        this.paymentPlan = builder.paymentPlan;
    }
}