package com.disney.wdpro.universal_checkout_ui.p459ui.managers;

import android.app.Activity;
import android.content.Context;
import com.disney.wdpro.commons.AbstractC9344n;
import com.disney.wdpro.midichlorian.annotations.UIEvent;
import com.disney.wdpro.service.model.Affiliations;
import com.disney.wdpro.service.model.Profile;
import java.util.EnumSet;

/* loaded from: classes20.dex */
public interface UniversalCheckoutDataManager {

    public static class ItineraryEvent extends AbstractC9344n {
    }

    public static class JwtTokenResponseEvent extends AbstractC9344n<Void> {
        private String jwtToken;

        public String getJwtToken() {
            return this.jwtToken;
        }

        public void setJwtToken(String str) {
            this.jwtToken = str;
        }
    }

    public static class ProfileEvent extends AbstractC9344n<Profile> {
    }

    public static class UserAffiliationsResponseEvent extends AbstractC9344n<EnumSet<Affiliations.Affiliation.AffiliationType>> {
    }

    @UIEvent
    JwtTokenResponseEvent fetchJwtToken();

    @UIEvent
    ProfileEvent fetchProfile();

    String getCompletionDeepLink();

    String getJwt();

    Activity getMainActivity();

    @UIEvent
    UserAffiliationsResponseEvent getUserAffiliations();

    boolean hasRequestedForSecondaryLogin();

    @UIEvent
    ItineraryEvent invalidateItineraryServicesCache();

    boolean isContentBundleSyncing();

    boolean isLowTrustAllowed();

    boolean isReloadUC();

    void setCompletionDeepLink(String str);

    void setHasRequestedForSecondaryLogin(boolean z10);

    void setJwt(String str);

    void setLowTrustAllowed(boolean z10);

    void setMainActivity(Activity activity);

    void setReloadUC(boolean z10);

    void startContentBundleDownloadProcessForUCBundle(Context context);
}