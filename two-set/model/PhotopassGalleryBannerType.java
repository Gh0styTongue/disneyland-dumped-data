package com.disney.wdpro.photopass.services.model;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/PhotopassGalleryBannerType;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "AP_ADD_ON", "EZPRINTS", "ACTIVATION_GUIDE", "MEMORY_MAKER", "Companion", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public enum PhotopassGalleryBannerType {
    AP_ADD_ON("ap-add-on"),
    EZPRINTS("ezprints"),
    ACTIVATION_GUIDE("activation-guidance"),
    MEMORY_MAKER("memory-maker");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/PhotopassGalleryBannerType$Companion;", "", "()V", "fromId", "Lcom/disney/wdpro/photopass/services/model/PhotopassGalleryBannerType;", "id", "", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @SourceDebugExtension({"SMAP\nGalleryModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryModel.kt\ncom/disney/wdpro/photopass/services/model/PhotopassGalleryBannerType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,85:1\n1109#2,2:86\n*S KotlinDebug\n*F\n+ 1 GalleryModel.kt\ncom/disney/wdpro/photopass/services/model/PhotopassGalleryBannerType$Companion\n*L\n81#1:86,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PhotopassGalleryBannerType fromId(String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            for (PhotopassGalleryBannerType photopassGalleryBannerType : PhotopassGalleryBannerType.values()) {
                if (Intrinsics.areEqual(photopassGalleryBannerType.id, id2)) {
                    return photopassGalleryBannerType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    PhotopassGalleryBannerType(String str) {
        this.id = str;
    }
}