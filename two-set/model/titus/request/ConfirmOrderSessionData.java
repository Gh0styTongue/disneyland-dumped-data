package com.disney.wdpro.photopass.services.model.titus.request;

import com.disney.wdpro.dine.util.DineCrashHelper;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/request/ConfirmOrderSessionData;", "", DineCrashHelper.DINE_APP_CLIENT_ID, "", DineCrashHelper.DINE_APP_SESSION_TOKEN, "(Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getSessionToken", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConfirmOrderSessionData {
    private final String clientId;
    private final String sessionToken;

    public ConfirmOrderSessionData(String clientId, String sessionToken) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        this.clientId = clientId;
        this.sessionToken = sessionToken;
    }

    public static /* synthetic */ ConfirmOrderSessionData copy$default(ConfirmOrderSessionData confirmOrderSessionData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = confirmOrderSessionData.clientId;
        }
        if ((i10 & 2) != 0) {
            str2 = confirmOrderSessionData.sessionToken;
        }
        return confirmOrderSessionData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final ConfirmOrderSessionData copy(String clientId, String sessionToken) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        return new ConfirmOrderSessionData(clientId, sessionToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmOrderSessionData)) {
            return false;
        }
        ConfirmOrderSessionData confirmOrderSessionData = (ConfirmOrderSessionData) other;
        return Intrinsics.areEqual(this.clientId, confirmOrderSessionData.clientId) && Intrinsics.areEqual(this.sessionToken, confirmOrderSessionData.sessionToken);
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public int hashCode() {
        return (this.clientId.hashCode() * 31) + this.sessionToken.hashCode();
    }

    public String toString() {
        return "ConfirmOrderSessionData(clientId=" + this.clientId + ", sessionToken=" + this.sessionToken + ")";
    }
}