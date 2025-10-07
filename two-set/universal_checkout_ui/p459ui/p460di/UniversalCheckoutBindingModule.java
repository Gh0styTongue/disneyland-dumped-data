package com.disney.wdpro.universal_checkout_ui.p459ui.p460di;

import com.disney.wdpro.universal_checkout_ui.p459ui.activities.ChaseActivity;
import com.disney.wdpro.universal_checkout_ui.p459ui.activities.DVICActivity;
import com.disney.wdpro.universal_checkout_ui.p459ui.activities.UniversalCheckoutActivity;
import com.disney.wdpro.universal_checkout_ui.p459ui.fragments.DownScreenFragment;
import com.disney.wdpro.universal_checkout_ui.p459ui.fragments.UniversalCheckoutFragment;
import dagger.Module;

@Module
/* loaded from: classes20.dex */
public abstract class UniversalCheckoutBindingModule {
    abstract ChaseActivity contributeChaseActivity();

    abstract DVICActivity contributeDVICActivity();

    abstract DownScreenFragment contributeDownScreenFragment();

    abstract UniversalCheckoutActivity contributeUniversalCheckoutActivity();

    abstract UniversalCheckoutFragment contributeUniversalCheckoutFragment();
}