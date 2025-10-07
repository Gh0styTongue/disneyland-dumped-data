package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.friendsservices.business.NotificationInviteOrMessage;
import com.disney.wdpro.friendsservices.model.dto.FriendDTO;
import com.disney.wdpro.park.util.C18390e;
import com.disney.wdpro.service.business.APIConstants;
import com.google.common.base.InterfaceC22463n;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(m92037d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b1\b\u0016\u0018\u0000 M2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002MNBÃ\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u001b\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b!\u0010\"R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R$\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R$\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'R$\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R$\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010#\u001a\u0004\b4\u0010%\"\u0004\b5\u0010'R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00106\u001a\u0004\b;\u00108\"\u0004\b<\u0010:R$\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010#\u001a\u0004\b=\u0010%\"\u0004\b>\u0010'R$\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010#\u001a\u0004\b?\u0010%\"\u0004\b@\u0010'R(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010A\u001a\u0004\bF\u0010C\"\u0004\bG\u0010ER$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006O"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/Invite;", "Lcom/disney/wdpro/friendsservices/business/NotificationInviteOrMessage;", "", "", "invitationId", "acceptedDateTime", "accessClassificationCode", "accessClassificationDescription", "groupClassificationCode", "groupClassificationDescription", "invitationType", "issuedDateTime", "Lcom/disney/wdpro/friendsservices/model/dto/FriendDTO;", "issuedTo", "issuedBy", "relationshipClassification", "status", "", "shareClassificationCode", "shareClassificationDescription", "Ljava/util/Date;", "issuedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/disney/wdpro/friendsservices/model/dto/FriendDTO;Lcom/disney/wdpro/friendsservices/model/dto/FriendDTO;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;)V", "Lorg/json/JSONObject;", C18390e.JSON_EXTENSION, "Lcom/disney/wdpro/commons/r;", "time", "(Lorg/json/JSONObject;Lcom/disney/wdpro/commons/r;)V", "other", "", "compareTo", "(Lcom/disney/wdpro/friendsservices/model/Invite;)I", "parseInvitationId", "(Lorg/json/JSONObject;)Ljava/lang/String;", "Ljava/lang/String;", "getInvitationId", "()Ljava/lang/String;", "setInvitationId", "(Ljava/lang/String;)V", "getAcceptedDateTime", "setAcceptedDateTime", "getAccessClassificationCode", "setAccessClassificationCode", "getAccessClassificationDescription", "setAccessClassificationDescription", "getGroupClassificationCode", "setGroupClassificationCode", "getGroupClassificationDescription", "setGroupClassificationDescription", "getInvitationType", "setInvitationType", "getIssuedDateTime", "setIssuedDateTime", "Lcom/disney/wdpro/friendsservices/model/dto/FriendDTO;", "getIssuedTo", "()Lcom/disney/wdpro/friendsservices/model/dto/FriendDTO;", "setIssuedTo", "(Lcom/disney/wdpro/friendsservices/model/dto/FriendDTO;)V", "getIssuedBy", "setIssuedBy", "getRelationshipClassification", "setRelationshipClassification", "getStatus", "setStatus", "Ljava/util/List;", "getShareClassificationCode", "()Ljava/util/List;", "setShareClassificationCode", "(Ljava/util/List;)V", "getShareClassificationDescription", "setShareClassificationDescription", "Ljava/util/Date;", "getIssuedTimestamp", "()Ljava/util/Date;", "setIssuedTimestamp", "(Ljava/util/Date;)V", "Companion", "InviteStatusPredicate", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes28.dex */
public class Invite extends NotificationInviteOrMessage implements Comparable<Invite> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String STATUS_ACCEPTED = "Accepted";
    public static final String STATUS_DECLINED = "Declined";
    public static final String STATUS_PENDING = "Pending";
    private String acceptedDateTime;
    private String accessClassificationCode;
    private String accessClassificationDescription;
    private String groupClassificationCode;
    private String groupClassificationDescription;
    private String invitationId;
    private String invitationType;
    private FriendDTO issuedBy;
    private String issuedDateTime;
    private Date issuedTimestamp;
    private FriendDTO issuedTo;
    private String relationshipClassification;
    private List<String> shareClassificationCode;
    private List<String> shareClassificationDescription;
    private String status;

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\u0006\u0010\u0007R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\n\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/Invite$Companion;", "", "<init>", "()V", "Lcom/google/common/base/n;", "Lcom/disney/wdpro/friendsservices/model/Invite;", "getNewInvitePendingStatusPredicate", "()Lcom/google/common/base/n;", "getNewInvitePendingStatusPredicate$annotations", "newInvitePendingStatusPredicate", "getPendingInviteFilterPredicate", "getPendingInviteFilterPredicate$annotations", "pendingInviteFilterPredicate", "", "STATUS_ACCEPTED", "Ljava/lang/String;", "STATUS_DECLINED", "STATUS_PENDING", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getNewInvitePendingStatusPredicate$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getPendingInviteFilterPredicate$annotations() {
        }

        public final InterfaceC22463n<Invite> getNewInvitePendingStatusPredicate() {
            return new InviteStatusPredicate(Invite.STATUS_PENDING);
        }

        public final InterfaceC22463n<Invite> getPendingInviteFilterPredicate() {
            return new InviteStatusPredicate(Invite.STATUS_PENDING);
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/Invite$InviteStatusPredicate;", "Lcom/google/common/base/n;", "Lcom/disney/wdpro/friendsservices/model/Invite;", "", "status", "<init>", "(Ljava/lang/String;)V", "invite", "", "apply", "(Lcom/disney/wdpro/friendsservices/model/Invite;)Z", "Ljava/lang/String;", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    private static final class InviteStatusPredicate implements InterfaceC22463n<Invite> {
        private final String status;

        public InviteStatusPredicate(String status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
        }

        @Override // com.google.common.base.InterfaceC22463n
        public boolean apply(Invite invite) {
            return Intrinsics.areEqual(this.status, invite != null ? invite.getStatus() : null);
        }
    }

    public Invite() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public static final InterfaceC22463n<Invite> getNewInvitePendingStatusPredicate() {
        return INSTANCE.getNewInvitePendingStatusPredicate();
    }

    public static final InterfaceC22463n<Invite> getPendingInviteFilterPredicate() {
        return INSTANCE.getPendingInviteFilterPredicate();
    }

    public final String getAcceptedDateTime() {
        return this.acceptedDateTime;
    }

    public final String getAccessClassificationCode() {
        return this.accessClassificationCode;
    }

    public final String getAccessClassificationDescription() {
        return this.accessClassificationDescription;
    }

    public final String getGroupClassificationCode() {
        return this.groupClassificationCode;
    }

    public final String getGroupClassificationDescription() {
        return this.groupClassificationDescription;
    }

    public final String getInvitationId() {
        return this.invitationId;
    }

    public final String getInvitationType() {
        return this.invitationType;
    }

    public final FriendDTO getIssuedBy() {
        return this.issuedBy;
    }

    public final String getIssuedDateTime() {
        return this.issuedDateTime;
    }

    public final Date getIssuedTimestamp() {
        return this.issuedTimestamp;
    }

    public final FriendDTO getIssuedTo() {
        return this.issuedTo;
    }

    public final String getRelationshipClassification() {
        return this.relationshipClassification;
    }

    public final List<String> getShareClassificationCode() {
        return this.shareClassificationCode;
    }

    public final List<String> getShareClassificationDescription() {
        return this.shareClassificationDescription;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String parseInvitationId(JSONObject json) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        String strOptString;
        List listSplit$default;
        if (json == null || (jSONObjectOptJSONObject = json.optJSONObject(OTUXParamsKeys.OT_UX_LINKS)) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("self")) == null || (strOptString = jSONObjectOptJSONObject2.optString(APIConstants.JsonKeys.HREF)) == null || (listSplit$default = StringsKt.split$default((CharSequence) strOptString, new String[]{"/"}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        return (String) CollectionsKt.last(listSplit$default);
    }

    public final void setAcceptedDateTime(String str) {
        this.acceptedDateTime = str;
    }

    public final void setAccessClassificationCode(String str) {
        this.accessClassificationCode = str;
    }

    public final void setAccessClassificationDescription(String str) {
        this.accessClassificationDescription = str;
    }

    public final void setGroupClassificationCode(String str) {
        this.groupClassificationCode = str;
    }

    public final void setGroupClassificationDescription(String str) {
        this.groupClassificationDescription = str;
    }

    public final void setInvitationId(String str) {
        this.invitationId = str;
    }

    public final void setInvitationType(String str) {
        this.invitationType = str;
    }

    public final void setIssuedBy(FriendDTO friendDTO) {
        this.issuedBy = friendDTO;
    }

    public final void setIssuedDateTime(String str) {
        this.issuedDateTime = str;
    }

    public final void setIssuedTimestamp(Date date) {
        this.issuedTimestamp = date;
    }

    public final void setIssuedTo(FriendDTO friendDTO) {
        this.issuedTo = friendDTO;
    }

    public final void setRelationshipClassification(String str) {
        this.relationshipClassification = str;
    }

    public final void setShareClassificationCode(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.shareClassificationCode = list;
    }

    public final void setShareClassificationDescription(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.shareClassificationDescription = list;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public /* synthetic */ Invite(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, FriendDTO friendDTO, FriendDTO friendDTO2, String str9, String str10, List list, List list2, Date date, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : friendDTO, (i10 & 512) != 0 ? null : friendDTO2, (i10 & 1024) != 0 ? null : str9, (i10 & 2048) != 0 ? null : str10, (i10 & 4096) != 0 ? new ArrayList() : list, (i10 & 8192) != 0 ? new ArrayList() : list2, (i10 & 16384) != 0 ? null : date);
    }

    @Override // java.lang.Comparable
    public int compareTo(Invite other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Date date = this.issuedTimestamp;
        Intrinsics.checkNotNull(date);
        return date.compareTo(other.issuedTimestamp);
    }

    public Invite(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, FriendDTO friendDTO, FriendDTO friendDTO2, String str9, String str10, List<String> shareClassificationCode, List<String> shareClassificationDescription, Date date) {
        Intrinsics.checkNotNullParameter(shareClassificationCode, "shareClassificationCode");
        Intrinsics.checkNotNullParameter(shareClassificationDescription, "shareClassificationDescription");
        this.invitationId = str;
        this.acceptedDateTime = str2;
        this.accessClassificationCode = str3;
        this.accessClassificationDescription = str4;
        this.groupClassificationCode = str5;
        this.groupClassificationDescription = str6;
        this.invitationType = str7;
        this.issuedDateTime = str8;
        this.issuedTo = friendDTO;
        this.issuedBy = friendDTO2;
        this.relationshipClassification = str9;
        this.status = str10;
        this.shareClassificationCode = shareClassificationCode;
        this.shareClassificationDescription = shareClassificationDescription;
        this.issuedTimestamp = date;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Invite(org.json.JSONObject r19, com.disney.wdpro.commons.C9350r r20) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.friendsservices.model.Invite.<init>(org.json.JSONObject, com.disney.wdpro.commons.r):void");
    }
}