package com.disney.wdpro.ref_unify_messaging.p433ui;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.DialogInterfaceC0229b;
import cn.C6197g;
import com.disney.wdpro.ref_unify_messaging.model.PushNotificationData;
import com.newrelic.agent.android.api.p476v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

@Instrumented
/* loaded from: classes28.dex */
public class PushNotificationPopupActivity extends Activity implements TraceFieldInterface {
    public Trace _nr_trace;
    private PushNotificationData pushNotificationData;

    /* renamed from: com.disney.wdpro.ref_unify_messaging.ui.PushNotificationPopupActivity$a */
    class DialogInterfaceOnClickListenerC20030a implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC20030a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            PushNotificationPopupActivity.this.finish();
        }
    }

    /* renamed from: com.disney.wdpro.ref_unify_messaging.ui.PushNotificationPopupActivity$b */
    class DialogInterfaceOnCancelListenerC20031b implements DialogInterface.OnCancelListener {
        DialogInterfaceOnCancelListenerC20031b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            PushNotificationPopupActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        TraceMachine.startTracing("PushNotificationPopupActivity");
        try {
            TraceMachine.enterMethod(this._nr_trace, "PushNotificationPopupActivity#onCreate", null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod(null, "PushNotificationPopupActivity#onCreate", null);
        }
        super.onCreate(bundle);
        setContentView(C6197g.activity_push_notification_popup);
        if (bundle != null) {
            this.pushNotificationData = (PushNotificationData) bundle.getSerializable("com.disney.wdpro.ref_unify_messaging.util.PushNotificationConstants.keyNotificationData");
        } else {
            this.pushNotificationData = (PushNotificationData) getIntent().getSerializableExtra("com.disney.wdpro.ref_unify_messaging.util.PushNotificationConstants.keyNotificationData");
        }
        TraceMachine.exitMethod();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.pushNotificationData = (PushNotificationData) intent.getSerializableExtra("com.disney.wdpro.ref_unify_messaging.util.PushNotificationConstants.keyNotificationData");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        new DialogInterfaceC0229b.a(this).setTitle(this.pushNotificationData.getTitle()).mo960h(this.pushNotificationData.getMessage()).mo964l(new DialogInterfaceOnCancelListenerC20031b()).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC20030a()).m972t();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("com.disney.wdpro.ref_unify_messaging.util.PushNotificationConstants.keyNotificationData", this.pushNotificationData);
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