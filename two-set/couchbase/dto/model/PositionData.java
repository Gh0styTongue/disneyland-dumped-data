package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b>\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u0082\u00012\u00020\u0001:\u0004\u0082\u0001\u0083\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001c\u0010?\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\"\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020IX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010E\"\u0004\bP\u0010GR\u0013\u0010Q\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0006R\u0013\u0010S\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0006R\u001c\u0010U\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0006\"\u0004\bW\u0010\bR\u001c\u0010X\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0006\"\u0004\bZ\u0010\bR\u001c\u0010[\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0006\"\u0004\b]\u0010\bR\u001c\u0010^\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0006\"\u0004\b`\u0010\bR\u001c\u0010a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0006\"\u0004\bc\u0010\bR\u0013\u0010d\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010\u0006R\"\u0010f\u001a\n\u0012\u0004\u0012\u00020g\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010E\"\u0004\bi\u0010GR\u001c\u0010j\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0006\"\u0004\bl\u0010\bR\u001c\u0010m\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0006\"\u0004\bo\u0010\bR\u001c\u0010p\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u0006\"\u0004\br\u0010\bR\u001c\u0010s\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u0006\"\u0004\bu\u0010\bR\u001c\u0010v\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u0006\"\u0004\bx\u0010\bR\u001c\u0010y\u001a\u0004\u0018\u00010zX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001e\u0010\u007f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u0006\"\u0005\b\u0081\u0001\u0010\b¨\u0006\u0084\u0001"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/PositionData;", "", "()V", "admittingGroup", "", "getAdmittingGroup", "()Ljava/lang/String;", "setAdmittingGroup", "(Ljava/lang/String;)V", "admittingGroupBlank", "getAdmittingGroupBlank", "setAdmittingGroupBlank", "admittingGroupRange", "getAdmittingGroupRange", "setAdmittingGroupRange", "admittingGroupSingle", "getAdmittingGroupSingle", "setAdmittingGroupSingle", "admittingGroups", "getAdmittingGroups", "setAdmittingGroups", "anonymousNumberOfGuests", "getAnonymousNumberOfGuests", "setAnonymousNumberOfGuests", "backupGroup", "getBackupGroup", "setBackupGroup", "backupGroupStatus", "getBackupGroupStatus", "setBackupGroupStatus", "descriptionAccessibility", "getDescriptionAccessibility", "setDescriptionAccessibility", "downtimeAlert", "getDowntimeAlert", "setDowntimeAlert", "downtimeBoarding", "getDowntimeBoarding", "setDowntimeBoarding", "estimatedWaitRange", "getEstimatedWaitRange", "setEstimatedWaitRange", "estimatedWaitSingle", "getEstimatedWaitSingle", "setEstimatedWaitSingle", "experienceAccessibility", "getExperienceAccessibility", "setExperienceAccessibility", "experienceWithParkAccessibility", "getExperienceWithParkAccessibility", "setExperienceWithParkAccessibility", "expired", "getExpired", "setExpired", "fullName", "getFullName", "setFullName", "getDirectionsCta", "getGetDirectionsCta", "setGetDirectionsCta", "group", "getGroup", "setGroup", "guestAccessibility", "getGuestAccessibility", "setGuestAccessibility", "humorAnimUrls", "", "getHumorAnimUrls", "()Ljava/util/List;", "setHumorAnimUrls", "(Ljava/util/List;)V", "icons", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/PositionData$PositionIcons;", "getIcons", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/PositionData$PositionIcons;", "setIcons", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/PositionData$PositionIcons;)V", "idleAnimUrls", "getIdleAnimUrls", "setIdleAnimUrls", "infoLinkText", "getInfoLinkText", "infoLinkUrl", "getInfoLinkUrl", "loading", "getLoading", "setLoading", "loadingFailed", "getLoadingFailed", "setLoadingFailed", "partyHeader", "getPartyHeader", "setPartyHeader", "partyHeaderCloseAccessibility", "getPartyHeaderCloseAccessibility", "setPartyHeaderCloseAccessibility", "partyHeaderOpenAccessibility", "getPartyHeaderOpenAccessibility", "setPartyHeaderOpenAccessibility", "pnoMessage", "getPnoMessage", "progress", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ProgressData;", "getProgress", "setProgress", "redeemCta", "getRedeemCta", "setRedeemCta", "releasedGroupStatus", "getReleasedGroupStatus", "setReleasedGroupStatus", "removeGuest", "getRemoveGuest", "setRemoveGuest", "returnAnytime", "getReturnAnytime", "setReturnAnytime", "returnBy", "getReturnBy", "setReturnBy", "staticImageUrlData", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "getStaticImageUrlData", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "setStaticImageUrlData", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;)V", "viewEntryCodeCta", "getViewEntryCodeCta", "setViewEntryCodeCta", "Companion", "PositionIcons", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class PositionData {
    public static final String HUMOR_ANIM_URLS_KEY = "humorAnimUrls";
    public static final String IDLE_ANIM_URLS_KEY = "idleAnimUrls";
    public static final String KEY = "position";
    public static final String STATIC_IMAGE_URL_KEY = "staticImageUrl";
    private String admittingGroup;
    private String admittingGroupBlank;
    private String admittingGroupRange;
    private String admittingGroupSingle;
    private String admittingGroups;
    private String anonymousNumberOfGuests;
    private String backupGroup;
    private String backupGroupStatus;
    private String descriptionAccessibility;
    private String downtimeAlert;
    private String downtimeBoarding;
    private String estimatedWaitRange;
    private String estimatedWaitSingle;
    private String experienceAccessibility;
    private String experienceWithParkAccessibility;
    private String expired;
    private String fullName;
    private String getDirectionsCta;
    private String group;
    private String guestAccessibility;
    private List<String> humorAnimUrls;
    private PositionIcons icons = new PositionIcons();
    private List<String> idleAnimUrls;
    private final String infoLinkText;
    private final String infoLinkUrl;
    private String loading;
    private String loadingFailed;
    private String partyHeader;
    private String partyHeaderCloseAccessibility;
    private String partyHeaderOpenAccessibility;
    private final String pnoMessage;
    private List<ProgressData> progress;
    private String redeemCta;
    private String releasedGroupStatus;
    private String removeGuest;
    private String returnAnytime;
    private String returnBy;
    private ImageUrlData staticImageUrlData;
    private String viewEntryCodeCta;
    public static final int $stable = 8;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/PositionData$PositionIcons;", "", "()V", "backupGroupIcon", "", "getBackupGroupIcon", "()Ljava/lang/String;", "setBackupGroupIcon", "(Ljava/lang/String;)V", "imagePlaceholderIcon", "getImagePlaceholderIcon", "setImagePlaceholderIcon", "releasedGroupIcon", "getReleasedGroupIcon", "setReleasedGroupIcon", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public static final class PositionIcons {
        public static final int $stable = 8;
        private String backupGroupIcon;
        private String imagePlaceholderIcon;
        private String releasedGroupIcon;

        public final String getBackupGroupIcon() {
            return this.backupGroupIcon;
        }

        public final String getImagePlaceholderIcon() {
            return this.imagePlaceholderIcon;
        }

        public final String getReleasedGroupIcon() {
            return this.releasedGroupIcon;
        }

        public final void setBackupGroupIcon(String str) {
            this.backupGroupIcon = str;
        }

        public final void setImagePlaceholderIcon(String str) {
            this.imagePlaceholderIcon = str;
        }

        public final void setReleasedGroupIcon(String str) {
            this.releasedGroupIcon = str;
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

    public final String getAnonymousNumberOfGuests() {
        return this.anonymousNumberOfGuests;
    }

    public final String getBackupGroup() {
        return this.backupGroup;
    }

    public final String getBackupGroupStatus() {
        return this.backupGroupStatus;
    }

    public final String getDescriptionAccessibility() {
        return this.descriptionAccessibility;
    }

    public final String getDowntimeAlert() {
        return this.downtimeAlert;
    }

    public final String getDowntimeBoarding() {
        return this.downtimeBoarding;
    }

    public final String getEstimatedWaitRange() {
        return this.estimatedWaitRange;
    }

    public final String getEstimatedWaitSingle() {
        return this.estimatedWaitSingle;
    }

    public final String getExperienceAccessibility() {
        return this.experienceAccessibility;
    }

    public final String getExperienceWithParkAccessibility() {
        return this.experienceWithParkAccessibility;
    }

    public final String getExpired() {
        return this.expired;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getGetDirectionsCta() {
        return this.getDirectionsCta;
    }

    public final String getGroup() {
        return this.group;
    }

    public final String getGuestAccessibility() {
        return this.guestAccessibility;
    }

    public final List<String> getHumorAnimUrls() {
        return this.humorAnimUrls;
    }

    public final PositionIcons getIcons() {
        return this.icons;
    }

    public final List<String> getIdleAnimUrls() {
        return this.idleAnimUrls;
    }

    public final String getInfoLinkText() {
        return this.infoLinkText;
    }

    public final String getInfoLinkUrl() {
        return this.infoLinkUrl;
    }

    public final String getLoading() {
        return this.loading;
    }

    public final String getLoadingFailed() {
        return this.loadingFailed;
    }

    public final String getPartyHeader() {
        return this.partyHeader;
    }

    public final String getPartyHeaderCloseAccessibility() {
        return this.partyHeaderCloseAccessibility;
    }

    public final String getPartyHeaderOpenAccessibility() {
        return this.partyHeaderOpenAccessibility;
    }

    public final String getPnoMessage() {
        return this.pnoMessage;
    }

    public final List<ProgressData> getProgress() {
        return this.progress;
    }

    public final String getRedeemCta() {
        return this.redeemCta;
    }

    public final String getReleasedGroupStatus() {
        return this.releasedGroupStatus;
    }

    public final String getRemoveGuest() {
        return this.removeGuest;
    }

    public final String getReturnAnytime() {
        return this.returnAnytime;
    }

    public final String getReturnBy() {
        return this.returnBy;
    }

    public final ImageUrlData getStaticImageUrlData() {
        return this.staticImageUrlData;
    }

    public final String getViewEntryCodeCta() {
        return this.viewEntryCodeCta;
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

    public final void setAnonymousNumberOfGuests(String str) {
        this.anonymousNumberOfGuests = str;
    }

    public final void setBackupGroup(String str) {
        this.backupGroup = str;
    }

    public final void setBackupGroupStatus(String str) {
        this.backupGroupStatus = str;
    }

    public final void setDescriptionAccessibility(String str) {
        this.descriptionAccessibility = str;
    }

    public final void setDowntimeAlert(String str) {
        this.downtimeAlert = str;
    }

    public final void setDowntimeBoarding(String str) {
        this.downtimeBoarding = str;
    }

    public final void setEstimatedWaitRange(String str) {
        this.estimatedWaitRange = str;
    }

    public final void setEstimatedWaitSingle(String str) {
        this.estimatedWaitSingle = str;
    }

    public final void setExperienceAccessibility(String str) {
        this.experienceAccessibility = str;
    }

    public final void setExperienceWithParkAccessibility(String str) {
        this.experienceWithParkAccessibility = str;
    }

    public final void setExpired(String str) {
        this.expired = str;
    }

    public final void setFullName(String str) {
        this.fullName = str;
    }

    public final void setGetDirectionsCta(String str) {
        this.getDirectionsCta = str;
    }

    public final void setGroup(String str) {
        this.group = str;
    }

    public final void setGuestAccessibility(String str) {
        this.guestAccessibility = str;
    }

    public final void setHumorAnimUrls(List<String> list) {
        this.humorAnimUrls = list;
    }

    public final void setIcons(PositionIcons positionIcons) {
        Intrinsics.checkNotNullParameter(positionIcons, "<set-?>");
        this.icons = positionIcons;
    }

    public final void setIdleAnimUrls(List<String> list) {
        this.idleAnimUrls = list;
    }

    public final void setLoading(String str) {
        this.loading = str;
    }

    public final void setLoadingFailed(String str) {
        this.loadingFailed = str;
    }

    public final void setPartyHeader(String str) {
        this.partyHeader = str;
    }

    public final void setPartyHeaderCloseAccessibility(String str) {
        this.partyHeaderCloseAccessibility = str;
    }

    public final void setPartyHeaderOpenAccessibility(String str) {
        this.partyHeaderOpenAccessibility = str;
    }

    public final void setProgress(List<ProgressData> list) {
        this.progress = list;
    }

    public final void setRedeemCta(String str) {
        this.redeemCta = str;
    }

    public final void setReleasedGroupStatus(String str) {
        this.releasedGroupStatus = str;
    }

    public final void setRemoveGuest(String str) {
        this.removeGuest = str;
    }

    public final void setReturnAnytime(String str) {
        this.returnAnytime = str;
    }

    public final void setReturnBy(String str) {
        this.returnBy = str;
    }

    public final void setStaticImageUrlData(ImageUrlData imageUrlData) {
        this.staticImageUrlData = imageUrlData;
    }

    public final void setViewEntryCodeCta(String str) {
        this.viewEntryCodeCta = str;
    }
}