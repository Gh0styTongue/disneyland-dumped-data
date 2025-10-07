package com.disney.wdpro.ref_unify_messaging.p433ui.adapters;

import com.couchbase.lite.internal.BaseTLSIdentity;
import com.disney.wdpro.commons.adapter.C9230d;
import com.disney.wdpro.commons.adapter.C9231e;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.ref_unify_messaging.model.C20029b;
import com.disney.wdpro.ref_unify_messaging.p433ui.adapters.C20034b;
import com.disney.wdpro.ref_unify_messaging.p433ui.adapters.C20038f;
import com.disney.wdpro.support.recyclerview.C20892a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/e;", "Lcom/disney/wdpro/commons/adapter/e;", "Lcom/disney/wdpro/commons/adapter/g;", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$a;", "toggledListener", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$a;Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/b$a;)V", "", "Lcom/disney/wdpro/ref_unify_messaging/model/b;", "list", "", "N", "(Ljava/util/List;)V", "item", "P", "(Lcom/disney/wdpro/ref_unify_messaging/model/b;)V", BaseTLSIdentity.CERT_ATTRIBUTE_ORGANIZATION, "()V", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nSubscriptionListsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionListsAdapter.kt\ncom/disney/wdpro/ref_unify_messaging/ui/adapters/SubscriptionListsAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* renamed from: com.disney.wdpro.ref_unify_messaging.ui.adapters.e */
/* loaded from: classes28.dex */
public final class C20037e extends C9231e<InterfaceC9233g> {
    public C20037e(C20038f.a toggledListener, C20034b.a listener) {
        Intrinsics.checkNotNullParameter(toggledListener, "toggledListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.delegateAdapters.m5321k(1, new C20892a(new C20038f(toggledListener), new C20036d(toggledListener)));
        this.delegateAdapters.m5321k(2, new C20034b(listener));
    }

    /* renamed from: N */
    public final void m61416N(List<C20029b> list) {
        List<T> list2 = this.items;
        list2.clear();
        if (list != null) {
            list2.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* renamed from: O */
    public final void m61417O() {
        this.items.clear();
        notifyDataSetChanged();
        addViewTypeOnceAndNotify(new C9230d(2));
    }

    /* renamed from: P */
    public final void m61418P(C20029b item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int iIndexOf = this.items.indexOf(item);
        if (iIndexOf >= 0) {
            notifyItemChanged(iIndexOf);
        }
    }
}