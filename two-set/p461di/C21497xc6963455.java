package com.disney.wdpro.virtualqueue.core.p461di;

import com.disney.wdpro.virtualqueue.core.interfaces.QueueStateManagement;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQCommonModules_ProvideVirtualQueueEarlyPartyCreationMode$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21497xc6963455 implements InterfaceC30583e<QueueStateManagement> {
    private final VQCommonModules module;

    public C21497xc6963455(VQCommonModules vQCommonModules) {
        this.module = vQCommonModules;
    }

    public static C21497xc6963455 create(VQCommonModules vQCommonModules) {
        return new C21497xc6963455(vQCommonModules);
    }

    /* renamed from: provideVirtualQueueEarlyPartyCreationMode$virtual_queue_lib_release */
    public static QueueStateManagement m64833xae9fc433(VQCommonModules vQCommonModules) {
        return (QueueStateManagement) C30587i.m94207e(vQCommonModules.m64832xae9fc433());
    }

    @Override // javax.inject.Provider
    public QueueStateManagement get() {
        return m64833xae9fc433(this.module);
    }
}