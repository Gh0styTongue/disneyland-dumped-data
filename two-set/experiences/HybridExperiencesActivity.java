package com.disney.wdpro.experiences;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.view.C3816t;
import com.disney.wdpro.commons.BaseActivity;
import com.disney.wdpro.experiences.plugins.C10626a;
import com.disney.wdpro.experiences.plugins.C10627b;
import com.disney.wdpro.experiences.plugins.C10628c;
import com.disney.wdpro.experiences.plugins.C10629d;
import com.disney.wdpro.experiences.plugins.C10630e;
import com.disney.wdpro.experiences.plugins.C10633h;
import com.disney.wdpro.experiences.plugins.C10637l;
import com.disney.wdpro.experiences.plugins.C10638m;
import com.disney.wdpro.experiences.plugins.DidReceiveTrackAction;
import com.disney.wdpro.experiences.plugins.DidReceiveTrackState;
import com.disney.wdpro.experiences.plugins.ExperiencesAnalyticsPlugin;
import com.disney.wdpro.experiences.plugins.ExperiencesEventModule;
import com.disney.wdpro.experiences.plugins.ExperiencesEventType;
import com.disney.wdpro.experiences.plugins.InterfaceC10634i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.httpclient.authentication.model.AccessTokenStatus;
import com.disney.wdpro.opp.dine.util.OppStringUtils;
import com.disney.wdpro.profile_ui.lightbox.LightBoxSessionManager;
import com.disney.wdpro.service.utils.Constants;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.hybridFactory.HybridFactory;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.accesscontrol.AccessControlPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.pageEvents.PageEventsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.SSOPlugin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpCookie;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.C30180u0;
import p952ta.C32282a;
import sa.InterfaceC32132c;
import sa.InterfaceC32133d;

