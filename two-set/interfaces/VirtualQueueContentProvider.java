package com.disney.wdpro.virtualqueue.core.interfaces;

import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&JG\u0010\u0005\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\fJ,\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH&¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueContentProvider;", "", "groupDisplayName", "", VirtualQueueConstants.CONTENT_ID, "joinDeeplink", "groupingType", "groupingIdentifier", "isAnonymous", "", "isPlanningPartyPreselectionEnabled", "completionDeeplink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;", "pnoOrDowntimeContent", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VQDowntimeStatus;", "isQueueInDowntime", "isSummoned", "isPositionImpactedByPno", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface VirtualQueueContentProvider {

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ String joinDeeplink$default(VirtualQueueContentProvider virtualQueueContentProvider, String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinDeeplink");
            }
            if ((i10 & 8) != 0) {
                bool = null;
            }
            return virtualQueueContentProvider.joinDeeplink(str, str2, str3, bool, bool2, str4);
        }
    }

    String groupDisplayName(String contentId, String groupDisplayName);

    String joinDeeplink(String contentId, String groupingType, String groupingIdentifier, Boolean isAnonymous, Boolean isPlanningPartyPreselectionEnabled, String completionDeeplink);

    VQDowntimeStatus pnoOrDowntimeContent(String contentId, boolean isQueueInDowntime, boolean isSummoned, boolean isPositionImpactedByPno);
}