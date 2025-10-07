package com.disney.wdpro.virtualqueue.core.interfaces;

import apptentive.com.android.feedback.enjoyment.EnjoymentDialogViewModel;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016JE\u0010\b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u000fJ,\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueContentProviderImpl;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueContentProvider;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "(Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "groupDisplayName", "", VirtualQueueConstants.CONTENT_ID, "joinDeeplink", "groupingType", "groupingIdentifier", "isAnonymous", "", "isPlanningPartyPreselectionEnabled", "completionDeeplink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;", "pnoOrDowntimeContent", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VQDowntimeStatus;", "isQueueInDowntime", "isSummoned", "isPositionImpactedByPno", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class VirtualQueueContentProviderImpl implements VirtualQueueContentProvider {
    public static final int $stable = 8;
    private final VirtualQueueThemer vqThemer;

    @Inject
    public VirtualQueueContentProviderImpl(VirtualQueueThemer vqThemer) {
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        this.vqThemer = vqThemer;
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueContentProvider
    public String groupDisplayName(String contentId, String groupDisplayName) {
        VirtualQueueThemer virtualQueueThemer = this.vqThemer;
        VQStringType vQStringType = VQStringType.TipboardGroupingName;
        if (groupDisplayName == null) {
            groupDisplayName = "";
        }
        return VirtualQueueThemer.getString$default(virtualQueueThemer, vQStringType, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.GROUP_NAME_PARAM, groupDisplayName)), contentId == null ? "" : contentId, false, 8, null);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueContentProvider
    public String joinDeeplink(String contentId, String groupingType, String groupingIdentifier, Boolean isAnonymous, Boolean isPlanningPartyPreselectionEnabled, String completionDeeplink) {
        Intrinsics.checkNotNullParameter(groupingType, "groupingType");
        Intrinsics.checkNotNullParameter(groupingIdentifier, "groupingIdentifier");
        VQStringType vQStringType = Intrinsics.areEqual(groupingType, VirtualQueueConstants.JOIN_DEEPLINK_HUB) ? VQStringType.TipboardGroupingLinkHub : Intrinsics.areEqual(groupingType, VirtualQueueConstants.JOIN_DEEPLINK_MULTIPLE) ? VQStringType.TipboardGroupingLinkMultiple : VQStringType.TipboardGroupingLinkSingle;
        Pair pairM92045to = TuplesKt.m92045to(VirtualQueueConstants.JOIN_DEEPLINK_GROUPING_IDENTIFIER_PARAM, groupingIdentifier);
        Pair pairM92045to2 = TuplesKt.m92045to("isAnonymous", Intrinsics.areEqual(isAnonymous, Boolean.TRUE) ? EnjoymentDialogViewModel.CODE_POINT_YES : EnjoymentDialogViewModel.CODE_POINT_NO);
        Pair pairM92045to3 = TuplesKt.m92045to("isPlanningPartyPreselectionEnabled", String.valueOf(isPlanningPartyPreselectionEnabled));
        if (completionDeeplink == null) {
            completionDeeplink = "";
        }
        return VirtualQueueThemer.getString$default(this.vqThemer, vQStringType, MapsKt.mapOf(pairM92045to, pairM92045to2, pairM92045to3, TuplesKt.m92045to("completionDeepLink", completionDeeplink)), contentId == null ? "" : contentId, false, 8, null);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueContentProvider
    public VQDowntimeStatus pnoOrDowntimeContent(String contentId, boolean isQueueInDowntime, boolean isSummoned, boolean isPositionImpactedByPno) {
        if (!isPositionImpactedByPno || isSummoned) {
            if (isQueueInDowntime && isSummoned) {
                return new VQDowntimeStatus(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionDowntimeAlert, contentId == null ? "" : contentId, false, 4, null), this.vqThemer.getPeptasiaIcon(VQIconType.CommonWarningIcon, contentId != null ? contentId : "").toString(), null, null, 12, null);
            }
            return null;
        }
        String string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PnoMessage, contentId == null ? "" : contentId, false, 4, null);
        String string = this.vqThemer.getPeptasiaIcon(VQIconType.PositionBackupGroupIcon, contentId == null ? "" : contentId).toString();
        String string$default2 = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.InfoLinkText, contentId == null ? "" : contentId, false, 4, null);
        return string$default2.length() == 0 ? new VQDowntimeStatus(string$default, string, null, null, 12, null) : new VQDowntimeStatus(string$default, string, string$default2, VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.InfoLinkUrl, contentId == null ? "" : contentId, false, 4, null));
    }
}