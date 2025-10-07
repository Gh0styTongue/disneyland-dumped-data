package com.disney.wdpro.mblecore.manager;

import com.disney.wdpro.mblecore.events.MbleBaseEvent;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fJ\u0019\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH&J\u0019\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "", "fetchTokens", "", OrionDeepLinkConstants.REQUEST_CODE_KEY, "", "(Ljava/lang/Integer;)V", "isValidTokensAvailable", "", "startAdvertising", "stopAdvertising", "turnOff", "turnOn", "MbleStartAdvertisingEvent", "MbleStopAdvertisingEvent", "MbleTokenFetchEvent", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public interface MbleCoreManager {

    @Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/manager/MbleCoreManager$MbleStartAdvertisingEvent;", "Lcom/disney/wdpro/mblecore/events/MbleBaseEvent;", "()V", "advertisingErrorCode", "", "getAdvertisingErrorCode", "()Ljava/lang/Integer;", "setAdvertisingErrorCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class MbleStartAdvertisingEvent extends MbleBaseEvent {
        private Integer advertisingErrorCode;
        private String errorMessage;

        public final Integer getAdvertisingErrorCode() {
            return this.advertisingErrorCode;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final void setAdvertisingErrorCode(Integer num) {
            this.advertisingErrorCode = num;
        }

        public final void setErrorMessage(String str) {
            this.errorMessage = str;
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/manager/MbleCoreManager$MbleStopAdvertisingEvent;", "Lcom/disney/wdpro/mblecore/events/MbleBaseEvent;", "()V", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class MbleStopAdvertisingEvent extends MbleBaseEvent {
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/manager/MbleCoreManager$MbleTokenFetchEvent;", "Lcom/disney/wdpro/mblecore/events/MbleBaseEvent;", "()V", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class MbleTokenFetchEvent extends MbleBaseEvent {
    }

    static /* synthetic */ void fetchTokens$default(MbleCoreManager mbleCoreManager, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchTokens");
        }
        if ((i10 & 1) != 0) {
            num = -1;
        }
        mbleCoreManager.fetchTokens(num);
    }

    static /* synthetic */ void startAdvertising$default(MbleCoreManager mbleCoreManager, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startAdvertising");
        }
        if ((i10 & 1) != 0) {
            num = -1;
        }
        mbleCoreManager.startAdvertising(num);
    }

    static /* synthetic */ void stopAdvertising$default(MbleCoreManager mbleCoreManager, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopAdvertising");
        }
        if ((i10 & 1) != 0) {
            num = -1;
        }
        mbleCoreManager.stopAdvertising(num);
    }

    static /* synthetic */ void turnOff$default(MbleCoreManager mbleCoreManager, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: turnOff");
        }
        if ((i10 & 1) != 0) {
            num = -1;
        }
        mbleCoreManager.turnOff(num);
    }

    static /* synthetic */ void turnOn$default(MbleCoreManager mbleCoreManager, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: turnOn");
        }
        if ((i10 & 1) != 0) {
            num = -1;
        }
        mbleCoreManager.turnOn(num);
    }

    void fetchTokens(Integer requestCode);

    boolean isValidTokensAvailable();

    void startAdvertising(Integer requestCode);

    void stopAdvertising(Integer requestCode);

    void turnOff(Integer requestCode);

    void turnOn(Integer requestCode);
}