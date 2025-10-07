package com.disney.wdpro.virtualqueue.p462ui.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m92037d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m92038d2 = {"<anonymous>", "", "invoke"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
final class VirtualQueueSecretTapAdapter$onBindViewHolder$1$1 extends Lambda implements Function0<Unit> {
    VirtualQueueSecretTapAdapter$onBindViewHolder$1$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        this.this$0.actions.triggerPeekView(this.this$0.fragment);
    }
}