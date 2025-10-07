package com.disney.wdpro.qr_core.scan;

import com.disney.wdpro.family_and_friends_ui.p127ui.activity.QRFindMatchActivity;
import com.disney.wdpro.friendsservices.business.FriendApiClientImpl;
import com.disney.wdpro.qr_core.QRCodeError;
import com.disney.wdpro.qr_core.QRCodeException;
import com.disney.wdpro.qr_core.display.data.QRStatus;
import com.disney.wdpro.qr_core.display.rest.AgeBand;
import com.disney.wdpro.qr_core.scan.data.LinkAccountType;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C30064h;
import kotlinx.coroutines.C30180u0;
import okhttp3.ResponseBody;
import org.jose4j.jwk.OctetSequenceJsonWebKey;
import org.jose4j.jwk.RsaJsonWebKey;
import p1045wm.GetProfileByQRCodeResponse;
import p1045wm.LinkAccount;
import p1045wm.LinkAccountByQRCodeRequest;
import p1045wm.LinkAccountByQRCodeResponse;
import p1045wm.Name;
import p1045wm.Profile;
import p1081xm.InterfaceC33258a;
import p916rm.InterfaceC31922a;
import p916rm.InterfaceC31923b;
import retrofit2.C31873r;
import retrofit2.HttpException;

