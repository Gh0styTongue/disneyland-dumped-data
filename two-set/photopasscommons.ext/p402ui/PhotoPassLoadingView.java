package com.disney.wdpro.photopasscommons.ext.p402ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import hm.C28424a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/photopasscommons/ext/ui/PhotoPassLoadingView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lhm/a;", "viewBinding", "Lhm/a;", "Companion", "a", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final class PhotoPassLoadingView extends LinearLayout {
    private static final String LOTTIE_ANIMATION_FILE_FORMAT = ".json";
    private C28424a viewBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoPassLoadingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        C28424a c28424aM88785c = C28424a.m88785c(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c28424aM88785c, "inflate(LayoutInflater.from(context), this, true)");
        this.viewBinding = c28424aM88785c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoPassLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}