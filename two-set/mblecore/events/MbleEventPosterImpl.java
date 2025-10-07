package com.disney.wdpro.mblecore.events;

import android.os.Handler;
import android.os.Looper;
import com.disney.wdpro.mblecore.events.MbleEventPosterImpl;
import com.squareup.otto.StickyEventBus;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/events/MbleEventPosterImpl;", "Lcom/disney/wdpro/mblecore/events/MbleEventPoster;", "bus", "Lcom/squareup/otto/StickyEventBus;", "(Lcom/squareup/otto/StickyEventBus;)V", "getBus", "()Lcom/squareup/otto/StickyEventBus;", "handler", "Landroid/os/Handler;", "getHandler$magic_ble_core_lib_release", "()Landroid/os/Handler;", "setHandler$magic_ble_core_lib_release", "(Landroid/os/Handler;)V", "postEvent", "", "event", "", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final class MbleEventPosterImpl implements MbleEventPoster {
    private final StickyEventBus bus;
    private Handler handler;

    @Inject
    public MbleEventPosterImpl(StickyEventBus bus) {
        Intrinsics.checkNotNullParameter(bus, "bus");
        this.bus = bus;
        this.handler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postEvent$lambda$0(MbleEventPosterImpl this$0, Object event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "$event");
        this$0.bus.post(event);
    }

    public final StickyEventBus getBus() {
        return this.bus;
    }

    /* renamed from: getHandler$magic_ble_core_lib_release, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    @Override // com.disney.wdpro.mblecore.events.MbleEventPoster
    public void postEvent(final Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.handler.post(new Runnable() { // from class: ik.a
            @Override // java.lang.Runnable
            public final void run() {
                MbleEventPosterImpl.postEvent$lambda$0(this.f75029a, event);
            }
        });
    }

    public final void setHandler$magic_ble_core_lib_release(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.handler = handler;
    }
}