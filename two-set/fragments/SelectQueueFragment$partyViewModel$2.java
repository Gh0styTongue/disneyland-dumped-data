package com.disney.wdpro.virtualqueue.core.fragments;

import androidx.view.C3827w0;
import com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m92037d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m92038d2 = {"<anonymous>", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel;", "invoke"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
final class SelectQueueFragment$partyViewModel$2 extends Lambda implements Function0<PartyViewModel> {
    SelectQueueFragment$partyViewModel$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final PartyViewModel invoke() {
        return (PartyViewModel) C3827w0.m20290f(this.this$0.requireActivity(), this.this$0.getViewModelFactory()).m20262a(PartyViewModel.class);
    }
}