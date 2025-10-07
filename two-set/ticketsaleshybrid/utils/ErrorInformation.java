package com.disney.wdpro.ticketsaleshybrid.utils;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/utils/ErrorInformation;", "", "error", "Ljava/lang/Error;", "Lkotlin/Error;", "type", "", "(Ljava/lang/Error;Ljava/lang/String;)V", "getError", "()Ljava/lang/Error;", "getType", "()Ljava/lang/String;", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class ErrorInformation {
    private final Error error;
    private final String type;

    public ErrorInformation(Error error, String type) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(type, "type");
        this.error = error;
        this.type = type;
    }

    public static /* synthetic */ ErrorInformation copy$default(ErrorInformation errorInformation, Error error, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            error = errorInformation.error;
        }
        if ((i10 & 2) != 0) {
            str = errorInformation.type;
        }
        return errorInformation.copy(error, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final ErrorInformation copy(Error error, String type) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ErrorInformation(error, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorInformation)) {
            return false;
        }
        ErrorInformation errorInformation = (ErrorInformation) other;
        return Intrinsics.areEqual(this.error, errorInformation.error) && Intrinsics.areEqual(this.type, errorInformation.type);
    }

    public final Error getError() {
        return this.error;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.error.hashCode() * 31) + this.type.hashCode();
    }

    public String toString() {
        return "ErrorInformation(error=" + this.error + ", type=" + this.type + ")";
    }

    public /* synthetic */ ErrorInformation(Error error, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(error, (i10 & 2) != 0 ? "error" : str);
    }
}