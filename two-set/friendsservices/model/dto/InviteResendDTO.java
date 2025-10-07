package com.disney.wdpro.friendsservices.model.dto;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/dto/InviteResendDTO;", "Ljava/io/Serializable;", "post", "Lcom/disney/wdpro/friendsservices/model/dto/InvitePostDTO;", "(Lcom/disney/wdpro/friendsservices/model/dto/InvitePostDTO;)V", "getPost", "()Lcom/disney/wdpro/friendsservices/model/dto/InvitePostDTO;", "setPost", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class InviteResendDTO implements Serializable {
    private InvitePostDTO post;

    public InviteResendDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InviteResendDTO copy$default(InviteResendDTO inviteResendDTO, InvitePostDTO invitePostDTO, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            invitePostDTO = inviteResendDTO.post;
        }
        return inviteResendDTO.copy(invitePostDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final InvitePostDTO getPost() {
        return this.post;
    }

    public final InviteResendDTO copy(InvitePostDTO post) {
        return new InviteResendDTO(post);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InviteResendDTO) && Intrinsics.areEqual(this.post, ((InviteResendDTO) other).post);
    }

    public final InvitePostDTO getPost() {
        return this.post;
    }

    public int hashCode() {
        InvitePostDTO invitePostDTO = this.post;
        if (invitePostDTO == null) {
            return 0;
        }
        return invitePostDTO.hashCode();
    }

    public final void setPost(InvitePostDTO invitePostDTO) {
        this.post = invitePostDTO;
    }

    public String toString() {
        return "InviteResendDTO(post=" + this.post + ")";
    }

    public InviteResendDTO(InvitePostDTO invitePostDTO) {
        this.post = invitePostDTO;
    }

    public /* synthetic */ InviteResendDTO(InvitePostDTO invitePostDTO, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : invitePostDTO);
    }
}