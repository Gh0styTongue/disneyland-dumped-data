package com.disney.wdpro.virtualqueue.service.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0002\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0004\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuestIdentifiers;", "Ljava/io/Serializable;", "swid", "", "vqLinkId", "ticketVisualId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSwid", "()Ljava/lang/String;", "setSwid", "(Ljava/lang/String;)V", "getTicketVisualId", "setTicketVisualId", "getVqLinkId", "setVqLinkId", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class LinkedGuestIdentifiers implements Serializable {
    public static final int $stable = 8;
    private String swid;
    private String ticketVisualId;
    private String vqLinkId;

    public LinkedGuestIdentifiers() {
        this(null, null, null, 7, null);
    }

    public final String getSwid() {
        String str = this.swid;
        return str == null ? "" : str;
    }

    public final String getTicketVisualId() {
        String str = this.ticketVisualId;
        return str == null ? "" : str;
    }

    public final String getVqLinkId() {
        String str = this.vqLinkId;
        return str == null ? "" : str;
    }

    public final void setSwid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.swid = str;
    }

    public final void setTicketVisualId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ticketVisualId = str;
    }

    public final void setVqLinkId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vqLinkId = str;
    }

    public LinkedGuestIdentifiers(String swid, String vqLinkId, String ticketVisualId) {
        Intrinsics.checkNotNullParameter(swid, "swid");
        Intrinsics.checkNotNullParameter(vqLinkId, "vqLinkId");
        Intrinsics.checkNotNullParameter(ticketVisualId, "ticketVisualId");
        this.swid = swid;
        this.vqLinkId = vqLinkId;
        this.ticketVisualId = ticketVisualId;
    }

    public /* synthetic */ LinkedGuestIdentifiers(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3);
    }
}