@Metadata(m92037d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001WB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\bJ\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b#\u0010\"J#\u0010'\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u000b2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u000b2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b)\u0010(J7\u0010/\u001a\u00020\t2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u000b2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020%\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J7\u00101\u001a\u00020\t2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u000b2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020%\u0018\u00010-H\u0016¢\u0006\u0004\b1\u00100R\u0016\u00102\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, m92038d2 = {"Lcom/disney/wdpro/experiences/HybridExperiencesActivity;", "Lcom/disney/wdpro/commons/BaseActivity;", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$RequestTokenForSSOListener;", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$GetOneIDAccessTokenForSSOListener;", "Lcom/wdpr/ee/ra/rahybrid/plugin/pageEvents/PageEventsPlugin$PageEventsPluginListener;", "Lcom/disney/wdpro/experiences/plugins/i;", "Lcom/wdpr/ee/ra/rahybrid/plugin/analytics/WebAnalyticsPluginListener;", "<init>", "()V", "", "d0", "", "swid", "c0", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "base", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$RequestTokenReadyForSSOListener;", "requestTokenReadyForSSOListener", "requestTokenForSSO", "(Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$RequestTokenReadyForSSOListener;)V", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$GetOneIDAccessTokenReadyForSSOListener;", "getOneIDAccessTokenReadyForSSOListener", "getOneIDAccessTokenForSSO", "(Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$GetOneIDAccessTokenReadyForSSOListener;)V", "commandParameters", "didReceiveClose", "(Ljava/lang/String;)V", "didReceiveError", "commandName", "", "data", "D", "(Ljava/lang/String;Ljava/lang/Object;)V", "L", "Lcom/wdpr/ee/ra/rahybrid/plugin/analytics/WebAnalyticsPlugin;", "webAnalyticsPlugin", "stateTitle", "", "contextDataMap", "onReceivedTrackStateData", "(Lcom/wdpr/ee/ra/rahybrid/plugin/analytics/WebAnalyticsPlugin;Ljava/lang/String;Ljava/util/Map;)V", "onReceivedTrackActionData", "originalContext", "Landroid/content/Context;", "Lcom/wdpr/ee/ra/rahybrid/coordinator/HybridCoordinator;", "coordinator", "Lcom/wdpr/ee/ra/rahybrid/coordinator/HybridCoordinator;", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin;", "ssoPlugin", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin;", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$RequestTokenReadyForSSOListener;", "Lta/a;", "environmentController", "Lta/a;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authManager", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "Z", "()Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "setAuthManager", "(Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;)V", "Lcom/disney/wdpro/profile_ui/lightbox/LightBoxSessionManager;", "lightBoxSessionManager", "Lcom/disney/wdpro/profile_ui/lightbox/LightBoxSessionManager;", "getLightBoxSessionManager", "()Lcom/disney/wdpro/profile_ui/lightbox/LightBoxSessionManager;", "setLightBoxSessionManager", "(Lcom/disney/wdpro/profile_ui/lightbox/LightBoxSessionManager;)V", "Lcom/disney/wdpro/experiences/plugins/h;", "logger", "Lcom/disney/wdpro/experiences/plugins/h;", "b0", "()Lcom/disney/wdpro/experiences/plugins/h;", "setLogger", "(Lcom/disney/wdpro/experiences/plugins/h;)V", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$SSOTokenUpdateListener;", "ssoTokenUpdateListener", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$SSOTokenUpdateListener;", "Companion", "a", "experiences-android_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
@Instrumented
@SourceDebugExtension({"SMAP\nHybridExperiencesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridExperiencesActivity.kt\ncom/disney/wdpro/experiences/HybridExperiencesActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,341:1\n1863#2,2:342\n1#3:344\n*S KotlinDebug\n*F\n+ 1 HybridExperiencesActivity.kt\ncom/disney/wdpro/experiences/HybridExperiencesActivity\n*L\n147#1:342,2\n*E\n"})
/* loaded from: classes27.dex */
public final class HybridExperiencesActivity extends BaseActivity implements SSOPlugin.RequestTokenForSSOListener, SSOPlugin.GetOneIDAccessTokenForSSOListener, PageEventsPlugin.PageEventsPluginListener, InterfaceC10634i, WebAnalyticsPluginListener {

    @Inject
    public AuthenticationManager authManager;
    private HybridCoordinator coordinator;

    @Inject
    public LightBoxSessionManager lightBoxSessionManager;

    @Inject
    public C10633h logger;
    private Context originalContext;
    private SSOPlugin.RequestTokenReadyForSSOListener requestTokenReadyForSSOListener;
    private SSOPlugin ssoPlugin;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final C32282a environmentController = new C32282a();
    private final SSOPlugin.SSOTokenUpdateListener ssoTokenUpdateListener = new C10617b();

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/experiences/HybridExperiencesActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "experiences-android_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.experiences.HybridExperiencesActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m45806a(Context context, Uri uri) {
            Intent intentPutExtra = new Intent(context, (Class<?>) HybridExperiencesActivity.class).putExtra("QueryParams", uri);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m92038d2 = {"com/disney/wdpro/experiences/HybridExperiencesActivity$b", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$SSOTokenUpdateListener;", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin;", "ssoPlugin", "Lcom/wdpr/ee/ra/rahybrid/model/EntryPointsConfig;", "entryPointsConfig", "", "onTokenUpdateReady", "(Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin;Lcom/wdpr/ee/ra/rahybrid/model/EntryPointsConfig;)V", "onTokenUpdateSuccess", "", "error", "onTokenUpdateFailure", "(Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin;Ljava/lang/String;)V", "experiences-android_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.experiences.HybridExperiencesActivity$b */
    public static final class C10617b implements SSOPlugin.SSOTokenUpdateListener {
        C10617b() {
        }

        @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
        public void onTokenUpdateFailure(SSOPlugin ssoPlugin, String error) {
            Intrinsics.checkNotNullParameter(ssoPlugin, "ssoPlugin");
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
        public void onTokenUpdateReady(SSOPlugin ssoPlugin, EntryPointsConfig entryPointsConfig) {
            Intrinsics.checkNotNullParameter(ssoPlugin, "ssoPlugin");
            Intrinsics.checkNotNullParameter(entryPointsConfig, "entryPointsConfig");
        }

        @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
        public void onTokenUpdateSuccess(SSOPlugin ssoPlugin, EntryPointsConfig entryPointsConfig) {
            Intrinsics.checkNotNullParameter(ssoPlugin, "ssoPlugin");
            Intrinsics.checkNotNullParameter(entryPointsConfig, "entryPointsConfig");
        }
    }

    /* renamed from: c0 */
    private final String m45799c0(String swid) {
        try {
            String json = GsonInstrumentation.toJson(new Gson(), MapsKt.mapOf(TuplesKt.m92045to("profile", MapsKt.mapOf(TuplesKt.m92045to("swid", swid)))));
            Intrinsics.checkNotNull(json);
            return new Regex(OppStringUtils.EMPTY_SPACES_REGEX).replace(json, "");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d0 */
    private final void m45800d0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Uri uri = (Uri) getIntent().getParcelableExtra("QueryParams");
        if (uri != null) {
            LogInstrumentation.m79024d("ExperiencesLoadConfigUrl: uri", uri.toString());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
            for (String str : queryParameterNames) {
                if (Intrinsics.areEqual(str, "environmentOverride")) {
                    String queryParameter = uri.getQueryParameter(str);
                    this.environmentController.m98881b(queryParameter != null ? queryParameter : "");
                } else {
                    String queryParameter2 = uri.getQueryParameter(str);
                    linkedHashMap2.put(str, queryParameter2 != null ? queryParameter2 : "");
                }
            }
            String strJoinToString$default = CollectionsKt.joinToString$default(linkedHashMap2.entrySet(), Constants.AMPERSAND, null, null, 0, null, new Function1() { // from class: com.disney.wdpro.experiences.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HybridExperiencesActivity.m45801e0((Map.Entry) obj);
                }
            }, 30, null);
            LogInstrumentation.m79024d("ExperiencesLoadConfigUrl: queryString", strJoinToString$default);
            linkedHashMap.put("QueryParams", strJoinToString$default);
        }
        linkedHashMap.put("EnvironmentURLSubdomain", this.environmentController.m98880a());
        C30113j.m92948d(C3816t.m20245a(this), C30180u0.m93207b(), null, new HybridExperiencesActivity$loadHybridConfigURL$2(this, linkedHashMap, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final CharSequence m45801e0(Map.Entry entry) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        return URLEncoder.encode(str, "UTF-8") + "=" + URLEncoder.encode(str2, "UTF-8");
    }

    @Override // com.disney.wdpro.experiences.plugins.InterfaceC10634i
    /* renamed from: D */
    public void mo45802D(String commandName, Object data) {
        Map<String, ? extends Object> mapEmptyMap;
        if (commandName == null || (mapEmptyMap = MapsKt.mapOf(TuplesKt.m92045to(commandName, data))) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        m45805b0().m45817a(ExperiencesEventModule.HYBRID_APP, ExperiencesEventType.EXPERIENCES_ANALYTICS_PLUGIN, C10628c.INSTANCE, mapEmptyMap);
    }

    @Override // com.disney.wdpro.experiences.plugins.InterfaceC10634i
    /* renamed from: L */
    public void mo45803L(String commandName, Object data) {
        Map<String, ? extends Object> mapEmptyMap;
        if (commandName == null || (mapEmptyMap = MapsKt.mapOf(TuplesKt.m92045to(commandName, data))) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        m45805b0().m45817a(ExperiencesEventModule.HYBRID_APP, ExperiencesEventType.EXPERIENCES_ANALYTICS_PLUGIN, C10630e.INSTANCE, mapEmptyMap);
    }

    /* renamed from: Z */
    public final AuthenticationManager m45804Z() {
        AuthenticationManager authenticationManager = this.authManager;
        if (authenticationManager != null) {
            return authenticationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        this.originalContext = base;
    }

    /* renamed from: b0 */
    public final C10633h m45805b0() {
        C10633h c10633h = this.logger;
        if (c10633h != null) {
            return c10633h;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logger");
        return null;
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.pageEvents.PageEventsPlugin.PageEventsPluginListener
    public void didReceiveClose(String commandParameters) {
        m45805b0().m45817a(ExperiencesEventModule.HYBRID_APP, ExperiencesEventType.PAGE_EVENTS_PLUGIN, C10627b.INSTANCE, MapsKt.mapOf(TuplesKt.m92045to("command", commandParameters)));
        finish();
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.pageEvents.PageEventsPlugin.PageEventsPluginListener
    public void didReceiveError(String commandParameters) {
        m45805b0().m45817a(ExperiencesEventModule.HYBRID_APP, ExperiencesEventType.PAGE_EVENTS_PLUGIN, C10629d.INSTANCE, MapsKt.mapOf(TuplesKt.m92045to("command", commandParameters)));
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.GetOneIDAccessTokenForSSOListener
    public void getOneIDAccessTokenForSSO(SSOPlugin.GetOneIDAccessTokenReadyForSSOListener getOneIDAccessTokenReadyForSSOListener) throws IOException {
        Unit unit;
        if (!m45804Z().isUserAuthenticated()) {
            LogInstrumentation.m79024d("SSOPlugin.GetOneIDAccessTokenReadyForSSOListener", "ERROR: getting AccessToken: No Access token or swid found.");
            if (getOneIDAccessTokenReadyForSSOListener != null) {
                getOneIDAccessTokenReadyForSSOListener.onOneIDAccessTokenReadyForSSO(null, null);
                Unit unit2 = Unit.INSTANCE;
                return;
            }
            return;
        }
        LogInstrumentation.m79024d("SSOPlugin.GetOneIDAccessTokenReadyForSSOListener", "Requesting Access Token");
        AccessTokenStatus guestAuthTokenStatus = m45804Z().getGuestAuthTokenStatus();
        if (guestAuthTokenStatus != null) {
            String accessToken = guestAuthTokenStatus.getAccessToken();
            String userSwid = m45804Z().getUserSwid();
            if (userSwid != null) {
                String strM45799c0 = m45799c0(userSwid);
                if (getOneIDAccessTokenReadyForSSOListener != null) {
                    getOneIDAccessTokenReadyForSSOListener.onOneIDAccessTokenReadyForSSO(accessToken, strM45799c0);
                }
                C10633h.m45816b(m45805b0(), ExperiencesEventModule.HYBRID_APP, ExperiencesEventType.EXPERIENCES_ANALYTICS_PLUGIN, C10626a.INSTANCE, null, 8, null);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        LogInstrumentation.m79024d("SSOPlugin.GetOneIDAccessTokenReadyForSSOListener", "Error getting AccessToken: No Access token or swid found.");
        if (getOneIDAccessTokenReadyForSSOListener != null) {
            getOneIDAccessTokenReadyForSSOListener.onOneIDAccessTokenReadyForSSO(null, null);
            Unit unit3 = Unit.INSTANCE;
        }
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws JsonSyntaxException, JsonIOException {
        super.onCreate(savedInstanceState);
        ComponentCallbacks2 application = getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.disney.wdpro.experiences.di.ExperiencesComponentProvider");
        InterfaceC32132c interfaceC32132cMo40026a = ((InterfaceC32133d) application).mo40026a();
        if (interfaceC32132cMo40026a != null) {
            interfaceC32132cMo40026a.mo42556a(this);
        }
        setContentView(C10621d.activity_main_hybrid_experiences_container);
        Object objFromJson = GsonInstrumentation.fromJson(new Gson(), (Reader) new BufferedReader(new InputStreamReader(getResources().openRawResource(C10622e.hybrid_config_voting_app))), (Class<Object>) HybridWebConfig.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        HybridCoordinator hybridCoordinatorMakeCoordinator = HybridFactory.makeCoordinator(this, (HybridWebConfig) objFromJson, (List<Class<? extends Plugin>>) CollectionsKt.mutableListOf(ExperiencesAnalyticsPlugin.class), (List<HttpCookie>) CollectionsKt.emptyList());
        this.coordinator = hybridCoordinatorMakeCoordinator;
        if (hybridCoordinatorMakeCoordinator != null) {
            AccessControlPlugin accessControlPlugin = hybridCoordinatorMakeCoordinator.getAccessControlPlugin();
            if (accessControlPlugin != null) {
                accessControlPlugin.setActivity(this);
            }
            getSupportFragmentManager().m19761r().m19871v(C10620c.hybrid_plugin_frame_layout, hybridCoordinatorMakeCoordinator.getHybridFragment()).mo19611k();
        }
        Intrinsics.checkNotNull(hybridCoordinatorMakeCoordinator);
        SSOPlugin sSOPlugin = hybridCoordinatorMakeCoordinator.getSSOPlugin();
        this.ssoPlugin = sSOPlugin;
        if (sSOPlugin != null) {
            sSOPlugin.setRequestTokenForSSOListener(this);
        }
        SSOPlugin sSOPlugin2 = this.ssoPlugin;
        if (sSOPlugin2 != null) {
            sSOPlugin2.setGetOneIdAccessTokenForSSOListener(this);
        }
        SSOPlugin sSOPlugin3 = this.ssoPlugin;
        if (sSOPlugin3 != null) {
            sSOPlugin3.addSSOTokenUpdateListener(this.ssoTokenUpdateListener);
        }
        hybridCoordinatorMakeCoordinator.getPageEventsPlugin().setPageEventsPluginListener(this);
        hybridCoordinatorMakeCoordinator.getWebAnalyticsPlugin().setWebAnalyticsPluginListener(this);
        Plugin plugin = hybridCoordinatorMakeCoordinator.getPlugin(ExperiencesAnalyticsPlugin.INSTANCE.m45814a());
        ExperiencesAnalyticsPlugin experiencesAnalyticsPlugin = plugin instanceof ExperiencesAnalyticsPlugin ? (ExperiencesAnalyticsPlugin) plugin : null;
        if (experiencesAnalyticsPlugin == null) {
            LogInstrumentation.m79024d("ExperiencesAnalyticsPlugin", "ExperiencesAnalyticsPlugin failed to load");
        } else {
            experiencesAnalyticsPlugin.m45813c(this);
            LogInstrumentation.m79024d("ExperiencesAnalyticsPlugin", "ExperiencesAnalyticsPlugin loaded");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedTrackActionData(WebAnalyticsPlugin webAnalyticsPlugin, String stateTitle, Map<String, Object> contextDataMap) {
        Intrinsics.checkNotNullParameter(webAnalyticsPlugin, "webAnalyticsPlugin");
        if (contextDataMap == null) {
            contextDataMap = MapsKt.emptyMap();
        }
        if (stateTitle != null) {
            m45805b0().m45817a(ExperiencesEventModule.HYBRID_APP, ExperiencesEventType.WEB_ANALYTICS_PLUGIN, new DidReceiveTrackAction(stateTitle), contextDataMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedTrackStateData(WebAnalyticsPlugin webAnalyticsPlugin, String stateTitle, Map<String, Object> contextDataMap) {
        Intrinsics.checkNotNullParameter(webAnalyticsPlugin, "webAnalyticsPlugin");
        if (contextDataMap == null) {
            contextDataMap = MapsKt.emptyMap();
        }
        if (stateTitle != null) {
            m45805b0().m45817a(ExperiencesEventModule.HYBRID_APP, ExperiencesEventType.WEB_ANALYTICS_PLUGIN, new DidReceiveTrackState(stateTitle), contextDataMap);
        }
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        m45800d0();
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.RequestTokenForSSOListener
    public void requestTokenForSSO(SSOPlugin.RequestTokenReadyForSSOListener requestTokenReadyForSSOListener) {
        this.requestTokenReadyForSSOListener = requestTokenReadyForSSOListener;
        LogInstrumentation.m79024d("SSOPlugin: RequestTokenReadyForSSOListener", "JWT Check");
        if (!m45804Z().isUserAuthenticated()) {
            LogInstrumentation.m79024d("SSOPlugin: RequestTokenReadyForSSOListener", "isUserAuthenticated=false");
            C10633h.m45816b(m45805b0(), ExperiencesEventModule.HYBRID_APP, ExperiencesEventType.EXPERIENCES_ANALYTICS_PLUGIN, C10638m.INSTANCE, null, 8, null);
            return;
        }
        LogInstrumentation.m79024d("SSOPlugin: RequestTokenReadyForSSOListener", "isUserAuthenticated=true");
        C10633h c10633hM45805b0 = m45805b0();
        ExperiencesEventModule experiencesEventModule = ExperiencesEventModule.HYBRID_APP;
        ExperiencesEventType experiencesEventType = ExperiencesEventType.EXPERIENCES_ANALYTICS_PLUGIN;
        C10633h.m45816b(c10633hM45805b0, experiencesEventModule, experiencesEventType, C10637l.INSTANCE, null, 8, null);
        if (requestTokenReadyForSSOListener != null) {
            requestTokenReadyForSSOListener.onJWTReadyForSSO(m45804Z().getAuthZJwtToken());
        }
        C10633h.m45816b(m45805b0(), experiencesEventModule, experiencesEventType, C10626a.INSTANCE, null, 8, null);
    }
}