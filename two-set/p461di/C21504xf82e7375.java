package com.disney.wdpro.virtualqueue.core.p461di;

import android.content.Context;
import com.disney.wdpro.commons.deeplink.InterfaceC9289f;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQDeepLinkNavigationModule_ProvideDeepLinkNavigationProvider$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21504xf82e7375 implements InterfaceC30583e<InterfaceC9289f> {
    private final Provider<Context> contextProvider;
    private final VQDeepLinkNavigationModule module;

    public C21504xf82e7375(VQDeepLinkNavigationModule vQDeepLinkNavigationModule, Provider<Context> provider) {
        this.module = vQDeepLinkNavigationModule;
        this.contextProvider = provider;
    }

    public static C21504xf82e7375 create(VQDeepLinkNavigationModule vQDeepLinkNavigationModule, Provider<Context> provider) {
        return new C21504xf82e7375(vQDeepLinkNavigationModule, provider);
    }

    public static InterfaceC9289f provideDeepLinkNavigationProvider$virtual_queue_lib_release(VQDeepLinkNavigationModule vQDeepLinkNavigationModule, Context context) {
        return (InterfaceC9289f) C30587i.m94207e(vQDeepLinkNavigationModule.provideDeepLinkNavigationProvider$virtual_queue_lib_release(context));
    }

    @Override // javax.inject.Provider
    public InterfaceC9289f get() {
        return provideDeepLinkNavigationProvider$virtual_queue_lib_release(this.module, this.contextProvider.get());
    }
}