package com.disney.wdpro.virtualqueue.core.interfaces;

import com.disney.wdpro.profile_ui.manager.ProfileManager;
import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class LoggedInUserImpl_MembersInjector implements MembersInjector<LoggedInUserImpl> {
    private final Provider<ProfileManager> profileManagerProvider;

    public LoggedInUserImpl_MembersInjector(Provider<ProfileManager> provider) {
        this.profileManagerProvider = provider;
    }

    public static MembersInjector<LoggedInUserImpl> create(Provider<ProfileManager> provider) {
        return new LoggedInUserImpl_MembersInjector(provider);
    }

    public static void injectProfileManager(LoggedInUserImpl loggedInUserImpl, ProfileManager profileManager) {
        loggedInUserImpl.profileManager = profileManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LoggedInUserImpl loggedInUserImpl) {
        injectProfileManager(loggedInUserImpl, this.profileManagerProvider.get());
    }
}