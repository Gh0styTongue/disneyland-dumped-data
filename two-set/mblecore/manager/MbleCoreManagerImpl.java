package com.disney.wdpro.mblecore.manager;

import android.content.Context;
import com.disney.wdpro.commons.AbstractC9344n;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import com.disney.wdpro.mblecore.common.MbleErrorCode;
import com.disney.wdpro.mblecore.common.MbleUserInfo;
import com.disney.wdpro.mblecore.data.MbleTokenManager;
import com.disney.wdpro.mblecore.data.manager.MbleDataManager;
import com.disney.wdpro.mblecore.events.MbleBaseEvent;
import com.disney.wdpro.mblecore.events.MbleEventPoster;
import com.disney.wdpro.mblecore.manager.MbleCoreManager;
import com.disney.wdpro.mblecore.services.MbleAdvertiserService;
import com.disney.wdpro.mblecore.utils.AdvertisementUtils;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import com.squareup.otto.StickyEventBus;
import com.squareup.otto.Subscribe;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001f\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u0018J7\u0010!\u001a\u00020\u00162\u0012\b\u0002\u0010\u001f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001e\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b'\u0010\u0018J\u0019\u0010(\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b(\u0010\u0018J\u0019\u0010)\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b)\u0010\u0018J\u0019\u0010*\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b*\u0010\u0018J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b.\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u00107R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010)\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/manager/MbleCoreManagerImpl;", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "Landroid/content/Context;", "context", "Lcom/squareup/otto/StickyEventBus;", "stickyEventBus", "Lcom/disney/wdpro/mblecore/data/MbleTokenManager;", "mbleTokenManager", "Lcom/google/gson/Gson;", "gson", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager;", "mbleDataManager", "Lcom/disney/wdpro/mblecore/events/MbleEventPoster;", "mbleEventPoster", "Lcom/disney/wdpro/mblecore/common/MbleUserInfo;", "mbleUserInfo", "Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "mbleCoreLogger", "<init>", "(Landroid/content/Context;Lcom/squareup/otto/StickyEventBus;Lcom/disney/wdpro/mblecore/data/MbleTokenManager;Lcom/google/gson/Gson;Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager;Lcom/disney/wdpro/mblecore/events/MbleEventPoster;Lcom/disney/wdpro/mblecore/common/MbleUserInfo;Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;)V", "", OrionDeepLinkConstants.REQUEST_CODE_KEY, "", "initializeModule", "(Ljava/lang/Integer;)V", "checkAndUpdateTokens", "startAdvertisingTokens", "reasonCode", "deleteDataAndStopAdvertising", "Lcom/disney/wdpro/commons/n;", "", "originalResponseEvent", "errorCode", "sendResponseEvent", "(Lcom/disney/wdpro/commons/n;ILjava/lang/Integer;)V", "Lcom/disney/wdpro/mblecore/data/MbleTokenManager$FetchAndStoreTokenEvent;", "event", "onTokenListFetchedAndStored", "(Lcom/disney/wdpro/mblecore/data/MbleTokenManager$FetchAndStoreTokenEvent;)V", "turnOn", "turnOff", "startAdvertising", "stopAdvertising", "", "isValidTokensAvailable", "()Z", "fetchTokens", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/squareup/otto/StickyEventBus;", "getStickyEventBus", "()Lcom/squareup/otto/StickyEventBus;", "Lcom/disney/wdpro/mblecore/data/MbleTokenManager;", "getMbleTokenManager", "()Lcom/disney/wdpro/mblecore/data/MbleTokenManager;", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager;", "getMbleDataManager", "()Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager;", "Lcom/disney/wdpro/mblecore/events/MbleEventPoster;", "getMbleEventPoster", "()Lcom/disney/wdpro/mblecore/events/MbleEventPoster;", "Lcom/disney/wdpro/mblecore/common/MbleUserInfo;", "getMbleUserInfo", "()Lcom/disney/wdpro/mblecore/common/MbleUserInfo;", "Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "getMbleCoreLogger", "()Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "Z", "requestCodeBeforeFetchCall", "Ljava/lang/Integer;", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes2.dex */
public final class MbleCoreManagerImpl implements MbleCoreManager {
    private final Context context;
    private final Gson gson;
    private final MbleCoreLogger mbleCoreLogger;
    private final MbleDataManager mbleDataManager;
    private final MbleEventPoster mbleEventPoster;
    private final MbleTokenManager mbleTokenManager;
    private final MbleUserInfo mbleUserInfo;
    private Integer requestCodeBeforeFetchCall;
    private boolean startAdvertising;
    private final StickyEventBus stickyEventBus;

