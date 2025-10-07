package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.disney.wdpro.recommender.services.RecommenderServiceConstants;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b?\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001c\u0010?\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\b¨\u0006C"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/LeaveQueueData;", "", "()V", "anonymousCancelPartyCta", "", "getAnonymousCancelPartyCta", "()Ljava/lang/String;", "setAnonymousCancelPartyCta", "(Ljava/lang/String;)V", "anonymousConfirmationCancel", "getAnonymousConfirmationCancel", "setAnonymousConfirmationCancel", "anonymousConfirmationDetail", "getAnonymousConfirmationDetail", "setAnonymousConfirmationDetail", "anonymousConfirmationRemove", "getAnonymousConfirmationRemove", "setAnonymousConfirmationRemove", "anonymousConfirmationTitle", "getAnonymousConfirmationTitle", "setAnonymousConfirmationTitle", RecommenderServiceConstants.ANONYMOUS_PARTY_SIZE, "getAnonymousPartySize", "setAnonymousPartySize", "anonymousUpdatePartyCta", "getAnonymousUpdatePartyCta", "setAnonymousUpdatePartyCta", "anonymousUpdatePartyDetail", "getAnonymousUpdatePartyDetail", "setAnonymousUpdatePartyDetail", "anonymousUpdatePartyTitle", "getAnonymousUpdatePartyTitle", "setAnonymousUpdatePartyTitle", "confirmationCancel", "getConfirmationCancel", "setConfirmationCancel", "confirmationDetail", "getConfirmationDetail", "setConfirmationDetail", "confirmationRemove", "getConfirmationRemove", "setConfirmationRemove", "confirmationTitle", "getConfirmationTitle", "setConfirmationTitle", "confirmationTitlePlural", "getConfirmationTitlePlural", "setConfirmationTitlePlural", "detail", "getDetail", "setDetail", "header", "getHeader", "setHeader", "keepGuestsHeader", "getKeepGuestsHeader", "setKeepGuestsHeader", "loading", "getLoading", "setLoading", "mainCta", "getMainCta", "setMainCta", "removeGuestsHeader", "getRemoveGuestsHeader", "setRemoveGuestsHeader", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class LeaveQueueData {
    public static final String KEY = "leaveQueue";
    private String anonymousCancelPartyCta;
    private String anonymousConfirmationCancel;
    private String anonymousConfirmationDetail;
    private String anonymousConfirmationRemove;
    private String anonymousConfirmationTitle;
    private String anonymousPartySize;
    private String anonymousUpdatePartyCta;
    private String anonymousUpdatePartyDetail;
    private String anonymousUpdatePartyTitle;
    private String confirmationCancel;
    private String confirmationDetail;
    private String confirmationRemove;
    private String confirmationTitle;
    private String confirmationTitlePlural;
    private String detail;
    private String header;
    private String keepGuestsHeader;
    private String loading;
    private String mainCta;
    private String removeGuestsHeader;
    public static final int $stable = 8;

    public final String getAnonymousCancelPartyCta() {
        return this.anonymousCancelPartyCta;
    }

    public final String getAnonymousConfirmationCancel() {
        return this.anonymousConfirmationCancel;
    }

    public final String getAnonymousConfirmationDetail() {
        return this.anonymousConfirmationDetail;
    }

    public final String getAnonymousConfirmationRemove() {
        return this.anonymousConfirmationRemove;
    }

    public final String getAnonymousConfirmationTitle() {
        return this.anonymousConfirmationTitle;
    }

    public final String getAnonymousPartySize() {
        return this.anonymousPartySize;
    }

    public final String getAnonymousUpdatePartyCta() {
        return this.anonymousUpdatePartyCta;
    }

    public final String getAnonymousUpdatePartyDetail() {
        return this.anonymousUpdatePartyDetail;
    }

    public final String getAnonymousUpdatePartyTitle() {
        return this.anonymousUpdatePartyTitle;
    }

    public final String getConfirmationCancel() {
        return this.confirmationCancel;
    }

    public final String getConfirmationDetail() {
        return this.confirmationDetail;
    }

    public final String getConfirmationRemove() {
        return this.confirmationRemove;
    }

    public final String getConfirmationTitle() {
        return this.confirmationTitle;
    }

    public final String getConfirmationTitlePlural() {
        return this.confirmationTitlePlural;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getKeepGuestsHeader() {
        return this.keepGuestsHeader;
    }

    public final String getLoading() {
        return this.loading;
    }

    public final String getMainCta() {
        return this.mainCta;
    }

    public final String getRemoveGuestsHeader() {
        return this.removeGuestsHeader;
    }

    public final void setAnonymousCancelPartyCta(String str) {
        this.anonymousCancelPartyCta = str;
    }

    public final void setAnonymousConfirmationCancel(String str) {
        this.anonymousConfirmationCancel = str;
    }

    public final void setAnonymousConfirmationDetail(String str) {
        this.anonymousConfirmationDetail = str;
    }

    public final void setAnonymousConfirmationRemove(String str) {
        this.anonymousConfirmationRemove = str;
    }

    public final void setAnonymousConfirmationTitle(String str) {
        this.anonymousConfirmationTitle = str;
    }

    public final void setAnonymousPartySize(String str) {
        this.anonymousPartySize = str;
    }

    public final void setAnonymousUpdatePartyCta(String str) {
        this.anonymousUpdatePartyCta = str;
    }

    public final void setAnonymousUpdatePartyDetail(String str) {
        this.anonymousUpdatePartyDetail = str;
    }

    public final void setAnonymousUpdatePartyTitle(String str) {
        this.anonymousUpdatePartyTitle = str;
    }

    public final void setConfirmationCancel(String str) {
        this.confirmationCancel = str;
    }

    public final void setConfirmationDetail(String str) {
        this.confirmationDetail = str;
    }

    public final void setConfirmationRemove(String str) {
        this.confirmationRemove = str;
    }

    public final void setConfirmationTitle(String str) {
        this.confirmationTitle = str;
    }

    public final void setConfirmationTitlePlural(String str) {
        this.confirmationTitlePlural = str;
    }

    public final void setDetail(String str) {
        this.detail = str;
    }

    public final void setHeader(String str) {
        this.header = str;
    }

    public final void setKeepGuestsHeader(String str) {
        this.keepGuestsHeader = str;
    }

    public final void setLoading(String str) {
        this.loading = str;
    }

    public final void setMainCta(String str) {
        this.mainCta = str;
    }

    public final void setRemoveGuestsHeader(String str) {
        this.removeGuestsHeader = str;
    }
}