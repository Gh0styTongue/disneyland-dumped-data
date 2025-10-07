package com.disney.wdpro.scanner.zxing.client.managers;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.TypedValue;
import com.disney.wdpro.scanner.zxing.client.interfaces.ScanAreaManager;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import hr.C28455b;

@Instrumented
/* loaded from: classes17.dex */
public class ScanAreaManagerImpl implements ScanAreaManager {
    protected static final int MAX_FRAME_HEIGHT = 1440;
    protected static final int MAX_FRAME_WIDTH = 2560;
    protected static final int MIN_FRAME_HEIGHT = 120;
    protected static final int MIN_FRAME_WIDTH = 120;
    protected static final int PADDING = 32;
    private static int offSet;
    private final String TAG = getClass().getSimpleName();
    private Rect framingRect;

    public ScanAreaManagerImpl() {
        offSet = (int) TypedValue.applyDimension(1, 32.0f, Resources.getSystem().getDisplayMetrics());
    }

    protected static int findDesiredDimensionInRange(int i10, int i11, int i12) throws IllegalArgumentException {
        int i13 = i10 - offSet;
        if (i13 >= i11) {
            return i13 > i12 ? i12 : i13;
        }
        throw new IllegalArgumentException("The requested scan area dimension has hit the minimal allowed value! The used ScanAreaManager doesn't accept such small scan area! Please increase the dimension or use a different ScanAreaManager");
    }

    private int findDesiredScanAreaHeight(int i10) throws IllegalArgumentException {
        return findDesiredDimensionInRange(i10, 120, 1440);
    }

    private int findDesiredScanAreaWidth(int i10) throws IllegalArgumentException {
        return findDesiredDimensionInRange(i10, 120, MAX_FRAME_WIDTH);
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ScanAreaManager
    public int getScanAreaBackgroundDrawable() {
        return C28455b.scanner_frame;
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ScanAreaManager
    public boolean isScanAreaOrientationAware() {
        return true;
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ScanAreaManager
    public synchronized Rect setAndGetScanAreaRect(Point point) throws IllegalArgumentException {
        try {
            if (this.framingRect == null) {
                if (point == null) {
                    return null;
                }
                int iFindDesiredScanAreaWidth = findDesiredScanAreaWidth(point.x);
                int iFindDesiredScanAreaHeight = findDesiredScanAreaHeight(point.y);
                int i10 = offSet;
                this.framingRect = new Rect(i10, i10, iFindDesiredScanAreaWidth, iFindDesiredScanAreaHeight);
                LogInstrumentation.m79024d(this.TAG, "Calculated scanning rect: " + this.framingRect);
            }
            return this.framingRect;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ScanAreaManager
    public boolean showScanAreaOverlay() {
        return true;
    }
}