package com.disney.wdpro.magicble.beacon;

import com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconMonitor;
import com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconRegion;
import com.disney.wdpro.magicble.beacon.model.MbleBeacon;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\f\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m92038d2 = {"Lcom/disney/wdpro/magicble/beacon/MbleBeaconManagerImpl;", "Lcom/disney/wdpro/magicble/beacon/MbleBeaconManager;", "beaconMonitor", "Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconMonitor;", "beaconNotifier", "Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconMonitor$BeaconMonitorNotifier;", "(Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconMonitor;Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconMonitor$BeaconMonitorNotifier;)V", "register", "", "beaconList", "", "Lcom/disney/wdpro/magicble/beacon/model/MbleBeacon;", "unregister", "Companion", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nMbleBeaconManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MbleBeaconManagerImpl.kt\ncom/disney/wdpro/magicble/beacon/MbleBeaconManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1655#2,8:52\n1549#2:60\n1620#2,3:61\n*S KotlinDebug\n*F\n+ 1 MbleBeaconManagerImpl.kt\ncom/disney/wdpro/magicble/beacon/MbleBeaconManagerImpl\n*L\n27#1:52,8\n28#1:60\n28#1:61,3\n*E\n"})
/* loaded from: classes13.dex */
public final class MbleBeaconManagerImpl implements MbleBeaconManager {
    private static final String BEACON_NOTIFIER_ID = "MBLE_BEACON_NOTIFIER";
    private final MaBeaconMonitor beaconMonitor;
    private final MaBeaconMonitor.BeaconMonitorNotifier beaconNotifier;

    @Inject
    public MbleBeaconManagerImpl(MaBeaconMonitor beaconMonitor, MaBeaconMonitor.BeaconMonitorNotifier beaconNotifier) {
        Intrinsics.checkNotNullParameter(beaconMonitor, "beaconMonitor");
        Intrinsics.checkNotNullParameter(beaconNotifier, "beaconNotifier");
        this.beaconMonitor = beaconMonitor;
        this.beaconNotifier = beaconNotifier;
    }

    @Override // com.disney.wdpro.magicble.beacon.MbleBeaconManager
    public void register(List<MbleBeacon> beaconList) {
        Intrinsics.checkNotNullParameter(beaconList, "beaconList");
        if (beaconList.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList<MbleBeacon> arrayList = new ArrayList();
        for (Object obj : beaconList) {
            if (hashSet.add(((MbleBeacon) obj).getUuid())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (final MbleBeacon mbleBeacon : arrayList) {
            arrayList2.add(new MaBeaconRegion() { // from class: com.disney.wdpro.magicble.beacon.MbleBeaconManagerImpl$register$uniqueRegions$2$1
                @Override // com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconRegion
                public String getUniqueIdentifier() {
                    return mbleBeacon.getUuid();
                }
            });
        }
        this.beaconNotifier.getMonitoredBeaconRegions().addAll(arrayList2);
        this.beaconMonitor.mo103470registerNotifiergIAlus(BEACON_NOTIFIER_ID, this.beaconNotifier);
    }

    @Override // com.disney.wdpro.magicble.beacon.MbleBeaconManager
    public void unregister() {
        this.beaconMonitor.mo103471unregisterNotifierIoAF18A(BEACON_NOTIFIER_ID);
    }
}