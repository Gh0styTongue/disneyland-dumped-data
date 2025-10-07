package com.disney.wdpro.mblecore.utils;

import java.util.Random;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/utils/RandomNumberUtils;", "", "()V", "randomTool", "Ljava/util/Random;", "getBetween", "", "min", "max", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final class RandomNumberUtils {
    public static final RandomNumberUtils INSTANCE = new RandomNumberUtils();
    private static final Random randomTool = new Random();

    private RandomNumberUtils() {
    }

    public final int getBetween(int min, int max) {
        return randomTool.nextInt((max - min) + 1) + min;
    }
}