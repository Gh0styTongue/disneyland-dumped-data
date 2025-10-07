package com.disney.wdpro.virtualqueue.p462ui.common;

import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R$\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "Lcom/disney/wdpro/commons/adapter/g;", "<init>", "()V", "", "customAnnouncement", "", "makeAccessibilityFocusRequest", "(Ljava/lang/String;)V", "clearAccessibilityFocusRequest", "", "<set-?>", "giveAccessibilityFocus", "Z", "getGiveAccessibilityFocus", "()Z", "accessibilityCustomAnnouncement", "Ljava/lang/String;", "getAccessibilityCustomAnnouncement", "()Ljava/lang/String;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public abstract class AccessibleRecyclerViewItem implements InterfaceC9233g {
    public static final int $stable = 8;
    private String accessibilityCustomAnnouncement = "";
    private boolean giveAccessibilityFocus;

    public static /* synthetic */ void makeAccessibilityFocusRequest$default(AccessibleRecyclerViewItem accessibleRecyclerViewItem, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeAccessibilityFocusRequest");
        }
        if ((i10 & 1) != 0) {
            str = "";
        }
        accessibleRecyclerViewItem.makeAccessibilityFocusRequest(str);
    }

    public final void clearAccessibilityFocusRequest() {
        this.giveAccessibilityFocus = false;
        this.accessibilityCustomAnnouncement = "";
    }

    public final String getAccessibilityCustomAnnouncement() {
        return this.accessibilityCustomAnnouncement;
    }

    public final boolean getGiveAccessibilityFocus() {
        return this.giveAccessibilityFocus;
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9233g
    public abstract /* synthetic */ int getViewType();

    public final void makeAccessibilityFocusRequest(String customAnnouncement) {
        Intrinsics.checkNotNullParameter(customAnnouncement, "customAnnouncement");
        this.giveAccessibilityFocus = true;
        this.accessibilityCustomAnnouncement = customAnnouncement;
    }
}