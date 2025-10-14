package com.disney.wdpro.photopass.services.model.titus;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.opp.dine.data.services.order.VnConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/TitusPayment;", "", "authorizationCode", "", "paymentMethod", VnConstants.PO_PARAM_KEY_RRN, "rrnKey", "amount", "", "currency", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)V", "getAmount", "()F", "getAuthorizationCode", "()Ljava/lang/String;", "getCurrency", "getPaymentMethod", "getRrn", "getRrnKey", "component1", "component2", "component3", "component4", "component5", "component6", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitusPayment {
    private final float amount;
    private final String authorizationCode;
    private final String currency;
    private final String paymentMethod;
    private final String rrn;
    private final String rrnKey;

    public TitusPayment(String authorizationCode, String paymentMethod, String rrn, String rrnKey, float f10, String currency) {
        Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(rrn, "rrn");
        Intrinsics.checkNotNullParameter(rrnKey, "rrnKey");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.authorizationCode = authorizationCode;
        this.paymentMethod = paymentMethod;
        this.rrn = rrn;
        this.rrnKey = rrnKey;
        this.amount = f10;
        this.currency = currency;
    }

    public static /* synthetic */ TitusPayment copy$default(TitusPayment titusPayment, String str, String str2, String str3, String str4, float f10, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = titusPayment.authorizationCode;
        }
        if ((i10 & 2) != 0) {
            str2 = titusPayment.paymentMethod;
        }
        if ((i10 & 4) != 0) {
            str3 = titusPayment.rrn;
        }
        if ((i10 & 8) != 0) {
            str4 = titusPayment.rrnKey;
        }
        if ((i10 & 16) != 0) {
            f10 = titusPayment.amount;
        }
        if ((i10 & 32) != 0) {
            str5 = titusPayment.currency;
        }
        float f11 = f10;
        String str6 = str5;
        return titusPayment.copy(str, str2, str3, str4, f11, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAuthorizationCode() {
        return this.authorizationCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRrn() {
        return this.rrn;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRrnKey() {
        return this.rrnKey;
    }

    /* renamed from: component5, reason: from getter */
    public final float getAmount() {
        return this.amount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final TitusPayment copy(String authorizationCode, String paymentMethod, String rrn, String rrnKey, float amount, String currency) {
        Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(rrn, "rrn");
        Intrinsics.checkNotNullParameter(rrnKey, "rrnKey");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new TitusPayment(authorizationCode, paymentMethod, rrn, rrnKey, amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitusPayment)) {
            return false;
        }
        TitusPayment titusPayment = (TitusPayment) other;
        return Intrinsics.areEqual(this.authorizationCode, titusPayment.authorizationCode) && Intrinsics.areEqual(this.paymentMethod, titusPayment.paymentMethod) && Intrinsics.areEqual(this.rrn, titusPayment.rrn) && Intrinsics.areEqual(this.rrnKey, titusPayment.rrnKey) && Float.compare(this.amount, titusPayment.amount) == 0 && Intrinsics.areEqual(this.currency, titusPayment.currency);
    }

    public final float getAmount() {
        return this.amount;
    }

    public final String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getRrn() {
        return this.rrn;
    }

    public final String getRrnKey() {
        return this.rrnKey;
    }

    public int hashCode() {
        return (((((((((this.authorizationCode.hashCode() * 31) + this.paymentMethod.hashCode()) * 31) + this.rrn.hashCode()) * 31) + this.rrnKey.hashCode()) * 31) + Float.hashCode(this.amount)) * 31) + this.currency.hashCode();
    }

    public String toString() {
        return "TitusPayment(authorizationCode=" + this.authorizationCode + ", paymentMethod=" + this.paymentMethod + ", rrn=" + this.rrn + ", rrnKey=" + this.rrnKey + ", amount=" + this.amount + ", currency=" + this.currency + ")";
    }
}