package com.disney.wdpro.photopass.services.model.titus.request;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.paymentsui.constants.PaymentsConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/request/TitusConfirmOrderRequest;", "", PaymentsConstants.EXTRA_SESSION, "Lcom/disney/wdpro/photopass/services/model/titus/request/ConfirmOrderSessionData;", "payments", "", "", "pointOfOrigin", "destinationId", "distributionChannel", "(Lcom/disney/wdpro/photopass/services/model/titus/request/ConfirmOrderSessionData;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDestinationId", "()Ljava/lang/String;", "getDistributionChannel", "getPayments", "()Ljava/util/List;", "getPointOfOrigin", "getSession", "()Lcom/disney/wdpro/photopass/services/model/titus/request/ConfirmOrderSessionData;", "component1", "component2", "component3", "component4", "component5", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitusConfirmOrderRequest {
    private final String destinationId;
    private final String distributionChannel;
    private final List<String> payments;
    private final String pointOfOrigin;
    private final ConfirmOrderSessionData session;

    public TitusConfirmOrderRequest(ConfirmOrderSessionData session, List<String> payments, String pointOfOrigin, String destinationId, String distributionChannel) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(pointOfOrigin, "pointOfOrigin");
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        Intrinsics.checkNotNullParameter(distributionChannel, "distributionChannel");
        this.session = session;
        this.payments = payments;
        this.pointOfOrigin = pointOfOrigin;
        this.destinationId = destinationId;
        this.distributionChannel = distributionChannel;
    }

    public static /* synthetic */ TitusConfirmOrderRequest copy$default(TitusConfirmOrderRequest titusConfirmOrderRequest, ConfirmOrderSessionData confirmOrderSessionData, List list, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            confirmOrderSessionData = titusConfirmOrderRequest.session;
        }
        if ((i10 & 2) != 0) {
            list = titusConfirmOrderRequest.payments;
        }
        if ((i10 & 4) != 0) {
            str = titusConfirmOrderRequest.pointOfOrigin;
        }
        if ((i10 & 8) != 0) {
            str2 = titusConfirmOrderRequest.destinationId;
        }
        if ((i10 & 16) != 0) {
            str3 = titusConfirmOrderRequest.distributionChannel;
        }
        String str4 = str3;
        String str5 = str;
        return titusConfirmOrderRequest.copy(confirmOrderSessionData, list, str5, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final ConfirmOrderSessionData getSession() {
        return this.session;
    }

    public final List<String> component2() {
        return this.payments;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPointOfOrigin() {
        return this.pointOfOrigin;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDestinationId() {
        return this.destinationId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDistributionChannel() {
        return this.distributionChannel;
    }

    public final TitusConfirmOrderRequest copy(ConfirmOrderSessionData session, List<String> payments, String pointOfOrigin, String destinationId, String distributionChannel) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(pointOfOrigin, "pointOfOrigin");
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        Intrinsics.checkNotNullParameter(distributionChannel, "distributionChannel");
        return new TitusConfirmOrderRequest(session, payments, pointOfOrigin, destinationId, distributionChannel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitusConfirmOrderRequest)) {
            return false;
        }
        TitusConfirmOrderRequest titusConfirmOrderRequest = (TitusConfirmOrderRequest) other;
        return Intrinsics.areEqual(this.session, titusConfirmOrderRequest.session) && Intrinsics.areEqual(this.payments, titusConfirmOrderRequest.payments) && Intrinsics.areEqual(this.pointOfOrigin, titusConfirmOrderRequest.pointOfOrigin) && Intrinsics.areEqual(this.destinationId, titusConfirmOrderRequest.destinationId) && Intrinsics.areEqual(this.distributionChannel, titusConfirmOrderRequest.distributionChannel);
    }

    public final String getDestinationId() {
        return this.destinationId;
    }

    public final String getDistributionChannel() {
        return this.distributionChannel;
    }

    public final List<String> getPayments() {
        return this.payments;
    }

    public final String getPointOfOrigin() {
        return this.pointOfOrigin;
    }

    public final ConfirmOrderSessionData getSession() {
        return this.session;
    }

    public int hashCode() {
        return (((((((this.session.hashCode() * 31) + this.payments.hashCode()) * 31) + this.pointOfOrigin.hashCode()) * 31) + this.destinationId.hashCode()) * 31) + this.distributionChannel.hashCode();
    }

    public String toString() {
        return "TitusConfirmOrderRequest(session=" + this.session + ", payments=" + this.payments + ", pointOfOrigin=" + this.pointOfOrigin + ", destinationId=" + this.destinationId + ", distributionChannel=" + this.distributionChannel + ")";
    }
}