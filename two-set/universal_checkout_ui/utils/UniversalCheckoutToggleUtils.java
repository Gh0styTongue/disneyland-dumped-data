package com.disney.wdpro.universal_checkout_ui.utils;

import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.settings.SecretConfig;
import com.disney.wdpro.universal_checkout_ui.settings.UnifiedCheckoutSecretConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/utils/UniversalCheckoutToggleUtils;", "", "<init>", "()V", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/disney/wdpro/universal_checkout_ui/settings/UnifiedCheckoutSecretConfig;", "ucSecretSecretConfig", "", "isUnifiedCheckoutTicketSalesEnabled", "(Lcom/disney/wdpro/commons/config/i;Lcom/disney/wdpro/universal_checkout_ui/settings/UnifiedCheckoutSecretConfig;)Z", "isUnifiedCheckoutTicketModsEnabled", "isUnifiedCheckoutTicketUpgradesEnabled", "isUnifiedCheckoutSpecialEventsEnabled", "isUnifiedCheckoutMemoryMakerEnabled", "isUCContentBundlingEnabled", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class UniversalCheckoutToggleUtils {
    public static final UniversalCheckoutToggleUtils INSTANCE = new UniversalCheckoutToggleUtils();

    private UniversalCheckoutToggleUtils() {
    }

    @JvmStatic
    public static final boolean isUCContentBundlingEnabled(C9248i vendomatic, UnifiedCheckoutSecretConfig ucSecretSecretConfig) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(ucSecretSecretConfig, "ucSecretSecretConfig");
        return vendomatic.m38686G1();
    }

    @JvmStatic
    public static final boolean isUnifiedCheckoutMemoryMakerEnabled(C9248i vendomatic, UnifiedCheckoutSecretConfig ucSecretSecretConfig) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(ucSecretSecretConfig, "ucSecretSecretConfig");
        return ucSecretSecretConfig.getUnifiedCheckoutMemoryMakerState() == SecretConfig.FeatureState.REMOTE_CONFIG ? vendomatic.m38695J1() : ucSecretSecretConfig.getUnifiedCheckoutMemoryMakerState() == SecretConfig.FeatureState.ENABLED;
    }

    @JvmStatic
    public static final boolean isUnifiedCheckoutSpecialEventsEnabled(C9248i vendomatic, UnifiedCheckoutSecretConfig ucSecretSecretConfig) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(ucSecretSecretConfig, "ucSecretSecretConfig");
        return ucSecretSecretConfig.getUnifiedCheckoutSpecialEventsState() == SecretConfig.FeatureState.REMOTE_CONFIG ? vendomatic.m38698K1() : ucSecretSecretConfig.getUnifiedCheckoutSpecialEventsState() == SecretConfig.FeatureState.ENABLED;
    }

    @JvmStatic
    public static final boolean isUnifiedCheckoutTicketModsEnabled(C9248i vendomatic, UnifiedCheckoutSecretConfig ucSecretSecretConfig) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(ucSecretSecretConfig, "ucSecretSecretConfig");
        return ucSecretSecretConfig.getUnifiedCheckoutTicketModsState() == SecretConfig.FeatureState.REMOTE_CONFIG ? vendomatic.m38701L1() : ucSecretSecretConfig.getUnifiedCheckoutTicketModsState() == SecretConfig.FeatureState.ENABLED;
    }

    @JvmStatic
    public static final boolean isUnifiedCheckoutTicketSalesEnabled(C9248i vendomatic, UnifiedCheckoutSecretConfig ucSecretSecretConfig) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(ucSecretSecretConfig, "ucSecretSecretConfig");
        return ucSecretSecretConfig.getUnifiedCheckoutTicketSalesState() == SecretConfig.FeatureState.REMOTE_CONFIG ? vendomatic.m38704M1() : ucSecretSecretConfig.getUnifiedCheckoutTicketSalesState() == SecretConfig.FeatureState.ENABLED;
    }

    @JvmStatic
    public static final boolean isUnifiedCheckoutTicketUpgradesEnabled(C9248i vendomatic, UnifiedCheckoutSecretConfig ucSecretSecretConfig) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(ucSecretSecretConfig, "ucSecretSecretConfig");
        return ucSecretSecretConfig.getUnifiedCheckoutTicketUpgradesState() == SecretConfig.FeatureState.REMOTE_CONFIG ? vendomatic.m38707N1() : ucSecretSecretConfig.getUnifiedCheckoutTicketUpgradesState() == SecretConfig.FeatureState.ENABLED;
    }
}