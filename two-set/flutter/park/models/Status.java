package com.disney.wdpro.flutter.park.models;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/flutter/park/models/Status;", "", "isRead", "", "isDeleted", "(ZZ)V", "()Z", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "", "toString", "", "flutter-park-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class Status {
    private final boolean isDeleted;
    private final boolean isRead;

    /* JADX WARN: Illegal instructions before constructor call */
    public Status() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    public static /* synthetic */ Status copy$default(Status status, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = status.isRead;
        }
        if ((i10 & 2) != 0) {
            z11 = status.isDeleted;
        }
        return status.copy(z10, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    public final Status copy(boolean isRead, boolean isDeleted) {
        return new Status(isRead, isDeleted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Status)) {
            return false;
        }
        Status status = (Status) other;
        return this.isRead == status.isRead && this.isDeleted == status.isDeleted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.isRead;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.isDeleted;
        return i10 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public String toString() {
        return "Status(isRead=" + this.isRead + ", isDeleted=" + this.isDeleted + ")";
    }

    public Status(boolean z10, boolean z11) {
        this.isRead = z10;
        this.isDeleted = z11;
    }

    public /* synthetic */ Status(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11);
    }
}