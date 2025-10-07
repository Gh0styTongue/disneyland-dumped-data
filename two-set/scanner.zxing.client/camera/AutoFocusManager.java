package com.disney.wdpro.scanner.zxing.client.camera;

import android.hardware.Camera;
import android.os.Bundle;
import com.disney.wdpro.recommender.core.themer.RecommenderThemerConstants;
import com.disney.wdpro.scanner.zxing.client.utils.Constants;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;
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

@Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u0006\u0010\u0013\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0018\u00010\nR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m92038d2 = {"Lcom/disney/wdpro/scanner/zxing/client/camera/AutoFocusManager;", "Landroid/hardware/Camera$AutoFocusCallback;", "camera", "Landroid/hardware/Camera;", "prefs", "Landroid/os/Bundle;", "(Landroid/hardware/Camera;Landroid/os/Bundle;)V", "focusing", "", "outstandingTask", "Lcom/disney/wdpro/scanner/zxing/client/camera/AutoFocusManager$AutoFocusTask;", "stopped", "useAutoFocus", "autoFocusAgainLater", "", "cancelOutstandingTask", "onAutoFocus", "success", "theCamera", RecommenderThemerConstants.START, "stop", "AutoFocusTask", "Companion", "scanner-zxing_release"}, m92039k = 1, m92040mv = {1, 6, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes17.dex */
public final class AutoFocusManager implements Camera.AutoFocusCallback {
    private static final long AUTO_FOCUS_INTERVAL_MS = 600;
    private static Collection<String> FOCUS_MODES_CALLING_AF;
    private final Camera camera;
    private boolean focusing;
    private AutoFocusTask outstandingTask;
    private boolean stopped;
    private final boolean useAutoFocus;
    private static final String TAG = AutoFocusManager.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/scanner/zxing/client/camera/AutoFocusManager$AutoFocusTask;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/disney/wdpro/scanner/zxing/client/camera/AutoFocusManager;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "doInBackground", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "()V", "cancel", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/p1;", "job", "Lkotlinx/coroutines/p1;", "scanner-zxing_release"}, m92039k = 1, m92040mv = {1, 6, 0}, m92042xi = 48)
    final class AutoFocusTask {
        private final CoroutineDispatcher dispatcher;
        private InterfaceC30139p1 job;

        public AutoFocusTask(AutoFocusManager this$0, CoroutineDispatcher dispatcher) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            AutoFocusManager.this = this$0;
            this.dispatcher = dispatcher;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object doInBackground(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager$AutoFocusTask$doInBackground$1
                if (r0 == 0) goto L13
                r0 = r5
                com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager$AutoFocusTask$doInBackground$1 r0 = (com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager$AutoFocusTask$doInBackground$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager$AutoFocusTask$doInBackground$1 r0 = new com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager$AutoFocusTask$doInBackground$1
                r0.<init>(r4, r5)
            L18:
                java.lang.Object r5 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.L$0
                com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager$AutoFocusTask r4 = (com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager.AutoFocusTask) r4
                kotlin.ResultKt.throwOnFailure(r5)
                goto L45
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                kotlin.ResultKt.throwOnFailure(r5)
                r0.L$0 = r4
                r0.label = r3
                r2 = 600(0x258, double:2.964E-321)
                java.lang.Object r5 = kotlinx.coroutines.DelayKt.m92134b(r2, r0)
                if (r5 != r1) goto L45
                return r1
            L45:
                com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager r4 = com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager.this
                r4.start()
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager.AutoFocusTask.doInBackground(kotlin.coroutines.Continuation):java.lang.Object");
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
            InterfaceC30139p1 interfaceC30139p1M92948d = C30113j.m92948d(C30069i0.m92780a(this.dispatcher), null, null, new AutoFocusManager$AutoFocusTask$execute$1(this, null), 3, null);
            this.job = interfaceC30139p1M92948d;
            if (interfaceC30139p1M92948d == null) {
                Intrinsics.throwUninitializedPropertyAccessException("job");
            } else {
                interfaceC30139p1 = interfaceC30139p1M92948d;
            }
            interfaceC30139p1.mo92220r(new Function1<Throwable, Unit>() { // from class: com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager$AutoFocusTask$execute$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    if (th2 != null) {
                        LogInstrumentation.m79026e(AutoFocusManager.TAG, Intrinsics.stringPlus("Error completing AutoFocusTask: ", th2));
                    }
                }
            });
        }

        public /* synthetic */ AutoFocusTask(CoroutineDispatcher coroutineDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(AutoFocusManager.this, (i10 & 1) != 0 ? C30180u0.m93206a() : coroutineDispatcher);
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        FOCUS_MODES_CALLING_AF = arrayList;
        arrayList.add("auto");
        FOCUS_MODES_CALLING_AF.add("macro");
    }

    public AutoFocusManager(Camera camera, Bundle prefs) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.camera = camera;
        String focusMode = camera.getParameters().getFocusMode();
        boolean z10 = prefs.getBoolean(Constants.KEY_AUTO_FOCUS, true) && FOCUS_MODES_CALLING_AF.contains(focusMode);
        this.useAutoFocus = z10;
        LogInstrumentation.m79028i(TAG, "Current focus mode '" + ((Object) focusMode) + "'; use auto focus? " + z10);
        start();
    }

    private final synchronized void autoFocusAgainLater() {
        if (!this.stopped && this.outstandingTask == null) {
            AutoFocusTask autoFocusTask = new AutoFocusTask(null, 1, 0 == true ? 1 : 0);
            try {
                autoFocusTask.execute();
                this.outstandingTask = autoFocusTask;
            } catch (RejectedExecutionException e10) {
                LogInstrumentation.m79033w(TAG, "Could not request auto focus", e10);
            }
        }
    }

    private final synchronized void cancelOutstandingTask() {
        AutoFocusTask autoFocusTask = this.outstandingTask;
        if (autoFocusTask != null) {
            Intrinsics.checkNotNull(autoFocusTask);
            autoFocusTask.cancel();
            this.outstandingTask = null;
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public synchronized void onAutoFocus(boolean success, Camera theCamera) {
        Intrinsics.checkNotNullParameter(theCamera, "theCamera");
        this.focusing = false;
        autoFocusAgainLater();
    }

    public final synchronized void start() {
        if (this.useAutoFocus) {
            this.outstandingTask = null;
            if (!this.stopped && !this.focusing) {
                try {
                    this.camera.autoFocus(this);
                    this.focusing = true;
                } catch (RuntimeException e10) {
                    LogInstrumentation.m79033w(TAG, "Unexpected exception while focusing", e10);
                    autoFocusAgainLater();
                }
            }
        }
    }

    public final synchronized void stop() {
        this.stopped = true;
        if (this.useAutoFocus) {
            cancelOutstandingTask();
            try {
                this.camera.cancelAutoFocus();
            } catch (RuntimeException e10) {
                LogInstrumentation.m79033w(TAG, "Unexpected exception while cancelling focusing", e10);
            }
        }
    }
}