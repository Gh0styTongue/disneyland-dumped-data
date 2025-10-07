package com.disney.wdpro.virtualqueue.core.interfaces;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/VQDowntimeStatus;", "Ljava/io/Serializable;", "message", "", "peptasiaIcon", "placeholderText", "placeholderUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getPeptasiaIcon", "getPlaceholderText", "getPlaceholderUrl", "component1", "component2", "component3", "component4", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class VQDowntimeStatus implements Serializable {
    public static final int $stable = 0;
    private final String message;
    private final String peptasiaIcon;
    private final String placeholderText;
    private final String placeholderUrl;

    public VQDowntimeStatus(String message, String peptasiaIcon, String str, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(peptasiaIcon, "peptasiaIcon");
        this.message = message;
        this.peptasiaIcon = peptasiaIcon;
        this.placeholderText = str;
        this.placeholderUrl = str2;
    }

    public static /* synthetic */ VQDowntimeStatus copy$default(VQDowntimeStatus vQDowntimeStatus, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vQDowntimeStatus.message;
        }
        if ((i10 & 2) != 0) {
            str2 = vQDowntimeStatus.peptasiaIcon;
        }
        if ((i10 & 4) != 0) {
            str3 = vQDowntimeStatus.placeholderText;
        }
        if ((i10 & 8) != 0) {
            str4 = vQDowntimeStatus.placeholderUrl;
        }
        return vQDowntimeStatus.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPeptasiaIcon() {
        return this.peptasiaIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlaceholderText() {
        return this.placeholderText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPlaceholderUrl() {
        return this.placeholderUrl;
    }

    public final VQDowntimeStatus copy(String message, String peptasiaIcon, String placeholderText, String placeholderUrl) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(peptasiaIcon, "peptasiaIcon");
        return new VQDowntimeStatus(message, peptasiaIcon, placeholderText, placeholderUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VQDowntimeStatus)) {
            return false;
        }
        VQDowntimeStatus vQDowntimeStatus = (VQDowntimeStatus) other;
        return Intrinsics.areEqual(this.message, vQDowntimeStatus.message) && Intrinsics.areEqual(this.peptasiaIcon, vQDowntimeStatus.peptasiaIcon) && Intrinsics.areEqual(this.placeholderText, vQDowntimeStatus.placeholderText) && Intrinsics.areEqual(this.placeholderUrl, vQDowntimeStatus.placeholderUrl);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPeptasiaIcon() {
        return this.peptasiaIcon;
    }

    public final String getPlaceholderText() {
        return this.placeholderText;
    }

    public final String getPlaceholderUrl() {
        return this.placeholderUrl;
    }

    public int hashCode() {
        int iHashCode = ((this.message.hashCode() * 31) + this.peptasiaIcon.hashCode()) * 31;
        String str = this.placeholderText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholderUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VQDowntimeStatus(message=" + this.message + ", peptasiaIcon=" + this.peptasiaIcon + ", placeholderText=" + this.placeholderText + ", placeholderUrl=" + this.placeholderUrl + ")";
    }

    public /* synthetic */ VQDowntimeStatus(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}