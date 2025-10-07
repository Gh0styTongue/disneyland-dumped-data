package com.disney.wdpro.qr_core.display.p422ui;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.view.InterfaceC3798k;
import androidx.view.InterfaceC3831y0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p861q2.AbstractC31645a;

@Metadata(m92037d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m92038d2 = {"Landroidx/lifecycle/t0;", "VM", "Lq2/a;", "invoke", "()Lq2/a;", "<anonymous>"}, m92039k = 3, m92040mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$7\n*L\n1#1,222:1\n*E\n"})
/* loaded from: classes16.dex */
public final class QRShowFragment$special$$inlined$viewModels$default$4 extends Lambda implements Function0<AbstractC31645a> {
    final /* synthetic */ Lazy $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRShowFragment$special$$inlined$viewModels$default$4(Lazy lazy) {
        super(0);
        lazy = lazy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC31645a invoke() {
        AbstractC31645a abstractC31645a;
        Function0 function0 = function03;
        if (function0 != null && (abstractC31645a = (AbstractC31645a) function0.invoke()) != null) {
            return abstractC31645a;
        }
        InterfaceC3831y0 interfaceC3831y0M19545d = FragmentViewModelLazyKt.m19545d(lazy);
        InterfaceC3798k interfaceC3798k = interfaceC3831y0M19545d instanceof InterfaceC3798k ? (InterfaceC3798k) interfaceC3831y0M19545d : null;
        return interfaceC3798k != null ? interfaceC3798k.getDefaultViewModelCreationExtras() : AbstractC31645a.a.f80598b;
    }
}