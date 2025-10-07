package com.disney.wdpro.ticketsaleshybrid.utils;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/utils/PageId;", "", "lead", "Lcom/disney/wdpro/ticketsaleshybrid/utils/Lead;", "type", "", "(Lcom/disney/wdpro/ticketsaleshybrid/utils/Lead;Ljava/lang/String;)V", "getLead", "()Lcom/disney/wdpro/ticketsaleshybrid/utils/Lead;", "getType", "()Ljava/lang/String;", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class PageId {
    private final Lead lead;
    private final String type;

    public PageId(Lead lead, String type) {
        Intrinsics.checkNotNullParameter(lead, "lead");
        Intrinsics.checkNotNullParameter(type, "type");
        this.lead = lead;
        this.type = type;
    }

    public static /* synthetic */ PageId copy$default(PageId pageId, Lead lead, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lead = pageId.lead;
        }
        if ((i10 & 2) != 0) {
            str = pageId.type;
        }
        return pageId.copy(lead, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Lead getLead() {
        return this.lead;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final PageId copy(Lead lead, String type) {
        Intrinsics.checkNotNullParameter(lead, "lead");
        Intrinsics.checkNotNullParameter(type, "type");
        return new PageId(lead, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageId)) {
            return false;
        }
        PageId pageId = (PageId) other;
        return Intrinsics.areEqual(this.lead, pageId.lead) && Intrinsics.areEqual(this.type, pageId.type);
    }

    public final Lead getLead() {
        return this.lead;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.lead.hashCode() * 31) + this.type.hashCode();
    }

    public String toString() {
        return "PageId(lead=" + this.lead + ", type=" + this.type + ")";
    }

    public /* synthetic */ PageId(Lead lead, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lead, (i10 & 2) != 0 ? "lead" : str);
    }
}