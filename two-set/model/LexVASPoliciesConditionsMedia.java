package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditionsMedia;", "", "webfont", "Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditionsMediaFont;", "(Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditionsMediaFont;)V", "getWebfont", "()Lcom/disney/wdpro/photopass/services/model/LexVASPoliciesConditionsMediaFont;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LexVASPoliciesConditionsMedia {
    private final LexVASPoliciesConditionsMediaFont webfont;

    public LexVASPoliciesConditionsMedia(LexVASPoliciesConditionsMediaFont webfont) {
        Intrinsics.checkNotNullParameter(webfont, "webfont");
        this.webfont = webfont;
    }

    public static /* synthetic */ LexVASPoliciesConditionsMedia copy$default(LexVASPoliciesConditionsMedia lexVASPoliciesConditionsMedia, LexVASPoliciesConditionsMediaFont lexVASPoliciesConditionsMediaFont, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lexVASPoliciesConditionsMediaFont = lexVASPoliciesConditionsMedia.webfont;
        }
        return lexVASPoliciesConditionsMedia.copy(lexVASPoliciesConditionsMediaFont);
    }

    /* renamed from: component1, reason: from getter */
    public final LexVASPoliciesConditionsMediaFont getWebfont() {
        return this.webfont;
    }

    public final LexVASPoliciesConditionsMedia copy(LexVASPoliciesConditionsMediaFont webfont) {
        Intrinsics.checkNotNullParameter(webfont, "webfont");
        return new LexVASPoliciesConditionsMedia(webfont);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LexVASPoliciesConditionsMedia) && Intrinsics.areEqual(this.webfont, ((LexVASPoliciesConditionsMedia) other).webfont);
    }

    public final LexVASPoliciesConditionsMediaFont getWebfont() {
        return this.webfont;
    }

    public int hashCode() {
        return this.webfont.hashCode();
    }

    public String toString() {
        return "LexVASPoliciesConditionsMedia(webfont=" + this.webfont + ")";
    }
}