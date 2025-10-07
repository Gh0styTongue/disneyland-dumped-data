package com.disney.wdpro.oneclicklib.common.viewmodel;

import androidx.core.app.NotificationCompat;
import androidx.view.AbstractC3817t0;
import androidx.view.AbstractC3830y;
import androidx.view.C3783c0;
import androidx.view.C3819u0;
import com.couchbase.lite.internal.BaseTLSIdentity;
import com.disney.wdpro.eservices_ui.commons.utils.CommonNewRelicUtils;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.oneclicklib.common.OneClickPaymentEvent;
import com.disney.wdpro.payments.models.ProcessedCards;
import com.disney.wdpro.payments.models.enums.IssuerNameEnum;
import com.disney.wdpro.paymentsui.model.BasicCardDetails;
import com.disney.wdpro.photopass.services.dto.CBAssets;
import com.disney.wdpro.photopass.services.dto.CBErrors;
import com.disney.wdpro.photopass.services.dto.CBMediaWithText;
import com.disney.wdpro.photopass.services.dto.CBPaymentError;
import com.disney.wdpro.photopass.services.dto.CBPhotoPass1ClickScreenDocument;
import com.disney.wdpro.photopass.services.dto.CBText;
import com.disney.wdpro.photopass.services.model.titus.TitusOrder;
import com.disney.wdpro.photopass.services.model.titus.TitusPayment;
import com.disney.wdpro.photopass.services.model.titus.TitusPaymentSession;
import com.disney.wdpro.photopass.services.p397cb.CBPhotoPassDocumentRepository;
import com.disney.wdpro.photopass.services.utils.PhotoPassFormatHelper;
import com.disney.wdpro.photopasscommons.ext.C18820n;
import com.disney.wdpro.profile_ui.lightbox.LightBoxSessionManager;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.InterfaceC30139p1;
import org.jose4j.jwk.EllipticCurveJsonWebKey;
import p1043wk.OneClickOrderConfirmationUI;
import p804ok.LexVASUIData;
import p804ok.OneClickGuestNumberAndEmail;
import p878qk.AbstractC31719b;
import p878qk.AbstractC31720c;
import p878qk.AbstractC31721d;
import p878qk.OneClickCCData;
import p878qk.OneClickToken;
import p914rk.OneClickFlowUniqueId;
import sk.InterfaceC32163a;

