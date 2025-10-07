package com.disney.wdpro.photopasscommons.ext;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m92038d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nAndroidExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExt.kt\ncom/disney/wdpro/photopasscommons/ext/AndroidExtKt$observe$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
/* loaded from: classes15.dex */
final class AndroidExtKt$observe$1<T> extends Lambda implements Function1<T, Unit> {
    final /* synthetic */ Function1<T, Unit> $action;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AndroidExtKt$observe$1(Function1<? super T, Unit> function1) {
        super(1);
        action = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((AndroidExtKt$observe$1<T>) obj);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(T t10) {
        if (t10 != null) {
            action.invoke(t10);
        }
    }
}