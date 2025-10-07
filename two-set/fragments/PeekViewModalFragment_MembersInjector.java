package com.disney.wdpro.virtualqueue.core.fragments;

import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class PeekViewModalFragment_MembersInjector implements MembersInjector<PeekViewModalFragment> {
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public PeekViewModalFragment_MembersInjector(Provider<DispatchingAndroidInjector<Object>> provider, Provider<VirtualQueueThemer> provider2) {
        this.androidInjectorProvider = provider;
        this.vqThemerProvider = provider2;
    }

    public static MembersInjector<PeekViewModalFragment> create(Provider<DispatchingAndroidInjector<Object>> provider, Provider<VirtualQueueThemer> provider2) {
        return new PeekViewModalFragment_MembersInjector(provider, provider2);
    }

    public static void injectAndroidInjector(PeekViewModalFragment peekViewModalFragment, DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
        peekViewModalFragment.androidInjector = dispatchingAndroidInjector;
    }

    public static void injectVqThemer(PeekViewModalFragment peekViewModalFragment, VirtualQueueThemer virtualQueueThemer) {
        peekViewModalFragment.vqThemer = virtualQueueThemer;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PeekViewModalFragment peekViewModalFragment) {
        injectAndroidInjector(peekViewModalFragment, this.androidInjectorProvider.get());
        injectVqThemer(peekViewModalFragment, this.vqThemerProvider.get());
    }
}