    @Inject
    public MbleCoreManagerImpl(Context context, StickyEventBus stickyEventBus, MbleTokenManager mbleTokenManager, Gson gson, MbleDataManager mbleDataManager, MbleEventPoster mbleEventPoster, MbleUserInfo mbleUserInfo, MbleCoreLogger mbleCoreLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stickyEventBus, "stickyEventBus");
        Intrinsics.checkNotNullParameter(mbleTokenManager, "mbleTokenManager");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(mbleDataManager, "mbleDataManager");
        Intrinsics.checkNotNullParameter(mbleEventPoster, "mbleEventPoster");
        Intrinsics.checkNotNullParameter(mbleUserInfo, "mbleUserInfo");
        Intrinsics.checkNotNullParameter(mbleCoreLogger, "mbleCoreLogger");
        this.context = context;
        this.stickyEventBus = stickyEventBus;
        this.mbleTokenManager = mbleTokenManager;
        this.gson = gson;
        this.mbleDataManager = mbleDataManager;
        this.mbleEventPoster = mbleEventPoster;
        this.mbleUserInfo = mbleUserInfo;
        this.mbleCoreLogger = mbleCoreLogger;
        stickyEventBus.register(this);
    }

    private final void checkAndUpdateTokens(Integer requestCode) {
        boolean zIsValidTokensAvailable = isValidTokensAvailable();
        AdvertisementUtils.INSTANCE.showLog("Valid Tokens Avail : " + zIsValidTokensAvailable + ".", this.mbleCoreLogger);
        if (zIsValidTokensAvailable) {
            if (this.startAdvertising) {
                startAdvertisingTokens(requestCode);
            }
        } else {
            String userSwid = this.mbleUserInfo.getUserSwid();
            if (userSwid == null) {
                sendResponseEvent$default(this, null, MbleErrorCode.INSTANCE.getMBLE_INVALID_SWID_ERROR(), requestCode, 1, null);
            } else {
                this.requestCodeBeforeFetchCall = requestCode;
                this.mbleTokenManager.fetchAndStoreToken(userSwid);
            }
        }
    }

    private final void deleteDataAndStopAdvertising(Integer reasonCode) {
        this.mbleDataManager.clearTokenData();
        MbleAdvertiserService.INSTANCE.stopService(this.context, reasonCode);
    }

    private final void initializeModule(Integer requestCode) {
        AdvertisementUtils.INSTANCE.showLog("Initializing Mble Core Module.", this.mbleCoreLogger);
        checkAndUpdateTokens(requestCode);
    }

    private final void sendResponseEvent(AbstractC9344n<? extends Object> originalResponseEvent, int errorCode, Integer requestCode) {
        this.mbleEventPoster.postEvent(MbleBaseEvent.INSTANCE.fillMbleEvent(new MbleCoreManager.MbleStartAdvertisingEvent(), originalResponseEvent, Integer.valueOf(errorCode), requestCode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void sendResponseEvent$default(MbleCoreManagerImpl mbleCoreManagerImpl, AbstractC9344n abstractC9344n, int i10, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC9344n = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        mbleCoreManagerImpl.sendResponseEvent(abstractC9344n, i10, num);
    }

    private final void startAdvertisingTokens(Integer requestCode) {
        MbleAdvertiserService.INSTANCE.startService(this.context, requestCode);
    }

    @Override // com.disney.wdpro.mblecore.manager.MbleCoreManager
    public void fetchTokens(Integer requestCode) {
        this.startAdvertising = false;
        initializeModule(requestCode);
    }

    public final Context getContext() {
        return this.context;
    }

    public final Gson getGson() {
        return this.gson;
    }

    public final MbleCoreLogger getMbleCoreLogger() {
        return this.mbleCoreLogger;
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

    public final StickyEventBus getStickyEventBus() {
        return this.stickyEventBus;
    }

    @Override // com.disney.wdpro.mblecore.manager.MbleCoreManager
    public boolean isValidTokensAvailable() {
        String userSwid = this.mbleUserInfo.getUserSwid();
        if (userSwid != null) {
            return this.mbleDataManager.isValidTokensAvailable(userSwid);
        }
        sendResponseEvent$default(this, null, MbleErrorCode.INSTANCE.getMBLE_INVALID_SWID_ERROR(), null, 5, null);
        return false;
    }

    @Subscribe
    public final void onTokenListFetchedAndStored(MbleTokenManager.FetchAndStoreTokenEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        AdvertisementUtils.INSTANCE.showLog("Tokens Fetched And Store Event : " + event.isSuccess(), this.mbleCoreLogger);
        if (!event.isSuccess()) {
            Integer errorType = event.getErrorType();
            sendResponseEvent(event, errorType != null ? errorType.intValue() : MbleErrorCode.INSTANCE.getMBLE_TOKEN_NOT_SAVED_ERROR(), this.requestCodeBeforeFetchCall);
            return;
        }
        if (this.startAdvertising) {
            startAdvertisingTokens(this.requestCodeBeforeFetchCall);
        } else {
            MbleCoreManager.MbleTokenFetchEvent mbleTokenFetchEvent = new MbleCoreManager.MbleTokenFetchEvent();
            mbleTokenFetchEvent.setRequestCode(this.requestCodeBeforeFetchCall);
            mbleTokenFetchEvent.setResult((MbleCoreManager.MbleTokenFetchEvent) event.getPayload());
            this.mbleEventPoster.postEvent(mbleTokenFetchEvent);
        }
        this.requestCodeBeforeFetchCall = null;
    }

    @Override // com.disney.wdpro.mblecore.manager.MbleCoreManager
    public void startAdvertising(Integer requestCode) {
        if (!isValidTokensAvailable()) {
            sendResponseEvent$default(this, null, MbleErrorCode.INSTANCE.getMBLE_START_ADVERTISING_NOT_ALLOWED_ERROR(), requestCode, 1, null);
        } else if (AdvertisementUtils.INSTANCE.isBluetoothEnabled()) {
            startAdvertisingTokens(requestCode);
        } else {
            sendResponseEvent$default(this, null, MbleErrorCode.INSTANCE.getMBLE_BLUETOOTH_NOT_ENABLED_ERROR(), requestCode, 1, null);
        }
    }

    @Override // com.disney.wdpro.mblecore.manager.MbleCoreManager
    public void stopAdvertising(Integer requestCode) {
        MbleAdvertiserService.INSTANCE.stopService(this.context, requestCode);
    }

    @Override // com.disney.wdpro.mblecore.manager.MbleCoreManager
    public void turnOff(Integer requestCode) {
        this.startAdvertising = false;
        deleteDataAndStopAdvertising(requestCode);
    }

    @Override // com.disney.wdpro.mblecore.manager.MbleCoreManager
    public void turnOn(Integer requestCode) {
        LogInstrumentation.m79024d("MbleCoreManagerImpl", "MBLECore Turn on");
        if (!AdvertisementUtils.INSTANCE.isBluetoothEnabled()) {
            sendResponseEvent$default(this, null, MbleErrorCode.INSTANCE.getMBLE_BLUETOOTH_NOT_ENABLED_ERROR(), requestCode, 1, null);
        } else {
            this.startAdvertising = true;
            initializeModule(requestCode);
        }
    }
}