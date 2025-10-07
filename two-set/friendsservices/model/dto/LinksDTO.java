package com.disney.wdpro.friendsservices.model.dto;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0010\u0010\n\u001a\u00020\u00192\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\r\u001a\u00020\u00192\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u001b"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/dto/LinksDTO;", "Ljava/io/Serializable;", "avatarLink", "", "selfLink", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/disney/wdpro/friendsservices/model/dto/LinkDTO;", "(Lcom/disney/wdpro/friendsservices/model/dto/LinkDTO;Lcom/disney/wdpro/friendsservices/model/dto/LinkDTO;)V", "getAvatarLink", "()Lcom/disney/wdpro/friendsservices/model/dto/LinkDTO;", "setAvatarLink", "(Lcom/disney/wdpro/friendsservices/model/dto/LinkDTO;)V", "getSelfLink", "setSelfLink", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "getAvatarLinkHref", "getSelfLinkHref", "hashCode", "", "", "toString", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nLinksDTO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinksDTO.kt\ncom/disney/wdpro/friendsservices/model/dto/LinksDTO\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/* loaded from: classes28.dex */
public final /* data */ class LinksDTO implements Serializable {

    @SerializedName("wdproAvatar")
    private LinkDTO avatarLink;

    @SerializedName("self")
    private LinkDTO selfLink;

    public LinksDTO() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LinksDTO copy$default(LinksDTO linksDTO, LinkDTO linkDTO, LinkDTO linkDTO2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            linkDTO = linksDTO.avatarLink;
        }
        if ((i10 & 2) != 0) {
            linkDTO2 = linksDTO.selfLink;
        }
        return linksDTO.copy(linkDTO, linkDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final LinkDTO getAvatarLink() {
        return this.avatarLink;
    }

    /* renamed from: component2, reason: from getter */
    public final LinkDTO getSelfLink() {
        return this.selfLink;
    }

    public final LinksDTO copy(LinkDTO avatarLink, LinkDTO selfLink) {
        return new LinksDTO(avatarLink, selfLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinksDTO)) {
            return false;
        }
        LinksDTO linksDTO = (LinksDTO) other;
        return Intrinsics.areEqual(this.avatarLink, linksDTO.avatarLink) && Intrinsics.areEqual(this.selfLink, linksDTO.selfLink);
    }

    public final LinkDTO getAvatarLink() {
        return this.avatarLink;
    }

    public final String getAvatarLinkHref() {
        LinkDTO linkDTO = this.avatarLink;
        if (linkDTO != null) {
            return linkDTO.getHref();
        }
        return null;
    }

    public final LinkDTO getSelfLink() {
        return this.selfLink;
    }

    public final String getSelfLinkHref() {
        LinkDTO linkDTO = this.selfLink;
        if (linkDTO != null) {
            return linkDTO.getHref();
        }
        return null;
    }

    public int hashCode() {
        LinkDTO linkDTO = this.avatarLink;
        int iHashCode = (linkDTO == null ? 0 : linkDTO.hashCode()) * 31;
        LinkDTO linkDTO2 = this.selfLink;
        return iHashCode + (linkDTO2 != null ? linkDTO2.hashCode() : 0);
    }

    public final void setAvatarLink(LinkDTO linkDTO) {
        this.avatarLink = linkDTO;
    }

    public final void setSelfLink(LinkDTO linkDTO) {
        this.selfLink = linkDTO;
    }

    public String toString() {
        return "LinksDTO(avatarLink=" + this.avatarLink + ", selfLink=" + this.selfLink + ")";
    }

    public LinksDTO(LinkDTO linkDTO, LinkDTO linkDTO2) {
        this.avatarLink = linkDTO;
        this.selfLink = linkDTO2;
    }

    public final void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink != null ? new LinkDTO(avatarLink) : null;
    }

    public final void setSelfLink(String selfLink) {
        this.selfLink = selfLink != null ? new LinkDTO(selfLink) : null;
    }

    public /* synthetic */ LinksDTO(LinkDTO linkDTO, LinkDTO linkDTO2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : linkDTO, (i10 & 2) != 0 ? null : linkDTO2);
    }

    public LinksDTO(String str, String str2) {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        setAvatarLink(str);
        setSelfLink(str2);
    }
}