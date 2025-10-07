package com.disney.wdpro.virtualqueue.p462ui.common;

import androidx.view.DefaultLifecycleObserver;
import androidx.view.InterfaceC3814s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"com/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate$1$viewLifecycleOwnerLiveDataObserver$1$onChanged$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/s;", "owner", "", "onDestroy", "(Landroidx/lifecycle/s;)V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.virtualqueue.ui.common.FragmentViewBindingDelegate$1$viewLifecycleOwnerLiveDataObserver$1$onChanged$1 */
/* loaded from: classes20.dex */
public final class C21639x15c3bf27 implements DefaultLifecycleObserver {
    final /* synthetic */ FragmentViewBindingDelegate<T> this$0;

    C21639x15c3bf27(FragmentViewBindingDelegate<T> fragmentViewBindingDelegate) {
        fragmentViewBindingDelegate = fragmentViewBindingDelegate;
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onCreate(InterfaceC3814s interfaceC3814s2) {
        super.onCreate(interfaceC3814s2);
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void onDestroy(InterfaceC3814s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ((FragmentViewBindingDelegate) fragmentViewBindingDelegate).binding = null;
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onPause(InterfaceC3814s interfaceC3814s2) {
        super.onPause(interfaceC3814s2);
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onResume(InterfaceC3814s interfaceC3814s2) {
        super.onResume(interfaceC3814s2);
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onStart(InterfaceC3814s interfaceC3814s2) {
        super.onStart(interfaceC3814s2);
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onStop(InterfaceC3814s interfaceC3814s2) {
        super.onStop(interfaceC3814s2);
    }
}