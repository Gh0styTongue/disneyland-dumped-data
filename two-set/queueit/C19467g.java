package com.disney.wdpro.queueit;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.disney.wdpro.queueit.g */
/* loaded from: classes16.dex */
public class C19467g {
    private AbstractC19472l _queueITEngineListener;
    private C19468h _queueITWaitingRoomProvider;
    private C19470j _queueITWaitingRoomView;
    private C19474n _queueTryPassResult;

    /* renamed from: com.disney.wdpro.queueit.g$a */
    class a extends AbstractC19472l {
        a() {
        }

        @Override // com.disney.wdpro.queueit.AbstractC19472l
        protected void onError(Error error, String str) {
            C19467g.this._queueITEngineListener.onError(error, str);
        }

        @Override // com.disney.wdpro.queueit.AbstractC19472l
        protected void onQueueActivityClosed() {
            C19467g.this._queueITEngineListener.onQueueActivityClosed();
        }

        @Override // com.disney.wdpro.queueit.AbstractC19472l
        protected void onQueueDisabled(C19464d c19464d) {
            C19467g.this._queueITEngineListener.onQueueDisabled(c19464d);
        }

        @Override // com.disney.wdpro.queueit.AbstractC19472l
        protected void onQueueItUnavailable() {
            C19467g.this._queueITEngineListener.onQueueItUnavailable();
        }

        @Override // com.disney.wdpro.queueit.AbstractC19472l
        protected void onQueuePassed(C19473m c19473m) {
            C19467g.this._queueITEngineListener.onQueuePassed(c19473m);
        }

        @Override // com.disney.wdpro.queueit.AbstractC19472l
        protected void onQueueUrlChanged(String str) {
            C19467g.this._queueITEngineListener.onQueueUrlChanged(str);
        }

        @Override // com.disney.wdpro.queueit.AbstractC19472l
        protected void onQueueViewWillOpen() {
            C19467g.this._queueITEngineListener.onQueueViewWillOpen();
        }

        @Override // com.disney.wdpro.queueit.AbstractC19472l
        public void onSessionRestart(C19467g c19467g) {
            C19467g.this._queueITEngineListener.onSessionRestart(C19467g.this);
        }

        @Override // com.disney.wdpro.queueit.AbstractC19472l
        public void onUserExited() {
            C19467g.this._queueITEngineListener.onUserExited();
        }

        @Override // com.disney.wdpro.queueit.AbstractC19472l
        public void onWebViewClosed() {
            C19467g.this._queueITEngineListener.onWebViewClosed();
        }
    }

    /* renamed from: com.disney.wdpro.queueit.g$b */
    class b implements InterfaceC19469i {
        final /* synthetic */ AbstractC19472l val$queueITQueueListener;
        final /* synthetic */ String val$webViewUserAgent;

        b(AbstractC19472l abstractC19472l, String str) {
            this.val$queueITQueueListener = abstractC19472l;
            this.val$webViewUserAgent = str;
        }

        @Override // com.disney.wdpro.queueit.InterfaceC19469i
        /* renamed from: a */
        public void mo61062a(String str, Error error) {
            if (error == Error.Queueit_NotAvailable) {
                C19467g.this._queueITEngineListener.onQueueItUnavailable();
            } else {
                C19467g.this._queueITEngineListener.onError(error, str);
            }
        }

        @Override // com.disney.wdpro.queueit.InterfaceC19469i
        /* renamed from: b */
        public void mo61063b(C19474n c19474n) {
            if (c19474n.m61118c() == RedirectType.safetynet) {
                this.val$queueITQueueListener.onQueuePassed(new C19473m(c19474n.m61116a()));
                return;
            }
            if (c19474n.m61118c() == RedirectType.disabled || c19474n.m61118c() == RedirectType.afterevent || c19474n.m61118c() == RedirectType.idle) {
                this.val$queueITQueueListener.onQueueDisabled(new C19464d(c19474n.m61116a()));
            } else {
                C19467g.this._queueTryPassResult = c19474n;
                C19467g.this._queueITWaitingRoomView.m61108y(C19467g.this._queueTryPassResult, this.val$webViewUserAgent);
            }
        }
    }

    public C19467g(Activity activity, String str, String str2, String str3, String str4, AbstractC19472l abstractC19472l, C19471k c19471k) {
        c19471k = c19471k == null ? C19471k.m61109a() : c19471k;
        C19480t.m61131b(activity);
        this._queueITEngineListener = abstractC19472l;
        a aVar = new a();
        this._queueITWaitingRoomProvider = new C19468h(activity, str, str2, str3, str4, new b(aVar, c19471k.m61110b()));
        this._queueITWaitingRoomView = new C19470j(activity, aVar, c19471k);
    }

    /* renamed from: e */
    public void m61061e(Context context) throws QueueITException {
        this._queueITWaitingRoomProvider.m61082s();
    }
}