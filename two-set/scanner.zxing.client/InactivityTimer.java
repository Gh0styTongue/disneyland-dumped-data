package com.disney.wdpro.scanner.zxing.client;

import com.disney.wdpro.scanner.zxing.client.interfaces.ErrorHandler;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C30069i0;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.C30180u0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC30139p1;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/scanner/zxing/client/InactivityTimer;", "", "errorHandler", "Lcom/disney/wdpro/scanner/zxing/client/interfaces/ErrorHandler;", "inactivityTimeOut", "", "(Lcom/disney/wdpro/scanner/zxing/client/interfaces/ErrorHandler;I)V", "inactivityTask", "Lcom/disney/wdpro/scanner/zxing/client/InactivityTimer$InactivityCoroutineTask;", "cancel", "", "onActivity", "onPause", "onResume", "shutdown", "Companion", "InactivityCoroutineTask", "scanner-zxing_release"}, m92039k = 1, m92040mv = {1, 6, 0}, m92042xi = 48)
/* loaded from: classes17.dex */
public final class InactivityTimer {
    private static final String TAG = InactivityTimer.class.getSimpleName();
    private final ErrorHandler errorHandler;
    private InactivityCoroutineTask inactivityTask;
    private final int inactivityTimeOut;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/scanner/zxing/client/InactivityTimer$InactivityCoroutineTask;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/disney/wdpro/scanner/zxing/client/InactivityTimer;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "doInBackground", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "()V", "cancel", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/p1;", "job", "Lkotlinx/coroutines/p1;", "scanner-zxing_release"}, m92039k = 1, m92040mv = {1, 6, 0}, m92042xi = 48)
    @Instrumented
    final class InactivityCoroutineTask {
        private final CoroutineDispatcher dispatcher;
        private InterfaceC30139p1 job;

