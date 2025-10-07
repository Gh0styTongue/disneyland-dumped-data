package com.disney.wdpro.qr_core.display.p422ui;

import android.graphics.Bitmap;
import androidx.view.AbstractC3817t0;
import androidx.view.AbstractC3830y;
import androidx.view.C3783c0;
import androidx.view.C3819u0;
import com.couchbase.lite.internal.BaseTLSIdentity;
import com.disney.wdpro.family_and_friends_ui.p127ui.activity.QRFindMatchActivity;
import com.disney.wdpro.friendsservices.business.FriendApiClientImpl;
import com.disney.wdpro.photopasslib.p419ui.util.PhotoPassExtensionsUtils;
import com.disney.wdpro.qr_core.display.data.QRCodeData;
import com.disney.wdpro.qr_core.display.data.QRCodeDisplayManager;
import com.disney.wdpro.qr_core.display.data.QRStatus;
import com.disney.wdpro.qr_core.display.rest.AgeBand;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C30113j;
import kr.C30240b;
import p1050wr.C32923b;

@Metadata(m92037d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00128\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00178\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00130\u00128\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00130\u00178\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR#\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00130\u00128\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010\u0016R&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00130\u00178\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00178\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/display/ui/QRShowViewModel;", "Landroidx/lifecycle/t0;", "Lcom/disney/wdpro/qr_core/display/data/QRCodeDisplayManager;", "manager", "<init>", "(Lcom/disney/wdpro/qr_core/display/data/QRCodeDisplayManager;)V", "", "data", "Landroid/graphics/Bitmap;", "F", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "Lcom/disney/wdpro/qr_core/display/rest/AgeBand;", FriendApiClientImpl.AGE_BAND_PARAM, "", "A", "(Lcom/disney/wdpro/qr_core/display/rest/AgeBand;)V", "z", "Lcom/disney/wdpro/qr_core/display/data/QRCodeDisplayManager;", "Landroidx/lifecycle/c0;", "Lkotlin/Result;", "Lcom/disney/wdpro/qr_core/display/data/b;", "mQRCode", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/y;", QRFindMatchActivity.QR_CODE, "Landroidx/lifecycle/y;", "B", "()Landroidx/lifecycle/y;", "mQRCodeImage", "qrCodeImage", BaseTLSIdentity.CERT_ATTRIBUTE_COUNTRY, "Lcom/disney/wdpro/qr_core/display/data/QRStatus;", "mQRCodeStatus", "qrStatus", "D", "", "mIsLoading", "isLoading", "E", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nQRShowViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRShowViewModel.kt\ncom/disney/wdpro/qr_core/display/ui/QRShowViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n84#1,9:108\n84#1,9:117\n1#2:107\n*S KotlinDebug\n*F\n+ 1 QRShowViewModel.kt\ncom/disney/wdpro/qr_core/display/ui/QRShowViewModel\n*L\n59#1:108,9\n73#1:117,9\n*E\n"})
/* loaded from: classes16.dex */
public final class QRShowViewModel extends AbstractC3817t0 {
    private final AbstractC3830y<Boolean> isLoading;
    private final C3783c0<Boolean> mIsLoading;
    private final C3783c0<Result<QRCodeData>> mQRCode;
    private final C3783c0<Result<Bitmap>> mQRCodeImage;
    private final C3783c0<Result<QRStatus>> mQRCodeStatus;
    private final QRCodeDisplayManager manager;
    private final AbstractC3830y<Result<QRCodeData>> qrCode;
    private final AbstractC3830y<Result<Bitmap>> qrCodeImage;
    private final AbstractC3830y<Result<QRStatus>> qrStatus;

    @Inject
    public QRShowViewModel(QRCodeDisplayManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.manager = manager;
        C3783c0<Result<QRCodeData>> c3783c0 = new C3783c0<>();
        this.mQRCode = c3783c0;
        this.qrCode = c3783c0;
        C3783c0<Result<Bitmap>> c3783c02 = new C3783c0<>();
        this.mQRCodeImage = c3783c02;
        this.qrCodeImage = c3783c02;
        C3783c0<Result<QRStatus>> c3783c03 = new C3783c0<>();
        this.mQRCodeStatus = c3783c03;
        this.qrStatus = c3783c03;
        C3783c0<Boolean> c3783c04 = new C3783c0<>();
        c3783c04.setValue(Boolean.FALSE);
        this.mIsLoading = c3783c04;
        this.isLoading = c3783c04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final Bitmap m60933F(String data) throws NumberFormatException, WriterException {
        C30240b c30240bMo75208a = new C32923b().mo75208a(data, BarcodeFormat.QR_CODE, 800, 800, MapsKt.mapOf(TuplesKt.m92045to(EncodeHintType.MARGIN, 1)));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c30240bMo75208a.m93299m(), c30240bMo75208a.m93296j(), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(matrix.widt…t, Bitmap.Config.RGB_565)");
        int iM93299m = c30240bMo75208a.m93299m();
        for (int i10 = 0; i10 < iM93299m; i10++) {
            int iM93296j = c30240bMo75208a.m93296j();
            for (int i11 = 0; i11 < iM93296j; i11++) {
                bitmapCreateBitmap.setPixel(i10, i11, c30240bMo75208a.m93293f(i10, i11) ? PhotoPassExtensionsUtils.QR_DEFAULT_FILLED_COLOR : -1);
            }
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: A */
    public final void m60940A(AgeBand ageBand) {
        Intrinsics.checkNotNullParameter(ageBand, "ageBand");
        this.mIsLoading.postValue(Boolean.TRUE);
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new QRShowViewModel$generateQRCode$$inlined$withLoading$1(this, null, this), 3, null);
    }

    /* renamed from: B */
    public final AbstractC3830y<Result<QRCodeData>> m60941B() {
        return this.qrCode;
    }

    /* renamed from: C */
    public final AbstractC3830y<Result<Bitmap>> m60942C() {
        return this.qrCodeImage;
    }

    /* renamed from: D */
    public final AbstractC3830y<Result<QRStatus>> m60943D() {
        return this.qrStatus;
    }

    /* renamed from: E */
    public final AbstractC3830y<Boolean> m60944E() {
        return this.isLoading;
    }

    /* renamed from: z */
    public final void m60945z(AgeBand ageBand) {
        Intrinsics.checkNotNullParameter(ageBand, "ageBand");
        this.mIsLoading.postValue(Boolean.TRUE);
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new QRShowViewModel$checkQRStatus$$inlined$withLoading$1(this, null, this, ageBand), 3, null);
    }
}