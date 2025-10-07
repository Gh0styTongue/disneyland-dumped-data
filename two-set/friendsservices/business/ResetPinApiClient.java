package com.disney.wdpro.friendsservices.business;

import com.disney.wdpro.friendsservices.model.Friend;
import com.disney.wdpro.midichlorian.CacheContextModifier;
import com.disney.wdpro.midichlorian.annotations.CacheEvict;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.service.business.PaymentApiClientImpl;
import com.google.common.base.Optional;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H'J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H'J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient;", "Lcom/disney/wdpro/midichlorian/CacheContextModifier;", "createChargeAccountIdWithPin", "", "guest", "Lcom/disney/wdpro/friendsservices/model/Friend;", "pin", "", "getChargeAccountPinStatusByGuid", "Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient$ChargeAccountPinStatus;", "guid", "getChargeAccountPinStatusBySwid", "swid", "updatePin", "friend", "ChargeAccountPinStatus", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public interface ResetPinApiClient extends CacheContextModifier<ResetPinApiClient> {
    boolean createChargeAccountIdWithPin(Friend guest, String pin) throws IOException;

    @CacheEvict
    ChargeAccountPinStatus getChargeAccountPinStatusByGuid(String guid) throws IOException;

    @CacheEvict
    ChargeAccountPinStatus getChargeAccountPinStatusBySwid(String swid) throws IOException;

    boolean updatePin(Friend friend, String pin) throws IOException;

    @Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\f¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient$ChargeAccountPinStatus;", "", "chargeAccountIdentifier", "Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient$ChargeAccountPinStatus$ChargeAccountIdentifier;", "isChargeAccountAvailable", "", "isPinAvailable", "(Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient$ChargeAccountPinStatus$ChargeAccountIdentifier;ZZ)V", PaymentApiClientImpl.PARAMETER_CHARGE_ACCOUNT_ID, "", "getChargeAccountId", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "", "toString", "ChargeAccountIdentifier", "ExternalReference", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class ChargeAccountPinStatus {
        private final ChargeAccountIdentifier chargeAccountIdentifier;

        @SerializedName("chrgAcctAvailable")
        private final boolean isChargeAccountAvailable;

        @SerializedName("pinAvailable")
        private final boolean isPinAvailable;

        @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient$ChargeAccountPinStatus$ExternalReference;", "", "referenceName", "", "referenceValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getReferenceName", "()Ljava/lang/String;", "getReferenceValue", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class ExternalReference {
            private final String referenceName;
            private final String referenceValue;

            public ExternalReference(String referenceName, String referenceValue) {
                Intrinsics.checkNotNullParameter(referenceName, "referenceName");
                Intrinsics.checkNotNullParameter(referenceValue, "referenceValue");
                this.referenceName = referenceName;
                this.referenceValue = referenceValue;
            }

            public static /* synthetic */ ExternalReference copy$default(ExternalReference externalReference, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = externalReference.referenceName;
                }
                if ((i10 & 2) != 0) {
                    str2 = externalReference.referenceValue;
                }
                return externalReference.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReferenceName() {
                return this.referenceName;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReferenceValue() {
                return this.referenceValue;
            }

            public final ExternalReference copy(String referenceName, String referenceValue) {
                Intrinsics.checkNotNullParameter(referenceName, "referenceName");
                Intrinsics.checkNotNullParameter(referenceValue, "referenceValue");
                return new ExternalReference(referenceName, referenceValue);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ExternalReference)) {
                    return false;
                }
                ExternalReference externalReference = (ExternalReference) other;
                return Intrinsics.areEqual(this.referenceName, externalReference.referenceName) && Intrinsics.areEqual(this.referenceValue, externalReference.referenceValue);
            }

            public final String getReferenceName() {
                return this.referenceName;
            }

            public final String getReferenceValue() {
                return this.referenceValue;
            }

            public int hashCode() {
                return (this.referenceName.hashCode() * 31) + this.referenceValue.hashCode();
            }

            public String toString() {
                return "ExternalReference(referenceName=" + this.referenceName + ", referenceValue=" + this.referenceValue + ")";
            }
        }

        public ChargeAccountPinStatus(ChargeAccountIdentifier chargeAccountIdentifier, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(chargeAccountIdentifier, "chargeAccountIdentifier");
            this.chargeAccountIdentifier = chargeAccountIdentifier;
            this.isChargeAccountAvailable = z10;
            this.isPinAvailable = z11;
        }

        /* renamed from: component1, reason: from getter */
        private final ChargeAccountIdentifier getChargeAccountIdentifier() {
            return this.chargeAccountIdentifier;
        }

        public static /* synthetic */ ChargeAccountPinStatus copy$default(ChargeAccountPinStatus chargeAccountPinStatus, ChargeAccountIdentifier chargeAccountIdentifier, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                chargeAccountIdentifier = chargeAccountPinStatus.chargeAccountIdentifier;
            }
            if ((i10 & 2) != 0) {
                z10 = chargeAccountPinStatus.isChargeAccountAvailable;
            }
            if ((i10 & 4) != 0) {
                z11 = chargeAccountPinStatus.isPinAvailable;
            }
            return chargeAccountPinStatus.copy(chargeAccountIdentifier, z10, z11);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsChargeAccountAvailable() {
            return this.isChargeAccountAvailable;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsPinAvailable() {
            return this.isPinAvailable;
        }

        public final ChargeAccountPinStatus copy(ChargeAccountIdentifier chargeAccountIdentifier, boolean isChargeAccountAvailable, boolean isPinAvailable) {
            Intrinsics.checkNotNullParameter(chargeAccountIdentifier, "chargeAccountIdentifier");
            return new ChargeAccountPinStatus(chargeAccountIdentifier, isChargeAccountAvailable, isPinAvailable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChargeAccountPinStatus)) {
                return false;
            }
            ChargeAccountPinStatus chargeAccountPinStatus = (ChargeAccountPinStatus) other;
            return Intrinsics.areEqual(this.chargeAccountIdentifier, chargeAccountPinStatus.chargeAccountIdentifier) && this.isChargeAccountAvailable == chargeAccountPinStatus.isChargeAccountAvailable && this.isPinAvailable == chargeAccountPinStatus.isPinAvailable;
        }

        public final String getChargeAccountId() {
            Long lOrNull;
            Optional<Long> chargeAccountId = this.chargeAccountIdentifier.getChargeAccountId();
            if (chargeAccountId == null || (lOrNull = chargeAccountId.orNull()) == null) {
                return null;
            }
            return String.valueOf(lOrNull);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = this.chargeAccountIdentifier.hashCode() * 31;
            boolean z10 = this.isChargeAccountAvailable;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (iHashCode + i10) * 31;
            boolean z11 = this.isPinAvailable;
            return i11 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public final boolean isChargeAccountAvailable() {
            return this.isChargeAccountAvailable;
        }

        public final boolean isPinAvailable() {
            return this.isPinAvailable;
        }

        public String toString() {
            return "ChargeAccountPinStatus(chargeAccountIdentifier=" + this.chargeAccountIdentifier + ", isChargeAccountAvailable=" + this.isChargeAccountAvailable + ", isPinAvailable=" + this.isPinAvailable + ")";
        }

        @Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient$ChargeAccountPinStatus$ChargeAccountIdentifier;", "", PaymentApiClientImpl.PARAMETER_CHARGE_ACCOUNT_ID, "Lcom/google/common/base/Optional;", "", "guestExternalReference", "Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient$ChargeAccountPinStatus$ExternalReference;", "(Lcom/google/common/base/Optional;Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient$ChargeAccountPinStatus$ExternalReference;)V", "getChargeAccountId", "()Lcom/google/common/base/Optional;", "getGuestExternalReference", "()Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient$ChargeAccountPinStatus$ExternalReference;", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class ChargeAccountIdentifier {
            private final Optional<Long> chargeAccountId;
            private final ExternalReference guestExternalReference;

            public ChargeAccountIdentifier(Optional<Long> optional, ExternalReference guestExternalReference) {
                Intrinsics.checkNotNullParameter(guestExternalReference, "guestExternalReference");
                this.chargeAccountId = optional;
                this.guestExternalReference = guestExternalReference;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ChargeAccountIdentifier copy$default(ChargeAccountIdentifier chargeAccountIdentifier, Optional optional, ExternalReference externalReference, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    optional = chargeAccountIdentifier.chargeAccountId;
                }
                if ((i10 & 2) != 0) {
                    externalReference = chargeAccountIdentifier.guestExternalReference;
                }
                return chargeAccountIdentifier.copy(optional, externalReference);
            }

            public final Optional<Long> component1() {
                return this.chargeAccountId;
            }

            /* renamed from: component2, reason: from getter */
            public final ExternalReference getGuestExternalReference() {
                return this.guestExternalReference;
            }

            public final ChargeAccountIdentifier copy(Optional<Long> chargeAccountId, ExternalReference guestExternalReference) {
                Intrinsics.checkNotNullParameter(guestExternalReference, "guestExternalReference");
                return new ChargeAccountIdentifier(chargeAccountId, guestExternalReference);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ChargeAccountIdentifier)) {
                    return false;
                }
                ChargeAccountIdentifier chargeAccountIdentifier = (ChargeAccountIdentifier) other;
                return Intrinsics.areEqual(this.chargeAccountId, chargeAccountIdentifier.chargeAccountId) && Intrinsics.areEqual(this.guestExternalReference, chargeAccountIdentifier.guestExternalReference);
            }

            public final Optional<Long> getChargeAccountId() {
                return this.chargeAccountId;
            }

            public final ExternalReference getGuestExternalReference() {
                return this.guestExternalReference;
            }

            public int hashCode() {
                Optional<Long> optional = this.chargeAccountId;
                return ((optional == null ? 0 : optional.hashCode()) * 31) + this.guestExternalReference.hashCode();
            }

            public String toString() {
                return "ChargeAccountIdentifier(chargeAccountId=" + this.chargeAccountId + ", guestExternalReference=" + this.guestExternalReference + ")";
            }

            public /* synthetic */ ChargeAccountIdentifier(Optional optional, ExternalReference externalReference, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? Optional.absent() : optional, externalReference);
            }
        }

        public /* synthetic */ ChargeAccountPinStatus(ChargeAccountIdentifier chargeAccountIdentifier, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(chargeAccountIdentifier, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
        }
    }
}