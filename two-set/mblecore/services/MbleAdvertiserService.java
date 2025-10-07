package com.disney.wdpro.mblecore.services;

import android.app.Service;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import com.disney.wdpro.mblecore.common.MbleCoreToggles;
import com.disney.wdpro.mblecore.manager.MbleAdvertisingManager;
import com.disney.wdpro.mblecore.p330di.MbleCoreComponentProvider;
import com.disney.wdpro.mblecore.utils.AdvertisementUtils;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0002&'B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\"\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001dH\u0002J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001dH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006("}, m92038d2 = {"Lcom/disney/wdpro/mblecore/services/MbleAdvertiserService;", "Landroid/app/Service;", "()V", "mbleAdvertisingManager", "Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManager;", "getMbleAdvertisingManager", "()Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManager;", "setMbleAdvertisingManager", "(Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManager;)V", "mbleCoreLogger", "Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "getMbleCoreLogger", "()Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "setMbleCoreLogger", "(Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;)V", "mbleCoreToggles", "Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;", "getMbleCoreToggles", "()Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;", "setMbleCoreToggles", "(Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;)V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "", "flags", "startId", "showLog", "message", "", "startAdvertising", OrionDeepLinkConstants.REQUEST_CODE_KEY, "stopAdvertising", "AdvertisingServiceState", "Companion", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes2.dex */
public final class MbleAdvertiserService extends Service {
    private static final int ADVERTISE_ACTION_START = 1;
    private static final int ADVERTISE_ACTION_STOP = 0;
    private static final String EXTRA_ADVERTISE_ACTION = "EXTRA_ADVERTISE_ACTION";
    private static final String EXTRA_REQUEST_CODE = "EXTRA_REQUEST_CODE";
    private static final String TAG = "MbleAdvertiserService";

    @Inject
    public MbleAdvertisingManager mbleAdvertisingManager;

    @Inject
    public MbleCoreLogger mbleCoreLogger;

