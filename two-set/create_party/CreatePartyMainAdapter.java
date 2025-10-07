package com.disney.wdpro.virtualqueue.p462ui.create_party;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.C1176t0;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.facility.model.FacilityFacet;
import com.disney.wdpro.facilityui.fragments.detail.FinderDetailFragment;
import com.disney.wdpro.p147ma.accessibility.MAAccessibilityConstants;
import com.disney.wdpro.support.sticky_header.InterfaceC20917l;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.interfaces.CreatePartyActions;
import com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.common.AnonymousPartySizeAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.DetailAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.IneligibleGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.LoadingAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.QueueAction;
import com.disney.wdpro.virtualqueue.p462ui.common.SectionHeaderAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.SelectAllAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.SelectLinkedGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.create_party.LinkTicketAdapter;
import com.disney.wdpro.virtualqueue.p462ui.create_party.MaxPartyAlertAdapter;
import com.disney.wdpro.virtualqueue.p462ui.create_party.QueueNameAdapter;
import com.disney.wdpro.virtualqueue.p462ui.create_party.YourPartySectionHeaderAdapter;
import com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter;
import com.disney.wdpro.virtualqueue.service.model.Conflict;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.google.common.collect.AbstractC22798t1;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b:\u0004Ã\u0001Ä\u0001BS\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010%\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u00020.H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020)H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020)2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020)2\u0006\u0010:\u001a\u00020$¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020)¢\u0006\u0004\b=\u00105J\r\u0010>\u001a\u00020)¢\u0006\u0004\b>\u00105J=\u0010D\u001a\u00020)2\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020)2\u0006\u0010F\u001a\u00020,¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020)2\u0006\u0010I\u001a\u00020,¢\u0006\u0004\bJ\u0010HJ-\u0010N\u001a\u00020)2\u0006\u0010#\u001a\u00020\"2\u0006\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020\u00122\u0006\u0010M\u001a\u00020$¢\u0006\u0004\bN\u0010OJ\u001f\u0010R\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020P2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010V\u001a\u00020)2\u0006\u0010T\u001a\u00020\u00022\u0006\u0010U\u001a\u00020,H\u0016¢\u0006\u0004\bV\u0010WJ\u001f\u0010Y\u001a\u00020)2\u0006\u0010X\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\bY\u0010ZJ\u001f\u0010[\u001a\u00020)2\u0006\u0010X\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b[\u0010ZJ\u000f\u0010\\\u001a\u00020,H\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020,H\u0016¢\u0006\u0004\b^\u0010]J\u0017\u0010_\u001a\u00020,2\u0006\u0010U\u001a\u00020,H\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020,2\u0006\u0010U\u001a\u00020,H\u0016¢\u0006\u0004\ba\u0010`J\u0017\u0010b\u001a\u00020\u00122\u0006\u0010U\u001a\u00020,H\u0016¢\u0006\u0004\bb\u0010cJ9\u0010h\u001a\u00020)2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020@0?2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020e0?2\u0006\u0010#\u001a\u00020\"2\u0006\u0010g\u001a\u00020$¢\u0006\u0004\bh\u0010iJ+\u0010j\u001a\u00020)2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020e0?2\u0006\u0010#\u001a\u00020\"2\u0006\u0010g\u001a\u00020$¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020)2\u0006\u0010l\u001a\u00020\u0012H\u0016¢\u0006\u0004\bm\u0010nJ\u0017\u0010p\u001a\u00020)2\u0006\u00101\u001a\u00020oH\u0016¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\u0012H\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020\u0012H\u0016¢\u0006\u0004\bt\u0010sJ\u000f\u0010v\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020)2\u0006\u0010x\u001a\u00020,H\u0016¢\u0006\u0004\by\u0010HJ(\u0010\u007f\u001a\u00020)2\u0006\u0010{\u001a\u00020z2\u0006\u0010|\u001a\u00020z2\u0006\u0010~\u001a\u00020}H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0011\u0010\u0081\u0001\u001a\u00020,H\u0016¢\u0006\u0005\b\u0081\u0001\u0010]J\u0011\u0010\u0082\u0001\u001a\u00020)H\u0016¢\u0006\u0005\b\u0082\u0001\u00105J\u0011\u0010\u0083\u0001\u001a\u00020,H\u0016¢\u0006\u0005\b\u0083\u0001\u0010]J\u0011\u0010\u0084\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0084\u0001\u0010sR\u001a\u0010\r\u001a\u00020\f8\u0006¢\u0006\u000f\n\u0005\b\r\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0088\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0089\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u008a\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u008b\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u008c\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u008d\u0001R\u0017\u0010\u008e\u0001\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R.\u0010\u0090\u0001\u001a\u00020,8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0006\b\u0090\u0001\u0010\u008f\u0001\u0012\u0005\b\u0093\u0001\u00105\u001a\u0005\b\u0091\u0001\u0010]\"\u0005\b\u0092\u0001\u0010HR.\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u00018\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u0012\u0005\b\u009a\u0001\u00105\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001f\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0097\u0001R\u001e\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020o0\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0097\u0001R\u001e\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00020o0\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0097\u0001R\u001f\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0097\u0001R\u001f\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030¡\u00010 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¥\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R1\u0010¨\u0001\u001a\u00030§\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b¨\u0001\u0010©\u0001\u0012\u0005\b®\u0001\u00105\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0018\u0010³\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0018\u0010µ\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010´\u0001R\u0018\u0010¶\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010´\u0001R\u0018\u0010·\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010´\u0001R\u0018\u0010¹\u0001\u001a\u00030¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010¼\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010¿\u0001\u001a\u00030¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0017\u0010I\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bI\u0010\u008f\u0001R\u001a\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020@0?8F¢\u0006\b\u001a\u0006\bÁ\u0001\u0010\u0099\u0001¨\u0006Å\u0001"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "Lcom/disney/wdpro/support/sticky_header/l;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllActions;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/YourPartySectionHeaderAdapter$YourPartyActions;", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestActions;", "Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter$SectionHeaderActions;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter$LinkTicketActions;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeActions;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/MaxPartyAlertAdapter$MaxPartyAlertActions;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/core/interfaces/CreatePartyActions;", "actions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "", "selectGuestsInParty", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "linkedGuestUtils", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$Factory;", "selectLinkedGuestAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$Factory;", "ineligibleGuestAdapterFactory", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/core/interfaces/CreatePartyActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;ZLcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$Factory;Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$Factory;)V", "Lcom/disney/wdpro/facility/model/Facility;", FinderDetailFragment.FACILITY_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "", "setupHeightRestrictions", "(Lcom/disney/wdpro/facility/model/Facility;Lcom/disney/wdpro/virtualqueue/service/model/Queue;)Ljava/lang/String;", "setupQueueParkName", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;)Ljava/lang/String;", "", "setupQueueSubpark", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "", "viewType", "Lcom/disney/wdpro/commons/adapter/g;", "getStickyHeaderItem", "(I)Lcom/disney/wdpro/commons/adapter/g;", "item", "isStickyHeader", "(Lcom/disney/wdpro/commons/adapter/g;)Z", "updateList", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "loadingString", "showLoading", "(Ljava/lang/String;)V", "dataSetChanged", "checkSelectedGuestForFirstTime", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "partyLinkedGuests", "otherLinkedGuests", "notEligibleGuests", "setGuests", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "maxAnonymousPartySize", "setTotalGuests", "(I)V", "maxPartySize", "updateMaxPartySize", "dScribeHeight", VirtualQueueConstants.SUPPRESS_HOW_TO_ENTER, "formattedDisplay", "setQueueNameHeader", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;ZLjava/lang/String;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "holder", "position", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;I)V", "viewHolder", "onBindStickyHeaderViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$e0;I)V", "onBindHeaderViewHolder", "getItemCount", "()I", "getNextHeaderOffset", "getItemViewType", "(I)I", "getHeaderType", "isHeader", "(I)Z", "ineligiblePartyGuests", "Lcom/disney/wdpro/virtualqueue/service/model/Conflict;", "conflicts", "parkName", "displayIneligibleGuestsItemOnly", "(Ljava/util/List;Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;)V", "updateGuestConflicts", "(Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;)V", MAAccessibilityConstants.SELECTED, "onSelectAllStateChange", "(Z)V", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestViewItem;", "guestSelectionUpdated", "(Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestViewItem;)V", "hasReachedMaxParty", "()Z", "shouldEnableSelectAll", "Lcom/disney/wdpro/virtualqueue/ui/common/QueueAction;", "actionType", "()Lcom/disney/wdpro/virtualqueue/ui/common/QueueAction;", "partySize", "updatePartySize", "Landroid/widget/TextView;", "minus", "plus", "Landroid/widget/LinearLayout;", "warningLayout", "updateClosedQueueMessage", "(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;)V", "getYourPartySize", "onLinkTicketClicked", "getMaxPartySize", "isGuestSelected", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/CreatePartyActions;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Z", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "Lcom/disney/wdpro/commons/j;", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "nextHeaderOffset", "I", "eligibleGuestCount", "getEligibleGuestCount$virtual_queue_lib_release", "setEligibleGuestCount$virtual_queue_lib_release", "getEligibleGuestCount$virtual_queue_lib_release$annotations", "", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$IneligibleGuestViewItem;", "guestItemsInConflict", "guestsInParty", "otherGuests", "ineligibleGuests", "Landroidx/collection/t0;", "", "delegateAdapters", "Landroidx/collection/t0;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/QueueNameAdapter$QueueNameViewItem;", "queueNameViewItem", "Lcom/disney/wdpro/virtualqueue/ui/create_party/QueueNameAdapter$QueueNameViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeViewItem;", "anonymousPartySizeViewItem", "Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeViewItem;", "getAnonymousPartySizeViewItem$virtual_queue_lib_release", "()Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeViewItem;", "setAnonymousPartySizeViewItem$virtual_queue_lib_release", "(Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeViewItem;)V", "getAnonymousPartySizeViewItem$virtual_queue_lib_release$annotations", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllViewType;", "selectAllViewItem", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllViewType;", "Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter$SectionHeaderViewItem;", "yourPartyViewItem", "Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter$SectionHeaderViewItem;", "anyoneElseViewItem", "maxPartyAlertViewItem", "notEligibleViewItem", "Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter$LinkTicketViewType;", "linkTicketViewItem", "Lcom/disney/wdpro/virtualqueue/ui/create_party/LinkTicketAdapter$LinkTicketViewType;", "Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingViewType;", "loadingViewItem", "Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingViewType;", "Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewItem;", "emptyListViewItem", "Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewItem;", "getSelectedGuests", "selectedGuests", "CreatePartyViewHolder", "Factory", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nCreatePartyMainAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePartyMainAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,708:1\n1864#2,3:709\n1864#2,3:712\n1864#2,3:715\n1864#2,3:718\n1855#2:721\n1856#2:723\n1855#2,2:724\n1#3:722\n*S KotlinDebug\n*F\n+ 1 CreatePartyMainAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter\n*L\n433#1:709,3\n452#1:712,3\n471#1:715,3\n500#1:718,3\n506#1:721\n506#1:723\n520#1:724,2\n*E\n"})
/* loaded from: classes20.dex */
public final class CreatePartyMainAdapter extends RecyclerView.Adapter<AnimateRecyclerViewHolder> implements InterfaceC20917l<RecyclerView.AbstractC4902e0>, SelectAllAdapter.SelectAllActions, YourPartySectionHeaderAdapter.YourPartyActions, SelectLinkedGuestAdapter.SelectLinkedGuestActions, SectionHeaderAdapter.SectionHeaderActions, LinkTicketAdapter.LinkTicketActions, AnonymousPartySizeAdapter.AnonymousPartySizeActions, MaxPartyAlertAdapter.MaxPartyAlertActions {
    public static final int $stable = 8;
    private final CreatePartyActions actions;
    private AnonymousPartySizeAdapter.AnonymousPartySizeViewItem anonymousPartySizeViewItem;
    private final SectionHeaderAdapter.SectionHeaderViewItem anyoneElseViewItem;
    private final Context context;
    private final C1176t0<Object> delegateAdapters;
    private int eligibleGuestCount;
    private final DetailAdapter.DetailViewItem emptyListViewItem;
    private final FacilityUtils facilityUtils;
    private final List<IneligibleGuestAdapter.IneligibleGuestViewItem> guestItemsInConflict;
    private final List<SelectLinkedGuestAdapter.SelectLinkedGuestViewItem> guestsInParty;
    private final List<IneligibleGuestAdapter.IneligibleGuestViewItem> ineligibleGuests;
    private final List<AccessibleRecyclerViewItem> items;
    private final LinkTicketAdapter.LinkTicketViewType linkTicketViewItem;
    private final LinkedGuestUtils linkedGuestUtils;
    private final LoadingAdapter.LoadingViewType loadingViewItem;
    private final SectionHeaderAdapter.SectionHeaderViewItem maxPartyAlertViewItem;
    private int maxPartySize;
    private final int nextHeaderOffset;
    private final SectionHeaderAdapter.SectionHeaderViewItem notEligibleViewItem;
    private final List<SelectLinkedGuestAdapter.SelectLinkedGuestViewItem> otherGuests;
    private final C9314j parkAppConfiguration;
    private final QueueNameAdapter.QueueNameViewItem queueNameViewItem;
    private final SelectAllAdapter.SelectAllViewType selectAllViewItem;
    private final boolean selectGuestsInParty;
    private final VirtualQueueThemer vqThemer;
    private final SectionHeaderAdapter.SectionHeaderViewItem yourPartyViewItem;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$CreatePartyViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static class CreatePartyViewHolder extends AnimateRecyclerViewHolder {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreatePartyViewHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }
    }

    @Metadata(m92037d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001e"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$Factory;", "", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "linkedGuestUtils", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$Factory;", "selectLinkedGuestAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$Factory;", "ineligibleGuestAdapterFactory", "<init>", "(Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$Factory;Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$Factory;)V", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/core/interfaces/CreatePartyActions;", "actions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "", "selectGuestsInParty", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter;", "create", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/core/interfaces/CreatePartyActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Z)Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "Lcom/disney/wdpro/commons/j;", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$Factory;", "Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$Factory;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Factory {
        public static final int $stable = 8;
        private final FacilityUtils facilityUtils;
        private final IneligibleGuestAdapter.Factory ineligibleGuestAdapterFactory;
        private final LinkedGuestUtils linkedGuestUtils;
        private final C9314j parkAppConfiguration;
        private final SelectLinkedGuestAdapter.Factory selectLinkedGuestAdapterFactory;

        @Inject
        public Factory(LinkedGuestUtils linkedGuestUtils, C9314j parkAppConfiguration, FacilityUtils facilityUtils, SelectLinkedGuestAdapter.Factory selectLinkedGuestAdapterFactory, IneligibleGuestAdapter.Factory ineligibleGuestAdapterFactory) {
            Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
            Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
            Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
            Intrinsics.checkNotNullParameter(selectLinkedGuestAdapterFactory, "selectLinkedGuestAdapterFactory");
            Intrinsics.checkNotNullParameter(ineligibleGuestAdapterFactory, "ineligibleGuestAdapterFactory");
            this.linkedGuestUtils = linkedGuestUtils;
            this.parkAppConfiguration = parkAppConfiguration;
            this.facilityUtils = facilityUtils;
            this.selectLinkedGuestAdapterFactory = selectLinkedGuestAdapterFactory;
            this.ineligibleGuestAdapterFactory = ineligibleGuestAdapterFactory;
        }

        public static /* synthetic */ CreatePartyMainAdapter create$default(Factory factory, Context context, CreatePartyActions createPartyActions, VirtualQueueThemer virtualQueueThemer, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                createPartyActions = null;
            }
            return factory.create(context, createPartyActions, virtualQueueThemer, z10);
        }

        public final CreatePartyMainAdapter create(Context context, CreatePartyActions actions, VirtualQueueThemer vqThemer, boolean selectGuestsInParty) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            return new CreatePartyMainAdapter(context, actions, vqThemer, selectGuestsInParty, this.linkedGuestUtils, this.parkAppConfiguration, this.facilityUtils, this.selectLinkedGuestAdapterFactory, this.ineligibleGuestAdapterFactory);
        }
    }

    public /* synthetic */ CreatePartyMainAdapter(Context context, CreatePartyActions createPartyActions, VirtualQueueThemer virtualQueueThemer, boolean z10, LinkedGuestUtils linkedGuestUtils, C9314j c9314j, FacilityUtils facilityUtils, SelectLinkedGuestAdapter.Factory factory, IneligibleGuestAdapter.Factory factory2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : createPartyActions, virtualQueueThemer, z10, linkedGuestUtils, c9314j, facilityUtils, factory, factory2);
    }

    /* renamed from: getAnonymousPartySizeViewItem$virtual_queue_lib_release$annotations */
    public static /* synthetic */ void m64894x50a939cf() {
    }

    public static /* synthetic */ void getEligibleGuestCount$virtual_queue_lib_release$annotations() {
    }

    public static /* synthetic */ void getItems$annotations() {
    }

    private final InterfaceC9233g getStickyHeaderItem(int viewType) {
        if (viewType == this.yourPartyViewItem.getViewType()) {
            return this.yourPartyViewItem;
        }
        if (viewType == this.anyoneElseViewItem.getViewType()) {
            return this.anyoneElseViewItem;
        }
        return null;
    }

    private final boolean isStickyHeader(InterfaceC9233g item) {
        return Intrinsics.areEqual(item, this.yourPartyViewItem) || Intrinsics.areEqual(item, this.anyoneElseViewItem);
    }

    @SuppressLint({"VisibleForTests"})
    private final String setupHeightRestrictions(Facility facility, Queue queue) {
        List<FacilityFacet> facets;
        String value = "";
        if (facility != null && (facets = facility.getFacets()) != null) {
            for (FacilityFacet facilityFacet : facets) {
                if (Intrinsics.areEqual(facilityFacet.getCategory(), "height")) {
                    value = facilityFacet.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "facet.value");
                }
            }
        }
        return value.length() == 0 ? VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueHeightRestrictions, queue.getContentId(), false, 4, null) : value;
    }

    @SuppressLint({"VisibleForTests"})
    private final String setupQueueParkName(Queue queue) {
        String ancestorEntertainmentVenue;
        String ancestorThemePark;
        Facility facility = this.facilityUtils.getFacility(queue.getExternalDefinitionId());
        String string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.NonAttractionPark, queue.getContentId(), false, 4, null);
        if (!StringsKt.isBlank(string$default)) {
            return string$default;
        }
        if (facility != null && (ancestorThemePark = facility.getAncestorThemePark()) != null && (!StringsKt.isBlank(ancestorThemePark))) {
            return facility.getAncestorThemePark();
        }
        if (facility == null || (ancestorEntertainmentVenue = facility.getAncestorEntertainmentVenue()) == null || !(!StringsKt.isBlank(ancestorEntertainmentVenue))) {
            return null;
        }
        return facility.getAncestorEntertainmentVenue();
    }

    private final void setupQueueSubpark(Queue queue) {
        String string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.NonAttractionLocatedAt, queue.getContentId(), false, 4, null);
        String string$default2 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.NonAttractionSubpark, queue.getContentId(), false, 4, null);
        this.queueNameViewItem.setVqParkLocatedAt(string$default);
        this.queueNameViewItem.setVqSubParkName(string$default2);
    }

    private final void updateList() {
        this.items.clear();
        int size = this.guestsInParty.size() + this.otherGuests.size();
        this.eligibleGuestCount = size;
        if (size == 0 && this.ineligibleGuests.size() == 0) {
            this.items.add(this.queueNameViewItem);
            this.items.add(this.emptyListViewItem);
            this.items.add(this.linkTicketViewItem);
            if (!Intrinsics.areEqual(this.parkAppConfiguration.m38908h(), "DLR") || this.items.contains(this.yourPartyViewItem) || this.items.contains(this.anyoneElseViewItem)) {
                return;
            }
            this.linkTicketViewItem.setShowDivider(true);
            return;
        }
        this.items.add(this.queueNameViewItem);
        int i10 = 0;
        if (this.eligibleGuestCount > 0) {
            this.items.add(this.selectAllViewItem);
            this.queueNameViewItem.setShowDivider(true);
        } else {
            this.queueNameViewItem.setShowDivider(false);
        }
        if (this.guestsInParty.size() > 0) {
            this.items.add(this.yourPartyViewItem);
            ImmutableList sortedGuestsInParty = AbstractC22798t1.m69693q(this.guestsInParty).m69710x(SelectLinkedGuestAdapter.SelectLinkedGuestViewItem.INSTANCE.getSortComparator());
            Intrinsics.checkNotNullExpressionValue(sortedGuestsInParty, "sortedGuestsInParty");
            int i11 = 0;
            for (Object obj : sortedGuestsInParty) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                SelectLinkedGuestAdapter.SelectLinkedGuestViewItem selectLinkedGuestViewItem = (SelectLinkedGuestAdapter.SelectLinkedGuestViewItem) obj;
                selectLinkedGuestViewItem.setSelected(true);
                selectLinkedGuestViewItem.setIndex(i12);
                selectLinkedGuestViewItem.setSectionTotal(sortedGuestsInParty.size());
                i11 = i12;
            }
            this.items.addAll(sortedGuestsInParty);
        }
        if (this.otherGuests.size() > 0) {
            this.items.add(this.anyoneElseViewItem);
            if (this.guestsInParty.size() >= this.maxPartySize && this.otherGuests.size() >= 1) {
                this.items.add(this.maxPartyAlertViewItem);
            }
            ImmutableList sortedOtherGuests = AbstractC22798t1.m69693q(this.otherGuests).m69710x(SelectLinkedGuestAdapter.SelectLinkedGuestViewItem.INSTANCE.getSortComparator());
            Intrinsics.checkNotNullExpressionValue(sortedOtherGuests, "sortedOtherGuests");
            int i13 = 0;
            for (Object obj2 : sortedOtherGuests) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                SelectLinkedGuestAdapter.SelectLinkedGuestViewItem selectLinkedGuestViewItem2 = (SelectLinkedGuestAdapter.SelectLinkedGuestViewItem) obj2;
                selectLinkedGuestViewItem2.setSelected(false);
                selectLinkedGuestViewItem2.setIndex(i14);
                selectLinkedGuestViewItem2.setSectionTotal(sortedOtherGuests.size());
                i13 = i14;
            }
            this.items.addAll(sortedOtherGuests);
        }
        if (Intrinsics.areEqual(this.parkAppConfiguration.m38908h(), "DLR")) {
            this.items.add(this.linkTicketViewItem);
        }
        if (this.ineligibleGuests.size() > 0) {
            this.items.add(this.notEligibleViewItem);
            ImmutableList sortedIneligibleGuests = AbstractC22798t1.m69693q(this.ineligibleGuests).m69710x(IneligibleGuestAdapter.IneligibleGuestViewItem.INSTANCE.getSortComparator());
            Intrinsics.checkNotNullExpressionValue(sortedIneligibleGuests, "sortedIneligibleGuests");
            for (Object obj3 : sortedIneligibleGuests) {
                int i15 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                IneligibleGuestAdapter.IneligibleGuestViewItem ineligibleGuestViewItem = (IneligibleGuestAdapter.IneligibleGuestViewItem) obj3;
                ineligibleGuestViewItem.setIndex(i15);
                ineligibleGuestViewItem.setSectionTotal(sortedIneligibleGuests.size());
                i10 = i15;
            }
            this.items.addAll(sortedIneligibleGuests);
            if (Intrinsics.areEqual(this.parkAppConfiguration.m38908h(), "DLR") && !this.items.contains(this.yourPartyViewItem) && !this.items.contains(this.anyoneElseViewItem)) {
                this.linkTicketViewItem.setShowDivider(true);
            }
        }
        CreatePartyActions createPartyActions = this.actions;
        if (createPartyActions != null) {
            createPartyActions.updatedPartySize(getYourPartySize());
        }
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.SelectAllAdapter.SelectAllActions
    public QueueAction actionType() {
        return QueueAction.JOIN_QUEUE;
    }

    public final void checkSelectedGuestForFirstTime() {
        if (!this.selectGuestsInParty) {
            onSelectAllStateChange(false);
        } else {
            updateList();
            dataSetChanged();
        }
    }

    public final void dataSetChanged() {
        notifyDataSetChanged();
    }

    public final void displayIneligibleGuestsItemOnly(List<LinkedGuest> ineligiblePartyGuests, List<Conflict> conflicts, Queue queue, String parkName) {
        Object next;
        Intrinsics.checkNotNullParameter(ineligiblePartyGuests, "ineligiblePartyGuests");
        Intrinsics.checkNotNullParameter(conflicts, "conflicts");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(parkName, "parkName");
        ArrayList arrayListM69268i = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i, "newArrayList()");
        Iterator<LinkedGuest> it = ineligiblePartyGuests.iterator();
        while (it.hasNext()) {
            arrayListM69268i.add(new IneligibleGuestAdapter.IneligibleGuestViewItem(it.next(), 0, 0, 6, null));
        }
        ImmutableList sortedIneligibleGuestsItemView = AbstractC22798t1.m69693q(arrayListM69268i).m69710x(IneligibleGuestAdapter.IneligibleGuestViewItem.INSTANCE.getSortComparator());
        Intrinsics.checkNotNullExpressionValue(sortedIneligibleGuestsItemView, "sortedIneligibleGuestsItemView");
        int i10 = 0;
        for (Object obj : sortedIneligibleGuestsItemView) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            IneligibleGuestAdapter.IneligibleGuestViewItem ineligibleGuestViewItem = (IneligibleGuestAdapter.IneligibleGuestViewItem) obj;
            ineligibleGuestViewItem.setIndex(i11);
            ineligibleGuestViewItem.setSectionTotal(sortedIneligibleGuestsItemView.size());
            i10 = i11;
        }
        for (Conflict conflict : conflicts) {
            for (String str : conflict.getGuestIds()) {
                Iterator it2 = arrayListM69268i.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.areEqual(((IneligibleGuestAdapter.IneligibleGuestViewItem) next).getGuest().getGuestId(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                IneligibleGuestAdapter.IneligibleGuestViewItem ineligibleGuestViewItem2 = (IneligibleGuestAdapter.IneligibleGuestViewItem) next;
                if (ineligibleGuestViewItem2 != null) {
                    ineligibleGuestViewItem2.setDetailString(this.vqThemer.getDetailForConflict(conflict.getConflictType(), queue, parkName, true));
                }
            }
        }
        this.items.clear();
        this.items.addAll(sortedIneligibleGuestsItemView);
        dataSetChanged();
    }

    /* renamed from: getAnonymousPartySizeViewItem$virtual_queue_lib_release, reason: from getter */
    public final AnonymousPartySizeAdapter.AnonymousPartySizeViewItem getAnonymousPartySizeViewItem() {
        return this.anonymousPartySizeViewItem;
    }

    public final Context getContext() {
        return this.context;
    }

    /* renamed from: getEligibleGuestCount$virtual_queue_lib_release, reason: from getter */
    public final int getEligibleGuestCount() {
        return this.eligibleGuestCount;
    }

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    public int getHeaderType(int position) {
        AccessibleRecyclerViewItem accessibleRecyclerViewItem = this.items.get(position);
        if (isStickyHeader(accessibleRecyclerViewItem)) {
            return accessibleRecyclerViewItem.getViewType();
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.items.get(position).getViewType();
    }

    public final List<AccessibleRecyclerViewItem> getItems() {
        return this.items;
    }

    @Override // com.disney.wdpro.virtualqueue.ui.create_party.MaxPartyAlertAdapter.MaxPartyAlertActions
    public int getMaxPartySize() {
        return this.maxPartySize;
    }

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    public int getNextHeaderOffset() {
        return this.nextHeaderOffset;
    }

    public final List<LinkedGuest> getSelectedGuests() {
        ArrayList selectedGuests = Lists.m69268i();
        Iterator<SelectLinkedGuestAdapter.SelectLinkedGuestViewItem> it = this.guestsInParty.iterator();
        while (it.hasNext()) {
            selectedGuests.add(it.next().getGuest());
        }
        Intrinsics.checkNotNullExpressionValue(selectedGuests, "selectedGuests");
        return selectedGuests;
    }

    @Override // com.disney.wdpro.virtualqueue.ui.create_party.YourPartySectionHeaderAdapter.YourPartyActions
    public int getYourPartySize() {
        return this.guestsInParty.size();
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.SelectLinkedGuestAdapter.SelectLinkedGuestActions
    public void guestSelectionUpdated(SelectLinkedGuestAdapter.SelectLinkedGuestViewItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean selected = item.getSelected();
        List<SelectLinkedGuestAdapter.SelectLinkedGuestViewItem> list = selected ? this.otherGuests : this.guestsInParty;
        List<SelectLinkedGuestAdapter.SelectLinkedGuestViewItem> list2 = selected ? this.guestsInParty : this.otherGuests;
        list.remove(item);
        list2.add(item);
        boolean z10 = this.otherGuests.size() == 0;
        if (this.selectAllViewItem.getSelected() != z10) {
            this.selectAllViewItem.setSelected(z10);
        }
        int iIndexOf = this.items.indexOf(item);
        int i10 = iIndexOf + 1;
        if (this.items.size() <= i10) {
            i10 = iIndexOf - 1;
        }
        if (list.size() == 0) {
            i10--;
        }
        updateList();
        dataSetChanged();
        String string$default = selected ? VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyGuestAddedAccessibility, MapsKt.mapOf(TuplesKt.m92045to("name", this.linkedGuestUtils.accessibilityName(item.getGuest(), this.vqThemer)), TuplesKt.m92045to("group", VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyYourPartyHeader, null, false, 6, null))), null, false, 12, null) : VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyGuestRemovedAccessibility, MapsKt.mapOf(TuplesKt.m92045to("name", this.linkedGuestUtils.accessibilityName(item.getGuest(), this.vqThemer)), TuplesKt.m92045to("group", VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyYourPartyHeader, null, false, 6, null))), null, false, 12, null);
        boolean z11 = this.items.indexOf(this.maxPartyAlertViewItem) == -1;
        boolean z12 = this.items.indexOf(this.anyoneElseViewItem) == -1;
        int iIndexOf2 = this.items.indexOf(this.anyoneElseViewItem);
        if (!z11) {
            AccessibleRecyclerViewItem.makeAccessibilityFocusRequest$default(this.items.get(iIndexOf2 + 1), null, 1, null);
        } else if (z12) {
            this.items.get(this.items.indexOf(this.yourPartyViewItem)).makeAccessibilityFocusRequest(string$default);
        } else if (iIndexOf2 != -1) {
            this.items.get(iIndexOf2).makeAccessibilityFocusRequest(string$default);
        } else {
            this.items.get(i10).makeAccessibilityFocusRequest(string$default);
        }
        CreatePartyActions createPartyActions = this.actions;
        if (createPartyActions != null) {
            createPartyActions.toggledGuestSelection(selected);
        }
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.SelectAllAdapter.SelectAllActions, com.disney.wdpro.virtualqueue.ui.common.SelectLinkedGuestAdapter.SelectLinkedGuestActions
    public boolean hasReachedMaxParty() {
        return this.guestsInParty.size() >= this.maxPartySize;
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.SectionHeaderAdapter.SectionHeaderActions
    public boolean isGuestSelected() {
        return this.guestsInParty.size() > 0;
    }

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    public boolean isHeader(int position) {
        return isStickyHeader(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        showLoading(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyLoading, null, false, 6, null));
    }

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    public void onBindHeaderViewHolder(RecyclerView.AbstractC4902e0 viewHolder, int viewType) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        InterfaceC9233g stickyHeaderItem = getStickyHeaderItem(viewType);
        if (stickyHeaderItem != null) {
            Object objM5316e = this.delegateAdapters.m5316e(stickyHeaderItem.getViewType());
            Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter<androidx.recyclerview.widget.RecyclerView.ViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
            ((ViewTypeStickyHeaderDelegateAdapter) objM5316e).onBindViewHolder(viewHolder, stickyHeaderItem);
        }
    }

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    public void onBindStickyHeaderViewHolder(RecyclerView.AbstractC4902e0 viewHolder, int viewType) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        InterfaceC9233g stickyHeaderItem = getStickyHeaderItem(viewType);
        if (stickyHeaderItem != null) {
            Object objM5316e = this.delegateAdapters.m5316e(stickyHeaderItem.getViewType());
            Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter<androidx.recyclerview.widget.RecyclerView.ViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
            ((ViewTypeStickyHeaderDelegateAdapter) objM5316e).onBindStickyHeaderViewHolder(viewHolder, stickyHeaderItem);
        }
    }

    @Override // com.disney.wdpro.virtualqueue.ui.create_party.LinkTicketAdapter.LinkTicketActions
    public void onLinkTicketClicked() {
        CreatePartyActions createPartyActions = this.actions;
        if (createPartyActions != null) {
            createPartyActions.showLinkTicket();
        }
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.SelectAllAdapter.SelectAllActions
    public void onSelectAllStateChange(boolean selected) {
        if (selected) {
            this.guestsInParty.addAll(this.otherGuests);
            this.otherGuests.clear();
        } else {
            this.otherGuests.addAll(this.guestsInParty);
            this.guestsInParty.clear();
        }
        updateList();
        dataSetChanged();
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m92045to("group", VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyYourPartyHeader, null, false, 6, null)));
        this.selectAllViewItem.makeAccessibilityFocusRequest(selected ? VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CommonAllGuestsAddedAccessibility, mapMapOf, null, false, 12, null) : VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CommonAllGuestsRemovedAccessibility, mapMapOf, null, false, 12, null));
        CreatePartyActions createPartyActions = this.actions;
        if (createPartyActions != null) {
            createPartyActions.toggledSelectAll(selected);
        }
    }

    public final void setAnonymousPartySizeViewItem$virtual_queue_lib_release(AnonymousPartySizeAdapter.AnonymousPartySizeViewItem anonymousPartySizeViewItem) {
        Intrinsics.checkNotNullParameter(anonymousPartySizeViewItem, "<set-?>");
        this.anonymousPartySizeViewItem = anonymousPartySizeViewItem;
    }

    public final void setEligibleGuestCount$virtual_queue_lib_release(int i10) {
        this.eligibleGuestCount = i10;
    }

    public final void setGuests(List<LinkedGuest> partyLinkedGuests, List<LinkedGuest> otherLinkedGuests, List<LinkedGuest> notEligibleGuests) {
        this.guestsInParty.clear();
        this.otherGuests.clear();
        this.ineligibleGuests.clear();
        if (partyLinkedGuests != null) {
            Iterator<LinkedGuest> it = partyLinkedGuests.iterator();
            while (it.hasNext()) {
                this.guestsInParty.add(new SelectLinkedGuestAdapter.SelectLinkedGuestViewItem(it.next(), 0, 0));
            }
        }
        if (otherLinkedGuests != null) {
            Iterator<LinkedGuest> it2 = otherLinkedGuests.iterator();
            while (it2.hasNext()) {
                this.otherGuests.add(new SelectLinkedGuestAdapter.SelectLinkedGuestViewItem(it2.next(), 0, 0));
            }
        }
        if (notEligibleGuests != null) {
            Iterator<LinkedGuest> it3 = notEligibleGuests.iterator();
            while (it3.hasNext()) {
                this.ineligibleGuests.add(new IneligibleGuestAdapter.IneligibleGuestViewItem(it3.next(), 0, 0, 6, null));
            }
        }
        this.selectAllViewItem.setSelected(this.otherGuests.isEmpty());
        updateList();
        dataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setQueueNameHeader(com.disney.wdpro.virtualqueue.service.model.Queue r11, java.lang.String r12, boolean r13, java.lang.String r14) {
        /*
            r10 = this;
            java.lang.String r0 = "queue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "dScribeHeight"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "formattedDisplay"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            com.disney.wdpro.virtualqueue.ui.create_party.QueueNameAdapter$QueueNameViewItem r0 = r10.queueNameViewItem
            java.lang.String r1 = r11.getName()
            r0.setQueueName(r1)
            com.disney.wdpro.virtualqueue.ui.common.FacilityUtils r0 = r10.facilityUtils
            java.lang.String r1 = r11.getExternalDefinitionId()
            com.disney.wdpro.facility.model.Facility r0 = r0.getFacility(r1)
            java.lang.String r0 = r10.setupHeightRestrictions(r0, r11)
            com.disney.wdpro.virtualqueue.ui.create_party.QueueNameAdapter$QueueNameViewItem r1 = r10.queueNameViewItem
            java.lang.String r2 = "no-height"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r2)
            java.lang.String r3 = ""
            if (r2 == 0) goto L34
        L32:
            r12 = r3
            goto L42
        L34:
            int r2 = r12.length()
            if (r2 <= 0) goto L3b
            goto L42
        L3b:
            boolean r12 = kotlin.text.StringsKt.isBlank(r0)
            if (r12 != 0) goto L32
            r12 = r0
        L42:
            r1.setHeightRestrictions(r12)
            if (r13 != 0) goto L65
            com.disney.wdpro.virtualqueue.ui.create_party.QueueNameAdapter$QueueNameViewItem r12 = r10.queueNameViewItem
            java.lang.String r13 = r11.getHowToEnterMessage()
            r12.setHowToEnterDescription(r13)
            com.disney.wdpro.virtualqueue.ui.create_party.QueueNameAdapter$QueueNameViewItem r12 = r10.queueNameViewItem
            com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer r4 = r10.vqThemer
            com.disney.wdpro.virtualqueue.themer.VQStringType r5 = com.disney.wdpro.virtualqueue.themer.VQStringType.SelectQueueHowToEnterTitle
            java.lang.String r6 = r11.getContentId()
            r8 = 4
            r9 = 0
            r7 = 0
            java.lang.String r13 = com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer.getString$default(r4, r5, r6, r7, r8, r9)
            r12.setHowToEnterHeader(r13)
            goto L6f
        L65:
            com.disney.wdpro.virtualqueue.ui.create_party.QueueNameAdapter$QueueNameViewItem r12 = r10.queueNameViewItem
            r12.setHowToEnterDescription(r3)
            com.disney.wdpro.virtualqueue.ui.create_party.QueueNameAdapter$QueueNameViewItem r12 = r10.queueNameViewItem
            r12.setHowToEnterHeader(r3)
        L6f:
            int r12 = r11.getMaxPartySize()
            r10.maxPartySize = r12
            com.disney.wdpro.virtualqueue.ui.create_party.QueueNameAdapter$QueueNameViewItem r12 = r10.queueNameViewItem
            java.lang.String r13 = r10.setupQueueParkName(r11)
            if (r13 != 0) goto L7e
            goto L7f
        L7e:
            r3 = r13
        L7f:
            r12.setVqParkName(r3)
            r10.setupQueueSubpark(r11)
            com.disney.wdpro.virtualqueue.ui.create_party.QueueNameAdapter$QueueNameViewItem r11 = r10.queueNameViewItem
            com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer r0 = r10.vqThemer
            com.disney.wdpro.virtualqueue.themer.VQStringType r1 = com.disney.wdpro.virtualqueue.themer.VQStringType.ReviewDetailsValidOn
            java.lang.String r10 = "date"
            kotlin.Pair r10 = kotlin.TuplesKt.m92045to(r10, r14)
            java.util.Map r2 = kotlin.collections.MapsKt.mapOf(r10)
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            java.lang.String r10 = com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer.getString$default(r0, r1, r2, r3, r4, r5, r6)
            r11.setValidOnDate(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.virtualqueue.p462ui.create_party.CreatePartyMainAdapter.setQueueNameHeader(com.disney.wdpro.virtualqueue.service.model.Queue, java.lang.String, boolean, java.lang.String):void");
    }

    public final void setTotalGuests(int maxAnonymousPartySize) {
        this.anonymousPartySizeViewItem.setMaxPartySize(maxAnonymousPartySize);
        this.anonymousPartySizeViewItem.setWarningText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CreatePartyWarningDetail, MapsKt.mapOf(TuplesKt.m92045to("maxGuests", String.valueOf(maxAnonymousPartySize))), null, false, 12, null));
        this.items.clear();
        this.items.add(this.queueNameViewItem);
        this.items.add(this.anonymousPartySizeViewItem);
        dataSetChanged();
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.SelectAllAdapter.SelectAllActions
    public boolean shouldEnableSelectAll() {
        return this.maxPartySize >= this.eligibleGuestCount;
    }

    public final void showLoading(String loadingString) {
        Intrinsics.checkNotNullParameter(loadingString, "loadingString");
        this.items.clear();
        this.loadingViewItem.setLoadingString(loadingString);
        this.items.add(this.loadingViewItem);
        dataSetChanged();
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.AnonymousPartySizeAdapter.AnonymousPartySizeActions
    public void updateClosedQueueMessage(TextView minus, TextView plus, LinearLayout warningLayout) {
        Intrinsics.checkNotNullParameter(minus, "minus");
        Intrinsics.checkNotNullParameter(plus, "plus");
        Intrinsics.checkNotNullParameter(warningLayout, "warningLayout");
        CreatePartyActions createPartyActions = this.actions;
        if (createPartyActions != null) {
            createPartyActions.closedQuMessage(minus, plus, warningLayout);
        }
    }

    public final void updateGuestConflicts(List<Conflict> conflicts, Queue queue, String parkName) {
        Object next;
        Intrinsics.checkNotNullParameter(conflicts, "conflicts");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(parkName, "parkName");
        this.guestItemsInConflict.clear();
        for (Conflict conflict : conflicts) {
            for (String str : conflict.getGuestIds()) {
                Iterator<T> it = this.ineligibleGuests.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.areEqual(((IneligibleGuestAdapter.IneligibleGuestViewItem) next).getGuest().getGuestId(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                IneligibleGuestAdapter.IneligibleGuestViewItem ineligibleGuestViewItem = (IneligibleGuestAdapter.IneligibleGuestViewItem) next;
                if (ineligibleGuestViewItem != null) {
                    ineligibleGuestViewItem.setDetailString(this.vqThemer.getDetailForConflict(conflict.getConflictType(), queue, parkName, true));
                    this.guestItemsInConflict.add(ineligibleGuestViewItem);
                }
            }
        }
    }

    public final void updateMaxPartySize(int maxPartySize) {
        if (this.anonymousPartySizeViewItem.getPartySize() > maxPartySize) {
            this.anonymousPartySizeViewItem.setPartySize(maxPartySize);
        }
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.AnonymousPartySizeAdapter.AnonymousPartySizeActions
    public void updatePartySize(int partySize) {
        CreatePartyActions createPartyActions = this.actions;
        if (createPartyActions != null) {
            createPartyActions.updateAnonymousPartySize(partySize);
        }
    }

    public CreatePartyMainAdapter(Context context, CreatePartyActions createPartyActions, VirtualQueueThemer vqThemer, boolean z10, LinkedGuestUtils linkedGuestUtils, C9314j parkAppConfiguration, FacilityUtils facilityUtils, SelectLinkedGuestAdapter.Factory selectLinkedGuestAdapterFactory, IneligibleGuestAdapter.Factory ineligibleGuestAdapterFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
        Intrinsics.checkNotNullParameter(selectLinkedGuestAdapterFactory, "selectLinkedGuestAdapterFactory");
        Intrinsics.checkNotNullParameter(ineligibleGuestAdapterFactory, "ineligibleGuestAdapterFactory");
        this.context = context;
        this.actions = createPartyActions;
        this.vqThemer = vqThemer;
        this.selectGuestsInParty = z10;
        this.linkedGuestUtils = linkedGuestUtils;
        this.parkAppConfiguration = parkAppConfiguration;
        this.facilityUtils = facilityUtils;
        this.nextHeaderOffset = context.getResources().getDimensionPixelOffset(C21487R.dimen.vq_shadow_height) + context.getResources().getDimensionPixelOffset(C21487R.dimen.vq_hr_height);
        ArrayList arrayListM69268i = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i, "newArrayList()");
        this.items = arrayListM69268i;
        this.guestItemsInConflict = new ArrayList();
        ArrayList arrayListM69268i2 = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i2, "newArrayList()");
        this.guestsInParty = arrayListM69268i2;
        ArrayList arrayListM69268i3 = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i3, "newArrayList()");
        this.otherGuests = arrayListM69268i3;
        ArrayList arrayListM69268i4 = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i4, "newArrayList()");
        this.ineligibleGuests = arrayListM69268i4;
        C1176t0<Object> c1176t0 = new C1176t0<>(0, 1, null);
        this.delegateAdapters = c1176t0;
        QueueNameAdapter.QueueNameViewItem queueNameViewItem = new QueueNameAdapter.QueueNameViewItem(10034);
        this.queueNameViewItem = queueNameViewItem;
        this.anonymousPartySizeViewItem = new AnonymousPartySizeAdapter.AnonymousPartySizeViewItem(10006, 1, 1, VirtualQueueThemer.getString$default(vqThemer, VQStringType.CreatePartyInstructionalDetail, null, false, 6, null), VirtualQueueThemer.getString$default(vqThemer, VQStringType.CreatePartyTotalGuestsHeader, null, false, 6, null));
        SelectAllAdapter.SelectAllViewType selectAllViewType = new SelectAllAdapter.SelectAllViewType();
        this.selectAllViewItem = selectAllViewType;
        SectionHeaderAdapter.SectionHeaderViewItem sectionHeaderViewItem = new SectionHeaderAdapter.SectionHeaderViewItem(10030, VirtualQueueThemer.getString$default(vqThemer, VQStringType.CreatePartyYourPartyHeader, null, false, 6, null));
        this.yourPartyViewItem = sectionHeaderViewItem;
        SectionHeaderAdapter.SectionHeaderViewItem sectionHeaderViewItem2 = new SectionHeaderAdapter.SectionHeaderViewItem(10033, VirtualQueueThemer.getString$default(vqThemer, VQStringType.CreatePartyNotInPartyHeader, null, false, 6, null));
        this.anyoneElseViewItem = sectionHeaderViewItem2;
        SectionHeaderAdapter.SectionHeaderViewItem sectionHeaderViewItem3 = new SectionHeaderAdapter.SectionHeaderViewItem(10037, "");
        this.maxPartyAlertViewItem = sectionHeaderViewItem3;
        SectionHeaderAdapter.SectionHeaderViewItem sectionHeaderViewItem4 = new SectionHeaderAdapter.SectionHeaderViewItem(10035, VirtualQueueThemer.getString$default(vqThemer, VQStringType.CreatePartyNotEligibleHeader, null, false, 6, null));
        this.notEligibleViewItem = sectionHeaderViewItem4;
        LinkTicketAdapter.LinkTicketViewType linkTicketViewType = new LinkTicketAdapter.LinkTicketViewType();
        this.linkTicketViewItem = linkTicketViewType;
        LoadingAdapter.LoadingViewType loadingViewType = new LoadingAdapter.LoadingViewType(null, 1, 0 == true ? 1 : 0);
        this.loadingViewItem = loadingViewType;
        DetailAdapter.DetailViewItem detailViewItem = new DetailAdapter.DetailViewItem(10031, null, VirtualQueueThemer.getString$default(vqThemer, VQStringType.CreatePartyEmptyListDetail, null, false, 6, null), null, 10, null);
        this.emptyListViewItem = detailViewItem;
        c1176t0.m5321k(loadingViewType.getViewType(), new LoadingAdapter(LoadingAdapter.LoadingStyleUI.COMMON_LOADING, context, vqThemer));
        c1176t0.m5321k(queueNameViewItem.getViewType(), new QueueNameAdapter(vqThemer));
        c1176t0.m5321k(this.anonymousPartySizeViewItem.getViewType(), new AnonymousPartySizeAdapter(this, vqThemer));
        c1176t0.m5321k(selectAllViewType.getViewType(), new SelectAllAdapter(this, vqThemer));
        c1176t0.m5321k(sectionHeaderViewItem.getViewType(), new YourPartySectionHeaderAdapter(this, vqThemer));
        c1176t0.m5321k(detailViewItem.getViewType(), new DetailAdapter());
        c1176t0.m5321k(linkTicketViewType.getViewType(), new LinkTicketAdapter(this, vqThemer));
        c1176t0.m5321k(sectionHeaderViewItem2.getViewType(), new SectionHeaderAdapter(vqThemer, this));
        c1176t0.m5321k(sectionHeaderViewItem3.getViewType(), new MaxPartyAlertAdapter(this, vqThemer));
        c1176t0.m5321k(sectionHeaderViewItem4.getViewType(), new SectionHeaderAdapter(vqThemer, this));
        c1176t0.m5321k(10001, selectLinkedGuestAdapterFactory.create(context, this, vqThemer));
        c1176t0.m5321k(10036, ineligibleGuestAdapterFactory.create(context, vqThemer));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(AnimateRecyclerViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AccessibleRecyclerViewItem accessibleRecyclerViewItem = this.items.get(position);
        holder.setAnimate(true);
        Object objM5316e = this.delegateAdapters.m5316e(accessibleRecyclerViewItem.getViewType());
        Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.commons.adapter.DelegateAdapter<com.disney.wdpro.virtualqueue.ui.common.AnimateRecyclerViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
        ((InterfaceC9229c) objM5316e).onBindViewHolder(holder, accessibleRecyclerViewItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public AnimateRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Object objM5316e = this.delegateAdapters.m5316e(viewType);
        Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.commons.adapter.DelegateAdapter<com.disney.wdpro.virtualqueue.ui.common.AnimateRecyclerViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
        RecyclerView.AbstractC4902e0 abstractC4902e0OnCreateViewHolder = ((InterfaceC9229c) objM5316e).onCreateViewHolder(parent);
        Intrinsics.checkNotNullExpressionValue(abstractC4902e0OnCreateViewHolder, "adapter.onCreateViewHolder(parent)");
        return (AnimateRecyclerViewHolder) abstractC4902e0OnCreateViewHolder;
    }
}