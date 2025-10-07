package com.disney.wdpro.lambdareportinglib.work;

import androidx.work.AbstractC5399n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Landroidx/work/n$a;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Landroidx/work/n$a;"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker$executeUpload$2", m92053f = "AnalyticsUploadWorker.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
@SourceDebugExtension({"SMAP\nAnalyticsUploadWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsUploadWorker.kt\ncom/disney/wdpro/lambdareportinglib/work/AnalyticsUploadWorker$executeUpload$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n766#2:160\n857#2,2:161\n1747#2,3:164\n1855#2,2:167\n1#3:163\n*S KotlinDebug\n*F\n+ 1 AnalyticsUploadWorker.kt\ncom/disney/wdpro/lambdareportinglib/work/AnalyticsUploadWorker$executeUpload$2\n*L\n60#1:160\n60#1:161,2\n69#1:164,3\n74#1:167,2\n*E\n"})
/* loaded from: classes29.dex */
final class AnalyticsUploadWorker$executeUpload$2 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super AbstractC5399n.a>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnalyticsUploadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalyticsUploadWorker$executeUpload$2(AnalyticsUploadWorker analyticsUploadWorker, Continuation<? super AnalyticsUploadWorker$executeUpload$2> continuation) {
        super(2, continuation);
        this.this$0 = analyticsUploadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AnalyticsUploadWorker$executeUpload$2 analyticsUploadWorker$executeUpload$2 = new AnalyticsUploadWorker$executeUpload$2(this.this$0, continuation);
        analyticsUploadWorker$executeUpload$2.L$0 = obj;
        return analyticsUploadWorker$executeUpload$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.label
            if (r0 != 0) goto Ldb
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.h0 r8 = (kotlinx.coroutines.InterfaceC30065h0) r8
            com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker r0 = r7.this$0
            java.lang.String r0 = com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker.m55919e(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L1f
            androidx.work.n$a r7 = androidx.work.AbstractC5399n.a.m28545a()
            return r7
        L1f:
            java.time.LocalDateTime r0 = java.time.LocalDateTime.now()
            r1 = 2
            java.time.LocalDateTime r0 = r0.minusDays(r1)
            com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker r1 = r7.this$0
            ck.a r1 = com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker.m55917c(r1)
            com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker r2 = r7.this$0
            java.lang.String r2 = com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker.m55919e(r2)
            java.util.List r1 = r1.m29660c(r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker r2 = r7.this$0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L46:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r1.next()
            r5 = r4
            dk.a r5 = (dk.AnalyticEvent) r5
            java.lang.String r6 = "localTimeThreshold"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            boolean r5 = com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker.m55922h(r2, r5, r0)
            if (r5 == 0) goto L46
            r3.add(r4)
            goto L46
        L62:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L6d
            androidx.work.n$a r7 = androidx.work.AbstractC5399n.a.m28548d()
            return r7
        L6d:
            com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker r0 = r7.this$0
            com.disney.wdpro.httpclient.authentication.AuthenticationManager r0 = com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker.m55918d(r0)
            boolean r0 = r0.isUserAuthenticated()
            if (r0 != 0) goto L7e
            androidx.work.n$a r7 = androidx.work.AbstractC5399n.a.m28547c()
            return r7
        L7e:
            boolean r0 = r3.isEmpty()
            r1 = 1
            if (r0 == 0) goto L86
            goto L9f
        L86:
            java.util.Iterator r0 = r3.iterator()
        L8a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9f
            java.lang.Object r2 = r0.next()
            dk.a r2 = (dk.AnalyticEvent) r2
            com.disney.wdpro.lambdareportinglib.repository.db.models.UploadState r2 = r2.getUploadState()
            com.disney.wdpro.lambdareportinglib.repository.db.models.UploadState r4 = com.disney.wdpro.lambdareportinglib.repository.p143db.models.UploadState.SERVICE_BAD_REQUEST
            if (r2 != r4) goto L8a
            goto La5
        L9f:
            int r0 = r3.size()
            if (r0 != r1) goto Ld1
        La5:
            com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker r7 = r7.this$0
            java.util.Iterator r0 = r3.iterator()
            r2 = 0
        Lac:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lc5
            java.lang.Object r3 = r0.next()
            dk.a r3 = (dk.AnalyticEvent) r3
            kotlinx.coroutines.C30069i0.m92786g(r8)
            com.disney.wdpro.photopass.services.model.lambdareporting.AnalyticsResponse r3 = com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker.m55921g(r7, r3)
            boolean r3 = r3 instanceof com.disney.wdpro.photopass.services.model.lambdareporting.AnalyticsResponse.ServiceError
            if (r3 == 0) goto Lac
            r2 = r1
            goto Lac
        Lc5:
            if (r2 == 0) goto Lcc
            androidx.work.n$a r7 = androidx.work.AbstractC5399n.a.m28547c()
            return r7
        Lcc:
            androidx.work.n$a r7 = androidx.work.AbstractC5399n.a.m28548d()
            return r7
        Ld1:
            kotlinx.coroutines.C30069i0.m92786g(r8)
            com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker r7 = r7.this$0
            androidx.work.n$a r7 = com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker.m55920f(r7, r3)
            return r7
        Ldb:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker$executeUpload$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super AbstractC5399n.a> continuation) {
        return ((AnalyticsUploadWorker$executeUpload$2) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}