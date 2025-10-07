package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ConflictData;", "", "()V", "detail", "", "getDetail", "()Ljava/lang/String;", "setDetail", "(Ljava/lang/String;)V", "detailInline", "getDetailInline", "setDetailInline", "detailWithTokens", "getDetailWithTokens", "setDetailWithTokens", "detailWithTokensInline", "getDetailWithTokensInline", "setDetailWithTokensInline", "title", "getTitle", "setTitle", "type", "getType", "setType", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class ConflictData {
    public static final String KEY = "conflicts";
    private String detail;
    private String detailInline;
    private String detailWithTokens;
    private String detailWithTokensInline;
    private String title;
    private String type;
    public static final int $stable = 8;

    public final String getDetail() {
        return this.detail;
    }

    public final String getDetailInline() {
        return this.detailInline;
    }

    public final String getDetailWithTokens() {
        return this.detailWithTokens;
    }

    public final String getDetailWithTokensInline() {
        return this.detailWithTokensInline;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final void setDetail(String str) {
        this.detail = str;
    }

    public final void setDetailInline(String str) {
        this.detailInline = str;
    }

    public final void setDetailWithTokens(String str) {
        this.detailWithTokens = str;
    }

    public final void setDetailWithTokensInline(String str) {
        this.detailWithTokensInline = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(String str) {
        this.type = str;
    }
}