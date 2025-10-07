package com.disney.wdpro.enchanting_extras_ui.p120ui.p121di;

import com.disney.wdpro.enchanting_extras_ui.p120ui.activities.EnchantingExtrasActivity;
import com.disney.wdpro.enchanting_extras_ui.p120ui.fragment.DownScreenFragment;
import com.disney.wdpro.enchanting_extras_ui.p120ui.fragment.EnchantingExtrasFragment;
import dagger.Module;

@Module
/* loaded from: classes25.dex */
public abstract class EnchantingExtrasBindingModule {
    abstract DownScreenFragment contributeDownScreenFragment();

    abstract EnchantingExtrasActivity contributeEnchantingExtrasActivity();

    abstract EnchantingExtrasFragment contributeEnchantingExtrasFragment();
}