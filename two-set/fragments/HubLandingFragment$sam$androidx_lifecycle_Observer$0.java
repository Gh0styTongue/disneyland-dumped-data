package com.disney.wdpro.virtualqueue.core.fragments;

import androidx.view.InterfaceC3785d0;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
final class HubLandingFragment$sam$androidx_lifecycle_Observer$0 implements InterfaceC3785d0, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    HubLandingFragment$sam$androidx_lifecycle_Observer$0(Function1 function) {
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