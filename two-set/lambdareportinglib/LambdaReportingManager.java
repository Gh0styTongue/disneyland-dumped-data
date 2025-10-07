package com.disney.wdpro.lambdareportinglib;

import android.content.Context;
import androidx.view.InterfaceC3785d0;
import androidx.view.InterfaceC3814s;
import androidx.work.C5293d;
import androidx.work.C5402q;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import ck.C6187a;
import com.disney.wdpro.lambdareportinglib.repository.p143db.models.UploadState;
import com.disney.wdpro.lambdareportinglib.work.AnalyticEnqueueWorker;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.InterfaceC30065h0;
import kotlinx.coroutines.InterfaceC30139p1;
import p793o9.C30824b;

@Metadata(m92037d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m92038d2 = {"Lcom/disney/wdpro/lambdareportinglib/LambdaReportingManager;", "", "Landroid/content/Context;", "context", "Lck/a;", "analyticsRepository", "Lkotlinx/coroutines/h0;", "coroutineScope", "<init>", "(Landroid/content/Context;Lck/a;Lkotlinx/coroutines/h0;)V", "", "insertedId", "Landroidx/lifecycle/s;", "lifecycleOwner", "Landroidx/lifecycle/d0;", "Landroidx/work/WorkInfo;", "observer", "", "c", "(JLandroidx/lifecycle/s;Landroidx/lifecycle/d0;)V", "", C30824b.KEY_PAYLOAD, "Lkotlinx/coroutines/p1;", "d", "(Ljava/lang/String;Landroidx/lifecycle/s;Landroidx/lifecycle/d0;)Lkotlinx/coroutines/p1;", "Lck/a;", "Lkotlinx/coroutines/h0;", "Landroidx/work/WorkManager;", "workManager", "Landroidx/work/WorkManager;", "Companion", "a", "lambdareporting_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nLambdaReportingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LambdaReportingManager.kt\ncom/disney/wdpro/lambdareportinglib/LambdaReportingManager\n+ 2 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n*L\n1#1,82:1\n100#2:83\n*S KotlinDebug\n*F\n+ 1 LambdaReportingManager.kt\ncom/disney/wdpro/lambdareportinglib/LambdaReportingManager\n*L\n66#1:83\n*E\n"})
/* loaded from: classes29.dex */
public final class LambdaReportingManager {
    private static final String ENQUEUE_WORK_NAME = "AnalyticEnqueueWorker";
    private final C6187a analyticsRepository;
    private final InterfaceC30065h0 coroutineScope;
    private final WorkManager workManager;

    @Inject
    public LambdaReportingManager(Context context, C6187a analyticsRepository, @Named("LambdaCoroutineScope") InterfaceC30065h0 coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.analyticsRepository = analyticsRepository;
        this.coroutineScope = coroutineScope;
        WorkManager workManagerM28150i = WorkManager.m28150i(context);
        Intrinsics.checkNotNullExpressionValue(workManagerM28150i, "getInstance(context)");
        this.workManager = workManagerM28150i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m55856c(long insertedId, InterfaceC3814s lifecycleOwner, InterfaceC3785d0<WorkInfo> observer) {
        this.analyticsRepository.m29665h(insertedId, UploadState.FAILED);
        C5402q c5402qM28580b = new C5402q.a(AnalyticEnqueueWorker.class).m28586j(new C5293d.a().m28219b(NetworkType.CONNECTED).m28218a()).m28580b();
        this.workManager.m28158g(ENQUEUE_WORK_NAME, ExistingWorkPolicy.REPLACE, c5402qM28580b);
        if (lifecycleOwner == null || observer == null) {
            return;
        }
        this.workManager.mo28160j(c5402qM28580b.getId()).observe(lifecycleOwner, observer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static /* synthetic */ InterfaceC30139p1 m55857e(LambdaReportingManager lambdaReportingManager, String str, InterfaceC3814s interfaceC3814s, InterfaceC3785d0 interfaceC3785d0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC3814s = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC3785d0 = null;
        }
        return lambdaReportingManager.m55858d(str, interfaceC3814s, interfaceC3785d0);
    }

    /* renamed from: d */
    public final InterfaceC30139p1 m55858d(String payload, InterfaceC3814s lifecycleOwner, InterfaceC3785d0<WorkInfo> observer) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return C30113j.m92948d(this.coroutineScope, null, null, new LambdaReportingManager$sendAnalytics$1(payload, this, lifecycleOwner, observer, null), 3, null);
    }
}