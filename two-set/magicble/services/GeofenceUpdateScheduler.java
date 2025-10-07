package com.disney.wdpro.magicble.services;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.deeplink.DeepLinkParkHours;
import com.disney.wdpro.commons.monitor.InterfaceC9336k;
import com.disney.wdpro.magicble.geofence.MbleGeofenceManager;
import com.disney.wdpro.magicble.p329di.MbleComponentProvider;
import com.disney.wdpro.magicble.settings.MbleSecretConfig;
import com.disney.wdpro.magicble.utils.MbleUtils;
import com.disney.wdpro.my_plans_ui.p348ui.activity.ItineraryHybridActivity;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, m92038d2 = {"Lcom/disney/wdpro/magicble/services/GeofenceUpdateScheduler;", "Landroid/app/job/JobService;", "<init>", "()V", "", "onCreate", "Landroid/app/job/JobParameters;", ItineraryHybridActivity.ALL_QUERY_PARAMS, "", "onStartJob", "(Landroid/app/job/JobParameters;)Z", "onStopJob", "Lcom/disney/wdpro/commons/monitor/k;", "locationMonitor", "Lcom/disney/wdpro/commons/monitor/k;", "getLocationMonitor$magic_ble_lib_release", "()Lcom/disney/wdpro/commons/monitor/k;", "setLocationMonitor$magic_ble_lib_release", "(Lcom/disney/wdpro/commons/monitor/k;)V", "Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;", "mbleGeofenceManager", "Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;", "getMbleGeofenceManager$magic_ble_lib_release", "()Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;", "setMbleGeofenceManager$magic_ble_lib_release", "(Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;)V", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/disney/wdpro/commons/config/i;", "getVendomatic$magic_ble_lib_release", "()Lcom/disney/wdpro/commons/config/i;", "setVendomatic$magic_ble_lib_release", "(Lcom/disney/wdpro/commons/config/i;)V", "Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;", "mbleSecretConfig", "Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;", "getMbleSecretConfig$magic_ble_lib_release", "()Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;", "setMbleSecretConfig$magic_ble_lib_release", "(Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext$magic_ble_lib_release", "()Landroid/content/Context;", "setContext$magic_ble_lib_release", "(Landroid/content/Context;)V", "Companion", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class GeofenceUpdateScheduler extends JobService {

    @Inject
    public Context context;

    @Inject
    public InterfaceC9336k locationMonitor;

    @Inject
    public MbleGeofenceManager mbleGeofenceManager;

    @Inject
    public MbleSecretConfig mbleSecretConfig;

    @Inject
    public C9248i vendomatic;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int JOB_ID = GeofenceUpdateScheduler.class.getSimpleName().hashCode();
    private static final long DEFAULT_INTERVAL = C9350r.m39065G(2);
    private static final String CREATED_DATE_KEY = "CREATED_DATE";
    private static final long EXPIRATION_TIME = C9350r.m39068c(180);

    @Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/magicble/services/GeofenceUpdateScheduler$Companion;", "", "()V", "CREATED_DATE_KEY", "", "DEFAULT_INTERVAL", "", "EXPIRATION_TIME", "JOB_ID", "", "cancel", "", "context", "Landroid/content/Context;", DeepLinkParkHours.PARAM_SCHEDULE, "intervalMillis", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void schedule$default(Companion companion, Context context, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = GeofenceUpdateScheduler.DEFAULT_INTERVAL;
            }
            companion.schedule(context, j10);
        }

        public final void cancel(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("jobscheduler");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService).cancel(GeofenceUpdateScheduler.JOB_ID);
            MbleUtils.INSTANCE.showLog("Canceled geofence update scheduler");
        }

        @JvmOverloads
        public final void schedule(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            schedule$default(this, context, 0L, 2, null);
        }

        private Companion() {
        }

        @JvmOverloads
        public final void schedule(Context context, long intervalMillis) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("jobscheduler");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putLong(GeofenceUpdateScheduler.CREATED_DATE_KEY, new Date().getTime());
            if (((JobScheduler) systemService).schedule(new JobInfo.Builder(GeofenceUpdateScheduler.JOB_ID, new ComponentName(context.getPackageName(), GeofenceUpdateScheduler.class.getName())).setPeriodic(intervalMillis).setExtras(persistableBundle).build()) == 1) {
                MbleUtils.INSTANCE.showLog("Scheduled geofence update scheduler");
            }
        }
    }

    public final Context getContext$magic_ble_lib_release() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    public final InterfaceC9336k getLocationMonitor$magic_ble_lib_release() {
        InterfaceC9336k interfaceC9336k = this.locationMonitor;
        if (interfaceC9336k != null) {
            return interfaceC9336k;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationMonitor");
        return null;
    }

    public final MbleGeofenceManager getMbleGeofenceManager$magic_ble_lib_release() {
        MbleGeofenceManager mbleGeofenceManager = this.mbleGeofenceManager;
        if (mbleGeofenceManager != null) {
            return mbleGeofenceManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mbleGeofenceManager");
        return null;
    }

    public final MbleSecretConfig getMbleSecretConfig$magic_ble_lib_release() {
        MbleSecretConfig mbleSecretConfig = this.mbleSecretConfig;
        if (mbleSecretConfig != null) {
            return mbleSecretConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mbleSecretConfig");
        return null;
    }

    public final C9248i getVendomatic$magic_ble_lib_release() {
        C9248i c9248i = this.vendomatic;
        if (c9248i != null) {
            return c9248i;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vendomatic");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ComponentCallbacks2 application = getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.disney.wdpro.magicble.di.MbleComponentProvider");
        ((MbleComponentProvider) application).getMbleComponent().inject(this);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        MbleUtils mbleUtils = MbleUtils.INSTANCE;
        if (mbleUtils.isAdvertiseOutsideGeofenceEnabled(getVendomatic$magic_ble_lib_release(), getMbleSecretConfig$magic_ble_lib_release())) {
            INSTANCE.cancel(getContext$magic_ble_lib_release());
            return false;
        }
        getMbleGeofenceManager$magic_ble_lib_release().registerGeofences();
        mbleUtils.showLog("GeofenceUpdateScheduler requesting location.");
        getLocationMonitor$magic_ble_lib_release().mo38958b(false);
        PersistableBundle extras = params.getExtras();
        Intrinsics.checkNotNullExpressionValue(extras, "params.extras");
        if (new Date().getTime() - extras.getLong(CREATED_DATE_KEY) >= EXPIRATION_TIME) {
            mbleUtils.showLog("GeofenceUpdateScheduler expired, cancelling");
            INSTANCE.cancel(getContext$magic_ble_lib_release());
        }
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return false;
    }

    public final void setContext$magic_ble_lib_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setLocationMonitor$magic_ble_lib_release(InterfaceC9336k interfaceC9336k) {
        Intrinsics.checkNotNullParameter(interfaceC9336k, "<set-?>");
        this.locationMonitor = interfaceC9336k;
    }

    public final void setMbleGeofenceManager$magic_ble_lib_release(MbleGeofenceManager mbleGeofenceManager) {
        Intrinsics.checkNotNullParameter(mbleGeofenceManager, "<set-?>");
        this.mbleGeofenceManager = mbleGeofenceManager;
    }

    public final void setMbleSecretConfig$magic_ble_lib_release(MbleSecretConfig mbleSecretConfig) {
        Intrinsics.checkNotNullParameter(mbleSecretConfig, "<set-?>");
        this.mbleSecretConfig = mbleSecretConfig;
    }

    public final void setVendomatic$magic_ble_lib_release(C9248i c9248i) {
        Intrinsics.checkNotNullParameter(c9248i, "<set-?>");
        this.vendomatic = c9248i;
    }
}