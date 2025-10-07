package com.disney.wdpro.queueit;

import android.app.Activity;
import android.os.Bundle;
import com.newrelic.agent.android.api.p476v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

@Instrumented
/* loaded from: classes16.dex */
public class QueueActivity extends Activity implements TraceFieldInterface {
    public Trace _nr_trace;
    private C19463c base = new C19463c(this);

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.base.m61037h().m61111c()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        TraceMachine.startTracing("QueueActivity");
        try {
            TraceMachine.enterMethod(this._nr_trace, "QueueActivity#onCreate", null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod(null, "QueueActivity#onCreate", null);
        }
        super.onCreate(bundle);
        this.base.m61038i(bundle);
        TraceMachine.exitMethod();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.base.m61036f();
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.base.m61039k(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        ApplicationStateMonitor.getInstance().activityStarted();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        ApplicationStateMonitor.getInstance().activityStopped();
    }
}