package com.disney.wdpro.virtualqueue.core.fragments;

import android.content.Context;
import android.content.Intent;
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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC3694e0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC3830y;
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
import com.disney.wdpro.p147ma.accessibility.MAAccessibilityConstants;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import com.disney.wdpro.recommender.services.RecommenderServiceConstants;
import com.disney.wdpro.support.anim.SnowballNextFlowAnimation;
import com.disney.wdpro.support.dialog.ErrorBannerFragment;
import com.disney.wdpro.support.ftue.C20751b;
import com.disney.wdpro.support.sticky_header.C20918m;
import com.disney.wdpro.support.widget.SnowballHeader;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrBaseContainer;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrDisneyContainer;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import com.disney.wdpro.virtualqueue.core.interfaces.CreatePartyActions;
import com.disney.wdpro.virtualqueue.core.interfaces.QueueStateManagement;
import com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueNavigationEntriesProvider;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingAttribute;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingEventName;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingScreenName;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentCreatePartyBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.CommonExtensionsKt;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegate;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegateKt;
import com.disney.wdpro.virtualqueue.p462ui.common.LottieLoader;
import com.disney.wdpro.virtualqueue.p462ui.common.SingleLiveEvent;
import com.disney.wdpro.virtualqueue.p462ui.common.SnowballAnimationUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.SnowballItemAnimator;
import com.disney.wdpro.virtualqueue.p462ui.create_party.CreatePartyMainAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PtrMyQueuesHeader;
import com.disney.wdpro.virtualqueue.service.model.Conflict;
import com.disney.wdpro.virtualqueue.service.model.GetLinkedGuestsRequestType;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.JoinQueueErrorResponse;
import com.disney.wdpro.virtualqueue.service.model.JoinQueueErrorResponseStatus;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.service.model.QueueDayPhase;
import com.disney.wdpro.virtualqueue.service.model.QueueGuestIdMode;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.C30069i0;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.InterfaceC30065h0;
import p498da.InterfaceC27132a;
import p708ko.InterfaceC29611b;
import p860q1.C31640h;

@Metadata(m92037d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 í\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002í\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u0006J\u001f\u0010&\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\u0006J-\u0010/\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020-0*H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020$H\u0002¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00072\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0007H\u0002¢\u0006\u0004\b>\u0010\u0006J\u0019\u0010A\u001a\u00020\u00072\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ-\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010D\u001a\u00020C2\b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bH\u0010IJ!\u0010K\u001a\u00020\u00072\u0006\u0010J\u001a\u00020G2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u00020\u00072\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bM\u0010BJ\u000f\u0010N\u001a\u00020\u0007H\u0016¢\u0006\u0004\bN\u0010\u0006J\u000f\u0010O\u001a\u00020\u0007H\u0016¢\u0006\u0004\bO\u0010\u0006J)\u0010T\u001a\u00020\u00072\u0006\u0010P\u001a\u00020$2\u0006\u0010Q\u001a\u00020$2\b\u0010S\u001a\u0004\u0018\u00010RH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0007H\u0016¢\u0006\u0004\bV\u0010\u0006J\u0017\u0010W\u001a\u00020\u00072\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\bW\u00109J\u0017\u0010Y\u001a\u00020\u00072\u0006\u0010X\u001a\u00020$H\u0016¢\u0006\u0004\bY\u00103J\u0017\u0010[\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\"H\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\"H\u0016¢\u0006\u0004\b]\u0010\\J\u0017\u0010^\u001a\u00020\u00072\u0006\u00101\u001a\u00020$H\u0016¢\u0006\u0004\b^\u00103J'\u0010d\u001a\u00020\u00072\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020_2\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\"H\u0016¢\u0006\u0004\bf\u0010gR\"\u0010i\u001a\u00020h8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010p\u001a\u00020o8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010w\u001a\u00020v8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R&\u0010~\u001a\u00020}8\u0006@\u0006X\u0087.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R*\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¡\u0001\u001a\u00030 \u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R*\u0010¨\u0001\u001a\u00030§\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R#\u0010³\u0001\u001a\u0005\u0018\u00010®\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u001a\u0010µ\u0001\u001a\u00030´\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001a\u0010¸\u0001\u001a\u00030·\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0019\u0010º\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0019\u0010¼\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u001f\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010À\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0019\u0010Â\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010»\u0001R\u0019\u0010Ã\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010½\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010½\u0001R\u0019\u0010Å\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010½\u0001R\u0019\u0010Æ\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010»\u0001R\u0019\u0010Ç\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010»\u0001R\u0019\u0010È\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010»\u0001R\u0019\u0010É\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010»\u0001R\u0019\u0010Ê\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010»\u0001R\u0019\u0010Ë\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010»\u0001R\u0019\u0010Ì\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010»\u0001R\u0019\u0010Í\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010½\u0001R\u0019\u0010Î\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010½\u0001R\u0019\u0010Ï\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010½\u0001R7\u0010Ò\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0005\u0012\u00030Ñ\u00010Ð\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R\u0019\u0010Ø\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Á\u0001R\u0017\u0010Y\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bY\u0010Á\u0001R\u0019\u0010Ù\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Á\u0001R!\u0010ß\u0001\u001a\u00030Ú\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b,\u0010¿\u0001R\u001f\u0010à\u0001\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010¿\u0001R\u001f\u0010á\u0001\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010¿\u0001R\u001f\u0010â\u0001\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010¿\u0001R\u001f\u0010ã\u0001\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010¿\u0001R\u0017\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010ä\u0001R\u0019\u0010å\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010»\u0001R\u0019\u0010æ\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010»\u0001R\u0019\u0010ç\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010½\u0001R\u001f\u0010è\u0001\u001a\b\u0012\u0004\u0012\u00020-0*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010¿\u0001R\u0018\u0010ì\u0001\u001a\u00030é\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\bê\u0001\u0010ë\u0001¨\u0006î\u0001"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/CreatePartyFragment;", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueBaseFragment;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/CreatePartyActions;", "Lda/a;", "Lkotlinx/coroutines/h0;", "<init>", "()V", "", "startSoftRefresh", "updateRefreshCTABox", "setRefreshMessage", "", "textToAnnounce", "sendAnnouncementEvent", "(Ljava/lang/String;)V", "Lcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsRequestType;", "requestType", "loadLinkedTickets", "(Lcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsRequestType;)V", "observeViewModel", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "setupUI", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "showEarlyPartyBanner", "handleQueueOpen", "showNextStepMessage", "()Ljava/lang/String;", "showAnonymousQueueClosedErrorMessage", "showIdentifiedQueueClosedErrorMessage", "showQueueClosedErrorMessage", "showGenericErrorMessage", "showTryAgainErrorMessage", "resetUI", "", "refreshOnDismiss", "", "maxParty", "showMaxPartySizeExceededErrorMessage", "(ZI)V", "handleContinue", "showReviewDetailsInEarlyCreation", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "selectedGuests", "Lcom/disney/wdpro/virtualqueue/service/model/Conflict;", "initialConflicts", "showConflictScreen", "(Ljava/util/List;Ljava/util/List;)V", "partySize", "joinAnonymousQueue", "(I)V", "joinQueue", "(Ljava/util/List;)V", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "response", "onJoinQueueSuccess", "(Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;)V", "Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponse;", "errorResponse", "onJoinQueueError", "(Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponse;)V", "queueClosedNavigation", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onActivityCreated", "onResume", "onDestroy", OrionDeepLinkConstants.REQUEST_CODE_KEY, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "showLinkTicket", "showConfirmation", "size", "updatedPartySize", MAAccessibilityConstants.SELECTED, "toggledSelectAll", "(Z)V", "toggledGuestSelection", "updateAnonymousPartySize", "Landroid/widget/TextView;", "minus", "plus", "Landroid/widget/LinearLayout;", "warningLayout", "closedQuMessage", "(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;)V", "onBackPressed", "()Z", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "virtualQueueManager", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "getVirtualQueueManager", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "setVirtualQueueManager", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "getVirtualQueueAnalytics", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "setVirtualQueueAnalytics", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;)V", "Lcom/disney/wdpro/commons/monitor/k;", "locationMonitor", "Lcom/disney/wdpro/commons/monitor/k;", "getLocationMonitor", "()Lcom/disney/wdpro/commons/monitor/k;", "setLocationMonitor", "(Lcom/disney/wdpro/commons/monitor/k;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "navigationEntriesProvider", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "getNavigationEntriesProvider", "()Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "setNavigationEntriesProvider", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;)V", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/commons/j;", "getParkAppConfiguration", "()Lcom/disney/wdpro/commons/j;", "setParkAppConfiguration", "(Lcom/disney/wdpro/commons/j;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "getFacilityUtils", "()Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "setFacilityUtils", "(Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "performanceTracking", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "getPerformanceTracking", "()Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "setPerformanceTracking", "(Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;)V", "Landroidx/lifecycle/v0$c;", "viewModelFactory", "Landroidx/lifecycle/v0$c;", "getViewModelFactory", "()Landroidx/lifecycle/v0$c;", "setViewModelFactory", "(Landroidx/lifecycle/v0$c;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;", "queueStateManagement", "Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;", "getQueueStateManagement", "()Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;", "setQueueStateManagement", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;)V", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$Factory;", "createPartyMainAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$Factory;", "getCreatePartyMainAdapterFactory", "()Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$Factory;", "setCreatePartyMainAdapterFactory", "(Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$Factory;)V", "Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentCreatePartyBinding;", "binding$delegate", "Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentCreatePartyBinding;", "binding", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter;", "adapter", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader;", "headerView", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader;", "fromHubLanding", "Z", "queueId", "Ljava/lang/String;", "loggedInGuestOnly", "Ljava/util/List;", RecommenderServiceConstants.ANONYMOUS_PARTY_SIZE, "I", "needsRefreshForLinkedTickets", "queueOpenTime", "completionDeepLink", "currentJoinWindowIdHash", "isDeepLinkedFlow", "isAnonymous", VirtualQueueConstants.SUPPRESS_HOW_TO_ENTER, VirtualQueueConstants.SUPPRESS_CLOSE_ON_CONFIRMATION, "isInitialLoad", "isDifferentJoinWindow", VirtualQueueConstants.ORIGINATED_FROM_DEEPLINK_PARAM, "headerText", "parkName", "nextStepsMessage", "", "", "eventAttributes", "Ljava/util/Map;", "getEventAttributes", "()Ljava/util/Map;", "setEventAttributes", "(Ljava/util/Map;)V", "changesMade", "currentMaxParty", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel;", "partyViewModel$delegate", "Lkotlin/Lazy;", "getPartyViewModel", "()Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel;", "partyViewModel", "ineligiblePartyGuests", "conflictedGuests", "unselectedGuests", "allGuests", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "isOnboarded", "noLinkedGuests", "correlationId", "conflicts", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nCreatePartyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePartyFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/CreatePartyFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,926:1\n1549#2:927\n1620#2,3:928\n1549#2:931\n1620#2,3:932\n*S KotlinDebug\n*F\n+ 1 CreatePartyFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/CreatePartyFragment\n*L\n689#1:927\n689#1:928,3\n787#1:931\n787#1:932,3\n*E\n"})
/* loaded from: classes20.dex */
public final class CreatePartyFragment extends VirtualQueueBaseFragment implements CreatePartyActions, InterfaceC27132a, InterfaceC30065h0 {
    private CreatePartyMainAdapter adapter;
    private int anonymousPartySize;
    private int changesMade;

