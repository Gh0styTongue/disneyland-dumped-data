package com.disney.wdpro.friendsservices.model.dto;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.google.common.base.Optional;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/dto/InviteStateDTO;", "Ljava/io/Serializable;", "status", "", OTUXParamsKeys.OT_UX_LINKS, "Lcom/google/common/base/Optional;", "Lcom/disney/wdpro/friendsservices/model/dto/InviteLinksDTO;", "(Ljava/lang/String;Lcom/google/common/base/Optional;)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "getLinks", "hashCode", "", "toString", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class InviteStateDTO implements Serializable {
    private Optional<InviteLinksDTO> links;
    private String status;

    public InviteStateDTO() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final Optional<InviteLinksDTO> component2() {
        return this.links;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InviteStateDTO copy$default(InviteStateDTO inviteStateDTO, String str, Optional optional, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inviteStateDTO.status;
        }
        if ((i10 & 2) != 0) {
            optional = inviteStateDTO.links;
        }
        return inviteStateDTO.copy(str, optional);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final InviteStateDTO copy(String status, Optional<InviteLinksDTO> links) {
        Intrinsics.checkNotNullParameter(links, "links");
        return new InviteStateDTO(status, links);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteStateDTO)) {
            return false;
        }
        InviteStateDTO inviteStateDTO = (InviteStateDTO) other;
        return Intrinsics.areEqual(this.status, inviteStateDTO.status) && Intrinsics.areEqual(this.links, inviteStateDTO.links);
    }

    public final InviteLinksDTO getLinks() {
        return this.links.orNull();
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.links.hashCode();
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        return "InviteStateDTO(status=" + this.status + ", links=" + this.links + ")";
    }

    public InviteStateDTO(String str, Optional<InviteLinksDTO> links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.status = str;
        this.links = links;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InviteStateDTO(String str, Optional optional, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i10 & 1) != 0 ? null : str;
        if ((i10 & 2) != 0) {
            optional = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optional, "absent()");
        }
        this(str, optional);
    }
}