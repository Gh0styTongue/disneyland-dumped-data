package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.disney.wdpro.hawkeye.p136ui.hub.magicbands.factory.HawkeyeMagicBandsUIModelFactoryImpl;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b5\b\u0007\u0018\u0000 g2\u00020\u0001:\u0002ghB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001c\u0010?\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001c\u0010B\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001c\u0010E\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001c\u0010H\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001c\u0010K\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001c\u0010N\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u0013\u0010Q\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0006R\u001c\u0010S\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0006\"\u0004\bU\u0010\bR\u001c\u0010V\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0006\"\u0004\bX\u0010\bR\u0013\u0010Y\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u0006R\u001c\u0010[\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0006\"\u0004\b]\u0010\bR\u001c\u0010^\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0006\"\u0004\b`\u0010\bR\u001c\u0010a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0006\"\u0004\bc\u0010\bR\u001c\u0010d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0006\"\u0004\bf\u0010\b¨\u0006i"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CreatePartyData;", "", "()V", "alternateCta", "", "getAlternateCta", "()Ljava/lang/String;", "setAlternateCta", "(Ljava/lang/String;)V", "alternateNotInPartyHeader", "getAlternateNotInPartyHeader", "setAlternateNotInPartyHeader", "anonymousDecreaseGuestsButtonAccessibility", "getAnonymousDecreaseGuestsButtonAccessibility", "setAnonymousDecreaseGuestsButtonAccessibility", "anonymousIncreaseGuestsButtonAccessibility", "getAnonymousIncreaseGuestsButtonAccessibility", "setAnonymousIncreaseGuestsButtonAccessibility", "emptyListDetail", "getEmptyListDetail", "setEmptyListDetail", "guestAddedAccessibility", "getGuestAddedAccessibility", "setGuestAddedAccessibility", "guestCheckedAccessibility", "getGuestCheckedAccessibility", "setGuestCheckedAccessibility", "guestCountInstructionalDetail", "getGuestCountInstructionalDetail", "setGuestCountInstructionalDetail", "guestCountWarningDetail", "getGuestCountWarningDetail", "setGuestCountWarningDetail", "guestIneligibleAccessibility", "getGuestIneligibleAccessibility", "setGuestIneligibleAccessibility", "guestMustBeAccessibility", "getGuestMustBeAccessibility", "setGuestMustBeAccessibility", "guestRemovedAccessibility", "getGuestRemovedAccessibility", "setGuestRemovedAccessibility", "guestUncheckedAccessibilityAndroid", "getGuestUncheckedAccessibilityAndroid", "setGuestUncheckedAccessibilityAndroid", "header", "getHeader", "setHeader", "headerWithDeepLink", "getHeaderWithDeepLink", "setHeaderWithDeepLink", "icons", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CreatePartyData$CreatePartyIcons;", "getIcons", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CreatePartyData$CreatePartyIcons;", "setIcons", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CreatePartyData$CreatePartyIcons;)V", "importantAccessibility", "getImportantAccessibility", "setImportantAccessibility", "joinLoading", "getJoinLoading", "setJoinLoading", "linkTicketCta", "getLinkTicketCta", "setLinkTicketCta", "loading", "getLoading", "setLoading", "mainCta", "getMainCta", "setMainCta", "maxPartySizeExceededMessage", "getMaxPartySizeExceededMessage", "setMaxPartySizeExceededMessage", "notEligibleHeader", "getNotEligibleHeader", "setNotEligibleHeader", "notInPartyHeader", "getNotInPartyHeader", "setNotInPartyHeader", "passFor", "getPassFor", "selectAll", "getSelectAll", "setSelectAll", "ticketAlternateNameAccessibility", "getTicketAlternateNameAccessibility", "setTicketAlternateNameAccessibility", "ticketFor", "getTicketFor", "totalGuestsHeader", "getTotalGuestsHeader", "setTotalGuestsHeader", "yourPartyHeader", "getYourPartyHeader", "setYourPartyHeader", "yourPartyHeaderAccessibility", "getYourPartyHeaderAccessibility", "setYourPartyHeaderAccessibility", "yourPartySizeHeader", "getYourPartySizeHeader", "setYourPartySizeHeader", "Companion", "CreatePartyIcons", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class CreatePartyData {
    public static final String KEY = "createParty";
    private String alternateCta;
    private String alternateNotInPartyHeader;
    private String anonymousDecreaseGuestsButtonAccessibility;
    private String anonymousIncreaseGuestsButtonAccessibility;
    private String emptyListDetail;
    private String guestAddedAccessibility;
    private String guestCheckedAccessibility;
    private String guestCountInstructionalDetail;
    private String guestCountWarningDetail;
    private String guestIneligibleAccessibility;
    private String guestMustBeAccessibility;
    private String guestRemovedAccessibility;
    private String guestUncheckedAccessibilityAndroid;
    private String header;
    private String headerWithDeepLink;
    private CreatePartyIcons icons = new CreatePartyIcons();
    private String importantAccessibility;
    private String joinLoading;
    private String linkTicketCta;
    private String loading;
    private String mainCta;
    private String maxPartySizeExceededMessage;
    private String notEligibleHeader;
    private String notInPartyHeader;
    private final String passFor;
    private String selectAll;
    private String ticketAlternateNameAccessibility;
    private final String ticketFor;
    private String totalGuestsHeader;
    private String yourPartyHeader;
    private String yourPartyHeaderAccessibility;
    private String yourPartySizeHeader;
    public static final int $stable = 8;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CreatePartyData$CreatePartyIcons;", "", "()V", "guestPassIcon", "", "getGuestPassIcon", "()Ljava/lang/String;", "setGuestPassIcon", "(Ljava/lang/String;)V", "maxPartyIcon", "getMaxPartyIcon", "setMaxPartyIcon", "parkingIcon", "getParkingIcon", "setParkingIcon", HawkeyeMagicBandsUIModelFactoryImpl.PEPTASIA_CODE_PASS, "getPassIcon", "setPassIcon", HawkeyeMagicBandsUIModelFactoryImpl.PEPTASIA_CODE_SPECIAL_EVENT, "getSpecialEventIcon", "setSpecialEventIcon", HawkeyeMagicBandsUIModelFactoryImpl.PEPTASIA_CODE_TICKET, "getTicketIcon", "setTicketIcon", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public static final class CreatePartyIcons {
        public static final int $stable = 8;
        private String guestPassIcon;
        private String maxPartyIcon;
        private String parkingIcon;
        private String passIcon;
        private String specialEventIcon;
        private String ticketIcon;

        public final String getGuestPassIcon() {
            return this.guestPassIcon;
        }

        public final String getMaxPartyIcon() {
            return this.maxPartyIcon;
        }

        public final String getParkingIcon() {
            return this.parkingIcon;
        }

        public final String getPassIcon() {
            return this.passIcon;
        }

        public final String getSpecialEventIcon() {
            return this.specialEventIcon;
        }

        public final String getTicketIcon() {
            return this.ticketIcon;
        }

        public final void setGuestPassIcon(String str) {
            this.guestPassIcon = str;
        }

        public final void setMaxPartyIcon(String str) {
            this.maxPartyIcon = str;
        }

        public final void setParkingIcon(String str) {
            this.parkingIcon = str;
        }

        public final void setPassIcon(String str) {
            this.passIcon = str;
        }

        public final void setSpecialEventIcon(String str) {
            this.specialEventIcon = str;
        }

        public final void setTicketIcon(String str) {
            this.ticketIcon = str;
        }
    }

    public final String getAlternateCta() {
        return this.alternateCta;
    }

    public final String getAlternateNotInPartyHeader() {
        return this.alternateNotInPartyHeader;
    }

    public final String getAnonymousDecreaseGuestsButtonAccessibility() {
        return this.anonymousDecreaseGuestsButtonAccessibility;
    }

    public final String getAnonymousIncreaseGuestsButtonAccessibility() {
        return this.anonymousIncreaseGuestsButtonAccessibility;
    }

    public final String getEmptyListDetail() {
        return this.emptyListDetail;
    }

    public final String getGuestAddedAccessibility() {
        return this.guestAddedAccessibility;
    }

    public final String getGuestCheckedAccessibility() {
        return this.guestCheckedAccessibility;
    }

    public final String getGuestCountInstructionalDetail() {
        return this.guestCountInstructionalDetail;
    }

    public final String getGuestCountWarningDetail() {
        return this.guestCountWarningDetail;
    }

    public final String getGuestIneligibleAccessibility() {
        return this.guestIneligibleAccessibility;
    }

    public final String getGuestMustBeAccessibility() {
        return this.guestMustBeAccessibility;
    }

    public final String getGuestRemovedAccessibility() {
        return this.guestRemovedAccessibility;
    }

    public final String getGuestUncheckedAccessibilityAndroid() {
        return this.guestUncheckedAccessibilityAndroid;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getHeaderWithDeepLink() {
        return this.headerWithDeepLink;
    }

    public final CreatePartyIcons getIcons() {
        return this.icons;
    }

    public final String getImportantAccessibility() {
        return this.importantAccessibility;
    }

    public final String getJoinLoading() {
        return this.joinLoading;
    }

    public final String getLinkTicketCta() {
        return this.linkTicketCta;
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

    public final String getNotEligibleHeader() {
        return this.notEligibleHeader;
    }

    public final String getNotInPartyHeader() {
        return this.notInPartyHeader;
    }

    public final String getPassFor() {
        return this.passFor;
    }

    public final String getSelectAll() {
        return this.selectAll;
    }

    public final String getTicketAlternateNameAccessibility() {
        return this.ticketAlternateNameAccessibility;
    }

    public final String getTicketFor() {
        return this.ticketFor;
    }

    public final String getTotalGuestsHeader() {
        return this.totalGuestsHeader;
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

    public final void setAlternateNotInPartyHeader(String str) {
        this.alternateNotInPartyHeader = str;
    }

    public final void setAnonymousDecreaseGuestsButtonAccessibility(String str) {
        this.anonymousDecreaseGuestsButtonAccessibility = str;
    }

    public final void setAnonymousIncreaseGuestsButtonAccessibility(String str) {
        this.anonymousIncreaseGuestsButtonAccessibility = str;
    }

    public final void setEmptyListDetail(String str) {
        this.emptyListDetail = str;
    }

    public final void setGuestAddedAccessibility(String str) {
        this.guestAddedAccessibility = str;
    }

    public final void setGuestCheckedAccessibility(String str) {
        this.guestCheckedAccessibility = str;
    }

    public final void setGuestCountInstructionalDetail(String str) {
        this.guestCountInstructionalDetail = str;
    }

    public final void setGuestCountWarningDetail(String str) {
        this.guestCountWarningDetail = str;
    }

    public final void setGuestIneligibleAccessibility(String str) {
        this.guestIneligibleAccessibility = str;
    }

    public final void setGuestMustBeAccessibility(String str) {
        this.guestMustBeAccessibility = str;
    }

    public final void setGuestRemovedAccessibility(String str) {
        this.guestRemovedAccessibility = str;
    }

    public final void setGuestUncheckedAccessibilityAndroid(String str) {
        this.guestUncheckedAccessibilityAndroid = str;
    }

    public final void setHeader(String str) {
        this.header = str;
    }

    public final void setHeaderWithDeepLink(String str) {
        this.headerWithDeepLink = str;
    }

    public final void setIcons(CreatePartyIcons createPartyIcons) {
        Intrinsics.checkNotNullParameter(createPartyIcons, "<set-?>");
        this.icons = createPartyIcons;
    }

    public final void setImportantAccessibility(String str) {
        this.importantAccessibility = str;
    }

    public final void setJoinLoading(String str) {
        this.joinLoading = str;
    }

    public final void setLinkTicketCta(String str) {
        this.linkTicketCta = str;
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

    public final void setNotEligibleHeader(String str) {
        this.notEligibleHeader = str;
    }

    public final void setNotInPartyHeader(String str) {
        this.notInPartyHeader = str;
    }

    public final void setSelectAll(String str) {
        this.selectAll = str;
    }

    public final void setTicketAlternateNameAccessibility(String str) {
        this.ticketAlternateNameAccessibility = str;
    }

    public final void setTotalGuestsHeader(String str) {
        this.totalGuestsHeader = str;
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