    @Inject
    public CreatePartyMainAdapter.Factory createPartyMainAdapterFactory;
    private int currentMaxParty;

    @Inject
    public FacilityUtils facilityUtils;
    private boolean fromHubLanding;
    private PtrMyQueuesHeader headerView;
    private boolean isAnonymous;
    private boolean isDeepLinkedFlow;
    private boolean isDifferentJoinWindow;
    private boolean isOnboarded;

    @Inject
    public InterfaceC9336k locationMonitor;

    @Inject
    public VirtualQueueNavigationEntriesProvider navigationEntriesProvider;
    private boolean needsRefreshForLinkedTickets;
    private boolean noLinkedGuests;
    private boolean originatedFromDeeplink;

    @Inject
    public C9314j parkAppConfiguration;

    @Inject
    public PerformanceTracking performanceTracking;

    @Inject
    public QueueStateManagement queueStateManagement;
    private boolean suppressCloseOnConfirmation;
    private boolean suppressHowToEnter;
    private int updatedPartySize;

    @Inject
    public C3821v0.c viewModelFactory;

    @Inject
    public VirtualQueueAnalytics virtualQueueAnalytics;

    @Inject
    public VirtualQueueManager virtualQueueManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CreatePartyFragment.class, "binding", "getBinding()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentCreatePartyBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ InterfaceC30065h0 $$delegate_0 = C30069i0.m92781b();

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding = FragmentViewBindingDelegateKt.viewBinding(this, CreatePartyFragment$binding$2.INSTANCE);
    private String queueId = "";
    private List<LinkedGuest> loggedInGuestOnly = CollectionsKt.emptyList();
    private String queueOpenTime = "";
    private String completionDeepLink = "";
    private String currentJoinWindowIdHash = "";
    private boolean isInitialLoad = true;
    private String headerText = "";
    private String parkName = "";
    private String nextStepsMessage = "";
    private Map<String, Object> eventAttributes = new LinkedHashMap();

