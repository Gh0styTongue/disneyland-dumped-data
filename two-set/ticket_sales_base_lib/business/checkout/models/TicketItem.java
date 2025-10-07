package com.disney.wdpro.ticket_sales_base_lib.business.checkout.models;

import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AffiliationType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AgeGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DemographicData;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes18.dex */
public class TicketItem implements Serializable {
    private static AtomicInteger idCounter = new AtomicInteger(0);
    private static final long serialVersionUID = 1;
    private final Optional<AffiliationType> affiliationType;
    private final AgeGroup ageGroup;
    private final String avatarImageUrl;
    private final String birthdate;
    private final String categoryId;
    private final Optional<DemographicData> demographicData;
    private final String dtiStoreId;
    private final String entitlementId;
    private final String guestId;
    private final String guestIdType;
    private final Optional<PersonName> guestName;
    private final int localId = idCounter.get();
    private final String mediaId;
    private final Pricing pricing;
    private final String productInstanceId;
    private final String sku;
    private final String xid;

    public static class TicketItemBuilder {
        private AffiliationType affiliationType;
        private AgeGroup ageGroup;
        private String avatarImageUrl;
        private String birthdate;
        private String categoryId;
        private DemographicData demographicData;
        private String dtiStoreId;
        private String entitlementId;
        private String guestId;
        private String guestIdType;
        private PersonName guestName;
        private String mediaId;
        private Pricing pricing;
        private String productInstanceId;
        private String sku;
        private String xid;

        public TicketItem build() {
            C22462m.m68673e((C22466q.m68722b(this.productInstanceId) && C22466q.m68722b(this.sku)) ? false : true, "ProductInstanceId or sku needed");
            return new TicketItem(this);
        }

        public TicketItemBuilder withAffiliationType(AffiliationType affiliationType) {
            this.affiliationType = affiliationType;
            return this;
        }

        public TicketItemBuilder withAgeGroup(AgeGroup ageGroup) {
            this.ageGroup = ageGroup;
            return this;
        }

        public TicketItemBuilder withAvatarImageUrl(String str) {
            this.avatarImageUrl = str;
            return this;
        }

        public TicketItemBuilder withBirthdate(String str) {
            this.birthdate = str;
            return this;
        }

        public TicketItemBuilder withCategoryId(String str) {
            this.categoryId = str;
            return this;
        }

        public TicketItemBuilder withDemographicData(DemographicData demographicData) {
            this.demographicData = demographicData;
            return this;
        }

        public TicketItemBuilder withDtiStoreId(String str) {
            this.dtiStoreId = str;
            return this;
        }

        public TicketItemBuilder withEntitlementId(String str) {
            this.entitlementId = str;
            return this;
        }

        public TicketItemBuilder withGuestInfo(String str, String str2) {
            this.guestId = str2;
            this.guestIdType = str;
            return this;
        }

        public TicketItemBuilder withGuestName(PersonName personName) {
            this.guestName = personName;
            return this;
        }

        public TicketItemBuilder withMediaId(String str) {
            this.mediaId = str;
            return this;
        }

        public TicketItemBuilder withPricing(Pricing pricing) {
            this.pricing = pricing;
            return this;
        }

        public TicketItemBuilder withProductInstanceId(String str) {
            this.productInstanceId = str;
            return this;
        }

        public TicketItemBuilder withSku(String str) {
            this.sku = str;
            return this;
        }

        public TicketItemBuilder withXid(String str) {
            this.xid = str;
            return this;
        }
    }

    public TicketItem(TicketItemBuilder ticketItemBuilder) {
        this.productInstanceId = ticketItemBuilder.productInstanceId;
        this.sku = ticketItemBuilder.sku;
        this.dtiStoreId = ticketItemBuilder.dtiStoreId;
        this.categoryId = ticketItemBuilder.categoryId;
        this.mediaId = ticketItemBuilder.mediaId;
        this.pricing = ticketItemBuilder.pricing;
        this.entitlementId = ticketItemBuilder.entitlementId;
        this.guestId = ticketItemBuilder.guestId;
        this.guestIdType = ticketItemBuilder.guestIdType;
        this.avatarImageUrl = ticketItemBuilder.avatarImageUrl;
        this.guestName = Optional.fromNullable(ticketItemBuilder.guestName);
        this.ageGroup = ticketItemBuilder.ageGroup;
        this.birthdate = ticketItemBuilder.birthdate;
        this.demographicData = Optional.fromNullable(ticketItemBuilder.demographicData);
        this.affiliationType = Optional.fromNullable(ticketItemBuilder.affiliationType);
        this.xid = ticketItemBuilder.xid;
        updateId();
    }

    private static void updateId() {
        idCounter.incrementAndGet();
    }

    public Optional<AffiliationType> getAffiliationType() {
        return this.affiliationType;
    }

    public AgeGroup getAgeGroup() {
        return this.ageGroup;
    }

    public String getAvatarImageUrl() {
        return this.avatarImageUrl;
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public Optional<DemographicData> getDemographicData() {
        return this.demographicData;
    }

    public String getDtiStoreId() {
        return this.dtiStoreId;
    }

    public String getEntitlementId() {
        return this.entitlementId;
    }

    public String getGuestId() {
        return this.guestId;
    }

    public String getGuestIdType() {
        return this.guestIdType;
    }

    public Optional<PersonName> getGuestName() {
        return this.guestName;
    }

    public int getLocalId() {
        return this.localId;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public Pricing getPricing() {
        return this.pricing;
    }

    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public String getSku() {
        return this.sku;
    }

    public String getXid() {
        return this.xid;
    }

    public String toString() {
        return String.format("local id = %d, product instance id = %s, dti store id = %s", Integer.valueOf(this.localId), this.productInstanceId, this.dtiStoreId);
    }
}