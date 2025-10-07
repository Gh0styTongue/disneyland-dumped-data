package com.disney.wdpro.virtualqueue.p462ui.common;

import androidx.core.app.NotificationCompat;
import androidx.view.C3783c0;
import androidx.view.InterfaceC3785d0;
import androidx.view.InterfaceC3814s;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/SingleLiveEvent;", "T", "Landroidx/lifecycle/c0;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "Landroidx/lifecycle/d0;", "observer", "", "observe", "(Landroidx/lifecycle/s;Landroidx/lifecycle/d0;)V", RsaJsonWebKey.FACTOR_CRT_COEFFICIENT, "setValue", "(Ljava/lang/Object;)V", NotificationCompat.CATEGORY_CALL, "Ljava/util/concurrent/atomic/AtomicBoolean;", "pending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class SingleLiveEvent<T> extends C3783c0<T> {
    public static final int $stable = 8;
    private final AtomicBoolean pending = new AtomicBoolean(false);

    public final void call() {
        setValue(null);
    }

    @Override // androidx.view.AbstractC3830y
    public void observe(InterfaceC3814s owner, final InterfaceC3785d0<? super T> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.observe(owner, new SingleLiveEvent$sam$androidx_lifecycle_Observer$0(new Function1<T, Unit>(this) { // from class: com.disney.wdpro.virtualqueue.ui.common.SingleLiveEvent.observe.1
            final /* synthetic */ SingleLiveEvent<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((C216411) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t10) {
                if (((SingleLiveEvent) this.this$0).pending.compareAndSet(true, false)) {
                    observer.onChanged(t10);
                }
            }
        }));
    }

    @Override // androidx.view.C3783c0, androidx.view.AbstractC3830y
    public void setValue(T t10) {
        this.pending.set(true);
        super.setValue(t10);
    }
}