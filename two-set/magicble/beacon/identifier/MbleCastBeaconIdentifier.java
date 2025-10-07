package com.disney.wdpro.magicble.beacon.identifier;

import com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconRegion;
import com.disney.wdpro.magicble.beacon.model.MbleBeacon;
import com.disney.wdpro.magicble.common.vendo.MbleVendoCastAreaConfig;
import com.disney.wdpro.magicble.common.vendo.MbleVendoConfigProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/magicble/beacon/identifier/MbleCastBeaconIdentifier;", "Lcom/disney/wdpro/magicble/beacon/identifier/MbleIdentifier;", "vendoConfigProvider", "Lcom/disney/wdpro/magicble/common/vendo/MbleVendoConfigProvider;", "(Lcom/disney/wdpro/magicble/common/vendo/MbleVendoConfigProvider;)V", "isNewBeacon", "", "beacon", "Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconRegion;", "shouldRegisterBeacons", "mbleCastAreaVendoConfig", "Lcom/disney/wdpro/magicble/common/vendo/MbleVendoCastAreaConfig;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nMbleCastBeaconIdentifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MbleCastBeaconIdentifier.kt\ncom/disney/wdpro/magicble/beacon/identifier/MbleCastBeaconIdentifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1747#2,3:28\n*S KotlinDebug\n*F\n+ 1 MbleCastBeaconIdentifier.kt\ncom/disney/wdpro/magicble/beacon/identifier/MbleCastBeaconIdentifier\n*L\n20#1:28,3\n*E\n"})
/* loaded from: classes13.dex */
public final class MbleCastBeaconIdentifier implements MbleIdentifier {
    private final MbleVendoConfigProvider vendoConfigProvider;

    @Inject
    public MbleCastBeaconIdentifier(MbleVendoConfigProvider vendoConfigProvider) {
        Intrinsics.checkNotNullParameter(vendoConfigProvider, "vendoConfigProvider");
        this.vendoConfigProvider = vendoConfigProvider;
    }

    private final boolean shouldRegisterBeacons(MbleVendoCastAreaConfig mbleCastAreaVendoConfig) {
        return (mbleCastAreaVendoConfig != null ? mbleCastAreaVendoConfig.getDisableAdvertForHours() : 0) > 0;
    }

    @Override // com.disney.wdpro.magicble.beacon.identifier.MbleIdentifier
    public boolean isNewBeacon(MaBeaconRegion beacon) {
        List<MbleBeacon> beacons;
        Intrinsics.checkNotNullParameter(beacon, "beacon");
        MbleVendoCastAreaConfig mbleVendoCastAreaConfig = this.vendoConfigProvider.getMbleVendoCastAreaConfig();
        if (!shouldRegisterBeacons(mbleVendoCastAreaConfig) || mbleVendoCastAreaConfig == null || (beacons = mbleVendoCastAreaConfig.getBeacons()) == null) {
            return false;
        }
        List<MbleBeacon> list = beacons;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((MbleBeacon) it.next()).getUuid(), beacon.getUniqueIdentifier())) {
                return false;
            }
        }
        return true;
    }
}