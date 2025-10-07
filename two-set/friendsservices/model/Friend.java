package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.facility.model.Avatar;
import com.disney.wdpro.friendsservices.model.dto.FriendDTO;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.recommender.core.RecommenderConstants;
import com.google.common.base.InterfaceC22463n;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(m92037d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 ]2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004]^_`B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005B+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fBs\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0018\u00010\u0018R\u00020\u0000\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001aJ\b\u0010T\u001a\u00020\u0015H\u0016J\u0006\u0010U\u001a\u00020\u0000J\b\u0010V\u001a\u00020WH\u0002J\u0006\u0010X\u001a\u00020:J\u0006\u0010Y\u001a\u00020:J\u0006\u0010Z\u001a\u00020:J\u0006\u0010[\u001a\u00020:J\u0006\u0010\\\u001a\u00020WR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010-\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b.\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R \u0010\u0017\u001a\b\u0018\u00010\u0018R\u00020\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0011\u00109\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b9\u0010;R$\u0010=\u001a\u00020:2\u0006\u0010<\u001a\u00020:8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010;\"\u0004\b>\u0010?R\u0011\u0010@\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b@\u0010;R\u0011\u0010A\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\bA\u0010;R\u0011\u0010B\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\bB\u0010;R\u0011\u0010C\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\bC\u0010;R\u0011\u0010D\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\bD\u0010;R\u0011\u0010E\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bF\u0010&R\u0013\u0010G\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\bH\u0010&R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010\u0005R\u0013\u0010L\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\bM\u0010&R\u0013\u0010N\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\bO\u0010&R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006a"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/Friend;", "Lcom/disney/wdpro/friendsservices/model/Profile;", "Ljava/io/Serializable;", "", "profile", "(Lcom/disney/wdpro/friendsservices/model/Profile;)V", "firstName", "", "lastName", "xid", "groupType", "Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;)V", "accessClassification", "Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;", "accessClassificationTo", "groupClassification", "groupClassificationDescription", "photoPassClassificationType", "Lcom/disney/wdpro/friendsservices/model/SharePhotoPassClassificationType;", "age", "", "parentGuestProfile", "inviteState", "Lcom/disney/wdpro/friendsservices/model/Friend$InviteState;", "avatarLink", "(Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;Ljava/lang/String;Lcom/disney/wdpro/friendsservices/model/SharePhotoPassClassificationType;ILcom/disney/wdpro/friendsservices/model/Profile;Lcom/disney/wdpro/friendsservices/model/Friend$InviteState;Ljava/lang/String;)V", "getAccessClassification", "()Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;", "setAccessClassification", "(Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;)V", "getAccessClassificationTo", "setAccessClassificationTo", "getAge", "()I", "setAge", "(I)V", "getAvatarLink", "()Ljava/lang/String;", "setAvatarLink", "(Ljava/lang/String;)V", "dateOfBirthCalendar", "Ljava/util/Calendar;", "getDateOfBirthCalendar", "()Ljava/util/Calendar;", "dateOfBirthPrettyFormat", "getDateOfBirthPrettyFormat", "getGroupClassification", "()Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;", "setGroupClassification", "(Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;)V", "getGroupClassificationDescription", "setGroupClassificationDescription", "getInviteState", "()Lcom/disney/wdpro/friendsservices/model/Friend$InviteState;", "setInviteState", "(Lcom/disney/wdpro/friendsservices/model/Friend$InviteState;)V", "isArchived", "", "()Z", "isFamilyMember", "isFamily", "setFamily", "(Z)V", "isFriend", "isManaged", "isPhotoPassPhotosShared", "isRegistered", "isTertiary", "name", "getName", "parentFirstName", "getParentFirstName", "getParentGuestProfile", "()Lcom/disney/wdpro/friendsservices/model/Profile;", "setParentGuestProfile", "parentLastName", "getParentLastName", "parentSwid", "getParentSwid", "getPhotoPassClassificationType", "()Lcom/disney/wdpro/friendsservices/model/SharePhotoPassClassificationType;", "setPhotoPassClassificationType", "(Lcom/disney/wdpro/friendsservices/model/SharePhotoPassClassificationType;)V", "calculateAge", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "getProfileJSONObject", "Lorg/json/JSONObject;", "hasManageViewAll", "hasNoAccess", "hasViewAll", "hasViewShared", "toJSONObject", "Companion", "InviteState", "Links", "SortFriends", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public class Friend extends Profile implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private AccessClassificationType accessClassification;
    private AccessClassificationType accessClassificationTo;
    private int age;
    private String avatarLink;
    private GroupClassificationType groupClassification;
    private String groupClassificationDescription;
    private InviteState inviteState;
    private Profile parentGuestProfile;
    private SharePhotoPassClassificationType photoPassClassificationType;

    @Metadata(m92037d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/Friend$Companion;", "", "<init>", "()V", "Lcom/disney/wdpro/friendsservices/model/Friend;", "friend", "", "Lcom/disney/wdpro/friendsservices/model/Invite;", "inviteList", "", "isPendingInvite", "(Lcom/disney/wdpro/friendsservices/model/Friend;Ljava/util/List;)Z", "invite", "isPendingInviteManagedFriend", "(Lcom/disney/wdpro/friendsservices/model/Friend;Lcom/disney/wdpro/friendsservices/model/Invite;)Z", "isPendingInviteRegisteredFriend", "", "xids", "Lcom/google/common/base/n;", "getFilterByIdPredicate", "(Ljava/util/List;)Lcom/google/common/base/n;", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @SourceDebugExtension({"SMAP\nFriend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Friend.kt\ncom/disney/wdpro/friendsservices/model/Friend$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,333:1\n766#2:334\n857#2,2:335\n*S KotlinDebug\n*F\n+ 1 Friend.kt\ncom/disney/wdpro/friendsservices/model/Friend$Companion\n*L\n264#1:334\n264#1:335,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final InterfaceC22463n<Friend> getFilterByIdPredicate(final List<String> xids) {
            Intrinsics.checkNotNullParameter(xids, "xids");
            return new InterfaceC22463n<Friend>() { // from class: com.disney.wdpro.friendsservices.model.Friend$Companion$getFilterByIdPredicate$1
                @Override // com.google.common.base.InterfaceC22463n
                public boolean apply(Friend friend) {
                    String xid;
                    if (friend == null || (xid = friend.getXid()) == null) {
                        return false;
                    }
                    return xids.contains(xid);
                }
            };
        }

        @JvmStatic
        public final boolean isPendingInvite(Friend friend, List<? extends Invite> inviteList) {
            Intrinsics.checkNotNullParameter(friend, "friend");
            Intrinsics.checkNotNullParameter(inviteList, "inviteList");
            ArrayList arrayList = new ArrayList();
            for (Invite invite : inviteList) {
                if (Intrinsics.areEqual(invite.getStatus(), Invite.STATUS_PENDING)) {
                    if (friend.isManaged()) {
                        return Friend.INSTANCE.isPendingInviteManagedFriend(friend, invite);
                    }
                    if (friend.isRegistered()) {
                        return Friend.INSTANCE.isPendingInviteRegisteredFriend(friend, invite);
                    }
                }
            }
            return !arrayList.isEmpty();
        }

        @JvmStatic
        public final boolean isPendingInviteManagedFriend(Friend friend, Invite invite) {
            Intrinsics.checkNotNullParameter(friend, "friend");
            Intrinsics.checkNotNullParameter(invite, "invite");
            InviteState inviteState = friend.getInviteState();
            String invitationId = inviteState != null ? inviteState.getInvitationId() : null;
            if (invitationId != null && invitationId.length() != 0) {
                String invitationId2 = invite.getInvitationId();
                InviteState inviteState2 = friend.getInviteState();
                return Intrinsics.areEqual(invitationId2, inviteState2 != null ? inviteState2.getInvitationId() : null);
            }
            FriendDTO issuedTo = invite.getIssuedTo();
            if (Intrinsics.areEqual(issuedTo != null ? issuedTo.getGuestIdValue() : null, friend.getGuid())) {
                return true;
            }
            FriendDTO issuedTo2 = invite.getIssuedTo();
            return Intrinsics.areEqual(issuedTo2 != null ? issuedTo2.getGuid() : null, friend.getGuid());
        }

        @JvmStatic
        public final boolean isPendingInviteRegisteredFriend(Friend friend, Invite invite) {
            Intrinsics.checkNotNullParameter(friend, "friend");
            Intrinsics.checkNotNullParameter(invite, "invite");
            InviteState inviteState = friend.getInviteState();
            String invitationId = inviteState != null ? inviteState.getInvitationId() : null;
            if (invitationId != null && invitationId.length() != 0) {
                String invitationId2 = invite.getInvitationId();
                InviteState inviteState2 = friend.getInviteState();
                return Intrinsics.areEqual(invitationId2, inviteState2 != null ? inviteState2.getInvitationId() : null);
            }
            FriendDTO issuedTo = invite.getIssuedTo();
            if (Intrinsics.areEqual(issuedTo != null ? issuedTo.getGuestIdValue() : null, friend.getSwid())) {
                return true;
            }
            FriendDTO issuedTo2 = invite.getIssuedTo();
            return Intrinsics.areEqual(issuedTo2 != null ? issuedTo2.getSwid() : null, friend.getSwid());
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/Friend$SortFriends;", "Ljava/util/Comparator;", "Lcom/disney/wdpro/friendsservices/model/Friend;", "Lkotlin/Comparator;", "profileXID", "", "(Ljava/lang/String;)V", "xid", "compare", "", "f1", "f2", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SortFriends implements Comparator<Friend> {
        private String xid;

        public SortFriends(String profileXID) {
            Intrinsics.checkNotNullParameter(profileXID, "profileXID");
            this.xid = profileXID;
        }

        @Override // java.util.Comparator
        public int compare(Friend f12, Friend f22) throws NumberFormatException {
            String mepSerialNumber;
            Intrinsics.checkNotNullParameter(f12, "f1");
            Intrinsics.checkNotNullParameter(f22, "f2");
            if (Intrinsics.areEqual(this.xid, f12.getXid())) {
                return -1;
            }
            if (Intrinsics.areEqual(this.xid, f22.getXid())) {
                return 1;
            }
            String mepSerialNumber2 = f12.getMepSerialNumber();
            if (mepSerialNumber2 == null || mepSerialNumber2.length() == 0 || (mepSerialNumber = f22.getMepSerialNumber()) == null || mepSerialNumber.length() == 0) {
                String mepSerialNumber3 = f12.getMepSerialNumber();
                if (mepSerialNumber3 == null || mepSerialNumber3.length() == 0) {
                    return 1;
                }
                String mepSerialNumber4 = f22.getMepSerialNumber();
                if (mepSerialNumber4 == null || mepSerialNumber4.length() == 0) {
                    return -1;
                }
                return f12.getFirstName().compareTo(f22.getFirstName());
            }
            try {
                String mepSerialNumber5 = f12.getMepSerialNumber();
                Intrinsics.checkNotNull(mepSerialNumber5);
                int i10 = Integer.parseInt(mepSerialNumber5);
                String mepSerialNumber6 = f22.getMepSerialNumber();
                Intrinsics.checkNotNull(mepSerialNumber6);
                return Intrinsics.compare(i10, Integer.parseInt(mepSerialNumber6));
            } catch (NumberFormatException e10) {
                e10.getMessage();
                return 0;
            }
        }
    }

    public Friend() {
        this(null, null, null, null, null, 0, null, null, null, 511, null);
    }

    @JvmStatic
    public static final InterfaceC22463n<Friend> getFilterByIdPredicate(List<String> list) {
        return INSTANCE.getFilterByIdPredicate(list);
    }

    private final JSONObject getProfileJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("title", getTitle());
        jSONObject2.putOpt("firstName", getFirstName());
        jSONObject2.putOpt("middleName", getMiddleName());
        jSONObject2.putOpt("lastName", getLastName());
        jSONObject2.putOpt("suffix", getSuffix());
        Unit unit = Unit.INSTANCE;
        jSONObject.putOpt("name", jSONObject2);
        String dateOfBirth = getDateOfBirth();
        if (dateOfBirth == null || dateOfBirth.length() == 0) {
            jSONObject.putOpt("age", Integer.valueOf(this.age));
        } else {
            jSONObject.putOpt("dateOfBirth", getDateOfBirth());
        }
        String email = getEmail();
        if (email != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("[{\"type\":\"email\",\"details\":[{\"email\":\"%s\"}]}]", Arrays.copyOf(new Object[]{email}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            jSONObject.putOpt("contactInformations", new JSONArray(str));
        }
        return jSONObject;
    }

    @JvmStatic
    public static final boolean isPendingInvite(Friend friend, List<? extends Invite> list) {
        return INSTANCE.isPendingInvite(friend, list);
    }

    @JvmStatic
    public static final boolean isPendingInviteManagedFriend(Friend friend, Invite invite) {
        return INSTANCE.isPendingInviteManagedFriend(friend, invite);
    }

    @JvmStatic
    public static final boolean isPendingInviteRegisteredFriend(Friend friend, Invite invite) {
        return INSTANCE.isPendingInviteRegisteredFriend(friend, invite);
    }

    @Override // com.disney.wdpro.friendsservices.model.Profile
    public int calculateAge() {
        String dateOfBirth;
        return (this.age == -1 || !((dateOfBirth = getDateOfBirth()) == null || dateOfBirth.length() == 0)) ? super.calculateAge() : this.age;
    }

    public Object clone() {
        return super.clone();
    }

    public final Friend copy() {
        Friend friend = new Friend(null, null, null, null, null, 0, null, null, null, 511, null);
        friend.setTitle(getTitle());
        friend.setFirstName(getFirstName());
        friend.setMiddleName(getMiddleName());
        friend.setLastName(getLastName());
        friend.setSuffix(getSuffix());
        friend.setDateOfBirth(getDateOfBirth());
        friend.age = this.age;
        friend.setGuestIdentifiers(getGuestIdentifiers());
        GroupClassificationType groupClassificationType = this.groupClassification;
        if (groupClassificationType != GroupClassificationType.UNKNOWN) {
            friend.groupClassification = groupClassificationType;
            friend.groupClassificationDescription = this.groupClassificationDescription;
        }
        if (getAvatar() != null) {
            friend.setAvatar(getAvatar());
        }
        friend.accessClassification = this.accessClassification;
        friend.parentGuestProfile = this.parentGuestProfile;
        return friend;
    }

    public final AccessClassificationType getAccessClassification() {
        return this.accessClassification;
    }

    public final AccessClassificationType getAccessClassificationTo() {
        return this.accessClassificationTo;
    }

    public final int getAge() {
        return this.age;
    }

    public final String getAvatarLink() {
        return this.avatarLink;
    }

    public final Calendar getDateOfBirthCalendar() throws ParseException {
        String dateOfBirth = getDateOfBirth();
        if (dateOfBirth != null && dateOfBirth.length() != 0) {
            try {
                Date date = Profile.INSTANCE.getSERVICE_DATE_FORMATTER().parse(getDateOfBirth());
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                return calendar;
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    public final String getDateOfBirthPrettyFormat() throws ParseException {
        Calendar dateOfBirthCalendar = getDateOfBirthCalendar();
        if (dateOfBirthCalendar != null) {
            return Profile.INSTANCE.getDEFAULT_FORMATTER().format(dateOfBirthCalendar.getTime());
        }
        return null;
    }

    public final GroupClassificationType getGroupClassification() {
        return this.groupClassification;
    }

    public final String getGroupClassificationDescription() {
        return this.groupClassificationDescription;
    }

    public final InviteState getInviteState() {
        return this.inviteState;
    }

    public final String getName() {
        if (getFirstName().length() <= 0 || getLastName().length() <= 0) {
            return getFirstName().length() > 0 ? getFirstName() : getLastName().length() > 0 ? getLastName() : "";
        }
        return getFirstName() + " " + getLastName();
    }

    public final String getParentFirstName() {
        Profile profile = this.parentGuestProfile;
        if (profile != null) {
            return profile.getFirstName();
        }
        return null;
    }

    public final Profile getParentGuestProfile() {
        return this.parentGuestProfile;
    }

    public final String getParentLastName() {
        Profile profile = this.parentGuestProfile;
        if (profile != null) {
            return profile.getLastName();
        }
        return null;
    }

    public final String getParentSwid() {
        Profile profile = this.parentGuestProfile;
        if (profile != null) {
            return profile.getSwid();
        }
        return null;
    }

    public final SharePhotoPassClassificationType getPhotoPassClassificationType() {
        return this.photoPassClassificationType;
    }

    public final boolean hasManageViewAll() {
        return this.accessClassification == AccessClassificationType.PLAN_MANAGE_VIEW_ALL;
    }

    public final boolean hasNoAccess() {
        return this.accessClassification == AccessClassificationType.NO_ACCESS;
    }

    public final boolean hasViewAll() {
        return this.accessClassification == AccessClassificationType.PLAN_VIEW_ALL;
    }

    public final boolean hasViewShared() {
        return this.accessClassification == AccessClassificationType.PLAN_VIEW_SHARED;
    }

    public final boolean isArchived() {
        return this.groupClassification == GroupClassificationType.ARCHIVE;
    }

    public final boolean isFamily() {
        return this.groupClassification == GroupClassificationType.TRAVELLING_PARTY;
    }

    public final boolean isFriend() {
        return this.groupClassification == GroupClassificationType.FRIENDS;
    }

    public final boolean isManaged() {
        return Intrinsics.areEqual(getGuestType(), ProfileType.MANAGED.getType());
    }

    public final boolean isPhotoPassPhotosShared() {
        return SharePhotoPassClassificationType.SHARE_MEDIA_DOWNLOAD == this.photoPassClassificationType && !isTertiary();
    }

    public final boolean isRegistered() {
        return Intrinsics.areEqual(getGuestType(), ProfileType.REGISTERED.getType());
    }

    public final boolean isTertiary() {
        return this.groupClassification == GroupClassificationType.TERTIARY;
    }

    public final void setAccessClassification(AccessClassificationType accessClassificationType) {
        this.accessClassification = accessClassificationType;
    }

    public final void setAccessClassificationTo(AccessClassificationType accessClassificationType) {
        this.accessClassificationTo = accessClassificationType;
    }

    public final void setAge(int i10) {
        this.age = i10;
    }

    public final void setAvatarLink(String str) {
        this.avatarLink = str;
    }

    public final void setFamily(boolean z10) {
        this.groupClassification = z10 ? GroupClassificationType.TRAVELLING_PARTY : GroupClassificationType.FRIENDS;
        this.groupClassificationDescription = null;
    }

    public final void setGroupClassification(GroupClassificationType groupClassificationType) {
        this.groupClassification = groupClassificationType;
    }

    public final void setGroupClassificationDescription(String str) {
        this.groupClassificationDescription = str;
    }

    public final void setInviteState(InviteState inviteState) {
        this.inviteState = inviteState;
    }

    public final void setParentGuestProfile(Profile profile) {
        this.parentGuestProfile = profile;
    }

    public final void setPhotoPassClassificationType(SharePhotoPassClassificationType sharePhotoPassClassificationType) {
        this.photoPassClassificationType = sharePhotoPassClassificationType;
    }

    public final JSONObject toJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("profile", getProfileJSONObject());
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            GroupClassificationType groupClassificationType = this.groupClassification;
            jSONObject3.putOpt("name", groupClassificationType != null ? groupClassificationType.name() : null);
            Unit unit = Unit.INSTANCE;
            jSONObject2.putOpt("groupClassification", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            AccessClassificationType accessClassificationType = this.accessClassification;
            jSONObject4.putOpt("name", accessClassificationType != null ? accessClassificationType.name() : null);
            jSONObject2.putOpt("accessClassification", jSONObject4);
            jSONObject.putOpt("friendsAndFamily", jSONObject2);
            Avatar avatar = getAvatar();
            if (avatar != null) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.putOpt("avatarIdentifier", avatar.getId());
                jSONObject5.putOpt("favoriteCharacterIdentifier", avatar.getId());
                jSONObject.putOpt(RecommenderConstants.PREFERENCES_DOCUMENT, jSONObject5);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/Friend$Links;", "Ljava/io/Serializable;", "avatarLink", "Ljava/util/TreeMap;", "", "(Lcom/disney/wdpro/friendsservices/model/Friend;Ljava/util/TreeMap;)V", "getAvatarLink", "()Ljava/util/TreeMap;", "friendAvatarLink", "getFriendAvatarLink", "()Ljava/lang/String;", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public final class Links implements Serializable {

        @SerializedName("wdproAvatar")
        private final TreeMap<String, String> avatarLink;

        public Links(TreeMap<String, String> treeMap) {
            this.avatarLink = treeMap;
        }

        public final TreeMap<String, String> getAvatarLink() {
            return this.avatarLink;
        }

        public final String getFriendAvatarLink() {
            Map.Entry<String, String> entryFirstEntry;
            TreeMap<String, String> treeMap = this.avatarLink;
            if (treeMap == null || (entryFirstEntry = treeMap.firstEntry()) == null) {
                return null;
            }
            return entryFirstEntry.getValue();
        }

        public /* synthetic */ Links(Friend friend, TreeMap treeMap, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : treeMap);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Friend(com.disney.wdpro.friendsservices.model.AccessClassificationType r2, com.disney.wdpro.friendsservices.model.AccessClassificationType r3, com.disney.wdpro.friendsservices.model.GroupClassificationType r4, java.lang.String r5, com.disney.wdpro.friendsservices.model.SharePhotoPassClassificationType r6, int r7, com.disney.wdpro.friendsservices.model.Profile r8, com.disney.wdpro.friendsservices.model.Friend.InviteState r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L6
            com.disney.wdpro.friendsservices.model.AccessClassificationType r2 = com.disney.wdpro.friendsservices.model.AccessClassificationType.PLAN_VIEW_ALL
        L6:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto Lc
            r3 = r0
        Lc:
            r12 = r11 & 4
            if (r12 == 0) goto L12
            com.disney.wdpro.friendsservices.model.GroupClassificationType r4 = com.disney.wdpro.friendsservices.model.GroupClassificationType.TRAVELLING_PARTY
        L12:
            r12 = r11 & 8
            if (r12 == 0) goto L17
            r5 = r0
        L17:
            r12 = r11 & 16
            if (r12 == 0) goto L1d
            com.disney.wdpro.friendsservices.model.SharePhotoPassClassificationType r6 = com.disney.wdpro.friendsservices.model.SharePhotoPassClassificationType.SHARE_MEDIA_NONE
        L1d:
            r12 = r11 & 32
            if (r12 == 0) goto L22
            r7 = 0
        L22:
            r12 = r11 & 64
            if (r12 == 0) goto L27
            r8 = r0
        L27:
            r12 = r11 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L2c
            r9 = r0
        L2c:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L3b
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L45
        L3b:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L45:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.friendsservices.model.Friend.<init>(com.disney.wdpro.friendsservices.model.AccessClassificationType, com.disney.wdpro.friendsservices.model.AccessClassificationType, com.disney.wdpro.friendsservices.model.GroupClassificationType, java.lang.String, com.disney.wdpro.friendsservices.model.SharePhotoPassClassificationType, int, com.disney.wdpro.friendsservices.model.Profile, com.disney.wdpro.friendsservices.model.Friend$InviteState, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/Friend$InviteState;", "Ljava/io/Serializable;", "status", "", "invitationId", "(Lcom/disney/wdpro/friendsservices/model/Friend;Ljava/lang/String;Ljava/lang/String;)V", "getInvitationId", "()Ljava/lang/String;", "setInvitationId", "(Ljava/lang/String;)V", "getStatus", "setStatus", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public final class InviteState implements Serializable {
        private String invitationId;
        private String status;

        public InviteState(String str, String str2) {
            this.status = str;
            this.invitationId = str2;
        }

        public final String getInvitationId() {
            return this.invitationId;
        }

        public final String getStatus() {
            return this.status;
        }

        public final void setInvitationId(String str) {
            this.invitationId = str;
        }

        public final void setStatus(String str) {
            this.status = str;
        }

        public /* synthetic */ InviteState(Friend friend, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
        }
    }

    public Friend(AccessClassificationType accessClassificationType, AccessClassificationType accessClassificationType2, GroupClassificationType groupClassificationType, String str, SharePhotoPassClassificationType sharePhotoPassClassificationType, int i10, Profile profile, InviteState inviteState, String str2) {
        super(null, null, null, null, null, null, null, 0, 0, false, null, false, false, null, 16383, null);
        this.accessClassification = accessClassificationType;
        this.accessClassificationTo = accessClassificationType2;
        this.groupClassification = groupClassificationType;
        this.groupClassificationDescription = str;
        this.photoPassClassificationType = sharePhotoPassClassificationType;
        this.age = i10;
        this.parentGuestProfile = profile;
        this.inviteState = inviteState;
        this.avatarLink = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Friend(Profile profile) {
        this(null, null, null, null, null, 0, null, null, null, 511, null);
        Intrinsics.checkNotNullParameter(profile, "profile");
        setTitle(profile.getTitle());
        setFirstName(profile.getFirstName());
        setMiddleName(profile.getMiddleName());
        setLastName(profile.getLastName());
        setSuffix(profile.getSuffix());
        setGuestType(profile.getGuestType());
        setGuid(profile.getGuid());
        setXid(profile.getXid());
        setSwid(profile.getSwid());
        setDateOfBirth(profile.getDateOfBirth());
        this.age = calculateAge();
        setAvatar(profile.getAvatar());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Friend(String firstName, String lastName, String str, GroupClassificationType groupClassificationType) {
        this(null, null, null, null, null, 0, null, null, null, 511, null);
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        setFirstName(firstName);
        setLastName(lastName);
        setXid(str);
        this.groupClassification = groupClassificationType;
    }
}