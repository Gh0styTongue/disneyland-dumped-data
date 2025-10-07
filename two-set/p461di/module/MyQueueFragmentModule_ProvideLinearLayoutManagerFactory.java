package com.disney.wdpro.virtualqueue.core.p461di.module;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class MyQueueFragmentModule_ProvideLinearLayoutManagerFactory implements InterfaceC30583e<LinearLayoutManager> {
    private final Provider<MyQueuesFragment> fragmentProvider;
    private final MyQueueFragmentModule module;

    public MyQueueFragmentModule_ProvideLinearLayoutManagerFactory(MyQueueFragmentModule myQueueFragmentModule, Provider<MyQueuesFragment> provider) {
        this.module = myQueueFragmentModule;
        this.fragmentProvider = provider;
    }

    public static MyQueueFragmentModule_ProvideLinearLayoutManagerFactory create(MyQueueFragmentModule myQueueFragmentModule, Provider<MyQueuesFragment> provider) {
        return new MyQueueFragmentModule_ProvideLinearLayoutManagerFactory(myQueueFragmentModule, provider);
    }

    public static LinearLayoutManager provideLinearLayoutManager(MyQueueFragmentModule myQueueFragmentModule, MyQueuesFragment myQueuesFragment) {
        return (LinearLayoutManager) C30587i.m94207e(myQueueFragmentModule.provideLinearLayoutManager(myQueuesFragment));
    }

    @Override // javax.inject.Provider
    public LinearLayoutManager get() {
        return provideLinearLayoutManager(this.module, this.fragmentProvider.get());
    }
}