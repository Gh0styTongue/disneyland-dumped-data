package com.disney.wdpro.geofence.storage.state;

import com.disney.wdpro.geofence.model.GeofenceWrapper;
import com.disney.wdpro.geofence.storage.Storage;
import com.disney.wdpro.geofence.util.CollectionUtils;
import com.disney.wdpro.geofence.util.GeofenceUtils;
import com.disney.wdpro.geofence.util.LogUtils;
import com.disney.wdpro.geofence.util.analytics.GeofenceCrashHelper;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes28.dex */
public class GeofenceStateManagerImpl implements GeofenceStateManager {
    private GeofenceCrashHelper geofenceCrashHelper;
    private Storage storage;

    @Inject
    public GeofenceStateManagerImpl(@Named(GeofenceUtils.GEOFENCE_STORAGE_ID) Storage storage, GeofenceCrashHelper geofenceCrashHelper) {
        this.storage = storage;
        this.geofenceCrashHelper = geofenceCrashHelper;
    }

    private GeofenceWrapper getGeofenceById(String str, List<GeofenceWrapper> list) {
        if (CollectionUtils.isNullOrEmpty(list)) {
            return null;
        }
        for (GeofenceWrapper geofenceWrapper : list) {
            if (str.equals(geofenceWrapper.getId())) {
                return geofenceWrapper;
            }
            GeofenceWrapper geofenceById = getGeofenceById(str, geofenceWrapper.getGeofences());
            if (geofenceById != null) {
                return geofenceById;
            }
        }
        return null;
    }

    private Optional<GeofenceGroup> getGeofenceGroup(String str) {
        GeofenceGroup geofenceGroup;
        try {
            geofenceGroup = (GeofenceGroup) this.storage.getItem(str, GeofenceGroup.class);
        } catch (Exception e10) {
            this.geofenceCrashHelper.recordHandledException(e10);
            geofenceGroup = null;
        }
        return Optional.fromNullable(geofenceGroup);
    }

