package com.disney.wdpro.virtualqueue.core.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.aligator.C8663c;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.support.anim.SnowballNextFlowAnimation;
import com.disney.wdpro.support.widget.SnowballHeader;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.VirtualQueueStackActivity;
import com.disney.wdpro.virtualqueue.core.fragments.LeaveQueueFragment;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import com.disney.wdpro.virtualqueue.core.interfaces.ConfirmationActions;
import com.disney.wdpro.virtualqueue.core.interfaces.PositionActions;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingAttribute;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingEventName;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingScreenName;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentConfirmationBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegate;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegateKt;
import com.disney.wdpro.virtualqueue.p462ui.common.LottieLoader;
import com.disney.wdpro.virtualqueue.p462ui.common.QueuesPositionsAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.VQPageType;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Position;
import com.disney.wdpro.virtualqueue.service.model.PositionsResponseStatus;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import p498da.InterfaceC27132a;

@Metadata(m92037d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 }2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001}B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!J%\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\t2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010\u0010J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J-\u00104\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000#2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u0010\u0006J\u000f\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u0006J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0006R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010O\u001a\u00020N8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010U\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bU\u0010B\u001a\u0004\bV\u0010D\"\u0004\bW\u0010FR\"\u0010Y\u001a\u00020X8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001d\u0010d\u001a\u0004\u0018\u00010_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\"\u0010f\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0016\u0010m\u001a\u00020l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010o\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010rR\u0016\u0010t\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010pR.\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020v0u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|¨\u0006~"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/VirtualQueueConfirmationFragment;", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueBaseFragment;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/ConfirmationActions;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "Lda/a;", "<init>", "()V", "", "returnWindowMinutes", "", "getReturnTime", "(I)Ljava/lang/String;", "", "isFromCloseButton", "", "handleScreenClose", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onBackPressed", "()Z", "queueId", "", "guestIds", "showMyQueues", "(Ljava/lang/String;Ljava/util/List;)V", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "position", "showLeaveQueue", "(Lcom/disney/wdpro/virtualqueue/service/model/Position;)V", "fromMainButton", "startJoinFlow", "facilityId", "showDirections", "(Ljava/lang/String;)V", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "guests", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "showRedeem", "(Lcom/disney/wdpro/virtualqueue/service/model/Position;Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "requestEnableBluetooth", "requestEnableLocation", "requestEnablePushNotifications", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "virtualQueueManager", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "getVirtualQueueManager", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "setVirtualQueueManager", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "getVirtualQueueAnalytics", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "setVirtualQueueAnalytics", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;)V", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/commons/j;", "getParkAppConfiguration", "()Lcom/disney/wdpro/commons/j;", "setParkAppConfiguration", "(Lcom/disney/wdpro/commons/j;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "performanceTracking", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "getPerformanceTracking", "()Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "setPerformanceTracking", "(Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;)V", "vqAnalytics", "getVqAnalytics", "setVqAnalytics", "Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;", "queuesPositionsAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;", "getQueuesPositionsAdapterFactory", "()Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;", "setQueuesPositionsAdapterFactory", "(Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;)V", "Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentConfirmationBinding;", "binding$delegate", "Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentConfirmationBinding;", "binding", "Lcom/disney/wdpro/virtualqueue/ui/common/LottieLoader;", "loader", "Lcom/disney/wdpro/virtualqueue/ui/common/LottieLoader;", "getLoader", "()Lcom/disney/wdpro/virtualqueue/ui/common/LottieLoader;", "setLoader", "(Lcom/disney/wdpro/virtualqueue/ui/common/LottieLoader;)V", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "positionsResponse", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "completionDeepLink", "Ljava/lang/String;", "isDeepLinkedFlow", "Z", "suppressClose", VirtualQueueConstants.CONTENT_ID, "", "", "eventAttributes", "Ljava/util/Map;", "getEventAttributes", "()Ljava/util/Map;", "setEventAttributes", "(Ljava/util/Map;)V", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nVirtualQueueConfirmationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualQueueConfirmationFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/VirtualQueueConfirmationFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
/* loaded from: classes20.dex */
public final class VirtualQueueConfirmationFragment extends VirtualQueueBaseFragment implements ConfirmationActions, PositionActions, InterfaceC27132a {
    private boolean isDeepLinkedFlow;
    public LottieLoader loader;

