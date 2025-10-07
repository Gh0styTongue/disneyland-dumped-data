package com.disney.wdpro.qr_core.display.data;

import com.disney.wdpro.friendsservices.business.FriendApiClientImpl;
import com.disney.wdpro.qr_core.display.rest.AgeBand;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C30064h;
import kotlinx.coroutines.C30180u0;
import p1011vm.InterfaceC32629a;
import p916rm.InterfaceC31922a;
import p916rm.InterfaceC31923b;

@Singleton
@Metadata(m92037d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/display/data/QRCodeDisplayManager;", "", "Lvm/a;", "qrClient", "Lrm/b;", "swidProvider", "Lrm/a;", "env", "<init>", "(Lvm/a;Lrm/b;Lrm/a;)V", "Lcom/disney/wdpro/qr_core/display/data/b;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/disney/wdpro/qr_core/display/rest/AgeBand;", FriendApiClientImpl.AGE_BAND_PARAM, "", "primarySwid", "Lcom/disney/wdpro/qr_core/display/data/QRStatus;", "b", "(Lcom/disney/wdpro/qr_core/display/rest/AgeBand;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lvm/a;", "Lrm/b;", "Lrm/a;", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes16.dex */
public final class QRCodeDisplayManager {
    private final InterfaceC31922a env;
    private final InterfaceC32629a qrClient;
    private final InterfaceC31923b swidProvider;

    @Inject
    public QRCodeDisplayManager(InterfaceC32629a qrClient, InterfaceC31923b swidProvider, InterfaceC31922a env) {
        Intrinsics.checkNotNullParameter(qrClient, "qrClient");
        Intrinsics.checkNotNullParameter(swidProvider, "swidProvider");
        Intrinsics.checkNotNullParameter(env, "env");
        this.qrClient = qrClient;
    }

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC31923b m60863a(QRCodeDisplayManager qRCodeDisplayManager) {
        qRCodeDisplayManager.getClass();
        return null;
    }

    /* renamed from: b */
    public final Object m60864b(AgeBand ageBand, String str, Continuation<? super QRStatus> continuation) {
        return C30064h.m92775g(C30180u0.m93207b(), new QRCodeDisplayManager$checkQRStatus$2(this, ageBand, str, null), continuation);
    }

    /* renamed from: c */
    public final Object m60865c(Continuation<? super QRCodeData> continuation) {
        return C30064h.m92775g(C30180u0.m93207b(), new QRCodeDisplayManager$getQRCode$2(this, null), continuation);
    }
}