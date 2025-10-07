package com.disney.wdpro.toolbox.livedata;

import androidx.view.C3783c0;
import androidx.view.InterfaceC3785d0;
import androidx.view.InterfaceC3814s;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/toolbox/livedata/SingleLiveEvent;", "T", "Landroidx/lifecycle/c0;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "Landroidx/lifecycle/d0;", "observer", "", "observe", "(Landroidx/lifecycle/s;Landroidx/lifecycle/d0;)V", "value", "setValue", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isConsumed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "profile-qr-toolbox_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class SingleLiveEvent<T> extends C3783c0<T> {
    private final AtomicBoolean isConsumed = new AtomicBoolean(true);

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.toolbox.livedata.SingleLiveEvent$a */
    static final class C21377a implements InterfaceC3785d0, FunctionAdapter {
        private final /* synthetic */ Function1 function;

        C21377a(Function1 function) {
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

    @Override // androidx.view.AbstractC3830y
    public void observe(InterfaceC3814s owner, final InterfaceC3785d0<? super T> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.observe(owner, new C21377a(new Function1<T, Unit>(this) { // from class: com.disney.wdpro.toolbox.livedata.SingleLiveEvent.observe.1
            final /* synthetic */ SingleLiveEvent<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((C213781) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t10) {
                if (((SingleLiveEvent) this.this$0).isConsumed.compareAndSet(false, true)) {
                    observer.onChanged(t10);
                }
            }
        }));
    }

    @Override // androidx.view.C3783c0, androidx.view.AbstractC3830y
    public void setValue(T value) {
        this.isConsumed.set(false);
        super.setValue(value);
    }
}