    @Inject
    public C9314j parkAppConfiguration;

    @Inject
    public PerformanceTracking performanceTracking;

    @Inject
    public QueuesPositionsAdapter.Factory queuesPositionsAdapterFactory;
    private boolean suppressClose;

    @Inject
    public VirtualQueueAnalytics virtualQueueAnalytics;

    @Inject
    public VirtualQueueManager virtualQueueManager;

    @Inject
    public VirtualQueueAnalytics vqAnalytics;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(VirtualQueueConfirmationFragment.class, "binding", "getBinding()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentConfirmationBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding = FragmentViewBindingDelegateKt.viewBinding(this, VirtualQueueConfirmationFragment$binding$2.INSTANCE);
    private GetPositionsResponse positionsResponse = new GetPositionsResponse(null, null, null, null, false, 31, null);
    private String completionDeepLink = "";
    private String contentId = "";
    private Map<String, Object> eventAttributes = new LinkedHashMap();

    @Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n¨\u0006\u000e"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/VirtualQueueConfirmationFragment$Companion;", "", "()V", "newInstance", "Lcom/disney/wdpro/virtualqueue/core/fragments/VirtualQueueConfirmationFragment;", "data", "Landroid/os/Bundle;", "response", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "completionDeepLink", "", VirtualQueueConstants.SUPPRESS_CLOSE_ON_CONFIRMATION, "", VirtualQueueConstants.CONTENT_ID, "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VirtualQueueConfirmationFragment newInstance(Bundle data) {
            VirtualQueueConfirmationFragment virtualQueueConfirmationFragment = new VirtualQueueConfirmationFragment();
            virtualQueueConfirmationFragment.setArguments(data);
            return virtualQueueConfirmationFragment;
        }

        private Companion() {
        }

