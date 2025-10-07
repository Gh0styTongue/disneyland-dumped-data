package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import kotlin.Metadata;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\b¨\u0006,"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/NsfData;", "", "()V", "allSetTitle", "", "getAllSetTitle", "()Ljava/lang/String;", "setAllSetTitle", "(Ljava/lang/String;)V", "allSetTitleAccessibility", "getAllSetTitleAccessibility", "setAllSetTitleAccessibility", "conflicts", "", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ConflictData;", "getConflicts", "()Ljava/util/List;", "setConflicts", "(Ljava/util/List;)V", "fullName", "getFullName", "setFullName", "header", "getHeader", "setHeader", "loading", "getLoading", "setLoading", "mainCta", "getMainCta", "setMainCta", "readyDescription", "getReadyDescription", "setReadyDescription", "readyHeader", "getReadyHeader", "setReadyHeader", "removeCta", "getRemoveCta", "setRemoveCta", "removeCtaAccessibility", "getRemoveCtaAccessibility", "setRemoveCtaAccessibility", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class NsfData {
    public static final String KEY = "nsf";
    private String allSetTitle;
    private String allSetTitleAccessibility;
    private List<ConflictData> conflicts;
    private String fullName;
    private String header;
    private String loading;
    private String mainCta;
    private String readyDescription;
    private String readyHeader;
    private String removeCta;
    private String removeCtaAccessibility;
    public static final int $stable = 8;

    public final String getAllSetTitle() {
        return this.allSetTitle;
    }

    public final String getAllSetTitleAccessibility() {
        return this.allSetTitleAccessibility;
    }

    public final List<ConflictData> getConflicts() {
        return this.conflicts;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getLoading() {
        return this.loading;
    }

    public final String getMainCta() {
        return this.mainCta;
    }

    public final String getReadyDescription() {
        return this.readyDescription;
    }

    public final String getReadyHeader() {
        return this.readyHeader;
    }

    public final String getRemoveCta() {
        return this.removeCta;
    }

    public final String getRemoveCtaAccessibility() {
        return this.removeCtaAccessibility;
    }

    public final void setAllSetTitle(String str) {
        this.allSetTitle = str;
    }

    public final void setAllSetTitleAccessibility(String str) {
        this.allSetTitleAccessibility = str;
    }

    public final void setConflicts(List<ConflictData> list) {
        this.conflicts = list;
    }

    public final void setFullName(String str) {
        this.fullName = str;
    }

    public final void setHeader(String str) {
        this.header = str;
    }

    public final void setLoading(String str) {
        this.loading = str;
    }

    public final void setMainCta(String str) {
        this.mainCta = str;
    }

    public final void setReadyDescription(String str) {
        this.readyDescription = str;
    }

    public final void setReadyHeader(String str) {
        this.readyHeader = str;
    }

    public final void setRemoveCta(String str) {
        this.removeCta = str;
    }

    public final void setRemoveCtaAccessibility(String str) {
        this.removeCtaAccessibility = str;
    }
}