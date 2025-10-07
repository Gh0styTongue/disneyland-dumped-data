package com.disney.wdpro.mblecore.services;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.deeplink.DeepLinkParkHours;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import com.disney.wdpro.mblecore.manager.MbleAdvertisingManager;
import com.disney.wdpro.mblecore.p330di.MbleCoreComponentProvider;
import com.disney.wdpro.mblecore.utils.AdvertisementUtils;
import com.disney.wdpro.my_plans_ui.p348ui.activity.ItineraryHybridActivity;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/services/MbleAdvertisingScheduler;", "Landroid/app/job/JobService;", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "mbleAdvertisingManager", "Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManager;", "getMbleAdvertisingManager", "()Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManager;", "setMbleAdvertisingManager", "(Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManager;)V", "mbleCoreLogger", "Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "getMbleCoreLogger", "()Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "setMbleCoreLogger", "(Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;)V", "onCreate", "", "onStartJob", "", ItineraryHybridActivity.ALL_QUERY_PARAMS, "Landroid/app/job/JobParameters;", "onStopJob", "Companion", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final class MbleAdvertisingScheduler extends JobService {
    private static boolean isScheduled;

    @Inject
    public Context context;

    @Inject
    public MbleAdvertisingManager mbleAdvertisingManager;

    @Inject
    public MbleCoreLogger mbleCoreLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int JOB_ID = 1001;
    private static final long DEFAULT_INTERVAL = C9350r.m39066L(15);
    private static final String CREATED_DATE_KEY = "CREATED_DATE";
    private static final long EXPIRATION_TIME = C9350r.m39065G(24);

    @Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/services/MbleAdvertisingScheduler$Companion;", "", "()V", "CREATED_DATE_KEY", "", "DEFAULT_INTERVAL", "", "EXPIRATION_TIME", "JOB_ID", "", "isScheduled", "", "cancel", "", "context", "Landroid/content/Context;", DeepLinkParkHours.PARAM_SCHEDULE, "intervalMillis", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void schedule$default(Companion companion, Context context, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = MbleAdvertisingScheduler.DEFAULT_INTERVAL;
            }
            companion.schedule(context, j10);
        }

        public final void cancel(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("jobscheduler");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService).cancel(MbleAdvertisingScheduler.JOB_ID);
            AdvertisementUtils.INSTANCE.showLog("Canceled advertising periodic update.");
            MbleAdvertisingScheduler.isScheduled = false;
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
            JobScheduler jobScheduler = (JobScheduler) systemService;
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putLong(MbleAdvertisingScheduler.CREATED_DATE_KEY, new Date().getTime());
            JobInfo.Builder extras = new JobInfo.Builder(MbleAdvertisingScheduler.JOB_ID, new ComponentName(context.getPackageName(), MbleAdvertisingScheduler.class.getName())).setPeriodic(intervalMillis).setExtras(persistableBundle);
            if (MbleAdvertisingScheduler.isScheduled || jobScheduler.schedule(extras.build()) != 1) {
                AdvertisementUtils.INSTANCE.showLog("Could not start advertising periodic update job.");
            } else {
                AdvertisementUtils.INSTANCE.showLog("Scheduled advertising periodic update service.");
                MbleAdvertisingScheduler.isScheduled = true;
            }
        }
    }

    public final Context getContext() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
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

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ComponentCallbacks2 application = getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.disney.wdpro.mblecore.di.MbleCoreComponentProvider");
        ((MbleCoreComponentProvider) application).getMbleCoreComponent().inject(this);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        AdvertisementUtils advertisementUtils = AdvertisementUtils.INSTANCE;
        advertisementUtils.showLog("\n\nMble Advertising Scheduler Start Job.", getMbleCoreLogger());
        PersistableBundle extras = params.getExtras();
        Intrinsics.checkNotNullExpressionValue(extras, "params.extras");
        long time = new Date().getTime() - extras.getLong(CREATED_DATE_KEY);
        if (time >= DEFAULT_INTERVAL) {
            getMbleAdvertisingManager().updateAdvertising();
        }
        if (time < EXPIRATION_TIME) {
            return false;
        }
        advertisementUtils.showLog("Mble Advertising Scheduler expired, cancelling.", getMbleCoreLogger());
        INSTANCE.cancel(getContext());
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return false;
    }

    public final void setContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setMbleAdvertisingManager(MbleAdvertisingManager mbleAdvertisingManager) {
        Intrinsics.checkNotNullParameter(mbleAdvertisingManager, "<set-?>");
        this.mbleAdvertisingManager = mbleAdvertisingManager;
    }

    public final void setMbleCoreLogger(MbleCoreLogger mbleCoreLogger) {
        Intrinsics.checkNotNullParameter(mbleCoreLogger, "<set-?>");
        this.mbleCoreLogger = mbleCoreLogger;
    }
}