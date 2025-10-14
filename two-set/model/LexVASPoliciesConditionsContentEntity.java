package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditionsContentEntity;", "", "entityKey", "", "contentEntityIdType", "(Ljava/lang/String;Ljava/lang/String;)V", "getContentEntityIdType", "()Ljava/lang/String;", "getEntityKey", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LexVASPoliciesConditionsContentEntity {
    private final String contentEntityIdType;
    private final String entityKey;

    public LexVASPoliciesConditionsContentEntity(String entityKey, String contentEntityIdType) {
        Intrinsics.checkNotNullParameter(entityKey, "entityKey");
        Intrinsics.checkNotNullParameter(contentEntityIdType, "contentEntityIdType");
        this.entityKey = entityKey;
        this.contentEntityIdType = contentEntityIdType;
    }

    public static /* synthetic */ LexVASPoliciesConditionsContentEntity copy$default(LexVASPoliciesConditionsContentEntity lexVASPoliciesConditionsContentEntity, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lexVASPoliciesConditionsContentEntity.entityKey;
        }
        if ((i10 & 2) != 0) {
            str2 = lexVASPoliciesConditionsContentEntity.contentEntityIdType;
        }
        return lexVASPoliciesConditionsContentEntity.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEntityKey() {
        return this.entityKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContentEntityIdType() {
        return this.contentEntityIdType;
    }

    public final LexVASPoliciesConditionsContentEntity copy(String entityKey, String contentEntityIdType) {
        Intrinsics.checkNotNullParameter(entityKey, "entityKey");
        Intrinsics.checkNotNullParameter(contentEntityIdType, "contentEntityIdType");
        return new LexVASPoliciesConditionsContentEntity(entityKey, contentEntityIdType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LexVASPoliciesConditionsContentEntity)) {
            return false;
        }
        LexVASPoliciesConditionsContentEntity lexVASPoliciesConditionsContentEntity = (LexVASPoliciesConditionsContentEntity) other;
        return Intrinsics.areEqual(this.entityKey, lexVASPoliciesConditionsContentEntity.entityKey) && Intrinsics.areEqual(this.contentEntityIdType, lexVASPoliciesConditionsContentEntity.contentEntityIdType);
    }

    public final String getContentEntityIdType() {
        return this.contentEntityIdType;
    }

    public final String getEntityKey() {
        return this.entityKey;
    }

    public int hashCode() {
        return (this.entityKey.hashCode() * 31) + this.contentEntityIdType.hashCode();
    }

    public String toString() {
        return "LexVASPoliciesConditionsContentEntity(entityKey=" + this.entityKey + ", contentEntityIdType=" + this.contentEntityIdType + ")";
    }
}