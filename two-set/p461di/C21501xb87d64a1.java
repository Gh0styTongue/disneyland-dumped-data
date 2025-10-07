package com.disney.wdpro.virtualqueue.core.p461di;

import android.content.Context;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQCommonModules_ProvideVirtualQueuePicassoUtils$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21501xb87d64a1 implements InterfaceC30583e<PicassoUtils> {
    private final Provider<Context> contextProvider;
    private final VQCommonModules module;

    public C21501xb87d64a1(VQCommonModules vQCommonModules, Provider<Context> provider) {
        this.module = vQCommonModules;
        this.contextProvider = provider;
    }

    public static C21501xb87d64a1 create(VQCommonModules vQCommonModules, Provider<Context> provider) {
        return new C21501xb87d64a1(vQCommonModules, provider);
    }

    public static PicassoUtils provideVirtualQueuePicassoUtils$virtual_queue_lib_release(VQCommonModules vQCommonModules, Context context) {
        return (PicassoUtils) C30587i.m94207e(vQCommonModules.provideVirtualQueuePicassoUtils$virtual_queue_lib_release(context));
    }

    @Override // javax.inject.Provider
    public PicassoUtils get() {
        return provideVirtualQueuePicassoUtils$virtual_queue_lib_release(this.module, this.contextProvider.get());
    }
}