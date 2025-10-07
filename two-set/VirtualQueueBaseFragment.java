package com.disney.wdpro.virtualqueue.core;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.AbstractC3694e0;
import androidx.fragment.app.FragmentActivity;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.recommender.core.RecommenderConstants;
import com.disney.wdpro.service.business.APIConstants;
import com.disney.wdpro.support.dialog.Banner;
import com.disney.wdpro.support.dialog.ErrorBannerFragment;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrDisneyContainer;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.fragments.PeekViewModalFragment;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import com.disney.wdpro.virtualqueue.core.interfaces.FragmentActions;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingScreenName;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.p462ui.common.LottieLoader;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PtrMyQueuesHeader;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.C22462m;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0001UB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010$J7\u0010,\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001aH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0007H\u0004¢\u0006\u0004\b.\u0010\u0004J%\u00102\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u0013¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0007H\u0004¢\u0006\u0004\b8\u0010\u0004R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010O\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006V"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/VirtualQueueBaseFragment;", "Lcom/disney/wdpro/commons/BaseFragment;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/FragmentActions;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "getAnalyticsPageName", "()Ljava/lang/String;", "errorMessage", "errorTitle", "Lcom/disney/wdpro/support/dialog/ErrorBannerFragment$d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "enableRetry", ErrorBannerFragment.IS_TRANSACTIONAL, "showErrorBanner", "(Ljava/lang/String;Ljava/lang/String;Lcom/disney/wdpro/support/dialog/ErrorBannerFragment$d;ZZ)V", "shouldGoBack", "showDefaultGenericErrorMessage", "(Z)V", "url", "showHyperlink", "(Ljava/lang/String;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "performanceTracking", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTrackingScreenName;", RecommenderConstants.RECOMMENDER_PERFORMANCE_LOAD_TIME_SCREEN_NAME, TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "isInitialLoad", "isSummoned", "pageLoadTimeTracking", "(Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTrackingScreenName;Landroid/view/View;ZZ)V", "dismissErrorBanner", APIConstants.JsonKeys.PRIMARY_GUEST, "swid", "instructions", "showPeekView", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/disney/wdpro/support/widget/pull_to_refresh/view/PtrDisneyContainer;", "pullToRefreshContainer", "setupCommonPullToRefresh", "(Lcom/disney/wdpro/support/widget/pull_to_refresh/view/PtrDisneyContainer;)V", "showNoNetworkMessage", "Lcom/disney/wdpro/virtualqueue/couchbase/VirtualQueueRepository;", "virtualQueueRepository", "Lcom/disney/wdpro/virtualqueue/couchbase/VirtualQueueRepository;", "getVirtualQueueRepository", "()Lcom/disney/wdpro/virtualqueue/couchbase/VirtualQueueRepository;", "setVirtualQueueRepository", "(Lcom/disney/wdpro/virtualqueue/couchbase/VirtualQueueRepository;)V", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "getVqThemer", "()Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "setVqThemer", "(Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authenticationManager", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "getAuthenticationManager", "()Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "setAuthenticationManager", "(Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/ActivityActions;", "activityActions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/ActivityActions;", "getActivityActions", "()Lcom/disney/wdpro/virtualqueue/core/interfaces/ActivityActions;", "setActivityActions", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/ActivityActions;)V", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public class VirtualQueueBaseFragment extends BaseFragment implements FragmentActions {
    private static final String ERROR_BANNER_TAG = "BannerAlertDialog";
    public ActivityActions activityActions;

    @Inject
    public AuthenticationManager authenticationManager;

    @Inject
    public VirtualQueueRepository virtualQueueRepository;

    @Inject
    public VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    public static /* synthetic */ void showDefaultGenericErrorMessage$default(VirtualQueueBaseFragment virtualQueueBaseFragment, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDefaultGenericErrorMessage");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        virtualQueueBaseFragment.showDefaultGenericErrorMessage(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void dismissErrorBanner() {
        AbstractC3694e0 supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "requireActivity().supportFragmentManager");
        if (supportFragmentManager.m19755o0(ERROR_BANNER_TAG) != null) {
            Banner.m62480e();
        }
    }

    public final ActivityActions getActivityActions() {
        ActivityActions activityActions = this.activityActions;
        if (activityActions != null) {
            return activityActions;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityActions");
        return null;
    }

    @Override // com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return InterfaceC8679k.IGNORE;
    }

    public final AuthenticationManager getAuthenticationManager() {
        AuthenticationManager authenticationManager = this.authenticationManager;
        if (authenticationManager != null) {
            return authenticationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authenticationManager");
        return null;
    }

    public final VirtualQueueRepository getVirtualQueueRepository() {
        VirtualQueueRepository virtualQueueRepository = this.virtualQueueRepository;
        if (virtualQueueRepository != null) {
            return virtualQueueRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("virtualQueueRepository");
        return null;
    }

    public final VirtualQueueThemer getVqThemer() {
        VirtualQueueThemer virtualQueueThemer = this.vqThemer;
        if (virtualQueueThemer != null) {
            return virtualQueueThemer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vqThemer");
        return null;
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ActivityCompat.OnRequestPermissionsResultCallback activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions");
        setActivityActions((ActivityActions) activity);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C21487R.layout.vq_fragment_base, container, false);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.FragmentActions
    public void pageLoadTimeTracking(PerformanceTracking performanceTracking, PerformanceTrackingScreenName screenName, View view, boolean isInitialLoad, boolean isSummoned) {
        Intrinsics.checkNotNullParameter(performanceTracking, "performanceTracking");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(view, "view");
        performanceTracking.logLoadTime(screenName, view, "", isInitialLoad, isSummoned);
    }

    public final void setActivityActions(ActivityActions activityActions) {
        Intrinsics.checkNotNullParameter(activityActions, "<set-?>");
        this.activityActions = activityActions;
    }

    public final void setAuthenticationManager(AuthenticationManager authenticationManager) {
        Intrinsics.checkNotNullParameter(authenticationManager, "<set-?>");
        this.authenticationManager = authenticationManager;
    }

    public final void setVirtualQueueRepository(VirtualQueueRepository virtualQueueRepository) {
        Intrinsics.checkNotNullParameter(virtualQueueRepository, "<set-?>");
        this.virtualQueueRepository = virtualQueueRepository;
    }

    public final void setVqThemer(VirtualQueueThemer virtualQueueThemer) {
        Intrinsics.checkNotNullParameter(virtualQueueThemer, "<set-?>");
        this.vqThemer = virtualQueueThemer;
    }

    public final void setupCommonPullToRefresh(PtrDisneyContainer pullToRefreshContainer) {
        Intrinsics.checkNotNullParameter(pullToRefreshContainer, "pullToRefreshContainer");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        PtrMyQueuesHeader ptrMyQueuesHeader = new PtrMyQueuesHeader(contextRequireContext);
        ptrMyQueuesHeader.setVqThemer(getVqThemer());
        ptrMyQueuesHeader.setLoadingStringType(VQStringType.SelectQueueLoading);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        new LottieLoader(fragmentActivityRequireActivity, getVqThemer()).setLoaderAnimationUrl(ptrMyQueuesHeader.getPtrLoader());
        pullToRefreshContainer.m64011f(ptrMyQueuesHeader);
        pullToRefreshContainer.setHeaderView(ptrMyQueuesHeader);
        pullToRefreshContainer.setEnablePtr(true);
    }

    public final void showDefaultGenericErrorMessage(final boolean shouldGoBack) {
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersJoinErrorMessage, null, false, 6, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersJoinErrorTitle, null, false, 6, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment.showDefaultGenericErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                FragmentActivity activity;
                if ((shouldGoBack ? this : null) == null || (activity = this.getActivity()) == null) {
                    return;
                }
                activity.onBackPressed();
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
            }
        }, false, true);
    }

    protected final void showErrorBanner(String errorMessage, String errorTitle, ErrorBannerFragment.InterfaceC20694d listener, boolean enableRetry, boolean isTransactional) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorTitle, "errorTitle");
        C22462m.m68686r(errorMessage, "Error: banner message must not be null.", new Object[0]);
        AbstractC3694e0 supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "requireActivity().supportFragmentManager");
        if (supportFragmentManager.m19755o0(ERROR_BANNER_TAG) == null) {
            Banner.m62480e();
            Banner.C20687a c20687a = new Banner.C20687a(errorMessage, ERROR_BANNER_TAG, getActivity());
            if (listener != null) {
                c20687a.m62495c(listener);
            }
            if (!TextUtils.isEmpty(errorTitle)) {
                c20687a.m62494C(errorTitle);
            }
            if (enableRetry) {
                c20687a.m62493B();
            } else if (isTransactional) {
                c20687a.m62518z();
            }
            c20687a.m62517y();
        }
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.FragmentActions
    public void showHyperlink(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void showNoNetworkMessage() {
        showErrorBanner("", VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannerNetworkOffline, null, false, 6, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment.showNoNetworkMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
            }
        }, false, false);
    }

    public final void showPeekView(String primaryGuest, String swid, String instructions) {
        Intrinsics.checkNotNullParameter(primaryGuest, "primaryGuest");
        Intrinsics.checkNotNullParameter(swid, "swid");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        requireFragmentManager();
        AbstractC3694e0 fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            PeekViewModalFragment peekViewModalFragmentNewInstance = PeekViewModalFragment.INSTANCE.newInstance(primaryGuest, swid, instructions);
            peekViewModalFragmentNewInstance.show(fragmentManager, peekViewModalFragmentNewInstance.getTag());
        }
    }
}