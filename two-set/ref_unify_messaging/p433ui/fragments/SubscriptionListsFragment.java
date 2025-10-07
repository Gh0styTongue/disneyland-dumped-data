package com.disney.wdpro.ref_unify_messaging.p433ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C3821v0;
import androidx.view.C3827w0;
import androidx.view.InterfaceC3785d0;
import cn.C6197g;
import cn.C6198h;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.recommender.core.themer.RecommenderThemerConstants;
import com.disney.wdpro.ref_unify_messaging.model.C20029b;
import com.disney.wdpro.ref_unify_messaging.p433ui.adapters.C20034b;
import com.disney.wdpro.ref_unify_messaging.p433ui.adapters.C20037e;
import com.disney.wdpro.ref_unify_messaging.p433ui.adapters.C20038f;
import com.disney.wdpro.ref_unify_messaging.p433ui.viewmodels.SubscriptionListsViewModel;
import com.disney.wdpro.support.dialog.Banner;
import com.disney.wdpro.support.dialog.ErrorBannerFragment;
import com.disney.wdpro.support.widget.InterfaceC21104n;
import com.disney.wdpro.support.widget.LineDividerItemDecoration;
import com.disney.wdpro.support.widget.Loader;
import com.disney.wdpro.support.widget.SnowballHeader;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jose4j.jwk.RsaJsonWebKey;
import p539en.C27744a;

