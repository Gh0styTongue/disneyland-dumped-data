package com.disney.wdpro.async_messaging.activities;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.disney.wdpro.async_messaging.activities.a */
/* loaded from: classes24.dex */
public final /* synthetic */ class ViewTreeObserverOnGlobalLayoutListenerC8899a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ View f29533a;

    /* renamed from: b */
    public final /* synthetic */ LiveChatActivity f29534b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8899a(View view, LiveChatActivity liveChatActivity) {
        view = view;
        this = liveChatActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        LiveChatActivity.m37759B0(view, this);
    }
}