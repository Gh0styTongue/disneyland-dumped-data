package com.disney.wdpro.enchanting_extras_ui.utils;

import android.net.Uri;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/enchanting_extras_ui/utils/TextUtils;", "", "()V", "getFinderPathUri", "Landroid/net/Uri;", "storeId", "", "facilityId", "entityType", "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes25.dex */
public final class TextUtils {
    public static final TextUtils INSTANCE = new TextUtils();

    private TextUtils() {
    }

    public final Uri getFinderPathUri(String storeId, String facilityId, String entityType) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%1$s://finder/detail?facilityId=%2$s;entityType=%3$s", Arrays.copyOf(new Object[]{storeId, facilityId, entityType}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(String.format(FIND… facilityId, entityType))");
        return uri;
    }
}