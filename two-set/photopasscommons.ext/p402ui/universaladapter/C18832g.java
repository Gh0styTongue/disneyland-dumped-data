package com.disney.wdpro.photopasscommons.ext.p402ui.universaladapter;

import androidx.recyclerview.widget.C4938h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m92038d2 = {"Landroidx/recyclerview/widget/h$f;", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/h;", "BASE_DIFF_CALLBACK", "Landroidx/recyclerview/widget/h$f;", "a", "()Landroidx/recyclerview/widget/h$f;", "photopasscommons_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.ui.universaladapter.g */
/* loaded from: classes15.dex */
public final class C18832g {
    private static final C4938h.f<InterfaceC18833h> BASE_DIFF_CALLBACK = new a();

    @Metadata(m92037d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m92038d2 = {"com/disney/wdpro/photopasscommons/ext/ui/universaladapter/g$a", "Landroidx/recyclerview/widget/h$f;", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/h;", "oldItem", "newItem", "", "b", "(Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/h;Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/h;)Z", "a", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.photopasscommons.ext.ui.universaladapter.g$a */
    public static final class a extends C4938h.f<InterfaceC18833h> {
        a() {
        }

        @Override // androidx.recyclerview.widget.C4938h.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(InterfaceC18833h oldItem, InterfaceC18833h newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.C4938h.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(InterfaceC18833h oldItem, InterfaceC18833h newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }

    /* renamed from: a */
    public static final C4938h.f<InterfaceC18833h> m60613a() {
        return BASE_DIFF_CALLBACK;
    }
}