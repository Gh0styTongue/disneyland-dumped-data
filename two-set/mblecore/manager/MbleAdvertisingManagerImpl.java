package com.disney.wdpro.mblecore.manager;

import android.annotation.SuppressLint;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import android.content.Context;
import com.disney.wdpro.commons.AbstractC9344n;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import com.disney.wdpro.mblecore.common.MbleCoreToggles;
import com.disney.wdpro.mblecore.common.MbleErrorCode;
import com.disney.wdpro.mblecore.common.MbleUserInfo;
import com.disney.wdpro.mblecore.data.MbleTokenManager;
import com.disney.wdpro.mblecore.data.manager.MbleDataManager;
import com.disney.wdpro.mblecore.events.MbleEventPoster;
import com.disney.wdpro.mblecore.manager.MbleCoreManager;
import com.disney.wdpro.mblecore.services.MbleAdvertisingScheduler;
import com.disney.wdpro.mblecore.utils.AdvertisementUtils;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.C30994d;
import org.altbeacon.beacon.Identifier;

@Singleton
@Metadata(m92037d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 V2\u00020\u0001:\u0002VWBA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u0017\u0010%\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010*J!\u0010.\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010+\u001a\u00020\u0012H\u0001¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u0010*J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\u001200H\u0016¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010J\u001a\n I*\u0004\u0018\u00010H0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u00060OR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManagerImpl;", "Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManager;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager;", "mbleDataManager", "Lcom/disney/wdpro/mblecore/data/MbleTokenManager;", "mbleTokenManager", "Lcom/disney/wdpro/mblecore/common/MbleUserInfo;", "mbleUserInfo", "Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;", "mbleCoreToggles", "Lcom/disney/wdpro/mblecore/events/MbleEventPoster;", "mbleEventPoster", "Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "mbleCoreLogger", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager;Lcom/disney/wdpro/mblecore/data/MbleTokenManager;Lcom/disney/wdpro/mblecore/common/MbleUserInfo;Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;Lcom/disney/wdpro/mblecore/events/MbleEventPoster;Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;)V", "", "checkTokenValidityOrRefresh", "()Z", "", OrionDeepLinkConstants.REQUEST_CODE_KEY, "errorCode", "", "sendStartAdvertisingErrorEvent", "(Ljava/lang/Integer;I)V", "startChangeTokenScheduler", "()V", "stopChangeTokenScheduler", "stopTransmitter", "Lorg/altbeacon/beacon/Beacon;", "buildBeacon", "()Lorg/altbeacon/beacon/Beacon;", "resetStartAdvertisingRequestCode", "", "message", "showLog", "(Ljava/lang/String;)V", "isValidUser", "(I)Z", "startAdvertising", "(I)V", "forcePickNewToken", "advertiseToken$magic_ble_core_lib_release", "(IZ)V", "advertiseToken", "stopAdvertising", "Lcom/disney/wdpro/commons/n;", "updateAdvertising", "()Lcom/disney/wdpro/commons/n;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager;", "getMbleDataManager", "()Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager;", "Lcom/disney/wdpro/mblecore/data/MbleTokenManager;", "getMbleTokenManager", "()Lcom/disney/wdpro/mblecore/data/MbleTokenManager;", "Lcom/disney/wdpro/mblecore/common/MbleUserInfo;", "getMbleUserInfo", "()Lcom/disney/wdpro/mblecore/common/MbleUserInfo;", "Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;", "getMbleCoreToggles", "()Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;", "Lcom/disney/wdpro/mblecore/events/MbleEventPoster;", "getMbleEventPoster", "()Lcom/disney/wdpro/mblecore/events/MbleEventPoster;", "Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "getMbleCoreLogger", "()Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "Lorg/altbeacon/beacon/BeaconParser;", "kotlin.jvm.PlatformType", "parser", "Lorg/altbeacon/beacon/BeaconParser;", "Lorg/altbeacon/beacon/d;", "transmitter", "Lorg/altbeacon/beacon/d;", "Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManagerImpl$MbleAdvertiseCallback;", "advertiseCallback", "Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManagerImpl$MbleAdvertiseCallback;", "isAdvertising", "Z", "startAdvertisingRequestCode", "I", "Companion", "MbleAdvertiseCallback", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final class MbleAdvertisingManagerImpl implements MbleAdvertisingManager {
    public static final String ADVERTISE_BEACON_LAYOUT = "m:2-3=0F11,i:2-4,i:5-19,p:20-20";
    public static final int ADVERTISE_DISNEY_MANUFACTURER = 387;
    private final MbleAdvertiseCallback advertiseCallback;
    private final Context context;
    private boolean isAdvertising;
    private final MbleCoreLogger mbleCoreLogger;
    private final MbleCoreToggles mbleCoreToggles;
    private final MbleDataManager mbleDataManager;
    private final MbleEventPoster mbleEventPoster;
    private final MbleTokenManager mbleTokenManager;
    private final MbleUserInfo mbleUserInfo;
    private final BeaconParser parser;
    private int startAdvertisingRequestCode;
    private C30994d transmitter;

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManagerImpl$MbleAdvertiseCallback;", "Landroid/bluetooth/le/AdvertiseCallback;", "(Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManagerImpl;)V", "onStartFailure", "", "errorCode", "", "onStartSuccess", "settingsInEffect", "Landroid/bluetooth/le/AdvertiseSettings;", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    private final class MbleAdvertiseCallback extends AdvertiseCallback {
        public MbleAdvertiseCallback() {
        }

        @Override // android.bluetooth.le.AdvertiseCallback
        public void onStartFailure(int errorCode) {
            super.onStartFailure(errorCode);
            MbleAdvertisingManagerImpl.this.showLog("Advertising failed " + errorCode);
            MbleCoreManager.MbleStartAdvertisingEvent mbleStartAdvertisingEvent = new MbleCoreManager.MbleStartAdvertisingEvent();
            mbleStartAdvertisingEvent.setErrorCode(Integer.valueOf(MbleErrorCode.INSTANCE.getMBLE_ADVERTISING_FAILED_ERROR()));
            mbleStartAdvertisingEvent.setAdvertisingErrorCode(Integer.valueOf(errorCode));
            mbleStartAdvertisingEvent.setRequestCode(Integer.valueOf(MbleAdvertisingManagerImpl.this.startAdvertisingRequestCode));
            MbleAdvertisingManagerImpl.this.getMbleEventPoster().postEvent(mbleStartAdvertisingEvent);
            MbleAdvertisingManagerImpl.this.resetStartAdvertisingRequestCode();
        }

        @Override // android.bluetooth.le.AdvertiseCallback
        public void onStartSuccess(AdvertiseSettings settingsInEffect) {
            MbleAdvertisingManagerImpl.this.showLog("Advertising successfully started");
            MbleCoreManager.MbleStartAdvertisingEvent mbleStartAdvertisingEvent = new MbleCoreManager.MbleStartAdvertisingEvent();
            mbleStartAdvertisingEvent.setRequestCode(Integer.valueOf(MbleAdvertisingManagerImpl.this.startAdvertisingRequestCode));
            mbleStartAdvertisingEvent.setResult(true);
            MbleAdvertisingManagerImpl.this.getMbleEventPoster().postEvent(mbleStartAdvertisingEvent);
            MbleAdvertisingManagerImpl.this.resetStartAdvertisingRequestCode();
        }
    }

    @Inject
    public MbleAdvertisingManagerImpl(Context context, MbleDataManager mbleDataManager, MbleTokenManager mbleTokenManager, MbleUserInfo mbleUserInfo, MbleCoreToggles mbleCoreToggles, MbleEventPoster mbleEventPoster, MbleCoreLogger mbleCoreLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mbleDataManager, "mbleDataManager");
        Intrinsics.checkNotNullParameter(mbleTokenManager, "mbleTokenManager");
        Intrinsics.checkNotNullParameter(mbleUserInfo, "mbleUserInfo");
        Intrinsics.checkNotNullParameter(mbleCoreToggles, "mbleCoreToggles");
        Intrinsics.checkNotNullParameter(mbleEventPoster, "mbleEventPoster");
        Intrinsics.checkNotNullParameter(mbleCoreLogger, "mbleCoreLogger");
        this.context = context;
        this.mbleDataManager = mbleDataManager;
        this.mbleTokenManager = mbleTokenManager;
        this.mbleUserInfo = mbleUserInfo;
        this.mbleCoreToggles = mbleCoreToggles;
        this.mbleEventPoster = mbleEventPoster;
        this.mbleCoreLogger = mbleCoreLogger;
        this.parser = new BeaconParser().setBeaconLayout(ADVERTISE_BEACON_LAYOUT);
        this.advertiseCallback = new MbleAdvertiseCallback();
        this.startAdvertisingRequestCode = -1;
    }

    public static /* synthetic */ void advertiseToken$magic_ble_core_lib_release$default(MbleAdvertisingManagerImpl mbleAdvertisingManagerImpl, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        mbleAdvertisingManagerImpl.advertiseToken$magic_ble_core_lib_release(i10, z10);
    }

    private final Beacon buildBeacon() {
        MbleDataManager.UnusedTokenEvent randomUnusedToken = this.mbleDataManager.getRandomUnusedToken();
        this.mbleEventPoster.postEvent(randomUnusedToken);
        showLog("Build Advertise Data token response : " + randomUnusedToken.isSuccess());
        if (!randomUnusedToken.isSuccess()) {
            return null;
        }
        Identifier identifierFromLong = Identifier.fromLong(987393L, 3);
        showLog("Advertisement data idString: " + identifierFromLong);
        HashMap<String, String> payload = randomUnusedToken.getPayload();
        Intrinsics.checkNotNullExpressionValue(payload, "tokenEvent.payload");
        String strTakeLast = StringsKt.takeLast((String) MapsKt.getValue(payload, "token"), 2);
        HashMap<String, String> payload2 = randomUnusedToken.getPayload();
        Intrinsics.checkNotNullExpressionValue(payload2, "tokenEvent.payload");
        String strDropLast = StringsKt.dropLast((String) MapsKt.getValue(payload2, "token"), 2);
        showLog("Advertisement data token: " + ((Object) randomUnusedToken.getPayload().get("token")));
        showLog("Advertisement data fakePower: " + strTakeLast);
        showLog("Advertisement data payload: " + strDropLast);
        Beacon.C30985b c30985bM95483b = new Beacon.C30985b().m95485d(387).m95483b(identifierFromLong.toString());
        HashMap<String, String> payload3 = randomUnusedToken.getPayload();
        Intrinsics.checkNotNullExpressionValue(payload3, "tokenEvent.payload");
        return c30985bM95483b.m95484c((String) MapsKt.getValue(payload3, "token")).m95486e(Integer.parseInt(strTakeLast, CharsKt.checkRadix(16))).m95482a();
    }

    private final boolean checkTokenValidityOrRefresh() {
        String userSwid = this.mbleUserInfo.getUserSwid();
        if (userSwid == null) {
            userSwid = "";
        }
        if (this.mbleDataManager.isValidTokensAvailable(userSwid)) {
            return true;
        }
        if (this.mbleDataManager.isValidUser(userSwid)) {
            return this.mbleTokenManager.fetchAndStoreTokenSynchronously(userSwid).isSuccess();
        }
        return false;
    }

    private final boolean isValidUser(int requestCode) {
        String userSwid = this.mbleUserInfo.getUserSwid();
        if (userSwid != null && this.mbleDataManager.isValidUser(userSwid)) {
            return true;
        }
        sendStartAdvertisingErrorEvent(Integer.valueOf(requestCode), MbleErrorCode.INSTANCE.getMBLE_INVALID_SWID_ERROR());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetStartAdvertisingRequestCode() {
        this.startAdvertisingRequestCode = -1;
    }

    private final void sendStartAdvertisingErrorEvent(Integer requestCode, int errorCode) {
        MbleCoreManager.MbleStartAdvertisingEvent mbleStartAdvertisingEvent = new MbleCoreManager.MbleStartAdvertisingEvent();
        mbleStartAdvertisingEvent.setRequestCode(requestCode);
        mbleStartAdvertisingEvent.setErrorCode(Integer.valueOf(errorCode));
        this.mbleEventPoster.postEvent(mbleStartAdvertisingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLog(String message) {
        AdvertisementUtils.INSTANCE.showLog(message, this.mbleCoreLogger);
    }

    private final void startChangeTokenScheduler() {
        int updateTokenTimePeriodMins = this.mbleCoreToggles.getUpdateTokenTimePeriodMins();
        showLog("Update Token Time Period is " + updateTokenTimePeriodMins + ".");
        stopChangeTokenScheduler();
        if (updateTokenTimePeriodMins > 0) {
            MbleAdvertisingScheduler.INSTANCE.schedule(this.context, C9350r.m39066L(updateTokenTimePeriodMins));
        } else {
            MbleAdvertisingScheduler.Companion.schedule$default(MbleAdvertisingScheduler.INSTANCE, this.context, 0L, 2, null);
        }
    }

    private final void stopChangeTokenScheduler() {
        MbleAdvertisingScheduler.INSTANCE.cancel(this.context);
    }

    private final void stopTransmitter() {
        showLog("Stopping transmitter.");
        try {
            C30994d c30994d = this.transmitter;
            if (c30994d != null) {
                c30994d.m95585j();
            }
        } catch (Exception e10) {
            showLog("Exception while trying to stop advertising : " + e10.getMessage());
        }
    }

    @SuppressLint({"MissingPermission"})
    public final synchronized void advertiseToken$magic_ble_core_lib_release(int requestCode, boolean forcePickNewToken) {
        showLog("StartAdvertising Force pick : " + forcePickNewToken + ", ReqCode: " + requestCode + ", isAdvertising: " + this.isAdvertising);
        if (!isValidUser(requestCode)) {
            showLog("User not authenticated: stopAdvertising.");
            stopAdvertising(requestCode);
            return;
        }
        if (!AdvertisementUtils.INSTANCE.isBluetoothEnabled()) {
            showLog("Bluetooth Not Enabled: stopAdvertising");
            stopAdvertising(requestCode);
            return;
        }
        checkTokenValidityOrRefresh();
        if (forcePickNewToken) {
            startChangeTokenScheduler();
        }
        Beacon beaconBuildBeacon = buildBeacon();
        if (beaconBuildBeacon == null) {
            showLog("No new token data to advertise : " + this.isAdvertising);
            sendStartAdvertisingErrorEvent(Integer.valueOf(requestCode), MbleErrorCode.INSTANCE.getMBLE_ADVERTISING_NO_DATA_ERROR());
            return;
        }
        try {
            if (this.startAdvertisingRequestCode == -1) {
                this.startAdvertisingRequestCode = requestCode;
            }
            C30994d c30994d = new C30994d(this.context, this.parser);
            this.transmitter = c30994d;
            c30994d.m95581f(1);
            c30994d.m95582g(3);
            if (c30994d.m95580d()) {
                c30994d.m95585j();
                this.isAdvertising = false;
            }
            if (!this.isAdvertising) {
                c30994d.m95584i(beaconBuildBeacon, this.advertiseCallback);
                this.isAdvertising = true;
            }
        } catch (Exception e10) {
            showLog("Exception while trying to start advertising : " + e10.getMessage());
            sendStartAdvertisingErrorEvent(Integer.valueOf(requestCode), MbleErrorCode.INSTANCE.getMBLE_ADVERTISING_FAILED_ERROR());
            resetStartAdvertisingRequestCode();
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final MbleCoreLogger getMbleCoreLogger() {
        return this.mbleCoreLogger;
    }

    public final MbleCoreToggles getMbleCoreToggles() {
        return this.mbleCoreToggles;
    }

    public final MbleDataManager getMbleDataManager() {
        return this.mbleDataManager;
    }

    public final MbleEventPoster getMbleEventPoster() {
        return this.mbleEventPoster;
    }

    public final MbleTokenManager getMbleTokenManager() {
        return this.mbleTokenManager;
    }

    public final MbleUserInfo getMbleUserInfo() {
        return this.mbleUserInfo;
    }

    @Override // com.disney.wdpro.mblecore.manager.MbleAdvertisingManager
    public void startAdvertising(int requestCode) {
        advertiseToken$magic_ble_core_lib_release(requestCode, false);
    }

    @Override // com.disney.wdpro.mblecore.manager.MbleAdvertisingManager
    public void stopAdvertising(int requestCode) {
        showLog("Stop Advertising Callback : " + this.advertiseCallback);
        stopChangeTokenScheduler();
        stopTransmitter();
        MbleCoreManager.MbleStopAdvertisingEvent mbleStopAdvertisingEvent = new MbleCoreManager.MbleStopAdvertisingEvent();
        mbleStopAdvertisingEvent.setResult(true);
        mbleStopAdvertisingEvent.setRequestCode(Integer.valueOf(requestCode));
        this.mbleEventPoster.postEvent(mbleStopAdvertisingEvent);
        this.isAdvertising = false;
    }

    @Override // com.disney.wdpro.mblecore.manager.MbleAdvertisingManager
    public AbstractC9344n<Boolean> updateAdvertising() {
        advertiseToken$magic_ble_core_lib_release(-1, true);
        return new AbstractC9344n<Boolean>() { // from class: com.disney.wdpro.mblecore.manager.MbleAdvertisingManagerImpl.updateAdvertising.1
        };
    }
}