package com.disney.wdpro.universal_checkout_ui.analytics;

import com.disney.wdpro.analytics.C8677i;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.profile_ui.utils.ResidencyVerificationStatus;

/* loaded from: classes20.dex */
public class UniversalCheckoutAnalyticsHelper {
    private final UniversalCheckoutAnalyticsConfiguration analyticsConfiguration;
    private final InterfaceC8679k analyticsHelper;

    /* renamed from: com.disney.wdpro.universal_checkout_ui.analytics.UniversalCheckoutAnalyticsHelper$1 */
    static /* synthetic */ class C214361 {

        /* renamed from: $SwitchMap$com$disney$wdpro$profile_ui$utils$ResidencyVerificationStatus */
        static final /* synthetic */ int[] f45062xaed914b;

        static {
            int[] iArr = new int[ResidencyVerificationStatus.values().length];
            f45062xaed914b = iArr;
            try {
                iArr[ResidencyVerificationStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45062xaed914b[ResidencyVerificationStatus.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45062xaed914b[ResidencyVerificationStatus.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public UniversalCheckoutAnalyticsHelper(InterfaceC8679k interfaceC8679k, UniversalCheckoutAnalyticsConfiguration universalCheckoutAnalyticsConfiguration) {
        this.analyticsConfiguration = universalCheckoutAnalyticsConfiguration;
        this.analyticsHelper = interfaceC8679k;
    }

    private C8677i getAnalyticsContextDataBuilderWithLinkCategory() {
        C8677i c8677i = new C8677i(false);
        c8677i.m37425c("link.category", this.analyticsConfiguration.getLinkCategory());
        return c8677i;
    }

    public void trackIdMeFinishResult(ResidencyVerificationStatus residencyVerificationStatus) {
        C8677i analyticsContextDataBuilderWithLinkCategory = getAnalyticsContextDataBuilderWithLinkCategory();
        int i10 = C214361.f45062xaed914b[residencyVerificationStatus.ordinal()];
        if (i10 == 1) {
            analyticsContextDataBuilderWithLinkCategory.m37425c("resident.validation", "success");
        } else if (i10 == 2) {
            analyticsContextDataBuilderWithLinkCategory.m37425c("resident.validation", "fail");
        } else if (i10 == 3) {
            analyticsContextDataBuilderWithLinkCategory.m37425c("resident.validation", "cancel");
        }
        this.analyticsHelper.mo37405b("FLResVerification_Finish", analyticsContextDataBuilderWithLinkCategory.m37428f());
    }

    public void trackStartIdMeFlow() {
        this.analyticsHelper.mo37405b("FLResVerification_Start", getAnalyticsContextDataBuilderWithLinkCategory().m37428f());
    }
}