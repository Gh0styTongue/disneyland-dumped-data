package com.disney.wdpro.virtualqueue.core.fragments;

import android.view.View;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentHowToVisitBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
/* synthetic */ class HowToVisitFragment$binding$2 extends FunctionReferenceImpl implements Function1<View, VqFragmentHowToVisitBinding> {
    public static final HowToVisitFragment$binding$2 INSTANCE = new HowToVisitFragment$binding$2();

    HowToVisitFragment$binding$2() {
        super(1, VqFragmentHowToVisitBinding.class, "bind", "bind(Landroid/view/View;)Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentHowToVisitBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final VqFragmentHowToVisitBinding invoke(View p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return VqFragmentHowToVisitBinding.bind(p02);
    }
}