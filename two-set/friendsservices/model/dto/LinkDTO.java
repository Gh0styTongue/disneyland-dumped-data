package com.disney.wdpro.friendsservices.model.dto;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.service.business.APIConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/dto/LinkDTO;", "Ljava/io/Serializable;", APIConstants.JsonKeys.HREF, "", "(Ljava/lang/String;)V", "getHref", "()Ljava/lang/String;", "setHref", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class LinkDTO implements Serializable {
    private String href;

    public LinkDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LinkDTO copy$default(LinkDTO linkDTO, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = linkDTO.href;
        }
        return linkDTO.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHref() {
        return this.href;
    }

    public final LinkDTO copy(String href) {
        return new LinkDTO(href);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LinkDTO) && Intrinsics.areEqual(this.href, ((LinkDTO) other).href);
    }

    public final String getHref() {
        return this.href;
    }

    public int hashCode() {
        String str = this.href;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setHref(String str) {
        this.href = str;
    }

    public String toString() {
        return "LinkDTO(href=" + this.href + ")";
    }

    public LinkDTO(String str) {
        this.href = str;
    }

    public /* synthetic */ LinkDTO(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}