@Metadata(m92037d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001>B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J-\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\b2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\u0005R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/ui/fragments/SubscriptionListsFragment;", "Lcom/disney/wdpro/commons/BaseFragment;", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/f$a;", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/b$a;", "<init>", "()V", "Lcom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel$a;", "errorEvent", "", "A0", "(Lcom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel$a;)V", "", "displayLoading", "F0", "(Z)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/os/Bundle;)V", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", "getAnalyticsPageName", "()Ljava/lang/String;", "Lcom/disney/wdpro/ref_unify_messaging/model/b;", "item", RecommenderThemerConstants.CHECKED, "B", "(Lcom/disney/wdpro/ref_unify_messaging/model/b;Z)V", RsaJsonWebKey.SECOND_PRIME_FACTOR_MEMBER_NAME, "onDestroyView", "Landroidx/lifecycle/v0$c;", "viewModelFactory", "Landroidx/lifecycle/v0$c;", "getViewModelFactory", "()Landroidx/lifecycle/v0$c;", "setViewModelFactory", "(Landroidx/lifecycle/v0$c;)V", "Lcom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel;", "viewModel", "Lcom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel;", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/e;", "adapter", "Lcom/disney/wdpro/ref_unify_messaging/ui/adapters/e;", "Len/a;", "binding", "Len/a;", "Companion", "a", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final class SubscriptionListsFragment extends BaseFragment implements C20038f.a, C20034b.a {
    private static final String APP_NOTIFICATIONS_SETTINGS = "android.settings.APP_NOTIFICATION_SETTINGS";
    private static final String APP_PACKAGE = "app_package";
    private static final String APP_UID = "app_uid";
    private static final String EXTRA_APP_PACKAGE = "android.provider.extra.APP_PACKAGE";
    private C20037e adapter;
    private C27744a binding;
    private SubscriptionListsViewModel viewModel;

    @Inject
    public C3821v0.c viewModelFactory;

    @Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m92038d2 = {"com/disney/wdpro/ref_unify_messaging/ui/fragments/SubscriptionListsFragment$b", "Lcom/disney/wdpro/support/dialog/ErrorBannerFragment$d;", "", "tag", "", "onErrorBannerRetry", "(Ljava/lang/String;)V", "onErrorBannerDismiss", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.ref_unify_messaging.ui.fragments.SubscriptionListsFragment$b */
    public static final class C20040b implements ErrorBannerFragment.InterfaceC20694d {
        final /* synthetic */ SubscriptionListsViewModel.C20046a $errorEvent;
        final /* synthetic */ SubscriptionListsFragment this$0;

        C20040b(SubscriptionListsViewModel.C20046a c20046a, SubscriptionListsFragment subscriptionListsFragment) {
            this.$errorEvent = c20046a;
            this.this$0 = subscriptionListsFragment;
        }

        @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
        public void onErrorBannerDismiss(String tag) {
        }

        @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
        public void onErrorBannerRetry(String tag) {
            if (this.$errorEvent.getType() == SubscriptionListsViewModel.SubscriptionListsErrorType.FETCH_FAILED) {
                SubscriptionListsViewModel subscriptionListsViewModel = this.this$0.viewModel;
                if (subscriptionListsViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    subscriptionListsViewModel = null;
                }
                subscriptionListsViewModel.m61447C();
            }
        }
    }

    /* renamed from: A0 */
    private final void m61424A0(SubscriptionListsViewModel.C20046a errorEvent) {
        Banner.C20687a c20687aM62495c = Banner.m62484i(errorEvent.m61453a(), "ERROR_SUBSCRIPTION_LISTS", getActivity()).m62494C(errorEvent.m61454b()).m62495c(new C20040b(errorEvent, this));
        if (errorEvent.m61456d()) {
            c20687aM62495c.m62493B();
        }
        c20687aM62495c.m62517y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public static final void m61425B0(SubscriptionListsFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C20037e c20037e = this$0.adapter;
        if (c20037e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            c20037e = null;
        }
        c20037e.m61416N(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public static final void m61426C0(SubscriptionListsFragment this$0, SubscriptionListsViewModel.C20046a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.m61424A0(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public static final void m61427D0(SubscriptionListsFragment this$0, C20029b it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C20037e c20037e = this$0.adapter;
        if (c20037e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            c20037e = null;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        c20037e.m61418P(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public static final void m61428E0(SubscriptionListsFragment this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.m61429F0(it.booleanValue());
    }

    /* renamed from: F0 */
    private final void m61429F0(boolean displayLoading) {
        C27744a c27744a = this.binding;
        Loader loader = c27744a != null ? c27744a.loadingProgress : null;
        if (loader == null) {
            return;
        }
        loader.setVisibility(displayLoading ? 0 : 8);
    }

    @Override // com.disney.wdpro.ref_unify_messaging.p433ui.adapters.C20038f.a
    /* renamed from: B */
    public void mo61422B(C20029b item, boolean checked) {
        Intrinsics.checkNotNullParameter(item, "item");
        item.m61404e(checked);
        C20037e c20037e = this.adapter;
        SubscriptionListsViewModel subscriptionListsViewModel = null;
        if (c20037e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            c20037e = null;
        }
        c20037e.m61418P(item);
        SubscriptionListsViewModel subscriptionListsViewModel2 = this.viewModel;
        if (subscriptionListsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            subscriptionListsViewModel = subscriptionListsViewModel2;
        }
        subscriptionListsViewModel.m61452I(item, checked);
    }

    @Override // com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        Context context = getContext();
        return (context == null || NotificationManagerCompat.from(context).areNotificationsEnabled()) ? InterfaceC8679k.IGNORE : "tools/account/profile/notifications";
    }

    public final C3821v0.c getViewModelFactory() {
        C3821v0.c cVar = this.viewModelFactory;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        SubscriptionListsViewModel subscriptionListsViewModel = this.viewModel;
        SubscriptionListsViewModel subscriptionListsViewModel2 = null;
        if (subscriptionListsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            subscriptionListsViewModel = null;
        }
        subscriptionListsViewModel.m61451G().observe(getViewLifecycleOwner(), new InterfaceC3785d0() { // from class: com.disney.wdpro.ref_unify_messaging.ui.fragments.a
            @Override // androidx.view.InterfaceC3785d0
            public final void onChanged(Object obj) {
                SubscriptionListsFragment.m61425B0(this.f43001a, (List) obj);
            }
        });
        SubscriptionListsViewModel subscriptionListsViewModel3 = this.viewModel;
        if (subscriptionListsViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            subscriptionListsViewModel3 = null;
        }
        subscriptionListsViewModel3.m61448D().observe(getViewLifecycleOwner(), new InterfaceC3785d0() { // from class: com.disney.wdpro.ref_unify_messaging.ui.fragments.b
            @Override // androidx.view.InterfaceC3785d0
            public final void onChanged(Object obj) {
                SubscriptionListsFragment.m61426C0(this.f43002a, (SubscriptionListsViewModel.C20046a) obj);
            }
        });
        SubscriptionListsViewModel subscriptionListsViewModel4 = this.viewModel;
        if (subscriptionListsViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            subscriptionListsViewModel4 = null;
        }
        subscriptionListsViewModel4.m61449E().observe(getViewLifecycleOwner(), new InterfaceC3785d0() { // from class: com.disney.wdpro.ref_unify_messaging.ui.fragments.c
            @Override // androidx.view.InterfaceC3785d0
            public final void onChanged(Object obj) {
                SubscriptionListsFragment.m61427D0(this.f43003a, (C20029b) obj);
            }
        });
        SubscriptionListsViewModel subscriptionListsViewModel5 = this.viewModel;
        if (subscriptionListsViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            subscriptionListsViewModel2 = subscriptionListsViewModel5;
        }
        subscriptionListsViewModel2.m61450F().observe(getViewLifecycleOwner(), new InterfaceC3785d0() { // from class: com.disney.wdpro.ref_unify_messaging.ui.fragments.d
            @Override // androidx.view.InterfaceC3785d0
            public final void onChanged(Object obj) {
                SubscriptionListsFragment.m61428E0(this.f43004a, (Boolean) obj);
            }
        });
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        String string = context.getResources().getString(C6198h.subscription_list_view_header);
        ActivityCompat.OnRequestPermissionsResultCallback activity = getActivity();
        InterfaceC21104n interfaceC21104n = activity instanceof InterfaceC21104n ? (InterfaceC21104n) activity : null;
        if (interfaceC21104n != null) {
            interfaceC21104n.setScreenTitle(string);
        }
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.viewModel = (SubscriptionListsViewModel) C3827w0.m20288d(this, getViewModelFactory()).m20262a(SubscriptionListsViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C27744a c27744aM86818c = C27744a.m86818c(inflater, container, false);
        this.binding = c27744aM86818c;
        LinearLayout linearLayoutM86819b = c27744aM86818c != null ? c27744aM86818c.getRoot() : null;
        return linearLayoutM86819b != null ? linearLayoutM86819b : inflater.inflate(C6197g.fragment_subscription_lists_preferences, container, false);
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            C20037e c20037e = null;
            SubscriptionListsViewModel subscriptionListsViewModel = null;
            if (NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                SubscriptionListsViewModel subscriptionListsViewModel2 = this.viewModel;
                if (subscriptionListsViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    subscriptionListsViewModel = subscriptionListsViewModel2;
                }
                subscriptionListsViewModel.m61447C();
                return;
            }
            C20037e c20037e2 = this.adapter;
            if (c20037e2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                c20037e = c20037e2;
            }
            c20037e.m61417O();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        SnowballHeader snowballHeader;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C20037e c20037e = new C20037e(this, this);
        this.adapter = c20037e;
        C27744a c27744a = this.binding;
        RecyclerView recyclerView2 = c27744a != null ? c27744a.notificationPreferenceRecycler : null;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(c20037e);
        }
        C27744a c27744a2 = this.binding;
        RecyclerView recyclerView3 = c27744a2 != null ? c27744a2.notificationPreferenceRecycler : null;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C27744a c27744a3 = this.binding;
        if (c27744a3 != null && (recyclerView = c27744a3.notificationPreferenceRecycler) != null) {
            recyclerView.addItemDecoration(new LineDividerItemDecoration(getContext()));
        }
        C27744a c27744a4 = this.binding;
        if (c27744a4 == null || (snowballHeader = c27744a4.header) == null) {
            return;
        }
        snowballHeader.setHeaderTitle(getString(C6198h.subscription_list_view_header));
    }

    @Override // com.disney.wdpro.ref_unify_messaging.p433ui.adapters.C20034b.a
    /* renamed from: q */
    public void mo61410q() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", activity.getPackageName());
            intent.putExtra("app_uid", activity.getApplicationInfo().uid);
            intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
            startActivity(intent);
        }
    }
}