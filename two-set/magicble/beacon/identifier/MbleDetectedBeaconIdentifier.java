package com.disney.wdpro.magicble.beacon.identifier;

import com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconRegion;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.InterfaceC22529c;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/magicble/beacon/identifier/MbleDetectedBeaconIdentifier;", "Lcom/disney/wdpro/magicble/beacon/identifier/MbleIdentifier;", "<init>", "()V", "Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconRegion;", "beacon", "", "isNewBeaconDetected", "(Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconRegion;)Z", "", "addBeaconToCache", "(Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconRegion;)V", "isNewBeacon", "", "cacheExpiration", "J", "Lcom/google/common/cache/c;", "", "beaconCache", "Lcom/google/common/cache/c;", "Companion", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleDetectedBeaconIdentifier implements MbleIdentifier {
    private static final long ADDITIONAL_TIME_CACHE = 10000;
    private final InterfaceC22529c<String, MaBeaconRegion> beaconCache;
    private final long cacheExpiration = 10000;

    @Inject
    public MbleDetectedBeaconIdentifier() {
        InterfaceC22529c interfaceC22529cM68757a = CacheBuilder.m68739C().m68760f(10000 + 10000, TimeUnit.MILLISECONDS).m68757a();
        Intrinsics.checkNotNullExpressionValue(interfaceC22529cM68757a, "newBuilder()\n        // …SECONDS)\n        .build()");
        this.beaconCache = interfaceC22529cM68757a;
    }

    private final void addBeaconToCache(MaBeaconRegion beacon) {
        this.beaconCache.put(beacon.getUniqueIdentifier(), beacon);
    }

    private final boolean isNewBeaconDetected(MaBeaconRegion beacon) {
        return this.beaconCache.getIfPresent(beacon.getUniqueIdentifier()) == null;
    }

    @Override // com.disney.wdpro.magicble.beacon.identifier.MbleIdentifier
    public boolean isNewBeacon(MaBeaconRegion beacon) {
        Intrinsics.checkNotNullParameter(beacon, "beacon");
        if (!isNewBeaconDetected(beacon)) {
            return false;
        }
        addBeaconToCache(beacon);
        return true;
    }
}