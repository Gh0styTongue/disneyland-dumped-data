package com.disney.wdpro.virtualqueue.p462ui.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.databinding.VqCommonLoadingBinding;
import com.disney.wdpro.virtualqueue.databinding.VqMyQueuesLoadingBinding;
import com.disney.wdpro.virtualqueue.p462ui.create_party.CreatePartyMainAdapter;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0019\u0018\u001a\u001b\u001cB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u001d"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingViewType;", "Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingStyleUI;", "loadingStyle", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "<init>", "(Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingStyleUI;Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$e0;", "holder", "item", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$e0;Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingViewType;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingStyleUI;", "Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Companion", "CommonLoadingViewHolder", "LoadingStyleUI", "LoadingViewType", "MyQueueLoadingViewHolder", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class LoadingAdapter implements InterfaceC9229c<RecyclerView.AbstractC4902e0, LoadingViewType> {
    public static final int VIEW_TYPE = 10000;
    private final Context context;
    private final LoadingStyleUI loadingStyle;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$CommonLoadingViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$CreatePartyViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqCommonLoadingBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqCommonLoadingBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqCommonLoadingBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class CommonLoadingViewHolder extends CreatePartyMainAdapter.CreatePartyViewHolder {
        public static final int $stable = 8;
        private final VqCommonLoadingBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public CommonLoadingViewHolder(VqCommonLoadingBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            FrameLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqCommonLoadingBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingStyleUI;", "", "(Ljava/lang/String;I)V", "MY_QUEUE_LOADING", "COMMON_LOADING", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public enum LoadingStyleUI {
        MY_QUEUE_LOADING,
        COMMON_LOADING
    }

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingViewType;", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "loadingString", "", "(Ljava/lang/String;)V", "getLoadingString", "()Ljava/lang/String;", "setLoadingString", "getViewType", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class LoadingViewType extends AccessibleRecyclerViewItem {
        public static final int $stable = 8;
        private String loadingString;

        public LoadingViewType() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final String getLoadingString() {
            return this.loadingString;
        }

        @Override // com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem, com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 10000;
        }

        public final void setLoadingString(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.loadingString = str;
        }

        public LoadingViewType(String loadingString) {
            Intrinsics.checkNotNullParameter(loadingString, "loadingString");
            this.loadingString = loadingString;
        }

        public /* synthetic */ LoadingViewType(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$MyQueueLoadingViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$CreatePartyViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqMyQueuesLoadingBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqMyQueuesLoadingBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqMyQueuesLoadingBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class MyQueueLoadingViewHolder extends CreatePartyMainAdapter.CreatePartyViewHolder {
        public static final int $stable = 8;
        private final VqMyQueuesLoadingBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public MyQueueLoadingViewHolder(VqMyQueuesLoadingBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            FrameLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqMyQueuesLoadingBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadingStyleUI.values().length];
            try {
                iArr[LoadingStyleUI.COMMON_LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadingStyleUI.MY_QUEUE_LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LoadingAdapter(LoadingStyleUI loadingStyle, Context context, VirtualQueueThemer vqThemer) {
        Intrinsics.checkNotNullParameter(loadingStyle, "loadingStyle");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        this.loadingStyle = loadingStyle;
        this.context = context;
        this.vqThemer = vqThemer;
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public RecyclerView.AbstractC4902e0 onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.loadingStyle.ordinal()];
        if (i10 == 1) {
            VqCommonLoadingBinding vqCommonLoadingBindingInflate = VqCommonLoadingBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(vqCommonLoadingBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
            return new CommonLoadingViewHolder(vqCommonLoadingBindingInflate);
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        VqMyQueuesLoadingBinding vqMyQueuesLoadingBindingInflate = VqMyQueuesLoadingBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqMyQueuesLoadingBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new MyQueueLoadingViewHolder(vqMyQueuesLoadingBindingInflate);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(RecyclerView.AbstractC4902e0 holder, LoadingViewType item) {
        VqCommonLoadingBinding binding;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if (WhenMappings.$EnumSwitchMapping$0[this.loadingStyle.ordinal()] != 1) {
            return;
        }
        CommonLoadingViewHolder commonLoadingViewHolder = holder instanceof CommonLoadingViewHolder ? (CommonLoadingViewHolder) holder : null;
        if (commonLoadingViewHolder == null || (binding = commonLoadingViewHolder.getBinding()) == null) {
            return;
        }
        binding.fullLoaderText.setText(item.getLoadingString());
        LottieLoader lottieLoader = new LottieLoader(this.context, this.vqThemer);
        LottieAnimationView lottieAnimationView = binding.fullLoaderAnimationView;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "it.fullLoaderAnimationView");
        lottieLoader.setLoaderAnimationUrl(lottieAnimationView);
    }
}