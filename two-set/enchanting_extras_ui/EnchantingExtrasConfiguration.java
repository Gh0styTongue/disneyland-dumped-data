package com.disney.wdpro.enchanting_extras_ui;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/enchanting_extras_ui/EnchantingExtrasConfiguration;", "", "destinationCode", "", "helpDeskPhoneNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getDestinationCode", "()Ljava/lang/String;", "getHelpDeskPhoneNumber", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes25.dex */
public final /* data */ class EnchantingExtrasConfiguration {
    private final String destinationCode;
    private final String helpDeskPhoneNumber;

    @JvmOverloads
    public EnchantingExtrasConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EnchantingExtrasConfiguration copy$default(EnchantingExtrasConfiguration enchantingExtrasConfiguration, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = enchantingExtrasConfiguration.destinationCode;
        }
        if ((i10 & 2) != 0) {
            str2 = enchantingExtrasConfiguration.helpDeskPhoneNumber;
        }
        return enchantingExtrasConfiguration.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDestinationCode() {
        return this.destinationCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHelpDeskPhoneNumber() {
        return this.helpDeskPhoneNumber;
    }

    public final EnchantingExtrasConfiguration copy(String destinationCode, String helpDeskPhoneNumber) {
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(helpDeskPhoneNumber, "helpDeskPhoneNumber");
        return new EnchantingExtrasConfiguration(destinationCode, helpDeskPhoneNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnchantingExtrasConfiguration)) {
            return false;
        }
        EnchantingExtrasConfiguration enchantingExtrasConfiguration = (EnchantingExtrasConfiguration) other;
        return Intrinsics.areEqual(this.destinationCode, enchantingExtrasConfiguration.destinationCode) && Intrinsics.areEqual(this.helpDeskPhoneNumber, enchantingExtrasConfiguration.helpDeskPhoneNumber);
    }

    public final String getDestinationCode() {
        return this.destinationCode;
    }

    public final String getHelpDeskPhoneNumber() {
        return this.helpDeskPhoneNumber;
    }

    public int hashCode() {
        return (this.destinationCode.hashCode() * 31) + this.helpDeskPhoneNumber.hashCode();
    }

    public String toString() {
        return "EnchantingExtrasConfiguration(destinationCode=" + this.destinationCode + ", helpDeskPhoneNumber=" + this.helpDeskPhoneNumber + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EnchantingExtrasConfiguration(String destinationCode) {
        this(destinationCode, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
    }

    @JvmOverloads
    public EnchantingExtrasConfiguration(String destinationCode, String helpDeskPhoneNumber) {
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(helpDeskPhoneNumber, "helpDeskPhoneNumber");
        this.destinationCode = destinationCode;
        this.helpDeskPhoneNumber = helpDeskPhoneNumber;
    }

    public /* synthetic */ EnchantingExtrasConfiguration(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "WDW" : str, (i10 & 2) != 0 ? "" : str2);
    }
}