    /* renamed from: partyViewModel$delegate, reason: from kotlin metadata */
    private final Lazy partyViewModel = LazyKt.lazy(new Function0<PartyViewModel>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment$partyViewModel$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PartyViewModel invoke() {
            return (PartyViewModel) C3827w0.m20290f(this.this$0.requireActivity(), this.this$0.getViewModelFactory()).m20262a(PartyViewModel.class);
        }
    });
    private List<LinkedGuest> selectedGuests = CollectionsKt.emptyList();
    private List<LinkedGuest> ineligiblePartyGuests = CollectionsKt.emptyList();
    private List<LinkedGuest> conflictedGuests = CollectionsKt.emptyList();
    private List<LinkedGuest> unselectedGuests = CollectionsKt.emptyList();
    private List<LinkedGuest> allGuests = CollectionsKt.emptyList();
    private Queue queue = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
    private String correlationId = "";
    private List<Conflict> conflicts = CollectionsKt.emptyList();

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/CreatePartyFragment$Companion;", "", "()V", "newInstance", "Lcom/disney/wdpro/virtualqueue/core/fragments/CreatePartyFragment;", "data", "Landroid/os/Bundle;", "isAnonymous", "", VirtualQueueConstants.SUPPRESS_HOW_TO_ENTER, VirtualQueueConstants.SELECT_GUEST_IN_PARTY, "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CreatePartyFragment newInstance$default(Companion companion, Bundle bundle, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = true;
            }
            if ((i10 & 8) != 0) {
                z12 = true;
            }
            return companion.newInstance(bundle, z10, z11, z12);
        }

        public final CreatePartyFragment newInstance(Bundle data, boolean isAnonymous, boolean suppressHowToEnter, boolean selectGuestInParty) {
            CreatePartyFragment createPartyFragment = new CreatePartyFragment();
            if (data != null) {
                data.putBoolean("isAnonymous", isAnonymous);
            }
            if (data != null) {
                data.putBoolean(VirtualQueueConstants.SUPPRESS_HOW_TO_ENTER, suppressHowToEnter);
            }
            if (data != null) {
                data.putBoolean(VirtualQueueConstants.SELECT_GUEST_IN_PARTY, selectGuestInParty);
            }
            createPartyFragment.setArguments(data);
            return createPartyFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[QueueGuestIdMode.values().length];
            try {
                iArr[QueueGuestIdMode.IDENTIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QueueGuestIdMode.ANONYMOUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[JoinQueueErrorResponseStatus.values().length];
            try {
                iArr2[JoinQueueErrorResponseStatus.INVALID_GUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[JoinQueueErrorResponseStatus.PAUSED_QUEUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[JoinQueueErrorResponseStatus.CLOSED_QUEUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[JoinQueueErrorResponseStatus.MAX_PARTY_SIZE_EXCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment$observeViewModel$1", m92053f = "CreatePartyFragment.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment$observeViewModel$1 */
    static final class C215471 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C215471(Continuation<? super C215471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreatePartyFragment.this.new C215471(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SingleLiveEvent<PartyViewModel.UiState> state = CreatePartyFragment.this.getPartyViewModel().getState();
            final CreatePartyFragment createPartyFragment = CreatePartyFragment.this;
            state.observe(createPartyFragment, new CreatePartyFragment$sam$androidx_lifecycle_Observer$0(new Function1<PartyViewModel.UiState, Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment.observeViewModel.1.1
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
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (it instanceof PartyViewModel.UiState.Error) {
                        createPartyFragment.showGenericErrorMessage();
                    } else if (it instanceof PartyViewModel.UiState.QueueOpen) {
                        PartyViewModel.UiState.QueueOpen queueOpen = (PartyViewModel.UiState.QueueOpen) it;
                        createPartyFragment.noLinkedGuests = queueOpen.getAllGuests().isEmpty();
                        createPartyFragment.selectedGuests = queueOpen.getSelectedGuests();
                        createPartyFragment.ineligiblePartyGuests = queueOpen.getIneligiblePartyGuests();
                        createPartyFragment.conflictedGuests = queueOpen.getConflictedGuests();
                        createPartyFragment.unselectedGuests = queueOpen.getUnselectedGuests();
                        createPartyFragment.allGuests = queueOpen.getAllGuests();
                        createPartyFragment.queue = queueOpen.getQueue();
                        createPartyFragment.isOnboarded = queueOpen.isOnboardedParty();
                        createPartyFragment.correlationId = queueOpen.getCorrelationId();
                        createPartyFragment.conflicts = queueOpen.getConflicts();
                        CreatePartyFragment createPartyFragment2 = createPartyFragment;
                        createPartyFragment2.nextStepsMessage = createPartyFragment2.showNextStepMessage();
                        createPartyFragment.handleQueueOpen();
                        createPartyFragment.getActivityActions().setTitle(createPartyFragment.headerText, createPartyFragment.getQueueStateManagement().isQueueInEarlyPartyCreationMode(createPartyFragment.queue));
                        if (!createPartyFragment.isInitialLoad) {
                            CreatePartyFragment createPartyFragment3 = createPartyFragment;
                            createPartyFragment3.setupUI(createPartyFragment3.queue);
                        }
                        VqFragmentCreatePartyBinding binding = createPartyFragment.getBinding();
                        if (binding != null && (ptrDisneyContainer = binding.pullToRefreshContainer) != null) {
                            ptrDisneyContainer.m64009G();
                        }
                    } else if (it instanceof PartyViewModel.UiState.JoinQueue) {
                        createPartyFragment.onJoinQueueSuccess(((PartyViewModel.UiState.JoinQueue) it).getResponse());
                    } else if (it instanceof PartyViewModel.UiState.JoinError) {
                        createPartyFragment.onJoinQueueError(((PartyViewModel.UiState.JoinError) it).getErrorResponse());
                    }
                    AbstractC3830y<QueueGuestIdMode> queueType = createPartyFragment.getPartyViewModel().getQueueType();
                    InterfaceC3814s viewLifecycleOwner = createPartyFragment.getViewLifecycleOwner();
                    final CreatePartyFragment createPartyFragment4 = createPartyFragment;
                    queueType.observe(viewLifecycleOwner, new CreatePartyFragment$sam$androidx_lifecycle_Observer$0(new Function1<QueueGuestIdMode, Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment.observeViewModel.1.1.1

                        @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
                        /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment$observeViewModel$1$1$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[QueueGuestIdMode.values().length];
                                try {
                                    iArr[QueueGuestIdMode.IDENTIFIED.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[QueueGuestIdMode.ANONYMOUS.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(QueueGuestIdMode queueGuestIdMode) {
                            invoke2(queueGuestIdMode);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(QueueGuestIdMode queueGuestIdMode) {
                            int i10 = queueGuestIdMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[queueGuestIdMode.ordinal()];
                            if (i10 == 1) {
                                createPartyFragment4.showIdentifiedQueueClosedErrorMessage();
                            } else if (i10 == 2) {
                                createPartyFragment4.showAnonymousQueueClosedErrorMessage();
                            }
                            if (createPartyFragment4.queue.getIsAcceptingPartyCreation() && createPartyFragment4.queue.getIsAcceptingJoins()) {
                                createPartyFragment4.showQueueClosedErrorMessage();
                            }
                        }
                    }));
                }
            }));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215471) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VqFragmentCreatePartyBinding getBinding() {
        return (VqFragmentCreatePartyBinding) this.binding.getValue2((Fragment) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PartyViewModel getPartyViewModel() {
        return (PartyViewModel) this.partyViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleContinue() {
        VqFragmentCreatePartyBinding binding = getBinding();
        CreatePartyMainAdapter createPartyMainAdapter = null;
        Button button = binding != null ? binding.continueButton : null;
        if (button != null) {
            button.setEnabled(false);
        }
        if (this.queue.getGuestIdMode() == QueueGuestIdMode.IDENTIFIED) {
            PartyViewModel partyViewModel = getPartyViewModel();
            CreatePartyMainAdapter createPartyMainAdapter2 = this.adapter;
            if (createPartyMainAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                createPartyMainAdapter = createPartyMainAdapter2;
            }
            List<LinkedGuest> selectedGuests = createPartyMainAdapter.getSelectedGuests();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectedGuests, 10));
            Iterator<T> it = selectedGuests.iterator();
            while (it.hasNext()) {
                arrayList.add(((LinkedGuest) it.next()).getGuestId());
            }
            partyViewModel.modifyParty(arrayList);
        }
        QueueGuestIdMode guestIdMode = this.queue.getGuestIdMode();
        QueueGuestIdMode queueGuestIdMode = QueueGuestIdMode.IDENTIFIED;
        if (guestIdMode == queueGuestIdMode) {
            getVirtualQueueAnalytics().trackConfirmParty(this.allGuests, this.queue);
        } else {
            VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
            List<LinkedGuest> list = this.selectedGuests;
            Queue queue = this.queue;
            virtualQueueAnalytics.trackAnonymousGetInLine(list, queue, this.anonymousPartySize, queue.getHowToEnterMessage());
        }
        if (this.queue.getIsAcceptingJoins()) {
            if (this.queue.getGuestIdMode() == QueueGuestIdMode.ANONYMOUS) {
                joinAnonymousQueue(this.anonymousPartySize);
                return;
            } else {
                joinQueue(this.selectedGuests);
                return;
            }
        }
        if (!this.queue.getIsAcceptingPartyCreation() || this.queue.getGuestIdMode() != queueGuestIdMode) {
            showQueueClosedErrorMessage();
        } else if (this.queue.getIsPlanningPartyPreselectionEnabled()) {
            getActivityActions().navigateBack();
        } else {
            showReviewDetailsInEarlyCreation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleQueueOpen() {
        Button button;
        RecyclerView recyclerView;
        Resources resources;
        if (this.isInitialLoad) {
            this.currentJoinWindowIdHash = this.queue.getJoinWindowIdHash();
        } else if (!Intrinsics.areEqual(this.currentJoinWindowIdHash, this.queue.getJoinWindowIdHash())) {
            this.isDifferentJoinWindow = true;
        }
        boolean z10 = false;
        if (getQueueStateManagement().isQueueInEarlyPartyCreationMode(this.queue) && this.isAnonymous) {
            showEarlyPartyBanner();
            updateRefreshCTABox();
        } else {
            VqFragmentCreatePartyBinding binding = getBinding();
            if (binding != null) {
                binding.updateScreenContainer.setVisibility(8);
                binding.continueButton.setEnabled(!this.selectedGuests.isEmpty());
                binding.continueButton.setVisibility(0);
                binding.continueButton.sendAccessibilityEvent(8);
                binding.refreshMessage.setVisibility(8);
                binding.refreshButton.setVisibility(8);
            }
        }
        if (!this.queue.getIsAcceptingPartyCreation()) {
            VqFragmentCreatePartyBinding binding2 = getBinding();
            TextView textView = binding2 != null ? binding2.updateScreenWarningText : null;
            if (textView != null) {
                textView.setText(this.nextStepsMessage);
            }
            CommonExtensionsKt.refreshTipBoard(this);
            getPartyViewModel().showClosedQueueMessage();
        }
        this.currentMaxParty = this.queue.getMaxPartySize();
        Facility facility = getFacilityUtils().getFacility(this.queue.getExternalDefinitionId());
        String ancestorThemePark = facility != null ? facility.getAncestorThemePark() : null;
        if (ancestorThemePark == null) {
            ancestorThemePark = "";
        }
        this.parkName = ancestorThemePark;
        String string$default = VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.NonAttractionHeight, this.queue.getContentId(), false, 4, null);
        Date time = Calendar.getInstance(getFacilityUtils().getTimezone()).getTime();
        Context context = getContext();
        String formattedDisplay = new SimpleDateFormat((context == null || (resources = context.getResources()) == null) ? null : resources.getString(C21487R.string.format_date)).format(time);
        CreatePartyMainAdapter createPartyMainAdapter = this.adapter;
        if (createPartyMainAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            createPartyMainAdapter = null;
        }
        Queue queue = this.queue;
        boolean z11 = this.suppressHowToEnter;
        Intrinsics.checkNotNullExpressionValue(formattedDisplay, "formattedDisplay");
        createPartyMainAdapter.setQueueNameHeader(queue, string$default, z11, formattedDisplay);
        if (this.queue.getIsAcceptingPartyCreation() && !this.queue.getIsAcceptingJoins()) {
            z10 = true;
        }
        VqFragmentCreatePartyBinding binding3 = getBinding();
        Button button2 = binding3 != null ? binding3.continueButton : null;
        if (button2 != null) {
            button2.setText(!z10 ? VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.CreatePartyMainCta, this.queue.getContentId(), false, 4, null) : (this.queue.getDayPhase() == QueueDayPhase.PRE_OPEN || this.queue.getIsAcceptingPartyCreation()) ? VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.CreatePartyAlternateCta, this.queue.getContentId(), false, 4, null) : VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.CreatePartyMainCta, this.queue.getContentId(), false, 4, null));
        }
        if (this.queue.getGuestIdMode() == QueueGuestIdMode.ANONYMOUS) {
            CreatePartyMainAdapter createPartyMainAdapter2 = this.adapter;
            if (createPartyMainAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                createPartyMainAdapter2 = null;
            }
            createPartyMainAdapter2.setTotalGuests(this.queue.getMaxPartySize());
            VqFragmentCreatePartyBinding binding4 = getBinding();
            button = binding4 != null ? binding4.continueButton : null;
            if (button != null) {
                button.setEnabled(true);
            }
            this.loggedInGuestOnly = this.allGuests;
            VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
            List<LinkedGuest> list = this.allGuests;
            Queue queue2 = this.queue;
            String howToEnterMessage = queue2.getHowToEnterMessage();
            String simpleName = CreatePartyFragment.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
            virtualQueueAnalytics.trackAnonymousCreatePartyLoad(list, queue2, howToEnterMessage, simpleName);
            this.eventAttributes.put(PerformanceTrackingAttribute.SELECTED_GUESTS_START.getAttrName(), Integer.valueOf(this.loggedInGuestOnly.size()));
            this.eventAttributes.put(PerformanceTrackingAttribute.ANONYMOUS_GUEST.getAttrName(), Boolean.TRUE);
        } else {
            if (Intrinsics.areEqual(getParkAppConfiguration().m38908h(), "WDW") && this.allGuests.isEmpty()) {
                showGenericErrorMessage();
            } else {
                CreatePartyMainAdapter createPartyMainAdapter3 = this.adapter;
                if (createPartyMainAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    createPartyMainAdapter3 = null;
                }
                createPartyMainAdapter3.setGuests(this.selectedGuests, this.unselectedGuests, this.conflictedGuests);
                CreatePartyMainAdapter createPartyMainAdapter4 = this.adapter;
                if (createPartyMainAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    createPartyMainAdapter4 = null;
                }
                createPartyMainAdapter4.updateGuestConflicts(this.conflicts, this.queue, this.parkName);
                VqFragmentCreatePartyBinding binding5 = getBinding();
                button = binding5 != null ? binding5.continueButton : null;
                if (button != null) {
                    button.setEnabled(!this.selectedGuests.isEmpty());
                }
            }
            VirtualQueueAnalytics virtualQueueAnalytics2 = getVirtualQueueAnalytics();
            List<LinkedGuest> list2 = this.allGuests;
            Queue queue3 = this.queue;
            int size = this.selectedGuests.size();
            String simpleName2 = CreatePartyFragment.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName2, "javaClass.simpleName");
            virtualQueueAnalytics2.trackCreatePartyLoad(list2, queue3, size, simpleName2);
            this.eventAttributes.put(PerformanceTrackingAttribute.LINKED_GUESTS.getAttrName(), Integer.valueOf(this.allGuests.size()));
            this.eventAttributes.put(PerformanceTrackingAttribute.SELECTED_GUESTS_START.getAttrName(), Integer.valueOf(this.selectedGuests.size()));
            this.eventAttributes.put(PerformanceTrackingAttribute.UNSELECTED_GUESTS_START.getAttrName(), Integer.valueOf(this.unselectedGuests.size()));
            this.eventAttributes.put(PerformanceTrackingAttribute.ANONYMOUS_GUEST.getAttrName(), Boolean.FALSE);
        }
        VqFragmentCreatePartyBinding binding6 = getBinding();
        if (binding6 != null && (recyclerView = binding6.itemList) != null) {
            PerformanceTracking.logLoadTime$default(getPerformanceTracking(), PerformanceTrackingScreenName.CREATE_PARTY_SCREEN, recyclerView, this.correlationId, false, false, 16, null);
        }
        getPerformanceTracking().logTimedActionStart(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
    }

    private final void joinAnonymousQueue(int partySize) {
        VqFragmentCreatePartyBinding binding = getBinding();
        CreatePartyMainAdapter createPartyMainAdapter = null;
        Button button = binding != null ? binding.continueButton : null;
        if (button != null) {
            button.setEnabled(false);
        }
        CreatePartyMainAdapter createPartyMainAdapter2 = this.adapter;
        if (createPartyMainAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            createPartyMainAdapter = createPartyMainAdapter2;
        }
        createPartyMainAdapter.showLoading(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.CreatePartyJoinLoading, this.queue.getContentId(), false, 4, null));
        this.eventAttributes.put(PerformanceTrackingAttribute.SELECTED_GUESTS_END.getAttrName(), Integer.valueOf(partySize));
        this.eventAttributes.put(PerformanceTrackingAttribute.CHANGES_MADE.getAttrName(), Integer.valueOf(this.changesMade));
        this.eventAttributes.put(PerformanceTrackingAttribute.EXIT_POINT.getAttrName(), PerformanceTrackingAttribute.EXIT_SUCCESS.getAttrName());
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.JOIN_FLOW_TIME, this.eventAttributes);
        getPartyViewModel().onJoinAnonymousQueue(this.queue.getQueueId(), partySize);
    }

    private final void joinQueue(List<LinkedGuest> selectedGuests) {
        VqFragmentCreatePartyBinding binding = getBinding();
        CreatePartyMainAdapter createPartyMainAdapter = null;
        Button button = binding != null ? binding.continueButton : null;
        if (button != null) {
            button.setEnabled(false);
        }
        CreatePartyMainAdapter createPartyMainAdapter2 = this.adapter;
        if (createPartyMainAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            createPartyMainAdapter = createPartyMainAdapter2;
        }
        createPartyMainAdapter.showLoading(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.CreatePartyJoinLoading, this.queue.getContentId(), false, 4, null));
        PartyViewModel partyViewModel = getPartyViewModel();
        String queueId = this.queue.getQueueId();
        List<LinkedGuest> list = selectedGuests;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LinkedGuest) it.next()).getGuestId());
        }
        partyViewModel.onJoinQueue(queueId, arrayList);
    }

    private final void loadLinkedTickets(GetLinkedGuestsRequestType requestType) {
        this.needsRefreshForLinkedTickets = false;
        VqFragmentCreatePartyBinding binding = getBinding();
        Button button = binding != null ? binding.continueButton : null;
        if (button != null) {
            button.setEnabled(false);
        }
        getPartyViewModel().getLinkedGuests(this.queueId, this.isDeepLinkedFlow, requestType);
    }

    static /* synthetic */ void loadLinkedTickets$default(CreatePartyFragment createPartyFragment, GetLinkedGuestsRequestType getLinkedGuestsRequestType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            getLinkedGuestsRequestType = GetLinkedGuestsRequestType.DEFAULT;
        }
        createPartyFragment.loadLinkedTickets(getLinkedGuestsRequestType);
    }

    private final void observeViewModel() {
        C30113j.m92948d(C3816t.m20245a(this), null, null, new C215471(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onJoinQueueError(JoinQueueErrorResponse errorResponse) {
        CommonExtensionsKt.refreshTipBoard(this);
        int i10 = WhenMappings.$EnumSwitchMapping$1[errorResponse.getResponseStatus().ordinal()];
        if (i10 == 1) {
            showConflictScreen(this.selectedGuests, errorResponse.getConflicts());
            return;
        }
        if (i10 == 2 || i10 == 3) {
            showQueueClosedErrorMessage();
            return;
        }
        if (i10 == 4) {
            int iIntValue = errorResponse.getErrorData().getOrDefault("maxPartySize", Integer.valueOf(this.queue.getMaxPartySize())).intValue();
            this.currentMaxParty = iIntValue;
            showMaxPartySizeExceededErrorMessage(true, iIntValue);
        } else if (errorResponse.getHttpStatus() == 429) {
            showTryAgainErrorMessage();
        } else {
            showGenericErrorMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onJoinQueueSuccess(GetPositionsResponse response) {
        getVirtualQueueAnalytics().trackLocation(getLocationMonitor());
        showConfirmation(response);
    }

    private final void queueClosedNavigation() {
        AbstractC3694e0 supportFragmentManager;
        AbstractC3694e0 supportFragmentManager2;
        getVirtualQueueAnalytics().trackBackPress();
        this.eventAttributes.put(PerformanceTrackingAttribute.SELECTED_GUESTS_END.getAttrName(), Integer.valueOf(this.updatedPartySize));
        this.eventAttributes.put(PerformanceTrackingAttribute.CHANGES_MADE.getAttrName(), Integer.valueOf(this.changesMade));
        this.eventAttributes.put(PerformanceTrackingAttribute.EXIT_POINT.getAttrName(), PerformanceTrackingAttribute.EXIT_BACK_PRESSED.getAttrName());
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.JOIN_FLOW_TIME, this.eventAttributes);
        FragmentActivity activity = getActivity();
        if (((activity == null || (supportFragmentManager2 = activity.getSupportFragmentManager()) == null) ? 0 : supportFragmentManager2.m19773x0()) <= 0) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        FragmentActivity activity3 = getActivity();
        if (activity3 == null || (supportFragmentManager = activity3.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.m19748l1();
    }

    private final void resetUI() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.queue.getGuestIdMode().ordinal()];
        if (i10 == 1) {
            showIdentifiedQueueClosedErrorMessage();
        } else {
            if (i10 != 2) {
                return;
            }
            showAnonymousQueueClosedErrorMessage();
        }
    }

    private final void sendAnnouncementEvent(String textToAnnounce) {
        Object systemService = requireContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.setClassName(accessibilityEventObtain.getClass().getName());
            accessibilityEventObtain.setPackageName(requireContext().getPackageName());
            accessibilityEventObtain.getText().add(textToAnnounce);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
    }

    private final void setRefreshMessage() {
        TextView textView;
        if (!this.isInitialLoad) {
            String str = new SimpleDateFormat(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.MyLinesLastUpdatedDateFormat, null, false, 6, null), Locale.US).format(new Date());
            VqFragmentCreatePartyBinding binding = getBinding();
            textView = binding != null ? binding.refreshMessage : null;
            if (textView != null) {
                textView.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.MyLinesLoadingLastUpdated, MapsKt.mapOf(TuplesKt.m92045to("date", str)), null, false, 12, null));
            }
            sendAnnouncementEvent(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsUpdated, null, false, 6, null));
            return;
        }
        if (StringsKt.isBlank(this.queueOpenTime)) {
            VqFragmentCreatePartyBinding binding2 = getBinding();
            textView = binding2 != null ? binding2.refreshMessage : null;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        VqFragmentCreatePartyBinding binding3 = getBinding();
        textView = binding3 != null ? binding3.refreshMessage : null;
        if (textView == null) {
            return;
        }
        textView.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsRefreshMessage, MapsKt.mapOf(TuplesKt.m92045to("time", this.queueOpenTime)), null, false, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupUI(Queue queue) {
        CreatePartyMainAdapter createPartyMainAdapter = this.adapter;
        if (createPartyMainAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            createPartyMainAdapter = null;
        }
        createPartyMainAdapter.updateMaxPartySize(queue.getMaxPartySize());
        if (getQueueStateManagement().isQueueInEarlyPartyCreationMode(queue) && this.isAnonymous) {
            showEarlyPartyBanner();
            updateRefreshCTABox();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAnonymousQueueClosedErrorMessage() {
        CommonExtensionsKt.refreshTipBoard(this);
        CreatePartyMainAdapter createPartyMainAdapter = this.adapter;
        if (createPartyMainAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            createPartyMainAdapter = null;
        }
        createPartyMainAdapter.setTotalGuests(this.queue.getMaxPartySize());
    }

    private final void showConflictScreen(List<LinkedGuest> selectedGuests, List<Conflict> initialConflicts) {
        ConflictFragment conflictFragmentNewInstance = ConflictFragment.INSTANCE.newInstance(selectedGuests, this.queue, initialConflicts, this.completionDeepLink, this.suppressCloseOnConfirmation);
        this.eventAttributes.put(PerformanceTrackingAttribute.SELECTED_GUESTS_END.getAttrName(), selectedGuests);
        this.eventAttributes.put(PerformanceTrackingAttribute.CHANGES_MADE.getAttrName(), Integer.valueOf(this.changesMade));
        this.eventAttributes.put(PerformanceTrackingAttribute.EXIT_POINT.getAttrName(), PerformanceTrackingAttribute.EXIT_NSF.getAttrName());
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), conflictFragmentNewInstance, new SnowballNextFlowAnimation(), false, false, false, 28, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void showConflictScreen$default(CreatePartyFragment createPartyFragment, List list, List list2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        createPartyFragment.showConflictScreen(list, list2);
    }

    private final void showEarlyPartyBanner() {
        String nextScheduledOpenTime = this.queue.getNextScheduledOpenTime();
        this.queueOpenTime = getFacilityUtils().formatDisplayableTime(nextScheduledOpenTime);
        String string$default = (nextScheduledOpenTime == null || nextScheduledOpenTime.length() == 0) ? VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsUpdateScreenWarningMessageDefault, null, false, 6, null) : VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsUpdateScreenWarningMessage, MapsKt.mapOf(TuplesKt.m92045to("time", this.queueOpenTime)), null, false, 12, null);
        VqFragmentCreatePartyBinding binding = getBinding();
        if (binding != null) {
            binding.updateScreenContainer.setVisibility(0);
            binding.updateScreenWarningIcon.setText(VirtualQueueThemer.getPeptasiaIcon$default(getVqThemer(), VQIconType.ReviewDetailsIneligibleGuestsIcon, null, 2, null));
            binding.updateScreenWarningTitle.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsUpdateScreenWarningTitle, null, false, 6, null));
            binding.updateScreenWarningText.setText(string$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showGenericErrorMessage() {
        CommonExtensionsKt.refreshTipBoard(this);
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersJoinErrorMessage, this.queue.getContentId(), false, 4, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersJoinErrorTitle, this.queue.getContentId(), false, 4, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment.showGenericErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                FragmentActivity activity = CreatePartyFragment.this.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
            }
        }, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showIdentifiedQueueClosedErrorMessage() {
        CommonExtensionsKt.refreshTipBoard(this);
        CreatePartyMainAdapter createPartyMainAdapter = this.adapter;
        if (createPartyMainAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            createPartyMainAdapter = null;
        }
        createPartyMainAdapter.setGuests(this.selectedGuests, this.unselectedGuests, this.conflictedGuests);
        CreatePartyMainAdapter createPartyMainAdapter2 = this.adapter;
        if (createPartyMainAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            createPartyMainAdapter2 = null;
        }
        createPartyMainAdapter2.updateGuestConflicts(this.conflicts, this.queue, this.parkName);
        VqFragmentCreatePartyBinding binding = getBinding();
        Button button = binding != null ? binding.continueButton : null;
        if (button == null) {
            return;
        }
        button.setEnabled(!this.selectedGuests.isEmpty());
    }

    private final void showMaxPartySizeExceededErrorMessage(final boolean refreshOnDismiss, int maxParty) {
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersMaxPartyExceededMessage, MapsKt.mapOf(TuplesKt.m92045to("maxPartySize", Integer.valueOf(maxParty))), this.queue.getContentId(), false, 8, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersMaxPartyExceededTitle, this.queue.getContentId(), false, 4, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment.showMaxPartySizeExceededErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                if (refreshOnDismiss) {
                    CreatePartyFragment.loadLinkedTickets$default(this, null, 1, null);
                }
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
            }
        }, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String showNextStepMessage() {
        String nextScheduledOpenTime = this.queue.getNextScheduledOpenTime();
        return (nextScheduledOpenTime == null || nextScheduledOpenTime.length() == 0) ? VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsUpdateScreenWarningMessageDefault, null, false, 6, null) : VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsUpdateScreenWarningMessage, MapsKt.mapOf(TuplesKt.m92045to("time", getFacilityUtils().formatDisplayableTime(nextScheduledOpenTime))), null, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showQueueClosedErrorMessage() {
        CommonExtensionsKt.refreshTipBoard(this);
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersLandClosedMessage, this.queue.getContentId(), false, 4, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersLandClosedTitle, this.queue.getContentId(), false, 4, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment.showQueueClosedErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                AbstractC3694e0 supportFragmentManager;
                if (CreatePartyFragment.this.fromHubLanding) {
                    FragmentActivity activity = CreatePartyFragment.this.getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                        return;
                    }
                    return;
                }
                C215521 c215521 = CreatePartyFragment.this.originatedFromDeeplink ? this : null;
                FragmentActivity activity2 = CreatePartyFragment.this.getActivity();
                if (c215521 != null) {
                    if (activity2 != null) {
                        activity2.finish();
                    }
                } else {
                    if (activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null) {
                        return;
                    }
                    supportFragmentManager.m19746k1(null, 1);
                }
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
            }
        }, false, false);
    }

    private final void showReviewDetailsInEarlyCreation() {
        AbstractC3694e0 supportFragmentManager;
        AbstractC3694e0 supportFragmentManager2;
        FragmentActivity activity = getActivity();
        if (((activity == null || (supportFragmentManager2 = activity.getSupportFragmentManager()) == null) ? 0 : supportFragmentManager2.m19773x0()) > 1) {
            FragmentActivity activity2 = getActivity();
            if (activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null) {
                return;
            }
            supportFragmentManager.m19748l1();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("queueId", this.queue.getQueueId());
        bundle.putBoolean(VirtualQueueConstants.ORIGINATED_FROM_DEEPLINK_PARAM, this.originatedFromDeeplink);
        bundle.putBoolean(VirtualQueueConstants.HUB_LANDING, this.fromHubLanding);
        ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), ReviewDetailsFragment.INSTANCE.newInstance(bundle), new SnowballNextFlowAnimation(), false, false, false, 28, null);
    }

    private final void showTryAgainErrorMessage() {
        resetUI();
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersRetryErrorMessage, this.queue.getContentId(), false, 4, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersRetryErrorTitle, this.queue.getContentId(), false, 4, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment.showTryAgainErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
                CreatePartyFragment.this.handleContinue();
            }
        }, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startSoftRefresh() {
        this.isInitialLoad = false;
        String string$default = VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsLaunching, null, false, 6, null);
        VqFragmentCreatePartyBinding binding = getBinding();
        if (binding != null) {
            binding.refreshButton.setEnabled(false);
            binding.launchingMessage.setText(string$default);
            binding.refreshButton.setVisibility(8);
            binding.refreshMessage.setVisibility(8);
            binding.continueButton.setVisibility(8);
        }
        sendAnnouncementEvent(string$default);
        VqFragmentCreatePartyBinding binding2 = getBinding();
        LinearLayout linearLayout = binding2 != null ? binding2.launchingContainer : null;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        loadLinkedTickets(this.isDifferentJoinWindow ? GetLinkedGuestsRequestType.REVIEW : GetLinkedGuestsRequestType.REVIEW_REFRESH);
    }

    private final void updateRefreshCTABox() {
        VqFragmentCreatePartyBinding binding = getBinding();
        LinearLayout linearLayout = binding != null ? binding.launchingContainer : null;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (CommonExtensionsKt.isSafe(this)) {
            setRefreshMessage();
            VqFragmentCreatePartyBinding binding2 = getBinding();
            if (binding2 != null) {
                binding2.refreshButton.setEnabled(true);
                binding2.refreshButton.setVisibility(0);
                TextView textView = binding2.refreshMessage;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                binding2.refreshButton.sendAccessibilityEvent(8);
                Spanned peptasiaIcon$default = VirtualQueueThemer.getPeptasiaIcon$default(getVqThemer(), VQIconType.CommonRefreshIcon, null, 2, null);
                String string$default = VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsAlternateCta, null, false, 6, null);
                try {
                    Typeface typefaceM97205h = C31640h.m97205h(requireContext(), C21487R.font.peptasia);
                    Typeface typefaceM97205h2 = C31640h.m97205h(requireContext(), C21487R.font.twdc_font_heavy);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((Object) peptasiaIcon$default) + " " + string$default);
                    spannableStringBuilder.setSpan(new C20751b(typefaceM97205h), 0, 1, 34);
                    spannableStringBuilder.setSpan(new C20751b(typefaceM97205h2), 1, spannableStringBuilder.length(), 34);
                    binding2.refreshButton.setText(spannableStringBuilder);
                } catch (Exception unused) {
                    binding2.refreshButton.setText(string$default);
                }
            }
        }
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.CreatePartyActions
    public void closedQuMessage(TextView minus, TextView plus, LinearLayout warningLayout) {
        Button button;
        Intrinsics.checkNotNullParameter(minus, "minus");
        Intrinsics.checkNotNullParameter(plus, "plus");
        Intrinsics.checkNotNullParameter(warningLayout, "warningLayout");
        if (this.queue.getIsAcceptingPartyCreation() || this.queue.getIsAcceptingJoins()) {
            VqFragmentCreatePartyBinding binding = getBinding();
            LinearLayout linearLayout = binding != null ? binding.totalGuestsWarningContainer : null;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            VqFragmentCreatePartyBinding binding2 = getBinding();
            button = binding2 != null ? binding2.continueButton : null;
            if (button == null) {
                return;
            }
            button.setEnabled(true);
            return;
        }
        VqFragmentCreatePartyBinding binding3 = getBinding();
        LinearLayout linearLayout2 = binding3 != null ? binding3.totalGuestsWarningContainer : null;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        VqFragmentCreatePartyBinding binding4 = getBinding();
        TextView textView = binding4 != null ? binding4.totalGuestsWarningIcon : null;
        if (textView != null) {
            textView.setText(VirtualQueueThemer.getPeptasiaIcon$default(getVqThemer(), VQIconType.ReviewDetailsIneligibleGuestsIcon, null, 2, null));
        }
        VqFragmentCreatePartyBinding binding5 = getBinding();
        TextView textView2 = binding5 != null ? binding5.totalGuestsWarningText : null;
        if (textView2 != null) {
            textView2.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ReviewDetailsQueueUnAvailableMessage, null, false, 6, null));
        }
        VqFragmentCreatePartyBinding binding6 = getBinding();
        button = binding6 != null ? binding6.continueButton : null;
        if (button != null) {
            button.setEnabled(false);
        }
        minus.setEnabled(false);
        plus.setEnabled(false);
        warningLayout.setVisibility(8);
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

    public final VirtualQueueNavigationEntriesProvider getNavigationEntriesProvider() {
        VirtualQueueNavigationEntriesProvider virtualQueueNavigationEntriesProvider = this.navigationEntriesProvider;
        if (virtualQueueNavigationEntriesProvider != null) {
            return virtualQueueNavigationEntriesProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigationEntriesProvider");
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
        RecyclerView recyclerView;
        super.onActivityCreated(savedInstanceState);
        VqFragmentCreatePartyBinding binding = getBinding();
        LinearLayout linearLayout = binding != null ? binding.launchingContainer : null;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ActivityActions.DefaultImpls.setTitle$default(getActivityActions(), this.headerText, false, 2, null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(1);
        SnowballItemAnimator defaultItemAnimator = SnowballAnimationUtils.getDefaultItemAnimator(getResources());
        CreatePartyMainAdapter.Factory createPartyMainAdapterFactory = getCreatePartyMainAdapterFactory();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        VirtualQueueThemer vqThemer = getVqThemer();
        Bundle arguments = getArguments();
        CreatePartyMainAdapter createPartyMainAdapterCreate = createPartyMainAdapterFactory.create(fragmentActivityRequireActivity, this, vqThemer, arguments != null ? arguments.getBoolean(VirtualQueueConstants.SELECT_GUEST_IN_PARTY) : true);
        this.adapter = createPartyMainAdapterCreate;
        if (createPartyMainAdapterCreate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            createPartyMainAdapterCreate = null;
        }
        C20918m c20918m = new C20918m(createPartyMainAdapterCreate);
        VqFragmentCreatePartyBinding binding2 = getBinding();
        RecyclerView recyclerView2 = binding2 != null ? binding2.itemList : null;
        if (recyclerView2 != null) {
            recyclerView2.setItemAnimator(defaultItemAnimator);
        }
        VqFragmentCreatePartyBinding binding3 = getBinding();
        RecyclerView recyclerView3 = binding3 != null ? binding3.itemList : null;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(linearLayoutManager);
        }
        VqFragmentCreatePartyBinding binding4 = getBinding();
        RecyclerView recyclerView4 = binding4 != null ? binding4.itemList : null;
        if (recyclerView4 != null) {
            CreatePartyMainAdapter createPartyMainAdapter = this.adapter;
            if (createPartyMainAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                createPartyMainAdapter = null;
            }
            recyclerView4.setAdapter(createPartyMainAdapter);
        }
        VqFragmentCreatePartyBinding binding5 = getBinding();
        if (binding5 != null && (recyclerView = binding5.itemList) != null) {
            recyclerView.addItemDecoration(c20918m);
        }
        loadLinkedTickets$default(this, null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == getNavigationEntriesProvider().getLinkingRequestCode()) {
            if (resultCode == -1) {
                loadLinkedTickets$default(this, null, 1, null);
                return;
            }
            VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
            List<LinkedGuest> list = this.allGuests;
            Queue queue = this.queue;
            int size = this.selectedGuests.size();
            String simpleName = CreatePartyFragment.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
            virtualQueueAnalytics.trackCreatePartyLoad(list, queue, size, simpleName);
        }
    }

    @Override // p498da.InterfaceC27132a
    public boolean onBackPressed() {
        getVirtualQueueAnalytics().trackBackPress();
        this.eventAttributes.put(PerformanceTrackingAttribute.SELECTED_GUESTS_END.getAttrName(), Integer.valueOf(this.updatedPartySize));
        this.eventAttributes.put(PerformanceTrackingAttribute.CHANGES_MADE.getAttrName(), Integer.valueOf(this.changesMade));
        this.eventAttributes.put(PerformanceTrackingAttribute.EXIT_POINT.getAttrName(), PerformanceTrackingAttribute.EXIT_BACK_PRESSED.getAttrName());
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        return false;
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        observeViewModel();
    }

    @Override // com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C21487R.layout.vq_fragment_create_party, container, false);
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
            this.isAnonymous = arguments.getBoolean("isAnonymous", false);
            this.suppressHowToEnter = arguments.getBoolean(VirtualQueueConstants.SUPPRESS_HOW_TO_ENTER, false);
            this.originatedFromDeeplink = arguments.getBoolean(VirtualQueueConstants.ORIGINATED_FROM_DEEPLINK_PARAM, false);
            this.suppressCloseOnConfirmation = Intrinsics.areEqual(arguments.getString(VirtualQueueConstants.SUPPRESS_OVERVIEW_PARAM), EnjoymentDialogViewModel.CODE_POINT_YES);
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
        if (this.needsRefreshForLinkedTickets) {
            loadLinkedTickets$default(this, null, 1, null);
        }
        PerformanceTracking performanceTracking = getPerformanceTracking();
        PerformanceTrackingScreenName performanceTrackingScreenName = PerformanceTrackingScreenName.CREATE_PARTY_SCREEN;
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "this.requireView()");
        PerformanceTracking.logLoadTime$default(performanceTracking, performanceTrackingScreenName, viewRequireView, "", true, false, 16, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        PtrDisneyContainer ptrDisneyContainer;
        LottieAnimationView lottieAnimationView;
        Button button;
        Button button2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.eventAttributes.put(PerformanceTrackingAttribute.LOAD_TIME_SCREEN_NAME.getAttrName(), PerformanceTrackingScreenName.CREATE_PARTY_SCREEN.getScreenName());
        this.headerText = VirtualQueueThemer.getString$default(getVqThemer(), !this.isAnonymous ? VQStringType.CreatePartyHeaderWithDeepLink : VQStringType.CreatePartyHeader, null, false, 6, null);
        VqFragmentCreatePartyBinding binding = getBinding();
        PtrMyQueuesHeader ptrMyQueuesHeader = null;
        if (binding != null && (button2 = binding.continueButton) != null) {
            CommonExtensionsKt.setOnDebouncedClickListener$default(button2, 0, new Function0<Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment.onViewCreated.1
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
                    CreatePartyFragment.this.handleContinue();
                }
            }, 1, null);
        }
        VqFragmentCreatePartyBinding binding2 = getBinding();
        if (binding2 != null && (button = binding2.refreshButton) != null) {
            button.setVisibility(0);
            CommonExtensionsKt.setOnDebouncedClickListener$default(button, 0, new Function0<Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment$onViewCreated$2$1
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
                    this.this$0.getVirtualQueueAnalytics().trackCreatePartyRefresh(this.this$0.queue, true);
                    this.this$0.startSoftRefresh();
                }
            }, 1, null);
        }
        if (getLocationMonitor().mo38959c(true) == null) {
            getLocationMonitor().mo38958b(true);
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        LottieLoader lottieLoader = new LottieLoader(fragmentActivityRequireActivity, getVqThemer());
        VqFragmentCreatePartyBinding binding3 = getBinding();
        if (binding3 != null && (lottieAnimationView = binding3.loaderAnimationView) != null) {
            lottieLoader.setLoaderAnimationUrl(lottieAnimationView);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        PtrMyQueuesHeader ptrMyQueuesHeader2 = new PtrMyQueuesHeader(contextRequireContext);
        this.headerView = ptrMyQueuesHeader2;
        ptrMyQueuesHeader2.setVqThemer(getVqThemer());
        PtrMyQueuesHeader ptrMyQueuesHeader3 = this.headerView;
        if (ptrMyQueuesHeader3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
            ptrMyQueuesHeader3 = null;
        }
        ptrMyQueuesHeader3.setVisibility(8);
        VqFragmentCreatePartyBinding binding4 = getBinding();
        if (binding4 != null) {
            PtrDisneyContainer ptrDisneyContainer2 = binding4.pullToRefreshContainer;
            PtrMyQueuesHeader ptrMyQueuesHeader4 = this.headerView;
            if (ptrMyQueuesHeader4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
                ptrMyQueuesHeader4 = null;
            }
            ptrDisneyContainer2.m64011f(ptrMyQueuesHeader4);
            PtrDisneyContainer ptrDisneyContainer3 = binding4.pullToRefreshContainer;
            PtrMyQueuesHeader ptrMyQueuesHeader5 = this.headerView;
            if (ptrMyQueuesHeader5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            } else {
                ptrMyQueuesHeader = ptrMyQueuesHeader5;
            }
            ptrDisneyContainer3.setHeaderView(ptrMyQueuesHeader);
            binding4.pullToRefreshContainer.setEnablePtr(true);
        }
        VqFragmentCreatePartyBinding binding5 = getBinding();
        if (binding5 == null || (ptrDisneyContainer = binding5.pullToRefreshContainer) == null) {
            return;
        }
        ptrDisneyContainer.setPtrHandler(new InterfaceC29611b() { // from class: com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment.onViewCreated.6
            @Override // p708ko.InterfaceC29611b
            public /* bridge */ /* synthetic */ boolean checkCanDoRefresh(PtrBaseContainer ptrBaseContainer, View view2, View view3) {
                return super.checkCanDoRefresh(ptrBaseContainer, view2, view3);
            }

            @Override // p708ko.InterfaceC29611b
            public void onRefreshBegin(PtrBaseContainer frame) {
                PtrDisneyContainer ptrDisneyContainer4;
                Intrinsics.checkNotNullParameter(frame, "frame");
                if (!CreatePartyFragment.this.getQueueStateManagement().isQueueInEarlyPartyCreationMode(CreatePartyFragment.this.queue) || !CreatePartyFragment.this.isAnonymous) {
                    VqFragmentCreatePartyBinding binding6 = CreatePartyFragment.this.getBinding();
                    if (binding6 == null || (ptrDisneyContainer4 = binding6.pullToRefreshContainer) == null) {
                        return;
                    }
                    ptrDisneyContainer4.m64009G();
                    return;
                }
                if (!CreatePartyFragment.this.isInitialLoad) {
                    CreatePartyFragment.this.getVirtualQueueAnalytics().trackCreatePartyRefresh(CreatePartyFragment.this.queue, false);
                }
                VqFragmentCreatePartyBinding binding7 = CreatePartyFragment.this.getBinding();
                PtrDisneyContainer ptrDisneyContainer5 = binding7 != null ? binding7.pullToRefreshContainer : null;
                if (ptrDisneyContainer5 != null) {
                    ptrDisneyContainer5.setEnabled(false);
                }
                CreatePartyFragment.this.startSoftRefresh();
            }

            @Override // p708ko.InterfaceC29611b
            public void onRefreshFinish() {
                if (CreatePartyFragment.this.getQueueStateManagement().isQueueInEarlyPartyCreationMode(CreatePartyFragment.this.queue) && CreatePartyFragment.this.isAnonymous) {
                    if (CommonExtensionsKt.isSafe(CreatePartyFragment.this)) {
                        VqFragmentCreatePartyBinding binding6 = CreatePartyFragment.this.getBinding();
                        PtrDisneyContainer ptrDisneyContainer4 = binding6 != null ? binding6.pullToRefreshContainer : null;
                        if (ptrDisneyContainer4 != null) {
                            ptrDisneyContainer4.setEnabled(true);
                        }
                        CreatePartyFragment.this.isInitialLoad = false;
                    }
                    VqFragmentCreatePartyBinding binding7 = CreatePartyFragment.this.getBinding();
                    if (binding7 != null) {
                        binding7.launchingContainer.setVisibility(8);
                        binding7.continueButtonWrapper.setVisibility(0);
                    }
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

    public final void setNavigationEntriesProvider(VirtualQueueNavigationEntriesProvider virtualQueueNavigationEntriesProvider) {
        Intrinsics.checkNotNullParameter(virtualQueueNavigationEntriesProvider, "<set-?>");
        this.navigationEntriesProvider = virtualQueueNavigationEntriesProvider;
    }

    public final void setParkAppConfiguration(C9314j c9314j) {
        Intrinsics.checkNotNullParameter(c9314j, "<set-?>");
        this.parkAppConfiguration = c9314j;
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

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.CreatePartyActions
    public void showConfirmation(GetPositionsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), VirtualQueueConfirmationFragment.INSTANCE.newInstance(response, this.completionDeepLink, this.suppressCloseOnConfirmation, this.queue.getContentId()), new SnowballNextFlowAnimation(), true, false, false, 24, null);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.CreatePartyActions
    public void showLinkTicket() {
        getVirtualQueueAnalytics().trackLinkTicketOrPass();
        this.eventAttributes.put(PerformanceTrackingAttribute.SELECTED_GUESTS_END.getAttrName(), Integer.valueOf(this.updatedPartySize));
        this.eventAttributes.put(PerformanceTrackingAttribute.CHANGES_MADE.getAttrName(), Integer.valueOf(this.changesMade));
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        getActivityActions().navigateTo(getNavigationEntriesProvider().getLinkTicketsAndPassesNavigationEntry());
        this.needsRefreshForLinkedTickets = true;
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.CreatePartyActions
    public void toggledGuestSelection(boolean selected) {
        VirtualQueueAnalytics.trackGuestSelectionToggled$default(getVirtualQueueAnalytics(), selected, null, 2, null);
        this.changesMade++;
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.CreatePartyActions
    public void toggledSelectAll(boolean selected) {
        if (selected) {
            int i10 = this.updatedPartySize;
            int i11 = this.currentMaxParty;
            if (i10 > i11) {
                showMaxPartySizeExceededErrorMessage(false, i11);
            }
        }
        getVirtualQueueAnalytics().trackSelectAllToggled(selected, this.allGuests, this.queue);
        this.changesMade++;
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.CreatePartyActions
    public void updateAnonymousPartySize(int partySize) {
        this.anonymousPartySize = partySize;
        this.changesMade++;
        VqFragmentCreatePartyBinding binding = getBinding();
        Button button = binding != null ? binding.continueButton : null;
        if (button == null) {
            return;
        }
        button.setEnabled(partySize > 0 && partySize <= this.currentMaxParty);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.CreatePartyActions
    public void updatedPartySize(int size) {
        this.updatedPartySize = size;
        VqFragmentCreatePartyBinding binding = getBinding();
        Button button = binding != null ? binding.continueButton : null;
        if (button == null) {
            return;
        }
        boolean z10 = false;
        if (1 <= size && size <= this.currentMaxParty) {
            z10 = true;
        }
        button.setEnabled(z10);
    }
}