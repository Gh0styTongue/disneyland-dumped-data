package com.disney.wdpro.virtualqueue.p462ui.common;

import android.content.Context;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.virtualqueue.C21487R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p499db.InterfaceC27160n;
import p677jl.C29439a;

@Metadata(m92037d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u00020\n*\u00020\n¢\u0006\u0004\b'\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\"\u0010+\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Ldb/n;", "facilityRepository", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/commons/j;Ldb/n;)V", "", "dateString", "Ljava/text/SimpleDateFormat;", "dateStringFormat", "formatTimeForDisplay", "(Ljava/lang/String;Ljava/text/SimpleDateFormat;)Ljava/lang/String;", "", "facilityIdsList", "Lcom/disney/wdpro/facility/model/Facility;", "getFacilities", "(Ljava/util/List;)Ljava/util/List;", "facilityId", "getFacility", "(Ljava/lang/String;)Lcom/disney/wdpro/facility/model/Facility;", "facilities", "Lcom/disney/wdpro/facility/model/Facility$FacilityDataType;", C29439a.FACILITY_TYPE, "getFacilitiesByFacilityType", "(Ljava/util/List;Lcom/disney/wdpro/facility/model/Facility$FacilityDataType;)Ljava/util/List;", "time", "formatDisplayableTime", "(Ljava/lang/String;)Ljava/lang/String;", "", "dateLong", "convertDateLongToScheduleTime", "(J)Ljava/lang/String;", "Ljava/util/TimeZone;", "getTimezone", "()Ljava/util/TimeZone;", "toCamelCase", "Landroid/content/Context;", "Lcom/disney/wdpro/commons/j;", "Ldb/n;", "displayTimeFormat", "Ljava/text/SimpleDateFormat;", "getDisplayTimeFormat", "()Ljava/text/SimpleDateFormat;", "setDisplayTimeFormat", "(Ljava/text/SimpleDateFormat;)V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nFacilityUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacilityUtils.kt\ncom/disney/wdpro/virtualqueue/ui/common/FacilityUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n766#2:78\n857#2,2:79\n*S KotlinDebug\n*F\n+ 1 FacilityUtils.kt\ncom/disney/wdpro/virtualqueue/ui/common/FacilityUtils\n*L\n37#1:78\n37#1:79,2\n*E\n"})
/* loaded from: classes20.dex */
public class FacilityUtils {
    public static final int $stable = 8;
    private final Context context;
    private SimpleDateFormat displayTimeFormat;
    private final InterfaceC27160n facilityRepository;
    private final C9314j parkAppConfiguration;

    @Inject
    public FacilityUtils(Context context, C9314j parkAppConfiguration, InterfaceC27160n facilityRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(facilityRepository, "facilityRepository");
        this.context = context;
        this.parkAppConfiguration = parkAppConfiguration;
        this.facilityRepository = facilityRepository;
        this.displayTimeFormat = new SimpleDateFormat(context.getResources().getString(C21487R.string.format_12_hours));
    }

    private final String formatTimeForDisplay(String dateString, SimpleDateFormat dateStringFormat) {
        this.displayTimeFormat.setTimeZone(getTimezone());
        dateStringFormat.setTimeZone(getTimezone());
        String display = C9350r.m39070f(dateString, dateStringFormat, this.displayTimeFormat);
        if (Intrinsics.areEqual(display, dateString)) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(display, "display");
        return StringsKt.replace$default(display, " ", " ", false, 4, (Object) null);
    }

    public final String convertDateLongToScheduleTime(long dateLong) {
        Date date = new Date(dateLong);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.context.getResources().getString(C21487R.string.format_date_string), Locale.getDefault());
        simpleDateFormat.setTimeZone(getTimezone());
        String string = date.toString();
        Intrinsics.checkNotNullExpressionValue(string, "date.toString()");
        return formatTimeForDisplay(string, simpleDateFormat);
    }

    public final String formatDisplayableTime(String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        String timeForDisplay = formatTimeForDisplay(time, new SimpleDateFormat(this.context.getResources().getString(C21487R.string.format_join_window_queue_time), Locale.getDefault()));
        return StringsKt.isBlank(timeForDisplay) ? time : timeForDisplay;
    }

    public final SimpleDateFormat getDisplayTimeFormat() {
        return this.displayTimeFormat;
    }

    public final List<Facility> getFacilities(List<String> facilityIdsList) {
        Intrinsics.checkNotNullParameter(facilityIdsList, "facilityIdsList");
        if (facilityIdsList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List<Facility> listMo39490k = this.facilityRepository.mo39490k(CollectionsKt.filterNotNull(facilityIdsList));
        Intrinsics.checkNotNullExpressionValue(listMo39490k, "{\n            facilityRe…ilterNotNull())\n        }");
        return listMo39490k;
    }

    public final List<Facility> getFacilitiesByFacilityType(List<? extends Facility> facilities, Facility.FacilityDataType facilityType) {
        Intrinsics.checkNotNullParameter(facilities, "facilities");
        Intrinsics.checkNotNullParameter(facilityType, "facilityType");
        ArrayList arrayList = new ArrayList();
        for (Object obj : facilities) {
            if (((Facility) obj).getType() == facilityType) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Facility getFacility(String facilityId) {
        if (facilityId == null || StringsKt.isBlank(facilityId)) {
            return null;
        }
        return this.facilityRepository.findWithId(facilityId);
    }

    public final TimeZone getTimezone() {
        String strM38908h = this.parkAppConfiguration.m38908h();
        if (Intrinsics.areEqual(strM38908h, "WDW")) {
            TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
            Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(\"America/New_York\")");
            return timeZone;
        }
        if (Intrinsics.areEqual(strM38908h, "DLR")) {
            TimeZone timeZone2 = TimeZone.getTimeZone("America/Los_Angeles");
            Intrinsics.checkNotNullExpressionValue(timeZone2, "getTimeZone(\"America/Los_Angeles\")");
            return timeZone2;
        }
        TimeZone timeZone3 = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone3, "getDefault()");
        return timeZone3;
    }

    public final void setDisplayTimeFormat(SimpleDateFormat simpleDateFormat) {
        Intrinsics.checkNotNullParameter(simpleDateFormat, "<set-?>");
        this.displayTimeFormat = simpleDateFormat;
    }

    public final String toCamelCase(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = str.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt.trimEnd((CharSequence) CollectionsKt.joinToString$default(StringsKt.split$default((CharSequence) lowerCase, new String[]{" "}, false, 0, 6, (Object) null), " ", null, null, 0, null, new Function1<String, CharSequence>() { // from class: com.disney.wdpro.virtualqueue.ui.common.FacilityUtils.toCamelCase.1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt.capitalize(it);
            }
        }, 30, null)).toString();
    }
}