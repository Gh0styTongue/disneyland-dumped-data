package com.disney.wdpro.virtualqueue.core.p461di;

import android.content.Context;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQCommonModules_ProvideVirtualQueueLinkedGuestUtils$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21498x8f71c888 implements InterfaceC30583e<LinkedGuestUtils> {
    private final Provider<Context> contextProvider;
    private final VQCommonModules module;
    private final Provider<C9314j> parkAppConfigurationProvider;

    public C21498x8f71c888(VQCommonModules vQCommonModules, Provider<Context> provider, Provider<C9314j> provider2) {
        this.module = vQCommonModules;
        this.contextProvider = provider;
        this.parkAppConfigurationProvider = provider2;
    }

    public static C21498x8f71c888 create(VQCommonModules vQCommonModules, Provider<Context> provider, Provider<C9314j> provider2) {
        return new C21498x8f71c888(vQCommonModules, provider, provider2);
    }

    public static LinkedGuestUtils provideVirtualQueueLinkedGuestUtils$virtual_queue_lib_release(VQCommonModules vQCommonModules, Context context, C9314j c9314j) {
        return (LinkedGuestUtils) C30587i.m94207e(vQCommonModules.provideVirtualQueueLinkedGuestUtils$virtual_queue_lib_release(context, c9314j));
    }

    @Override // javax.inject.Provider
    public LinkedGuestUtils get() {
        return provideVirtualQueueLinkedGuestUtils$virtual_queue_lib_release(this.module, this.contextProvider.get(), this.parkAppConfigurationProvider.get());
    }
}