package com.disney.wdpro.async_messaging.viewmodels;

import android.accounts.AuthenticatorException;
import android.content.Context;
import android.os.Bundle;
import androidx.view.AbstractC3817t0;
import androidx.view.AbstractC3830y;
import androidx.view.C3783c0;
import com.couchbase.lite.internal.BaseTLSIdentity;
import com.disney.wdpro.async_messaging.analytics.C8911d;
import com.disney.wdpro.async_messaging.repositories.InterfaceC8913a;
import com.disney.wdpro.async_messaging.repositories.InterfaceC8914b;
import com.disney.wdpro.commons.p077di.AbstractC9295d;
import com.disney.wdpro.commons.utils.SharedPreferenceUtility;
import com.disney.wdpro.eservices_ui.commons.utils.CommonNewRelicUtils;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C30022f;
import kotlinx.coroutines.flow.InterfaceC30020d;
import org.jose4j.jwk.EllipticCurveJsonWebKey;
import p1158zv.ConsumerProfile;
import p699k9.InterfaceC29554c;
import p753m9.InterfaceC30476a;
import p768n9.Agent;

@Metadata(m92037d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\b\u0017\u0018\u0000 X2\u00020\u0001:\u0001YB;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0012¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0012¢\u0006\u0004\b\u0013\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0012¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001aH\u0016¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u0015H\u0010¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010#\u001a\u00020\u0015H\u0010¢\u0006\u0004\b#\u0010\u0017J\u0019\u0010&\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010\u0017J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010/J\u0017\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0014\u0010\r\u001a\u00020\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\r\u0010:R \u0010<\u001a\b\u0012\u0004\u0012\u00020\u001d0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010A\u001a\b\u0012\u0004\u0012\u00020@0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010?R,\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100C0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010?R(\u0010G\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00100C0F8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010I\u001a\b\u0012\u0004\u0012\u00020\u001d0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010=\u001a\u0004\bJ\u0010?R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0F8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bL\u0010HR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020K0F8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bM\u0010HR\u0018\u0010N\u001a\u0004\u0018\u00010$8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010P\u001a\u0004\u0018\u00010\u00108\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bP\u0010QR(\u0010S\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00100C0;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010?R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020K0;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010?R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020K0;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010?¨\u0006Z"}, m92038d2 = {"Lcom/disney/wdpro/async_messaging/viewmodels/LiveChatViewModel;", "Landroidx/lifecycle/t0;", "Lcom/disney/wdpro/async_messaging/repositories/a;", "liveChatRepository", "Lm9/a;", "jsonWebTokenManager", "Lcom/disney/wdpro/async_messaging/analytics/d;", "liveChatAnalytics", "Landroid/content/Context;", "context", "Lk9/c;", "environment", "Lkotlinx/coroutines/CoroutineDispatcher;", AbstractC9295d.IO_DISPATCHER, "<init>", "(Lcom/disney/wdpro/async_messaging/repositories/a;Lm9/a;Lcom/disney/wdpro/async_messaging/analytics/d;Landroid/content/Context;Lk9/c;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "D", "()Ljava/lang/String;", "G", "A", "", "w", "()V", BaseTLSIdentity.CERT_ATTRIBUTE_ORGANIZATION, "v", "Lkotlinx/coroutines/flow/d;", "I", "()Lkotlinx/coroutines/flow/d;", "", "H", "()Z", "N", "R", "Q", "P", "Landroid/os/Bundle;", OrionDeepLinkConstants.PAM_MODIFY_BUNDLE, "L", "(Landroid/os/Bundle;)V", CommonNewRelicUtils.RESORT_STATIC_CONTENT_ERROR_TYPE_SW, "Lzv/a;", "consumerProfile", "U", "(Lzv/a;)V", "conversationId", "K", "(Ljava/lang/String;)V", "J", "Lcom/disney/wdpro/async_messaging/repositories/b;", "callBack", "T", "(Lcom/disney/wdpro/async_messaging/repositories/b;)V", "Lcom/disney/wdpro/async_messaging/repositories/a;", "Lm9/a;", "Lcom/disney/wdpro/async_messaging/analytics/d;", "Landroid/content/Context;", "Lk9/c;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Landroidx/lifecycle/y;", "agentTyping", "Landroidx/lifecycle/y;", EllipticCurveJsonWebKey.Y_MEMBER_NAME, "()Landroidx/lifecycle/y;", "Ln9/a;", "agent", EllipticCurveJsonWebKey.X_MEMBER_NAME, "Lkotlin/Pair;", "openConversations", "F", "Landroidx/lifecycle/c0;", "_onSurveyScreenShown", "Landroidx/lifecycle/c0;", "hasTokenExpired", BaseTLSIdentity.CERT_ATTRIBUTE_COUNTRY, "", "_campaignId", "_engagementId", "intentBundle", "Landroid/os/Bundle;", "extraSde", "Ljava/lang/String;", "E", "onSurveyScreenShown", "z", "campaignId", "B", "engagementId", "Companion", "a", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nLiveChatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveChatViewModel.kt\ncom/disney/wdpro/async_messaging/viewmodels/LiveChatViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
/* loaded from: classes24.dex */
public class LiveChatViewModel extends AbstractC3817t0 {
    public static final String EXTRA_CAMPAIGN_ID = "campaignId";
    public static final String EXTRA_ENGAGEMENT_ID = "engagementId";
    public static final String EXTRA_LIVE_CHAT_EXTENSION = "LiveChatTileExtension";
    public static final String EXTRA_SDE = "SDE";
    public static final String PREF_TIMESTAMP = "PREF_LIVE_CHAT_TIMESTAMP";
    private final C3783c0<Long> _campaignId;
    private final C3783c0<Long> _engagementId;
    private final C3783c0<Pair<Boolean, String>> _onSurveyScreenShown;
    private final AbstractC3830y<Agent> agent;
    private final AbstractC3830y<Boolean> agentTyping;
    private final Context context;
    private final InterfaceC29554c environment;
    private String extraSde;
    private final AbstractC3830y<Boolean> hasTokenExpired;
    private Bundle intentBundle;
    private final CoroutineDispatcher ioDispatcher;
    private final InterfaceC30476a jsonWebTokenManager;
    private final C8911d liveChatAnalytics;
    private final InterfaceC8913a liveChatRepository;
    private final AbstractC3830y<Pair<Boolean, String>> openConversations;
    public static final int $stable = 8;

    @Inject
    public LiveChatViewModel(InterfaceC8913a liveChatRepository, InterfaceC30476a jsonWebTokenManager, C8911d liveChatAnalytics, Context context, InterfaceC29554c environment, @Named(AbstractC9295d.IO_DISPATCHER) CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(liveChatRepository, "liveChatRepository");
        Intrinsics.checkNotNullParameter(jsonWebTokenManager, "jsonWebTokenManager");
        Intrinsics.checkNotNullParameter(liveChatAnalytics, "liveChatAnalytics");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.liveChatRepository = liveChatRepository;
        this.jsonWebTokenManager = jsonWebTokenManager;
        this.liveChatAnalytics = liveChatAnalytics;
        this.context = context;
        this.environment = environment;
        this.ioDispatcher = ioDispatcher;
        this.agentTyping = liveChatRepository.mo37842i();
        this.agent = liveChatRepository.mo37835b();
        this.openConversations = liveChatRepository.mo37837d();
        C3783c0<Pair<Boolean, String>> c3783c0Mo37839f = liveChatRepository.mo37839f();
        this._onSurveyScreenShown = c3783c0Mo37839f;
        this.hasTokenExpired = liveChatRepository.mo37845l();
        this._campaignId = new C3783c0<>();
        this._engagementId = new C3783c0<>();
        if (c3783c0Mo37839f != null) {
            c3783c0Mo37839f.setValue(new Pair<>(Boolean.FALSE, null));
        }
    }

    /* renamed from: A */
    private String m37892A() {
        return this.liveChatRepository.mo37843j().get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public String m37893D() throws AuthenticatorException {
        return this.jsonWebTokenManager.mo93956b().get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public String m37894G() throws AuthenticatorException {
        return this.jsonWebTokenManager.mo93955a().get();
    }

    /* renamed from: B */
    public AbstractC3830y<Long> m37897B() {
        return this._engagementId;
    }

    /* renamed from: C */
    public AbstractC3830y<Boolean> m37898C() {
        return this.hasTokenExpired;
    }

    /* renamed from: E */
    public AbstractC3830y<Pair<Boolean, String>> m37899E() {
        return this._onSurveyScreenShown;
    }

    /* renamed from: F */
    public AbstractC3830y<Pair<Boolean, String>> m37900F() {
        return this.openConversations;
    }

    /* renamed from: H */
    public boolean m37901H() {
        return this.liveChatRepository.getIsSDKInitialized();
    }

    /* renamed from: I */
    public InterfaceC30020d<String> m37902I() {
        return C30022f.m92660J(C30022f.m92657G(new LiveChatViewModel$jwtFlow$1(this, null)), this.ioDispatcher);
    }

    /* renamed from: J */
    public void m37903J(String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        this.liveChatAnalytics.m37813f(conversationId);
    }

    /* renamed from: K */
    public void m37904K(String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        this.liveChatAnalytics.m37814g(conversationId);
    }

    /* renamed from: L */
    public void m37905L(Bundle bundle) {
        this._campaignId.setValue(this.environment.getLiveChatCampaignId());
        this._engagementId.setValue(this.environment.getLiveChatEngagementId());
        this.intentBundle = bundle;
        boolean z10 = false;
        if (bundle != null && bundle.containsKey("LiveChatTileExtension") && bundle.getBoolean("LiveChatTileExtension", false)) {
            SharedPreferenceUtility.m39157n(this.context, PREF_TIMESTAMP, System.currentTimeMillis());
            this.extraSde = bundle.getString("SDE", null);
            Long value = this._campaignId.getValue();
            long j10 = bundle.getLong("campaignId", value != null ? value.longValue() : 0L);
            if (j10 != 0) {
                this._campaignId.setValue(Long.valueOf(j10));
            }
            Long value2 = this._engagementId.getValue();
            long j11 = bundle.getLong("engagementId", value2 != null ? value2.longValue() : 0L);
            if (j11 != 0) {
                this._engagementId.setValue(Long.valueOf(j11));
            }
            z10 = true;
        }
        boolean z11 = z10;
        if (m37918z().getValue() == null || m37897B().getValue() == null) {
            return;
        }
        C8911d c8911d = this.liveChatAnalytics;
        Long value3 = m37918z().getValue();
        Intrinsics.checkNotNull(value3);
        long jLongValue = value3.longValue();
        Long value4 = m37897B().getValue();
        Intrinsics.checkNotNull(value4);
        c8911d.m37808a(jLongValue, value4.longValue(), z11);
    }

    /* renamed from: N */
    public InterfaceC30020d<String> m37906N() {
        return C30022f.m92660J(C30022f.m92657G(new LiveChatViewModel$refreshedJWTFlow$1(this, null)), this.ioDispatcher);
    }

    /* renamed from: O */
    public void m37907O() {
        this.liveChatRepository.mo37836c();
        this.liveChatAnalytics.m37819l();
    }

    /* renamed from: P */
    public void m37908P() {
        this.liveChatAnalytics.m37812e();
    }

    /* renamed from: Q */
    public void m37909Q() {
        this.liveChatAnalytics.m37818k();
    }

    /* renamed from: R */
    public void m37910R() {
        this.liveChatAnalytics.m37820m();
    }

    /* renamed from: S */
    public void m37911S() {
        this.liveChatAnalytics.m37811d(m37892A(), this.extraSde);
    }

    /* renamed from: T */
    public void m37912T(InterfaceC8914b callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.liveChatRepository.mo37841h(callBack);
    }

    /* renamed from: U */
    public void m37913U(ConsumerProfile consumerProfile) {
        Intrinsics.checkNotNullParameter(consumerProfile, "consumerProfile");
        this.liveChatRepository.mo37834a(consumerProfile);
    }

    /* renamed from: v */
    public void m37914v() {
        this.liveChatRepository.mo37846m();
    }

    /* renamed from: w */
    public void m37915w() {
        this.liveChatRepository.mo37838e();
    }

    /* renamed from: x */
    public AbstractC3830y<Agent> m37916x() {
        return this.agent;
    }

    /* renamed from: y */
    public AbstractC3830y<Boolean> m37917y() {
        return this.agentTyping;
    }

    /* renamed from: z */
    public AbstractC3830y<Long> m37918z() {
        return this._campaignId;
    }
}