package com.disney.wdpro.virtualqueue.core.manager;

import com.disney.wdpro.virtualqueue.service.model.Queue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m92037d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m92038d2 = {"<anonymous>", "", "it", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "invoke"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
final class VirtualQueueAnalytics$trackHubLoadOnLandingScreen$queueList$1 extends Lambda implements Function1<Queue, CharSequence> {
    public static final VirtualQueueAnalytics$trackHubLoadOnLandingScreen$queueList$1 INSTANCE = ;

    VirtualQueueAnalytics$trackHubLoadOnLandingScreen$queueList$1() {
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Queue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getName() + ":dayphase=" + it.getDayPhase() + VirtualQueueAnalytics.IS_ACCEPTING_JOIN + it.getIsAcceptingJoins() + VirtualQueueAnalytics.IS_ACCEPTING_PARTY_CREATION + it.getIsAcceptingPartyCreation();
    }
}