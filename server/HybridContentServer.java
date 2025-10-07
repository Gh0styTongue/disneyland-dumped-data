package com.wdpr.p479ee.p480ra.rahybrid.server;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.wdpr.p479ee.p480ra.rahybrid.WebServer;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.manager.FileManager;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.WebServerConfig;
import com.wdpr.p479ee.p480ra.rahybrid.util.Constants;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.MediaType;

/* loaded from: classes21.dex */
public class HybridContentServer implements WebServer {
    private static final String CACHE_CONTROL = "Cache-Control";
    private static final String CONTENT_LENGTH = "content-length";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String DEFAULT_HOST_NAME = "localhost";
    private static final String NO_CACHE = "no-cache";
    private static final String SCHEME_REGEX = "[a-zA-Z]+";
    public String contentDir;
    public boolean enableDeepLinking;
    private final FileManager fileManager;
    private String hostName;
    private final List<String> localURLList;
    private final UriMatcher uriMatcher = new UriMatcher(null);
    private WebServerConfig webServerConfig;
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String TAG = HybridContentServer.class.getSimpleName();
    private static final Set<String> SCHEME_SET = new HashSet(Arrays.asList("http", "https", Constants.RAHYBRID_SCHEME));

    static abstract class URLPathHandler {
        private String encoding;
        private String mimeType;
        private String reasonPhrase;
        private Map<String, String> responseHeaders;
        private int statusCode;

        public URLPathHandler() {
            this(null, null, 200, "OK", null);
        }

        public void addResponseHeaders(String str, String str2) {
            this.responseHeaders.put(str, str2);
        }

