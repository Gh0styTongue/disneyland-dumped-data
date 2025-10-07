package com.disney.wdpro.ref_unify_messaging.p433ui.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import cn.C6198h;
import com.disney.wdpro.commons.adapter.InterfaceC9227a;
import com.disney.wdpro.ref_unify_messaging.model.C20029b;
import com.disney.wdpro.ref_unify_messaging.p433ui.adapters.C20038f;
import com.disney.wdpro.support.accessibility.C20511d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u0012\u0012\b\u0012\u00060\u0002R\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0018\u00010\u0002R\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/d;", "Lcom/disney/wdpro/commons/adapter/a;", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$b;", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f;", "Lcom/disney/wdpro/ref_unify_messaging/model/b;", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$a;)V", "Landroid/content/Context;", "context", "", "textToAnnounce", "", "d", "(Landroid/content/Context;Ljava/lang/String;)V", "holder", "item", "b", "(Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$b;Lcom/disney/wdpro/ref_unify_messaging/model/b;)V", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$a;", "getListener", "()Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$a;", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.ref_unify_messaging.ui.adapters.d */
/* loaded from: classes28.dex */
public final class C20036d implements InterfaceC9227a<C20038f.b, C20029b> {
    private final C20038f.a listener;

    public C20036d(C20038f.a aVar) {
        this.listener = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m61413c(C20036d this$0, C20029b c20029b, C20029b this_apply, View itemView, View view) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(itemView, "$itemView");
        C20038f.a aVar = this$0.listener;
        if (aVar != null) {
            aVar.mo61422B(c20029b, !this_apply.getIsEnabled());
        }
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
        String string = itemView.getResources().getString(this_apply.getIsEnabled() ? C6198h.subscription_list_accessibility_subscription_list_subscribed : C6198h.subscription_list_accessibility_subscription_list_unsubscribed);
        Intrinsics.checkNotNullExpressionValue(string, "itemView.resources.getSt…                        )");
        this$0.m61414d(context, string);
    }

    /* renamed from: d */
    private final void m61414d(Context context, String textToAnnounce) {
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.setClassName(accessibilityEventObtain.getClass().getName());
            accessibilityEventObtain.setPackageName(context.getPackageName());
            accessibilityEventObtain.getText().add(textToAnnounce);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9227a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolderAccessibility(C20038f.b holder, final C20029b item) {
        if (item != null) {
            Intrinsics.checkNotNull(holder);
            C20511d c20511dM62029h = new C20511d(holder.itemView.getContext()).m62031j(item.getDisplayName()).m62031j(item.getDescription()).m62029h(item.getIsEnabled() ? C6198h.subscription_list_accessibility_subscription_list_subscribed : C6198h.subscription_list_accessibility_subscription_list_unsubscribed).m62029h(C6198h.accessibility_button_suffix);
            final View view = holder.itemView;
            view.setContentDescription(c20511dM62029h.toString());
            view.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ref_unify_messaging.ui.adapters.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws Resources.NotFoundException {
                    C20036d.m61413c(this.f42997a, item, item, view, view2);
                }
            });
        }
    }
}