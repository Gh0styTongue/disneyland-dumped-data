package com.disney.wdpro.experiences.plugins;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u000b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/experiences/plugins/ExperiencesEventModule;", "", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getModuleName", "()Ljava/lang/String;", "moduleName", "HYBRID_APP", "experiences-android_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
/* loaded from: classes27.dex */
public final class ExperiencesEventModule {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExperiencesEventModule[] $VALUES;
    public static final ExperiencesEventModule HYBRID_APP = new ExperiencesEventModule("HYBRID_APP", 0, "HybridApp");
    private final String rawValue;

    private static final /* synthetic */ ExperiencesEventModule[] $values() {
        return new ExperiencesEventModule[]{HYBRID_APP};
    }

    static {
        ExperiencesEventModule[] experiencesEventModuleArr$values = $values();
        $VALUES = experiencesEventModuleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(experiencesEventModuleArr$values);
    }

    private ExperiencesEventModule(String str, int i10, String str2) {
        this.rawValue = str2;
    }

    public static EnumEntries<ExperiencesEventModule> getEntries() {
        return $ENTRIES;
    }

    public static ExperiencesEventModule valueOf(String str) {
        return (ExperiencesEventModule) Enum.valueOf(ExperiencesEventModule.class, str);
    }

    public static ExperiencesEventModule[] values() {
        return (ExperiencesEventModule[]) $VALUES.clone();
    }

    /* renamed from: getModuleName, reason: from getter */
    public String getRawValue() {
        return this.rawValue;
    }
}