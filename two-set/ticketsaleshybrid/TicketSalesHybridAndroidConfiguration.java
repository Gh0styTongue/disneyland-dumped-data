package com.disney.wdpro.ticketsaleshybrid;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/TicketSalesHybridAndroidConfiguration;", "", "destinationCode", "", "helpDeskPhoneNumber", "ticketSalesSellableDate", "Ljava/util/Calendar;", "conversationId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "getDestinationCode", "getHelpDeskPhoneNumber", "getTicketSalesSellableDate", "()Ljava/util/Calendar;", "component1", "component2", "component3", "component4", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class TicketSalesHybridAndroidConfiguration {
    private final String conversationId;
    private final String destinationCode;
    private final String helpDeskPhoneNumber;
    private final Calendar ticketSalesSellableDate;

    @JvmOverloads
    public TicketSalesHybridAndroidConfiguration() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TicketSalesHybridAndroidConfiguration copy$default(TicketSalesHybridAndroidConfiguration ticketSalesHybridAndroidConfiguration, String str, String str2, Calendar calendar, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ticketSalesHybridAndroidConfiguration.destinationCode;
        }
        if ((i10 & 2) != 0) {
            str2 = ticketSalesHybridAndroidConfiguration.helpDeskPhoneNumber;
        }
        if ((i10 & 4) != 0) {
            calendar = ticketSalesHybridAndroidConfiguration.ticketSalesSellableDate;
        }
        if ((i10 & 8) != 0) {
            str3 = ticketSalesHybridAndroidConfiguration.conversationId;
        }
        return ticketSalesHybridAndroidConfiguration.copy(str, str2, calendar, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDestinationCode() {
        return this.destinationCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHelpDeskPhoneNumber() {
        return this.helpDeskPhoneNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final Calendar getTicketSalesSellableDate() {
        return this.ticketSalesSellableDate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    public final TicketSalesHybridAndroidConfiguration copy(String destinationCode, String helpDeskPhoneNumber, Calendar ticketSalesSellableDate, String conversationId) {
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(helpDeskPhoneNumber, "helpDeskPhoneNumber");
        return new TicketSalesHybridAndroidConfiguration(destinationCode, helpDeskPhoneNumber, ticketSalesSellableDate, conversationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketSalesHybridAndroidConfiguration)) {
            return false;
        }
        TicketSalesHybridAndroidConfiguration ticketSalesHybridAndroidConfiguration = (TicketSalesHybridAndroidConfiguration) other;
        return Intrinsics.areEqual(this.destinationCode, ticketSalesHybridAndroidConfiguration.destinationCode) && Intrinsics.areEqual(this.helpDeskPhoneNumber, ticketSalesHybridAndroidConfiguration.helpDeskPhoneNumber) && Intrinsics.areEqual(this.ticketSalesSellableDate, ticketSalesHybridAndroidConfiguration.ticketSalesSellableDate) && Intrinsics.areEqual(this.conversationId, ticketSalesHybridAndroidConfiguration.conversationId);
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getDestinationCode() {
        return this.destinationCode;
    }

    public final String getHelpDeskPhoneNumber() {
        return this.helpDeskPhoneNumber;
    }

    public final Calendar getTicketSalesSellableDate() {
        return this.ticketSalesSellableDate;
    }

    public int hashCode() {
        int iHashCode = ((this.destinationCode.hashCode() * 31) + this.helpDeskPhoneNumber.hashCode()) * 31;
        Calendar calendar = this.ticketSalesSellableDate;
        int iHashCode2 = (iHashCode + (calendar == null ? 0 : calendar.hashCode())) * 31;
        String str = this.conversationId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TicketSalesHybridAndroidConfiguration(destinationCode=" + this.destinationCode + ", helpDeskPhoneNumber=" + this.helpDeskPhoneNumber + ", ticketSalesSellableDate=" + this.ticketSalesSellableDate + ", conversationId=" + this.conversationId + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketSalesHybridAndroidConfiguration(String destinationCode) {
        this(destinationCode, null, null, null, 14, null);
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketSalesHybridAndroidConfiguration(String destinationCode, String helpDeskPhoneNumber) {
        this(destinationCode, helpDeskPhoneNumber, null, null, 12, null);
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(helpDeskPhoneNumber, "helpDeskPhoneNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketSalesHybridAndroidConfiguration(String destinationCode, String helpDeskPhoneNumber, Calendar calendar) {
        this(destinationCode, helpDeskPhoneNumber, calendar, null, 8, null);
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(helpDeskPhoneNumber, "helpDeskPhoneNumber");
    }

    @JvmOverloads
    public TicketSalesHybridAndroidConfiguration(String destinationCode, String helpDeskPhoneNumber, Calendar calendar, String str) {
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(helpDeskPhoneNumber, "helpDeskPhoneNumber");
        this.destinationCode = destinationCode;
        this.helpDeskPhoneNumber = helpDeskPhoneNumber;
        this.ticketSalesSellableDate = calendar;
        this.conversationId = str;
    }

    public /* synthetic */ TicketSalesHybridAndroidConfiguration(String str, String str2, Calendar calendar, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "WDW" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : calendar, (i10 & 8) != 0 ? null : str3);
    }
}