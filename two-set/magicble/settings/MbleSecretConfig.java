package com.disney.wdpro.magicble.settings;

import com.disney.wdpro.commons.settings.SecretConfig;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;", "", "magicBleAdvertiseOutsideGeofenceState", "Lcom/disney/wdpro/commons/settings/SecretConfig$FeatureState;", "getMagicBleAdvertiseOutsideGeofenceState", "()Lcom/disney/wdpro/commons/settings/SecretConfig$FeatureState;", "setMagicBleAdvertiseOutsideGeofenceState", "(Lcom/disney/wdpro/commons/settings/SecretConfig$FeatureState;)V", "magicBleFeatureState", "getMagicBleFeatureState", "setMagicBleFeatureState", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public interface MbleSecretConfig {
    SecretConfig.FeatureState getMagicBleAdvertiseOutsideGeofenceState();

    SecretConfig.FeatureState getMagicBleFeatureState();

    void setMagicBleAdvertiseOutsideGeofenceState(SecretConfig.FeatureState featureState);

    void setMagicBleFeatureState(SecretConfig.FeatureState featureState);
}