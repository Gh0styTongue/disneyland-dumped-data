package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.service.business.APIConstants;
import com.google.common.base.Optional;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0011J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÂ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÂ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÂ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÂ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÂ\u0003J¡\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R(\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R(\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R(\u0010!\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R(\u0010$\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010/\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0013\"\u0004\b1\u0010\u0015R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0013\"\u0004\b3\u0010\u0015¨\u0006G"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/SuggestedFriend;", "Ljava/io/Serializable;", "xid", "", "swidOptional", "Lcom/google/common/base/Optional;", "guidOptional", "personName", "Lcom/disney/wdpro/friendsservices/model/PersonName;", "fullName", "age", "status", "Lcom/disney/wdpro/friendsservices/model/FriendConnectionStatus;", APIConstants.JsonKeys.AVATAR_ID, "managedByNameOptional", "managedBySwidOptional", "avatarUrlOptional", "(Ljava/lang/String;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/disney/wdpro/friendsservices/model/PersonName;Ljava/lang/String;Ljava/lang/String;Lcom/disney/wdpro/friendsservices/model/FriendConnectionStatus;Ljava/lang/String;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;)V", "getAge", "()Ljava/lang/String;", "setAge", "(Ljava/lang/String;)V", "getAvatarId", "setAvatarId", "value", "avatarUrl", "getAvatarUrl", "setAvatarUrl", "getFullName", "setFullName", "guid", "getGuid", "setGuid", "managedByName", "getManagedByName", "setManagedByName", "managedBySwid", "getManagedBySwid", "setManagedBySwid", "getPersonName", "()Lcom/disney/wdpro/friendsservices/model/PersonName;", "setPersonName", "(Lcom/disney/wdpro/friendsservices/model/PersonName;)V", "getStatus", "()Lcom/disney/wdpro/friendsservices/model/FriendConnectionStatus;", "setStatus", "(Lcom/disney/wdpro/friendsservices/model/FriendConnectionStatus;)V", "swid", "getSwid", "setSwid", "getXid", "setXid", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class SuggestedFriend implements Serializable {
    private String age;
    private String avatarId;
    private Optional<String> avatarUrlOptional;
    private String fullName;

    @SerializedName("guid")
    private Optional<String> guidOptional;

    @SerializedName("managedByName")
    private Optional<String> managedByNameOptional;

    @SerializedName("managedBySwid")
    private Optional<String> managedBySwidOptional;

    @SerializedName("name")
    private PersonName personName;
    private FriendConnectionStatus status;

    @SerializedName("swid")
    private Optional<String> swidOptional;
    private String xid;

    public SuggestedFriend() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    private final Optional<String> component10() {
        return this.managedBySwidOptional;
    }

    private final Optional<String> component11() {
        return this.avatarUrlOptional;
    }

    private final Optional<String> component2() {
        return this.swidOptional;
    }

    private final Optional<String> component3() {
        return this.guidOptional;
    }

    private final Optional<String> component9() {
        return this.managedByNameOptional;
    }

    public static /* synthetic */ SuggestedFriend copy$default(SuggestedFriend suggestedFriend, String str, Optional optional, Optional optional2, PersonName personName, String str2, String str3, FriendConnectionStatus friendConnectionStatus, String str4, Optional optional3, Optional optional4, Optional optional5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = suggestedFriend.xid;
        }
        if ((i10 & 2) != 0) {
            optional = suggestedFriend.swidOptional;
        }
        if ((i10 & 4) != 0) {
            optional2 = suggestedFriend.guidOptional;
        }
        if ((i10 & 8) != 0) {
            personName = suggestedFriend.personName;
        }
        if ((i10 & 16) != 0) {
            str2 = suggestedFriend.fullName;
        }
        if ((i10 & 32) != 0) {
            str3 = suggestedFriend.age;
        }
        if ((i10 & 64) != 0) {
            friendConnectionStatus = suggestedFriend.status;
        }
        if ((i10 & 128) != 0) {
            str4 = suggestedFriend.avatarId;
        }
        if ((i10 & 256) != 0) {
            optional3 = suggestedFriend.managedByNameOptional;
        }
        if ((i10 & 512) != 0) {
            optional4 = suggestedFriend.managedBySwidOptional;
        }
        if ((i10 & 1024) != 0) {
            optional5 = suggestedFriend.avatarUrlOptional;
        }
        Optional optional6 = optional4;
        Optional optional7 = optional5;
        String str5 = str4;
        Optional optional8 = optional3;
        String str6 = str3;
        FriendConnectionStatus friendConnectionStatus2 = friendConnectionStatus;
        String str7 = str2;
        Optional optional9 = optional2;
        return suggestedFriend.copy(str, optional, optional9, personName, str7, str6, friendConnectionStatus2, str5, optional8, optional6, optional7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getXid() {
        return this.xid;
    }

    /* renamed from: component4, reason: from getter */
    public final PersonName getPersonName() {
        return this.personName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAge() {
        return this.age;
    }

    /* renamed from: component7, reason: from getter */
    public final FriendConnectionStatus getStatus() {
        return this.status;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAvatarId() {
        return this.avatarId;
    }

    public final SuggestedFriend copy(String xid, Optional<String> swidOptional, Optional<String> guidOptional, PersonName personName, String fullName, String age, FriendConnectionStatus status, String avatarId, Optional<String> managedByNameOptional, Optional<String> managedBySwidOptional, Optional<String> avatarUrlOptional) {
        Intrinsics.checkNotNullParameter(swidOptional, "swidOptional");
        Intrinsics.checkNotNullParameter(guidOptional, "guidOptional");
        Intrinsics.checkNotNullParameter(managedByNameOptional, "managedByNameOptional");
        Intrinsics.checkNotNullParameter(managedBySwidOptional, "managedBySwidOptional");
        Intrinsics.checkNotNullParameter(avatarUrlOptional, "avatarUrlOptional");
        return new SuggestedFriend(xid, swidOptional, guidOptional, personName, fullName, age, status, avatarId, managedByNameOptional, managedBySwidOptional, avatarUrlOptional);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedFriend)) {
            return false;
        }
        SuggestedFriend suggestedFriend = (SuggestedFriend) other;
        return Intrinsics.areEqual(this.xid, suggestedFriend.xid) && Intrinsics.areEqual(this.swidOptional, suggestedFriend.swidOptional) && Intrinsics.areEqual(this.guidOptional, suggestedFriend.guidOptional) && Intrinsics.areEqual(this.personName, suggestedFriend.personName) && Intrinsics.areEqual(this.fullName, suggestedFriend.fullName) && Intrinsics.areEqual(this.age, suggestedFriend.age) && this.status == suggestedFriend.status && Intrinsics.areEqual(this.avatarId, suggestedFriend.avatarId) && Intrinsics.areEqual(this.managedByNameOptional, suggestedFriend.managedByNameOptional) && Intrinsics.areEqual(this.managedBySwidOptional, suggestedFriend.managedBySwidOptional) && Intrinsics.areEqual(this.avatarUrlOptional, suggestedFriend.avatarUrlOptional);
    }

    public final String getAge() {
        return this.age;
    }

    public final String getAvatarId() {
        return this.avatarId;
    }

    public final String getAvatarUrl() {
        return this.avatarUrlOptional.orNull();
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getGuid() {
        return this.guidOptional.orNull();
    }

    public final String getManagedByName() {
        return this.managedByNameOptional.orNull();
    }

    public final String getManagedBySwid() {
        return this.managedBySwidOptional.orNull();
    }

    public final PersonName getPersonName() {
        return this.personName;
    }

    public final FriendConnectionStatus getStatus() {
        return this.status;
    }

    public final String getSwid() {
        return this.swidOptional.orNull();
    }

    public final String getXid() {
        return this.xid;
    }

    public int hashCode() {
        String str = this.xid;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.swidOptional.hashCode()) * 31) + this.guidOptional.hashCode()) * 31;
        PersonName personName = this.personName;
        int iHashCode2 = (iHashCode + (personName == null ? 0 : personName.hashCode())) * 31;
        String str2 = this.fullName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.age;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FriendConnectionStatus friendConnectionStatus = this.status;
        int iHashCode5 = (iHashCode4 + (friendConnectionStatus == null ? 0 : friendConnectionStatus.hashCode())) * 31;
        String str4 = this.avatarId;
        return ((((((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.managedByNameOptional.hashCode()) * 31) + this.managedBySwidOptional.hashCode()) * 31) + this.avatarUrlOptional.hashCode();
    }

    public final void setAge(String str) {
        this.age = str;
    }

    public final void setAvatarId(String str) {
        this.avatarId = str;
    }

    public final void setAvatarUrl(String str) {
        Optional<String> optionalFromNullable = Optional.fromNullable(str);
        Intrinsics.checkNotNullExpressionValue(optionalFromNullable, "fromNullable(value)");
        this.avatarUrlOptional = optionalFromNullable;
    }

    public final void setFullName(String str) {
        this.fullName = str;
    }

    public final void setGuid(String str) {
        Optional<String> optionalFromNullable = Optional.fromNullable(str);
        Intrinsics.checkNotNullExpressionValue(optionalFromNullable, "fromNullable(value)");
        this.guidOptional = optionalFromNullable;
    }

    public final void setManagedByName(String str) {
        Optional<String> optionalFromNullable = Optional.fromNullable(str);
        Intrinsics.checkNotNullExpressionValue(optionalFromNullable, "fromNullable(value)");
        this.managedByNameOptional = optionalFromNullable;
    }

    public final void setManagedBySwid(String str) {
        Optional<String> optionalFromNullable = Optional.fromNullable(str);
        Intrinsics.checkNotNullExpressionValue(optionalFromNullable, "fromNullable(value)");
        this.managedBySwidOptional = optionalFromNullable;
    }

    public final void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    public final void setStatus(FriendConnectionStatus friendConnectionStatus) {
        this.status = friendConnectionStatus;
    }

    public final void setSwid(String str) {
        Optional<String> optionalFromNullable = Optional.fromNullable(str);
        Intrinsics.checkNotNullExpressionValue(optionalFromNullable, "fromNullable(value)");
        this.swidOptional = optionalFromNullable;
    }

    public final void setXid(String str) {
        this.xid = str;
    }

    public String toString() {
        return "SuggestedFriend(xid=" + this.xid + ", swidOptional=" + this.swidOptional + ", guidOptional=" + this.guidOptional + ", personName=" + this.personName + ", fullName=" + this.fullName + ", age=" + this.age + ", status=" + this.status + ", avatarId=" + this.avatarId + ", managedByNameOptional=" + this.managedByNameOptional + ", managedBySwidOptional=" + this.managedBySwidOptional + ", avatarUrlOptional=" + this.avatarUrlOptional + ")";
    }

    public SuggestedFriend(String str, Optional<String> swidOptional, Optional<String> guidOptional, PersonName personName, String str2, String str3, FriendConnectionStatus friendConnectionStatus, String str4, Optional<String> managedByNameOptional, Optional<String> managedBySwidOptional, Optional<String> avatarUrlOptional) {
        Intrinsics.checkNotNullParameter(swidOptional, "swidOptional");
        Intrinsics.checkNotNullParameter(guidOptional, "guidOptional");
        Intrinsics.checkNotNullParameter(managedByNameOptional, "managedByNameOptional");
        Intrinsics.checkNotNullParameter(managedBySwidOptional, "managedBySwidOptional");
        Intrinsics.checkNotNullParameter(avatarUrlOptional, "avatarUrlOptional");
        this.xid = str;
        this.swidOptional = swidOptional;
        this.guidOptional = guidOptional;
        this.personName = personName;
        this.fullName = str2;
        this.age = str3;
        this.status = friendConnectionStatus;
        this.avatarId = str4;
        this.managedByNameOptional = managedByNameOptional;
        this.managedBySwidOptional = managedBySwidOptional;
        this.avatarUrlOptional = avatarUrlOptional;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SuggestedFriend(String str, Optional optional, Optional optional2, PersonName personName, String str2, String str3, FriendConnectionStatus friendConnectionStatus, String str4, Optional optional3, Optional optional4, Optional optional5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i10 & 1) != 0 ? null : str;
        if ((i10 & 2) != 0) {
            optional = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optional, "absent()");
        }
        if ((i10 & 4) != 0) {
            optional2 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optional2, "absent()");
        }
        personName = (i10 & 8) != 0 ? null : personName;
        str2 = (i10 & 16) != 0 ? null : str2;
        str3 = (i10 & 32) != 0 ? null : str3;
        friendConnectionStatus = (i10 & 64) != 0 ? null : friendConnectionStatus;
        str4 = (i10 & 128) != 0 ? null : str4;
        if ((i10 & 256) != 0) {
            optional3 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optional3, "absent()");
        }
        if ((i10 & 512) != 0) {
            optional4 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optional4, "absent()");
        }
        if ((i10 & 1024) != 0) {
            optional5 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optional5, "absent()");
        }
        this(str, optional, optional2, personName, str2, str3, friendConnectionStatus, str4, optional3, optional4, optional5);
    }
}