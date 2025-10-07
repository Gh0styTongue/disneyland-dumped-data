package com.disney.wdpro.friendsservices.model.dto;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m92037d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/dto/ResetPinDTO;", "Ljava/io/Serializable;", "resetPin", "", "(Z)V", "getResetPin", "()Z", "setResetPin", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "", "hashCode", "", "toString", "", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class ResetPinDTO implements Serializable {

    @SerializedName("resetPin")
    private boolean resetPin;

    public ResetPinDTO() {
        this(false, 1, null);
    }

    public static /* synthetic */ ResetPinDTO copy$default(ResetPinDTO resetPinDTO, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = resetPinDTO.resetPin;
        }
        return resetPinDTO.copy(z10);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getResetPin() {
        return this.resetPin;
    }

    public final ResetPinDTO copy(boolean resetPin) {
        return new ResetPinDTO(resetPin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResetPinDTO) && this.resetPin == ((ResetPinDTO) other).resetPin;
    }

    public final boolean getResetPin() {
        return this.resetPin;
    }

    public int hashCode() {
        boolean z10 = this.resetPin;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final void setResetPin(boolean z10) {
        this.resetPin = z10;
    }

    public String toString() {
        return "ResetPinDTO(resetPin=" + this.resetPin + ")";
    }

    public ResetPinDTO(boolean z10) {
        this.resetPin = z10;
    }

    public /* synthetic */ ResetPinDTO(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}