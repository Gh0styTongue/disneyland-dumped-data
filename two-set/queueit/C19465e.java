package com.disney.wdpro.queueit;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.disney.wdpro.locationservices.location_regions.services.models.common.LocationServicesSDKClientVersion;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import com.newrelic.agent.android.instrumentation.okhttp3.OkHttp3Instrumentation;
import com.wdpr.p479ee.p480ra.rahybrid.util.Constants;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Instrumented
/* renamed from: com.disney.wdpro.queueit.e */
/* loaded from: classes16.dex */
public class C19465e {
    public static boolean IsTest = false;
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private final String _customerId;
    private final String _enqueueKey;
    private final String _enqueueToken;
    private final String _eventOrAliasId;
    private final String _language;
    private final String _layoutName;
    private final InterfaceC19466f _queueITApiClientListener;
    private final String _sdkVersion;
    private final String _userAgent;
    private final String _userId;

    /* renamed from: com.disney.wdpro.queueit.e$a */
    class a implements Callback {
        final Handler mainHandler;
        final /* synthetic */ Context val$context;

        /* renamed from: com.disney.wdpro.queueit.e$a$a, reason: collision with other inner class name */
        class RunnableC34243a implements Runnable {
            final /* synthetic */ String val$message;

            RunnableC34243a(String str) {
                this.val$message = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C19465e.this._queueITApiClientListener.mo61056b(this.val$message, 0);
            }
        }

        /* renamed from: com.disney.wdpro.queueit.e$a$b */
        class b implements Runnable {
            final /* synthetic */ int val$code;
            final /* synthetic */ String val$errorMessage;

            b(String str, int i10) {
                this.val$errorMessage = str;
                this.val$code = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                C19465e.this._queueITApiClientListener.mo61056b(this.val$errorMessage, this.val$code);
            }
        }

        /* renamed from: com.disney.wdpro.queueit.e$a$c */
        class c implements Runnable {
            final /* synthetic */ String val$eventTargetUrl;
            final /* synthetic */ String val$queueId;
            final /* synthetic */ String val$queueItToken;
            final /* synthetic */ String val$queueUrl;
            final /* synthetic */ int val$queueUrlTtlInMinutes;

            c(String str, String str2, int i10, String str3, String str4) {
                this.val$queueUrl = str;
                this.val$queueId = str2;
                this.val$queueUrlTtlInMinutes = i10;
                this.val$eventTargetUrl = str3;
                this.val$queueItToken = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                C19465e.this._queueITApiClientListener.mo61055a(this.val$queueId, AbstractC19475o.m61123d(this.val$queueUrl, C19465e.this._userId) ? AbstractC19475o.m61121b(this.val$queueUrl, C19465e.this._userId).toString() : this.val$queueUrl, this.val$queueUrlTtlInMinutes, this.val$eventTargetUrl, this.val$queueItToken);
            }
        }

        /* renamed from: com.disney.wdpro.queueit.e$a$d */
        class d implements Runnable {
            final /* synthetic */ String val$body;

            d(String str) {
                this.val$body = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C19465e.this._queueITApiClientListener.mo61056b("Server did not return valid JSON: " + this.val$body, 0);
            }
        }

        a(Context context) {
            this.val$context = context;
            this.mainHandler = new Handler(context.getMainLooper());
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            this.mainHandler.post(new RunnableC34243a(iOException.toString()));
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            a aVar;
            if (!response.isSuccessful()) {
                this.mainHandler.post(new b(String.format("%s %s", response.message(), response.body().string()), response.code()));
                return;
            }
            String strString = response.body().string();
            try {
                JSONObject jSONObject = new JSONObject(strString);
                String strM61053j = C19465e.this.m61053j(jSONObject, "QueueId");
                String strM61053j2 = C19465e.this.m61053j(jSONObject, "QueueUrl");
                int iM61052i = C19465e.this.m61052i(jSONObject, "QueueUrlTTLInMinutes");
                String strM61053j3 = C19465e.this.m61053j(jSONObject, "EventTargetUrl");
                String strM61053j4 = C19465e.this.m61053j(jSONObject, "QueueitToken");
                aVar = this;
                try {
                    this.mainHandler.post(aVar.new c(strM61053j2, strM61053j, iM61052i, strM61053j3, strM61053j4));
                } catch (JSONException unused) {
                    aVar.mainHandler.post(aVar.new d(strString));
                }
            } catch (JSONException unused2) {
                aVar = this;
            }
        }
    }

    public C19465e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, InterfaceC19466f interfaceC19466f) {
        this._customerId = str;
        this._eventOrAliasId = str2;
        this._userId = str3;
        this._userAgent = str4;
        this._sdkVersion = str5;
        this._layoutName = str6;
        this._language = str7;
        this._enqueueToken = str8;
        this._enqueueKey = str9;
        this._queueITApiClientListener = interfaceC19466f;
    }

    /* renamed from: e */
    private URL m61049e() {
        return new HttpUrl.Builder().scheme("https").host(String.format(IsTest ? "%s.test.queue-it.net" : "%s.queue-it.net", this._customerId)).addPathSegments(String.format("api/mobileapp/queue/%s/%s/enqueue", this._customerId, this._eventOrAliasId)).addQueryParameter(AnalyticsAttribute.USER_ID_ATTRIBUTE, this._userId).build().url();
    }

    /* renamed from: f */
    private static String m61050f(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    /* renamed from: g */
    private JSONObject m61051g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AnalyticsAttribute.USER_ID_ATTRIBUTE, this._userId);
            jSONObject.put(Constants.userAgentKey, this._userAgent);
            jSONObject.put(LocationServicesSDKClientVersion.SDK_VERSION_NAME, this._sdkVersion);
            if (!TextUtils.isEmpty(this._layoutName)) {
                jSONObject.put("layoutName", this._layoutName);
            }
            if (!TextUtils.isEmpty(this._language)) {
                jSONObject.put("language", this._language);
            }
            if (!TextUtils.isEmpty(this._enqueueToken)) {
                jSONObject.put("enqueueToken", this._enqueueToken);
            }
            if (!TextUtils.isEmpty(this._enqueueKey)) {
                jSONObject.put("enqueueKey", this._enqueueKey);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public int m61052i(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return 0;
        }
        return jSONObject.optInt(str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public String m61053j(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* renamed from: h */
    public void m61054h(Context context) {
        URL urlM61049e = m61049e();
        OkHttpClient okHttpClient = new OkHttpClient();
        JSONObject jSONObjectM61051g = m61051g();
        String string = jSONObjectM61051g == null ? jSONObjectM61051g.toString() : JSONObjectInstrumentation.toString(jSONObjectM61051g);
        RequestBody requestBodyCreate = RequestBody.create(JSON, string);
        LogInstrumentation.m79030v("QueueITApiClient", "API call " + m61050f(Calendar.getInstance().getTime()) + ": " + urlM61049e.toString() + ": " + string);
        Request.Builder builderPost = new Request.Builder().url(urlM61049e).post(requestBodyCreate);
        OkHttp3Instrumentation.newCall(okHttpClient, builderPost == null ? builderPost.build() : OkHttp3Instrumentation.build(builderPost)).enqueue(new a(context));
    }
}