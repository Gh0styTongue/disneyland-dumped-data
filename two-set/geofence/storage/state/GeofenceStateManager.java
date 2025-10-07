package com.disney.wdpro.geofence.storage.state;

import com.disney.wdpro.geofence.model.GeofenceWrapper;
import java.util.List;
import java.util.Map;

/* loaded from: classes28.dex */
public interface GeofenceStateManager {
    void addRunningGeofences(String str, List<GeofenceWrapper> list);

    List<String> getAndRemoveChildrenFromTrackingList(String str, String str2);

    List<GeofenceWrapper> getChildren(String str, String str2);

    GeofenceWrapper getGeofenceByInternalId(String str);

    List<String> getRunningGeofencesByGroupId(String str);

    List<GeofenceWrapper> getSiblings(String str, String str2);

    Map<String, List<GeofenceWrapper>> getTopGeofencesFromAllGroups();

    boolean isPresentOnTrackingEnterList(String str, String str2);

    void registerOnEnterAction(String str, String str2);

    void removeGroup(String str);

    void removeRunningGeofences(String str, List<String> list);

    void saveGeofencesByGroup(String str, List<GeofenceWrapper> list);
}