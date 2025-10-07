package com.wdpr.p479ee.p480ra.rahybrid.plugin.sso;

import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.okhttp3.OkHttp3Instrumentation;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

@Instrumented
/* loaded from: classes21.dex */
public class ProfileService {
    private static final int CONNECTION_TIME_OUT_IN_SEC = 30;
    private static final int READ_TIME_OUT_IN_SEC = 30;
    private static final String TAG = "ProfileService";
    private URL refreshAuthURL;

    public ProfileService(URL url) {
        this.refreshAuthURL = url;
    }

    private void fetchJWTResponse(URL url, String str, int i10, int i11, Callback callback) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j10 = i10;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builder.connectTimeout(j10, timeUnit).readTimeout(i11, timeUnit).build();
        Request.Builder builderCacheControl = new Request.Builder().header("Authorization", "BEARER " + str).url(url).post(RequestBody.create(MediaType.parse("application/json"), "")).cacheControl(new CacheControl.Builder().noCache().build());
        Request requestBuild = builderCacheControl == null ? builderCacheControl.build() : OkHttp3Instrumentation.build(builderCacheControl);
        (okHttpClientBuild == null ? okHttpClientBuild.newCall(requestBuild) : OkHttp3Instrumentation.newCall(okHttpClientBuild, requestBuild)).enqueue(callback);
    }

    public void generateJWTWithAccessToken(String str, Callback callback) {
        fetchJWTResponse(this.refreshAuthURL, str, 30, 30, callback);
    }
}