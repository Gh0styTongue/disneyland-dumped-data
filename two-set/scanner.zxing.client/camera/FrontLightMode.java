package com.disney.wdpro.scanner.zxing.client.camera;

import android.os.Bundle;
import com.disney.wdpro.scanner.zxing.client.utils.Constants;

/* loaded from: classes17.dex */
public enum FrontLightMode {
    MANUAL,
    ON,
    AUTO,
    OFF;

    private static FrontLightMode parse(String str) {
        try {
            return str == null ? OFF : valueOf(str);
        } catch (IllegalArgumentException unused) {
            return OFF;
        }
    }

    public static FrontLightMode readPref(Bundle bundle) {
        String string = bundle.getString(Constants.KEY_FRONT_LIGHT_MODE);
        if (string != null) {
            return parse(string);
        }
        FrontLightMode frontLightMode = (FrontLightMode) bundle.getSerializable(Constants.KEY_FRONT_LIGHT_MODE);
        return frontLightMode == null ? OFF : frontLightMode;
    }
}