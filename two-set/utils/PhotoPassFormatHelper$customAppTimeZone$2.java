package com.disney.wdpro.photopass.services.utils;

import com.disney.wdpro.photopass.services.configuration.PhotoPassPark;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m92037d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m92038d2 = {"<anonymous>", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "invoke"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
final class PhotoPassFormatHelper$customAppTimeZone$2 extends Lambda implements Function0<TimeZone> {

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhotoPassPark.values().length];
            try {
                iArr[PhotoPassPark.DLR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhotoPassPark.WDW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    PhotoPassFormatHelper$customAppTimeZone$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TimeZone invoke() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.this$0.config.getParkAffiliation().ordinal()];
        if (i10 == 1) {
            return TimeZone.getTimeZone("America/Los_Angeles");
        }
        if (i10 == 2) {
            return TimeZone.getTimeZone("America/New_York");
        }
        throw new NoWhenBranchMatchedException();
    }
}