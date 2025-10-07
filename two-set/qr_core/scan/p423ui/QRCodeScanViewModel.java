package com.disney.wdpro.qr_core.scan.p423ui;

import androidx.view.AbstractC3817t0;
import androidx.view.AbstractC3830y;
import androidx.view.C3819u0;
import com.couchbase.lite.internal.BaseTLSIdentity;
import com.disney.wdpro.family_and_friends_ui.p127ui.activity.QRFindMatchActivity;
import com.disney.wdpro.friendsservices.business.FriendApiClientImpl;
import com.disney.wdpro.qr_core.QRCodeError;
import com.disney.wdpro.qr_core.display.data.QRStatus;
import com.disney.wdpro.qr_core.display.rest.AgeBand;
import com.disney.wdpro.qr_core.scan.QRCodeScanManager;
import com.disney.wdpro.toolbox.livedata.SingleLiveEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.InterfaceC30139p1;
import p1045wm.GetProfileByQRCodeResponse;
import p1045wm.LinkAccountByQRCodeResponse;

@Metadata(m92037d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0019\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010!R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\"8\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010!R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\"8\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020'0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010!R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020'0\"8\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b1\u0010&R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010!R\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002020\"8\u0006¢\u0006\f\n\u0004\b4\u0010$\u001a\u0004\b5\u0010&R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020'0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010!R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020'0\"8\u0006¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b8\u0010&¨\u00069"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/scan/ui/QRCodeScanViewModel;", "Landroidx/lifecycle/t0;", "Lcom/disney/wdpro/qr_core/scan/QRCodeScanManager;", "qrScanManager", "<init>", "(Lcom/disney/wdpro/qr_core/scan/QRCodeScanManager;)V", "", QRFindMatchActivity.QR_CODE, "", "D", "(Ljava/lang/String;)V", "Lcom/disney/wdpro/qr_core/display/rest/AgeBand;", FriendApiClientImpl.AGE_BAND_PARAM, "swid", "Lkotlinx/coroutines/p1;", "A", "(Lcom/disney/wdpro/qr_core/display/rest/AgeBand;Ljava/lang/String;)Lkotlinx/coroutines/p1;", "guid", "I", "(Lcom/disney/wdpro/qr_core/display/rest/AgeBand;Ljava/lang/String;Ljava/lang/String;)V", "firstName", "lastName", "", "age", "dateOfBirth", "J", "(Lcom/disney/wdpro/qr_core/display/rest/AgeBand;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "K", "(Lcom/disney/wdpro/qr_core/display/rest/AgeBand;Ljava/lang/String;)V", "Lcom/disney/wdpro/qr_core/scan/QRCodeScanManager;", "Lcom/disney/wdpro/toolbox/livedata/SingleLiveEvent;", "Lwm/a;", "mProfileSuccess", "Lcom/disney/wdpro/toolbox/livedata/SingleLiveEvent;", "Landroidx/lifecycle/y;", "profileSuccess", "Landroidx/lifecycle/y;", "F", "()Landroidx/lifecycle/y;", "Lcom/disney/wdpro/qr_core/QRCodeError;", "mProfileFailure", "profileFailure", "E", "Lcom/disney/wdpro/qr_core/display/data/QRStatus;", "mQRLinkStatusSucccess", "qrLinkStatusSuccess", "H", "mQRLinkStatusFailure", "qrLinkStatusFailure", "G", "Lwm/d;", "mLinkSuccess", "linkSuccess", BaseTLSIdentity.CERT_ATTRIBUTE_COUNTRY, "mLinkFailure", "linkFailure", "B", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes16.dex */
public final class QRCodeScanViewModel extends AbstractC3817t0 {
    private final AbstractC3830y<QRCodeError> linkFailure;
    private final AbstractC3830y<LinkAccountByQRCodeResponse> linkSuccess;
    private final SingleLiveEvent<QRCodeError> mLinkFailure;
    private final SingleLiveEvent<LinkAccountByQRCodeResponse> mLinkSuccess;
    private final SingleLiveEvent<QRCodeError> mProfileFailure;
    private final SingleLiveEvent<GetProfileByQRCodeResponse> mProfileSuccess;
    private final SingleLiveEvent<QRCodeError> mQRLinkStatusFailure;
    private final SingleLiveEvent<QRStatus> mQRLinkStatusSucccess;
    private final AbstractC3830y<QRCodeError> profileFailure;
    private final AbstractC3830y<GetProfileByQRCodeResponse> profileSuccess;
    private final AbstractC3830y<QRCodeError> qrLinkStatusFailure;
    private final AbstractC3830y<QRStatus> qrLinkStatusSuccess;
    private final QRCodeScanManager qrScanManager;

    @Inject
    public QRCodeScanViewModel(QRCodeScanManager qrScanManager) {
        Intrinsics.checkNotNullParameter(qrScanManager, "qrScanManager");
        this.qrScanManager = qrScanManager;
        SingleLiveEvent<GetProfileByQRCodeResponse> singleLiveEvent = new SingleLiveEvent<>();
        this.mProfileSuccess = singleLiveEvent;
        this.profileSuccess = singleLiveEvent;
        SingleLiveEvent<QRCodeError> singleLiveEvent2 = new SingleLiveEvent<>();
        this.mProfileFailure = singleLiveEvent2;
        this.profileFailure = singleLiveEvent2;
        SingleLiveEvent<QRStatus> singleLiveEvent3 = new SingleLiveEvent<>();
        this.mQRLinkStatusSucccess = singleLiveEvent3;
        this.qrLinkStatusSuccess = singleLiveEvent3;
        SingleLiveEvent<QRCodeError> singleLiveEvent4 = new SingleLiveEvent<>();
        this.mQRLinkStatusFailure = singleLiveEvent4;
        this.qrLinkStatusFailure = singleLiveEvent4;
        SingleLiveEvent<LinkAccountByQRCodeResponse> singleLiveEvent5 = new SingleLiveEvent<>();
        this.mLinkSuccess = singleLiveEvent5;
        this.linkSuccess = singleLiveEvent5;
        SingleLiveEvent<QRCodeError> singleLiveEvent6 = new SingleLiveEvent<>();
        this.mLinkFailure = singleLiveEvent6;
        this.linkFailure = singleLiveEvent6;
    }

    /* renamed from: A */
    public final InterfaceC30139p1 m60967A(AgeBand ageBand, String swid) {
        Intrinsics.checkNotNullParameter(ageBand, "ageBand");
        Intrinsics.checkNotNullParameter(swid, "swid");
        return C30113j.m92948d(C3819u0.m20261a(this), null, null, new QRCodeScanViewModel$checkQRLinkStatus$1(this, ageBand, swid, null), 3, null);
    }

    /* renamed from: B */
    public final AbstractC3830y<QRCodeError> m60968B() {
        return this.linkFailure;
    }

    /* renamed from: C */
    public final AbstractC3830y<LinkAccountByQRCodeResponse> m60969C() {
        return this.linkSuccess;
    }

    /* renamed from: D */
    public final void m60970D(String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new QRCodeScanViewModel$getProfileByQrCode$1(this, qrCode, null), 3, null);
    }

    /* renamed from: E */
    public final AbstractC3830y<QRCodeError> m60971E() {
        return this.profileFailure;
    }

    /* renamed from: F */
    public final AbstractC3830y<GetProfileByQRCodeResponse> m60972F() {
        return this.profileSuccess;
    }

    /* renamed from: G */
    public final AbstractC3830y<QRCodeError> m60973G() {
        return this.qrLinkStatusFailure;
    }

    /* renamed from: H */
    public final AbstractC3830y<QRStatus> m60974H() {
        return this.qrLinkStatusSuccess;
    }

    /* renamed from: I */
    public final void m60975I(AgeBand ageBand, String qrCode, String guid) {
        Intrinsics.checkNotNullParameter(ageBand, "ageBand");
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        Intrinsics.checkNotNullParameter(guid, "guid");
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new QRCodeScanViewModel$linkFriendByQrCode$1(this, ageBand, guid, qrCode, null), 3, null);
    }

    /* renamed from: J */
    public final void m60976J(AgeBand ageBand, String qrCode, String firstName, String lastName, int age, String dateOfBirth) {
        Intrinsics.checkNotNullParameter(ageBand, "ageBand");
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new QRCodeScanViewModel$linkNewFriendByQrCode$1(this, ageBand, qrCode, firstName, lastName, age, dateOfBirth, null), 3, null);
    }

    /* renamed from: K */
    public final void m60977K(AgeBand ageBand, String qrCode) {
        Intrinsics.checkNotNullParameter(ageBand, "ageBand");
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new QRCodeScanViewModel$linkRegisteredGuestByQrCode$1(this, ageBand, qrCode, null), 3, null);
    }
}