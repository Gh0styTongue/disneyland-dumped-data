package com.disney.wdpro.experiences.plugins;

import com.disney.wdpro.dash.dao.C9433g0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/experiences/plugins/ExperiencesAnalyticsPlugin;", "Lcom/wdpr/ee/ra/rahybrid/plugin/Plugin;", "Lcom/wdpr/ee/ra/rahybrid/plugin/capabilities/WebMessageReceivable;", "Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;", "config", "<init>", "(Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;)V", "", "getId", "()Ljava/lang/String;", "", "Lcom/wdpr/ee/ra/rahybrid/CallbackHandler;", "", "getWebMessageHandlers", "()Ljava/util/Map;", "Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;", "Lcom/disney/wdpro/experiences/plugins/i;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/disney/wdpro/experiences/plugins/i;", "b", "()Lcom/disney/wdpro/experiences/plugins/i;", "c", "(Lcom/disney/wdpro/experiences/plugins/i;)V", "Companion", "a", "experiences-android_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
/* loaded from: classes27.dex */
public final class ExperiencesAnalyticsPlugin extends Plugin implements WebMessageReceivable {
    private final PluginConfig config;
    private InterfaceC10634i listener;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final String CommandAnalytics = C9433g0.ANALYTICS_PROPERTY;
    private static final String CommandEvent = "event";

    /* renamed from: ID */
    private static final String f31916ID = "ExperiencesAnalyticsPlugin";

    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/experiences/plugins/ExperiencesAnalyticsPlugin$a;", "", "<init>", "()V", "", "ID", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "experiences-android_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.experiences.plugins.ExperiencesAnalyticsPlugin$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m45814a() {
            return ExperiencesAnalyticsPlugin.f31916ID;
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"com/disney/wdpro/experiences/plugins/ExperiencesAnalyticsPlugin$b", "Lcom/wdpr/ee/ra/rahybrid/CallbackHandler;", "", "", "commandName", "data", "", "onMessage", "(Ljava/lang/String;Ljava/lang/Object;)V", "experiences-android_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.experiences.plugins.ExperiencesAnalyticsPlugin$b */
    public static final class C10624b extends CallbackHandler<Object> {
        C10624b() {
        }

        @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
        public void onMessage(String commandName, Object data) {
            InterfaceC10634i listener = ExperiencesAnalyticsPlugin.this.getListener();
            if (listener != null) {
                listener.mo45802D(commandName, data);
            }
        }
    }

    @Metadata(m92037d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"com/disney/wdpro/experiences/plugins/ExperiencesAnalyticsPlugin$c", "Lcom/wdpr/ee/ra/rahybrid/CallbackHandler;", "", "", "commandName", "data", "", "onMessage", "(Ljava/lang/String;Ljava/lang/Object;)V", "experiences-android_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.experiences.plugins.ExperiencesAnalyticsPlugin$c */
    public static final class C10625c extends CallbackHandler<Object> {
        C10625c() {
        }

        @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
        public void onMessage(String commandName, Object data) {
            InterfaceC10634i listener = ExperiencesAnalyticsPlugin.this.getListener();
            if (listener != null) {
                listener.mo45803L(commandName, data);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperiencesAnalyticsPlugin(PluginConfig config) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    /* renamed from: b, reason: from getter */
    public final InterfaceC10634i getListener() {
        return this.listener;
    }

    /* renamed from: c */
    public final void m45813c(InterfaceC10634i interfaceC10634i) {
        this.listener = interfaceC10634i;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return f31916ID;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler<Object>> getWebMessageHandlers() {
        return MapsKt.mutableMapOf(TuplesKt.m92045to(CommandAnalytics, new C10624b()), TuplesKt.m92045to(CommandEvent, new C10625c()));
    }
}