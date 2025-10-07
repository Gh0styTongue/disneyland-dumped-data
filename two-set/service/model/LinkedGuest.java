package com.disney.wdpro.virtualqueue.service.model;

import com.disney.wdpro.hawkeye.p136ui.navigation.HawkeyeDeepLinks;
import com.disney.wdpro.sag.deeplink.ScanAndGoDeepLinks;
import com.disney.wdpro.service.utils.Constants;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\b\u0007\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014J\u0006\u00107\u001a\u00020\u0003J\u000e\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0003R\u001c\u0010\u0010\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\u0002\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001c\u0010\u000e\u001a\u00020\u000f8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001c\u0010\u0004\u001a\u00020\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010&\"\u0004\b'\u0010(R\u001c\u0010\r\u001a\u00020\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010&\"\u0004\b)\u0010(R\u001c\u0010\u0012\u001a\u00020\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010&\"\u0004\b*\u0010(R\u001c\u0010\t\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R\u001c\u0010\u0011\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018R\u001c\u0010\f\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001c\u0010\u0013\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R\u001c\u0010\n\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006:"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "Ljava/io/Serializable;", HawkeyeDeepLinks.GUEST_ID, "", "isInPark", "", "currentQueueIds", "", "firstName", "lastName", "type", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuestType;", ScanAndGoDeepLinks.DEEP_LINK_SKU_PARAM_KEY, "isPreselected", Constants.IDENTIFIERS, "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuestIdentifiers;", "avatarImageUrl", "mepSerialNumber", "isPrimaryGuest", "suffix", "(Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuestType;Ljava/lang/String;ZLcom/disney/wdpro/virtualqueue/service/model/LinkedGuestIdentifiers;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAvatarImageUrl", "()Ljava/lang/String;", "setAvatarImageUrl", "(Ljava/lang/String;)V", "getCurrentQueueIds", "()Ljava/util/List;", "setCurrentQueueIds", "(Ljava/util/List;)V", "getFirstName", "setFirstName", "getGuestId", "setGuestId", "getIdentifiers", "()Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuestIdentifiers;", "setIdentifiers", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuestIdentifiers;)V", "isGuestPass", "()Z", "setInPark", "(Z)V", "setPreselected", "setPrimaryGuest", "getLastName", "setLastName", "getMepSerialNumber", "setMepSerialNumber", "getSku", "setSku", "getSuffix", "setSuffix", "getType", "()Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuestType;", "setType", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuestType;)V", "guestIdLast4", "isInQueue", "queueId", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class LinkedGuest implements Serializable {
    public static final int $stable = 8;
    private String avatarImageUrl;
    private List<String> currentQueueIds;
    private String firstName;
    private String guestId;
    private LinkedGuestIdentifiers identifiers;
    private boolean isInPark;
    private boolean isPreselected;
    private boolean isPrimaryGuest;
    private String lastName;
    private String mepSerialNumber;
    private String sku;
    private String suffix;
    private LinkedGuestType type;

    public LinkedGuest() {
        this(null, false, null, null, null, null, null, false, null, null, null, false, null, 8191, null);
    }

    public final String getAvatarImageUrl() {
        String str = this.avatarImageUrl;
        return str == null ? "" : str;
    }

    public final List<String> getCurrentQueueIds() {
        List<String> list = this.currentQueueIds;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final String getFirstName() {
        String str = this.firstName;
        return str == null ? "" : str;
    }

    public final String getGuestId() {
        String str = this.guestId;
        return str == null ? "" : str;
    }

    public final LinkedGuestIdentifiers getIdentifiers() {
        LinkedGuestIdentifiers linkedGuestIdentifiers = this.identifiers;
        if (linkedGuestIdentifiers != null) {
            return linkedGuestIdentifiers;
        }
        return new LinkedGuestIdentifiers(null, null, null, 7, null);
    }

    public final String getLastName() {
        String str = this.lastName;
        return str == null ? "" : str;
    }

    public final String getMepSerialNumber() {
        String str = this.mepSerialNumber;
        return str == null ? "0" : str;
    }

    public final String getSku() {
        String str = this.sku;
        return str == null ? "" : str;
    }

    public final String getSuffix() {
        String str = this.suffix;
        return str == null ? "" : str;
    }

    public final LinkedGuestType getType() {
        LinkedGuestType linkedGuestType = this.type;
        return linkedGuestType == null ? LinkedGuestType.TICKET : linkedGuestType;
    }

    public final String guestIdLast4() {
        if (getGuestId().length() < 4) {
            return getGuestId();
        }
        String strSubstring = getGuestId().substring(getGuestId().length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean isGuestPass() {
        return (Intrinsics.areEqual(getMepSerialNumber(), "0") || Intrinsics.areEqual(getMepSerialNumber(), "")) ? false : true;
    }

    /* renamed from: isInPark, reason: from getter */
    public final boolean getIsInPark() {
        return this.isInPark;
    }

    public final boolean isInQueue(String queueId) {
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        Iterator<String> it = getCurrentQueueIds().iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next(), queueId)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isPreselected, reason: from getter */
    public final boolean getIsPreselected() {
        return this.isPreselected;
    }

    /* renamed from: isPrimaryGuest, reason: from getter */
    public final boolean getIsPrimaryGuest() {
        return this.isPrimaryGuest;
    }

    public final void setAvatarImageUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.avatarImageUrl = str;
    }

    public final void setCurrentQueueIds(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.currentQueueIds = list;
    }

    public final void setFirstName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstName = str;
    }

    public final void setGuestId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.guestId = str;
    }

    public final void setIdentifiers(LinkedGuestIdentifiers linkedGuestIdentifiers) {
        Intrinsics.checkNotNullParameter(linkedGuestIdentifiers, "<set-?>");
        this.identifiers = linkedGuestIdentifiers;
    }

    public final void setInPark(boolean z10) {
        this.isInPark = z10;
    }

    public final void setLastName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastName = str;
    }

    public final void setMepSerialNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mepSerialNumber = str;
    }

    public final void setPreselected(boolean z10) {
        this.isPreselected = z10;
    }

    public final void setPrimaryGuest(boolean z10) {
        this.isPrimaryGuest = z10;
    }

    public final void setSku(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sku = str;
    }

    public final void setSuffix(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.suffix = str;
    }

    public final void setType(LinkedGuestType linkedGuestType) {
        Intrinsics.checkNotNullParameter(linkedGuestType, "<set-?>");
        this.type = linkedGuestType;
    }

    public LinkedGuest(String guestId, boolean z10, List<String> currentQueueIds, String firstName, String lastName, LinkedGuestType type, String sku, boolean z11, LinkedGuestIdentifiers identifiers, String avatarImageUrl, String mepSerialNumber, boolean z12, String suffix) {
        Intrinsics.checkNotNullParameter(guestId, "guestId");
        Intrinsics.checkNotNullParameter(currentQueueIds, "currentQueueIds");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        Intrinsics.checkNotNullParameter(avatarImageUrl, "avatarImageUrl");
        Intrinsics.checkNotNullParameter(mepSerialNumber, "mepSerialNumber");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        this.guestId = guestId;
        this.isInPark = z10;
        this.currentQueueIds = currentQueueIds;
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.sku = sku;
        this.isPreselected = z11;
        this.identifiers = identifiers;
        this.avatarImageUrl = avatarImageUrl;
        this.mepSerialNumber = mepSerialNumber;
        this.isPrimaryGuest = z12;
        this.suffix = suffix;
    }

    public /* synthetic */ LinkedGuest(String str, boolean z10, List list, String str2, String str3, LinkedGuestType linkedGuestType, String str4, boolean z11, LinkedGuestIdentifiers linkedGuestIdentifiers, String str5, String str6, boolean z12, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? "" : str3, (i10 & 32) != 0 ? LinkedGuestType.TICKET : linkedGuestType, (i10 & 64) != 0 ? "" : str4, (i10 & 128) != 0 ? false : z11, (i10 & 256) != 0 ? new LinkedGuestIdentifiers(null, null, null, 7, null) : linkedGuestIdentifiers, (i10 & 512) != 0 ? "" : str5, (i10 & 1024) != 0 ? "0" : str6, (i10 & 2048) == 0 ? z12 : false, (i10 & 4096) != 0 ? "" : str7);
    }
}