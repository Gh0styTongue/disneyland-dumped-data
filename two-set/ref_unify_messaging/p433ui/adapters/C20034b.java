package com.disney.wdpro.ref_unify_messaging.p433ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import cn.C6196f;
import cn.C6197g;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\b\u0012\u00060\u0002R\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0014\u000fB\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0018\u00010\u0002R\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/b;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/b$b;", "Lcom/disney/wdpro/commons/adapter/g;", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/b$a;)V", "Landroid/view/ViewGroup;", "parent", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/b$b;", "holder", "item", "", "b", "(Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/b$b;Lcom/disney/wdpro/commons/adapter/g;)V", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/b$a;", "getListener", "()Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/b$a;", "a", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.ref_unify_messaging.ui.adapters.b */
/* loaded from: classes28.dex */
public final class C20034b implements InterfaceC9229c<b, InterfaceC9233g> {
    private final a listener;

    @Metadata(m92037d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/b$a;", "", "", RsaJsonWebKey.SECOND_PRIME_FACTOR_MEMBER_NAME, "()V", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.ref_unify_messaging.ui.adapters.b$a */
    public interface a {
        /* renamed from: q */
        void mo61410q();
    }

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/b$b;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/b;Landroid/view/View;)V", "Landroid/widget/Button;", "enableBTN", "Landroid/widget/Button;", "h", "()Landroid/widget/Button;", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.ref_unify_messaging.ui.adapters.b$b */
    public final class b extends RecyclerView.AbstractC4902e0 {
        private final Button enableBTN;
        final /* synthetic */ C20034b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C20034b c20034b, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = c20034b;
            View viewFindViewById = itemView.findViewById(C6196f.enable_notifications_btn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.…enable_notifications_btn)");
            this.enableBTN = (Button) viewFindViewById;
        }

        /* renamed from: h, reason: from getter */
        public final Button getEnableBTN() {
            return this.enableBTN;
        }
    }

    public C20034b(a aVar) {
        this.listener = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m61407c(C20034b this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a aVar = this$0.listener;
        if (aVar != null) {
            aVar.mo61410q();
        }
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b holder, InterfaceC9233g item) {
        Button enableBTN;
        if (holder == null || (enableBTN = holder.getEnableBTN()) == null) {
            return;
        }
        enableBTN.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ref_unify_messaging.ui.adapters.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20034b.m61407c(this.f42996a, view);
            }
        });
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(C6197g.subscription_lists_notifications_disabled, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new b(this, view);
    }
}