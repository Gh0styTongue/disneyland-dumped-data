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
import com.disney.wdpro.magicble.manager.MbleLocalStorageManager;
import com.disney.wdpro.magicble.p329di.MbleComponentProvider;
import com.disney.wdpro.magicble.utils.MbleUtils;
import com.disney.wdpro.mblecore.manager.MbleCoreManager;
import com.disney.wdpro.my_plans_ui.p348ui.activity.ItineraryHybridActivity;
import com.google.gson.Gson;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bR\"\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00068"}, m92038d2 = {"Lcom/disney/wdpro/magicble/services/MbleStartAdvertScheduler;", "Landroid/app/job/JobService;", "<init>", "()V", "", "performAction", "onCreate", "Landroid/app/job/JobParameters;", ItineraryHybridActivity.ALL_QUERY_PARAMS, "", "onStartJob", "(Landroid/app/job/JobParameters;)Z", "onStopJob", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "mbleCoreManager", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "getMbleCoreManager$magic_ble_lib_release", "()Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "setMbleCoreManager$magic_ble_lib_release", "(Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;)V", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "getGson$magic_ble_lib_release", "()Lcom/google/gson/Gson;", "setGson$magic_ble_lib_release", "(Lcom/google/gson/Gson;)V", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/disney/wdpro/commons/config/i;", "getVendomatic$magic_ble_lib_release", "()Lcom/disney/wdpro/commons/config/i;", "setVendomatic$magic_ble_lib_release", "(Lcom/disney/wdpro/commons/config/i;)V", "Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "mbleLocalStorageManager", "Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "getMbleLocalStorageManager$magic_ble_lib_release", "()Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "setMbleLocalStorageManager$magic_ble_lib_release", "(Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext$magic_ble_lib_release", "()Landroid/content/Context;", "setContext$magic_ble_lib_release", "(Landroid/content/Context;)V", "Lcom/disney/wdpro/commons/r;", "time", "Lcom/disney/wdpro/commons/r;", "getTime$magic_ble_lib_release", "()Lcom/disney/wdpro/commons/r;", "setTime$magic_ble_lib_release", "(Lcom/disney/wdpro/commons/r;)V", "Companion", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleStartAdvertScheduler extends JobService {

    @Inject
    public Context context;

    @Inject
    public Gson gson;

    @Inject
    public MbleCoreManager mbleCoreManager;

    @Inject
    public MbleLocalStorageManager mbleLocalStorageManager;

    @Inject
    public C9350r time;

    @Inject
    public C9248i vendomatic;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int JOB_ID = MbleStartAdvertScheduler.class.getSimpleName().hashCode();
    private static final long DEFAULT_INTERVAL = C9350r.m39065G(8);
    private static final String CREATED_DATE_KEY = "CREATED_DATE";
    private static final long EXPIRATION_TIME = C9350r.m39068c(2);

    @Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/magicble/services/MbleStartAdvertScheduler$Companion;", "", "()V", "CREATED_DATE_KEY", "", "DEFAULT_INTERVAL", "", "EXPIRATION_TIME", "JOB_ID", "", "cancel", "", "context", "Landroid/content/Context;", DeepLinkParkHours.PARAM_SCHEDULE, "intervalMillis", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void schedule$default(Companion companion, Context context, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = MbleStartAdvertScheduler.DEFAULT_INTERVAL;
            }
            companion.schedule(context, j10);
        }

        public final void cancel(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("jobscheduler");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService).cancel(MbleStartAdvertScheduler.JOB_ID);
            MbleUtils.INSTANCE.showLog("Canceled MbleStartAdvertScheduler");
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
            persistableBundle.putLong(MbleStartAdvertScheduler.CREATED_DATE_KEY, new Date().getTime());
            if (((JobScheduler) systemService).schedule(new JobInfo.Builder(MbleStartAdvertScheduler.JOB_ID, new ComponentName(context.getPackageName(), MbleStartAdvertScheduler.class.getName())).setPeriodic(intervalMillis).setExtras(persistableBundle).build()) == 1) {
                MbleUtils.INSTANCE.showLog("Scheduled MbleStartAdvertScheduler");
            }
        }
    }

    private final void performAction() {
        if (MbleUtils.INSTANCE.isAdvertisingDisabledInCastArea(getVendomatic$magic_ble_lib_release(), getGson$magic_ble_lib_release(), getTime$magic_ble_lib_release(), getMbleLocalStorageManager$magic_ble_lib_release())) {
            return;
        }
        MbleCoreManager.startAdvertising$default(getMbleCoreManager$magic_ble_lib_release(), null, 1, null);
        INSTANCE.cancel(getContext$magic_ble_lib_release());
    }

    public final Context getContext$magic_ble_lib_release() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    public final Gson getGson$magic_ble_lib_release() {
        Gson gson = this.gson;
        if (gson != null) {
            return gson;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gson");
        return null;
    }

    public final MbleCoreManager getMbleCoreManager$magic_ble_lib_release() {
        MbleCoreManager mbleCoreManager = this.mbleCoreManager;
        if (mbleCoreManager != null) {
            return mbleCoreManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mbleCoreManager");
        return null;
    }

    public final MbleLocalStorageManager getMbleLocalStorageManager$magic_ble_lib_release() {
        MbleLocalStorageManager mbleLocalStorageManager = this.mbleLocalStorageManager;
        if (mbleLocalStorageManager != null) {
            return mbleLocalStorageManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mbleLocalStorageManager");
        return null;
    }

    public final C9350r getTime$magic_ble_lib_release() {
        C9350r c9350r = this.time;
        if (c9350r != null) {
            return c9350r;
        }
        Intrinsics.throwUninitializedPropertyAccessException("time");
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
        performAction();
        PersistableBundle extras = params.getExtras();
        Intrinsics.checkNotNullExpressionValue(extras, "params.extras");
        if (new Date().getTime() - extras.getLong(CREATED_DATE_KEY) < EXPIRATION_TIME) {
            return false;
        }
        MbleUtils.INSTANCE.showLog("MbleStartAdvertScheduler expired, cancelling");
        INSTANCE.cancel(getContext$magic_ble_lib_release());
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

    public final void setGson$magic_ble_lib_release(Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.gson = gson;
    }

    public final void setMbleCoreManager$magic_ble_lib_release(MbleCoreManager mbleCoreManager) {
        Intrinsics.checkNotNullParameter(mbleCoreManager, "<set-?>");
        this.mbleCoreManager = mbleCoreManager;
    }

    public final void setMbleLocalStorageManager$magic_ble_lib_release(MbleLocalStorageManager mbleLocalStorageManager) {
        Intrinsics.checkNotNullParameter(mbleLocalStorageManager, "<set-?>");
        this.mbleLocalStorageManager = mbleLocalStorageManager;
    }

    public final void setTime$magic_ble_lib_release(C9350r c9350r) {
        Intrinsics.checkNotNullParameter(c9350r, "<set-?>");
        this.time = c9350r;
    }

    public final void setVendomatic$magic_ble_lib_release(C9248i c9248i) {
        Intrinsics.checkNotNullParameter(c9248i, "<set-?>");
        this.vendomatic = c9248i;
    }
}