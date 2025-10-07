package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.disney.wdpro.universal_checkout_ui.p459ui.Constants;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bH\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0002YZB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u0013\u00106\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0006R\u001c\u00108\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001c\u0010;\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR\u001c\u0010>\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0006\"\u0004\b@\u0010\bR\u001c\u0010A\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\bR\u001c\u0010D\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0006\"\u0004\bF\u0010\bR\u001c\u0010G\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0006\"\u0004\bI\u0010\bR\u001c\u0010J\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0006\"\u0004\bL\u0010\bR\u001c\u0010M\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0006\"\u0004\bO\u0010\bR\u001c\u0010P\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0006\"\u0004\bR\u0010\bR\u001c\u0010S\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0006\"\u0004\bU\u0010\bR\u001c\u0010V\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0006\"\u0004\bX\u0010\b¨\u0006["}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ReviewDetailsData;", "", "()V", "alternateCta", "", "getAlternateCta", "()Ljava/lang/String;", "setAlternateCta", "(Ljava/lang/String;)V", "changePartyCta", "getChangePartyCta", "setChangePartyCta", "header", "getHeader", "setHeader", "howToEnterTitle", "getHowToEnterTitle", "setHowToEnterTitle", "icons", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ReviewDetailsData$ReviewDetailsIcons;", "getIcons", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ReviewDetailsData$ReviewDetailsIcons;", "setIcons", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ReviewDetailsData$ReviewDetailsIcons;)V", "importantAccessibility", "getImportantAccessibility", "setImportantAccessibility", "ineligibleGuestsHeader", "getIneligibleGuestsHeader", "setIneligibleGuestsHeader", "ineligibleGuestsWarningText", "getIneligibleGuestsWarningText", "setIneligibleGuestsWarningText", "joinLoading", "getJoinLoading", "setJoinLoading", "launching", "getLaunching", "setLaunching", "loading", "getLoading", "setLoading", "mainCta", "getMainCta", "setMainCta", "maxPartySizeExceededMessage", "getMaxPartySizeExceededMessage", "setMaxPartySizeExceededMessage", "noEligibleGuestsWarningText", "getNoEligibleGuestsWarningText", "setNoEligibleGuestsWarningText", "noLinkedTicketsOrPasses", "getNoLinkedTicketsOrPasses", "setNoLinkedTicketsOrPasses", "queueUnavailableMessage", "getQueueUnavailableMessage", "refreshDetailsMessage", "getRefreshDetailsMessage", "setRefreshDetailsMessage", "selectGuestsWarningText", "getSelectGuestsWarningText", "setSelectGuestsWarningText", "updateScreenWarningMessage", "getUpdateScreenWarningMessage", "setUpdateScreenWarningMessage", "updateScreenWarningMessageDefault", "getUpdateScreenWarningMessageDefault", "setUpdateScreenWarningMessageDefault", "updateScreenWarningTitle", "getUpdateScreenWarningTitle", "setUpdateScreenWarningTitle", Constants.BUNDLE_SYNC_STATUS_UPDATED, "getUpdated", "setUpdated", "validOn", "getValidOn", "setValidOn", "vqHeaderTitle", "getVqHeaderTitle", "setVqHeaderTitle", "yourPartyHeader", "getYourPartyHeader", "setYourPartyHeader", "yourPartyHeaderAccessibility", "getYourPartyHeaderAccessibility", "setYourPartyHeaderAccessibility", "yourPartySizeHeader", "getYourPartySizeHeader", "setYourPartySizeHeader", "Companion", "ReviewDetailsIcons", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class ReviewDetailsData {
    public static final String KEY = "reviewDetails";
    private String alternateCta;
    private String changePartyCta;
    private String header;
    private String howToEnterTitle;
    private ReviewDetailsIcons icons = new ReviewDetailsIcons();
    private String importantAccessibility;
    private String ineligibleGuestsHeader;
    private String ineligibleGuestsWarningText;
    private String joinLoading;
    private String launching;
    private String loading;
    private String mainCta;
    private String maxPartySizeExceededMessage;
    private String noEligibleGuestsWarningText;
    private String noLinkedTicketsOrPasses;
    private final String queueUnavailableMessage;
    private String refreshDetailsMessage;
    private String selectGuestsWarningText;
    private String updateScreenWarningMessage;
    private String updateScreenWarningMessageDefault;
    private String updateScreenWarningTitle;
    private String updated;
    private String validOn;
    private String vqHeaderTitle;
    private String yourPartyHeader;
    private String yourPartyHeaderAccessibility;
    private String yourPartySizeHeader;
    public static final int $stable = 8;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ReviewDetailsData$ReviewDetailsIcons;", "", "()V", "ineligibleGuestsIcon", "", "getIneligibleGuestsIcon", "()Ljava/lang/String;", "setIneligibleGuestsIcon", "(Ljava/lang/String;)V", "selectGuestsIcon", "getSelectGuestsIcon", "setSelectGuestsIcon", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public static final class ReviewDetailsIcons {
        public static final int $stable = 8;
        private String ineligibleGuestsIcon;
        private String selectGuestsIcon;

        public final String getIneligibleGuestsIcon() {
            return this.ineligibleGuestsIcon;
        }

        public final String getSelectGuestsIcon() {
            return this.selectGuestsIcon;
        }

        public final void setIneligibleGuestsIcon(String str) {
            this.ineligibleGuestsIcon = str;
        }

        public final void setSelectGuestsIcon(String str) {
            this.selectGuestsIcon = str;
        }
    }

    public final String getAlternateCta() {
        return this.alternateCta;
    }

    public final String getChangePartyCta() {
        return this.changePartyCta;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getHowToEnterTitle() {
        return this.howToEnterTitle;
    }

    public final ReviewDetailsIcons getIcons() {
        return this.icons;
    }

    public final String getImportantAccessibility() {
        return this.importantAccessibility;
    }

    public final String getIneligibleGuestsHeader() {
        return this.ineligibleGuestsHeader;
    }

    public final String getIneligibleGuestsWarningText() {
        return this.ineligibleGuestsWarningText;
    }

    public final String getJoinLoading() {
        return this.joinLoading;
    }

    public final String getLaunching() {
        return this.launching;
    }

    public final String getLoading() {
        return this.loading;
    }

    public final String getMainCta() {
        return this.mainCta;
    }

    public final String getMaxPartySizeExceededMessage() {
        return this.maxPartySizeExceededMessage;
    }

    public final String getNoEligibleGuestsWarningText() {
        return this.noEligibleGuestsWarningText;
    }

    public final String getNoLinkedTicketsOrPasses() {
        return this.noLinkedTicketsOrPasses;
    }

    public final String getQueueUnavailableMessage() {
        return this.queueUnavailableMessage;
    }

    public final String getRefreshDetailsMessage() {
        return this.refreshDetailsMessage;
    }

    public final String getSelectGuestsWarningText() {
        return this.selectGuestsWarningText;
    }

    public final String getUpdateScreenWarningMessage() {
        return this.updateScreenWarningMessage;
    }

    public final String getUpdateScreenWarningMessageDefault() {
        return this.updateScreenWarningMessageDefault;
    }

    public final String getUpdateScreenWarningTitle() {
        return this.updateScreenWarningTitle;
    }

    public final String getUpdated() {
        return this.updated;
    }

    public final String getValidOn() {
        return this.validOn;
    }

    public final String getVqHeaderTitle() {
        return this.vqHeaderTitle;
    }

    public final String getYourPartyHeader() {
        return this.yourPartyHeader;
    }

    public final String getYourPartyHeaderAccessibility() {
        return this.yourPartyHeaderAccessibility;
    }

    public final String getYourPartySizeHeader() {
        return this.yourPartySizeHeader;
    }

    public final void setAlternateCta(String str) {
        this.alternateCta = str;
    }

    public final void setChangePartyCta(String str) {
        this.changePartyCta = str;
    }

    public final void setHeader(String str) {
        this.header = str;
    }

    public final void setHowToEnterTitle(String str) {
        this.howToEnterTitle = str;
    }

    public final void setIcons(ReviewDetailsIcons reviewDetailsIcons) {
        Intrinsics.checkNotNullParameter(reviewDetailsIcons, "<set-?>");
        this.icons = reviewDetailsIcons;
    }

    public final void setImportantAccessibility(String str) {
        this.importantAccessibility = str;
    }

    public final void setIneligibleGuestsHeader(String str) {
        this.ineligibleGuestsHeader = str;
    }

    public final void setIneligibleGuestsWarningText(String str) {
        this.ineligibleGuestsWarningText = str;
    }

    public final void setJoinLoading(String str) {
        this.joinLoading = str;
    }

    public final void setLaunching(String str) {
        this.launching = str;
    }

    public final void setLoading(String str) {
        this.loading = str;
    }

    public final void setMainCta(String str) {
        this.mainCta = str;
    }

    public final void setMaxPartySizeExceededMessage(String str) {
        this.maxPartySizeExceededMessage = str;
    }

    public final void setNoEligibleGuestsWarningText(String str) {
        this.noEligibleGuestsWarningText = str;
    }

    public final void setNoLinkedTicketsOrPasses(String str) {
        this.noLinkedTicketsOrPasses = str;
    }

    public final void setRefreshDetailsMessage(String str) {
        this.refreshDetailsMessage = str;
    }

    public final void setSelectGuestsWarningText(String str) {
        this.selectGuestsWarningText = str;
    }

    public final void setUpdateScreenWarningMessage(String str) {
        this.updateScreenWarningMessage = str;
    }

    public final void setUpdateScreenWarningMessageDefault(String str) {
        this.updateScreenWarningMessageDefault = str;
    }

    public final void setUpdateScreenWarningTitle(String str) {
        this.updateScreenWarningTitle = str;
    }

    public final void setUpdated(String str) {
        this.updated = str;
    }

    public final void setValidOn(String str) {
        this.validOn = str;
    }

    public final void setVqHeaderTitle(String str) {
        this.vqHeaderTitle = str;
    }

    public final void setYourPartyHeader(String str) {
        this.yourPartyHeader = str;
    }

    public final void setYourPartyHeaderAccessibility(String str) {
        this.yourPartyHeaderAccessibility = str;
    }

    public final void setYourPartySizeHeader(String str) {
        this.yourPartySizeHeader = str;
    }
}