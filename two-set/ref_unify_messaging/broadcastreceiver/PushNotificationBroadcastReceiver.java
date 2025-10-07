package com.disney.wdpro.ref_unify_messaging.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.disney.wdpro.ref_unify_messaging.model.PushNotificationData;

/* loaded from: classes28.dex */
public class PushNotificationBroadcastReceiver extends BroadcastReceiver {
    private InterfaceC20024a listener;

    /* renamed from: com.disney.wdpro.ref_unify_messaging.broadcastreceiver.PushNotificationBroadcastReceiver$a */
    public interface InterfaceC20024a {
        /* renamed from: a */
        void mo29675a(PushNotificationData pushNotificationData);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.listener.mo29675a(new PushNotificationData(intent.getExtras()));
    }
}