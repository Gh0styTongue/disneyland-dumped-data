package com.disney.wdpro.virtualqueue.service.model;

import com.disney.wdpro.recommender.core.themer.RecommenderThemerConstants;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Connection;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(m92037d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bc\b\u0007\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002\u008c\u0001B\u0087\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0012\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030%\u0012\b\b\u0002\u0010&\u001a\u00020\u0012\u0012\b\b\u0002\u0010'\u001a\u00020\u0012\u0012\b\b\u0002\u0010(\u001a\u00020\u0006\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\b\b\u0002\u0010+\u001a\u00020\u0012\u0012\b\b\u0002\u0010,\u001a\u00020\u0012\u0012\b\b\u0002\u0010-\u001a\u00020\u0003\u0012\b\b\u0002\u0010.\u001a\u00020\u0003\u0012\b\b\u0002\u0010/\u001a\u00020\u0012\u0012\b\b\u0002\u00100\u001a\u00020\u0012¢\u0006\u0002\u00101R\u001c\u0010\u001a\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u0010\u0018\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00103\"\u0004\b7\u00105R\u001c\u0010\u0007\u001a\u00020\u00068FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010\t\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00103\"\u0004\b=\u00105R\u001c\u0010\u0005\u001a\u00020\u00068FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R\u001c\u0010\b\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00103\"\u0004\bA\u00105R\u001c\u0010!\u001a\u00020\"8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010\u0014\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00103\"\u0004\bG\u00105R\u001c\u0010)\u001a\u00020*8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010\u0019\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00103\"\u0004\bM\u00105R\u001c\u0010\u001f\u001a\u00020\u00128FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010N\"\u0004\bO\u0010PR\u001c\u0010,\u001a\u00020\u00128FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010N\"\u0004\bQ\u0010PR\u001c\u00100\u001a\u00020\u00128FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010N\"\u0004\bR\u0010PR\u001c\u0010/\u001a\u00020\u00128FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010N\"\u0004\bS\u0010PR\u001c\u0010.\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u00103\"\u0004\bU\u00105R\u001c\u0010\u0016\u001a\u00020\u00178FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001c\u0010(\u001a\u00020\u00068FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u00109\"\u0004\b[\u0010;R\u001c\u0010\u0004\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u00103\"\u0004\b]\u00105R\u001c\u0010 \u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u00103\"\u0004\b_\u00105R\u001c\u0010-\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u00103\"\u0004\ba\u00105R\u001c\u0010\u0010\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u00103\"\u0004\bc\u00105R\u001c\u0010\u0015\u001a\u00020\u00068FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u00109\"\u0004\be\u0010;R\u001c\u0010\u000e\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u00103\"\u0004\bg\u00105R\u001c\u0010\u000f\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u00103\"\u0004\bi\u00105R\u001c\u0010\u0002\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u00103\"\u0004\bk\u00105R\u001c\u0010#\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u00103\"\u0004\bm\u00105R\"\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030%8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001c\u0010+\u001a\u00020\u00128FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010N\"\u0004\bs\u0010PR\u001c\u0010'\u001a\u00020\u00128FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010N\"\u0004\bu\u0010PR\u001c\u0010\u0013\u001a\u00020\u00128FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010N\"\u0004\bw\u0010PR\u001c\u0010\u0011\u001a\u00020\u00128FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010N\"\u0004\by\u0010PR\u001c\u0010&\u001a\u00020\u00128FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010N\"\u0004\b{\u0010PR\u001c\u0010\n\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u001e\u0010\u001b\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u00103\"\u0005\b\u0081\u0001\u00105R\u001e\u0010\u001c\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u00103\"\u0005\b\u0083\u0001\u00105R \u0010\f\u001a\u00020\r8FX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001e\u0010\u001e\u001a\u00020\u00068FX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u00109\"\u0005\b\u0089\u0001\u0010;R\u001e\u0010\u001d\u001a\u00020\u00068FX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u00109\"\u0005\b\u008b\u0001\u0010;¨\u0006\u008d\u0001"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "Ljava/io/Serializable;", "queueId", "", "name", "currentArrivingGroupStart", "", "currentArrivingGroupEnd", "currentArrivingGroupStartDisplayName", "currentArrivingGroupEndDisplayName", "state", "Lcom/disney/wdpro/virtualqueue/service/model/QueueState;", "type", "Lcom/disney/wdpro/virtualqueue/service/model/QueueType;", "postedWaitTime", "postedWaitTimeTts", "postedQueueStatus", "showPostedWaitTimeOnHub", "", "showPostedWaitTimeOnConfirmation", "externalDefinitionId", "postedSummonReturnWindowMinutes", "legalDisclaimer", "Lcom/disney/wdpro/virtualqueue/service/model/QueueLegalDisclaimer;", VirtualQueueConstants.CONTENT_ID, "howToEnterMessage", "categoryContentId", "tabContentId", "thumbIcon", "waitTimeMin", "waitTimeMax", "isAcceptingJoins", RecommenderThemerConstants.NEXT_SCHEDULED_OPEN_TIME, "dayPhase", "Lcom/disney/wdpro/virtualqueue/service/model/QueueDayPhase;", "requiredCurrentGeoRegionId", "requiredCurrentGeoRegionIds", "", "showRedeemBarcode", "showGetDirections", "maxPartySize", "guestIdMode", "Lcom/disney/wdpro/virtualqueue/service/model/QueueGuestIdMode;", "showDowntimeAlert", "isAcceptingPartyCreation", RecommenderThemerConstants.NEXT_SCHEDULED_PARTY_CREATION_OPEN_TIME, "joinWindowIdHash", "isPlanningPartyPreselectionEnabled", "isEarlyPartyCreationEnabled", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/disney/wdpro/virtualqueue/service/model/QueueState;Lcom/disney/wdpro/virtualqueue/service/model/QueueType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ILcom/disney/wdpro/virtualqueue/service/model/QueueLegalDisclaimer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Lcom/disney/wdpro/virtualqueue/service/model/QueueDayPhase;Ljava/lang/String;Ljava/util/List;ZZILcom/disney/wdpro/virtualqueue/service/model/QueueGuestIdMode;ZZLjava/lang/String;Ljava/lang/String;ZZ)V", "getCategoryContentId", "()Ljava/lang/String;", "setCategoryContentId", "(Ljava/lang/String;)V", "getContentId", "setContentId", "getCurrentArrivingGroupEnd", "()I", "setCurrentArrivingGroupEnd", "(I)V", "getCurrentArrivingGroupEndDisplayName", "setCurrentArrivingGroupEndDisplayName", "getCurrentArrivingGroupStart", "setCurrentArrivingGroupStart", "getCurrentArrivingGroupStartDisplayName", "setCurrentArrivingGroupStartDisplayName", "getDayPhase", "()Lcom/disney/wdpro/virtualqueue/service/model/QueueDayPhase;", "setDayPhase", "(Lcom/disney/wdpro/virtualqueue/service/model/QueueDayPhase;)V", "getExternalDefinitionId", "setExternalDefinitionId", "getGuestIdMode", "()Lcom/disney/wdpro/virtualqueue/service/model/QueueGuestIdMode;", "setGuestIdMode", "(Lcom/disney/wdpro/virtualqueue/service/model/QueueGuestIdMode;)V", "getHowToEnterMessage", "setHowToEnterMessage", "()Z", "setAcceptingJoins", "(Z)V", "setAcceptingPartyCreation", "setEarlyPartyCreationEnabled", "setPlanningPartyPreselectionEnabled", "getJoinWindowIdHash", "setJoinWindowIdHash", "getLegalDisclaimer", "()Lcom/disney/wdpro/virtualqueue/service/model/QueueLegalDisclaimer;", "setLegalDisclaimer", "(Lcom/disney/wdpro/virtualqueue/service/model/QueueLegalDisclaimer;)V", "getMaxPartySize", "setMaxPartySize", "getName", "setName", "getNextScheduledOpenTime", "setNextScheduledOpenTime", "getNextScheduledPartyCreationOpenTime", "setNextScheduledPartyCreationOpenTime", "getPostedQueueStatus", "setPostedQueueStatus", "getPostedSummonReturnWindowMinutes", "setPostedSummonReturnWindowMinutes", "getPostedWaitTime", "setPostedWaitTime", "getPostedWaitTimeTts", "setPostedWaitTimeTts", "getQueueId", "setQueueId", "getRequiredCurrentGeoRegionId", "setRequiredCurrentGeoRegionId", "getRequiredCurrentGeoRegionIds", "()Ljava/util/List;", "setRequiredCurrentGeoRegionIds", "(Ljava/util/List;)V", "getShowDowntimeAlert", "setShowDowntimeAlert", "getShowGetDirections", "setShowGetDirections", "getShowPostedWaitTimeOnConfirmation", "setShowPostedWaitTimeOnConfirmation", "getShowPostedWaitTimeOnHub", "setShowPostedWaitTimeOnHub", "getShowRedeemBarcode", "setShowRedeemBarcode", "getState", "()Lcom/disney/wdpro/virtualqueue/service/model/QueueState;", "setState", "(Lcom/disney/wdpro/virtualqueue/service/model/QueueState;)V", "getTabContentId", "setTabContentId", "getThumbIcon", "setThumbIcon", "getType", "()Lcom/disney/wdpro/virtualqueue/service/model/QueueType;", "setType", "(Lcom/disney/wdpro/virtualqueue/service/model/QueueType;)V", "getWaitTimeMax", "setWaitTimeMax", "getWaitTimeMin", "setWaitTimeMin", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class Queue implements Serializable {
    public static final int NO_GROUP_NUMBER_PROVIDED = -1;
    private String categoryContentId;
    private String contentId;
    private int currentArrivingGroupEnd;
    private String currentArrivingGroupEndDisplayName;
    private int currentArrivingGroupStart;
    private String currentArrivingGroupStartDisplayName;
    private QueueDayPhase dayPhase;
    private String externalDefinitionId;
    private QueueGuestIdMode guestIdMode;
    private String howToEnterMessage;
    private boolean isAcceptingJoins;
    private boolean isAcceptingPartyCreation;
    private boolean isEarlyPartyCreationEnabled;
    private boolean isPlanningPartyPreselectionEnabled;
    private String joinWindowIdHash;
    private QueueLegalDisclaimer legalDisclaimer;
    private int maxPartySize;
    private String name;
    private String nextScheduledOpenTime;
    private String nextScheduledPartyCreationOpenTime;
    private String postedQueueStatus;
    private int postedSummonReturnWindowMinutes;
    private String postedWaitTime;
    private String postedWaitTimeTts;
    private String queueId;
    private String requiredCurrentGeoRegionId;
    private List<String> requiredCurrentGeoRegionIds;
    private boolean showDowntimeAlert;
    private boolean showGetDirections;
    private boolean showPostedWaitTimeOnConfirmation;
    private boolean showPostedWaitTimeOnHub;
    private boolean showRedeemBarcode;
    private QueueState state;
    private String tabContentId;
    private String thumbIcon;
    private QueueType type;
    private int waitTimeMax;
    private int waitTimeMin;
    public static final int $stable = 8;

    public Queue() {
        this(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
    }

    public final String getCategoryContentId() {
        String str = this.categoryContentId;
        return str == null ? "" : str;
    }

    public final String getContentId() {
        String str = this.contentId;
        return str == null ? "" : str;
    }

    public final int getCurrentArrivingGroupEnd() {
        return this.currentArrivingGroupEnd;
    }

    public final String getCurrentArrivingGroupEndDisplayName() {
        String str = this.currentArrivingGroupEndDisplayName;
        return str == null ? "" : str;
    }

    public final int getCurrentArrivingGroupStart() {
        return this.currentArrivingGroupStart;
    }

    public final String getCurrentArrivingGroupStartDisplayName() {
        String str = this.currentArrivingGroupStartDisplayName;
        return str == null ? "" : str;
    }

    public final QueueDayPhase getDayPhase() {
        QueueDayPhase queueDayPhase = this.dayPhase;
        return queueDayPhase == null ? QueueDayPhase.PRE_OPEN : queueDayPhase;
    }

    public final String getExternalDefinitionId() {
        String str = this.externalDefinitionId;
        return str == null ? "" : str;
    }

    public final QueueGuestIdMode getGuestIdMode() {
        QueueGuestIdMode queueGuestIdMode = this.guestIdMode;
        return queueGuestIdMode == null ? QueueGuestIdMode.IDENTIFIED : queueGuestIdMode;
    }

    public final String getHowToEnterMessage() {
        String str = this.howToEnterMessage;
        return str == null ? "" : str;
    }

    public final String getJoinWindowIdHash() {
        String str = this.joinWindowIdHash;
        return str == null ? "" : str;
    }

    public final QueueLegalDisclaimer getLegalDisclaimer() {
        QueueLegalDisclaimer queueLegalDisclaimer = this.legalDisclaimer;
        if (queueLegalDisclaimer != null) {
            return queueLegalDisclaimer;
        }
        return new QueueLegalDisclaimer(false, false, false, null, 15, null);
    }

    public final int getMaxPartySize() {
        return this.maxPartySize;
    }

    public final String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public final String getNextScheduledOpenTime() {
        String str = this.nextScheduledOpenTime;
        return str == null ? "" : str;
    }

    public final String getNextScheduledPartyCreationOpenTime() {
        String str = this.nextScheduledPartyCreationOpenTime;
        return str == null ? "" : str;
    }

    public final String getPostedQueueStatus() {
        String str = this.postedQueueStatus;
        return str == null ? "" : str;
    }

    public final int getPostedSummonReturnWindowMinutes() {
        return this.postedSummonReturnWindowMinutes;
    }

    public final String getPostedWaitTime() {
        String str = this.postedWaitTime;
        return str == null ? "" : str;
    }

    public final String getPostedWaitTimeTts() {
        String str = this.postedWaitTimeTts;
        return str == null ? "" : str;
    }

    public final String getQueueId() {
        String str = this.queueId;
        return str == null ? "" : str;
    }

    public final String getRequiredCurrentGeoRegionId() {
        String str = this.requiredCurrentGeoRegionId;
        return str == null ? "" : str;
    }

    public final List<String> getRequiredCurrentGeoRegionIds() {
        List<String> list = this.requiredCurrentGeoRegionIds;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final boolean getShowDowntimeAlert() {
        return this.showDowntimeAlert;
    }

    public final boolean getShowGetDirections() {
        return this.showGetDirections;
    }

    public final boolean getShowPostedWaitTimeOnConfirmation() {
        return this.showPostedWaitTimeOnConfirmation;
    }

    public final boolean getShowPostedWaitTimeOnHub() {
        return this.showPostedWaitTimeOnHub;
    }

    public final boolean getShowRedeemBarcode() {
        return this.showRedeemBarcode;
    }

    public final QueueState getState() {
        QueueState queueState = this.state;
        return queueState == null ? QueueState.CLOSED : queueState;
    }

    public final String getTabContentId() {
        String str = this.tabContentId;
        return str == null ? "" : str;
    }

    public final String getThumbIcon() {
        String str = this.thumbIcon;
        return str == null ? "" : str;
    }

    public final QueueType getType() {
        QueueType queueType = this.type;
        return queueType == null ? QueueType.BOARDING_GROUP : queueType;
    }

    public final int getWaitTimeMax() {
        return this.waitTimeMax;
    }

    public final int getWaitTimeMin() {
        return this.waitTimeMin;
    }

    /* renamed from: isAcceptingJoins, reason: from getter */
    public final boolean getIsAcceptingJoins() {
        return this.isAcceptingJoins;
    }

    /* renamed from: isAcceptingPartyCreation, reason: from getter */
    public final boolean getIsAcceptingPartyCreation() {
        return this.isAcceptingPartyCreation;
    }

    /* renamed from: isEarlyPartyCreationEnabled, reason: from getter */
    public final boolean getIsEarlyPartyCreationEnabled() {
        return this.isEarlyPartyCreationEnabled;
    }

    /* renamed from: isPlanningPartyPreselectionEnabled, reason: from getter */
    public final boolean getIsPlanningPartyPreselectionEnabled() {
        return this.isPlanningPartyPreselectionEnabled;
    }

    public final void setAcceptingJoins(boolean z10) {
        this.isAcceptingJoins = z10;
    }

    public final void setAcceptingPartyCreation(boolean z10) {
        this.isAcceptingPartyCreation = z10;
    }

    public final void setCategoryContentId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.categoryContentId = str;
    }

    public final void setContentId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contentId = str;
    }

    public final void setCurrentArrivingGroupEnd(int i10) {
        this.currentArrivingGroupEnd = i10;
    }

    public final void setCurrentArrivingGroupEndDisplayName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentArrivingGroupEndDisplayName = str;
    }

    public final void setCurrentArrivingGroupStart(int i10) {
        this.currentArrivingGroupStart = i10;
    }

    public final void setCurrentArrivingGroupStartDisplayName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentArrivingGroupStartDisplayName = str;
    }

    public final void setDayPhase(QueueDayPhase queueDayPhase) {
        Intrinsics.checkNotNullParameter(queueDayPhase, "<set-?>");
        this.dayPhase = queueDayPhase;
    }

    public final void setEarlyPartyCreationEnabled(boolean z10) {
        this.isEarlyPartyCreationEnabled = z10;
    }

    public final void setExternalDefinitionId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.externalDefinitionId = str;
    }

    public final void setGuestIdMode(QueueGuestIdMode queueGuestIdMode) {
        Intrinsics.checkNotNullParameter(queueGuestIdMode, "<set-?>");
        this.guestIdMode = queueGuestIdMode;
    }

    public final void setHowToEnterMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.howToEnterMessage = str;
    }

    public final void setJoinWindowIdHash(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.joinWindowIdHash = str;
    }

    public final void setLegalDisclaimer(QueueLegalDisclaimer queueLegalDisclaimer) {
        Intrinsics.checkNotNullParameter(queueLegalDisclaimer, "<set-?>");
        this.legalDisclaimer = queueLegalDisclaimer;
    }

    public final void setMaxPartySize(int i10) {
        this.maxPartySize = i10;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setNextScheduledOpenTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nextScheduledOpenTime = str;
    }

    public final void setNextScheduledPartyCreationOpenTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nextScheduledPartyCreationOpenTime = str;
    }

    public final void setPlanningPartyPreselectionEnabled(boolean z10) {
        this.isPlanningPartyPreselectionEnabled = z10;
    }

    public final void setPostedQueueStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.postedQueueStatus = str;
    }

    public final void setPostedSummonReturnWindowMinutes(int i10) {
        this.postedSummonReturnWindowMinutes = i10;
    }

    public final void setPostedWaitTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.postedWaitTime = str;
    }

    public final void setPostedWaitTimeTts(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.postedWaitTimeTts = str;
    }

    public final void setQueueId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.queueId = str;
    }

    public final void setRequiredCurrentGeoRegionId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requiredCurrentGeoRegionId = str;
    }

    public final void setRequiredCurrentGeoRegionIds(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.requiredCurrentGeoRegionIds = list;
    }

    public final void setShowDowntimeAlert(boolean z10) {
        this.showDowntimeAlert = z10;
    }

    public final void setShowGetDirections(boolean z10) {
        this.showGetDirections = z10;
    }

    public final void setShowPostedWaitTimeOnConfirmation(boolean z10) {
        this.showPostedWaitTimeOnConfirmation = z10;
    }

    public final void setShowPostedWaitTimeOnHub(boolean z10) {
        this.showPostedWaitTimeOnHub = z10;
    }

    public final void setShowRedeemBarcode(boolean z10) {
        this.showRedeemBarcode = z10;
    }

    public final void setState(QueueState queueState) {
        Intrinsics.checkNotNullParameter(queueState, "<set-?>");
        this.state = queueState;
    }

    public final void setTabContentId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tabContentId = str;
    }

    public final void setThumbIcon(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thumbIcon = str;
    }

    public final void setType(QueueType queueType) {
        Intrinsics.checkNotNullParameter(queueType, "<set-?>");
        this.type = queueType;
    }

    public final void setWaitTimeMax(int i10) {
        this.waitTimeMax = i10;
    }

    public final void setWaitTimeMin(int i10) {
        this.waitTimeMin = i10;
    }

    public Queue(String queueId, String name, int i10, int i11, String currentArrivingGroupStartDisplayName, String currentArrivingGroupEndDisplayName, QueueState state, QueueType type, String postedWaitTime, String postedWaitTimeTts, String postedQueueStatus, boolean z10, boolean z11, String externalDefinitionId, int i12, QueueLegalDisclaimer legalDisclaimer, String contentId, String howToEnterMessage, String categoryContentId, String tabContentId, String thumbIcon, int i13, int i14, boolean z12, String nextScheduledOpenTime, QueueDayPhase dayPhase, String requiredCurrentGeoRegionId, List<String> requiredCurrentGeoRegionIds, boolean z13, boolean z14, int i15, QueueGuestIdMode guestIdMode, boolean z15, boolean z16, String nextScheduledPartyCreationOpenTime, String joinWindowIdHash, boolean z17, boolean z18) {
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currentArrivingGroupStartDisplayName, "currentArrivingGroupStartDisplayName");
        Intrinsics.checkNotNullParameter(currentArrivingGroupEndDisplayName, "currentArrivingGroupEndDisplayName");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(postedWaitTime, "postedWaitTime");
        Intrinsics.checkNotNullParameter(postedWaitTimeTts, "postedWaitTimeTts");
        Intrinsics.checkNotNullParameter(postedQueueStatus, "postedQueueStatus");
        Intrinsics.checkNotNullParameter(externalDefinitionId, "externalDefinitionId");
        Intrinsics.checkNotNullParameter(legalDisclaimer, "legalDisclaimer");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(howToEnterMessage, "howToEnterMessage");
        Intrinsics.checkNotNullParameter(categoryContentId, "categoryContentId");
        Intrinsics.checkNotNullParameter(tabContentId, "tabContentId");
        Intrinsics.checkNotNullParameter(thumbIcon, "thumbIcon");
        Intrinsics.checkNotNullParameter(nextScheduledOpenTime, "nextScheduledOpenTime");
        Intrinsics.checkNotNullParameter(dayPhase, "dayPhase");
        Intrinsics.checkNotNullParameter(requiredCurrentGeoRegionId, "requiredCurrentGeoRegionId");
        Intrinsics.checkNotNullParameter(requiredCurrentGeoRegionIds, "requiredCurrentGeoRegionIds");
        Intrinsics.checkNotNullParameter(guestIdMode, "guestIdMode");
        Intrinsics.checkNotNullParameter(nextScheduledPartyCreationOpenTime, "nextScheduledPartyCreationOpenTime");
        Intrinsics.checkNotNullParameter(joinWindowIdHash, "joinWindowIdHash");
        this.categoryContentId = categoryContentId;
        this.contentId = contentId;
        this.currentArrivingGroupStart = i10;
        this.currentArrivingGroupEnd = i11;
        this.currentArrivingGroupStartDisplayName = currentArrivingGroupStartDisplayName;
        this.currentArrivingGroupEndDisplayName = currentArrivingGroupEndDisplayName;
        this.externalDefinitionId = externalDefinitionId;
        this.howToEnterMessage = howToEnterMessage;
        this.legalDisclaimer = legalDisclaimer;
        this.name = name;
        this.postedQueueStatus = postedQueueStatus;
        this.postedSummonReturnWindowMinutes = i12;
        this.postedWaitTime = postedWaitTime;
        this.postedWaitTimeTts = postedWaitTimeTts;
        this.queueId = queueId;
        this.showPostedWaitTimeOnHub = z10;
        this.showPostedWaitTimeOnConfirmation = z11;
        this.state = state;
        this.tabContentId = tabContentId;
        this.thumbIcon = thumbIcon;
        this.type = type;
        this.waitTimeMax = i14;
        this.waitTimeMin = i13;
        this.isAcceptingJoins = z12;
        this.nextScheduledOpenTime = nextScheduledOpenTime;
        this.dayPhase = dayPhase;
        this.requiredCurrentGeoRegionId = requiredCurrentGeoRegionId;
        this.requiredCurrentGeoRegionIds = requiredCurrentGeoRegionIds;
        this.showRedeemBarcode = z13;
        this.showGetDirections = z14;
        this.maxPartySize = i15;
        this.guestIdMode = guestIdMode;
        this.showDowntimeAlert = z15;
        this.isAcceptingPartyCreation = z16;
        this.nextScheduledPartyCreationOpenTime = nextScheduledPartyCreationOpenTime;
        this.joinWindowIdHash = joinWindowIdHash;
        this.isPlanningPartyPreselectionEnabled = z17;
        this.isEarlyPartyCreationEnabled = z18;
    }

    public /* synthetic */ Queue(String str, String str2, int i10, int i11, String str3, String str4, QueueState queueState, QueueType queueType, String str5, String str6, String str7, boolean z10, boolean z11, String str8, int i12, QueueLegalDisclaimer queueLegalDisclaimer, String str9, String str10, String str11, String str12, String str13, int i13, int i14, boolean z12, String str14, QueueDayPhase queueDayPhase, String str15, List list, boolean z13, boolean z14, int i15, QueueGuestIdMode queueGuestIdMode, boolean z15, boolean z16, String str16, String str17, boolean z17, boolean z18, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? "" : str, (i16 & 2) != 0 ? "" : str2, (i16 & 4) != 0 ? -1 : i10, (i16 & 8) == 0 ? i11 : -1, (i16 & 16) != 0 ? "" : str3, (i16 & 32) != 0 ? "" : str4, (i16 & 64) != 0 ? QueueState.CLOSED : queueState, (i16 & 128) != 0 ? QueueType.BOARDING_GROUP : queueType, (i16 & 256) != 0 ? "" : str5, (i16 & 512) != 0 ? "" : str6, (i16 & 1024) != 0 ? "" : str7, (i16 & 2048) != 0 ? false : z10, (i16 & 4096) != 0 ? false : z11, (i16 & 8192) != 0 ? "" : str8, (i16 & 16384) != 0 ? 0 : i12, (i16 & 32768) != 0 ? new QueueLegalDisclaimer(false, false, false, null, 15, null) : queueLegalDisclaimer, (i16 & 65536) != 0 ? "" : str9, (i16 & PKIFailureInfo.unsupportedVersion) != 0 ? "" : str10, (i16 & PKIFailureInfo.transactionIdInUse) != 0 ? "" : str11, (i16 & 524288) != 0 ? "" : str12, (i16 & 1048576) != 0 ? "" : str13, (i16 & PKIFailureInfo.badSenderNonce) != 0 ? 0 : i13, (i16 & 4194304) != 0 ? 0 : i14, (i16 & 8388608) != 0 ? false : z12, (i16 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? "" : str14, (i16 & 33554432) != 0 ? QueueDayPhase.PRE_OPEN : queueDayPhase, (i16 & 67108864) != 0 ? "" : str15, (i16 & 134217728) != 0 ? CollectionsKt.emptyList() : list, (i16 & 268435456) != 0 ? false : z13, (i16 & PKIFailureInfo.duplicateCertReq) != 0 ? false : z14, (i16 & 1073741824) != 0 ? 0 : i15, (i16 & Integer.MIN_VALUE) != 0 ? QueueGuestIdMode.IDENTIFIED : queueGuestIdMode, (i17 & 1) != 0 ? false : z15, (i17 & 2) != 0 ? false : z16, (i17 & 4) != 0 ? "" : str16, (i17 & 8) == 0 ? str17 : "", (i17 & 16) != 0 ? false : z17, (i17 & 32) != 0 ? false : z18);
    }
}