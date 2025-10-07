package com.disney.wdpro.oneclicklib.common;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent;", "", "<init>", "()V", "a", "b", "PaymentFailed", "c", "Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent$a;", "Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent$b;", "Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent$PaymentFailed;", "Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent$c;", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes3.dex */
public abstract class OneClickPaymentEvent {

    @Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent$PaymentFailed;", "Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent;", "", "canRetry", "", "message", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "a", "()Z", "Ljava/lang/String;", "b", "FailureType", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class PaymentFailed extends OneClickPaymentEvent {
        private final boolean canRetry;
        private final String message;

        @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent$PaymentFailed$FailureType;", "", "(Ljava/lang/String;I)V", "DECLINED", "HIGH_TRUST", "OTHER", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public enum FailureType {
            DECLINED,
            HIGH_TRUST,
            OTHER
        }

        public PaymentFailed(boolean z10, String str) {
            super(null);
            this.canRetry = z10;
            this.message = str;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getCanRetry() {
            return this.canRetry;
        }

        /* renamed from: b, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentFailed)) {
                return false;
            }
            PaymentFailed paymentFailed = (PaymentFailed) other;
            return this.canRetry == paymentFailed.canRetry && Intrinsics.areEqual(this.message, paymentFailed.message);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z10 = this.canRetry;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i10 = r02 * 31;
            String str = this.message;
            return i10 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PaymentFailed(canRetry=" + this.canRetry + ", message=" + this.message + ")";
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent$a;", "Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent;", "<init>", "()V", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.common.OneClickPaymentEvent$a */
    public static final class C16608a extends OneClickPaymentEvent {
        public static final C16608a INSTANCE = new C16608a();

        private C16608a() {
            super(null);
        }
    }

    @Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent$b;", "Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent;", "", "token", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.common.OneClickPaymentEvent$b, reason: from toString */
    public static final /* data */ class PaymentButton extends OneClickPaymentEvent {
        private final String token;

        public PaymentButton(String str) {
            super(null);
            this.token = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentButton) && Intrinsics.areEqual(this.token, ((PaymentButton) other).token);
        }

        public int hashCode() {
            String str = this.token;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "PaymentButton(token=" + this.token + ")";
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent$c;", "Lcom/disney/wdpro/oneclicklib/common/OneClickPaymentEvent;", "<init>", "()V", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.common.OneClickPaymentEvent$c */
    public static final class C16610c extends OneClickPaymentEvent {
        public static final C16610c INSTANCE = new C16610c();

        private C16610c() {
            super(null);
        }
    }

    public /* synthetic */ OneClickPaymentEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OneClickPaymentEvent() {
    }
}