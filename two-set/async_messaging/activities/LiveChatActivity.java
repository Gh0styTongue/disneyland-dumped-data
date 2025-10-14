package com.disney.wdpro.async_messaging.activities;

import android.app.NotificationManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupMenu;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0232e;
import androidx.fragment.app.Fragment;
import androidx.view.C3816t;
import androidx.view.C3821v0;
import androidx.view.InterfaceC3785d0;
import com.disney.wdpro.aligator.C8665e;
import com.disney.wdpro.aligator.ScreenType;
import com.disney.wdpro.async_messaging.analytics.C8911d;
import com.disney.wdpro.async_messaging.fragments.JwtErrorFragment;
import com.disney.wdpro.async_messaging.repositories.InterfaceC8914b;
import com.disney.wdpro.async_messaging.viewmodels.LiveChatViewModel;
import com.disney.wdpro.dinecheckin.model.CheckInSession;
import com.disney.wdpro.service.model.UserMinimumProfile;
import com.disney.wdpro.support.activities.FoundationStackActivity;
import com.disney.wdpro.support.badging.BadgeCounterViewModel;
import com.disney.wdpro.support.badging.C20564f;
import com.disney.wdpro.support.util.C20932b;
import com.disney.wdpro.support.widget.SnowballHeader;
import com.liveperson.infra.C23920a;
import com.liveperson.infra.C23926c;
import com.liveperson.infra.auth.C23924a;
import com.liveperson.infra.messaging_ui.fragment.ConversationFragment;
import javax.inject.Inject;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.C30022f;
import org.jose4j.jwk.RsaJsonWebKey;
import p1158zv.ConsumerProfile;
import p699k9.C29555d;
import p699k9.C29556e;
import p699k9.C29557f;
import p699k9.C29558g;
import p699k9.C29559h;
import p699k9.C29560i;
import p699k9.C29561j;
import p727l9.InterfaceC30307d;
import p768n9.Agent;
import p768n9.InterfaceC30634g;
import p793o9.InterfaceC30823a;

