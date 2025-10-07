package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 {2\u00020\u0001:\u0002{|B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001c\u0010?\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001c\u0010B\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001c\u0010E\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001c\u0010H\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001c\u0010K\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001c\u0010N\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001c\u0010Q\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001c\u0010T\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001c\u0010W\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001c\u0010Z\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR\u001c\u0010]\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\bR\u001c\u0010`\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR\u001c\u0010c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR\u001c\u0010f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\u001c\u0010i\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\u001c\u0010l\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0006\"\u0004\bn\u0010\bR\u001c\u0010o\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR\u001c\u0010r\u001a\u0004\u0018\u00010sX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001c\u0010x\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0006\"\u0004\bz\u0010\b¨\u0006}"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/SelectQueueData;", "", "()V", "admittingGroup", "", "getAdmittingGroup", "()Ljava/lang/String;", "setAdmittingGroup", "(Ljava/lang/String;)V", "admittingGroupBlank", "getAdmittingGroupBlank", "setAdmittingGroupBlank", "admittingGroupRange", "getAdmittingGroupRange", "setAdmittingGroupRange", "admittingGroupSingle", "getAdmittingGroupSingle", "setAdmittingGroupSingle", "admittingGroups", "getAdmittingGroups", "setAdmittingGroups", "downtimeBoarding", "getDowntimeBoarding", "setDowntimeBoarding", "enableLocationCta", "getEnableLocationCta", "setEnableLocationCta", "enableLocationDetail", "getEnableLocationDetail", "setEnableLocationDetail", "guestMustBeAccessibility", "getGuestMustBeAccessibility", "setGuestMustBeAccessibility", "heightRestrictions", "getHeightRestrictions", "setHeightRestrictions", "howToEnterDetail", "getHowToEnterDetail", "setHowToEnterDetail", "howToEnterTitle", "getHowToEnterTitle", "setHowToEnterTitle", "icons", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/SelectQueueData$QueueIcons;", "getIcons", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/SelectQueueData$QueueIcons;", "setIcons", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/SelectQueueData$QueueIcons;)V", "importantAccessibility", "getImportantAccessibility", "setImportantAccessibility", "inchesAccessibility", "getInchesAccessibility", "setInchesAccessibility", "inchesToReplaceAccessibility", "getInchesToReplaceAccessibility", "setInchesToReplaceAccessibility", "joinCta", "getJoinCta", "setJoinCta", "loading", "getLoading", "setLoading", "myStatusCta", "getMyStatusCta", "setMyStatusCta", "nextQueueAlert", "getNextQueueAlert", "setNextQueueAlert", "nextQueueAlertOpensAt", "getNextQueueAlertOpensAt", "setNextQueueAlertOpensAt", "nextQueueOpens", "getNextQueueOpens", "setNextQueueOpens", "noLocationDetail", "getNoLocationDetail", "setNoLocationDetail", "noQueuesDetail", "getNoQueuesDetail", "setNoQueuesDetail", "noQueuesTitle", "getNoQueuesTitle", "setNoQueuesTitle", "nonOperationalMessage", "getNonOperationalMessage", "setNonOperationalMessage", "notInRegionDetail", "getNotInRegionDetail", "setNotInRegionDetail", "parkTabAccessibilityAndroid", "getParkTabAccessibilityAndroid", "setParkTabAccessibilityAndroid", "parkTabSelectedAccessibilityAndroid", "getParkTabSelectedAccessibilityAndroid", "setParkTabSelectedAccessibilityAndroid", "partyCreationCta", "getPartyCreationCta", "setPartyCreationCta", "projectedWait", "getProjectedWait", "setProjectedWait", "projectedWaitRange", "getProjectedWaitRange", "setProjectedWaitRange", "projectedWaitSingle", "getProjectedWaitSingle", "setProjectedWaitSingle", "queueUnavailableMessage", "getQueueUnavailableMessage", "setQueueUnavailableMessage", "selectQueueClosedForTheDay", "getSelectQueueClosedForTheDay", "setSelectQueueClosedForTheDay", "thumbUrlData", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "getThumbUrlData", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "setThumbUrlData", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;)V", "title", "getTitle", "setTitle", "Companion", "QueueIcons", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class SelectQueueData {
    public static final String KEY = "selectQueue";
    public static final String THUMB_URL_KEY = "thumbUrl";
    private String admittingGroup;
    private String admittingGroupBlank;
    private String admittingGroupRange;
    private String admittingGroupSingle;
    private String admittingGroups;
    private String downtimeBoarding;
    private String enableLocationCta;
    private String enableLocationDetail;
    private String guestMustBeAccessibility;
    private String heightRestrictions;
    private String howToEnterDetail;
    private String howToEnterTitle;
    private QueueIcons icons = new QueueIcons();
    private String importantAccessibility;
    private String inchesAccessibility;
    private String inchesToReplaceAccessibility;
    private String joinCta;
    private String loading;
    private String myStatusCta;
    private String nextQueueAlert;
    private String nextQueueAlertOpensAt;
    private String nextQueueOpens;
    private String noLocationDetail;
    private String noQueuesDetail;
    private String noQueuesTitle;
    private String nonOperationalMessage;
    private String notInRegionDetail;
    private String parkTabAccessibilityAndroid;
    private String parkTabSelectedAccessibilityAndroid;
    private String partyCreationCta;
    private String projectedWait;
    private String projectedWaitRange;
    private String projectedWaitSingle;
    private String queueUnavailableMessage;
    private String selectQueueClosedForTheDay;
    private ImageUrlData thumbUrlData;
    private String title;
    public static final int $stable = 8;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/SelectQueueData$QueueIcons;", "", "()V", "enableLocationIcon", "", "getEnableLocationIcon", "()Ljava/lang/String;", "setEnableLocationIcon", "(Ljava/lang/String;)V", "notInRegionIcon", "getNotInRegionIcon", "setNotInRegionIcon", "queueUnavailableIcon", "getQueueUnavailableIcon", "setQueueUnavailableIcon", "thumbIcon", "getThumbIcon", "setThumbIcon", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public static final class QueueIcons {
        public static final int $stable = 8;
        private String enableLocationIcon;
        private String notInRegionIcon;
        private String queueUnavailableIcon;
        private String thumbIcon;

        public final String getEnableLocationIcon() {
            return this.enableLocationIcon;
        }

        public final String getNotInRegionIcon() {
            return this.notInRegionIcon;
        }

        public final String getQueueUnavailableIcon() {
            return this.queueUnavailableIcon;
        }

        public final String getThumbIcon() {
            return this.thumbIcon;
        }

        public final void setEnableLocationIcon(String str) {
            this.enableLocationIcon = str;
        }

        public final void setNotInRegionIcon(String str) {
            this.notInRegionIcon = str;
        }

        public final void setQueueUnavailableIcon(String str) {
            this.queueUnavailableIcon = str;
        }

        public final void setThumbIcon(String str) {
            this.thumbIcon = str;
        }
    }

    public final String getAdmittingGroup() {
        return this.admittingGroup;
    }

    public final String getAdmittingGroupBlank() {
        return this.admittingGroupBlank;
    }

    public final String getAdmittingGroupRange() {
        return this.admittingGroupRange;
    }

    public final String getAdmittingGroupSingle() {
        return this.admittingGroupSingle;
    }

    public final String getAdmittingGroups() {
        return this.admittingGroups;
    }

    public final String getDowntimeBoarding() {
        return this.downtimeBoarding;
    }

    public final String getEnableLocationCta() {
        return this.enableLocationCta;
    }

    public final String getEnableLocationDetail() {
        return this.enableLocationDetail;
    }

    public final String getGuestMustBeAccessibility() {
        return this.guestMustBeAccessibility;
    }

    public final String getHeightRestrictions() {
        return this.heightRestrictions;
    }

    public final String getHowToEnterDetail() {
        return this.howToEnterDetail;
    }

    public final String getHowToEnterTitle() {
        return this.howToEnterTitle;
    }

    public final QueueIcons getIcons() {
        return this.icons;
    }

    public final String getImportantAccessibility() {
        return this.importantAccessibility;
    }

    public final String getInchesAccessibility() {
        return this.inchesAccessibility;
    }

    public final String getInchesToReplaceAccessibility() {
        return this.inchesToReplaceAccessibility;
    }

    public final String getJoinCta() {
        return this.joinCta;
    }

    public final String getLoading() {
        return this.loading;
    }

    public final String getMyStatusCta() {
        return this.myStatusCta;
    }

    public final String getNextQueueAlert() {
        return this.nextQueueAlert;
    }

    public final String getNextQueueAlertOpensAt() {
        return this.nextQueueAlertOpensAt;
    }

    public final String getNextQueueOpens() {
        return this.nextQueueOpens;
    }

    public final String getNoLocationDetail() {
        return this.noLocationDetail;
    }

    public final String getNoQueuesDetail() {
        return this.noQueuesDetail;
    }

    public final String getNoQueuesTitle() {
        return this.noQueuesTitle;
    }

    public final String getNonOperationalMessage() {
        return this.nonOperationalMessage;
    }

    public final String getNotInRegionDetail() {
        return this.notInRegionDetail;
    }

    public final String getParkTabAccessibilityAndroid() {
        return this.parkTabAccessibilityAndroid;
    }

    public final String getParkTabSelectedAccessibilityAndroid() {
        return this.parkTabSelectedAccessibilityAndroid;
    }

    public final String getPartyCreationCta() {
        return this.partyCreationCta;
    }

    public final String getProjectedWait() {
        return this.projectedWait;
    }

    public final String getProjectedWaitRange() {
        return this.projectedWaitRange;
    }

    public final String getProjectedWaitSingle() {
        return this.projectedWaitSingle;
    }

    public final String getQueueUnavailableMessage() {
        return this.queueUnavailableMessage;
    }

    public final String getSelectQueueClosedForTheDay() {
        return this.selectQueueClosedForTheDay;
    }

    public final ImageUrlData getThumbUrlData() {
        return this.thumbUrlData;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setAdmittingGroup(String str) {
        this.admittingGroup = str;
    }

    public final void setAdmittingGroupBlank(String str) {
        this.admittingGroupBlank = str;
    }

    public final void setAdmittingGroupRange(String str) {
        this.admittingGroupRange = str;
    }

    public final void setAdmittingGroupSingle(String str) {
        this.admittingGroupSingle = str;
    }

    public final void setAdmittingGroups(String str) {
        this.admittingGroups = str;
    }

    public final void setDowntimeBoarding(String str) {
        this.downtimeBoarding = str;
    }

    public final void setEnableLocationCta(String str) {
        this.enableLocationCta = str;
    }

    public final void setEnableLocationDetail(String str) {
        this.enableLocationDetail = str;
    }

    public final void setGuestMustBeAccessibility(String str) {
        this.guestMustBeAccessibility = str;
    }

    public final void setHeightRestrictions(String str) {
        this.heightRestrictions = str;
    }

    public final void setHowToEnterDetail(String str) {
        this.howToEnterDetail = str;
    }

    public final void setHowToEnterTitle(String str) {
        this.howToEnterTitle = str;
    }

    public final void setIcons(QueueIcons queueIcons) {
        Intrinsics.checkNotNullParameter(queueIcons, "<set-?>");
        this.icons = queueIcons;
    }

    public final void setImportantAccessibility(String str) {
        this.importantAccessibility = str;
    }

    public final void setInchesAccessibility(String str) {
        this.inchesAccessibility = str;
    }

    public final void setInchesToReplaceAccessibility(String str) {
        this.inchesToReplaceAccessibility = str;
    }

    public final void setJoinCta(String str) {
        this.joinCta = str;
    }

    public final void setLoading(String str) {
        this.loading = str;
    }

    public final void setMyStatusCta(String str) {
        this.myStatusCta = str;
    }

    public final void setNextQueueAlert(String str) {
        this.nextQueueAlert = str;
    }

    public final void setNextQueueAlertOpensAt(String str) {
        this.nextQueueAlertOpensAt = str;
    }

    public final void setNextQueueOpens(String str) {
        this.nextQueueOpens = str;
    }

    public final void setNoLocationDetail(String str) {
        this.noLocationDetail = str;
    }

    public final void setNoQueuesDetail(String str) {
        this.noQueuesDetail = str;
    }

    public final void setNoQueuesTitle(String str) {
        this.noQueuesTitle = str;
    }

    public final void setNonOperationalMessage(String str) {
        this.nonOperationalMessage = str;
    }

    public final void setNotInRegionDetail(String str) {
        this.notInRegionDetail = str;
    }

    public final void setParkTabAccessibilityAndroid(String str) {
        this.parkTabAccessibilityAndroid = str;
    }

    public final void setParkTabSelectedAccessibilityAndroid(String str) {
        this.parkTabSelectedAccessibilityAndroid = str;
    }

    public final void setPartyCreationCta(String str) {
        this.partyCreationCta = str;
    }

    public final void setProjectedWait(String str) {
        this.projectedWait = str;
    }

    public final void setProjectedWaitRange(String str) {
        this.projectedWaitRange = str;
    }

    public final void setProjectedWaitSingle(String str) {
        this.projectedWaitSingle = str;
    }

    public final void setQueueUnavailableMessage(String str) {
        this.queueUnavailableMessage = str;
    }

    public final void setSelectQueueClosedForTheDay(String str) {
        this.selectQueueClosedForTheDay = str;
    }

    public final void setThumbUrlData(ImageUrlData imageUrlData) {
        this.thumbUrlData = imageUrlData;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}