package com.disney.wdpro.universal_checkout_ui.analytics;

import com.disney.wdpro.profile_ui.utils.ResidencyVerificationStatus;

/* loaded from: classes20.dex */
public interface UniversalCheckoutAnalyticsManager {
    void trackIdMeFinishResult(ResidencyVerificationStatus residencyVerificationStatus);

    void trackStartIdMeFlow();
}