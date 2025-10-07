package com.disney.wdpro.universal_checkout_ui.p459ui.p460di;

import com.disney.wdpro.universal_checkout_ui.p459ui.activities.ChaseActivity;
import com.disney.wdpro.universal_checkout_ui.p459ui.activities.DVICActivity;
import com.disney.wdpro.universal_checkout_ui.p459ui.activities.UniversalCheckoutActivity;
import com.disney.wdpro.universal_checkout_ui.p459ui.fragments.DownScreenFragment;
import com.disney.wdpro.universal_checkout_ui.p459ui.fragments.UniversalCheckoutFragment;
import dagger.Subcomponent;

@Subcomponent
/* loaded from: classes20.dex */
public interface UniversalCheckoutComponent {
    void inject(ChaseActivity chaseActivity);

    void inject(DVICActivity dVICActivity);

    void inject(UniversalCheckoutActivity universalCheckoutActivity);

    void inject(DownScreenFragment downScreenFragment);

    void inject(UniversalCheckoutFragment universalCheckoutFragment);
}