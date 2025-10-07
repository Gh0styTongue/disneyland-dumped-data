package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/TipboardData;", "", "()V", "groupDisplay", "", "getGroupDisplay", "()Ljava/lang/String;", "setGroupDisplay", "(Ljava/lang/String;)V", "groupingLinkHub", "getGroupingLinkHub", "setGroupingLinkHub", "groupingLinkMultiple", "getGroupingLinkMultiple", "setGroupingLinkMultiple", "groupingLinkSingle", "getGroupingLinkSingle", "setGroupingLinkSingle", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class TipboardData {
    public static final String KEY = "tipboard";
    private String groupDisplay;

    @JsonProperty("vqGroupingLink_HUB")
    private String groupingLinkHub;

    @JsonProperty("vqGroupingLink_MULTIPLE")
    private String groupingLinkMultiple;

    @JsonProperty("vqGroupingLink_SINGLE")
    private String groupingLinkSingle;
    public static final int $stable = 8;

    public final String getGroupDisplay() {
        return this.groupDisplay;
    }

    public final String getGroupingLinkHub() {
        return this.groupingLinkHub;
    }

    public final String getGroupingLinkMultiple() {
        return this.groupingLinkMultiple;
    }

    public final String getGroupingLinkSingle() {
        return this.groupingLinkSingle;
    }

    public final void setGroupDisplay(String str) {
        this.groupDisplay = str;
    }

    public final void setGroupingLinkHub(String str) {
        this.groupingLinkHub = str;
    }

    public final void setGroupingLinkMultiple(String str) {
        this.groupingLinkMultiple = str;
    }

    public final void setGroupingLinkSingle(String str) {
        this.groupingLinkSingle = str;
    }
}