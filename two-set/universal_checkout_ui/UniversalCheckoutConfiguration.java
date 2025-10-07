package com.disney.wdpro.universal_checkout_ui;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/UniversalCheckoutConfiguration;", "", "destinationCode", "", "helpDeskPhoneNumber", "bypassPayment", "", "useMock", "isScreenRecordingEnabled", "conversationId", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V", "getBypassPayment", "()Z", "getConversationId", "()Ljava/lang/String;", "getDestinationCode", "getHelpDeskPhoneNumber", "getUseMock", "component1", "component2", "component3", "component4", "component5", "component6", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class UniversalCheckoutConfiguration {
    private final boolean bypassPayment;
    private final String conversationId;
    private final String destinationCode;
    private final String helpDeskPhoneNumber;
    private final boolean isScreenRecordingEnabled;
    private final boolean useMock;

    @JvmOverloads
    public UniversalCheckoutConfiguration() {
        this(null, null, false, false, false, null, 63, null);
    }

    public static /* synthetic */ UniversalCheckoutConfiguration copy$default(UniversalCheckoutConfiguration universalCheckoutConfiguration, String str, String str2, boolean z10, boolean z11, boolean z12, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = universalCheckoutConfiguration.destinationCode;
        }
        if ((i10 & 2) != 0) {
            str2 = universalCheckoutConfiguration.helpDeskPhoneNumber;
        }
        if ((i10 & 4) != 0) {
            z10 = universalCheckoutConfiguration.bypassPayment;
        }
        if ((i10 & 8) != 0) {
            z11 = universalCheckoutConfiguration.useMock;
        }
        if ((i10 & 16) != 0) {
            z12 = universalCheckoutConfiguration.isScreenRecordingEnabled;
        }
        if ((i10 & 32) != 0) {
            str3 = universalCheckoutConfiguration.conversationId;
        }
        boolean z13 = z12;
        String str4 = str3;
        return universalCheckoutConfiguration.copy(str, str2, z10, z11, z13, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDestinationCode() {
        return this.destinationCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHelpDeskPhoneNumber() {
        return this.helpDeskPhoneNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getBypassPayment() {
        return this.bypassPayment;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUseMock() {
        return this.useMock;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsScreenRecordingEnabled() {
        return this.isScreenRecordingEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    public final UniversalCheckoutConfiguration copy(String destinationCode, String helpDeskPhoneNumber, boolean bypassPayment, boolean useMock, boolean isScreenRecordingEnabled, String conversationId) {
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(helpDeskPhoneNumber, "helpDeskPhoneNumber");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        return new UniversalCheckoutConfiguration(destinationCode, helpDeskPhoneNumber, bypassPayment, useMock, isScreenRecordingEnabled, conversationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalCheckoutConfiguration)) {
            return false;
        }
        UniversalCheckoutConfiguration universalCheckoutConfiguration = (UniversalCheckoutConfiguration) other;
        return Intrinsics.areEqual(this.destinationCode, universalCheckoutConfiguration.destinationCode) && Intrinsics.areEqual(this.helpDeskPhoneNumber, universalCheckoutConfiguration.helpDeskPhoneNumber) && this.bypassPayment == universalCheckoutConfiguration.bypassPayment && this.useMock == universalCheckoutConfiguration.useMock && this.isScreenRecordingEnabled == universalCheckoutConfiguration.isScreenRecordingEnabled && Intrinsics.areEqual(this.conversationId, universalCheckoutConfiguration.conversationId);
    }

    public final boolean getBypassPayment() {
        return this.bypassPayment;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getDestinationCode() {
        return this.destinationCode;
    }

    public final String getHelpDeskPhoneNumber() {
        return this.helpDeskPhoneNumber;
    }

    public final boolean getUseMock() {
        return this.useMock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((this.destinationCode.hashCode() * 31) + this.helpDeskPhoneNumber.hashCode()) * 31;
        boolean z10 = this.bypassPayment;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.useMock;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.isScreenRecordingEnabled;
        return ((i13 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + this.conversationId.hashCode();
    }

    public final boolean isScreenRecordingEnabled() {
        return this.isScreenRecordingEnabled;
    }

    public String toString() {
        return "UniversalCheckoutConfiguration(destinationCode=" + this.destinationCode + ", helpDeskPhoneNumber=" + this.helpDeskPhoneNumber + ", bypassPayment=" + this.bypassPayment + ", useMock=" + this.useMock + ", isScreenRecordingEnabled=" + this.isScreenRecordingEnabled + ", conversationId=" + this.conversationId + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UniversalCheckoutConfiguration(String destinationCode) {
        this(destinationCode, null, false, false, false, null, 62, null);
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UniversalCheckoutConfiguration(String destinationCode, String helpDeskPhoneNumber) {
        this(destinationCode, helpDeskPhoneNumber, false, false, false, null, 60, null);
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(helpDeskPhoneNumber, "helpDeskPhoneNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UniversalCheckoutConfiguration(String destinationCode, String helpDeskPhoneNumber, boolean z10) {
        this(destinationCode, helpDeskPhoneNumber, z10, false, false, null, 56, null);
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(helpDeskPhoneNumber, "helpDeskPhoneNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UniversalCheckoutConfiguration(String destinationCode, String helpDeskPhoneNumber, boolean z10, boolean z11) {
        this(destinationCode, helpDeskPhoneNumber, z10, z11, false, null, 48, null);
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(helpDeskPhoneNumber, "helpDeskPhoneNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UniversalCheckoutConfiguration(String destinationCode, String helpDeskPhoneNumber, boolean z10, boolean z11, boolean z12) {
        this(destinationCode, helpDeskPhoneNumber, z10, z11, z12, null, 32, null);
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(helpDeskPhoneNumber, "helpDeskPhoneNumber");
    }

    @JvmOverloads
    public UniversalCheckoutConfiguration(String destinationCode, String helpDeskPhoneNumber, boolean z10, boolean z11, boolean z12, String conversationId) {
        Intrinsics.checkNotNullParameter(destinationCode, "destinationCode");
        Intrinsics.checkNotNullParameter(helpDeskPhoneNumber, "helpDeskPhoneNumber");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        this.destinationCode = destinationCode;
        this.helpDeskPhoneNumber = helpDeskPhoneNumber;
        this.bypassPayment = z10;
        this.useMock = z11;
        this.isScreenRecordingEnabled = z12;
        this.conversationId = conversationId;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ UniversalCheckoutConfiguration(java.lang.String r3, java.lang.String r4, boolean r5, boolean r6, boolean r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r2 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r3 = "WDW"
        L6:
            r10 = r9 & 2
            java.lang.String r0 = ""
            if (r10 == 0) goto Ld
            r4 = r0
        Ld:
            r10 = r9 & 4
            r1 = 0
            if (r10 == 0) goto L13
            r5 = r1
        L13:
            r10 = r9 & 8
            if (r10 == 0) goto L18
            r6 = r1
        L18:
            r10 = r9 & 16
            if (r10 == 0) goto L1d
            r7 = r1
        L1d:
            r9 = r9 & 32
            if (r9 == 0) goto L29
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            goto L30
        L29:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
        L30:
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.universal_checkout_ui.UniversalCheckoutConfiguration.<init>(java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}