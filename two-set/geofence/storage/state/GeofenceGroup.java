package com.disney.wdpro.geofence.storage.state;

import com.disney.wdpro.geofence.model.GeofenceWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes28.dex */
public class GeofenceGroup {
    private final List<GeofenceWrapper> geofences;
    private final String groupId;
    private final List<String> runningGeofences = new ArrayList();
    private final List<String> trackEnterList = new ArrayList();

    public GeofenceGroup(String str, List<GeofenceWrapper> list) {
        this.groupId = str;
        this.geofences = list;
    }

    public void addToTrackingEnterList(String str) {
        if (this.trackEnterList.contains(str)) {
            return;
        }
        this.trackEnterList.add(str);
    }

    public List<String> getAndRemoveChildrenFromTrackingList(String str) {
        ArrayList arrayList = new ArrayList();
        int iIndexOf = this.trackEnterList.indexOf(str);
        if (iIndexOf >= 0) {
            if (iIndexOf < this.trackEnterList.size() - 1) {
                List<String> list = this.trackEnterList;
                arrayList.addAll(list.subList(iIndexOf + 1, list.size()));
                this.trackEnterList.removeAll(arrayList);
                return arrayList;
            }
            this.trackEnterList.remove(iIndexOf);
        }
        return arrayList;
    }

    public List<GeofenceWrapper> getGeofences() {
        return this.geofences;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public List<String> getRunningGeofences() {
        return this.runningGeofences;
    }

    boolean isPresentOnTrackingEnterList(String str) {
        return this.trackEnterList.contains(str);
    }
}