@Singleton
@Metadata(m92037d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 52\u00020\u0001:\u00016B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J+\u0010(\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010&JE\u00100\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00172\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/scan/QRCodeScanManager;", "", "Lxm/a;", "qrClient", "Lrm/b;", "swidProvider", "Lrm/a;", "env", "<init>", "(Lxm/a;Lrm/b;Lrm/a;)V", "Lcom/disney/wdpro/qr_core/display/rest/AgeBand;", FriendApiClientImpl.AGE_BAND_PARAM, "Lwm/c;", "linkAccountByQRCodeRequest", "Lwm/d;", OctetSequenceJsonWebKey.KEY_VALUE_MEMBER_NAME, "(Lcom/disney/wdpro/qr_core/display/rest/AgeBand;Lwm/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/Exception;", "Lkotlin/Exception;", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "Lcom/disney/wdpro/qr_core/QRCodeException;", "j", "(Ljava/lang/Exception;)Lcom/disney/wdpro/qr_core/QRCodeException;", "", "errorMessage", "Lcom/disney/wdpro/qr_core/QRCodeError;", "g", "(Ljava/lang/String;)Lcom/disney/wdpro/qr_core/QRCodeError;", "errorCode", "h", "(Lcom/disney/wdpro/qr_core/QRCodeError;)Ljava/lang/String;", QRFindMatchActivity.QR_CODE, "Lwm/a;", "i", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "swid", "Lcom/disney/wdpro/qr_core/display/data/QRStatus;", "f", "(Lcom/disney/wdpro/qr_core/display/rest/AgeBand;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "guid", "l", "(Lcom/disney/wdpro/qr_core/display/rest/AgeBand;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RsaJsonWebKey.MODULUS_MEMBER_NAME, "firstName", "lastName", "", "age", "dateOfBirth", "m", "(Lcom/disney/wdpro/qr_core/display/rest/AgeBand;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lxm/a;", "Lrm/b;", "Lrm/a;", "Companion", "a", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes16.dex */
public final class QRCodeScanManager {
    private final InterfaceC31922a env;
    private final InterfaceC33258a qrClient;
    private final InterfaceC31923b swidProvider;
    private static final String TAG = QRCodeScanManager.class.getSimpleName();
    private static final String ERROR_FETCHING_QR_CACHE = "ERROR_FETCHING_QR_CACHE";
    private static final String ERROR_FETCHING_OTP_CACHE = "ERROR_FETCHING_OTP_CACHE";
    private static final String ERROR_LINKING_MANAGED_GUEST_ACCT = "ERROR_LINKING_MANAGED_GUEST_ACCT";
    private static final String ERROR_CREATING_LINKING_MANAGED_ACCT = "ERROR_CREATING_LINKING_MANAGED_ACCT";
    private static final String ERROR_PROCESSING_REQUEST = "ERROR_PROCESSING_REQUEST";

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.qr_core.scan.QRCodeScanManager$b */
    public /* synthetic */ class C19447b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QRCodeError.values().length];
            try {
                iArr[QRCodeError.INVALID_QR_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QRCodeError.INVALID_OTP_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public QRCodeScanManager(InterfaceC33258a qrClient, InterfaceC31923b swidProvider, InterfaceC31922a env) {
        Intrinsics.checkNotNullParameter(qrClient, "qrClient");
        Intrinsics.checkNotNullParameter(swidProvider, "swidProvider");
        Intrinsics.checkNotNullParameter(env, "env");
        this.qrClient = qrClient;
    }

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC31922a m60946a(QRCodeScanManager qRCodeScanManager) {
        qRCodeScanManager.getClass();
        return null;
    }

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC31923b m60949d(QRCodeScanManager qRCodeScanManager) {
        qRCodeScanManager.getClass();
        return null;
    }

    /* renamed from: g */
    private final QRCodeError m60951g(String errorMessage) {
        return StringsKt.contains$default((CharSequence) errorMessage, (CharSequence) ERROR_FETCHING_QR_CACHE, false, 2, (Object) null) ? QRCodeError.INVALID_QR_CODE : StringsKt.contains$default((CharSequence) errorMessage, (CharSequence) ERROR_FETCHING_OTP_CACHE, false, 2, (Object) null) ? QRCodeError.INVALID_OTP_CODE : (StringsKt.contains$default((CharSequence) errorMessage, (CharSequence) ERROR_LINKING_MANAGED_GUEST_ACCT, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) errorMessage, (CharSequence) ERROR_CREATING_LINKING_MANAGED_ACCT, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) errorMessage, (CharSequence) ERROR_PROCESSING_REQUEST, false, 2, (Object) null)) ? QRCodeError.ERROR_LINKING_ACCOUNT : QRCodeError.UNKNOWN;
    }

    /* renamed from: h */
    private final String m60952h(QRCodeError errorCode) {
        int i10 = C19447b.$EnumSwitchMapping$0[errorCode.ordinal()];
        return i10 != 1 ? i10 != 2 ? "Something went wrong" : "Invalid OTP Code" : "Invalid QR Code";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final QRCodeException m60953j(Exception e10) {
        C31873r<?> c31873rResponse;
        ResponseBody responseBodyM97946d;
        String strString;
        QRCodeError qRCodeErrorM60951g = QRCodeError.UNKNOWN;
        if ((e10 instanceof HttpException) && (c31873rResponse = ((HttpException) e10).response()) != null && (responseBodyM97946d = c31873rResponse.m97946d()) != null && (strString = responseBodyM97946d.string()) != null) {
            LogInstrumentation.m79024d(TAG, "    ErrorBody: " + strString);
            qRCodeErrorM60951g = m60951g(strString);
        }
        return new QRCodeException(qRCodeErrorM60951g, m60952h(qRCodeErrorM60951g), e10);
    }

    /* renamed from: k */
    private final Object m60954k(AgeBand ageBand, LinkAccountByQRCodeRequest linkAccountByQRCodeRequest, Continuation<? super LinkAccountByQRCodeResponse> continuation) {
        return C30064h.m92775g(C30180u0.m93207b(), new QRCodeScanManager$linkAccountByQRCode$2(this, linkAccountByQRCodeRequest, ageBand, null), continuation);
    }

    /* renamed from: f */
    public final Object m60955f(AgeBand ageBand, String str, Continuation<? super QRStatus> continuation) {
        return C30064h.m92775g(C30180u0.m93207b(), new QRCodeScanManager$checkQRStatus$2(this, str, ageBand, null), continuation);
    }

    /* renamed from: i */
    public final Object m60956i(String str, Continuation<? super GetProfileByQRCodeResponse> continuation) {
        return C30064h.m92775g(C30180u0.m93207b(), new QRCodeScanManager$getProfileByQRCode$2(str, this, null), continuation);
    }

    /* renamed from: l */
    public final Object m60957l(AgeBand ageBand, String str, String str2, Continuation<? super LinkAccountByQRCodeResponse> continuation) {
        LogInstrumentation.m79024d(TAG, "linkManagedGuestByQRCode(guid: " + str + ", qrCode: " + str2 + "):");
        return m60954k(ageBand, new LinkAccountByQRCodeRequest(new LinkAccount(LinkAccountType.GUID, str2, str), null, 2, null), continuation);
    }

    /* renamed from: m */
    public final Object m60958m(AgeBand ageBand, String str, String str2, String str3, int i10, String str4, Continuation<? super LinkAccountByQRCodeResponse> continuation) {
        LogInstrumentation.m79024d(TAG, "linkNewAccountByQRCode(qrCode: " + str + ", firstName: " + str2 + ", lastName: " + str3 + ", age: " + i10 + ", dateOfBirth: " + str4 + "):");
        return m60954k(ageBand, new LinkAccountByQRCodeRequest(new LinkAccount(LinkAccountType.PROFILE, str, null, 4, null), new Profile(new Name(str2, str3), i10, str4)), continuation);
    }

    /* renamed from: n */
    public final Object m60959n(AgeBand ageBand, String str, Continuation<? super LinkAccountByQRCodeResponse> continuation) {
        LogInstrumentation.m79024d(TAG, "linkRegisteredGuestByQRCode(qrCode: " + str + "):");
        return m60954k(ageBand, new LinkAccountByQRCodeRequest(new LinkAccount(LinkAccountType.AUTO, str, null, 4, null), null, 2, null), continuation);
    }
}