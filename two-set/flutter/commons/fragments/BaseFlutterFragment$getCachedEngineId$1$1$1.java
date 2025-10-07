package com.disney.wdpro.flutter.commons.fragments;

import io.flutter.embedding.engine.C29013a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m92037d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m92038d2 = {"Lio/flutter/embedding/engine/a;", "newEngine", "", "invoke", "(Lio/flutter/embedding/engine/a;)V", "<anonymous>"}, m92039k = 3, m92040mv = {1, 8, 0})
/* loaded from: classes28.dex */
final class BaseFlutterFragment$getCachedEngineId$1$1$1 extends Lambda implements Function1<C29013a, Unit> {
    final /* synthetic */ String $cachedEngineId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseFlutterFragment$getCachedEngineId$1$1$1(String str) {
        super(1);
        cachedEngineId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C29013a c29013a) {
        invoke2(c29013a);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(C29013a newEngine) {
        Intrinsics.checkNotNullParameter(newEngine, "newEngine");
        this.this$0.getFlutterEngineManager$flutter_ref_commons_lib_release().cacheActiveEngine(newEngine, cachedEngineId);
    }
}