package com.disney.wdpro.ap_commerce_checkout.views;

import com.disney.wdpro.ap_commerce_checkout.views.SaveAndShareView;
import java.util.function.Supplier;

/* renamed from: com.disney.wdpro.ap_commerce_checkout.views.b */
/* loaded from: classes23.dex */
public final /* synthetic */ class C8748b implements Supplier {

    /* renamed from: b */
    public final /* synthetic */ SaveAndShareView.CreatePDFFileTaskParams f29276b;

    public /* synthetic */ C8748b(SaveAndShareView.CreatePDFFileTaskParams createPDFFileTaskParams) {
        createPDFFileTaskParams = createPDFFileTaskParams;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return createPDFFileTask.doInBackground(createPDFFileTaskParams);
    }
}