        public final VirtualQueueConfirmationFragment newInstance(GetPositionsResponse response, String completionDeepLink, boolean suppressCloseOnConfirmation, String contentId) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(completionDeepLink, "completionDeepLink");
            Intrinsics.checkNotNullParameter(contentId, "contentId");
            Bundle bundle = new Bundle();
            bundle.putSerializable(VirtualQueueConstants.QUEUE_POSITION_PARAM, response);
            bundle.putSerializable("completionDeepLink", completionDeepLink);
            bundle.putBoolean(VirtualQueueConstants.SUPPRESS_CLOSE_ON_CONFIRMATION, suppressCloseOnConfirmation);
            bundle.putString(VirtualQueueConstants.CONTENT_ID, contentId);
            return newInstance(bundle);
        }
    }

    private final VqFragmentConfirmationBinding getBinding() {
        return (VqFragmentConfirmationBinding) this.binding.getValue2((Fragment) this, $$delegatedProperties[0]);
    }

    private final String getReturnTime(int returnWindowMinutes) {
        if (returnWindowMinutes <= 0) {
            return VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ConfirmationReturnTimeAllDay, this.contentId, false, 4, null);
        }
        if (returnWindowMinutes % 60 != 0) {
            return VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ConfirmationReturnTimeWithinMinutes, MapsKt.mapOf(TuplesKt.m92045to("minutes", String.valueOf(returnWindowMinutes))), this.contentId, false, 8, null);
        }
        int i10 = (int) (returnWindowMinutes / 60.0f);
        return i10 == 1 ? VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ConfirmationReturnTimeWithinNextHour, this.contentId, false, 4, null) : VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ConfirmationReturnTimeWithinHours, MapsKt.mapOf(TuplesKt.m92045to("hours", String.valueOf(i10))), this.contentId, false, 8, null);
    }

    private final void handleScreenClose(boolean isFromCloseButton) {
        getVirtualQueueAnalytics().trackConfirmationContinue(this.positionsResponse, isFromCloseButton);
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        Position position = (Position) CollectionsKt.getOrNull(this.positionsResponse.getPositions(), 0);
        if (position == null) {
            position = new Position(null, null, 0, 0, 0L, false, null, null, false, false, null, 0, 0, null, 0, null, null, null, false, 524287, null);
        }
        showMyQueues(position.getQueueId(), position.getGuestIds());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(VirtualQueueConfirmationFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleScreenClose(false);
    }

    public final Map<String, Object> getEventAttributes() {
        return this.eventAttributes;
    }

    public final LottieLoader getLoader() {
        LottieLoader lottieLoader = this.loader;
        if (lottieLoader != null) {
            return lottieLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loader");
        return null;
    }

    public final C9314j getParkAppConfiguration() {
        C9314j c9314j = this.parkAppConfiguration;
        if (c9314j != null) {
            return c9314j;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parkAppConfiguration");
        return null;
    }

    public final PerformanceTracking getPerformanceTracking() {
        PerformanceTracking performanceTracking = this.performanceTracking;
        if (performanceTracking != null) {
            return performanceTracking;
        }
        Intrinsics.throwUninitializedPropertyAccessException("performanceTracking");
        return null;
    }

    public final QueuesPositionsAdapter.Factory getQueuesPositionsAdapterFactory() {
        QueuesPositionsAdapter.Factory factory = this.queuesPositionsAdapterFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("queuesPositionsAdapterFactory");
        return null;
    }

    public final VirtualQueueAnalytics getVirtualQueueAnalytics() {
        VirtualQueueAnalytics virtualQueueAnalytics = this.virtualQueueAnalytics;
        if (virtualQueueAnalytics != null) {
            return virtualQueueAnalytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("virtualQueueAnalytics");
        return null;
    }

    public final VirtualQueueManager getVirtualQueueManager() {
        VirtualQueueManager virtualQueueManager = this.virtualQueueManager;
        if (virtualQueueManager != null) {
            return virtualQueueManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("virtualQueueManager");
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

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        SnowballHeader header;
        super.onActivityCreated(savedInstanceState);
        ActivityActions.DefaultImpls.setTitle$default(getActivityActions(), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ConfirmationHeader, this.contentId, false, 4, null), false, 2, null);
        if (!this.isDeepLinkedFlow || (header = getActivityActions().getHeader()) == null) {
            return;
        }
        header.setNavigationIcon((Drawable) null);
    }

    @Override // p498da.InterfaceC27132a
    public boolean onBackPressed() {
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        handleScreenClose(true);
        return true;
    }

    @Override // com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C21487R.layout.vq_fragment_confirmation, container, false);
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Map<String, Object> map = this.eventAttributes;
        String attrName = PerformanceTrackingAttribute.LOAD_TIME_SCREEN_NAME.getAttrName();
        PerformanceTrackingScreenName performanceTrackingScreenName = PerformanceTrackingScreenName.CONFIRMATION_SCREEN;
        map.put(attrName, performanceTrackingScreenName.getScreenName());
        getPerformanceTracking().logTimedActionStart(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        FragmentActivity activity = getActivity();
        if ((activity instanceof VirtualQueueStackActivity) && !this.suppressClose) {
            ((VirtualQueueStackActivity) activity).showDismissNavigation();
        }
        PerformanceTracking performanceTracking = getPerformanceTracking();
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "this.requireView()");
        PerformanceTracking.logLoadTime$default(performanceTracking, performanceTrackingScreenName, viewRequireView, "", true, false, 16, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView;
        TextView textView;
        TextView textView2;
        LottieAnimationView lottieAnimationView;
        Button button;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        int postedSummonReturnWindowMinutes = 0;
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(VirtualQueueConstants.QUEUE_POSITION_PARAM);
            if (serializable != null) {
                Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse");
                this.positionsResponse = (GetPositionsResponse) serializable;
                VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
                String simpleName = VirtualQueueConfirmationFragment.class.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
                virtualQueueAnalytics.trackConfirmationLoad(simpleName, this.positionsResponse);
            }
            String string = arguments.getString("completionDeepLink", "");
            Intrinsics.checkNotNullExpressionValue(string, "data.getString(VirtualQu…TION_DEEP_LINK_PARAM, \"\")");
            this.completionDeepLink = string;
            this.isDeepLinkedFlow = !StringsKt.isBlank(string);
            this.suppressClose = arguments.getBoolean(VirtualQueueConstants.SUPPRESS_CLOSE_ON_CONFIRMATION, false);
            String string2 = arguments.getString(VirtualQueueConstants.CONTENT_ID, "");
            Intrinsics.checkNotNullExpressionValue(string2, "data.getString(VirtualQu…Constants.CONTENT_ID, \"\")");
            this.contentId = string2;
        }
        if (this.positionsResponse.getResponseStatus() != PositionsResponseStatus.OK || this.positionsResponse.getPositions().isEmpty()) {
            ArrayList arrayListM69268i = Lists.m69268i();
            Intrinsics.checkNotNullExpressionValue(arrayListM69268i, "newArrayList()");
            showMyQueues("", arrayListM69268i);
            return;
        }
        VqFragmentConfirmationBinding binding = getBinding();
        CharSequence text = null;
        Button button2 = binding != null ? binding.viewLines : null;
        if (button2 != null) {
            button2.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ConfirmationMainCta, this.contentId, false, 4, null));
        }
        VqFragmentConfirmationBinding binding2 = getBinding();
        if (binding2 != null && (button = binding2.viewLines) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.core.fragments.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    VirtualQueueConfirmationFragment.onViewCreated$lambda$2(this.f45242a, view2);
                }
            });
        }
        QueuesPositionsAdapter queuesPositionsAdapterCreate = getQueuesPositionsAdapterFactory().create(this, this, this, getVqThemer(), VQPageType.CONFIRMATION);
        queuesPositionsAdapterCreate.addDelegates();
        queuesPositionsAdapterCreate.showLoading();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(1);
        VqFragmentConfirmationBinding binding3 = getBinding();
        RecyclerView recyclerView2 = binding3 != null ? binding3.queueList : null;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        VqFragmentConfirmationBinding binding4 = getBinding();
        RecyclerView recyclerView3 = binding4 != null ? binding4.queueList : null;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(queuesPositionsAdapterCreate);
        }
        queuesPositionsAdapterCreate.setPositions(this.positionsResponse);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        setLoader(new LottieLoader(fragmentActivityRequireActivity, getVqThemer()));
        VqFragmentConfirmationBinding binding5 = getBinding();
        if (binding5 != null && (lottieAnimationView = binding5.fullLoaderAnimationView) != null) {
            getLoader().setLoaderAnimationUrl(lottieAnimationView);
        }
        VqFragmentConfirmationBinding binding6 = getBinding();
        LinearLayout linearLayout = binding6 != null ? binding6.fullLoaderContainer : null;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        VqFragmentConfirmationBinding binding7 = getBinding();
        TextView textView3 = binding7 != null ? binding7.whatsNext : null;
        if (textView3 != null) {
            textView3.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ConfirmationFooterTitle, this.contentId, false, 4, null));
        }
        VqFragmentConfirmationBinding binding8 = getBinding();
        TextView textView4 = binding8 != null ? binding8.bullet1Icon : null;
        if (textView4 != null) {
            textView4.setText(getVqThemer().getPeptasiaIcon(VQIconType.ConfirmationFooterBullet1Icon, this.contentId));
        }
        VqFragmentConfirmationBinding binding9 = getBinding();
        TextView textView5 = binding9 != null ? binding9.bullet2Icon : null;
        if (textView5 != null) {
            textView5.setText(getVqThemer().getPeptasiaIcon(VQIconType.ConfirmationFooterBullet2Icon, this.contentId));
        }
        VqFragmentConfirmationBinding binding10 = getBinding();
        TextView textView6 = binding10 != null ? binding10.bullet1 : null;
        if (textView6 != null) {
            textView6.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ConfirmationFooterBullet1, this.contentId, false, 4, null));
        }
        VqFragmentConfirmationBinding binding11 = getBinding();
        LinearLayout linearLayout2 = binding11 != null ? binding11.bullet1Container : null;
        if (linearLayout2 != null) {
            VqFragmentConfirmationBinding binding12 = getBinding();
            linearLayout2.setContentDescription((binding12 == null || (textView2 = binding12.bullet1) == null) ? null : textView2.getText());
        }
        if (!this.positionsResponse.getPositions().isEmpty()) {
            GetPositionsResponse getPositionsResponse = this.positionsResponse;
            Queue queueById = getPositionsResponse.getQueueById(getPositionsResponse.getPositions().get(0).getQueueId());
            if (queueById != null) {
                postedSummonReturnWindowMinutes = queueById.getPostedSummonReturnWindowMinutes();
            }
        }
        String returnTime = getReturnTime(postedSummonReturnWindowMinutes);
        VqFragmentConfirmationBinding binding13 = getBinding();
        TextView textView7 = binding13 != null ? binding13.bullet2 : null;
        if (textView7 != null) {
            textView7.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ConfirmationFooterBullet2, MapsKt.mapOf(TuplesKt.m92045to("returnTime", returnTime)), this.contentId, false, 8, null));
        }
        VqFragmentConfirmationBinding binding14 = getBinding();
        LinearLayout linearLayout3 = binding14 != null ? binding14.bullet2Container : null;
        if (linearLayout3 != null) {
            VqFragmentConfirmationBinding binding15 = getBinding();
            if (binding15 != null && (textView = binding15.bullet2) != null) {
                text = textView.getText();
            }
            linearLayout3.setContentDescription(text);
        }
        VqFragmentConfirmationBinding binding16 = getBinding();
        if (binding16 == null || (recyclerView = binding16.queueList) == null) {
            return;
        }
        PerformanceTracking.logLoadTime$default(getPerformanceTracking(), PerformanceTrackingScreenName.CONFIRMATION_SCREEN, recyclerView, "", false, false, 16, null);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void requestEnableBluetooth() {
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void requestEnableLocation() {
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void requestEnablePushNotifications() {
    }

    public final void setEventAttributes(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.eventAttributes = map;
    }

    public final void setLoader(LottieLoader lottieLoader) {
        Intrinsics.checkNotNullParameter(lottieLoader, "<set-?>");
        this.loader = lottieLoader;
    }

    public final void setParkAppConfiguration(C9314j c9314j) {
        Intrinsics.checkNotNullParameter(c9314j, "<set-?>");
        this.parkAppConfiguration = c9314j;
    }

    public final void setPerformanceTracking(PerformanceTracking performanceTracking) {
        Intrinsics.checkNotNullParameter(performanceTracking, "<set-?>");
        this.performanceTracking = performanceTracking;
    }

    public final void setQueuesPositionsAdapterFactory(QueuesPositionsAdapter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.queuesPositionsAdapterFactory = factory;
    }

    public final void setVirtualQueueAnalytics(VirtualQueueAnalytics virtualQueueAnalytics) {
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "<set-?>");
        this.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public final void setVirtualQueueManager(VirtualQueueManager virtualQueueManager) {
        Intrinsics.checkNotNullParameter(virtualQueueManager, "<set-?>");
        this.virtualQueueManager = virtualQueueManager;
    }

    public final void setVqAnalytics(VirtualQueueAnalytics virtualQueueAnalytics) {
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "<set-?>");
        this.vqAnalytics = virtualQueueAnalytics;
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void showDirections(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void showLeaveQueue(Position position) {
        Intrinsics.checkNotNullParameter(position, "position");
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        LeaveQueueFragment.Companion companion = LeaveQueueFragment.INSTANCE;
        ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), companion.newInstance(companion.createDataBundle(position)), new SnowballNextFlowAnimation(), false, false, false, 28, null);
        FragmentActivity activity = getActivity();
        if (activity instanceof VirtualQueueStackActivity) {
            ((VirtualQueueStackActivity) activity).hideDismissNavigation();
        }
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ConfirmationActions
    public void showMyQueues(String queueId, List<String> guestIds) {
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        Intrinsics.checkNotNullParameter(guestIds, "guestIds");
        if (StringsKt.isBlank(this.completionDeepLink)) {
            requireActivity().finish();
            return;
        }
        VqFragmentConfirmationBinding binding = getBinding();
        ScrollView scrollView = binding != null ? binding.confirmationScrollview : null;
        if (scrollView != null) {
            scrollView.setVisibility(8);
        }
        VqFragmentConfirmationBinding binding2 = getBinding();
        TextView textView = binding2 != null ? binding2.fullLoaderText : null;
        if (textView != null) {
            textView.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ConfirmationLoading, this.contentId, false, 4, null));
        }
        VqFragmentConfirmationBinding binding3 = getBinding();
        LinearLayout linearLayout = binding3 != null ? binding3.fullLoaderContainer : null;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        getActivityActions().navigateTo(new C8663c.b(this.completionDeepLink).m37293g().build());
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void showRedeem(Position position, List<LinkedGuest> guests, Queue queue) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(queue, "queue");
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void startJoinFlow(boolean fromMainButton) {
    }
}