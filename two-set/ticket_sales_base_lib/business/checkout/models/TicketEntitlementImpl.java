package com.disney.wdpro.ticket_sales_base_lib.business.checkout.models;

import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNameMap;
import com.google.common.base.Optional;
import com.google.gson.JsonDeserializer;
import edu.umd.cs.findbugs.annotations.SuppressWarnings;
import java.io.Serializable;

@SuppressWarnings(justification = "The fields in this class are written using gson.", value = {"UWF_UNWRITTEN_FIELD", "NP_NULL_PARAM_DEREF"})
/* loaded from: classes18.dex */
public final class TicketEntitlementImpl implements TicketEntitlement, Serializable {
    private static final long serialVersionUID = 1;
    private String barcodeId;
    private String guestName;
    private String participantId;
    private TicketNames ticketNames;

    public static class TicketEntitlementDeserializer implements JsonDeserializer<TicketEntitlementImpl> {
        private static final String BARCODE_ID_KEY = "barcodeId";
        private static final String GUEST_KEY = "guest";
        private static final String GUEST_NAME_KEY = "guestName";
        private static final String PARTICIPANT_ID_KEY = "participantId";
        private static final String TICKET_NAMES_KEY = "ticketNames";
        private static final String VISUALID_KEY = "visualId";

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
        @Override // com.google.gson.JsonDeserializer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlementImpl deserialize(com.google.gson.JsonElement r8, java.lang.reflect.Type r9, com.google.gson.JsonDeserializationContext r10) throws com.google.gson.JsonParseException {
            /*
                r7 = this;
                com.google.gson.JsonObject r7 = r8.getAsJsonObject()
                java.lang.String r8 = "guestName"
                boolean r9 = r7.has(r8)
                r0 = 0
                if (r9 == 0) goto L16
                com.google.gson.JsonElement r8 = r7.get(r8)
                java.lang.String r8 = r8.getAsString()
                goto L32
            L16:
                java.lang.String r8 = "guest"
                boolean r9 = r7.has(r8)
                if (r9 == 0) goto L31
                com.google.gson.JsonElement r8 = r7.get(r8)
                java.lang.Class<com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.Guest> r9 = com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.Guest.class
                java.lang.Object r8 = r10.deserialize(r8, r9)
                com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.Guest r8 = (com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.Guest) r8
                if (r8 == 0) goto L31
                java.lang.String r8 = r8.getGuestName()
                goto L32
            L31:
                r8 = r0
            L32:
                boolean r9 = com.google.common.base.C22466q.m68722b(r8)
                if (r9 != 0) goto L47
                int r9 = r8.length()
                r1 = 56
                int r9 = java.lang.Math.min(r9, r1)
                r1 = 0
                java.lang.String r8 = r8.substring(r1, r9)
            L47:
                r3 = r8
                java.lang.String r8 = "barcodeId"
                boolean r9 = r7.has(r8)
                if (r9 == 0) goto L5a
                com.google.gson.JsonElement r8 = r7.get(r8)
                java.lang.String r8 = r8.getAsString()
            L58:
                r2 = r8
                goto L6c
            L5a:
                java.lang.String r8 = "visualId"
                boolean r9 = r7.has(r8)
                if (r9 == 0) goto L6b
                com.google.gson.JsonElement r8 = r7.get(r8)
                java.lang.String r8 = r8.getAsString()
                goto L58
            L6b:
                r2 = r0
            L6c:
                java.lang.String r8 = "participantId"
                boolean r9 = r7.has(r8)
                if (r9 == 0) goto L7e
                com.google.gson.JsonElement r8 = r7.get(r8)
                java.lang.String r8 = r8.getAsString()
                r4 = r8
                goto L7f
            L7e:
                r4 = r0
            L7f:
                java.lang.String r8 = "ticketNames"
                boolean r9 = r7.has(r8)
                if (r9 == 0) goto L94
                com.google.gson.JsonObject r7 = r7.getAsJsonObject(r8)
                java.lang.Class<com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlementImpl$TicketNames> r8 = com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlementImpl.TicketNames.class
                java.lang.Object r7 = r10.deserialize(r7, r8)
                r0 = r7
                com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlementImpl$TicketNames r0 = (com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlementImpl.TicketNames) r0
            L94:
                r5 = r0
                boolean r7 = com.google.common.base.C22466q.m68722b(r2)
                if (r7 != 0) goto La2
                com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlementImpl r1 = new com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlementImpl
                r6 = 0
                r1.<init>(r2, r3, r4, r5)
                return r1
            La2:
                com.google.gson.JsonParseException r7 = new com.google.gson.JsonParseException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "barcodeId = "
                r8.append(r9)
                r8.append(r2)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlementImpl.TicketEntitlementDeserializer.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext):com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlementImpl");
        }
    }

    public static class TicketNames implements Serializable {
        private static final long serialVersionUID = 1;
        private DisplayNameMap.DisplayName wdproMobileCaption;
        private DisplayNameMap.DisplayName wdproMobileName;
        private DisplayNameMap.DisplayName wdproMobileSubCaption;

        public DisplayNameMap.DisplayName getMobileCaption() {
            return this.wdproMobileCaption;
        }

        public DisplayNameMap.DisplayName getMobileName() {
            return this.wdproMobileName;
        }

        public DisplayNameMap.DisplayName getMobileSubCaption() {
            return this.wdproMobileSubCaption;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketEntitlement)) {
            return false;
        }
        TicketEntitlement ticketEntitlement = (TicketEntitlement) obj;
        String str = this.barcodeId;
        return str != null ? str.equals(ticketEntitlement.getBarcodeId()) : ticketEntitlement.getBarcodeId() == null;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlement
    public String getBarcodeId() {
        return this.barcodeId;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlement
    public String getGuestName() {
        return this.guestName;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlement
    public String getParticipantId() {
        return this.participantId;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlement
    public Optional<DisplayNameMap.DisplayName> getTicketCaption() {
        TicketNames ticketNames = this.ticketNames;
        return ticketNames != null ? Optional.fromNullable(ticketNames.getMobileCaption()) : Optional.absent();
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlement
    public Optional<DisplayNameMap.DisplayName> getTicketName() {
        TicketNames ticketNames = this.ticketNames;
        return ticketNames != null ? Optional.fromNullable(ticketNames.getMobileName()) : Optional.absent();
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlement
    public Optional<DisplayNameMap.DisplayName> getTicketSubCaption() {
        TicketNames ticketNames = this.ticketNames;
        return ticketNames != null ? Optional.fromNullable(ticketNames.getMobileSubCaption()) : Optional.absent();
    }

    public int hashCode() {
        String str = this.barcodeId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    private TicketEntitlementImpl(String str, String str2, String str3, TicketNames ticketNames) {
        this.barcodeId = str;
        this.guestName = str2;
        this.participantId = str3;
        this.ticketNames = ticketNames;
    }
}