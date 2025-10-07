package com.disney.wdpro.friendsservices.model.dto;

import com.disney.wdpro.friendsservices.model.AccessClassificationType;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/dto/AccessClassificationTypeToDTO;", "Ljava/io/Serializable;", "accessClassification", "Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;", "(Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;)V", "getAccessClassification", "()Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;", "setAccessClassification", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class AccessClassificationTypeToDTO implements Serializable {

    @SerializedName("accessClassificationCode")
    private AccessClassificationType accessClassification;

    public AccessClassificationTypeToDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AccessClassificationTypeToDTO copy$default(AccessClassificationTypeToDTO accessClassificationTypeToDTO, AccessClassificationType accessClassificationType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            accessClassificationType = accessClassificationTypeToDTO.accessClassification;
        }
        return accessClassificationTypeToDTO.copy(accessClassificationType);
    }

    /* renamed from: component1, reason: from getter */
    public final AccessClassificationType getAccessClassification() {
        return this.accessClassification;
    }

    public final AccessClassificationTypeToDTO copy(AccessClassificationType accessClassification) {
        return new AccessClassificationTypeToDTO(accessClassification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccessClassificationTypeToDTO) && this.accessClassification == ((AccessClassificationTypeToDTO) other).accessClassification;
    }

    public final AccessClassificationType getAccessClassification() {
        return this.accessClassification;
    }

    public int hashCode() {
        AccessClassificationType accessClassificationType = this.accessClassification;
        if (accessClassificationType == null) {
            return 0;
        }
        return accessClassificationType.hashCode();
    }

    public final void setAccessClassification(AccessClassificationType accessClassificationType) {
        this.accessClassification = accessClassificationType;
    }

    public String toString() {
        return "AccessClassificationTypeToDTO(accessClassification=" + this.accessClassification + ")";
    }

    public AccessClassificationTypeToDTO(AccessClassificationType accessClassificationType) {
        this.accessClassification = accessClassificationType;
    }

    public /* synthetic */ AccessClassificationTypeToDTO(AccessClassificationType accessClassificationType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : accessClassificationType);
    }
}