package com.disney.wdpro.virtualqueue.core.interfaces;

import android.content.Context;
import com.disney.wdpro.aligator.C8666f;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "", "", "getLinkingRequestCode", "()I", "Lcom/disney/wdpro/aligator/f;", "getLinkTicketsAndPassesNavigationEntry", "()Lcom/disney/wdpro/aligator/f;", "Landroid/content/Context;", "context", "", "facilityKey", "", "asFoundation", "getWayFindingNavigationEntry", "(Landroid/content/Context;Ljava/lang/String;Z)Lcom/disney/wdpro/aligator/f;", "getFinderDetailEntry", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface VirtualQueueNavigationEntriesProvider {
    C8666f getFinderDetailEntry(Context context, String facilityKey, boolean asFoundation);

    C8666f getLinkTicketsAndPassesNavigationEntry();

    int getLinkingRequestCode();

    C8666f getWayFindingNavigationEntry(Context context, String facilityKey, boolean asFoundation);
}