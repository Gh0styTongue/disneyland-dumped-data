package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/ExtensionEligibility;", "", "hasNoneCompExt", "", "hasEligibleMediaCompExt", "(ZZ)V", "getHasEligibleMediaCompExt", "()Z", "getHasNoneCompExt", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "", "toString", "", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ExtensionEligibility {
    private final boolean hasEligibleMediaCompExt;
    private final boolean hasNoneCompExt;

    public ExtensionEligibility(boolean z10, boolean z11) {
        this.hasNoneCompExt = z10;
        this.hasEligibleMediaCompExt = z11;
    }

    public static /* synthetic */ ExtensionEligibility copy$default(ExtensionEligibility extensionEligibility, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = extensionEligibility.hasNoneCompExt;
        }
        if ((i10 & 2) != 0) {
            z11 = extensionEligibility.hasEligibleMediaCompExt;
        }
        return extensionEligibility.copy(z10, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasNoneCompExt() {
        return this.hasNoneCompExt;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasEligibleMediaCompExt() {
        return this.hasEligibleMediaCompExt;
    }

    public final ExtensionEligibility copy(boolean hasNoneCompExt, boolean hasEligibleMediaCompExt) {
        return new ExtensionEligibility(hasNoneCompExt, hasEligibleMediaCompExt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtensionEligibility)) {
            return false;
        }
        ExtensionEligibility extensionEligibility = (ExtensionEligibility) other;
        return this.hasNoneCompExt == extensionEligibility.hasNoneCompExt && this.hasEligibleMediaCompExt == extensionEligibility.hasEligibleMediaCompExt;
    }

    public final boolean getHasEligibleMediaCompExt() {
        return this.hasEligibleMediaCompExt;
    }

    public final boolean getHasNoneCompExt() {
        return this.hasNoneCompExt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.hasNoneCompExt;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.hasEligibleMediaCompExt;
        return i10 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "ExtensionEligibility(hasNoneCompExt=" + this.hasNoneCompExt + ", hasEligibleMediaCompExt=" + this.hasEligibleMediaCompExt + ")";
    }
}