package com.disney.wdpro.photopasscommons.ext;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.DefaultLifecycleObserver;
import androidx.view.InterfaceC3785d0;
import androidx.view.InterfaceC3814s;
import androidx.view.Lifecycle;
import com.disney.wdpro.photopasscommons.ext.C18815i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import p763n4.InterfaceC30606a;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/photopasscommons/ext/i;", "Ln4/a;", "T", "Lkotlin/properties/ReadOnlyProperty;", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Function1;", "Landroid/view/View;", "viewBindingFactory", "<init>", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "c", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KProperty;)Ln4/a;", "Landroidx/fragment/app/Fragment;", "b", "()Landroidx/fragment/app/Fragment;", "Lkotlin/jvm/functions/Function1;", "getViewBindingFactory", "()Lkotlin/jvm/functions/Function1;", "binding", "Ln4/a;", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nFragmentViewBindingDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewBindingDelegate.kt\ncom/disney/wdpro/photopasscommons/ext/FragmentViewBindingDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/* renamed from: com.disney.wdpro.photopasscommons.ext.i */
/* loaded from: classes15.dex */
public final class C18815i<T extends InterfaceC30606a> implements ReadOnlyProperty<Fragment, T> {
    private T binding;
    private final Fragment fragment;
    private final Function1<View, T> viewBindingFactory;

    @Metadata(m92037d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m92038d2 = {"com/disney/wdpro/photopasscommons/ext/i$a", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "Landroidx/lifecycle/d0;", "viewLifecycleOwnerLiveDataObserver", "Landroidx/lifecycle/d0;", "getViewLifecycleOwnerLiveDataObserver", "()Landroidx/lifecycle/d0;", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.photopasscommons.ext.i$a */
    public static final class a implements DefaultLifecycleObserver {
        final /* synthetic */ C18815i<T> this$0;
        private final InterfaceC3785d0<InterfaceC3814s> viewLifecycleOwnerLiveDataObserver;

        @Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"com/disney/wdpro/photopasscommons/ext/i$a$a", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/s;", "owner", "", "onDestroy", "(Landroidx/lifecycle/s;)V", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        /* renamed from: com.disney.wdpro.photopasscommons.ext.i$a$a, reason: collision with other inner class name */
        public static final class C34239a implements DefaultLifecycleObserver {
            final /* synthetic */ C18815i<T> this$0;

            C34239a(C18815i<T> c18815i) {
                this.this$0 = c18815i;
            }

            @Override // androidx.view.DefaultLifecycleObserver
            public void onDestroy(InterfaceC3814s owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                ((C18815i) this.this$0).binding = null;
            }
        }

        a(final C18815i<T> c18815i) {
            this.this$0 = c18815i;
            this.viewLifecycleOwnerLiveDataObserver = new InterfaceC3785d0() { // from class: com.disney.wdpro.photopasscommons.ext.h
                @Override // androidx.view.InterfaceC3785d0
                public final void onChanged(Object obj) {
                    C18815i.a.m60578b(c18815i, (InterfaceC3814s) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m60578b(C18815i this$0, InterfaceC3814s interfaceC3814s) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (interfaceC3814s == null) {
                return;
            }
            interfaceC3814s.getLifecycle().mo20124a(new C34239a(this$0));
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C18815i(Fragment fragment, Function1<? super View, ? extends T> viewBindingFactory) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(viewBindingFactory, "viewBindingFactory");
        this.fragment = fragment;
        this.viewBindingFactory = viewBindingFactory;
        fragment.getLifecycle().mo20124a(new a(this));
    }

    /* renamed from: b, reason: from getter */
    public final Fragment getFragment() {
        return this.fragment;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public T getValue(Fragment thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        T t10 = this.binding;
        if (t10 != null) {
            return t10;
        }
        if (!this.fragment.getViewLifecycleOwner().getLifecycle().getState().isAtLeast(Lifecycle.State.INITIALIZED)) {
            throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
        }
        Function1<View, T> function1 = this.viewBindingFactory;
        View viewRequireView = thisRef.requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "thisRef.requireView()");
        T tInvoke = function1.invoke(viewRequireView);
        this.binding = tInvoke;
        return tInvoke;
    }
}