    private List<String> getInternalIds(List<GeofenceWrapper> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<GeofenceWrapper> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getInternalId());
        }
        return arrayList;
    }

    private void logGeofenceGroupIdNotFoundError(String str, String str2) {
        this.geofenceCrashHelper.recordGeofenceGroupIdRetrievalErrorEvent(str, str2);
        LogUtils.m50244e(str2 + ": could not find geofenceGroup for groupId: " + str);
    }

    @Override // com.disney.wdpro.geofence.storage.state.GeofenceStateManager
    public void addRunningGeofences(String str, List<GeofenceWrapper> list) {
        Optional<GeofenceGroup> geofenceGroup = getGeofenceGroup(str);
        if (!geofenceGroup.isPresent()) {
            logGeofenceGroupIdNotFoundError(str, "addRunningGeofences");
            return;
        }
        GeofenceGroup geofenceGroup2 = geofenceGroup.get();
        List<String> runningGeofences = geofenceGroup2.getRunningGeofences();
        for (GeofenceWrapper geofenceWrapper : list) {
            if (!runningGeofences.contains(geofenceWrapper.getInternalId())) {
                runningGeofences.add(geofenceWrapper.getInternalId());
            }
        }
        this.geofenceCrashHelper.recordAddRunningGeofencesEvent(str, getInternalIds(list));
        this.storage.putItem(str, geofenceGroup2);
    }

    @Override // com.disney.wdpro.geofence.storage.state.GeofenceStateManager
    public List<String> getAndRemoveChildrenFromTrackingList(String str, String str2) {
        Optional<GeofenceGroup> geofenceGroup = getGeofenceGroup(str);
        if (!geofenceGroup.isPresent()) {
            logGeofenceGroupIdNotFoundError(str, "getAndRemoveChildrenFromTrackingList");
            return null;
        }
        GeofenceGroup geofenceGroup2 = geofenceGroup.get();
        List<String> andRemoveChildrenFromTrackingList = geofenceGroup2.getAndRemoveChildrenFromTrackingList(GeofenceUtils.concatId(str, str2));
        this.storage.putItem(str, geofenceGroup2);
        return andRemoveChildrenFromTrackingList;
    }

    @Override // com.disney.wdpro.geofence.storage.state.GeofenceStateManager
    public List<GeofenceWrapper> getChildren(String str, String str2) {
        GeofenceWrapper geofenceById;
        Optional<GeofenceGroup> geofenceGroup = getGeofenceGroup(str);
        if (geofenceGroup.isPresent() && (geofenceById = getGeofenceById(str2, geofenceGroup.get().getGeofences())) != null) {
            return geofenceById.getGeofences();
        }
        logGeofenceGroupIdNotFoundError(str, "getChildren");
        return null;
    }

    @Override // com.disney.wdpro.geofence.storage.state.GeofenceStateManager
    public GeofenceWrapper getGeofenceByInternalId(String str) {
        if (C22466q.m68722b(str)) {
            return null;
        }
        String[] strArrSplitGeofenceId = GeofenceUtils.splitGeofenceId(str);
        if (strArrSplitGeofenceId.length < 2) {
            LogUtils.m50245w("There was a problem splitting an internal id = " + str);
            this.geofenceCrashHelper.recordGeofenceByInternalIdRetrievalErrorEvent(str, "getGeofenceByInternalId");
            return null;
        }
        String str2 = strArrSplitGeofenceId[0];
        String str3 = strArrSplitGeofenceId[1];
        if (!C22466q.m68722b(str2) && !C22466q.m68722b(str3)) {
            Optional<GeofenceGroup> geofenceGroup = getGeofenceGroup(str2);
            if (geofenceGroup.isPresent()) {
                return getGeofenceById(str3, geofenceGroup.get().getGeofences());
            }
            logGeofenceGroupIdNotFoundError(str2, "getGeofenceByInternalId");
            return null;
        }
        LogUtils.m50245w("The internal Id is in an incorrect format = " + str);
        this.geofenceCrashHelper.recordGeofenceByInternalIdRetrievalErrorEvent(str, "getGeofenceByInternalId");
        return null;
    }

    @Override // com.disney.wdpro.geofence.storage.state.GeofenceStateManager
    public List<String> getRunningGeofencesByGroupId(String str) {
        Optional<GeofenceGroup> geofenceGroup = getGeofenceGroup(str);
        if (geofenceGroup.isPresent()) {
            return geofenceGroup.get().getRunningGeofences();
        }
        return null;
    }

    @Override // com.disney.wdpro.geofence.storage.state.GeofenceStateManager
    public List<GeofenceWrapper> getSiblings(String str, String str2) {
        Optional<GeofenceGroup> geofenceGroup = getGeofenceGroup(str);
        if (!geofenceGroup.isPresent()) {
            logGeofenceGroupIdNotFoundError(str, "getSiblings");
            return null;
        }
        List<GeofenceWrapper> siblings = getSiblings(str2, geofenceGroup.get().getGeofences());
        if (!CollectionUtils.isNullOrEmpty(siblings)) {
            Iterator<GeofenceWrapper> it = siblings.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GeofenceWrapper next = it.next();
                if (str2.equals(next.getId())) {
                    siblings.remove(next);
                    break;
                }
            }
        }
        return siblings;
    }

    @Override // com.disney.wdpro.geofence.storage.state.GeofenceStateManager
    public Map<String, List<GeofenceWrapper>> getTopGeofencesFromAllGroups() {
        Map allItems;
        HashMap map = new HashMap();
        try {
            allItems = this.storage.getAllItems(GeofenceGroup.class);
        } catch (Exception e10) {
            this.geofenceCrashHelper.recordHandledException(e10);
            e10.getMessage();
            allItems = null;
        }
        if (!CollectionUtils.isNullOrEmpty(allItems)) {
            for (GeofenceGroup geofenceGroup : allItems.values()) {
                map.put(geofenceGroup.getGroupId(), geofenceGroup.getGeofences());
            }
        }
        return map;
    }

    @Override // com.disney.wdpro.geofence.storage.state.GeofenceStateManager
    public boolean isPresentOnTrackingEnterList(String str, String str2) {
        Optional<GeofenceGroup> geofenceGroup = getGeofenceGroup(str);
        if (geofenceGroup.isPresent()) {
            return geofenceGroup.get().isPresentOnTrackingEnterList(GeofenceUtils.concatId(str, str2));
        }
        logGeofenceGroupIdNotFoundError(str, "isPresentOnTrackingEnterList");
        return false;
    }

    @Override // com.disney.wdpro.geofence.storage.state.GeofenceStateManager
    public void registerOnEnterAction(String str, String str2) {
        Optional<GeofenceGroup> geofenceGroup = getGeofenceGroup(str);
        if (!geofenceGroup.isPresent()) {
            logGeofenceGroupIdNotFoundError(str, "registerOnEnterAction");
            return;
        }
        GeofenceGroup geofenceGroup2 = geofenceGroup.get();
        geofenceGroup2.addToTrackingEnterList(GeofenceUtils.concatId(str, str2));
        this.storage.putItem(str, geofenceGroup2);
    }

    @Override // com.disney.wdpro.geofence.storage.state.GeofenceStateManager
    public void removeGroup(String str) {
        this.geofenceCrashHelper.recordRemoveGroupIdEvent(str);
        this.storage.removeById(str);
    }

    @Override // com.disney.wdpro.geofence.storage.state.GeofenceStateManager
    public void removeRunningGeofences(String str, List<String> list) {
        if (CollectionUtils.isNullOrEmpty(list)) {
            LogUtils.m50243d("No geofences to remove.");
            return;
        }
        Optional<GeofenceGroup> geofenceGroup = getGeofenceGroup(str);
        if (!geofenceGroup.isPresent()) {
            logGeofenceGroupIdNotFoundError(str, "removeRunningGeofences");
            return;
        }
        GeofenceGroup geofenceGroup2 = geofenceGroup.get();
        if (CollectionUtils.isNullOrEmpty(geofenceGroup2.getRunningGeofences())) {
            return;
        }
        geofenceGroup2.getRunningGeofences().removeAll(list);
        this.geofenceCrashHelper.recordRemoveRunningGeofencesEvent(str, list);
        this.storage.putItem(str, geofenceGroup2);
    }

    @Override // com.disney.wdpro.geofence.storage.state.GeofenceStateManager
    public void saveGeofencesByGroup(String str, List<GeofenceWrapper> list) {
        this.geofenceCrashHelper.recordSaveGeofencesByGroupIdEvent(str, getInternalIds(list));
        this.storage.putItem(str, new GeofenceGroup(str, list));
    }

    private List<GeofenceWrapper> getSiblings(String str, List<GeofenceWrapper> list) {
        if (CollectionUtils.isNullOrEmpty(list)) {
            return null;
        }
        for (GeofenceWrapper geofenceWrapper : list) {
            if (str.equals(geofenceWrapper.getId())) {
                return list;
            }
            List<GeofenceWrapper> siblings = getSiblings(str, geofenceWrapper.getGeofences());
            if (!CollectionUtils.isNullOrEmpty(siblings)) {
                return siblings;
            }
        }
        return null;
    }
}