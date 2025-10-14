package com.disney.wdpro.photopass.services.model.titus.request;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JW\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/request/TitusItemRequest;", "", "productId", "", "productPrice", "", "validityDate", "salesChannel", "bookingContactIdType", "bookingContactIdValue", "itemGuests", "", "Lcom/disney/wdpro/photopass/services/model/titus/request/TitusItemGuestRequest;", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBookingContactIdType", "()Ljava/lang/String;", "getBookingContactIdValue", "getItemGuests", "()Ljava/util/List;", "getProductId", "getProductPrice", "()F", "getSalesChannel", "getValidityDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitusItemRequest {
    private final String bookingContactIdType;
    private final String bookingContactIdValue;
    private final List<TitusItemGuestRequest> itemGuests;
    private final String productId;
    private final float productPrice;
    private final String salesChannel;
    private final String validityDate;

    public TitusItemRequest(String productId, float f10, String validityDate, String salesChannel, String bookingContactIdType, String str, List<TitusItemGuestRequest> itemGuests) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(validityDate, "validityDate");
        Intrinsics.checkNotNullParameter(salesChannel, "salesChannel");
        Intrinsics.checkNotNullParameter(bookingContactIdType, "bookingContactIdType");
        Intrinsics.checkNotNullParameter(itemGuests, "itemGuests");
        this.productId = productId;
        this.productPrice = f10;
        this.validityDate = validityDate;
        this.salesChannel = salesChannel;
        this.bookingContactIdType = bookingContactIdType;
        this.bookingContactIdValue = str;
        this.itemGuests = itemGuests;
    }

    public static /* synthetic */ TitusItemRequest copy$default(TitusItemRequest titusItemRequest, String str, float f10, String str2, String str3, String str4, String str5, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = titusItemRequest.productId;
        }
        if ((i10 & 2) != 0) {
            f10 = titusItemRequest.productPrice;
        }
        if ((i10 & 4) != 0) {
            str2 = titusItemRequest.validityDate;
        }
        if ((i10 & 8) != 0) {
            str3 = titusItemRequest.salesChannel;
        }
        if ((i10 & 16) != 0) {
            str4 = titusItemRequest.bookingContactIdType;
        }
        if ((i10 & 32) != 0) {
            str5 = titusItemRequest.bookingContactIdValue;
        }
        if ((i10 & 64) != 0) {
            list = titusItemRequest.itemGuests;
        }
        String str6 = str5;
        List list2 = list;
        String str7 = str4;
        String str8 = str2;
        return titusItemRequest.copy(str, f10, str8, str3, str7, str6, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final float getProductPrice() {
        return this.productPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValidityDate() {
        return this.validityDate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSalesChannel() {
        return this.salesChannel;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBookingContactIdType() {
        return this.bookingContactIdType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBookingContactIdValue() {
        return this.bookingContactIdValue;
    }

    public final List<TitusItemGuestRequest> component7() {
        return this.itemGuests;
    }

    public final TitusItemRequest copy(String productId, float productPrice, String validityDate, String salesChannel, String bookingContactIdType, String bookingContactIdValue, List<TitusItemGuestRequest> itemGuests) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(validityDate, "validityDate");
        Intrinsics.checkNotNullParameter(salesChannel, "salesChannel");
        Intrinsics.checkNotNullParameter(bookingContactIdType, "bookingContactIdType");
        Intrinsics.checkNotNullParameter(itemGuests, "itemGuests");
        return new TitusItemRequest(productId, productPrice, validityDate, salesChannel, bookingContactIdType, bookingContactIdValue, itemGuests);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitusItemRequest)) {
            return false;
        }
        TitusItemRequest titusItemRequest = (TitusItemRequest) other;
        return Intrinsics.areEqual(this.productId, titusItemRequest.productId) && Float.compare(this.productPrice, titusItemRequest.productPrice) == 0 && Intrinsics.areEqual(this.validityDate, titusItemRequest.validityDate) && Intrinsics.areEqual(this.salesChannel, titusItemRequest.salesChannel) && Intrinsics.areEqual(this.bookingContactIdType, titusItemRequest.bookingContactIdType) && Intrinsics.areEqual(this.bookingContactIdValue, titusItemRequest.bookingContactIdValue) && Intrinsics.areEqual(this.itemGuests, titusItemRequest.itemGuests);
    }

    public final String getBookingContactIdType() {
        return this.bookingContactIdType;
    }

    public final String getBookingContactIdValue() {
        return this.bookingContactIdValue;
    }

    public final List<TitusItemGuestRequest> getItemGuests() {
        return this.itemGuests;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final float getProductPrice() {
        return this.productPrice;
    }

    public final String getSalesChannel() {
        return this.salesChannel;
    }

    public final String getValidityDate() {
        return this.validityDate;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.productId.hashCode() * 31) + Float.hashCode(this.productPrice)) * 31) + this.validityDate.hashCode()) * 31) + this.salesChannel.hashCode()) * 31) + this.bookingContactIdType.hashCode()) * 31;
        String str = this.bookingContactIdValue;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.itemGuests.hashCode();
    }

    public String toString() {
        return "TitusItemRequest(productId=" + this.productId + ", productPrice=" + this.productPrice + ", validityDate=" + this.validityDate + ", salesChannel=" + this.salesChannel + ", bookingContactIdType=" + this.bookingContactIdType + ", bookingContactIdValue=" + this.bookingContactIdValue + ", itemGuests=" + this.itemGuests + ")";
    }
}