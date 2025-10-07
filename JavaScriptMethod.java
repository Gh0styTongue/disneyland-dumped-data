package com.wdpr.p479ee.p480ra.rahybrid;

import com.disney.wdpro.commercecheckout.util.StringUtils;

/* loaded from: classes21.dex */
public class JavaScriptMethod {
    public final String methodName;
    public final String[] parameters;
    public final String pluginName;

    public JavaScriptMethod(String str, String str2, String[] strArr) {
        if (str2 == null || str2.trim().length() == 0) {
            throw new IllegalStateException("Missing methodName");
        }
        this.pluginName = str;
        this.methodName = str2;
        this.parameters = strArr;
    }

    private String escapeSpecialChar(String str) {
        if (str != null) {
            if (str.contains("\\")) {
                str = str.replace("\\", "\\\\");
            }
            if (str.contains("'")) {
                return str.replace("'", "\\'");
            }
        }
        return str;
    }

    private String getParamsString() {
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = this.parameters;
        if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                if (str == null) {
                    sb2.append(str);
                    sb2.append(",");
                } else {
                    sb2.append("'");
                    sb2.append(escapeSpecialChar(str));
                    sb2.append("'");
                    sb2.append(",");
                }
            }
        }
        String string = sb2.toString();
        String[] strArr2 = this.parameters;
        return (strArr2 == null || strArr2.length == 0) ? string : string.substring(0, string.lastIndexOf(","));
    }

    public final String buildJavaScriptString() {
        String paramsString = getParamsString();
        return (((((("\nif (window.disney && window.disney." + this.pluginName + " && " + WebViewBridge.JAVASCRIPT_DISNEY_PREFIX + "." + this.pluginName + "." + this.methodName + ") {\n") + "\twindow.disney." + this.pluginName + "." + this.methodName + StringUtils.LEFT_BRACKET + paramsString + ");\n") + "} else if (window." + this.pluginName + " && " + WebViewBridge.JAVASCRIPT_WINDOW_PREFIX + "." + this.pluginName + "." + this.methodName + ") {\n") + "\twindow." + this.pluginName + "." + this.methodName + StringUtils.LEFT_BRACKET + paramsString + ");\n") + "} else {\n") + "\tconsole.log('window." + this.pluginName + " or " + WebViewBridge.JAVASCRIPT_WINDOW_PREFIX + "." + this.pluginName + "." + this.methodName + " not found');\n") + "}\n";
    }

    public final String getJavaScriptString() {
        return ((this.methodName + StringUtils.LEFT_BRACKET) + getParamsString()) + ");";
    }
}