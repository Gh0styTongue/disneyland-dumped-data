package com.disney.wdpro.virtualqueue.core.manager;

import androidx.view.DefaultLifecycleObserver;
import androidx.view.InterfaceC3814s;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Singleton
@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueLifeCycle;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Ldagger/Lazy;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authenticationManager", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "<init>", "(Ldagger/Lazy;Ldagger/Lazy;)V", "Landroidx/lifecycle/s;", "owner", "", "onResume", "(Landroidx/lifecycle/s;)V", "onPause", "Ldagger/Lazy;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class VirtualQueueLifeCycle implements DefaultLifecycleObserver {
    public static final int $stable = 8;
    private final Lazy<AuthenticationManager> authenticationManager;
    private final Lazy<C9248i> vendomatic;

    @Inject
    public VirtualQueueLifeCycle(Lazy<AuthenticationManager> authenticationManager, Lazy<C9248i> vendomatic) {
        Intrinsics.checkNotNullParameter(authenticationManager, "authenticationManager");
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        this.authenticationManager = authenticationManager;
        this.vendomatic = vendomatic;
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onCreate(InterfaceC3814s interfaceC3814s) {
        super.onCreate(interfaceC3814s);
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onDestroy(InterfaceC3814s interfaceC3814s) {
        super.onDestroy(interfaceC3814s);
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void onPause(InterfaceC3814s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void onResume(InterfaceC3814s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onStart(InterfaceC3814s interfaceC3814s) {
        super.onStart(interfaceC3814s);
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onStop(InterfaceC3814s interfaceC3814s) {
        super.onStop(interfaceC3814s);
    }
}