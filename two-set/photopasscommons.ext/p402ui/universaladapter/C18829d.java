package com.disney.wdpro.photopasscommons.ext.p402ui.universaladapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u001e\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\"\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R0\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0018j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m92038d2 = {"Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/d;", "T", "", "", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/a;", "types", "<init>", "([Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/a;)V", "item", "b", "(Ljava/lang/Object;)Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/a;", "", "viewType", "a", "(I)Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/a;", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/c;", "clickListener", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/b;", "cellAdapterDataListener", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/e;", "cellViewClickListener", "", "c", "(Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/c;Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/b;Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/e;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "cellTypes", "Ljava/util/ArrayList;", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nCellTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellTypes.kt\ncom/disney/wdpro/photopasscommons/ext/ui/universaladapter/CellTypes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1855#2,2:32\n*S KotlinDebug\n*F\n+ 1 CellTypes.kt\ncom/disney/wdpro/photopasscommons/ext/ui/universaladapter/CellTypes\n*L\n27#1:32,2\n*E\n"})
/* renamed from: com.disney.wdpro.photopasscommons.ext.ui.universaladapter.d */
/* loaded from: classes15.dex */
public final class C18829d<T> {
    private final ArrayList<AbstractC18826a<T>> cellTypes;

    public C18829d(AbstractC18826a<T>... types) {
        Intrinsics.checkNotNullParameter(types, "types");
        this.cellTypes = CollectionsKt.arrayListOf(Arrays.copyOf(types, types.length));
    }

    /* renamed from: a */
    public final AbstractC18826a<T> m60610a(int viewType) throws NoSuchRecyclerViewTypeException {
        Iterator<AbstractC18826a<T>> it = this.cellTypes.iterator();
        while (it.hasNext()) {
            AbstractC18826a<T> cellType = it.next();
            if (cellType.type() == viewType) {
                Intrinsics.checkNotNullExpressionValue(cellType, "cellType");
                return cellType;
            }
        }
        throw new NoSuchRecyclerViewTypeException("View type not supported");
    }

    /* renamed from: b */
    public final AbstractC18826a<T> m60611b(T item) throws NoSuchRecyclerItemTypeException {
        Iterator<AbstractC18826a<T>> it = this.cellTypes.iterator();
        while (it.hasNext()) {
            AbstractC18826a<T> cellType = it.next();
            if (cellType.belongsTo(item)) {
                Intrinsics.checkNotNullExpressionValue(cellType, "cellType");
                return cellType;
            }
        }
        throw new NoSuchRecyclerItemTypeException("Item type not supported");
    }

    /* renamed from: c */
    public final void m60612c(InterfaceC18828c clickListener, InterfaceC18827b cellAdapterDataListener, InterfaceC18830e cellViewClickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        Intrinsics.checkNotNullParameter(cellAdapterDataListener, "cellAdapterDataListener");
        Intrinsics.checkNotNullParameter(cellViewClickListener, "cellViewClickListener");
        Iterator<T> it = this.cellTypes.iterator();
        while (it.hasNext()) {
            ((AbstractC18826a) it.next()).setListeners(clickListener, cellAdapterDataListener, cellViewClickListener);
        }
    }
}