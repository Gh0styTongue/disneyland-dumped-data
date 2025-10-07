package com.disney.wdpro.virtualqueue.service.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001c\u0010\u0006\u001a\u00020\u00078FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/model/QueueLegalDisclaimer;", "Ljava/io/Serializable;", "showOnIntro", "", "showOnConfirmation", "showOnMyLines", "disclaimerText", "", "(ZZZLjava/lang/String;)V", "getDisclaimerText", "()Ljava/lang/String;", "setDisclaimerText", "(Ljava/lang/String;)V", "getShowOnConfirmation", "()Z", "setShowOnConfirmation", "(Z)V", "getShowOnIntro", "setShowOnIntro", "getShowOnMyLines", "setShowOnMyLines", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class QueueLegalDisclaimer implements Serializable {
    public static final int $stable = 8;
    private String disclaimerText;
    private boolean showOnConfirmation;
    private boolean showOnIntro;
    private boolean showOnMyLines;

    public QueueLegalDisclaimer() {
        this(false, false, false, null, 15, null);
    }

    public final String getDisclaimerText() {
        String str = this.disclaimerText;
        return str == null ? "" : str;
    }

    public final boolean getShowOnConfirmation() {
        return this.showOnConfirmation;
    }

    public final boolean getShowOnIntro() {
        return this.showOnIntro;
    }

    public final boolean getShowOnMyLines() {
        return this.showOnMyLines;
    }

    public final void setDisclaimerText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.disclaimerText = str;
    }

    public final void setShowOnConfirmation(boolean z10) {
        this.showOnConfirmation = z10;
    }

    public final void setShowOnIntro(boolean z10) {
        this.showOnIntro = z10;
    }

    public final void setShowOnMyLines(boolean z10) {
        this.showOnMyLines = z10;
    }

    public QueueLegalDisclaimer(boolean z10, boolean z11, boolean z12, String disclaimerText) {
        Intrinsics.checkNotNullParameter(disclaimerText, "disclaimerText");
        this.showOnIntro = z10;
        this.showOnConfirmation = z11;
        this.showOnMyLines = z12;
        this.disclaimerText = disclaimerText;
    }

    public /* synthetic */ QueueLegalDisclaimer(boolean z10, boolean z11, boolean z12, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? "" : str);
    }
}