package com.disney.wdpro.qr_core.scan.p423ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C3296a;
import androidx.core.view.C3331a;
import androidx.core.view.C3337b1;
import com.disney.wdpro.scanner.zxing.client.CaptureHandler;
import com.disney.wdpro.scanner.zxing.client.camera.CameraManager;
import com.disney.wdpro.scanner.zxing.client.camera.FrontLightMode;
import com.disney.wdpro.scanner.zxing.client.interfaces.Controller;
import com.disney.wdpro.scanner.zxing.client.interfaces.ErrorHandler;
import com.disney.wdpro.scanner.zxing.client.interfaces.ScanAreaManager;
import com.disney.wdpro.scanner.zxing.client.interfaces.ScanCallback;
import com.disney.wdpro.scanner.zxing.client.interfaces.ScanCommand;
import com.disney.wdpro.scanner.zxing.client.managers.BeepManager;
import com.disney.wdpro.scanner.zxing.client.managers.ScanAreaManagerImpl;
import com.disney.wdpro.scanner.zxing.client.utils.Constants;
import com.google.zxing.C23765k;
import com.google.zxing.DecodeHintType;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jose4j.jwk.OctetSequenceJsonWebKey;
import org.jose4j.jwk.RsaJsonWebKey;
import p004a2.C0020j;
import p916rm.C31926e;
import tm.C32313h;

