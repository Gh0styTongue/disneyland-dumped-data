package com.disney.wdpro.lambdareportinglib.work;

import android.content.Context;
import androidx.work.AbstractC5399n;
import androidx.work.C5293d;
import androidx.work.C5295f;
import androidx.work.C5402q;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import ck.C6187a;
import com.disney.wdpro.lambdareportinglib.repository.p143db.models.UploadState;
import com.disney.wdpro.my_plans_ui.p348ui.activity.ItineraryHybridActivity;
import dk.AnalyticEvent;
import dk.AnalyticEventBatchUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m92038d2 = {"Lcom/disney/wdpro/lambdareportinglib/work/AnalyticEnqueueWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", ItineraryHybridActivity.ALL_QUERY_PARAMS, "Lck/a;", "analyticsRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lck/a;)V", "", "Ldk/a;", "analyticEvents", "", "c", "(Ljava/util/List;)V", "Ldk/b;", "batch", "", "batchId", "d", "(Ljava/util/List;Ljava/lang/String;)V", "Landroidx/work/n$a;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "Lck/a;", "Companion", "a", "lambdareporting_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nAnalyticEnqueueWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticEnqueueWorker.kt\ncom/disney/wdpro/lambdareportinglib/work/AnalyticEnqueueWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n+ 4 Data.kt\nandroidx/work/DataKt\n*L\n1#1,65:1\n766#2:66\n857#2,2:67\n1855#2:69\n1549#2:70\n1620#2,3:71\n1856#2:74\n100#3:75\n31#4,5:76\n*S KotlinDebug\n*F\n+ 1 AnalyticEnqueueWorker.kt\ncom/disney/wdpro/lambdareportinglib/work/AnalyticEnqueueWorker\n*L\n33#1:66\n33#1:67,2\n40#1:69\n42#1:70\n42#1:71,3\n40#1:74\n53#1:75\n54#1:76,5\n*E\n"})
/* loaded from: classes29.dex */
public final class AnalyticEnqueueWorker extends CoroutineWorker {
    private static final int MAX_RECORDS_PER_BATCH = 30;
    private final C6187a analyticsRepository;
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticEnqueueWorker(Context context, WorkerParameters params, C6187a analyticsRepository) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        this.context = context;
        this.analyticsRepository = analyticsRepository;
    }

    /* renamed from: c */
    private final void m55915c(List<AnalyticEvent> analyticEvents) throws Throwable {
        for (List list : CollectionsKt.chunked(analyticEvents, 30)) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new AnalyticEventBatchUpdate(((AnalyticEvent) it.next()).getEventId(), string, UploadState.PENDING));
            }
            m55916d(arrayList, string);
        }
    }

    /* renamed from: d */
    private final void m55916d(List<AnalyticEventBatchUpdate> batch, String batchId) throws Throwable {
        this.analyticsRepository.m29664g(batch);
        C5402q.a aVar = new C5402q.a(AnalyticsUploadWorker.class);
        Pair[] pairArr = {TuplesKt.m92045to(AnalyticsUploadWorker.INPUT_DATA_BATCH_ID, batchId)};
        C5295f.a aVar2 = new C5295f.a();
        Pair pair = pairArr[0];
        aVar2.m28238b((String) pair.getFirst(), pair.getSecond());
        C5295f c5295fM28237a = aVar2.m28237a();
        Intrinsics.checkNotNullExpressionValue(c5295fM28237a, "dataBuilder.build()");
        WorkManager.m28150i(this.context).m28158g(batchId, ExistingWorkPolicy.KEEP, aVar.m28589m(c5295fM28237a).m28586j(new C5293d.a().m28219b(NetworkType.CONNECTED).m28218a()).m28579a(batchId).m28580b());
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super AbstractC5399n.a> continuation) throws Throwable {
        List<AnalyticEvent> listM29660c = this.analyticsRepository.m29660c("NO_BATCH_ID");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM29660c) {
            if (((AnalyticEvent) obj).getUploadState() == UploadState.FAILED) {
                arrayList.add(obj);
            }
        }
        m55915c(arrayList);
        AbstractC5399n.a aVarM28548d = AbstractC5399n.a.m28548d();
        Intrinsics.checkNotNullExpressionValue(aVarM28548d, "success()");
        return aVarM28548d;
    }
}