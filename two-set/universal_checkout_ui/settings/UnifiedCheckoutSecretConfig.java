package com.disney.wdpro.universal_checkout_ui.settings;

import com.disney.wdpro.commons.settings.SecretConfig;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0012\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u0018\u0010\u0015\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u0018\u0010\u0018\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/settings/UnifiedCheckoutSecretConfig;", "", "isUnifiedCheckoutBypassPaymentEnabled", "", "()Z", "setUnifiedCheckoutBypassPaymentEnabled", "(Z)V", "isUnifiedCheckoutUseMockEnabled", "setUnifiedCheckoutUseMockEnabled", "unifiedCheckoutMemoryMakerState", "Lcom/disney/wdpro/commons/settings/SecretConfig$FeatureState;", "getUnifiedCheckoutMemoryMakerState", "()Lcom/disney/wdpro/commons/settings/SecretConfig$FeatureState;", "setUnifiedCheckoutMemoryMakerState", "(Lcom/disney/wdpro/commons/settings/SecretConfig$FeatureState;)V", "unifiedCheckoutSpecialEventsState", "getUnifiedCheckoutSpecialEventsState", "setUnifiedCheckoutSpecialEventsState", "unifiedCheckoutTicketModsState", "getUnifiedCheckoutTicketModsState", "setUnifiedCheckoutTicketModsState", "unifiedCheckoutTicketSalesState", "getUnifiedCheckoutTicketSalesState", "setUnifiedCheckoutTicketSalesState", "unifiedCheckoutTicketUpgradesState", "getUnifiedCheckoutTicketUpgradesState", "setUnifiedCheckoutTicketUpgradesState", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface UnifiedCheckoutSecretConfig {
    SecretConfig.FeatureState getUnifiedCheckoutMemoryMakerState();

    SecretConfig.FeatureState getUnifiedCheckoutSpecialEventsState();

    SecretConfig.FeatureState getUnifiedCheckoutTicketModsState();

    SecretConfig.FeatureState getUnifiedCheckoutTicketSalesState();

    SecretConfig.FeatureState getUnifiedCheckoutTicketUpgradesState();

    /* renamed from: isUnifiedCheckoutBypassPaymentEnabled */
    boolean getIsUnifiedCheckoutBypassPaymentEnabled();

    /* renamed from: isUnifiedCheckoutUseMockEnabled */
    boolean getIsUnifiedCheckoutUseMockEnabled();

    void setUnifiedCheckoutBypassPaymentEnabled(boolean z10);

    void setUnifiedCheckoutMemoryMakerState(SecretConfig.FeatureState featureState);

    void setUnifiedCheckoutSpecialEventsState(SecretConfig.FeatureState featureState);

    void setUnifiedCheckoutTicketModsState(SecretConfig.FeatureState featureState);

    void setUnifiedCheckoutTicketSalesState(SecretConfig.FeatureState featureState);

    void setUnifiedCheckoutTicketUpgradesState(SecretConfig.FeatureState featureState);

    void setUnifiedCheckoutUseMockEnabled(boolean z10);
}