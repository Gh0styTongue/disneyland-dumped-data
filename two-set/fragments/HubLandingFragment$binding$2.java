package com.disney.wdpro.virtualqueue.core.fragments;

import android.view.View;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentHubLandingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
/* synthetic */ class HubLandingFragment$binding$2 extends FunctionReferenceImpl implements Function1<View, VqFragmentHubLandingBinding> {
    public static final HubLandingFragment$binding$2 INSTANCE = new HubLandingFragment$binding$2();

    HubLandingFragment$binding$2() {
        super(1, VqFragmentHubLandingBinding.class, "bind", "bind(Landroid/view/View;)Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentHubLandingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final VqFragmentHubLandingBinding invoke(View p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return VqFragmentHubLandingBinding.bind(p02);
    }
}