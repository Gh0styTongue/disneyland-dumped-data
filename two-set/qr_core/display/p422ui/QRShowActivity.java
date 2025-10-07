package com.disney.wdpro.qr_core.display.p422ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.disney.wdpro.qr_core.QRStyle;
import com.disney.wdpro.qr_core.display.p422ui.ConsentDialogFragment;
import com.newrelic.agent.android.api.p476v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p916rm.C31926e;
import p916rm.C31927f;

@Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/display/ui/QRShowActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/disney/wdpro/qr_core/display/ui/ConsentDialogFragment$b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "cancel", "d", "Companion", "a", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes16.dex */
public final class QRShowActivity extends AppCompatActivity implements ConsentDialogFragment.InterfaceC19432b, TraceFieldInterface {
    public static final int SHOW_QR_REQUEST_CODE = 8888;
    private static final String STYLE = "STYLE";
    public Trace _nr_trace;

    @Override // com.disney.wdpro.qr_core.display.p422ui.ConsentDialogFragment.InterfaceC19432b
    public void cancel() {
        setResult(0);
        finish();
    }

    @Override // com.disney.wdpro.qr_core.display.p422ui.ConsentDialogFragment.InterfaceC19432b
    /* renamed from: d */
    public void mo60889d() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        TraceMachine.startTracing("QRShowActivity");
        try {
            TraceMachine.enterMethod(this._nr_trace, "QRShowActivity#onCreate", null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod(null, "QRShowActivity#onCreate", null);
        }
        super.onCreate(savedInstanceState);
        setContentView(C31927f.activity_qr_show);
        Serializable serializableExtra = getIntent().getSerializableExtra(STYLE);
        if (serializableExtra == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required value was null.");
            TraceMachine.exitMethod();
            throw illegalArgumentException;
        }
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.disney.wdpro.qr_core.QRStyle");
        QRStyle qRStyle = (QRStyle) serializableExtra;
        if (savedInstanceState == null) {
            getSupportFragmentManager().m19761r().m19861b(C31926e.container, QRShowFragment.INSTANCE.m60932a(QRShowFragmentState.SHOW_QRCODE, qRStyle)).mo19611k();
        }
        TraceMachine.exitMethod();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        ApplicationStateMonitor.getInstance().activityStarted();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        ApplicationStateMonitor.getInstance().activityStopped();
    }
}