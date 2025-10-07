package com.disney.wdpro.photopasscommons.ext;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.AbstractC0205r;
import androidx.view.InterfaceC3814s;
import androidx.view.OnBackPressedDispatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p763n4.InterfaceC30606a;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0007*\u00020\u0006*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m92038d2 = {"Landroidx/fragment/app/Fragment;", "Lkotlin/Function0;", "", "onBackPressed", "a", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V", "Ln4/a;", "T", "Lkotlin/Function1;", "Landroid/view/View;", "viewBindingFactory", "Lcom/disney/wdpro/photopasscommons/ext/i;", "b", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)Lcom/disney/wdpro/photopasscommons/ext/i;", "photopasscommons_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.g */
/* loaded from: classes15.dex */
public final class C18813g {

    @Metadata(m92037d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m92038d2 = {"com/disney/wdpro/photopasscommons/ext/g$a", "Landroidx/activity/r;", "", "f", "()V", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.photopasscommons.ext.g$a */
    public static final class a extends AbstractC0205r {
        final /* synthetic */ Function0<Unit> $onBackPressed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(true);
            this.$onBackPressed = function0;
        }

        @Override // androidx.view.AbstractC0205r
        /* renamed from: f */
        public void mo827f() {
            this.$onBackPressed.invoke();
        }
    }

    /* renamed from: a */
    public static final void m60572a(Fragment fragment, Function0<Unit> onBackPressed) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        a aVar = new a(onBackPressed);
        OnBackPressedDispatcher onBackPressedDispatcher = fragment.requireActivity().getOnBackPressedDispatcher();
        InterfaceC3814s viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        onBackPressedDispatcher.m799i(viewLifecycleOwner, aVar);
    }

    /* renamed from: b */
    public static final <T extends InterfaceC30606a> C18815i<T> m60573b(Fragment fragment, Function1<? super View, ? extends T> viewBindingFactory) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingFactory, "viewBindingFactory");
        return new C18815i<>(fragment, viewBindingFactory);
    }
}