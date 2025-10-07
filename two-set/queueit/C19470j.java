package com.disney.wdpro.queueit;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.provider.Settings;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;

@Instrumented
/* renamed from: com.disney.wdpro.queueit.j */
/* loaded from: classes16.dex */
public class C19470j {
    private Context _context;
    private final C19471k _options;
    private final AbstractC19472l _queueListener;
    private final InterfaceC19462b _stateBroadcaster;
    private int _delayInterval = 0;
    private final BroadcastReceiver _queuePassedBroadcastReceiver = new b();
    private final BroadcastReceiver _queueErrorBroadcastReceiver = new c();
    private final BroadcastReceiver _queueUrlChangedBroadcastReceiver = new d();
    private final BroadcastReceiver _queueUserExitedBroadcastReceiver = new e();
    private final BroadcastReceiver _webViewClosedBroadcastReceiver = new f();
    private final BroadcastReceiver _webViewOnSessionRestartReceiver = new g();
    private final BroadcastReceiver _queueActivityClosedBroadcastReceiver = new h();

    /* renamed from: com.disney.wdpro.queueit.j$a */
    class a implements Runnable {
        final /* synthetic */ C19474n val$queueTryPassResult;
        final /* synthetic */ String val$webViewUserAgent;

        a(C19474n c19474n, String str) {
            this.val$queueTryPassResult = c19474n;
            this.val$webViewUserAgent = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C19470j.this.m61107z(this.val$queueTryPassResult.m61117b(), this.val$queueTryPassResult.m61119d(), this.val$webViewUserAgent);
        }
    }

    /* renamed from: com.disney.wdpro.queueit.j$b */
    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C19470j.this.m61102t(intent.getStringExtra("queue-it-token"));
        }
    }

    /* renamed from: com.disney.wdpro.queueit.j$c */
    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C19470j.this._queueListener.onError(Error.SSL_ERROR, intent.getStringExtra("error-message"));
        }
    }

    /* renamed from: com.disney.wdpro.queueit.j$d */
    class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C19470j.this.m61103u(intent.getExtras().getString("url"));
        }
    }

    /* renamed from: com.disney.wdpro.queueit.j$e */
    class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C19470j.this.m61105w();
        }
    }

    /* renamed from: com.disney.wdpro.queueit.j$f */
    class f extends BroadcastReceiver {
        f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C19470j.this.m61106x();
        }
    }

    /* renamed from: com.disney.wdpro.queueit.j$g */
    class g extends BroadcastReceiver {
        g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C19470j.this.m61101s();
        }
    }

    /* renamed from: com.disney.wdpro.queueit.j$h */
    class h extends BroadcastReceiver {
        h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C19470j.this.m61100r();
            C19470j.this._stateBroadcaster.mo61027h(C19470j.this._queuePassedBroadcastReceiver, C19470j.this._queueUrlChangedBroadcastReceiver, C19470j.this._queueActivityClosedBroadcastReceiver, C19470j.this._queueUserExitedBroadcastReceiver, C19470j.this._queueErrorBroadcastReceiver, C19470j.this._webViewClosedBroadcastReceiver, C19470j.this._webViewOnSessionRestartReceiver);
        }
    }

    public C19470j(Activity activity, AbstractC19472l abstractC19472l, C19471k c19471k) {
        c19471k = c19471k == null ? C19471k.m61109a() : c19471k;
        C19480t.m61131b(activity);
        this._context = activity;
        this._queueListener = abstractC19472l;
        this._stateBroadcaster = new C19481u(activity);
        this._options = c19471k;
    }

    /* renamed from: q */
    private String m61099q() {
        return Settings.Secure.getString(this._context.getContentResolver(), "android_id");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m61100r() {
        this._queueListener.onQueueActivityClosed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m61101s() {
        this._queueListener.onSessionRestart(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m61102t(String str) {
        this._queueListener.onQueuePassed(new C19473m(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m61103u(String str) {
        this._queueListener.onQueueUrlChanged(str);
    }

    /* renamed from: v */
    private void m61104v() {
        this._queueListener.onQueueViewWillOpen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m61105w() {
        this._queueListener.onUserExited();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m61106x() {
        this._queueListener.onWebViewClosed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m61107z(String str, String str2, String str3) {
        this._stateBroadcaster.mo61021b(this._queuePassedBroadcastReceiver, this._queueUrlChangedBroadcastReceiver, this._queueActivityClosedBroadcastReceiver, this._queueUserExitedBroadcastReceiver, this._queueErrorBroadcastReceiver, this._webViewClosedBroadcastReceiver, this._webViewOnSessionRestartReceiver);
        Intent intent = new Intent(this._context, (Class<?>) QueueActivity.class);
        intent.putExtra("queueUrl", str);
        intent.putExtra("targetUrl", str2);
        intent.putExtra("webViewUserAgent", str3);
        intent.putExtra(AnalyticsAttribute.USER_ID_ATTRIBUTE, m61099q());
        intent.putExtra("options", this._options);
        this._context.startActivity(intent);
    }

    /* renamed from: y */
    public void m61108y(C19474n c19474n, String str) {
        if (c19474n == null) {
            LogInstrumentation.m79026e("QueueITWaitingRoomView", "queuePassedInfo parameter is empty");
        } else {
            m61104v();
            new Handler().postDelayed(new a(c19474n, str), this._delayInterval);
        }
    }
}