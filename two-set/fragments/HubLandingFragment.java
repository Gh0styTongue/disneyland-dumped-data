package com.disney.wdpro.virtualqueue.core.fragments;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C3821v0;
import androidx.view.C3827w0;
import com.disney.wdpro.aligator.C8663c;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.support.anim.SnowballNextFlowAnimation;
import com.disney.wdpro.support.widget.SnowballHeader;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrBaseContainer;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrDisneyContainer;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.VirtualQueueStackActivity;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions;
import com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueNavigationEntriesProvider;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.viewmodels.HubLandingViewModel;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentHubLandingBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.CommonExtensionsKt;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegate;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegateKt;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.VQPageType;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueMainAdapter;
import com.disney.wdpro.virtualqueue.p462ui.sticky_headers.StickyHeadersItemDecoration;
import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import p498da.InterfaceC27132a;
import p708ko.InterfaceC29611b;

@Metadata(m92037d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 r2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u0005J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J'\u0010'\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001cH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0017H\u0016¢\u0006\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001a0S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010RR\u0016\u0010W\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010RR\u001d\u0010]\u001a\u0004\u0018\u00010X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\"\u0010_\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010f\u001a\u00020e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001b\u0010q\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p¨\u0006s"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/HubLandingFragment;", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueBaseFragment;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectQueueActions;", "Lda/a;", "<init>", "()V", "", "setupUI", "setupViewModel", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "isAnonymous", VirtualQueueConstants.SELECT_GUEST_IN_PARTY, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "", "facilityId", "showCreateParty", "(ZZLcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;)V", "showReviewDetails", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;)V", "showRequestEnableLocation", "showFinderDetails", "(Ljava/lang/String;)V", "url", "park", "showHyperlink", "(Ljava/lang/String;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;)V", "onBackPressed", "()Z", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "getPicassoUtils", "()Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "setPicassoUtils", "(Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "getFacilityUtils", "()Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "setFacilityUtils", "(Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "vqAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "getVqAnalytics", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "setVqAnalytics", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;)V", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "vqRegions", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "getVqRegions", "()Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "setVqRegions", "(Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "navigationEntriesProvider", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "getNavigationEntriesProvider", "()Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "setNavigationEntriesProvider", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;)V", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter;", "adapter", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter;", "selectedHubId", "Ljava/lang/String;", "", "totalQueuesLoaded", "Ljava/util/List;", "hubLocation", "loadedHubName", "Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentHubLandingBinding;", "binding$delegate", "Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentHubLandingBinding;", "binding", "Landroidx/lifecycle/v0$c;", "viewModelFactory", "Landroidx/lifecycle/v0$c;", "getViewModelFactory", "()Landroidx/lifecycle/v0$c;", "setViewModelFactory", "(Landroidx/lifecycle/v0$c;)V", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter$Factory;", "selectQueueMainAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter$Factory;", "getSelectQueueMainAdapterFactory", "()Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter$Factory;", "setSelectQueueMainAdapterFactory", "(Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter$Factory;)V", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel;", "viewModel", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nHubLandingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HubLandingFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/HubLandingFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1#2:289\n*E\n"})
/* loaded from: classes20.dex */
public final class HubLandingFragment extends VirtualQueueBaseFragment implements SelectQueueActions, InterfaceC27132a {
    public static final String HEADER_TITLE = "headerTitle";
    private SelectQueueMainAdapter adapter;

    @Inject
    public FacilityUtils facilityUtils;

    @Inject
    public VirtualQueueNavigationEntriesProvider navigationEntriesProvider;

    @Inject
    public PicassoUtils picassoUtils;

    @Inject
    public SelectQueueMainAdapter.Factory selectQueueMainAdapterFactory;
    private String selectedHubId;

    @Inject
    public C3821v0.c viewModelFactory;

    @Inject
    public VirtualQueueAnalytics vqAnalytics;

