package com.disney.wdpro.async_messaging.analytics;

import android.content.Context;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.async_messaging.activities.LiveChatActivity;
import com.disney.wdpro.commons.utils.SharedPreferenceUtility;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jose4j.jwk.OctetSequenceJsonWebKey;
import org.jose4j.jwk.RsaJsonWebKey;
import p699k9.C29553b;

@Singleton
@Metadata(m92037d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010'\n\u0000\n\u0002\u0010&\n\u0002\b\b\b\u0017\u0018\u0000 82\u00020\u0001:\u0001)B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ%\u0010 \u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010\u001bJ\u0017\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010\u001bJ'\u0010)\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010.RZ\u00102\u001aB\u0012\f\u0012\n 0*\u0004\u0018\u00010\u00180\u0018\u0012\f\u0012\n 0*\u0004\u0018\u00010\u00180\u0018 0* \u0012\f\u0012\n 0*\u0004\u0018\u00010\u00180\u0018\u0012\f\u0012\n 0*\u0004\u0018\u00010\u00180\u0018\u0018\u0001010/8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105RZ\u00106\u001aB\u0012\f\u0012\n 0*\u0004\u0018\u00010\u00180\u0018\u0012\f\u0012\n 0*\u0004\u0018\u00010\u00180\u0018 0* \u0012\f\u0012\n 0*\u0004\u0018\u00010\u00180\u0018\u0012\f\u0012\n 0*\u0004\u0018\u00010\u00180\u0018\u0018\u0001010/8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105¨\u00069"}, m92038d2 = {"Lcom/disney/wdpro/async_messaging/analytics/d;", "", "Lcom/disney/wdpro/analytics/k;", "analyticsHelper", "Landroid/content/Context;", "context", "Lk9/b;", "liveChatConfig", "Lcom/disney/wdpro/analytics/n;", "crashHelper", "<init>", "(Lcom/disney/wdpro/analytics/k;Landroid/content/Context;Lk9/b;Lcom/disney/wdpro/analytics/n;)V", "", OctetSequenceJsonWebKey.KEY_VALUE_MEMBER_NAME, "()V", "m", "l", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "h", "", "rating", "j", "(I)V", "i", "", VirtualQueueConstants.ALERT_MESSAGE, RsaJsonWebKey.MODULUS_MEMBER_NAME, "(Ljava/lang/String;)V", RsaJsonWebKey.FIRST_PRIME_FACTOR_MEMBER_NAME, "o", "campaignId", "extraSde", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "conversationId", "g", "f", "", "engagementId", "", "liveChatExtension", "a", "(JJZ)V", "Lcom/disney/wdpro/analytics/k;", "Landroid/content/Context;", "Lk9/b;", "Lcom/disney/wdpro/analytics/n;", "", "kotlin.jvm.PlatformType", "", "ASYNC_MESSAGE_LINK_CATEGORY_CONTEXT_ENTRY", "Ljava/util/Map$Entry;", "c", "()Ljava/util/Map$Entry;", "ASYNC_MESSAGE_BOOKING", "b", "Companion", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.async_messaging.analytics.d */
/* loaded from: classes24.dex */
public class C8911d {
    public static final String ACTION_BACK = "Back";
    public static final String ACTION_CONVERSATION_ENDED = "ConversationEnd";
    public static final String ACTION_CONVERSATION_STARTED = "ConversationStart";
    public static final String ACTION_EXIT_SURVEY = "ExitSurvey";
    public static final String ACTION_OPTIONS = "Options";
    public static final String ACTION_PUSH_MESSAGE = "PushMessage";
    public static final String ACTION_RESOLVED = "MarkResolved";
    public static final String ACTION_SESSION_TIME = "LeaveChat";
    public static final String ACTION_SUBMIT_SURVEY = "SubmitSurvey";
    public static final String ALERT_MESSAGE = "Alert.message";
    public static final String ALERT_TITLE = "Alert.title";
    public static final String ALERT_TITLE_MESSAGE = "AsyncMessaging";
    public static final String ALERT_TYPE = "Alert.type";
    public static final String ALERT_TYPE_MESSAGE = "messageid";
    public static final String ASYNC_MESSAGE_LINK_CATEGORY = "AsyncMessage";
    public static final String BOOKING_WINDOW = "Booking.window";
    public static final String ENTER_FLOW_EVENT_NAME = "LiveChatScreen";
    public static final String ENTER_FLOW_EVENT_TYPE = "ChatScreenDisplayTracking";
    public static final String SESSION_ID = "backend.sessionid";
    public static final String STATE_ASYNC_CHAT = "/tools/asyncmessage/chat";
    public static final String STATE_ASYNC_SURVEY = "/tools/asyncmessage/survey";
    public static final String SURVEY_RATING = "survey.Rating";
    private final Map.Entry<String, String> ASYNC_MESSAGE_BOOKING;
    private final Map.Entry<String, String> ASYNC_MESSAGE_LINK_CATEGORY_CONTEXT_ENTRY;
    private final InterfaceC8679k analyticsHelper;
    private final Context context;
    private final InterfaceC8682n crashHelper;
    private final C29553b liveChatConfig;
    public static final int $stable = 8;

