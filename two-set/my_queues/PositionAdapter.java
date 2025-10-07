package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C3296a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.commons.deeplink.DeepLinkConfig;
import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.recommender.core.themer.RecommenderThemerConstants;
import com.disney.wdpro.recommender.services.RecommenderServiceConstants;
import com.disney.wdpro.support.ftue.C20751b;
import com.disney.wdpro.support.widget.ExpandableView;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import com.disney.wdpro.virtualqueue.core.interfaces.FragmentActions;
import com.disney.wdpro.virtualqueue.core.interfaces.PositionActions;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.ProgressData;
import com.disney.wdpro.virtualqueue.databinding.VqMyQueuesPositionBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.common.CommonExtensionsKt;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.LottieFlow;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.VQAlertType;
import com.disney.wdpro.virtualqueue.p462ui.common.VQPageType;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyListAdapter;
import com.disney.wdpro.virtualqueue.service.model.BoardingGroupType;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Position;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.service.model.QueueGuestIdMode;
import com.disney.wdpro.virtualqueue.service.model.QueueLegalDisclaimer;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQSpecialAnimUrlType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.looksery.sdk.listener.AnalyticsListener;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jose4j.jwk.RsaJsonWebKey;
import p860q1.C31640h;

@Metadata(m92037d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 N2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004NOPQBg\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010&J'\u0010(\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010&J'\u0010)\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b0\u0010&J\u001f\u00103\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00022\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010=R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010CR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010DR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010ER\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010FR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010GR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010HR\u0015\u0010K\u001a\u00020+*\u00020+8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0015\u0010M\u001a\u00020+*\u00020+8F¢\u0006\u0006\u001a\u0004\bL\u0010J¨\u0006R"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter;", "Lcom/disney/wdpro/commons/adapter/c;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewItem;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "actions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/FragmentActions;", "fragmentActions", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", VirtualQueueConstants.VQ_PAGE_TYPE, "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Landroid/graphics/Point;", "screenSize", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/commons/deeplink/b;", "deepLinkConfig", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;", "partyListAdapterFactory", "<init>", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;Lcom/disney/wdpro/virtualqueue/core/interfaces/FragmentActions;Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;Landroid/graphics/Point;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/commons/deeplink/b;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;)V", "item", "holder", "", "setupAnimations", "(Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewItem;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewHolder;)V", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "setupNowBoarding", "(Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewHolder;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewItem;Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "setupGroupStatus", "setupCTAButtons", "setupProgressBarAndStatus", "(Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewHolder;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewItem;)V", "", "getProgressState", "(Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewItem;)I", "setupLegalDisclaimer", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewHolder;)V", "setupExpandableView", "", "title", "setupQueueTitle", "(Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewHolder;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewHolder;", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewHolder;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewItem;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/FragmentActions;", "Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", "getVqPageType", "()Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "Lcom/disney/wdpro/commons/j;", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "Landroid/graphics/Point;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/commons/deeplink/b;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;", "getDp", "(I)I", RsaJsonWebKey.FIRST_FACTOR_CRT_EXPONENT_MEMBER_NAME, "getPx", "px", "Companion", "Factory", "PositionViewHolder", "PositionViewItem", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nPositionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,956:1\n766#2:957\n857#2,2:958\n766#2:960\n857#2,2:961\n766#2:963\n857#2,2:964\n766#2:966\n857#2,2:967\n*S KotlinDebug\n*F\n+ 1 PositionAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter\n*L\n827#1:957\n827#1:958,2\n246#1:960\n246#1:961,2\n635#1:963\n635#1:964,2\n654#1:966\n654#1:967,2\n*E\n"})
/* loaded from: classes20.dex */
public final class PositionAdapter implements InterfaceC9229c<PositionViewHolder, PositionViewItem> {
    public static final int NO_GROUP_NUMBER_PROVIDED = -1;
    public static final int VIEW_TYPE = 11000;
    private final PositionActions actions;
    private final Context context;
    private final DeepLinkConfig deepLinkConfig;
    private final FacilityUtils facilityUtils;
    private final FragmentActions fragmentActions;
    private final C9314j parkAppConfiguration;
    private final PartyListAdapter.Factory partyListAdapterFactory;
    private final PicassoUtils picassoUtils;
    private final Point screenSize;
    private final VirtualQueueAnalytics virtualQueueAnalytics;
    private final VQPageType vqPageType;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&¨\u0006'"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$Factory;", "", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Landroid/graphics/Point;", "screenSize", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/commons/deeplink/b;", "deepLinkConfig", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;", "partyListAdapterFactory", "<init>", "(Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;Landroid/graphics/Point;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/commons/deeplink/b;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "actions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/FragmentActions;", "fragmentActions", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", VirtualQueueConstants.VQ_PAGE_TYPE, "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter;", "create", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;Lcom/disney/wdpro/virtualqueue/core/interfaces/FragmentActions;Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;)Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "Lcom/disney/wdpro/commons/j;", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "Landroid/graphics/Point;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/commons/deeplink/b;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Factory {
        public static final int $stable = 8;
        private final DeepLinkConfig deepLinkConfig;
        private final FacilityUtils facilityUtils;
        private final C9314j parkAppConfiguration;
        private final PartyListAdapter.Factory partyListAdapterFactory;
        private final PicassoUtils picassoUtils;
        private final Point screenSize;
        private final VirtualQueueAnalytics virtualQueueAnalytics;
        private final VirtualQueueThemer vqThemer;

