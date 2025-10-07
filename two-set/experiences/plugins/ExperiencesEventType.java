package com.disney.wdpro.experiences.plugins;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/experiences/plugins/ExperiencesEventType;", "", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "OPEN_APP", "CLOSE_APP", "SUBMIT_VOTE", "PAGE_EVENTS_PLUGIN", "WEB_ANALYTICS_PLUGIN", "EXPERIENCES_ANALYTICS_PLUGIN", "experiences-android_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
/* loaded from: classes27.dex */
public final class ExperiencesEventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExperiencesEventType[] $VALUES;
    private final String rawValue;
    public static final ExperiencesEventType OPEN_APP = new ExperiencesEventType("OPEN_APP", 0, "Open  Hybrid App");
    public static final ExperiencesEventType CLOSE_APP = new ExperiencesEventType("CLOSE_APP", 1, "Close Hybrid App");
    public static final ExperiencesEventType SUBMIT_VOTE = new ExperiencesEventType("SUBMIT_VOTE", 2, "Submit Vote");
    public static final ExperiencesEventType PAGE_EVENTS_PLUGIN = new ExperiencesEventType("PAGE_EVENTS_PLUGIN", 3, "PageEventPlugin");
    public static final ExperiencesEventType WEB_ANALYTICS_PLUGIN = new ExperiencesEventType("WEB_ANALYTICS_PLUGIN", 4, "WebAnalyticsPlugin");
    public static final ExperiencesEventType EXPERIENCES_ANALYTICS_PLUGIN = new ExperiencesEventType("EXPERIENCES_ANALYTICS_PLUGIN", 5, "ExperiencesAnalyticsPlugin");

    private static final /* synthetic */ ExperiencesEventType[] $values() {
        return new ExperiencesEventType[]{OPEN_APP, CLOSE_APP, SUBMIT_VOTE, PAGE_EVENTS_PLUGIN, WEB_ANALYTICS_PLUGIN, EXPERIENCES_ANALYTICS_PLUGIN};
    }

    static {
        ExperiencesEventType[] experiencesEventTypeArr$values = $values();
        $VALUES = experiencesEventTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(experiencesEventTypeArr$values);
    }

    private ExperiencesEventType(String str, int i10, String str2) {
        this.rawValue = str2;
    }

    public static EnumEntries<ExperiencesEventType> getEntries() {
        return $ENTRIES;
    }

    public static ExperiencesEventType valueOf(String str) {
        return (ExperiencesEventType) Enum.valueOf(ExperiencesEventType.class, str);
    }

    public static ExperiencesEventType[] values() {
        return (ExperiencesEventType[]) $VALUES.clone();
    }

    /* renamed from: getValue, reason: from getter */
    public String getRawValue() {
        return this.rawValue;
    }
}