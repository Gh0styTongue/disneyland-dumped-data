package com.disney.wdpro.queueit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p944t2.C32235a;

/* renamed from: com.disney.wdpro.queueit.u */
/* loaded from: classes16.dex */
public class C19481u implements InterfaceC19462b {
    private final Context _context;

    public C19481u(Context context) {
        this._context = context;
    }

    @Override // com.disney.wdpro.queueit.InterfaceC19462b
    /* renamed from: a */
    public void mo61020a(String str) {
        Intent intent = new Intent("on-queue-passed");
        intent.putExtra("queue-it-token", str);
        C32235a.m98864b(this._context).m98867d(intent);
    }

    @Override // com.disney.wdpro.queueit.InterfaceC19462b
    /* renamed from: b */
    public void mo61021b(BroadcastReceiver broadcastReceiver, BroadcastReceiver broadcastReceiver2, BroadcastReceiver broadcastReceiver3, BroadcastReceiver broadcastReceiver4, BroadcastReceiver broadcastReceiver5, BroadcastReceiver broadcastReceiver6, BroadcastReceiver broadcastReceiver7) {
        C32235a c32235aM98864b = C32235a.m98864b(this._context);
        c32235aM98864b.m98866c(broadcastReceiver, new IntentFilter("on-queue-passed"));
        c32235aM98864b.m98866c(broadcastReceiver2, new IntentFilter("on-changed-queue-url"));
        c32235aM98864b.m98866c(broadcastReceiver3, new IntentFilter("queue-activity-closed"));
        c32235aM98864b.m98866c(broadcastReceiver4, new IntentFilter("queue-user-exited"));
        c32235aM98864b.m98866c(broadcastReceiver5, new IntentFilter("on-queue-error"));
        c32235aM98864b.m98866c(broadcastReceiver6, new IntentFilter("on-webview-close"));
        c32235aM98864b.m98866c(broadcastReceiver7, new IntentFilter("on-session-restart"));
    }

    @Override // com.disney.wdpro.queueit.InterfaceC19462b
    /* renamed from: c */
    public void mo61022c(String str) {
        Intent intent = new Intent("on-changed-queue-url");
        intent.putExtra("url", str);
        C32235a.m98864b(this._context).m98867d(intent);
    }

    @Override // com.disney.wdpro.queueit.InterfaceC19462b
    /* renamed from: d */
    public void mo61023d() {
        C32235a.m98864b(this._context).m98867d(new Intent("on-webview-close"));
    }

    @Override // com.disney.wdpro.queueit.InterfaceC19462b
    /* renamed from: e */
    public void mo61024e() {
        C32235a.m98864b(this._context).m98867d(new Intent("queue-activity-closed"));
    }

    @Override // com.disney.wdpro.queueit.InterfaceC19462b
    /* renamed from: f */
    public void mo61025f() {
        C32235a.m98864b(this._context).m98867d(new Intent("on-session-restart"));
    }

    @Override // com.disney.wdpro.queueit.InterfaceC19462b
    /* renamed from: g */
    public void mo61026g(String str) {
        Intent intent = new Intent("on-queue-error");
        intent.putExtra("error-message", str);
        C32235a.m98864b(this._context).m98867d(intent);
    }

    @Override // com.disney.wdpro.queueit.InterfaceC19462b
    /* renamed from: h */
    public void mo61027h(BroadcastReceiver broadcastReceiver, BroadcastReceiver broadcastReceiver2, BroadcastReceiver broadcastReceiver3, BroadcastReceiver broadcastReceiver4, BroadcastReceiver broadcastReceiver5, BroadcastReceiver broadcastReceiver6, BroadcastReceiver broadcastReceiver7) {
        C32235a c32235aM98864b = C32235a.m98864b(this._context);
        c32235aM98864b.m98868e(broadcastReceiver);
        c32235aM98864b.m98868e(broadcastReceiver2);
        c32235aM98864b.m98868e(broadcastReceiver3);
        c32235aM98864b.m98868e(broadcastReceiver4);
        c32235aM98864b.m98868e(broadcastReceiver5);
        c32235aM98864b.m98868e(broadcastReceiver6);
        c32235aM98864b.m98868e(broadcastReceiver7);
    }
}