package com.disney.wdpro.ticketsaleshybrid.utils;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.park.activities.hybrid.ContactUsHybridActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/utils/Lead;", "", "leadId", "", ContactUsHybridActivity.CONTACT_US_URL_TOPIC_PARAM, "(Ljava/lang/String;Ljava/lang/String;)V", "getLeadId", "()Ljava/lang/String;", "getTopic", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class Lead {
    private final String leadId;
    private final String topic;

    public Lead(String leadId, String topic) {
        Intrinsics.checkNotNullParameter(leadId, "leadId");
        Intrinsics.checkNotNullParameter(topic, "topic");
        this.leadId = leadId;
        this.topic = topic;
    }

    public static /* synthetic */ Lead copy$default(Lead lead, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lead.leadId;
        }
        if ((i10 & 2) != 0) {
            str2 = lead.topic;
        }
        return lead.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLeadId() {
        return this.leadId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    public final Lead copy(String leadId, String topic) {
        Intrinsics.checkNotNullParameter(leadId, "leadId");
        Intrinsics.checkNotNullParameter(topic, "topic");
        return new Lead(leadId, topic);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Lead)) {
            return false;
        }
        Lead lead = (Lead) other;
        return Intrinsics.areEqual(this.leadId, lead.leadId) && Intrinsics.areEqual(this.topic, lead.topic);
    }

    public final String getLeadId() {
        return this.leadId;
    }

    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return (this.leadId.hashCode() * 31) + this.topic.hashCode();
    }

    public String toString() {
        return "Lead(leadId=" + this.leadId + ", topic=" + this.topic + ")";
    }

    public /* synthetic */ Lead(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "EntryPage" : str2);
    }
}