    @Inject
    public C8911d(InterfaceC8679k analyticsHelper, Context context, C29553b liveChatConfig, InterfaceC8682n crashHelper) {
        Intrinsics.checkNotNullParameter(analyticsHelper, "analyticsHelper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(liveChatConfig, "liveChatConfig");
        Intrinsics.checkNotNullParameter(crashHelper, "crashHelper");
        this.analyticsHelper = analyticsHelper;
        this.context = context;
        this.liveChatConfig = liveChatConfig;
        this.crashHelper = crashHelper;
        this.ASYNC_MESSAGE_LINK_CATEGORY_CONTEXT_ENTRY = Maps.m69372i("link.category", ASYNC_MESSAGE_LINK_CATEGORY);
        this.ASYNC_MESSAGE_BOOKING = Maps.m69372i(BOOKING_WINDOW, String.valueOf(SharedPreferenceUtility.m39150g(context, "KEY_ANALYTICS_BOOKING_WINDOW", 0)));
    }

    /* renamed from: a */
    public void m37808a(long campaignId, long engagementId, boolean liveChatExtension) {
        InterfaceC8682n interfaceC8682n = this.crashHelper;
        Intrinsics.checkNotNull(Long.valueOf(campaignId), "null cannot be cast to non-null type kotlin.Any");
        Pair pairM92045to = TuplesKt.m92045to("campaignId", Long.valueOf(campaignId));
        Intrinsics.checkNotNull(Long.valueOf(engagementId), "null cannot be cast to non-null type kotlin.Any");
        Pair pairM92045to2 = TuplesKt.m92045to("engagementId", Long.valueOf(engagementId));
        Intrinsics.checkNotNull(Boolean.valueOf(liveChatExtension), "null cannot be cast to non-null type kotlin.Any");
        interfaceC8682n.recordCustomEvent(ENTER_FLOW_EVENT_TYPE, ENTER_FLOW_EVENT_NAME, MapsKt.hashMapOf(pairM92045to, pairM92045to2, TuplesKt.m92045to("chat_permission_extended", Boolean.valueOf(liveChatExtension))));
    }

    /* renamed from: b */
    public Map.Entry<String, String> m37809b() {
        return this.ASYNC_MESSAGE_BOOKING;
    }

    /* renamed from: c */
    public Map.Entry<String, String> m37810c() {
        return this.ASYNC_MESSAGE_LINK_CATEGORY_CONTEXT_ENTRY;
    }

    /* renamed from: d */
    public void m37811d(String campaignId, String extraSde) {
        this.liveChatConfig.m91863a().m37828e(campaignId, extraSde);
    }

    /* renamed from: e */
    public void m37812e() {
        this.analyticsHelper.mo37407d("Back", m37810c());
    }

    /* renamed from: f */
    public void m37813f(String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        this.analyticsHelper.mo37407d(ACTION_CONVERSATION_ENDED, m37810c(), Maps.m69372i(SESSION_ID, conversationId));
    }

    /* renamed from: g */
    public void m37814g(String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        this.analyticsHelper.mo37407d(ACTION_CONVERSATION_STARTED, m37810c(), Maps.m69372i(SESSION_ID, conversationId));
    }

    /* renamed from: h */
    public void m37815h() {
        this.analyticsHelper.mo37411h(STATE_ASYNC_SURVEY, LiveChatActivity.class.getSimpleName(), m37809b());
    }

    /* renamed from: i */
    public void m37816i() {
        this.analyticsHelper.mo37407d(ACTION_EXIT_SURVEY, m37810c());
    }

    /* renamed from: j */
    public void m37817j(int rating) {
        this.analyticsHelper.mo37407d(ACTION_SUBMIT_SURVEY, m37810c(), m37809b(), Maps.m69372i(SURVEY_RATING, String.valueOf(rating)));
    }

    /* renamed from: k */
    public void m37818k() {
        this.analyticsHelper.mo37411h(STATE_ASYNC_CHAT, LiveChatActivity.class.getSimpleName(), new Map.Entry[0]);
    }

    /* renamed from: l */
    public void m37819l() {
        this.analyticsHelper.mo37407d(ACTION_RESOLVED, m37810c(), m37809b());
    }

    /* renamed from: m */
    public void m37820m() {
        this.analyticsHelper.mo37407d(ACTION_OPTIONS, m37810c(), m37809b());
    }

    /* renamed from: n */
    public void m37821n(String alertMessage) {
        Intrinsics.checkNotNullParameter(alertMessage, "alertMessage");
        this.analyticsHelper.mo37407d("PushMessage", m37810c(), Maps.m69372i(ALERT_MESSAGE, alertMessage), Maps.m69372i(ALERT_TITLE, ALERT_TITLE_MESSAGE), Maps.m69372i(ALERT_TYPE, ALERT_TYPE_MESSAGE), m37809b());
    }

    /* renamed from: o */
    public void m37822o() {
        this.analyticsHelper.trackTimedActionEnd(ACTION_SESSION_TIME);
    }

    /* renamed from: p */
    public void m37823p() {
        this.analyticsHelper.trackTimedActionStart(ACTION_SESSION_TIME, MapsKt.mapOf(TuplesKt.m92045to("link.category", ASYNC_MESSAGE_LINK_CATEGORY)));
    }
}