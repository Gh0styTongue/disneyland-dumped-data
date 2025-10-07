package com.disney.wdpro.virtualqueue.service.model;

import com.disney.wdpro.recommender.services.RecommenderServiceConstants;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.service.model.Position;
import com.google.common.collect.AbstractC22794s1;
import com.google.common.collect.Ordering;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(m92037d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b>\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001PBÉ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\f¢\u0006\u0002\u0010\u001cJ\u001c\u0010M\u001a\u00020\f2\u0006\u0010N\u001a\u00020\u00032\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005R\u001c\u0010\u0017\u001a\u00020\u00078FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u00020\u00078FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001c\u0010\u001a\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0012\u001a\u00020\u00138FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\u0019\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001c\u0010\u0018\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001c\u0010\r\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u0010\u0010\u001a\u00020\f8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u00105\"\u0004\b6\u00107R\u001c\u0010\u001b\u001a\u00020\f8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u00105\"\u0004\b8\u00107R\u001c\u0010\u0011\u001a\u00020\f8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u00105\"\u0004\b9\u00107R\u001c\u0010\u000b\u001a\u00020\f8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u00105\"\u0004\b:\u00107R\u001c\u0010\u0016\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010$\"\u0004\b<\u0010&R\u001c\u0010\u0006\u001a\u00020\u00078FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R\u001c\u0010\u0002\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010$\"\u0004\b@\u0010&R\u001c\u0010\t\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010\u000e\u001a\u00020\u000f8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001c\u0010\u0015\u001a\u00020\u00078FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001e\"\u0004\bJ\u0010 R\u001c\u0010\u0014\u001a\u00020\u00078FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u001e\"\u0004\bL\u0010 ¨\u0006Q"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/model/Position;", "Ljava/io/Serializable;", "queueId", "", "guestIds", "", "progress", "", "boardingGroup", "queuedAt", "", "isSummoned", "", "expiresAt", "queuedBy", "Lcom/disney/wdpro/virtualqueue/service/model/QueuedByType;", "isExpired", "isReleased", "boardingGroupType", "Lcom/disney/wdpro/virtualqueue/service/model/BoardingGroupType;", "waitTimeMin", "waitTimeMax", VirtualQueueConstants.POSITION_ID_HASH_PARAM, RecommenderServiceConstants.ANONYMOUS_PARTY_SIZE, "enteredStandbyAt", "displayIdentifier", "boardingGroupDisplayName", "isImpactedByPno", "(Ljava/lang/String;Ljava/util/List;IIJZLjava/lang/String;Lcom/disney/wdpro/virtualqueue/service/model/QueuedByType;ZZLcom/disney/wdpro/virtualqueue/service/model/BoardingGroupType;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAnonymousPartySize", "()I", "setAnonymousPartySize", "(I)V", "getBoardingGroup", "setBoardingGroup", "getBoardingGroupDisplayName", "()Ljava/lang/String;", "setBoardingGroupDisplayName", "(Ljava/lang/String;)V", "getBoardingGroupType", "()Lcom/disney/wdpro/virtualqueue/service/model/BoardingGroupType;", "setBoardingGroupType", "(Lcom/disney/wdpro/virtualqueue/service/model/BoardingGroupType;)V", "getDisplayIdentifier", "setDisplayIdentifier", "getEnteredStandbyAt", "setEnteredStandbyAt", "getExpiresAt", "setExpiresAt", "getGuestIds", "()Ljava/util/List;", "setGuestIds", "(Ljava/util/List;)V", "()Z", "setExpired", "(Z)V", "setImpactedByPno", "setReleased", "setSummoned", "getPositionIdHash", "setPositionIdHash", "getProgress", "setProgress", "getQueueId", "setQueueId", "getQueuedAt", "()J", "setQueuedAt", "(J)V", "getQueuedBy", "()Lcom/disney/wdpro/virtualqueue/service/model/QueuedByType;", "setQueuedBy", "(Lcom/disney/wdpro/virtualqueue/service/model/QueuedByType;)V", "getWaitTimeMax", "setWaitTimeMax", "getWaitTimeMin", "setWaitTimeMin", "equals", "otherQueueId", "otherGuestIds", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class Position implements Serializable {
    private int anonymousPartySize;
    private int boardingGroup;
    private String boardingGroupDisplayName;
    private BoardingGroupType boardingGroupType;
    private String displayIdentifier;
    private String enteredStandbyAt;
    private String expiresAt;
    private List<String> guestIds;
    private boolean isExpired;
    private boolean isImpactedByPno;
    private boolean isReleased;
    private boolean isSummoned;
    private String positionIdHash;
    private int progress;
    private String queueId;
    private long queuedAt;
    private QueuedByType queuedBy;
    private int waitTimeMax;
    private int waitTimeMin;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/model/Position$Companion;", "", "()V", "getSortComparator", "Ljava/util/Comparator;", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int getSortComparator$lambda$0(Position position, Position position2) {
            AbstractC22794s1 abstractC22794s1Mo69677i = AbstractC22794s1.m69671k().mo69676h(position.getIsReleased(), position2.getIsReleased()).mo69676h(position.getIsExpired(), position2.getIsExpired()).mo69677i(position.getIsSummoned(), position2.getIsSummoned());
            BoardingGroupType boardingGroupType = position.getBoardingGroupType();
            BoardingGroupType boardingGroupType2 = BoardingGroupType.PRIMARY;
            return abstractC22794s1Mo69677i.mo69677i(boardingGroupType == boardingGroupType2, position2.getBoardingGroupType() == boardingGroupType2).mo69675g(Integer.valueOf(position.getProgress()), Integer.valueOf(position2.getProgress()), Ordering.natural().reverse()).mo69675g(Long.valueOf(position.getQueuedAt()), Long.valueOf(position2.getQueuedAt()), Ordering.natural()).mo69678j();
        }

        public final Comparator<Position> getSortComparator() {
            return new Comparator() { // from class: ro.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Position.Companion.getSortComparator$lambda$0((Position) obj, (Position) obj2);
                }
            };
        }

        private Companion() {
        }
    }

    public Position() {
        this(null, null, 0, 0, 0L, false, null, null, false, false, null, 0, 0, null, 0, null, null, null, false, 524287, null);
    }

    public final boolean equals(String otherQueueId, List<String> otherGuestIds) {
        Intrinsics.checkNotNullParameter(otherQueueId, "otherQueueId");
        Intrinsics.checkNotNullParameter(otherGuestIds, "otherGuestIds");
        return Intrinsics.areEqual(otherQueueId, getQueueId()) && otherGuestIds.size() == getGuestIds().size() && otherGuestIds.containsAll(getGuestIds());
    }

    public final int getAnonymousPartySize() {
        return this.anonymousPartySize;
    }

    public final int getBoardingGroup() {
        return this.boardingGroup;
    }

    public final String getBoardingGroupDisplayName() {
        String str = this.boardingGroupDisplayName;
        return str == null ? "" : str;
    }

    public final BoardingGroupType getBoardingGroupType() {
        BoardingGroupType boardingGroupType = this.boardingGroupType;
        return boardingGroupType == null ? BoardingGroupType.PRIMARY : boardingGroupType;
    }

    public final String getDisplayIdentifier() {
        String str = this.displayIdentifier;
        return str == null ? "" : str;
    }

    public final String getEnteredStandbyAt() {
        String str = this.enteredStandbyAt;
        return str == null ? "" : str;
    }

    public final String getExpiresAt() {
        String str = this.expiresAt;
        return str == null ? "" : str;
    }

    public final List<String> getGuestIds() {
        List<String> list = this.guestIds;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final String getPositionIdHash() {
        String str = this.positionIdHash;
        return str == null ? "" : str;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final String getQueueId() {
        String str = this.queueId;
        return str == null ? "" : str;
    }

    public final long getQueuedAt() {
        return this.queuedAt;
    }

    public final QueuedByType getQueuedBy() {
        QueuedByType queuedByType = this.queuedBy;
        return queuedByType == null ? QueuedByType.GUEST_APP : queuedByType;
    }

    public final int getWaitTimeMax() {
        return this.waitTimeMax;
    }

    public final int getWaitTimeMin() {
        return this.waitTimeMin;
    }

    /* renamed from: isExpired, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }

    /* renamed from: isImpactedByPno, reason: from getter */
    public final boolean getIsImpactedByPno() {
        return this.isImpactedByPno;
    }

    /* renamed from: isReleased, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    /* renamed from: isSummoned, reason: from getter */
    public final boolean getIsSummoned() {
        return this.isSummoned;
    }

    public final void setAnonymousPartySize(int i10) {
        this.anonymousPartySize = i10;
    }

    public final void setBoardingGroup(int i10) {
        this.boardingGroup = i10;
    }

    public final void setBoardingGroupDisplayName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.boardingGroupDisplayName = str;
    }

    public final void setBoardingGroupType(BoardingGroupType boardingGroupType) {
        Intrinsics.checkNotNullParameter(boardingGroupType, "<set-?>");
        this.boardingGroupType = boardingGroupType;
    }

    public final void setDisplayIdentifier(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.displayIdentifier = str;
    }

    public final void setEnteredStandbyAt(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.enteredStandbyAt = str;
    }

    public final void setExpired(boolean z10) {
        this.isExpired = z10;
    }

    public final void setExpiresAt(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expiresAt = str;
    }

    public final void setGuestIds(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.guestIds = list;
    }

    public final void setImpactedByPno(boolean z10) {
        this.isImpactedByPno = z10;
    }

    public final void setPositionIdHash(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.positionIdHash = str;
    }

    public final void setProgress(int i10) {
        this.progress = i10;
    }

    public final void setQueueId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.queueId = str;
    }

    public final void setQueuedAt(long j10) {
        this.queuedAt = j10;
    }

    public final void setQueuedBy(QueuedByType queuedByType) {
        Intrinsics.checkNotNullParameter(queuedByType, "<set-?>");
        this.queuedBy = queuedByType;
    }

    public final void setReleased(boolean z10) {
        this.isReleased = z10;
    }

    public final void setSummoned(boolean z10) {
        this.isSummoned = z10;
    }

    public final void setWaitTimeMax(int i10) {
        this.waitTimeMax = i10;
    }

    public final void setWaitTimeMin(int i10) {
        this.waitTimeMin = i10;
    }

    public Position(String queueId, List<String> guestIds, int i10, int i11, long j10, boolean z10, String expiresAt, QueuedByType queuedBy, boolean z11, boolean z12, BoardingGroupType boardingGroupType, int i12, int i13, String positionIdHash, int i14, String enteredStandbyAt, String displayIdentifier, String boardingGroupDisplayName, boolean z13) {
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        Intrinsics.checkNotNullParameter(guestIds, "guestIds");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        Intrinsics.checkNotNullParameter(queuedBy, "queuedBy");
        Intrinsics.checkNotNullParameter(boardingGroupType, "boardingGroupType");
        Intrinsics.checkNotNullParameter(positionIdHash, "positionIdHash");
        Intrinsics.checkNotNullParameter(enteredStandbyAt, "enteredStandbyAt");
        Intrinsics.checkNotNullParameter(displayIdentifier, "displayIdentifier");
        Intrinsics.checkNotNullParameter(boardingGroupDisplayName, "boardingGroupDisplayName");
        this.queueId = queueId;
        this.guestIds = guestIds;
        this.progress = i10;
        this.boardingGroup = i11;
        this.queuedAt = j10;
        this.isSummoned = z10;
        this.expiresAt = expiresAt;
        this.queuedBy = queuedBy;
        this.isExpired = z11;
        this.isReleased = z12;
        this.isImpactedByPno = z13;
        this.boardingGroupType = boardingGroupType;
        this.waitTimeMin = i12;
        this.waitTimeMax = i13;
        this.positionIdHash = positionIdHash;
        this.anonymousPartySize = i14;
        this.enteredStandbyAt = enteredStandbyAt;
        this.displayIdentifier = displayIdentifier;
        this.boardingGroupDisplayName = boardingGroupDisplayName;
    }

    public /* synthetic */ Position(String str, List list, int i10, int i11, long j10, boolean z10, String str2, QueuedByType queuedByType, boolean z11, boolean z12, BoardingGroupType boardingGroupType, int i12, int i13, String str3, int i14, String str4, String str5, String str6, boolean z13, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? CollectionsKt.emptyList() : list, (i15 & 4) != 0 ? 0 : i10, (i15 & 8) != 0 ? 0 : i11, (i15 & 16) != 0 ? 0L : j10, (i15 & 32) != 0 ? false : z10, (i15 & 64) != 0 ? "" : str2, (i15 & 128) != 0 ? QueuedByType.GUEST_APP : queuedByType, (i15 & 256) != 0 ? false : z11, (i15 & 512) != 0 ? false : z12, (i15 & 1024) != 0 ? BoardingGroupType.PRIMARY : boardingGroupType, (i15 & 2048) != 0 ? 0 : i12, (i15 & 4096) != 0 ? 0 : i13, (i15 & 8192) != 0 ? "" : str3, (i15 & 16384) != 0 ? 0 : i14, (i15 & 32768) != 0 ? "" : str4, (i15 & 65536) != 0 ? "" : str5, (i15 & PKIFailureInfo.unsupportedVersion) == 0 ? str6 : "", (i15 & PKIFailureInfo.transactionIdInUse) != 0 ? false : z13);
    }
}