package com.disney.wdpro.photopass.services.utils;

import com.disney.wdpro.paymentsui.constants.PaymentsConstants;
import com.disney.wdpro.photopass.services.configuration.PhotoPassPark;
import com.disney.wdpro.photopass.services.configuration.PhotoPassServicesConfig;
import com.disney.wdpro.recommender.services.RecommenderServiceConstants;
import com.disney.wdpro.sag.confirmation.OrderConfirmationFragment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000eJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001d"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/utils/PhotoPassFormatHelper;", "", "config", "Lcom/disney/wdpro/photopass/services/configuration/PhotoPassServicesConfig;", "(Lcom/disney/wdpro/photopass/services/configuration/PhotoPassServicesConfig;)V", "customAppTimeZone", "Ljava/util/TimeZone;", "getCustomAppTimeZone", "()Ljava/util/TimeZone;", "customAppTimeZone$delegate", "Lkotlin/Lazy;", "applyActivationDateFormat", "", "displayedDate", "Ljava/util/Date;", "applyDisplayDateFormat", "applyInputDateFormat", "responseDate", "applyOneClickPurchaseDate", OrderConfirmationFragment.PURCHASE_DATE, "applyVPWDisplayDateFormat", "applyZuluDateFormatFromDisplayString", "displayFormat", "applyZuluStringFormatFromZuluDate", "zuluDate", "setupTimeZone", "Ljava/text/SimpleDateFormat;", PaymentsConstants.PATTERN, "customTimeZone", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nPhotoPassFormatHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhotoPassFormatHelper.kt\ncom/disney/wdpro/photopass/services/utils/PhotoPassFormatHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
/* loaded from: classes15.dex */
public final class PhotoPassFormatHelper {
    private final PhotoPassServicesConfig config;

    /* renamed from: customAppTimeZone$delegate, reason: from kotlin metadata */
    private final Lazy customAppTimeZone;

    @Inject
    public PhotoPassFormatHelper(PhotoPassServicesConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.customAppTimeZone = LazyKt.lazy(new Function0<TimeZone>() { // from class: com.disney.wdpro.photopass.services.utils.PhotoPassFormatHelper$customAppTimeZone$2

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

            {
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
        });
    }

    private final TimeZone getCustomAppTimeZone() {
        Object value = this.customAppTimeZone.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-customAppTimeZone>(...)");
        return (TimeZone) value;
    }

    private final SimpleDateFormat setupTimeZone(String pattern, TimeZone customTimeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.US);
        simpleDateFormat.setTimeZone(customTimeZone);
        return simpleDateFormat;
    }

    public final String applyActivationDateFormat(Date displayedDate) {
        Intrinsics.checkNotNullParameter(displayedDate, "displayedDate");
        String str = setupTimeZone(PhotoPassConstants.ACTIVATE_ENTITLEMENT_DATE_FORMAT, getCustomAppTimeZone()).format(displayedDate);
        Intrinsics.checkNotNullExpressionValue(str, "simpleDateFormat.format(displayedDate)");
        return str;
    }

    public final String applyDisplayDateFormat(Date displayedDate) {
        Intrinsics.checkNotNullParameter(displayedDate, "displayedDate");
        String str = setupTimeZone(PhotoPassConstants.DISPLAY_SELECTED_DATE_FORMAT, getCustomAppTimeZone()).format(displayedDate);
        Intrinsics.checkNotNullExpressionValue(str, "simpleDateFormat.format(displayedDate)");
        return str;
    }

    public final Date applyInputDateFormat(String responseDate) throws ParseException {
        Intrinsics.checkNotNullParameter(responseDate, "responseDate");
        if (StringsKt.isBlank(responseDate)) {
            throw new IllegalStateException("The String should not be Empty");
        }
        TimeZone timeZone = TimeZone.getTimeZone(RecommenderServiceConstants.TIME_ZONE_ID_GMT);
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(\"GMT\")");
        Date date = setupTimeZone("yyyy-MM-dd'T'HH:mm:ss'Z'", timeZone).parse(responseDate);
        Intrinsics.checkNotNullExpressionValue(date, "simpleDateFormat.parse(responseDate)");
        return date;
    }

    public final String applyOneClickPurchaseDate(Date purchaseDate) {
        Intrinsics.checkNotNullParameter(purchaseDate, "purchaseDate");
        String str = setupTimeZone("yyyy-MM-dd", getCustomAppTimeZone()).format(purchaseDate);
        Intrinsics.checkNotNullExpressionValue(str, "simpleDateFormat.format(purchaseDate)");
        return str;
    }

    public final String applyVPWDisplayDateFormat(Date displayedDate) {
        Intrinsics.checkNotNullParameter(displayedDate, "displayedDate");
        String str = setupTimeZone(PhotoPassConstants.DISPLAY_VIRTUAL_PREVIEW_WALL_DATE_FORMAT, getCustomAppTimeZone()).format(displayedDate);
        Intrinsics.checkNotNullExpressionValue(str, "simpleDateFormat.format(displayedDate)");
        return str;
    }

    public final Date applyZuluDateFormatFromDisplayString(String displayFormat) throws ParseException {
        Intrinsics.checkNotNullParameter(displayFormat, "displayFormat");
        Date date = setupTimeZone(PhotoPassConstants.DISPLAY_SELECTED_DATE_FORMAT, getCustomAppTimeZone()).parse(displayFormat);
        Intrinsics.checkNotNullExpressionValue(date, "simpleDateFormat.parse(displayFormat)");
        return date;
    }

    public final String applyZuluStringFormatFromZuluDate(Date zuluDate) {
        Intrinsics.checkNotNullParameter(zuluDate, "zuluDate");
        TimeZone timeZone = TimeZone.getTimeZone(RecommenderServiceConstants.TIME_ZONE_ID_GMT);
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(\"GMT\")");
        String str = setupTimeZone("yyyy-MM-dd'T'HH:mm:ss'Z'", timeZone).format(zuluDate);
        Intrinsics.checkNotNullExpressionValue(str, "zuluSimpleDateFormat.format(zuluDate)");
        return str;
    }
}