@Metadata(m92037d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 m2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003noHB'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010,J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\rH\u0016¢\u0006\u0004\b/\u0010\u0011J'\u00104\u001a\u00020\u000f2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\r2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u000f2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b8\u00109J'\u0010:\u001a\u00020\u000f2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\tH\u0016¢\u0006\u0004\b:\u00105J\u0017\u0010=\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\r¢\u0006\u0004\b@\u0010\u0011J\r\u0010A\u001a\u00020\u000f¢\u0006\u0004\bA\u0010,J\u000f\u0010B\u001a\u00020\u000fH\u0002¢\u0006\u0004\bB\u0010,J\u000f\u0010C\u001a\u00020\u000fH\u0002¢\u0006\u0004\bC\u0010,J\u000f\u0010D\u001a\u00020\u000fH\u0002¢\u0006\u0004\bD\u0010,J\u000f\u0010E\u001a\u00020\u000fH\u0002¢\u0006\u0004\bE\u0010,J\u0017\u0010H\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\rH\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\rH\u0002¢\u0006\u0004\bL\u0010KJ\u000f\u0010M\u001a\u00020\u000fH\u0002¢\u0006\u0004\bM\u0010,J\u000f\u0010N\u001a\u00020\u000fH\u0002¢\u0006\u0004\bN\u0010,R\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010dR\"\u0010h\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0002\b\u0003\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010jR\u0018\u0010k\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006p"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/scan/ui/QrCodeScannerView;", "Landroid/widget/FrameLayout;", "Lcom/disney/wdpro/scanner/zxing/client/interfaces/Controller;", "Lcom/disney/wdpro/scanner/zxing/client/interfaces/ScanCommand;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isVisible", "", "onVisibilityAggregated", "(Z)V", "Lcom/disney/wdpro/scanner/zxing/client/CaptureHandler;", "getHandler", "()Lcom/disney/wdpro/scanner/zxing/client/CaptureHandler;", "Lcom/google/zxing/k;", "rawResult", "Landroid/graphics/Bitmap;", "barcode", "", "scaleFactor", "handleDecode", "(Lcom/google/zxing/k;Landroid/graphics/Bitmap;F)V", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "Lcom/disney/wdpro/scanner/zxing/client/camera/CameraManager;", "getCameraManager", "()Lcom/disney/wdpro/scanner/zxing/client/camera/CameraManager;", "Lcom/disney/wdpro/scanner/zxing/client/interfaces/ScanAreaManager;", "scanAreaManager", "setScanAreaManager", "(Lcom/disney/wdpro/scanner/zxing/client/interfaces/ScanAreaManager;)V", "", "delayMS", "restartPreviewAfterDelay", "(J)V", "pauseDecoding", "()V", "resumeDecoding", "flashOn", "turnTorchOn", "Landroid/graphics/SurfaceTexture;", "surface", OTUXParamsKeys.OT_UX_WIDTH, "height", "onSurfaceTextureAvailable", "(Landroid/graphics/SurfaceTexture;II)V", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "onSurfaceTextureSizeChanged", "Lcom/disney/wdpro/scanner/zxing/client/interfaces/ScanCallback;", "scanCallback", "setScanCallback", "(Lcom/disney/wdpro/scanner/zxing/client/interfaces/ScanCallback;)V", "enable", "d", "j", "i", OctetSequenceJsonWebKey.KEY_VALUE_MEMBER_NAME, "m", "h", "Landroid/graphics/Rect;", "scanningRect", "c", "(Landroid/graphics/Rect;)V", "f", "()Z", "g", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "l", "Landroid/view/TextureView;", "previewView", "Landroid/view/TextureView;", "Landroid/widget/ImageView;", "scanAreaView", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "scannerMessage", "Landroid/widget/TextView;", "Lcom/disney/wdpro/scanner/zxing/client/interfaces/ScanAreaManager;", "cameraManager", "Lcom/disney/wdpro/scanner/zxing/client/camera/CameraManager;", "Lcom/disney/wdpro/scanner/zxing/client/interfaces/ErrorHandler;", "errorHandler", "Lcom/disney/wdpro/scanner/zxing/client/interfaces/ErrorHandler;", "Lcom/disney/wdpro/scanner/zxing/client/managers/BeepManager;", "beepManager", "Lcom/disney/wdpro/scanner/zxing/client/managers/BeepManager;", "hasSurface", "Z", "previewWidth", "I", "previewHeight", "", "Lcom/google/zxing/DecodeHintType;", "decodeHints", "Ljava/util/Map;", "Lcom/disney/wdpro/scanner/zxing/client/interfaces/ScanCallback;", "captureHandler", "Lcom/disney/wdpro/scanner/zxing/client/CaptureHandler;", "Companion", "a", "b", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes16.dex */
public final class QrCodeScannerView extends FrameLayout implements Controller, ScanCommand, TextureView.SurfaceTextureListener {
    private static final String TAG = QrCodeScannerView.class.getSimpleName();
    private BeepManager beepManager;
    private CameraManager cameraManager;
    private CaptureHandler captureHandler;
    private Map<DecodeHintType, ?> decodeHints;
    private ErrorHandler errorHandler;
    private boolean hasSurface;
    private int previewHeight;
    private TextureView previewView;
    private int previewWidth;
    private ScanAreaManager scanAreaManager;
    private ImageView scanAreaView;
    private ScanCallback scanCallback;
    private TextView scannerMessage;

    @Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/scan/ui/QrCodeScannerView$b;", "Lcom/disney/wdpro/scanner/zxing/client/interfaces/ErrorHandler;", "<init>", "(Lcom/disney/wdpro/qr_core/scan/ui/QrCodeScannerView;)V", "", "reportTimeOut", "()V", "", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "reportCameraHardwareError", "(Ljava/lang/Throwable;)V", "reportUnknownError", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @Instrumented
    /* renamed from: com.disney.wdpro.qr_core.scan.ui.QrCodeScannerView$b */
    private final class C19449b implements ErrorHandler {
        public C19449b() {
        }

        @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ErrorHandler
        public void reportCameraHardwareError(Throwable e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            LogInstrumentation.m79027e(QrCodeScannerView.TAG, "The camera hardware failed to open!", e10);
            QrCodeScannerView.this.pauseDecoding();
            ScanCallback scanCallback = QrCodeScannerView.this.scanCallback;
            if (scanCallback != null) {
                scanCallback.onScanError(e10);
            }
        }

        @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ErrorHandler
        public void reportTimeOut() {
            LogInstrumentation.m79028i(QrCodeScannerView.TAG, "Scanner timed out without detecting a valid QR code!");
            QrCodeScannerView.this.pauseDecoding();
            ScanCallback scanCallback = QrCodeScannerView.this.scanCallback;
            if (scanCallback != null) {
                scanCallback.onScanTimeOut();
            }
        }

        @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ErrorHandler
        public void reportUnknownError(Throwable e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            LogInstrumentation.m79027e(QrCodeScannerView.TAG, "The camera failed to complete an operation!", e10);
            QrCodeScannerView.this.pauseDecoding();
            ScanCallback scanCallback = QrCodeScannerView.this.scanCallback;
            if (scanCallback != null) {
                scanCallback.onScanError(e10);
            }
        }
    }

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/scan/ui/QrCodeScannerView$c;", "Landroidx/core/view/a;", "<init>", "(Lcom/disney/wdpro/qr_core/scan/ui/QrCodeScannerView;)V", "Landroid/view/View;", "host", "La2/j;", "info", "", "onInitializeAccessibilityNodeInfo", "(Landroid/view/View;La2/j;)V", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @Instrumented
    /* renamed from: com.disney.wdpro.qr_core.scan.ui.QrCodeScannerView$c */
    public final class C19450c extends C3331a {
        public C19450c() {
        }

        @Override // androidx.core.view.C3331a
        public void onInitializeAccessibilityNodeInfo(View host, C0020j info) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(info, "info");
            LogInstrumentation.m79024d(QrCodeScannerView.TAG, "onInitializeAccessibilityNodeInfo: " + host);
            super.onInitializeAccessibilityNodeInfo(host, info);
            host.setFocusable(false);
            host.setImportantForAccessibility(2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QrCodeScannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: c */
    private final void m60980c(Rect scanningRect) {
        int iWidth = scanningRect.width();
        ImageView imageView = this.scanAreaView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scanAreaView");
            imageView = null;
        }
        if (imageView.getLayoutParams().width != iWidth) {
            ImageView imageView3 = this.scanAreaView;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scanAreaView");
                imageView3 = null;
            }
            imageView3.getLayoutParams().width = iWidth;
            ImageView imageView4 = this.scanAreaView;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scanAreaView");
            } else {
                imageView2 = imageView4;
            }
            imageView2.requestLayout();
        }
    }

    /* renamed from: e */
    private final void m60981e() {
        m60987l();
        ScanCallback scanCallback = this.scanCallback;
        if (scanCallback != null) {
            scanCallback.onScanError(new Throwable("Unknown Error!"));
        }
    }

    /* renamed from: f */
    private final boolean m60982f() {
        return C3296a.checkSelfPermission(getContext(), "android.permission.CAMERA") == 0;
    }

    /* renamed from: g */
    private final boolean m60983g() {
        String str = TAG;
        LogInstrumentation.m79024d(str, "Camera initializing...");
        CameraManager cameraManager = this.cameraManager;
        Intrinsics.checkNotNull(cameraManager);
        boolean zIsOpen = cameraManager.isOpen();
        try {
            CameraManager cameraManager2 = this.cameraManager;
            if (cameraManager2 != null) {
                Context context = getContext();
                TextureView textureView = this.previewView;
                if (textureView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("previewView");
                    textureView = null;
                }
                cameraManager2.openAndAdjustSetting(context, textureView, this.previewWidth, this.previewHeight);
            }
            if (this.captureHandler == null) {
                ErrorHandler errorHandler = this.errorHandler;
                Intrinsics.checkNotNull(errorHandler);
                Map<DecodeHintType, ?> map = this.decodeHints;
                CameraManager cameraManager3 = this.cameraManager;
                Intrinsics.checkNotNull(cameraManager3);
                this.captureHandler = new CaptureHandler(this, errorHandler, map, cameraManager3);
            }
            LogInstrumentation.m79024d(str, "Camera initialized");
            zIsOpen = true;
        } catch (IOException e10) {
            ErrorHandler errorHandler2 = this.errorHandler;
            if (errorHandler2 != null) {
                errorHandler2.reportCameraHardwareError(e10);
            }
        } catch (RuntimeException e11) {
            ErrorHandler errorHandler3 = this.errorHandler;
            if (errorHandler3 != null) {
                errorHandler3.reportUnknownError(e11);
            }
        }
        if (!zIsOpen) {
            m60981e();
            LogInstrumentation.m79024d(TAG, "Camera failed to initialize");
        }
        return zIsOpen;
    }

    /* renamed from: h */
    private final void m60984h() {
        String str = TAG;
        LogInstrumentation.m79024d(str, "Scanner initializing...");
        ScanAreaManager scanAreaManager = this.scanAreaManager;
        TextureView textureView = null;
        if (scanAreaManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scanAreaManager");
            scanAreaManager = null;
        }
        Rect scanAreaRect = scanAreaManager.setAndGetScanAreaRect(new Point(this.previewWidth, this.previewHeight));
        Intrinsics.checkNotNullExpressionValue(scanAreaRect, "scanAreaRect");
        m60980c(scanAreaRect);
        if (m60983g()) {
            CameraManager cameraManager = this.cameraManager;
            Matrix previewCropMatrix = cameraManager != null ? cameraManager.getPreviewCropMatrix(this.previewWidth, this.previewHeight) : null;
            TextureView textureView2 = this.previewView;
            if (textureView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previewView");
            } else {
                textureView = textureView2;
            }
            textureView.setTransform(previewCropMatrix);
            resumeDecoding();
            LogInstrumentation.m79024d(str, "Scanner initialized");
        }
    }

    /* renamed from: i */
    private final void m60985i() {
        C32313h c32313hM98963c = C32313h.m98963c(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(c32313hM98963c, "inflate(LayoutInflater.from(context), this, true)");
        TextureView textureView = c32313hM98963c.previewView;
        Intrinsics.checkNotNullExpressionValue(textureView, "binder.previewView");
        this.previewView = textureView;
        ImageView imageView = c32313hM98963c.scannerBackgroundImage;
        Intrinsics.checkNotNullExpressionValue(imageView, "binder.scannerBackgroundImage");
        this.scanAreaView = imageView;
        TextView textView = c32313hM98963c.scannerMessage;
        Intrinsics.checkNotNullExpressionValue(textView, "binder.scannerMessage");
        this.scannerMessage = textView;
        this.scanAreaManager = new ScanAreaManagerImpl();
        ImageView imageView2 = null;
        if (m60982f()) {
            ScanAreaManager scanAreaManager = this.scanAreaManager;
            if (scanAreaManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scanAreaManager");
                scanAreaManager = null;
            }
            this.cameraManager = new CameraManager(scanAreaManager, getArguments());
            this.errorHandler = new C19449b();
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            this.beepManager = new BeepManager((Activity) context, getArguments());
            TextView textView2 = this.scannerMessage;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scannerMessage");
                textView2 = null;
            }
            textView2.setVisibility(8);
            TextView textView3 = this.scannerMessage;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scannerMessage");
                textView3 = null;
            }
            textView3.setImportantForAccessibility(2);
        }
        TextView textView4 = this.scannerMessage;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scannerMessage");
            textView4 = null;
        }
        C3337b1.m17275r0(textView4, new C19450c());
        ScanAreaManager scanAreaManager2 = this.scanAreaManager;
        if (scanAreaManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scanAreaManager");
            scanAreaManager2 = null;
        }
        if (scanAreaManager2.showScanAreaOverlay()) {
            ImageView imageView3 = this.scanAreaView;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scanAreaView");
            } else {
                imageView2 = imageView3;
            }
            imageView2.setVisibility(0);
            return;
        }
        ImageView imageView4 = this.scanAreaView;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scanAreaView");
        } else {
            imageView2 = imageView4;
        }
        imageView2.setVisibility(8);
    }

    /* renamed from: k */
    private final void m60986k() {
        LogInstrumentation.m79024d(TAG, "Scanning started");
        if (m60982f()) {
            if (this.hasSurface) {
                m60984h();
            } else {
                TextureView textureView = this.previewView;
                if (textureView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("previewView");
                    textureView = null;
                }
                textureView.setSurfaceTextureListener(this);
            }
            BeepManager beepManager = this.beepManager;
            if (beepManager != null) {
                beepManager.updatePrefs();
            }
        }
    }

    /* renamed from: l */
    private final void m60987l() {
        CaptureHandler captureHandler = this.captureHandler;
        if (captureHandler != null) {
            captureHandler.quitSynchronously();
        }
        this.captureHandler = null;
        BeepManager beepManager = this.beepManager;
        if (beepManager != null) {
            beepManager.close();
        }
        CameraManager cameraManager = this.cameraManager;
        if (cameraManager != null) {
            cameraManager.closeDriver();
        }
    }

    /* renamed from: m */
    private final void m60988m() {
        LogInstrumentation.m79024d(TAG, "Scanning stopped");
        pauseDecoding();
        m60987l();
    }

    /* renamed from: d */
    public final void m60989d(boolean enable) {
        if (enable) {
            m60986k();
        } else {
            m60988m();
        }
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.Controller
    public Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(Constants.KEY_DECODE_QR, true);
        bundle.putBoolean(Constants.KEY_DECODE_PDF417, false);
        bundle.putBoolean(Constants.KEY_PLAY_BEEP, true);
        bundle.putBoolean(Constants.KEY_VIBRATE, true);
        bundle.putBoolean(Constants.KEY_AUTO_FOCUS, true);
        bundle.putBoolean(Constants.KEY_DISABLE_CONTINUOUS_FOCUS, true);
        bundle.putString(Constants.KEY_FRONT_LIGHT_MODE, FrontLightMode.MANUAL.toString());
        return bundle;
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.Controller
    public CameraManager getCameraManager() {
        return this.cameraManager;
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.Controller
    public void handleDecode(C23765k rawResult, Bitmap barcode, float scaleFactor) {
        BeepManager beepManager = this.beepManager;
        if (beepManager != null) {
            beepManager.playBeepSoundAndVibrate();
        }
        ScanCallback scanCallback = this.scanCallback;
        if (scanCallback != null) {
            scanCallback.onScanSuccess(rawResult, barcode);
        }
    }

    /* renamed from: j */
    public final void m60990j() {
        m60985i();
        m60989d(m60982f());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (this.hasSurface) {
            return;
        }
        this.hasSurface = true;
        this.previewWidth = width;
        this.previewHeight = height;
        m60986k();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.hasSurface = false;
        TextureView textureView = this.previewView;
        if (textureView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewView");
            textureView = null;
        }
        textureView.setSurfaceTextureListener(null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean isVisible) {
        super.onVisibilityAggregated(isVisible);
        if (isVisible) {
            m60986k();
        } else {
            m60988m();
        }
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ScanCommand
    public void pauseDecoding() {
        CaptureHandler captureHandler = this.captureHandler;
        if (captureHandler != null) {
            captureHandler.sendEmptyMessage(C31926e.pause_preview);
        }
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ScanCommand
    public void restartPreviewAfterDelay(long delayMS) {
        CaptureHandler captureHandler = this.captureHandler;
        if (captureHandler != null) {
            captureHandler.sendEmptyMessageDelayed(C31926e.restart_preview, delayMS);
        }
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ScanCommand
    public void resumeDecoding() {
        CaptureHandler captureHandler = this.captureHandler;
        if (captureHandler != null) {
            captureHandler.sendEmptyMessage(C31926e.resume_preview);
        }
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ScanCommand
    public void setScanAreaManager(ScanAreaManager scanAreaManager) {
        Intrinsics.checkNotNullParameter(scanAreaManager, "scanAreaManager");
        this.scanAreaManager = scanAreaManager;
    }

    public final void setScanCallback(ScanCallback scanCallback) {
        this.scanCallback = scanCallback;
    }

    @Override // com.disney.wdpro.scanner.zxing.client.interfaces.ScanCommand
    public void turnTorchOn(boolean flashOn) {
    }

    public /* synthetic */ QrCodeScannerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.View, com.disney.wdpro.scanner.zxing.client.interfaces.Controller
    public CaptureHandler getHandler() {
        return this.captureHandler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QrCodeScannerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        m60985i();
    }
}