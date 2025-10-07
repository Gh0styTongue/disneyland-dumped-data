package com.disney.wdpro.geofence.util.analytics;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.bookingservices.checkout.CheckoutConstants;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.geofence.location.LocationAction;
import com.disney.wdpro.service.business.APIConstants;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001bJA\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\n2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\n2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\n2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e¢\u0006\u0004\b&\u0010%J%\u0010'\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\n2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e¢\u0006\u0004\b'\u0010%J#\u0010(\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0004\b(\u0010%J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\u0019\u0010.\u001a\u00020\u000e2\n\u0010-\u001a\u00060+j\u0002`,¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101¨\u00062"}, m92038d2 = {"Lcom/disney/wdpro/geofence/util/analytics/GeofenceCrashHelper;", "", "Lcom/disney/wdpro/analytics/n;", "crashHelper", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "<init>", "(Lcom/disney/wdpro/analytics/n;Lcom/disney/wdpro/commons/config/i;)V", "Lcom/disney/wdpro/geofence/util/analytics/GeofenceCrashHelperEventType;", "eventType", "", CheckoutConstants.ANALYTICS_COMMERCE_EVENT_NAME_KEY, "", APIConstants.UrlParams.ATTRIBUTES, "", "recordCustomEvent", "(Lcom/disney/wdpro/geofence/util/analytics/GeofenceCrashHelperEventType;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/disney/wdpro/geofence/location/LocationAction;", "locationAction", "recordGeofenceEventFromLocationAction", "(Lcom/disney/wdpro/geofence/location/LocationAction;)V", "", "statusCode", "recordGeofencingApiCallbackError", "(I)V", "groupId", "recordGeofenceGroupIdRetrievalErrorEvent", "(Ljava/lang/String;Ljava/lang/String;)V", "internalId", "recordGeofenceByInternalIdRetrievalErrorEvent", "", "runningGeofenceIds", "geofenceIds", "validGeofenceIds", "recordGeofenceManagerRegisterGeofencesEvent", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "recordGeofenceManagerRemoveGeofencesEvent", "(Ljava/lang/String;Ljava/util/List;)V", "recordAddRunningGeofencesEvent", "recordRemoveRunningGeofencesEvent", "recordSaveGeofencesByGroupIdEvent", "recordRemoveGroupIdEvent", "(Ljava/lang/String;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "recordHandledException", "(Ljava/lang/Exception;)V", "Lcom/disney/wdpro/analytics/n;", "Lcom/disney/wdpro/commons/config/i;", "geofence-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final class GeofenceCrashHelper {
    private final InterfaceC8682n crashHelper;
    private final C9248i vendomatic;

    @Inject
    public GeofenceCrashHelper(InterfaceC8682n crashHelper, C9248i vendomatic) {
        Intrinsics.checkNotNullParameter(crashHelper, "crashHelper");
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        this.crashHelper = crashHelper;
        this.vendomatic = vendomatic;
    }

    private final void recordCustomEvent(GeofenceCrashHelperEventType eventType, String eventName, Map<String, ? extends Object> attributes) {
        if (this.vendomatic.m38709O0()) {
            this.crashHelper.recordCustomEvent(eventType.name(), eventName, attributes);
        }
    }

    public final void recordAddRunningGeofencesEvent(String groupId, List<String> geofenceIds) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (geofenceIds != null) {
            linkedHashMap.put("GEOFENCE_RUNNING_GEOFENCES_IDS", CollectionsKt.joinToString$default(geofenceIds, null, null, null, 0, null, null, 63, null));
        }
        linkedHashMap.put("GEOFENCE_GROUP_ID", groupId);
        recordCustomEvent(GeofenceCrashHelperEventType.GEOFENCE_STORAGE, "GEOFENCE_ADD_RUNNING_GEOFENCES", linkedHashMap);
    }

    public final void recordGeofenceByInternalIdRetrievalErrorEvent(String internalId, String eventName) {
        Intrinsics.checkNotNullParameter(internalId, "internalId");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("GEOFENCE_INTERNAL_ID", internalId);
        recordCustomEvent(GeofenceCrashHelperEventType.GEOFENCE_STORAGE_INTERNAL_ID_ERROR, eventName, linkedHashMap);
    }

    public final void recordGeofenceEventFromLocationAction(LocationAction locationAction) {
        if (locationAction == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Geofence> geofences = locationAction.getGeofences();
        if (geofences != null) {
            linkedHashMap.put("GEOFENCE_LIST_SIZE", Integer.valueOf(geofences.size()));
        }
        List<String> ids = locationAction.getIds();
        if (ids != null) {
            linkedHashMap.put("GEOFENCE_LIST_IDS", CollectionsKt.joinToString$default(ids, null, null, null, 0, null, null, 63, null));
            linkedHashMap.put("GEOFENCE_LIST_SIZE", Integer.valueOf(ids.size()));
        }
        int locationActionMethod = locationAction.getLocationActionMethod();
        Pair pairM92045to = locationActionMethod != 0 ? locationActionMethod != 1 ? null : TuplesKt.m92045to(GeofenceCrashHelperEventType.GEOFENCES_REMOVE, "GEOFENCES_REMOVE_FROM_LOCATION_ACTION") : TuplesKt.m92045to(GeofenceCrashHelperEventType.GEOFENCES_ADD, "GEOFENCES_ADD_FROM_LOCATION_ACTION");
        if (pairM92045to == null) {
            return;
        }
        recordCustomEvent((GeofenceCrashHelperEventType) pairM92045to.getFirst(), (String) pairM92045to.getSecond(), linkedHashMap);
    }

    public final void recordGeofenceGroupIdRetrievalErrorEvent(String groupId, String eventName) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("GEOFENCE_GROUP_ID", groupId);
        recordCustomEvent(GeofenceCrashHelperEventType.GEOFENCE_STORAGE_GROUP_ID_NOT_FOUND, eventName, linkedHashMap);
    }

    public final void recordGeofenceManagerRegisterGeofencesEvent(String groupId, List<String> runningGeofenceIds, List<String> geofenceIds, List<String> validGeofenceIds) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(geofenceIds, "geofenceIds");
        Intrinsics.checkNotNullParameter(validGeofenceIds, "validGeofenceIds");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (runningGeofenceIds != null) {
            linkedHashMap.put("GEOFENCE_RUNNING_GEOFENCES_IDS", CollectionsKt.joinToString$default(runningGeofenceIds, null, null, null, 0, null, null, 63, null));
        }
        linkedHashMap.put("GEOFENCE_LIST_IDS", CollectionsKt.joinToString$default(geofenceIds, null, null, null, 0, null, null, 63, null));
        linkedHashMap.put("GEOFENCE_VALID_GEOFENCES_IDS", CollectionsKt.joinToString$default(validGeofenceIds, null, null, null, 0, null, null, 63, null));
        linkedHashMap.put("GEOFENCE_GROUP_ID", groupId);
        recordCustomEvent(GeofenceCrashHelperEventType.GEOFENCES_ADD, "GEOFENCES_REGISTER", linkedHashMap);
    }

    public final void recordGeofenceManagerRemoveGeofencesEvent(String groupId, List<String> runningGeofenceIds) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (runningGeofenceIds != null) {
            linkedHashMap.put("GEOFENCE_RUNNING_GEOFENCES_IDS", CollectionsKt.joinToString$default(runningGeofenceIds, null, null, null, 0, null, null, 63, null));
        }
        linkedHashMap.put("GEOFENCE_GROUP_ID", groupId);
        recordCustomEvent(GeofenceCrashHelperEventType.GEOFENCES_REMOVE, "GEOFENCES_REMOVE", linkedHashMap);
    }

    public final void recordGeofencingApiCallbackError(int statusCode) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("GEOFENCE_CALLBACK_ERROR_STATUS_CODE", GeofenceStatusCodes.getStatusCodeString(statusCode));
        recordCustomEvent(GeofenceCrashHelperEventType.GEOFENCING_API_CALLBACK_ERROR, "recordGeofencingApiCallbackError", linkedHashMap);
    }

    public final void recordHandledException(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (this.vendomatic.m38709O0()) {
            this.crashHelper.recordHandledException(exception);
        }
    }

    public final void recordRemoveGroupIdEvent(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("GEOFENCE_GROUP_ID", groupId);
        recordCustomEvent(GeofenceCrashHelperEventType.GEOFENCE_STORAGE, "GEOFENCE_REMOVE_GROUP", linkedHashMap);
    }

    public final void recordRemoveRunningGeofencesEvent(String groupId, List<String> geofenceIds) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (geofenceIds != null) {
            linkedHashMap.put("GEOFENCE_RUNNING_GEOFENCES_IDS", CollectionsKt.joinToString$default(geofenceIds, null, null, null, 0, null, null, 63, null));
        }
        linkedHashMap.put("GEOFENCE_GROUP_ID", groupId);
        recordCustomEvent(GeofenceCrashHelperEventType.GEOFENCE_STORAGE, "GEOFENCE_REMOVE_RUNNING_GEOFENCES", linkedHashMap);
    }

    public final void recordSaveGeofencesByGroupIdEvent(String groupId, List<String> geofenceIds) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(geofenceIds, "geofenceIds");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("GEOFENCE_LIST_IDS", CollectionsKt.joinToString$default(geofenceIds, null, null, null, 0, null, null, 63, null));
        linkedHashMap.put("GEOFENCE_GROUP_ID", groupId);
        recordCustomEvent(GeofenceCrashHelperEventType.GEOFENCE_STORAGE, "GEOFENCE_SAVE_GEOFENCES_BY_GROUP", linkedHashMap);
    }
}