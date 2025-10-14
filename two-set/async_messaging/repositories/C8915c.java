package com.disney.wdpro.async_messaging.repositories;

import android.content.Context;
import androidx.view.C3783c0;
import com.couchbase.lite.internal.BaseTLSIdentity;
import com.disney.wdpro.async_messaging.analytics.C8909b;
import com.disney.wdpro.async_messaging.analytics.C8911d;
import com.disney.wdpro.commons.livedata.C9320b;
import com.disney.wdpro.commons.utils.SharedPreferenceUtility;
import com.google.common.util.concurrent.C22888g;
import com.google.common.util.concurrent.InterfaceFutureC22897n;
import com.liveperson.api.sdk.C23913a;
import com.liveperson.infra.C23932h;
import com.liveperson.infra.C23935k;
import com.liveperson.infra.InterfaceC23930f;
import com.liveperson.messaging.model.C24272b;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import es.InterfaceC27756a;
import java.util.concurrent.Future;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ls.InterfaceC30380c;
import org.jose4j.jwk.EllipticCurveJsonWebKey;
import org.jose4j.jwk.OctetSequenceJsonWebKey;
import org.jose4j.jwk.RsaJsonWebKey;
import p1124yv.InterfaceC33743a;
import p1158zv.ConsumerProfile;
import p699k9.C29553b;
import p699k9.InterfaceC29554c;
import p768n9.Agent;
import p768n9.InterfaceC30634g;

