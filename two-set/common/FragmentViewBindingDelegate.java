package com.disney.wdpro.virtualqueue.p462ui.common;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.DefaultLifecycleObserver;
import androidx.view.InterfaceC3785d0;
import androidx.view.InterfaceC3814s;
import androidx.view.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import p763n4.InterfaceC30606a;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\u00042\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "Ln4/a;", "T", "Lkotlin/properties/ReadOnlyProperty;", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Function1;", "Landroid/view/View;", "viewBindingFactory", "<init>", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KProperty;)Ln4/a;", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "Lkotlin/jvm/functions/Function1;", "getViewBindingFactory", "()Lkotlin/jvm/functions/Function1;", "binding", "Ln4/a;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class FragmentViewBindingDelegate<T extends InterfaceC30606a> implements ReadOnlyProperty<Fragment, T> {
    public static final int $stable = 8;
    private T binding;
    private final Fragment fragment;
    private final Function1<View, T> viewBindingFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewBindingDelegate(Fragment fragment, Function1<? super View, ? extends T> viewBindingFactory) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(viewBindingFactory, "viewBindingFactory");
        this.fragment = fragment;
        this.viewBindingFactory = viewBindingFactory;
        fragment.getLifecycle().mo20124a(new DefaultLifecycleObserver(this) { // from class: com.disney.wdpro.virtualqueue.ui.common.FragmentViewBindingDelegate.1
            final /* synthetic */ FragmentViewBindingDelegate<T> this$0;
            private final InterfaceC3785d0<InterfaceC3814s> viewLifecycleOwnerLiveDataObserver;

            {
                this.this$0 = this;
                this.viewLifecycleOwnerLiveDataObserver = new InterfaceC3785d0<InterfaceC3814s>() { // from class: com.disney.wdpro.virtualqueue.ui.common.FragmentViewBindingDelegate$1$viewLifecycleOwnerLiveDataObserver$1
                    @Override // androidx.view.InterfaceC3785d0
                    public final void onChanged(InterfaceC3814s interfaceC3814s) {
                        if (interfaceC3814s == null) {
                            return;
                        }
                        Lifecycle lifecycle = interfaceC3814s.getLifecycle();
                        final FragmentViewBindingDelegate<T> fragmentViewBindingDelegate = this;
                        lifecycle.mo20124a(new DefaultLifecycleObserver() { // from class: com.disney.wdpro.virtualqueue.ui.common.FragmentViewBindingDelegate$1$viewLifecycleOwnerLiveDataObserver$1$onChanged$1
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
                };
            }

            public final InterfaceC3785d0<InterfaceC3814s> getViewLifecycleOwnerLiveDataObserver() {
                return this.viewLifecycleOwnerLiveDataObserver;
            }

            @Override // androidx.view.DefaultLifecycleObserver
            public void onCreate(InterfaceC3814s owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.this$0.getFragment().getViewLifecycleOwnerLiveData().observeForever(this.viewLifecycleOwnerLiveDataObserver);
            }

            @Override // androidx.view.DefaultLifecycleObserver
            public void onDestroy(InterfaceC3814s owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.this$0.getFragment().getViewLifecycleOwnerLiveData().removeObserver(this.viewLifecycleOwnerLiveDataObserver);
            }

            @Override // androidx.view.DefaultLifecycleObserver
            public /* bridge */ /* synthetic */ void onPause(InterfaceC3814s interfaceC3814s) {
                super.onPause(interfaceC3814s);
            }

            @Override // androidx.view.DefaultLifecycleObserver
            public /* bridge */ /* synthetic */ void onResume(InterfaceC3814s interfaceC3814s) {
                super.onResume(interfaceC3814s);
            }

            @Override // androidx.view.DefaultLifecycleObserver
            public /* bridge */ /* synthetic */ void onStart(InterfaceC3814s interfaceC3814s) {
                super.onStart(interfaceC3814s);
            }

            @Override // androidx.view.DefaultLifecycleObserver
            public /* bridge */ /* synthetic */ void onStop(InterfaceC3814s interfaceC3814s) {
                super.onStop(interfaceC3814s);
            }
        });
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Fragment fragment, KProperty kProperty) {
        return getValue2(fragment, (KProperty<?>) kProperty);
    }

    public final Function1<View, T> getViewBindingFactory() {
        return this.viewBindingFactory;
    }

    /* renamed from: getValue, reason: avoid collision after fix types in other method */
    public T getValue2(Fragment thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        T t10 = this.binding;
        if (t10 != null) {
            return t10;
        }
        try {
            if (!this.fragment.getViewLifecycleOwner().getLifecycle().getState().isAtLeast(Lifecycle.State.INITIALIZED)) {
                throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
            }
            Function1<View, T> function1 = this.viewBindingFactory;
            View viewRequireView = thisRef.requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView, "thisRef.requireView()");
            T tInvoke = function1.invoke(viewRequireView);
            this.binding = tInvoke;
            return tInvoke;
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}