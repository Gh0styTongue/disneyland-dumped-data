package com.disney.wdpro.photopass.services.model.titus;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/TitusPricing;", "", "subTotal", "", "tax", "total", "currency", "", "(FFFLjava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getSubTotal", "()F", "getTax", "getTotal", "component1", "component2", "component3", "component4", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitusPricing {
    private final String currency;
    private final float subTotal;
    private final float tax;
    private final float total;

    public TitusPricing(float f10, float f11, float f12, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.subTotal = f10;
        this.tax = f11;
        this.total = f12;
        this.currency = currency;
    }

    public static /* synthetic */ TitusPricing copy$default(TitusPricing titusPricing, float f10, float f11, float f12, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = titusPricing.subTotal;
        }
        if ((i10 & 2) != 0) {
            f11 = titusPricing.tax;
        }
        if ((i10 & 4) != 0) {
            f12 = titusPricing.total;
        }
        if ((i10 & 8) != 0) {
            str = titusPricing.currency;
        }
        return titusPricing.copy(f10, f11, f12, str);
    }

    /* renamed from: component1, reason: from getter */
    public final float getSubTotal() {
        return this.subTotal;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTax() {
        return this.tax;
    }

    /* renamed from: component3, reason: from getter */
    public final float getTotal() {
        return this.total;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final TitusPricing copy(float subTotal, float tax, float total, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new TitusPricing(subTotal, tax, total, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitusPricing)) {
            return false;
        }
        TitusPricing titusPricing = (TitusPricing) other;
        return Float.compare(this.subTotal, titusPricing.subTotal) == 0 && Float.compare(this.tax, titusPricing.tax) == 0 && Float.compare(this.total, titusPricing.total) == 0 && Intrinsics.areEqual(this.currency, titusPricing.currency);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final float getSubTotal() {
        return this.subTotal;
    }

    public final float getTax() {
        return this.tax;
    }

    public final float getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.subTotal) * 31) + Float.hashCode(this.tax)) * 31) + Float.hashCode(this.total)) * 31) + this.currency.hashCode();
    }

    public String toString() {
        return "TitusPricing(subTotal=" + this.subTotal + ", tax=" + this.tax + ", total=" + this.total + ", currency=" + this.currency + ")";
    }
}