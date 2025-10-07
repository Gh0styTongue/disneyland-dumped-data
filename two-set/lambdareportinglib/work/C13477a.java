package com.disney.wdpro.lambdareportinglib.work;

import android.content.Context;
import androidx.work.AbstractC5399n;
import androidx.work.AbstractC5411z;
import androidx.work.WorkerParameters;
import ck.C6187a;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

@Singleton
@Metadata(m92037d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, m92038d2 = {"Lcom/disney/wdpro/lambdareportinglib/work/a;", "Landroidx/work/z;", "Lck/a;", "analyticsRepository", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authenticationManager", "<init>", "(Lck/a;Lkotlin/coroutines/CoroutineContext;Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;)V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/n;", "a", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/n;", "Lck/a;", "Lkotlin/coroutines/CoroutineContext;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "lambdareporting_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.lambdareportinglib.work.a */
/* loaded from: classes29.dex */
public final class C13477a extends AbstractC5411z {
    private final C6187a analyticsRepository;
    private final AuthenticationManager authenticationManager;
    private final CoroutineContext coroutineContext;

    @Inject
    public C13477a(C6187a analyticsRepository, @Named("LambdaCoroutineContext") CoroutineContext coroutineContext, AuthenticationManager authenticationManager) {
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(authenticationManager, "authenticationManager");
        this.analyticsRepository = analyticsRepository;
        this.coroutineContext = coroutineContext;
        this.authenticationManager = authenticationManager;
    }

    @Override // androidx.work.AbstractC5411z
    /* renamed from: a */
    public AbstractC5399n mo28242a(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        if (Intrinsics.areEqual(workerClassName, AnalyticEnqueueWorker.class.getName())) {
            return new AnalyticEnqueueWorker(appContext, workerParameters, this.analyticsRepository);
        }
        if (Intrinsics.areEqual(workerClassName, AnalyticsUploadWorker.class.getName())) {
            return new AnalyticsUploadWorker(appContext, workerParameters, this.analyticsRepository, this.coroutineContext, this.authenticationManager);
        }
        return null;
    }
}