package com.disney.wdpro.universal_checkout_ui.analytics;

import com.disney.wdpro.profile_ui.utils.ResidencyVerificationStatus;

/* loaded from: classes20.dex */
public class UniversalCheckoutAnalyticsManagerImpl implements UniversalCheckoutAnalyticsManager {
    private final UniversalCheckoutAnalyticsHelper universalCheckoutAnalyticsHelper;

    public UniversalCheckoutAnalyticsManagerImpl(UniversalCheckoutAnalyticsHelper universalCheckoutAnalyticsHelper) {
        this.universalCheckoutAnalyticsHelper = universalCheckoutAnalyticsHelper;
    }

    @Override // com.disney.wdpro.universal_checkout_ui.analytics.UniversalCheckoutAnalyticsManager
    public void trackIdMeFinishResult(ResidencyVerificationStatus residencyVerificationStatus) {
        this.universalCheckoutAnalyticsHelper.trackIdMeFinishResult(residencyVerificationStatus);
    }

    @Override // com.disney.wdpro.universal_checkout_ui.analytics.UniversalCheckoutAnalyticsManager
    public void trackStartIdMeFlow() {
        this.universalCheckoutAnalyticsHelper.trackStartIdMeFlow();
    }
}