package com.disney.wdpro.photopasscommons.ext.p402ui.universaladapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u001d*\u00020\f2\b\b\u0001\u0010\u001c\u001a\u00020\tH\u0004¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, m92038d2 = {"Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/a;", "T", "", "<init>", "()V", "item", "", "belongsTo", "(Ljava/lang/Object;)Z", "", "type", "()I", "Landroid/view/ViewGroup;", "parent", "Landroidx/recyclerview/widget/RecyclerView$e0;", "holder", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$e0;", "", "bind", "(Landroidx/recyclerview/widget/RecyclerView$e0;Ljava/lang/Object;)V", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/c;", "cellClickListener", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/b;", "cellAdapterData", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/e;", "cellViewClickListener", "setListeners", "(Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/c;Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/b;Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/e;)V", "resource", "Landroid/view/View;", "viewOf", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/c;", "getCellClickListener", "()Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/c;", "setCellClickListener", "(Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/c;)V", "cellAdapterDataListener", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/b;", "getCellAdapterDataListener", "()Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/b;", "setCellAdapterDataListener", "(Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/b;)V", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/e;", "getCellViewClickListener", "()Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/e;", "setCellViewClickListener", "(Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/e;)V", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.ui.universaladapter.a */
/* loaded from: classes15.dex */
public abstract class AbstractC18826a<T> {
    private InterfaceC18827b cellAdapterDataListener;
    private InterfaceC18828c cellClickListener;
    private InterfaceC18830e cellViewClickListener;

    public abstract boolean belongsTo(T item);

    public abstract void bind(RecyclerView.AbstractC4902e0 holder, T item);

    protected final InterfaceC18827b getCellAdapterDataListener() {
        return this.cellAdapterDataListener;
    }

    protected final InterfaceC18828c getCellClickListener() {
        return this.cellClickListener;
    }

    protected final InterfaceC18830e getCellViewClickListener() {
        return this.cellViewClickListener;
    }

    public abstract RecyclerView.AbstractC4902e0 holder(ViewGroup parent);

    protected final void setCellAdapterDataListener(InterfaceC18827b interfaceC18827b) {
        this.cellAdapterDataListener = interfaceC18827b;
    }

    protected final void setCellClickListener(InterfaceC18828c interfaceC18828c) {
        this.cellClickListener = interfaceC18828c;
    }

    protected final void setCellViewClickListener(InterfaceC18830e interfaceC18830e) {
        this.cellViewClickListener = interfaceC18830e;
    }

    public final void setListeners(InterfaceC18828c cellClickListener, InterfaceC18827b cellAdapterData, InterfaceC18830e cellViewClickListener) {
        Intrinsics.checkNotNullParameter(cellAdapterData, "cellAdapterData");
        Intrinsics.checkNotNullParameter(cellViewClickListener, "cellViewClickListener");
        this.cellClickListener = cellClickListener;
        this.cellAdapterDataListener = cellAdapterData;
        this.cellViewClickListener = cellViewClickListener;
    }

    public abstract int type();

    protected final View viewOf(ViewGroup viewGroup, int i10) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(context)\n          …te(resource, this, false)");
        return viewInflate;
    }
}