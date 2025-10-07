package com.disney.wdpro.magicble.beacon.detector;

import android.content.Context;
import com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconRegion;
import com.disney.wdpro.magicble.beacon.helper.MbleBeaconAdvertisingHelper;
import com.disney.wdpro.magicble.beacon.identifier.MbleCastBeaconIdentifier;
import com.disney.wdpro.magicble.beacon.identifier.MbleDetectedBeaconIdentifier;
import com.disney.wdpro.magicble.services.MbleStartAdvertScheduler;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/magicble/beacon/detector/MbleBeaconDetector;", "", "context", "Landroid/content/Context;", "beaconAdvertisingHelper", "Lcom/disney/wdpro/magicble/beacon/helper/MbleBeaconAdvertisingHelper;", "detectedBeaconIdentifier", "Lcom/disney/wdpro/magicble/beacon/identifier/MbleDetectedBeaconIdentifier;", "castBeaconIdentifier", "Lcom/disney/wdpro/magicble/beacon/identifier/MbleCastBeaconIdentifier;", "(Landroid/content/Context;Lcom/disney/wdpro/magicble/beacon/helper/MbleBeaconAdvertisingHelper;Lcom/disney/wdpro/magicble/beacon/identifier/MbleDetectedBeaconIdentifier;Lcom/disney/wdpro/magicble/beacon/identifier/MbleCastBeaconIdentifier;)V", "checkForCastBeacons", "", "newBeacon", "Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconRegion;", "checkNewBeacon", "", "detectedBeacon", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleBeaconDetector {
    private final MbleBeaconAdvertisingHelper beaconAdvertisingHelper;
    private final MbleCastBeaconIdentifier castBeaconIdentifier;
    private final Context context;
    private final MbleDetectedBeaconIdentifier detectedBeaconIdentifier;

    @Inject
    public MbleBeaconDetector(Context context, MbleBeaconAdvertisingHelper beaconAdvertisingHelper, MbleDetectedBeaconIdentifier detectedBeaconIdentifier, MbleCastBeaconIdentifier castBeaconIdentifier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(beaconAdvertisingHelper, "beaconAdvertisingHelper");
        Intrinsics.checkNotNullParameter(detectedBeaconIdentifier, "detectedBeaconIdentifier");
        Intrinsics.checkNotNullParameter(castBeaconIdentifier, "castBeaconIdentifier");
        this.context = context;
        this.beaconAdvertisingHelper = beaconAdvertisingHelper;
        this.detectedBeaconIdentifier = detectedBeaconIdentifier;
        this.castBeaconIdentifier = castBeaconIdentifier;
    }

    private final void checkForCastBeacons(MaBeaconRegion newBeacon) {
        if (this.castBeaconIdentifier.isNewBeacon(newBeacon)) {
            newBeacon.getUniqueIdentifier();
            this.beaconAdvertisingHelper.updateCastAreaLastScanTimestamp();
            this.beaconAdvertisingHelper.stopAdvertising();
            MbleStartAdvertScheduler.Companion companion = MbleStartAdvertScheduler.INSTANCE;
            companion.cancel(this.context);
            companion.schedule(this.context, this.beaconAdvertisingHelper.getDisableAdvertisingHoursMillis());
        }
    }

    public final boolean checkNewBeacon(MaBeaconRegion detectedBeacon) {
        Intrinsics.checkNotNullParameter(detectedBeacon, "detectedBeacon");
        if (!this.detectedBeaconIdentifier.isNewBeacon(detectedBeacon)) {
            return false;
        }
        checkForCastBeacons(detectedBeacon);
        return true;
    }
}