package com.disney.wdpro.ap_commerce_checkout.views;

/* renamed from: com.disney.wdpro.ap_commerce_checkout.views.a */
/* loaded from: classes23.dex */
public final /* synthetic */ class RunnableC8747a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Integer f29274b;

    public /* synthetic */ RunnableC8747a(Integer num) {
        num = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        createPDFFileTask.onPostExecute(num);
    }
}