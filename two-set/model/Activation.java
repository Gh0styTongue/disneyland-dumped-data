package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/Activation;", "", "entitlementId", "", "errorCode", "errorMessage", "newlyRedeemed", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getEntitlementId", "()Ljava/lang/String;", "getErrorCode", "getErrorMessage", "getNewlyRedeemed", "()Z", "component1", "component2", "component3", "component4", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Activation {
    private final String entitlementId;
    private final String errorCode;
    private final String errorMessage;
    private final boolean newlyRedeemed;

    public Activation(String entitlementId, String errorCode, String errorMessage, boolean z10) {
        Intrinsics.checkNotNullParameter(entitlementId, "entitlementId");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.entitlementId = entitlementId;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.newlyRedeemed = z10;
    }

    public static /* synthetic */ Activation copy$default(Activation activation, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = activation.entitlementId;
        }
        if ((i10 & 2) != 0) {
            str2 = activation.errorCode;
        }
        if ((i10 & 4) != 0) {
            str3 = activation.errorMessage;
        }
        if ((i10 & 8) != 0) {
            z10 = activation.newlyRedeemed;
        }
        return activation.copy(str, str2, str3, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEntitlementId() {
        return this.entitlementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getNewlyRedeemed() {
        return this.newlyRedeemed;
    }

    public final Activation copy(String entitlementId, String errorCode, String errorMessage, boolean newlyRedeemed) {
        Intrinsics.checkNotNullParameter(entitlementId, "entitlementId");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new Activation(entitlementId, errorCode, errorMessage, newlyRedeemed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Activation)) {
            return false;
        }
        Activation activation = (Activation) other;
        return Intrinsics.areEqual(this.entitlementId, activation.entitlementId) && Intrinsics.areEqual(this.errorCode, activation.errorCode) && Intrinsics.areEqual(this.errorMessage, activation.errorMessage) && this.newlyRedeemed == activation.newlyRedeemed;
    }

    public final String getEntitlementId() {
        return this.entitlementId;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getNewlyRedeemed() {
        return this.newlyRedeemed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((this.entitlementId.hashCode() * 31) + this.errorCode.hashCode()) * 31) + this.errorMessage.hashCode()) * 31;
        boolean z10 = this.newlyRedeemed;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public String toString() {
        return "Activation(entitlementId=" + this.entitlementId + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", newlyRedeemed=" + this.newlyRedeemed + ")";
    }
}