    @Inject
    public MbleCoreToggles mbleCoreToggles;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static AdvertisingServiceState serviceState = AdvertisingServiceState.STOPPED;

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/services/MbleAdvertiserService$AdvertisingServiceState;", "", "(Ljava/lang/String;I)V", "STOPPED", "STARTED", "FAST_PING", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public enum AdvertisingServiceState {
        STOPPED,
        STARTED,
        FAST_PING
    }

    @Metadata(m92037d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/services/MbleAdvertiserService$Companion;", "", "()V", "ADVERTISE_ACTION_START", "", "ADVERTISE_ACTION_STOP", MbleAdvertiserService.EXTRA_ADVERTISE_ACTION, "", MbleAdvertiserService.EXTRA_REQUEST_CODE, "TAG", "serviceState", "Lcom/disney/wdpro/mblecore/services/MbleAdvertiserService$AdvertisingServiceState;", "getServiceState$magic_ble_core_lib_release", "()Lcom/disney/wdpro/mblecore/services/MbleAdvertiserService$AdvertisingServiceState;", "setServiceState$magic_ble_core_lib_release", "(Lcom/disney/wdpro/mblecore/services/MbleAdvertiserService$AdvertisingServiceState;)V", "startService", "", "context", "Landroid/content/Context;", "advertiseAction", OrionDeepLinkConstants.REQUEST_CODE_KEY, "(Landroid/content/Context;ILjava/lang/Integer;)V", "(Landroid/content/Context;Ljava/lang/Integer;)V", "stopService", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @Instrumented
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void startService(Context context, int advertiseAction, Integer requestCode) {
            try {
                Intent intent = new Intent(context, (Class<?>) MbleAdvertiserService.class);
                intent.putExtra(MbleAdvertiserService.EXTRA_ADVERTISE_ACTION, advertiseAction);
                if (requestCode != null) {
                    intent.putExtra(MbleAdvertiserService.EXTRA_REQUEST_CODE, requestCode.intValue());
                }
                context.startService(intent);
            } catch (Exception e10) {
                LogInstrumentation.m79024d(MbleAdvertiserService.TAG, "Could not start service due to exception: " + e10);
            }
        }

        public final AdvertisingServiceState getServiceState$magic_ble_core_lib_release() {
            return MbleAdvertiserService.serviceState;
        }

        public final void setServiceState$magic_ble_core_lib_release(AdvertisingServiceState advertisingServiceState) {
            Intrinsics.checkNotNullParameter(advertisingServiceState, "<set-?>");
            MbleAdvertiserService.serviceState = advertisingServiceState;
        }

        public final void stopService(Context context, Integer requestCode) {
            Intrinsics.checkNotNullParameter(context, "context");
            startService(context, 0, requestCode);
        }

        private Companion() {
        }

        public final void startService(Context context, Integer requestCode) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (getServiceState$magic_ble_core_lib_release() == AdvertisingServiceState.STOPPED) {
                startService(context, 1, requestCode);
            }
        }
    }

    private final void showLog(String message) {
        AdvertisementUtils.INSTANCE.showLog("MbleAdvertiserService : " + message, getMbleCoreLogger());
    }

    private final void startAdvertising(int requestCode) {
        LogInstrumentation.m79024d(TAG, "Start Advertising, requestCode: " + requestCode);
        getMbleAdvertisingManager().startAdvertising(requestCode);
    }

    private final void stopAdvertising(int requestCode) {
        LogInstrumentation.m79024d(TAG, "Stop Advertising, requestCode: " + requestCode);
        getMbleAdvertisingManager().stopAdvertising(requestCode);
    }

    public final MbleAdvertisingManager getMbleAdvertisingManager() {
        MbleAdvertisingManager mbleAdvertisingManager = this.mbleAdvertisingManager;
        if (mbleAdvertisingManager != null) {
            return mbleAdvertisingManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mbleAdvertisingManager");
        return null;
    }

    public final MbleCoreLogger getMbleCoreLogger() {
        MbleCoreLogger mbleCoreLogger = this.mbleCoreLogger;
        if (mbleCoreLogger != null) {
            return mbleCoreLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mbleCoreLogger");
        return null;
    }

    public final MbleCoreToggles getMbleCoreToggles() {
        MbleCoreToggles mbleCoreToggles = this.mbleCoreToggles;
        if (mbleCoreToggles != null) {
            return mbleCoreToggles;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mbleCoreToggles");
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        LogInstrumentation.m79024d(TAG, "onBind - this service doesn't provide binding.");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ComponentCallbacks2 application = getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.disney.wdpro.mblecore.di.MbleCoreComponentProvider");
        ((MbleCoreComponentProvider) application).getMbleCoreComponent().inject(this);
        LogInstrumentation.m79024d(TAG, "---------Creating MBLE Advert Service------------");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogInstrumentation.m79024d(TAG, "---------SERVICE DESTROY------------");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        LogInstrumentation.m79024d(TAG, "onStartCommand intent: " + intent);
        if (intent != null) {
            int intExtra = intent.getIntExtra(EXTRA_ADVERTISE_ACTION, -1);
            int intExtra2 = intent.getIntExtra(EXTRA_REQUEST_CODE, -1);
            LogInstrumentation.m79024d(TAG, "onStartCommand advertiseAction: " + intExtra + ", requestCode: " + intExtra2);
            if (intExtra == 0) {
                if (serviceState == AdvertisingServiceState.FAST_PING) {
                    stopForeground(1);
                    stopSelf();
                }
                stopAdvertising(intExtra2);
                serviceState = AdvertisingServiceState.STOPPED;
            } else if (intExtra != 1) {
                LogInstrumentation.m79024d(TAG, "Unknown command: " + intExtra);
            } else if (serviceState == AdvertisingServiceState.STOPPED) {
                startAdvertising(intExtra2);
                serviceState = AdvertisingServiceState.STARTED;
            } else {
                LogInstrumentation.m79024d(TAG, "ACTION_START failed, serviceState is not STOPPED");
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    public final void setMbleAdvertisingManager(MbleAdvertisingManager mbleAdvertisingManager) {
        Intrinsics.checkNotNullParameter(mbleAdvertisingManager, "<set-?>");
        this.mbleAdvertisingManager = mbleAdvertisingManager;
    }

    public final void setMbleCoreLogger(MbleCoreLogger mbleCoreLogger) {
        Intrinsics.checkNotNullParameter(mbleCoreLogger, "<set-?>");
        this.mbleCoreLogger = mbleCoreLogger;
    }

    public final void setMbleCoreToggles(MbleCoreToggles mbleCoreToggles) {
        Intrinsics.checkNotNullParameter(mbleCoreToggles, "<set-?>");
        this.mbleCoreToggles = mbleCoreToggles;
    }
}