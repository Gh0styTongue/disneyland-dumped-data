package com.disney.wdpro.virtualqueue.core.fragments;

import android.view.View;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentConflictBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
/* synthetic */ class ConflictFragment$binding$2 extends FunctionReferenceImpl implements Function1<View, VqFragmentConflictBinding> {
    public static final ConflictFragment$binding$2 INSTANCE = new ConflictFragment$binding$2();

    ConflictFragment$binding$2() {
        super(1, VqFragmentConflictBinding.class, "bind", "bind(Landroid/view/View;)Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentConflictBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final VqFragmentConflictBinding invoke(View p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return VqFragmentConflictBinding.bind(p02);
    }
}