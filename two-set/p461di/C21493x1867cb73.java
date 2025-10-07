package com.disney.wdpro.virtualqueue.core.p461di;

import android.content.Context;
import android.graphics.Point;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQCommonModules_ProvideScreenSize$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21493x1867cb73 implements InterfaceC30583e<Point> {
    private final Provider<Context> contextProvider;
    private final VQCommonModules module;

    public C21493x1867cb73(VQCommonModules vQCommonModules, Provider<Context> provider) {
        this.module = vQCommonModules;
        this.contextProvider = provider;
    }

    public static C21493x1867cb73 create(VQCommonModules vQCommonModules, Provider<Context> provider) {
        return new C21493x1867cb73(vQCommonModules, provider);
    }

    public static Point provideScreenSize$virtual_queue_lib_release(VQCommonModules vQCommonModules, Context context) {
        return (Point) C30587i.m94207e(vQCommonModules.provideScreenSize$virtual_queue_lib_release(context));
    }

    @Override // javax.inject.Provider
    public Point get() {
        return provideScreenSize$virtual_queue_lib_release(this.module, this.contextProvider.get());
    }
}