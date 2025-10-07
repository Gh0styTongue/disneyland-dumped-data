package com.disney.wdpro.flutter.commons.p128di;

import android.content.Context;
import com.disney.wdpro.flutter.commons.FlutterParkEngineManager;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/flutter/commons/di/FlutterRefCommonsModule;", "", "()V", "provideFlutterParkEngineManager", "Lcom/disney/wdpro/flutter/commons/FlutterParkEngineManager;", "context", "Landroid/content/Context;", "flutter-ref-commons-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module
/* loaded from: classes28.dex */
public final class FlutterRefCommonsModule {
    @Provides
    @Singleton
    public final FlutterParkEngineManager provideFlutterParkEngineManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new FlutterParkEngineManager(context);
    }
}