@Metadata(m92037d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020\u0001:\u00010B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J!\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001f0\u001e0\u0015H\u0016¢\u0006\u0004\b \u0010\u0018J#\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e0\u0015H\u0016¢\u0006\u0004\b!\u0010\u0018J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010&J\u000f\u0010,\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010&J\u000f\u0010-\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010&J\u0017\u00100\u001a\u00020\u00122\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f02H\u0016¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010\u001f8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00158\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00160\u00198\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00158\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bO\u0010JR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00158\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bP\u0010JR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u00198\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bR\u0010MR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0\u00198\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bS\u0010MR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0\u00198\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bT\u0010MR&\u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001f0\u001e0\u00158\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bU\u0010JR(\u0010V\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e0\u00158\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bV\u0010JR$\u0010X\u001a\u0004\u0018\u00010W8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010^\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020\u001f8RX\u0092\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010e¨\u0006i"}, m92038d2 = {"Lcom/disney/wdpro/async_messaging/repositories/c;", "Lcom/disney/wdpro/async_messaging/repositories/a;", "Landroid/content/Context;", "context", "Lk9/c;", "environment", "Ln9/g;", "livePerson", "Lcom/disney/wdpro/async_messaging/analytics/d;", "liveChatAnalytics", "Lk9/b;", "configuration", "Lcom/disney/wdpro/async_messaging/analytics/b;", "campaign", "<init>", "(Landroid/content/Context;Lk9/c;Ln9/g;Lcom/disney/wdpro/async_messaging/analytics/d;Lk9/b;Lcom/disney/wdpro/async_messaging/analytics/b;)V", "Lcom/liveperson/messaging/model/b;", "agentData", "", "K", "(Lcom/liveperson/messaging/model/b;)V", "Landroidx/lifecycle/c0;", "", "I", "()Landroidx/lifecycle/c0;", "Lcom/disney/wdpro/commons/livedata/b;", "J", "()Lcom/disney/wdpro/commons/livedata/b;", "Ln9/a;", EllipticCurveJsonWebKey.Y_MEMBER_NAME, "Lkotlin/Pair;", "", "d", "f", "Lcom/liveperson/infra/h;", "H", "()Lcom/liveperson/infra/h;", "initialize", "()V", "c", "token", "L", "(Ljava/lang/String;)V", "m", RsaJsonWebKey.EXPONENT_MEMBER_NAME, OctetSequenceJsonWebKey.KEY_VALUE_MEMBER_NAME, "Lzv/a;", "consumerProfile", "a", "(Lzv/a;)V", "Ljava/util/concurrent/Future;", "j", "()Ljava/util/concurrent/Future;", "Landroid/content/Context;", BaseTLSIdentity.CERT_ATTRIBUTE_COUNTRY, "()Landroid/content/Context;", "Lk9/c;", "D", "()Lk9/c;", "Ln9/g;", "F", "()Ln9/g;", "Lcom/disney/wdpro/async_messaging/analytics/d;", "E", "()Lcom/disney/wdpro/async_messaging/analytics/d;", "Lk9/b;", "getConfiguration", "()Lk9/b;", "Lcom/disney/wdpro/async_messaging/analytics/b;", "B", "()Lcom/disney/wdpro/async_messaging/analytics/b;", "agentName", "Ljava/lang/String;", "agentLiveData", "Landroidx/lifecycle/c0;", "agentTypingLiveData", "tokenExpiredLiveData", "Lcom/disney/wdpro/commons/livedata/b;", "", "unreadMessagesCountLiveData", "surveySubmittedLiveData", "Ljava/lang/Void;", "surveyLaunchedLiveData", "surveySkippedLiveData", "surveyDismissedLiveData", "hasOpenConversations", "isOnSurveyScreen", "Lcom/disney/wdpro/async_messaging/repositories/b;", "livePersonConnectionCallback", "Lcom/disney/wdpro/async_messaging/repositories/b;", "G", "()Lcom/disney/wdpro/async_messaging/repositories/b;", "h", "(Lcom/disney/wdpro/async_messaging/repositories/b;)V", "isSDKInitialized", "Z", "g", "()Z", "M", "(Z)V", "z", "()Ljava/lang/String;", AnalyticsAttribute.APP_ID_ATTRIBUTE, "A", "brandId", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.async_messaging.repositories.c */
/* loaded from: classes24.dex */
public class C8915c implements InterfaceC8913a {
    public static final int $stable = 8;
    private final C3783c0<Agent> agentLiveData;
    private String agentName;
    private final C3783c0<Boolean> agentTypingLiveData;
    private final C8909b campaign;
    private final C29553b configuration;
    private final Context context;
    private final InterfaceC29554c environment;
    private final C3783c0<Pair<Boolean, String>> hasOpenConversations;
    private final C3783c0<Pair<Boolean, String>> isOnSurveyScreen;
    private boolean isSDKInitialized;
    private final C8911d liveChatAnalytics;
    private final InterfaceC30634g livePerson;
    private InterfaceC8914b livePersonConnectionCallback;
    private final C9320b<Void> surveyDismissedLiveData;
    private final C9320b<Void> surveyLaunchedLiveData;
    private final C9320b<Void> surveySkippedLiveData;
    private final C3783c0<String> surveySubmittedLiveData;
    private final C9320b<Boolean> tokenExpiredLiveData;
    private final C3783c0<Integer> unreadMessagesCountLiveData;

    @Metadata(m92037d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u0016\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u0019\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, m92038d2 = {"Lcom/disney/wdpro/async_messaging/repositories/c$a;", "Les/a$a;", "<init>", "(Lcom/disney/wdpro/async_messaging/repositories/c;)V", "", "isConnected", "", "g", "(Z)V", "Lcom/liveperson/messaging/model/b;", "agentData", BaseTLSIdentity.CERT_ATTRIBUTE_COUNTRY, "(Lcom/liveperson/messaging/model/b;)V", "agentTyping", RsaJsonWebKey.PRIME_FACTOR_OTHER_MEMBER_NAME, RsaJsonWebKey.MODULUS_MEMBER_NAME, "()V", OctetSequenceJsonWebKey.KEY_VALUE_MEMBER_NAME, "", "conversationId", "", "rating", "A", "(Ljava/lang/String;I)V", "v", "m", "Lcom/liveperson/api/sdk/a;", "convData", "h", "(Lcom/liveperson/api/sdk/a;)V", "s", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
    @SourceDebugExtension({"SMAP\nLivePersonRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LivePersonRepository.kt\ncom/disney/wdpro/async_messaging/repositories/LivePersonRepository$LivePersonCallbackImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
    /* renamed from: com.disney.wdpro.async_messaging.repositories.c$a */
    public final class a extends InterfaceC27756a.a {
        public a() {
        }

        @Override // es.InterfaceC27756a.a, es.InterfaceC27756a
        /* renamed from: A */
        public void mo37873A(String conversationId, int rating) {
            C8915c.this.isOnSurveyScreen.setValue(new Pair(Boolean.FALSE, null));
            C8915c.this.surveySubmittedLiveData.setValue(conversationId);
            C8915c.this.getLiveChatAnalytics().m37817j(rating);
        }

        @Override // es.InterfaceC27756a.a, es.InterfaceC27756a
        /* renamed from: C */
        public void mo37874C(C24272b agentData) {
            Intrinsics.checkNotNullParameter(agentData, "agentData");
            C8915c.this.m37847K(agentData);
        }

        @Override // es.InterfaceC27756a.a, es.InterfaceC27756a
        /* renamed from: g */
        public void mo37875g(boolean isConnected) {
            super.mo37875g(isConnected);
            if (isConnected) {
                C8915c.this.mo37838e();
                C8915c.this.mo37846m();
                InterfaceC8914b livePersonConnectionCallback = C8915c.this.getLivePersonConnectionCallback();
                if (livePersonConnectionCallback != null) {
                    livePersonConnectionCallback.mo37791t();
                }
            }
        }

        @Override // es.InterfaceC27756a.a, es.InterfaceC27756a
        /* renamed from: h */
        public void mo37876h(C23913a convData) {
            String strM75847b;
            super.mo37876h(convData);
            C3783c0 c3783c0 = C8915c.this.hasOpenConversations;
            Boolean bool = Boolean.TRUE;
            if (convData == null || (strM75847b = convData.m75847b()) == null) {
                strM75847b = "";
            }
            c3783c0.postValue(new Pair(bool, strM75847b));
        }

        @Override // es.InterfaceC27756a.a, es.InterfaceC27756a
        /* renamed from: k */
        public void mo37877k() {
            C8915c.this.isOnSurveyScreen.postValue(new Pair(Boolean.TRUE, C8915c.this.agentName));
            C8915c.this.surveyLaunchedLiveData.call();
            C8915c.this.getLiveChatAnalytics().m37815h();
        }

        @Override // es.InterfaceC27756a.a, es.InterfaceC27756a
        /* renamed from: m */
        public void mo37878m() {
            C8915c.this.isOnSurveyScreen.setValue(new Pair(Boolean.FALSE, null));
            C8915c.this.surveyDismissedLiveData.call();
        }

        @Override // es.InterfaceC27756a.a, es.InterfaceC27756a
        /* renamed from: n */
        public void mo37879n() {
            C8915c.this.tokenExpiredLiveData.call();
        }

        @Override // es.InterfaceC27756a.a, es.InterfaceC27756a
        /* renamed from: r */
        public void mo37880r(boolean agentTyping) {
            C8915c.this.agentTypingLiveData.setValue(Boolean.valueOf(agentTyping));
        }

        @Override // es.InterfaceC27756a.a, es.InterfaceC27756a
        /* renamed from: s */
        public void mo37881s(C23913a convData) {
            String strM75847b;
            super.mo37881s(convData);
            C3783c0 c3783c0 = C8915c.this.hasOpenConversations;
            Boolean bool = Boolean.FALSE;
            if (convData == null || (strM75847b = convData.m75847b()) == null) {
                strM75847b = "";
            }
            c3783c0.postValue(new Pair(bool, strM75847b));
        }

        @Override // es.InterfaceC27756a.a, es.InterfaceC27756a
        /* renamed from: v */
        public void mo37882v() {
            C8915c.this.isOnSurveyScreen.setValue(new Pair(Boolean.FALSE, null));
            C8915c.this.surveySkippedLiveData.call();
            C8915c.this.getLiveChatAnalytics().m37816i();
        }
    }

    @Metadata(m92037d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m92038d2 = {"com/disney/wdpro/async_messaging/repositories/c$b", "Lcom/liveperson/infra/f;", "Lcom/liveperson/messaging/model/b;", "Ljava/lang/Exception;", "agentData", "", "b", "(Lcom/liveperson/messaging/model/b;)V", "exception", "a", "(Ljava/lang/Exception;)V", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.async_messaging.repositories.c$b */
    public static final class b implements InterfaceC23930f<C24272b, Exception> {
        b() {
        }

        @Override // com.liveperson.infra.InterfaceC23930f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exception) {
            String.valueOf(exception);
        }

        @Override // com.liveperson.infra.InterfaceC23930f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(C24272b agentData) {
            if (agentData != null) {
                C8915c.this.m37847K(agentData);
            } else {
                C8915c.this.agentLiveData.postValue(null);
            }
        }
    }

    @Metadata(m92037d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m92038d2 = {"com/disney/wdpro/async_messaging/repositories/c$c", "Lcom/liveperson/infra/f;", "", "Ljava/lang/Exception;", "result", "", "b", "(Ljava/lang/Boolean;)V", "p0", "a", "(Ljava/lang/Exception;)V", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.async_messaging.repositories.c$c */
    public static final class c implements InterfaceC23930f<Boolean, Exception> {
        c() {
        }

        @Override // com.liveperson.infra.InterfaceC23930f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception p02) {
            C8915c.this.hasOpenConversations.postValue(new Pair(Boolean.FALSE, ""));
        }

        @Override // com.liveperson.infra.InterfaceC23930f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean result) {
            C8915c.this.hasOpenConversations.postValue(new Pair(Boolean.valueOf(result != null ? result.booleanValue() : false), ""));
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"com/disney/wdpro/async_messaging/repositories/c$d", "Lls/c;", "Ljava/lang/Exception;", "exception", "", "b", "(Ljava/lang/Exception;)V", "a", "()V", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.async_messaging.repositories.c$d */
    public static final class d implements InterfaceC30380c {
        d() {
        }

        @Override // ls.InterfaceC30380c
        /* renamed from: a */
        public void mo28971a() {
            C8915c.this.getLivePerson().mo94434g(C8915c.this.new a());
            String strM39147d = SharedPreferenceUtility.m39147d(C8915c.this.getContext(), "firebaseToken", null);
            if (strM39147d == null) {
                C8915c.this.m37871M(false);
            } else {
                C8915c.this.m37871M(true);
                C8915c.this.m37870L(strM39147d);
            }
        }

        @Override // ls.InterfaceC30380c
        /* renamed from: b */
        public void mo28972b(Exception exception) {
            C8915c.this.m37871M(false);
            if (exception != null) {
                exception.getMessage();
            }
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m92038d2 = {"com/disney/wdpro/async_messaging/repositories/c$e", "Lyv/a;", "", "b", "()V", "a", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.async_messaging.repositories.c$e */
    public static final class e implements InterfaceC33743a {
        e() {
        }

        @Override // p1124yv.InterfaceC33743a
        /* renamed from: a */
        public void mo37887a() {
            C8915c.this.m37871M(false);
        }

        @Override // p1124yv.InterfaceC33743a
        /* renamed from: b */
        public void mo37888b() {
            C8915c.this.m37871M(false);
        }
    }

    @Inject
    public C8915c(Context context, InterfaceC29554c environment, InterfaceC30634g livePerson, C8911d liveChatAnalytics, C29553b configuration, C8909b campaign) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(livePerson, "livePerson");
        Intrinsics.checkNotNullParameter(liveChatAnalytics, "liveChatAnalytics");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        this.context = context;
        this.environment = environment;
        this.livePerson = livePerson;
        this.liveChatAnalytics = liveChatAnalytics;
        this.configuration = configuration;
        this.campaign = campaign;
        this.agentLiveData = new C3783c0<>();
        this.agentTypingLiveData = new C3783c0<>();
        this.tokenExpiredLiveData = new C9320b<>();
        this.unreadMessagesCountLiveData = new C3783c0<>();
        this.surveySubmittedLiveData = new C3783c0<>();
        this.surveyLaunchedLiveData = new C9320b<>();
        this.surveySkippedLiveData = new C9320b<>();
        this.surveyDismissedLiveData = new C9320b<>();
        this.hasOpenConversations = new C3783c0<>();
        this.isOnSurveyScreen = new C3783c0<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public void m37847K(C24272b agentData) {
        Agent agent = new Agent(null, null, null, null, null, 31, null);
        this.agentName = agentData.f53481e;
        agent.m94424c(agentData.f53480d);
        agent.m94425d(agentData.f53477a);
        agent.m94426e(agentData.f53478b);
        agent.m94427f(agentData.f53481e);
        agent.m94423b(agentData.f53479c);
        this.agentLiveData.postValue(agent);
    }

    /* renamed from: z */
    private String m37859z() {
        return getEnvironment().getAppId();
    }

    /* renamed from: A */
    public String m37860A() {
        return getEnvironment().getBrandId();
    }

    /* renamed from: B, reason: from getter */
    public C8909b getCampaign() {
        return this.campaign;
    }

    /* renamed from: C, reason: from getter */
    public Context getContext() {
        return this.context;
    }

    /* renamed from: D, reason: from getter */
    public InterfaceC29554c getEnvironment() {
        return this.environment;
    }

    /* renamed from: E, reason: from getter */
    public C8911d getLiveChatAnalytics() {
        return this.liveChatAnalytics;
    }

    /* renamed from: F, reason: from getter */
    public InterfaceC30634g getLivePerson() {
        return this.livePerson;
    }

    /* renamed from: G, reason: from getter */
    public InterfaceC8914b getLivePersonConnectionCallback() {
        return this.livePersonConnectionCallback;
    }

    /* renamed from: H */
    public C23932h m37867H() {
        return new C23932h(m37860A(), m37859z(), new C23935k(getEnvironment().getAppInstallationId()), new d());
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8913a
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public C3783c0<Boolean> mo37842i() {
        return this.agentTypingLiveData;
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8913a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public C9320b<Boolean> mo37845l() {
        return this.tokenExpiredLiveData;
    }

    /* renamed from: L */
    public void m37870L(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        getLivePerson().mo94431d(m37860A(), m37859z(), token);
    }

    /* renamed from: M */
    public void m37871M(boolean z10) {
        this.isSDKInitialized = z10;
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8913a
    /* renamed from: a */
    public void mo37834a(ConsumerProfile consumerProfile) {
        Intrinsics.checkNotNullParameter(consumerProfile, "consumerProfile");
        getLivePerson().mo94428a(consumerProfile);
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8913a
    /* renamed from: c */
    public void mo37836c() {
        getLivePerson().mo94436i();
        getLiveChatAnalytics().m37819l();
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8913a
    /* renamed from: d */
    public C3783c0<Pair<Boolean, String>> mo37837d() {
        return this.hasOpenConversations;
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8913a
    /* renamed from: e */
    public void mo37838e() {
        getLivePerson().mo94429b(new b());
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8913a
    /* renamed from: f */
    public C3783c0<Pair<Boolean, String>> mo37839f() {
        return this.isOnSurveyScreen;
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8913a
    /* renamed from: g, reason: from getter */
    public boolean getIsSDKInitialized() {
        return this.isSDKInitialized;
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8913a
    /* renamed from: h */
    public void mo37841h(InterfaceC8914b interfaceC8914b) {
        this.livePersonConnectionCallback = interfaceC8914b;
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8913a
    public void initialize() {
        getCampaign().m37802c();
        getLivePerson().mo94435h(getContext(), m37867H());
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8913a
    /* renamed from: j */
    public Future<String> mo37843j() {
        InterfaceFutureC22897n interfaceFutureC22897nM69921e = C22888g.m69921e(getCampaign().getCampaignId());
        Intrinsics.checkNotNullExpressionValue(interfaceFutureC22897nM69921e, "immediateFuture(...)");
        return interfaceFutureC22897nM69921e;
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8913a
    /* renamed from: k */
    public void mo37844k() {
        getLivePerson().mo94437j(getContext(), m37860A(), m37859z(), new e());
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8913a
    /* renamed from: m */
    public void mo37846m() {
        getLivePerson().mo94433f(new c());
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8913a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C3783c0<Agent> mo37835b() {
        return this.agentLiveData;
    }
}