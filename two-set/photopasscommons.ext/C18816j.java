package com.disney.wdpro.photopasscommons.ext;

import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C7981c;
import gm.C28198a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"Landroid/widget/ImageView;", "", "url", "", "placeHolder", "errorImage", "", "a", "(Landroid/widget/ImageView;Ljava/lang/String;II)V", "photopasscommons_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.j */
/* loaded from: classes15.dex */
public final class C18816j {
    /* renamed from: a */
    public static final void m60579a(ImageView imageView, String url, int i10, int i11) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        ComponentCallbacks2C7981c.m35837C(imageView).mo103174load(url).placeholder(i10).error(i11).into(imageView);
    }

    /* renamed from: b */
    public static /* synthetic */ void m60580b(ImageView imageView, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = C28198a.loading_image_square;
        }
        if ((i12 & 4) != 0) {
            i11 = C28198a.no_image;
        }
        m60579a(imageView, str, i10, i11);
    }
}