        public String getEncoding() {
            return this.encoding;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public String getReasonPhrase() {
            return this.reasonPhrase;
        }

        public Map<String, String> getResponseHeaders() {
            return this.responseHeaders;
        }

        public int getStatusCode() {
            return this.statusCode;
        }

        public abstract InputStream handle(Uri uri);

        public InputStream handle(WebResourceRequest webResourceRequest) {
            return handle(webResourceRequest.getUrl());
        }

        public URLPathHandler(String str, String str2, int i10, String str3, Map<String, String> map) {
            this.mimeType = str;
            this.encoding = str2;
            this.statusCode = i10;
            this.reasonPhrase = str3;
            map = map == null ? new HashMap<>() : map;
            map.put("Cache-Control", "no-cache");
            this.responseHeaders = map;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface WebRequestMethodType {
        public static final String DELETE = "DELETE";
        public static final String GET = "GET";
        public static final String HEAD = "HEAD";
        public static final String OPTIONS = "OPTIONS";
        public static final String POST = "POST";
        public static final String PUT = "PUT";
    }

    public HybridContentServer(Context context, HybridWebConfig hybridWebConfig) {
        this.fileManager = FileManager.getInstance(context);
        String id2 = hybridWebConfig.getId();
        WebServerConfig webServerConfig = hybridWebConfig.getBundle().getWebServerConfig();
        this.webServerConfig = webServerConfig;
        if (webServerConfig != null) {
            this.enableDeepLinking = webServerConfig.getEnableDeepLinking();
            this.hostName = this.webServerConfig.getHostName();
            String scheme = this.webServerConfig.getScheme();
            if (!TextUtils.isEmpty(scheme)) {
                int iIndexOf = scheme.indexOf(":");
                scheme = iIndexOf > 0 ? scheme.substring(0, iIndexOf).trim() : scheme;
                if (scheme.matches(SCHEME_REGEX)) {
                    SCHEME_SET.add(scheme);
                } else {
                    RAHybridLog.m85712e(TAG, "Invalid Scheme, We are allowing only alphabets letters");
                }
            }
        }
        if (this.hostName == null) {
            this.hostName = DEFAULT_HOST_NAME;
        }
        this.localURLList = new ArrayList();
        for (String str : SCHEME_SET) {
            this.localURLList.add(str + "://" + this.hostName);
        }
        this.contentDir = FileManager.getInstance(context).getLocalServerLocationWithVersion(id2, null);
    }

    private void addResponseHeaders(URLPathHandler uRLPathHandler, InputStream inputStream, String str) throws IOException {
        int iAvailable;
        uRLPathHandler.addResponseHeaders("Content-Type", str);
        try {
            iAvailable = inputStream.available();
        } catch (IOException e10) {
            e10.printStackTrace();
            RAHybridLog.m85713e(TAG, "IOException : " + e10.getMessage(), e10);
            iAvailable = 0;
        }
        uRLPathHandler.addResponseHeaders(CONTENT_LENGTH, String.valueOf(iAvailable));
    }

    private int getStatusCode(InputStream inputStream, int i10) {
        try {
            if (inputStream.available() == 0) {
                return 404;
            }
            return i10;
        } catch (IOException unused) {
            return 500;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.webkit.WebResourceResponse handleLocalRequest(android.webkit.WebResourceRequest r11, com.wdpr.ee.ra.rahybrid.server.HybridContentServer.URLPathHandler r12) throws java.io.IOException {
        /*
            r10 = this;
            android.net.Uri r0 = r11.getUrl()
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.String r0 = r0.getPath()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 != 0) goto L10
            return r1
        L10:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r10.contentDir
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            boolean r2 = r2.exists()
            java.lang.String r3 = "/"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L52
            boolean r3 = r10.enableDeepLinking
            if (r3 == 0) goto L39
            if (r2 != 0) goto L39
            goto L52
        L39:
            java.lang.String r2 = "."
            int r2 = r0.lastIndexOf(r2)
            if (r2 <= 0) goto L4d
            com.wdpr.ee.ra.rahybrid.server.HybridContentServer$LazyInputStream r2 = new com.wdpr.ee.ra.rahybrid.server.HybridContentServer$LazyInputStream
            r2.<init>(r12, r11)
            java.lang.String r11 = r10.getMimeType(r0, r2)
        L4a:
            r4 = r11
            r9 = r2
            goto L6f
        L4d:
            java.lang.String r11 = "application/x-unknown"
            r4 = r11
            r9 = r1
            goto L6f
        L52:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8f
            r11.<init>()     // Catch: java.io.IOException -> L8f
            java.lang.String r0 = r10.contentDir     // Catch: java.io.IOException -> L8f
            r11.append(r0)     // Catch: java.io.IOException -> L8f
            java.lang.String r0 = "/index.html"
            r11.append(r0)     // Catch: java.io.IOException -> L8f
            java.lang.String r11 = r11.toString()     // Catch: java.io.IOException -> L8f
            com.wdpr.ee.ra.rahybrid.contentbundle.manager.FileManager r0 = r10.fileManager     // Catch: java.io.IOException -> L8f
            java.io.InputStream r2 = r0.createInputStreamFromFile(r11)     // Catch: java.io.IOException -> L8f
            java.lang.String r11 = "text/html"
            goto L4a
        L6f:
            if (r9 != 0) goto L72
            return r1
        L72:
            int r11 = r12.getStatusCode()
            int r6 = r10.getStatusCode(r9, r11)
            r10.addResponseHeaders(r12, r9, r4)
            android.webkit.WebResourceResponse r3 = new android.webkit.WebResourceResponse
            java.lang.String r5 = r12.getEncoding()
            java.lang.String r7 = r12.getReasonPhrase()
            java.util.Map r8 = r12.getResponseHeaders()
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L8f:
            r0 = move-exception
            r10 = r0
            java.lang.String r11 = com.wdpr.p479ee.p480ra.rahybrid.server.HybridContentServer.TAG
            java.lang.String r12 = "Unable to open index.html"
            com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog.m85713e(r11, r12, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wdpr.p479ee.p480ra.rahybrid.server.HybridContentServer.handleLocalRequest(android.webkit.WebResourceRequest, com.wdpr.ee.ra.rahybrid.server.HybridContentServer$URLPathHandler):android.webkit.WebResourceResponse");
    }

    private boolean isValidOfflineURL(String str) {
        Iterator<String> it = this.localURLList.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void register(Uri uri, URLPathHandler uRLPathHandler) {
        synchronized (this.uriMatcher) {
            this.uriMatcher.addURI(uri.getScheme(), uri.getAuthority(), uri.getPath(), uRLPathHandler);
        }
    }

    private void registerUriForScheme(String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(str);
        builder.authority(str2);
        builder.path("");
        Uri uriBuild = builder.build();
        URLPathHandler uRLPathHandler = new URLPathHandler() { // from class: com.wdpr.ee.ra.rahybrid.server.HybridContentServer.1
            @Override // com.wdpr.ee.ra.rahybrid.server.HybridContentServer.URLPathHandler
            public InputStream handle(Uri uri) {
                return HybridContentServer.this.createInputStreamFromUri(uri);
            }
        };
        register(Uri.withAppendedPath(uriBuild, "/"), uRLPathHandler);
        register(Uri.withAppendedPath(uriBuild, "**"), uRLPathHandler);
    }

    private void setupHostingDetails() {
        String str = this.contentDir;
        if (str == null) {
            throw new IllegalArgumentException("contentDir cannot be null.");
        }
        if (str.indexOf(42) != -1) {
            throw new IllegalArgumentException("contentDir cannot contain the '*' character.");
        }
        Iterator<String> it = SCHEME_SET.iterator();
        while (it.hasNext()) {
            registerUriForScheme(it.next(), this.hostName);
        }
    }

    public InputStream createInputStreamFromUri(Uri uri) {
        String path = uri.getPath();
        try {
            return this.fileManager.createInputStreamFromFile(this.contentDir + path);
        } catch (IOException e10) {
            RAHybridLog.m85713e(TAG, "Unable to open URL: " + uri, e10);
            return null;
        }
    }

    public String getMimeType(String str, InputStream inputStream) {
        String strGuessContentTypeFromName;
        try {
            strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
            if (strGuessContentTypeFromName != null) {
                try {
                    if (str.endsWith(".js") && strGuessContentTypeFromName.equals("image/x-icon")) {
                        RAHybridLog.m85711d(TAG, "We shouldn't be here");
                    }
                } catch (Exception e10) {
                    e = e10;
                    RAHybridLog.m85713e(TAG, "Unable to get mime type" + str, e);
                    return strGuessContentTypeFromName;
                }
            }
            return strGuessContentTypeFromName == null ? str.endsWith(".js") ? "application/javascript" : URLConnection.guessContentTypeFromStream(inputStream) : strGuessContentTypeFromName;
        } catch (Exception e11) {
            e = e11;
            strGuessContentTypeFromName = null;
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.WebServer
    public WebServerConfig getWebServerConfig() {
        return this.webServerConfig;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.WebServer
    public void hostContentBundle() {
        setupHostingDetails();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.WebServer
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        URLPathHandler uRLPathHandler;
        Uri url = webResourceRequest.getUrl();
        if (!isValidOfflineURL(url.toString())) {
            return null;
        }
        synchronized (this.uriMatcher) {
            uRLPathHandler = (URLPathHandler) this.uriMatcher.match(url);
        }
        if (uRLPathHandler == null) {
            return null;
        }
        return handleLocalRequest(webResourceRequest, uRLPathHandler);
    }

    public static class LazyInputStream extends InputStream {
        private final URLPathHandler handler;

        /* renamed from: is */
        private InputStream f71788is = null;
        private WebResourceRequest request;

        public LazyInputStream(URLPathHandler uRLPathHandler, WebResourceRequest webResourceRequest) {
            this.handler = uRLPathHandler;
            this.request = webResourceRequest;
        }

        private InputStream getInputStream() {
            if (this.f71788is == null) {
                this.f71788is = handle();
            }
            return this.f71788is;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.available();
            }
            return 0;
        }

        protected InputStream handle() {
            return this.handler.handle(this.request);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.read();
            }
            return -1;
        }

        @Override // java.io.InputStream
        public long skip(long j10) throws IOException {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.skip(j10);
            }
            return 0L;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.read(bArr);
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.read(bArr, i10, i11);
            }
            return -1;
        }
    }
}