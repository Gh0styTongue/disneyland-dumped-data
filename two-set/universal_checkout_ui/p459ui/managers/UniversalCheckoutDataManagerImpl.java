package com.disney.wdpro.universal_checkout_ui.p459ui.managers;

import android.app.Activity;
import android.content.Context;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.service.business.UserApiClient;
import com.disney.wdpro.service.business.itinerary.ItineraryApiClient;
import com.disney.wdpro.service.model.CompactProfile;
import com.disney.wdpro.service.model.Profile;
import com.disney.wdpro.universal_checkout_ui.p459ui.Constants;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.disney.wdpro.universal_checkout_ui.utils.HybridUtilities;
import com.google.common.collect.Maps;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.ContentBundleCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.interfaces.ContentBundleSyncListener;
import com.wdpr.p479ee.p480ra.rahybrid.hybridFactory.HybridFactory;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import com.wdpr.p479ee.p480ra.rahybrid.util.UserAgentUtil;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

/* loaded from: classes20.dex */
public class UniversalCheckoutDataManagerImpl implements UniversalCheckoutDataManager {
    private static final String TAG = "UniversalCheckoutDataManagerImpl";
    private final AuthenticationManager authenticationManager;
    private String completionDeepLink;
    private final InterfaceC8682n crashHelper;
    private final UniversalCheckoutEnvironment environment;
    private boolean hasRequestedForSecondaryLogin;
    private boolean isContentBundleSyncing;
    private boolean isLowTrustAllowed;
    private final ItineraryApiClient itineraryApiClient;
    private String jwt;
    private Activity mainActivity;
    private final ProfileManager profileManager;
    private boolean reloadUC;
    private final UserApiClient userApiClient;

    @Inject
    public UniversalCheckoutDataManagerImpl(ItineraryApiClient itineraryApiClient, UserApiClient userApiClient, ProfileManager profileManager, AuthenticationManager authenticationManager, UniversalCheckoutEnvironment universalCheckoutEnvironment, InterfaceC8682n interfaceC8682n) {
        this.itineraryApiClient = itineraryApiClient;
        this.userApiClient = userApiClient;
        this.profileManager = profileManager;
        this.authenticationManager = authenticationManager;
        this.environment = universalCheckoutEnvironment;
        this.crashHelper = interfaceC8682n;
    }

