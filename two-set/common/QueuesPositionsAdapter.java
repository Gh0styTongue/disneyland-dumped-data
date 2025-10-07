package com.disney.wdpro.virtualqueue.p462ui.common;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.view.ViewGroup;
import androidx.collection.C1176t0;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.commons.permissions.C9348a;
import com.disney.wdpro.commons.permissions.Permissions;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.interfaces.FragmentActions;
import com.disney.wdpro.virtualqueue.core.interfaces.PositionActions;
import com.disney.wdpro.virtualqueue.p462ui.common.LoadingAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.VirtualQueueSecretTapAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.BluetoothRequestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.EmptyListAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.LocationRequestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PositionAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PushAlertAdapter;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.Position;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import in.C28904a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001_B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001fH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0017¢\u0006\u0004\b0\u0010\u0019J\u000f\u00101\u001a\u00020\u0013H\u0007¢\u0006\u0004\b1\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00107R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00108R \u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0014X\u0094\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020!0?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010<R \u0010C\u001a\b\u0012\u0004\u0012\u00020B0A8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010N\u001a\u00020M8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020R8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010X\u001a\u00020W8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006`"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "actions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/FragmentActions;", "fragmentActions", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", VirtualQueueConstants.VQ_PAGE_TYPE, "Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$Factory;", "secretTapAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$Factory;", "positionAdapterFactory", "<init>", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;Lcom/disney/wdpro/virtualqueue/core/interfaces/FragmentActions;Landroidx/fragment/app/Fragment;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$Factory;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$Factory;)V", "", "isBluetoothEnabled", "()Z", "isLocationEnabled", "", "addDelegates", "()V", "showLoading", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "response", "setPositions", "(Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;)V", "", "position", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewItem;", "getItem", "(I)Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewItem;", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "holder", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "dataChanged", "arePushNotificationsEnabled", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/FragmentActions;", "Landroidx/fragment/app/Fragment;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", "Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$Factory;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$Factory;", "", "Lcom/disney/wdpro/commons/adapter/g;", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "", "positions", "Landroidx/collection/t0;", "", "delegateAdapters", "Landroidx/collection/t0;", "getDelegateAdapters", "()Landroidx/collection/t0;", "Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingViewType;", "loadingViewItem", "Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingViewType;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/EmptyListAdapter$EmptyListViewType;", "emptyListViewItem", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/EmptyListAdapter$EmptyListViewType;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PushAlertAdapter$PushAlertViewItem;", "pushAlertViewItem", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PushAlertAdapter$PushAlertViewItem;", "getPushAlertViewItem", "()Lcom/disney/wdpro/virtualqueue/ui/my_queues/PushAlertAdapter$PushAlertViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/BluetoothRequestAdapter$BluetoothRequestViewItem;", "bluetoothRequestViewItem", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/BluetoothRequestAdapter$BluetoothRequestViewItem;", "getBluetoothRequestViewItem", "()Lcom/disney/wdpro/virtualqueue/ui/my_queues/BluetoothRequestAdapter$BluetoothRequestViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/LocationRequestAdapter$LocationRequestViewItem;", "locationRequestViewItem", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/LocationRequestAdapter$LocationRequestViewItem;", "getLocationRequestViewItem", "()Lcom/disney/wdpro/virtualqueue/ui/my_queues/LocationRequestAdapter$LocationRequestViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$VirtualQueueSecretTapViewItem;", "virtualQueueSecretTapViewItem", "Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$VirtualQueueSecretTapViewItem;", "Factory", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nQueuesPositionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueuesPositionsAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1549#2:170\n1620#2,3:171\n*S KotlinDebug\n*F\n+ 1 QueuesPositionsAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter\n*L\n100#1:170\n100#1:171,3\n*E\n"})
/* loaded from: classes20.dex */
public class QueuesPositionsAdapter extends RecyclerView.Adapter<AnimateRecyclerViewHolder> {
    public static final int $stable = 8;
    private final PositionActions actions;
    private final BluetoothRequestAdapter.BluetoothRequestViewItem bluetoothRequestViewItem;
    private final C1176t0<Object> delegateAdapters;
    private final EmptyListAdapter.EmptyListViewType emptyListViewItem;
    private final Fragment fragment;
    private final FragmentActions fragmentActions;
    private final List<InterfaceC9233g> items;
    private final LoadingAdapter.LoadingViewType loadingViewItem;
    private final LocationRequestAdapter.LocationRequestViewItem locationRequestViewItem;
    private final PositionAdapter.Factory positionAdapterFactory;
    private List<PositionAdapter.PositionViewItem> positions;
    private final PushAlertAdapter.PushAlertViewItem pushAlertViewItem;
    private final VirtualQueueSecretTapAdapter.Factory secretTapAdapterFactory;
    private final VirtualQueueSecretTapAdapter.VirtualQueueSecretTapViewItem virtualQueueSecretTapViewItem;
    private final VQPageType vqPageType;
    private final VirtualQueueThemer vqThemer;

    @Metadata(m92037d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;", "", "secretTapAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$Factory;", "positionAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$Factory;", "(Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$Factory;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$Factory;)V", "create", "Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter;", "actions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "fragmentActions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/FragmentActions;", "fragment", "Landroidx/fragment/app/Fragment;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", VirtualQueueConstants.VQ_PAGE_TYPE, "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Factory {
        public static final int $stable = 8;
        private final PositionAdapter.Factory positionAdapterFactory;
        private final VirtualQueueSecretTapAdapter.Factory secretTapAdapterFactory;

        @Inject
        public Factory(VirtualQueueSecretTapAdapter.Factory secretTapAdapterFactory, PositionAdapter.Factory positionAdapterFactory) {
            Intrinsics.checkNotNullParameter(secretTapAdapterFactory, "secretTapAdapterFactory");
            Intrinsics.checkNotNullParameter(positionAdapterFactory, "positionAdapterFactory");
            this.secretTapAdapterFactory = secretTapAdapterFactory;
            this.positionAdapterFactory = positionAdapterFactory;
        }

        public final QueuesPositionsAdapter create(PositionActions actions, FragmentActions fragmentActions, Fragment fragment, VirtualQueueThemer vqThemer, VQPageType vqPageType) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(fragmentActions, "fragmentActions");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            Intrinsics.checkNotNullParameter(vqPageType, "vqPageType");
            return new QueuesPositionsAdapter(actions, fragmentActions, fragment, vqThemer, vqPageType, this.secretTapAdapterFactory, this.positionAdapterFactory);
        }
    }

    public QueuesPositionsAdapter(PositionActions actions, FragmentActions fragmentActions, Fragment fragment, VirtualQueueThemer vqThemer, VQPageType vqPageType, VirtualQueueSecretTapAdapter.Factory secretTapAdapterFactory, PositionAdapter.Factory positionAdapterFactory) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(fragmentActions, "fragmentActions");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(vqPageType, "vqPageType");
        Intrinsics.checkNotNullParameter(secretTapAdapterFactory, "secretTapAdapterFactory");
        Intrinsics.checkNotNullParameter(positionAdapterFactory, "positionAdapterFactory");
        this.actions = actions;
        this.fragmentActions = fragmentActions;
        this.fragment = fragment;
        this.vqThemer = vqThemer;
        this.vqPageType = vqPageType;
        this.secretTapAdapterFactory = secretTapAdapterFactory;
        this.positionAdapterFactory = positionAdapterFactory;
        this.items = new ArrayList();
        this.positions = CollectionsKt.emptyList();
        this.delegateAdapters = new C1176t0<>(0, 1, null);
        this.loadingViewItem = new LoadingAdapter.LoadingViewType(null, 1, 0 == true ? 1 : 0);
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "fragment.requireContext()");
        this.emptyListViewItem = new EmptyListAdapter.EmptyListViewType(contextRequireContext, vqPageType == VQPageType.MYQUEUES);
        this.pushAlertViewItem = new PushAlertAdapter.PushAlertViewItem(vqPageType);
        this.bluetoothRequestViewItem = new BluetoothRequestAdapter.BluetoothRequestViewItem();
        this.locationRequestViewItem = new LocationRequestAdapter.LocationRequestViewItem();
        this.virtualQueueSecretTapViewItem = new VirtualQueueSecretTapAdapter.VirtualQueueSecretTapViewItem();
    }

    private final boolean isBluetoothEnabled() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    private final boolean isLocationEnabled() {
        Context contextRequireContext = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "fragment.requireContext()");
        return C9348a.m39052e(contextRequireContext, Permissions.LOCATION);
    }

    public void addDelegates() {
        C1176t0<Object> delegateAdapters = getDelegateAdapters();
        int i10 = this.loadingViewItem.getViewType();
        LoadingAdapter.LoadingStyleUI loadingStyleUI = LoadingAdapter.LoadingStyleUI.MY_QUEUE_LOADING;
        Context contextRequireContext = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "fragment.requireContext()");
        delegateAdapters.m5321k(i10, new LoadingAdapter(loadingStyleUI, contextRequireContext, this.vqThemer));
        C1176t0<Object> delegateAdapters2 = getDelegateAdapters();
        int i11 = this.emptyListViewItem.getViewType();
        PositionActions positionActions = this.actions;
        Context contextRequireContext2 = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "fragment.requireContext()");
        delegateAdapters2.m5321k(i11, new EmptyListAdapter(positionActions, contextRequireContext2, this.vqThemer));
        C1176t0<Object> delegateAdapters3 = getDelegateAdapters();
        int i12 = getPushAlertViewItem().getViewType();
        PositionActions positionActions2 = this.actions;
        Context contextRequireContext3 = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "fragment.requireContext()");
        delegateAdapters3.m5321k(i12, new PushAlertAdapter(positionActions2, contextRequireContext3, this.vqThemer));
        getDelegateAdapters().m5321k(getBluetoothRequestViewItem().getViewType(), new BluetoothRequestAdapter(this.actions, this.vqThemer));
        getDelegateAdapters().m5321k(getLocationRequestViewItem().getViewType(), new LocationRequestAdapter(this.actions, this.vqThemer));
        getDelegateAdapters().m5321k(this.virtualQueueSecretTapViewItem.getViewType(), this.secretTapAdapterFactory.create(this.fragment));
        C1176t0<Object> delegateAdapters4 = getDelegateAdapters();
        PositionAdapter.Factory factory = this.positionAdapterFactory;
        PositionActions positionActions3 = this.actions;
        FragmentActions fragmentActions = this.fragmentActions;
        Context contextRequireContext4 = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "fragment.requireContext()");
        delegateAdapters4.m5321k(11000, factory.create(positionActions3, fragmentActions, contextRequireContext4, this.vqPageType));
    }

    public final boolean arePushNotificationsEnabled() {
        return C28904a.m89366a(this.fragment.requireContext());
    }

    public final void dataChanged() {
        notifyDataSetChanged();
    }

    protected BluetoothRequestAdapter.BluetoothRequestViewItem getBluetoothRequestViewItem() {
        return this.bluetoothRequestViewItem;
    }

    protected C1176t0<Object> getDelegateAdapters() {
        return this.delegateAdapters;
    }

    public PositionAdapter.PositionViewItem getItem(int position) {
        if (position < this.positions.size()) {
            return this.positions.get(position);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return getItems().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItems().get(position).getViewType();
    }

    protected List<InterfaceC9233g> getItems() {
        return this.items;
    }

    protected LocationRequestAdapter.LocationRequestViewItem getLocationRequestViewItem() {
        return this.locationRequestViewItem;
    }

    protected PushAlertAdapter.PushAlertViewItem getPushAlertViewItem() {
        return this.pushAlertViewItem;
    }

    public final void setPositions(GetPositionsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.positions = CollectionsKt.emptyList();
        getItems().clear();
        if (!arePushNotificationsEnabled()) {
            getItems().add(getPushAlertViewItem());
        }
        if (response.getPositions().isEmpty()) {
            if (response.getQueues().isEmpty()) {
                this.emptyListViewItem.setEnableButton(false);
            }
            getItems().add(this.emptyListViewItem);
            dataChanged();
        }
        List listSortedWith = CollectionsKt.sortedWith(response.getPositions(), Position.INSTANCE.getSortComparator());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            arrayList.add(new PositionAdapter.PositionViewItem((Position) it.next(), response));
        }
        this.positions = arrayList;
        PositionAdapter.PositionViewItem positionViewItem = (PositionAdapter.PositionViewItem) CollectionsKt.lastOrNull((List) arrayList);
        if (positionViewItem != null) {
            positionViewItem.setLast(true);
        }
        getItems().addAll(this.positions);
        if (this.vqPageType == VQPageType.MYQUEUES && response.getShowCastAssistanceCode()) {
            getItems().add(this.virtualQueueSecretTapViewItem);
        }
        dataChanged();
    }

    public final void showLoading() {
        getItems().clear();
        getItems().add(this.loadingViewItem);
        dataChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(AnimateRecyclerViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        InterfaceC9233g interfaceC9233g = getItems().get(position);
        Object objM5316e = getDelegateAdapters().m5316e(interfaceC9233g.getViewType());
        Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.commons.adapter.DelegateAdapter<com.disney.wdpro.virtualqueue.ui.common.AnimateRecyclerViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
        ((InterfaceC9229c) objM5316e).onBindViewHolder(holder, interfaceC9233g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public AnimateRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Object objM5316e = getDelegateAdapters().m5316e(viewType);
        Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.commons.adapter.DelegateAdapter<com.disney.wdpro.virtualqueue.ui.common.AnimateRecyclerViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
        RecyclerView.AbstractC4902e0 abstractC4902e0OnCreateViewHolder = ((InterfaceC9229c) objM5316e).onCreateViewHolder(parent);
        Intrinsics.checkNotNullExpressionValue(abstractC4902e0OnCreateViewHolder, "adapter.onCreateViewHolder(parent)");
        return (AnimateRecyclerViewHolder) abstractC4902e0OnCreateViewHolder;
    }
}