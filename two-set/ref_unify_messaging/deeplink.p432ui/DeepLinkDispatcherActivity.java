package com.disney.wdpro.ref_unify_messaging.deeplink.p432ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import cn.C6201k;
import cn.InterfaceC6200j;
import com.disney.wdpro.park.deeplink.C17879z;
import com.newrelic.agent.android.api.p476v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.util.Date;
import javax.inject.Inject;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Instrumented
@Deprecated
/* loaded from: classes28.dex */
public class DeepLinkDispatcherActivity extends Activity implements TraceFieldInterface {
    public Trace _nr_trace;

    @Inject
    protected C6201k refUnifyMessagingConfig;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        TraceMachine.startTracing("DeepLinkDispatcherActivity");
        try {
            TraceMachine.enterMethod(this._nr_trace, "DeepLinkDispatcherActivity#onCreate", null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod(null, "DeepLinkDispatcherActivity#onCreate", null);
        }
        super.onCreate(bundle);
        ((InterfaceC6200j) getApplication()).mo29680k().mo29679a(this);
        Intent intent = new Intent(this, this.refUnifyMessagingConfig.m29681a());
        if ((getIntent().getFlags() & 1048576) == 0) {
            intent.putExtra("deeplink_timestamp", new Date().getTime());
            intent.putExtra(C17879z.IS_DEEP_LINK, true);
            intent.addFlags(67108864);
            intent.addFlags(PKIFailureInfo.duplicateCertReq);
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                intent.putExtras(extras);
            }
            Uri data = getIntent().getData();
            if (data != null) {
                intent.setData(data);
            }
        }
        startActivity(intent);
        finish();
        TraceMachine.exitMethod();
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