package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/LalEligibleMediaModel;", "", "mediaList", "", "Lcom/disney/wdpro/photopass/services/model/LalEligibleMedia;", "(Ljava/util/List;)V", "getMediaList", "()Ljava/util/List;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LalEligibleMediaModel {
    private final List<LalEligibleMedia> mediaList;

    public LalEligibleMediaModel(List<LalEligibleMedia> mediaList) {
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        this.mediaList = mediaList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LalEligibleMediaModel copy$default(LalEligibleMediaModel lalEligibleMediaModel, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = lalEligibleMediaModel.mediaList;
        }
        return lalEligibleMediaModel.copy(list);
    }

    public final List<LalEligibleMedia> component1() {
        return this.mediaList;
    }

    public final LalEligibleMediaModel copy(List<LalEligibleMedia> mediaList) {
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        return new LalEligibleMediaModel(mediaList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LalEligibleMediaModel) && Intrinsics.areEqual(this.mediaList, ((LalEligibleMediaModel) other).mediaList);
    }

    public final List<LalEligibleMedia> getMediaList() {
        return this.mediaList;
    }

    public int hashCode() {
        return this.mediaList.hashCode();
    }

    public String toString() {
        return "LalEligibleMediaModel(mediaList=" + this.mediaList + ")";
    }
}