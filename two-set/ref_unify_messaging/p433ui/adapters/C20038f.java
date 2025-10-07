package com.disney.wdpro.ref_unify_messaging.p433ui.adapters;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import cn.C6196f;
import cn.C6197g;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.recommender.core.themer.RecommenderThemerConstants;
import com.disney.wdpro.ref_unify_messaging.model.C20029b;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\b\u0012\u00060\u0002R\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u000fB\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\u000e2\n\u0010\f\u001a\u00060\u0002R\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$b;", "Lcom/disney/wdpro/ref_unify_messaging/model/b;", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$a;)V", "Landroid/view/ViewGroup;", "parent", "c", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$b;", "holder", "item", "", "b", "(Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$b;Lcom/disney/wdpro/ref_unify_messaging/model/b;)V", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$a;", "a", "()Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$a;", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.ref_unify_messaging.ui.adapters.f */
/* loaded from: classes28.dex */
public final class C20038f implements InterfaceC9229c<b, C20029b> {
    private final a listener;

    @Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$a;", "", "Lcom/disney/wdpro/ref_unify_messaging/model/b;", "item", "", RecommenderThemerConstants.CHECKED, "", "B", "(Lcom/disney/wdpro/ref_unify_messaging/model/b;Z)V", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.ref_unify_messaging.ui.adapters.f$a */
    public interface a {
        /* renamed from: B */
        void mo61422B(C20029b item, boolean checked);
    }

    @Metadata(m92037d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$b;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f;Landroid/view/ViewGroup;)V", "Lcom/disney/wdpro/ref_unify_messaging/model/b;", "item", "", "h", "(Lcom/disney/wdpro/ref_unify_messaging/model/b;)V", "Landroid/widget/CompoundButton;", "buttonView", "", "isChecked", "onCheckedChanged", "(Landroid/widget/CompoundButton;Z)V", "Lcom/disney/wdpro/ref_unify_messaging/model/b;", "Landroid/widget/TextView;", "titleTV", "Landroid/widget/TextView;", "descriptionTV", "Landroidx/appcompat/widget/SwitchCompat;", "enabledBTN", "Landroidx/appcompat/widget/SwitchCompat;", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.ref_unify_messaging.ui.adapters.f$b */
    public final class b extends RecyclerView.AbstractC4902e0 implements CompoundButton.OnCheckedChangeListener {
        private final TextView descriptionTV;
        private final SwitchCompat enabledBTN;
        private C20029b item;
        final /* synthetic */ C20038f this$0;
        private final TextView titleTV;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C20038f c20038f, ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(C6197g.subscription_list_item, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.this$0 = c20038f;
            View viewFindViewById = this.itemView.findViewById(C6196f.subscription_list_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.subscription_list_name)");
            this.titleTV = (TextView) viewFindViewById;
            View viewFindViewById2 = this.itemView.findViewById(C6196f.subscription_list_description);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.…ription_list_description)");
            this.descriptionTV = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.itemView.findViewById(C6196f.subscription_list_toggle);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "itemView.findViewById(R.…subscription_list_toggle)");
            this.enabledBTN = (SwitchCompat) viewFindViewById3;
        }

        /* renamed from: h */
        public final void m61423h(C20029b item) throws Resources.NotFoundException {
            if (item != null) {
                this.item = item;
                this.titleTV.setText(item.getDisplayName());
                this.descriptionTV.setText(item.getDescription());
                this.enabledBTN.setOnCheckedChangeListener(null);
                this.enabledBTN.setChecked(item.getIsEnabled());
                this.enabledBTN.setOnCheckedChangeListener(this);
            }
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            a listener = this.this$0.getListener();
            if (listener != null) {
                C20029b c20029b = this.item;
                if (c20029b == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("item");
                    c20029b = null;
                }
                listener.mo61422B(c20029b, isChecked);
            }
        }
    }

    public C20038f(a aVar) {
        this.listener = aVar;
    }

    /* renamed from: a, reason: from getter */
    public final a getListener() {
        return this.listener;
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b holder, C20029b item) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.m61423h(item);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new b(this, parent);
    }
}