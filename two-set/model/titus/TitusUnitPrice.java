package com.disney.wdpro.photopass.services.model.titus;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/TitusUnitPrice;", "", "amount", "", "currency", "", "(FLjava/lang/String;)V", "getAmount", "()F", "getCurrency", "()Ljava/lang/String;", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitusUnitPrice {
    private final float amount;
    private final String currency;

    public TitusUnitPrice(float f10, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.amount = f10;
        this.currency = currency;
    }

    public static /* synthetic */ TitusUnitPrice copy$default(TitusUnitPrice titusUnitPrice, float f10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = titusUnitPrice.amount;
        }
        if ((i10 & 2) != 0) {
            str = titusUnitPrice.currency;
        }
        return titusUnitPrice.copy(f10, str);
    }

    /* renamed from: component1, reason: from getter */
    public final float getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final TitusUnitPrice copy(float amount, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new TitusUnitPrice(amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitusUnitPrice)) {
            return false;
        }
        TitusUnitPrice titusUnitPrice = (TitusUnitPrice) other;
        return Float.compare(this.amount, titusUnitPrice.amount) == 0 && Intrinsics.areEqual(this.currency, titusUnitPrice.currency);
    }

    public final float getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (Float.hashCode(this.amount) * 31) + this.currency.hashCode();
    }

    public String toString() {
        return "TitusUnitPrice(amount=" + this.amount + ", currency=" + this.currency + ")";
    }
}