    private void activateLatestVersion(ContentBundleCoordinator contentBundleCoordinator) {
        if (contentBundleCoordinator == null) {
            RAHybridLog.m85712e(TAG, "contentBundleCoordinator == null");
            return;
        }
        String activeVersion = contentBundleCoordinator.getActiveVersion();
        String downloadedVersion = contentBundleCoordinator.getDownloadedVersion();
        if (activeVersion == null || downloadedVersion == null || activeVersion.equalsIgnoreCase(downloadedVersion)) {
            return;
        }
        try {
            contentBundleCoordinator.switchContent(downloadedVersion, Collections.singletonList(activeVersion));
        } catch (Exception e10) {
            e10.printStackTrace();
            RAHybridLog.m85712e(TAG, "activateLatestVersion : " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> buildNewRelicMap(String str, String str2, String str3, String str4) {
        HashMap mapM69381r = Maps.m69381r();
        if (this.environment.getWebBaseUrl() != null) {
            String str5 = "latest";
            if (!this.environment.getWebBaseUrl().contains("latest")) {
                str5 = "stage";
                if (!this.environment.getWebBaseUrl().contains("stage")) {
                    str5 = "production";
                }
            }
            mapM69381r.put("environment", str5);
        }
        if (str != null) {
            mapM69381r.put(Constants.ANALYTICS_NEW_VERSION, str);
        }
        if (str2 != null) {
            mapM69381r.put(Constants.ANALYTICS_OLD_VERSION, str2);
        }
        if (str3 != null) {
            mapM69381r.put(Constants.ANALYTICS_BUNDLE_SYNC_STATUS, str3);
        }
        if (str4 != null) {
            mapM69381r.put(Constants.ANALYTICS_FAILURE_REASON, str4);
        }
        return mapM69381r;
    }

    private CompactProfile fetchCompactProfile(String str, String[] strArr) {
        try {
            return this.userApiClient.getCompactProfile(str, strArr);
        } catch (IOException unused) {
            return null;
        }
    }

    private void startContentUpdateForMainBundle(ContentBundleCoordinator contentBundleCoordinator) {
        if (contentBundleCoordinator == null) {
            RAHybridLog.m85712e(TAG, "contentBundleCoordinator == null");
        } else {
            contentBundleCoordinator.startSync(new ContentBundleSyncListener() { // from class: com.disney.wdpro.universal_checkout_ui.ui.managers.UniversalCheckoutDataManagerImpl.1
                @Override // com.wdpr.p479ee.p480ra.rahybrid.contentbundle.interfaces.ContentBundleSyncListener
                public void onFailure(List<String> list) {
                    RAHybridLog.m85712e(UniversalCheckoutDataManagerImpl.TAG, "startContentUpdateForMainBundle(), Error: " + list);
                    UniversalCheckoutDataManagerImpl.this.crashHelper.recordCustomEvent(Constants.ANALYTICS_MOBILE_UNIFIED_CHECKOUT_EVENT, Constants.ANALYTICS_CONTENT_BUNDLING, UniversalCheckoutDataManagerImpl.this.buildNewRelicMap(null, null, "failed", list != null ? list.toString() : null));
                }

                @Override // com.wdpr.p479ee.p480ra.rahybrid.contentbundle.interfaces.ContentBundleSyncListener
                public void onNoChange(String str) {
                    UniversalCheckoutDataManagerImpl.this.isContentBundleSyncing = false;
                    RAHybridLog.m85711d(UniversalCheckoutDataManagerImpl.TAG, "startContentUpdateForMainBundle(), Old Version: " + str);
                    UniversalCheckoutDataManagerImpl.this.crashHelper.recordCustomEvent(Constants.ANALYTICS_MOBILE_UNIFIED_CHECKOUT_EVENT, Constants.ANALYTICS_CONTENT_BUNDLING, UniversalCheckoutDataManagerImpl.this.buildNewRelicMap(str, str, Constants.BUNDLE_SYNC_STATUS_NO_CHANGE, null));
                }

                @Override // com.wdpr.p479ee.p480ra.rahybrid.contentbundle.interfaces.ContentBundleSyncListener
                public void onSuccess(String str, String str2) {
                    UniversalCheckoutDataManagerImpl.this.isContentBundleSyncing = false;
                    RAHybridLog.m85711d(UniversalCheckoutDataManagerImpl.TAG, "startContentUpdateForMainBundle() New Version: " + str + ", Old Version: " + str2);
                    UniversalCheckoutDataManagerImpl.this.crashHelper.recordCustomEvent(Constants.ANALYTICS_MOBILE_UNIFIED_CHECKOUT_EVENT, Constants.ANALYTICS_CONTENT_BUNDLING, UniversalCheckoutDataManagerImpl.this.buildNewRelicMap(str, str2, Constants.BUNDLE_SYNC_STATUS_UPDATED, null));
                }
            });
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public UniversalCheckoutDataManager.JwtTokenResponseEvent fetchJwtToken() {
        UniversalCheckoutDataManager.JwtTokenResponseEvent jwtTokenResponseEvent = new UniversalCheckoutDataManager.JwtTokenResponseEvent();
        try {
            if (this.authenticationManager.isUserAuthenticated()) {
                this.jwt = this.authenticationManager.getJwtToken("standard");
            } else {
                this.jwt = null;
            }
            jwtTokenResponseEvent.setResult(true);
            jwtTokenResponseEvent.setJwtToken(this.jwt);
            return jwtTokenResponseEvent;
        } catch (Exception e10) {
            this.jwt = null;
            e10.printStackTrace();
            jwtTokenResponseEvent.setResult(false);
            jwtTokenResponseEvent.setException(e10);
            return jwtTokenResponseEvent;
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public UniversalCheckoutDataManager.ProfileEvent fetchProfile() {
        UniversalCheckoutDataManager.ProfileEvent profileEvent = new UniversalCheckoutDataManager.ProfileEvent();
        try {
            Profile profileM88998b = this.profileManager.getProfileAsync().m88998b();
            if (profileM88998b != null) {
                profileEvent.setResult((UniversalCheckoutDataManager.ProfileEvent) profileM88998b);
                return profileEvent;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            profileEvent.setException(e10);
        }
        return profileEvent;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public String getCompletionDeepLink() {
        return this.completionDeepLink;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public String getJwt() {
        return this.jwt;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public Activity getMainActivity() {
        return this.mainActivity;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public UniversalCheckoutDataManager.UserAffiliationsResponseEvent getUserAffiliations() {
        UniversalCheckoutDataManager.UserAffiliationsResponseEvent userAffiliationsResponseEvent = new UniversalCheckoutDataManager.UserAffiliationsResponseEvent();
        try {
            userAffiliationsResponseEvent.setResult((UniversalCheckoutDataManager.UserAffiliationsResponseEvent) this.userApiClient.getAffiliationsSummaryCompact(this.authenticationManager.getUserSwid()));
        } catch (Exception unused) {
        }
        return userAffiliationsResponseEvent;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public boolean hasRequestedForSecondaryLogin() {
        return this.hasRequestedForSecondaryLogin;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public UniversalCheckoutDataManager.ItineraryEvent invalidateItineraryServicesCache() {
        UniversalCheckoutDataManager.ItineraryEvent itineraryEvent = new UniversalCheckoutDataManager.ItineraryEvent();
        try {
            this.itineraryApiClient.invalidateItineraryServicesCache();
            itineraryEvent.setResult(true);
            return itineraryEvent;
        } catch (Exception e10) {
            itineraryEvent.setException(e10);
            return itineraryEvent;
        }
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public boolean isContentBundleSyncing() {
        return this.isContentBundleSyncing;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public boolean isLowTrustAllowed() {
        return this.isLowTrustAllowed;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public boolean isReloadUC() {
        return this.reloadUC;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public void setCompletionDeepLink(String str) {
        this.completionDeepLink = str;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public void setHasRequestedForSecondaryLogin(boolean z10) {
        this.hasRequestedForSecondaryLogin = z10;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public void setJwt(String str) {
        this.jwt = str;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public void setLowTrustAllowed(boolean z10) {
        this.isLowTrustAllowed = z10;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public void setMainActivity(Activity activity) {
        this.mainActivity = activity;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public void setReloadUC(boolean z10) {
        this.reloadUC = z10;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager
    public void startContentBundleDownloadProcessForUCBundle(Context context) {
        this.isContentBundleSyncing = true;
        ContentBundleCoordinator contentBundleCoordinatorMakeContentBundleCoordinator = HybridFactory.makeContentBundleCoordinator(context, HybridUtilities.createHybridWebConfigBundle(this.environment), UserAgentUtil.getCustomUserAgentString(context));
        activateLatestVersion(contentBundleCoordinatorMakeContentBundleCoordinator);
        startContentUpdateForMainBundle(contentBundleCoordinatorMakeContentBundleCoordinator);
    }
}