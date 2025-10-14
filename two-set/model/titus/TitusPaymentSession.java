package com.disney.wdpro.photopass.services.model.titus;

import com.disney.wdpro.dine.util.DineCrashHelper;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/titus/TitusPaymentSession;", "", DineCrashHelper.DINE_APP_SESSION_TOKEN, "", "status", "hmac", "hmacVersion", DineCrashHelper.DINE_APP_CLIENT_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getHmac", "getHmacVersion", "getSessionToken", "getStatus", "component1", "component2", "component3", "component4", "component5", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TitusPaymentSession {
    private final String clientId;
    private final String hmac;
    private final String hmacVersion;
    private final String sessionToken;
    private final String status;

    public TitusPaymentSession(String sessionToken, String status, String hmac, String hmacVersion, String clientId) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(hmac, "hmac");
        Intrinsics.checkNotNullParameter(hmacVersion, "hmacVersion");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        this.sessionToken = sessionToken;
        this.status = status;
        this.hmac = hmac;
        this.hmacVersion = hmacVersion;
        this.clientId = clientId;
    }

    public static /* synthetic */ TitusPaymentSession copy$default(TitusPaymentSession titusPaymentSession, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = titusPaymentSession.sessionToken;
        }
        if ((i10 & 2) != 0) {
            str2 = titusPaymentSession.status;
        }
        if ((i10 & 4) != 0) {
            str3 = titusPaymentSession.hmac;
        }
        if ((i10 & 8) != 0) {
            str4 = titusPaymentSession.hmacVersion;
        }
        if ((i10 & 16) != 0) {
            str5 = titusPaymentSession.clientId;
        }
        String str6 = str5;
        String str7 = str3;
        return titusPaymentSession.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHmac() {
        return this.hmac;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHmacVersion() {
        return this.hmacVersion;
    }

    /* renamed from: component5, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    public final TitusPaymentSession copy(String sessionToken, String status, String hmac, String hmacVersion, String clientId) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(hmac, "hmac");
        Intrinsics.checkNotNullParameter(hmacVersion, "hmacVersion");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        return new TitusPaymentSession(sessionToken, status, hmac, hmacVersion, clientId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitusPaymentSession)) {
            return false;
        }
        TitusPaymentSession titusPaymentSession = (TitusPaymentSession) other;
        return Intrinsics.areEqual(this.sessionToken, titusPaymentSession.sessionToken) && Intrinsics.areEqual(this.status, titusPaymentSession.status) && Intrinsics.areEqual(this.hmac, titusPaymentSession.hmac) && Intrinsics.areEqual(this.hmacVersion, titusPaymentSession.hmacVersion) && Intrinsics.areEqual(this.clientId, titusPaymentSession.clientId);
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getHmac() {
        return this.hmac;
    }

    public final String getHmacVersion() {
        return this.hmacVersion;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((this.sessionToken.hashCode() * 31) + this.status.hashCode()) * 31) + this.hmac.hashCode()) * 31) + this.hmacVersion.hashCode()) * 31) + this.clientId.hashCode();
    }

    public String toString() {
        return "TitusPaymentSession(sessionToken=" + this.sessionToken + ", status=" + this.status + ", hmac=" + this.hmac + ", hmacVersion=" + this.hmacVersion + ", clientId=" + this.clientId + ")";
    }
}