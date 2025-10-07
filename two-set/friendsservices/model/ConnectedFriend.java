package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.service.business.APIConstants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(m92037d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\u0018\u00002\u00020\u0001:\u0001VBç\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0016¢\u0006\u0002\u0010\u001eJ\u0012\u0010T\u001a\u0004\u0018\u00010\u00052\u0006\u0010U\u001a\u00020\u0005H\u0002R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u0013\u0010+\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R \u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u00107\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b8\u0010$R \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010;\"\u0004\b<\u0010=R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010$\"\u0004\b?\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010$\"\u0004\bA\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010$\"\u0004\bC\u0010&R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR&\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0013\u0010P\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bQ\u0010$R\u0011\u0010R\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bS\u0010$¨\u0006W"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/ConnectedFriend;", "Ljava/io/Serializable;", "personName", "Lcom/disney/wdpro/friendsservices/model/PersonName;", "fullName", "", "age", APIConstants.JsonKeys.AVATAR_ID, "dateOfBirth", "managedByName", "managedBySwid", "avatarUrl", "favoriteCharacter", "invitationId", "status", "Lcom/disney/wdpro/friendsservices/model/FriendConnectionStatus;", "issuedDateTime", "accessClassification", "Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;", "groupClassification", "Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;", "photoPassClassificationType", "", "Lcom/disney/wdpro/friendsservices/model/SharePhotoPassClassificationType;", "guestIdentifiers", "Lcom/disney/wdpro/friendsservices/model/ConnectedFriend$GuestIdentifiers;", "isQrCodeEligible", "", "requestedGuestIdentifiers", "Lcom/disney/wdpro/friendsservices/model/GuestIdentifier;", "(Lcom/disney/wdpro/friendsservices/model/PersonName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/disney/wdpro/friendsservices/model/FriendConnectionStatus;Ljava/lang/String;Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;Ljava/util/List;Lcom/disney/wdpro/friendsservices/model/ConnectedFriend$GuestIdentifiers;ZLjava/util/List;)V", "getAccessClassification", "()Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;", "setAccessClassification", "(Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;)V", "getAge", "()Ljava/lang/String;", "setAge", "(Ljava/lang/String;)V", "getAvatarId", "setAvatarId", "getAvatarUrl", "setAvatarUrl", "childSwid", "getChildSwid", "getDateOfBirth", "setDateOfBirth", "getFavoriteCharacter", "setFavoriteCharacter", "getFullName", "setFullName", "getGroupClassification", "()Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;", "setGroupClassification", "(Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;)V", "guid", "getGuid", "getInvitationId", "setInvitationId", "()Z", "setQrCodeEligible", "(Z)V", "getIssuedDateTime", "setIssuedDateTime", "getManagedByName", "setManagedByName", "getManagedBySwid", "setManagedBySwid", "getPersonName", "()Lcom/disney/wdpro/friendsservices/model/PersonName;", "setPersonName", "(Lcom/disney/wdpro/friendsservices/model/PersonName;)V", "getPhotoPassClassificationType", "()Ljava/util/List;", "setPhotoPassClassificationType", "(Ljava/util/List;)V", "getStatus", "()Lcom/disney/wdpro/friendsservices/model/FriendConnectionStatus;", "setStatus", "(Lcom/disney/wdpro/friendsservices/model/FriendConnectionStatus;)V", "swid", "getSwid", "xid", "getXid", "getRequestGuestIdentifier", "type", "GuestIdentifiers", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nConnectedFriend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectedFriend.kt\ncom/disney/wdpro/friendsservices/model/ConnectedFriend\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes28.dex */
public final class ConnectedFriend implements Serializable {

    @SerializedName("accessClassificationCode")
    private AccessClassificationType accessClassification;
    private String age;
    private String avatarId;
    private String avatarUrl;
    private String dateOfBirth;
    private String favoriteCharacter;
    private String fullName;

    @SerializedName("groupClassificationCode")
    private GroupClassificationType groupClassification;
    private GuestIdentifiers guestIdentifiers;

    @SerializedName("invitation-id")
    private String invitationId;

    @SerializedName("qrCodeEligible")
    private boolean isQrCodeEligible;
    private String issuedDateTime;
    private String managedByName;
    private String managedBySwid;

    @SerializedName("name")
    private PersonName personName;

    @SerializedName("shareClassificationCode")
    private List<? extends SharePhotoPassClassificationType> photoPassClassificationType;
    private final List<GuestIdentifier> requestedGuestIdentifiers;
    private FriendConnectionStatus status;

    public ConnectedFriend() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 262143, null);
    }

    private final String getRequestGuestIdentifier(String type) {
        Object next;
        List<GuestIdentifier> list = this.requestedGuestIdentifiers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((GuestIdentifier) next).getType(), GuestIdentifier.ID_TYPE_CHILD_SWID)) {
                    break;
                }
            }
            GuestIdentifier guestIdentifier = (GuestIdentifier) next;
            if (guestIdentifier != null) {
                return guestIdentifier.getValue();
            }
        }
        return null;
    }

    public final AccessClassificationType getAccessClassification() {
        return this.accessClassification;
    }

    public final String getAge() {
        return this.age;
    }

    public final String getAvatarId() {
        return this.avatarId;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getChildSwid() {
        return getRequestGuestIdentifier(GuestIdentifier.ID_TYPE_CHILD_SWID);
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getFavoriteCharacter() {
        return this.favoriteCharacter;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final GroupClassificationType getGroupClassification() {
        return this.groupClassification;
    }

    public final String getGuid() {
        GuestIdentifiers guestIdentifiers = this.guestIdentifiers;
        if (guestIdentifiers != null) {
            return guestIdentifiers.getGuid();
        }
        return null;
    }

    public final String getInvitationId() {
        return this.invitationId;
    }

    public final String getIssuedDateTime() {
        return this.issuedDateTime;
    }

    public final String getManagedByName() {
        return this.managedByName;
    }

    public final String getManagedBySwid() {
        return this.managedBySwid;
    }

    public final PersonName getPersonName() {
        return this.personName;
    }

    public final List<SharePhotoPassClassificationType> getPhotoPassClassificationType() {
        return this.photoPassClassificationType;
    }

    public final FriendConnectionStatus getStatus() {
        return this.status;
    }

    public final String getSwid() {
        GuestIdentifiers guestIdentifiers = this.guestIdentifiers;
        if (guestIdentifiers != null) {
            return guestIdentifiers.getSwid();
        }
        return null;
    }

    public final String getXid() {
        GuestIdentifiers guestIdentifiers = this.guestIdentifiers;
        Intrinsics.checkNotNull(guestIdentifiers);
        return guestIdentifiers.getXid();
    }

    /* renamed from: isQrCodeEligible, reason: from getter */
    public final boolean getIsQrCodeEligible() {
        return this.isQrCodeEligible;
    }

    public final void setAccessClassification(AccessClassificationType accessClassificationType) {
        this.accessClassification = accessClassificationType;
    }

    public final void setAge(String str) {
        this.age = str;
    }

    public final void setAvatarId(String str) {
        this.avatarId = str;
    }

    public final void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public final void setDateOfBirth(String str) {
        this.dateOfBirth = str;
    }

    public final void setFavoriteCharacter(String str) {
        this.favoriteCharacter = str;
    }

    public final void setFullName(String str) {
        this.fullName = str;
    }

    public final void setGroupClassification(GroupClassificationType groupClassificationType) {
        this.groupClassification = groupClassificationType;
    }

    public final void setInvitationId(String str) {
        this.invitationId = str;
    }

    public final void setIssuedDateTime(String str) {
        this.issuedDateTime = str;
    }

    public final void setManagedByName(String str) {
        this.managedByName = str;
    }

    public final void setManagedBySwid(String str) {
        this.managedBySwid = str;
    }

    public final void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    public final void setPhotoPassClassificationType(List<? extends SharePhotoPassClassificationType> list) {
        this.photoPassClassificationType = list;
    }

    public final void setQrCodeEligible(boolean z10) {
        this.isQrCodeEligible = z10;
    }

    public final void setStatus(FriendConnectionStatus friendConnectionStatus) {
        this.status = friendConnectionStatus;
    }

    public ConnectedFriend(PersonName personName, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, FriendConnectionStatus friendConnectionStatus, String str10, AccessClassificationType accessClassificationType, GroupClassificationType groupClassificationType, List<? extends SharePhotoPassClassificationType> list, GuestIdentifiers guestIdentifiers, boolean z10, List<GuestIdentifier> list2) {
        this.personName = personName;
        this.fullName = str;
        this.age = str2;
        this.avatarId = str3;
        this.dateOfBirth = str4;
        this.managedByName = str5;
        this.managedBySwid = str6;
        this.avatarUrl = str7;
        this.favoriteCharacter = str8;
        this.invitationId = str9;
        this.status = friendConnectionStatus;
        this.issuedDateTime = str10;
        this.accessClassification = accessClassificationType;
        this.groupClassification = groupClassificationType;
        this.photoPassClassificationType = list;
        this.guestIdentifiers = guestIdentifiers;
        this.isQrCodeEligible = z10;
        this.requestedGuestIdentifiers = list2;
    }

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/ConnectedFriend$GuestIdentifiers;", "", "xid", "", "guid", "swid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGuid", "()Ljava/lang/String;", "setGuid", "(Ljava/lang/String;)V", "getSwid", "setSwid", "getXid", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class GuestIdentifiers {
        private String guid;
        private String swid;
        private final String xid;

        public GuestIdentifiers(String xid, String str, String str2) {
            Intrinsics.checkNotNullParameter(xid, "xid");
            this.xid = xid;
            this.guid = str;
            this.swid = str2;
        }

        public static /* synthetic */ GuestIdentifiers copy$default(GuestIdentifiers guestIdentifiers, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = guestIdentifiers.xid;
            }
            if ((i10 & 2) != 0) {
                str2 = guestIdentifiers.guid;
            }
            if ((i10 & 4) != 0) {
                str3 = guestIdentifiers.swid;
            }
            return guestIdentifiers.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getXid() {
            return this.xid;
        }

        /* renamed from: component2, reason: from getter */
        public final String getGuid() {
            return this.guid;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSwid() {
            return this.swid;
        }

        public final GuestIdentifiers copy(String xid, String guid, String swid) {
            Intrinsics.checkNotNullParameter(xid, "xid");
            return new GuestIdentifiers(xid, guid, swid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GuestIdentifiers)) {
                return false;
            }
            GuestIdentifiers guestIdentifiers = (GuestIdentifiers) other;
            return Intrinsics.areEqual(this.xid, guestIdentifiers.xid) && Intrinsics.areEqual(this.guid, guestIdentifiers.guid) && Intrinsics.areEqual(this.swid, guestIdentifiers.swid);
        }

        public final String getGuid() {
            return this.guid;
        }

        public final String getSwid() {
            return this.swid;
        }

        public final String getXid() {
            return this.xid;
        }

        public int hashCode() {
            int iHashCode = this.xid.hashCode() * 31;
            String str = this.guid;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.swid;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final void setGuid(String str) {
            this.guid = str;
        }

        public final void setSwid(String str) {
            this.swid = str;
        }

        public String toString() {
            return "GuestIdentifiers(xid=" + this.xid + ", guid=" + this.guid + ", swid=" + this.swid + ")";
        }

        public /* synthetic */ GuestIdentifiers(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
        }
    }

    public /* synthetic */ ConnectedFriend(PersonName personName, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, FriendConnectionStatus friendConnectionStatus, String str10, AccessClassificationType accessClassificationType, GroupClassificationType groupClassificationType, List list, GuestIdentifiers guestIdentifiers, boolean z10, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : personName, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, (i10 & 256) != 0 ? null : str8, (i10 & 512) != 0 ? null : str9, (i10 & 1024) != 0 ? null : friendConnectionStatus, (i10 & 2048) != 0 ? null : str10, (i10 & 4096) != 0 ? null : accessClassificationType, (i10 & 8192) != 0 ? null : groupClassificationType, (i10 & 16384) != 0 ? null : list, (i10 & 32768) != 0 ? null : guestIdentifiers, (i10 & 65536) != 0 ? false : z10, (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? null : list2);
    }
}