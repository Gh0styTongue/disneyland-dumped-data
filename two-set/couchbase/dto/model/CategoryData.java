package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CategoryData;", "", "()V", "categoryContentId", "", "getCategoryContentId", "()Ljava/lang/String;", "setCategoryContentId", "(Ljava/lang/String;)V", "detail", "getDetail", "setDetail", "title", "getTitle", "setTitle", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class CategoryData {
    public static final String HUB_CATEGORY_KEY = "hubCategory";
    public static final String KEY = "queueCategory";
    private String categoryContentId;
    private String detail;
    private String title;
    public static final int $stable = 8;

    public final String getCategoryContentId() {
        return this.categoryContentId;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setCategoryContentId(String str) {
        this.categoryContentId = str;
    }

    public final void setDetail(String str) {
        this.detail = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}