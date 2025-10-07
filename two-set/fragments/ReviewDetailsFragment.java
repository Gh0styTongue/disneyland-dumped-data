package com.disney.wdpro.virtualqueue.core.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.AbstractC3694e0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C3816t;
import androidx.view.C3821v0;
import androidx.view.C3827w0;
import androidx.view.InterfaceC3814s;
import apptentive.com.android.feedback.enjoyment.EnjoymentDialogViewModel;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.monitor.InterfaceC9336k;
import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.facility.model.FacilityFacet;
import com.disney.wdpro.facilityui.fragments.detail.FinderDetailFragment;
import com.disney.wdpro.support.anim.SnowballNextFlowAnimation;
import com.disney.wdpro.support.dialog.ErrorBannerFragment;
import com.disney.wdpro.support.ftue.C20751b;
import com.disney.wdpro.support.widget.SnowballHeader;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrBaseContainer;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrDisneyContainer;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.VirtualQueueStackActivity;
import com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import com.disney.wdpro.virtualqueue.core.interfaces.QueueStateManagement;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingAttribute;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingEventName;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingScreenName;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentReviewDetailsBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.CommonExtensionsKt;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegate;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegateKt;
import com.disney.wdpro.virtualqueue.p462ui.common.LottieLoader;
import com.disney.wdpro.virtualqueue.p462ui.common.SingleLiveEvent;
import com.disney.wdpro.virtualqueue.p462ui.common.VQPageType;
import com.disney.wdpro.virtualqueue.p462ui.create_party.CreatePartyMainAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyListAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PtrMyQueuesHeader;
import com.disney.wdpro.virtualqueue.service.model.Conflict;
import com.disney.wdpro.virtualqueue.service.model.GetLinkedGuestsRequestType;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.JoinQueueErrorResponse;
import com.disney.wdpro.virtualqueue.service.model.JoinQueueErrorResponseStatus;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.google.common.collect.Lists;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C30069i0;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.InterfaceC30065h0;
import p498da.InterfaceC27132a;
import p708ko.InterfaceC29611b;
import p860q1.C31640h;

