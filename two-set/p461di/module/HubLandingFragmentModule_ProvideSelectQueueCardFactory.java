package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCard;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class HubLandingFragmentModule_ProvideSelectQueueCardFactory implements InterfaceC30583e<SelectQueueCard> {
    private final HubLandingFragmentModule module;

    public HubLandingFragmentModule_ProvideSelectQueueCardFactory(HubLandingFragmentModule hubLandingFragmentModule) {
        this.module = hubLandingFragmentModule;
    }

    public static HubLandingFragmentModule_ProvideSelectQueueCardFactory create(HubLandingFragmentModule hubLandingFragmentModule) {
        return new HubLandingFragmentModule_ProvideSelectQueueCardFactory(hubLandingFragmentModule);
    }

    public static SelectQueueCard provideSelectQueueCard(HubLandingFragmentModule hubLandingFragmentModule) {
        return (SelectQueueCard) C30587i.m94207e(hubLandingFragmentModule.provideSelectQueueCard());
    }

    @Override // javax.inject.Provider
    public SelectQueueCard get() {
        return provideSelectQueueCard(this.module);
    }
}