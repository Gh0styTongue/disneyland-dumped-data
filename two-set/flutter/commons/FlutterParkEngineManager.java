package com.disney.wdpro.flutter.commons;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.disney.wdpro.flutter.commons.FlutterParkEngineManager;
import io.flutter.embedding.engine.C29013a;
import io.flutter.embedding.engine.C29014b;
import io.flutter.embedding.engine.C29016d;
import io.flutter.embedding.engine.dart.C29017a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1070xb.C33210a;
import p891qx.C31767a;

@Singleton
@Metadata(m92037d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m92038d2 = {"Lcom/disney/wdpro/flutter/commons/FlutterParkEngineManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getBundlePath", "()Ljava/lang/String;", "engineId", "entrypoint", "Lkotlin/Function1;", "Lio/flutter/embedding/engine/a;", "", "callback", "createEngine", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "flutterEngine", "cacheEngineId", "cacheActiveEngine", "(Lio/flutter/embedding/engine/a;Ljava/lang/String;)V", "", "hasCachedEngine", "(Ljava/lang/String;)Z", "destroyEngine", "(Ljava/lang/String;)V", "Landroid/content/Context;", "Landroid/os/Handler;", "mainThreadHandler", "Landroid/os/Handler;", "Lio/flutter/embedding/engine/d;", "flutterEngineGroup", "Lio/flutter/embedding/engine/d;", "Lio/flutter/embedding/engine/b;", "cache", "Lio/flutter/embedding/engine/b;", "flutter-ref-commons-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nFlutterParkEngineManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterParkEngineManager.kt\ncom/disney/wdpro/flutter/commons/FlutterParkEngineManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
/* loaded from: classes28.dex */
public final class FlutterParkEngineManager {
    private final C29014b cache;
    private final Context context;
    private final C29016d flutterEngineGroup;
    private final Handler mainThreadHandler;

    @Inject
    public FlutterParkEngineManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
        this.flutterEngineGroup = new C29016d(context);
        C29014b c29014bM90084c = C29014b.m90084c();
        Intrinsics.checkNotNullExpressionValue(c29014bM90084c, "getInstance()");
        this.cache = c29014bM90084c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createEngine$default(FlutterParkEngineManager flutterParkEngineManager, String str, String str2, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        flutterParkEngineManager.createEngine(str, str2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createEngine$lambda$2(FlutterParkEngineManager this$0, String entrypoint, String engineId, Function1 function1) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(entrypoint, "$entrypoint");
        Intrinsics.checkNotNullParameter(engineId, "$engineId");
        C29013a newEngine = this$0.flutterEngineGroup.m90120a(this$0.context, new C29017a.b(this$0.getBundlePath(), entrypoint));
        C33210a.INSTANCE.m101019b("Creating Flutter Engine. Id: " + engineId + ". DartEntryPoint: " + entrypoint);
        this$0.cache.m90087d(engineId, newEngine);
        if (function1 != null) {
            Intrinsics.checkNotNullExpressionValue(newEngine, "newEngine");
            function1.invoke(newEngine);
        }
    }

    private final String getBundlePath() {
        String strM99068g = C31767a.m97625e().m97628c().m99068g();
        Intrinsics.checkNotNullExpressionValue(strM99068g, "instance().flutterLoader().findAppBundlePath()");
        return strM99068g;
    }

    public final void cacheActiveEngine(C29013a flutterEngine, String cacheEngineId) {
        if (flutterEngine == null || cacheEngineId == null || cacheEngineId.length() == 0) {
            return;
        }
        this.cache.m90087d(cacheEngineId, flutterEngine);
    }

    public final void createEngine(final String engineId, final String entrypoint, final Function1<? super C29013a, Unit> callback) {
        Intrinsics.checkNotNullParameter(engineId, "engineId");
        Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
        C29013a c29013aM90086b = this.cache.m90086b(engineId);
        if (c29013aM90086b == null) {
            this.mainThreadHandler.post(new Runnable() { // from class: yb.a
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterParkEngineManager.createEngine$lambda$2(this.f83991a, entrypoint, engineId, callback);
                }
            });
            return;
        }
        C33210a.INSTANCE.m101019b("Retrieving Cached engine. Id: " + engineId + ". DartEntryPoint: " + entrypoint);
        if (callback != null) {
            callback.invoke(c29013aM90086b);
        }
    }

    public final void destroyEngine(String engineId) {
        Intrinsics.checkNotNullParameter(engineId, "engineId");
        C29013a c29013aM90086b = this.cache.m90086b(engineId);
        if (c29013aM90086b != null) {
            c29013aM90086b.m90068l().m90221b();
            c29013aM90086b.m90063g();
            this.cache.m90088e(engineId);
            C33210a.INSTANCE.m101019b("Destroyed Flutter Engine. Id: " + engineId);
        }
    }

    public final boolean hasCachedEngine(String engineId) {
        if (engineId != null) {
            return this.cache.m90085a(engineId);
        }
        return false;
    }
}