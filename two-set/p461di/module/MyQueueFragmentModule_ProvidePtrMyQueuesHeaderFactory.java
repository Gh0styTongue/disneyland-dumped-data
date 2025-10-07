package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PtrMyQueuesHeader;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class MyQueueFragmentModule_ProvidePtrMyQueuesHeaderFactory implements InterfaceC30583e<PtrMyQueuesHeader> {
    private final Provider<MyQueuesFragment> fragmentProvider;
    private final MyQueueFragmentModule module;

    public MyQueueFragmentModule_ProvidePtrMyQueuesHeaderFactory(MyQueueFragmentModule myQueueFragmentModule, Provider<MyQueuesFragment> provider) {
        this.module = myQueueFragmentModule;
        this.fragmentProvider = provider;
    }

    public static MyQueueFragmentModule_ProvidePtrMyQueuesHeaderFactory create(MyQueueFragmentModule myQueueFragmentModule, Provider<MyQueuesFragment> provider) {
        return new MyQueueFragmentModule_ProvidePtrMyQueuesHeaderFactory(myQueueFragmentModule, provider);
    }

    public static PtrMyQueuesHeader providePtrMyQueuesHeader(MyQueueFragmentModule myQueueFragmentModule, MyQueuesFragment myQueuesFragment) {
        return (PtrMyQueuesHeader) C30587i.m94207e(myQueueFragmentModule.providePtrMyQueuesHeader(myQueuesFragment));
    }

    @Override // javax.inject.Provider
    public PtrMyQueuesHeader get() {
        return providePtrMyQueuesHeader(this.module, this.fragmentProvider.get());
    }
}