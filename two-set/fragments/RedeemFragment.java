package com.disney.wdpro.virtualqueue.core.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C4952v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.support.widget.SnowballHeader;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.VirtualQueueDestinationProviderImpl;
import com.disney.wdpro.virtualqueue.core.VirtualQueueFoundationActivity;
import com.disney.wdpro.virtualqueue.core.VirtualQueueStackActivity;
import com.disney.wdpro.virtualqueue.core.interfaces.FragmentActions;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingAttribute;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingEventName;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingScreenName;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.core.manager.event.GetPositionsEvent;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentRedeemBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.CommonExtensionsKt;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegate;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegateKt;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.LottieLoader;
import com.disney.wdpro.virtualqueue.p462ui.redeem.BarcodeScrollListener;
import com.disney.wdpro.virtualqueue.p462ui.redeem.RedeemAdapter;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Position;
import com.disney.wdpro.virtualqueue.service.model.PositionsResponseStatus;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.service.model.QueueGuestIdMode;
import com.disney.wdpro.virtualqueue.themer.VQColorType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.google.common.collect.AbstractC22798t1;
import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C30069i0;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.InterfaceC30065h0;
import p498da.InterfaceC27132a;

@Metadata(m92037d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002abB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u001d\u0010I\u001a\u0004\u0018\u00010D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR.\u0010W\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020V0U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020]8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006c"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/RedeemFragment;", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueBaseFragment;", "Lda/a;", "Lkotlinx/coroutines/h0;", "<init>", "()V", "", "loadTickets", "Lcom/disney/wdpro/virtualqueue/core/manager/event/GetPositionsEvent;", "event", "onGetPositions", "(Lcom/disney/wdpro/virtualqueue/core/manager/event/GetPositionsEvent;)V", "showTickets", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "onResume", "", "onBackPressed", "()Z", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "virtualQueueManager", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "getVirtualQueueManager", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "setVirtualQueueManager", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "getVirtualQueueAnalytics", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "setVirtualQueueAnalytics", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "performanceTracking", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "getPerformanceTracking", "()Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "setPerformanceTracking", "(Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;)V", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProviderImpl;", "virtualQueueDestinationProvider", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProviderImpl;", "getVirtualQueueDestinationProvider", "()Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProviderImpl;", "setVirtualQueueDestinationProvider", "(Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProviderImpl;)V", "Lcom/disney/wdpro/virtualqueue/ui/redeem/RedeemAdapter$Factory;", "redeemAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/redeem/RedeemAdapter$Factory;", "getRedeemAdapterFactory", "()Lcom/disney/wdpro/virtualqueue/ui/redeem/RedeemAdapter$Factory;", "setRedeemAdapterFactory", "(Lcom/disney/wdpro/virtualqueue/ui/redeem/RedeemAdapter$Factory;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/LottieLoader;", "loader", "Lcom/disney/wdpro/virtualqueue/ui/common/LottieLoader;", "Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentRedeemBinding;", "binding$delegate", "Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentRedeemBinding;", "binding", "Lcom/disney/wdpro/virtualqueue/core/fragments/RedeemFragment$RedeemGuests;", "redeemGuests", "Lcom/disney/wdpro/virtualqueue/core/fragments/RedeemFragment$RedeemGuests;", "", VirtualQueueConstants.POSITION_ID_HASH_PARAM, "Ljava/lang/String;", "ticketLoaded", "Z", "Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeScrollListener;", "barcodeScrollListener", "Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeScrollListener;", "", "", "eventAttributes", "Ljava/util/Map;", "getEventAttributes", "()Ljava/util/Map;", "setEventAttributes", "(Ljava/util/Map;)V", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Companion", "RedeemGuests", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nRedeemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedeemFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/RedeemFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,325:1\n1#2:326\n1549#3:327\n1620#3,3:328\n766#3:331\n857#3,2:332\n*S KotlinDebug\n*F\n+ 1 RedeemFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/RedeemFragment\n*L\n172#1:327\n172#1:328,3\n184#1:331\n184#1:332,2\n*E\n"})
/* loaded from: classes20.dex */
public final class RedeemFragment extends VirtualQueueBaseFragment implements InterfaceC27132a, InterfaceC30065h0 {
    private BarcodeScrollListener barcodeScrollListener;
    private Map<String, Object> eventAttributes;
    private LottieLoader loader;

