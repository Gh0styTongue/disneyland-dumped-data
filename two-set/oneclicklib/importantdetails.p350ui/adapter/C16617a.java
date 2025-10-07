package com.disney.wdpro.oneclicklib.importantdetails.p350ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.couchbase.lite.internal.BaseTLSIdentity;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mk.C30537b;

@Metadata(m92037d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\r2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/importantdetails/ui/adapter/a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/disney/wdpro/oneclicklib/importantdetails/ui/adapter/ImportantDetailViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", BaseTLSIdentity.CERT_ATTRIBUTE_ORGANIZATION, "(Landroid/view/ViewGroup;I)Lcom/disney/wdpro/oneclicklib/importantdetails/ui/adapter/ImportantDetailViewHolder;", "holder", "position", "", "N", "(Lcom/disney/wdpro/oneclicklib/importantdetails/ui/adapter/ImportantDetailViewHolder;I)V", "getItemCount", "()I", "", "", "items", "P", "(Ljava/util/List;)V", "importantDetailsList", "Ljava/util/List;", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nImportantDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImportantDetailsAdapter.kt\ncom/disney/wdpro/oneclicklib/importantdetails/ui/adapter/ImportantDetailsAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/* renamed from: com.disney.wdpro.oneclicklib.importantdetails.ui.adapter.a */
/* loaded from: classes3.dex */
public final class C16617a extends RecyclerView.Adapter<ImportantDetailViewHolder> {
    private List<String> importantDetailsList = CollectionsKt.emptyList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ImportantDetailViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        String str = this.importantDetailsList.get(position);
        if (str != null) {
            holder.m56542i(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public ImportantDetailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C30537b.important_details_one_click_view_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context).inf…view_item, parent, false)");
        return new ImportantDetailViewHolder(viewInflate);
    }

    /* renamed from: P */
    public final void m56545P(List<String> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.importantDetailsList = items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.importantDetailsList.size();
    }
}