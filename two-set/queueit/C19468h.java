package com.disney.wdpro.queueit;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Instrumented
/* renamed from: com.disney.wdpro.queueit.h */
/* loaded from: classes16.dex */
public class C19468h {
    private static final int INITIAL_WAIT_RETRY_SEC = 1;
    private static final int MAX_RETRY_SEC = 10;
    private static final Pattern pattern = Pattern.compile("\\~rt_(.*?)\\~");
    private Handler _checkConnectionHandler;
    private Context _context;
    private final String _customerId;
    private int _deltaSec;
    private final String _eventOrAliasId;
    private final String _language;
    private final String _layoutName;
    private final InterfaceC19469i _queueITWaitingRoomProviderListener;
    private int _isOnlineRetry = 0;
    private c _checkConnectionRunner = new c(this);
    private final AtomicBoolean _requestInProgress = new AtomicBoolean(false);

    @Instrumented
    /* renamed from: com.disney.wdpro.queueit.h$a */
    class a implements InterfaceC19466f {
        final /* synthetic */ String val$enqueueKey;
        final /* synthetic */ String val$enqueueToken;

        a(String str, String str2) {
            this.val$enqueueToken = str;
            this.val$enqueueKey = str2;
        }

        @Override // com.disney.wdpro.queueit.InterfaceC19466f
        /* renamed from: a */
        public void mo61055a(String str, String str2, int i10, String str3, String str4) {
            C19468h.this.m61077o(str, str2, i10, str3, str4);
            C19468h.this._requestInProgress.set(false);
        }

        @Override // com.disney.wdpro.queueit.InterfaceC19466f
        /* renamed from: b */
        public void mo61056b(String str, int i10) {
            LogInstrumentation.m79030v("WaitingRoomProvider", String.format("Error: %s: %s", Integer.valueOf(i10), str));
            if (i10 < 400 || i10 >= 500) {
                C19468h.this.m61074k(this.val$enqueueToken, this.val$enqueueKey);
            } else {
                C19468h.this._queueITWaitingRoomProviderListener.mo61062a(String.format("Error %s (%s)", str, Integer.valueOf(i10)), Error.INVALID_RESPONSE);
                C19468h.this._requestInProgress.set(false);
            }
        }
    }

    /* renamed from: com.disney.wdpro.queueit.h$b */
    class b implements Runnable {
        final /* synthetic */ String val$enqueueKey;
        final /* synthetic */ String val$enqueueToken;

        b(String str, String str2) {
            this.val$enqueueToken = str;
            this.val$enqueueKey = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C19468h.this.m61080r(this.val$enqueueToken, this.val$enqueueKey);
        }
    }

    public C19468h(Activity activity, String str, String str2, String str3, String str4, InterfaceC19469i interfaceC19469i) {
        C19480t.m61131b(activity);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("customerId must have a value");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("eventOrAliasId must have a value");
        }
        this._context = activity;
        this._customerId = str;
        this._eventOrAliasId = str2;
        this._layoutName = str3;
        this._language = str4;
        this._queueITWaitingRoomProviderListener = interfaceC19469i;
        this._deltaSec = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m61074k(String str, String str2) {
        if (this._deltaSec < 10) {
            new Handler().postDelayed(new b(str, str2), this._deltaSec * 1000);
            this._deltaSec *= 2;
        } else {
            this._deltaSec = 1;
            this._requestInProgress.set(false);
            this._queueITWaitingRoomProviderListener.mo61062a("Error! Queue is unavailable.", Error.Queueit_NotAvailable);
        }
    }

    /* renamed from: l */
    private static RedirectType m61075l(String str) {
        if (str == null || str.isEmpty()) {
            return RedirectType.queue;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String strGroup = matcher.group(0);
            return RedirectType.valueOf(strGroup.length() > 0 ? strGroup.replace("~rt_", "").replace("~", "") : "");
        }
        LogInstrumentation.m79026e("QueueEngine", String.format("Waiting room status not found in the token: %s", str));
        return RedirectType.unknown;
    }

    /* renamed from: n */
    private String m61076n() {
        return Settings.Secure.getString(this._context.getContentResolver(), "android_id");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m61077o(String str, String str2, int i10, String str3, String str4) {
        this._queueITWaitingRoomProviderListener.mo61063b(new C19474n(str4, str2, str3, i10, (str4 == null || str4.isEmpty()) ? false : true, m61075l(str4)));
        this._requestInProgress.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public boolean m61078p() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this._context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m61079q(String str, String str2) {
        m61080r(str, str2);
        this._requestInProgress.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m61080r(String str, String str2) {
        new C19465e(this._customerId, this._eventOrAliasId, m61076n(), C19480t.m61130a(), m61081m(), this._layoutName, this._language, str, str2, new a(str, str2)).m61054h(this._context);
    }

    /* renamed from: m */
    public String m61081m() {
        return "Android-2.0.0";
    }

    /* renamed from: s */
    public void m61082s() throws QueueITException {
        if (this._requestInProgress.getAndSet(true)) {
            throw new QueueITException("Request is already in progress");
        }
        this._checkConnectionRunner = new c(this);
        this._checkConnectionHandler = new Handler();
        this._checkConnectionRunner.run();
    }

    /* renamed from: com.disney.wdpro.queueit.h$c */
    private class c implements Runnable {
        private final String _enqueueKey;
        private final String _enqueueToken;

        public c(String str, String str2) {
            this._enqueueToken = str;
            this._enqueueKey = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19468h.this.m61078p()) {
                C19468h.this.m61079q(this._enqueueToken, this._enqueueKey);
                return;
            }
            C19468h.this._isOnlineRetry++;
            if (C19468h.this._isOnlineRetry <= 5) {
                C19468h.this._checkConnectionHandler.postDelayed(this, 1000L);
            } else {
                C19468h.this._queueITWaitingRoomProviderListener.mo61062a("No connection", Error.NO_CONNECTION);
                C19468h.this._requestInProgress.set(false);
            }
        }

        public c(C19468h c19468h) {
            this(null, null);
        }
    }
}