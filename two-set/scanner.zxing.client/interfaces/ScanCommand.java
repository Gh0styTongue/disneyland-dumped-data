package com.disney.wdpro.scanner.zxing.client.interfaces;

/* loaded from: classes17.dex */
public interface ScanCommand {
    void pauseDecoding();

    void restartPreviewAfterDelay(long j10);

    void resumeDecoding();

    void setScanAreaManager(ScanAreaManager scanAreaManager);

    void turnTorchOn(boolean z10);
}