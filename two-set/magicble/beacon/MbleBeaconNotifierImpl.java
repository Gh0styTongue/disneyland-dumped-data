package com.disney.wdpro.magicble.beacon;

import android.content.Context;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconMonitor;
import com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconRegion;
import com.disney.wdpro.magicble.beacon.detector.MbleBeaconDetector;
import com.disney.wdpro.magicble.beacon.helper.MbleBeaconAdvertisingHelper;
import com.disney.wdpro.magicble.utils.MbleUtils;
import com.disney.wdpro.service.business.APIConstants;
import com.newrelic.agent.android.agentdata.HexAttribute;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m92038d2 = {"Lcom/disney/wdpro/magicble/beacon/MbleBeaconNotifierImpl;", "Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconMonitor$BeaconMonitorNotifier;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authenticationManager", "Lcom/disney/wdpro/magicble/beacon/detector/MbleBeaconDetector;", "beaconDetector", "Lcom/disney/wdpro/magicble/beacon/helper/MbleBeaconAdvertisingHelper;", "beaconAdvertisingHelper", "Lcom/disney/wdpro/commons/r;", "time", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;Lcom/disney/wdpro/magicble/beacon/detector/MbleBeaconDetector;Lcom/disney/wdpro/magicble/beacon/helper/MbleBeaconAdvertisingHelper;Lcom/disney/wdpro/commons/r;)V", "", "performAction", "()V", "", HexAttribute.HEX_ATTR_METHOD_NAME, "Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconRegion;", APIConstants.UrlParams.REGION, "log", "(Ljava/lang/String;Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconRegion;)V", "beaconRegion", "beaconDetected", "(Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconRegion;)V", "beaconNotDetected", "Landroid/content/Context;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "Lcom/disney/wdpro/magicble/beacon/detector/MbleBeaconDetector;", "Lcom/disney/wdpro/magicble/beacon/helper/MbleBeaconAdvertisingHelper;", "Lcom/disney/wdpro/commons/r;", "", "monitoredBeaconRegions", "Ljava/util/List;", "getMonitoredBeaconRegions", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "name", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleBeaconNotifierImpl implements MaBeaconMonitor.BeaconMonitorNotifier {
    private final AuthenticationManager authenticationManager;
    private final MbleBeaconAdvertisingHelper beaconAdvertisingHelper;
    private final MbleBeaconDetector beaconDetector;
    private final Context context;
    private final List<MaBeaconRegion> monitoredBeaconRegions;
    private final C9350r time;

    @Inject
    public MbleBeaconNotifierImpl(Context context, AuthenticationManager authenticationManager, MbleBeaconDetector beaconDetector, MbleBeaconAdvertisingHelper beaconAdvertisingHelper, C9350r time) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authenticationManager, "authenticationManager");
        Intrinsics.checkNotNullParameter(beaconDetector, "beaconDetector");
        Intrinsics.checkNotNullParameter(beaconAdvertisingHelper, "beaconAdvertisingHelper");
        Intrinsics.checkNotNullParameter(time, "time");
        this.context = context;
        this.authenticationManager = authenticationManager;
        this.beaconDetector = beaconDetector;
        this.beaconAdvertisingHelper = beaconAdvertisingHelper;
        this.time = time;
        this.monitoredBeaconRegions = new ArrayList();
    }

    private final void log(String methodName, MaBeaconRegion region) {
        region.getUniqueIdentifier();
    }

    private final void performAction() {
        if (!this.beaconAdvertisingHelper.isAdvertisingDisabledInCastArea(this.time.m39090h().getTimeInMillis()) && MbleUtils.INSTANCE.isUserOptIn(this.context, this.authenticationManager)) {
            this.beaconAdvertisingHelper.startAdvertising();
        }
    }

    @Override // com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconMonitor.BeaconMonitorNotifier
    public void beaconDetected(MaBeaconRegion beaconRegion) {
        Intrinsics.checkNotNullParameter(beaconRegion, "beaconRegion");
        if (this.beaconDetector.checkNewBeacon(beaconRegion)) {
            log("beaconDetected", beaconRegion);
            performAction();
        }
    }

    @Override // com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconMonitor.BeaconMonitorNotifier
    public void beaconNotDetected(MaBeaconRegion beaconRegion) {
        Intrinsics.checkNotNullParameter(beaconRegion, "beaconRegion");
        log("beaconNotDetected", beaconRegion);
        performAction();
    }

    @Override // com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconMonitor.BeaconMonitorNotifier
    public List<MaBeaconRegion> getMonitoredBeaconRegions() {
        return this.monitoredBeaconRegions;
    }

    @Override // com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconMonitor.BeaconMonitorNotifier
    public String getName() {
        return "MBLE_BEACON_NOTIFIER";
    }
}