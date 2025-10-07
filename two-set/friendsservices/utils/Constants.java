package com.disney.wdpro.friendsservices.utils;

import com.disney.wdpro.park.adobe.C17602p;
import com.disney.wdpro.service.model.cag.AffiliatedGuestsResponse;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b4\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u00068"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/utils/Constants;", "", "()V", "ACCEPT_INVITE_REQUEST_BODY", "", "AVATARS_FIELD_PARAM", "AVATAR_PROFILE_FIELD", "CONVERT", "DECLINE_INVITE_REQUEST_BODY", "DEFAULT_AVATAR_GRAY_ID", "DEFAULT_AVATAR_ID", "EXPAND_ALLOW_PARTIAL_SUCCESS", "FRIEND", "FRIENDS", "FRIENDS_BY_PLANS", "FRIENDS_EXPAND_PARAM", "FRIENDS_FIELDS_PARAM", "FRIEND_FAMILY", AffiliatedGuestsResponse.Guest.SUBTYPE_GUEST, "GUEST_ID_TYPE_PARAM", "GUEST_ID_VALUE_PARAM", "ID_GUID", "ID_SWID", "ID_XID", "INDICATOR_SET", "INVITE_MANAGED_GUEST_BODY", "INVITE_REGISTERED_GUEST_BY_EMAIL_BODY", "INVITE_REGISTERED_GUEST_BY_SWID_BODY", "KEYS", "KEY_CACHE_CONTROL", "LIMIT_ITEM_PARAM", "LIMIT_ITEM_VALUE", "MANAGED_GUEST", "MESSAGE_NULL_ISSUED_BY", "MESSAGE_USER_NOT_LOGGED_IN", "PENDING_STATUS_PARAM", "QR_CODE_LIVE_PARAM", "RECEIVED_INVITATION", "RECEIVE_INVITATIONS", "RECEIVE_INVITATIONS_PENDING", "REGEX_NUMBERS", "RESEND_INVITATION", "RESEND_INVITATION_REQUEST_BODY", "RETRIEVE_FRIENDS", "RETRIEVE_FRIENDS_WITHOUT_GROUP", "REVOKE_INVITATION", "REVOKE_INVITATION_REQUEST_BODY", "SEMICOLON_STRING", "SENT_INVITATIONS", "SENT_INVITATIONS_PENDING", Constants.SHARE_FNF_LIST, "START_ITEM_PARAM", "START_ITEM_VALUE", C17602p.KEY_SWID, "UPDATE_UNMANAGED_FRIEND_BODY", "VALUE_NO_CACHE", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final class Constants {
    public static final String ACCEPT_INVITE_REQUEST_BODY = "{\"invitation-id\": \"%s\",\"access-classification\": \"%s\",\"group-classification\": \"%s\"}";
    public static final String AVATARS_FIELD_PARAM = "entries(.(id,name,media(avatarMobileSquare(url),characterTransparent(url))))";
    public static final String AVATAR_PROFILE_FIELD = "avatar(id,name,media(avatarMobileSquare(url),characterTransparent(url)))";
    public static final String CONVERT = "convert";
    public static final String DECLINE_INVITE_REQUEST_BODY = "{\"status\": \"decline\"}";
    public static final String DEFAULT_AVATAR_GRAY_ID = "16818308";
    public static final String DEFAULT_AVATAR_ID = "15655408";
    public static final String EXPAND_ALLOW_PARTIAL_SUCCESS = "expandAllowPartialSuccess";
    public static final String FRIEND = "friend";
    public static final String FRIENDS = "friends";
    public static final String FRIENDS_BY_PLANS = "friends-by-plans";
    public static final String FRIENDS_EXPAND_PARAM = "friends(.invite),friends(.(self,parentGuestProfile,wdproAvatar))";
    public static final String FRIENDS_FIELDS_PARAM = "friends(.(wdproAvatar(id,media(characterTransparent,characterLarge,characterSmall,avatarMobileSquare)),errors,relationshipClassification,accessClassificationCode,accessClassificationDescription,groupClassificationCode,groupClassificationDescription,shareClassificationCode,shareClassificationDescription,classificationTo,title,firstName,middleName,lastName,MEPSerialNumber,suffix,dateOfBirth,age,ageGroup,gender,guestType,guestIdentifiers,links(wdproAvatar,self),parentGuestProfile(title,firstName,middleName,lastName,suffix,dateOfBirth,age,ageGroup,gender,guestType,guestIdentifiers),invite(status)))";
    public static final String FRIEND_FAMILY = "friend-family";
    public static final String GUEST = "guest";
    public static final String GUEST_ID_TYPE_PARAM = "guest-id-type";
    public static final String GUEST_ID_VALUE_PARAM = "guest-id-value";
    public static final String ID_GUID = "id;guid=";
    public static final String ID_SWID = "id;swid=";
    public static final String ID_XID = "id;xid=";
    public static final String INDICATOR_SET = "indicator-set";
    public static final Constants INSTANCE = new Constants();
    public static final String INVITE_MANAGED_GUEST_BODY = "{\"group-classification\":\"%s\",\"access-classification\":\"%s\",\"invitation-type\":\"convert\",\"managed-guest-id-type\":\"guid\",\"managed-guest-id-value\":\"%s\",\"guest-id-type\":\"guid\",\"guest-id-value\":\"%s\",\"first-name\":\"%s\",\"last-name\":\"%s\"}";
    public static final String INVITE_REGISTERED_GUEST_BY_EMAIL_BODY = "{\"group-classification\":\"%s\",\"access-classification\":\"%s\",\"invitation-type\":\"convert\",\"managed-guest-id-type\":\"guid\",\"managed-guest-id-value\":\"%s\",\"guest-id-type\":\"email\",\"guest-id-value\":\"%s\",\"first-name\":\"%s\",\"last-name\":\"%s\"}";
    public static final String INVITE_REGISTERED_GUEST_BY_SWID_BODY = "{\"group-classification\":\"%s\",\"access-classification\":\"%s\",\"invitation-type\":\"convert\",\"managed-guest-id-type\":\"guid\",\"managed-guest-id-value\":\"%s\",\"guest-id-type\": \"swid\",\"guest-id-value\":\"%s\"}";
    public static final String KEYS = "keys";
    public static final String KEY_CACHE_CONTROL = "Cache-Control";
    public static final String LIMIT_ITEM_PARAM = "item-limit";
    public static final String LIMIT_ITEM_VALUE = "99999";
    public static final String MANAGED_GUEST = "managed-guest";
    public static final String MESSAGE_NULL_ISSUED_BY = "Unable to accept invite";
    public static final String MESSAGE_USER_NOT_LOGGED_IN = "User not logged in";
    public static final String PENDING_STATUS_PARAM = "&status=pending";
    public static final String QR_CODE_LIVE_PARAM = "qrCodeLive";
    public static final String RECEIVED_INVITATION = "received-invitation";
    public static final String RECEIVE_INVITATIONS = "%s/received-invitations?guest-id-type=swid&guest-id-value=%s&start-item=%s&item-limit=%s";
    public static final String RECEIVE_INVITATIONS_PENDING = "%s/received-invitations?guest-id-type=swid&guest-id-value=%s&start-item=%s&item-limit=%s&status=pending";
    public static final String REGEX_NUMBERS = "\\d+";
    public static final String RESEND_INVITATION = "sent-invitations";
    public static final String RESEND_INVITATION_REQUEST_BODY = "{\"invitation-id\":\"%s\"}";
    public static final String RETRIEVE_FRIENDS = "%s/friends?guest-id-type=swid&guest-id-value=%s&group-classification-code=%s&guest-locators=xid&ignoreMissingLinks=true&item-limit=99999";
    public static final String RETRIEVE_FRIENDS_WITHOUT_GROUP = "%s/friends?guest-id-type=swid&guest-id-value=%s&guest-locators=xid&ignoreMissingLinks=true&item-limit=99999";
    public static final String REVOKE_INVITATION = "sent-invitation";
    public static final String REVOKE_INVITATION_REQUEST_BODY = "{\"status\":\"revoke\"}";
    public static final String SEMICOLON_STRING = ";";
    public static final String SENT_INVITATIONS = "%s/sent-invitations?guest-id-type=swid&guest-id-value=%s&start-item=%s&item-limit=%s";
    public static final String SENT_INVITATIONS_PENDING = "%s/sent-invitations?guest-id-type=swid&guest-id-value=%s&start-item=%s&item-limit=%s&status=pending";
    public static final String SHARE_FNF_LIST = "SHARE_FNF_LIST";
    public static final String START_ITEM_PARAM = "start-item";
    public static final String START_ITEM_VALUE = "0";
    public static final String SWID = "swid";
    public static final String UPDATE_UNMANAGED_FRIEND_BODY = "{\"access-classification\":\"%s\",\"group-classification\":\"%s\",\"share-classification\":%s}";
    public static final String VALUE_NO_CACHE = "no-cache, max-age=0";

    private Constants() {
    }
}