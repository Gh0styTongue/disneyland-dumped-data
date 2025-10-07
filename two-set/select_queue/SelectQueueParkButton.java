package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C3296a;
import com.couchbase.lite.internal.core.C4Replicator;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.p147ma.accessibility.MAAccessibilityConstants;
import com.disney.wdpro.recommender.core.themer.RecommenderThemerConstants;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.FilterData;
import com.disney.wdpro.virtualqueue.databinding.VqSelectQueueParkItemBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "data", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton$Data;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton$Data;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;)V", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqSelectQueueParkItemBinding;", "getData", "()Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton$Data;", "isActive", "", "park", "", "parkSelectedColor", "", "parkUnselectedColor", "underlineSelectedColor", "underlineUnselectedColor", "useImages", "initView", "", "setParkSelected", MAAccessibilityConstants.SELECTED, "Companion", "Data", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nSelectQueueParkButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectQueueParkButton.kt\ncom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Html.kt\nandroidx/core/text/HtmlKt\n*L\n1#1,172:1\n1#2:173\n39#3,5:174\n*S KotlinDebug\n*F\n+ 1 SelectQueueParkButton.kt\ncom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton\n*L\n109#1:174,5\n*E\n"})
/* loaded from: classes20.dex */
public final class SelectQueueParkButton extends FrameLayout {
    private VqSelectQueueParkItemBinding binding;
    private final Data data;
    private boolean isActive;
    private String park;
    private int parkSelectedColor;
    private int parkUnselectedColor;
    private PicassoUtils picassoUtils;
    private int underlineSelectedColor;
    private int underlineUnselectedColor;
    private boolean useImages;
    private VirtualQueueThemer vqThemer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton$Companion;", "", "()V", "adjustParkButtonsHeight", "", OTUXParamsKeys.OT_UX_BUTTONS, "", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @SourceDebugExtension({"SMAP\nSelectQueueParkButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectQueueParkButton.kt\ncom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n1#2:173\n1855#3,2:174\n*S KotlinDebug\n*F\n+ 1 SelectQueueParkButton.kt\ncom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton$Companion\n*L\n162#1:174,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void adjustParkButtonsHeight(List<SelectQueueParkButton> buttons) {
            Integer num;
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            List<SelectQueueParkButton> list = buttons;
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                Integer numValueOf = Integer.valueOf(((SelectQueueParkButton) it.next()).getHeight());
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((SelectQueueParkButton) it.next()).getHeight());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                for (SelectQueueParkButton selectQueueParkButton : list) {
                    ViewGroup.LayoutParams layoutParams = selectQueueParkButton.getLayoutParams();
                    layoutParams.height = iIntValue;
                    selectQueueParkButton.setLayoutParams(layoutParams);
                }
            }
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton$Data;", "", C4Replicator.REPLICATOR_OPTION_FILTER, "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/FilterData;", OTUXParamsKeys.OT_UX_WIDTH, "", RecommenderThemerConstants.INSTANCE, "", "total", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/FilterData;ILjava/lang/String;Ljava/lang/String;)V", "getFilter", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/FilterData;", "getInstance", "()Ljava/lang/String;", "getTotal", "getWidth", "()I", "component1", "component2", "component3", "component4", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "toString", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class Data {
        public static final int $stable = 8;
        private final FilterData filter;
        private final String instance;
        private final String total;
        private final int width;

        public Data(FilterData filter, int i10, String instance, String total) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(total, "total");
            this.filter = filter;
            this.width = i10;
            this.instance = instance;
            this.total = total;
        }

        public static /* synthetic */ Data copy$default(Data data, FilterData filterData, int i10, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                filterData = data.filter;
            }
            if ((i11 & 2) != 0) {
                i10 = data.width;
            }
            if ((i11 & 4) != 0) {
                str = data.instance;
            }
            if ((i11 & 8) != 0) {
                str2 = data.total;
            }
            return data.copy(filterData, i10, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final FilterData getFilter() {
            return this.filter;
        }

        /* renamed from: component2, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component3, reason: from getter */
        public final String getInstance() {
            return this.instance;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTotal() {
            return this.total;
        }

        public final Data copy(FilterData filter, int width, String instance, String total) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(total, "total");
            return new Data(filter, width, instance, total);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.filter, data.filter) && this.width == data.width && Intrinsics.areEqual(this.instance, data.instance) && Intrinsics.areEqual(this.total, data.total);
        }

        public final FilterData getFilter() {
            return this.filter;
        }

        public final String getInstance() {
            return this.instance;
        }

        public final String getTotal() {
            return this.total;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (((((this.filter.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + this.instance.hashCode()) * 31) + this.total.hashCode();
        }

        public String toString() {
            return "Data(filter=" + this.filter + ", width=" + this.width + ", instance=" + this.instance + ", total=" + this.total + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectQueueParkButton(Context context, Data data, VirtualQueueThemer vqThemer, PicassoUtils picassoUtils) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(picassoUtils, "picassoUtils");
        this.data = data;
        this.vqThemer = vqThemer;
        this.picassoUtils = picassoUtils;
        this.park = "";
        this.parkSelectedColor = C3296a.getColor(context, C21487R.color.vq_hyperion_blue_700);
        this.parkUnselectedColor = C3296a.getColor(context, C21487R.color.vq_hyperion_blue_300);
        this.underlineSelectedColor = C3296a.getColor(context, C21487R.color.vq_hyperion_blue_700);
        this.underlineUnselectedColor = C3296a.getColor(context, C21487R.color.vq_hyperion_cool_gray_100);
        VqSelectQueueParkItemBinding vqSelectQueueParkItemBindingInflate = VqSelectQueueParkItemBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(vqSelectQueueParkItemBindingInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = vqSelectQueueParkItemBindingInflate;
        initView(data);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void initView(com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueParkButton.Data r19) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueParkButton.initView(com.disney.wdpro.virtualqueue.ui.select_queue.SelectQueueParkButton$Data):void");
    }

    public final Data getData() {
        return this.data;
    }

    public final void setParkSelected(boolean selected) {
        this.isActive = selected;
        VqSelectQueueParkItemBinding vqSelectQueueParkItemBinding = null;
        if (selected) {
            if (this.useImages) {
                VqSelectQueueParkItemBinding vqSelectQueueParkItemBinding2 = this.binding;
                if (vqSelectQueueParkItemBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    vqSelectQueueParkItemBinding2 = null;
                }
                vqSelectQueueParkItemBinding2.parkImageActive.setVisibility(0);
                VqSelectQueueParkItemBinding vqSelectQueueParkItemBinding3 = this.binding;
                if (vqSelectQueueParkItemBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    vqSelectQueueParkItemBinding3 = null;
                }
                vqSelectQueueParkItemBinding3.parkImageInactive.setVisibility(4);
            } else {
                VqSelectQueueParkItemBinding vqSelectQueueParkItemBinding4 = this.binding;
                if (vqSelectQueueParkItemBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    vqSelectQueueParkItemBinding4 = null;
                }
                vqSelectQueueParkItemBinding4.parkIcon.setTextColor(this.parkSelectedColor);
            }
            VqSelectQueueParkItemBinding vqSelectQueueParkItemBinding5 = this.binding;
            if (vqSelectQueueParkItemBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vqSelectQueueParkItemBinding5 = null;
            }
            vqSelectQueueParkItemBinding5.parkUnderline.setBackgroundColor(this.underlineSelectedColor);
            VqSelectQueueParkItemBinding vqSelectQueueParkItemBinding6 = this.binding;
            if (vqSelectQueueParkItemBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                vqSelectQueueParkItemBinding = vqSelectQueueParkItemBinding6;
            }
            vqSelectQueueParkItemBinding.parkName.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueParkTabSelectedAccessibilityAndroid, MapsKt.mapOf(TuplesKt.m92045to("parkName", this.park), TuplesKt.m92045to(RecommenderThemerConstants.INSTANCE, this.data.getInstance()), TuplesKt.m92045to("total", this.data.getTotal())), null, false, 12, null));
            return;
        }
        if (this.useImages) {
            VqSelectQueueParkItemBinding vqSelectQueueParkItemBinding7 = this.binding;
            if (vqSelectQueueParkItemBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vqSelectQueueParkItemBinding7 = null;
            }
            vqSelectQueueParkItemBinding7.parkImageActive.setVisibility(4);
            VqSelectQueueParkItemBinding vqSelectQueueParkItemBinding8 = this.binding;
            if (vqSelectQueueParkItemBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vqSelectQueueParkItemBinding8 = null;
            }
            vqSelectQueueParkItemBinding8.parkImageInactive.setVisibility(0);
        } else {
            VqSelectQueueParkItemBinding vqSelectQueueParkItemBinding9 = this.binding;
            if (vqSelectQueueParkItemBinding9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vqSelectQueueParkItemBinding9 = null;
            }
            vqSelectQueueParkItemBinding9.parkIcon.setTextColor(this.parkUnselectedColor);
        }
        VqSelectQueueParkItemBinding vqSelectQueueParkItemBinding10 = this.binding;
        if (vqSelectQueueParkItemBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vqSelectQueueParkItemBinding10 = null;
        }
        vqSelectQueueParkItemBinding10.parkUnderline.setBackgroundColor(this.underlineUnselectedColor);
        VqSelectQueueParkItemBinding vqSelectQueueParkItemBinding11 = this.binding;
        if (vqSelectQueueParkItemBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            vqSelectQueueParkItemBinding = vqSelectQueueParkItemBinding11;
        }
        vqSelectQueueParkItemBinding.parkName.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueParkTabAccessibilityAndroid, MapsKt.mapOf(TuplesKt.m92045to("parkName", this.park), TuplesKt.m92045to(RecommenderThemerConstants.INSTANCE, this.data.getInstance()), TuplesKt.m92045to("total", this.data.getTotal())), null, false, 12, null));
    }
}