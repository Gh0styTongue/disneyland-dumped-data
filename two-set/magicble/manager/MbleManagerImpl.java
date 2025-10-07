package com.disney.wdpro.magicble.manager;

import android.content.Context;
import android.location.Location;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.monitor.C9337l;
import com.disney.wdpro.geofence.model.GeofenceWrapper;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionsMonitor;
import com.disney.wdpro.locationservices.location_regions.configuration.LocationRegionsConfiguration;
import com.disney.wdpro.magicble.beacon.MbleBeaconManager;
import com.disney.wdpro.magicble.beacon.model.MbleBeacon;
import com.disney.wdpro.magicble.common.vendo.MbleVendoBeaconConfig;
import com.disney.wdpro.magicble.common.vendo.MbleVendoCastAreaConfig;
import com.disney.wdpro.magicble.geofence.MbleGeofenceManager;
import com.disney.wdpro.magicble.services.GeofenceUpdateScheduler;
import com.disney.wdpro.magicble.settings.LocationRegionsSecretConfig;
import com.disney.wdpro.magicble.settings.MbleSecretConfig;
import com.disney.wdpro.magicble.utils.MbleUtils;
import com.disney.wdpro.magicble.utils.analytics.EventsConstantsKt;
import com.disney.wdpro.magicble.utils.analytics.MbleAnalyticsHelper;
import com.disney.wdpro.magicble.utils.analytics.MbleAnalyticsState;
import com.disney.wdpro.magicble.utils.analytics.MbleCrashHelper;
import com.disney.wdpro.magicble.utils.analytics.MbleCrashHelperErrorTypeAttr;
import com.disney.wdpro.magicble.utils.analytics.MbleEventHelper;
import com.disney.wdpro.mblecore.common.MbleErrorCode;
import com.disney.wdpro.mblecore.data.manager.MbleDataManager;
import com.disney.wdpro.mblecore.manager.MbleCoreManager;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.squareup.otto.StickyEventBus;
import com.squareup.otto.Subscribe;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C30069i0;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.C30180u0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020$H\u0002¢\u0006\u0004\b,\u0010&J\u000f\u0010-\u001a\u00020$H\u0002¢\u0006\u0004\b-\u0010&J\u000f\u0010.\u001a\u00020$H\u0002¢\u0006\u0004\b.\u0010&J\u000f\u0010/\u001a\u00020$H\u0002¢\u0006\u0004\b/\u0010&J\u000f\u00100\u001a\u00020$H\u0002¢\u0006\u0004\b0\u0010&J\u000f\u00101\u001a\u00020$H\u0002¢\u0006\u0004\b1\u0010&J\u0011\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020$H\u0002¢\u0006\u0004\b5\u0010&J\u000f\u00106\u001a\u00020$H\u0002¢\u0006\u0004\b6\u0010&J\u000f\u00107\u001a\u00020$H\u0002¢\u0006\u0004\b7\u0010&J!\u0010<\u001a\u00020$2\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020$H\u0002¢\u0006\u0004\b>\u0010&J\u000f\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020?H\u0002¢\u0006\u0004\bB\u0010AJ\u000f\u0010C\u001a\u00020?H\u0002¢\u0006\u0004\bC\u0010AJ\u000f\u0010D\u001a\u00020$H\u0016¢\u0006\u0004\bD\u0010&J\u0017\u0010G\u001a\u00020$2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020$H\u0016¢\u0006\u0004\bI\u0010&J\u0017\u0010L\u001a\u00020$2\u0006\u0010K\u001a\u00020JH\u0007¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020$2\u0006\u0010K\u001a\u00020NH\u0007¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020$2\u0006\u0010K\u001a\u00020QH\u0007¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020$2\u0006\u0010K\u001a\u00020TH\u0007¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020$2\u0006\u0010K\u001a\u00020WH\u0007¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020$2\u0006\u0010K\u001a\u00020ZH\u0007¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020$2\u0006\u0010K\u001a\u00020]H\u0007¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020$2\u0006\u0010K\u001a\u00020`H\u0007¢\u0006\u0004\ba\u0010bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010gR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010hR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010iR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010jR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010kR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010lR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010mR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010nR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010oR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010pR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010qR\u0016\u0010r\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010u\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006w"}, m92038d2 = {"Lcom/disney/wdpro/magicble/manager/MbleManagerImpl;", "Lcom/disney/wdpro/magicble/manager/MbleManager;", "Landroid/content/Context;", "context", "Lcom/squareup/otto/StickyEventBus;", "stickyEventBus", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authenticationManager", "Lcom/disney/wdpro/magicble/beacon/MbleBeaconManager;", "mbleBeaconManager", "Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;", "mbleGeofenceManager", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "mbleCoreManager", "Lcom/disney/wdpro/magicble/utils/analytics/MbleEventHelper;", "mbleEventHelper", "Lcom/disney/wdpro/magicble/utils/analytics/MbleCrashHelper;", "mbleCrashHelper", "Lcom/disney/wdpro/magicble/utils/analytics/MbleAnalyticsHelper;", "mbleAnalyticsHelper", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/google/gson/Gson;", "gson", "Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;", "mbleSecretConfig", "Lcom/disney/wdpro/magicble/settings/LocationRegionsSecretConfig;", "locationRegionsSecretConfig", "Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "mbleLocalStorageManager", "Lcom/disney/wdpro/commons/r;", "time", "Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionsMonitor;", "disneyLocationMonitor", "<init>", "(Landroid/content/Context;Lcom/squareup/otto/StickyEventBus;Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;Lcom/disney/wdpro/magicble/beacon/MbleBeaconManager;Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;Lcom/disney/wdpro/magicble/utils/analytics/MbleEventHelper;Lcom/disney/wdpro/magicble/utils/analytics/MbleCrashHelper;Lcom/disney/wdpro/magicble/utils/analytics/MbleAnalyticsHelper;Lcom/disney/wdpro/commons/config/i;Lcom/google/gson/Gson;Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;Lcom/disney/wdpro/magicble/settings/LocationRegionsSecretConfig;Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;Lcom/disney/wdpro/commons/r;Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionsMonitor;)V", "", "initializeModule", "()V", "", "Lcom/disney/wdpro/magicble/beacon/model/MbleBeacon;", "getBeaconRegions", "()Ljava/util/List;", "getCastBeaconRegions", "initGeofenceAndBeaconPostDelayed", "startAdvertisingIfInGeofenceOrOutsideFlagOn", "startAdvertisingIfNotDisabledInCastArea", "initGeofenceAndBeacon", "initGeofence", "handleSuccessLoginOrCreateAccount", "", "getGuestSwid", "()Ljava/lang/String;", "checkAndUpdateTokens", "startAdvertisingTokens", "trackInitializeMBLESuccess", "", "errorCode", "", "throwable", "trackInitializeMBLEFail", "(Ljava/lang/Integer;Ljava/lang/Throwable;)V", "deleteDataAndStopAdvertising", "", "isMagicBleFeatureEnabledAndDeviceOptIn", "()Z", "isMagicBleFeatureEnabled", "isLocationRegionsFeatureEnabled", "init", "Lcom/disney/wdpro/locationservices/location_regions/configuration/LocationRegionsConfiguration;", "locationRegionConfig", "initLocationRegions", "(Lcom/disney/wdpro/locationservices/location_regions/configuration/LocationRegionsConfiguration;)V", "startLocationTracking", "Lcom/disney/wdpro/commons/monitor/l$d;", "event", "onLocationUpdate", "(Lcom/disney/wdpro/commons/monitor/l$d;)V", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager$LoginDataEvent;", "onLogInEvent", "(Lcom/disney/wdpro/profile_ui/manager/ProfileManager$LoginDataEvent;)V", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager$CreateAccountDataEvent;", "onAccountCreatedEvent", "(Lcom/disney/wdpro/profile_ui/manager/ProfileManager$CreateAccountDataEvent;)V", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManager$MbleTokenFetchEvent;", "onTokenListFetchedAndStored", "(Lcom/disney/wdpro/mblecore/manager/MbleCoreManager$MbleTokenFetchEvent;)V", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager$LogoutDataEvent;", "onLogoutEvent", "(Lcom/disney/wdpro/profile_ui/manager/ProfileManager$LogoutDataEvent;)V", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManager$MbleStartAdvertisingEvent;", "onStartAdvertisingEvent", "(Lcom/disney/wdpro/mblecore/manager/MbleCoreManager$MbleStartAdvertisingEvent;)V", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManager$MbleStopAdvertisingEvent;", "onStopAdvertisingEvent", "(Lcom/disney/wdpro/mblecore/manager/MbleCoreManager$MbleStopAdvertisingEvent;)V", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$UnusedTokenEvent;", "pickUnusedTokenEvent", "(Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$UnusedTokenEvent;)V", "Landroid/content/Context;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "Lcom/disney/wdpro/magicble/beacon/MbleBeaconManager;", "Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "Lcom/disney/wdpro/magicble/utils/analytics/MbleEventHelper;", "Lcom/disney/wdpro/magicble/utils/analytics/MbleCrashHelper;", "Lcom/disney/wdpro/magicble/utils/analytics/MbleAnalyticsHelper;", "Lcom/disney/wdpro/commons/config/i;", "Lcom/google/gson/Gson;", "Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;", "Lcom/disney/wdpro/magicble/settings/LocationRegionsSecretConfig;", "Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "Lcom/disney/wdpro/commons/r;", "Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionsMonitor;", "isRegisteredForBeaconNotification", "Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isMbleInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
@SourceDebugExtension({"SMAP\nMbleManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MbleManagerImpl.kt\ncom/disney/wdpro/magicble/manager/MbleManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,462:1\n1549#2:463\n1620#2,3:464\n*S KotlinDebug\n*F\n+ 1 MbleManagerImpl.kt\ncom/disney/wdpro/magicble/manager/MbleManagerImpl\n*L\n135#1:463\n135#1:464,3\n*E\n"})
/* loaded from: classes13.dex */
public final class MbleManagerImpl implements MbleManager {
    private final AuthenticationManager authenticationManager;
    private final Context context;
    private final DisneyLocationRegionsMonitor disneyLocationMonitor;
    private final Gson gson;
    private AtomicBoolean isMbleInitialized;
    private boolean isRegisteredForBeaconNotification;
    private final LocationRegionsSecretConfig locationRegionsSecretConfig;
    private final MbleAnalyticsHelper mbleAnalyticsHelper;
    private final MbleBeaconManager mbleBeaconManager;
    private final MbleCoreManager mbleCoreManager;
    private final MbleCrashHelper mbleCrashHelper;
    private final MbleEventHelper mbleEventHelper;
    private final MbleGeofenceManager mbleGeofenceManager;
    private final MbleLocalStorageManager mbleLocalStorageManager;
    private final MbleSecretConfig mbleSecretConfig;
    private final C9350r time;
    private final C9248i vendomatic;

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.magicble.manager.MbleManagerImpl$initGeofenceAndBeaconPostDelayed$1", m92053f = "MbleManagerImpl.kt", m92054i = {}, m92055l = {167}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.magicble.manager.MbleManagerImpl$initGeofenceAndBeaconPostDelayed$1 */
    static final class C162731 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C162731(Continuation<? super C162731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MbleManagerImpl.this.new C162731(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.m92134b(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MbleManagerImpl.this.initGeofenceAndBeacon();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C162731) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Inject
    public MbleManagerImpl(Context context, StickyEventBus stickyEventBus, AuthenticationManager authenticationManager, MbleBeaconManager mbleBeaconManager, MbleGeofenceManager mbleGeofenceManager, MbleCoreManager mbleCoreManager, MbleEventHelper mbleEventHelper, MbleCrashHelper mbleCrashHelper, MbleAnalyticsHelper mbleAnalyticsHelper, C9248i vendomatic, Gson gson, MbleSecretConfig mbleSecretConfig, LocationRegionsSecretConfig locationRegionsSecretConfig, MbleLocalStorageManager mbleLocalStorageManager, C9350r time, DisneyLocationRegionsMonitor disneyLocationMonitor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stickyEventBus, "stickyEventBus");
        Intrinsics.checkNotNullParameter(authenticationManager, "authenticationManager");
        Intrinsics.checkNotNullParameter(mbleBeaconManager, "mbleBeaconManager");
        Intrinsics.checkNotNullParameter(mbleGeofenceManager, "mbleGeofenceManager");
        Intrinsics.checkNotNullParameter(mbleCoreManager, "mbleCoreManager");
        Intrinsics.checkNotNullParameter(mbleEventHelper, "mbleEventHelper");
        Intrinsics.checkNotNullParameter(mbleCrashHelper, "mbleCrashHelper");
        Intrinsics.checkNotNullParameter(mbleAnalyticsHelper, "mbleAnalyticsHelper");
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(mbleSecretConfig, "mbleSecretConfig");
        Intrinsics.checkNotNullParameter(locationRegionsSecretConfig, "locationRegionsSecretConfig");
        Intrinsics.checkNotNullParameter(mbleLocalStorageManager, "mbleLocalStorageManager");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(disneyLocationMonitor, "disneyLocationMonitor");
        this.context = context;
        this.authenticationManager = authenticationManager;
        this.mbleBeaconManager = mbleBeaconManager;
        this.mbleGeofenceManager = mbleGeofenceManager;
        this.mbleCoreManager = mbleCoreManager;
        this.mbleEventHelper = mbleEventHelper;
        this.mbleCrashHelper = mbleCrashHelper;
        this.mbleAnalyticsHelper = mbleAnalyticsHelper;
        this.vendomatic = vendomatic;
        this.gson = gson;
        this.mbleSecretConfig = mbleSecretConfig;
        this.locationRegionsSecretConfig = locationRegionsSecretConfig;
        this.mbleLocalStorageManager = mbleLocalStorageManager;
        this.time = time;
        this.disneyLocationMonitor = disneyLocationMonitor;
        this.isMbleInitialized = new AtomicBoolean(false);
        stickyEventBus.register(this);
    }

    private final void checkAndUpdateTokens() {
        if (isMagicBleFeatureEnabledAndDeviceOptIn()) {
            boolean zIsValidTokensAvailable = this.mbleCoreManager.isValidTokensAvailable();
            MbleUtils.INSTANCE.showLog("Valid Tokens Avail : " + zIsValidTokensAvailable + ".");
            if (zIsValidTokensAvailable) {
                startAdvertisingTokens();
            } else {
                MbleCoreManager.fetchTokens$default(this.mbleCoreManager, null, 1, null);
            }
        }
    }

    private final void deleteDataAndStopAdvertising() {
        this.mbleCoreManager.turnOff(1);
        this.mbleLocalStorageManager.clearCastAreaLastScanTimestamp();
        this.mbleLocalStorageManager.clearFastPingModeLastScanTimestamp();
    }

    private final List<MbleBeacon> getBeaconRegions() {
        List<MbleBeacon> arrayList;
        Type type = new TypeToken<List<? extends String>>() { // from class: com.disney.wdpro.magicble.manager.MbleManagerImpl$getBeaconRegions$listType$1
        }.getType();
        Collection arrayList2 = new ArrayList();
        try {
            Gson gson = this.gson;
            String strM38759i = this.vendomatic.m38759i();
            Object objFromJson = gson == null ? gson.fromJson(strM38759i, type) : GsonInstrumentation.fromJson(gson, strM38759i, type);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(vendomatic…BleBeaconUuids, listType)");
            arrayList2 = (List) objFromJson;
        } catch (JsonSyntaxException unused) {
        }
        Collection collection = arrayList2;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList3.add(new MbleBeacon((String) it.next(), 0, 0, 6, null));
        }
        List<MbleBeacon> mutableList = CollectionsKt.toMutableList((Collection) arrayList3);
        MbleVendoCastAreaConfig mbleCastAreaVendoConfig = MbleUtils.INSTANCE.parseMbleCastAreaVendoConfig(this.vendomatic, this.gson);
        if ((mbleCastAreaVendoConfig != null ? mbleCastAreaVendoConfig.getDisableAdvertForHours() : 0) > 0) {
            Iterator<MbleBeacon> it2 = getCastBeaconRegions().iterator();
            while (it2.hasNext()) {
                mutableList.add(it2.next());
            }
        }
        MbleVendoBeaconConfig mbleVendoConfig = MbleUtils.INSTANCE.parseMbleVendoConfig(this.vendomatic, this.gson);
        if ((mbleVendoConfig != null ? mbleVendoConfig.getFastPingTimePeriodMins() : 0) > 0) {
            if (mbleVendoConfig == null || (arrayList = mbleVendoConfig.getFastPingBeacons()) == null) {
                arrayList = new ArrayList<>();
            }
            Iterator<MbleBeacon> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                mutableList.add(it3.next());
            }
        }
        return mutableList;
    }

    private final List<MbleBeacon> getCastBeaconRegions() {
        List<MbleBeacon> beacons;
        MbleVendoCastAreaConfig mbleCastAreaVendoConfig = MbleUtils.INSTANCE.parseMbleCastAreaVendoConfig(this.vendomatic, this.gson);
        return (mbleCastAreaVendoConfig == null || (beacons = mbleCastAreaVendoConfig.getBeacons()) == null) ? new ArrayList() : beacons;
    }

    private final String getGuestSwid() {
        return this.authenticationManager.getUserSwid();
    }

    private final void handleSuccessLoginOrCreateAccount() {
        checkAndUpdateTokens();
        if (isMagicBleFeatureEnabled()) {
            initGeofenceAndBeaconPostDelayed();
        }
        if (isLocationRegionsFeatureEnabled()) {
            this.disneyLocationMonitor.startTracking();
        }
    }

    private final void initGeofence() {
        MbleUtils mbleUtils = MbleUtils.INSTANCE;
        if (mbleUtils.isAdvertiseOutsideGeofenceEnabled(this.vendomatic, this.mbleSecretConfig) || !mbleUtils.isLocationPermissionGranted(this.context)) {
            return;
        }
        List<GeofenceWrapper> listRegisterGeofences = this.mbleGeofenceManager.registerGeofences();
        if (listRegisterGeofences.isEmpty()) {
            return;
        }
        mbleUtils.showLog(" geofence list " + listRegisterGeofences.size());
        GeofenceUpdateScheduler.Companion.schedule$default(GeofenceUpdateScheduler.INSTANCE, this.context, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initGeofenceAndBeacon() {
        MbleUtils mbleUtils = MbleUtils.INSTANCE;
        if (mbleUtils.isLocationPermissionGranted(this.context)) {
            initGeofence();
            mbleUtils.showLog("RegisteredForBeaconNotification : " + this.isRegisteredForBeaconNotification + ".");
            if (!this.vendomatic.m38691I0()) {
                mbleUtils.showLog("Init Geofence And Beacon : Unregister beacon.");
                this.mbleBeaconManager.unregister();
                this.isRegisteredForBeaconNotification = false;
            } else {
                if (this.isRegisteredForBeaconNotification) {
                    return;
                }
                List<MbleBeacon> beaconRegions = getBeaconRegions();
                mbleUtils.showLog("Register Beacon. List size : " + beaconRegions.size() + ".");
                if (beaconRegions.isEmpty()) {
                    return;
                }
                this.mbleBeaconManager.register(beaconRegions);
                this.isRegisteredForBeaconNotification = true;
            }
        }
    }

    private final void initGeofenceAndBeaconPostDelayed() {
        C30113j.m92948d(C30069i0.m92780a(C30180u0.m93206a()), null, null, new C162731(null), 3, null);
    }

    private final void initializeModule() {
        MbleUtils.INSTANCE.showLog("Initializing Module, user authenticated.");
        checkAndUpdateTokens();
        initGeofenceAndBeaconPostDelayed();
    }

    private final boolean isLocationRegionsFeatureEnabled() {
        return MbleUtils.INSTANCE.isLocationServicesEnabled(this.vendomatic, this.locationRegionsSecretConfig);
    }

    private final boolean isMagicBleFeatureEnabled() {
        return MbleUtils.INSTANCE.isMagicBleFeatureEnabled(this.vendomatic, this.mbleSecretConfig);
    }

    private final boolean isMagicBleFeatureEnabledAndDeviceOptIn() {
        return MbleUtils.INSTANCE.isMagicBleFeatureEnabledAndDeviceOptIn(this.context, this.vendomatic, this.mbleSecretConfig);
    }

    private final void startAdvertisingIfInGeofenceOrOutsideFlagOn() {
        startAdvertisingIfNotDisabledInCastArea();
    }

    private final void startAdvertisingIfNotDisabledInCastArea() {
        if (MbleUtils.INSTANCE.isAdvertisingDisabledInCastArea(this.vendomatic, this.gson, this.time, this.mbleLocalStorageManager)) {
            return;
        }
        this.mbleCoreManager.turnOn(1);
        this.mbleEventHelper.recordMbleEvent(EventsConstantsKt.MAGIC_BLE_EVENT, MapsKt.hashMapOf(TuplesKt.m92045to("Type", EventsConstantsKt.MBLE_ON), TuplesKt.m92045to("Message", EventsConstantsKt.TURN_ON_SUCCESS)));
    }

    private final void startAdvertisingTokens() {
        if (isMagicBleFeatureEnabledAndDeviceOptIn()) {
            startAdvertisingIfInGeofenceOrOutsideFlagOn();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r4.intValue() == r0.getMBLE_TOKEN_NOT_SAVED_ERROR()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void trackInitializeMBLEFail(java.lang.Integer r4, java.lang.Throwable r5) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.isMbleInitialized
            boolean r0 = r0.get()
            if (r0 != 0) goto L2b
            if (r4 == 0) goto L26
            com.disney.wdpro.mblecore.common.MbleErrorCode$Companion r0 = com.disney.wdpro.mblecore.common.MbleErrorCode.INSTANCE
            int r1 = r0.getMBLE_TOKEN_NOT_FETCHED_ERROR()
            int r2 = r4.intValue()
            if (r2 == r1) goto L20
            int r0 = r0.getMBLE_TOKEN_NOT_SAVED_ERROR()
            int r1 = r4.intValue()
            if (r1 != r0) goto L26
        L20:
            com.disney.wdpro.magicble.utils.analytics.MbleAnalyticsHelper r3 = r3.mbleAnalyticsHelper
            r3.trackMbleVmmsApiFail(r5)
            return
        L26:
            com.disney.wdpro.magicble.utils.analytics.MbleAnalyticsHelper r3 = r3.mbleAnalyticsHelper
            r3.trackMbleStartAdvertisingFailEvent(r4)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.magicble.manager.MbleManagerImpl.trackInitializeMBLEFail(java.lang.Integer, java.lang.Throwable):void");
    }

    private final void trackInitializeMBLESuccess() {
        if (this.isMbleInitialized.get()) {
            return;
        }
        this.mbleAnalyticsHelper.trackMbleInitialized(new MbleAnalyticsState(true, Integer.valueOf(MbleUtils.INSTANCE.isAdvertiseOutsideGeofenceEnabled(this.vendomatic, this.mbleSecretConfig) ? -1 : 1), 0, 0, 0, 0, 60, null));
    }

    @Override // com.disney.wdpro.magicble.manager.MbleManager
    public void init() {
        MbleUtils mbleUtils = MbleUtils.INSTANCE;
        mbleUtils.showLog("\n\nMbleManager init().");
        if (isMagicBleFeatureEnabledAndDeviceOptIn() && this.authenticationManager.isUserAuthenticated()) {
            initializeModule();
        } else {
            mbleUtils.showLog("OptOut or user not authenticated.");
            this.mbleAnalyticsHelper.trackMbleOptOut();
        }
    }

    @Override // com.disney.wdpro.magicble.manager.MbleManager
    public void initLocationRegions(LocationRegionsConfiguration locationRegionConfig) {
        Intrinsics.checkNotNullParameter(locationRegionConfig, "locationRegionConfig");
        this.disneyLocationMonitor.initialize(locationRegionConfig);
    }

    @Subscribe
    public final void onAccountCreatedEvent(ProfileManager.CreateAccountDataEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MbleUtils.INSTANCE.showLog("User account created : " + event.isSuccess());
        if (event.isSuccess()) {
            handleSuccessLoginOrCreateAccount();
        } else {
            if (event.isSuccess()) {
                return;
            }
            this.mbleCrashHelper.recordMbleErrorEvent(MbleCrashHelperErrorTypeAttr.INSTANCE.getHTTP_ERROR(), event.getThrowable());
        }
    }

    @Subscribe
    public final void onLocationUpdate(C9337l.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MbleUtils mbleUtils = MbleUtils.INSTANCE;
        mbleUtils.showLog("Location event : " + event.m39011a());
        if (isMagicBleFeatureEnabledAndDeviceOptIn() && !mbleUtils.isAdvertiseOutsideGeofenceEnabled(this.vendomatic, this.mbleSecretConfig) && this.mbleCoreManager.isValidTokensAvailable()) {
            Location locationM39011a = event.m39011a();
            Intrinsics.checkNotNullExpressionValue(locationM39011a, "event.location");
            if (mbleUtils.isLocationWithinGeofence(locationM39011a, this.mbleGeofenceManager.getGeofenceRegions())) {
                startAdvertisingIfNotDisabledInCastArea();
            }
        }
    }

    @Subscribe
    public final void onLogInEvent(ProfileManager.LoginDataEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MbleUtils.INSTANCE.showLog("User login : " + event.isSuccess());
        if (!event.isSuccess()) {
            if (event.isSuccess()) {
                return;
            }
            this.mbleCrashHelper.recordMbleErrorEvent(MbleCrashHelperErrorTypeAttr.INSTANCE.getHTTP_ERROR(), event.getThrowable());
            return;
        }
        handleSuccessLoginOrCreateAccount();
        String guestSwid = getGuestSwid();
        if (guestSwid != null) {
            this.mbleEventHelper.setSwid$magic_ble_lib_release(guestSwid);
            this.mbleEventHelper.recordMbleEvent(EventsConstantsKt.SIGN_IN_OUT_EVENT, MapsKt.hashMapOf(TuplesKt.m92045to("Type", EventsConstantsKt.SIGNED_IN), TuplesKt.m92045to("Message", EventsConstantsKt.SIGNED_IN_MESSAGE + this.mbleEventHelper.getSwid())));
        }
    }

    @Subscribe
    public final void onLogoutEvent(ProfileManager.LogoutDataEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MbleUtils.INSTANCE.showLog("User Logout : " + event.isSuccess());
        deleteDataAndStopAdvertising();
        this.mbleEventHelper.recordMbleEvent("Advertising", MapsKt.hashMapOf(TuplesKt.m92045to("Type", "Advertising"), TuplesKt.m92045to("Message", EventsConstantsKt.ADVERTISING_STOPPED)));
        this.mbleEventHelper.recordMbleEvent(EventsConstantsKt.MAGIC_BLE_EVENT, MapsKt.hashMapOf(TuplesKt.m92045to("Type", EventsConstantsKt.MBLE_OFF), TuplesKt.m92045to("Message", EventsConstantsKt.TURN_OFF_SUCCESS)));
        this.mbleEventHelper.recordMbleEvent(EventsConstantsKt.SIGN_IN_OUT_EVENT, MapsKt.hashMapOf(TuplesKt.m92045to("Type", EventsConstantsKt.SIGNED_OUT), TuplesKt.m92045to("Message", EventsConstantsKt.SIGNED_OUT_MESSAGE + this.mbleEventHelper.getSwid())));
        this.disneyLocationMonitor.stopTracking();
    }

    @Subscribe
    public final void onStartAdvertisingEvent(MbleCoreManager.MbleStartAdvertisingEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.isSuccess()) {
            MbleUtils.INSTANCE.showLog(" Start Advertising Event : " + event.getRequestCode());
            MbleEventHelper mbleEventHelper = this.mbleEventHelper;
            mbleEventHelper.recordMbleEvent("Advertising", MapsKt.hashMapOf(TuplesKt.m92045to("Type", "Advertising"), TuplesKt.m92045to("Message", EventsConstantsKt.START_ADVERTISING), TuplesKt.m92045to(EventsConstantsKt.TOKEN_NUMBER, "Token " + mbleEventHelper.getTokenNumber() + " of 25"), TuplesKt.m92045to(EventsConstantsKt.TOKEN, mbleEventHelper.getToken()), TuplesKt.m92045to(EventsConstantsKt.TOKEN_EXPIRATION_TTL, mbleEventHelper.getExpirationTTL()), TuplesKt.m92045to(EventsConstantsKt.TOKEN_DROP_TTL, mbleEventHelper.getDropTTL())));
            return;
        }
        Integer errorCode = event.getErrorCode();
        if (errorCode != null) {
            int iIntValue = errorCode.intValue();
            MbleErrorCode.Companion companion = MbleErrorCode.INSTANCE;
            if (iIntValue == companion.getMBLE_TOKEN_NOT_FETCHED_ERROR()) {
                this.mbleCrashHelper.recordMbleErrorEvent(MbleCrashHelperErrorTypeAttr.INSTANCE.getTOKEN_LIST_FETCH_ERROR(), event);
                return;
            }
            if (iIntValue == companion.getMBLE_TOKEN_NOT_SAVED_ERROR()) {
                this.mbleCrashHelper.recordMbleErrorEvent(MbleCrashHelperErrorTypeAttr.INSTANCE.getTOKEN_LIST_SAVE_ERROR(), event);
                return;
            }
            if (iIntValue == companion.getMBLE_BLUETOOTH_NOT_ENABLED_ERROR()) {
                this.mbleCrashHelper.recordMbleErrorEvent(MbleCrashHelperErrorTypeAttr.INSTANCE.getBLUETOOTH_NOT_ENABLED_ERROR(), event);
                return;
            }
            if (iIntValue == companion.getMBLE_ADVERTISING_FAILED_ERROR()) {
                this.mbleCrashHelper.recordMbleErrorEvent(MbleCrashHelperErrorTypeAttr.INSTANCE.getSTART_ADVERT_ERROR(), event);
                return;
            }
            if (iIntValue == companion.getMBLE_START_ADVERTISING_NOT_ALLOWED_ERROR()) {
                this.mbleCrashHelper.recordMbleErrorEvent(MbleCrashHelperErrorTypeAttr.INSTANCE.getSTART_ADVERTISING_NOT_ALLOWED(), event);
            } else if (iIntValue == companion.getMBLE_ADVERTISING_NO_DATA_ERROR()) {
                this.mbleCrashHelper.recordMbleErrorEvent(MbleCrashHelperErrorTypeAttr.INSTANCE.getUNKNOWN_ERROR(), event);
            } else if (iIntValue == companion.getMBLE_INVALID_SWID_ERROR()) {
                this.mbleCrashHelper.recordMbleErrorEvent(MbleCrashHelperErrorTypeAttr.INSTANCE.getINVALID_SWID(), event);
            }
        }
    }

    @Subscribe
    public final void onStopAdvertisingEvent(MbleCoreManager.MbleStopAdvertisingEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.isSuccess()) {
            event.getRequestCode();
        }
    }

    @Subscribe
    public final void onTokenListFetchedAndStored(MbleCoreManager.MbleTokenFetchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        MbleUtils.INSTANCE.showLog("Tokens Fetched And Store Event : " + event.isSuccess());
        if (!event.isSuccess()) {
            this.mbleCrashHelper.recordMbleErrorEvent(MbleCrashHelperErrorTypeAttr.INSTANCE.getTOKEN_LIST_FETCH_ERROR(), event);
            Integer errorCode = event.getErrorCode();
            Throwable throwable = event.getThrowable();
            Intrinsics.checkNotNullExpressionValue(throwable, "event.throwable");
            trackInitializeMBLEFail(errorCode, throwable);
            return;
        }
        Object payload = event.getPayload();
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
        HashMap map = (HashMap) payload;
        MbleEventHelper mbleEventHelper = this.mbleEventHelper;
        mbleEventHelper.setToken$magic_ble_lib_release(String.valueOf(map.get("tokens")));
        mbleEventHelper.setExpirationTTL$magic_ble_lib_release(String.valueOf(map.get("expirationTTL")));
        mbleEventHelper.setDropTTL$magic_ble_lib_release(String.valueOf(map.get("dropTTL")));
        String strValueOf = String.valueOf(map.get("lastFetch"));
        if (Integer.parseInt(strValueOf) > 24) {
            this.mbleEventHelper.recordMbleEvent(EventsConstantsKt.TOKEN_MANAGEMENT_EVENT, MapsKt.hashMapOf(TuplesKt.m92045to("Type", EventsConstantsKt.TOKEN_FETCH), TuplesKt.m92045to("Message", "Token fetch required due to:  " + strValueOf + " hours to last fetch")));
        } else {
            this.mbleEventHelper.recordMbleEvent(EventsConstantsKt.TOKEN_MANAGEMENT_EVENT, MapsKt.hashMapOf(TuplesKt.m92045to("Type", EventsConstantsKt.TOKEN_FETCH), TuplesKt.m92045to("Message", EventsConstantsKt.FETCH_TOKEN_SUCCESS)));
        }
        this.mbleEventHelper.recordMbleEvent(EventsConstantsKt.TOKEN_MANAGEMENT_EVENT, MapsKt.hashMapOf(TuplesKt.m92045to("Type", EventsConstantsKt.TOKENS_STORED), TuplesKt.m92045to("Message", EventsConstantsKt.TOKENS_STORED_MESSAGE), TuplesKt.m92045to(EventsConstantsKt.TOKENS, mbleEventHelper.getToken()), TuplesKt.m92045to(EventsConstantsKt.TOKEN_EXPIRATION_TTL, mbleEventHelper.getExpirationTTL()), TuplesKt.m92045to(EventsConstantsKt.TOKEN_DROP_TTL, mbleEventHelper.getDropTTL())));
        trackInitializeMBLESuccess();
        this.isMbleInitialized.set(true);
        startAdvertisingTokens();
    }

    @Subscribe
    public final void pickUnusedTokenEvent(MbleDataManager.UnusedTokenEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.isSuccess()) {
            MbleUtils.INSTANCE.showLog(" Pick Token Event " + event.isSuccess());
            HashMap<String, String> payload = event.getPayload();
            Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
            HashMap<String, String> map = payload;
            MbleEventHelper mbleEventHelper = this.mbleEventHelper;
            mbleEventHelper.setTokenNumber$magic_ble_lib_release(String.valueOf(map.get("tokenIndex")));
            mbleEventHelper.setToken$magic_ble_lib_release(String.valueOf(map.get("token")));
            mbleEventHelper.setExpirationTTL$magic_ble_lib_release(String.valueOf(map.get("expirationTTL")));
            mbleEventHelper.setDropTTL$magic_ble_lib_release(String.valueOf(map.get("dropTTL")));
            mbleEventHelper.recordMbleEvent("Advertising", MapsKt.hashMapOf(TuplesKt.m92045to("Type", "Advertising"), TuplesKt.m92045to("Message", EventsConstantsKt.NEXT_TOKEN_ADVERTISED), TuplesKt.m92045to(EventsConstantsKt.TOKEN, mbleEventHelper.getToken()), TuplesKt.m92045to(EventsConstantsKt.TOKEN_NUMBER, "Token " + mbleEventHelper.getTokenNumber() + " of 25"), TuplesKt.m92045to(EventsConstantsKt.TOKEN_EXPIRATION_TTL, mbleEventHelper.getExpirationTTL()), TuplesKt.m92045to(EventsConstantsKt.TOKEN_DROP_TTL, mbleEventHelper.getDropTTL())));
        }
    }

    @Override // com.disney.wdpro.magicble.manager.MbleManager
    public void startLocationTracking() {
        this.disneyLocationMonitor.startTracking();
    }
}