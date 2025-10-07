package com.disney.wdpro.mblecore.data.storage;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/data/storage/MbleTokenEntity;", "", "token", "", "isUsed", "", "expirationTTL", "", "dropTTL", "(Ljava/lang/String;ZJJ)V", "getDropTTL", "()J", "setDropTTL", "(J)V", "getExpirationTTL", "setExpirationTTL", "()Z", "setUsed", "(Z)V", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "", "toString", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MbleTokenEntity {
    private long dropTTL;
    private long expirationTTL;
    private boolean isUsed;
    private String token;

    public MbleTokenEntity(String token, boolean z10, long j10, long j11) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.isUsed = z10;
        this.expirationTTL = j10;
        this.dropTTL = j11;
    }

    public static /* synthetic */ MbleTokenEntity copy$default(MbleTokenEntity mbleTokenEntity, String str, boolean z10, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mbleTokenEntity.token;
        }
        if ((i10 & 2) != 0) {
            z10 = mbleTokenEntity.isUsed;
        }
        if ((i10 & 4) != 0) {
            j10 = mbleTokenEntity.expirationTTL;
        }
        if ((i10 & 8) != 0) {
            j11 = mbleTokenEntity.dropTTL;
        }
        long j12 = j11;
        return mbleTokenEntity.copy(str, z10, j10, j12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsUsed() {
        return this.isUsed;
    }

    /* renamed from: component3, reason: from getter */
    public final long getExpirationTTL() {
        return this.expirationTTL;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDropTTL() {
        return this.dropTTL;
    }

    public final MbleTokenEntity copy(String token, boolean isUsed, long expirationTTL, long dropTTL) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new MbleTokenEntity(token, isUsed, expirationTTL, dropTTL);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MbleTokenEntity)) {
            return false;
        }
        MbleTokenEntity mbleTokenEntity = (MbleTokenEntity) other;
        return Intrinsics.areEqual(this.token, mbleTokenEntity.token) && this.isUsed == mbleTokenEntity.isUsed && this.expirationTTL == mbleTokenEntity.expirationTTL && this.dropTTL == mbleTokenEntity.dropTTL;
    }

    public final long getDropTTL() {
        return this.dropTTL;
    }

    public final long getExpirationTTL() {
        return this.expirationTTL;
    }

    public final String getToken() {
        return this.token;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.token.hashCode() * 31;
        boolean z10 = this.isUsed;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((iHashCode + i10) * 31) + Long.hashCode(this.expirationTTL)) * 31) + Long.hashCode(this.dropTTL);
    }

    public final boolean isUsed() {
        return this.isUsed;
    }

    public final void setDropTTL(long j10) {
        this.dropTTL = j10;
    }

    public final void setExpirationTTL(long j10) {
        this.expirationTTL = j10;
    }

    public final void setToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    public final void setUsed(boolean z10) {
        this.isUsed = z10;
    }

    public String toString() {
        return "MbleTokenEntity(token=" + this.token + ", isUsed=" + this.isUsed + ", expirationTTL=" + this.expirationTTL + ", dropTTL=" + this.dropTTL + ")";
    }

    public /* synthetic */ MbleTokenEntity(String str, boolean z10, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? false : z10, j10, j11);
    }
}