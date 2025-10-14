package com.disney.wdpro.photopass.services.model.titus.request;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/request/TitusOrderRequest;", "", "orderId", "", "totalAmount", "", "chargeAmount", "currency", "(Ljava/lang/String;FFLjava/lang/String;)V", "getChargeAmount", "()F", "getCurrency", "()Ljava/lang/String;", "getOrderId", "getTotalAmount", "component1", "component2", "component3", "component4", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitusOrderRequest {
    private final float chargeAmount;
    private final String currency;
    private final String orderId;
    private final float totalAmount;

    public TitusOrderRequest(String orderId, float f10, float f11, String currency) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.orderId = orderId;
        this.totalAmount = f10;
        this.chargeAmount = f11;
        this.currency = currency;
    }

    public static /* synthetic */ TitusOrderRequest copy$default(TitusOrderRequest titusOrderRequest, String str, float f10, float f11, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = titusOrderRequest.orderId;
        }
        if ((i10 & 2) != 0) {
            f10 = titusOrderRequest.totalAmount;
        }
        if ((i10 & 4) != 0) {
            f11 = titusOrderRequest.chargeAmount;
        }
        if ((i10 & 8) != 0) {
            str2 = titusOrderRequest.currency;
        }
        return titusOrderRequest.copy(str, f10, f11, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final float getChargeAmount() {
        return this.chargeAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final TitusOrderRequest copy(String orderId, float totalAmount, float chargeAmount, String currency) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new TitusOrderRequest(orderId, totalAmount, chargeAmount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitusOrderRequest)) {
            return false;
        }
        TitusOrderRequest titusOrderRequest = (TitusOrderRequest) other;
        return Intrinsics.areEqual(this.orderId, titusOrderRequest.orderId) && Float.compare(this.totalAmount, titusOrderRequest.totalAmount) == 0 && Float.compare(this.chargeAmount, titusOrderRequest.chargeAmount) == 0 && Intrinsics.areEqual(this.currency, titusOrderRequest.currency);
    }

    public final float getChargeAmount() {
        return this.chargeAmount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final float getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        return (((((this.orderId.hashCode() * 31) + Float.hashCode(this.totalAmount)) * 31) + Float.hashCode(this.chargeAmount)) * 31) + this.currency.hashCode();
    }

    public String toString() {
        return "TitusOrderRequest(orderId=" + this.orderId + ", totalAmount=" + this.totalAmount + ", chargeAmount=" + this.chargeAmount + ", currency=" + this.currency + ")";
    }
}