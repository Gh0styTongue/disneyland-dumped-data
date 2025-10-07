package com.disney.wdpro.virtualqueue.p462ui.common;

import androidx.view.DefaultLifecycleObserver;
import androidx.view.InterfaceC3785d0;
import androidx.view.InterfaceC3814s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m92038d2 = {"Ln4/a;", "T", "Landroidx/lifecycle/s;", "it", "", "<anonymous>", "(Landroidx/lifecycle/s;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
/* renamed from: com.disney.wdpro.virtualqueue.ui.common.FragmentViewBindingDelegate$1$viewLifecycleOwnerLiveDataObserver$1 */
/* loaded from: classes20.dex */
final class C21638x8986ac29 implements InterfaceC3785d0<InterfaceC3814s> {
    final /* synthetic */ FragmentViewBindingDelegate<T> this$0;

    C21638x8986ac29(FragmentViewBindingDelegate<T> fragmentViewBindingDelegate) {
        this = fragmentViewBindingDelegate;
    }

    @Override // androidx.view.InterfaceC3785d0
    public final void onChanged(InterfaceC3814s interfaceC3814s) {
        if (interfaceC3814s == null) {
            return;
        }
        interfaceC3814s.getLifecycle().mo20124a(new DefaultLifecycleObserver() { // from class: com.disney.wdpro.virtualqueue.ui.common.FragmentViewBindingDelegate$1$viewLifecycleOwnerLiveDataObserver$1$onChanged$1
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
        });
    }
}