package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.facility.model.FacilityFacet;
import com.disney.wdpro.facilityui.fragments.detail.FinderDetailFragment;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.databinding.VqSelectQueueItemBinding;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCardAdapter;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueUtils;", "", "()V", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class SelectQueueUtils {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueUtils$Companion;", "", "()V", "setupHeightRestrictions", "", FinderDetailFragment.FACILITY_PARAM, "Lcom/disney/wdpro/facility/model/Facility;", VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "holder", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$SelectQueueCardViewHolder;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String setupHeightRestrictions(Facility facility, Queue queue, SelectQueueCardAdapter.SelectQueueCardViewHolder holder, VirtualQueueThemer vqThemer) {
            VirtualQueueThemer virtualQueueThemer;
            List<FacilityFacet> facets;
            Intrinsics.checkNotNullParameter(queue, "queue");
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            String string$default = "";
            if (facility != null && (facets = facility.getFacets()) != null) {
                for (FacilityFacet facilityFacet : facets) {
                    if (Intrinsics.areEqual(facilityFacet.getCategory(), "height")) {
                        string$default = facilityFacet.getValue();
                        Intrinsics.checkNotNullExpressionValue(string$default, "facet.value");
                    }
                }
            }
            if (string$default.length() == 0) {
                virtualQueueThemer = vqThemer;
                string$default = VirtualQueueThemer.getString$default(virtualQueueThemer, VQStringType.SelectQueueHeightRestrictions, queue.getContentId(), false, 4, null);
            } else {
                virtualQueueThemer = vqThemer;
            }
            VqSelectQueueItemBinding binding = holder.getBinding();
            if (string$default.length() > 0) {
                binding.heightRestrictions.setVisibility(0);
                binding.heightRestrictions.setText(string$default);
            } else {
                binding.heightRestrictions.setVisibility(8);
            }
            String string$default2 = VirtualQueueThemer.getString$default(virtualQueueThemer, VQStringType.SelectQueueInchesAccessibility, queue.getContentId(), false, 4, null);
            return VirtualQueueThemer.getString$default(virtualQueueThemer, VQStringType.SelectQueueGuestMustBeAccessibility, MapsKt.mapOf(TuplesKt.m92045to("heightRestriction", StringsKt.replace$default(string$default, VirtualQueueThemer.getString$default(virtualQueueThemer, VQStringType.SelectQueueInchesToReplaceAccessibility, queue.getContentId(), false, 4, null), string$default2, false, 4, (Object) null))), null, false, 12, null);
        }

        private Companion() {
        }
    }
}