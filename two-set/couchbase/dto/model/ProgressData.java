package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0016"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ProgressData;", "", "()V", ProgressData.ANIM_URL_KEY, "", "getAnimUrl", "()Ljava/lang/String;", "setAnimUrl", "(Ljava/lang/String;)V", "barAccessibility", "getBarAccessibility", "setBarAccessibility", ProgressData.BAR_ANIM_URL_KEY, "getBarAnimUrl", "setBarAnimUrl", "description", "getDescription", "setDescription", ProgressData.LOOP_ANIM_URL_KEY, "getLoopAnimUrl", "setLoopAnimUrl", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class ProgressData {
    public static final String ANIM_URL_KEY = "animUrl";
    public static final String BAR_ANIM_URL_KEY = "barAnimUrl";
    public static final String KEY = "progress";
    public static final String LOOP_ANIM_URL_KEY = "loopAnimUrl";
    private String animUrl;
    private String barAccessibility;
    private String barAnimUrl;
    private String description;
    private String loopAnimUrl;
    public static final int $stable = 8;

    public final String getAnimUrl() {
        return this.animUrl;
    }

    public final String getBarAccessibility() {
        return this.barAccessibility;
    }

    public final String getBarAnimUrl() {
        return this.barAnimUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLoopAnimUrl() {
        return this.loopAnimUrl;
    }

    public final void setAnimUrl(String str) {
        this.animUrl = str;
    }

    public final void setBarAccessibility(String str) {
        this.barAccessibility = str;
    }

    public final void setBarAnimUrl(String str) {
        this.barAnimUrl = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setLoopAnimUrl(String str) {
        this.loopAnimUrl = str;
    }
}