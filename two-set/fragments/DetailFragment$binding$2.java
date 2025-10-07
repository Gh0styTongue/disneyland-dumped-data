package com.disney.wdpro.virtualqueue.core.fragments;

import android.view.View;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
/* synthetic */ class DetailFragment$binding$2 extends FunctionReferenceImpl implements Function1<View, VqFragmentDetailBinding> {
    public static final DetailFragment$binding$2 INSTANCE = new DetailFragment$binding$2();

    DetailFragment$binding$2() {
        super(1, VqFragmentDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final VqFragmentDetailBinding invoke(View p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return VqFragmentDetailBinding.bind(p02);
    }
}