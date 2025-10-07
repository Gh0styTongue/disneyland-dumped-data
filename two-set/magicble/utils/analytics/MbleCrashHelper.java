package com.disney.wdpro.magicble.utils.analytics;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.bookingservices.checkout.CheckoutConstants;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.magicble.utils.MbleUtils;
import com.disney.wdpro.mblecore.events.MbleBaseEvent;
import com.disney.wdpro.service.business.APIConstants;
import com.google.common.base.C22466q;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001d"}, m92038d2 = {"Lcom/disney/wdpro/magicble/utils/analytics/MbleCrashHelper;", "", "Lcom/disney/wdpro/analytics/n;", "crashHelper", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "<init>", "(Lcom/disney/wdpro/analytics/n;Lcom/disney/wdpro/commons/config/i;)V", "", "eventType", CheckoutConstants.ANALYTICS_COMMERCE_EVENT_NAME_KEY, "", APIConstants.UrlParams.ATTRIBUTES, "", "recordCustomEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/disney/wdpro/mblecore/events/MbleBaseEvent;", "event", "errorTypeAttr", "createMapWithEvent", "(Lcom/disney/wdpro/mblecore/events/MbleBaseEvent;Ljava/lang/String;)Ljava/util/Map;", "", "throwable", "recordMbleErrorEvent", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Lcom/disney/wdpro/mblecore/events/MbleBaseEvent;)V", "Lcom/disney/wdpro/analytics/n;", "Lcom/disney/wdpro/commons/config/i;", "Companion", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleCrashHelper {
    private final InterfaceC8682n crashHelper;
    private final C9248i vendomatic;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EVENT_TYPE = "MbleErrorEvent";
    private static final String EVENT_NAME = EventsConstantsKt.MAGIC_BLE_EVENT;
    private static final String MBLE_ERROR_TYPE_ATTR = "MbleErrorType";
    private static final String MBLE_ERROR_CODE = "MbleErrorCode";
    private static final String MBLE_ERROR_DESCRIPTION = "MbleErrorDesc";

    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/magicble/utils/analytics/MbleCrashHelper$Companion;", "", "()V", "EVENT_NAME", "", "getEVENT_NAME$magic_ble_lib_release", "()Ljava/lang/String;", "EVENT_TYPE", "getEVENT_TYPE$magic_ble_lib_release", "MBLE_ERROR_CODE", "getMBLE_ERROR_CODE$magic_ble_lib_release", "MBLE_ERROR_DESCRIPTION", "getMBLE_ERROR_DESCRIPTION$magic_ble_lib_release", "MBLE_ERROR_TYPE_ATTR", "getMBLE_ERROR_TYPE_ATTR$magic_ble_lib_release", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getEVENT_NAME$magic_ble_lib_release() {
            return MbleCrashHelper.EVENT_NAME;
        }

        public final String getEVENT_TYPE$magic_ble_lib_release() {
            return MbleCrashHelper.EVENT_TYPE;
        }

        public final String getMBLE_ERROR_CODE$magic_ble_lib_release() {
            return MbleCrashHelper.MBLE_ERROR_CODE;
        }

        public final String getMBLE_ERROR_DESCRIPTION$magic_ble_lib_release() {
            return MbleCrashHelper.MBLE_ERROR_DESCRIPTION;
        }

        public final String getMBLE_ERROR_TYPE_ATTR$magic_ble_lib_release() {
            return MbleCrashHelper.MBLE_ERROR_TYPE_ATTR;
        }

        private Companion() {
        }
    }

    @Inject
    public MbleCrashHelper(InterfaceC8682n crashHelper, C9248i vendomatic) {
        Intrinsics.checkNotNullParameter(crashHelper, "crashHelper");
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        this.crashHelper = crashHelper;
        this.vendomatic = vendomatic;
    }

    private final Map<String, Object> createMapWithEvent(MbleBaseEvent event, String errorTypeAttr) {
        String strMapMbleCoreErrorCodeToDescription;
        String message;
        HashMap attributes = Maps.m69381r();
        attributes.put(MBLE_ERROR_TYPE_ATTR, errorTypeAttr);
        if (event != null) {
            Integer errorCode = event.getErrorCode();
            if (errorCode != null) {
                int iIntValue = errorCode.intValue();
                attributes.put(MBLE_ERROR_CODE, Integer.valueOf(iIntValue));
                strMapMbleCoreErrorCodeToDescription = MbleUtils.INSTANCE.mapMbleCoreErrorCodeToDescription(iIntValue);
            } else {
                strMapMbleCoreErrorCodeToDescription = "";
            }
            Throwable throwable = event.getThrowable();
            if (throwable != null && !C22466q.m68722b(throwable.getMessage()) && (message = throwable.getMessage()) != null) {
                strMapMbleCoreErrorCodeToDescription = message;
            }
            attributes.put(MBLE_ERROR_DESCRIPTION, strMapMbleCoreErrorCodeToDescription);
        }
        Intrinsics.checkNotNullExpressionValue(attributes, "attributes");
        return attributes;
    }

    private final void recordCustomEvent(String eventType, String eventName, Map<String, ? extends Object> attributes) {
        attributes.toString();
        if (this.vendomatic.m38697K0()) {
            this.crashHelper.recordCustomEvent(eventType, eventName, attributes);
        }
    }

    public final void recordMbleErrorEvent(String errorTypeAttr, Throwable throwable) {
        Intrinsics.checkNotNullParameter(errorTypeAttr, "errorTypeAttr");
        HashMap attributes = Maps.m69381r();
        attributes.put(MBLE_ERROR_TYPE_ATTR, errorTypeAttr);
        if (throwable != null && !C22466q.m68722b(throwable.getMessage())) {
            attributes.put(MBLE_ERROR_DESCRIPTION, throwable.getMessage());
        }
        String str = EVENT_TYPE;
        String str2 = EVENT_NAME;
        Intrinsics.checkNotNullExpressionValue(attributes, "attributes");
        recordCustomEvent(str, str2, attributes);
    }

    public final void recordMbleErrorEvent(String errorTypeAttr, MbleBaseEvent event) {
        Intrinsics.checkNotNullParameter(errorTypeAttr, "errorTypeAttr");
        Intrinsics.checkNotNullParameter(event, "event");
        recordCustomEvent(EVENT_TYPE, EVENT_NAME, createMapWithEvent(event, errorTypeAttr));
    }
}