package com.disney.wdpro.universal_checkout_ui.daohybrid;

import android.content.Context;
import com.disney.wdpro.my_plans_ui.p348ui.activity.ItineraryHybridActivity;
import com.disney.wdpro.service.utils.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/daohybrid/HybridUtils;", "", "()V", "APP_PDF_PROVIDER", "", "PDF_DISPLAY_ERROR_JS_BRIDGE_STATUS", "SCRIPT_CALL_SHOULD_NATIVE_HANDLE_BUTTON_PRESSED", "convertJavaScriptParamsToMap", "", ItineraryHybridActivity.ALL_QUERY_PARAMS, "getPdfAuthority", "applicationContext", "Landroid/content/Context;", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class HybridUtils {
    private static final String APP_PDF_PROVIDER = ".universalcheckoutprovider";
    public static final HybridUtils INSTANCE = new HybridUtils();
    public static final String PDF_DISPLAY_ERROR_JS_BRIDGE_STATUS = "CANCEL";
    public static final String SCRIPT_CALL_SHOULD_NATIVE_HANDLE_BUTTON_PRESSED = "require('appkit-utilities/jsBridge/handlers').jsHandlers.shouldNativeHandleButtonPressed(\"%s\")";

    private HybridUtils() {
    }

    public final Map<String, String> convertJavaScriptParamsToMap(String params) {
        HashMap map = null;
        if (params != null) {
            if (params.length() == 0) {
                return null;
            }
            map = new HashMap();
            Iterator<String> it = new Regex(Constants.AMPERSAND).split(params, 0).iterator();
            while (it.hasNext()) {
                List<String> listSplit = new Regex("=").split(it.next(), 0);
                map.put(listSplit.get(0), listSplit.get(1));
            }
        }
        return map;
    }

    public final String getPdfAuthority(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        return applicationContext.getPackageName() + APP_PDF_PROVIDER;
    }
}