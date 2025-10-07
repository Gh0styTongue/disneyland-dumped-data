package com.disney.wdpro.friendsservices.business;

import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.eservices_ui.commons.business.ResortCardsApiClientImpl;
import com.disney.wdpro.facility.model.Avatar;
import com.disney.wdpro.facility.model.MobileThumbnailUrl;
import com.disney.wdpro.friendsservices.FriendEnvironment;
import com.disney.wdpro.friendsservices.XIdProvider;
import com.disney.wdpro.friendsservices.deserializer.DateDeserializer;
import com.disney.wdpro.friendsservices.model.AccessClassificationType;
import com.disney.wdpro.friendsservices.model.ConnectedFriend;
import com.disney.wdpro.friendsservices.model.ContactInfo;
import com.disney.wdpro.friendsservices.model.CreateInvitations;
import com.disney.wdpro.friendsservices.model.Friend;
import com.disney.wdpro.friendsservices.model.FriendConnectionStatus;
import com.disney.wdpro.friendsservices.model.FriendEntries;
import com.disney.wdpro.friendsservices.model.FriendEntriesMapper;
import com.disney.wdpro.friendsservices.model.FriendIdentifierContainer;
import com.disney.wdpro.friendsservices.model.FriendsByPlans;
import com.disney.wdpro.friendsservices.model.GroupClassificationType;
import com.disney.wdpro.friendsservices.model.Invitation;
import com.disney.wdpro.friendsservices.model.Invite;
import com.disney.wdpro.friendsservices.model.InvitedGuestName;
import com.disney.wdpro.friendsservices.model.InvitedGuestProfile;
import com.disney.wdpro.friendsservices.model.InvitedManagedGuest;
import com.disney.wdpro.friendsservices.model.Profile;
import com.disney.wdpro.friendsservices.model.ReceivedInvite;
import com.disney.wdpro.friendsservices.model.SharePhotoPassClassificationType;
import com.disney.wdpro.friendsservices.model.SuggestedFriend;
import com.disney.wdpro.friendsservices.model.SuggestedFriendEntries;
import com.disney.wdpro.friendsservices.model.VerificationFactor;
import com.disney.wdpro.friendsservices.model.dto.FriendDTO;
import com.disney.wdpro.friendsservices.model.dto.FriendEntriesDTO;
import com.disney.wdpro.friendsservices.model.dto.LinkDTO;
import com.disney.wdpro.friendsservices.model.dto.LinksDTO;
import com.disney.wdpro.friendsservices.utils.Constants;
import com.disney.wdpro.httpclient.C13345q;
import com.disney.wdpro.httpclient.HttpApiClient;
import com.disney.wdpro.httpclient.InterfaceC13334f;
import com.disney.wdpro.httpclient.authentication.AuthEnvironment;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.paymentsui.constants.PaymentsConstants;
import com.disney.wdpro.service.business.APIConstants;
import com.disney.wdpro.service.model.AgeBand;
import com.disney.wdpro.service.model.UserMinimumProfile;
import com.disney.wdpro.service.util.URLUtils;
import com.google.common.base.C22456g;
import com.google.common.base.C22462m;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(m92037d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u008e\u00012\u00020\u0001:\u0002\u008e\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b%\u0010 J+\u0010*\u001a\u00020)2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020'0&H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J#\u00102\u001a\b\u0012\u0004\u0012\u00020\u0015002\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001500H\u0002¢\u0006\u0004\b2\u00103J+\u00105\u001a\u00020)2\u0006\u00104\u001a\u00020\u00152\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020'0&H\u0002¢\u0006\u0004\b5\u00106J\u001b\u00108\u001a\u0004\u0018\u00010\u00122\b\u00107\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020'0&H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u0012H\u0002¢\u0006\u0004\b=\u00109J\u0017\u0010@\u001a\u00020'2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\bB\u0010CJ\u0011\u0010D\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\bD\u0010CJ/\u0010I\u001a\u00020)2\u0006\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u0012H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020)2\u0006\u0010F\u001a\u00020\u0012H\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010P\u001a\u00020O2\u0006\u0010M\u001a\u00020\u00182\u0006\u0010N\u001a\u00020\u0018H\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00182\u0006\u0010T\u001a\u00020\u0018H\u0016¢\u0006\u0004\bU\u0010SJ\u0017\u0010V\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bV\u0010SJ\u0017\u0010X\u001a\u00020)2\u0006\u0010W\u001a\u00020\u0012H\u0016¢\u0006\u0004\bX\u0010LJ\u000f\u0010Y\u001a\u00020\u001dH\u0016¢\u0006\u0004\bY\u0010ZJ\u001f\u0010Y\u001a\u00020\u001d2\u000e\u0010\\\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010\u0014H\u0016¢\u0006\u0004\bY\u0010]J\u000f\u0010^\u001a\u00020\u0012H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\u00122\u0006\u0010`\u001a\u00020OH\u0016¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bc\u0010SJ\u0017\u0010e\u001a\u00020)2\u0006\u0010d\u001a\u00020\u0012H\u0016¢\u0006\u0004\be\u0010LJ\u0015\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u00020)2\u0006\u0010F\u001a\u00020\u0012H\u0016¢\u0006\u0004\bh\u0010LJ\u0017\u0010i\u001a\u00020)2\u0006\u0010F\u001a\u00020\u0012H\u0016¢\u0006\u0004\bi\u0010LJ\u0017\u0010k\u001a\u00020,2\u0006\u0010j\u001a\u00020\u0012H\u0016¢\u0006\u0004\bk\u0010lJ\u001d\u0010n\u001a\u00020O2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014H\u0016¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020!H\u0016¢\u0006\u0004\bp\u0010qJ\u0019\u0010p\u001a\u00020!2\b\u0010s\u001a\u0004\u0018\u00010rH\u0016¢\u0006\u0004\bp\u0010tJ\u0017\u0010v\u001a\u00020u2\u0006\u0010j\u001a\u00020\u0012H\u0016¢\u0006\u0004\bv\u0010wJ\u0011\u0010y\u001a\u0004\u0018\u00010xH\u0016¢\u0006\u0004\by\u0010zR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010{R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010|R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010}R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010~R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u007fR\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0080\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0081\u0001R'\u0010\u0084\u0001\u001a\r \u0083\u0001*\u0005\u0018\u00010\u0082\u00010\u0082\u00018\u0006¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R)\u0010\u0088\u0001\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u008f\u0001"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/business/FriendApiClientImpl;", "Lcom/disney/wdpro/friendsservices/business/FriendApiClient;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authManager", "Lcom/disney/wdpro/httpclient/q;", ResortCardsApiClientImpl.PARAM_CLIENT, "Lcom/disney/wdpro/friendsservices/XIdProvider;", "xidProvider", "Lcom/disney/wdpro/httpclient/authentication/AuthEnvironment;", "authEnv", "Lcom/disney/wdpro/friendsservices/FriendEnvironment;", "friendEnv", "Lcom/disney/wdpro/friendsservices/business/AvatarApiClient;", "avatarApiClient", "Lcom/disney/wdpro/commons/r;", "time", "<init>", "(Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;Lcom/disney/wdpro/httpclient/q;Lcom/disney/wdpro/friendsservices/XIdProvider;Lcom/disney/wdpro/httpclient/authentication/AuthEnvironment;Lcom/disney/wdpro/friendsservices/FriendEnvironment;Lcom/disney/wdpro/friendsservices/business/AvatarApiClient;Lcom/disney/wdpro/commons/r;)V", "", "urlToFormat", "", "Lcom/disney/wdpro/friendsservices/model/Invite;", "retrieveReceiveInvitationWithURLFormat", "(Ljava/lang/String;)Ljava/util/List;", "Lcom/disney/wdpro/friendsservices/model/Friend;", "friend", "Lcom/disney/wdpro/friendsservices/model/InvitedManagedGuest;", "createInvitedManagedGuest", "(Lcom/disney/wdpro/friendsservices/model/Friend;)Lcom/disney/wdpro/friendsservices/model/InvitedManagedGuest;", "Lcom/disney/wdpro/friendsservices/model/FriendEntries;", "friendEntries", "cleanUpFriendsResponseAndSetAvatars", "(Lcom/disney/wdpro/friendsservices/model/FriendEntries;)Lcom/disney/wdpro/friendsservices/model/FriendEntries;", "Lcom/disney/wdpro/friendsservices/model/FriendsByPlans;", "friendsByPlans", "setAvatarsOnFriendsByPlans", "(Lcom/disney/wdpro/friendsservices/model/FriendsByPlans;)Lcom/disney/wdpro/friendsservices/model/FriendsByPlans;", "setAvatarsOnFriendEntries", "", "Lcom/disney/wdpro/facility/model/Avatar;", "avatars", "", "setAvatarOnFriend", "(Lcom/disney/wdpro/friendsservices/model/Friend;Ljava/util/Map;)V", "Lcom/disney/wdpro/friendsservices/model/SuggestedFriendEntries;", "suggestedFriends", "setAvatarsOnSuggestedFriends", "(Lcom/disney/wdpro/friendsservices/model/SuggestedFriendEntries;)Lcom/disney/wdpro/friendsservices/model/SuggestedFriendEntries;", "", "invites", "setAvatarsOnListOfInvites", "(Ljava/util/List;)Ljava/util/List;", "invite", "setAvatarOnInvite", "(Lcom/disney/wdpro/friendsservices/model/Invite;Ljava/util/Map;)V", "avatarLink", "getAvatarId", "(Ljava/lang/String;)Ljava/lang/String;", "retrieveAvatarsAsMap", "()Ljava/util/Map;", APIConstants.JsonKeys.AVATAR_ID, "splitAvatarId", "Lcom/disney/wdpro/service/model/Avatar;", "profileAvatar", "transformAvatar", "(Lcom/disney/wdpro/service/model/Avatar;)Lcom/disney/wdpro/facility/model/Avatar;", "noCache", "()Lcom/disney/wdpro/friendsservices/business/FriendApiClient;", "preload", "issuedByXid", "invitationId", "accessClassificationCode", "groupClassificationCode", "acceptInvite", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "rejectInvite", "(Ljava/lang/String;)V", "myManagedFriend", "theirManagedFriend", "", "inviteManagedGuest", "(Lcom/disney/wdpro/friendsservices/model/Friend;Lcom/disney/wdpro/friendsservices/model/Friend;)Z", "inviteRegisteredGuest", "(Lcom/disney/wdpro/friendsservices/model/Friend;)Lcom/disney/wdpro/friendsservices/model/Friend;", "newFriend", "createManagedFriend", "updateManagedFriend", "guid", "deleteManagedFriend", "retrieveFriends", "()Lcom/disney/wdpro/friendsservices/model/FriendEntries;", "Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;", "groupClassificationTypes", "(Ljava/util/List;)Lcom/disney/wdpro/friendsservices/model/FriendEntries;", "retrieveShareSetting", "()Ljava/lang/String;", "shareFriendsWithOthers", "updateShareSetting", "(Z)Ljava/lang/String;", "updateUnmanagedFriend", "xid", "deleteUnmanagedFriend", "retrievePendingReceivedInvites", "()Ljava/util/List;", "resendInvite", "revokeInvite", "swid", "retrieveSuggestedFriendsList", "(Ljava/lang/String;)Lcom/disney/wdpro/friendsservices/model/SuggestedFriendEntries;", "friendsToBeInvited", "createBulkInviteRequest", "(Ljava/util/List;)Z", "retrieveFriendsByPlans", "()Lcom/disney/wdpro/friendsservices/model/FriendsByPlans;", "Lcom/disney/wdpro/service/model/AgeBand;", FriendApiClientImpl.AGE_BAND_PARAM, "(Lcom/disney/wdpro/service/model/AgeBand;)Lcom/disney/wdpro/friendsservices/model/FriendsByPlans;", "Lcom/disney/wdpro/friendsservices/model/FriendIdentifierContainer;", "retrieveFriendsIdentifiers", "(Ljava/lang/String;)Lcom/disney/wdpro/friendsservices/model/FriendIdentifierContainer;", "Lcom/disney/wdpro/friendsservices/model/Profile;", "getProfile", "()Lcom/disney/wdpro/friendsservices/model/Profile;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "Lcom/disney/wdpro/httpclient/q;", "Lcom/disney/wdpro/friendsservices/XIdProvider;", "Lcom/disney/wdpro/httpclient/authentication/AuthEnvironment;", "Lcom/disney/wdpro/friendsservices/FriendEnvironment;", "Lcom/disney/wdpro/friendsservices/business/AvatarApiClient;", "Lcom/disney/wdpro/commons/r;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", PaymentsConstants.PATTERN, "Ljava/util/regex/Pattern;", "getPattern", "()Ljava/util/regex/Pattern;", Constants.QR_CODE_LIVE_PARAM, "Z", "getQrCodeLive", "()Z", "setQrCodeLive", "(Z)V", "Companion", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Singleton
@Instrumented
@SourceDebugExtension({"SMAP\nFriendApiClientImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendApiClientImpl.kt\ncom/disney/wdpro/friendsservices/business/FriendApiClientImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,761:1\n1#2:762\n1855#3,2:763\n1855#3,2:765\n1855#3,2:767\n1855#3,2:769\n1194#3,2:771\n1222#3,4:773\n*S KotlinDebug\n*F\n+ 1 FriendApiClientImpl.kt\ncom/disney/wdpro/friendsservices/business/FriendApiClientImpl\n*L\n476#1:763,2\n643#1:765,2\n678#1:767,2\n691#1:769,2\n724#1:771,2\n724#1:773,4\n*E\n"})
/* loaded from: classes28.dex */
public final class FriendApiClientImpl implements FriendApiClient {
    public static final String AGE_BAND_PARAM = "ageBand";
    private final AuthEnvironment authEnv;
    private final AuthenticationManager authManager;
    private final AvatarApiClient avatarApiClient;
    private final C13345q client;
    private final FriendEnvironment friendEnv;
    private final Pattern pattern;
    private boolean qrCodeLive;
    private final C9350r time;
    private final XIdProvider xidProvider;

    @Inject
    public FriendApiClientImpl(AuthenticationManager authManager, C13345q client, XIdProvider xidProvider, AuthEnvironment authEnv, FriendEnvironment friendEnv, AvatarApiClient avatarApiClient, C9350r time) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(xidProvider, "xidProvider");
        Intrinsics.checkNotNullParameter(authEnv, "authEnv");
        Intrinsics.checkNotNullParameter(friendEnv, "friendEnv");
        Intrinsics.checkNotNullParameter(avatarApiClient, "avatarApiClient");
        Intrinsics.checkNotNullParameter(time, "time");
        this.authManager = authManager;
        this.client = client;
        this.xidProvider = xidProvider;
        this.authEnv = authEnv;
        this.friendEnv = friendEnv;
        this.avatarApiClient = avatarApiClient;
        this.time = time;
        this.pattern = Pattern.compile(Constants.REGEX_NUMBERS);
    }

    private final FriendEntries cleanUpFriendsResponseAndSetAvatars(FriendEntries friendEntries) {
        friendEntries.removeArchivedEntries();
        friendEntries.renameTertiaries();
        return setAvatarsOnFriendEntries(friendEntries);
    }

    private final InvitedManagedGuest createInvitedManagedGuest(Friend friend) {
        InvitedManagedGuest invitedManagedGuest = new InvitedManagedGuest(null, 1, null);
        InvitedGuestProfile invitedGuestProfile = new InvitedGuestProfile(null, (short) 0, 3, null);
        InvitedGuestName invitedGuestName = new InvitedGuestName(null, null, null, null, null, 31, null);
        invitedGuestName.setFirstName(friend.getFirstName());
        invitedGuestName.setLastName(friend.getLastName());
        invitedGuestName.setMiddleName(friend.getMiddleName());
        invitedGuestName.setSuffix(friend.getSuffix());
        invitedGuestName.setTitle(friend.getTitle());
        invitedGuestProfile.setName(invitedGuestName);
        invitedGuestProfile.setAge((short) friend.getAge());
        invitedManagedGuest.setProfile(invitedGuestProfile);
        return invitedManagedGuest;
    }

    private final String getAvatarId(String avatarLink) {
        if (avatarLink == null || avatarLink.length() == 0) {
            return null;
        }
        Matcher matcher = this.pattern.matcher(avatarLink);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private final Map<String, Avatar> retrieveAvatarsAsMap() {
        try {
            List<Avatar> entries = this.avatarApiClient.retrieveAvatarsByMediaSync(Avatar.AvatarMedia.AVATAR_MOBILE_SQUARE).getEntries();
            if (entries == null) {
                return MapsKt.emptyMap();
            }
            List<Avatar> list = entries;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                String id2 = ((Avatar) obj).getId();
                Intrinsics.checkNotNullExpressionValue(id2, "it.id");
                linkedHashMap.put(splitAvatarId(id2), obj);
            }
            return linkedHashMap;
        } catch (IOException unused) {
            return MapsKt.emptyMap();
        }
    }

    private final List<Invite> retrieveReceiveInvitationWithURLFormat(String urlToFormat) throws IOException {
        C22462m.m68668A(this.authManager.isUserAuthenticated(), Constants.MESSAGE_USER_NOT_LOGGED_IN, new Object[0]);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(urlToFormat, Arrays.copyOf(new Object[]{this.friendEnv.getGamAssemblyServiceUrl(), URLUtils.urlEncode(this.authManager.getUserSwid()), "0", Constants.LIMIT_ITEM_VALUE}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        JSONObject jSONObject = (JSONObject) this.client.m55668c(this.friendEnv.getApimExpandServiceUrl(), JSONObject.class).m55672b().m55518f(APIConstants.UrlParams.EXPAND).m55531u("url", str).m55531u(APIConstants.UrlParams.EXPAND, "received-invitations(.(issuedBy(self)))").m55531u(APIConstants.UrlParams.IGNORE_MISSING_LINKS, "true").m55523m().m55516d().m55530t("Cache-Control", "no-cache, max-age=0").m55535y(new InterfaceC13334f.b()).m55521i().m55683c();
        ArrayList invites = Lists.m69268i();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("received-invitations");
        if (jSONArrayOptJSONArray != null) {
            Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "optJSONArray(\"received-invitations\")");
            invites.addAll(ReceivedInvite.INSTANCE.invitesFromJson(jSONArrayOptJSONArray, this.time));
        }
        Intrinsics.checkNotNullExpressionValue(invites, "invites");
        return setAvatarsOnListOfInvites(invites);
    }

    private final void setAvatarOnFriend(Friend friend, Map<String, ? extends Avatar> avatars) {
        String avatarId = getAvatarId(friend.getAvatarLink());
        if (avatarId == null || Intrinsics.areEqual(avatarId, "15655408") || Intrinsics.areEqual(avatarId, "16818308")) {
            return;
        }
        friend.setAvatar(avatars.get(avatarId));
    }

    private final void setAvatarOnInvite(Invite invite, Map<String, ? extends Avatar> avatars) {
        LinkDTO avatarLink;
        FriendDTO issuedBy = invite.getIssuedBy();
        if (issuedBy != null) {
            LinksDTO links = issuedBy.getLinks();
            String avatarId = getAvatarId((links == null || (avatarLink = links.getAvatarLink()) == null) ? null : avatarLink.getHref());
            if (avatarId == null || Intrinsics.areEqual(avatarId, "15655408") || Intrinsics.areEqual(avatarId, "16818308")) {
                return;
            }
            Avatar avatar = avatars.get(avatarId);
            issuedBy.setAvatarURL(avatar != null ? avatar.getImageAvatar() : null);
        }
    }

    private final FriendEntries setAvatarsOnFriendEntries(FriendEntries friendEntries) {
        List<Friend> entries = friendEntries.getEntries();
        if (entries != null && !entries.isEmpty()) {
            Map<String, Avatar> mapRetrieveAvatarsAsMap = retrieveAvatarsAsMap();
            Iterator<Friend> it = friendEntries.getEntries().iterator();
            while (it.hasNext()) {
                setAvatarOnFriend(it.next(), mapRetrieveAvatarsAsMap);
            }
        }
        return friendEntries;
    }

    private final FriendsByPlans setAvatarsOnFriendsByPlans(FriendsByPlans friendsByPlans) {
        if (!friendsByPlans.getAllFriends().isEmpty()) {
            Map<String, Avatar> mapRetrieveAvatarsAsMap = retrieveAvatarsAsMap();
            for (ConnectedFriend connectedFriend : friendsByPlans.getAllFriends()) {
                String avatarId = connectedFriend.getAvatarId();
                if (avatarId != null && avatarId.length() != 0) {
                    Avatar avatar = mapRetrieveAvatarsAsMap.get(connectedFriend.getAvatarId());
                    connectedFriend.setAvatarUrl(avatar != null ? avatar.getImageAvatar() : null);
                }
            }
        }
        return friendsByPlans;
    }

    private final List<Invite> setAvatarsOnListOfInvites(List<Invite> invites) {
        if (!invites.isEmpty()) {
            Map<String, Avatar> mapRetrieveAvatarsAsMap = retrieveAvatarsAsMap();
            Iterator<T> it = invites.iterator();
            while (it.hasNext()) {
                setAvatarOnInvite((Invite) it.next(), mapRetrieveAvatarsAsMap);
            }
        }
        return invites;
    }

    private final SuggestedFriendEntries setAvatarsOnSuggestedFriends(SuggestedFriendEntries suggestedFriends) {
        if (!suggestedFriends.isEmpty()) {
            Map<String, Avatar> mapRetrieveAvatarsAsMap = retrieveAvatarsAsMap();
            List<SuggestedFriend> entries = suggestedFriends.getEntries();
            if (entries != null) {
                for (SuggestedFriend suggestedFriend : entries) {
                    String avatarId = suggestedFriend.getAvatarId();
                    if (avatarId != null && avatarId.length() != 0) {
                        Avatar avatar = mapRetrieveAvatarsAsMap.get(suggestedFriend.getAvatarId());
                        suggestedFriend.setAvatarUrl(avatar != null ? avatar.getImageAvatar() : null);
                    }
                }
            }
        }
        return suggestedFriends;
    }

    private final String splitAvatarId(String avatarId) {
        String strSubstring = avatarId.substring(0, StringsKt.indexOf$default((CharSequence) avatarId, ";", 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final Avatar transformAvatar(com.disney.wdpro.service.model.Avatar profileAvatar) {
        String avatarKey = Avatar.AvatarMedia.AVATAR_MOBILE_SQUARE.getKey();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNullExpressionValue(avatarKey, "avatarKey");
        linkedHashMap.put(avatarKey, new MobileThumbnailUrl(profileAvatar.getImageAvatar(), avatarKey, ""));
        return new Avatar(profileAvatar.getId(), profileAvatar.getName(), linkedHashMap);
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public void acceptInvite(String issuedByXid, String invitationId, String accessClassificationCode, String groupClassificationCode) throws IOException {
        Intrinsics.checkNotNullParameter(issuedByXid, "issuedByXid");
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        Intrinsics.checkNotNullParameter(accessClassificationCode, "accessClassificationCode");
        Intrinsics.checkNotNullParameter(groupClassificationCode, "groupClassificationCode");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Constants.ACCEPT_INVITE_REQUEST_BODY, Arrays.copyOf(new Object[]{invitationId, accessClassificationCode, groupClassificationCode}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        this.client.m55669d(this.friendEnv.getGamAssemblyServiceUrl(), Void.class).m55672b().m55518f("guest").m55519g(issuedByXid).m55518f("friends").m55523m().m55516d().m55530t("Cache-Control", "no-cache, max-age=0").m55526p(str).m55521i();
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public boolean createBulkInviteRequest(List<? extends Friend> friendsToBeInvited) throws IOException {
        Intrinsics.checkNotNullParameter(friendsToBeInvited, "friendsToBeInvited");
        C22462m.m68668A(this.authManager.isUserAuthenticated(), Constants.MESSAGE_USER_NOT_LOGGED_IN, new Object[0]);
        C22462m.m68668A(!friendsToBeInvited.isEmpty(), "Empty List of Friends Passed", new Object[0]);
        C22462m.m68668A(friendsToBeInvited.size() <= 10, "Bulk InviteState Accept Limit Crossed!!", new Object[0]);
        CreateInvitations createInvitations = new CreateInvitations(null, 1, null);
        ArrayList arrayList = new ArrayList();
        for (Friend friend : friendsToBeInvited) {
            Invitation invitation = new Invitation(null, null, null, null, null, null, null, null, 255, null);
            invitation.setInvitationType(CreateInvitations.InvitationType.Convert.getValue());
            invitation.setAccessClassification("PLAN_VIEW_ALL");
            invitation.setGroupClassification("TRAVELLING_PARTY");
            invitation.setShareClassification(ImmutableList.m69035of("SHARE_MEDIA_NONE"));
            if (friend.isRegistered()) {
                invitation.setGuestIdType("swid");
                invitation.setGuestIdValue(friend.getSwid());
            } else if (friend.isManaged()) {
                invitation.setGuestIdType("guid");
                invitation.setGuestIdValue(friend.getGuid());
            }
            invitation.setManagedGuest(createInvitedManagedGuest(friend));
            invitation.setVerificationFactors(CollectionsKt.listOf(new VerificationFactor(VerificationFactor.TYPE_FRIENDS_FRIENDS, null, 2, null)));
            arrayList.add(invitation);
        }
        createInvitations.setInvitations(arrayList);
        return this.client.m55669d(this.friendEnv.getGamAssemblyServiceUrl(), JSONObject.class).m55672b().m55523m().m55515c().m55518f("guest").m55519g(this.xidProvider.getXid()).m55518f("sent-bulk-invitations").m55530t("Cache-Control", "no-cache, max-age=0").m55526p(GsonInstrumentation.toJson(new Gson(), createInvitations)).m55521i().m55684d() == 204;
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public Friend createManagedFriend(Friend newFriend) throws IOException, CloneNotSupportedException {
        List<String> listSplit;
        JSONObject jSONObjectOptJSONObject;
        Intrinsics.checkNotNullParameter(newFriend, "newFriend");
        C22462m.m68668A(this.authManager.isUserAuthenticated(), Constants.MESSAGE_USER_NOT_LOGGED_IN, new Object[0]);
        HttpApiClient.C13320c c13320cM55530t = this.client.m55669d(this.friendEnv.getGamAssemblyServiceUrl(), JSONObject.class).m55672b().m55518f("guest").m55518f("id;swid=" + URLUtils.urlEncode(this.authManager.getUserSwid())).m55518f("managed-guests").m55523m().m55516d().m55530t("Cache-Control", "no-cache, max-age=0");
        JSONObject jSONObject = newFriend.toJSONObject();
        JSONObject jSONObject2 = (JSONObject) c13320cM55530t.m55526p(jSONObject == null ? jSONObject.toString() : JSONObjectInstrumentation.toString(jSONObject)).m55535y(new InterfaceC13334f.b()).m55521i().m55683c();
        String str = null;
        try {
            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject(OTUXParamsKeys.OT_UX_LINKS);
            String strOptString = (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("self")) == null) ? null : jSONObjectOptJSONObject.optString(APIConstants.JsonKeys.HREF);
            if (strOptString != null && (listSplit = new Regex("guid=").split(strOptString, 0)) != null) {
                str = listSplit.get(1);
            }
        } catch (NullPointerException unused) {
        }
        newFriend.setGuid(str);
        return newFriend;
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public void deleteManagedFriend(String guid) throws IOException {
        Intrinsics.checkNotNullParameter(guid, "guid");
        C22462m.m68668A(this.authManager.isUserAuthenticated(), Constants.MESSAGE_USER_NOT_LOGGED_IN, new Object[0]);
        this.client.m55667b(this.friendEnv.getGamAssemblyServiceUrl(), Void.class).m55672b().m55518f(Constants.MANAGED_GUEST).m55518f("id;guid=" + guid).m55524n().m55516d().m55530t("Cache-Control", "no-cache, max-age=0").m55521i();
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public void deleteUnmanagedFriend(String xid) throws IOException {
        Intrinsics.checkNotNullParameter(xid, "xid");
        C22462m.m68668A(this.authManager.isUserAuthenticated(), Constants.MESSAGE_USER_NOT_LOGGED_IN, new Object[0]);
        this.client.m55667b(this.friendEnv.getGamAssemblyServiceUrl(), Void.class).m55672b().m55518f("guest").m55519g(this.xidProvider.getXid()).m55518f("friend").m55523m().m55519g(xid).m55516d().m55530t("Cache-Control", "no-cache, max-age=0").m55521i();
    }

    public final Pattern getPattern() {
        return this.pattern;
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public Profile getProfile() throws IOException {
        com.disney.wdpro.service.model.Avatar avatar;
        InterfaceC13334f.a aVar = new InterfaceC13334f.a();
        aVar.m55644a().registerTypeAdapter(ContactInfo.class, new ContactInfo.ContactInfoDeserializer());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/guest/id;swid=%s/profile", Arrays.copyOf(new Object[]{this.friendEnv.getGamAssemblyServiceUrl(), URLUtils.urlEncode(this.authManager.getUserSwid())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        Profile profile = (Profile) this.client.m55668c(str, Profile.class).m55672b().m55535y(aVar).m55521i().m55683c();
        UserMinimumProfile userMinimumProfile = (UserMinimumProfile) this.authManager.getUserData();
        if (userMinimumProfile != null && (avatar = userMinimumProfile.getAvatar()) != null) {
            profile.setAvatar(transformAvatar(avatar));
        }
        return profile;
    }

    public final boolean getQrCodeLive() {
        return this.qrCodeLive;
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public boolean inviteManagedGuest(Friend myManagedFriend, Friend theirManagedFriend) throws IOException {
        Intrinsics.checkNotNullParameter(myManagedFriend, "myManagedFriend");
        Intrinsics.checkNotNullParameter(theirManagedFriend, "theirManagedFriend");
        C22462m.m68668A(this.authManager.isUserAuthenticated(), Constants.MESSAGE_USER_NOT_LOGGED_IN, new Object[0]);
        GroupClassificationType groupClassification = myManagedFriend.getGroupClassification();
        Intrinsics.checkNotNull(groupClassification);
        String strName = groupClassification.name();
        AccessClassificationType accessClassification = myManagedFriend.getAccessClassification();
        Intrinsics.checkNotNull(accessClassification);
        String str = String.format(Constants.INVITE_MANAGED_GUEST_BODY, Arrays.copyOf(new Object[]{strName, accessClassification.name(), myManagedFriend.getGuid(), theirManagedFriend.getGuid(), myManagedFriend.getFirstName(), myManagedFriend.getLastName()}, 6));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        this.client.m55669d(this.friendEnv.getGamAssemblyServiceUrl(), Void.class).m55672b().m55518f("guest").m55519g(this.xidProvider.getXid()).m55518f(Constants.RESEND_INVITATION).m55523m().m55516d().m55530t("Cache-Control", "no-cache, max-age=0").m55526p(str).m55521i();
        return true;
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public Friend inviteRegisteredGuest(Friend friend) throws IOException {
        String str;
        Intrinsics.checkNotNullParameter(friend, "friend");
        C22462m.m68668A(this.authManager.isUserAuthenticated(), Constants.MESSAGE_USER_NOT_LOGGED_IN, new Object[0]);
        if (friend.getEmail() != null) {
            GroupClassificationType groupClassification = friend.getGroupClassification();
            Intrinsics.checkNotNull(groupClassification);
            String strName = groupClassification.name();
            AccessClassificationType accessClassification = friend.getAccessClassification();
            Intrinsics.checkNotNull(accessClassification);
            str = String.format(Constants.INVITE_REGISTERED_GUEST_BY_EMAIL_BODY, Arrays.copyOf(new Object[]{strName, accessClassification.name(), friend.getGuid(), friend.getEmail(), friend.getFirstName(), friend.getLastName()}, 6));
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        } else {
            GroupClassificationType groupClassification2 = friend.getGroupClassification();
            Intrinsics.checkNotNull(groupClassification2);
            String strName2 = groupClassification2.name();
            AccessClassificationType accessClassification2 = friend.getAccessClassification();
            Intrinsics.checkNotNull(accessClassification2);
            str = String.format(Constants.INVITE_REGISTERED_GUEST_BY_SWID_BODY, Arrays.copyOf(new Object[]{strName2, accessClassification2.name(), friend.getGuid(), friend.getSwid()}, 4));
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        }
        this.client.m55669d(this.friendEnv.getGamAssemblyServiceUrl(), Void.class).m55672b().m55518f("guest").m55519g(this.xidProvider.getXid()).m55518f(Constants.RESEND_INVITATION).m55523m().m55516d().m55530t("Cache-Control", "no-cache, max-age=0").m55526p(str).m55521i();
        return friend;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.disney.wdpro.midichlorian.CacheContextModifier
    public FriendApiClient noCache() {
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.disney.wdpro.midichlorian.CacheContextModifier
    public FriendApiClient preload() {
        return null;
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public void rejectInvite(String invitationId) throws IOException {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        C22462m.m68668A(this.authManager.isUserAuthenticated(), Constants.MESSAGE_USER_NOT_LOGGED_IN, new Object[0]);
        this.client.m55669d(this.friendEnv.getGamAssemblyServiceUrl(), Void.class).m55672b().m55518f("guest").m55519g(this.xidProvider.getXid()).m55518f(Constants.RECEIVED_INVITATION).m55519g(invitationId).m55523m().m55516d().m55530t("Cache-Control", "no-cache, max-age=0").m55526p(Constants.DECLINE_INVITE_REQUEST_BODY).m55521i();
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public void resendInvite(String invitationId) throws IOException {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        HttpApiClient.C13320c c13320cM55530t = this.client.m55669d(this.friendEnv.getGamAssemblyServiceUrl(), Void.class).m55672b().m55518f("guest").m55519g(this.xidProvider.getXid()).m55518f(Constants.RESEND_INVITATION).m55523m().m55516d().m55530t("Cache-Control", "no-cache, max-age=0");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Constants.RESEND_INVITATION_REQUEST_BODY, Arrays.copyOf(new Object[]{invitationId}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        c13320cM55530t.m55526p(str).m55521i();
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public FriendEntries retrieveFriends() throws IOException {
        return retrieveFriends(null);
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public FriendsByPlans retrieveFriendsByPlans() throws IOException {
        return retrieveFriendsByPlans(null);
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public FriendIdentifierContainer retrieveFriendsIdentifiers(String swid) throws IOException {
        Intrinsics.checkNotNullParameter(swid, "swid");
        Object objM55683c = this.client.m55668c(this.friendEnv.getGamAssemblyServiceUrl(), FriendIdentifierContainer.class).m55672b().m55519g("friends").m55531u("guest-id-type", "swid").m55531u("guest-id-value", swid).m55531u("group-classification-code", C22456g.m68633k(",").m68638g(GroupClassificationType.FRIENDS, GroupClassificationType.TERTIARY, GroupClassificationType.TRAVELLING_PARTY)).m55531u(com.disney.wdpro.service.utils.Constants.GUEST_LOCATORS, "xid").m55531u(APIConstants.UrlParams.IGNORE_MISSING_LINKS, "true").m55531u("item-limit", Constants.LIMIT_ITEM_VALUE).m55523m().m55516d().m55530t("Cache-Control", "no-cache, max-age=0").m55521i().m55683c();
        Intrinsics.checkNotNullExpressionValue(objM55683c, "client.get(friendEnv.gam…\n                .payload");
        return (FriendIdentifierContainer) objM55683c;
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public List<Invite> retrievePendingReceivedInvites() throws IOException {
        return retrieveReceiveInvitationWithURLFormat(Constants.RECEIVE_INVITATIONS_PENDING);
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public String retrieveShareSetting() throws IOException {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject;
        C22462m.m68668A(this.authManager.isUserAuthenticated(), Constants.MESSAGE_USER_NOT_LOGGED_IN, new Object[0]);
        JSONObject jSONObject = (JSONObject) this.client.m55668c(this.friendEnv.getGamAssemblyServiceUrl(), JSONObject.class).m55672b().m55518f("guest").m55519g("id;swid=" + this.authManager.getUserSwid()).m55518f(Constants.INDICATOR_SET).m55531u(Constants.KEYS, Constants.SHARE_FNF_LIST).m55523m().m55516d().m55530t("Cache-Control", "no-cache, max-age=0").m55535y(new InterfaceC13334f.b()).m55521i().m55683c();
        String strOptString = null;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("guestIndicators")) != null && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null) {
            strOptString = jSONObjectOptJSONObject.optString(Constants.SHARE_FNF_LIST, null);
        }
        return strOptString == null ? "" : strOptString;
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public SuggestedFriendEntries retrieveSuggestedFriendsList(String swid) throws Exception {
        Intrinsics.checkNotNullParameter(swid, "swid");
        Object objM55683c = this.client.m55668c(this.friendEnv.getGamAssemblyServiceUrl(), SuggestedFriendEntries.class).m55672b().m55518f(VerificationFactor.TYPE_FRIENDS_FRIENDS).m55523m().m55516d().m55531u("guest-id-type", "swid").m55531u("guest-id-value", swid).m55531u(Constants.START_ITEM_PARAM, "0").m55531u("item-limit", Constants.LIMIT_ITEM_VALUE).m55530t("Cache-Control", "no-cache, max-age=0").m55521i().m55683c();
        Intrinsics.checkNotNullExpressionValue(objM55683c, "response.payload");
        return setAvatarsOnSuggestedFriends((SuggestedFriendEntries) objM55683c);
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public void revokeInvite(String invitationId) throws IOException {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        this.client.m55669d(this.friendEnv.getGamAssemblyServiceUrl(), Void.class).m55672b().m55530t("Cache-Control", "no-cache, max-age=0").m55518f("guest").m55519g(this.xidProvider.getXid()).m55518f(Constants.REVOKE_INVITATION).m55518f(invitationId).m55526p(Constants.REVOKE_INVITATION_REQUEST_BODY).m55523m().m55516d().m55521i();
    }

    public final void setQrCodeLive(boolean z10) {
        this.qrCodeLive = z10;
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public Friend updateManagedFriend(Friend friend) throws IOException {
        Intrinsics.checkNotNullParameter(friend, "friend");
        C22462m.m68668A(this.authManager.isUserAuthenticated(), Constants.MESSAGE_USER_NOT_LOGGED_IN, new Object[0]);
        HttpApiClient.C13320c c13320cM55530t = this.client.m55670e(this.friendEnv.getGamAssemblyServiceUrl(), Void.class).m55672b().m55518f(Constants.MANAGED_GUEST).m55518f("id;guid=" + friend.getGuid()).m55523m().m55516d().m55530t("Cache-Control", "no-cache, max-age=0");
        JSONObject jSONObject = friend.toJSONObject();
        c13320cM55530t.m55526p(jSONObject == null ? jSONObject.toString() : JSONObjectInstrumentation.toString(jSONObject)).m55521i();
        return friend;
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public String updateShareSetting(boolean shareFriendsWithOthers) throws IOException {
        C22462m.m68668A(this.authManager.isUserAuthenticated(), Constants.MESSAGE_USER_NOT_LOGGED_IN, new Object[0]);
        String str = shareFriendsWithOthers ? "BLOCK_NONE" : "BLOCK_ALL";
        HttpApiClient.C13320c c13320cM55530t = this.client.m55669d(this.friendEnv.getGamAssemblyServiceUrl(), Void.class).m55672b().m55518f("guest").m55519g(this.xidProvider.getXid()).m55518f(Constants.INDICATOR_SET).m55523m().m55516d().m55530t("Cache-Control", "no-cache, max-age=0");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("{\"%s\":\"%s\"}", Arrays.copyOf(new Object[]{Constants.SHARE_FNF_LIST, str}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        c13320cM55530t.m55526p(str2).m55521i();
        return str;
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public Friend updateUnmanagedFriend(Friend friend) throws JSONException, IOException {
        String strName;
        Intrinsics.checkNotNullParameter(friend, "friend");
        JSONObject jSONObject = new JSONObject();
        GroupClassificationType groupClassification = friend.getGroupClassification();
        JSONArray jSONArrayPut = null;
        jSONObject.put("group-classification", groupClassification != null ? groupClassification.name() : null);
        AccessClassificationType accessClassification = friend.getAccessClassification();
        jSONObject.put("access-classification", accessClassification != null ? accessClassification.name() : null);
        SharePhotoPassClassificationType photoPassClassificationType = friend.getPhotoPassClassificationType();
        if (photoPassClassificationType != null && (strName = photoPassClassificationType.name()) != null) {
            jSONArrayPut = new JSONArray().put(strName);
        }
        jSONObject.put("share-classification", jSONArrayPut);
        String string = JSONObjectInstrumentation.toString(jSONObject);
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject().apply {\n   …) })\n        }.toString()");
        this.client.m55670e(this.friendEnv.getGamAssemblyServiceUrl(), Void.class).m55672b().m55518f("friend").m55519g(friend.getXid()).m55523m().m55516d().m55530t("Cache-Control", "no-cache, max-age=0").m55526p(string).m55521i();
        return friend;
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public FriendEntries retrieveFriends(List<? extends GroupClassificationType> groupClassificationTypes) throws IOException {
        String str;
        C22462m.m68668A(this.authManager.isUserAuthenticated(), Constants.MESSAGE_USER_NOT_LOGGED_IN, new Object[0]);
        List<? extends GroupClassificationType> list = groupClassificationTypes;
        if (list == null || list.isEmpty()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format(Constants.RETRIEVE_FRIENDS_WITHOUT_GROUP, Arrays.copyOf(new Object[]{this.friendEnv.getGamAssemblyServiceUrl(), URLUtils.urlEncode(this.authManager.getUserSwid())}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        } else {
            String strM68637f = C22456g.m68633k(",").mo68641l().m68637f(groupClassificationTypes);
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format(Constants.RETRIEVE_FRIENDS, Arrays.copyOf(new Object[]{this.friendEnv.getGamAssemblyServiceUrl(), URLUtils.urlEncode(this.authManager.getUserSwid()), URLUtils.urlEncode(strM68637f)}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        }
        FriendEntriesDTO response = (FriendEntriesDTO) this.client.m55668c(this.friendEnv.getApimExpandServiceUrl(), FriendEntriesDTO.class).m55672b().m55518f(APIConstants.UrlParams.EXPAND).m55531u("url", str).m55531u(APIConstants.UrlParams.EXPAND, "friends(.invite),friends(.(self,parentGuestProfile,wdproAvatar))").m55531u(APIConstants.UrlParams.FIELDS, Constants.FRIENDS_FIELDS_PARAM).m55531u(APIConstants.UrlParams.IGNORE_MISSING_LINKS, "true").m55530t("swid", this.authManager.getUserSwid()).m55530t("Cache-Control", "no-cache, max-age=0").m55523m().m55516d().m55521i().m55683c();
        FriendEntriesMapper friendEntriesMapper = new FriendEntriesMapper(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullExpressionValue(response, "response");
        return cleanUpFriendsResponseAndSetAvatars(friendEntriesMapper.map(response));
    }

    @Override // com.disney.wdpro.friendsservices.business.FriendApiClient
    public FriendsByPlans retrieveFriendsByPlans(AgeBand ageBand) throws IOException {
        FriendsByPlans friendsByPlans;
        String gamFriendsByPlansServiceUrl;
        C22462m.m68668A(this.authManager.isUserAuthenticated(), Constants.MESSAGE_USER_NOT_LOGGED_IN, new Object[0]);
        String userSwid = this.authManager.getUserSwid();
        int i10 = 1;
        FriendsByPlans.FriendsList friendsList = null;
        byte b10 = 0;
        if (userSwid != null) {
            InterfaceC13334f.a aVar = new InterfaceC13334f.a();
            GsonBuilder gsonBuilderM55644a = aVar.m55644a();
            gsonBuilderM55644a.registerTypeAdapter(Date.class, new DateDeserializer(this.time));
            gsonBuilderM55644a.registerTypeAdapter(FriendConnectionStatus.class, new FriendConnectionStatus.FriendConnectionStatusDeserializer(null, 1, null));
            gsonBuilderM55644a.registerTypeAdapter(SharePhotoPassClassificationType.class, new SharePhotoPassClassificationType.SharePhotoPassClassificationTypeDeserializer());
            gsonBuilderM55644a.registerTypeAdapter(GroupClassificationType.class, new GroupClassificationType.GroupClassificationTypeDeserializer());
            gsonBuilderM55644a.registerTypeAdapter(AccessClassificationType.class, new AccessClassificationType.AccessClassificationTypeDeserializer());
            if (this.friendEnv.getFriendsByPlansAPIURLVersion() == 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                gamFriendsByPlansServiceUrl = String.format(this.friendEnv.getFriendsByPlansServiceUrl(), Arrays.copyOf(new Object[]{this.authEnv.getAuthzClientId()}, 1));
                Intrinsics.checkNotNullExpressionValue(gamFriendsByPlansServiceUrl, "format(format, *args)");
            } else {
                gamFriendsByPlansServiceUrl = this.friendEnv.getGamFriendsByPlansServiceUrl();
            }
            HttpApiClient.C13320c c13320cM55523m = this.client.m55668c(gamFriendsByPlansServiceUrl, FriendsByPlans.class).m55672b().m55518f(Constants.FRIENDS_BY_PLANS).m55530t("swid", userSwid).m55530t("Cache-Control", "no-cache, max-age=0").m55531u("guest-id-type", "swid").m55531u("guest-id-value", userSwid).m55535y(aVar).m55516d().m55523m();
            if (this.qrCodeLive) {
                c13320cM55523m.m55531u(Constants.QR_CODE_LIVE_PARAM, "true");
            }
            if (ageBand != null) {
                c13320cM55523m.m55531u(AGE_BAND_PARAM, ageBand.toString());
            }
            friendsByPlans = (FriendsByPlans) c13320cM55523m.m55521i().m55683c();
        } else {
            friendsByPlans = null;
        }
        if (friendsByPlans == null) {
            friendsByPlans = new FriendsByPlans(friendsList, i10, b10 == true ? 1 : 0);
        }
        return setAvatarsOnFriendsByPlans(friendsByPlans);
    }
}