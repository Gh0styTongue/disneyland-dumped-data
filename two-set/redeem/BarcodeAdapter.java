package com.disney.wdpro.virtualqueue.p462ui.redeem;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.VirtualQueueDestinationProvider;
import com.disney.wdpro.virtualqueue.databinding.VqRedeemItemBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Position;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p1046wn.C32915a;

@Metadata(m92037d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00041203B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00064"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter$BarcodeViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter$BarcodeViewType;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProvider;", "virtualQueueDestinationProvider", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "linkedGuestUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/redeem/QRCodeHelper;", "qrCodeHelper", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProvider;Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;Lcom/disney/wdpro/virtualqueue/ui/redeem/QRCodeHelper;)V", "", "setup", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter$BarcodeViewHolder;", "holder", "item", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter$BarcodeViewHolder;Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter$BarcodeViewType;)V", "Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProvider;", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "Lcom/disney/wdpro/virtualqueue/ui/redeem/QRCodeHelper;", "Lwn/a;", "barcodeImageGenerator", "Lwn/a;", "getBarcodeImageGenerator", "()Lwn/a;", "setBarcodeImageGenerator", "(Lwn/a;)V", "", "imageLoadCount", "I", "Companion", "BarcodeViewHolder", "BarcodeViewType", "Factory", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public class BarcodeAdapter implements InterfaceC9229c<BarcodeViewHolder, BarcodeViewType> {
    public static final int VIEW_TYPE = 12000;
    public C32915a barcodeImageGenerator;
    private final Context context;
    private final FacilityUtils facilityUtils;
    private int imageLoadCount;
    private final LinkedGuestUtils linkedGuestUtils;
    private final PicassoUtils picassoUtils;
    private final QRCodeHelper qrCodeHelper;
    private final VirtualQueueDestinationProvider virtualQueueDestinationProvider;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter$BarcodeViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqRedeemItemBinding;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqRedeemItemBinding;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqRedeemItemBinding;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class BarcodeViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 8;
        private final VqRedeemItemBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public BarcodeViewHolder(VqRedeemItemBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
        }

        public final VqRedeemItemBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter$BarcodeViewType;", "Lcom/disney/wdpro/commons/adapter/g;", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "guest", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "position", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "Landroid/content/Context;", "context", "", "numberOfItems", "<init>", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;Lcom/disney/wdpro/virtualqueue/service/model/Position;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Landroid/content/Context;I)V", "getViewType", "()I", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "getGuest", "()Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "getPosition", "()Lcom/disney/wdpro/virtualqueue/service/model/Position;", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "getQueue", "()Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "I", "getNumberOfItems", "Landroid/graphics/Point;", "screenSizePx", "Landroid/graphics/Point;", "getScreenSizePx", "()Landroid/graphics/Point;", "setScreenSizePx", "(Landroid/graphics/Point;)V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class BarcodeViewType implements InterfaceC9233g {
        public static final int $stable = 8;
        private final Context context;
        private final LinkedGuest guest;
        private final int numberOfItems;
        private final Position position;
        private final Queue queue;
        private Point screenSizePx;

        public BarcodeViewType(LinkedGuest guest, Position position, Queue queue, Context context, int i10) {
            Intrinsics.checkNotNullParameter(guest, "guest");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(queue, "queue");
            Intrinsics.checkNotNullParameter(context, "context");
            this.guest = guest;
            this.position = position;
            this.queue = queue;
            this.context = context;
            this.numberOfItems = i10;
            this.screenSizePx = new Point();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Point point = this.screenSizePx;
            float f10 = displayMetrics.heightPixels;
            float f11 = displayMetrics.density;
            point.y = (int) (f10 / f11);
            point.x = (int) (displayMetrics.widthPixels / f11);
        }

        public final Context getContext() {
            return this.context;
        }

        public final LinkedGuest getGuest() {
            return this.guest;
        }

        public final int getNumberOfItems() {
            return this.numberOfItems;
        }

        public final Position getPosition() {
            return this.position;
        }

        public final Queue getQueue() {
            return this.queue;
        }

        public final Point getScreenSizePx() {
            return this.screenSizePx;
        }

        @Override // com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 12000;
        }

        public final void setScreenSizePx(Point point) {
            Intrinsics.checkNotNullParameter(point, "<set-?>");
            this.screenSizePx = point;
        }
    }

    @Metadata(m92037d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter$Factory;", "", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "linkedGuestUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "qrCodeHelper", "Lcom/disney/wdpro/virtualqueue/ui/redeem/QRCodeHelper;", "(Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;Lcom/disney/wdpro/virtualqueue/ui/redeem/QRCodeHelper;)V", "create", "Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter;", "context", "Landroid/content/Context;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "virtualQueueDestinationProvider", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueDestinationProvider;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Factory {
        public static final int $stable = 8;
        private final FacilityUtils facilityUtils;
        private final LinkedGuestUtils linkedGuestUtils;
        private final PicassoUtils picassoUtils;
        private final QRCodeHelper qrCodeHelper;

        @Inject
        public Factory(PicassoUtils picassoUtils, LinkedGuestUtils linkedGuestUtils, FacilityUtils facilityUtils, QRCodeHelper qrCodeHelper) {
            Intrinsics.checkNotNullParameter(picassoUtils, "picassoUtils");
            Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
            Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
            Intrinsics.checkNotNullParameter(qrCodeHelper, "qrCodeHelper");
            this.picassoUtils = picassoUtils;
            this.linkedGuestUtils = linkedGuestUtils;
            this.facilityUtils = facilityUtils;
            this.qrCodeHelper = qrCodeHelper;
        }

        public final BarcodeAdapter create(Context context, VirtualQueueThemer vqThemer, VirtualQueueDestinationProvider virtualQueueDestinationProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            Intrinsics.checkNotNullParameter(virtualQueueDestinationProvider, "virtualQueueDestinationProvider");
            return new BarcodeAdapter(context, vqThemer, virtualQueueDestinationProvider, this.picassoUtils, this.linkedGuestUtils, this.facilityUtils, this.qrCodeHelper);
        }
    }

    public BarcodeAdapter(Context context, VirtualQueueThemer vqThemer, VirtualQueueDestinationProvider virtualQueueDestinationProvider, PicassoUtils picassoUtils, LinkedGuestUtils linkedGuestUtils, FacilityUtils facilityUtils, QRCodeHelper qrCodeHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(virtualQueueDestinationProvider, "virtualQueueDestinationProvider");
        Intrinsics.checkNotNullParameter(picassoUtils, "picassoUtils");
        Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
        Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
        Intrinsics.checkNotNullParameter(qrCodeHelper, "qrCodeHelper");
        this.context = context;
        this.vqThemer = vqThemer;
        this.virtualQueueDestinationProvider = virtualQueueDestinationProvider;
        this.picassoUtils = picassoUtils;
        this.linkedGuestUtils = linkedGuestUtils;
        this.facilityUtils = facilityUtils;
        this.qrCodeHelper = qrCodeHelper;
        setup(context);
    }

    public final C32915a getBarcodeImageGenerator() {
        C32915a c32915a = this.barcodeImageGenerator;
        if (c32915a != null) {
            return c32915a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("barcodeImageGenerator");
        return null;
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    public final void setBarcodeImageGenerator(C32915a c32915a) {
        Intrinsics.checkNotNullParameter(c32915a, "<set-?>");
        this.barcodeImageGenerator = c32915a;
    }

    public void setup(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        setBarcodeImageGenerator(new C32915a(context));
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public BarcodeViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqRedeemItemBinding vqRedeemItemBindingInflate = VqRedeemItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqRedeemItemBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new BarcodeViewHolder(vqRedeemItemBindingInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ca A[PHI: r4
  0x00ca: PHI (r4v13 java.lang.String) = (r4v12 java.lang.String), (r4v89 java.lang.String) binds: [B:3:0x00ae, B:8:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBindViewHolder(com.disney.wdpro.virtualqueue.ui.redeem.BarcodeAdapter.BarcodeViewHolder r20, com.disney.wdpro.virtualqueue.ui.redeem.BarcodeAdapter.BarcodeViewType r21) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException, com.google.zxing.WriterException {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.virtualqueue.p462ui.redeem.BarcodeAdapter.onBindViewHolder(com.disney.wdpro.virtualqueue.ui.redeem.BarcodeAdapter$BarcodeViewHolder, com.disney.wdpro.virtualqueue.ui.redeem.BarcodeAdapter$BarcodeViewType):void");
    }
}