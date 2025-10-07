package com.disney.wdpro.ref_unify_messaging.p433ui.viewmodels;

import android.content.Context;
import androidx.view.AbstractC3817t0;
import androidx.view.AbstractC3830y;
import androidx.view.C3783c0;
import androidx.view.C3819u0;
import cn.C6198h;
import com.couchbase.lite.internal.BaseTLSIdentity;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.recommender.core.themer.RecommenderThemerConstants;
import com.disney.wdpro.ref_unify_messaging.model.C20029b;
import com.disney.wdpro.ref_unify_messaging.model.SubscriptionList;
import gn.C28201a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.CoroutineDispatcher;
import p507dn.C27221a;
import p568fn.InterfaceC27998b;

@Metadata(m92037d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u000267BD\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0011\u0010\u000f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u001f\u0010\u000f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120%0,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020(0,8F¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120,8F¢\u0006\u0006\u001a\u0004\b2\u0010.R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00140,8F¢\u0006\u0006\u001a\u0004\b4\u0010.¨\u00068"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel;", "Landroidx/lifecycle/t0;", "Landroid/content/Context;", "context", "Lgn/a;", "mobileNotificationApiClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "Ldn/a;", "analyticsCacheUiPreference", "Lcom/disney/wdpro/analytics/n;", "crashHelper", "", "Lfn/b;", "Lkotlin/jvm/JvmSuppressWildcards;", "subscriptionListsListeners", "<init>", "(Landroid/content/Context;Lgn/a;Lkotlinx/coroutines/CoroutineDispatcher;Ldn/a;Lcom/disney/wdpro/analytics/n;Ljava/util/Set;)V", "Lcom/disney/wdpro/ref_unify_messaging/model/b;", "uiSubscriptionList", "", "enabled", "", "H", "(Lcom/disney/wdpro/ref_unify_messaging/model/b;Z)V", BaseTLSIdentity.CERT_ATTRIBUTE_COUNTRY, "()V", "item", RecommenderThemerConstants.CHECKED, "I", "Landroid/content/Context;", "Lgn/a;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ldn/a;", "Lcom/disney/wdpro/analytics/n;", "Ljava/util/Set;", "Landroidx/lifecycle/c0;", "", "_subscriptionLists", "Landroidx/lifecycle/c0;", "Lcom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel$a;", "_error", "_errorItem", "_loading", "Landroidx/lifecycle/y;", "G", "()Landroidx/lifecycle/y;", "subscriptionLists", "D", "error", "E", "errorItem", "F", "loading", "a", "SubscriptionListsErrorType", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nSubscriptionListsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionListsViewModel.kt\ncom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n1855#2,2:148\n*S KotlinDebug\n*F\n+ 1 SubscriptionListsViewModel.kt\ncom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel\n*L\n115#1:148,2\n*E\n"})
/* loaded from: classes28.dex */
public final class SubscriptionListsViewModel extends AbstractC3817t0 {
    private final C3783c0<C20046a> _error;
    private final C3783c0<C20029b> _errorItem;
    private final C3783c0<Boolean> _loading;
    private final C3783c0<List<C20029b>> _subscriptionLists;
    private final C27221a analyticsCacheUiPreference;
    private final Context context;
    private final CoroutineDispatcher coroutineDispatcher;
    private final InterfaceC8682n crashHelper;
    private final C28201a mobileNotificationApiClient;
    private final Set<InterfaceC27998b> subscriptionListsListeners;

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel$SubscriptionListsErrorType;", "", "(Ljava/lang/String;I)V", "FETCH_FAILED", "UPDATE_FAILED", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public enum SubscriptionListsErrorType {
        FETCH_FAILED,
        UPDATE_FAILED
    }

    @Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel$a;", "", "Lcom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel$SubscriptionListsErrorType;", "type", "Landroid/content/Context;", "context", "<init>", "(Lcom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel$SubscriptionListsErrorType;Landroid/content/Context;)V", "", "b", "()Ljava/lang/String;", "a", "", "d", "()Z", "Lcom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel$SubscriptionListsErrorType;", "c", "()Lcom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel$SubscriptionListsErrorType;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.ref_unify_messaging.ui.viewmodels.SubscriptionListsViewModel$a */
    public static final class C20046a {
        private final Context context;
        private final SubscriptionListsErrorType type;

        @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
        /* renamed from: com.disney.wdpro.ref_unify_messaging.ui.viewmodels.SubscriptionListsViewModel$a$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SubscriptionListsErrorType.values().length];
                try {
                    iArr[SubscriptionListsErrorType.FETCH_FAILED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SubscriptionListsErrorType.UPDATE_FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C20046a(SubscriptionListsErrorType type, Context context) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(context, "context");
            this.type = type;
            this.context = context;
        }

        /* renamed from: a */
        public String m61453a() {
            int i10 = a.$EnumSwitchMapping$0[this.type.ordinal()];
            if (i10 == 1) {
                String string = this.context.getString(C6198h.subscription_list_fetch_error_message);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…list_fetch_error_message)");
                return string;
            }
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String string2 = this.context.getString(C6198h.subscription_list_update_error_message);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…ist_update_error_message)");
            return string2;
        }

        /* renamed from: b */
        public String m61454b() {
            int i10 = a.$EnumSwitchMapping$0[this.type.ordinal()];
            if (i10 != 1 && i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String string = this.context.getString(C6198h.subscription_list_generic_error_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…list_generic_error_title)");
            return string;
        }

        /* renamed from: c, reason: from getter */
        public final SubscriptionListsErrorType getType() {
            return this.type;
        }

        /* renamed from: d */
        public boolean m61456d() {
            int i10 = a.$EnumSwitchMapping$0[this.type.ordinal()];
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public SubscriptionListsViewModel(Context context, C28201a mobileNotificationApiClient, CoroutineDispatcher coroutineDispatcher, C27221a analyticsCacheUiPreference, InterfaceC8682n crashHelper, Set<InterfaceC27998b> subscriptionListsListeners) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobileNotificationApiClient, "mobileNotificationApiClient");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.checkNotNullParameter(analyticsCacheUiPreference, "analyticsCacheUiPreference");
        Intrinsics.checkNotNullParameter(crashHelper, "crashHelper");
        Intrinsics.checkNotNullParameter(subscriptionListsListeners, "subscriptionListsListeners");
        this.context = context;
        this.mobileNotificationApiClient = mobileNotificationApiClient;
        this.coroutineDispatcher = coroutineDispatcher;
        this.analyticsCacheUiPreference = analyticsCacheUiPreference;
        this.crashHelper = crashHelper;
        this.subscriptionListsListeners = subscriptionListsListeners;
        this._subscriptionLists = new C3783c0<>();
        this._error = new C3783c0<>();
        this._errorItem = new C3783c0<>();
        this._loading = new C3783c0<>(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final void m61439H(C20029b uiSubscriptionList, boolean enabled) {
        SubscriptionList subscriptionList = new SubscriptionList(uiSubscriptionList.getId(), uiSubscriptionList.getName(), uiSubscriptionList.getDisplayName(), uiSubscriptionList.getDescription(), enabled);
        Iterator<T> it = this.subscriptionListsListeners.iterator();
        while (it.hasNext()) {
            ((InterfaceC27998b) it.next()).mo57580d(CollectionsKt.listOf(subscriptionList));
        }
    }

    /* renamed from: C */
    public final void m61447C() {
        this._loading.setValue(Boolean.TRUE);
        C30113j.m92948d(C3819u0.m20261a(this), this.coroutineDispatcher, null, new SubscriptionListsViewModel$fetchSubscriptions$1(this, null), 2, null);
    }

    /* renamed from: D */
    public final AbstractC3830y<C20046a> m61448D() {
        return this._error;
    }

    /* renamed from: E */
    public final AbstractC3830y<C20029b> m61449E() {
        return this._errorItem;
    }

    /* renamed from: F */
    public final AbstractC3830y<Boolean> m61450F() {
        return this._loading;
    }

    /* renamed from: G */
    public final AbstractC3830y<List<C20029b>> m61451G() {
        return this._subscriptionLists;
    }

    /* renamed from: I */
    public final void m61452I(C20029b item, boolean checked) {
        Intrinsics.checkNotNullParameter(item, "item");
        this._loading.setValue(Boolean.TRUE);
        C30113j.m92948d(C3819u0.m20261a(this), this.coroutineDispatcher, null, new SubscriptionListsViewModel$setSubscriptionListEnabled$1(checked, this, item, null), 2, null);
    }
}