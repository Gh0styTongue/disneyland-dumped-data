package com.disney.wdpro.universal_checkout_ui.daohybrid;

import android.webkit.JavascriptInterface;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes20.dex */
public class JSWebViewBridge {
    public static String APP_JS_BRIDGE = "JPKJSBridgeHandler";
    public static String JS_VAR_NAME_FOR_BRIDGE = "JPKJavaScriptBridgeHandler";
    private final Map<String, String> registeredMethods = new HashMap();

    private String buildJavaScriptMethod(String str, String str2) {
        return String.format("%s : function(params) {%s.%s(this.createArguments(params));}", str, APP_JS_BRIDGE, str2);
    }

    private static Method[] getJsInterfaceMethods(Class<?> cls) throws SecurityException {
        ArrayList arrayList = new ArrayList();
        for (Method method : cls.getMethods()) {
            if (method.isAnnotationPresent(JavascriptInterface.class)) {
                arrayList.add(method);
            }
        }
        return (Method[]) arrayList.toArray(new Method[arrayList.size()]);
    }

    public void buildJSBridge(Object obj) throws SecurityException {
        if (obj == null) {
            return;
        }
        for (Method method : getJsInterfaceMethods(obj.getClass())) {
            JSWebViewBridgeMapping jSWebViewBridgeMapping = (JSWebViewBridgeMapping) method.getAnnotation(JSWebViewBridgeMapping.class);
            String strValue = jSWebViewBridgeMapping != null ? jSWebViewBridgeMapping.value() : "";
            if (strValue.length() == 0) {
                strValue = method.getName();
            }
            registerFunctionWithNativeMethod(strValue, method.getName());
        }
    }

    public String generateApiFromRegisteredMethods() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("var " + JS_VAR_NAME_FOR_BRIDGE + " = {");
        sb2.append("createArguments : function(params) {var args;if (params !== undefined && params !== null) {args = Object.keys(params).map(function(key){return encodeURIComponent(key) + '=' + encodeURIComponent(params[key]);}).join('&');}return args;}");
        for (Map.Entry<String, String> entry : this.registeredMethods.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb2.append(",");
            sb2.append(buildJavaScriptMethod(key, value));
        }
        sb2.append("};");
        return sb2.toString();
    }

    public void registerFunctionWithNativeMethod(String str, String str2) {
        this.registeredMethods.put(str, str2);
    }
}