@Metadata(m92037d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u0019\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001e\u0010\u0004J\u0019\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0004R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010QR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Z\u001a\u00020Y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010^¨\u0006b"}, m92038d2 = {"Lcom/disney/wdpro/async_messaging/activities/LiveChatActivity;", "Lcom/disney/wdpro/support/activities/FoundationStackActivity;", "Lcom/disney/wdpro/async_messaging/repositories/b;", "<init>", "()V", "", "A0", "G0", "t0", "o0", "u0", "", "jwt", "Landroidx/fragment/app/Fragment;", "i0", "(Ljava/lang/String;)Landroidx/fragment/app/Fragment;", "", "colorResId", "F0", "(I)V", "C0", "D0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "getLayoutResourceId", "()I", "onStart", "onResume", "onPause", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "onBackPressed", RsaJsonWebKey.FACTOR_CRT_COEFFICIENT, "Ln9/g;", "livePerson", "Ln9/g;", "m0", "()Ln9/g;", "setLivePerson", "(Ln9/g;)V", "Landroidx/lifecycle/v0$c;", "viewModelFactory", "Landroidx/lifecycle/v0$c;", "getViewModelFactory", "()Landroidx/lifecycle/v0$c;", "setViewModelFactory", "(Landroidx/lifecycle/v0$c;)V", "Lcom/disney/wdpro/async_messaging/viewmodels/LiveChatViewModel;", "liveChatViewModel", "Lcom/disney/wdpro/async_messaging/viewmodels/LiveChatViewModel;", "l0", "()Lcom/disney/wdpro/async_messaging/viewmodels/LiveChatViewModel;", "E0", "(Lcom/disney/wdpro/async_messaging/viewmodels/LiveChatViewModel;)V", "Lcom/disney/wdpro/support/badging/BadgeCounterViewModel;", "badgeCounterViewModel", "Lcom/disney/wdpro/support/badging/BadgeCounterViewModel;", "j0", "()Lcom/disney/wdpro/support/badging/BadgeCounterViewModel;", "setBadgeCounterViewModel", "(Lcom/disney/wdpro/support/badging/BadgeCounterViewModel;)V", "Lcom/disney/wdpro/async_messaging/analytics/d;", "liveChatAnalytics", "Lcom/disney/wdpro/async_messaging/analytics/d;", "k0", "()Lcom/disney/wdpro/async_messaging/analytics/d;", "setLiveChatAnalytics", "(Lcom/disney/wdpro/async_messaging/analytics/d;)V", "Lo9/a;", "livePersonListenerServiceDelgate", "Lo9/a;", "n0", "()Lo9/a;", "setLivePersonListenerServiceDelgate", "(Lo9/a;)V", "", "isOnSurveyScreen", "Z", "hasOpenConversations", "Lcom/liveperson/infra/messaging_ui/fragment/ConversationFragment;", "conversationFragment", "Lcom/liveperson/infra/messaging_ui/fragment/ConversationFragment;", "Lcom/disney/wdpro/async_messaging/fragments/JwtErrorFragment;", "errorFragment", "Lcom/disney/wdpro/async_messaging/fragments/JwtErrorFragment;", "Landroid/widget/TextSwitcher;", "toolbarTitle", "Landroid/widget/TextSwitcher;", "Landroid/widget/TextView;", "toolbarOptionsMenu", "Landroid/widget/TextView;", "toolbarAgentTyping", "Companion", "a", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nLiveChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveChatActivity.kt\ncom/disney/wdpro/async_messaging/activities/LiveChatActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,351:1\n1#2:352\n*E\n"})
/* loaded from: classes24.dex */
public final class LiveChatActivity extends FoundationStackActivity implements InterfaceC8914b {
    private static final float VIEW_GONE_ANIMATION_VALUE = 0.0f;
    private static final float VIEW_VISIBLE_ANIMATION_VALUE = 1.0f;

    @Inject
    public BadgeCounterViewModel badgeCounterViewModel;
    private ConversationFragment conversationFragment;
    private JwtErrorFragment errorFragment;
    private boolean hasOpenConversations;
    private boolean isOnSurveyScreen;

    @Inject
    public C8911d liveChatAnalytics;
    public LiveChatViewModel liveChatViewModel;

    @Inject
    public InterfaceC30634g livePerson;

    @Inject
    public InterfaceC30823a livePersonListenerServiceDelgate;
    private TextView toolbarAgentTyping;
    private TextView toolbarOptionsMenu;
    private TextSwitcher toolbarTitle;

    @Inject
    public C3821v0.c viewModelFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmField
    public static final String TRACKING_PAGE_LOAD_TIME = "LiveChatLoadTime";

    @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/async_messaging/activities/LiveChatActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "", "VIEW_GONE_ANIMATION_VALUE", "F", "VIEW_VISIBLE_ANIMATION_VALUE", "", "TRACKING_PAGE_LOAD_TIME", "Ljava/lang/String;", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.async_messaging.activities.LiveChatActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Intent m37792a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) LiveChatActivity.class);
        }

        private Companion() {
        }
    }

    @Metadata(m92039k = 3, m92040mv = {2, 0, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.async_messaging.activities.LiveChatActivity$b */
    public /* synthetic */ class C8897b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenType.values().length];
            try {
                iArr[ScreenType.FOUNDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenType.STACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m92039k = 3, m92040mv = {2, 0, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.async_messaging.activities.LiveChatActivity$c */
    static final class C8898c implements InterfaceC3785d0, FunctionAdapter {
        private final /* synthetic */ Function1 function;

        C8898c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.function = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3785d0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.function;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.view.InterfaceC3785d0
        public final /* synthetic */ void onChanged(Object obj) {
            this.function.invoke(obj);
        }
    }

    /* renamed from: A0 */
    private final void m37758A0() {
        C30022f.m92661K(C30022f.m92680g(C30022f.m92664N(m37788l0().m37902I(), new LiveChatActivity$obtainJWToken$1(this, null)), new LiveChatActivity$obtainJWToken$2(this, null)), C3816t.m20245a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public static final void m37759B0(View view, LiveChatActivity liveChatActivity) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int height = view.getRootView().getHeight();
        int i10 = height - rect.bottom;
        FrameLayout bottomBar = liveChatActivity.getBottomBar();
        if (i10 > height * 0.15d) {
            bottomBar.animate().alpha(0.0f);
            bottomBar.setVisibility(8);
        } else {
            bottomBar.animate().alpha(1.0f);
            bottomBar.setVisibility(0);
        }
    }

    /* renamed from: C0 */
    private final void m37760C0() {
        this.crashHelper.trackTimedActionEnd(TRACKING_PAGE_LOAD_TIME);
    }

    /* renamed from: D0 */
    private final void m37761D0() {
        this.crashHelper.trackTimedActionStart(TRACKING_PAGE_LOAD_TIME, null);
    }

    /* renamed from: F0 */
    private final void m37762F0(int colorResId) {
        TextView textView = this.toolbarOptionsMenu;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarOptionsMenu");
            textView = null;
        }
        textView.setTextColor(getResources().getColor(colorResId, getTheme()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G0 */
    public final void m37763G0() {
        JwtErrorFragment jwtErrorFragment = new JwtErrorFragment();
        this.errorFragment = jwtErrorFragment;
        navigate("", new C8665e.b(jwtErrorFragment).m37330h().build());
        m37760C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public final Fragment m37774i0(String jwt) {
        C23924a c23924a = new C23924a();
        c23924a.m75902m(jwt);
        C23926c c23926c = new C23926c(false);
        if (m37788l0().m37918z().getValue() != null && m37788l0().m37897B().getValue() != null) {
            Long value = m37788l0().m37918z().getValue();
            Intrinsics.checkNotNull(value);
            Long l10 = value;
            Long value2 = m37788l0().m37897B().getValue();
            Intrinsics.checkNotNull(value2);
            c23926c.m75913h(new C23920a(l10, value2, "", null, null));
        }
        Fragment fragmentMo94430c = m37789m0().mo94430c(c23924a, c23926c);
        if (fragmentMo94430c instanceof ConversationFragment) {
            this.conversationFragment = (ConversationFragment) fragmentMo94430c;
        }
        return fragmentMo94430c;
    }

    /* renamed from: o0 */
    private final void m37775o0() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this, C29561j.pop_up);
        TextView textView = this.toolbarOptionsMenu;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarOptionsMenu");
            textView = null;
        }
        final PopupMenu popupMenu = new PopupMenu(contextThemeWrapper, textView);
        popupMenu.inflate(C29559h.live_chat_menu);
        TextView textView3 = this.toolbarOptionsMenu;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarOptionsMenu");
        } else {
            textView2 = textView3;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.async_messaging.activities.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveChatActivity.m37776r0(this.f29535a, popupMenu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m37776r0(final LiveChatActivity liveChatActivity, PopupMenu popupMenu, View view) {
        liveChatActivity.m37788l0().m37910R();
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.disney.wdpro.async_messaging.activities.h
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return LiveChatActivity.m37777s0(this.f29542a, menuItem);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final boolean m37777s0(LiveChatActivity liveChatActivity, MenuItem menuItem) {
        if (menuItem.getItemId() != C29557f.action_resolve_conversation) {
            return true;
        }
        liveChatActivity.m37788l0().m37907O();
        return true;
    }

    /* renamed from: t0 */
    private final void m37778t0() {
        TextSwitcher textSwitcher = this.toolbarTitle;
        TextSwitcher textSwitcher2 = null;
        if (textSwitcher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarTitle");
            textSwitcher = null;
        }
        textSwitcher.setInAnimation(this, C29555d.chat_header_slide_in);
        TextSwitcher textSwitcher3 = this.toolbarTitle;
        if (textSwitcher3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarTitle");
        } else {
            textSwitcher2 = textSwitcher3;
        }
        textSwitcher2.setOutAnimation(this, C29555d.chat_header_slide_out);
    }

    /* renamed from: u0 */
    private final void m37779u0() {
        m37788l0().m37916x().observe(this, new InterfaceC3785d0() { // from class: com.disney.wdpro.async_messaging.activities.c
            @Override // androidx.view.InterfaceC3785d0
            public final void onChanged(Object obj) {
                LiveChatActivity.m37780v0(this.f29537a, (Agent) obj);
            }
        });
        m37788l0().m37917y().observe(this, new InterfaceC3785d0() { // from class: com.disney.wdpro.async_messaging.activities.d
            @Override // androidx.view.InterfaceC3785d0
            public final void onChanged(Object obj) {
                LiveChatActivity.m37781w0(this.f29538a, (Boolean) obj);
            }
        });
        m37788l0().m37900F().observe(this, new InterfaceC3785d0() { // from class: com.disney.wdpro.async_messaging.activities.e
            @Override // androidx.view.InterfaceC3785d0
            public final void onChanged(Object obj) {
                LiveChatActivity.m37782x0(this.f29539a, (Pair) obj);
            }
        });
        m37788l0().m37899E().observe(this, new InterfaceC3785d0() { // from class: com.disney.wdpro.async_messaging.activities.f
            @Override // androidx.view.InterfaceC3785d0
            public final void onChanged(Object obj) {
                LiveChatActivity.m37783y0(this.f29540a, (Pair) obj);
            }
        });
        m37788l0().m37898C().observe(this, new C8898c(new Function1() { // from class: com.disney.wdpro.async_messaging.activities.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveChatActivity.m37784z0(this.f29541a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m37780v0(LiveChatActivity liveChatActivity, Agent agent) {
        String string;
        TextSwitcher textSwitcher = liveChatActivity.toolbarTitle;
        TextSwitcher textSwitcher2 = null;
        if (textSwitcher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarTitle");
            textSwitcher = null;
        }
        View currentView = textSwitcher.getCurrentView();
        Intrinsics.checkNotNull(currentView, "null cannot be cast to non-null type android.widget.TextView");
        CharSequence text = ((TextView) currentView).getText();
        if (agent == null || (string = agent.getNickName()) == null) {
            string = liveChatActivity.getString(C29560i.chat_with_us);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        if (Intrinsics.areEqual(text, string) || liveChatActivity.isOnSurveyScreen || !liveChatActivity.hasOpenConversations) {
            return;
        }
        TextSwitcher textSwitcher3 = liveChatActivity.toolbarTitle;
        if (textSwitcher3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarTitle");
        } else {
            textSwitcher2 = textSwitcher3;
        }
        textSwitcher2.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m37781w0(LiveChatActivity liveChatActivity, Boolean bool) {
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            TextView textView = liveChatActivity.toolbarAgentTyping;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarAgentTyping");
                textView = null;
            }
            textView.setText(zBooleanValue ? liveChatActivity.getString(C29560i.agent_typing) : "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m37782x0(LiveChatActivity liveChatActivity, Pair pair) {
        TextView textView = null;
        if (pair != null && !((Boolean) pair.getFirst()).booleanValue()) {
            liveChatActivity.hasOpenConversations = false;
            TextView textView2 = liveChatActivity.toolbarOptionsMenu;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarOptionsMenu");
                textView2 = null;
            }
            textView2.setClickable(false);
            liveChatActivity.m37762F0(C29556e.snowball_inactive_grey);
            TextView textView3 = liveChatActivity.toolbarOptionsMenu;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarOptionsMenu");
            } else {
                textView = textView3;
            }
            C20932b.m63179C(textView, liveChatActivity.getString(C29560i.accessibility_options_disabled));
            if (((CharSequence) pair.getSecond()).length() == 0) {
                return;
            }
            liveChatActivity.m37788l0().m37903J((String) pair.getSecond());
            return;
        }
        liveChatActivity.hasOpenConversations = true;
        TextView textView4 = liveChatActivity.toolbarOptionsMenu;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarOptionsMenu");
            textView4 = null;
        }
        textView4.setClickable(true);
        liveChatActivity.m37762F0(C29556e.active_blue);
        TextView textView5 = liveChatActivity.toolbarOptionsMenu;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarOptionsMenu");
        } else {
            textView = textView5;
        }
        C20932b.m63179C(textView, liveChatActivity.getString(C29560i.accessibility_options_enabled));
        if (pair == null || ((CharSequence) pair.getSecond()).length() == 0) {
            return;
        }
        liveChatActivity.m37788l0().m37904K((String) pair.getSecond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m37783y0(LiveChatActivity liveChatActivity, Pair pair) {
        TextView textView = null;
        if (pair == null || !((Boolean) pair.getFirst()).booleanValue()) {
            liveChatActivity.isOnSurveyScreen = false;
            TextSwitcher textSwitcher = liveChatActivity.toolbarTitle;
            if (textSwitcher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarTitle");
                textSwitcher = null;
            }
            textSwitcher.setText(liveChatActivity.getString(C29560i.chat_with_us));
            TextView textView2 = liveChatActivity.toolbarOptionsMenu;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbarOptionsMenu");
            } else {
                textView = textView2;
            }
            textView.setVisibility(0);
            return;
        }
        liveChatActivity.isOnSurveyScreen = true;
        TextSwitcher textSwitcher2 = liveChatActivity.toolbarTitle;
        if (textSwitcher2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarTitle");
            textSwitcher2 = null;
        }
        textSwitcher2.setText(liveChatActivity.getString(C29560i.survey_screen_header));
        String string = liveChatActivity.getString(C29560i.lp_feedback_question, pair.getSecond());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        liveChatActivity.m37789m0().mo94438k(liveChatActivity, C29557f.lpui_feedback_question, string);
        TextView textView3 = liveChatActivity.toolbarAgentTyping;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarAgentTyping");
            textView3 = null;
        }
        textView3.setText("");
        TextView textView4 = liveChatActivity.toolbarOptionsMenu;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarOptionsMenu");
        } else {
            textView = textView4;
        }
        textView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static final Unit m37784z0(LiveChatActivity liveChatActivity, Boolean bool) {
        C30022f.m92661K(C30022f.m92680g(C30022f.m92664N(liveChatActivity.m37788l0().m37906N(), new LiveChatActivity$observeViews$5$1(liveChatActivity, null)), new LiveChatActivity$observeViews$5$2(liveChatActivity, null)), C3816t.m20245a(liveChatActivity));
        return Unit.INSTANCE;
    }

    /* renamed from: E0 */
    public final void m37785E0(LiveChatViewModel liveChatViewModel) {
        Intrinsics.checkNotNullParameter(liveChatViewModel, "<set-?>");
        this.liveChatViewModel = liveChatViewModel;
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity
    public int getLayoutResourceId() {
        int i10 = C8897b.$EnumSwitchMapping$0[getType().ordinal()];
        if (i10 == 1) {
            return C29558g.activity_live_chat_foundation;
        }
        if (i10 == 2) {
            return C29558g.async_activity_stack;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C3821v0.c getViewModelFactory() {
        C3821v0.c cVar = this.viewModelFactory;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    /* renamed from: j0 */
    public final BadgeCounterViewModel m37786j0() {
        BadgeCounterViewModel badgeCounterViewModel = this.badgeCounterViewModel;
        if (badgeCounterViewModel != null) {
            return badgeCounterViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("badgeCounterViewModel");
        return null;
    }

    /* renamed from: k0 */
    public final C8911d m37787k0() {
        C8911d c8911d = this.liveChatAnalytics;
        if (c8911d != null) {
            return c8911d;
        }
        Intrinsics.throwUninitializedPropertyAccessException("liveChatAnalytics");
        return null;
    }

    /* renamed from: l0 */
    public final LiveChatViewModel m37788l0() {
        LiveChatViewModel liveChatViewModel = this.liveChatViewModel;
        if (liveChatViewModel != null) {
            return liveChatViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("liveChatViewModel");
        return null;
    }

    /* renamed from: m0 */
    public final InterfaceC30634g m37789m0() {
        InterfaceC30634g interfaceC30634g = this.livePerson;
        if (interfaceC30634g != null) {
            return interfaceC30634g;
        }
        Intrinsics.throwUninitializedPropertyAccessException("livePerson");
        return null;
    }

    /* renamed from: n0 */
    public final InterfaceC30823a m37790n0() {
        InterfaceC30823a interfaceC30823a = this.livePersonListenerServiceDelgate;
        if (interfaceC30823a != null) {
            return interfaceC30823a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("livePersonListenerServiceDelgate");
        return null;
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.isOnSurveyScreen) {
            m37788l0().m37908P();
        }
        if (this.errorFragment != null) {
            super.onBackPressed();
            return;
        }
        ConversationFragment conversationFragment = this.conversationFragment;
        if (conversationFragment != null) {
            if (conversationFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("conversationFragment");
                conversationFragment = null;
            }
            if (!conversationFragment.onBackPressed()) {
                super.onBackPressed();
                return;
            }
        }
        if (this.conversationFragment == null) {
            super.onBackPressed();
        }
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        AsyncSnowballHeader asyncSnowballHeader;
        super.onCreate(savedInstanceState);
        AbstractC0232e.m976P(1);
        ComponentCallbacks2 application = getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.disney.wdpro.async_messaging.di.LiveChatComponentProvider");
        ((InterfaceC30307d) application).mo40027b().mo44185b(this);
        m37761D0();
        m37785E0((LiveChatViewModel) new C3821v0(this, getViewModelFactory()).m20262a(LiveChatViewModel.class));
        m37788l0().m37912T(this);
        int i10 = C8897b.$EnumSwitchMapping$0[getType().ordinal()];
        if (i10 == 1) {
            View viewFindViewById = findViewById(C29557f.toolbar);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type com.disney.wdpro.async_messaging.activities.AsyncSnowballHeader");
            asyncSnowballHeader = (AsyncSnowballHeader) viewFindViewById;
            asyncSnowballHeader.getToolbar().setNavigationIcon((Drawable) null);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            SnowballHeader toolbar = getStackComponent().getToolbar();
            Intrinsics.checkNotNull(toolbar, "null cannot be cast to non-null type com.disney.wdpro.async_messaging.activities.AsyncSnowballHeader");
            asyncSnowballHeader = (AsyncSnowballHeader) toolbar;
        }
        this.toolbarTitle = asyncSnowballHeader.getHeaderViewTitle();
        this.toolbarOptionsMenu = asyncSnowballHeader.getMenuOptionsView();
        this.toolbarAgentTyping = asyncSnowballHeader.getAgentTypingView();
        m37778t0();
        m37775o0();
        m37779u0();
        if (!m37788l0().m37901H()) {
            m37763G0();
            return;
        }
        m37788l0().m37905L(getIntent().getExtras());
        m37758A0();
        m37788l0().m37909Q();
        m37788l0().m37911S();
        Object userData = this.authenticationManager.getUserData();
        UserMinimumProfile userMinimumProfile = userData instanceof UserMinimumProfile ? (UserMinimumProfile) userData : null;
        m37788l0().m37913U(new ConsumerProfile.a().m102970b(userMinimumProfile != null ? userMinimumProfile.getFirstName() : null).m102969a());
        Object systemService = getSystemService(CheckInSession.NOTIFICATION_SECTION_ID);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(m37790n0().mo94892d());
        m37786j0().m62108G(new String[]{C20564f.BADGE_IN_ASYNC_MESSAGES_LIVE_PERSON, C20564f.BADGE_IN_BOTTOM_BAR});
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        m37787k0().m37822o();
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        m37788l0().m37915w();
        m37788l0().m37914v();
        m37787k0().m37823p();
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        ViewTreeObserver viewTreeObserver;
        super.onStart();
        if (this.conversationFragment == null || getType() != ScreenType.FOUNDATION) {
            return;
        }
        ConversationFragment conversationFragment = this.conversationFragment;
        if (conversationFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversationFragment");
            conversationFragment = null;
        }
        final View view = conversationFragment.getView();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.disney.wdpro.async_messaging.activities.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                LiveChatActivity.m37759B0(view, this);
            }
        });
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        TextSwitcher textSwitcher = this.toolbarTitle;
        if (textSwitcher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarTitle");
            textSwitcher = null;
        }
        textSwitcher.setText(title);
    }

    @Override // com.disney.wdpro.async_messaging.repositories.InterfaceC8914b
    /* renamed from: t */
    public void mo37791t() {
        m37760C0();
    }
}