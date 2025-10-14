package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LalGuestRequest;", "", "swid", "", "(Ljava/lang/String;)V", "getSwid", "()Ljava/lang/String;", "setSwid", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LalGuestRequest {
    private String swid;

    public LalGuestRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LalGuestRequest copy$default(LalGuestRequest lalGuestRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lalGuestRequest.swid;
        }
        return lalGuestRequest.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSwid() {
        return this.swid;
    }

    public final LalGuestRequest copy(String swid) {
        return new LalGuestRequest(swid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LalGuestRequest) && Intrinsics.areEqual(this.swid, ((LalGuestRequest) other).swid);
    }

    public final String getSwid() {
        return this.swid;
    }

    public int hashCode() {
        String str = this.swid;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setSwid(String str) {
        this.swid = str;
    }

    public String toString() {
        return "LalGuestRequest(swid=" + this.swid + ")";
    }

    public LalGuestRequest(String str) {
        this.swid = str;
    }

    public /* synthetic */ LalGuestRequest(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}