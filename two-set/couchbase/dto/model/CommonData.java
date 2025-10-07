package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 @2\u00020\u0001:\u0002?@B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001c\u0010+\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001c\u0010.\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001c\u00101\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001c\u00104\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR\u0013\u00107\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0006R\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\b¨\u0006A"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CommonData;", "", "()V", "allGuestsAddedAccessibility", "", "getAllGuestsAddedAccessibility", "()Ljava/lang/String;", "setAllGuestsAddedAccessibility", "(Ljava/lang/String;)V", "allGuestsRemovedAccessibility", "getAllGuestsRemovedAccessibility", "setAllGuestsRemovedAccessibility", "apiBaseUrl", "getApiBaseUrl", "setApiBaseUrl", "baseAssetPath", "getBaseAssetPath", "setBaseAssetPath", "checkedAccessibility", "getCheckedAccessibility", "setCheckedAccessibility", "dimmedCheckboxAccessibility", "getDimmedCheckboxAccessibility", "dimmedViewAccessibility", "getDimmedViewAccessibility", "setDimmedViewAccessibility", "guestMovedAccessibility", "getGuestMovedAccessibility", "setGuestMovedAccessibility", "headingAccessibility", "getHeadingAccessibility", "setHeadingAccessibility", "icons", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CommonData$CommonIcons;", "getIcons", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CommonData$CommonIcons;", "setIcons", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CommonData$CommonIcons;)V", "isMe", "setMe", CommonData.LOADING_ANIM_URL_KEY, "getLoadingAnimUrl", "setLoadingAnimUrl", "peekViewInstructionalText", "getPeekViewInstructionalText", "setPeekViewInstructionalText", "ptrTitleAccessibility", "getPtrTitleAccessibility", "setPtrTitleAccessibility", "qrCodeAccessibility", "getQrCodeAccessibility", "setQrCodeAccessibility", "selectAll", "getSelectAll", "setSelectAll", "selectAllCheckbox", "getSelectAllCheckbox", "uncheckedAccessibilityAndroid", "getUncheckedAccessibilityAndroid", "setUncheckedAccessibilityAndroid", "virtualQueueAccessibility", "getVirtualQueueAccessibility", "setVirtualQueueAccessibility", "CommonIcons", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class CommonData {
    public static final String KEY = "common";
    public static final String LOADING_ANIM_URL_KEY = "loadingAnimUrl";
    private String allGuestsAddedAccessibility;
    private String allGuestsRemovedAccessibility;
    private String apiBaseUrl;
    private String baseAssetPath;
    private String checkedAccessibility;
    private final String dimmedCheckboxAccessibility;
    private String dimmedViewAccessibility;
    private String guestMovedAccessibility;
    private String headingAccessibility;
    private CommonIcons icons = new CommonIcons();
    private String isMe;
    private String loadingAnimUrl;
    private String peekViewInstructionalText;
    private String ptrTitleAccessibility;
    private String qrCodeAccessibility;
    private String selectAll;
    private final String selectAllCheckbox;
    private String uncheckedAccessibilityAndroid;
    private String virtualQueueAccessibility;
    public static final int $stable = 8;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CommonData$CommonIcons;", "", "()V", "chevronIcon", "", "getChevronIcon", "()Ljava/lang/String;", "setChevronIcon", "(Ljava/lang/String;)V", "minusIcon", "getMinusIcon", "setMinusIcon", "plusIcon", "getPlusIcon", "setPlusIcon", "refreshIcon", "getRefreshIcon", "setRefreshIcon", "vqIcon", "getVqIcon", "setVqIcon", "warningIcon", "getWarningIcon", "setWarningIcon", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public static final class CommonIcons {
        public static final int $stable = 8;
        private String chevronIcon;
        private String minusIcon;
        private String plusIcon;
        private String refreshIcon;
        private String vqIcon;
        private String warningIcon;

        public final String getChevronIcon() {
            return this.chevronIcon;
        }

        public final String getMinusIcon() {
            return this.minusIcon;
        }

        public final String getPlusIcon() {
            return this.plusIcon;
        }

        public final String getRefreshIcon() {
            return this.refreshIcon;
        }

        public final String getVqIcon() {
            return this.vqIcon;
        }

        public final String getWarningIcon() {
            return this.warningIcon;
        }

        public final void setChevronIcon(String str) {
            this.chevronIcon = str;
        }

        public final void setMinusIcon(String str) {
            this.minusIcon = str;
        }

        public final void setPlusIcon(String str) {
            this.plusIcon = str;
        }

        public final void setRefreshIcon(String str) {
            this.refreshIcon = str;
        }

        public final void setVqIcon(String str) {
            this.vqIcon = str;
        }

        public final void setWarningIcon(String str) {
            this.warningIcon = str;
        }
    }

    public final String getAllGuestsAddedAccessibility() {
        return this.allGuestsAddedAccessibility;
    }

    public final String getAllGuestsRemovedAccessibility() {
        return this.allGuestsRemovedAccessibility;
    }

    public final String getApiBaseUrl() {
        return this.apiBaseUrl;
    }

    public final String getBaseAssetPath() {
        return this.baseAssetPath;
    }

    public final String getCheckedAccessibility() {
        return this.checkedAccessibility;
    }

    public final String getDimmedCheckboxAccessibility() {
        return this.dimmedCheckboxAccessibility;
    }

    public final String getDimmedViewAccessibility() {
        return this.dimmedViewAccessibility;
    }

    public final String getGuestMovedAccessibility() {
        return this.guestMovedAccessibility;
    }

    public final String getHeadingAccessibility() {
        return this.headingAccessibility;
    }

    public final CommonIcons getIcons() {
        return this.icons;
    }

    public final String getLoadingAnimUrl() {
        return this.loadingAnimUrl;
    }

    public final String getPeekViewInstructionalText() {
        return this.peekViewInstructionalText;
    }

    public final String getPtrTitleAccessibility() {
        return this.ptrTitleAccessibility;
    }

    public final String getQrCodeAccessibility() {
        return this.qrCodeAccessibility;
    }

    public final String getSelectAll() {
        return this.selectAll;
    }

    public final String getSelectAllCheckbox() {
        return this.selectAllCheckbox;
    }

    public final String getUncheckedAccessibilityAndroid() {
        return this.uncheckedAccessibilityAndroid;
    }

    public final String getVirtualQueueAccessibility() {
        return this.virtualQueueAccessibility;
    }

    /* renamed from: isMe, reason: from getter */
    public final String getIsMe() {
        return this.isMe;
    }

    public final void setAllGuestsAddedAccessibility(String str) {
        this.allGuestsAddedAccessibility = str;
    }

    public final void setAllGuestsRemovedAccessibility(String str) {
        this.allGuestsRemovedAccessibility = str;
    }

    public final void setApiBaseUrl(String str) {
        this.apiBaseUrl = str;
    }

    public final void setBaseAssetPath(String str) {
        this.baseAssetPath = str;
    }

    public final void setCheckedAccessibility(String str) {
        this.checkedAccessibility = str;
    }

    public final void setDimmedViewAccessibility(String str) {
        this.dimmedViewAccessibility = str;
    }

    public final void setGuestMovedAccessibility(String str) {
        this.guestMovedAccessibility = str;
    }

    public final void setHeadingAccessibility(String str) {
        this.headingAccessibility = str;
    }

    public final void setIcons(CommonIcons commonIcons) {
        Intrinsics.checkNotNullParameter(commonIcons, "<set-?>");
        this.icons = commonIcons;
    }

    public final void setLoadingAnimUrl(String str) {
        this.loadingAnimUrl = str;
    }

    public final void setMe(String str) {
        this.isMe = str;
    }

    public final void setPeekViewInstructionalText(String str) {
        this.peekViewInstructionalText = str;
    }

    public final void setPtrTitleAccessibility(String str) {
        this.ptrTitleAccessibility = str;
    }

    public final void setQrCodeAccessibility(String str) {
        this.qrCodeAccessibility = str;
    }

    public final void setSelectAll(String str) {
        this.selectAll = str;
    }

    public final void setUncheckedAccessibilityAndroid(String str) {
        this.uncheckedAccessibilityAndroid = str;
    }

    public final void setVirtualQueueAccessibility(String str) {
        this.virtualQueueAccessibility = str;
    }
}