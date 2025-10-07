package com.disney.wdpro.photopasscommons.ext;

import androidx.view.AbstractC3830y;
import androidx.view.InterfaceC3785d0;
import androidx.view.InterfaceC3814s;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aH\u0010\n\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m92038d2 = {"T", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/y;", "liveData", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", RsaJsonWebKey.FACTOR_CRT_COEFFICIENT, "", "action", "a", "(Landroidx/lifecycle/s;Landroidx/lifecycle/y;Lkotlin/jvm/functions/Function1;)V", "photopasscommons_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final class AndroidExtKt {

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.photopasscommons.ext.AndroidExtKt$a */
    static final class C18806a implements InterfaceC3785d0, FunctionAdapter {
        private final /* synthetic */ Function1 function;

        C18806a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.function = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3785d0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.function;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.view.InterfaceC3785d0
        public final /* synthetic */ void onChanged(Object obj) {
            this.function.invoke(obj);
        }
    }

    /* renamed from: a */
    public static final <T> void m60560a(InterfaceC3814s interfaceC3814s, AbstractC3830y<T> liveData, final Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(interfaceC3814s, "<this>");
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(action, "action");
        liveData.observe(interfaceC3814s, new C18806a(new Function1<T, Unit>() { // from class: com.disney.wdpro.photopasscommons.ext.AndroidExtKt$observe$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((AndroidExtKt$observe$1<T>) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t10) {
                if (t10 != null) {
                    action.invoke(t10);
                }
            }
        }));
    }
}