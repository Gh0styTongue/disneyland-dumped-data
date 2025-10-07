package com.disney.wdpro.virtualqueue.p462ui.common;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p763n4.InterfaceC30606a;

@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"Ln4/a;", "T", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function1;", "Landroid/view/View;", "viewBindingFactory", "Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "viewBinding", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "virtual-queue-lib_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class FragmentViewBindingDelegateKt {
    public static final <T extends InterfaceC30606a> FragmentViewBindingDelegate<T> viewBinding(Fragment fragment, Function1<? super View, ? extends T> viewBindingFactory) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingFactory, "viewBindingFactory");
        return new FragmentViewBindingDelegate<>(fragment, viewBindingFactory);
    }
}