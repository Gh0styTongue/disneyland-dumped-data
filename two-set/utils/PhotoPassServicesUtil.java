package com.disney.wdpro.photopass.services.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006\"\u00020\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/utils/PhotoPassServicesUtil;", "", "()V", "buildURL", "", "paths", "", "([Ljava/lang/String;)Ljava/lang/String;", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nPhotoPassServicesUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhotoPassServicesUtil.kt\ncom/disney/wdpro/photopass/services/utils/PhotoPassServicesUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n13644#2,3:23\n*S KotlinDebug\n*F\n+ 1 PhotoPassServicesUtil.kt\ncom/disney/wdpro/photopass/services/utils/PhotoPassServicesUtil\n*L\n12#1:23,3\n*E\n"})
/* loaded from: classes15.dex */
public final class PhotoPassServicesUtil {
    public static final PhotoPassServicesUtil INSTANCE = new PhotoPassServicesUtil();

    private PhotoPassServicesUtil() {
    }

    public final String buildURL(String... paths) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        StringBuilder sb2 = new StringBuilder();
        int length = paths.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            sb2.append(paths[i10]);
            if (i11 != paths.length - 1) {
                sb2.append("/");
            }
            i10++;
            i11 = i12;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply {\n…   }\n        }.toString()");
        return string;
    }
}