package com.disney.wdpro.scanner.zxing.client;

import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m92037d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m92038d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m92039k = 3, m92040mv = {1, 6, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes17.dex */
final class InactivityTimer$InactivityCoroutineTask$execute$2 extends Lambda implements Function1<Throwable, Unit> {
    public static final InactivityTimer$InactivityCoroutineTask$execute$2 INSTANCE = ;

    InactivityTimer$InactivityCoroutineTask$execute$2() {
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(Throwable th2) {
        if (th2 != null) {
            LogInstrumentation.m79026e(InactivityTimer.TAG, Intrinsics.stringPlus("Error completing AutoFocusTask: ", th2));
        }
    }
}