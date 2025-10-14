package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditionsDescriptionsTerms;", "", "id", "", "key", "", "text", "type", "usageType", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getKey", "()Ljava/lang/String;", "getText", "getType", "getUsageType", "component1", "component2", "component3", "component4", "component5", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LexVASPoliciesConditionsDescriptionsTerms {
    private final long id;
    private final String key;
    private final String text;
    private final String type;
    private final String usageType;

    public LexVASPoliciesConditionsDescriptionsTerms(long j10, String key, String text, String type, String usageType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(usageType, "usageType");
        this.id = j10;
        this.key = key;
        this.text = text;
        this.type = type;
        this.usageType = usageType;
    }

    public static /* synthetic */ LexVASPoliciesConditionsDescriptionsTerms copy$default(LexVASPoliciesConditionsDescriptionsTerms lexVASPoliciesConditionsDescriptionsTerms, long j10, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = lexVASPoliciesConditionsDescriptionsTerms.id;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = lexVASPoliciesConditionsDescriptionsTerms.key;
        }
        String str5 = str;
        if ((i10 & 4) != 0) {
            str2 = lexVASPoliciesConditionsDescriptionsTerms.text;
        }
        String str6 = str2;
        if ((i10 & 8) != 0) {
            str3 = lexVASPoliciesConditionsDescriptionsTerms.type;
        }
        String str7 = str3;
        if ((i10 & 16) != 0) {
            str4 = lexVASPoliciesConditionsDescriptionsTerms.usageType;
        }
        return lexVASPoliciesConditionsDescriptionsTerms.copy(j11, str5, str6, str7, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUsageType() {
        return this.usageType;
    }

    public final LexVASPoliciesConditionsDescriptionsTerms copy(long id2, String key, String text, String type, String usageType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(usageType, "usageType");
        return new LexVASPoliciesConditionsDescriptionsTerms(id2, key, text, type, usageType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LexVASPoliciesConditionsDescriptionsTerms)) {
            return false;
        }
        LexVASPoliciesConditionsDescriptionsTerms lexVASPoliciesConditionsDescriptionsTerms = (LexVASPoliciesConditionsDescriptionsTerms) other;
        return this.id == lexVASPoliciesConditionsDescriptionsTerms.id && Intrinsics.areEqual(this.key, lexVASPoliciesConditionsDescriptionsTerms.key) && Intrinsics.areEqual(this.text, lexVASPoliciesConditionsDescriptionsTerms.text) && Intrinsics.areEqual(this.type, lexVASPoliciesConditionsDescriptionsTerms.type) && Intrinsics.areEqual(this.usageType, lexVASPoliciesConditionsDescriptionsTerms.usageType);
    }

    public final long getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUsageType() {
        return this.usageType;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + this.key.hashCode()) * 31) + this.text.hashCode()) * 31) + this.type.hashCode()) * 31) + this.usageType.hashCode();
    }

    public String toString() {
        return "LexVASPoliciesConditionsDescriptionsTerms(id=" + this.id + ", key=" + this.key + ", text=" + this.text + ", type=" + this.type + ", usageType=" + this.usageType + ")";
    }
}