        public InactivityCoroutineTask(InactivityTimer this$0, CoroutineDispatcher dispatcher) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            InactivityTimer.this = this$0;
            this.dispatcher = dispatcher;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object doInBackground(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                r8 = this;
                boolean r0 = r9 instanceof com.disney.wdpro.scanner.zxing.client.InactivityTimer$InactivityCoroutineTask$doInBackground$1
                if (r0 == 0) goto L13
                r0 = r9
                com.disney.wdpro.scanner.zxing.client.InactivityTimer$InactivityCoroutineTask$doInBackground$1 r0 = (com.disney.wdpro.scanner.zxing.client.InactivityTimer$InactivityCoroutineTask$doInBackground$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.disney.wdpro.scanner.zxing.client.InactivityTimer$InactivityCoroutineTask$doInBackground$1 r0 = new com.disney.wdpro.scanner.zxing.client.InactivityTimer$InactivityCoroutineTask$doInBackground$1
                r0.<init>(r8, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r8 = r0.L$0
                com.disney.wdpro.scanner.zxing.client.InactivityTimer$InactivityCoroutineTask r8 = (com.disney.wdpro.scanner.zxing.client.InactivityTimer.InactivityCoroutineTask) r8
                kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.InterruptedException -> L60
                goto L4d
            L2d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L35:
                kotlin.ResultKt.throwOnFailure(r9)
                com.disney.wdpro.scanner.zxing.client.InactivityTimer r9 = com.disney.wdpro.scanner.zxing.client.InactivityTimer.this     // Catch: java.lang.InterruptedException -> L60
                int r9 = com.disney.wdpro.scanner.zxing.client.InactivityTimer.access$getInactivityTimeOut$p(r9)     // Catch: java.lang.InterruptedException -> L60
                long r4 = (long) r9     // Catch: java.lang.InterruptedException -> L60
                r6 = 1000(0x3e8, double:4.94E-321)
                long r4 = r4 * r6
                r0.L$0 = r8     // Catch: java.lang.InterruptedException -> L60
                r0.label = r3     // Catch: java.lang.InterruptedException -> L60
                java.lang.Object r9 = kotlinx.coroutines.DelayKt.m92134b(r4, r0)     // Catch: java.lang.InterruptedException -> L60
                if (r9 != r1) goto L4d
                return r1
            L4d:
                java.lang.String r9 = com.disney.wdpro.scanner.zxing.client.InactivityTimer.access$getTAG$cp()     // Catch: java.lang.InterruptedException -> L60
                java.lang.String r0 = "calling onScanFailed() due to inactivity"
                com.newrelic.agent.android.instrumentation.LogInstrumentation.m79032w(r9, r0)     // Catch: java.lang.InterruptedException -> L60
                com.disney.wdpro.scanner.zxing.client.InactivityTimer r9 = com.disney.wdpro.scanner.zxing.client.InactivityTimer.this     // Catch: java.lang.InterruptedException -> L60
                com.disney.wdpro.scanner.zxing.client.interfaces.ErrorHandler r9 = com.disney.wdpro.scanner.zxing.client.InactivityTimer.access$getErrorHandler$p(r9)     // Catch: java.lang.InterruptedException -> L60
                r9.reportTimeOut()     // Catch: java.lang.InterruptedException -> L60
                goto L63
            L60:
                r8.cancel()
            L63:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.scanner.zxing.client.InactivityTimer.InactivityCoroutineTask.doInBackground(kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final void cancel() {
            InterfaceC30139p1 interfaceC30139p1 = this.job;
            if (interfaceC30139p1 != null) {
                if (interfaceC30139p1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("job");
                    interfaceC30139p1 = null;
                }
                if (interfaceC30139p1.isActive()) {
                    InterfaceC30139p1 interfaceC30139p12 = this.job;
                    if (interfaceC30139p12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("job");
                        interfaceC30139p12 = null;
                    }
                    InterfaceC30139p1.a.m93025a(interfaceC30139p12, null, 1, null);
                }
            }
        }

        public final void execute() {
            InterfaceC30139p1 interfaceC30139p1 = null;
            InterfaceC30139p1 interfaceC30139p1M92948d = C30113j.m92948d(C30069i0.m92780a(this.dispatcher), null, null, new InactivityTimer$InactivityCoroutineTask$execute$1(this, null), 3, null);
            this.job = interfaceC30139p1M92948d;
            if (interfaceC30139p1M92948d == null) {
                Intrinsics.throwUninitializedPropertyAccessException("job");
            } else {
                interfaceC30139p1 = interfaceC30139p1M92948d;
            }
            interfaceC30139p1.mo92220r(new Function1<Throwable, Unit>() { // from class: com.disney.wdpro.scanner.zxing.client.InactivityTimer$InactivityCoroutineTask$execute$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    if (th2 != null) {
                        LogInstrumentation.m79026e(InactivityTimer.TAG, Intrinsics.stringPlus("Error completing AutoFocusTask: ", th2));
                    }
                }
            });
        }

        public /* synthetic */ InactivityCoroutineTask(CoroutineDispatcher coroutineDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(InactivityTimer.this, (i10 & 1) != 0 ? C30180u0.m93206a() : coroutineDispatcher);
        }
    }

    public InactivityTimer(ErrorHandler errorHandler, int i10) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
        this.inactivityTimeOut = i10;
    }

    private final synchronized void cancel() {
        InactivityCoroutineTask inactivityCoroutineTask = this.inactivityTask;
        if (inactivityCoroutineTask != null) {
            inactivityCoroutineTask.cancel();
            this.inactivityTask = null;
        }
    }

    public final synchronized void onActivity() {
        cancel();
        InactivityCoroutineTask inactivityCoroutineTask = new InactivityCoroutineTask(null, 1, 0 == true ? 1 : 0);
        this.inactivityTask = inactivityCoroutineTask;
        inactivityCoroutineTask.execute();
    }

    public final synchronized void onPause() {
        cancel();
    }

    public final synchronized void onResume() {
        onActivity();
    }

    public final void shutdown() {
        cancel();
    }
}