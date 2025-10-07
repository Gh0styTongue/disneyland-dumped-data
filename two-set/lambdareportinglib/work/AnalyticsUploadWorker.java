package com.disney.wdpro.lambdareportinglib.work;

import android.content.Context;
import androidx.work.AbstractC5399n;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ck.C6187a;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.lambdareportinglib.repository.p143db.models.UploadState;
import com.disney.wdpro.my_plans_ui.p348ui.activity.ItineraryHybridActivity;
import com.disney.wdpro.photopass.services.model.lambdareporting.AnalyticsResponse;
import dk.AnalyticEvent;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jose4j.jwk.OctetSequenceJsonWebKey;

@Metadata(m92037d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001'B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u0015H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, m92038d2 = {"Lcom/disney/wdpro/lambdareportinglib/work/AnalyticsUploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", ItineraryHybridActivity.ALL_QUERY_PARAMS, "Lck/a;", "analyticsRepository", "Lkotlin/coroutines/CoroutineContext;", "workerCoroutineContext", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authenticationManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lck/a;Lkotlin/coroutines/CoroutineContext;Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;)V", "Ldk/a;", "analyticEvent", "Lcom/disney/wdpro/photopass/services/model/lambdareporting/AnalyticsResponse;", OctetSequenceJsonWebKey.KEY_VALUE_MEMBER_NAME, "(Ldk/a;)Lcom/disney/wdpro/photopass/services/model/lambdareporting/AnalyticsResponse;", "", "analyticEvents", "Landroidx/work/n$a;", "j", "(Ljava/util/List;)Landroidx/work/n$a;", "Ljava/time/LocalDateTime;", "localTimeThreshold", "", "l", "(Ldk/a;Ljava/time/LocalDateTime;)Z", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i", "Lck/a;", "Lkotlin/coroutines/CoroutineContext;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "", "batchId", "Ljava/lang/String;", "Companion", "a", "lambdareporting_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nAnalyticsUploadWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsUploadWorker.kt\ncom/disney/wdpro/lambdareportinglib/work/AnalyticsUploadWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n1549#2:160\n1620#2,3:161\n*S KotlinDebug\n*F\n+ 1 AnalyticsUploadWorker.kt\ncom/disney/wdpro/lambdareportinglib/work/AnalyticsUploadWorker\n*L\n120#1:160\n120#1:161,3\n*E\n"})
/* loaded from: classes29.dex */
public final class AnalyticsUploadWorker extends CoroutineWorker {
    public static final String INPUT_DATA_BATCH_ID = "input_data_batch_id";
    public static final long OLD_RECORD_THRESHOLD_IN_DAYS = 2;
    private final C6187a analyticsRepository;
    private final AuthenticationManager authenticationManager;
    private final String batchId;
    private final CoroutineContext workerCoroutineContext;

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    @DebugMetadata(m92052c = "com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker", m92053f = "AnalyticsUploadWorker.kt", m92054i = {}, m92055l = {44}, m92056m = "doWork", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker$doWork$1 */
    static final class C134761 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C134761(Continuation<? super C134761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnalyticsUploadWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsUploadWorker(Context context, WorkerParameters params, C6187a analyticsRepository, CoroutineContext workerCoroutineContext, AuthenticationManager authenticationManager) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(workerCoroutineContext, "workerCoroutineContext");
        Intrinsics.checkNotNullParameter(authenticationManager, "authenticationManager");
        this.analyticsRepository = analyticsRepository;
        this.workerCoroutineContext = workerCoroutineContext;
        this.authenticationManager = authenticationManager;
        String strM28234l = getInputData().m28234l(INPUT_DATA_BATCH_ID);
        this.batchId = strM28234l == null ? "" : strM28234l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final AbstractC5399n.a m55923j(List<AnalyticEvent> analyticEvents) {
        List<AnalyticEvent> list = analyticEvents;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnalyticEvent) it.next()).getPayload());
        }
        AnalyticsResponse analyticsResponseM29662e = this.analyticsRepository.m29662e(arrayList);
        if (analyticsResponseM29662e instanceof AnalyticsResponse.Success) {
            this.analyticsRepository.m29658a(this.batchId);
            AbstractC5399n.a aVarM28548d = AbstractC5399n.a.m28548d();
            Intrinsics.checkNotNullExpressionValue(aVarM28548d, "{\n                analyt…t.success()\n            }");
            return aVarM28548d;
        }
        if (analyticsResponseM29662e instanceof AnalyticsResponse.BadRequest) {
            this.analyticsRepository.m29663f(this.batchId, UploadState.SERVICE_BAD_REQUEST);
            AbstractC5399n.a aVarM28547c = AbstractC5399n.a.m28547c();
            Intrinsics.checkNotNullExpressionValue(aVarM28547c, "{\n                // One…ult.retry()\n            }");
            return aVarM28547c;
        }
        if (!(analyticsResponseM29662e instanceof AnalyticsResponse.ServiceError)) {
            throw new NoWhenBranchMatchedException();
        }
        Exception exception = ((AnalyticsResponse.ServiceError) analyticsResponseM29662e).getException();
        if (exception != null) {
            exception.getMessage();
        }
        AbstractC5399n.a aVarM28547c2 = AbstractC5399n.a.m28547c();
        Intrinsics.checkNotNullExpressionValue(aVarM28547c2, "{\n                respon…ult.retry()\n            }");
        return aVarM28547c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final AnalyticsResponse m55924k(AnalyticEvent analyticEvent) {
        Exception exception;
        AnalyticsResponse analyticsResponseM29662e = this.analyticsRepository.m29662e(CollectionsKt.listOf(analyticEvent.getPayload()));
        if (analyticsResponseM29662e instanceof AnalyticsResponse.Success ? true : Intrinsics.areEqual(analyticsResponseM29662e, AnalyticsResponse.BadRequest.INSTANCE)) {
            this.analyticsRepository.m29659b(analyticEvent.getEventId());
            return analyticsResponseM29662e;
        }
        if ((analyticsResponseM29662e instanceof AnalyticsResponse.ServiceError) && (exception = ((AnalyticsResponse.ServiceError) analyticsResponseM29662e).getException()) != null) {
            exception.getMessage();
        }
        return analyticsResponseM29662e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final boolean m55925l(AnalyticEvent analyticEvent, LocalDateTime localTimeThreshold) {
        boolean zIsAfter = LocalDateTime.ofInstant(Instant.ofEpochMilli(analyticEvent.getEventTime()), ZoneId.systemDefault()).isAfter(localTimeThreshold);
        if (!zIsAfter) {
            this.analyticsRepository.m29659b(analyticEvent.getEventId());
        }
        return zIsAfter;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.AbstractC5399n.a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker.C134761
            if (r0 == 0) goto L13
            r0 = r5
            com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker$doWork$1 r0 = (com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker.C134761) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker$doWork$1 r0 = new com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker$doWork$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.util.concurrent.CancellationException -> L40
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r5 = r4.m55926i(r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r5 != r1) goto L3d
            return r1
        L3d:
            androidx.work.n$a r5 = (androidx.work.AbstractC5399n.a) r5     // Catch: java.util.concurrent.CancellationException -> L40
            return r5
        L40:
            androidx.work.n$a r4 = androidx.work.AbstractC5399n.a.m28547c()
            java.lang.String r5 = "{\n            // If canc… Result.retry()\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m55926i(kotlin.coroutines.Continuation<? super androidx.work.AbstractC5399n.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker$executeUpload$1
            if (r0 == 0) goto L13
            r0 = r6
            com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker$executeUpload$1 r0 = (com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker$executeUpload$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker$executeUpload$1 r0 = new com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker$executeUpload$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.coroutines.CoroutineContext r6 = r5.workerCoroutineContext
            com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker$executeUpload$2 r2 = new com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker$executeUpload$2
            r4 = 0
            r2.<init>(r5, r4)
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.C30064h.m92775g(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = "@VisibleForTesting\n    s…xt Result.success()\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker.m55926i(kotlin.coroutines.Continuation):java.lang.Object");
    }
}