@Metadata(m92037d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Ô\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002Ô\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u001d\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u0019J-\u0010!\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0011H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0005J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0005J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\u0005J\u0019\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010\u0005J\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\u0005J\u000f\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u0010\u0005J\u000f\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u0010\u0005J\u0017\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\b8\u0010\rJ\u0017\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u00020,H\u0002¢\u0006\u0004\b:\u0010;J-\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010=\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010>2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bC\u0010DJ!\u0010F\u001a\u00020\u00062\u0006\u0010E\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0006H\u0016¢\u0006\u0004\bJ\u0010\u0005J\u000f\u0010K\u001a\u00020\u0006H\u0016¢\u0006\u0004\bK\u0010\u0005J\u000f\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\bN\u0010OR\"\u0010Q\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010X\u001a\u00020W8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010_\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010f\u001a\u00020e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010m\u001a\u00020l8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010t\u001a\u00020s8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR#\u0010{\u001a\u00020z8\u0006@\u0006X\u0087.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R*\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R#\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0096\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001a\u0010 \u0001\u001a\u00030\u009f\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001a\u0010£\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0019\u0010¥\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010§\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0019\u0010©\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010¨\u0001R\u0019\u0010ª\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010¦\u0001R\u0019\u0010«\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¨\u0001R\u0019\u0010¬\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010¨\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010¦\u0001R\u0019\u0010®\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¦\u0001R\u0019\u0010¯\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010¦\u0001R\u0019\u0010°\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010¦\u0001R\u0019\u0010±\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010¦\u0001R\u0019\u0010²\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010¦\u0001R\u0019\u0010³\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010¦\u0001R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010´\u0001R\u001f\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010´\u0001R\u001f\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010´\u0001R\u001f\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010´\u0001R\u001f\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010´\u0001R\u001f\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010´\u0001R\u0017\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b%\u0010º\u0001R\u0019\u0010»\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¦\u0001R\u0019\u0010¼\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010¦\u0001R\u0019\u0010½\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¨\u0001R\u0019\u0010¾\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010À\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010¨\u0001R\u0019\u0010Á\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010¨\u0001R!\u0010Ç\u0001\u001a\u00030Â\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001R7\u0010Ê\u0001\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0005\u0012\u00030É\u00010È\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R\u0018\u0010Ó\u0001\u001a\u00030Ð\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001¨\u0006Õ\u0001"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/ReviewDetailsFragment;", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueBaseFragment;", "Lda/a;", "Lkotlinx/coroutines/h0;", "<init>", "()V", "", "loadLinkedTickets", "observeViewModel", "adjustPtrState", "", "isEnabled", "updateIsPtrEnabled", "(Z)V", "handleQueueOpen", "startSoftRefresh", "finishSoftRefresh", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "selectedGuests", "joinQueue", "(Ljava/util/List;)V", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "response", "onJoinQueueSuccess", "(Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;)V", "Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponse;", "errorResponse", "onJoinQueueError", "(Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponse;)V", "showConfirmation", "Lcom/disney/wdpro/virtualqueue/service/model/Conflict;", "initialConflicts", "showConflictScreen", "(Ljava/util/List;Ljava/util/List;)V", "setupUI", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "setupQueueSubpark", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "setRefreshMessage", "setupQueueState", "Lcom/disney/wdpro/facility/model/Facility;", FinderDetailFragment.FACILITY_PARAM, "", "setupHeightRestrictions", "(Lcom/disney/wdpro/facility/model/Facility;)Ljava/lang/String;", "showQueueClosedErrorMessage", "showSoftRefreshError", "showGenericErrorMessage", "showTryAgainErrorMessage", "", "maxParty", "showMaxPartySizeExceededErrorMessage", "(I)V", "clearHistory", "showCreateParty", "textToAnnounce", "sendAnnouncementEvent", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onActivityCreated", "(Landroid/os/Bundle;)V", "onResume", "onDestroy", "onBackPressed", "()Z", "setupQueuePark", "(Lcom/disney/wdpro/facility/model/Facility;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "virtualQueueManager", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "getVirtualQueueManager", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "setVirtualQueueManager", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "getVirtualQueueAnalytics", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "setVirtualQueueAnalytics", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "performanceTracking", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "getPerformanceTracking", "()Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "setPerformanceTracking", "(Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;)V", "Lcom/disney/wdpro/commons/monitor/k;", "locationMonitor", "Lcom/disney/wdpro/commons/monitor/k;", "getLocationMonitor", "()Lcom/disney/wdpro/commons/monitor/k;", "setLocationMonitor", "(Lcom/disney/wdpro/commons/monitor/k;)V", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/commons/j;", "getParkAppConfiguration", "()Lcom/disney/wdpro/commons/j;", "setParkAppConfiguration", "(Lcom/disney/wdpro/commons/j;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "getFacilityUtils", "()Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "setFacilityUtils", "(Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;)V", "Landroidx/lifecycle/v0$c;", "viewModelFactory", "Landroidx/lifecycle/v0$c;", "getViewModelFactory", "()Landroidx/lifecycle/v0$c;", "setViewModelFactory", "(Landroidx/lifecycle/v0$c;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;", "queueStateManagement", "Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;", "getQueueStateManagement", "()Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;", "setQueueStateManagement", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;)V", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;", "partyListAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;", "getPartyListAdapterFactory", "()Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;", "setPartyListAdapterFactory", "(Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;)V", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$Factory;", "createPartyMainAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$Factory;", "getCreatePartyMainAdapterFactory", "()Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$Factory;", "setCreatePartyMainAdapterFactory", "(Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$Factory;)V", "Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentReviewDetailsBinding;", "binding$delegate", "Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentReviewDetailsBinding;", "binding", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter;", "partyAdapter", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter;", "ineligibleAdapter", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader;", "headerView", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader;", "fromHubLanding", "Z", "queueId", "Ljava/lang/String;", "completionDeepLink", "isDeepLinkedFlow", "heightRes", "queueOpenTime", "isDifferentJoinWindow", "maxPartyChanged", "suppressClose", "isInitialLoad", "shouldRefreshUI", "maxPartySizeReached", VirtualQueueConstants.ORIGINATED_FROM_DEEPLINK_PARAM, "Ljava/util/List;", "ineligiblePartyGuests", "conflictedGuests", "unselectedGuests", "allGuests", "conflicts", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "isOnboarded", "noLinkedGuests", "currentJoinWindowIdHash", "currentMaxParty", "I", "nextStepsMessage", "correlationId", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel;", "partyViewModel$delegate", "Lkotlin/Lazy;", "getPartyViewModel", "()Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel;", "partyViewModel", "", "", "eventAttributes", "Ljava/util/Map;", "getEventAttributes", "()Ljava/util/Map;", "setEventAttributes", "(Ljava/util/Map;)V", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class ReviewDetailsFragment extends VirtualQueueBaseFragment implements InterfaceC27132a, InterfaceC30065h0 {
    private static final long FINISH_PTR_DELAY = 2000;

    @Inject
    public CreatePartyMainAdapter.Factory createPartyMainAdapterFactory;
    private int currentMaxParty;

    @Inject
    public FacilityUtils facilityUtils;
    private boolean fromHubLanding;
    private PtrMyQueuesHeader headerView;
    private CreatePartyMainAdapter ineligibleAdapter;
    private boolean isDeepLinkedFlow;
    private boolean isDifferentJoinWindow;
    private boolean isOnboarded;

    @Inject
    public InterfaceC9336k locationMonitor;
    private boolean maxPartyChanged;
    private boolean maxPartySizeReached;
    private boolean noLinkedGuests;
    private boolean originatedFromDeeplink;

    @Inject
    public C9314j parkAppConfiguration;
    private PartyListAdapter partyAdapter;

    @Inject
    public PartyListAdapter.Factory partyListAdapterFactory;

    @Inject
    public PerformanceTracking performanceTracking;

    @Inject
    public QueueStateManagement queueStateManagement;
    private boolean shouldRefreshUI;
    private boolean suppressClose;

    @Inject
    public C3821v0.c viewModelFactory;

    @Inject
    public VirtualQueueAnalytics virtualQueueAnalytics;

    @Inject
    public VirtualQueueManager virtualQueueManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ReviewDetailsFragment.class, "binding", "getBinding()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentReviewDetailsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ InterfaceC30065h0 $$delegate_0 = C30069i0.m92781b();

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding = FragmentViewBindingDelegateKt.viewBinding(this, ReviewDetailsFragment$binding$2.INSTANCE);
    private String queueId = "";
    private String completionDeepLink = "";
    private String heightRes = "";
    private String queueOpenTime = "";
    private boolean isInitialLoad = true;
    private List<LinkedGuest> selectedGuests = CollectionsKt.emptyList();
    private List<LinkedGuest> ineligiblePartyGuests = CollectionsKt.emptyList();
    private List<LinkedGuest> conflictedGuests = CollectionsKt.emptyList();
    private List<LinkedGuest> unselectedGuests = CollectionsKt.emptyList();
    private List<LinkedGuest> allGuests = CollectionsKt.emptyList();
    private List<Conflict> conflicts = CollectionsKt.emptyList();
    private Queue queue = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
    private String currentJoinWindowIdHash = "";
    private String nextStepsMessage = "";
    private String correlationId = "";

    /* renamed from: partyViewModel$delegate, reason: from kotlin metadata */
    private final Lazy partyViewModel = LazyKt.lazy(new Function0<PartyViewModel>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment$partyViewModel$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PartyViewModel invoke() {
            return (PartyViewModel) C3827w0.m20290f(this.this$0.requireActivity(), this.this$0.getViewModelFactory()).m20262a(PartyViewModel.class);
        }
    });
    private Map<String, Object> eventAttributes = new LinkedHashMap();

    @Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/ReviewDetailsFragment$Companion;", "", "()V", "FINISH_PTR_DELAY", "", "newInstance", "Lcom/disney/wdpro/virtualqueue/core/fragments/ReviewDetailsFragment;", "data", "Landroid/os/Bundle;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReviewDetailsFragment newInstance(Bundle data) {
            ReviewDetailsFragment reviewDetailsFragment = new ReviewDetailsFragment();
            reviewDetailsFragment.setArguments(data);
            return reviewDetailsFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JoinQueueErrorResponseStatus.values().length];
            try {
                iArr[JoinQueueErrorResponseStatus.INVALID_GUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JoinQueueErrorResponseStatus.PAUSED_QUEUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JoinQueueErrorResponseStatus.CLOSED_QUEUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JoinQueueErrorResponseStatus.MAX_PARTY_SIZE_EXCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment$finishSoftRefresh$1", m92053f = "ReviewDetailsFragment.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    @SourceDebugExtension({"SMAP\nReviewDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewDetailsFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/ReviewDetailsFragment$finishSoftRefresh$1\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,1012:1\n17#2:1013\n*S KotlinDebug\n*F\n+ 1 ReviewDetailsFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/ReviewDetailsFragment$finishSoftRefresh$1\n*L\n493#1:1013\n*E\n"})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment$finishSoftRefresh$1 */
    static final class C215801 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C215801(Continuation<? super C215801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReviewDetailsFragment.this.new C215801(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ConstraintLayout root;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            VqFragmentReviewDetailsBinding binding = ReviewDetailsFragment.this.getBinding();
            if (binding != null && (root = binding.getRoot()) != null) {
                final ReviewDetailsFragment reviewDetailsFragment = ReviewDetailsFragment.this;
                Boxing.boxBoolean(root.postDelayed(new Runnable() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment$finishSoftRefresh$1$invokeSuspend$$inlined$Runnable$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecyclerView recyclerView;
                        Button button;
                        Button button2;
                        RecyclerView recyclerView2;
                        Button button3;
                        if (CommonExtensionsKt.isSafe(reviewDetailsFragment)) {
                            if (reviewDetailsFragment.maxPartySizeReached) {
                                VqFragmentReviewDetailsBinding binding2 = reviewDetailsFragment.getBinding();
                                TextView textView = binding2 != null ? binding2.yourPartyAlertText : null;
                                if (textView != null) {
                                    textView.setText(VirtualQueueThemer.getString$default(reviewDetailsFragment.getVqThemer(), VQStringType.ReviewDetailsMaxPartySizeExceeded, MapsKt.mapOf(TuplesKt.m92045to("maxPartySize", Integer.valueOf(reviewDetailsFragment.queue.getMaxPartySize()))), null, false, 12, null));
                                }
                            }
                            if (reviewDetailsFragment.queue.getIsAcceptingJoins()) {
                                VqFragmentReviewDetailsBinding binding3 = reviewDetailsFragment.getBinding();
                                Button button4 = binding3 != null ? binding3.continueButton : null;
                                if (button4 != null) {
                                    button4.setEnabled(!reviewDetailsFragment.selectedGuests.isEmpty());
                                }
                                VqFragmentReviewDetailsBinding binding4 = reviewDetailsFragment.getBinding();
                                ConstraintLayout constraintLayout = binding4 != null ? binding4.updateScreenContainer : null;
                                if (constraintLayout != null) {
                                    constraintLayout.setVisibility(8);
                                }
                                VqFragmentReviewDetailsBinding binding5 = reviewDetailsFragment.getBinding();
                                Button button5 = binding5 != null ? binding5.continueButton : null;
                                if (button5 != null) {
                                    button5.setVisibility(0);
                                }
                                VqFragmentReviewDetailsBinding binding6 = reviewDetailsFragment.getBinding();
                                if (binding6 != null && (button3 = binding6.continueButton) != null) {
                                    button3.sendAccessibilityEvent(8);
                                }
                                VqFragmentReviewDetailsBinding binding7 = reviewDetailsFragment.getBinding();
                                if (binding7 != null && (recyclerView2 = binding7.groupList) != null) {
                                    childAt = recyclerView2.getChildAt(0);
                                }
                                if (childAt == null) {
                                    return;
                                }
                                childAt.setImportantForAccessibility(1);
                                return;
                            }
                            if (reviewDetailsFragment.noLinkedGuests) {
                                VqFragmentReviewDetailsBinding binding8 = reviewDetailsFragment.getBinding();
                                ConstraintLayout constraintLayout2 = binding8 != null ? binding8.updateScreenContainer : null;
                                if (constraintLayout2 != null) {
                                    constraintLayout2.setVisibility(8);
                                }
                                VqFragmentReviewDetailsBinding binding9 = reviewDetailsFragment.getBinding();
                                Button button6 = binding9 != null ? binding9.refreshButton : null;
                                if (button6 != null) {
                                    button6.setEnabled(false);
                                }
                                VqFragmentReviewDetailsBinding binding10 = reviewDetailsFragment.getBinding();
                                childAt = binding10 != null ? binding10.refreshButton : null;
                                if (childAt != null) {
                                    childAt.setVisibility(0);
                                }
                                VqFragmentReviewDetailsBinding binding11 = reviewDetailsFragment.getBinding();
                                if (binding11 == null || (button2 = binding11.refreshButton) == null) {
                                    return;
                                }
                                button2.sendAccessibilityEvent(8);
                                return;
                            }
                            VqFragmentReviewDetailsBinding binding12 = reviewDetailsFragment.getBinding();
                            TextView textView2 = binding12 != null ? binding12.updateScreenWarningText : null;
                            if (textView2 != null) {
                                textView2.setText(reviewDetailsFragment.nextStepsMessage);
                            }
                            VqFragmentReviewDetailsBinding binding13 = reviewDetailsFragment.getBinding();
                            ConstraintLayout constraintLayout3 = binding13 != null ? binding13.updateScreenContainer : null;
                            if (constraintLayout3 != null) {
                                constraintLayout3.setVisibility(0);
                            }
                            VqFragmentReviewDetailsBinding binding14 = reviewDetailsFragment.getBinding();
                            Button button7 = binding14 != null ? binding14.refreshButton : null;
                            if (button7 != null) {
                                button7.setEnabled(true);
                            }
                            VqFragmentReviewDetailsBinding binding15 = reviewDetailsFragment.getBinding();
                            Button button8 = binding15 != null ? binding15.refreshButton : null;
                            if (button8 != null) {
                                button8.setVisibility(0);
                            }
                            VqFragmentReviewDetailsBinding binding16 = reviewDetailsFragment.getBinding();
                            if (binding16 != null && (button = binding16.refreshButton) != null) {
                                button.sendAccessibilityEvent(8);
                            }
                            VqFragmentReviewDetailsBinding binding17 = reviewDetailsFragment.getBinding();
                            if (binding17 != null && (recyclerView = binding17.groupList) != null) {
                                childAt = recyclerView.getChildAt(0);
                            }
                            if (childAt == null) {
                                return;
                            }
                            childAt.setImportantForAccessibility(1);
                        }
                    }
                }, 2000L));
            }
            VqFragmentReviewDetailsBinding binding2 = ReviewDetailsFragment.this.getBinding();
            Button button = binding2 != null ? binding2.partyHeaderCTAButton : null;
            if (button != null) {
                button.setEnabled(true);
            }
            VqFragmentReviewDetailsBinding binding3 = ReviewDetailsFragment.this.getBinding();
            Button button2 = binding3 != null ? binding3.ineligibleHeaderCTAButton : null;
            if (button2 != null) {
                button2.setEnabled(true);
            }
            VqFragmentReviewDetailsBinding binding4 = ReviewDetailsFragment.this.getBinding();
            Button button3 = binding4 != null ? binding4.partyHeaderCTAButton : null;
            if (button3 != null) {
                button3.setImportantForAccessibility(1);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215801) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment$observeViewModel$1", m92053f = "ReviewDetailsFragment.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment$observeViewModel$1 */
    static final class C215811 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C215811(Continuation<? super C215811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReviewDetailsFragment.this.new C215811(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SingleLiveEvent<PartyViewModel.UiState> state = ReviewDetailsFragment.this.getPartyViewModel().getState();
            InterfaceC3814s viewLifecycleOwner = ReviewDetailsFragment.this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
            final ReviewDetailsFragment reviewDetailsFragment = ReviewDetailsFragment.this;
            state.observe(viewLifecycleOwner, new ReviewDetailsFragment$sam$androidx_lifecycle_Observer$0(new Function1<PartyViewModel.UiState, Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment.observeViewModel.1.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PartyViewModel.UiState uiState) {
                    invoke2(uiState);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PartyViewModel.UiState it) {
                    PtrDisneyContainer ptrDisneyContainer;
                    PtrDisneyContainer ptrDisneyContainer2;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (it instanceof PartyViewModel.UiState.Error) {
                        VqFragmentReviewDetailsBinding binding = reviewDetailsFragment.getBinding();
                        if (binding != null && (ptrDisneyContainer2 = binding.pullToRefreshContainer) != null) {
                            ptrDisneyContainer2.m64009G();
                        }
                        reviewDetailsFragment.showGenericErrorMessage();
                        return;
                    }
                    if (!(it instanceof PartyViewModel.UiState.QueueOpen)) {
                        if (it instanceof PartyViewModel.UiState.JoinQueue) {
                            reviewDetailsFragment.onJoinQueueSuccess(((PartyViewModel.UiState.JoinQueue) it).getResponse());
                            return;
                        } else {
                            if (it instanceof PartyViewModel.UiState.JoinError) {
                                reviewDetailsFragment.onJoinQueueError(((PartyViewModel.UiState.JoinError) it).getErrorResponse());
                                return;
                            }
                            return;
                        }
                    }
                    PartyViewModel.UiState.QueueOpen queueOpen = (PartyViewModel.UiState.QueueOpen) it;
                    reviewDetailsFragment.noLinkedGuests = queueOpen.getAllGuests().isEmpty();
                    reviewDetailsFragment.selectedGuests = queueOpen.getSelectedGuests();
                    reviewDetailsFragment.ineligiblePartyGuests = queueOpen.getIneligiblePartyGuests();
                    reviewDetailsFragment.conflictedGuests = queueOpen.getConflictedGuests();
                    reviewDetailsFragment.unselectedGuests = queueOpen.getUnselectedGuests();
                    reviewDetailsFragment.allGuests = queueOpen.getAllGuests();
                    reviewDetailsFragment.queue = queueOpen.getQueue();
                    reviewDetailsFragment.isOnboarded = queueOpen.isOnboardedParty();
                    ReviewDetailsFragment reviewDetailsFragment2 = reviewDetailsFragment;
                    reviewDetailsFragment2.maxPartySizeReached = reviewDetailsFragment2.selectedGuests.size() >= reviewDetailsFragment.queue.getMaxPartySize();
                    reviewDetailsFragment.correlationId = queueOpen.getCorrelationId();
                    reviewDetailsFragment.conflicts = queueOpen.getConflicts();
                    reviewDetailsFragment.handleQueueOpen();
                    if (!reviewDetailsFragment.isInitialLoad) {
                        reviewDetailsFragment.setupUI();
                    }
                    VqFragmentReviewDetailsBinding binding2 = reviewDetailsFragment.getBinding();
                    if (binding2 != null && (ptrDisneyContainer = binding2.pullToRefreshContainer) != null) {
                        ptrDisneyContainer.m64009G();
                    }
                    reviewDetailsFragment.adjustPtrState();
                }
            }));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215811) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustPtrState() {
        if (this.noLinkedGuests) {
            updateIsPtrEnabled(false);
            return;
        }
        if (!this.queue.getIsAcceptingJoins() && this.queue.getIsAcceptingPartyCreation()) {
            updateIsPtrEnabled(true);
            return;
        }
        if (this.queue.getIsAcceptingJoins() && this.queue.getIsAcceptingPartyCreation()) {
            updateIsPtrEnabled(false);
        } else {
            if (this.queue.getIsAcceptingJoins() || this.queue.getIsAcceptingPartyCreation()) {
                return;
            }
            updateIsPtrEnabled(false);
        }
    }

    private final void finishSoftRefresh() {
        VqFragmentReviewDetailsBinding binding = getBinding();
        LinearLayout linearLayout = binding != null ? binding.launchingContainer : null;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (this.isDifferentJoinWindow || this.maxPartyChanged || this.shouldRefreshUI) {
            setupUI();
        }
        sendAnnouncementEvent(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsUpdated, null, false, 6, null));
        C30113j.m92948d(this, null, null, new C215801(null), 3, null);
        setRefreshMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VqFragmentReviewDetailsBinding getBinding() {
        return (VqFragmentReviewDetailsBinding) this.binding.getValue2((Fragment) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PartyViewModel getPartyViewModel() {
        return (PartyViewModel) this.partyViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleQueueOpen() {
        ConstraintLayout constraintLayout;
        if (this.isInitialLoad) {
            this.currentJoinWindowIdHash = this.queue.getJoinWindowIdHash();
            this.currentMaxParty = this.queue.getMaxPartySize();
        } else {
            if (!Intrinsics.areEqual(this.currentJoinWindowIdHash, this.queue.getJoinWindowIdHash())) {
                this.isDifferentJoinWindow = true;
            }
            if (this.currentMaxParty != this.queue.getMaxPartySize()) {
                this.maxPartyChanged = true;
            }
        }
        String nextScheduledOpenTime = this.queue.getNextScheduledOpenTime();
        this.queueOpenTime = getFacilityUtils().formatDisplayableTime(nextScheduledOpenTime);
        this.nextStepsMessage = (nextScheduledOpenTime == null || nextScheduledOpenTime.length() == 0) ? VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsUpdateScreenWarningMessageDefault, null, false, 6, null) : VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsUpdateScreenWarningMessage, MapsKt.mapOf(TuplesKt.m92045to("time", this.queueOpenTime)), null, false, 12, null);
        if (!this.isInitialLoad) {
            if (this.queue.getIsAcceptingPartyCreation()) {
                if (CommonExtensionsKt.isSafe(this)) {
                    finishSoftRefresh();
                    return;
                }
                return;
            } else {
                VqFragmentReviewDetailsBinding binding = getBinding();
                TextView textView = binding != null ? binding.updateScreenWarningText : null;
                if (textView != null) {
                    textView.setText(this.nextStepsMessage);
                }
                showQueueClosedErrorMessage();
                return;
            }
        }
        setupUI();
        String string$default = !this.unselectedGuests.isEmpty() ? VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsIneligibleGuestsWarningText, null, false, 6, null) : "";
        VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
        List<LinkedGuest> list = this.allGuests;
        int size = this.selectedGuests.size();
        Queue queue = this.queue;
        String simpleName = ReviewDetailsFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass\n                    .simpleName");
        virtualQueueAnalytics.trackReviewDetailsLoad(list, size, queue, string$default, simpleName);
        this.eventAttributes.put(PerformanceTrackingAttribute.LINKED_GUESTS.getAttrName(), Integer.valueOf(this.allGuests.size()));
        this.eventAttributes.put(PerformanceTrackingAttribute.SELECTED_GUESTS_START.getAttrName(), Integer.valueOf(this.selectedGuests.size()));
        this.eventAttributes.put(PerformanceTrackingAttribute.UNSELECTED_GUESTS_START.getAttrName(), Integer.valueOf(this.unselectedGuests.size()));
        VqFragmentReviewDetailsBinding binding2 = getBinding();
        if (binding2 != null && (constraintLayout = binding2.reviewContainer) != null) {
            PerformanceTracking.logLoadTime$default(getPerformanceTracking(), PerformanceTrackingScreenName.REVIEW_DETAILS_SCREEN, constraintLayout, this.correlationId, false, false, 16, null);
        }
        getPerformanceTracking().logTimedActionStart(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void joinQueue(List<LinkedGuest> selectedGuests) {
        VqFragmentReviewDetailsBinding binding = getBinding();
        Button button = binding != null ? binding.continueButton : null;
        if (button != null) {
            button.setEnabled(false);
        }
        VqFragmentReviewDetailsBinding binding2 = getBinding();
        TextView textView = binding2 != null ? binding2.fullLoaderText : null;
        if (textView != null) {
            textView.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.CreatePartyJoinLoading, null, false, 6, null));
        }
        VqFragmentReviewDetailsBinding binding3 = getBinding();
        LinearLayout linearLayout = binding3 != null ? binding3.fullLoaderContainer : null;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        VqFragmentReviewDetailsBinding binding4 = getBinding();
        LinearLayout linearLayout2 = binding4 != null ? binding4.reviewDetailsScrollContainer : null;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        ArrayList guestIds = Lists.m69268i();
        Iterator<LinkedGuest> it = selectedGuests.iterator();
        while (it.hasNext()) {
            guestIds.add(it.next().getGuestId());
        }
        getVirtualQueueAnalytics().trackGetInLine(this.allGuests, this.queue, selectedGuests.size());
        PartyViewModel partyViewModel = getPartyViewModel();
        String str = this.queueId;
        Intrinsics.checkNotNullExpressionValue(guestIds, "guestIds");
        partyViewModel.onJoinQueue(str, guestIds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadLinkedTickets() {
        VqFragmentReviewDetailsBinding binding = getBinding();
        Button button = binding != null ? binding.continueButton : null;
        if (button != null) {
            button.setEnabled(false);
        }
        VqFragmentReviewDetailsBinding binding2 = getBinding();
        Button button2 = binding2 != null ? binding2.refreshButton : null;
        if (button2 != null) {
            button2.setEnabled(false);
        }
        VqFragmentReviewDetailsBinding binding3 = getBinding();
        Button button3 = binding3 != null ? binding3.continueButton : null;
        if (button3 != null) {
            button3.setVisibility(8);
        }
        VqFragmentReviewDetailsBinding binding4 = getBinding();
        Button button4 = binding4 != null ? binding4.refreshButton : null;
        if (button4 != null) {
            button4.setVisibility(8);
        }
        VqFragmentReviewDetailsBinding binding5 = getBinding();
        LinearLayout linearLayout = binding5 != null ? binding5.fullLoaderContainer : null;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        VqFragmentReviewDetailsBinding binding6 = getBinding();
        LinearLayout linearLayout2 = binding6 != null ? binding6.reviewDetailsScrollContainer : null;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        PartyViewModel.getLinkedGuests$default(getPartyViewModel(), this.queueId, this.isDeepLinkedFlow, null, 4, null);
    }

    private final void observeViewModel() {
        C30113j.m92948d(C3816t.m20245a(this), null, null, new C215811(null), 3, null);
        getPartyViewModel().getParkNameLiveData().observe(getViewLifecycleOwner(), new ReviewDetailsFragment$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment.observeViewModel.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                VqFragmentReviewDetailsBinding binding = ReviewDetailsFragment.this.getBinding();
                TextView textView = binding != null ? binding.queueParkTextView : null;
                if (str == null) {
                    if (textView == null) {
                        return;
                    }
                    textView.setVisibility(8);
                } else {
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    if (textView == null) {
                        return;
                    }
                    textView.setText(str);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onJoinQueueError(JoinQueueErrorResponse errorResponse) {
        CommonExtensionsKt.refreshTipBoard(this);
        int i10 = WhenMappings.$EnumSwitchMapping$0[errorResponse.getResponseStatus().ordinal()];
        if (i10 == 1) {
            showConflictScreen(this.selectedGuests, errorResponse.getConflicts());
        } else if (i10 == 2 || i10 == 3) {
            showQueueClosedErrorMessage();
        } else if (i10 == 4) {
            showMaxPartySizeExceededErrorMessage(errorResponse.getErrorData().getOrDefault("maxPartySize", Integer.valueOf(this.queue.getMaxPartySize())).intValue());
        } else if (errorResponse.getHttpStatus() == 429) {
            showTryAgainErrorMessage();
        } else {
            showGenericErrorMessage();
        }
        this.eventAttributes.put(PerformanceTrackingAttribute.EXIT_POINT.getAttrName(), PerformanceTrackingAttribute.EXIT_FAILURE.getAttrName());
        this.eventAttributes.put(PerformanceTrackingAttribute.SELECTED_GUESTS_END.getAttrName(), Integer.valueOf(this.selectedGuests.size()));
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.JOIN_FLOW_TIME, this.eventAttributes);
        VqFragmentReviewDetailsBinding binding = getBinding();
        LinearLayout linearLayout = binding != null ? binding.fullLoaderContainer : null;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onJoinQueueSuccess(GetPositionsResponse response) {
        getVirtualQueueAnalytics().trackLocation(getLocationMonitor());
        showConfirmation(response);
        this.eventAttributes.put(PerformanceTrackingAttribute.EXIT_POINT.getAttrName(), PerformanceTrackingAttribute.EXIT_SUCCESS.getAttrName());
        this.eventAttributes.put(PerformanceTrackingAttribute.SELECTED_GUESTS_END.getAttrName(), Integer.valueOf(this.selectedGuests.size()));
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.JOIN_FLOW_TIME, this.eventAttributes);
        VqFragmentReviewDetailsBinding binding = getBinding();
        LinearLayout linearLayout = binding != null ? binding.fullLoaderContainer : null;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    private final void sendAnnouncementEvent(String textToAnnounce) {
        Object systemService = requireContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.setClassName(ReviewDetailsFragment.class.getName());
            accessibilityEventObtain.setPackageName(requireContext().getPackageName());
            accessibilityEventObtain.getText().add(textToAnnounce);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
    }

    private final void setRefreshMessage() {
        TextView textView;
        if (!this.isInitialLoad) {
            String str = new SimpleDateFormat(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.MyLinesLastUpdatedDateFormat, null, false, 6, null), Locale.US).format(new Date());
            VqFragmentReviewDetailsBinding binding = getBinding();
            TextView textView2 = binding != null ? binding.refreshMessage : null;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding2 = getBinding();
            textView = binding2 != null ? binding2.refreshMessage : null;
            if (textView != null) {
                textView.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.MyLinesLoadingLastUpdated, MapsKt.mapOf(TuplesKt.m92045to("date", str)), null, false, 12, null));
            }
            sendAnnouncementEvent(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsUpdated, null, false, 6, null));
            return;
        }
        if (StringsKt.isBlank(this.queueOpenTime)) {
            VqFragmentReviewDetailsBinding binding3 = getBinding();
            textView = binding3 != null ? binding3.refreshMessage : null;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        VqFragmentReviewDetailsBinding binding4 = getBinding();
        TextView textView3 = binding4 != null ? binding4.refreshMessage : null;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        VqFragmentReviewDetailsBinding binding5 = getBinding();
        textView = binding5 != null ? binding5.refreshMessage : null;
        if (textView == null) {
            return;
        }
        textView.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsRefreshMessage, MapsKt.mapOf(TuplesKt.m92045to("time", this.queueOpenTime)), null, false, 12, null));
    }

    private final String setupHeightRestrictions(Facility facility) {
        TextView textView;
        List<FacilityFacet> facets;
        if (facility != null && (facets = facility.getFacets()) != null) {
            for (FacilityFacet facilityFacet : facets) {
                if (Intrinsics.areEqual(facilityFacet.getCategory(), "height")) {
                    String value = facilityFacet.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "facet.value");
                    this.heightRes = value;
                }
            }
        }
        if (this.heightRes.length() == 0) {
            this.heightRes = VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.SelectQueueHeightRestrictions, this.queue.getContentId(), false, 4, null);
        }
        if (this.heightRes.length() > 0) {
            VqFragmentReviewDetailsBinding binding = getBinding();
            TextView textView2 = binding != null ? binding.heightRestrictions : null;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding2 = getBinding();
            textView = binding2 != null ? binding2.heightRestrictions : null;
            if (textView != null) {
                textView.setText(this.heightRes);
            }
        } else {
            VqFragmentReviewDetailsBinding binding3 = getBinding();
            textView = binding3 != null ? binding3.heightRestrictions : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        return StringsKt.replace$default(this.heightRes, VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.SelectQueueInchesToReplaceAccessibility, this.queue.getContentId(), false, 4, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.SelectQueueInchesAccessibility, this.queue.getContentId(), false, 4, null), false, 4, (Object) null);
    }

    private final void setupQueueState() {
        Button button;
        if (this.queue.getIsAcceptingJoins()) {
            VqFragmentReviewDetailsBinding binding = getBinding();
            ConstraintLayout constraintLayout = binding != null ? binding.updateScreenContainer : null;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            VqFragmentReviewDetailsBinding binding2 = getBinding();
            Button button2 = binding2 != null ? binding2.continueButton : null;
            if (button2 != null) {
                button2.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding3 = getBinding();
            TextView textView = binding3 != null ? binding3.refreshMessage : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            VqFragmentReviewDetailsBinding binding4 = getBinding();
            button = binding4 != null ? binding4.refreshButton : null;
            if (button == null) {
                return;
            }
            button.setVisibility(8);
            return;
        }
        if (this.noLinkedGuests) {
            VqFragmentReviewDetailsBinding binding5 = getBinding();
            ConstraintLayout constraintLayout2 = binding5 != null ? binding5.updateScreenContainer : null;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
            }
            VqFragmentReviewDetailsBinding binding6 = getBinding();
            TextView textView2 = binding6 != null ? binding6.refreshMessage : null;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            VqFragmentReviewDetailsBinding binding7 = getBinding();
            Button button3 = binding7 != null ? binding7.continueButton : null;
            if (button3 != null) {
                button3.setVisibility(8);
            }
            VqFragmentReviewDetailsBinding binding8 = getBinding();
            Button button4 = binding8 != null ? binding8.refreshButton : null;
            if (button4 != null) {
                button4.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding9 = getBinding();
            button = binding9 != null ? binding9.refreshButton : null;
            if (button == null) {
                return;
            }
            button.setEnabled(false);
            return;
        }
        if (getQueueStateManagement().isQueueInEarlyPartyCreationMode(this.queue)) {
            VqFragmentReviewDetailsBinding binding10 = getBinding();
            ConstraintLayout constraintLayout3 = binding10 != null ? binding10.updateScreenContainer : null;
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding11 = getBinding();
            TextView textView3 = binding11 != null ? binding11.refreshMessage : null;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding12 = getBinding();
            Button button5 = binding12 != null ? binding12.continueButton : null;
            if (button5 != null) {
                button5.setVisibility(8);
            }
            VqFragmentReviewDetailsBinding binding13 = getBinding();
            Button button6 = binding13 != null ? binding13.refreshButton : null;
            if (button6 != null) {
                button6.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding14 = getBinding();
            button = binding14 != null ? binding14.refreshButton : null;
            if (button == null) {
                return;
            }
            button.setEnabled(true);
            return;
        }
        VqFragmentReviewDetailsBinding binding15 = getBinding();
        ConstraintLayout constraintLayout4 = binding15 != null ? binding15.updateScreenContainer : null;
        if (constraintLayout4 != null) {
            constraintLayout4.setVisibility(8);
        }
        VqFragmentReviewDetailsBinding binding16 = getBinding();
        TextView textView4 = binding16 != null ? binding16.refreshMessage : null;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        VqFragmentReviewDetailsBinding binding17 = getBinding();
        Button button7 = binding17 != null ? binding17.continueButton : null;
        if (button7 != null) {
            button7.setVisibility(0);
        }
        VqFragmentReviewDetailsBinding binding18 = getBinding();
        Button button8 = binding18 != null ? binding18.refreshButton : null;
        if (button8 != null) {
            button8.setVisibility(8);
        }
        VqFragmentReviewDetailsBinding binding19 = getBinding();
        button = binding19 != null ? binding19.refreshButton : null;
        if (button == null) {
            return;
        }
        button.setEnabled(false);
    }

    private final void setupQueueSubpark(Queue queue) {
        String string$default = VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.NonAttractionLocatedAt, queue.getContentId(), false, 4, null);
        String string$default2 = VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.NonAttractionSubpark, queue.getContentId(), false, 4, null);
        if (StringsKt.isBlank(string$default2)) {
            VqFragmentReviewDetailsBinding binding = getBinding();
            LinearLayout linearLayout = binding != null ? binding.subParkContainer : null;
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
            return;
        }
        VqFragmentReviewDetailsBinding binding2 = getBinding();
        LinearLayout linearLayout2 = binding2 != null ? binding2.subParkContainer : null;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        VqFragmentReviewDetailsBinding binding3 = getBinding();
        TextView textView = binding3 != null ? binding3.locatedAtTextView : null;
        if (textView != null) {
            textView.setText(string$default);
        }
        VqFragmentReviewDetailsBinding binding4 = getBinding();
        TextView textView2 = binding4 != null ? binding4.queueSubParkTextView : null;
        if (textView2 == null) {
            return;
        }
        textView2.setText(string$default2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupUI() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        VqFragmentReviewDetailsBinding binding;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        Resources resources;
        PartyListAdapter partyListAdapter = this.partyAdapter;
        if (partyListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("partyAdapter");
            partyListAdapter = null;
        }
        partyListAdapter.setParty(this.selectedGuests);
        CreatePartyMainAdapter createPartyMainAdapter = this.ineligibleAdapter;
        if (createPartyMainAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ineligibleAdapter");
            createPartyMainAdapter = null;
        }
        List<LinkedGuest> list = this.ineligiblePartyGuests;
        List<Conflict> list2 = this.conflicts;
        Queue queue = this.queue;
        Facility facility = getFacilityUtils().getFacility(this.queue.getExternalDefinitionId());
        String ancestorThemePark = facility != null ? facility.getAncestorThemePark() : null;
        if (ancestorThemePark == null) {
            ancestorThemePark = "";
        }
        createPartyMainAdapter.displayIneligibleGuestsItemOnly(list, list2, queue, ancestorThemePark);
        getActivityActions().setTitle(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsHeader, null, false, 6, null), getQueueStateManagement().isQueueInEarlyPartyCreationMode(this.queue));
        Facility facility2 = getFacilityUtils().getFacility(this.queue.getExternalDefinitionId());
        VqFragmentReviewDetailsBinding binding2 = getBinding();
        TextView textView10 = binding2 != null ? binding2.virtualQueueTitle : null;
        if (textView10 != null) {
            textView10.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsVQHeaderTitle, null, false, 6, null));
        }
        VqFragmentReviewDetailsBinding binding3 = getBinding();
        TextView textView11 = binding3 != null ? binding3.queueTitle : null;
        if (textView11 != null) {
            textView11.setText(this.queue.getName());
        }
        String string$default = VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.NonAttractionHeight, this.queue.getContentId(), false, 4, null);
        if (Intrinsics.areEqual(string$default, VirtualQueueConstants.NO_HEIGHT)) {
            VqFragmentReviewDetailsBinding binding4 = getBinding();
            TextView textView12 = binding4 != null ? binding4.heightRestrictions : null;
            if (textView12 != null) {
                textView12.setVisibility(8);
            }
        } else if (string$default.length() > 0) {
            VqFragmentReviewDetailsBinding binding5 = getBinding();
            TextView textView13 = binding5 != null ? binding5.heightRestrictions : null;
            if (textView13 != null) {
                textView13.setText(string$default);
            }
        } else {
            String str = setupHeightRestrictions(facility2);
            VqFragmentReviewDetailsBinding binding6 = getBinding();
            TextView textView14 = binding6 != null ? binding6.heightRestrictions : null;
            if (textView14 != null) {
                textView14.setText(this.heightRes);
            }
            VqFragmentReviewDetailsBinding binding7 = getBinding();
            TextView textView15 = binding7 != null ? binding7.heightRestrictions : null;
            if (textView15 != null) {
                textView15.setContentDescription(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.CreatePartyGuestMustBeAccessibility, MapsKt.mapOf(TuplesKt.m92045to("heightRestriction", str)), null, false, 12, null));
            }
        }
        setupQueuePark(facility2);
        setupQueueSubpark(this.queue);
        Date time = Calendar.getInstance(getFacilityUtils().getTimezone()).getTime();
        Context context = getContext();
        String str2 = new SimpleDateFormat((context == null || (resources = context.getResources()) == null) ? null : resources.getString(C21487R.string.format_date)).format(time);
        VqFragmentReviewDetailsBinding binding8 = getBinding();
        TextView textView16 = binding8 != null ? binding8.validOnText : null;
        if (textView16 != null) {
            textView16.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsValidOn, MapsKt.mapOf(TuplesKt.m92045to("date", str2)), null, false, 12, null));
        }
        if (this.queue.getHowToEnterMessage().length() > 0) {
            VqFragmentReviewDetailsBinding binding9 = getBinding();
            TextView textView17 = binding9 != null ? binding9.howToEnterTitle : null;
            if (textView17 != null) {
                textView17.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsHowToEnterTitle, null, false, 6, null));
            }
            VqFragmentReviewDetailsBinding binding10 = getBinding();
            TextView textView18 = binding10 != null ? binding10.howToEnterDetail : null;
            if (textView18 != null) {
                textView18.setText(this.queue.getHowToEnterMessage());
            }
            VqFragmentReviewDetailsBinding binding11 = getBinding();
            LinearLayout linearLayout = binding11 != null ? binding11.howToEnter : null;
            if (linearLayout != null) {
                VqFragmentReviewDetailsBinding binding12 = getBinding();
                CharSequence text = (binding12 == null || (textView9 = binding12.howToEnterTitle) == null) ? null : textView9.getText();
                VqFragmentReviewDetailsBinding binding13 = getBinding();
                CharSequence text2 = (binding13 == null || (textView8 = binding13.howToEnterDetail) == null) ? null : textView8.getText();
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) text);
                sb2.append((Object) text2);
                linearLayout.setContentDescription(sb2.toString());
            }
        } else {
            VqFragmentReviewDetailsBinding binding14 = getBinding();
            LinearLayout linearLayout2 = binding14 != null ? binding14.howToEnter : null;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
        VqFragmentReviewDetailsBinding binding15 = getBinding();
        FrameLayout frameLayout = binding15 != null ? binding15.groupParent : null;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        VqFragmentReviewDetailsBinding binding16 = getBinding();
        ConstraintLayout constraintLayout = binding16 != null ? binding16.yourPartyWarningContainer : null;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        VqFragmentReviewDetailsBinding binding17 = getBinding();
        Button button = binding17 != null ? binding17.continueButton : null;
        if (button != null) {
            button.setEnabled(false);
        }
        VqFragmentReviewDetailsBinding binding18 = getBinding();
        TextView textView19 = binding18 != null ? binding18.yourPartyHeaderText : null;
        if (textView19 != null) {
            textView19.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsYourPartyHeader, null, false, 6, null));
        }
        VqFragmentReviewDetailsBinding binding19 = getBinding();
        TextView textView20 = binding19 != null ? binding19.yourPartyCountText : null;
        if (textView20 != null) {
            textView20.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsYourPartySizeHeader, MapsKt.mapOf(TuplesKt.m92045to("partySize", Integer.valueOf(this.selectedGuests.size()))), null, false, 12, null));
        }
        VqFragmentReviewDetailsBinding binding20 = getBinding();
        Button button2 = binding20 != null ? binding20.partyHeaderCTAButton : null;
        if (button2 != null) {
            button2.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsChangePartyCta, null, false, 6, null));
        }
        VqFragmentReviewDetailsBinding binding21 = getBinding();
        LinearLayout linearLayout3 = binding21 != null ? binding21.partyGroup : null;
        if (linearLayout3 != null) {
            linearLayout3.setContentDescription(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.CreatePartyYourPartyHeaderAccessibility, MapsKt.mapOf(TuplesKt.m92045to("partySize", Integer.valueOf(this.selectedGuests.size()))), null, false, 12, null));
        }
        VqFragmentReviewDetailsBinding binding22 = getBinding();
        TextView textView21 = binding22 != null ? binding22.yourPartyAlertIcon : null;
        if (textView21 != null) {
            textView21.setText(VirtualQueueThemer.getPeptasiaIcon$default(getVqThemer(), VQIconType.ReviewDetailsSelectGuestsIcon, null, 2, null));
        }
        VqFragmentReviewDetailsBinding binding23 = getBinding();
        TextView textView22 = binding23 != null ? binding23.ineligibleHeaderText : null;
        if (textView22 != null) {
            textView22.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsIneligibleGuestsHeader, null, false, 6, null));
        }
        VqFragmentReviewDetailsBinding binding24 = getBinding();
        Button button3 = binding24 != null ? binding24.ineligibleHeaderCTAButton : null;
        if (button3 != null) {
            button3.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsChangePartyCta, null, false, 6, null));
        }
        VqFragmentReviewDetailsBinding binding25 = getBinding();
        Button button4 = binding25 != null ? binding25.ineligibleHeaderCTAButton : null;
        if (button4 != null) {
            button4.setVisibility(8);
        }
        if (this.noLinkedGuests) {
            VqFragmentReviewDetailsBinding binding26 = getBinding();
            TextView textView23 = binding26 != null ? binding26.yourPartyAlertText : null;
            if (textView23 != null) {
                textView23.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsNoLinkedTickets, null, false, 6, null));
            }
            VqFragmentReviewDetailsBinding binding27 = getBinding();
            ConstraintLayout constraintLayout2 = binding27 != null ? binding27.yourPartyWarningContainer : null;
            if (constraintLayout2 != null) {
                VirtualQueueThemer vqThemer = getVqThemer();
                VQStringType vQStringType = VQStringType.ReviewDetailsImportantAccessibility;
                VqFragmentReviewDetailsBinding binding28 = getBinding();
                constraintLayout2.setContentDescription(VirtualQueueThemer.getString$default(vqThemer, vQStringType, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, String.valueOf((binding28 == null || (textView7 = binding28.yourPartyAlertText) == null) ? null : textView7.getText()))), null, false, 12, null));
            }
            VqFragmentReviewDetailsBinding binding29 = getBinding();
            ConstraintLayout constraintLayout3 = binding29 != null ? binding29.yourPartyWarningContainer : null;
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(0);
            }
        } else if (this.selectedGuests.isEmpty() && this.isOnboarded) {
            VqFragmentReviewDetailsBinding binding30 = getBinding();
            TextView textView24 = binding30 != null ? binding30.yourPartyAlertText : null;
            if (textView24 != null) {
                textView24.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsSelectGuestsWarningText, null, false, 6, null));
            }
            VqFragmentReviewDetailsBinding binding31 = getBinding();
            ConstraintLayout constraintLayout4 = binding31 != null ? binding31.yourPartyWarningContainer : null;
            if (constraintLayout4 != null) {
                VirtualQueueThemer vqThemer2 = getVqThemer();
                VQStringType vQStringType2 = VQStringType.ReviewDetailsImportantAccessibility;
                VqFragmentReviewDetailsBinding binding32 = getBinding();
                constraintLayout4.setContentDescription(VirtualQueueThemer.getString$default(vqThemer2, vQStringType2, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, String.valueOf((binding32 == null || (textView4 = binding32.yourPartyAlertText) == null) ? null : textView4.getText()))), null, false, 12, null));
            }
            VqFragmentReviewDetailsBinding binding33 = getBinding();
            ConstraintLayout constraintLayout5 = binding33 != null ? binding33.yourPartyWarningContainer : null;
            if (constraintLayout5 != null) {
                constraintLayout5.setVisibility(0);
            }
        } else if (this.selectedGuests.isEmpty() && !this.isOnboarded) {
            VqFragmentReviewDetailsBinding binding34 = getBinding();
            TextView textView25 = binding34 != null ? binding34.yourPartyAlertText : null;
            if (textView25 != null) {
                textView25.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsNoEligibleGuestsWarning, null, false, 6, null));
            }
            VqFragmentReviewDetailsBinding binding35 = getBinding();
            ConstraintLayout constraintLayout6 = binding35 != null ? binding35.yourPartyWarningContainer : null;
            if (constraintLayout6 != null) {
                VirtualQueueThemer vqThemer3 = getVqThemer();
                VQStringType vQStringType3 = VQStringType.ReviewDetailsImportantAccessibility;
                VqFragmentReviewDetailsBinding binding36 = getBinding();
                constraintLayout6.setContentDescription(VirtualQueueThemer.getString$default(vqThemer3, vQStringType3, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, String.valueOf((binding36 == null || (textView3 = binding36.yourPartyAlertText) == null) ? null : textView3.getText()))), null, false, 12, null));
            }
            VqFragmentReviewDetailsBinding binding37 = getBinding();
            ConstraintLayout constraintLayout7 = binding37 != null ? binding37.yourPartyWarningContainer : null;
            if (constraintLayout7 != null) {
                constraintLayout7.setVisibility(0);
            }
        } else if (!this.selectedGuests.isEmpty() && this.maxPartySizeReached) {
            VqFragmentReviewDetailsBinding binding38 = getBinding();
            FrameLayout frameLayout2 = binding38 != null ? binding38.groupParent : null;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding39 = getBinding();
            TextView textView26 = binding39 != null ? binding39.yourPartyAlertIcon : null;
            if (textView26 != null) {
                textView26.setText(VirtualQueueThemer.getPeptasiaIcon$default(getVqThemer(), VQIconType.ReviewDetailsIneligibleGuestsIcon, null, 2, null));
            }
            VqFragmentReviewDetailsBinding binding40 = getBinding();
            TextView textView27 = binding40 != null ? binding40.yourPartyAlertText : null;
            if (textView27 != null) {
                textView27.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsMaxPartySizeExceeded, MapsKt.mapOf(TuplesKt.m92045to("maxPartySize", Integer.valueOf(this.queue.getMaxPartySize()))), null, false, 12, null));
            }
            VqFragmentReviewDetailsBinding binding41 = getBinding();
            ConstraintLayout constraintLayout8 = binding41 != null ? binding41.yourPartyWarningContainer : null;
            if (constraintLayout8 != null) {
                VirtualQueueThemer vqThemer4 = getVqThemer();
                VQStringType vQStringType4 = VQStringType.ReviewDetailsImportantAccessibility;
                VqFragmentReviewDetailsBinding binding42 = getBinding();
                constraintLayout8.setContentDescription(VirtualQueueThemer.getString$default(vqThemer4, vQStringType4, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, String.valueOf((binding42 == null || (textView2 = binding42.yourPartyAlertText) == null) ? null : textView2.getText()))), null, false, 12, null));
            }
            VqFragmentReviewDetailsBinding binding43 = getBinding();
            ConstraintLayout constraintLayout9 = binding43 != null ? binding43.yourPartyWarningContainer : null;
            if (constraintLayout9 != null) {
                constraintLayout9.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding44 = getBinding();
            Button button5 = binding44 != null ? binding44.continueButton : null;
            if (button5 != null) {
                button5.setEnabled(true);
            }
        } else if (!this.conflictedGuests.isEmpty() && !this.isOnboarded) {
            VqFragmentReviewDetailsBinding binding45 = getBinding();
            FrameLayout frameLayout3 = binding45 != null ? binding45.groupParent : null;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding46 = getBinding();
            TextView textView28 = binding46 != null ? binding46.yourPartyAlertIcon : null;
            if (textView28 != null) {
                textView28.setText(VirtualQueueThemer.getPeptasiaIcon$default(getVqThemer(), VQIconType.ReviewDetailsIneligibleGuestsIcon, null, 2, null));
            }
            VqFragmentReviewDetailsBinding binding47 = getBinding();
            TextView textView29 = binding47 != null ? binding47.yourPartyAlertText : null;
            if (textView29 != null) {
                textView29.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsIneligibleGuestsWarningText, null, false, 6, null));
            }
            VqFragmentReviewDetailsBinding binding48 = getBinding();
            ConstraintLayout constraintLayout10 = binding48 != null ? binding48.yourPartyWarningContainer : null;
            if (constraintLayout10 != null) {
                VirtualQueueThemer vqThemer5 = getVqThemer();
                VQStringType vQStringType5 = VQStringType.ReviewDetailsImportantAccessibility;
                VqFragmentReviewDetailsBinding binding49 = getBinding();
                constraintLayout10.setContentDescription(VirtualQueueThemer.getString$default(vqThemer5, vQStringType5, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, String.valueOf((binding49 == null || (textView = binding49.yourPartyAlertText) == null) ? null : textView.getText()))), null, false, 12, null));
            }
            VqFragmentReviewDetailsBinding binding50 = getBinding();
            ConstraintLayout constraintLayout11 = binding50 != null ? binding50.yourPartyWarningContainer : null;
            if (constraintLayout11 != null) {
                constraintLayout11.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding51 = getBinding();
            Button button6 = binding51 != null ? binding51.continueButton : null;
            if (button6 != null) {
                button6.setEnabled(true);
            }
        } else if (this.selectedGuests.isEmpty() || this.maxPartySizeReached) {
            VqFragmentReviewDetailsBinding binding52 = getBinding();
            LinearLayout linearLayout4 = binding52 != null ? binding52.partyGroup : null;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            VqFragmentReviewDetailsBinding binding53 = getBinding();
            View view = binding53 != null ? binding53.underYourPartyLine : null;
            if (view != null) {
                view.setVisibility(8);
            }
            VqFragmentReviewDetailsBinding binding54 = getBinding();
            Button button7 = binding54 != null ? binding54.ineligibleHeaderCTAButton : null;
            if (button7 != null) {
                button7.setVisibility(0);
            }
        } else {
            VqFragmentReviewDetailsBinding binding55 = getBinding();
            FrameLayout frameLayout4 = binding55 != null ? binding55.groupParent : null;
            if (frameLayout4 != null) {
                frameLayout4.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding56 = getBinding();
            Button button8 = binding56 != null ? binding56.continueButton : null;
            if (button8 != null) {
                button8.setEnabled(true);
            }
        }
        if (!this.isOnboarded || this.ineligiblePartyGuests.isEmpty()) {
            VqFragmentReviewDetailsBinding binding57 = getBinding();
            TextView textView30 = binding57 != null ? binding57.ineligibleHeaderText : null;
            if (textView30 != null) {
                textView30.setVisibility(8);
            }
            VqFragmentReviewDetailsBinding binding58 = getBinding();
            FrameLayout frameLayout5 = binding58 != null ? binding58.ineligibleGroupParent : null;
            if (frameLayout5 != null) {
                frameLayout5.setVisibility(8);
            }
            VqFragmentReviewDetailsBinding binding59 = getBinding();
            View view2 = binding59 != null ? binding59.underYourPartyLine : null;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        } else {
            VqFragmentReviewDetailsBinding binding60 = getBinding();
            TextView textView31 = binding60 != null ? binding60.ineligibleHeaderText : null;
            if (textView31 != null) {
                textView31.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding61 = getBinding();
            FrameLayout frameLayout6 = binding61 != null ? binding61.ineligibleGroupParent : null;
            if (frameLayout6 != null) {
                frameLayout6.setVisibility(0);
            }
        }
        VqFragmentReviewDetailsBinding binding62 = getBinding();
        TextView textView32 = binding62 != null ? binding62.updateScreenWarningIcon : null;
        if (textView32 != null) {
            textView32.setText(VirtualQueueThemer.getPeptasiaIcon$default(getVqThemer(), VQIconType.ReviewDetailsIneligibleGuestsIcon, null, 2, null));
        }
        VqFragmentReviewDetailsBinding binding63 = getBinding();
        TextView textView33 = binding63 != null ? binding63.updateScreenWarningTitle : null;
        if (textView33 != null) {
            textView33.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsUpdateScreenWarningTitle, null, false, 6, null));
        }
        VqFragmentReviewDetailsBinding binding64 = getBinding();
        TextView textView34 = binding64 != null ? binding64.updateScreenWarningText : null;
        if (textView34 != null) {
            textView34.setText(this.nextStepsMessage);
        }
        VqFragmentReviewDetailsBinding binding65 = getBinding();
        CharSequence text3 = (binding65 == null || (textView6 = binding65.updateScreenWarningTitle) == null) ? null : textView6.getText();
        VqFragmentReviewDetailsBinding binding66 = getBinding();
        CharSequence text4 = (binding66 == null || (textView5 = binding66.updateScreenWarningText) == null) ? null : textView5.getText();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) text3);
        sb3.append((Object) text4);
        String string = sb3.toString();
        VqFragmentReviewDetailsBinding binding67 = getBinding();
        ConstraintLayout constraintLayout12 = binding67 != null ? binding67.updateScreenContainer : null;
        if (constraintLayout12 != null) {
            constraintLayout12.setContentDescription(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsImportantAccessibility, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, string)), null, false, 12, null));
        }
        VqFragmentReviewDetailsBinding binding68 = getBinding();
        Button button9 = binding68 != null ? binding68.continueButton : null;
        if (button9 != null) {
            button9.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsMainCta, this.queue.getContentId(), false, 4, null));
        }
        Spanned peptasiaIcon$default = VirtualQueueThemer.getPeptasiaIcon$default(getVqThemer(), VQIconType.CommonRefreshIcon, null, 2, null);
        String string$default2 = VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsAlternateCta, null, false, 6, null);
        try {
            Typeface typefaceM97205h = C31640h.m97205h(requireContext(), C21487R.font.peptasia);
            Typeface typefaceM97205h2 = C31640h.m97205h(requireContext(), C21487R.font.twdc_font_heavy);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((Object) peptasiaIcon$default) + " " + string$default2);
            spannableStringBuilder.setSpan(new C20751b(typefaceM97205h), 0, 1, 34);
            spannableStringBuilder.setSpan(new C20751b(typefaceM97205h2), 1, spannableStringBuilder.length(), 34);
            VqFragmentReviewDetailsBinding binding69 = getBinding();
            Button button10 = binding69 != null ? binding69.refreshButton : null;
            if (button10 != null) {
                button10.setText(spannableStringBuilder);
            }
        } catch (Exception unused) {
            VqFragmentReviewDetailsBinding binding70 = getBinding();
            Button button11 = binding70 != null ? binding70.refreshButton : null;
            if (button11 != null) {
                button11.setText(string$default2);
            }
        }
        setupQueueState();
        setRefreshMessage();
        VqFragmentReviewDetailsBinding binding71 = getBinding();
        LinearLayout linearLayout5 = binding71 != null ? binding71.fullLoaderContainer : null;
        if (linearLayout5 != null) {
            linearLayout5.setVisibility(8);
        }
        VqFragmentReviewDetailsBinding binding72 = getBinding();
        LinearLayout linearLayout6 = binding72 != null ? binding72.reviewDetailsScrollContainer : null;
        if (linearLayout6 != null) {
            linearLayout6.setVisibility(0);
        }
        if (this.queue.getIsAcceptingJoins() || this.queue.getIsAcceptingPartyCreation() || (binding = getBinding()) == null) {
            return;
        }
        binding.yourPartyWarningContainer.setVisibility(0);
        binding.yourPartyAlertIcon.setText(VirtualQueueThemer.getPeptasiaIcon$default(getVqThemer(), VQIconType.ReviewDetailsIneligibleGuestsIcon, null, 2, null));
        binding.yourPartyAlertText.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsQueueUnAvailableMessage, this.queueId, false, 4, null));
        binding.continueButton.setEnabled(false);
        binding.partyHeaderCTAButton.setEnabled(false);
    }

    private final void showConfirmation(GetPositionsResponse response) {
        ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), VirtualQueueConfirmationFragment.INSTANCE.newInstance(response, this.completionDeepLink, this.suppressClose, this.queue.getContentId()), new SnowballNextFlowAnimation(), true, false, false, 24, null);
    }

    private final void showConflictScreen(List<LinkedGuest> selectedGuests, List<Conflict> initialConflicts) {
        ConflictFragment conflictFragmentNewInstance = ConflictFragment.INSTANCE.newInstance(selectedGuests, this.queue, initialConflicts, this.completionDeepLink, this.suppressClose);
        this.eventAttributes.put(PerformanceTrackingAttribute.EXIT_POINT.getAttrName(), PerformanceTrackingAttribute.EXIT_NSF.getAttrName());
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), conflictFragmentNewInstance, new SnowballNextFlowAnimation(), false, false, false, 28, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void showConflictScreen$default(ReviewDetailsFragment reviewDetailsFragment, List list, List list2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        reviewDetailsFragment.showConflictScreen(list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCreateParty(boolean clearHistory) {
        getVirtualQueueAnalytics().trackReviewDetailsChangeParty(this.selectedGuests.size(), this.queue.getName());
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), CreatePartyFragment.Companion.newInstance$default(CreatePartyFragment.INSTANCE, getArguments(), false, false, false, 14, null), new SnowballNextFlowAnimation(), false, clearHistory, false, 20, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showGenericErrorMessage() {
        CommonExtensionsKt.refreshTipBoard(this);
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersJoinErrorMessage, this.queue.getContentId(), false, 4, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersJoinErrorTitle, this.queue.getContentId(), false, 4, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment.showGenericErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                AbstractC3694e0 supportFragmentManager;
                if (ReviewDetailsFragment.this.fromHubLanding) {
                    FragmentActivity activity = ReviewDetailsFragment.this.getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                        return;
                    }
                    return;
                }
                if (ReviewDetailsFragment.this.originatedFromDeeplink) {
                    FragmentActivity activity2 = ReviewDetailsFragment.this.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                        return;
                    }
                    return;
                }
                FragmentActivity activity3 = ReviewDetailsFragment.this.getActivity();
                if (activity3 == null || (supportFragmentManager = activity3.getSupportFragmentManager()) == null) {
                    return;
                }
                supportFragmentManager.m19746k1(null, 1);
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
            }
        }, false, true);
    }

    private final void showMaxPartySizeExceededErrorMessage(int maxParty) {
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersMaxPartyExceededMessage, MapsKt.mapOf(TuplesKt.m92045to("maxPartySize", Integer.valueOf(maxParty))), this.queue.getContentId(), false, 8, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersMaxPartyExceededTitle, this.queue.getContentId(), false, 4, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment.showMaxPartySizeExceededErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                ReviewDetailsFragment.this.loadLinkedTickets();
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
            }
        }, false, false);
    }

    private final void showQueueClosedErrorMessage() {
        setupUI();
        CommonExtensionsKt.refreshTipBoard(this);
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersLandClosedMessage, this.queue.getContentId(), false, 4, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersLandClosedTitle, this.queue.getContentId(), false, 4, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment.showQueueClosedErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                AbstractC3694e0 supportFragmentManager;
                if (ReviewDetailsFragment.this.fromHubLanding) {
                    FragmentActivity activity = ReviewDetailsFragment.this.getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                        return;
                    }
                    return;
                }
                if (ReviewDetailsFragment.this.originatedFromDeeplink) {
                    FragmentActivity activity2 = ReviewDetailsFragment.this.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                        return;
                    }
                    return;
                }
                FragmentActivity activity3 = ReviewDetailsFragment.this.getActivity();
                if (activity3 == null || (supportFragmentManager = activity3.getSupportFragmentManager()) == null) {
                    return;
                }
                supportFragmentManager.m19746k1(null, 1);
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
            }
        }, false, false);
    }

    private final void showSoftRefreshError() {
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersJoinErrorMessage, this.queue.getContentId(), false, 4, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersJoinErrorTitle, this.queue.getContentId(), false, 4, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment.showSoftRefreshError.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
                ReviewDetailsFragment.this.startSoftRefresh();
            }
        }, true, false);
    }

    private final void showTryAgainErrorMessage() {
        setupUI();
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersRetryErrorMessage, this.queue.getContentId(), false, 4, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersRetryErrorTitle, this.queue.getContentId(), false, 4, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment.showTryAgainErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
                ReviewDetailsFragment reviewDetailsFragment = ReviewDetailsFragment.this;
                reviewDetailsFragment.joinQueue(reviewDetailsFragment.selectedGuests);
            }
        }, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startSoftRefresh() {
        RecyclerView recyclerView;
        Sequence<View> sequenceM17084b;
        View view;
        this.isInitialLoad = false;
        VqFragmentReviewDetailsBinding binding = getBinding();
        if (binding != null && (recyclerView = binding.groupList) != null && (sequenceM17084b = ViewGroupKt.m17084b(recyclerView)) != null && (view = (View) SequencesKt.firstOrNull(sequenceM17084b)) != null) {
            view.setImportantForAccessibility(2);
        }
        VqFragmentReviewDetailsBinding binding2 = getBinding();
        Button button = binding2 != null ? binding2.partyHeaderCTAButton : null;
        if (button != null) {
            button.setImportantForAccessibility(2);
        }
        VqFragmentReviewDetailsBinding binding3 = getBinding();
        Button button2 = binding3 != null ? binding3.refreshButton : null;
        if (button2 != null) {
            button2.setEnabled(false);
        }
        VqFragmentReviewDetailsBinding binding4 = getBinding();
        Button button3 = binding4 != null ? binding4.refreshButton : null;
        if (button3 != null) {
            button3.setVisibility(8);
        }
        VqFragmentReviewDetailsBinding binding5 = getBinding();
        TextView textView = binding5 != null ? binding5.refreshMessage : null;
        if (textView != null) {
            textView.setVisibility(8);
        }
        VqFragmentReviewDetailsBinding binding6 = getBinding();
        Button button4 = binding6 != null ? binding6.continueButton : null;
        if (button4 != null) {
            button4.setEnabled(false);
        }
        VqFragmentReviewDetailsBinding binding7 = getBinding();
        Button button5 = binding7 != null ? binding7.continueButton : null;
        if (button5 != null) {
            button5.setVisibility(8);
        }
        VqFragmentReviewDetailsBinding binding8 = getBinding();
        Button button6 = binding8 != null ? binding8.partyHeaderCTAButton : null;
        if (button6 != null) {
            button6.setEnabled(false);
        }
        VqFragmentReviewDetailsBinding binding9 = getBinding();
        Button button7 = binding9 != null ? binding9.ineligibleHeaderCTAButton : null;
        if (button7 != null) {
            button7.setEnabled(false);
        }
        String string$default = VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsLaunching, null, false, 6, null);
        VqFragmentReviewDetailsBinding binding10 = getBinding();
        TextView textView2 = binding10 != null ? binding10.launchingMessage : null;
        if (textView2 != null) {
            textView2.setText(string$default);
        }
        VqFragmentReviewDetailsBinding binding11 = getBinding();
        LinearLayout linearLayout = binding11 != null ? binding11.launchingContainer : null;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        sendAnnouncementEvent(string$default);
        GetLinkedGuestsRequestType getLinkedGuestsRequestType = this.isDifferentJoinWindow ? GetLinkedGuestsRequestType.REVIEW : GetLinkedGuestsRequestType.REVIEW_REFRESH;
        String activeNetworkConnection = getVqThemer().getActiveNetworkConnection();
        if (activeNetworkConnection != null && activeNetworkConnection.length() != 0) {
            getPartyViewModel().getLinkedGuests(this.queueId, this.isDeepLinkedFlow, getLinkedGuestsRequestType);
            return;
        }
        showNoNetworkMessage();
        VqFragmentReviewDetailsBinding binding12 = getBinding();
        if (binding12 != null) {
            binding12.pullToRefreshContainer.m64009G();
            binding12.refreshButton.setEnabled(true);
            binding12.refreshButton.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateIsPtrEnabled(boolean isEnabled) {
        PtrDisneyContainer ptrDisneyContainer;
        PtrDisneyContainer ptrDisneyContainer2;
        VqFragmentReviewDetailsBinding binding = getBinding();
        if (binding != null && (ptrDisneyContainer2 = binding.pullToRefreshContainer) != null) {
            ptrDisneyContainer2.setEnablePtr(isEnabled);
        }
        VqFragmentReviewDetailsBinding binding2 = getBinding();
        if (binding2 == null || (ptrDisneyContainer = binding2.pullToRefreshContainer) == null) {
            return;
        }
        ptrDisneyContainer.setEnabled(isEnabled);
    }

    @Override // kotlinx.coroutines.InterfaceC30065h0
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public final CreatePartyMainAdapter.Factory getCreatePartyMainAdapterFactory() {
        CreatePartyMainAdapter.Factory factory = this.createPartyMainAdapterFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("createPartyMainAdapterFactory");
        return null;
    }

    public final Map<String, Object> getEventAttributes() {
        return this.eventAttributes;
    }

    public final FacilityUtils getFacilityUtils() {
        FacilityUtils facilityUtils = this.facilityUtils;
        if (facilityUtils != null) {
            return facilityUtils;
        }
        Intrinsics.throwUninitializedPropertyAccessException("facilityUtils");
        return null;
    }

    public final InterfaceC9336k getLocationMonitor() {
        InterfaceC9336k interfaceC9336k = this.locationMonitor;
        if (interfaceC9336k != null) {
            return interfaceC9336k;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationMonitor");
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

    public final PartyListAdapter.Factory getPartyListAdapterFactory() {
        PartyListAdapter.Factory factory = this.partyListAdapterFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("partyListAdapterFactory");
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

    public final QueueStateManagement getQueueStateManagement() {
        QueueStateManagement queueStateManagement = this.queueStateManagement;
        if (queueStateManagement != null) {
            return queueStateManagement;
        }
        Intrinsics.throwUninitializedPropertyAccessException("queueStateManagement");
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

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        VqFragmentReviewDetailsBinding binding = getBinding();
        LinearLayout linearLayout = binding != null ? binding.launchingContainer : null;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        sendAnnouncementEvent(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsLoading, null, false, 6, null));
        if (this.isInitialLoad || getPartyViewModel().getConflictOccurred()) {
            loadLinkedTickets();
        }
    }

    @Override // p498da.InterfaceC27132a
    public boolean onBackPressed() {
        getVirtualQueueAnalytics().trackBackPress();
        this.eventAttributes.put(PerformanceTrackingAttribute.SELECTED_GUESTS_END.getAttrName(), Integer.valueOf(this.selectedGuests.size()));
        this.eventAttributes.put(PerformanceTrackingAttribute.EXIT_POINT.getAttrName(), PerformanceTrackingAttribute.EXIT_BACK_PRESSED.getAttrName());
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.JOIN_FLOW_TIME, this.eventAttributes);
        return false;
    }

    @Override // com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C21487R.layout.vq_fragment_review_details, container, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("queueId", "");
            Intrinsics.checkNotNullExpressionValue(string, "data.getString(VirtualQu…tants.QUEUE_ID_PARAM, \"\")");
            this.queueId = string;
            this.fromHubLanding = arguments.getBoolean(VirtualQueueConstants.HUB_LANDING, false);
            String string2 = arguments.getString("completionDeepLink", "");
            Intrinsics.checkNotNullExpressionValue(string2, "data.getString(VirtualQu…TION_DEEP_LINK_PARAM, \"\")");
            this.completionDeepLink = string2;
            this.isDeepLinkedFlow = !StringsKt.isBlank(string2);
            this.originatedFromDeeplink = arguments.getBoolean(VirtualQueueConstants.ORIGINATED_FROM_DEEPLINK_PARAM, false);
            this.suppressClose = Intrinsics.areEqual(arguments.getString(VirtualQueueConstants.SUPPRESS_OVERVIEW_PARAM), EnjoymentDialogViewModel.CODE_POINT_YES);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C30069i0.m92784e(this, null, 1, null);
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SnowballHeader header = getActivityActions().getHeader();
        if (header != null) {
            header.setVisibility(0);
        }
        FragmentActivity activity = getActivity();
        if ((activity instanceof VirtualQueueStackActivity) && this.suppressClose) {
            ((VirtualQueueStackActivity) activity).hideDismissNavigation();
        }
        if (!this.isInitialLoad) {
            startSoftRefresh();
        }
        PerformanceTracking performanceTracking = getPerformanceTracking();
        PerformanceTrackingScreenName performanceTrackingScreenName = PerformanceTrackingScreenName.REVIEW_DETAILS_SCREEN;
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "this.requireView()");
        PerformanceTracking.logLoadTime$default(performanceTracking, performanceTrackingScreenName, viewRequireView, "", this.isInitialLoad, false, 16, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        PtrDisneyContainer ptrDisneyContainer;
        PtrDisneyContainer ptrDisneyContainer2;
        PtrDisneyContainer ptrDisneyContainer3;
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        Button button;
        Button button2;
        Button button3;
        Button button4;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.eventAttributes.put(PerformanceTrackingAttribute.LOAD_TIME_SCREEN_NAME.getAttrName(), PerformanceTrackingScreenName.REVIEW_DETAILS_SCREEN.getScreenName());
        getPerformanceTracking().logTimedActionStart(PerformanceTrackingEventName.JOIN_FLOW_TIME, this.eventAttributes);
        observeViewModel();
        PartyListAdapter.Factory partyListAdapterFactory = getPartyListAdapterFactory();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        this.partyAdapter = partyListAdapterFactory.create(fragmentActivityRequireActivity, getVqThemer(), VQPageType.REVIEWDETAILS);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(0);
        VqFragmentReviewDetailsBinding binding = getBinding();
        PtrMyQueuesHeader ptrMyQueuesHeader = null;
        RecyclerView recyclerView = binding != null ? binding.groupList : null;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        VqFragmentReviewDetailsBinding binding2 = getBinding();
        RecyclerView recyclerView2 = binding2 != null ? binding2.groupList : null;
        if (recyclerView2 != null) {
            PartyListAdapter partyListAdapter = this.partyAdapter;
            if (partyListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("partyAdapter");
                partyListAdapter = null;
            }
            recyclerView2.setAdapter(partyListAdapter);
        }
        CreatePartyMainAdapter.Factory createPartyMainAdapterFactory = getCreatePartyMainAdapterFactory();
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity()");
        this.ineligibleAdapter = createPartyMainAdapterFactory.create(fragmentActivityRequireActivity2, null, getVqThemer(), true);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getActivity());
        linearLayoutManager2.setOrientation(1);
        VqFragmentReviewDetailsBinding binding3 = getBinding();
        RecyclerView recyclerView3 = binding3 != null ? binding3.ineligibleGroupList : null;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(linearLayoutManager2);
        }
        VqFragmentReviewDetailsBinding binding4 = getBinding();
        RecyclerView recyclerView4 = binding4 != null ? binding4.ineligibleGroupList : null;
        if (recyclerView4 != null) {
            CreatePartyMainAdapter createPartyMainAdapter = this.ineligibleAdapter;
            if (createPartyMainAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ineligibleAdapter");
                createPartyMainAdapter = null;
            }
            recyclerView4.setAdapter(createPartyMainAdapter);
        }
        VqFragmentReviewDetailsBinding binding5 = getBinding();
        if (binding5 != null && (button4 = binding5.continueButton) != null) {
            CommonExtensionsKt.setOnDebouncedClickListener$default(button4, 0, new Function0<Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment.onViewCreated.1
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
                    ReviewDetailsFragment reviewDetailsFragment = ReviewDetailsFragment.this;
                    reviewDetailsFragment.joinQueue(reviewDetailsFragment.selectedGuests);
                }
            }, 1, null);
        }
        VqFragmentReviewDetailsBinding binding6 = getBinding();
        if (binding6 != null && (button3 = binding6.refreshButton) != null) {
            CommonExtensionsKt.setOnDebouncedClickListener$default(button3, 0, new Function0<Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment.onViewCreated.2
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
                    ReviewDetailsFragment.this.getVirtualQueueAnalytics().trackReviewDetailsRefresh(ReviewDetailsFragment.this.queue, true);
                    ReviewDetailsFragment.this.startSoftRefresh();
                }
            }, 1, null);
        }
        VqFragmentReviewDetailsBinding binding7 = getBinding();
        if (binding7 != null && (button2 = binding7.partyHeaderCTAButton) != null) {
            CommonExtensionsKt.setOnDebouncedClickListener$default(button2, 0, new Function0<Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment.onViewCreated.3
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
                    ReviewDetailsFragment.this.showCreateParty(false);
                }
            }, 1, null);
        }
        VqFragmentReviewDetailsBinding binding8 = getBinding();
        if (binding8 != null && (button = binding8.ineligibleHeaderCTAButton) != null) {
            CommonExtensionsKt.setOnDebouncedClickListener$default(button, 0, new Function0<Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment.onViewCreated.4
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
                    ReviewDetailsFragment.this.showCreateParty(!r1.queue.getIsPlanningPartyPreselectionEnabled());
                }
            }, 1, null);
        }
        if (getLocationMonitor().mo38959c(true) == null) {
            getLocationMonitor().mo38958b(true);
        }
        FragmentActivity fragmentActivityRequireActivity3 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "requireActivity()");
        LottieLoader lottieLoader = new LottieLoader(fragmentActivityRequireActivity3, getVqThemer());
        VqFragmentReviewDetailsBinding binding9 = getBinding();
        if (binding9 != null && (lottieAnimationView2 = binding9.fullLoaderAnimationView) != null) {
            lottieLoader.setLoaderAnimationUrl(lottieAnimationView2);
        }
        VqFragmentReviewDetailsBinding binding10 = getBinding();
        TextView textView = binding10 != null ? binding10.fullLoaderText : null;
        if (textView != null) {
            textView.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsLoading, null, false, 6, null));
        }
        FragmentActivity fragmentActivityRequireActivity4 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity4, "requireActivity()");
        LottieLoader lottieLoader2 = new LottieLoader(fragmentActivityRequireActivity4, getVqThemer());
        VqFragmentReviewDetailsBinding binding11 = getBinding();
        if (binding11 != null && (lottieAnimationView = binding11.loaderAnimationView) != null) {
            lottieLoader2.setLoaderAnimationUrl(lottieAnimationView);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        PtrMyQueuesHeader ptrMyQueuesHeader2 = new PtrMyQueuesHeader(contextRequireContext);
        this.headerView = ptrMyQueuesHeader2;
        ptrMyQueuesHeader2.setVqThemer(getVqThemer());
        VqFragmentReviewDetailsBinding binding12 = getBinding();
        if (binding12 != null && (ptrDisneyContainer3 = binding12.pullToRefreshContainer) != null) {
            PtrMyQueuesHeader ptrMyQueuesHeader3 = this.headerView;
            if (ptrMyQueuesHeader3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
                ptrMyQueuesHeader3 = null;
            }
            ptrDisneyContainer3.m64011f(ptrMyQueuesHeader3);
        }
        VqFragmentReviewDetailsBinding binding13 = getBinding();
        PtrDisneyContainer ptrDisneyContainer4 = binding13 != null ? binding13.pullToRefreshContainer : null;
        if (ptrDisneyContainer4 != null) {
            PtrMyQueuesHeader ptrMyQueuesHeader4 = this.headerView;
            if (ptrMyQueuesHeader4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
                ptrMyQueuesHeader4 = null;
            }
            ptrDisneyContainer4.setHeaderView(ptrMyQueuesHeader4);
        }
        PtrMyQueuesHeader ptrMyQueuesHeader5 = this.headerView;
        if (ptrMyQueuesHeader5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        } else {
            ptrMyQueuesHeader = ptrMyQueuesHeader5;
        }
        ptrMyQueuesHeader.setVisibility(8);
        VqFragmentReviewDetailsBinding binding14 = getBinding();
        if (binding14 != null && (ptrDisneyContainer2 = binding14.pullToRefreshContainer) != null) {
            ptrDisneyContainer2.setEnablePtr(true);
        }
        VqFragmentReviewDetailsBinding binding15 = getBinding();
        if (binding15 == null || (ptrDisneyContainer = binding15.pullToRefreshContainer) == null) {
            return;
        }
        ptrDisneyContainer.setPtrHandler(new InterfaceC29611b() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment.onViewCreated.7
            @Override // p708ko.InterfaceC29611b
            public /* bridge */ /* synthetic */ boolean checkCanDoRefresh(PtrBaseContainer ptrBaseContainer, View view2, View view3) {
                return super.checkCanDoRefresh(ptrBaseContainer, view2, view3);
            }

            @Override // p708ko.InterfaceC29611b
            public void onRefreshBegin(PtrBaseContainer frame) {
                PtrDisneyContainer ptrDisneyContainer5;
                PtrDisneyContainer ptrDisneyContainer6;
                Intrinsics.checkNotNullParameter(frame, "frame");
                if (!ReviewDetailsFragment.this.getQueueStateManagement().isQueueInEarlyPartyCreationMode(ReviewDetailsFragment.this.queue)) {
                    VqFragmentReviewDetailsBinding binding16 = ReviewDetailsFragment.this.getBinding();
                    if (binding16 == null || (ptrDisneyContainer5 = binding16.pullToRefreshContainer) == null) {
                        return;
                    }
                    ptrDisneyContainer5.m64009G();
                    return;
                }
                if (!ReviewDetailsFragment.this.isInitialLoad) {
                    ReviewDetailsFragment.this.getVirtualQueueAnalytics().trackReviewDetailsRefresh(ReviewDetailsFragment.this.queue, false);
                }
                VqFragmentReviewDetailsBinding binding17 = ReviewDetailsFragment.this.getBinding();
                if (binding17 != null && (ptrDisneyContainer6 = binding17.pullToRefreshContainer) != null) {
                    ptrDisneyContainer6.setEnabled(false);
                }
                ReviewDetailsFragment.this.startSoftRefresh();
            }

            @Override // p708ko.InterfaceC29611b
            public void onRefreshFinish() {
                if (ReviewDetailsFragment.this.getQueueStateManagement().isQueueInEarlyPartyCreationMode(ReviewDetailsFragment.this.queue) && CommonExtensionsKt.isSafe(ReviewDetailsFragment.this)) {
                    VqFragmentReviewDetailsBinding binding16 = ReviewDetailsFragment.this.getBinding();
                    LinearLayout linearLayout = binding16 != null ? binding16.launchingContainer : null;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                    }
                    VqFragmentReviewDetailsBinding binding17 = ReviewDetailsFragment.this.getBinding();
                    LinearLayout linearLayout2 = binding17 != null ? binding17.launchingContainer : null;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                    ReviewDetailsFragment.this.updateIsPtrEnabled(true);
                    ReviewDetailsFragment.this.isInitialLoad = false;
                }
            }
        });
    }

    public final void setCreatePartyMainAdapterFactory(CreatePartyMainAdapter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.createPartyMainAdapterFactory = factory;
    }

    public final void setEventAttributes(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.eventAttributes = map;
    }

    public final void setFacilityUtils(FacilityUtils facilityUtils) {
        Intrinsics.checkNotNullParameter(facilityUtils, "<set-?>");
        this.facilityUtils = facilityUtils;
    }

    public final void setLocationMonitor(InterfaceC9336k interfaceC9336k) {
        Intrinsics.checkNotNullParameter(interfaceC9336k, "<set-?>");
        this.locationMonitor = interfaceC9336k;
    }

    public final void setParkAppConfiguration(C9314j c9314j) {
        Intrinsics.checkNotNullParameter(c9314j, "<set-?>");
        this.parkAppConfiguration = c9314j;
    }

    public final void setPartyListAdapterFactory(PartyListAdapter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.partyListAdapterFactory = factory;
    }

    public final void setPerformanceTracking(PerformanceTracking performanceTracking) {
        Intrinsics.checkNotNullParameter(performanceTracking, "<set-?>");
        this.performanceTracking = performanceTracking;
    }

    public final void setQueueStateManagement(QueueStateManagement queueStateManagement) {
        Intrinsics.checkNotNullParameter(queueStateManagement, "<set-?>");
        this.queueStateManagement = queueStateManagement;
    }

    public final void setViewModelFactory(C3821v0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.viewModelFactory = cVar;
    }

    public final void setVirtualQueueAnalytics(VirtualQueueAnalytics virtualQueueAnalytics) {
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "<set-?>");
        this.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public final void setVirtualQueueManager(VirtualQueueManager virtualQueueManager) {
        Intrinsics.checkNotNullParameter(virtualQueueManager, "<set-?>");
        this.virtualQueueManager = virtualQueueManager;
    }

    public final void setupQueuePark(Facility facility) {
        getPartyViewModel().setupQueueParkName(facility);
    }
}