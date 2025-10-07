package com.disney.wdpro.photopasscommons.ext.p402ui.universaladapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC4948r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u001e\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004\"\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m92038d2 = {"Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/f;", "Landroidx/recyclerview/widget/r;", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/h;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/a;", "types", "<init>", "([Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/a;)V", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/c;", "clickListener", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/b;", "cellAdapterDataListener", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/e;", "cellViewClickListener", "", "setListeners", "(Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/c;Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/b;Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/e;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$e0;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$e0;I)V", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/d;", "cellTypes", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/d;", "getCellTypes", "()Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/d;", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.ui.universaladapter.f */
/* loaded from: classes15.dex */
public abstract class AbstractC18831f extends AbstractC4948r<InterfaceC18833h, RecyclerView.AbstractC4902e0> {
    private final C18829d<InterfaceC18833h> cellTypes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC18831f(AbstractC18826a<InterfaceC18833h>... types) {
        super(C18832g.m60613a());
        Intrinsics.checkNotNullParameter(types, "types");
        this.cellTypes = new C18829d<>((AbstractC18826a[]) Arrays.copyOf(types, types.length));
    }

    protected final C18829d<InterfaceC18833h> getCellTypes() {
        return this.cellTypes;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.cellTypes.m60611b(getItem(position)).type();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC4902e0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        InterfaceC18833h item = getItem(position);
        this.cellTypes.m60611b(item).bind(holder, item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC4902e0 onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.cellTypes.m60610a(viewType).holder(parent);
    }

    public final void setListeners(InterfaceC18828c clickListener, InterfaceC18827b cellAdapterDataListener, InterfaceC18830e cellViewClickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        Intrinsics.checkNotNullParameter(cellAdapterDataListener, "cellAdapterDataListener");
        Intrinsics.checkNotNullParameter(cellViewClickListener, "cellViewClickListener");
        this.cellTypes.m60612c(clickListener, cellAdapterDataListener, cellViewClickListener);
    }
}