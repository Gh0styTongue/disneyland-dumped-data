package com.disney.wdpro.virtualqueue.core.p461di;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUser;
import com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUserImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQCommonModules_ProvideLoggedInUserName$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21491x976689e3 implements InterfaceC30583e<LoggedInUser> {
    private final Provider<LoggedInUserImpl> loggedInUserImplProvider;
    private final VQCommonModules module;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public C21491x976689e3(VQCommonModules vQCommonModules, Provider<ProxyFactory> provider, Provider<LoggedInUserImpl> provider2) {
        this.module = vQCommonModules;
        this.proxyFactoryProvider = provider;
        this.loggedInUserImplProvider = provider2;
    }

    public static C21491x976689e3 create(VQCommonModules vQCommonModules, Provider<ProxyFactory> provider, Provider<LoggedInUserImpl> provider2) {
        return new C21491x976689e3(vQCommonModules, provider, provider2);
    }

    public static LoggedInUser provideLoggedInUserName$virtual_queue_lib_release(VQCommonModules vQCommonModules, ProxyFactory proxyFactory, LoggedInUserImpl loggedInUserImpl) {
        return (LoggedInUser) C30587i.m94207e(vQCommonModules.provideLoggedInUserName$virtual_queue_lib_release(proxyFactory, loggedInUserImpl));
    }

    @Override // javax.inject.Provider
    public LoggedInUser get() {
        return provideLoggedInUserName$virtual_queue_lib_release(this.module, this.proxyFactoryProvider.get(), this.loggedInUserImplProvider.get());
    }
}