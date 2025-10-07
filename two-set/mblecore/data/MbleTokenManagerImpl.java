package com.disney.wdpro.mblecore.data;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.disney.wdpro.mblecore.api.VmmsManager;
import com.disney.wdpro.mblecore.api.model.VmmsTokenListResponse;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import com.disney.wdpro.mblecore.common.MbleErrorCode;
import com.disney.wdpro.mblecore.data.MbleTokenManager;
import com.disney.wdpro.mblecore.data.manager.MbleDataManager;
import com.disney.wdpro.mblecore.utils.AdvertisementUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/data/MbleTokenManagerImpl;", "Lcom/disney/wdpro/mblecore/data/MbleTokenManager;", "context", "Landroid/content/Context;", "vmmsManager", "Lcom/disney/wdpro/mblecore/api/VmmsManager;", "mbleDataManager", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager;", "mbleCoreLogger", "Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "(Landroid/content/Context;Lcom/disney/wdpro/mblecore/api/VmmsManager;Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager;Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;)V", "getContext", "()Landroid/content/Context;", "getMbleCoreLogger", "()Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "getMbleDataManager", "()Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager;", "getVmmsManager", "()Lcom/disney/wdpro/mblecore/api/VmmsManager;", "fetchAndStoreToken", "Lcom/disney/wdpro/mblecore/data/MbleTokenManager$FetchAndStoreTokenEvent;", "swid", "", "fetchAndStoreTokenSynchronously", "isNetworkAvailable", "", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final class MbleTokenManagerImpl implements MbleTokenManager {
    private final Context context;
    private final MbleCoreLogger mbleCoreLogger;
    private final MbleDataManager mbleDataManager;
    private final VmmsManager vmmsManager;

    @Inject
    public MbleTokenManagerImpl(Context context, VmmsManager vmmsManager, MbleDataManager mbleDataManager, MbleCoreLogger mbleCoreLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vmmsManager, "vmmsManager");
        Intrinsics.checkNotNullParameter(mbleDataManager, "mbleDataManager");
        Intrinsics.checkNotNullParameter(mbleCoreLogger, "mbleCoreLogger");
        this.context = context;
        this.vmmsManager = vmmsManager;
        this.mbleDataManager = mbleDataManager;
        this.mbleCoreLogger = mbleCoreLogger;
    }

    private final boolean isNetworkAvailable(Context context) {
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            AdvertisementUtils.INSTANCE.showLog("IsNetworkAvailable: Network NOT Available, No ActiveNetwork.", this.mbleCoreLogger);
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            AdvertisementUtils.INSTANCE.showLog("IsNetworkAvailable: Network NOT Available, Failed to Get Network Capabilities for Network=(" + activeNetwork + ")", this.mbleCoreLogger);
            return false;
        }
        if (networkCapabilities.hasCapability(16)) {
            return true;
        }
        AdvertisementUtils.INSTANCE.showLog("IsNetworkAvailable: Network NOT Available, NET_CAPABILITY_VALIDATED Capability Missing. Network=(" + activeNetwork + "); Capabilities=(" + networkCapabilities + ")", this.mbleCoreLogger);
        return false;
    }

    @Override // com.disney.wdpro.mblecore.data.MbleTokenManager
    public MbleTokenManager.FetchAndStoreTokenEvent fetchAndStoreToken(String swid) {
        Intrinsics.checkNotNullParameter(swid, "swid");
        return fetchAndStoreTokenSynchronously(swid);
    }

    @Override // com.disney.wdpro.mblecore.data.MbleTokenManager
    public MbleTokenManager.FetchAndStoreTokenEvent fetchAndStoreTokenSynchronously(String swid) {
        Intrinsics.checkNotNullParameter(swid, "swid");
        MbleTokenManager.FetchAndStoreTokenEvent fetchAndStoreTokenEvent = new MbleTokenManager.FetchAndStoreTokenEvent();
        if (!isNetworkAvailable(this.context)) {
            fetchAndStoreTokenEvent.setErrorType(Integer.valueOf(MbleErrorCode.INSTANCE.getMBLE_TOKEN_NOT_FETCHED_ERROR()));
            fetchAndStoreTokenEvent.setException(new Exception("Failed to fetch and store tokens due to lack of network availability"));
            AdvertisementUtils.INSTANCE.showLog("IsNetworkAvailable: Network NOT Available. Will Not FetchAndStoreToken.", this.mbleCoreLogger);
            return fetchAndStoreTokenEvent;
        }
        VmmsManager.FetchTokenEvent fetchTokenEventFetchTokenList = this.vmmsManager.fetchTokenList(swid);
        if (fetchTokenEventFetchTokenList.isSuccess()) {
            VmmsTokenListResponse payload = fetchTokenEventFetchTokenList.getPayload();
            if (payload != null) {
                if (payload.getBleIdList().isEmpty()) {
                    fetchAndStoreTokenEvent.setErrorType(Integer.valueOf(MbleErrorCode.INSTANCE.getMBLE_TOKEN_NOT_FETCHED_ERROR()));
                    fetchAndStoreTokenEvent.setException(new Exception("Failed to fetch and store tokens due to empty BLE ID List"));
                    return fetchAndStoreTokenEvent;
                }
                MbleDataManager.SaveTokenIdListEvent saveTokenIdListEventSaveTokenIdList = this.mbleDataManager.saveTokenIdList(payload.getBleIdList(), Long.valueOf(payload.getExpirationTTL()), Long.valueOf(payload.getDropTTL()), swid);
                AdvertisementUtils advertisementUtils = AdvertisementUtils.INSTANCE;
                advertisementUtils.showLog("Token List Saved : " + saveTokenIdListEventSaveTokenIdList.isSuccess(), this.mbleCoreLogger);
                if (saveTokenIdListEventSaveTokenIdList.isSuccess()) {
                    fetchAndStoreTokenEvent.setResult((MbleTokenManager.FetchAndStoreTokenEvent) MapsKt.hashMapOf(TuplesKt.m92045to("tokens", CollectionsKt.joinToString$default(payload.getBleIdList(), null, null, null, 0, null, null, 63, null)), TuplesKt.m92045to("lastFetch", this.mbleDataManager.getLastFetchPeriodInHours()), TuplesKt.m92045to("dropTTL", AdvertisementUtils.timestampToDateTime$default(advertisementUtils, payload.getDropTTL(), null, 2, null)), TuplesKt.m92045to("expirationTTL", AdvertisementUtils.timestampToDateTime$default(advertisementUtils, payload.getExpirationTTL(), null, 2, null))));
                } else {
                    fetchAndStoreTokenEvent.setErrorType(Integer.valueOf(MbleErrorCode.INSTANCE.getMBLE_TOKEN_NOT_SAVED_ERROR()));
                    Throwable throwable = saveTokenIdListEventSaveTokenIdList.getThrowable();
                    if (throwable != null) {
                        Intrinsics.checkNotNullExpressionValue(throwable, "throwable");
                        advertisementUtils.showLog("Token List Save Error : " + throwable.getMessage(), this.mbleCoreLogger);
                        fetchAndStoreTokenEvent.setException(throwable);
                    }
                }
            }
            fetchAndStoreTokenEvent.setResult(true);
            return fetchAndStoreTokenEvent;
        }
        fetchAndStoreTokenEvent.setErrorType(Integer.valueOf(MbleErrorCode.INSTANCE.getMBLE_TOKEN_NOT_FETCHED_ERROR()));
        Throwable throwable2 = fetchTokenEventFetchTokenList.getThrowable();
        if (throwable2 != null) {
            AdvertisementUtils.INSTANCE.showLog("Tokens Fetched Event Error : " + throwable2.getMessage(), this.mbleCoreLogger);
            fetchAndStoreTokenEvent.setException(throwable2);
            return fetchAndStoreTokenEvent;
        }
        return fetchAndStoreTokenEvent;
    }

    public final Context getContext() {
        return this.context;
    }

    public final MbleCoreLogger getMbleCoreLogger() {
        return this.mbleCoreLogger;
    }

    public final MbleDataManager getMbleDataManager() {
        return this.mbleDataManager;
    }

    public final VmmsManager getVmmsManager() {
        return this.vmmsManager;
    }
}