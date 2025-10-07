package com.disney.wdpro.virtualqueue.themer;

import android.content.Context;
import android.graphics.Color;
import android.text.Spanned;
import androidx.core.text.C3321b;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.dash.couchbase.InterfaceC9400d;
import com.disney.wdpro.dine.mvvm.common.adapter.DineAdapterConstants;
import com.disney.wdpro.paymentsui.constants.PaymentsConstants;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.couchbase.dto.VirtualQueueDocument;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.FilterData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.ImageUrlData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.PositionData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.ProgressData;
import com.disney.wdpro.virtualqueue.p462ui.common.CommonExtensionsKt;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.microblink.blinkcard.activity.edit.BlinkCardEditActivity;
import com.snap.camerakit.internal.h76;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\b\b\u0007\u0018\u0000 ]2\u00020\u0001:\u0001]B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010#\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\f2\u0006\u0010!\u001a\u00020%2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b&\u0010'J=\u0010#\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b#\u0010*J'\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001b2\u0006\u0010!\u001a\u00020+2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\f2\u0006\u0010!\u001a\u00020.2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b/\u00100J\u0017\u0010/\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b/\u00103J\u001f\u00106\u001a\u0002052\u0006\u0010!\u001a\u0002042\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u0002092\u0006\u0010!\u001a\u0002082\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u0002092\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020C2\u0006\u0010B\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\bD\u0010EJ\u001d\u0010H\u001a\u00020\f2\u0006\u0010B\u001a\u00020\f2\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IJ/\u0010L\u001a\u00020\f2\u0006\u0010B\u001a\u00020\f2\u0006\u0010G\u001a\u00020F2\u0006\u0010J\u001a\u00020\f2\b\b\u0002\u0010K\u001a\u00020\u0011¢\u0006\u0004\bL\u0010MJ\u0013\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u001b¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bQ\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010RR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010SR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010TR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010UR\"\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0017\u0010\u0015\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0015\u0010Y\u001a\u0004\b\u0017\u0010ZR\u0016\u0010[\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006^"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/couchbase/VirtualQueueRepository;", "virtualQueueRepository", "Lcom/disney/wdpro/dash/couchbase/d;", "cbEnvironment", "Landroid/content/Context;", "context", "<init>", "(Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/couchbase/VirtualQueueRepository;Lcom/disney/wdpro/dash/couchbase/d;Landroid/content/Context;)V", "", VirtualQueueConstants.CONTENT_ID, "Lcom/disney/wdpro/virtualqueue/couchbase/dto/VirtualQueueDocument;", "getQueueDocument", "(Ljava/lang/String;)Lcom/disney/wdpro/virtualqueue/couchbase/dto/VirtualQueueDocument;", "", "loadDocument", "(Ljava/lang/String;)Z", "", "density", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData$ImageDensity;", "getDensity", "(F)Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData$ImageDensity;", "defaultQueueContentId", "()Ljava/lang/String;", "", "contentIds", "", "refreshDocuments", "(Ljava/util/List;)V", "Lcom/disney/wdpro/virtualqueue/themer/VQStringType;", "type", "shouldDecodeHtml", "getString", "(Lcom/disney/wdpro/virtualqueue/themer/VQStringType;Ljava/lang/String;Z)Ljava/lang/String;", "Lcom/disney/wdpro/virtualqueue/themer/VQUrlType;", "getUrl", "(Lcom/disney/wdpro/virtualqueue/themer/VQUrlType;Ljava/lang/String;)Ljava/lang/String;", "", "replacements", "(Lcom/disney/wdpro/virtualqueue/themer/VQStringType;Ljava/util/Map;Ljava/lang/String;Z)Ljava/lang/String;", "Lcom/disney/wdpro/virtualqueue/themer/VQSpecialAnimUrlType;", "getSpecialAnimUrlList", "(Lcom/disney/wdpro/virtualqueue/themer/VQSpecialAnimUrlType;Ljava/lang/String;)Ljava/util/List;", "Lcom/disney/wdpro/virtualqueue/themer/VQImageUrlType;", "getImageUrl", "(Lcom/disney/wdpro/virtualqueue/themer/VQImageUrlType;Ljava/lang/String;)Ljava/lang/String;", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "imageUrlData", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;)Ljava/lang/String;", "Lcom/disney/wdpro/virtualqueue/themer/VQIconType;", "Landroid/text/Spanned;", "getPeptasiaIcon", "(Lcom/disney/wdpro/virtualqueue/themer/VQIconType;Ljava/lang/String;)Landroid/text/Spanned;", "Lcom/disney/wdpro/virtualqueue/themer/VQColorType;", "", "getColor", "(Lcom/disney/wdpro/virtualqueue/themer/VQColorType;Ljava/lang/String;)I", "progressState", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ProgressData;", "getProgressData", "(ILjava/lang/String;)Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ProgressData;", "getPositionStaticImage", "(Ljava/lang/String;)Ljava/lang/String;", "conflictType", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ConflictData;", "getConflictData", "(Ljava/lang/String;Ljava/lang/String;)Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ConflictData;", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "getTitleForConflict", "(Ljava/lang/String;Lcom/disney/wdpro/virtualqueue/service/model/Queue;)Ljava/lang/String;", "parkName", "isInlineMessage", "getDetailForConflict", "(Ljava/lang/String;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;Z)Ljava/lang/String;", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/FilterData;", "getFilterData", "()Ljava/util/List;", "getActiveNetworkConnection", "Lcom/disney/wdpro/commons/j;", "Lcom/disney/wdpro/virtualqueue/couchbase/VirtualQueueRepository;", "Lcom/disney/wdpro/dash/couchbase/d;", "Landroid/content/Context;", "", "queueDocuments", "Ljava/util/Map;", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData$ImageDensity;", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData$ImageDensity;", "defaultDetail", "Ljava/lang/String;", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nVirtualQueueThemer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualQueueThemer.kt\ncom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Html.kt\nandroidx/core/text/HtmlKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,724:1\n1855#2,2:725\n1549#2:732\n1620#2,3:733\n39#3,5:727\n39#3,5:736\n1#4:741\n*S KotlinDebug\n*F\n+ 1 VirtualQueueThemer.kt\ncom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer\n*L\n88#1:725,2\n483#1:732\n483#1:733,3\n431#1:727,5\n575#1:736,5\n*E\n"})
/* loaded from: classes20.dex */
public final class VirtualQueueThemer {
    private static final String CURLY_CLOSING_TOKEN = "}";
    private static final String CURLY_OPENING_TOKEN = "{";
    public static final int QUEUE_PROGRESS_STATE_0 = 0;
    public static final int QUEUE_PROGRESS_STATE_1 = 1;
    public static final int QUEUE_PROGRESS_STATE_2 = 2;
    public static final int QUEUE_PROGRESS_STATE_3 = 3;
    public static final int QUEUE_PROGRESS_STATE_4 = 4;
    public static final int QUEUE_PROGRESS_STATE_EXPIRED = -1;
    public static final int QUEUE_PROGRESS_SUMMONED = 5;
    private static final String SQUARE_CLOSING_TOKEN = "]";
    private static final String SQUARE_OPENING_TOKEN = "[";
    private final InterfaceC9400d cbEnvironment;
    private final Context context;
    private String defaultDetail;
    private final ImageUrlData.ImageDensity density;
    private final C9314j parkAppConfiguration;
    private Map<String, VirtualQueueDocument> queueDocuments;
    private final VirtualQueueRepository virtualQueueRepository;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\"\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer$Companion;", "", "()V", "CURLY_CLOSING_TOKEN", "", "CURLY_OPENING_TOKEN", "QUEUE_PROGRESS_STATE_0", "", "QUEUE_PROGRESS_STATE_1", "QUEUE_PROGRESS_STATE_2", "QUEUE_PROGRESS_STATE_3", "QUEUE_PROGRESS_STATE_4", "QUEUE_PROGRESS_STATE_EXPIRED", "QUEUE_PROGRESS_SUMMONED", "SQUARE_CLOSING_TOKEN", "SQUARE_OPENING_TOKEN", "hasTokens", "", "text", "replaceTokens", "textWithTokens", "replacements", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @SourceDebugExtension({"SMAP\nVirtualQueueThemer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualQueueThemer.kt\ncom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,724:1\n215#2,2:725\n*S KotlinDebug\n*F\n+ 1 VirtualQueueThemer.kt\ncom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer$Companion\n*L\n54#1:725,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean hasTokens(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return StringsKt.contains$default((CharSequence) text, (CharSequence) "[", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) text, (CharSequence) "]", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) text, (CharSequence) "{", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) text, (CharSequence) "}", false, 2, (Object) null);
        }

        public final String replaceTokens(String textWithTokens, Map<String, ? extends Object> replacements) {
            Intrinsics.checkNotNullParameter(textWithTokens, "textWithTokens");
            Intrinsics.checkNotNullParameter(replacements, "replacements");
            for (Map.Entry<String, ? extends Object> entry : replacements.entrySet()) {
                Iterator it = CollectionsKt.listOf((Object[]) new String[]{"[" + ((Object) entry.getKey()) + "]", "{" + ((Object) entry.getKey()) + "}"}).iterator();
                String strReplace$default = textWithTokens;
                while (it.hasNext()) {
                    strReplace$default = StringsKt.replace$default(strReplace$default, (String) it.next(), entry.getValue().toString(), false, 4, (Object) null);
                }
                textWithTokens = strReplace$default;
            }
            return textWithTokens;
        }

        private Companion() {
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[VQStringType.values().length];
            try {
                iArr[VQStringType.CommonAllGuestsAddedAccessibility.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VQStringType.CommonAllGuestsRemovedAccessibility.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VQStringType.CommonCheckedAccessibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VQStringType.CommonDimmedViewAccessibility.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VQStringType.CommonGuestMovedAccessibility.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VQStringType.CommonHeadingAccessibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VQStringType.CommonPeekViewInstructionalText.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VQStringType.CommonQRCodeAccessibility.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VQStringType.CommonSelectAll.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VQStringType.CommonPTRTitleAccessibility.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VQStringType.CommonUncheckedAccessibility.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VQStringType.CommonVirtualQueueAccessibility.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[VQStringType.CommonVirtualQueueDimmedCheckboxAccessibility.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[VQStringType.CommonVirtualQueueIsMe.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[VQStringType.CommonVirtualQueueSelectAllCheckbox.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[VQStringType.CreatePartyAlternateCta.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[VQStringType.CreatePartyEmptyListDetail.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[VQStringType.CreatePartyGuestAddedAccessibility.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[VQStringType.CreatePartyGuestCheckedAccessibility.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[VQStringType.CreatePartyGuestIneligibleAccessibility.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[VQStringType.CreatePartyGuestMustBeAccessibility.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[VQStringType.CreatePartyGuestRemovedAccessibility.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[VQStringType.CreatePartyGuestUncheckedAccessibility.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[VQStringType.CreatePartyHeader.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[VQStringType.CreatePartyHeaderWithDeepLink.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[VQStringType.CreatePartyImportantAccessibility.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[VQStringType.CreatePartyInstructionalDetail.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[VQStringType.CreatePartyJoinLoading.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[VQStringType.CreatePartyLinkTicketCta.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[VQStringType.CreatePartyLoading.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[VQStringType.CreatePartyMainCta.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[VQStringType.CreatePartyMaxPartySizeExceededMessage.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[VQStringType.CreatePartyNotEligibleHeader.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[VQStringType.CreatePartyNotInPartyHeader.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[VQStringType.CreatePartySelectAll.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[VQStringType.CreatePartyTicketAlternateNameAccessibility.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[VQStringType.CreatePartyTotalGuestsHeader.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[VQStringType.CreatePartyWarningDetail.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[VQStringType.CreatePartyYourPartyHeader.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[VQStringType.CreatePartyYourPartyHeaderAccessibility.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[VQStringType.CreatePartyYourPartySizeHeader.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[VQStringType.CreatePartyIncreaseGuest.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[VQStringType.CreatePartyDecreaseGuest.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[VQStringType.AlternateNotInPartyHeader.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[VQStringType.PassFor.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[VQStringType.TicketFor.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[VQStringType.ConfirmationHeader.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[VQStringType.ConfirmationLoading.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[VQStringType.ConfirmationMainCta.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[VQStringType.ConfirmationFooterBullet1.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[VQStringType.ConfirmationFooterBullet2.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[VQStringType.ConfirmationFooterTitle.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[VQStringType.ConfirmationReturnTimeAllDay.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[VQStringType.ConfirmationReturnTimeWithinHours.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[VQStringType.ConfirmationReturnTimeWithinNextHour.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[VQStringType.ConfirmationReturnTimeWithinMinutes.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[VQStringType.DashboardCtaAnalyticsActionName.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[VQStringType.DashboardDetails.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[VQStringType.DashboardPrimaryCtaAnalyticsActionName.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[VQStringType.DashboardPrimaryCtaTitle.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[VQStringType.DashboardSecondaryCtaAnalyticsActionName.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[VQStringType.DashboardSecondaryCtaTitle.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[VQStringType.DashboardTitle.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[VQStringType.DetailHeader.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[VQStringType.DetailFooterTitle.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[VQStringType.DetailFooterBullet1.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[VQStringType.DetailFooterBullet2.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[VQStringType.DetailReturnTimeAllDay.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[VQStringType.DetailReturnTimeWithinHours.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[VQStringType.DetailReturnTimeWithinNextHour.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[VQStringType.DetailReturnTimeWithinMinutes.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[VQStringType.ErrorBannersGenericErrorMessage.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[VQStringType.ErrorBannersGenericErrorTitle.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[VQStringType.ErrorBannersJoinErrorMessage.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[VQStringType.ErrorBannersJoinErrorTitle.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[VQStringType.ErrorBannersLandClosedMessage.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[VQStringType.ErrorBannersLandClosedTitle.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[VQStringType.ErrorBannersRetryErrorMessage.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[VQStringType.ErrorBannersRetryErrorTitle.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[VQStringType.ErrorBannersMaxPartyExceededMessage.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[VQStringType.ErrorBannersMaxPartyExceededTitle.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[VQStringType.ErrorBannerNetworkOffline.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[VQStringType.HowToVisitDisclaimer.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[VQStringType.HowToVisitHeader.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[VQStringType.HowToVisitTitle.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[VQStringType.HowToVisitBullet1.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[VQStringType.HowToVisitBullet2.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[VQStringType.HowToVisitBullet3.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[VQStringType.HowToVisitMainCta.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[VQStringType.LeaveQueueAnonymousCancelPartyCta.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[VQStringType.LeaveQueueAnonymousConfirmationCancel.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[VQStringType.LeaveQueueAnonymousConfirmationDetail.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[VQStringType.LeaveQueueAnonymousConfirmationRemove.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[VQStringType.LeaveQueueAnonymousConfirmationTitle.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[VQStringType.LeaveQueueAnonymousPartySize.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[VQStringType.LeaveQueueAnonymousUpdatePartyHeader.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[VQStringType.LeaveQueueAnonymousUpdatePartyDetail.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[VQStringType.LeaveQueueAnonymousUpdatePartyCta.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[VQStringType.LeaveQueueConfirmationCancel.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[VQStringType.LeaveQueueConfirmationDetail.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[VQStringType.LeaveQueueConfirmationRemove.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[VQStringType.LeaveQueueConfirmationTitle.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[VQStringType.LeaveQueueConfirmationTitlePlural.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[VQStringType.LeaveQueueDetail.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[VQStringType.LeaveQueueHeader.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[VQStringType.LeaveQueueKeepGuestsHeader.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[VQStringType.LeaveQueueLoading.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[VQStringType.LeaveQueueMainCta.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[VQStringType.LeaveQueueRemoveGuestsHeader.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[VQStringType.MyLinesBluetoothCta.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[VQStringType.MyLinesBluetoothDetail.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[VQStringType.MyLinesEmptyCta.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[VQStringType.MyLinesEmptyDetail.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[VQStringType.MyLinesErrorGeneralDetail.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[VQStringType.MyLinesErrorGeneralTitle.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[VQStringType.MyLinesErrorQueueClosed.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[VQStringType.MyLinesErrorQueuePaused.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[VQStringType.MyLinesHeader.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[VQStringType.MyLinesJoinAccessibility.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[VQStringType.MyLinesLastUpdatedDateFormat.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[VQStringType.MyLinesLoading.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[VQStringType.MyLinesLoadingAccessibility.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[VQStringType.MyLinesLoadingLastUpdated.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[VQStringType.MyLinesLocationCta.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[VQStringType.MyLinesLocationDetail.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr[VQStringType.MyLinesNoQueuesDetail.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr[VQStringType.MyLinesNotificationCta.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr[VQStringType.MyLinesNotificationDetail.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr[VQStringType.NsfAllSetTitle.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr[VQStringType.NsfAllSetTitleAccessibility.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr[VQStringType.NsfFullName.ordinal()] = 131;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr[VQStringType.NsfHeader.ordinal()] = 132;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr[VQStringType.NsfLoading.ordinal()] = 133;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr[VQStringType.NsfMainCta.ordinal()] = 134;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr[VQStringType.NsfReadyDescription.ordinal()] = 135;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr[VQStringType.NsfReadyHeader.ordinal()] = 136;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr[VQStringType.NsfRemoveCta.ordinal()] = 137;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr[VQStringType.NsfRemoveCtaAccessibility.ordinal()] = 138;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr[VQStringType.NonAttractionHeight.ordinal()] = 139;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr[VQStringType.NonAttractionInfoLinkText.ordinal()] = 140;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr[VQStringType.NonAttractionInfoLinkUrl.ordinal()] = 141;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr[VQStringType.NonAttractionLocatedAt.ordinal()] = 142;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr[VQStringType.NonAttractionPark.ordinal()] = 143;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr[VQStringType.NonAttractionSubpark.ordinal()] = 144;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr[VQStringType.PositionAdmittingGroup.ordinal()] = 145;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr[VQStringType.PositionAdmittingGroupBlank.ordinal()] = 146;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr[VQStringType.PositionAdmittingGroupRange.ordinal()] = 147;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr[VQStringType.PositionAdmittingGroups.ordinal()] = 148;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr[VQStringType.PositionAdmittingGroupSingle.ordinal()] = 149;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr[VQStringType.PositionAnonymousNumberOfGuests.ordinal()] = 150;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr[VQStringType.PositionBackupGroup.ordinal()] = 151;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr[VQStringType.PositionBackupGroupStatus.ordinal()] = 152;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr[VQStringType.PositionDescriptionAccessibility.ordinal()] = 153;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr[VQStringType.PositionDirectionsCta.ordinal()] = 154;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr[VQStringType.PositionDowntimeAlert.ordinal()] = 155;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr[VQStringType.PositionDowntimeBoarding.ordinal()] = 156;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr[VQStringType.PositionEntryCodeCta.ordinal()] = 157;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr[VQStringType.PositionEstimatedWaitRange.ordinal()] = 158;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr[VQStringType.PositionEstimatedWaitSingle.ordinal()] = 159;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr[VQStringType.PositionExperienceAccessibility.ordinal()] = 160;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr[VQStringType.PositionExperienceWithParkAccessibility.ordinal()] = 161;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr[VQStringType.PositionExpired.ordinal()] = 162;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr[VQStringType.PositionFullName.ordinal()] = 163;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr[VQStringType.PositionGroup.ordinal()] = 164;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr[VQStringType.PositionGuestAccessibility.ordinal()] = 165;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr[VQStringType.PositionLoading.ordinal()] = 166;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr[VQStringType.InfoLinkText.ordinal()] = 167;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr[VQStringType.InfoLinkUrl.ordinal()] = 168;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr[VQStringType.PnoMessage.ordinal()] = 169;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr[VQStringType.PositionLoadingFailed.ordinal()] = 170;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr[VQStringType.PositionPartyHeader.ordinal()] = 171;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr[VQStringType.PositionPartyHeaderCloseAccessibility.ordinal()] = 172;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr[VQStringType.PositionPartyHeaderOpenAccessibility.ordinal()] = 173;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr[VQStringType.PositionRedeemCta.ordinal()] = 174;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr[VQStringType.PositionReleasedGroupStatus.ordinal()] = 175;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr[VQStringType.PositionRemoveGuests.ordinal()] = 176;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr[VQStringType.PositionReturnAnytime.ordinal()] = 177;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr[VQStringType.PositionReturnBy.ordinal()] = 178;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr[VQStringType.ProgressLoading.ordinal()] = 179;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr[VQStringType.RedeemAnonymousPartyName.ordinal()] = 180;
            } catch (NoSuchFieldError unused180) {
            }
            try {
                iArr[VQStringType.RedeemAnonymousPartySize.ordinal()] = 181;
            } catch (NoSuchFieldError unused181) {
            }
            try {
                iArr[VQStringType.RedeemFullName.ordinal()] = 182;
            } catch (NoSuchFieldError unused182) {
            }
            try {
                iArr[VQStringType.RedeemGroup.ordinal()] = 183;
            } catch (NoSuchFieldError unused183) {
            }
            try {
                iArr[VQStringType.RedeemGroupAllDay.ordinal()] = 184;
            } catch (NoSuchFieldError unused184) {
            }
            try {
                iArr[VQStringType.RedeemHeaderAccessibility.ordinal()] = 185;
            } catch (NoSuchFieldError unused185) {
            }
            try {
                iArr[VQStringType.RedeemLoading.ordinal()] = 186;
            } catch (NoSuchFieldError unused186) {
            }
            try {
                iArr[VQStringType.RedeemLoadingErrorDetail.ordinal()] = 187;
            } catch (NoSuchFieldError unused187) {
            }
            try {
                iArr[VQStringType.RedeemLoadingErrorTitle.ordinal()] = 188;
            } catch (NoSuchFieldError unused188) {
            }
            try {
                iArr[VQStringType.RedeemMainCta.ordinal()] = 189;
            } catch (NoSuchFieldError unused189) {
            }
            try {
                iArr[VQStringType.RedeemOverviewAccessibility.ordinal()] = 190;
            } catch (NoSuchFieldError unused190) {
            }
            try {
                iArr[VQStringType.RedeemReturnAnytime.ordinal()] = 191;
            } catch (NoSuchFieldError unused191) {
            }
            try {
                iArr[VQStringType.RedeemReturnBy.ordinal()] = 192;
            } catch (NoSuchFieldError unused192) {
            }
            try {
                iArr[VQStringType.RedeemTicketIndicator.ordinal()] = 193;
            } catch (NoSuchFieldError unused193) {
            }
            try {
                iArr[VQStringType.ReviewDetailsAlternateCta.ordinal()] = 194;
            } catch (NoSuchFieldError unused194) {
            }
            try {
                iArr[VQStringType.ReviewDetailsChangePartyCta.ordinal()] = 195;
            } catch (NoSuchFieldError unused195) {
            }
            try {
                iArr[VQStringType.ReviewDetailsHeader.ordinal()] = 196;
            } catch (NoSuchFieldError unused196) {
            }
            try {
                iArr[VQStringType.ReviewDetailsHowToEnterTitle.ordinal()] = 197;
            } catch (NoSuchFieldError unused197) {
            }
            try {
                iArr[VQStringType.ReviewDetailsImportantAccessibility.ordinal()] = 198;
            } catch (NoSuchFieldError unused198) {
            }
            try {
                iArr[VQStringType.ReviewDetailsIneligibleGuestsHeader.ordinal()] = 199;
            } catch (NoSuchFieldError unused199) {
            }
            try {
                iArr[VQStringType.ReviewDetailsIneligibleGuestsWarningText.ordinal()] = 200;
            } catch (NoSuchFieldError unused200) {
            }
            try {
                iArr[VQStringType.ReviewDetailsJoinLoading.ordinal()] = 201;
            } catch (NoSuchFieldError unused201) {
            }
            try {
                iArr[VQStringType.ReviewDetailsLaunching.ordinal()] = 202;
            } catch (NoSuchFieldError unused202) {
            }
            try {
                iArr[VQStringType.ReviewDetailsLoading.ordinal()] = 203;
            } catch (NoSuchFieldError unused203) {
            }
            try {
                iArr[VQStringType.ReviewDetailsMainCta.ordinal()] = 204;
            } catch (NoSuchFieldError unused204) {
            }
            try {
                iArr[VQStringType.ReviewDetailsMaxPartySizeExceeded.ordinal()] = 205;
            } catch (NoSuchFieldError unused205) {
            }
            try {
                iArr[VQStringType.ReviewDetailsNoEligibleGuestsWarning.ordinal()] = 206;
            } catch (NoSuchFieldError unused206) {
            }
            try {
                iArr[VQStringType.ReviewDetailsNoLinkedTickets.ordinal()] = 207;
            } catch (NoSuchFieldError unused207) {
            }
            try {
                iArr[VQStringType.ReviewDetailsRefreshMessage.ordinal()] = 208;
            } catch (NoSuchFieldError unused208) {
            }
            try {
                iArr[VQStringType.ReviewDetailsSelectGuestsWarningText.ordinal()] = 209;
            } catch (NoSuchFieldError unused209) {
            }
            try {
                iArr[VQStringType.ReviewDetailsUpdated.ordinal()] = 210;
            } catch (NoSuchFieldError unused210) {
            }
            try {
                iArr[VQStringType.ReviewDetailsUpdateScreenWarningMessage.ordinal()] = 211;
            } catch (NoSuchFieldError unused211) {
            }
            try {
                iArr[VQStringType.ReviewDetailsUpdateScreenWarningMessageDefault.ordinal()] = 212;
            } catch (NoSuchFieldError unused212) {
            }
            try {
                iArr[VQStringType.ReviewDetailsUpdateScreenWarningTitle.ordinal()] = 213;
            } catch (NoSuchFieldError unused213) {
            }
            try {
                iArr[VQStringType.ReviewDetailsVQHeaderTitle.ordinal()] = 214;
            } catch (NoSuchFieldError unused214) {
            }
            try {
                iArr[VQStringType.ReviewDetailsValidOn.ordinal()] = 215;
            } catch (NoSuchFieldError unused215) {
            }
            try {
                iArr[VQStringType.ReviewDetailsYourPartyHeader.ordinal()] = 216;
            } catch (NoSuchFieldError unused216) {
            }
            try {
                iArr[VQStringType.ReviewDetailsYourPartyHeaderAccessibility.ordinal()] = 217;
            } catch (NoSuchFieldError unused217) {
            }
            try {
                iArr[VQStringType.ReviewDetailsYourPartySizeHeader.ordinal()] = 218;
            } catch (NoSuchFieldError unused218) {
            }
            try {
                iArr[VQStringType.ReviewDetailsQueueUnAvailableMessage.ordinal()] = 219;
            } catch (NoSuchFieldError unused219) {
            }
            try {
                iArr[VQStringType.SelectQueueAdmittingGroup.ordinal()] = 220;
            } catch (NoSuchFieldError unused220) {
            }
            try {
                iArr[VQStringType.SelectQueueAdmittingGroupBlank.ordinal()] = 221;
            } catch (NoSuchFieldError unused221) {
            }
            try {
                iArr[VQStringType.SelectQueueAdmittingGroupRange.ordinal()] = 222;
            } catch (NoSuchFieldError unused222) {
            }
            try {
                iArr[VQStringType.SelectQueueAdmittingGroups.ordinal()] = 223;
            } catch (NoSuchFieldError unused223) {
            }
            try {
                iArr[VQStringType.SelectQueueAdmittingGroupSingle.ordinal()] = 224;
            } catch (NoSuchFieldError unused224) {
            }
            try {
                iArr[VQStringType.SelectQueueDowntimeBoarding.ordinal()] = 225;
            } catch (NoSuchFieldError unused225) {
            }
            try {
                iArr[VQStringType.SelectQueueEnableLocationCta.ordinal()] = 226;
            } catch (NoSuchFieldError unused226) {
            }
            try {
                iArr[VQStringType.SelectQueueEnableLocationDetail.ordinal()] = 227;
            } catch (NoSuchFieldError unused227) {
            }
            try {
                iArr[VQStringType.SelectQueueGuestMustBeAccessibility.ordinal()] = 228;
            } catch (NoSuchFieldError unused228) {
            }
            try {
                iArr[VQStringType.SelectQueueHeightRestrictions.ordinal()] = 229;
            } catch (NoSuchFieldError unused229) {
            }
            try {
                iArr[VQStringType.SelectQueueHowToEnterDetail.ordinal()] = 230;
            } catch (NoSuchFieldError unused230) {
            }
            try {
                iArr[VQStringType.SelectQueueHowToEnterTitle.ordinal()] = 231;
            } catch (NoSuchFieldError unused231) {
            }
            try {
                iArr[VQStringType.SelectQueueImportantAccessibility.ordinal()] = 232;
            } catch (NoSuchFieldError unused232) {
            }
            try {
                iArr[VQStringType.SelectQueueInchesAccessibility.ordinal()] = 233;
            } catch (NoSuchFieldError unused233) {
            }
            try {
                iArr[VQStringType.SelectQueueInchesToReplaceAccessibility.ordinal()] = 234;
            } catch (NoSuchFieldError unused234) {
            }
            try {
                iArr[VQStringType.SelectQueueJoinCta.ordinal()] = 235;
            } catch (NoSuchFieldError unused235) {
            }
            try {
                iArr[VQStringType.SelectQueueLoading.ordinal()] = 236;
            } catch (NoSuchFieldError unused236) {
            }
            try {
                iArr[VQStringType.SelectQueueMyStatusCta.ordinal()] = 237;
            } catch (NoSuchFieldError unused237) {
            }
            try {
                iArr[VQStringType.SelectQueueNextAlert.ordinal()] = 238;
            } catch (NoSuchFieldError unused238) {
            }
            try {
                iArr[VQStringType.SelectQueueNextAlertOpensAt.ordinal()] = 239;
            } catch (NoSuchFieldError unused239) {
            }
            try {
                iArr[VQStringType.SelectQueueNextQueueOpens.ordinal()] = 240;
            } catch (NoSuchFieldError unused240) {
            }
            try {
                iArr[VQStringType.SelectQueueNoLocationDetail.ordinal()] = 241;
            } catch (NoSuchFieldError unused241) {
            }
            try {
                iArr[VQStringType.SelectQueueNoQueuesDetail.ordinal()] = 242;
            } catch (NoSuchFieldError unused242) {
            }
            try {
                iArr[VQStringType.SelectQueueNoQueuesTitle.ordinal()] = 243;
            } catch (NoSuchFieldError unused243) {
            }
            try {
                iArr[VQStringType.SelectQueueNotInRegionDetail.ordinal()] = 244;
            } catch (NoSuchFieldError unused244) {
            }
            try {
                iArr[VQStringType.SelectQueueParkTabAccessibilityAndroid.ordinal()] = 245;
            } catch (NoSuchFieldError unused245) {
            }
            try {
                iArr[VQStringType.SelectQueueParkTabSelectedAccessibilityAndroid.ordinal()] = 246;
            } catch (NoSuchFieldError unused246) {
            }
            try {
                iArr[VQStringType.SelectQueuePartyCreationCta.ordinal()] = 247;
            } catch (NoSuchFieldError unused247) {
            }
            try {
                iArr[VQStringType.SelectQueueProjectedWait.ordinal()] = 248;
            } catch (NoSuchFieldError unused248) {
            }
            try {
                iArr[VQStringType.SelectQueueProjectedWaitRange.ordinal()] = 249;
            } catch (NoSuchFieldError unused249) {
            }
            try {
                iArr[VQStringType.SelectQueueProjectedWaitSingle.ordinal()] = 250;
            } catch (NoSuchFieldError unused250) {
            }
            try {
                iArr[VQStringType.SelectQueueQueueUnavailableMessage.ordinal()] = 251;
            } catch (NoSuchFieldError unused251) {
            }
            try {
                iArr[VQStringType.SelectQueueClosedForTheDay.ordinal()] = 252;
            } catch (NoSuchFieldError unused252) {
            }
            try {
                iArr[VQStringType.SelectQueueTitle.ordinal()] = 253;
            } catch (NoSuchFieldError unused253) {
            }
            try {
                iArr[VQStringType.QueueNonOperationalMessage.ordinal()] = 254;
            } catch (NoSuchFieldError unused254) {
            }
            try {
                iArr[VQStringType.HubBgEndColor.ordinal()] = 255;
            } catch (NoSuchFieldError unused255) {
            }
            try {
                iArr[VQStringType.HubBgStartColor.ordinal()] = 256;
            } catch (NoSuchFieldError unused256) {
            }
            try {
                iArr[VQStringType.HubDescription.ordinal()] = 257;
            } catch (NoSuchFieldError unused257) {
            }
            try {
                iArr[VQStringType.HubHeaderColor.ordinal()] = 258;
            } catch (NoSuchFieldError unused258) {
            }
            try {
                iArr[VQStringType.HubMainCta.ordinal()] = 259;
            } catch (NoSuchFieldError unused259) {
            }
            try {
                iArr[VQStringType.HubNoQueuesDetail.ordinal()] = 260;
            } catch (NoSuchFieldError unused260) {
            }
            try {
                iArr[VQStringType.HubLocatedAt.ordinal()] = 261;
            } catch (NoSuchFieldError unused261) {
            }
            try {
                iArr[VQStringType.HubSubPark.ordinal()] = 262;
            } catch (NoSuchFieldError unused262) {
            }
            try {
                iArr[VQStringType.HubThumbIcon.ordinal()] = 263;
            } catch (NoSuchFieldError unused263) {
            }
            try {
                iArr[VQStringType.HubThumbUrl.ordinal()] = 264;
            } catch (NoSuchFieldError unused264) {
            }
            try {
                iArr[VQStringType.HubBackButtonAccessibility.ordinal()] = 265;
            } catch (NoSuchFieldError unused265) {
            }
            try {
                iArr[VQStringType.TipboardGroupingName.ordinal()] = 266;
            } catch (NoSuchFieldError unused266) {
            }
            try {
                iArr[VQStringType.TipboardGroupingLinkHub.ordinal()] = 267;
            } catch (NoSuchFieldError unused267) {
            }
            try {
                iArr[VQStringType.TipboardGroupingLinkSingle.ordinal()] = 268;
            } catch (NoSuchFieldError unused268) {
            }
            try {
                iArr[VQStringType.TipboardGroupingLinkMultiple.ordinal()] = 269;
            } catch (NoSuchFieldError unused269) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VQUrlType.values().length];
            try {
                iArr2[VQUrlType.CommonApiBaseUrl.ordinal()] = 1;
            } catch (NoSuchFieldError unused270) {
            }
            try {
                iArr2[VQUrlType.CommonBaseAssetPath.ordinal()] = 2;
            } catch (NoSuchFieldError unused271) {
            }
            try {
                iArr2[VQUrlType.CommonLoadingAnimUrl.ordinal()] = 3;
            } catch (NoSuchFieldError unused272) {
            }
            try {
                iArr2[VQUrlType.DashboardCtaDeeplinkUrl.ordinal()] = 4;
            } catch (NoSuchFieldError unused273) {
            }
            try {
                iArr2[VQUrlType.DashboardPrimaryCtaDeeplinkUrl.ordinal()] = 5;
            } catch (NoSuchFieldError unused274) {
            }
            try {
                iArr2[VQUrlType.DashboardSecondaryCtaDeeplinkUrl.ordinal()] = 6;
            } catch (NoSuchFieldError unused275) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VQSpecialAnimUrlType.values().length];
            try {
                iArr3[VQSpecialAnimUrlType.HumorAnimUrls.ordinal()] = 1;
            } catch (NoSuchFieldError unused276) {
            }
            try {
                iArr3[VQSpecialAnimUrlType.IdleAnimUrls.ordinal()] = 2;
            } catch (NoSuchFieldError unused277) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[VQImageUrlType.values().length];
            try {
                iArr4[VQImageUrlType.DashboardBannerImageUrl.ordinal()] = 1;
            } catch (NoSuchFieldError unused278) {
            }
            try {
                iArr4[VQImageUrlType.HowToVisitImageUrl.ordinal()] = 2;
            } catch (NoSuchFieldError unused279) {
            }
            try {
                iArr4[VQImageUrlType.RedeemHeaderImageUrl.ordinal()] = 3;
            } catch (NoSuchFieldError unused280) {
            }
            try {
                iArr4[VQImageUrlType.RedeemImageUrl.ordinal()] = 4;
            } catch (NoSuchFieldError unused281) {
            }
            try {
                iArr4[VQImageUrlType.SelectQueueThumbUrl.ordinal()] = 5;
            } catch (NoSuchFieldError unused282) {
            }
            try {
                iArr4[VQImageUrlType.HubThumbUrlData.ordinal()] = 6;
            } catch (NoSuchFieldError unused283) {
            }
            try {
                iArr4[VQImageUrlType.HubBackgroundImageUrlData.ordinal()] = 7;
            } catch (NoSuchFieldError unused284) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[VQIconType.values().length];
            try {
                iArr5[VQIconType.CommonMinusIcon.ordinal()] = 1;
            } catch (NoSuchFieldError unused285) {
            }
            try {
                iArr5[VQIconType.CommonPlusIcon.ordinal()] = 2;
            } catch (NoSuchFieldError unused286) {
            }
            try {
                iArr5[VQIconType.CommonRefreshIcon.ordinal()] = 3;
            } catch (NoSuchFieldError unused287) {
            }
            try {
                iArr5[VQIconType.CommonVQIcon.ordinal()] = 4;
            } catch (NoSuchFieldError unused288) {
            }
            try {
                iArr5[VQIconType.CommonWarningIcon.ordinal()] = 5;
            } catch (NoSuchFieldError unused289) {
            }
            try {
                iArr5[VQIconType.CommonChevronIcon.ordinal()] = 6;
            } catch (NoSuchFieldError unused290) {
            }
            try {
                iArr5[VQIconType.ConfirmationFooterBullet1Icon.ordinal()] = 7;
            } catch (NoSuchFieldError unused291) {
            }
            try {
                iArr5[VQIconType.ConfirmationFooterBullet2Icon.ordinal()] = 8;
            } catch (NoSuchFieldError unused292) {
            }
            try {
                iArr5[VQIconType.CreatePartyGuestPassIcon.ordinal()] = 9;
            } catch (NoSuchFieldError unused293) {
            }
            try {
                iArr5[VQIconType.CreatePartyMaxPartyIcon.ordinal()] = 10;
            } catch (NoSuchFieldError unused294) {
            }
            try {
                iArr5[VQIconType.CreatePartyParkingIcon.ordinal()] = 11;
            } catch (NoSuchFieldError unused295) {
            }
            try {
                iArr5[VQIconType.CreatePartyPassIcon.ordinal()] = 12;
            } catch (NoSuchFieldError unused296) {
            }
            try {
                iArr5[VQIconType.CreatePartySpecialEventIcon.ordinal()] = 13;
            } catch (NoSuchFieldError unused297) {
            }
            try {
                iArr5[VQIconType.CreatePartyTicketIcon.ordinal()] = 14;
            } catch (NoSuchFieldError unused298) {
            }
            try {
                iArr5[VQIconType.DetailFooterBullet1Icon.ordinal()] = 15;
            } catch (NoSuchFieldError unused299) {
            }
            try {
                iArr5[VQIconType.DetailFooterBullet2Icon.ordinal()] = 16;
            } catch (NoSuchFieldError unused300) {
            }
            try {
                iArr5[VQIconType.HowToVisitBullet1Icon.ordinal()] = 17;
            } catch (NoSuchFieldError unused301) {
            }
            try {
                iArr5[VQIconType.HowToVisitBullet2Icon.ordinal()] = 18;
            } catch (NoSuchFieldError unused302) {
            }
            try {
                iArr5[VQIconType.HowToVisitBullet3Icon.ordinal()] = 19;
            } catch (NoSuchFieldError unused303) {
            }
            try {
                iArr5[VQIconType.HowToVisitPlaceholderIcon.ordinal()] = 20;
            } catch (NoSuchFieldError unused304) {
            }
            try {
                iArr5[VQIconType.MyLinesBluetoothIcon.ordinal()] = 21;
            } catch (NoSuchFieldError unused305) {
            }
            try {
                iArr5[VQIconType.MyLinesHeaderAddIcon.ordinal()] = 22;
            } catch (NoSuchFieldError unused306) {
            }
            try {
                iArr5[VQIconType.MyLinesLocationIcon.ordinal()] = 23;
            } catch (NoSuchFieldError unused307) {
            }
            try {
                iArr5[VQIconType.MyLinesNotificationIcon.ordinal()] = 24;
            } catch (NoSuchFieldError unused308) {
            }
            try {
                iArr5[VQIconType.PositionBackupGroupIcon.ordinal()] = 25;
            } catch (NoSuchFieldError unused309) {
            }
            try {
                iArr5[VQIconType.PositionImagePlaceholderIcon.ordinal()] = 26;
            } catch (NoSuchFieldError unused310) {
            }
            try {
                iArr5[VQIconType.PositionReleasedGroupIcon.ordinal()] = 27;
            } catch (NoSuchFieldError unused311) {
            }
            try {
                iArr5[VQIconType.ReviewDetailsIneligibleGuestsIcon.ordinal()] = 28;
            } catch (NoSuchFieldError unused312) {
            }
            try {
                iArr5[VQIconType.ReviewDetailsSelectGuestsIcon.ordinal()] = 29;
            } catch (NoSuchFieldError unused313) {
            }
            try {
                iArr5[VQIconType.SelectQueueEnableLocationIcon.ordinal()] = 30;
            } catch (NoSuchFieldError unused314) {
            }
            try {
                iArr5[VQIconType.SelectQueueNotInRegionIcon.ordinal()] = 31;
            } catch (NoSuchFieldError unused315) {
            }
            try {
                iArr5[VQIconType.SelectQueueNoQueuesIcon.ordinal()] = 32;
            } catch (NoSuchFieldError unused316) {
            }
            try {
                iArr5[VQIconType.SelectQueueThumbIcon.ordinal()] = 33;
            } catch (NoSuchFieldError unused317) {
            }
            try {
                iArr5[VQIconType.SelectQueueUnavailableIcon.ordinal()] = 34;
            } catch (NoSuchFieldError unused318) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[VQColorType.values().length];
            try {
                iArr6[VQColorType.RedeemBgEndColor.ordinal()] = 1;
            } catch (NoSuchFieldError unused319) {
            }
            try {
                iArr6[VQColorType.RedeemBgStartColor.ordinal()] = 2;
            } catch (NoSuchFieldError unused320) {
            }
            try {
                iArr6[VQColorType.RedeemBgTextColor.ordinal()] = 3;
            } catch (NoSuchFieldError unused321) {
            }
            try {
                iArr6[VQColorType.RedeemPlaceholderBgColor.ordinal()] = 4;
            } catch (NoSuchFieldError unused322) {
            }
            try {
                iArr6[VQColorType.RedeemPlaceholderIconColor.ordinal()] = 5;
            } catch (NoSuchFieldError unused323) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    @Inject
    public VirtualQueueThemer(C9314j parkAppConfiguration, VirtualQueueRepository virtualQueueRepository, InterfaceC9400d cbEnvironment, Context context) {
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(virtualQueueRepository, "virtualQueueRepository");
        Intrinsics.checkNotNullParameter(cbEnvironment, "cbEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        this.parkAppConfiguration = parkAppConfiguration;
        this.virtualQueueRepository = virtualQueueRepository;
        this.cbEnvironment = cbEnvironment;
        this.context = context;
        this.queueDocuments = new LinkedHashMap();
        this.density = getDensity(context.getResources().getDisplayMetrics().density);
        this.defaultDetail = "";
    }

    public static /* synthetic */ int getColor$default(VirtualQueueThemer virtualQueueThemer, VQColorType vQColorType, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return virtualQueueThemer.getColor(vQColorType, str);
    }

    public static /* synthetic */ ConflictData getConflictData$default(VirtualQueueThemer virtualQueueThemer, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        return virtualQueueThemer.getConflictData(str, str2);
    }

    public static /* synthetic */ String getDetailForConflict$default(VirtualQueueThemer virtualQueueThemer, String str, Queue queue, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return virtualQueueThemer.getDetailForConflict(str, queue, str2, z10);
    }

    public static /* synthetic */ String getImageUrl$default(VirtualQueueThemer virtualQueueThemer, VQImageUrlType vQImageUrlType, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return virtualQueueThemer.getImageUrl(vQImageUrlType, str);
    }

    public static /* synthetic */ Spanned getPeptasiaIcon$default(VirtualQueueThemer virtualQueueThemer, VQIconType vQIconType, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return virtualQueueThemer.getPeptasiaIcon(vQIconType, str);
    }

    public static /* synthetic */ String getPositionStaticImage$default(VirtualQueueThemer virtualQueueThemer, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return virtualQueueThemer.getPositionStaticImage(str);
    }

    public static /* synthetic */ ProgressData getProgressData$default(VirtualQueueThemer virtualQueueThemer, int i10, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        return virtualQueueThemer.getProgressData(i10, str);
    }

    private final VirtualQueueDocument getQueueDocument(String contentId) {
        if (StringsKt.isBlank(contentId)) {
            contentId = defaultQueueContentId();
        }
        if (!this.queueDocuments.containsKey(contentId) && !loadDocument(contentId)) {
            if (Intrinsics.areEqual(contentId, defaultQueueContentId())) {
                return null;
            }
            return getQueueDocument(defaultQueueContentId());
        }
        return this.queueDocuments.get(contentId);
    }

    public static /* synthetic */ List getSpecialAnimUrlList$default(VirtualQueueThemer virtualQueueThemer, VQSpecialAnimUrlType vQSpecialAnimUrlType, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return virtualQueueThemer.getSpecialAnimUrlList(vQSpecialAnimUrlType, str);
    }

    public static /* synthetic */ String getString$default(VirtualQueueThemer virtualQueueThemer, VQStringType vQStringType, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return virtualQueueThemer.getString(vQStringType, str, z10);
    }

    public static /* synthetic */ String getUrl$default(VirtualQueueThemer virtualQueueThemer, VQUrlType vQUrlType, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return virtualQueueThemer.getUrl(vQUrlType, str);
    }

    private final boolean loadDocument(String contentId) {
        VirtualQueueDocument queueInfo = this.virtualQueueRepository.getQueueInfo(contentId);
        if (queueInfo == null) {
            return false;
        }
        this.queueDocuments.put(contentId, queueInfo);
        return true;
    }

    public final String defaultQueueContentId() {
        String str;
        String syncGatewayDBSuffix = this.cbEnvironment.getSyncGatewayDBSuffix();
        Intrinsics.checkNotNullExpressionValue(syncGatewayDBSuffix, "cbEnvironment.syncGatewayDBSuffix");
        if (StringsKt.contains$default((CharSequence) syncGatewayDBSuffix, (CharSequence) "latest", false, 2, (Object) null)) {
            str = VirtualQueueConstants.DEFAULT_QUEUE_CONTENT_LATEST_SUFFIX;
        } else {
            String syncGatewayDBSuffix2 = this.cbEnvironment.getSyncGatewayDBSuffix();
            Intrinsics.checkNotNullExpressionValue(syncGatewayDBSuffix2, "cbEnvironment.syncGatewayDBSuffix");
            str = (!StringsKt.contains$default((CharSequence) syncGatewayDBSuffix2, (CharSequence) "stage", false, 2, (Object) null) && this.cbEnvironment.getSyncGatewayDBSuffix().equals("")) ? "" : VirtualQueueConstants.DEFAULT_QUEUE_CONTENT_STAGE_SUFFIX;
        }
        if (Intrinsics.areEqual(this.parkAppConfiguration.m38908h(), "DLR")) {
            return VirtualQueueConstants.DEFAULT_QUEUE_CONTENT_ID_DLR + str;
        }
        return VirtualQueueConstants.DEFAULT_QUEUE_CONTENT_ID_WDW + str;
    }

    public final String getActiveNetworkConnection() {
        return CommonExtensionsKt.getActiveNetworkConnection(this.context);
    }

    public final int getColor(VQColorType type, String contentId) {
        String bgEndColor;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        VirtualQueueDocument queueDocument = getQueueDocument(contentId);
        if (queueDocument != null) {
            int i10 = WhenMappings.$EnumSwitchMapping$5[type.ordinal()];
            if (i10 == 1) {
                bgEndColor = queueDocument.getRedeem().getBgEndColor();
            } else if (i10 == 2) {
                bgEndColor = queueDocument.getRedeem().getBgStartColor();
            } else if (i10 == 3) {
                bgEndColor = queueDocument.getRedeem().getBgTextColor();
            } else if (i10 == 4) {
                bgEndColor = queueDocument.getRedeem().getPlaceholderBgColor();
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                bgEndColor = queueDocument.getRedeem().getPlaceholderIconColor();
            }
        } else {
            bgEndColor = null;
        }
        if (bgEndColor == null) {
            if (!StringsKt.isBlank(contentId)) {
                return getColor(type, "");
            }
            bgEndColor = "white";
        }
        try {
            return Color.parseColor(bgEndColor);
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData getConflictData(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "conflictType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "contentId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.disney.wdpro.virtualqueue.couchbase.dto.VirtualQueueDocument r0 = r6.getQueueDocument(r8)
            if (r0 == 0) goto Lba
            com.disney.wdpro.virtualqueue.couchbase.dto.model.NsfData r1 = r0.getNsf()
            java.util.List r1 = r1.getConflicts()
            java.lang.String r2 = "UNKNOWN"
            r3 = 0
            if (r1 == 0) goto L40
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r1.next()
            r5 = r4
            com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData r5 = (com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData) r5
            java.lang.String r5 = r5.getType()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r7)
            if (r5 == 0) goto L23
            goto L3c
        L3b:
            r4 = r3
        L3c:
            com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData r4 = (com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData) r4
            if (r4 != 0) goto L6d
        L40:
            com.disney.wdpro.virtualqueue.couchbase.dto.model.NsfData r1 = r0.getNsf()
            java.util.List r1 = r1.getConflicts()
            if (r1 == 0) goto L6c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L50:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L68
            java.lang.Object r4 = r1.next()
            r5 = r4
            com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData r5 = (com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData) r5
            java.lang.String r5 = r5.getType()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
            if (r5 == 0) goto L50
            goto L69
        L68:
            r4 = r3
        L69:
            com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData r4 = (com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData) r4
            goto L6d
        L6c:
            r4 = r3
        L6d:
            com.disney.wdpro.virtualqueue.couchbase.dto.model.NsfData r0 = r0.getNsf()
            java.util.List r0 = r0.getConflicts()
            if (r0 == 0) goto L97
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L7d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r0.next()
            r5 = r1
            com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData r5 = (com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData) r5
            java.lang.String r5 = r5.getType()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
            if (r5 == 0) goto L7d
            r3 = r1
        L95:
            com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData r3 = (com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData) r3
        L97:
            java.lang.String r0 = ""
            if (r3 == 0) goto La1
            java.lang.String r1 = r3.getDetail()
            if (r1 != 0) goto La2
        La1:
            r1 = r0
        La2:
            r6.defaultDetail = r1
            if (r4 != 0) goto Lb6
            boolean r8 = kotlin.text.StringsKt.isBlank(r8)
            if (r8 != 0) goto Lb1
            com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData r4 = r6.getConflictData(r7, r0)
            goto Lb6
        Lb1:
            com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData r6 = new com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData
            r6.<init>()
        Lb6:
            if (r4 != 0) goto Lb9
            goto Lba
        Lb9:
            return r4
        Lba:
            com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData r6 = new com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer.getConflictData(java.lang.String, java.lang.String):com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData");
    }

    public final ImageUrlData.ImageDensity getDensity() {
        return this.density;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[PHI: r7
  0x0064: PHI (r7v6 java.lang.String) = (r7v2 java.lang.String), (r7v3 java.lang.String), (r7v4 java.lang.String), (r7v7 java.lang.String) binds: [B:38:0x008e, B:35:0x0087, B:31:0x007e, B:21:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getDetailForConflict(java.lang.String r7, com.disney.wdpro.virtualqueue.service.model.Queue r8, java.lang.String r9, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = "conflictType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "queue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "parkName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r1 = r8.getContentId()
            com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData r7 = r6.getConflictData(r7, r1)
            java.lang.String r1 = r7.getDetailWithTokens()
            java.lang.String r2 = ""
            if (r1 != 0) goto L20
            r1 = r2
        L20:
            java.lang.String r3 = r7.getDetailWithTokensInline()
            if (r3 != 0) goto L27
            r3 = r2
        L27:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.String r5 = r8.getName()
            boolean r5 = kotlin.text.StringsKt.isBlank(r5)
            if (r5 != 0) goto L3f
            java.lang.String r5 = "experienceName"
            java.lang.String r8 = r8.getName()
            r4.put(r5, r8)
        L3f:
            boolean r8 = kotlin.text.StringsKt.isBlank(r9)
            if (r8 != 0) goto L48
            r4.put(r0, r9)
        L48:
            if (r10 == 0) goto L67
            boolean r8 = kotlin.text.StringsKt.isBlank(r3)
            if (r8 != 0) goto L67
            com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer$Companion r8 = com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer.INSTANCE
            java.lang.String r9 = r8.replaceTokens(r3, r4)
            boolean r8 = r8.hasTokens(r9)
            if (r8 != 0) goto L5d
            goto L91
        L5d:
            java.lang.String r7 = r7.getDetailInline()
            if (r7 != 0) goto L64
            goto L65
        L64:
            r2 = r7
        L65:
            r9 = r2
            goto L91
        L67:
            boolean r8 = kotlin.text.StringsKt.isBlank(r1)
            if (r8 != 0) goto L81
            com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer$Companion r8 = com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer.INSTANCE
            java.lang.String r9 = r8.replaceTokens(r1, r4)
            boolean r8 = r8.hasTokens(r9)
            if (r8 != 0) goto L7a
            goto L91
        L7a:
            java.lang.String r7 = r7.getDetail()
            if (r7 != 0) goto L64
            goto L65
        L81:
            if (r10 == 0) goto L8a
            java.lang.String r7 = r7.getDetailInline()
            if (r7 != 0) goto L64
            goto L65
        L8a:
            java.lang.String r7 = r7.getDetail()
            if (r7 != 0) goto L64
            goto L65
        L91:
            int r7 = r9.length()
            if (r7 != 0) goto L9a
            java.lang.String r6 = r6.defaultDetail
            return r6
        L9a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer.getDetailForConflict(java.lang.String, com.disney.wdpro.virtualqueue.service.model.Queue, java.lang.String, boolean):java.lang.String");
    }

    public final List<FilterData> getFilterData() {
        List<FilterData> filters;
        VirtualQueueDocument queueDocument = getQueueDocument(defaultQueueContentId());
        return (queueDocument == null || (filters = queueDocument.getFilters()) == null) ? CollectionsKt.emptyList() : filters;
    }

    public final String getImageUrl(VQImageUrlType type, String contentId) {
        ImageUrlData bannerImageUrlData;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        VirtualQueueDocument queueDocument = getQueueDocument(contentId);
        if (queueDocument != null) {
            getUrl(VQUrlType.CommonBaseAssetPath, defaultQueueContentId());
            switch (WhenMappings.$EnumSwitchMapping$3[type.ordinal()]) {
                case 1:
                    bannerImageUrlData = queueDocument.getDashboard().getBannerImageUrlData();
                    break;
                case 2:
                    bannerImageUrlData = queueDocument.getHowToVisit().getBannerImageData();
                    break;
                case 3:
                    bannerImageUrlData = queueDocument.getRedeem().getHeaderImageUrlData();
                    break;
                case 4:
                    bannerImageUrlData = queueDocument.getRedeem().getImageUrlData();
                    break;
                case 5:
                    bannerImageUrlData = queueDocument.getSelectQueue().getThumbUrlData();
                    break;
                case 6:
                    bannerImageUrlData = queueDocument.getHub().getThumbUrlData();
                    break;
                case 7:
                    bannerImageUrlData = queueDocument.getHub().getBackgroundImageUrlData();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            bannerImageUrlData = null;
        }
        String strUrl = bannerImageUrlData != null ? bannerImageUrlData.url(this.density) : null;
        return strUrl == null ? !StringsKt.isBlank(contentId) ? getImageUrl$default(this, type, null, 2, null) : "" : strUrl;
    }

    public final Spanned getPeptasiaIcon(VQIconType type, String contentId) {
        String minusIcon;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        VirtualQueueDocument queueDocument = getQueueDocument(contentId);
        if (queueDocument != null) {
            switch (WhenMappings.$EnumSwitchMapping$4[type.ordinal()]) {
                case 1:
                    minusIcon = queueDocument.getCommon().getIcons().getMinusIcon();
                    break;
                case 2:
                    minusIcon = queueDocument.getCommon().getIcons().getPlusIcon();
                    break;
                case 3:
                    minusIcon = queueDocument.getCommon().getIcons().getRefreshIcon();
                    break;
                case 4:
                    minusIcon = queueDocument.getCommon().getIcons().getVqIcon();
                    break;
                case 5:
                    minusIcon = queueDocument.getCommon().getIcons().getWarningIcon();
                    break;
                case 6:
                    minusIcon = queueDocument.getCommon().getIcons().getChevronIcon();
                    break;
                case 7:
                    minusIcon = queueDocument.getConfirmation().getIcons().getFooterBullet1Icon();
                    break;
                case 8:
                    minusIcon = queueDocument.getConfirmation().getIcons().getFooterBullet2Icon();
                    break;
                case 9:
                    minusIcon = queueDocument.getCreateParty().getIcons().getGuestPassIcon();
                    break;
                case 10:
                    minusIcon = queueDocument.getCreateParty().getIcons().getMaxPartyIcon();
                    break;
                case 11:
                    minusIcon = queueDocument.getCreateParty().getIcons().getParkingIcon();
                    break;
                case 12:
                    minusIcon = queueDocument.getCreateParty().getIcons().getPassIcon();
                    break;
                case 13:
                    minusIcon = queueDocument.getCreateParty().getIcons().getSpecialEventIcon();
                    break;
                case 14:
                    minusIcon = queueDocument.getCreateParty().getIcons().getTicketIcon();
                    break;
                case 15:
                    minusIcon = queueDocument.getDetail().getIcons().getFooterBullet1Icon();
                    break;
                case 16:
                    minusIcon = queueDocument.getDetail().getIcons().getFooterBullet2Icon();
                    break;
                case 17:
                    minusIcon = queueDocument.getHowToVisit().getIcons().getBullet1Icon();
                    break;
                case 18:
                    minusIcon = queueDocument.getHowToVisit().getIcons().getBullet2Icon();
                    break;
                case 19:
                    minusIcon = queueDocument.getHowToVisit().getIcons().getBullet3Icon();
                    break;
                case 20:
                    minusIcon = queueDocument.getHowToVisit().getIcons().getImagePlaceholderIcon();
                    break;
                case 21:
                    minusIcon = queueDocument.getMyLines().getIcons().getBluetoothIcon();
                    break;
                case 22:
                    minusIcon = queueDocument.getMyLines().getIcons().getHeaderAddIcon();
                    break;
                case 23:
                    minusIcon = queueDocument.getMyLines().getIcons().getLocationIcon();
                    break;
                case 24:
                    minusIcon = queueDocument.getMyLines().getIcons().getNotificationIcon();
                    break;
                case 25:
                    minusIcon = queueDocument.getPosition().getIcons().getBackupGroupIcon();
                    break;
                case 26:
                    minusIcon = queueDocument.getPosition().getIcons().getImagePlaceholderIcon();
                    break;
                case 27:
                    minusIcon = queueDocument.getPosition().getIcons().getReleasedGroupIcon();
                    break;
                case 28:
                    minusIcon = queueDocument.getReviewDetails().getIcons().getIneligibleGuestsIcon();
                    break;
                case 29:
                    minusIcon = queueDocument.getReviewDetails().getIcons().getSelectGuestsIcon();
                    break;
                case 30:
                    minusIcon = queueDocument.getSelectQueue().getIcons().getEnableLocationIcon();
                    break;
                case 31:
                    minusIcon = queueDocument.getSelectQueue().getIcons().getNotInRegionIcon();
                    break;
                case 32:
                    minusIcon = queueDocument.getHowToVisit().getIcons().getImagePlaceholderIcon();
                    break;
                case 33:
                    minusIcon = queueDocument.getSelectQueue().getIcons().getThumbIcon();
                    break;
                case 34:
                    minusIcon = queueDocument.getSelectQueue().getIcons().getQueueUnavailableIcon();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            minusIcon = null;
        }
        if (minusIcon == null) {
            minusIcon = "";
            if (!StringsKt.isBlank(contentId)) {
                return getPeptasiaIcon(type, "");
            }
        }
        return C3321b.m17055b(minusIcon, 0, null, null);
    }

    public final String getPositionStaticImage(String contentId) {
        PositionData position;
        ImageUrlData staticImageUrlData;
        String imageUrl;
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        VirtualQueueDocument queueDocument = getQueueDocument(contentId);
        return (queueDocument == null || (position = queueDocument.getPosition()) == null || (staticImageUrlData = position.getStaticImageUrlData()) == null || (imageUrl = getImageUrl(staticImageUrlData)) == null) ? "" : imageUrl;
    }

    public final ProgressData getProgressData(int progressState, String contentId) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        VirtualQueueDocument queueDocument = getQueueDocument(contentId);
        if (queueDocument != null) {
            List<ProgressData> progress = queueDocument.getPosition().getProgress();
            ProgressData progressData = progress != null ? (ProgressData) CollectionsKt.getOrNull(progress, progressState) : null;
            if (progressData == null) {
                if (StringsKt.isBlank(contentId)) {
                    new ProgressData();
                } else {
                    progressData = getProgressData(progressState, "");
                }
            }
            if (progressData != null) {
                return progressData;
            }
        }
        return new ProgressData();
    }

    public final List<String> getSpecialAnimUrlList(VQSpecialAnimUrlType type, String contentId) {
        List<String> humorAnimUrls;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        VirtualQueueDocument queueDocument = getQueueDocument(contentId);
        if (queueDocument != null) {
            String url = getUrl(VQUrlType.CommonBaseAssetPath, defaultQueueContentId());
            int i10 = WhenMappings.$EnumSwitchMapping$2[type.ordinal()];
            if (i10 == 1) {
                humorAnimUrls = queueDocument.getPosition().getHumorAnimUrls();
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                humorAnimUrls = queueDocument.getPosition().getIdleAnimUrls();
            }
            if (humorAnimUrls != null) {
                List<String> list = humorAnimUrls;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(url + ((String) it.next()));
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final String getString(VQStringType type, String contentId, boolean shouldDecodeHtml) {
        String allGuestsAddedAccessibility;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        VirtualQueueDocument queueDocument = getQueueDocument(contentId);
        if (queueDocument != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getAllGuestsAddedAccessibility();
                    break;
                case 2:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getAllGuestsRemovedAccessibility();
                    break;
                case 3:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getCheckedAccessibility();
                    break;
                case 4:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getDimmedViewAccessibility();
                    break;
                case 5:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getGuestMovedAccessibility();
                    break;
                case 6:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getHeadingAccessibility();
                    break;
                case 7:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getPeekViewInstructionalText();
                    break;
                case 8:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getQrCodeAccessibility();
                    break;
                case 9:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getSelectAll();
                    break;
                case 10:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getPtrTitleAccessibility();
                    break;
                case 11:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getUncheckedAccessibilityAndroid();
                    break;
                case 12:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getVirtualQueueAccessibility();
                    break;
                case 13:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getDimmedCheckboxAccessibility();
                    break;
                case 14:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getIsMe();
                    break;
                case 15:
                    allGuestsAddedAccessibility = queueDocument.getCommon().getSelectAllCheckbox();
                    break;
                case 16:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getAlternateCta();
                    break;
                case 17:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getEmptyListDetail();
                    break;
                case 18:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getGuestAddedAccessibility();
                    break;
                case 19:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getGuestCheckedAccessibility();
                    break;
                case 20:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getGuestIneligibleAccessibility();
                    break;
                case 21:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getGuestMustBeAccessibility();
                    break;
                case 22:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getGuestRemovedAccessibility();
                    break;
                case 23:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getGuestUncheckedAccessibilityAndroid();
                    break;
                case 24:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getHeader();
                    break;
                case 25:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getHeaderWithDeepLink();
                    break;
                case 26:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getImportantAccessibility();
                    break;
                case 27:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getGuestCountInstructionalDetail();
                    break;
                case 28:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getJoinLoading();
                    break;
                case 29:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getLinkTicketCta();
                    break;
                case 30:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getLoading();
                    break;
                case 31:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getMainCta();
                    break;
                case 32:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getMaxPartySizeExceededMessage();
                    break;
                case 33:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getNotEligibleHeader();
                    break;
                case 34:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getNotInPartyHeader();
                    break;
                case 35:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getSelectAll();
                    break;
                case 36:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getTicketAlternateNameAccessibility();
                    break;
                case 37:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getTotalGuestsHeader();
                    break;
                case 38:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getGuestCountWarningDetail();
                    break;
                case 39:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getYourPartyHeader();
                    break;
                case 40:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getYourPartyHeaderAccessibility();
                    break;
                case 41:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getYourPartySizeHeader();
                    break;
                case 42:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getAnonymousIncreaseGuestsButtonAccessibility();
                    break;
                case 43:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getAnonymousDecreaseGuestsButtonAccessibility();
                    break;
                case 44:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getAlternateNotInPartyHeader();
                    break;
                case 45:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getPassFor();
                    break;
                case 46:
                    allGuestsAddedAccessibility = queueDocument.getCreateParty().getTicketFor();
                    break;
                case 47:
                    allGuestsAddedAccessibility = queueDocument.getConfirmation().getHeader();
                    break;
                case 48:
                    allGuestsAddedAccessibility = queueDocument.getConfirmation().getLoading();
                    break;
                case 49:
                    allGuestsAddedAccessibility = queueDocument.getConfirmation().getMainCta();
                    break;
                case 50:
                    allGuestsAddedAccessibility = queueDocument.getConfirmation().getFooterBullet1();
                    break;
                case 51:
                    allGuestsAddedAccessibility = queueDocument.getConfirmation().getFooterBullet2();
                    break;
                case 52:
                    allGuestsAddedAccessibility = queueDocument.getConfirmation().getFooterTitle();
                    break;
                case 53:
                    allGuestsAddedAccessibility = queueDocument.getConfirmation().getReturnTimeAllDay();
                    break;
                case 54:
                    allGuestsAddedAccessibility = queueDocument.getConfirmation().getReturnTimeWithinHours();
                    break;
                case 55:
                    allGuestsAddedAccessibility = queueDocument.getConfirmation().getReturnTimeWithinNextHour();
                    break;
                case 56:
                    allGuestsAddedAccessibility = queueDocument.getConfirmation().getReturnTimeWithinMinutes();
                    break;
                case 57:
                    allGuestsAddedAccessibility = queueDocument.getDashboard().getCtaAnalyticsActionName();
                    break;
                case 58:
                    allGuestsAddedAccessibility = queueDocument.getDashboard().getDetails();
                    break;
                case 59:
                    allGuestsAddedAccessibility = queueDocument.getDashboard().getPrimaryCtaAnalyticsActionName();
                    break;
                case 60:
                    allGuestsAddedAccessibility = queueDocument.getDashboard().getPrimaryCtaTitle();
                    break;
                case 61:
                    allGuestsAddedAccessibility = queueDocument.getDashboard().getSecondaryCtaAnalyticsActionName();
                    break;
                case 62:
                    allGuestsAddedAccessibility = queueDocument.getDashboard().getSecondaryCtaTitle();
                    break;
                case 63:
                    allGuestsAddedAccessibility = queueDocument.getDashboard().getTitle();
                    break;
                case 64:
                    allGuestsAddedAccessibility = queueDocument.getDetail().getHeader();
                    break;
                case 65:
                    allGuestsAddedAccessibility = queueDocument.getDetail().getFooterTitle();
                    break;
                case 66:
                    allGuestsAddedAccessibility = queueDocument.getDetail().getFooterBullet1();
                    break;
                case 67:
                    allGuestsAddedAccessibility = queueDocument.getDetail().getFooterBullet2();
                    break;
                case 68:
                    allGuestsAddedAccessibility = queueDocument.getDetail().getReturnTimeAllDay();
                    break;
                case 69:
                    allGuestsAddedAccessibility = queueDocument.getDetail().getReturnTimeWithinHours();
                    break;
                case 70:
                    allGuestsAddedAccessibility = queueDocument.getDetail().getReturnTimeWithinNextHour();
                    break;
                case 71:
                    allGuestsAddedAccessibility = queueDocument.getDetail().getReturnTimeWithinMinutes();
                    break;
                case 72:
                    allGuestsAddedAccessibility = queueDocument.getErrorBanners().getGenericErrorMessage();
                    break;
                case 73:
                    allGuestsAddedAccessibility = queueDocument.getErrorBanners().getGenericErrorTitle();
                    break;
                case 74:
                    allGuestsAddedAccessibility = queueDocument.getErrorBanners().getJoinErrorMessage();
                    break;
                case 75:
                    allGuestsAddedAccessibility = queueDocument.getErrorBanners().getJoinErrorTitle();
                    break;
                case 76:
                    allGuestsAddedAccessibility = queueDocument.getErrorBanners().getLandClosedMessage();
                    break;
                case 77:
                    allGuestsAddedAccessibility = queueDocument.getErrorBanners().getLandClosedTitle();
                    break;
                case 78:
                    allGuestsAddedAccessibility = queueDocument.getErrorBanners().getRetryErrorMessage();
                    break;
                case h76.SEARCH_REQUEST_SERVER_FIELD_NUMBER /* 79 */:
                    allGuestsAddedAccessibility = queueDocument.getErrorBanners().getGenericErrorTitle();
                    break;
                case 80:
                    allGuestsAddedAccessibility = queueDocument.getErrorBanners().getMaxPartySizeExceededMessage();
                    break;
                case 81:
                    allGuestsAddedAccessibility = queueDocument.getErrorBanners().getMaxPartySizeExceededTitle();
                    break;
                case 82:
                    allGuestsAddedAccessibility = queueDocument.getErrorBanners().getOffline();
                    break;
                case h76.BITMOJI_APP_SHARE_FIELD_NUMBER /* 83 */:
                    allGuestsAddedAccessibility = queueDocument.getHowToVisit().getDisclaimer();
                    break;
                case h76.BITMOJI_APP_STICKER_SEARCH_FIELD_NUMBER /* 84 */:
                    allGuestsAddedAccessibility = queueDocument.getHowToVisit().getHeader();
                    break;
                case 85:
                    allGuestsAddedAccessibility = queueDocument.getHowToVisit().getTitle();
                    break;
                case PaymentsConstants.ACTION_BARCODE_SCAN_TIMEOUT /* 86 */:
                    allGuestsAddedAccessibility = queueDocument.getHowToVisit().getBullet1();
                    break;
                case 87:
                    allGuestsAddedAccessibility = queueDocument.getHowToVisit().getBullet2();
                    break;
                case 88:
                    allGuestsAddedAccessibility = queueDocument.getHowToVisit().getBullet3();
                    break;
                case 89:
                    allGuestsAddedAccessibility = queueDocument.getHowToVisit().getMainCta();
                    break;
                case 90:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getAnonymousCancelPartyCta();
                    break;
                case 91:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getAnonymousConfirmationCancel();
                    break;
                case 92:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getAnonymousConfirmationDetail();
                    break;
                case 93:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getAnonymousConfirmationRemove();
                    break;
                case 94:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getAnonymousConfirmationTitle();
                    break;
                case 95:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getAnonymousPartySize();
                    break;
                case 96:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getAnonymousUpdatePartyTitle();
                    break;
                case 97:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getAnonymousUpdatePartyDetail();
                    break;
                case 98:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getAnonymousUpdatePartyCta();
                    break;
                case BlinkCardEditActivity.RESULT_RETRY /* 99 */:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getConfirmationCancel();
                    break;
                case 100:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getConfirmationDetail();
                    break;
                case 101:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getConfirmationRemove();
                    break;
                case 102:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getConfirmationTitle();
                    break;
                case 103:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getConfirmationTitlePlural();
                    break;
                case 104:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getDetail();
                    break;
                case 105:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getHeader();
                    break;
                case 106:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getKeepGuestsHeader();
                    break;
                case 107:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getLoading();
                    break;
                case 108:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getMainCta();
                    break;
                case 109:
                    allGuestsAddedAccessibility = queueDocument.getLeaveQueue().getRemoveGuestsHeader();
                    break;
                case 110:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getBluetoothCta();
                    break;
                case 111:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getBluetoothDetail();
                    break;
                case DineAdapterConstants.DINE_SIMPLE_HEADER_VIEW_TYPE /* 112 */:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getEmptyCta();
                    break;
                case 113:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getEmptyDetail();
                    break;
                case 114:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getErrorGeneralDetail();
                    break;
                case 115:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getErrorGeneralTitle();
                    break;
                case 116:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getErrorQueueClosed();
                    break;
                case 117:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getErrorQueuePaused();
                    break;
                case 118:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getHeader();
                    break;
                case 119:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getJoinAccessibility();
                    break;
                case 120:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getLastUpdatedDateFormat();
                    break;
                case 121:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getLoading();
                    break;
                case h76.SERVER_REQUEST_COF_FIELD_NUMBER /* 122 */:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getLoadingAccessibility();
                    break;
                case 123:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getLoadingLastUpdated();
                    break;
                case 124:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getLocationCta();
                    break;
                case 125:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getLocationDetail();
                    break;
                case 126:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getNoQueuesDetail();
                    break;
                case 127:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getNotificationCta();
                    break;
                case 128:
                    allGuestsAddedAccessibility = queueDocument.getMyLines().getNotificationDetail();
                    break;
                case 129:
                    allGuestsAddedAccessibility = queueDocument.getNsf().getAllSetTitle();
                    break;
                case 130:
                    allGuestsAddedAccessibility = queueDocument.getNsf().getAllSetTitleAccessibility();
                    break;
                case 131:
                    allGuestsAddedAccessibility = queueDocument.getNsf().getFullName();
                    break;
                case 132:
                    allGuestsAddedAccessibility = queueDocument.getNsf().getHeader();
                    break;
                case 133:
                    allGuestsAddedAccessibility = queueDocument.getNsf().getLoading();
                    break;
                case 134:
                    allGuestsAddedAccessibility = queueDocument.getNsf().getMainCta();
                    break;
                case 135:
                    allGuestsAddedAccessibility = queueDocument.getNsf().getReadyDescription();
                    break;
                case 136:
                    allGuestsAddedAccessibility = queueDocument.getNsf().getReadyHeader();
                    break;
                case 137:
                    allGuestsAddedAccessibility = queueDocument.getNsf().getRemoveCta();
                    break;
                case 138:
                    allGuestsAddedAccessibility = queueDocument.getNsf().getRemoveCtaAccessibility();
                    break;
                case 139:
                    allGuestsAddedAccessibility = queueDocument.getNonAttractionEvent().getHeightRestrictions();
                    break;
                case 140:
                    allGuestsAddedAccessibility = queueDocument.getNonAttractionEvent().getInfoLinkText();
                    break;
                case 141:
                    allGuestsAddedAccessibility = queueDocument.getNonAttractionEvent().getInfoLinkUrl();
                    break;
                case 142:
                    allGuestsAddedAccessibility = queueDocument.getNonAttractionEvent().getLocatedAt();
                    break;
                case 143:
                    allGuestsAddedAccessibility = queueDocument.getNonAttractionEvent().getPark();
                    break;
                case 144:
                    allGuestsAddedAccessibility = queueDocument.getNonAttractionEvent().getSubpark();
                    break;
                case 145:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getAdmittingGroup();
                    break;
                case 146:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getAdmittingGroupBlank();
                    break;
                case 147:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getAdmittingGroupRange();
                    break;
                case 148:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getAdmittingGroups();
                    break;
                case 149:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getAdmittingGroupSingle();
                    break;
                case 150:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getAnonymousNumberOfGuests();
                    break;
                case 151:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getBackupGroup();
                    break;
                case 152:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getBackupGroupStatus();
                    break;
                case 153:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getDescriptionAccessibility();
                    break;
                case 154:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getGetDirectionsCta();
                    break;
                case 155:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getDowntimeAlert();
                    break;
                case 156:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getDowntimeBoarding();
                    break;
                case 157:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getViewEntryCodeCta();
                    break;
                case 158:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getEstimatedWaitRange();
                    break;
                case 159:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getEstimatedWaitSingle();
                    break;
                case 160:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getExperienceAccessibility();
                    break;
                case 161:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getExperienceWithParkAccessibility();
                    break;
                case 162:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getExpired();
                    break;
                case 163:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getFullName();
                    break;
                case 164:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getGroup();
                    break;
                case 165:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getGuestAccessibility();
                    break;
                case 166:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getLoading();
                    break;
                case 167:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getInfoLinkText();
                    break;
                case 168:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getInfoLinkUrl();
                    break;
                case 169:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getPnoMessage();
                    break;
                case 170:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getLoadingFailed();
                    break;
                case 171:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getPartyHeader();
                    break;
                case 172:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getPartyHeaderCloseAccessibility();
                    break;
                case 173:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getPartyHeaderOpenAccessibility();
                    break;
                case 174:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getRedeemCta();
                    break;
                case 175:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getReleasedGroupStatus();
                    break;
                case 176:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getRemoveGuest();
                    break;
                case 177:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getReturnAnytime();
                    break;
                case 178:
                    allGuestsAddedAccessibility = queueDocument.getPosition().getReturnBy();
                    break;
                case 179:
                    allGuestsAddedAccessibility = "";
                    break;
                case 180:
                    allGuestsAddedAccessibility = queueDocument.getRedeem().getAnonymousPartyName();
                    break;
                case 181:
                    allGuestsAddedAccessibility = queueDocument.getRedeem().getAnonymousPartySize();
                    break;
                case 182:
                    allGuestsAddedAccessibility = queueDocument.getRedeem().getFullName();
                    break;
                case 183:
                    allGuestsAddedAccessibility = queueDocument.getRedeem().getGroup();
                    break;
                case 184:
                    allGuestsAddedAccessibility = queueDocument.getRedeem().getGroupAllDay();
                    break;
                case 185:
                    allGuestsAddedAccessibility = queueDocument.getRedeem().getHeaderAccessibility();
                    break;
                case 186:
                    allGuestsAddedAccessibility = queueDocument.getRedeem().getLoading();
                    break;
                case 187:
                    allGuestsAddedAccessibility = queueDocument.getRedeem().getLoadingErrorDetail();
                    break;
                case 188:
                    allGuestsAddedAccessibility = queueDocument.getRedeem().getLoadingErrorTitle();
                    break;
                case 189:
                    allGuestsAddedAccessibility = queueDocument.getRedeem().getMainCta();
                    break;
                case 190:
                    allGuestsAddedAccessibility = queueDocument.getRedeem().getOverviewAccessibility();
                    break;
                case 191:
                    allGuestsAddedAccessibility = queueDocument.getRedeem().getReturnAnytime();
                    break;
                case 192:
                    allGuestsAddedAccessibility = queueDocument.getRedeem().getReturnBy();
                    break;
                case 193:
                    allGuestsAddedAccessibility = queueDocument.getRedeem().getTicketIndicator();
                    break;
                case 194:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getAlternateCta();
                    break;
                case 195:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getChangePartyCta();
                    break;
                case 196:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getHeader();
                    break;
                case 197:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getHowToEnterTitle();
                    break;
                case h76.BITMOJI_APP_FRIEND_PERMISSIONS_OPEN_FIELD_NUMBER /* 198 */:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getImportantAccessibility();
                    break;
                case h76.BITMOJI_APP_FRIEND_PICKER_FRIEND_SELECT_FIELD_NUMBER /* 199 */:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getIneligibleGuestsHeader();
                    break;
                case 200:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getIneligibleGuestsWarningText();
                    break;
                case 201:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getJoinLoading();
                    break;
                case 202:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getLaunching();
                    break;
                case 203:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getLoading();
                    break;
                case 204:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getMainCta();
                    break;
                case 205:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getMaxPartySizeExceededMessage();
                    break;
                case 206:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getNoEligibleGuestsWarningText();
                    break;
                case 207:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getNoLinkedTicketsOrPasses();
                    break;
                case 208:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getRefreshDetailsMessage();
                    break;
                case 209:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getSelectGuestsWarningText();
                    break;
                case 210:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getUpdated();
                    break;
                case 211:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getUpdateScreenWarningMessage();
                    break;
                case 212:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getUpdateScreenWarningMessageDefault();
                    break;
                case h76.LENSSTUDIO_PANEL_OPEN_FIELD_NUMBER /* 213 */:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getUpdateScreenWarningTitle();
                    break;
                case h76.CAMPAIGN_PUSH_NOTIFICATION_RECEIVED_IN_EXTENSION_FIELD_NUMBER /* 214 */:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getVqHeaderTitle();
                    break;
                case h76.BITMOJI_APP_AVATAR_BUILDER_OUTFIT_CHANGE_FIELD_NUMBER /* 215 */:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getValidOn();
                    break;
                case h76.BITMOJI_APP_AVATAR_BUILDER_OUTFIT_ACTION_FIELD_NUMBER /* 216 */:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getYourPartyHeader();
                    break;
                case h76.OUR_STORY_SHOW_MY_NAME_FIELD_NUMBER /* 217 */:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getYourPartyHeaderAccessibility();
                    break;
                case h76.REGISTRATION_SERVER_DNU_FIELD_NUMBER /* 218 */:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getYourPartySizeHeader();
                    break;
                case h76.REGISTRATION_SERVER_CREATE_ACCOUNT_FIELD_NUMBER /* 219 */:
                    allGuestsAddedAccessibility = queueDocument.getReviewDetails().getQueueUnavailableMessage();
                    break;
                case 220:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getAdmittingGroup();
                    break;
                case h76.BITMOJI_APP_NOTIFICATION_EVENT_FIELD_NUMBER /* 221 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getAdmittingGroupBlank();
                    break;
                case h76.BITMOJI_APP_STICKER_IMPRESSION_FIELD_NUMBER /* 222 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getAdmittingGroupRange();
                    break;
                case h76.AB_USER_TRIGGER_FAKE_FIELD_NUMBER /* 223 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getAdmittingGroups();
                    break;
                case h76.VERIFY_KIT_EVENT_FIELD_NUMBER /* 224 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getAdmittingGroupSingle();
                    break;
                case h76.PUSH_NOTIFICATION_ACCEPTED_IN_MESH_FIELD_NUMBER /* 225 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getDowntimeBoarding();
                    break;
                case 226:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getEnableLocationCta();
                    break;
                case h76.PUSH_NOTIFICATION_STARTED_IN_MESH_FIELD_NUMBER /* 227 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getEnableLocationDetail();
                    break;
                case h76.SERVER_OUTBOUND_MESSAGE_FIELD_NUMBER /* 228 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getGuestMustBeAccessibility();
                    break;
                case h76.SERVER_INBOUND_MESSAGE_FIELD_NUMBER /* 229 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getHeightRestrictions();
                    break;
                case 230:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getHowToEnterDetail();
                    break;
                case h76.BITMOJI_APP_ACCOUNT_EMAIL_EVENT_FIELD_NUMBER /* 231 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getHowToEnterTitle();
                    break;
                case h76.SKATE_EVENT_FIELD_NUMBER /* 232 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getImportantAccessibility();
                    break;
                case h76.CAMERA_KIT_EXCEPTION_FIELD_NUMBER /* 233 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getInchesAccessibility();
                    break;
                case h76.CAMERA_KIT_LENS_SPIN_FIELD_NUMBER /* 234 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getInchesToReplaceAccessibility();
                    break;
                case h76.CAMERA_KIT_ASSET_DOWNLOAD_FIELD_NUMBER /* 235 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getJoinCta();
                    break;
                case h76.CAMERA_KIT_POSSIBLE_LENS_CRASH_FIELD_NUMBER /* 236 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getLoading();
                    break;
                case h76.CAMERA_KIT_SNAP_CREATE_FIELD_NUMBER /* 237 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getMyStatusCta();
                    break;
                case h76.CAMERA_KIT_PROFILING_METRICS_EVENT_FIELD_NUMBER /* 238 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getNextQueueAlert();
                    break;
                case h76.CAMERA_KIT_LENS_SWIPE_FIELD_NUMBER /* 239 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getNextQueueAlertOpensAt();
                    break;
                case 240:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getNextQueueOpens();
                    break;
                case h76.CAMERA_KIT_LENS_DOWNLOAD_FIELD_NUMBER /* 241 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getNoLocationDetail();
                    break;
                case h76.CAMERA_KIT_ASSET_VALIDATION_FAILED_FIELD_NUMBER /* 242 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getNoQueuesDetail();
                    break;
                case h76.DATA_REWARD_STATUS_FIELD_NUMBER /* 243 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getNoQueuesTitle();
                    break;
                case h76.BITMOJI_APP_FRIENDMOJI_ONBOARDING_EVENT_FIELD_NUMBER /* 244 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getNotInRegionDetail();
                    break;
                case h76.BITMOJI_APP_FRIENDMOJI_FRIEND_PICKER_EVENT_FIELD_NUMBER /* 245 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getParkTabAccessibilityAndroid();
                    break;
                case h76.BITMOJI_APP_CONTACT_FRIENDMOJI_EVENT_FIELD_NUMBER /* 246 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getParkTabSelectedAccessibilityAndroid();
                    break;
                case h76.BITMOJI_APP_SEND_FRIENDMOJI_INVITE_EVENT_FIELD_NUMBER /* 247 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getPartyCreationCta();
                    break;
                case h76.BITMOJI_APP_SETTINGS_CONTACTS_EVENT_FIELD_NUMBER /* 248 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getProjectedWait();
                    break;
                case h76.TALK_STREAMER_RESOLVE_FIELD_NUMBER /* 249 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getProjectedWaitRange();
                    break;
                case 250:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getProjectedWaitSingle();
                    break;
                case h76.LENSSTUDIO_MATERIALNODE_ADD_FIELD_NUMBER /* 251 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getQueueUnavailableMessage();
                    break;
                case h76.LENSSTUDIO_SCRIPTNODE_FAVORITE_FIELD_NUMBER /* 252 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getSelectQueueClosedForTheDay();
                    break;
                case h76.LENSSTUDIO_SCRIPTNODE_ADD_FIELD_NUMBER /* 253 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getTitle();
                    break;
                case h76.LENSSTUDIO_MATERIALNODE_FAVORITE_FIELD_NUMBER /* 254 */:
                    allGuestsAddedAccessibility = queueDocument.getSelectQueue().getNonOperationalMessage();
                    break;
                case 255:
                    allGuestsAddedAccessibility = queueDocument.getHub().getBgEndColor();
                    break;
                case 256:
                    allGuestsAddedAccessibility = queueDocument.getHub().getBgStartColor();
                    break;
                case h76.BITMOJI_APP_STICKER_PICKER_VIEW_MORE_TAP_FIELD_NUMBER /* 257 */:
                    allGuestsAddedAccessibility = queueDocument.getHub().getDescription();
                    break;
                case h76.LENSSTUDIO_MYLENSES_ADJUST_FIELD_NUMBER /* 258 */:
                    allGuestsAddedAccessibility = queueDocument.getHub().getHeaderColor();
                    break;
                case h76.LENSSTUDIO_MYLENSES_UPDATE_FIELD_NUMBER /* 259 */:
                    allGuestsAddedAccessibility = queueDocument.getHub().getMainCta();
                    break;
                case 260:
                    allGuestsAddedAccessibility = queueDocument.getHub().getNoQueuesDetail();
                    break;
                case h76.LENSSTUDIO_ASSETLIBRARY_IMPORT_FIELD_NUMBER /* 261 */:
                    allGuestsAddedAccessibility = queueDocument.getHub().getLocatedAt();
                    break;
                case h76.LENSSTUDIO_ASSETLIBRARY_OPEN_FIELD_NUMBER /* 262 */:
                    allGuestsAddedAccessibility = queueDocument.getHub().getSubpark();
                    break;
                case h76.MYLENSES_MANAGEMENT_PAGE_OPEN_FIELD_NUMBER /* 263 */:
                    allGuestsAddedAccessibility = queueDocument.getHub().getThumbIcon();
                    break;
                case h76.MYLENSES_MANAGEMENT_PAGE_ACTION_FIELD_NUMBER /* 264 */:
                    allGuestsAddedAccessibility = queueDocument.getHub().getThumbUrl();
                    break;
                case 265:
                    allGuestsAddedAccessibility = queueDocument.getHub().getBackButtonAccessibility();
                    break;
                case h76.CAMERA_KIT_SESSION_FIELD_NUMBER /* 266 */:
                    allGuestsAddedAccessibility = queueDocument.getTipboard().getGroupDisplay();
                    break;
                case h76.KIT_ERROR_EVENT_FIELD_NUMBER /* 267 */:
                    allGuestsAddedAccessibility = queueDocument.getTipboard().getGroupingLinkHub();
                    break;
                case h76.BITMOJI_APP_DIRECT_AUTH_EVENT_FIELD_NUMBER /* 268 */:
                    allGuestsAddedAccessibility = queueDocument.getTipboard().getGroupingLinkSingle();
                    break;
                case h76.BITMOJI_APP_KEYBOARD_EVENT_FIELD_NUMBER /* 269 */:
                    allGuestsAddedAccessibility = queueDocument.getTipboard().getGroupingLinkMultiple();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (allGuestsAddedAccessibility == null) {
                allGuestsAddedAccessibility = !StringsKt.isBlank(contentId) ? getString(type, "", shouldDecodeHtml) : "";
            }
            if (shouldDecodeHtml) {
                allGuestsAddedAccessibility = C3321b.m17055b(allGuestsAddedAccessibility, 0, null, null).toString();
            }
            if (allGuestsAddedAccessibility != null) {
                return allGuestsAddedAccessibility;
            }
        }
        return "";
    }

    public final String getTitleForConflict(String conflictType, Queue queue) {
        Intrinsics.checkNotNullParameter(conflictType, "conflictType");
        Intrinsics.checkNotNullParameter(queue, "queue");
        String title = getConflictData(conflictType, queue.getContentId()).getTitle();
        return title == null ? "" : title;
    }

    public final String getUrl(VQUrlType type, String contentId) {
        String apiBaseUrl;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        VirtualQueueDocument queueDocument = getQueueDocument(contentId);
        if (queueDocument != null) {
            switch (WhenMappings.$EnumSwitchMapping$1[type.ordinal()]) {
                case 1:
                    apiBaseUrl = queueDocument.getCommon().getApiBaseUrl();
                    break;
                case 2:
                    apiBaseUrl = queueDocument.getCommon().getBaseAssetPath();
                    break;
                case 3:
                    apiBaseUrl = queueDocument.getCommon().getLoadingAnimUrl();
                    break;
                case 4:
                    apiBaseUrl = queueDocument.getDashboard().getCtaDeeplinkURL();
                    break;
                case 5:
                    apiBaseUrl = queueDocument.getDashboard().getPrimaryCtaDeeplinkURL();
                    break;
                case 6:
                    apiBaseUrl = queueDocument.getDashboard().getSecondaryCtaDeeplinkURL();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (apiBaseUrl == null) {
                apiBaseUrl = !StringsKt.isBlank(contentId) ? getUrl(type, "") : "";
            }
            if (apiBaseUrl != null) {
                return apiBaseUrl;
            }
        }
        return "";
    }

    public final void refreshDocuments(List<String> contentIds) {
        Intrinsics.checkNotNullParameter(contentIds, "contentIds");
        Iterator<T> it = contentIds.iterator();
        while (it.hasNext()) {
            loadDocument((String) it.next());
        }
        loadDocument(defaultQueueContentId());
    }

    private final ImageUrlData.ImageDensity getDensity(float density) {
        double d10 = density;
        return d10 < 1.5d ? ImageUrlData.ImageDensity.MDPI : d10 < 2.0d ? ImageUrlData.ImageDensity.HDPI : d10 < 3.0d ? ImageUrlData.ImageDensity.XHDPI : d10 < 4.0d ? ImageUrlData.ImageDensity.XXHDPI : ImageUrlData.ImageDensity.XXXHDPI;
    }

    public static /* synthetic */ String getString$default(VirtualQueueThemer virtualQueueThemer, VQStringType vQStringType, Map map, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = "";
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return virtualQueueThemer.getString(vQStringType, map, str, z10);
    }

    public final String getImageUrl(ImageUrlData imageUrlData) {
        String strUrl;
        return (imageUrlData == null || (strUrl = imageUrlData.url(this.density)) == null) ? "" : strUrl;
    }

    public final String getString(VQStringType type, Map<String, ? extends Object> replacements, String contentId, boolean shouldDecodeHtml) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(replacements, "replacements");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        return INSTANCE.replaceTokens(getString(type, contentId, shouldDecodeHtml), replacements);
    }
}