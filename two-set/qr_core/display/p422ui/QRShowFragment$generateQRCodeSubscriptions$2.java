package com.disney.wdpro.qr_core.display.p422ui;

import android.content.res.Resources;
import com.disney.wdpro.qr_core.QRCodeError;
import com.disney.wdpro.qr_core.display.data.QRCodeData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m92038d2 = {"Lkotlin/Result;", "Lcom/disney/wdpro/qr_core/display/data/b;", "kotlin.jvm.PlatformType", "result", "", "invoke", "(Lkotlin/Result;)V", "<anonymous>"}, m92039k = 3, m92040mv = {1, 8, 0})
/* loaded from: classes16.dex */
final class QRShowFragment$generateQRCodeSubscriptions$2 extends Lambda implements Function1<Result<? extends QRCodeData>, Unit> {

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

    QRShowFragment$generateQRCodeSubscriptions$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Result<? extends QRCodeData> result) throws Resources.NotFoundException {
        invoke2(result);
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.disney.wdpro.qr_core.display.ui.QRShowFragment$generateQRCodeSubscriptions$2$2$1.<init>(com.disney.wdpro.qr_core.display.ui.QRShowFragment):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:291)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:194)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: invoke */
    public final void invoke2(kotlin.Result<? extends com.disney.wdpro.qr_core.display.data.QRCodeData> r8) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            java.lang.Object r8 = r8.getValue()
            com.disney.wdpro.qr_core.display.ui.QRShowFragment r0 = r7.this$0
            boolean r1 = kotlin.Result.m104763isSuccessimpl(r8)
            if (r1 == 0) goto L97
            r1 = r8
            com.disney.wdpro.qr_core.display.data.b r1 = (com.disney.wdpro.qr_core.display.data.QRCodeData) r1
            com.disney.wdpro.qr_core.display.rest.AgeBand r2 = r1.getAgeBand()
            com.disney.wdpro.qr_core.display.p422ui.QRShowFragment.m60897H0(r0, r2)
            r2 = 0
            com.disney.wdpro.qr_core.display.p422ui.QRShowFragment.m60899J0(r0, r2)
            android.widget.TextView r3 = com.disney.wdpro.qr_core.display.p422ui.QRShowFragment.m60894E0(r0)
            if (r3 != 0) goto L26
            goto L2d
        L26:
            java.lang.String r4 = r1.getName()
            r3.setText(r4)
        L2d:
            android.widget.TextView r3 = com.disney.wdpro.qr_core.display.p422ui.QRShowFragment.m60892C0(r0)
            r4 = 0
            if (r3 != 0) goto L3a
            java.lang.String r3 = "qrManualCode"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r3 = r4
        L3a:
            java.lang.String r5 = r1.getOtp()
            r3.setText(r5)
            android.view.View r3 = com.disney.wdpro.qr_core.display.p422ui.QRShowFragment.m60893D0(r0)
            if (r3 != 0) goto L4d
            java.lang.String r3 = "qrManualCodeSection"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r3 = r4
        L4d:
            r3.setVisibility(r2)
            android.widget.TextView r2 = com.disney.wdpro.qr_core.display.p422ui.QRShowFragment.m60890A0(r0)
            if (r2 != 0) goto L5c
            java.lang.String r2 = "qrCodeExpiry"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            goto L5d
        L5c:
            r4 = r2
        L5d:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.NumberFormatException -> L7f
            java.lang.String r3 = r1.getExpiresInSec()     // Catch: java.lang.NumberFormatException -> L7f
            long r5 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L7f
            long r2 = r2.toMinutes(r5)     // Catch: java.lang.NumberFormatException -> L7f
            int r2 = (int) r2     // Catch: java.lang.NumberFormatException -> L7f
            android.content.res.Resources r3 = r0.getResources()     // Catch: java.lang.NumberFormatException -> L7f
            int r5 = p916rm.C31928g.qr_code_expiry     // Catch: java.lang.NumberFormatException -> L7f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L7f
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.NumberFormatException -> L7f
            java.lang.String r2 = r3.getQuantityString(r5, r2, r6)     // Catch: java.lang.NumberFormatException -> L7f
            goto L85
        L7f:
            int r2 = p916rm.C31929h.qr_code_expiry
            java.lang.String r2 = r0.getString(r2)
        L85:
            r4.setText(r2)
            com.disney.wdpro.qr_core.display.rest.AgeBand r2 = com.disney.wdpro.qr_core.display.p422ui.QRShowFragment.m60929z0(r0)
            com.disney.wdpro.qr_core.display.rest.AgeBand r3 = com.disney.wdpro.qr_core.display.rest.AgeBand.CHILD
            if (r2 == r3) goto L97
            com.disney.wdpro.qr_core.display.data.a r1 = r1.getGuestAvatar()
            com.disney.wdpro.qr_core.display.p422ui.QRShowFragment.m60928y0(r0, r1)
        L97:
            com.disney.wdpro.qr_core.display.ui.QRShowFragment r7 = r7.this$0
            java.lang.Throwable r8 = kotlin.Result.m104759exceptionOrNullimpl(r8)
            if (r8 == 0) goto Lce
            java.lang.String r0 = "null cannot be cast to non-null type com.disney.wdpro.qr_core.QRCodeException"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r0)
            com.disney.wdpro.qr_core.QRCodeException r8 = (com.disney.wdpro.qr_core.QRCodeException) r8
            com.disney.wdpro.qr_core.QRCodeError r8 = r8.getErrorCode()
            int[] r0 = com.disney.wdpro.qr_core.display.p422ui.QRShowFragment$generateQRCodeSubscriptions$2.C19437a.$EnumSwitchMapping$0
            int r8 = r8.ordinal()
            r8 = r0[r8]
            r0 = 1
            if (r8 != r0) goto Lc2
            int r8 = p916rm.C31929h.qr_network_error_title
            int r0 = p916rm.C31929h.qr_network_error_message
            com.disney.wdpro.qr_core.display.ui.QRShowFragment$generateQRCodeSubscriptions$2$2$1 r1 = new com.disney.wdpro.qr_core.display.ui.QRShowFragment$generateQRCodeSubscriptions$2$2$1
            r1.<init>()
            com.disney.wdpro.qr_core.display.p422ui.QRShowFragment.m60898I0(r7, r8, r0, r1)
            goto Lce
        Lc2:
            int r8 = p916rm.C31929h.qr_generate_qr_error_title
            int r0 = p916rm.C31929h.qr_generate_qr_error_message
            com.disney.wdpro.qr_core.display.ui.QRShowFragment$generateQRCodeSubscriptions$2$2$2 r1 = new com.disney.wdpro.qr_core.display.ui.QRShowFragment$generateQRCodeSubscriptions$2$2$2
            r1.<init>()
            com.disney.wdpro.qr_core.display.p422ui.QRShowFragment.m60898I0(r7, r8, r0, r1)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.qr_core.display.p422ui.QRShowFragment$generateQRCodeSubscriptions$2.invoke2(kotlin.Result):void");
    }
}