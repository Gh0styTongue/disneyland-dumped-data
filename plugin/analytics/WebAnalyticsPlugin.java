package com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import com.wdpr.p479ee.p480ra.rahybrid.util.CustomMapDeserializer;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Instrumented
/* loaded from: classes21.dex */
public class WebAnalyticsPlugin extends Plugin implements WebMessageReceivable {
    private static final String CONTEXT_DATA = "contextData";

    /* renamed from: ID */
    public static final String f71774ID = "AnalyticsPlugin";

    @Deprecated
    private static final String SEND_ANALYTICS_DATA_COMMAND = "sendAnalyticsData";
    private static final String STATE = "state";
    private static final String TAG = "WebAnalyticsPlugin";
    private static final String TRACK_ACTION_COMMAND = "trackAction";
    private static final String TRACK_STATE_COMMAND = "trackState";

    @Deprecated
    public CallbackHandler<String> callbackHandler;
    public CallbackHandler<String> callbackHandlerForTrackAction;
    public CallbackHandler<String> callbackHandlerForTrackState;
    private WebAnalyticsPluginListener webAnalyticsPluginListener;
    private Map<String, CallbackHandler> webMessageHandlers;

    public WebAnalyticsPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        this.callbackHandler = new CallbackHandler<String>() { // from class: com.wdpr.ee.ra.rahybrid.plugin.analytics.WebAnalyticsPlugin.1
            @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
            public void onMessage(String str, String str2) {
                if (WebAnalyticsPlugin.this.webAnalyticsPluginListener != null) {
                    WebAnalyticsPlugin.this.webAnalyticsPluginListener.onReceivedData(WebAnalyticsPlugin.this, str2);
                }
            }
        };
        this.callbackHandlerForTrackState = new CallbackHandler<String>() { // from class: com.wdpr.ee.ra.rahybrid.plugin.analytics.WebAnalyticsPlugin.2
            @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
            public void onMessage(String str, String str2) {
                if (WebAnalyticsPlugin.this.webAnalyticsPluginListener != null) {
                    WebAnalyticsPluginListener webAnalyticsPluginListener = WebAnalyticsPlugin.this.webAnalyticsPluginListener;
                    WebAnalyticsPlugin webAnalyticsPlugin = WebAnalyticsPlugin.this;
                    webAnalyticsPluginListener.onReceivedTrackStateData(webAnalyticsPlugin, webAnalyticsPlugin.getTrackStateTitle(str2), WebAnalyticsPlugin.this.getContextDataMap(str2));
                }
            }
        };
        this.callbackHandlerForTrackAction = new CallbackHandler<String>() { // from class: com.wdpr.ee.ra.rahybrid.plugin.analytics.WebAnalyticsPlugin.3
            @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
            public void onMessage(String str, String str2) {
                if (WebAnalyticsPlugin.this.webAnalyticsPluginListener != null) {
                    WebAnalyticsPluginListener webAnalyticsPluginListener = WebAnalyticsPlugin.this.webAnalyticsPluginListener;
                    WebAnalyticsPlugin webAnalyticsPlugin = WebAnalyticsPlugin.this;
                    webAnalyticsPluginListener.onReceivedTrackActionData(webAnalyticsPlugin, webAnalyticsPlugin.getTrackStateTitle(str2), WebAnalyticsPlugin.this.getContextDataMap(str2));
                }
            }
        };
        this.webMessageHandlers = new HashMap();
    }

    public HashMap<String, Object> getContextDataMap(String str) {
        try {
            String string = new JSONObject(str).get(CONTEXT_DATA).toString();
            Gson gsonCreate = new GsonBuilder().registerTypeAdapter(new TypeToken<Map<String, Object>>() { // from class: com.wdpr.ee.ra.rahybrid.plugin.analytics.WebAnalyticsPlugin.4
            }.getType(), new CustomMapDeserializer()).create();
            Type type = new TypeToken<Map<String, Object>>() { // from class: com.wdpr.ee.ra.rahybrid.plugin.analytics.WebAnalyticsPlugin.5
            }.getType();
            return (HashMap) (gsonCreate == null ? gsonCreate.fromJson(string, type) : GsonInstrumentation.fromJson(gsonCreate, string, type));
        } catch (JsonSyntaxException | JSONException e10) {
            e10.printStackTrace();
            RAHybridLog.m85713e(TAG, "getContextDataMap() Exception: " + e10.getMessage(), e10);
            return null;
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "AnalyticsPlugin";
    }

    public String getTrackStateTitle(String str) {
        try {
            return new JSONObject(str).get("state").toString();
        } catch (JsonSyntaxException | JSONException e10) {
            e10.printStackTrace();
            RAHybridLog.m85713e(TAG, "getTrackStateTitle() Exception: " + e10.getMessage(), e10);
            return null;
        }
    }

    public WebAnalyticsPluginListener getWebAnalyticsPluginListener() {
        return this.webAnalyticsPluginListener;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler> getWebMessageHandlers() {
        this.webMessageHandlers.put(SEND_ANALYTICS_DATA_COMMAND, this.callbackHandler);
        this.webMessageHandlers.put("trackState", this.callbackHandlerForTrackState);
        this.webMessageHandlers.put("trackAction", this.callbackHandlerForTrackAction);
        return this.webMessageHandlers;
    }

    public void setWebAnalyticsPluginListener(WebAnalyticsPluginListener webAnalyticsPluginListener) {
        this.webAnalyticsPluginListener = webAnalyticsPluginListener;
    }
}