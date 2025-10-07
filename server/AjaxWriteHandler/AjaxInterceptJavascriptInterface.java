package com.wdpr.p479ee.p480ra.rahybrid.server.AjaxWriteHandler;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.wdpr.p479ee.p480ra.rahybrid.CustomWebViewClient;
import com.wdpr.p479ee.p480ra.rahybrid.util.WriteHandlingUtil;
import java.io.IOException;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import p857pz.C31624a;

/* loaded from: classes21.dex */
public class AjaxInterceptJavascriptInterface {
    public static final String HEAD = "head";
    public static final String INTERCEPTHEADER_HTML = "interceptheader.html";
    private static String interceptHeader;
    private CustomWebViewClient mWebViewClient;

    public AjaxInterceptJavascriptInterface(CustomWebViewClient customWebViewClient) {
        this.mWebViewClient = customWebViewClient;
    }

    public static String enableIntercept(Context context, byte[] bArr) throws IOException {
        if (interceptHeader == null) {
            interceptHeader = new String(WriteHandlingUtil.consumeInputStream(context.getAssets().open(INTERCEPTHEADER_HTML)));
        }
        Document documentM97057a = C31624a.m97057a(new String(bArr));
        documentM97057a.m95980u1().m95994j(true);
        Elements elementsM96013D0 = documentM97057a.m96013D0(HEAD);
        if (elementsM96013D0.size() > 0) {
            elementsM96013D0.get(0).m96032X0(interceptHeader);
        }
        return documentM97057a.toString();
    }

    @JavascriptInterface
    public void customAjax(String str, String str2) {
        this.mWebViewClient.addAjaxRequest(str, str2);
    }
}