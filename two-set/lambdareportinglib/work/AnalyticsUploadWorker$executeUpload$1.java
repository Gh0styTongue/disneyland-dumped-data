package com.disney.wdpro.lambdareportinglib.work;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
@DebugMetadata(m92052c = "com.disney.wdpro.lambdareportinglib.work.AnalyticsUploadWorker", m92053f = "AnalyticsUploadWorker.kt", m92054i = {}, m92055l = {52}, m92056m = "executeUpload", m92057n = {}, m92058s = {})
/* loaded from: classes29.dex */
final class AnalyticsUploadWorker$executeUpload$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AnalyticsUploadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalyticsUploadWorker$executeUpload$1(AnalyticsUploadWorker analyticsUploadWorker, Continuation<? super AnalyticsUploadWorker$executeUpload$1> continuation) {
        super(continuation);
        this.this$0 = analyticsUploadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m55926i(this);
    }
}