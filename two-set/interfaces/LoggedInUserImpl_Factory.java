package com.disney.wdpro.virtualqueue.core.interfaces;

import com.disney.wdpro.profile_ui.manager.ProfileManager;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class LoggedInUserImpl_Factory implements InterfaceC30583e<LoggedInUserImpl> {
    private final Provider<ProfileManager> profileManagerProvider;

    public LoggedInUserImpl_Factory(Provider<ProfileManager> provider) {
        this.profileManagerProvider = provider;
    }

    public static LoggedInUserImpl_Factory create(Provider<ProfileManager> provider) {
        return new LoggedInUserImpl_Factory(provider);
    }

    public static LoggedInUserImpl newInstance() {
        return new LoggedInUserImpl();
    }

    @Override // javax.inject.Provider
    public LoggedInUserImpl get() {
        LoggedInUserImpl loggedInUserImplNewInstance = newInstance();
        LoggedInUserImpl_MembersInjector.injectProfileManager(loggedInUserImplNewInstance, this.profileManagerProvider.get());
        return loggedInUserImplNewInstance;
    }
}