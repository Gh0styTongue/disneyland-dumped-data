package com.disney.wdpro.mblecore.api.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u001e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/api/model/VmmsTokenListResponse;", "Ljava/io/Serializable;", "bleIdList", "", "", "expirationTTL", "", "dropTTL", "(Ljava/util/List;JJ)V", "getBleIdList", "()Ljava/util/List;", "getDropTTL", "()J", "getExpirationTTL", "Companion", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final class VmmsTokenListResponse implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("bleIdentifiers")
    private final List<String> bleIdList;

    @SerializedName("dropTTL")
    private final long dropTTL;

    @SerializedName("expirationTTL")
    private final long expirationTTL;

    public VmmsTokenListResponse(List<String> bleIdList, long j10, long j11) {
        Intrinsics.checkNotNullParameter(bleIdList, "bleIdList");
        this.bleIdList = bleIdList;
        this.expirationTTL = j10;
        this.dropTTL = j11;
    }

    public final List<String> getBleIdList() {
        return this.bleIdList;
    }

    public final long getDropTTL() {
        return this.dropTTL;
    }

    public final long getExpirationTTL() {
        return this.expirationTTL;
    }
}