@Metadata(m92037d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001BI\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00172\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00172\b\b\u0002\u00102\u001a\u00020\u0013¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0017¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0017¢\u0006\u0004\b7\u00106J\r\u00108\u001a\u00020\u0017¢\u0006\u0004\b8\u00106J\u0015\u0010;\u001a\u00020\u00172\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0017¢\u0006\u0004\b=\u00106J\u0015\u0010@\u001a\u00020\u00172\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0015\u0010D\u001a\u00020\u00172\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0017H\u0014¢\u0006\u0004\bF\u00106J#\u0010L\u001a\u0004\u0018\u00010K2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010NR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010OR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010QR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010RR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010SR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010TR\"\u0010U\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010AR\"\u0010[\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u00104R\"\u0010f\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010e\u001a\u0004\bg\u0010h\"\u0004\bi\u0010&R\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020k0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020.0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010mR \u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001a0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010mR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020p0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010mR\u001d\u0010s\u001a\b\u0012\u0004\u0012\u00020p0r8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020w0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010mR\u001d\u0010y\u001a\b\u0012\u0004\u0012\u00020w0r8\u0006¢\u0006\f\n\u0004\by\u0010t\u001a\u0004\bz\u0010vR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020#0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010mR\u001d\u0010|\u001a\b\u0012\u0004\u0012\u00020#0r8\u0006¢\u0006\f\n\u0004\b|\u0010t\u001a\u0004\b}\u0010vR'\u0010\u007f\u001a\u00020~8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R'\u0010\u001f\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u001f\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\"\u0010\u008a\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001a0j8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010mR\u0019\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020k0r8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010vR\u001f\u0010\u008e\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001a0r8F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010vR\u001f\u0010\u0090\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001a0r8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010v¨\u0006\u0091\u0001"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/common/viewmodel/OneClickViewModel;", "Landroidx/lifecycle/t0;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContextOneClick", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "oauthManager", "Lsk/a;", "oneClickManager", "Lrk/b;", "oneClickFlowUniqueId", "Lcom/disney/wdpro/photopass/services/utils/PhotoPassFormatHelper;", "formatHelper", "Lcom/disney/wdpro/profile_ui/lightbox/LightBoxSessionManager;", "lightBoxSessionManager", "Lcom/disney/wdpro/photopass/services/cb/CBPhotoPassDocumentRepository;", "Lcom/disney/wdpro/photopass/services/dto/CBPhotoPass1ClickScreenDocument;", "oneClickDocument", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;Lsk/a;Lrk/b;Lcom/disney/wdpro/photopass/services/utils/PhotoPassFormatHelper;Lcom/disney/wdpro/profile_ui/lightbox/LightBoxSessionManager;Lcom/disney/wdpro/photopass/services/cb/CBPhotoPassDocumentRepository;)V", "", "message", "Lqk/b;", "type", "", "a0", "(Ljava/lang/String;Lqk/b;)V", "Lqk/d;", "Lcom/disney/wdpro/photopass/services/model/titus/TitusOrder;", "state", "L", "(Lqk/d;)V", "titusOrder", "Lwk/a;", "z", "(Lcom/disney/wdpro/photopass/services/model/titus/TitusOrder;)Lwk/a;", "", "reAuthentication", "J", "(Z)V", "Lkotlinx/coroutines/p1;", EllipticCurveJsonWebKey.Y_MEMBER_NAME, "()Lkotlinx/coroutines/p1;", "Lcom/disney/wdpro/paymentsui/model/BasicCardDetails;", "card", "P", "(Lcom/disney/wdpro/paymentsui/model/BasicCardDetails;)V", "Lqk/c;", NotificationCompat.CATEGORY_NAVIGATION, "Q", "(Lqk/c;)V", "guestToken", CommonNewRelicUtils.RESORT_STATIC_CONTENT_ERROR_TYPE_SW, "(Ljava/lang/String;)V", "R", "()V", "N", "U", "Lcom/disney/wdpro/payments/models/ProcessedCards;", "cards", "T", "(Lcom/disney/wdpro/payments/models/ProcessedCards;)V", "generateGeneralPaymentError", "Lcom/disney/wdpro/photopass/services/dto/CBErrors;", "cbErrors", "W", "(Lcom/disney/wdpro/photopass/services/dto/CBErrors;)V", "Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent$PaymentFailed$FailureType;", "failureType", "V", "(Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent$PaymentFailed$FailureType;)V", "onCleared", "Lcom/disney/wdpro/payments/models/enums/IssuerNameEnum;", "issuerNameEnum", "Lcom/disney/wdpro/photopass/services/dto/CBAssets;", "assetsData", "Lqk/a;", "A", "(Lcom/disney/wdpro/payments/models/enums/IssuerNameEnum;Lcom/disney/wdpro/photopass/services/dto/CBAssets;)Lqk/a;", "Lkotlin/coroutines/CoroutineContext;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "Lsk/a;", "Lrk/b;", "Lcom/disney/wdpro/photopass/services/utils/PhotoPassFormatHelper;", "Lcom/disney/wdpro/profile_ui/lightbox/LightBoxSessionManager;", "Lcom/disney/wdpro/photopass/services/cb/CBPhotoPassDocumentRepository;", "errors", "Lcom/disney/wdpro/photopass/services/dto/CBErrors;", "D", "()Lcom/disney/wdpro/photopass/services/dto/CBErrors;", "Y", "Lok/a;", "lexVASUIData", "Lok/a;", "F", "()Lok/a;", "setLexVASUIData", "(Lok/a;)V", "termsAndConditionsBodyText", "Ljava/lang/String;", "getTermsAndConditionsBodyText", "()Ljava/lang/String;", "Z", "isChecked", BaseTLSIdentity.CERT_ATTRIBUTE_ORGANIZATION, "()Z", "X", "Landroidx/lifecycle/c0;", "Lok/c;", "_guestNumberAndEmail", "Landroidx/lifecycle/c0;", "_navigation", "_checkoutDataState", "Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent;", "_paymentEventsLiveData", "Landroidx/lifecycle/y;", "paymentEventsLiveData", "Landroidx/lifecycle/y;", "getPaymentEventsLiveData", "()Landroidx/lifecycle/y;", "Lqk/e;", "_token", "token", "I", "_onLoginRequired", "onLoginRequired", "getOnLoginRequired", "Lcom/disney/wdpro/photopass/services/model/titus/TitusPaymentSession;", "titusPaymentSesion", "Lcom/disney/wdpro/photopass/services/model/titus/TitusPaymentSession;", "H", "()Lcom/disney/wdpro/photopass/services/model/titus/TitusPaymentSession;", "setTitusPaymentSesion", "(Lcom/disney/wdpro/photopass/services/model/titus/TitusPaymentSession;)V", "Lcom/disney/wdpro/photopass/services/model/titus/TitusOrder;", "G", "()Lcom/disney/wdpro/photopass/services/model/titus/TitusOrder;", "setTitusOrder", "(Lcom/disney/wdpro/photopass/services/model/titus/TitusOrder;)V", "_confirmOrderState", "E", "guestNumberAndEmail", "B", "checkoutDataState", BaseTLSIdentity.CERT_ATTRIBUTE_COUNTRY, "confirmOrderState", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nOneClickViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneClickViewModel.kt\ncom/disney/wdpro/oneclicklib/common/viewmodel/OneClickViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,367:1\n1#2:368\n*E\n"})
/* loaded from: classes3.dex */
public final class OneClickViewModel extends AbstractC3817t0 {
    private final C3783c0<AbstractC31721d<BasicCardDetails>> _checkoutDataState;
    private final C3783c0<AbstractC31721d<OneClickOrderConfirmationUI>> _confirmOrderState;
    private final C3783c0<OneClickGuestNumberAndEmail> _guestNumberAndEmail;
    private final C3783c0<AbstractC31720c> _navigation;
    private final C3783c0<Boolean> _onLoginRequired;
    private final C3783c0<OneClickPaymentEvent> _paymentEventsLiveData;
    private final C3783c0<OneClickToken> _token;
    private final CoroutineContext coroutineContextOneClick;
    public CBErrors errors;
    private PhotoPassFormatHelper formatHelper;
    private boolean isChecked;
    public LexVASUIData lexVASUIData;
    private final LightBoxSessionManager lightBoxSessionManager;
    private AuthenticationManager oauthManager;
    private final AbstractC3830y<Boolean> onLoginRequired;
    private final CBPhotoPassDocumentRepository<CBPhotoPass1ClickScreenDocument> oneClickDocument;
    private final OneClickFlowUniqueId oneClickFlowUniqueId;
    private final InterfaceC32163a oneClickManager;
    private final AbstractC3830y<OneClickPaymentEvent> paymentEventsLiveData;
    public String termsAndConditionsBodyText;
    public TitusOrder titusOrder;
    public TitusPaymentSession titusPaymentSesion;
    private final AbstractC3830y<OneClickToken> token;

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.common.viewmodel.OneClickViewModel$a */
    public /* synthetic */ class C16611a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OneClickPaymentEvent.PaymentFailed.FailureType.values().length];
            try {
                iArr[OneClickPaymentEvent.PaymentFailed.FailureType.DECLINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OneClickPaymentEvent.PaymentFailed.FailureType.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OneClickPaymentEvent.PaymentFailed.FailureType.HIGH_TRUST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IssuerNameEnum.values().length];
            try {
                iArr2[IssuerNameEnum.AMX.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IssuerNameEnum.DIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IssuerNameEnum.VIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IssuerNameEnum.MAS.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IssuerNameEnum.JCB.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[IssuerNameEnum.DNN.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Inject
    public OneClickViewModel(@Named("OneClickCoroutineContext") CoroutineContext coroutineContextOneClick, AuthenticationManager oauthManager, InterfaceC32163a oneClickManager, OneClickFlowUniqueId oneClickFlowUniqueId, PhotoPassFormatHelper formatHelper, LightBoxSessionManager lightBoxSessionManager, CBPhotoPassDocumentRepository<CBPhotoPass1ClickScreenDocument> oneClickDocument) {
        Intrinsics.checkNotNullParameter(coroutineContextOneClick, "coroutineContextOneClick");
        Intrinsics.checkNotNullParameter(oauthManager, "oauthManager");
        Intrinsics.checkNotNullParameter(oneClickManager, "oneClickManager");
        Intrinsics.checkNotNullParameter(oneClickFlowUniqueId, "oneClickFlowUniqueId");
        Intrinsics.checkNotNullParameter(formatHelper, "formatHelper");
        Intrinsics.checkNotNullParameter(lightBoxSessionManager, "lightBoxSessionManager");
        Intrinsics.checkNotNullParameter(oneClickDocument, "oneClickDocument");
        this.coroutineContextOneClick = coroutineContextOneClick;
        this.oauthManager = oauthManager;
        this.oneClickFlowUniqueId = oneClickFlowUniqueId;
        this.formatHelper = formatHelper;
        this.lightBoxSessionManager = lightBoxSessionManager;
        this.oneClickDocument = oneClickDocument;
        this._guestNumberAndEmail = new C3783c0<>();
        this._navigation = new C3783c0<>();
        this._checkoutDataState = new C3783c0<>();
        C3783c0<OneClickPaymentEvent> c3783c0 = new C3783c0<>();
        this._paymentEventsLiveData = c3783c0;
        this.paymentEventsLiveData = c3783c0;
        C3783c0<OneClickToken> c3783c02 = new C3783c0<>();
        this._token = c3783c02;
        this.token = c3783c02;
        C3783c0<Boolean> c3783c03 = new C3783c0<>();
        this._onLoginRequired = c3783c03;
        this.onLoginRequired = c3783c03;
        this._confirmOrderState = new C3783c0<>();
    }

    /* renamed from: K */
    public static /* synthetic */ void m56497K(OneClickViewModel oneClickViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        oneClickViewModel.m56516J(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m56498L(AbstractC31721d<TitusOrder> state) {
        Unit unit;
        if (!(state instanceof AbstractC31721d.Success)) {
            if (state instanceof AbstractC31721d.Error) {
                generateGeneralPaymentError();
                return;
            }
            return;
        }
        OneClickOrderConfirmationUI oneClickOrderConfirmationUIM56506z = m56506z((TitusOrder) ((AbstractC31721d.Success) state).m97379a());
        if (oneClickOrderConfirmationUIM56506z != null) {
            this._confirmOrderState.setValue(new AbstractC31721d.Success(oneClickOrderConfirmationUIM56506z));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            m56500b0(this, null, new AbstractC31719b.ClassicBanner(null, 1, null), 1, null);
        }
    }

    /* renamed from: a0 */
    private final void m56499a0(String message, AbstractC31719b type) {
        this._confirmOrderState.postValue(new AbstractC31721d.Error(message, null, type, 2, null));
    }

    /* renamed from: b0 */
    static /* synthetic */ void m56500b0(OneClickViewModel oneClickViewModel, String str, AbstractC31719b abstractC31719b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        oneClickViewModel.m56499a0(str, abstractC31719b);
    }

    /* renamed from: v */
    public static final /* synthetic */ InterfaceC32163a m56503v(OneClickViewModel oneClickViewModel) {
        oneClickViewModel.getClass();
        return null;
    }

    /* renamed from: z */
    private final OneClickOrderConfirmationUI m56506z(TitusOrder titusOrder) {
        String email;
        String rrn;
        String authorizationCode;
        String currency;
        String phoneNumber;
        AbstractC31721d<BasicCardDetails> value = m56508B().getValue();
        if (!(value instanceof AbstractC31721d.Success)) {
            return null;
        }
        BasicCardDetails basicCardDetails = (BasicCardDetails) ((AbstractC31721d.Success) value).m97379a();
        CBPhotoPass1ClickScreenDocument cBPhotoPass1ClickScreenDocument = (CBPhotoPass1ClickScreenDocument) this.oneClickDocument.getDocument();
        CBAssets assets = cBPhotoPass1ClickScreenDocument != null ? cBPhotoPass1ClickScreenDocument.getAssets() : null;
        List<TitusPayment> payments = titusOrder.getPayments();
        TitusPayment titusPayment = payments != null ? (TitusPayment) CollectionsKt.firstOrNull((List) payments) : null;
        String strSubstring = titusOrder.getLastUpdatedTime().substring(0, StringsKt.indexOf((CharSequence) titusOrder.getLastUpdatedTime(), '.', 0, true));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String orderId = titusOrder.getOrderId();
        OneClickGuestNumberAndEmail value2 = m56511E().getValue();
        if (value2 == null || (email = value2.getEmail()) == null) {
            email = "";
        }
        OneClickGuestNumberAndEmail value3 = m56511E().getValue();
        String phoneNumberPrefix = value3 != null ? value3.getPhoneNumberPrefix() : null;
        OneClickGuestNumberAndEmail value4 = m56511E().getValue();
        return new OneClickOrderConfirmationUI(orderId, email, phoneNumberPrefix, (value4 == null || (phoneNumber = value4.getPhoneNumber()) == null) ? "" : phoneNumber, C18820n.m60588d(strSubstring, "yyyy-MM-dd'T'HH:mm:ss", "MMM dd, yyyy", null, 4, null), m56512F().getSubTotal(), m56512F().getTaxes(), m56512F().getTotal(), (titusPayment == null || (currency = titusPayment.getCurrency()) == null) ? "" : currency, (titusPayment == null || (authorizationCode = titusPayment.getAuthorizationCode()) == null) ? "" : authorizationCode, (titusPayment == null || (rrn = titusPayment.getRrn()) == null) ? "" : rrn, m56507A(basicCardDetails.getIssuer(), assets), StringsKt.replace$default(basicCardDetails.getMaskedCardNumber(), "*", "", false, 4, (Object) null));
    }

    /* renamed from: A */
    public final OneClickCCData m56507A(IssuerNameEnum issuerNameEnum, CBAssets assetsData) {
        String text;
        CBText title;
        String accessibility;
        CBText title2;
        String text2;
        CBText title3;
        String accessibility2;
        CBText title4;
        String text3;
        CBText title5;
        String accessibility3;
        CBText title6;
        String text4;
        CBText title7;
        String accessibility4;
        CBText title8;
        String text5;
        CBText title9;
        String accessibility5;
        CBText title10;
        String text6;
        CBText title11;
        String accessibility6;
        CBText title12;
        if (assetsData == null) {
            return null;
        }
        String str = "";
        switch (issuerNameEnum == null ? -1 : C16611a.$EnumSwitchMapping$1[issuerNameEnum.ordinal()]) {
            case 1:
                CBMediaWithText amex = assetsData.getAmex();
                String strValueOf = String.valueOf(amex != null ? amex.getSrc() : null);
                CBMediaWithText amex2 = assetsData.getAmex();
                if (amex2 == null || (title2 = amex2.getTitle()) == null || (text = title2.getText()) == null) {
                    text = "";
                }
                CBMediaWithText amex3 = assetsData.getAmex();
                if (amex3 != null && (title = amex3.getTitle()) != null && (accessibility = title.getAccessibility()) != null) {
                    str = accessibility;
                }
                return new OneClickCCData(strValueOf, text, str);
            case 2:
                CBMediaWithText diners = assetsData.getDiners();
                String strValueOf2 = String.valueOf(diners != null ? diners.getSrc() : null);
                CBMediaWithText diners2 = assetsData.getDiners();
                if (diners2 == null || (title4 = diners2.getTitle()) == null || (text2 = title4.getText()) == null) {
                    text2 = "";
                }
                CBMediaWithText diners3 = assetsData.getDiners();
                if (diners3 != null && (title3 = diners3.getTitle()) != null && (accessibility2 = title3.getAccessibility()) != null) {
                    str = accessibility2;
                }
                return new OneClickCCData(strValueOf2, text2, str);
            case 3:
                CBMediaWithText visa = assetsData.getVisa();
                String strValueOf3 = String.valueOf(visa != null ? visa.getSrc() : null);
                CBMediaWithText visa2 = assetsData.getVisa();
                if (visa2 == null || (title6 = visa2.getTitle()) == null || (text3 = title6.getText()) == null) {
                    text3 = "";
                }
                CBMediaWithText visa3 = assetsData.getVisa();
                if (visa3 != null && (title5 = visa3.getTitle()) != null && (accessibility3 = title5.getAccessibility()) != null) {
                    str = accessibility3;
                }
                return new OneClickCCData(strValueOf3, text3, str);
            case 4:
                CBMediaWithText mastercard = assetsData.getMastercard();
                String strValueOf4 = String.valueOf(mastercard != null ? mastercard.getSrc() : null);
                CBMediaWithText mastercard2 = assetsData.getMastercard();
                if (mastercard2 == null || (title8 = mastercard2.getTitle()) == null || (text4 = title8.getText()) == null) {
                    text4 = "";
                }
                CBMediaWithText mastercard3 = assetsData.getMastercard();
                if (mastercard3 != null && (title7 = mastercard3.getTitle()) != null && (accessibility4 = title7.getAccessibility()) != null) {
                    str = accessibility4;
                }
                return new OneClickCCData(strValueOf4, text4, str);
            case 5:
                CBMediaWithText jcb = assetsData.getJcb();
                String strValueOf5 = String.valueOf(jcb != null ? jcb.getSrc() : null);
                CBMediaWithText jcb2 = assetsData.getJcb();
                if (jcb2 == null || (title10 = jcb2.getTitle()) == null || (text5 = title10.getText()) == null) {
                    text5 = "";
                }
                CBMediaWithText jcb3 = assetsData.getJcb();
                if (jcb3 != null && (title9 = jcb3.getTitle()) != null && (accessibility5 = title9.getAccessibility()) != null) {
                    str = accessibility5;
                }
                return new OneClickCCData(strValueOf5, text5, str);
            case 6:
                CBMediaWithText discover = assetsData.getDiscover();
                String strValueOf6 = String.valueOf(discover != null ? discover.getSrc() : null);
                CBMediaWithText discover2 = assetsData.getDiscover();
                if (discover2 == null || (title12 = discover2.getTitle()) == null || (text6 = title12.getText()) == null) {
                    text6 = "";
                }
                CBMediaWithText discover3 = assetsData.getDiscover();
                if (discover3 != null && (title11 = discover3.getTitle()) != null && (accessibility6 = title11.getAccessibility()) != null) {
                    str = accessibility6;
                }
                return new OneClickCCData(strValueOf6, text6, str);
            default:
                return null;
        }
    }

    /* renamed from: B */
    public final AbstractC3830y<AbstractC31721d<BasicCardDetails>> m56508B() {
        return this._checkoutDataState;
    }

    /* renamed from: C */
    public final AbstractC3830y<AbstractC31721d<OneClickOrderConfirmationUI>> m56509C() {
        return this._confirmOrderState;
    }

    /* renamed from: D */
    public final CBErrors m56510D() {
        CBErrors cBErrors = this.errors;
        if (cBErrors != null) {
            return cBErrors;
        }
        Intrinsics.throwUninitializedPropertyAccessException("errors");
        return null;
    }

    /* renamed from: E */
    public final AbstractC3830y<OneClickGuestNumberAndEmail> m56511E() {
        return this._guestNumberAndEmail;
    }

    /* renamed from: F */
    public final LexVASUIData m56512F() {
        LexVASUIData lexVASUIData = this.lexVASUIData;
        if (lexVASUIData != null) {
            return lexVASUIData;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lexVASUIData");
        return null;
    }

    /* renamed from: G */
    public final TitusOrder m56513G() {
        TitusOrder titusOrder = this.titusOrder;
        if (titusOrder != null) {
            return titusOrder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("titusOrder");
        return null;
    }

    /* renamed from: H */
    public final TitusPaymentSession m56514H() {
        TitusPaymentSession titusPaymentSession = this.titusPaymentSesion;
        if (titusPaymentSession != null) {
            return titusPaymentSession;
        }
        Intrinsics.throwUninitializedPropertyAccessException("titusPaymentSesion");
        return null;
    }

    /* renamed from: I */
    public final AbstractC3830y<OneClickToken> m56515I() {
        return this.token;
    }

    /* renamed from: J */
    public final void m56516J(boolean reAuthentication) {
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new OneClickViewModel$getToken$1(this, reAuthentication, null), 3, null);
    }

    /* renamed from: N */
    public final void m56517N() {
        this._checkoutDataState.setValue(new AbstractC31721d.Loading(false));
    }

    /* renamed from: O, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* renamed from: P */
    public final void m56519P(BasicCardDetails card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this._checkoutDataState.setValue(new AbstractC31721d.Success(card));
    }

    /* renamed from: Q */
    public final void m56520Q(AbstractC31720c navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this._navigation.setValue(navigation);
    }

    /* renamed from: R */
    public final void m56521R() {
        this._paymentEventsLiveData.postValue(OneClickPaymentEvent.C16608a.INSTANCE);
    }

    /* renamed from: S */
    public final void m56522S(String guestToken) {
        Intrinsics.checkNotNullParameter(guestToken, "guestToken");
        if (StringsKt.isBlank(guestToken)) {
            return;
        }
        this._paymentEventsLiveData.postValue(new OneClickPaymentEvent.PaymentButton(guestToken));
    }

    /* renamed from: T */
    public final void m56523T(ProcessedCards cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new OneClickViewModel$onCardsProcessed$1(cards, this, null), 3, null);
    }

    /* renamed from: U */
    public final void m56524U() {
        this._paymentEventsLiveData.postValue(OneClickPaymentEvent.C16610c.INSTANCE);
    }

    /* renamed from: V */
    public final void m56525V(OneClickPaymentEvent.PaymentFailed.FailureType failureType) {
        CBText title;
        Intrinsics.checkNotNullParameter(failureType, "failureType");
        int i10 = C16611a.$EnumSwitchMapping$0[failureType.ordinal()];
        if (i10 == 1) {
            C3783c0<OneClickPaymentEvent> c3783c0 = this._paymentEventsLiveData;
            CBPaymentError declinedPaymentError = m56510D().getDeclinedPaymentError();
            c3783c0.postValue(new OneClickPaymentEvent.PaymentFailed(false, (declinedPaymentError == null || (title = declinedPaymentError.getTitle()) == null) ? null : title.getText()));
        } else if (i10 == 2) {
            generateGeneralPaymentError();
        } else {
            if (i10 != 3) {
                return;
            }
            this._onLoginRequired.postValue(Boolean.TRUE);
        }
    }

    /* renamed from: W */
    public final void m56526W(CBErrors cbErrors) {
        Intrinsics.checkNotNullParameter(cbErrors, "cbErrors");
        m56528Y(cbErrors);
    }

    /* renamed from: X */
    public final void m56527X(boolean z10) {
        this.isChecked = z10;
    }

    /* renamed from: Y */
    public final void m56528Y(CBErrors cBErrors) {
        Intrinsics.checkNotNullParameter(cBErrors, "<set-?>");
        this.errors = cBErrors;
    }

    /* renamed from: Z */
    public final void m56529Z(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.termsAndConditionsBodyText = str;
    }

    public final void generateGeneralPaymentError() {
        CBText title;
        C3783c0<OneClickPaymentEvent> c3783c0 = this._paymentEventsLiveData;
        CBPaymentError generalPaymentError = m56510D().getGeneralPaymentError();
        c3783c0.postValue(new OneClickPaymentEvent.PaymentFailed(true, (generalPaymentError == null || (title = generalPaymentError.getTitle()) == null) ? null : title.getText()));
    }

    public final AbstractC3830y<OneClickPaymentEvent> getPaymentEventsLiveData() {
        return this.paymentEventsLiveData;
    }

    @Override // androidx.view.AbstractC3817t0
    protected void onCleared() {
        super.onCleared();
        this.oneClickFlowUniqueId.m98088b();
    }

    /* renamed from: y */
    public final InterfaceC30139p1 m56530y() {
        return C30113j.m92948d(C3819u0.m20261a(this), null, null, new OneClickViewModel$confirmOrder$1(this, null), 3, null);
    }
}