    @Inject
    public VirtualQueueRegions vqRegions;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(HubLandingFragment.class, "binding", "getBinding()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentHubLandingBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private List<Queue> totalQueuesLoaded = CollectionsKt.emptyList();
    private String hubLocation = "";
    private String loadedHubName = "";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding = FragmentViewBindingDelegateKt.viewBinding(this, HubLandingFragment$binding$2.INSTANCE);

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel = LazyKt.lazy(new Function0<HubLandingViewModel>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.HubLandingFragment$viewModel$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HubLandingViewModel invoke() {
            HubLandingFragment hubLandingFragment = this.this$0;
            return (HubLandingViewModel) C3827w0.m20288d(hubLandingFragment, hubLandingFragment.getViewModelFactory()).m20262a(HubLandingViewModel.class);
        }
    });

    @Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/HubLandingFragment$Companion;", "", "()V", "HEADER_TITLE", "", "newInstance", "Lcom/disney/wdpro/virtualqueue/core/fragments/HubLandingFragment;", "data", "Landroid/os/Bundle;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HubLandingFragment newInstance(Bundle data) {
            HubLandingFragment hubLandingFragment = new HubLandingFragment();
            hubLandingFragment.setArguments(data);
            return hubLandingFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VqFragmentHubLandingBinding getBinding() {
        return (VqFragmentHubLandingBinding) this.binding.getValue2((Fragment) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HubLandingViewModel getViewModel() {
        return (HubLandingViewModel) this.viewModel.getValue();
    }

    private final void setupUI() {
        PtrDisneyContainer ptrDisneyContainer;
        PtrDisneyContainer ptrDisneyContainer2;
        ImageView imageView;
        ImageView imageView2;
        RecyclerView recyclerView;
        this.adapter = getSelectQueueMainAdapterFactory().create(this, this, null, getVqThemer(), getPicassoUtils(), getFacilityUtils(), getVqAnalytics(), getVqRegions());
        VqFragmentHubLandingBinding binding = getBinding();
        RecyclerView recyclerView2 = binding != null ? binding.queueList : null;
        if (recyclerView2 != null) {
            SelectQueueMainAdapter selectQueueMainAdapter = this.adapter;
            if (selectQueueMainAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                selectQueueMainAdapter = null;
            }
            recyclerView2.setAdapter(selectQueueMainAdapter);
        }
        VqFragmentHubLandingBinding binding2 = getBinding();
        if (binding2 != null && (recyclerView = binding2.queueList) != null) {
            SelectQueueMainAdapter selectQueueMainAdapter2 = this.adapter;
            if (selectQueueMainAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                selectQueueMainAdapter2 = null;
            }
            recyclerView.addItemDecoration(new StickyHeadersItemDecoration(selectQueueMainAdapter2));
        }
        VqFragmentHubLandingBinding binding3 = getBinding();
        if (binding3 != null && (imageView2 = binding3.btnHubLandingBack) != null) {
            imageView2.sendAccessibilityEvent(65536);
        }
        VqFragmentHubLandingBinding binding4 = getBinding();
        if (binding4 != null && (imageView = binding4.btnHubLandingBack) != null) {
            CommonExtensionsKt.setOnDebouncedClickListener$default(imageView, 0, new Function0<Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.HubLandingFragment.setupUI.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    HubLandingFragment.this.getViewModel().onBackPressed(HubLandingFragment.this.getArguments());
                    HubLandingFragment.this.getVqAnalytics().trackHubBackPress(HubLandingFragment.this.loadedHubName, HubLandingFragment.this.hubLocation);
                }
            }, 1, null);
        }
        VqFragmentHubLandingBinding binding5 = getBinding();
        if (binding5 != null && (ptrDisneyContainer2 = binding5.pullToRefreshContainer) != null) {
            setupCommonPullToRefresh(ptrDisneyContainer2);
        }
        VqFragmentHubLandingBinding binding6 = getBinding();
        if (binding6 == null || (ptrDisneyContainer = binding6.pullToRefreshContainer) == null) {
            return;
        }
        ptrDisneyContainer.setPtrHandler(new InterfaceC29611b() { // from class: com.disney.wdpro.virtualqueue.core.fragments.HubLandingFragment.setupUI.3
            @Override // p708ko.InterfaceC29611b
            public /* bridge */ /* synthetic */ boolean checkCanDoRefresh(PtrBaseContainer ptrBaseContainer, View view, View view2) {
                return super.checkCanDoRefresh(ptrBaseContainer, view, view2);
            }

            @Override // p708ko.InterfaceC29611b
            public void onRefreshBegin(PtrBaseContainer frame) {
                Intrinsics.checkNotNullParameter(frame, "frame");
                VqFragmentHubLandingBinding binding7 = HubLandingFragment.this.getBinding();
                PtrDisneyContainer ptrDisneyContainer3 = binding7 != null ? binding7.pullToRefreshContainer : null;
                if (ptrDisneyContainer3 != null) {
                    ptrDisneyContainer3.setEnabled(false);
                }
                HubLandingViewModel.loadSelectedHubQueues$default(HubLandingFragment.this.getViewModel(), null, 1, null);
            }

            @Override // p708ko.InterfaceC29611b
            public void onRefreshFinish() {
                if (CommonExtensionsKt.isSafe(HubLandingFragment.this)) {
                    VqFragmentHubLandingBinding binding7 = HubLandingFragment.this.getBinding();
                    PtrDisneyContainer ptrDisneyContainer3 = binding7 != null ? binding7.pullToRefreshContainer : null;
                    if (ptrDisneyContainer3 == null) {
                        return;
                    }
                    ptrDisneyContainer3.setEnabled(true);
                }
            }
        });
    }

    private final void setupViewModel() {
        getViewModel().getState().observe(getViewLifecycleOwner(), new HubLandingFragment$sam$androidx_lifecycle_Observer$0(new Function1<HubLandingViewModel.UiState, Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.HubLandingFragment.setupViewModel.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HubLandingViewModel.UiState uiState) {
                invoke2(uiState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(HubLandingViewModel.UiState uiState) {
                TextView textView;
                TextView textView2;
                ImageView imageView;
                ConstraintLayout constraintLayout;
                SelectQueueMainAdapter selectQueueMainAdapter;
                PtrDisneyContainer ptrDisneyContainer;
                PtrDisneyContainer ptrDisneyContainer2;
                PtrDisneyContainer ptrDisneyContainer3;
                if (Intrinsics.areEqual(uiState, HubLandingViewModel.UiState.LoadingQueue.INSTANCE)) {
                    VqFragmentHubLandingBinding binding = HubLandingFragment.this.getBinding();
                    if (binding == null || (ptrDisneyContainer3 = binding.pullToRefreshContainer) == null) {
                        return;
                    }
                    ptrDisneyContainer3.m64010J();
                    return;
                }
                if (Intrinsics.areEqual(uiState, HubLandingViewModel.UiState.NavigateBack.INSTANCE)) {
                    SnowballHeader header = HubLandingFragment.this.getActivityActions().getHeader();
                    if (header != null) {
                        header.setVisibility(0);
                    }
                    FragmentActivity activity = HubLandingFragment.this.getActivity();
                    VirtualQueueStackActivity virtualQueueStackActivity = activity instanceof VirtualQueueStackActivity ? (VirtualQueueStackActivity) activity : null;
                    if (virtualQueueStackActivity != null) {
                        virtualQueueStackActivity.onBackPressed();
                        return;
                    }
                    return;
                }
                if (uiState instanceof HubLandingViewModel.UiState.Error) {
                    VqFragmentHubLandingBinding binding2 = HubLandingFragment.this.getBinding();
                    if (binding2 != null && (ptrDisneyContainer2 = binding2.pullToRefreshContainer) != null) {
                        ptrDisneyContainer2.m64009G();
                    }
                    HubLandingFragment.this.showDefaultGenericErrorMessage(true);
                    return;
                }
                if (uiState instanceof HubLandingViewModel.UiState.LoadQueuesSucceed) {
                    VqFragmentHubLandingBinding binding3 = HubLandingFragment.this.getBinding();
                    if (binding3 != null && (ptrDisneyContainer = binding3.pullToRefreshContainer) != null) {
                        ptrDisneyContainer.m64009G();
                    }
                    HubLandingViewModel.UiState.LoadQueuesSucceed loadQueuesSucceed = (HubLandingViewModel.UiState.LoadQueuesSucceed) uiState;
                    List<Queue> queuesLoaded = loadQueuesSucceed.getQueuesLoaded();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(queuesLoaded, 10));
                    Iterator<T> it = queuesLoaded.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Queue) it.next()).getContentId());
                    }
                    List<String> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                    String selectedHubContentId = loadQueuesSucceed.getSelectedHubContentId();
                    mutableList.add(selectedHubContentId != null ? selectedHubContentId : "");
                    HubLandingFragment.this.getVqThemer().refreshDocuments(mutableList);
                    SelectQueueMainAdapter selectQueueMainAdapter2 = HubLandingFragment.this.adapter;
                    if (selectQueueMainAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        selectQueueMainAdapter = null;
                    } else {
                        selectQueueMainAdapter = selectQueueMainAdapter2;
                    }
                    SelectQueueMainAdapter.setCategories$default(selectQueueMainAdapter, null, null, loadQueuesSucceed.getQueuesLoaded(), CollectionsKt.emptyList(), loadQueuesSucceed.getSelectedHubContentId(), false, 2, null);
                    HubLandingFragment.this.totalQueuesLoaded = loadQueuesSucceed.getQueuesLoaded();
                    HubLandingFragment.this.getViewModel().loadHubDetails();
                    return;
                }
                if (uiState instanceof HubLandingViewModel.UiState.OpenCompletionDeeplink) {
                    HubLandingFragment.this.getActivityActions().navigateTo(new C8663c.b(((HubLandingViewModel.UiState.OpenCompletionDeeplink) uiState).getDeeplink()).m37293g().build());
                    return;
                }
                if (uiState instanceof HubLandingViewModel.UiState.DisplayGradientBackground) {
                    VqFragmentHubLandingBinding binding4 = HubLandingFragment.this.getBinding();
                    if (binding4 != null && (constraintLayout = binding4.parentHubLanding) != null) {
                        CommonExtensionsKt.setGradientBackground(constraintLayout, ((HubLandingViewModel.UiState.DisplayGradientBackground) uiState).getColors());
                    }
                    VqFragmentHubLandingBinding binding5 = HubLandingFragment.this.getBinding();
                    ImageView imageView2 = binding5 != null ? binding5.imageBackground : null;
                    if (imageView2 == null) {
                        return;
                    }
                    imageView2.setVisibility(8);
                    return;
                }
                if (uiState instanceof HubLandingViewModel.UiState.DisplayImageBackground) {
                    VqFragmentHubLandingBinding binding6 = HubLandingFragment.this.getBinding();
                    if (binding6 == null || (imageView = binding6.imageBackground) == null) {
                        return;
                    }
                    Context contextRequireContext = HubLandingFragment.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
                    PicassoUtils.loadImage$default(new PicassoUtils(contextRequireContext), ((HubLandingViewModel.UiState.DisplayImageBackground) uiState).getImageUrl(), imageView, null, null, null, 28, null);
                    return;
                }
                if (uiState instanceof HubLandingViewModel.UiState.DisplayHubDetails) {
                    VqFragmentHubLandingBinding binding7 = HubLandingFragment.this.getBinding();
                    TextView textView3 = binding7 != null ? binding7.txtHubTitle : null;
                    if (textView3 != null) {
                        textView3.setText(((HubLandingViewModel.UiState.DisplayHubDetails) uiState).getHub().getName());
                    }
                    HubLandingViewModel.UiState.DisplayHubDetails displayHubDetails = (HubLandingViewModel.UiState.DisplayHubDetails) uiState;
                    String disclaimer = displayHubDetails.getHub().getDisclaimer();
                    if (disclaimer == null || !(!StringsKt.isBlank(disclaimer))) {
                        disclaimer = null;
                    }
                    if (disclaimer != null) {
                        VqFragmentHubLandingBinding binding8 = HubLandingFragment.this.getBinding();
                        if (binding8 != null && (textView2 = binding8.disclaimerText) != null) {
                            textView2.setVisibility(0);
                            textView2.setText(displayHubDetails.getHub().getDisclaimer());
                        }
                    } else {
                        VqFragmentHubLandingBinding binding9 = HubLandingFragment.this.getBinding();
                        TextView textView4 = binding9 != null ? binding9.disclaimerText : null;
                        if (textView4 != null) {
                            textView4.setVisibility(8);
                        }
                    }
                    VqFragmentHubLandingBinding binding10 = HubLandingFragment.this.getBinding();
                    ImageView imageView3 = binding10 != null ? binding10.btnHubLandingBack : null;
                    if (imageView3 != null) {
                        VirtualQueueThemer vqThemer = HubLandingFragment.this.getVqThemer();
                        VQStringType vQStringType = VQStringType.HubBackButtonAccessibility;
                        String contentId = displayHubDetails.getHub().getContentId();
                        imageView3.setContentDescription(VirtualQueueThemer.getString$default(vqThemer, vQStringType, contentId == null ? "" : contentId, false, 4, null));
                    }
                    String string$default = VirtualQueueThemer.getString$default(HubLandingFragment.this.getVqThemer(), VQStringType.CommonPTRTitleAccessibility, null, false, 6, null);
                    String string$default2 = VirtualQueueThemer.getString$default(HubLandingFragment.this.getVqThemer(), VQStringType.CommonHeadingAccessibility, MapsKt.mapOf(TuplesKt.m92045to("headerTitle", displayHubDetails.getHub().getName())), null, false, 12, null);
                    VqFragmentHubLandingBinding binding11 = HubLandingFragment.this.getBinding();
                    TextView textView5 = binding11 != null ? binding11.txtHubTitle : null;
                    if (textView5 != null) {
                        textView5.setContentDescription(string$default2 + ", " + string$default);
                    }
                    VqFragmentHubLandingBinding binding12 = HubLandingFragment.this.getBinding();
                    if (binding12 != null && (textView = binding12.txtHubTitle) != null) {
                        VirtualQueueThemer vqThemer2 = HubLandingFragment.this.getVqThemer();
                        VQStringType vQStringType2 = VQStringType.HubHeaderColor;
                        String contentId2 = displayHubDetails.getHub().getContentId();
                        textView.setTextColor(Color.parseColor(VirtualQueueThemer.getString$default(vqThemer2, vQStringType2, contentId2 == null ? "" : contentId2, false, 4, null)));
                    }
                    if (displayHubDetails.getDescription().length() == 0 && displayHubDetails.getSubParkLocation().length() == 0) {
                        VqFragmentHubLandingBinding binding13 = HubLandingFragment.this.getBinding();
                        TextView textView6 = binding13 != null ? binding13.hubQueueLocation : null;
                        if (textView6 != null) {
                            textView6.setVisibility(8);
                        }
                        VqFragmentHubLandingBinding binding14 = HubLandingFragment.this.getBinding();
                        TextView textView7 = binding14 != null ? binding14.hubQueueDescription : null;
                        if (textView7 != null) {
                            textView7.setVisibility(8);
                        }
                        VqFragmentHubLandingBinding binding15 = HubLandingFragment.this.getBinding();
                        View view = binding15 != null ? binding15.hubDivider : null;
                        if (view != null) {
                            view.setVisibility(8);
                        }
                    } else {
                        if (displayHubDetails.getDescription().length() > 0) {
                            VqFragmentHubLandingBinding binding16 = HubLandingFragment.this.getBinding();
                            TextView textView8 = binding16 != null ? binding16.hubQueueDescription : null;
                            if (textView8 != null) {
                                textView8.setVisibility(0);
                            }
                            VqFragmentHubLandingBinding binding17 = HubLandingFragment.this.getBinding();
                            TextView textView9 = binding17 != null ? binding17.hubQueueDescription : null;
                            if (textView9 != null) {
                                textView9.setText(displayHubDetails.getDescription());
                            }
                        }
                        VirtualQueueThemer vqThemer3 = HubLandingFragment.this.getVqThemer();
                        VQStringType vQStringType3 = VQStringType.HubLocatedAt;
                        String contentId3 = displayHubDetails.getHub().getContentId();
                        String string$default3 = VirtualQueueThemer.getString$default(vqThemer3, vQStringType3, contentId3 == null ? "" : contentId3, false, 4, null);
                        if (displayHubDetails.getSubParkLocation().length() > 0) {
                            HubLandingFragment.this.hubLocation = displayHubDetails.getSubParkLocation();
                            HubLandingFragment.this.loadedHubName = displayHubDetails.getHub().getName();
                            VqFragmentHubLandingBinding binding18 = HubLandingFragment.this.getBinding();
                            TextView textView10 = binding18 != null ? binding18.hubQueueLocation : null;
                            if (textView10 != null) {
                                textView10.setVisibility(0);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) string$default3).append((CharSequence) " ");
                            StyleSpan styleSpan = new StyleSpan(1);
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) displayHubDetails.getSubParkLocation());
                            spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                            SpannedString spannedString = new SpannedString(spannableStringBuilder);
                            VqFragmentHubLandingBinding binding19 = HubLandingFragment.this.getBinding();
                            TextView textView11 = binding19 != null ? binding19.hubQueueLocation : null;
                            if (textView11 != null) {
                                textView11.setText(spannedString);
                            }
                        }
                    }
                    Facility facility = HubLandingFragment.this.getFacilityUtils().getFacility(displayHubDetails.getHub().getTabContentId());
                    VirtualQueueAnalytics vqAnalytics = HubLandingFragment.this.getVqAnalytics();
                    String simpleName = HubLandingFragment.this.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
                    vqAnalytics.trackHubLoadOnLandingScreen(simpleName, HubLandingFragment.this.totalQueuesLoaded, facility != null ? CommonExtensionsKt.parkName(facility) : null, displayHubDetails.getHub(), displayHubDetails.getSubParkLocation());
                }
            }
        }));
    }

    public final FacilityUtils getFacilityUtils() {
        FacilityUtils facilityUtils = this.facilityUtils;
        if (facilityUtils != null) {
            return facilityUtils;
        }
        Intrinsics.throwUninitializedPropertyAccessException("facilityUtils");
        return null;
    }

    public final VirtualQueueNavigationEntriesProvider getNavigationEntriesProvider() {
        VirtualQueueNavigationEntriesProvider virtualQueueNavigationEntriesProvider = this.navigationEntriesProvider;
        if (virtualQueueNavigationEntriesProvider != null) {
            return virtualQueueNavigationEntriesProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigationEntriesProvider");
        return null;
    }

    public final PicassoUtils getPicassoUtils() {
        PicassoUtils picassoUtils = this.picassoUtils;
        if (picassoUtils != null) {
            return picassoUtils;
        }
        Intrinsics.throwUninitializedPropertyAccessException("picassoUtils");
        return null;
    }

    public final SelectQueueMainAdapter.Factory getSelectQueueMainAdapterFactory() {
        SelectQueueMainAdapter.Factory factory = this.selectQueueMainAdapterFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("selectQueueMainAdapterFactory");
        return null;
    }

    public final C3821v0.c getViewModelFactory() {
        C3821v0.c cVar = this.viewModelFactory;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final VirtualQueueAnalytics getVqAnalytics() {
        VirtualQueueAnalytics virtualQueueAnalytics = this.vqAnalytics;
        if (virtualQueueAnalytics != null) {
            return virtualQueueAnalytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vqAnalytics");
        return null;
    }

    public final VirtualQueueRegions getVqRegions() {
        VirtualQueueRegions virtualQueueRegions = this.vqRegions;
        if (virtualQueueRegions != null) {
            return virtualQueueRegions;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vqRegions");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        SnowballHeader header = getActivityActions().getHeader();
        if (header == null) {
            return;
        }
        header.setVisibility(8);
    }

    @Override // p498da.InterfaceC27132a
    public boolean onBackPressed() {
        SnowballHeader header = getActivityActions().getHeader();
        if (header != null) {
            header.setVisibility(0);
        }
        return false;
    }

    @Override // com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C21487R.layout.vq_fragment_hub_landing, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        PtrDisneyContainer ptrDisneyContainer;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setupUI();
        setupViewModel();
        Bundle arguments = getArguments();
        this.selectedHubId = arguments != null ? arguments.getString(VirtualQueueConstants.HUB_ID_PARAM) : null;
        HubLandingViewModel viewModel = getViewModel();
        String str = this.selectedHubId;
        if (str == null) {
            str = "";
        }
        viewModel.loadSelectedHubQueues(str);
        VqFragmentHubLandingBinding binding = getBinding();
        if (binding == null || (ptrDisneyContainer = binding.pullToRefreshContainer) == null) {
            return;
        }
        ptrDisneyContainer.m64010J();
    }

    public final void setFacilityUtils(FacilityUtils facilityUtils) {
        Intrinsics.checkNotNullParameter(facilityUtils, "<set-?>");
        this.facilityUtils = facilityUtils;
    }

    public final void setNavigationEntriesProvider(VirtualQueueNavigationEntriesProvider virtualQueueNavigationEntriesProvider) {
        Intrinsics.checkNotNullParameter(virtualQueueNavigationEntriesProvider, "<set-?>");
        this.navigationEntriesProvider = virtualQueueNavigationEntriesProvider;
    }

    public final void setPicassoUtils(PicassoUtils picassoUtils) {
        Intrinsics.checkNotNullParameter(picassoUtils, "<set-?>");
        this.picassoUtils = picassoUtils;
    }

    public final void setSelectQueueMainAdapterFactory(SelectQueueMainAdapter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.selectQueueMainAdapterFactory = factory;
    }

    public final void setViewModelFactory(C3821v0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.viewModelFactory = cVar;
    }

    public final void setVqAnalytics(VirtualQueueAnalytics virtualQueueAnalytics) {
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "<set-?>");
        this.vqAnalytics = virtualQueueAnalytics;
    }

    public final void setVqRegions(VirtualQueueRegions virtualQueueRegions) {
        Intrinsics.checkNotNullParameter(virtualQueueRegions, "<set-?>");
        this.vqRegions = virtualQueueRegions;
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions
    public void showCreateParty(boolean isAnonymous, boolean selectGuestInParty, Queue queue, String facilityId) {
        String string;
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        getVqAnalytics().trackSelectQueuesJoinFromHub(queue, facilityId);
        Bundle bundle = new Bundle();
        bundle.putString("queueId", queue.getQueueId());
        bundle.putBoolean(VirtualQueueConstants.HUB_LANDING, true);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("completionDeepLink")) != null) {
            bundle.putString("completionDeepLink", string);
        }
        ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), CreatePartyFragment.INSTANCE.newInstance(bundle, isAnonymous, false, selectGuestInParty), new SnowballNextFlowAnimation(), false, false, false, 28, null);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions
    public void showFinderDetails(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        ActivityActions activityActions = getActivityActions();
        VirtualQueueNavigationEntriesProvider navigationEntriesProvider = getNavigationEntriesProvider();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        activityActions.navigateTo(navigationEntriesProvider.getFinderDetailEntry(contextRequireContext, facilityId, true));
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions
    public void showHyperlink(String url, Queue queue, String park) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(park, "park");
        super.showHyperlink(url);
        getVqAnalytics().trackHyperlinkClick(VQPageType.SELECTQUEUE, queue, park, true);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions
    public void showRequestEnableLocation() {
        getActivityActions().requestEnableLocation();
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions
    public void showReviewDetails(Queue queue, String facilityId) {
        String string;
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        getVqAnalytics().trackSelectQueuesJoinFromHub(queue, facilityId);
        Bundle bundle = new Bundle();
        bundle.putString("queueId", queue.getQueueId());
        bundle.putBoolean(VirtualQueueConstants.HUB_LANDING, true);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("completionDeepLink")) != null) {
            bundle.putString("completionDeepLink", string);
        }
        ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), ReviewDetailsFragment.INSTANCE.newInstance(bundle), new SnowballNextFlowAnimation(), false, false, false, 28, null);
    }
}