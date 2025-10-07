package com.disney.wdpro.qr_core.display.p422ui;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.view.C3821v0;
import androidx.view.C3829x0;
import androidx.view.InterfaceC3798k;
import androidx.view.InterfaceC3831y0;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.p063id.android.lightbox.LightboxActivity;
import com.disney.wdpro.dash.dao.C9433g0;
import com.disney.wdpro.dinecheckin.analytics.CheckInEventHelper;
import com.disney.wdpro.friendsservices.business.FriendApiClientImpl;
import com.disney.wdpro.photopasslib.analytics.AnalyticsTrackActions;
import com.disney.wdpro.qr_core.QRCodeError;
import com.disney.wdpro.qr_core.QRCodeException;
import com.disney.wdpro.qr_core.QRStyle;
import com.disney.wdpro.qr_core.display.data.Avatar;
import com.disney.wdpro.qr_core.display.data.QRCodeData;
import com.disney.wdpro.qr_core.display.data.QRStatus;
import com.disney.wdpro.qr_core.display.p422ui.ConsentDialogFragment;
import com.disney.wdpro.qr_core.display.rest.AgeBand;
import com.disney.wdpro.qr_core.p424ui.C19460f;
import com.disney.wdpro.qr_core.p424ui.ExpandableTextView;
import com.newrelic.agent.android.api.p476v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p861q2.AbstractC31645a;
import p916rm.C31925d;
import p916rm.C31928g;
import p916rm.C31929h;
import p982um.C32456c;
import p982um.InterfaceC32455b;
import sm.InterfaceC32166a;
import tm.C32310e;
import tm.C32311f;
import tm.C32312g;