    @Inject
    public PerformanceTracking performanceTracking;
    private String positionIdHash;

    @Inject
    public RedeemAdapter.Factory redeemAdapterFactory;
    private RedeemGuests redeemGuests;
    private boolean ticketLoaded;

    @Inject
    public VirtualQueueAnalytics virtualQueueAnalytics;

    @Inject
    public VirtualQueueDestinationProviderImpl virtualQueueDestinationProvider;

    @Inject
    public VirtualQueueManager virtualQueueManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RedeemFragment.class, "binding", "getBinding()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentRedeemBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ InterfaceC30065h0 $$delegate_0 = C30069i0.m92781b();

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding = FragmentViewBindingDelegateKt.viewBinding(this, RedeemFragment$binding$2.INSTANCE);

    @Metadata(m92037d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/RedeemFragment$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "data", "Lcom/disney/wdpro/virtualqueue/core/fragments/RedeemFragment;", "newInstance", "(Landroid/os/Bundle;)Lcom/disney/wdpro/virtualqueue/core/fragments/RedeemFragment;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "position", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "guests", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/aligator/f;", "navigationEntry", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/service/model/Position;Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;)Lcom/disney/wdpro/aligator/f;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C8666f navigationEntry(Context context, Position position, List<LinkedGuest> guests, Queue queue) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(guests, "guests");
            Intrinsics.checkNotNullParameter(queue, "queue");
            Intent intentCreateIntent = VirtualQueueStackActivity.INSTANCE.createIntent(context);
            intentCreateIntent.putExtra(VirtualQueueConstants.FLOW_PARAM, 20003);
            intentCreateIntent.putExtra("party_guests", new RedeemGuests(guests, position, queue));
            C8666f c8666fBuild = new C8666f.b(intentCreateIntent).m37363q(100).withLoginCheck().build();
            Intrinsics.checkNotNullExpressionValue(c8666fBuild, "Builder(intent).withRequ….withLoginCheck().build()");
            return c8666fBuild;
        }

        public final RedeemFragment newInstance(Bundle data) {
            RedeemFragment redeemFragment = new RedeemFragment();
            redeemFragment.setArguments(data);
            return redeemFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B%\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\nj\b\u0012\u0004\u0012\u00020\u0004`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/RedeemFragment$RedeemGuests;", "Ljava/io/Serializable;", "guests", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "position", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "(Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Position;Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getGuests", "()Ljava/util/ArrayList;", "setGuests", "(Ljava/util/ArrayList;)V", "getPosition", "()Lcom/disney/wdpro/virtualqueue/service/model/Position;", "setPosition", "(Lcom/disney/wdpro/virtualqueue/service/model/Position;)V", "getQueue", "()Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "setQueue", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    private static final class RedeemGuests implements Serializable {
        private ArrayList<LinkedGuest> guests;
        private Position position;
        private Queue queue;

        public RedeemGuests(List<LinkedGuest> guests, Position position, Queue queue) {
            Intrinsics.checkNotNullParameter(guests, "guests");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(queue, "queue");
            this.position = position;
            this.queue = queue;
            ArrayList<LinkedGuest> arrayListM69269j = Lists.m69269j(AbstractC22798t1.m69693q(guests).m69710x(LinkedGuestUtils.INSTANCE.getSortComparator()));
            Intrinsics.checkNotNullExpressionValue(arrayListM69269j, "newArrayList(FluentItera…ils.getSortComparator()))");
            this.guests = arrayListM69269j;
        }

        public final ArrayList<LinkedGuest> getGuests() {
            return this.guests;
        }

        public final Position getPosition() {
            return this.position;
        }

        public final Queue getQueue() {
            return this.queue;
        }

        public final void setGuests(ArrayList<LinkedGuest> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
            this.guests = arrayList;
        }

        public final void setPosition(Position position) {
            Intrinsics.checkNotNullParameter(position, "<set-?>");
            this.position = position;
        }

        public final void setQueue(Queue queue) {
            Intrinsics.checkNotNullParameter(queue, "<set-?>");
            this.queue = queue;
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.RedeemFragment$loadTickets$1", m92053f = "RedeemFragment.kt", m92054i = {}, m92055l = {152}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.RedeemFragment$loadTickets$1 */
    static final class C215781 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C215781(Continuation<? super C215781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RedeemFragment.this.new C215781(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IllegalStateException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                VirtualQueueManager virtualQueueManager = RedeemFragment.this.getVirtualQueueManager();
                this.label = 1;
                obj = virtualQueueManager.getPositions(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RedeemFragment.this.onGetPositions((GetPositionsEvent) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215781) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public RedeemFragment() {
        LinkedList linkedListM69272m = Lists.m69272m();
        Intrinsics.checkNotNullExpressionValue(linkedListM69272m, "newLinkedList()");
        this.redeemGuests = new RedeemGuests(linkedListM69272m, new Position(null, null, 0, 0, 0L, false, null, null, false, false, null, 0, 0, null, 0, null, null, null, false, 524287, null), new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null));
        this.positionIdHash = "";
        this.eventAttributes = new LinkedHashMap();
    }

    private final VqFragmentRedeemBinding getBinding() {
        return (VqFragmentRedeemBinding) this.binding.getValue2((Fragment) this, $$delegatedProperties[0]);
    }

    private final void loadTickets() {
        VqFragmentRedeemBinding binding = getBinding();
        LinearLayout linearLayout = binding != null ? binding.fullLoaderContainer : null;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        C30113j.m92948d(this, null, null, new C215781(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ResourceType"})
    public final void onGetPositions(GetPositionsEvent event) throws IllegalStateException {
        TextView textView;
        TextView textView2;
        LinearLayout linearLayout;
        Object next;
        Position position;
        Object next2;
        if (this.ticketLoaded) {
            return;
        }
        VqFragmentRedeemBinding binding = getBinding();
        LinearLayout linearLayout2 = binding != null ? binding.fullLoaderContainer : null;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        GetPositionsResponse payload = event.getPayload();
        if (event.isSuccess() && payload != null && payload.getResponseStatus() == PositionsResponseStatus.OK) {
            VirtualQueueThemer vqThemer = getVqThemer();
            List<Queue> queues = payload.getQueues();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(queues, 10));
            Iterator<T> it = queues.iterator();
            while (it.hasNext()) {
                arrayList.add(((Queue) it.next()).getContentId());
            }
            vqThemer.refreshDocuments(arrayList);
            if (StringsKt.isBlank(this.positionIdHash)) {
                Iterator<T> it2 = payload.getPositions().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((Position) next).getIsSummoned()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                position = (Position) next;
            } else {
                Iterator<T> it3 = payload.getPositions().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    Position position2 = (Position) next2;
                    if (Intrinsics.areEqual(position2.getPositionIdHash(), this.positionIdHash) && position2.getIsSummoned()) {
                        break;
                    }
                }
                position = (Position) next2;
            }
            if (position != null) {
                List<LinkedGuest> guests = payload.getGuests();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : guests) {
                    if (position.getGuestIds().contains(((LinkedGuest) obj).getGuestId())) {
                        arrayList2.add(obj);
                    }
                }
                Queue queueById = payload.getQueueById(position.getQueueId());
                if (queueById == null) {
                    queueById = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
                }
                this.redeemGuests = new RedeemGuests(arrayList2, position, queueById);
                showTickets();
                return;
            }
        }
        int[] iArr = {Color.parseColor(getString(C21487R.color.vq_onboarding_light_blue)), Color.parseColor(getString(C21487R.color.vq_onboarding_dark_blue))};
        VqFragmentRedeemBinding binding2 = getBinding();
        if (binding2 != null && (linearLayout = binding2.errorContainer) != null) {
            CommonExtensionsKt.setGradientBackground(linearLayout, iArr);
        }
        VqFragmentRedeemBinding binding3 = getBinding();
        LinearLayout linearLayout3 = binding3 != null ? binding3.errorContainer : null;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
        VqFragmentRedeemBinding binding4 = getBinding();
        TextView textView3 = binding4 != null ? binding4.errorTitle : null;
        if (textView3 != null) {
            textView3.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.RedeemLoadingErrorTitle, null, false, 6, null));
        }
        VqFragmentRedeemBinding binding5 = getBinding();
        if (binding5 != null && (textView2 = binding5.errorTitle) != null) {
            textView2.setTextColor(VirtualQueueThemer.getColor$default(getVqThemer(), VQColorType.RedeemBgTextColor, null, 2, null));
        }
        VqFragmentRedeemBinding binding6 = getBinding();
        TextView textView4 = binding6 != null ? binding6.errorDetail : null;
        if (textView4 != null) {
            textView4.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.RedeemLoadingErrorDetail, null, false, 6, null));
        }
        VqFragmentRedeemBinding binding7 = getBinding();
        if (binding7 == null || (textView = binding7.errorDetail) == null) {
            return;
        }
        textView.setTextColor(VirtualQueueThemer.getColor$default(getVqThemer(), VQColorType.RedeemBgTextColor, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(RedeemFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BarcodeScrollListener barcodeScrollListener = this$0.barcodeScrollListener;
        this$0.getVirtualQueueAnalytics().trackRedeemDone((barcodeScrollListener != null ? barcodeScrollListener.getLastPosition() : 0) + 1, this$0.redeemGuests.getGuests().size(), this$0.redeemGuests.getQueue());
        this$0.onBackPressed();
    }

    private final void showTickets() throws IllegalStateException {
        ScrollView scrollView;
        TextView textView;
        RecyclerView recyclerView;
        TextView textView2;
        VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
        String simpleName = RedeemFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        virtualQueueAnalytics.trackRedeemLoad(simpleName, this.redeemGuests.getPosition(), this.redeemGuests.getQueue(), this.redeemGuests.getGuests());
        this.ticketLoaded = true;
        VqFragmentRedeemBinding binding = getBinding();
        BarcodeScrollListener barcodeScrollListener = null;
        LinearLayout linearLayout = binding != null ? binding.fullLoaderContainer : null;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        VqFragmentRedeemBinding binding2 = getBinding();
        ScrollView scrollView2 = binding2 != null ? binding2.scroller : null;
        if (scrollView2 != null) {
            scrollView2.setVisibility(0);
        }
        RedeemAdapter.Factory redeemAdapterFactory = getRedeemAdapterFactory();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        RedeemAdapter redeemAdapterCreate = redeemAdapterFactory.create(contextRequireContext, getVqThemer(), getVirtualQueueDestinationProvider());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(0);
        VqFragmentRedeemBinding binding3 = getBinding();
        RecyclerView recyclerView2 = binding3 != null ? binding3.ticketRecycler : null;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        VqFragmentRedeemBinding binding4 = getBinding();
        RecyclerView recyclerView3 = binding4 != null ? binding4.ticketRecycler : null;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(redeemAdapterCreate);
        }
        redeemAdapterCreate.setGuests(this.redeemGuests.getGuests(), this.redeemGuests.getPosition(), this.redeemGuests.getQueue());
        C4952v c4952v = new C4952v();
        VqFragmentRedeemBinding binding5 = getBinding();
        c4952v.attachToRecyclerView(binding5 != null ? binding5.ticketRecycler : null);
        VqFragmentRedeemBinding binding6 = getBinding();
        TextView textView3 = binding6 != null ? binding6.ticketCountIndicator : null;
        if (textView3 != null) {
            textView3.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.RedeemTicketIndicator, MapsKt.mapOf(TuplesKt.m92045to("current", "1"), TuplesKt.m92045to("total", String.valueOf(this.redeemGuests.getGuests().size()))), null, false, 12, null));
        }
        VqFragmentRedeemBinding binding7 = getBinding();
        TextView textView4 = binding7 != null ? binding7.ticketCountIndicator : null;
        if (textView4 != null) {
            textView4.setVisibility(this.redeemGuests.getQueue().getGuestIdMode() == QueueGuestIdMode.IDENTIFIED ? 0 : 8);
        }
        VqFragmentRedeemBinding binding8 = getBinding();
        if (binding8 != null && (textView2 = binding8.ticketCountIndicator) != null) {
            textView2.setTextColor(getVqThemer().getColor(VQColorType.RedeemBgTextColor, this.redeemGuests.getQueue().getContentId()));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getVqThemer().getColor(VQColorType.RedeemBgStartColor, this.redeemGuests.getQueue().getContentId()), getVqThemer().getColor(VQColorType.RedeemBgEndColor, this.redeemGuests.getQueue().getContentId())});
        gradientDrawable.setCornerRadius(0.0f);
        VqFragmentRedeemBinding binding9 = getBinding();
        ConstraintLayout constraintLayout = binding9 != null ? binding9.redeemContainer : null;
        if (constraintLayout != null) {
            constraintLayout.setBackground(gradientDrawable);
        }
        VqFragmentRedeemBinding binding10 = getBinding();
        if (binding10 != null && (textView = binding10.ticketCountIndicator) != null) {
            BarcodeScrollListener barcodeScrollListener2 = new BarcodeScrollListener(getVirtualQueueAnalytics(), getVqThemer(), this.redeemGuests.getQueue(), this.redeemGuests.getPosition(), this.redeemGuests.getGuests(), c4952v, textView, this.redeemGuests.getGuests().size());
            VqFragmentRedeemBinding binding11 = getBinding();
            if (binding11 != null && (recyclerView = binding11.ticketRecycler) != null) {
                recyclerView.addOnScrollListener(barcodeScrollListener2);
            }
            barcodeScrollListener = barcodeScrollListener2;
        }
        this.barcodeScrollListener = barcodeScrollListener;
        final Ref.IntRef intRef = new Ref.IntRef();
        final Ref.IntRef intRef2 = new Ref.IntRef();
        VqFragmentRedeemBinding binding12 = getBinding();
        if (binding12 == null || (scrollView = binding12.scroller) == null) {
            return;
        }
        scrollView.setOnTouchListener(new View.OnTouchListener() { // from class: com.disney.wdpro.virtualqueue.core.fragments.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return RedeemFragment.showTickets$lambda$9(intRef, intRef2, this, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showTickets$lambda$9(Ref.IntRef firstTouchX, Ref.IntRef positionItemRV, RedeemFragment this$0, View view, MotionEvent motionEvent) {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(firstTouchX, "$firstTouchX");
        Intrinsics.checkNotNullParameter(positionItemRV, "$positionItemRV");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int action = motionEvent.getAction();
        if (action == 0) {
            firstTouchX.element = (int) motionEvent.getX();
        } else if (action == 1) {
            if (firstTouchX.element < motionEvent.getX()) {
                int i10 = positionItemRV.element;
                if (i10 - 1 >= 0) {
                    positionItemRV.element = i10 - 1;
                }
            } else {
                int i11 = positionItemRV.element + 1;
                VqFragmentRedeemBinding binding = this$0.getBinding();
                if (i11 < ((binding == null || (recyclerView = binding.ticketRecycler) == null || (adapter = recyclerView.getAdapter()) == null) ? 0 : adapter.getSize())) {
                    positionItemRV.element++;
                }
            }
            VqFragmentRedeemBinding binding2 = this$0.getBinding();
            if (binding2 != null && (recyclerView2 = binding2.ticketRecycler) != null) {
                recyclerView2.smoothScrollToPosition(positionItemRV.element);
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC30065h0
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public final Map<String, Object> getEventAttributes() {
        return this.eventAttributes;
    }

    public final PerformanceTracking getPerformanceTracking() {
        PerformanceTracking performanceTracking = this.performanceTracking;
        if (performanceTracking != null) {
            return performanceTracking;
        }
        Intrinsics.throwUninitializedPropertyAccessException("performanceTracking");
        return null;
    }

    public final RedeemAdapter.Factory getRedeemAdapterFactory() {
        RedeemAdapter.Factory factory = this.redeemAdapterFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("redeemAdapterFactory");
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

    public final VirtualQueueDestinationProviderImpl getVirtualQueueDestinationProvider() {
        VirtualQueueDestinationProviderImpl virtualQueueDestinationProviderImpl = this.virtualQueueDestinationProvider;
        if (virtualQueueDestinationProviderImpl != null) {
            return virtualQueueDestinationProviderImpl;
        }
        Intrinsics.throwUninitializedPropertyAccessException("virtualQueueDestinationProvider");
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

    @Override // p498da.InterfaceC27132a
    public boolean onBackPressed() {
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        VirtualQueueFoundationActivity.Companion companion = VirtualQueueFoundationActivity.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        Intent intentCreateIntent = companion.createIntent(fragmentActivityRequireActivity);
        intentCreateIntent.putExtra(VirtualQueueConstants.FLOW_PARAM, 20002);
        intentCreateIntent.putExtra("queueId", this.redeemGuests.getPosition().getQueueId());
        intentCreateIntent.putExtra("guest_ids", Lists.m69269j(this.redeemGuests.getPosition().getGuestIds()));
        requireActivity().setResult(-1, intentCreateIntent);
        requireActivity().finish();
        return true;
    }

    @Override // com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C21487R.layout.vq_fragment_redeem, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C30069i0.m92784e(this, null, 1, null);
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        PerformanceTracking performanceTracking = getPerformanceTracking();
        PerformanceTrackingScreenName performanceTrackingScreenName = PerformanceTrackingScreenName.REDEEM_SCREEN;
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView()");
        FragmentActions.DefaultImpls.pageLoadTimeTracking$default(this, performanceTracking, performanceTrackingScreenName, viewRequireView, true, false, 16, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws IllegalStateException {
        Button button;
        Serializable serializable;
        LottieAnimationView lottieAnimationView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        this.loader = new LottieLoader(fragmentActivityRequireActivity, getVqThemer());
        VqFragmentRedeemBinding binding = getBinding();
        if (binding != null && (lottieAnimationView = binding.fullLoaderAnimationView) != null) {
            LottieLoader lottieLoader = this.loader;
            if (lottieLoader == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loader");
                lottieLoader = null;
            }
            lottieLoader.setLoaderAnimationUrl(lottieAnimationView);
        }
        VqFragmentRedeemBinding binding2 = getBinding();
        TextView textView = binding2 != null ? binding2.fullLoaderText : null;
        if (textView != null) {
            textView.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.RedeemLoading, null, false, 6, null));
        }
        Object systemService = requireContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.setClassName(RedeemFragment.class.getName());
            accessibilityEventObtain.setPackageName(requireContext().getPackageName());
            accessibilityEventObtain.getText().add(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.RedeemOverviewAccessibility, null, false, 6, null));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
        Bundle arguments = getArguments();
        if (arguments != null && (serializable = arguments.getSerializable("party_guests")) != null) {
            this.redeemGuests = (RedeemGuests) serializable;
            showTickets();
        }
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString(VirtualQueueConstants.POSITION_ID_HASH_PARAM) : null;
        if (string == null) {
            string = "";
        }
        this.positionIdHash = string;
        SnowballHeader header = getActivityActions().getHeader();
        if (header != null) {
            header.hide();
        }
        if (!this.ticketLoaded) {
            loadTickets();
        }
        VqFragmentRedeemBinding binding3 = getBinding();
        if (binding3 != null && (button = binding3.doneButton) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.core.fragments.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RedeemFragment.onViewCreated$lambda$2(this.f45234a, view2);
                }
            });
        }
        VqFragmentRedeemBinding binding4 = getBinding();
        Button button2 = binding4 != null ? binding4.doneButton : null;
        if (button2 != null) {
            button2.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.RedeemMainCta, null, false, 6, null));
        }
        this.eventAttributes.put(PerformanceTrackingAttribute.LOAD_TIME_SCREEN_NAME.getAttrName(), PerformanceTrackingScreenName.REDEEM_SCREEN.getScreenName());
        getPerformanceTracking().logTimedActionStart(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
    }

    public final void setEventAttributes(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.eventAttributes = map;
    }

    public final void setPerformanceTracking(PerformanceTracking performanceTracking) {
        Intrinsics.checkNotNullParameter(performanceTracking, "<set-?>");
        this.performanceTracking = performanceTracking;
    }

    public final void setRedeemAdapterFactory(RedeemAdapter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.redeemAdapterFactory = factory;
    }

    public final void setVirtualQueueAnalytics(VirtualQueueAnalytics virtualQueueAnalytics) {
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "<set-?>");
        this.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public final void setVirtualQueueDestinationProvider(VirtualQueueDestinationProviderImpl virtualQueueDestinationProviderImpl) {
        Intrinsics.checkNotNullParameter(virtualQueueDestinationProviderImpl, "<set-?>");
        this.virtualQueueDestinationProvider = virtualQueueDestinationProviderImpl;
    }

    public final void setVirtualQueueManager(VirtualQueueManager virtualQueueManager) {
        Intrinsics.checkNotNullParameter(virtualQueueManager, "<set-?>");
        this.virtualQueueManager = virtualQueueManager;
    }
}