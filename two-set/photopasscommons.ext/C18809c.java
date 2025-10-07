package com.disney.wdpro.photopasscommons.ext;

import android.graphics.Bitmap;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m92038d2 = {"Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$CompressFormat;", "compressFormat", "", "quality", "", "b", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B", "", "a", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "photopasscommons_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.c */
/* loaded from: classes15.dex */
public final class C18809c {
    /* renamed from: a */
    public static final String m60565a(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(byteArray, Base64.DEFAULT)");
        return strEncodeToString;
    }

    /* renamed from: b */
    public static final byte[] m60566b(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i10) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(compressFormat, "compressFormat");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i10, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "stream.toByteArray()");
        return byteArray;
    }
}