@Metadata(m92037d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 x2\u00020\u0001:\u0001yB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J/\u0010+\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\r2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J-\u00108\u001a\u0004\u0018\u0001072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010\u0003R\"\u0010>\u001a\u00020=8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010`\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010aR\u0016\u0010c\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010[R\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010[R\u0016\u0010i\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010[R\u0016\u0010l\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bl\u0010jR\u0016\u0010m\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bm\u0010jR\u0016\u0010o\u001a\u00020n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010jR\u0018\u0010r\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010jR\u0018\u0010s\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010[R\u0018\u0010t\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010jR\u0014\u0010w\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v¨\u0006z"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/display/ui/QRShowFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "O0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/constraintlayout/widget/ConstraintLayout;", "N0", "M0", "", "b1", "d1", "f1", "Q0", "S0", "", "initializing", "i1", "(Z)V", "", "Y0", "(Z)I", "W0", "j1", "T0", "V0", "()I", "", LightboxActivity.ACTION_NAME_EXTRA, "categoryValue", "k1", "(Ljava/lang/String;Ljava/lang/String;)V", "stateName", CheckInEventHelper.CHECK_IN_TRACK_STATE, "(Ljava/lang/String;)V", "title", "message", "Lkotlin/Function0;", "action", "g1", "(IILkotlin/jvm/functions/Function0;)V", "Lcom/disney/wdpro/qr_core/display/data/a;", "avatar", "R0", "(Lcom/disney/wdpro/qr_core/display/data/a;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onActivityCreated", "(Landroid/os/Bundle;)V", "onResume", "Lum/c;", "viewModelFactory", "Lum/c;", "Z0", "()Lum/c;", "setViewModelFactory$profile_qr_core_release", "(Lum/c;)V", "Lsm/a;", C9433g0.ANALYTICS_PROPERTY, "Lsm/a;", "U0", "()Lsm/a;", "setAnalytics$profile_qr_core_release", "(Lsm/a;)V", "Lcom/disney/wdpro/qr_core/display/ui/QRShowViewModel;", "qrShowViewModel$delegate", "Lkotlin/Lazy;", "X0", "()Lcom/disney/wdpro/qr_core/display/ui/QRShowViewModel;", "qrShowViewModel", "Lcom/disney/wdpro/qr_core/display/ui/QRShowFragmentState;", "fragmentState", "Lcom/disney/wdpro/qr_core/display/ui/QRShowFragmentState;", "Lcom/disney/wdpro/qr_core/display/rest/AgeBand;", FriendApiClientImpl.AGE_BAND_PARAM, "Lcom/disney/wdpro/qr_core/display/rest/AgeBand;", "Lcom/disney/wdpro/qr_core/QRStyle;", "style", "Lcom/disney/wdpro/qr_core/QRStyle;", "qrProgressBar", "Landroid/view/View;", "Landroid/widget/FrameLayout;", "qrCodeLayout", "Landroid/widget/FrameLayout;", "Landroid/widget/Button;", "qrStatusButton", "Landroid/widget/Button;", "qrContinueButton", "qrCodeView", "Landroid/widget/ImageView;", "qrCodeImage", "Landroid/widget/ImageView;", "qrConfirmationIcon", "Landroid/widget/TextView;", "qrConfirmationText", "Landroid/widget/TextView;", "qrManualCodeSection", "qrManualCode", "qrCodeExpiry", "Lcom/disney/wdpro/qr_core/ui/ExpandableTextView;", "qrManuelCodeHowTo", "Lcom/disney/wdpro/qr_core/ui/ExpandableTextView;", "qrTitle", "qrNameLabel", "qrLinkingReservationView", "qrLinkingReservationLink", "a1", "()Z", "isChild", "Companion", "a", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
@SourceDebugExtension({"SMAP\nQRShowFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRShowFragment.kt\ncom/disney/wdpro/qr_core/display/ui/QRShowFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,393:1\n106#2,15:394\n29#3:409\n*S KotlinDebug\n*F\n+ 1 QRShowFragment.kt\ncom/disney/wdpro/qr_core/display/ui/QRShowFragment\n*L\n58#1:394,15\n355#1:409\n*E\n"})
/* loaded from: classes16.dex */
public final class QRShowFragment extends Fragment implements TraceFieldInterface {
    private static final String CONSENT_DIALOG_TAG = "CONSENT_DIALOG_TAG";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FRAGMENT_STATE = "FRAGMENT_STATE";
    private static final String FRAGMENT_STYLE = "FRAGMENT_STYLE";
    public Trace _nr_trace;
    private AgeBand ageBand;

    @Inject
    public InterfaceC32166a analytics;
    private QRShowFragmentState fragmentState;
    private TextView qrCodeExpiry;
    private ImageView qrCodeImage;
    private FrameLayout qrCodeLayout;
    private View qrCodeView;
    private View qrConfirmationIcon;
    private TextView qrConfirmationText;
    private Button qrContinueButton;
    private TextView qrLinkingReservationLink;
    private View qrLinkingReservationView;
    private TextView qrManualCode;
    private View qrManualCodeSection;
    private ExpandableTextView qrManuelCodeHowTo;
    private TextView qrNameLabel;
    private View qrProgressBar;

    /* renamed from: qrShowViewModel$delegate, reason: from kotlin metadata */
    private final Lazy qrShowViewModel;
    private Button qrStatusButton;
    private TextView qrTitle;
    private QRStyle style;

    @Inject
    public C32456c viewModelFactory;

    @Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/display/ui/QRShowFragment$a;", "", "<init>", "()V", "Lcom/disney/wdpro/qr_core/display/ui/QRShowFragmentState;", "state", "Lcom/disney/wdpro/qr_core/QRStyle;", "style", "Lcom/disney/wdpro/qr_core/display/ui/QRShowFragment;", "a", "(Lcom/disney/wdpro/qr_core/display/ui/QRShowFragmentState;Lcom/disney/wdpro/qr_core/QRStyle;)Lcom/disney/wdpro/qr_core/display/ui/QRShowFragment;", "", QRShowFragment.CONSENT_DIALOG_TAG, "Ljava/lang/String;", QRShowFragment.FRAGMENT_STATE, QRShowFragment.FRAGMENT_STYLE, "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.qr_core.display.ui.QRShowFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final QRShowFragment m60932a(QRShowFragmentState state, QRStyle style) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(style, "style");
            QRShowFragment qRShowFragment = new QRShowFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(QRShowFragment.FRAGMENT_STATE, state);
            bundle.putSerializable(QRShowFragment.FRAGMENT_STYLE, style);
            qRShowFragment.setArguments(bundle);
            return qRShowFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.qr_core.display.ui.QRShowFragment$b */
    public /* synthetic */ class C19436b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[QRStyle.values().length];
            try {
                iArr[QRStyle.STARWARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QRStyle.FAB_50.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QRStyle.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[QRShowFragmentState.values().length];
            try {
                iArr2[QRShowFragmentState.SHOW_QRCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[QRShowFragmentState.SHOW_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AgeBand.values().length];
            try {
                iArr3[AgeBand.CHILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AgeBand.ADULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[AgeBand.TEEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public QRShowFragment() {
        Function0<C3821v0.c> function0 = new Function0<C3821v0.c>() { // from class: com.disney.wdpro.qr_core.display.ui.QRShowFragment$qrShowViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C3821v0.c invoke() {
                return this.this$0.m60931Z0();
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.disney.wdpro.qr_core.display.ui.QRShowFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<InterfaceC3831y0>() { // from class: com.disney.wdpro.qr_core.display.ui.QRShowFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final InterfaceC3831y0 invoke() {
                return (InterfaceC3831y0) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.qrShowViewModel = FragmentViewModelLazyKt.m19544c(this, Reflection.getOrCreateKotlinClass(QRShowViewModel.class), new Function0<C3829x0>() { // from class: com.disney.wdpro.qr_core.display.ui.QRShowFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C3829x0 invoke() {
                return FragmentViewModelLazyKt.m19545d(lazy).getViewModelStore();
            }
        }, new Function0<AbstractC31645a>() { // from class: com.disney.wdpro.qr_core.display.ui.QRShowFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final AbstractC31645a invoke() {
                AbstractC31645a abstractC31645a;
                Function0 function04 = function03;
                if (function04 != null && (abstractC31645a = (AbstractC31645a) function04.invoke()) != null) {
                    return abstractC31645a;
                }
                InterfaceC3831y0 interfaceC3831y0M19545d = FragmentViewModelLazyKt.m19545d(lazy);
                InterfaceC3798k interfaceC3798k = interfaceC3831y0M19545d instanceof InterfaceC3798k ? (InterfaceC3798k) interfaceC3831y0M19545d : null;
                return interfaceC3798k != null ? interfaceC3798k.getDefaultViewModelCreationExtras() : AbstractC31645a.a.f80598b;
            }
        }, function0);
        this.fragmentState = QRShowFragmentState.SHOW_STATUS;
        this.ageBand = AgeBand.CHILD;
        this.style = QRStyle.DEFAULT;
    }

    /* renamed from: M0 */
    private final ConstraintLayout m60902M0(LayoutInflater inflater, ViewGroup container) {
        C32310e c32310eM98954c = C32310e.m98954c(inflater, container, false);
        FrameLayout frameLayout = c32310eM98954c.qrProgressBar;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "it.qrProgressBar");
        this.qrProgressBar = frameLayout;
        FrameLayout frameLayout2 = c32310eM98954c.frameLayout;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "it.frameLayout");
        this.qrCodeLayout = frameLayout2;
        Button button = c32310eM98954c.qrStatusButton;
        Intrinsics.checkNotNullExpressionValue(button, "it.qrStatusButton");
        this.qrStatusButton = button;
        Button button2 = c32310eM98954c.qrContinueButton;
        Intrinsics.checkNotNullExpressionValue(button2, "it.qrContinueButton");
        this.qrContinueButton = button2;
        ConstraintLayout constraintLayout = c32310eM98954c.qrCodeView;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "it.qrCodeView");
        this.qrCodeView = constraintLayout;
        ImageView imageView = c32310eM98954c.qrCodeImage;
        Intrinsics.checkNotNullExpressionValue(imageView, "it.qrCodeImage");
        this.qrCodeImage = imageView;
        TextView textView = c32310eM98954c.qrConfirmationIcon;
        Intrinsics.checkNotNullExpressionValue(textView, "it.qrConfirmationIcon");
        this.qrConfirmationIcon = textView;
        TextView textView2 = c32310eM98954c.qrConfirmationText;
        Intrinsics.checkNotNullExpressionValue(textView2, "it.qrConfirmationText");
        this.qrConfirmationText = textView2;
        LinearLayout linearLayout = c32310eM98954c.qrManualCodeSection;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "it.qrManualCodeSection");
        this.qrManualCodeSection = linearLayout;
        TextView textView3 = c32310eM98954c.qrManualCode;
        Intrinsics.checkNotNullExpressionValue(textView3, "it.qrManualCode");
        this.qrManualCode = textView3;
        TextView textView4 = c32310eM98954c.qrCodeExpiry;
        Intrinsics.checkNotNullExpressionValue(textView4, "it.qrCodeExpiry");
        this.qrCodeExpiry = textView4;
        ExpandableTextView expandableTextView = c32310eM98954c.qrManualCodeHowto;
        Intrinsics.checkNotNullExpressionValue(expandableTextView, "it.qrManualCodeHowto");
        this.qrManuelCodeHowTo = expandableTextView;
        TextView textView5 = c32310eM98954c.qrTitle;
        Intrinsics.checkNotNullExpressionValue(textView5, "it.qrTitle");
        this.qrTitle = textView5;
        this.qrNameLabel = c32310eM98954c.qrNameLabel;
        ConstraintLayout root = c32310eM98954c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "inflate(inflater, contai…eLabel\n            }.root");
        return root;
    }

    /* renamed from: N0 */
    private final ConstraintLayout m60903N0(LayoutInflater inflater, ViewGroup container) {
        C32311f c32311fM98957c = C32311f.m98957c(inflater, container, false);
        FrameLayout frameLayout = c32311fM98957c.qrProgressBar;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "it.qrProgressBar");
        this.qrProgressBar = frameLayout;
        FrameLayout frameLayout2 = c32311fM98957c.frameLayout;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "it.frameLayout");
        this.qrCodeLayout = frameLayout2;
        Button button = c32311fM98957c.qrStatusButton;
        Intrinsics.checkNotNullExpressionValue(button, "it.qrStatusButton");
        this.qrStatusButton = button;
        Button button2 = c32311fM98957c.qrContinueButton;
        Intrinsics.checkNotNullExpressionValue(button2, "it.qrContinueButton");
        this.qrContinueButton = button2;
        ConstraintLayout constraintLayout = c32311fM98957c.qrCodeView;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "it.qrCodeView");
        this.qrCodeView = constraintLayout;
        ImageView imageView = c32311fM98957c.qrCodeImage;
        Intrinsics.checkNotNullExpressionValue(imageView, "it.qrCodeImage");
        this.qrCodeImage = imageView;
        TextView textView = c32311fM98957c.qrConfirmationIcon;
        Intrinsics.checkNotNullExpressionValue(textView, "it.qrConfirmationIcon");
        this.qrConfirmationIcon = textView;
        TextView textView2 = c32311fM98957c.qrConfirmationText;
        Intrinsics.checkNotNullExpressionValue(textView2, "it.qrConfirmationText");
        this.qrConfirmationText = textView2;
        LinearLayout linearLayout = c32311fM98957c.qrManualCodeSection;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "it.qrManualCodeSection");
        this.qrManualCodeSection = linearLayout;
        TextView textView3 = c32311fM98957c.qrManualCode;
        Intrinsics.checkNotNullExpressionValue(textView3, "it.qrManualCode");
        this.qrManualCode = textView3;
        TextView textView4 = c32311fM98957c.qrCodeExpiry;
        Intrinsics.checkNotNullExpressionValue(textView4, "it.qrCodeExpiry");
        this.qrCodeExpiry = textView4;
        ExpandableTextView expandableTextView = c32311fM98957c.qrManualCodeHowto;
        Intrinsics.checkNotNullExpressionValue(expandableTextView, "it.qrManualCodeHowto");
        this.qrManuelCodeHowTo = expandableTextView;
        TextView textView5 = c32311fM98957c.qrTitle;
        Intrinsics.checkNotNullExpressionValue(textView5, "it.qrTitle");
        this.qrTitle = textView5;
        ConstraintLayout root = c32311fM98957c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "inflate(inflater, contai…rTitle\n            }.root");
        return root;
    }

    /* renamed from: O0 */
    private final ConstraintLayout m60904O0(LayoutInflater inflater, ViewGroup container) {
        C32312g c32312gM98960c = C32312g.m98960c(inflater, container, false);
        FrameLayout frameLayout = c32312gM98960c.qrProgressBar;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "it.qrProgressBar");
        this.qrProgressBar = frameLayout;
        FrameLayout frameLayout2 = c32312gM98960c.frameLayout;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "it.frameLayout");
        this.qrCodeLayout = frameLayout2;
        Button button = c32312gM98960c.qrStatusButton;
        Intrinsics.checkNotNullExpressionValue(button, "it.qrStatusButton");
        this.qrStatusButton = button;
        Button button2 = c32312gM98960c.qrContinueButton;
        Intrinsics.checkNotNullExpressionValue(button2, "it.qrContinueButton");
        this.qrContinueButton = button2;
        ConstraintLayout constraintLayout = c32312gM98960c.qrCodeView;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "it.qrCodeView");
        this.qrCodeView = constraintLayout;
        ImageView imageView = c32312gM98960c.qrCodeImage;
        Intrinsics.checkNotNullExpressionValue(imageView, "it.qrCodeImage");
        this.qrCodeImage = imageView;
        LottieAnimationView lottieAnimationView = c32312gM98960c.qrConfirmationIcon;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "it.qrConfirmationIcon");
        this.qrConfirmationIcon = lottieAnimationView;
        TextView textView = c32312gM98960c.qrConfirmationText;
        Intrinsics.checkNotNullExpressionValue(textView, "it.qrConfirmationText");
        this.qrConfirmationText = textView;
        LinearLayout linearLayout = c32312gM98960c.qrManualCodeSection;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "it.qrManualCodeSection");
        this.qrManualCodeSection = linearLayout;
        TextView textView2 = c32312gM98960c.qrManualCode;
        Intrinsics.checkNotNullExpressionValue(textView2, "it.qrManualCode");
        this.qrManualCode = textView2;
        TextView textView3 = c32312gM98960c.qrCodeExpiry;
        Intrinsics.checkNotNullExpressionValue(textView3, "it.qrCodeExpiry");
        this.qrCodeExpiry = textView3;
        ExpandableTextView expandableTextView = c32312gM98960c.qrManualCodeHowto;
        Intrinsics.checkNotNullExpressionValue(expandableTextView, "it.qrManualCodeHowto");
        this.qrManuelCodeHowTo = expandableTextView;
        TextView textView4 = c32312gM98960c.qrTitle;
        Intrinsics.checkNotNullExpressionValue(textView4, "it.qrTitle");
        this.qrTitle = textView4;
        this.qrLinkingReservationView = c32312gM98960c.qrLinkingReservationView;
        TextView textView5 = c32312gM98960c.qrLinkingReservationLink;
        this.qrLinkingReservationLink = textView5;
        if (textView5 != null) {
            textView5.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.qr_core.display.ui.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QRShowFragment.m60905P0(this.f42294a, view);
                }
            });
        }
        ConstraintLayout root = c32312gM98960c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "inflate(inflater, contai…     }\n            }.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public static final void m60905P0(QRShowFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this$0.getString(C31929h.qr_linking_reservation_deeplink))));
    }

    /* renamed from: Q0 */
    private final void m60906Q0() {
        m60912X0().m60945z(this.ageBand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public final void m60907R0(Avatar avatar) {
        ConsentDialogFragment.Companion companion = ConsentDialogFragment.INSTANCE;
        String avatarMobileSquare = avatar.getMedia().getAvatarMobileSquare();
        companion.m60888a(avatarMobileSquare != null ? Uri.parse(avatarMobileSquare) : null).show(getParentFragmentManager(), CONSENT_DIALOG_TAG);
    }

    /* renamed from: S0 */
    private final void m60908S0() {
        m60912X0().m60940A(this.ageBand);
    }

    /* renamed from: T0 */
    private final void m60909T0() {
        m60912X0().m60942C().observe(getViewLifecycleOwner(), new C19445f(new Function1<Result<? extends Bitmap>, Unit>() { // from class: com.disney.wdpro.qr_core.display.ui.QRShowFragment$generateQRCodeSubscriptions$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends Bitmap> result) {
                invoke2(result);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Result<? extends Bitmap> result) {
                Intrinsics.checkNotNullExpressionValue(result, "result");
                Object value = result.getValue();
                QRShowFragment qRShowFragment = this.this$0;
                if (Result.m104763isSuccessimpl(value)) {
                    Bitmap bitmap = (Bitmap) value;
                    ImageView imageView = qRShowFragment.qrCodeImage;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("qrCodeImage");
                        imageView = null;
                    }
                    imageView.setImageBitmap(bitmap);
                }
                Result.m104759exceptionOrNullimpl(value);
            }
        }));
        m60912X0().m60941B().observe(getViewLifecycleOwner(), new C19445f(new Function1<Result<? extends QRCodeData>, Unit>() { // from class: com.disney.wdpro.qr_core.display.ui.QRShowFragment$generateQRCodeSubscriptions$2

            @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
            /* renamed from: com.disney.wdpro.qr_core.display.ui.QRShowFragment$generateQRCodeSubscriptions$2$a */
            public /* synthetic */ class C19437a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[QRCodeError.values().length];
                    try {
                        iArr[QRCodeError.NETWORK_ERROR.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends QRCodeData> result) throws Resources.NotFoundException {
                invoke2(result);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Result<? extends QRCodeData> result) throws Resources.NotFoundException {
                String string;
                Intrinsics.checkNotNullExpressionValue(result, "result");
                Object value = result.getValue();
                QRShowFragment qRShowFragment = this.this$0;
                if (Result.m104763isSuccessimpl(value)) {
                    QRCodeData qRCodeData = (QRCodeData) value;
                    qRShowFragment.ageBand = qRCodeData.getAgeBand();
                    qRShowFragment.m60922i1(false);
                    TextView textView = qRShowFragment.qrNameLabel;
                    if (textView != null) {
                        textView.setText(qRCodeData.getName());
                    }
                    TextView textView2 = qRShowFragment.qrManualCode;
                    TextView textView3 = null;
                    if (textView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("qrManualCode");
                        textView2 = null;
                    }
                    textView2.setText(qRCodeData.getOtp());
                    View view = qRShowFragment.qrManualCodeSection;
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("qrManualCodeSection");
                        view = null;
                    }
                    view.setVisibility(0);
                    TextView textView4 = qRShowFragment.qrCodeExpiry;
                    if (textView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("qrCodeExpiry");
                    } else {
                        textView3 = textView4;
                    }
                    try {
                        int minutes = (int) TimeUnit.SECONDS.toMinutes(Long.parseLong(qRCodeData.getExpiresInSec()));
                        string = qRShowFragment.getResources().getQuantityString(C31928g.qr_code_expiry, minutes, Integer.valueOf(minutes));
                    } catch (NumberFormatException unused) {
                        string = qRShowFragment.getString(C31929h.qr_code_expiry);
                    }
                    textView3.setText(string);
                    if (qRShowFragment.ageBand != AgeBand.CHILD) {
                        qRShowFragment.m60907R0(qRCodeData.getGuestAvatar());
                    }
                }
                final QRShowFragment qRShowFragment2 = this.this$0;
                Throwable thM104759exceptionOrNullimpl = Result.m104759exceptionOrNullimpl(value);
                if (thM104759exceptionOrNullimpl != null) {
                    Intrinsics.checkNotNull(thM104759exceptionOrNullimpl, "null cannot be cast to non-null type com.disney.wdpro.qr_core.QRCodeException");
                    if (C19437a.$EnumSwitchMapping$0[((QRCodeException) thM104759exceptionOrNullimpl).getErrorCode().ordinal()] == 1) {
                        qRShowFragment2.m60920g1(C31929h.qr_network_error_title, C31929h.qr_network_error_message, new Function0<Unit>() { // from class: com.disney.wdpro.qr_core.display.ui.QRShowFragment$generateQRCodeSubscriptions$2$2$1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                FragmentActivity activity = qRShowFragment2.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                            }
                        });
                    } else {
                        qRShowFragment2.m60920g1(C31929h.qr_generate_qr_error_title, C31929h.qr_generate_qr_error_message, new Function0<Unit>() { // from class: com.disney.wdpro.qr_core.display.ui.QRShowFragment$generateQRCodeSubscriptions$2$2$2
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                FragmentActivity activity = qRShowFragment2.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                            }
                        });
                    }
                }
            }
        }));
    }

    /* renamed from: V0 */
    private final int m60910V0() {
        return (this.style != QRStyle.STARWARS || m60914a1()) ? this.style == QRStyle.FAB_50 ? C31929h.qr_text_confirmation_message_child_fab50 : m60914a1() ? C31929h.qr_text_confirmation_message_child : C31929h.qr_text_confirmation_message_adult : C31929h.qr_text_confirmation_message_adult_starwars;
    }

    /* renamed from: W0 */
    private final int m60911W0(boolean initializing) {
        int i10 = C19436b.$EnumSwitchMapping$0[this.style.ordinal()];
        if (i10 == 1) {
            return (initializing || m60914a1()) ? 8 : 0;
        }
        if (i10 == 2) {
            return initializing ? 8 : 0;
        }
        if (i10 == 3) {
            return 8;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: X0 */
    private final QRShowViewModel m60912X0() {
        return (QRShowViewModel) this.qrShowViewModel.getValue();
    }

    /* renamed from: Y0 */
    private final int m60913Y0(boolean initializing) {
        int i10 = C19436b.$EnumSwitchMapping$0[this.style.ordinal()];
        if (i10 == 1) {
            return (initializing || !m60914a1()) ? 8 : 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 8;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public final boolean m60914a1() {
        return this.ageBand == AgeBand.CHILD;
    }

    /* renamed from: b1 */
    private final void m60915b1() {
        Button button = this.qrStatusButton;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrStatusButton");
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.qr_core.display.ui.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QRShowFragment.m60916c1(this.f42295a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public static final void m60916c1(QRShowFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m60924k1("CheckStatus", this$0.m60914a1() ? "ChildAccountLinking" : "AdultAccountLinking");
        this$0.m60906Q0();
    }

    /* renamed from: d1 */
    private final void m60917d1() {
        Button button = this.qrContinueButton;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrContinueButton");
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.qr_core.display.ui.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QRShowFragment.m60918e1(this.f42293a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e1 */
    public static final void m60918e1(QRShowFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m60924k1(AnalyticsTrackActions.TRACK_VPW_DIALOG_CANCEL, this$0.m60914a1() ? "ChildAccountLinking" : "AdultAccountLinking");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        FragmentActivity activity2 = this$0.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* renamed from: f1 */
    private final void m60919f1() {
        m60912X0().m60943D().observe(getViewLifecycleOwner(), new C19445f(new Function1<Result<? extends QRStatus>, Unit>() { // from class: com.disney.wdpro.qr_core.display.ui.QRShowFragment$qrCodeStatusSubscriptons$1

            @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
            /* renamed from: com.disney.wdpro.qr_core.display.ui.QRShowFragment$qrCodeStatusSubscriptons$1$a */
            public /* synthetic */ class C19439a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[QRCodeError.values().length];
                    try {
                        iArr[QRCodeError.NETWORK_ERROR.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends QRStatus> result) {
                invoke2(result);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Result<? extends QRStatus> it) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                Object value = it.getValue();
                QRShowFragment qRShowFragment = this.this$0;
                if (Result.m104763isSuccessimpl(value)) {
                    if (((QRStatus) value) == QRStatus.LINKED) {
                        qRShowFragment.trackState(qRShowFragment.m60914a1() ? "content/childaccount/linksuccessfull" : "content/adultaccount/linksuccessfull");
                        qRShowFragment.m60923j1();
                    } else {
                        QRShowFragment.m60921h1(qRShowFragment, C31929h.qr_not_linked_title, C31929h.qr_not_linked_message, null, 4, null);
                    }
                }
                QRShowFragment qRShowFragment2 = this.this$0;
                Throwable thM104759exceptionOrNullimpl = Result.m104759exceptionOrNullimpl(value);
                if (thM104759exceptionOrNullimpl != null) {
                    Intrinsics.checkNotNull(thM104759exceptionOrNullimpl, "null cannot be cast to non-null type com.disney.wdpro.qr_core.QRCodeException");
                    if (C19439a.$EnumSwitchMapping$0[((QRCodeException) thM104759exceptionOrNullimpl).getErrorCode().ordinal()] == 1) {
                        QRShowFragment.m60921h1(qRShowFragment2, C31929h.qr_network_error_title, C31929h.qr_network_error_message, null, 4, null);
                    } else {
                        QRShowFragment.m60921h1(qRShowFragment2, C31929h.qr_check_status_error_title, C31929h.qr_check_status_error_message, null, 4, null);
                    }
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public final void m60920g1(int title, int message, final Function0<Unit> action) {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        C19460f.m61014d(contextRequireContext, null, false, false, title, message, new Function2<Dialog, View, Unit>() { // from class: com.disney.wdpro.qr_core.display.ui.QRShowFragment$showMessageDialog$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Dialog dialog, View view) {
                invoke2(dialog, view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Dialog bottomMessageDialog, View it) {
                Intrinsics.checkNotNullParameter(bottomMessageDialog, "$this$bottomMessageDialog");
                Intrinsics.checkNotNullParameter(it, "it");
                bottomMessageDialog.dismiss();
                action.invoke();
            }
        }, 2, null).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h1 */
    static /* synthetic */ void m60921h1(QRShowFragment qRShowFragment, int i10, int i11, Function0 function0, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: com.disney.wdpro.qr_core.display.ui.QRShowFragment$showMessageDialog$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        qRShowFragment.m60920g1(i10, i11, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public final void m60922i1(boolean initializing) {
        this.fragmentState = QRShowFragmentState.SHOW_QRCODE;
        TextView textView = this.qrTitle;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrTitle");
            textView = null;
        }
        textView.setText(C31929h.qr_code_screen_title);
        Button button = this.qrStatusButton;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrStatusButton");
            button = null;
        }
        button.setVisibility(m60913Y0(initializing));
        Button button2 = this.qrContinueButton;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrContinueButton");
            button2 = null;
        }
        button2.setVisibility(m60911W0(initializing));
        View view = this.qrCodeView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrCodeView");
            view = null;
        }
        view.setVisibility(0);
        ImageView imageView = this.qrCodeImage;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrCodeImage");
            imageView = null;
        }
        imageView.setVisibility(0);
        View view2 = this.qrConfirmationIcon;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrConfirmationIcon");
            view2 = null;
        }
        view2.setVisibility(8);
        TextView textView3 = this.qrConfirmationText;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrConfirmationText");
        } else {
            textView2 = textView3;
        }
        textView2.setText(m60910V0());
        View view3 = this.qrLinkingReservationView;
        if (view3 == null) {
            return;
        }
        view3.setVisibility((initializing || m60914a1()) ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public final void m60923j1() {
        this.fragmentState = QRShowFragmentState.SHOW_STATUS;
        Button button = this.qrStatusButton;
        FrameLayout frameLayout = null;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrStatusButton");
            button = null;
        }
        button.setVisibility(8);
        Button button2 = this.qrContinueButton;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrContinueButton");
            button2 = null;
        }
        button2.setVisibility(0);
        View view = this.qrCodeView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrCodeView");
            view = null;
        }
        view.setVisibility(8);
        ImageView imageView = this.qrCodeImage;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrCodeImage");
            imageView = null;
        }
        imageView.setVisibility(8);
        View view2 = this.qrConfirmationIcon;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrConfirmationIcon");
            view2 = null;
        }
        view2.setVisibility(0);
        TextView textView = this.qrConfirmationText;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrConfirmationText");
            textView = null;
        }
        textView.setText(C31929h.qr_text_scan_complete);
        View view3 = this.qrManualCodeSection;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrManualCodeSection");
            view3 = null;
        }
        view3.setVisibility(8);
        ExpandableTextView expandableTextView = this.qrManuelCodeHowTo;
        if (expandableTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrManuelCodeHowTo");
            expandableTextView = null;
        }
        expandableTextView.setVisibility(8);
        View view4 = this.qrLinkingReservationView;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        if (C19436b.$EnumSwitchMapping$0[this.style.ordinal()] != 1) {
            return;
        }
        FrameLayout frameLayout2 = this.qrCodeLayout;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("qrCodeLayout");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.setBackgroundResource(C31925d.qr_code_success_bg);
        View view5 = this.qrLinkingReservationView;
        if (view5 == null) {
            return;
        }
        view5.setVisibility(8);
    }

    /* renamed from: k1 */
    private final void m60924k1(String actionName, String categoryValue) {
        m60930U0();
        MapsKt.mapOf(TuplesKt.m92045to("link.category", categoryValue));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackState(String stateName) {
        m60930U0();
        Intrinsics.checkNotNullExpressionValue(QRShowFragment.class.getSimpleName(), "this.javaClass.simpleName");
        MapsKt.emptyMap();
        throw null;
    }

    /* renamed from: U0 */
    public final InterfaceC32166a m60930U0() {
        Intrinsics.throwUninitializedPropertyAccessException(C9433g0.ANALYTICS_PROPERTY);
        return null;
    }

    /* renamed from: Z0 */
    public final C32456c m60931Z0() {
        C32456c c32456c = this.viewModelFactory;
        if (c32456c != null) {
            return c32456c;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        m60912X0().m60944E().observe(getViewLifecycleOwner(), new C19445f(new Function1<Boolean, Unit>() { // from class: com.disney.wdpro.qr_core.display.ui.QRShowFragment.onActivityCreated.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean it) {
                View view = QRShowFragment.this.qrProgressBar;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("qrProgressBar");
                    view = null;
                }
                Intrinsics.checkNotNullExpressionValue(it, "it");
                view.setVisibility(it.booleanValue() ? 0 : 8);
            }
        }));
        m60909T0();
        m60919f1();
        m60915b1();
        m60917d1();
        if (savedInstanceState == null) {
            int i10 = C19436b.$EnumSwitchMapping$1[this.fragmentState.ordinal()];
            if (i10 == 1) {
                m60922i1(true);
                m60908S0();
            } else {
                if (i10 != 2) {
                    return;
                }
                m60923j1();
                m60906Q0();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ComponentCallbacks2 application = requireActivity().getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.disney.wdpro.qr_core.di.QRCodeLibComponentProvider");
        ((InterfaceC32455b) application).m99497a();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ConstraintLayout constraintLayoutM60904O0;
        try {
            TraceMachine.enterMethod(this._nr_trace, "QRShowFragment#onCreateView", null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod(null, "QRShowFragment#onCreateView", null);
        }
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Object obj = requireArguments().get(FRAGMENT_STATE);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.disney.wdpro.qr_core.display.ui.QRShowFragmentState");
        this.fragmentState = (QRShowFragmentState) obj;
        Object obj2 = requireArguments().get(FRAGMENT_STYLE);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.disney.wdpro.qr_core.QRStyle");
        QRStyle qRStyle = (QRStyle) obj2;
        this.style = qRStyle;
        int i10 = C19436b.$EnumSwitchMapping$0[qRStyle.ordinal()];
        if (i10 == 1) {
            constraintLayoutM60904O0 = m60904O0(inflater, container);
        } else if (i10 == 2) {
            constraintLayoutM60904O0 = m60903N0(inflater, container);
        } else {
            if (i10 != 3) {
                NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                TraceMachine.exitMethod();
                throw noWhenBranchMatchedException;
            }
            constraintLayoutM60904O0 = m60902M0(inflater, container);
        }
        TraceMachine.exitMethod();
        return constraintLayoutM60904O0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        int i10 = C19436b.$EnumSwitchMapping$2[this.ageBand.ordinal()];
        if (i10 == 1) {
            trackState("content/childaccount/qrcode");
        } else if (i10 == 2 || i10 == 3) {
            trackState("content/adultaccount/qrcode");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }
}