package com.disney.wdpro.virtualqueue.core.fragments;

import android.view.View;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentRedeemBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
/* synthetic */ class RedeemFragment$binding$2 extends FunctionReferenceImpl implements Function1<View, VqFragmentRedeemBinding> {
    public static final RedeemFragment$binding$2 INSTANCE = new RedeemFragment$binding$2();

    RedeemFragment$binding$2() {
        super(1, VqFragmentRedeemBinding.class, "bind", "bind(Landroid/view/View;)Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentRedeemBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final VqFragmentRedeemBinding invoke(View p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return VqFragmentRedeemBinding.bind(p02);
    }
}