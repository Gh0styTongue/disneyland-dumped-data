package com.disney.wdpro.friendsservices.model.dto;

import com.disney.wdpro.friendsservices.model.AccessClassificationType;
import com.disney.wdpro.friendsservices.model.GroupClassificationType;
import com.disney.wdpro.friendsservices.model.GuestIdentifier;
import com.disney.wdpro.friendsservices.model.Profile;
import com.disney.wdpro.friendsservices.model.SharePhotoPassClassificationType;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.google.common.base.Optional;
import com.google.gson.annotations.SerializedName;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(m92037d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bU\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 ~2\u00020\u0001:\u0001~B©\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010!J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u0010`\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\fHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÂ\u0003J\u000f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006HÂ\u0003J\u000f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006HÂ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÂ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÂ\u0003J\u000f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÂ\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÂ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÂ\u0003J\u000f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÂ\u0003J\u000f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÂ\u0003J\u0011\u0010o\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u00ad\u0002\u0010q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010r\u001a\u00020s2\b\u0010t\u001a\u0004\u0018\u00010uHÖ\u0003J\u0012\u0010v\u001a\u0004\u0018\u00010\u00032\u0006\u0010w\u001a\u00020\u0003H\u0002J\t\u0010x\u001a\u00020yHÖ\u0001J\u001a\u0010I\u001a\u00020z2\b\u0010{\u001a\u0004\u0018\u00010\u00032\b\u0010|\u001a\u0004\u0018\u00010\u0003J\t\u0010}\u001a\u00020\u0003HÖ\u0001R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010+\u001a\u0004\u0018\u00010\u00032\b\u0010*\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R(\u00100\u001a\u0004\u0018\u00010\u00032\b\u0010*\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0013\u00103\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b4\u0010-R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010-R \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010-\"\u0004\b;\u0010/R\u0013\u0010<\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b=\u0010-R\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010-R\u0013\u0010A\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bB\u0010-R\u0013\u0010C\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010-R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0013\u0010K\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bL\u0010-R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0013\u0010M\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bN\u0010-R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0013\u0010O\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010?\"\u0004\bS\u0010TR\u0013\u0010U\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bV\u0010-R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0013\u0010W\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bX\u0010-R\u0013\u0010Y\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bZ\u0010-R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0013\u0010[\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\\\u0010-¨\u0006\u007f"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/dto/FriendDTO;", "Ljava/io/Serializable;", "firstName", "", "lastName", "titleOptional", "Lcom/google/common/base/Optional;", "middleNameOptional", "suffixOptional", "mepSerialNumberOptional", "dateOfBirthOptional", "guestIdentifiers", "", "Lcom/disney/wdpro/friendsservices/model/GuestIdentifier;", "accessClassification", "Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;", "accessClassificationTo", "Lcom/disney/wdpro/friendsservices/model/dto/AccessClassificationTypeToDTO;", "groupClassification", "Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;", "shareClassification", "Lcom/disney/wdpro/friendsservices/model/SharePhotoPassClassificationType;", "groupClassificationDescription", "ageOptional", "parentGuestProfileOptional", "Lcom/disney/wdpro/friendsservices/model/Profile;", "inviteStateOptional", "Lcom/disney/wdpro/friendsservices/model/dto/InviteStateDTO;", OTUXParamsKeys.OT_UX_LINKS, "Lcom/disney/wdpro/friendsservices/model/dto/LinksDTO;", "guestType", "guestIdValueOptional", "avatarURLOptional", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Ljava/util/List;Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;Lcom/disney/wdpro/friendsservices/model/dto/AccessClassificationTypeToDTO;Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;Ljava/util/List;Ljava/lang/String;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Lcom/disney/wdpro/friendsservices/model/dto/LinksDTO;Ljava/lang/String;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;)V", "getAccessClassification", "()Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;", "setAccessClassification", "(Lcom/disney/wdpro/friendsservices/model/AccessClassificationType;)V", "getAccessClassificationTo", "()Lcom/disney/wdpro/friendsservices/model/dto/AccessClassificationTypeToDTO;", "setAccessClassificationTo", "(Lcom/disney/wdpro/friendsservices/model/dto/AccessClassificationTypeToDTO;)V", "value", "age", "getAge", "()Ljava/lang/String;", "setAge", "(Ljava/lang/String;)V", "avatarURL", "getAvatarURL", "setAvatarURL", "dateOfBirth", "getDateOfBirth", "getFirstName", "getGroupClassification", "()Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;", "setGroupClassification", "(Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;)V", "getGroupClassificationDescription", "setGroupClassificationDescription", "guestIdValue", "getGuestIdValue", "getGuestIdentifiers", "()Ljava/util/List;", "getGuestType", "guid", "getGuid", "inviteState", "getInviteState", "()Lcom/disney/wdpro/friendsservices/model/dto/InviteStateDTO;", "getLastName", "getLinks", "()Lcom/disney/wdpro/friendsservices/model/dto/LinksDTO;", "setLinks", "(Lcom/disney/wdpro/friendsservices/model/dto/LinksDTO;)V", "mepSerialNumber", "getMepSerialNumber", "middleName", "getMiddleName", "parentGuestProfile", "getParentGuestProfile", "()Lcom/disney/wdpro/friendsservices/model/Profile;", "getShareClassification", "setShareClassification", "(Ljava/util/List;)V", "suffix", "getSuffix", "swid", "getSwid", "title", "getTitle", "xid", "getXid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "getGuestIdentifier", "type", "hashCode", "", "", "avatarLink", "selfLink", "toString", "Companion", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nFriendDTO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendDTO.kt\ncom/disney/wdpro/friendsservices/model/dto/FriendDTO\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n1855#2,2:106\n*S KotlinDebug\n*F\n+ 1 FriendDTO.kt\ncom/disney/wdpro/friendsservices/model/dto/FriendDTO\n*L\n91#1:106,2\n*E\n"})
/* loaded from: classes28.dex */
public final /* data */ class FriendDTO implements Serializable {
    private static final String GUID = "guid";
    private static final String SWID = "swid";
    private static final String XID = "xid";

    @SerializedName("accessClassificationCode")
    private AccessClassificationType accessClassification;

    @SerializedName("classificationTo")
    private AccessClassificationTypeToDTO accessClassificationTo;

    @SerializedName("age")
    private Optional<String> ageOptional;

    @SerializedName("avatarURL")
    private Optional<String> avatarURLOptional;

    @SerializedName("dateOfBirth")
    private final Optional<String> dateOfBirthOptional;
    private final String firstName;

    @SerializedName("groupClassificationCode")
    private GroupClassificationType groupClassification;
    private String groupClassificationDescription;

    @SerializedName("guestIdValue")
    private Optional<String> guestIdValueOptional;
    private final List<GuestIdentifier> guestIdentifiers;
    private final String guestType;

    @SerializedName("invite")
    private Optional<InviteStateDTO> inviteStateOptional;
    private final String lastName;
    private LinksDTO links;

    @SerializedName("MEPSerialNumber")
    private final Optional<String> mepSerialNumberOptional;

    @SerializedName("middleName")
    private final Optional<String> middleNameOptional;

    @SerializedName("parentGuestProfile")
    private final Optional<Profile> parentGuestProfileOptional;

    @SerializedName("shareClassificationCode")
    private List<? extends SharePhotoPassClassificationType> shareClassification;

    @SerializedName("suffix")
    private final Optional<String> suffixOptional;

    @SerializedName("title")
    private final Optional<String> titleOptional;

    public FriendDTO() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    private final Optional<String> component14() {
        return this.ageOptional;
    }

    private final Optional<Profile> component15() {
        return this.parentGuestProfileOptional;
    }

    private final Optional<InviteStateDTO> component16() {
        return this.inviteStateOptional;
    }

    private final Optional<String> component19() {
        return this.guestIdValueOptional;
    }

    private final Optional<String> component20() {
        return this.avatarURLOptional;
    }

    private final Optional<String> component3() {
        return this.titleOptional;
    }

    private final Optional<String> component4() {
        return this.middleNameOptional;
    }

    private final Optional<String> component5() {
        return this.suffixOptional;
    }

    private final Optional<String> component6() {
        return this.mepSerialNumberOptional;
    }

    private final Optional<String> component7() {
        return this.dateOfBirthOptional;
    }

    public static /* synthetic */ FriendDTO copy$default(FriendDTO friendDTO, String str, String str2, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, List list, AccessClassificationType accessClassificationType, AccessClassificationTypeToDTO accessClassificationTypeToDTO, GroupClassificationType groupClassificationType, List list2, String str3, Optional optional6, Optional optional7, Optional optional8, LinksDTO linksDTO, String str4, Optional optional9, Optional optional10, int i10, Object obj) {
        Optional optional11;
        Optional optional12;
        String str5 = (i10 & 1) != 0 ? friendDTO.firstName : str;
        String str6 = (i10 & 2) != 0 ? friendDTO.lastName : str2;
        Optional optional13 = (i10 & 4) != 0 ? friendDTO.titleOptional : optional;
        Optional optional14 = (i10 & 8) != 0 ? friendDTO.middleNameOptional : optional2;
        Optional optional15 = (i10 & 16) != 0 ? friendDTO.suffixOptional : optional3;
        Optional optional16 = (i10 & 32) != 0 ? friendDTO.mepSerialNumberOptional : optional4;
        Optional optional17 = (i10 & 64) != 0 ? friendDTO.dateOfBirthOptional : optional5;
        List list3 = (i10 & 128) != 0 ? friendDTO.guestIdentifiers : list;
        AccessClassificationType accessClassificationType2 = (i10 & 256) != 0 ? friendDTO.accessClassification : accessClassificationType;
        AccessClassificationTypeToDTO accessClassificationTypeToDTO2 = (i10 & 512) != 0 ? friendDTO.accessClassificationTo : accessClassificationTypeToDTO;
        GroupClassificationType groupClassificationType2 = (i10 & 1024) != 0 ? friendDTO.groupClassification : groupClassificationType;
        List list4 = (i10 & 2048) != 0 ? friendDTO.shareClassification : list2;
        String str7 = (i10 & 4096) != 0 ? friendDTO.groupClassificationDescription : str3;
        Optional optional18 = (i10 & 8192) != 0 ? friendDTO.ageOptional : optional6;
        String str8 = str5;
        Optional optional19 = (i10 & 16384) != 0 ? friendDTO.parentGuestProfileOptional : optional7;
        Optional optional20 = (i10 & 32768) != 0 ? friendDTO.inviteStateOptional : optional8;
        LinksDTO linksDTO2 = (i10 & 65536) != 0 ? friendDTO.links : linksDTO;
        String str9 = (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? friendDTO.guestType : str4;
        Optional optional21 = (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? friendDTO.guestIdValueOptional : optional9;
        if ((i10 & 524288) != 0) {
            optional12 = optional21;
            optional11 = friendDTO.avatarURLOptional;
        } else {
            optional11 = optional10;
            optional12 = optional21;
        }
        return friendDTO.copy(str8, str6, optional13, optional14, optional15, optional16, optional17, list3, accessClassificationType2, accessClassificationTypeToDTO2, groupClassificationType2, list4, str7, optional18, optional19, optional20, linksDTO2, str9, optional12, optional11);
    }

    private final String getGuestIdentifier(String type) {
        List<GuestIdentifier> list = this.guestIdentifiers;
        if (list == null) {
            return null;
        }
        for (GuestIdentifier guestIdentifier : list) {
            if (StringsKt.equals(guestIdentifier.getType(), type, true)) {
                return guestIdentifier.getValue();
            }
        }
        return null;
    }

    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component10, reason: from getter */
    public final AccessClassificationTypeToDTO getAccessClassificationTo() {
        return this.accessClassificationTo;
    }

    /* renamed from: component11, reason: from getter */
    public final GroupClassificationType getGroupClassification() {
        return this.groupClassification;
    }

    public final List<SharePhotoPassClassificationType> component12() {
        return this.shareClassification;
    }

    /* renamed from: component13, reason: from getter */
    public final String getGroupClassificationDescription() {
        return this.groupClassificationDescription;
    }

    /* renamed from: component17, reason: from getter */
    public final LinksDTO getLinks() {
        return this.links;
    }

    /* renamed from: component18, reason: from getter */
    public final String getGuestType() {
        return this.guestType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public final List<GuestIdentifier> component8() {
        return this.guestIdentifiers;
    }

    /* renamed from: component9, reason: from getter */
    public final AccessClassificationType getAccessClassification() {
        return this.accessClassification;
    }

    public final FriendDTO copy(String firstName, String lastName, Optional<String> titleOptional, Optional<String> middleNameOptional, Optional<String> suffixOptional, Optional<String> mepSerialNumberOptional, Optional<String> dateOfBirthOptional, List<GuestIdentifier> guestIdentifiers, AccessClassificationType accessClassification, AccessClassificationTypeToDTO accessClassificationTo, GroupClassificationType groupClassification, List<? extends SharePhotoPassClassificationType> shareClassification, String groupClassificationDescription, Optional<String> ageOptional, Optional<Profile> parentGuestProfileOptional, Optional<InviteStateDTO> inviteStateOptional, LinksDTO links, String guestType, Optional<String> guestIdValueOptional, Optional<String> avatarURLOptional) {
        Intrinsics.checkNotNullParameter(titleOptional, "titleOptional");
        Intrinsics.checkNotNullParameter(middleNameOptional, "middleNameOptional");
        Intrinsics.checkNotNullParameter(suffixOptional, "suffixOptional");
        Intrinsics.checkNotNullParameter(mepSerialNumberOptional, "mepSerialNumberOptional");
        Intrinsics.checkNotNullParameter(dateOfBirthOptional, "dateOfBirthOptional");
        Intrinsics.checkNotNullParameter(ageOptional, "ageOptional");
        Intrinsics.checkNotNullParameter(parentGuestProfileOptional, "parentGuestProfileOptional");
        Intrinsics.checkNotNullParameter(inviteStateOptional, "inviteStateOptional");
        Intrinsics.checkNotNullParameter(guestIdValueOptional, "guestIdValueOptional");
        Intrinsics.checkNotNullParameter(avatarURLOptional, "avatarURLOptional");
        return new FriendDTO(firstName, lastName, titleOptional, middleNameOptional, suffixOptional, mepSerialNumberOptional, dateOfBirthOptional, guestIdentifiers, accessClassification, accessClassificationTo, groupClassification, shareClassification, groupClassificationDescription, ageOptional, parentGuestProfileOptional, inviteStateOptional, links, guestType, guestIdValueOptional, avatarURLOptional);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendDTO)) {
            return false;
        }
        FriendDTO friendDTO = (FriendDTO) other;
        return Intrinsics.areEqual(this.firstName, friendDTO.firstName) && Intrinsics.areEqual(this.lastName, friendDTO.lastName) && Intrinsics.areEqual(this.titleOptional, friendDTO.titleOptional) && Intrinsics.areEqual(this.middleNameOptional, friendDTO.middleNameOptional) && Intrinsics.areEqual(this.suffixOptional, friendDTO.suffixOptional) && Intrinsics.areEqual(this.mepSerialNumberOptional, friendDTO.mepSerialNumberOptional) && Intrinsics.areEqual(this.dateOfBirthOptional, friendDTO.dateOfBirthOptional) && Intrinsics.areEqual(this.guestIdentifiers, friendDTO.guestIdentifiers) && this.accessClassification == friendDTO.accessClassification && Intrinsics.areEqual(this.accessClassificationTo, friendDTO.accessClassificationTo) && this.groupClassification == friendDTO.groupClassification && Intrinsics.areEqual(this.shareClassification, friendDTO.shareClassification) && Intrinsics.areEqual(this.groupClassificationDescription, friendDTO.groupClassificationDescription) && Intrinsics.areEqual(this.ageOptional, friendDTO.ageOptional) && Intrinsics.areEqual(this.parentGuestProfileOptional, friendDTO.parentGuestProfileOptional) && Intrinsics.areEqual(this.inviteStateOptional, friendDTO.inviteStateOptional) && Intrinsics.areEqual(this.links, friendDTO.links) && Intrinsics.areEqual(this.guestType, friendDTO.guestType) && Intrinsics.areEqual(this.guestIdValueOptional, friendDTO.guestIdValueOptional) && Intrinsics.areEqual(this.avatarURLOptional, friendDTO.avatarURLOptional);
    }

    public final AccessClassificationType getAccessClassification() {
        return this.accessClassification;
    }

    public final AccessClassificationTypeToDTO getAccessClassificationTo() {
        return this.accessClassificationTo;
    }

    public final String getAge() {
        return this.ageOptional.orNull();
    }

    public final String getAvatarURL() {
        return this.avatarURLOptional.orNull();
    }

    public final String getDateOfBirth() {
        return this.dateOfBirthOptional.orNull();
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final GroupClassificationType getGroupClassification() {
        return this.groupClassification;
    }

    public final String getGroupClassificationDescription() {
        return this.groupClassificationDescription;
    }

    public final String getGuestIdValue() {
        return this.guestIdValueOptional.orNull();
    }

    public final List<GuestIdentifier> getGuestIdentifiers() {
        return this.guestIdentifiers;
    }

    public final String getGuestType() {
        return this.guestType;
    }

    public final String getGuid() {
        return getGuestIdentifier("guid");
    }

    public final InviteStateDTO getInviteState() {
        return this.inviteStateOptional.orNull();
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final LinksDTO getLinks() {
        return this.links;
    }

    public final String getMepSerialNumber() {
        return this.mepSerialNumberOptional.orNull();
    }

    public final String getMiddleName() {
        return this.middleNameOptional.orNull();
    }

    public final Profile getParentGuestProfile() {
        return this.parentGuestProfileOptional.orNull();
    }

    public final List<SharePhotoPassClassificationType> getShareClassification() {
        return this.shareClassification;
    }

    public final String getSuffix() {
        return this.suffixOptional.orNull();
    }

    public final String getSwid() {
        return getGuestIdentifier("swid");
    }

    public final String getTitle() {
        return this.titleOptional.orNull();
    }

    public final String getXid() {
        return getGuestIdentifier("xid");
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int iHashCode2 = (((((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.titleOptional.hashCode()) * 31) + this.middleNameOptional.hashCode()) * 31) + this.suffixOptional.hashCode()) * 31) + this.mepSerialNumberOptional.hashCode()) * 31) + this.dateOfBirthOptional.hashCode()) * 31;
        List<GuestIdentifier> list = this.guestIdentifiers;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        AccessClassificationType accessClassificationType = this.accessClassification;
        int iHashCode4 = (iHashCode3 + (accessClassificationType == null ? 0 : accessClassificationType.hashCode())) * 31;
        AccessClassificationTypeToDTO accessClassificationTypeToDTO = this.accessClassificationTo;
        int iHashCode5 = (iHashCode4 + (accessClassificationTypeToDTO == null ? 0 : accessClassificationTypeToDTO.hashCode())) * 31;
        GroupClassificationType groupClassificationType = this.groupClassification;
        int iHashCode6 = (iHashCode5 + (groupClassificationType == null ? 0 : groupClassificationType.hashCode())) * 31;
        List<? extends SharePhotoPassClassificationType> list2 = this.shareClassification;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.groupClassificationDescription;
        int iHashCode8 = (((((((iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.ageOptional.hashCode()) * 31) + this.parentGuestProfileOptional.hashCode()) * 31) + this.inviteStateOptional.hashCode()) * 31;
        LinksDTO linksDTO = this.links;
        int iHashCode9 = (iHashCode8 + (linksDTO == null ? 0 : linksDTO.hashCode())) * 31;
        String str4 = this.guestType;
        return ((((iHashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.guestIdValueOptional.hashCode()) * 31) + this.avatarURLOptional.hashCode();
    }

    public final void setAccessClassification(AccessClassificationType accessClassificationType) {
        this.accessClassification = accessClassificationType;
    }

    public final void setAccessClassificationTo(AccessClassificationTypeToDTO accessClassificationTypeToDTO) {
        this.accessClassificationTo = accessClassificationTypeToDTO;
    }

    public final void setAge(String str) {
        Optional<String> optionalFromNullable = Optional.fromNullable(str);
        Intrinsics.checkNotNullExpressionValue(optionalFromNullable, "fromNullable(value)");
        this.ageOptional = optionalFromNullable;
    }

    public final void setAvatarURL(String str) {
        Optional<String> optionalFromNullable = Optional.fromNullable(str);
        Intrinsics.checkNotNullExpressionValue(optionalFromNullable, "fromNullable(value)");
        this.avatarURLOptional = optionalFromNullable;
    }

    public final void setGroupClassification(GroupClassificationType groupClassificationType) {
        this.groupClassification = groupClassificationType;
    }

    public final void setGroupClassificationDescription(String str) {
        this.groupClassificationDescription = str;
    }

    public final void setLinks(LinksDTO linksDTO) {
        this.links = linksDTO;
    }

    public final void setShareClassification(List<? extends SharePhotoPassClassificationType> list) {
        this.shareClassification = list;
    }

    public String toString() {
        return "FriendDTO(firstName=" + this.firstName + ", lastName=" + this.lastName + ", titleOptional=" + this.titleOptional + ", middleNameOptional=" + this.middleNameOptional + ", suffixOptional=" + this.suffixOptional + ", mepSerialNumberOptional=" + this.mepSerialNumberOptional + ", dateOfBirthOptional=" + this.dateOfBirthOptional + ", guestIdentifiers=" + this.guestIdentifiers + ", accessClassification=" + this.accessClassification + ", accessClassificationTo=" + this.accessClassificationTo + ", groupClassification=" + this.groupClassification + ", shareClassification=" + this.shareClassification + ", groupClassificationDescription=" + this.groupClassificationDescription + ", ageOptional=" + this.ageOptional + ", parentGuestProfileOptional=" + this.parentGuestProfileOptional + ", inviteStateOptional=" + this.inviteStateOptional + ", links=" + this.links + ", guestType=" + this.guestType + ", guestIdValueOptional=" + this.guestIdValueOptional + ", avatarURLOptional=" + this.avatarURLOptional + ")";
    }

    public FriendDTO(String str, String str2, Optional<String> titleOptional, Optional<String> middleNameOptional, Optional<String> suffixOptional, Optional<String> mepSerialNumberOptional, Optional<String> dateOfBirthOptional, List<GuestIdentifier> list, AccessClassificationType accessClassificationType, AccessClassificationTypeToDTO accessClassificationTypeToDTO, GroupClassificationType groupClassificationType, List<? extends SharePhotoPassClassificationType> list2, String str3, Optional<String> ageOptional, Optional<Profile> parentGuestProfileOptional, Optional<InviteStateDTO> inviteStateOptional, LinksDTO linksDTO, String str4, Optional<String> guestIdValueOptional, Optional<String> avatarURLOptional) {
        Intrinsics.checkNotNullParameter(titleOptional, "titleOptional");
        Intrinsics.checkNotNullParameter(middleNameOptional, "middleNameOptional");
        Intrinsics.checkNotNullParameter(suffixOptional, "suffixOptional");
        Intrinsics.checkNotNullParameter(mepSerialNumberOptional, "mepSerialNumberOptional");
        Intrinsics.checkNotNullParameter(dateOfBirthOptional, "dateOfBirthOptional");
        Intrinsics.checkNotNullParameter(ageOptional, "ageOptional");
        Intrinsics.checkNotNullParameter(parentGuestProfileOptional, "parentGuestProfileOptional");
        Intrinsics.checkNotNullParameter(inviteStateOptional, "inviteStateOptional");
        Intrinsics.checkNotNullParameter(guestIdValueOptional, "guestIdValueOptional");
        Intrinsics.checkNotNullParameter(avatarURLOptional, "avatarURLOptional");
        this.firstName = str;
        this.lastName = str2;
        this.titleOptional = titleOptional;
        this.middleNameOptional = middleNameOptional;
        this.suffixOptional = suffixOptional;
        this.mepSerialNumberOptional = mepSerialNumberOptional;
        this.dateOfBirthOptional = dateOfBirthOptional;
        this.guestIdentifiers = list;
        this.accessClassification = accessClassificationType;
        this.accessClassificationTo = accessClassificationTypeToDTO;
        this.groupClassification = groupClassificationType;
        this.shareClassification = list2;
        this.groupClassificationDescription = str3;
        this.ageOptional = ageOptional;
        this.parentGuestProfileOptional = parentGuestProfileOptional;
        this.inviteStateOptional = inviteStateOptional;
        this.links = linksDTO;
        this.guestType = str4;
        this.guestIdValueOptional = guestIdValueOptional;
        this.avatarURLOptional = avatarURLOptional;
    }

    public final void setLinks(String avatarLink, String selfLink) {
        this.links = new LinksDTO(avatarLink, selfLink);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FriendDTO(String str, String str2, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, List list, AccessClassificationType accessClassificationType, AccessClassificationTypeToDTO accessClassificationTypeToDTO, GroupClassificationType groupClassificationType, List list2, String str3, Optional optional6, Optional optional7, Optional optional8, LinksDTO linksDTO, String str4, Optional optional9, Optional optional10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Optional optionalAbsent;
        Optional optionalAbsent2;
        Optional optionalAbsent3;
        Optional optionalAbsent4;
        Optional optionalAbsent5;
        Optional optionalAbsent6;
        Optional optionalAbsent7;
        Optional optionalAbsent8;
        Optional optionalAbsent9;
        Optional optional11;
        Optional optional12;
        String str5 = (i10 & 1) != 0 ? null : str;
        String str6 = (i10 & 2) != 0 ? null : str2;
        if ((i10 & 4) != 0) {
            optionalAbsent = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent, "absent()");
        } else {
            optionalAbsent = optional;
        }
        if ((i10 & 8) != 0) {
            optionalAbsent2 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent2, "absent()");
        } else {
            optionalAbsent2 = optional2;
        }
        if ((i10 & 16) != 0) {
            optionalAbsent3 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent3, "absent()");
        } else {
            optionalAbsent3 = optional3;
        }
        if ((i10 & 32) != 0) {
            optionalAbsent4 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent4, "absent()");
        } else {
            optionalAbsent4 = optional4;
        }
        if ((i10 & 64) != 0) {
            optionalAbsent5 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent5, "absent()");
        } else {
            optionalAbsent5 = optional5;
        }
        List list3 = (i10 & 128) != 0 ? null : list;
        AccessClassificationType accessClassificationType2 = (i10 & 256) != 0 ? null : accessClassificationType;
        AccessClassificationTypeToDTO accessClassificationTypeToDTO2 = (i10 & 512) != 0 ? null : accessClassificationTypeToDTO;
        GroupClassificationType groupClassificationType2 = (i10 & 1024) != 0 ? null : groupClassificationType;
        List list4 = (i10 & 2048) != 0 ? null : list2;
        String str7 = (i10 & 4096) != 0 ? null : str3;
        if ((i10 & 8192) != 0) {
            optionalAbsent6 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent6, "absent()");
        } else {
            optionalAbsent6 = optional6;
        }
        String str8 = str5;
        if ((i10 & 16384) != 0) {
            optionalAbsent7 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent7, "absent()");
        } else {
            optionalAbsent7 = optional7;
        }
        if ((i10 & 32768) != 0) {
            optionalAbsent8 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent8, "absent()");
        } else {
            optionalAbsent8 = optional8;
        }
        LinksDTO linksDTO2 = (i10 & 65536) != 0 ? null : linksDTO;
        String str9 = (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? null : str4;
        Optional optional13 = optionalAbsent8;
        if ((i10 & PKIFailureInfo.transactionIdInUse) != 0) {
            optionalAbsent9 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent9, "absent()");
        } else {
            optionalAbsent9 = optional9;
        }
        if ((i10 & 524288) != 0) {
            Optional optional14 = optionalAbsent9;
            Optional optionalAbsent10 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent10, "absent()");
            optional12 = optional14;
            optional11 = optionalAbsent10;
        } else {
            optional11 = optional10;
            optional12 = optionalAbsent9;
        }
        this(str8, str6, optionalAbsent, optionalAbsent2, optionalAbsent3, optionalAbsent4, optionalAbsent5, list3, accessClassificationType2, accessClassificationTypeToDTO2, groupClassificationType2, list4, str7, optionalAbsent6, optionalAbsent7, optional13, linksDTO2, str9, optional12, optional11);
    }
}