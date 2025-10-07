package com.disney.wdpro.friendsservices;

import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/FriendEnvironment;", "", "apimExpandServiceUrl", "", "getApimExpandServiceUrl", "()Ljava/lang/String;", "assemblyServiceUrl", "getAssemblyServiceUrl", "chargeAccountServiceUrl", "getChargeAccountServiceUrl", "friendsByPlansAPIURLVersion", "", "getFriendsByPlansAPIURLVersion", "()I", "friendsByPlansServiceUrl", "getFriendsByPlansServiceUrl", "gamAssemblyServiceUrl", "getGamAssemblyServiceUrl", "gamFriendsByPlansServiceUrl", "getGamFriendsByPlansServiceUrl", "profileServicesUrl", "getProfileServicesUrl", "serviceBaseUrl", "getServiceBaseUrl", "Companion", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public interface FriendEnvironment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int F_AND_F_FRIENDS_BY_PLANS_NEW_URL_VERSION = 0;
    public static final int F_AND_F_FRIENDS_BY_PLANS_OLD_URL_VERSION = 1;

    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/FriendEnvironment$Companion;", "", "()V", "F_AND_F_FRIENDS_BY_PLANS_NEW_URL_VERSION", "", "F_AND_F_FRIENDS_BY_PLANS_OLD_URL_VERSION", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int F_AND_F_FRIENDS_BY_PLANS_NEW_URL_VERSION = 0;
        public static final int F_AND_F_FRIENDS_BY_PLANS_OLD_URL_VERSION = 1;

        private Companion() {
        }
    }

    String getApimExpandServiceUrl();

    String getAssemblyServiceUrl();

    String getChargeAccountServiceUrl();

    int getFriendsByPlansAPIURLVersion();

    String getFriendsByPlansServiceUrl();

    String getGamAssemblyServiceUrl();

    String getGamFriendsByPlansServiceUrl();

    String getProfileServicesUrl();

    String getServiceBaseUrl();
}