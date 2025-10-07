package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006%"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ErrorBannersData;", "", "()V", "genericErrorMessage", "", "getGenericErrorMessage", "()Ljava/lang/String;", "setGenericErrorMessage", "(Ljava/lang/String;)V", "genericErrorTitle", "getGenericErrorTitle", "setGenericErrorTitle", "joinErrorMessage", "getJoinErrorMessage", "setJoinErrorMessage", "joinErrorTitle", "getJoinErrorTitle", "setJoinErrorTitle", "landClosedMessage", "getLandClosedMessage", "setLandClosedMessage", "landClosedTitle", "getLandClosedTitle", "setLandClosedTitle", "maxPartySizeExceededMessage", "getMaxPartySizeExceededMessage", "setMaxPartySizeExceededMessage", "maxPartySizeExceededTitle", "getMaxPartySizeExceededTitle", "setMaxPartySizeExceededTitle", AnalyticsAttribute.OFFLINE_NAME_ATTRIBUTE, "getOffline", "setOffline", "retryErrorMessage", "getRetryErrorMessage", "setRetryErrorMessage", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class ErrorBannersData {
    public static final String KEY = "errorBanners";
    private String genericErrorMessage;
    private String genericErrorTitle;
    private String joinErrorMessage;
    private String joinErrorTitle;
    private String landClosedMessage;
    private String landClosedTitle;
    private String maxPartySizeExceededMessage;
    private String maxPartySizeExceededTitle;
    private String offline = "";
    private String retryErrorMessage;
    public static final int $stable = 8;

    public final String getGenericErrorMessage() {
        return this.genericErrorMessage;
    }

    public final String getGenericErrorTitle() {
        return this.genericErrorTitle;
    }

    public final String getJoinErrorMessage() {
        return this.joinErrorMessage;
    }

    public final String getJoinErrorTitle() {
        return this.joinErrorTitle;
    }

    public final String getLandClosedMessage() {
        return this.landClosedMessage;
    }

    public final String getLandClosedTitle() {
        return this.landClosedTitle;
    }

    public final String getMaxPartySizeExceededMessage() {
        return this.maxPartySizeExceededMessage;
    }

    public final String getMaxPartySizeExceededTitle() {
        return this.maxPartySizeExceededTitle;
    }

    public final String getOffline() {
        return this.offline;
    }

    public final String getRetryErrorMessage() {
        return this.retryErrorMessage;
    }

    public final void setGenericErrorMessage(String str) {
        this.genericErrorMessage = str;
    }

    public final void setGenericErrorTitle(String str) {
        this.genericErrorTitle = str;
    }

    public final void setJoinErrorMessage(String str) {
        this.joinErrorMessage = str;
    }

    public final void setJoinErrorTitle(String str) {
        this.joinErrorTitle = str;
    }

    public final void setLandClosedMessage(String str) {
        this.landClosedMessage = str;
    }

    public final void setLandClosedTitle(String str) {
        this.landClosedTitle = str;
    }

    public final void setMaxPartySizeExceededMessage(String str) {
        this.maxPartySizeExceededMessage = str;
    }

    public final void setMaxPartySizeExceededTitle(String str) {
        this.maxPartySizeExceededTitle = str;
    }

    public final void setOffline(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.offline = str;
    }

    public final void setRetryErrorMessage(String str) {
        this.retryErrorMessage = str;
    }
}