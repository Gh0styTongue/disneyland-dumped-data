package com.disney.wdpro.scanner.zxing.client.camera;

import com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m92039k = 3, m92040mv = {1, 6, 0}, m92042xi = 48)
@DebugMetadata(m92052c = "com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager$AutoFocusTask", m92053f = "AutoFocusManager.kt", m92054i = {0}, m92055l = {97}, m92056m = "doInBackground", m92057n = {"this"}, m92058s = {"L$0"})
/* loaded from: classes17.dex */
final class AutoFocusManager$AutoFocusTask$doInBackground$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AutoFocusManager.AutoFocusTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoFocusManager$AutoFocusTask$doInBackground$1(AutoFocusManager.AutoFocusTask autoFocusTask, Continuation<? super AutoFocusManager$AutoFocusTask$doInBackground$1> continuation) {
        super(continuation);
        this.this$0 = autoFocusTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doInBackground(this);
    }
}