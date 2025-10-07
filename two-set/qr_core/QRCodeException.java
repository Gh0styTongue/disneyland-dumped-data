package com.disney.wdpro.qr_core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0002\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/QRCodeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorCode", "Lcom/disney/wdpro/qr_core/QRCodeError;", "message", "", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "(Lcom/disney/wdpro/qr_core/QRCodeError;Ljava/lang/String;Ljava/lang/Exception;)V", "getErrorCode", "()Lcom/disney/wdpro/qr_core/QRCodeError;", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes16.dex */
public final class QRCodeException extends Exception {
    private final QRCodeError errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRCodeException(QRCodeError errorCode, String message, Exception exc) {
        super(message, exc);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(message, "message");
        this.errorCode = errorCode;
    }

    public final QRCodeError getErrorCode() {
        return this.errorCode;
    }

    public /* synthetic */ QRCodeException(QRCodeError qRCodeError, String str, Exception exc, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(qRCodeError, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : exc);
    }
}