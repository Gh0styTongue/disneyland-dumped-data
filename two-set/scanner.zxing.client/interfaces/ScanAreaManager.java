package com.disney.wdpro.scanner.zxing.client.interfaces;

import android.graphics.Point;
import android.graphics.Rect;

/* loaded from: classes17.dex */
public interface ScanAreaManager {
    int getScanAreaBackgroundDrawable();

    boolean isScanAreaOrientationAware();

    Rect setAndGetScanAreaRect(Point point);

    boolean showScanAreaOverlay();
}