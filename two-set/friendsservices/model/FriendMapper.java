package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.friendsservices.model.Friend;
import com.disney.wdpro.friendsservices.model.Friend.InviteState;
import com.disney.wdpro.friendsservices.model.dto.AccessClassificationTypeToDTO;
import com.disney.wdpro.friendsservices.model.dto.FriendDTO;
import com.disney.wdpro.friendsservices.model.dto.InviteBodyDTO;
import com.disney.wdpro.friendsservices.model.dto.InviteLinksDTO;
import com.disney.wdpro.friendsservices.model.dto.InvitePostDTO;
import com.disney.wdpro.friendsservices.model.dto.InviteResendDTO;
import com.disney.wdpro.friendsservices.model.dto.InviteStateDTO;
import com.disney.wdpro.friendsservices.model.dto.LinksDTO;
import com.disney.wdpro.friendsservices.utils.BaseMapper;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00060\u0006R\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/FriendMapper;", "Lcom/disney/wdpro/friendsservices/utils/BaseMapper;", "Lcom/disney/wdpro/friendsservices/model/dto/FriendDTO;", "Lcom/disney/wdpro/friendsservices/model/Friend;", "()V", "convertInvite", "Lcom/disney/wdpro/friendsservices/model/Friend$InviteState;", "inviteFriendDTO", "Lcom/disney/wdpro/friendsservices/model/dto/InviteStateDTO;", "map", "friendDTO", "mapAge", "", "rawAge", "", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nFriendMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendMapper.kt\ncom/disney/wdpro/friendsservices/model/FriendMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
/* loaded from: classes28.dex */
public final class FriendMapper implements BaseMapper<FriendDTO, Friend> {
    private final Friend.InviteState convertInvite(InviteStateDTO inviteFriendDTO) {
        InviteResendDTO resend;
        InvitePostDTO post;
        InviteBodyDTO body;
        Friend friend = new Friend(null, null, null, null, null, 0, null, null, null, 511, null);
        String status = inviteFriendDTO.getStatus();
        InviteLinksDTO links = inviteFriendDTO.getLinks();
        return friend.new InviteState(status, (links == null || (resend = links.getResend()) == null || (post = resend.getPost()) == null || (body = post.getBody()) == null) ? null : body.getInvitationID());
    }

    private final int mapAge(String rawAge) {
        try {
            return Integer.parseInt(StringsKt.replace$default(rawAge, "+", "", false, 4, (Object) null));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Override // com.disney.wdpro.friendsservices.utils.BaseMapper
    public Friend map(FriendDTO friendDTO) {
        AccessClassificationType accessClassification;
        SharePhotoPassClassificationType sharePhotoPassClassificationType;
        Intrinsics.checkNotNullParameter(friendDTO, "friendDTO");
        Friend friend = new Friend(null, null, null, null, null, 0, null, null, null, 511, null);
        AccessClassificationTypeToDTO accessClassificationTo = friendDTO.getAccessClassificationTo();
        if (accessClassificationTo == null || (accessClassification = accessClassificationTo.getAccessClassification()) == null) {
            accessClassification = AccessClassificationType.UNKNOWN;
        }
        friend.setAccessClassificationTo(accessClassification);
        AccessClassificationType accessClassification2 = friendDTO.getAccessClassification();
        if (accessClassification2 == null) {
            accessClassification2 = AccessClassificationType.UNKNOWN;
        }
        friend.setAccessClassification(accessClassification2);
        GroupClassificationType groupClassification = friendDTO.getGroupClassification();
        if (groupClassification == null) {
            groupClassification = GroupClassificationType.UNKNOWN;
        }
        friend.setGroupClassification(groupClassification);
        List<SharePhotoPassClassificationType> shareClassification = friendDTO.getShareClassification();
        if (shareClassification == null || (sharePhotoPassClassificationType = shareClassification.get(0)) == null) {
            sharePhotoPassClassificationType = SharePhotoPassClassificationType.UNKNOWN;
        }
        friend.setPhotoPassClassificationType(sharePhotoPassClassificationType);
        LinksDTO links = friendDTO.getLinks();
        friend.setAvatarLink(links != null ? links.getAvatarLinkHref() : null);
        friend.setTitle(friendDTO.getTitle());
        String firstName = friendDTO.getFirstName();
        Intrinsics.checkNotNull(firstName);
        friend.setFirstName(firstName);
        friend.setMiddleName(friendDTO.getMiddleName());
        String lastName = friendDTO.getLastName();
        Intrinsics.checkNotNull(lastName);
        friend.setLastName(lastName);
        friend.setSuffix(friendDTO.getSuffix());
        friend.setMepSerialNumber(friendDTO.getMepSerialNumber());
        InviteStateDTO inviteState = friendDTO.getInviteState();
        if (inviteState != null && inviteState.getStatus() != null) {
            InviteStateDTO inviteState2 = friendDTO.getInviteState();
            Intrinsics.checkNotNull(inviteState2);
            friend.setInviteState(convertInvite(inviteState2));
        }
        String dateOfBirth = friendDTO.getDateOfBirth();
        if (dateOfBirth != null && dateOfBirth.length() != 0) {
            friend.setDateOfBirth(friendDTO.getDateOfBirth());
        }
        String age = friendDTO.getAge();
        if (age != null) {
            friend.setAge(mapAge(age));
        }
        friend.setGuestType(friendDTO.getGuestType());
        List<GuestIdentifier> guestIdentifiers = friendDTO.getGuestIdentifiers();
        if (guestIdentifiers != null) {
            friend.setGuestIdentifiers(CollectionsKt.toMutableList((Collection) guestIdentifiers));
        }
        friend.setParentGuestProfile(friendDTO.getParentGuestProfile());
        return friend;
    }
}