        @Inject
        public Factory(PicassoUtils picassoUtils, VirtualQueueAnalytics virtualQueueAnalytics, C9314j parkAppConfiguration, FacilityUtils facilityUtils, Point screenSize, VirtualQueueThemer vqThemer, DeepLinkConfig deepLinkConfig, PartyListAdapter.Factory partyListAdapterFactory) {
            Intrinsics.checkNotNullParameter(picassoUtils, "picassoUtils");
            Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "virtualQueueAnalytics");
            Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
            Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
            Intrinsics.checkNotNullParameter(screenSize, "screenSize");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            Intrinsics.checkNotNullParameter(deepLinkConfig, "deepLinkConfig");
            Intrinsics.checkNotNullParameter(partyListAdapterFactory, "partyListAdapterFactory");
            this.picassoUtils = picassoUtils;
            this.virtualQueueAnalytics = virtualQueueAnalytics;
            this.parkAppConfiguration = parkAppConfiguration;
            this.facilityUtils = facilityUtils;
            this.screenSize = screenSize;
            this.vqThemer = vqThemer;
            this.deepLinkConfig = deepLinkConfig;
            this.partyListAdapterFactory = partyListAdapterFactory;
        }

        public final PositionAdapter create(PositionActions actions, FragmentActions fragmentActions, Context context, VQPageType vqPageType) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(fragmentActions, "fragmentActions");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(vqPageType, "vqPageType");
            return new PositionAdapter(actions, fragmentActions, context, vqPageType, this.picassoUtils, this.virtualQueueAnalytics, this.parkAppConfiguration, this.facilityUtils, this.screenSize, this.vqThemer, this.deepLinkConfig, this.partyListAdapterFactory);
        }
    }

    @Metadata(m92037d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u000207H\u0016J\u0006\u00109\u001a\u000207J\u0006\u0010:\u001a\u000207R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010\u0013R\u001a\u0010-\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\u001a\u00100\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R\u001a\u00103\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)¨\u0006;"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/common/LottieFlow$LottieFlowListener;", "binding", "Lcom/disney/wdpro/virtualqueue/databinding/VqMyQueuesPositionBinding;", "parent", "Landroid/view/ViewGroup;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", VirtualQueueConstants.VQ_PAGE_TYPE, "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", "partyListAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;", "(Lcom/disney/wdpro/virtualqueue/databinding/VqMyQueuesPositionBinding;Landroid/view/ViewGroup;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;Lcom/disney/wdpro/virtualqueue/ui/my_queues/PartyListAdapter$Factory;)V", "animationFlow", "Lcom/disney/wdpro/virtualqueue/ui/common/LottieFlow;", "getAnimationFlow", "()Lcom/disney/wdpro/virtualqueue/ui/common/LottieFlow;", "setAnimationFlow", "(Lcom/disney/wdpro/virtualqueue/ui/common/LottieFlow;)V", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqMyQueuesPositionBinding;", "expandedViewHeader", "getExpandedViewHeader", "()Landroid/view/ViewGroup;", "setExpandedViewHeader", "(Landroid/view/ViewGroup;)V", "expandedViewHolder", "getExpandedViewHolder", "setExpandedViewHolder", "loadingFailed", "", "getLoadingFailed", "()Ljava/lang/String;", "setLoadingFailed", "(Ljava/lang/String;)V", "loadingFailedColor", "", "getLoadingFailedColor", "()I", "setLoadingFailedColor", "(I)V", "progressBarFlow", "getProgressBarFlow", "setProgressBarFlow", "progressStatus", "getProgressStatus", "setProgressStatus", "progressStatusAccessibility", "getProgressStatusAccessibility", "setProgressStatusAccessibility", "progressStatusColor", "getProgressStatusColor", "setProgressStatusColor", "lottieLoadingFailed", "", "lottieLoadingFinished", "viewAttached", "viewDetached", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class PositionViewHolder extends AnimateRecyclerViewHolder implements LottieFlow.LottieFlowListener {
        public static final int $stable = 8;
        private LottieFlow animationFlow;
        private final VqMyQueuesPositionBinding binding;
        private ViewGroup expandedViewHeader;
        private ViewGroup expandedViewHolder;
        private String loadingFailed;
        private int loadingFailedColor;
        private LottieFlow progressBarFlow;
        private String progressStatus;
        private String progressStatusAccessibility;
        private int progressStatusColor;

        /* JADX WARN: Illegal instructions before constructor call */
        public PositionViewHolder(VqMyQueuesPositionBinding binding, ViewGroup parent, VirtualQueueThemer vqThemer, VQPageType vqPageType, PartyListAdapter.Factory partyListAdapterFactory) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            Intrinsics.checkNotNullParameter(vqPageType, "vqPageType");
            Intrinsics.checkNotNullParameter(partyListAdapterFactory, "partyListAdapterFactory");
            LinearLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            super(root);
            this.binding = binding;
            View viewFindViewById = binding.getRoot().findViewById(C21487R.id.expandable_view_expanded_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "binding.root.findViewByI…dable_view_expanded_view)");
            this.expandedViewHolder = (ViewGroup) viewFindViewById;
            View viewFindViewById2 = binding.getRoot().findViewById(C21487R.id.expandable_view_header);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "binding.root.findViewByI…d.expandable_view_header)");
            this.expandedViewHeader = (ViewGroup) viewFindViewById2;
            this.progressStatus = "";
            this.progressStatusAccessibility = "";
            this.loadingFailed = "";
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "parent.context");
            PartyListAdapter partyListAdapterCreate = partyListAdapterFactory.create(context, vqThemer, vqPageType);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(parent.getContext());
            linearLayoutManager.setOrientation(0);
            binding.groupList.setLayoutManager(linearLayoutManager);
            binding.groupList.setAdapter(partyListAdapterCreate);
        }

        public final LottieFlow getAnimationFlow() {
            return this.animationFlow;
        }

        public final VqMyQueuesPositionBinding getBinding() {
            return this.binding;
        }

        public final ViewGroup getExpandedViewHeader() {
            return this.expandedViewHeader;
        }

        public final ViewGroup getExpandedViewHolder() {
            return this.expandedViewHolder;
        }

        public final String getLoadingFailed() {
            return this.loadingFailed;
        }

        public final int getLoadingFailedColor() {
            return this.loadingFailedColor;
        }

        public final LottieFlow getProgressBarFlow() {
            return this.progressBarFlow;
        }

        public final String getProgressStatus() {
            return this.progressStatus;
        }

        public final String getProgressStatusAccessibility() {
            return this.progressStatusAccessibility;
        }

        public final int getProgressStatusColor() {
            return this.progressStatusColor;
        }

        @Override // com.disney.wdpro.virtualqueue.ui.common.LottieFlow.LottieFlowListener
        public void lottieLoadingFailed() {
            this.binding.progressText.setText(this.loadingFailed);
            this.binding.progressAnimationContainer.setContentDescription(this.loadingFailed);
            this.binding.progressText.setTextColor(this.loadingFailedColor);
        }

        @Override // com.disney.wdpro.virtualqueue.ui.common.LottieFlow.LottieFlowListener
        public void lottieLoadingFinished() {
            this.binding.progressText.setText(this.progressStatus);
            this.binding.progressAnimationContainer.setContentDescription(this.progressStatusAccessibility);
            this.binding.progressText.setTextColor(this.progressStatusColor);
        }

        public final void setAnimationFlow(LottieFlow lottieFlow) {
            this.animationFlow = lottieFlow;
        }

        public final void setExpandedViewHeader(ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "<set-?>");
            this.expandedViewHeader = viewGroup;
        }

        public final void setExpandedViewHolder(ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "<set-?>");
            this.expandedViewHolder = viewGroup;
        }

        public final void setLoadingFailed(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.loadingFailed = str;
        }

        public final void setLoadingFailedColor(int i10) {
            this.loadingFailedColor = i10;
        }

        public final void setProgressBarFlow(LottieFlow lottieFlow) {
            this.progressBarFlow = lottieFlow;
        }

        public final void setProgressStatus(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.progressStatus = str;
        }

        public final void setProgressStatusAccessibility(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.progressStatusAccessibility = str;
        }

        public final void setProgressStatusColor(int i10) {
            this.progressStatusColor = i10;
        }

        public final void viewAttached() {
            LottieFlow lottieFlow = this.animationFlow;
            if (lottieFlow != null) {
                lottieFlow.setListener(this);
            }
            LottieFlow lottieFlow2 = this.animationFlow;
            if (lottieFlow2 != null) {
                lottieFlow2.start();
            }
            LottieFlow lottieFlow3 = this.progressBarFlow;
            if (lottieFlow3 != null) {
                lottieFlow3.start();
            }
        }

        public final void viewDetached() {
            LottieFlow lottieFlow = this.animationFlow;
            if (lottieFlow != null) {
                lottieFlow.pause();
            }
            LottieFlow lottieFlow2 = this.progressBarFlow;
            if (lottieFlow2 != null) {
                lottieFlow2.pause();
            }
        }
    }

    @Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/my_queues/PositionAdapter$PositionViewItem;", "Lcom/disney/wdpro/commons/adapter/g;", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "position", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "response", "<init>", "(Lcom/disney/wdpro/virtualqueue/service/model/Position;Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;)V", "", "getViewType", "()I", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "getPosition", "()Lcom/disney/wdpro/virtualqueue/service/model/Position;", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "getResponse", "()Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "", "isLast", "Z", "()Z", "setLast", "(Z)V", "showDowntimeAlert", "getShowDowntimeAlert", "setShowDowntimeAlert", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class PositionViewItem implements InterfaceC9233g {
        public static final int $stable = 8;
        private boolean isLast;
        private final Position position;
        private final GetPositionsResponse response;
        private boolean showDowntimeAlert;

        public PositionViewItem(Position position, GetPositionsResponse response) {
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(response, "response");
            this.position = position;
            this.response = response;
        }

        public final Position getPosition() {
            return this.position;
        }

        public final GetPositionsResponse getResponse() {
            return this.response;
        }

        public final boolean getShowDowntimeAlert() {
            return this.showDowntimeAlert;
        }

        @Override // com.disney.wdpro.commons.adapter.InterfaceC9233g
        public int getViewType() {
            return 11000;
        }

        /* renamed from: isLast, reason: from getter */
        public final boolean getIsLast() {
            return this.isLast;
        }

        public final void setLast(boolean z10) {
            this.isLast = z10;
        }

        public final void setShowDowntimeAlert(boolean z10) {
            this.showDowntimeAlert = z10;
        }
    }

    public PositionAdapter(PositionActions actions, FragmentActions fragmentActions, Context context, VQPageType vqPageType, PicassoUtils picassoUtils, VirtualQueueAnalytics virtualQueueAnalytics, C9314j parkAppConfiguration, FacilityUtils facilityUtils, Point screenSize, VirtualQueueThemer vqThemer, DeepLinkConfig deepLinkConfig, PartyListAdapter.Factory partyListAdapterFactory) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(fragmentActions, "fragmentActions");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vqPageType, "vqPageType");
        Intrinsics.checkNotNullParameter(picassoUtils, "picassoUtils");
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "virtualQueueAnalytics");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(deepLinkConfig, "deepLinkConfig");
        Intrinsics.checkNotNullParameter(partyListAdapterFactory, "partyListAdapterFactory");
        this.actions = actions;
        this.fragmentActions = fragmentActions;
        this.context = context;
        this.vqPageType = vqPageType;
        this.picassoUtils = picassoUtils;
        this.virtualQueueAnalytics = virtualQueueAnalytics;
        this.parkAppConfiguration = parkAppConfiguration;
        this.facilityUtils = facilityUtils;
        this.screenSize = screenSize;
        this.vqThemer = vqThemer;
        this.deepLinkConfig = deepLinkConfig;
        this.partyListAdapterFactory = partyListAdapterFactory;
    }

    private final int getProgressState(PositionViewItem item) {
        if (item.getPosition().getIsExpired()) {
            return -1;
        }
        if (this.vqPageType == VQPageType.CONFIRMATION) {
            return 0;
        }
        if (item.getPosition().getIsSummoned()) {
            return 5;
        }
        if (item.getPosition().getProgress() < 25) {
            return 1;
        }
        int progress = item.getPosition().getProgress();
        if (25 <= progress && progress < 50) {
            return 2;
        }
        int progress2 = item.getPosition().getProgress();
        return (50 > progress2 || progress2 >= 75) ? 4 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(PositionAdapter this$0, Queue queue, String park, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(queue, "$queue");
        Intrinsics.checkNotNullParameter(park, "$park");
        VirtualQueueAnalytics.trackHyperlinkClick$default(this$0.virtualQueueAnalytics, this$0.vqPageType, queue, park, false, 8, null);
        this$0.fragmentActions.showHyperlink(VirtualQueueThemer.getString$default(this$0.vqThemer, VQStringType.NonAttractionInfoLinkUrl, queue.getContentId(), false, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(PositionViewItem item, PositionAdapter this$0, Queue queue, View view) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(queue, "$queue");
        List<LinkedGuest> guests = item.getResponse().getGuests();
        ArrayList arrayList = new ArrayList();
        for (Object obj : guests) {
            if (item.getPosition().getGuestIds().contains(((LinkedGuest) obj).getGuestId())) {
                arrayList.add(obj);
            }
        }
        this$0.virtualQueueAnalytics.trackPositionLeaveQueue(arrayList, queue, item.getPosition(), this$0.vqPageType);
        this$0.actions.showLeaveQueue(item.getPosition());
    }

    private final void setupAnimations(PositionViewItem item, PositionViewHolder holder) {
        String loopAnimUrl;
        Queue queueById = item.getResponse().getQueueById(item.getPosition().getQueueId());
        if (queueById == null) {
            queueById = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
        }
        LottieFlow animationFlow = holder.getAnimationFlow();
        if (animationFlow != null) {
            animationFlow.clear();
        }
        holder.getBinding().progressAnimation.setVisibility(8);
        holder.getBinding().progressPlaceholder.setVisibility(8);
        if (item.getPosition().getIsReleased()) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) (this.screenSize.x * 0.28125f));
        holder.getBinding().progressPlaceholder.setLayoutParams(layoutParams);
        holder.getBinding().progressAnimation.setLayoutParams(layoutParams);
        holder.getBinding().progressPlaceholder.setText(this.vqThemer.getPeptasiaIcon(VQIconType.PositionImagePlaceholderIcon, queueById.getContentId()));
        int progressState = getProgressState(item);
        ProgressData progressData = this.vqThemer.getProgressData(progressState, queueById.getContentId());
        String animUrl = progressData.getAnimUrl();
        if ((animUrl != null && animUrl.length() != 0) || ((loopAnimUrl = progressData.getLoopAnimUrl()) != null && loopAnimUrl.length() != 0)) {
            Context context = this.context;
            PicassoUtils picassoUtils = this.picassoUtils;
            LottieAnimationView lottieAnimationView = holder.getBinding().progressAnimation;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "holder.binding.progressAnimation");
            LottieFlow lottieFlow = new LottieFlow(context, picassoUtils, lottieAnimationView, holder.getBinding().progressPlaceholder, false, progressState, 16, null);
            String animUrl2 = progressData.getAnimUrl();
            if (animUrl2 != null && !StringsKt.isBlank(animUrl2)) {
                lottieFlow.addAnimation(animUrl2);
            }
            String loopAnimUrl2 = progressData.getLoopAnimUrl();
            if (loopAnimUrl2 != null) {
                if (StringsKt.isBlank(loopAnimUrl2)) {
                    List<String> specialAnimUrlList = this.vqThemer.getSpecialAnimUrlList(VQSpecialAnimUrlType.IdleAnimUrls, queueById.getContentId());
                    List<String> specialAnimUrlList2 = this.vqThemer.getSpecialAnimUrlList(VQSpecialAnimUrlType.HumorAnimUrls, queueById.getContentId());
                    if (!specialAnimUrlList.isEmpty()) {
                        lottieFlow.addAnimations(CollectionsKt.shuffled(CollectionsKt.filterNotNull(specialAnimUrlList)).subList(0, Math.min(2, specialAnimUrlList.size())));
                    }
                    if (!specialAnimUrlList2.isEmpty()) {
                        lottieFlow.addAnimations(CollectionsKt.shuffled(CollectionsKt.filterNotNull(specialAnimUrlList2)).subList(0, Math.min(2, specialAnimUrlList2.size())));
                    }
                } else {
                    lottieFlow.addAnimation(loopAnimUrl2);
                    lottieFlow.setLoopLastAnimation(true);
                }
            }
            holder.setAnimationFlow(lottieFlow);
            lottieFlow.start();
        } else if (this.vqThemer.getPositionStaticImage(queueById.getContentId()).length() > 0) {
            PicassoUtils picassoUtils2 = this.picassoUtils;
            String positionStaticImage = this.vqThemer.getPositionStaticImage(queueById.getContentId());
            LottieAnimationView lottieAnimationView2 = holder.getBinding().progressAnimation;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "holder.binding.progressAnimation");
            PicassoUtils.loadImage$default(picassoUtils2, positionStaticImage, lottieAnimationView2, null, holder.getBinding().progressPlaceholder, null, 20, null);
        } else {
            holder.setAnimationFlow(null);
            holder.getBinding().progressPlaceholder.setVisibility(0);
        }
        if (item.getPosition().getIsExpired()) {
            holder.getBinding().progressAnimation.setVisibility(8);
            holder.getBinding().progressPlaceholder.setVisibility(0);
        }
    }

    private final void setupCTAButtons(PositionViewHolder holder, final PositionViewItem item, final Queue queue) {
        String strM38908h = this.parkAppConfiguration.m38908h();
        if (Intrinsics.areEqual(strM38908h, "DLR")) {
            holder.getBinding().primaryCTAButton.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionEntryCodeCta, queue.getContentId(), false, 4, null));
            holder.getBinding().primaryCTAButton.setVisibility((!item.getPosition().getIsSummoned() || item.getPosition().getIsReleased()) ? 8 : 0);
            holder.getBinding().primaryCTAButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PositionAdapter.setupCTAButtons$lambda$6(item, this, queue, view);
                }
            });
            holder.getBinding().secondaryCTAButton.setVisibility(8);
            return;
        }
        if (!Intrinsics.areEqual(strM38908h, "WDW")) {
            holder.getBinding().primaryCTAButton.setVisibility(8);
            holder.getBinding().secondaryCTAButton.setVisibility(8);
            return;
        }
        if (!item.getPosition().getIsSummoned() || item.getPosition().getIsReleased()) {
            holder.getBinding().primaryCTAButton.setVisibility(8);
            holder.getBinding().secondaryCTAButton.setVisibility(8);
            return;
        }
        if (!queue.getShowRedeemBarcode()) {
            if (!queue.getShowGetDirections()) {
                holder.getBinding().primaryCTAButton.setVisibility(8);
                return;
            }
            holder.getBinding().primaryCTAButton.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionDirectionsCta, queue.getContentId(), false, 4, null));
            holder.getBinding().primaryCTAButton.setVisibility(!StringsKt.isBlank(queue.getExternalDefinitionId()) ? 0 : 8);
            final String externalDefinitionId = queue.getExternalDefinitionId();
            Button button = holder.getBinding().primaryCTAButton;
            Intrinsics.checkNotNullExpressionValue(button, "holder.binding.primaryCTAButton");
            CommonExtensionsKt.setOnDebouncedClickListener$default(button, 0, new Function0<Unit>() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.PositionAdapter.setupCTAButtons.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    PositionAdapter.this.actions.showDirections(externalDefinitionId);
                }
            }, 1, null);
            holder.getBinding().secondaryCTAButton.setVisibility(8);
            return;
        }
        holder.getBinding().primaryCTAButton.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionEntryCodeCta, queue.getContentId(), false, 4, null));
        holder.getBinding().primaryCTAButton.setVisibility(0);
        holder.getBinding().primaryCTAButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PositionAdapter.setupCTAButtons$lambda$8(item, this, queue, view);
            }
        });
        if (!queue.getShowGetDirections()) {
            holder.getBinding().secondaryCTAButton.setVisibility(8);
            return;
        }
        holder.getBinding().secondaryCTAButton.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionDirectionsCta, queue.getContentId(), false, 4, null));
        holder.getBinding().secondaryCTAButton.setVisibility(StringsKt.isBlank(queue.getExternalDefinitionId()) ? 8 : 0);
        final String externalDefinitionId2 = queue.getExternalDefinitionId();
        Button button2 = holder.getBinding().secondaryCTAButton;
        Intrinsics.checkNotNullExpressionValue(button2, "holder.binding.secondaryCTAButton");
        CommonExtensionsKt.setOnDebouncedClickListener$default(button2, 0, new Function0<Unit>() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.PositionAdapter.setupCTAButtons.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                PositionAdapter.this.actions.showDirections(externalDefinitionId2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCTAButtons$lambda$6(PositionViewItem item, PositionAdapter this$0, Queue queue, View view) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(queue, "$queue");
        List<LinkedGuest> guests = item.getResponse().getGuests();
        ArrayList arrayList = new ArrayList();
        for (Object obj : guests) {
            if (item.getPosition().getGuestIds().contains(((LinkedGuest) obj).getGuestId())) {
                arrayList.add(obj);
            }
        }
        this$0.actions.showRedeem(item.getPosition(), arrayList, queue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCTAButtons$lambda$8(PositionViewItem item, PositionAdapter this$0, Queue queue, View view) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(queue, "$queue");
        List<LinkedGuest> guests = item.getResponse().getGuests();
        ArrayList arrayList = new ArrayList();
        for (Object obj : guests) {
            if (item.getPosition().getGuestIds().contains(((LinkedGuest) obj).getGuestId())) {
                arrayList.add(obj);
            }
        }
        this$0.actions.showRedeem(item.getPosition(), arrayList, queue);
    }

    private final void setupExpandableView(final PositionViewHolder holder, final PositionViewItem item, final Queue queue) throws Resources.NotFoundException {
        holder.getBinding().groupParent.removeView(holder.getBinding().groupList);
        List<LinkedGuest> guests = item.getResponse().getGuests();
        ArrayList arrayList = new ArrayList();
        for (Object obj : guests) {
            if (item.getPosition().getGuestIds().contains(((LinkedGuest) obj).getGuestId())) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int color = C3296a.getColor(this.context, C21487R.color.vq_hyperion_blue_700);
        holder.getBinding().expandableView.m63897k(-1, VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionPartyHeader, MapsKt.mapOf(TuplesKt.m92045to("partySize", Integer.valueOf(size))), queue.getContentId(), false, 8, null), C21487R.drawable.arrowright_icon, C21487R.drawable.arrowdown_icon, color, holder.getBinding().groupList, C21487R.string.vq_accessibility_txt_my_queues_your_party_blank);
        int dimensionPixelSize = this.context.getResources().getDimensionPixelSize(C21487R.dimen.margin_normal);
        holder.getExpandedViewHeader().setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        holder.getExpandedViewHolder().setPadding(0, 0, 0, 0);
        holder.getBinding().expandableView.setTitleContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionPartyHeaderOpenAccessibility, MapsKt.mapOf(TuplesKt.m92045to("partySize", Integer.valueOf(item.getPosition().getGuestIds().size()))), queue.getContentId(), false, 8, null));
        TextView textView = (TextView) holder.getBinding().expandableView.findViewById(C21487R.id.expandable_view_title);
        if (textView != null) {
            textView.setTypeface(C31640h.m97205h(this.context, C21487R.font.twdc_font_heavy));
        }
        ImageView imageView = (ImageView) holder.getBinding().expandableView.findViewById(C21487R.id.expandable_view_arrow);
        if (imageView != null) {
            int i10 = (int) (13 * this.context.getResources().getDisplayMetrics().density);
            imageView.getLayoutParams().width = i10;
            imageView.getLayoutParams().height = i10;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.removeRule(11);
                layoutParams2.addRule(9);
                imageView.setLayoutParams(layoutParams2);
            }
            imageView.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
        TextView textView2 = (TextView) holder.getBinding().expandableView.findViewById(C21487R.id.expandable_view_title);
        if (textView2 != null) {
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.removeRule(9);
                layoutParams4.resolveLayoutDirection(3);
                layoutParams4.addRule(1, imageView.getId());
                layoutParams4.setMarginStart(getDp(24));
                textView2.setLayoutParams(layoutParams4);
            }
        }
        holder.getBinding().expandableView.setOnExpandableViewToggleListener(new ExpandableView.InterfaceC21083b() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.f
            @Override // com.disney.wdpro.support.widget.ExpandableView.InterfaceC21083b
            /* renamed from: a */
            public final void mo37595a(ExpandableView expandableView, boolean z10) {
                PositionAdapter.setupExpandableView$lambda$16(this.f45287a, queue, item, holder, expandableView, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupExpandableView$lambda$16(PositionAdapter this$0, Queue queue, PositionViewItem item, PositionViewHolder holder, ExpandableView expandableView, boolean z10) {
        VQStringType vQStringType;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(queue, "$queue");
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        this$0.virtualQueueAnalytics.trackPositionGroupShowHide(!z10, queue.getName(), item.getPosition().getBoardingGroup(), this$0.vqPageType);
        if (z10) {
            vQStringType = VQStringType.PositionPartyHeaderOpenAccessibility;
        } else {
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            vQStringType = VQStringType.PositionPartyHeaderCloseAccessibility;
        }
        holder.getBinding().expandableView.setTitleContentDescription(VirtualQueueThemer.getString$default(this$0.vqThemer, vQStringType, MapsKt.mapOf(TuplesKt.m92045to("partySize", Integer.valueOf(item.getPosition().getGuestIds().size()))), queue.getContentId(), false, 8, null));
    }

    private final void setupGroupStatus(PositionViewHolder holder, PositionViewItem item, Queue queue) {
        if (item.getPosition().getIsExpired()) {
            holder.getBinding().groupStatusAlertIcon.setVisibility(8);
            holder.getBinding().groupStatusAlertText.setVisibility(8);
            holder.getBinding().groupStatusText.setVisibility(0);
            holder.getBinding().groupStatusText.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionExpired, queue.getContentId(), false, 4, null));
            return;
        }
        if (item.getPosition().getIsReleased()) {
            holder.getBinding().groupStatusText.setVisibility(8);
            holder.getBinding().groupStatusAlertIcon.setVisibility(0);
            holder.getBinding().groupStatusAlertIcon.setText(this.vqThemer.getPeptasiaIcon(VQIconType.PositionReleasedGroupIcon, queue.getContentId()));
            holder.getBinding().groupStatusAlertIcon.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueImportantAccessibility, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, holder.getBinding().groupStatusAlertIcon.getText())), null, false, 12, null));
            holder.getBinding().groupStatusAlertText.setVisibility(0);
            holder.getBinding().groupStatusAlertText.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionReleasedGroupStatus, queue.getContentId(), false, 4, null));
            this.virtualQueueAnalytics.trackPositionAlerts(queue, holder.getBinding().groupStatusAlertText.getText().toString(), VQAlertType.RELEASED, item.getPosition().getBoardingGroup(), this.vqPageType);
            return;
        }
        if (item.getPosition().getIsSummoned() && item.getShowDowntimeAlert()) {
            holder.getBinding().groupStatusText.setVisibility(8);
            holder.getBinding().groupStatusAlertIcon.setVisibility(0);
            holder.getBinding().groupStatusAlertIcon.setText(this.vqThemer.getPeptasiaIcon(VQIconType.CommonWarningIcon, queue.getContentId()));
            holder.getBinding().groupStatusAlertIcon.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueImportantAccessibility, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, holder.getBinding().groupStatusAlertIcon.getText())), null, false, 12, null));
            holder.getBinding().groupStatusAlertText.setVisibility(0);
            holder.getBinding().groupStatusAlertText.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionDowntimeAlert, queue.getContentId(), false, 4, null));
            return;
        }
        if (item.getPosition().getIsSummoned()) {
            holder.getBinding().groupStatusAlertIcon.setVisibility(8);
            holder.getBinding().groupStatusAlertText.setVisibility(8);
            holder.getBinding().groupStatusText.setVisibility(0);
            holder.getBinding().groupStatusText.setText(StringsKt.isBlank(item.getPosition().getExpiresAt()) ? VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionReturnAnytime, queue.getContentId(), false, 4, null) : VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionReturnBy, MapsKt.mapOf(TuplesKt.m92045to("time", this.facilityUtils.formatDisplayableTime(item.getPosition().getExpiresAt()))), queue.getContentId(), false, 8, null));
            return;
        }
        if (item.getPosition().getBoardingGroupType() == BoardingGroupType.BACKUP) {
            holder.getBinding().groupStatusText.setVisibility(8);
            holder.getBinding().groupStatusAlertIcon.setVisibility(0);
            holder.getBinding().groupStatusAlertIcon.setText(this.vqThemer.getPeptasiaIcon(VQIconType.PositionBackupGroupIcon, queue.getContentId()));
            holder.getBinding().groupStatusAlertText.setVisibility(0);
            holder.getBinding().groupStatusAlertText.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionBackupGroupStatus, queue.getContentId(), false, 4, null));
            this.virtualQueueAnalytics.trackPositionAlerts(queue, holder.getBinding().groupStatusAlertText.getText().toString(), VQAlertType.BACKUP, item.getPosition().getBoardingGroup(), this.vqPageType);
            return;
        }
        if (item.getPosition().getWaitTimeMin() == 0 || item.getPosition().getWaitTimeMax() == 0) {
            holder.getBinding().groupStatusAlertIcon.setVisibility(8);
            holder.getBinding().groupStatusAlertText.setVisibility(8);
            holder.getBinding().groupStatusText.setVisibility(8);
            return;
        }
        holder.getBinding().groupStatusAlertIcon.setVisibility(8);
        holder.getBinding().groupStatusAlertText.setVisibility(8);
        int waitTimeMin = item.getPosition().getWaitTimeMin();
        int waitTimeMax = item.getPosition().getWaitTimeMax();
        if (item.getPosition().getIsImpactedByPno()) {
            holder.getBinding().groupStatusText.setVisibility(8);
            holder.getBinding().groupStatusAlertIcon.setVisibility(0);
            holder.getBinding().groupStatusAlertIcon.setText(this.vqThemer.getPeptasiaIcon(VQIconType.PositionBackupGroupIcon, queue.getContentId()));
            holder.getBinding().groupStatusAlertText.setVisibility(0);
            final String string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.InfoLinkText, queue.getContentId(), false, 4, null);
            final String string$default2 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.InfoLinkUrl, queue.getContentId(), false, 4, null);
            String string$default3 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PnoMessage, queue.getContentId(), false, 4, null);
            this.virtualQueueAnalytics.trackPositionAlerts(queue, string$default3, VQAlertType.BACKUP, item.getPosition().getBoardingGroup(), this.vqPageType);
            SpannableStringBuilder spannableStringBuilderOnClickSpannedText = CommonExtensionsKt.onClickSpannedText(string$default3, string$default, new Function1<View, Unit>() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.PositionAdapter$setupGroupStatus$spanText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Context context = this.this$0.context;
                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                    Activity activity = (Activity) context;
                    ActivityActions activityActions = (ActivityActions) activity;
                    if (URLUtil.isValidUrl(string$default2)) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(string$default2));
                        activity.startActivity(intent);
                    } else {
                        DeepLinkConfig deepLinkConfig = this.this$0.deepLinkConfig;
                        Uri uri = Uri.parse(string$default2);
                        Intrinsics.checkNotNullExpressionValue(uri, "parse(infoLinkUrl)");
                        activityActions.navigateTo(deepLinkConfig.getNavigationEntry(uri));
                    }
                    this.this$0.virtualQueueAnalytics.trackMyQueuesAlertMessageClick(string$default, this.this$0.getVqPageType());
                }
            });
            holder.getBinding().groupStatusAlertText.setMovementMethod(LinkMovementMethod.getInstance());
            holder.getBinding().groupStatusAlertText.setText(spannableStringBuilderOnClickSpannedText);
        }
        holder.getBinding().groupStatusText.setVisibility(0);
        holder.getBinding().groupStatusText.setText(waitTimeMin == waitTimeMax ? VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionEstimatedWaitSingle, MapsKt.mapOf(TuplesKt.m92045to("time", String.valueOf(waitTimeMin))), queue.getContentId(), false, 8, null) : VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionEstimatedWaitRange, MapsKt.mapOf(TuplesKt.m92045to("minTime", String.valueOf(waitTimeMin)), TuplesKt.m92045to(AnalyticsListener.ANALYTICS_MAX_TIME_KEY, String.valueOf(waitTimeMax))), queue.getContentId(), false, 8, null));
    }

    private final void setupLegalDisclaimer(Queue queue, PositionViewHolder holder) {
        QueueLegalDisclaimer legalDisclaimer = queue.getLegalDisclaimer();
        VQPageType vQPageType = this.vqPageType;
        VQPageType vQPageType2 = VQPageType.CONFIRMATION;
        if (!(vQPageType == vQPageType2 && legalDisclaimer != null && legalDisclaimer.getShowOnConfirmation()) && (this.vqPageType == vQPageType2 || legalDisclaimer == null || !legalDisclaimer.getShowOnMyLines())) {
            holder.getBinding().disclaimerText.setVisibility(8);
        } else {
            holder.getBinding().disclaimerText.setText(legalDisclaimer.getDisclaimerText());
            holder.getBinding().disclaimerText.setVisibility(StringsKt.isBlank(legalDisclaimer.getDisclaimerText()) ? 8 : 0);
        }
    }

    private final void setupNowBoarding(PositionViewHolder holder, PositionViewItem item, Queue queue) {
        String str;
        if ((queue.getCurrentArrivingGroupStart() == -1 && queue.getCurrentArrivingGroupEnd() == -1) || this.vqPageType == VQPageType.CONFIRMATION) {
            holder.getBinding().nowBoardingText.setText("");
            holder.getBinding().nowBoardingText.setVisibility(8);
            return;
        }
        int currentArrivingGroupStart = queue.getCurrentArrivingGroupStart();
        int currentArrivingGroupEnd = queue.getCurrentArrivingGroupEnd();
        boolean z10 = currentArrivingGroupStart == 0 && currentArrivingGroupEnd == 0;
        boolean z11 = (z10 || currentArrivingGroupStart == currentArrivingGroupEnd) ? false : true;
        boolean showDowntimeAlert = queue.getShowDowntimeAlert();
        if (item.getPosition().getIsSummoned() || item.getPosition().getIsReleased() || item.getPosition().getIsExpired()) {
            holder.getBinding().nowBoardingText.setText("");
            holder.getBinding().nowBoardingText.setVisibility(8);
            return;
        }
        TextView textView = holder.getBinding().nowBoardingText;
        if (showDowntimeAlert) {
            str = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionAdmittingGroups, queue.getContentId(), false, 4, null) + " " + VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionDowntimeBoarding, queue.getContentId(), false, 4, null);
        } else if (z10) {
            str = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionAdmittingGroups, queue.getContentId(), false, 4, null) + " " + VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionAdmittingGroupBlank, queue.getContentId(), false, 4, null);
        } else if (z11) {
            str = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionAdmittingGroups, queue.getContentId(), false, 4, null) + " " + VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionAdmittingGroupRange, MapsKt.mapOf(TuplesKt.m92045to("number1", queue.getCurrentArrivingGroupStartDisplayName()), TuplesKt.m92045to("number2", queue.getCurrentArrivingGroupEndDisplayName())), queue.getContentId(), false, 8, null);
        } else {
            str = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionAdmittingGroup, queue.getContentId(), false, 4, null) + " " + VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionAdmittingGroupSingle, MapsKt.mapOf(TuplesKt.m92045to("number1", queue.getCurrentArrivingGroupStartDisplayName())), queue.getContentId(), false, 8, null);
        }
        textView.setText(str);
        holder.getBinding().nowBoardingText.setVisibility(0);
    }

    private final void setupProgressBarAndStatus(PositionViewHolder holder, Queue queue, PositionViewItem item) {
        holder.getBinding().progressBar.getLayoutParams().width = -1;
        holder.getBinding().progressBar.getLayoutParams().height = (int) (this.screenSize.x * 0.028985508f);
        holder.getBinding().progressBar.setBackgroundResource(0);
        LottieFlow progressBarFlow = holder.getProgressBarFlow();
        if (progressBarFlow != null) {
            progressBarFlow.clear();
        }
        int progressState = getProgressState(item);
        boolean z10 = true;
        if (progressState == -1) {
            holder.getBinding().progressText.setVisibility(8);
            String barAnimUrl = this.vqThemer.getProgressData(5, queue.getContentId()).getBarAnimUrl();
            if (barAnimUrl != null && barAnimUrl.length() != 0) {
                z10 = false;
            }
            if (z10) {
                holder.getBinding().progressBar.setVisibility(8);
                return;
            }
            holder.getBinding().progressBar.setImageDrawable(null);
            holder.getBinding().progressBar.setBackgroundResource(C21487R.drawable.vq_progress_bar_grey);
            holder.getBinding().progressBar.setVisibility(0);
            return;
        }
        ProgressData progressData = this.vqThemer.getProgressData(progressState, queue.getContentId());
        boolean z11 = this.vqPageType == VQPageType.CONFIRMATION || (item.getPosition().getBoardingGroupType() == BoardingGroupType.BACKUP && !item.getPosition().getIsSummoned());
        int i10 = z11 ? 0 : progressState;
        String barAnimUrl2 = progressData.getBarAnimUrl();
        if (barAnimUrl2 != null) {
            if (StringsKt.isBlank(barAnimUrl2)) {
                holder.getBinding().progressBar.setVisibility(8);
            } else {
                Context context = this.context;
                PicassoUtils picassoUtils = this.picassoUtils;
                LottieAnimationView lottieAnimationView = holder.getBinding().progressBar;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "holder.binding.progressBar");
                holder.setProgressBarFlow(new LottieFlow(context, picassoUtils, lottieAnimationView, null, z11, i10));
                LottieFlow progressBarFlow2 = holder.getProgressBarFlow();
                if (progressBarFlow2 != null) {
                    progressBarFlow2.addAnimation(barAnimUrl2);
                }
                LottieFlow progressBarFlow3 = holder.getProgressBarFlow();
                if (progressBarFlow3 != null) {
                    progressBarFlow3.start();
                }
                if (item.getPosition().getIsReleased()) {
                    holder.getBinding().progressBar.setVisibility(8);
                } else {
                    holder.getBinding().progressBar.setVisibility(0);
                }
            }
        }
        holder.getBinding().progressText.setText(progressData.getDescription());
        holder.getBinding().progressText.setTextColor(C3296a.getColor(this.context, C21487R.color.vq_font_loading));
        TextView textView = holder.getBinding().progressText;
        String description = progressData.getDescription();
        textView.setVisibility((description == null || StringsKt.isBlank(description)) ? 8 : 0);
        holder.setProgressStatus(String.valueOf(progressData.getDescription()));
        holder.setProgressStatusAccessibility(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionExperienceWithParkAccessibility, MapsKt.mapOf(TuplesKt.m92045to("experienceName", queue.getName()), TuplesKt.m92045to("parkName", holder.getBinding().queuePark.getText())), queue.getContentId(), false, 8, null) + ": " + progressData.getBarAccessibility());
        holder.getBinding().progressAnimationContainer.setContentDescription(holder.getProgressStatusAccessibility());
        holder.setLoadingFailed(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionLoadingFailed, queue.getContentId(), false, 4, null));
        holder.setProgressStatusColor(C3296a.getColor(this.context, C21487R.color.vq_font_progress));
        holder.setLoadingFailedColor(C3296a.getColor(this.context, C21487R.color.vq_font_loading_failed));
    }

    private final void setupQueueTitle(PositionViewHolder holder, String title) {
        holder.getBinding().queueTitle.setText(title);
        holder.getBinding().queueTitle.setVisibility(0);
    }

    public final int getDp(int i10) {
        return (int) (i10 / this.context.getResources().getDisplayMetrics().density);
    }

    public final int getPx(int i10) {
        return (int) (i10 * this.context.getResources().getDisplayMetrics().density);
    }

    public final VQPageType getVqPageType() {
        return this.vqPageType;
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC4902e0 abstractC4902e0, InterfaceC9233g interfaceC9233g, List list) {
        super.onBindViewHolder(abstractC4902e0, interfaceC9233g, list);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public PositionViewHolder onCreateViewHolder(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VqMyQueuesPositionBinding vqMyQueuesPositionBindingInflate = VqMyQueuesPositionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vqMyQueuesPositionBindingInflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new PositionViewHolder(vqMyQueuesPositionBindingInflate, parent, this.vqThemer, this.vqPageType, this.partyListAdapterFactory);
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9229c
    public void onBindViewHolder(PositionViewHolder holder, final PositionViewItem item) throws Resources.NotFoundException {
        String ancestorThemePark;
        VQStringType vQStringType;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        final Queue queueById = item.getResponse().getQueueById(item.getPosition().getQueueId());
        if (queueById == null) {
            queueById = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
        }
        item.setShowDowntimeAlert(queueById.getShowDowntimeAlert() && StringsKt.isBlank(item.getPosition().getEnteredStandbyAt()));
        setupQueueTitle(holder, queueById.getName());
        final String string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.NonAttractionPark, queueById.getContentId(), false, 4, null);
        if (!StringsKt.isBlank(string$default)) {
            holder.getBinding().queuePark.setText(string$default != null ? string$default : "");
        } else {
            TextView textView = holder.getBinding().queuePark;
            Facility facility = this.facilityUtils.getFacility(queueById.getExternalDefinitionId());
            if (facility == null || (ancestorThemePark = facility.getAncestorThemePark()) == null) {
                ancestorThemePark = "";
            }
            textView.setText(ancestorThemePark);
        }
        holder.getBinding().queuePark.setVisibility(Intrinsics.areEqual(holder.getBinding().queuePark.getText(), "") ? 8 : 0);
        String string$default2 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.NonAttractionLocatedAt, queueById.getContentId(), false, 4, null);
        String string$default3 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.NonAttractionSubpark, queueById.getContentId(), false, 4, null);
        if (StringsKt.isBlank(string$default3)) {
            holder.getBinding().subParkContainer.setVisibility(8);
        } else {
            holder.getBinding().subParkContainer.setVisibility(0);
            holder.getBinding().locatedAtText.setText(string$default2);
            holder.getBinding().queueSubPark.setText(string$default3);
        }
        String string$default4 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.NonAttractionInfoLinkText, queueById.getContentId(), false, 4, null);
        if (StringsKt.isBlank(string$default4)) {
            holder.getBinding().positionHyperlink.setVisibility(8);
        } else {
            Spanned peptasiaIcon$default = VirtualQueueThemer.getPeptasiaIcon$default(this.vqThemer, VQIconType.CommonChevronIcon, null, 2, null);
            Typeface typefaceM97205h = C31640h.m97205h(this.context, C21487R.font.peptasia);
            Typeface typefaceM97205h2 = C31640h.m97205h(this.context, C21487R.font.twdc_font_heavy);
            if (typefaceM97205h != null && typefaceM97205h2 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(string$default4, new C20751b(typefaceM97205h2), 33).append((CharSequence) " ").append(peptasiaIcon$default, new C20751b(typefaceM97205h), 33);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.context.getResources().getDimensionPixelSize(C21487R.dimen.vq_peptasia_11)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 34);
                holder.getBinding().positionHyperlink.setText(spannableStringBuilder);
            } else {
                holder.getBinding().positionHyperlink.setText(string$default4);
            }
            holder.getBinding().positionHyperlink.setVisibility(0);
            holder.getBinding().positionHyperlink.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PositionAdapter.onBindViewHolder$lambda$0(this.f45291a, queueById, string$default, view);
                }
            });
        }
        BoardingGroupType boardingGroupType = item.getPosition().getBoardingGroupType();
        BoardingGroupType boardingGroupType2 = BoardingGroupType.BACKUP;
        if (boardingGroupType == boardingGroupType2) {
            vQStringType = VQStringType.PositionBackupGroup;
        } else {
            vQStringType = VQStringType.PositionGroup;
        }
        String string$default5 = VirtualQueueThemer.getString$default(this.vqThemer, vQStringType, MapsKt.mapOf(TuplesKt.m92045to(RecommenderThemerConstants.GROUP_NUMBER, item.getPosition().getBoardingGroupDisplayName())), queueById.getContentId(), false, 8, null);
        holder.getBinding().groupText.setText(string$default5);
        holder.getBinding().groupText.setVisibility((item.getPosition().getBoardingGroup() == 0 || StringsKt.isBlank(string$default5)) ? 8 : 0);
        if (queueById.getGuestIdMode() == QueueGuestIdMode.ANONYMOUS) {
            holder.getBinding().expandableView.setVisibility(8);
            holder.getBinding().anonymousGroupText.setVisibility(0);
            holder.getBinding().anonymousGroupText.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionAnonymousNumberOfGuests, MapsKt.mapOf(TuplesKt.m92045to(RecommenderServiceConstants.ANONYMOUS_PARTY_SIZE, Integer.valueOf(item.getPosition().getAnonymousPartySize()))), null, false, 12, null));
        } else {
            holder.getBinding().expandableView.setVisibility(0);
            holder.getBinding().anonymousGroupText.setVisibility(8);
            setupExpandableView(holder, item, queueById);
            RecyclerView.Adapter adapter = holder.getBinding().groupList.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.ui.my_queues.PartyListAdapter");
            ((PartyListAdapter) adapter).setParty(item.getPosition().getGuestIds(), item.getResponse().getGuests());
        }
        VQPageType vQPageType = this.vqPageType;
        VQPageType vQPageType2 = VQPageType.CONFIRMATION;
        if (vQPageType != vQPageType2 && !item.getPosition().getIsReleased()) {
            holder.getBinding().removeGuests.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.ui.my_queues.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PositionAdapter.onBindViewHolder$lambda$2(item, this, queueById, view);
                }
            });
            holder.getBinding().removeGuests.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionRemoveGuests, null, false, 6, null));
        } else {
            holder.getBinding().removeGuests.setVisibility(8);
        }
        boolean z10 = (item.getPosition().getIsReleased() || item.getPosition().getIsSummoned() || item.getPosition().getIsExpired() || item.getPosition().getBoardingGroupType() != BoardingGroupType.PRIMARY) ? false : true;
        ImageView imageView = holder.getBinding().bottomShadow;
        VQPageType vQPageType3 = this.vqPageType;
        VQPageType vQPageType4 = VQPageType.MYQUEUES;
        imageView.setVisibility((vQPageType3 == vQPageType4 || !item.getIsLast() || (this.vqPageType == VQPageType.DETAIL && z10)) ? 0 : 8);
        holder.getBinding().bottomLine.setVisibility((this.vqPageType != VQPageType.DETAIL || z10) ? 8 : 0);
        View view = holder.getBinding().bottomSeparator;
        VQPageType vQPageType5 = this.vqPageType;
        view.setVisibility((vQPageType5 == vQPageType4 || vQPageType5 == vQPageType2 || !item.getIsLast()) ? 0 : 8);
        holder.getBinding().underYourPartyLine.setVisibility((this.vqPageType == vQPageType2 || item.getPosition().getIsReleased()) ? 8 : 0);
        setupCTAButtons(holder, item, queueById);
        setupNowBoarding(holder, item, queueById);
        setupGroupStatus(holder, item, queueById);
        setupLegalDisclaimer(queueById, holder);
        String strValueOf = String.valueOf(((item.getPosition().getIsReleased() || item.getPosition().getBoardingGroupType() == boardingGroupType2 || item.getShowDowntimeAlert()) ? holder.getBinding().groupStatusAlertText : holder.getBinding().groupStatusText).getText());
        if (holder.getBinding().groupStatusAlertIcon.getVisibility() == 0) {
            String string$default6 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.SelectQueueImportantAccessibility, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, holder.getBinding().groupStatusAlertText.getText().toString())), queueById.getContentId(), false, 8, null);
            holder.getBinding().groupContainer.setContentDescription(((Object) holder.getBinding().groupText.getText()) + ", " + ((Object) holder.getBinding().nowBoardingText.getText()) + ", " + string$default6 + "  ");
        } else {
            holder.getBinding().groupContainer.setContentDescription(((Object) holder.getBinding().groupText.getText()) + ", " + ((Object) holder.getBinding().nowBoardingText.getText()) + ", " + strValueOf);
        }
        if (item.getPosition().getIsReleased() || item.getPosition().getIsExpired()) {
            holder.getBinding().queueNameContainer.setContentDescription(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionExperienceWithParkAccessibility, MapsKt.mapOf(TuplesKt.m92045to("experienceName", queueById.getName()), TuplesKt.m92045to("parkName", holder.getBinding().queuePark.getText())), null, false, 12, null));
        }
        setupProgressBarAndStatus(holder, queueById, item);
        setupAnimations(item, holder);
        holder.getBinding().progressContainer.setVisibility(item.getPosition().getIsReleased() ? 8 : 0);
    }
}