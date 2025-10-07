package com.disney.wdpro.experiences.helpers;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/experiences/helpers/AppEnvironment;", "", "<init>", "(Ljava/lang/String;I)V", "LATEST", "STAGE", "LOAD", "PROD", "experiences-android_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
/* loaded from: classes27.dex */
public final class AppEnvironment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppEnvironment[] $VALUES;
    public static final AppEnvironment LATEST = new AppEnvironment("LATEST", 0);
    public static final AppEnvironment STAGE = new AppEnvironment("STAGE", 1);
    public static final AppEnvironment LOAD = new AppEnvironment("LOAD", 2);
    public static final AppEnvironment PROD = new AppEnvironment("PROD", 3);

    private static final /* synthetic */ AppEnvironment[] $values() {
        return new AppEnvironment[]{LATEST, STAGE, LOAD, PROD};
    }

    static {
        AppEnvironment[] appEnvironmentArr$values = $values();
        $VALUES = appEnvironmentArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(appEnvironmentArr$values);
    }

    private AppEnvironment(String str, int i10) {
    }

    public static EnumEntries<AppEnvironment> getEntries() {
        return $ENTRIES;
    }

    public static AppEnvironment valueOf(String str) {
        return (AppEnvironment) Enum.valueOf(AppEnvironment.class, str);
    }

    public static AppEnvironment[] values() {
        return (AppEnvironment[]) $VALUES.clone();
    }
}