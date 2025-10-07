package com.disney.wdpro.httpclient.authentication;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m92038d2 = {"Lcom/disney/wdpro/httpclient/authentication/PublicToken;", "", "value", "", "expired", "", "(Ljava/lang/String;J)V", "getExpired", "()J", "getValue", "()Ljava/lang/String;", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "oauth-http-client_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes23.dex */
public final /* data */ class PublicToken {
    private final long expired;
    private final String value;

    public PublicToken(String value, long j10) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.expired = j10;
    }

    public static /* synthetic */ PublicToken copy$default(PublicToken publicToken, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = publicToken.value;
        }
        if ((i10 & 2) != 0) {
            j10 = publicToken.expired;
        }
        return publicToken.copy(str, j10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final long getExpired() {
        return this.expired;
    }

    public final PublicToken copy(String value, long expired) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new PublicToken(value, expired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublicToken)) {
            return false;
        }
        PublicToken publicToken = (PublicToken) other;
        return Intrinsics.areEqual(this.value, publicToken.value) && this.expired == publicToken.expired;
    }

    public final long getExpired() {
        return this.expired;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + Long.hashCode(this.expired);
    }

    public String toString() {
        return "PublicToken(value=" + this.value + ", expired=" + this.expired + ")";
    }
}