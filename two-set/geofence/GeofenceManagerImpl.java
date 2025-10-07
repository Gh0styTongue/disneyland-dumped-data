package com.disney.wdpro.geofence;

import com.disney.wdpro.geofence.GeofenceManager;
import com.disney.wdpro.geofence.location.LocationServiceWrapper;
import com.disney.wdpro.geofence.model.GeofenceWrapper;
import com.disney.wdpro.geofence.storage.state.GeofenceStateManager;
import com.disney.wdpro.geofence.util.CollectionUtils;
import com.disney.wdpro.geofence.util.LogUtils;
import com.disney.wdpro.geofence.util.analytics.GeofenceCrashHelper;
import com.google.android.gms.location.Geofence;
import com.google.common.base.C22466q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes28.dex */
public class GeofenceManagerImpl implements GeofenceManager {
    private final GeofenceCrashHelper geofenceCrashHelper;
    private final GeofenceMapper geofenceMapper;
    private final LocationServiceWrapper locationService;
    private final GeofenceStateManager stateManager;

    @Inject
    public GeofenceManagerImpl(LocationServiceWrapper locationServiceWrapper, GeofenceStateManager geofenceStateManager, GeofenceMapper geofenceMapper, GeofenceCrashHelper geofenceCrashHelper) {
        this.locationService = locationServiceWrapper;
        this.stateManager = geofenceStateManager;
        this.geofenceMapper = geofenceMapper;
        this.geofenceCrashHelper = geofenceCrashHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createChildrenGeofences(String str, String str2, GeofenceManager.GeofenceStatusCallback geofenceStatusCallback) {
        List<GeofenceWrapper> children = this.stateManager.getChildren(str, str2);
        if (CollectionUtils.isNullOrEmpty(children)) {
            geofenceStatusCallback.onSuccess();
        } else {
            createGeofences(str, children, geofenceStatusCallback);
        }
    }

    private void createGeofences(final String str, final List<GeofenceWrapper> list, final GeofenceManager.GeofenceStatusCallback geofenceStatusCallback) {
        if (CollectionUtils.isNullOrEmpty(list)) {
            LogUtils.m50243d("Geofences list is null or empty.");
            geofenceStatusCallback.onSuccess();
            return;
        }
        final List<Geofence> listMapGeofenceWrapperToGeofence = this.geofenceMapper.mapGeofenceWrapperToGeofence(list);
        if (!CollectionUtils.isNullOrEmpty(listMapGeofenceWrapperToGeofence)) {
            this.locationService.addGeofences(listMapGeofenceWrapperToGeofence, new LocationServiceWrapper.LocationStatusCallback() { // from class: com.disney.wdpro.geofence.GeofenceManagerImpl.3
                @Override // com.disney.wdpro.geofence.location.LocationServiceWrapper.LocationStatusCallback
                public void onError() {
                    GeofenceManager.GeofenceStatusCallback geofenceStatusCallback2 = geofenceStatusCallback;
                    if (geofenceStatusCallback2 != null) {
                        geofenceStatusCallback2.onError();
                    }
                }

                @Override // com.disney.wdpro.geofence.location.LocationServiceWrapper.LocationStatusCallback
                public void onSuccess() {
                    LogUtils.m50243d("Geofences are running:");
                    Iterator it = listMapGeofenceWrapperToGeofence.iterator();
                    while (it.hasNext()) {
                        LogUtils.m50243d("Geofence Running with ID: " + ((Geofence) it.next()).getRequestId());
                    }
                    LogUtils.m50243d("Saving running geofences in local storage.");
                    GeofenceManagerImpl.this.stateManager.addRunningGeofences(str, list);
                    GeofenceManager.GeofenceStatusCallback geofenceStatusCallback2 = geofenceStatusCallback;
                    if (geofenceStatusCallback2 != null) {
                        geofenceStatusCallback2.onSuccess();
                    }
                }
            });
        } else {
            LogUtils.m50243d("No geofences to add after filtering.");
            geofenceStatusCallback.onSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSiblingsGeofences(String str, String str2, GeofenceManager.GeofenceStatusCallback geofenceStatusCallback) {
        List<GeofenceWrapper> siblings = this.stateManager.getSiblings(str, str2);
        if (CollectionUtils.isNullOrEmpty(siblings)) {
            geofenceStatusCallback.onSuccess();
        } else {
            createGeofences(str, siblings, geofenceStatusCallback);
        }
    }

    private List<String> getGeofencesToRemoveOnExitAction(String str, String str2) {
        HashSet hashSet = new HashSet();
        List<String> andRemoveChildrenFromTrackingList = this.stateManager.getAndRemoveChildrenFromTrackingList(str, str2);
        if (!CollectionUtils.isNullOrEmpty(andRemoveChildrenFromTrackingList)) {
            hashSet.addAll(andRemoveChildrenFromTrackingList);
            str2 = andRemoveChildrenFromTrackingList.get(andRemoveChildrenFromTrackingList.size() - 1);
        }
        List<GeofenceWrapper> children = this.stateManager.getChildren(str, str2);
        if (!CollectionUtils.isNullOrEmpty(children)) {
            hashSet.addAll(getInternalIds(children));
        }
        return new ArrayList(hashSet);
    }

    private List<String> getInternalIds(List<GeofenceWrapper> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<GeofenceWrapper> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getInternalId());
        }
        return arrayList;
    }

    private List<GeofenceWrapper> getValidGeofences(List<GeofenceWrapper> list) {
        ArrayList arrayList = new ArrayList();
        for (GeofenceWrapper geofenceWrapper : list) {
            if (geofenceWrapper.isValid()) {
                arrayList.add(geofenceWrapper);
            } else {
                LogUtils.m50243d("Geofence is not valid, ignored from mapper. GeofenceWrapper ID: " + geofenceWrapper.getId());
            }
        }
        return arrayList;
    }

    private void removeAllGeofencesWithInternalId(final String str, final List<String> list, final GeofenceManager.GeofenceStatusCallback geofenceStatusCallback) {
        LogUtils.m50243d("Calling Location Service to remove " + list.size() + " geofences.");
        this.locationService.removeGeofences(list, new LocationServiceWrapper.LocationStatusCallback() { // from class: com.disney.wdpro.geofence.GeofenceManagerImpl.5
            @Override // com.disney.wdpro.geofence.location.LocationServiceWrapper.LocationStatusCallback
            public void onError() {
                LogUtils.m50245w("There was a problem to remove geofences from location service.");
                GeofenceManager.GeofenceStatusCallback geofenceStatusCallback2 = geofenceStatusCallback;
                if (geofenceStatusCallback2 != null) {
                    geofenceStatusCallback2.onError();
                }
            }

            @Override // com.disney.wdpro.geofence.location.LocationServiceWrapper.LocationStatusCallback
            public void onSuccess() {
                LogUtils.m50243d("Geofences removed successfully.");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    LogUtils.m50243d("Geofence removed with ID = " + ((String) it.next()));
                }
                LogUtils.m50243d("Cleaning running geofences from local storage...");
                GeofenceManagerImpl.this.stateManager.removeRunningGeofences(str, list);
                GeofenceManager.GeofenceStatusCallback geofenceStatusCallback2 = geofenceStatusCallback;
                if (geofenceStatusCallback2 != null) {
                    geofenceStatusCallback2.onSuccess();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGroupAndSuccessEvent(String str, GeofenceManager.GeofenceStatusCallback geofenceStatusCallback) {
        this.stateManager.removeGroup(str);
        if (geofenceStatusCallback != null) {
            geofenceStatusCallback.onSuccess();
        }
    }

    @Override // com.disney.wdpro.geofence.GeofenceManager
    public void cascadeEnterGeofence(final String str, final String str2, final GeofenceManager.GeofenceStatusCallback geofenceStatusCallback) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            LogUtils.m50243d("GroupId and currentGeofenceId must be provided.");
            geofenceStatusCallback.onError();
            return;
        }
        this.stateManager.registerOnEnterAction(str, str2);
        List<GeofenceWrapper> siblings = this.stateManager.getSiblings(str, str2);
        if (CollectionUtils.isNullOrEmpty(siblings)) {
            createChildrenGeofences(str, str2, geofenceStatusCallback);
        } else {
            removeGeofences(str, siblings, new GeofenceManager.GeofenceStatusCallback() { // from class: com.disney.wdpro.geofence.GeofenceManagerImpl.6
                @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
                public void onError() {
                    GeofenceManager.GeofenceStatusCallback geofenceStatusCallback2 = geofenceStatusCallback;
                    if (geofenceStatusCallback2 != null) {
                        geofenceStatusCallback2.onError();
                    }
                }

                @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
                public void onSuccess() {
                    GeofenceManagerImpl.this.createChildrenGeofences(str, str2, geofenceStatusCallback);
                }
            });
        }
    }

    @Override // com.disney.wdpro.geofence.GeofenceManager
    public void cascadeExitGeofence(final String str, final String str2, final GeofenceManager.GeofenceStatusCallback geofenceStatusCallback) {
        if (C22466q.m68722b(str) || C22466q.m68722b(str2)) {
            LogUtils.m50243d("GroupId and currentGeofenceId must be provided.");
            geofenceStatusCallback.onError();
        } else {
            if (!this.stateManager.isPresentOnTrackingEnterList(str, str2)) {
                geofenceStatusCallback.onSuccess();
                return;
            }
            List<String> geofencesToRemoveOnExitAction = getGeofencesToRemoveOnExitAction(str, str2);
            if (CollectionUtils.isNullOrEmpty(geofencesToRemoveOnExitAction)) {
                createSiblingsGeofences(str, str2, geofenceStatusCallback);
            } else {
                removeAllGeofencesWithInternalId(str, geofencesToRemoveOnExitAction, new GeofenceManager.GeofenceStatusCallback() { // from class: com.disney.wdpro.geofence.GeofenceManagerImpl.7
                    @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
                    public void onError() {
                        GeofenceManager.GeofenceStatusCallback geofenceStatusCallback2 = geofenceStatusCallback;
                        if (geofenceStatusCallback2 != null) {
                            geofenceStatusCallback2.onError();
                        }
                    }

                    @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
                    public void onSuccess() {
                        GeofenceManagerImpl.this.createSiblingsGeofences(str, str2, geofenceStatusCallback);
                    }
                });
            }
        }
    }

    @Override // com.disney.wdpro.geofence.GeofenceManager
    public GeofenceWrapper getGeofenceByInternalId(String str) {
        return this.stateManager.getGeofenceByInternalId(str);
    }

    @Override // com.disney.wdpro.geofence.GeofenceManager
    public void registerGeofences(String str, List<GeofenceWrapper> list, final GeofenceManager.GeofenceStatusCallback geofenceStatusCallback) {
        if (str == null || str.isEmpty()) {
            LogUtils.m50243d("GroupId must be provided.");
            geofenceStatusCallback.onError();
            return;
        }
        if (CollectionUtils.isNullOrEmpty(list)) {
            LogUtils.m50243d("Geofences list is null or empty.");
            geofenceStatusCallback.onSuccess();
            return;
        }
        List<GeofenceWrapper> validGeofences = getValidGeofences(list);
        if (validGeofences.isEmpty()) {
            LogUtils.m50243d("No valid geofences to add in the root list. Ending process and not saving group geofences.");
            geofenceStatusCallback.onError();
            return;
        }
        List<String> runningGeofencesByGroupId = this.stateManager.getRunningGeofencesByGroupId(str);
        if (!CollectionUtils.isNullOrEmpty(runningGeofencesByGroupId)) {
            this.locationService.removeGeofences(runningGeofencesByGroupId, new LocationServiceWrapper.LocationStatusCallback() { // from class: com.disney.wdpro.geofence.GeofenceManagerImpl.1
                @Override // com.disney.wdpro.geofence.location.LocationServiceWrapper.LocationStatusCallback
                public void onError() {
                    LogUtils.m50244e("There was an error removing the running geofences.");
                }

                @Override // com.disney.wdpro.geofence.location.LocationServiceWrapper.LocationStatusCallback
                public void onSuccess() {
                    LogUtils.m50243d("Running Geofences were removed successfully from Play Services.");
                }
            });
        }
        this.stateManager.saveGeofencesByGroup(str, list);
        this.geofenceCrashHelper.recordGeofenceManagerRegisterGeofencesEvent(str, runningGeofencesByGroupId, getInternalIds(list), getInternalIds(validGeofences));
        createGeofences(str, validGeofences, new GeofenceManager.GeofenceStatusCallback() { // from class: com.disney.wdpro.geofence.GeofenceManagerImpl.2
            @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
            public void onError() {
                GeofenceManager.GeofenceStatusCallback geofenceStatusCallback2 = geofenceStatusCallback;
                if (geofenceStatusCallback2 != null) {
                    geofenceStatusCallback2.onError();
                }
            }

            @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
            public void onSuccess() {
                GeofenceManager.GeofenceStatusCallback geofenceStatusCallback2 = geofenceStatusCallback;
                if (geofenceStatusCallback2 != null) {
                    geofenceStatusCallback2.onSuccess();
                }
            }
        });
    }

    @Override // com.disney.wdpro.geofence.GeofenceManager
    public void removeGeofences(String str, List<GeofenceWrapper> list, GeofenceManager.GeofenceStatusCallback geofenceStatusCallback) {
        if (str == null || str.isEmpty()) {
            LogUtils.m50243d("GroupId must be provided.");
            geofenceStatusCallback.onError();
        } else if (!CollectionUtils.isNullOrEmpty(list)) {
            removeAllGeofencesWithInternalId(str, getInternalIds(list), geofenceStatusCallback);
        } else {
            LogUtils.m50243d("Geofences list is null or empty.");
            geofenceStatusCallback.onSuccess();
        }
    }

    @Override // com.disney.wdpro.geofence.GeofenceManager
    public void removeRunningGeofencesAndDeleteGroup(final String str, final GeofenceManager.GeofenceStatusCallback geofenceStatusCallback) {
        if (str == null || str.isEmpty()) {
            LogUtils.m50243d("GroupId must be provided.");
            geofenceStatusCallback.onError();
            return;
        }
        List<String> runningGeofencesByGroupId = this.stateManager.getRunningGeofencesByGroupId(str);
        this.geofenceCrashHelper.recordGeofenceManagerRemoveGeofencesEvent(str, runningGeofencesByGroupId);
        if (!CollectionUtils.isNullOrEmpty(runningGeofencesByGroupId)) {
            removeAllGeofencesWithInternalId(str, runningGeofencesByGroupId, new GeofenceManager.GeofenceStatusCallback() { // from class: com.disney.wdpro.geofence.GeofenceManagerImpl.4
                @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
                public void onError() {
                    LogUtils.m50243d("There was a problem removing running geofences. Not removing group ID = " + str);
                    GeofenceManager.GeofenceStatusCallback geofenceStatusCallback2 = geofenceStatusCallback;
                    if (geofenceStatusCallback2 != null) {
                        geofenceStatusCallback2.onError();
                    }
                }

                @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
                public void onSuccess() {
                    LogUtils.m50243d("Removing Group ID = " + str);
                    GeofenceManagerImpl.this.removeGroupAndSuccessEvent(str, geofenceStatusCallback);
                }
            });
        } else {
            LogUtils.m50243d("No running geofences to remove");
            removeGroupAndSuccessEvent(str, geofenceStatusCallback);
        }
    }

    @Override // com.disney.wdpro.geofence.GeofenceManager
    public void restoreSavedGeofences() {
        Map<String, List<GeofenceWrapper>> topGeofencesFromAllGroups = this.stateManager.getTopGeofencesFromAllGroups();
        if (CollectionUtils.isNullOrEmpty(topGeofencesFromAllGroups)) {
            LogUtils.m50243d("No geofences stored to restore.");
            return;
        }
        for (final Map.Entry<String, List<GeofenceWrapper>> entry : topGeofencesFromAllGroups.entrySet()) {
            registerGeofences(entry.getKey(), entry.getValue(), new GeofenceManager.GeofenceStatusCallback() { // from class: com.disney.wdpro.geofence.GeofenceManagerImpl.8
                @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
                public void onError() {
                    LogUtils.m50243d("There was an error restoring geofences for GroupId: " + ((String) entry.getKey()));
                }

                @Override // com.disney.wdpro.geofence.GeofenceManager.GeofenceStatusCallback
                public void onSuccess() {
                    LogUtils.m50243d("Geofences Restored successfully for GroupId: " + ((String) entry.getKey()));
                }
            });
        }
    }
}