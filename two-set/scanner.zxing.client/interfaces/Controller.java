package com.disney.wdpro.scanner.zxing.client.interfaces;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import com.disney.wdpro.scanner.zxing.client.camera.CameraManager;
import com.google.zxing.C23765k;

/* loaded from: classes17.dex */
public interface Controller {
    Bundle getArguments();

    CameraManager getCameraManager();

    Handler getHandler();

    void handleDecode(C23765k c23765k, Bitmap bitmap, float f10);
}