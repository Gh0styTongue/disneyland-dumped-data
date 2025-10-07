package com.disney.wdpro.friendsservices.business;

import com.disney.wdpro.bookingservices.checkout.CheckoutConstants;
import com.disney.wdpro.friendsservices.model.Friend;
import com.disney.wdpro.friendsservices.model.FriendEntries;
import com.disney.wdpro.friendsservices.model.FriendIdentifierContainer;
import com.disney.wdpro.friendsservices.model.FriendsByPlans;
import com.disney.wdpro.friendsservices.model.GroupClassificationType;
import com.disney.wdpro.friendsservices.model.Invite;
import com.disney.wdpro.friendsservices.model.Profile;
import com.disney.wdpro.friendsservices.model.SuggestedFriendEntries;
import com.disney.wdpro.midichlorian.CacheContextModifier;
import com.disney.wdpro.midichlorian.annotations.CacheEvict;
import com.disney.wdpro.midichlorian.annotations.Cacheable;
import com.disney.wdpro.service.model.AgeBand;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00012J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H'J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0005H'J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H'J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H'J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH'J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH'J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H'J\b\u0010\u001d\u001a\u00020\u001eH'J\u0018\u0010\u001d\u001a\u00020\u001e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\fH'J\b\u0010!\u001a\u00020\"H'J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H'J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005H'J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\fH'J\b\u0010*\u001a\u00020\u0005H'J\u0010\u0010+\u001a\u00020,2\u0006\u0010'\u001a\u00020\u0005H'J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0010\u0010.\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH'J\u0010\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\nH'J\u0010\u00101\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH'¨\u00063"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/business/FriendApiClient;", "Lcom/disney/wdpro/midichlorian/CacheContextModifier;", "acceptInvite", "", "issuedByXid", "", "invitationId", "accessClassificationCode", "groupClassificationCode", "createBulkInviteRequest", "", "friendsToBeInvited", "", "Lcom/disney/wdpro/friendsservices/model/Friend;", "createManagedFriend", "newFriend", "deleteManagedFriend", "guid", "deleteUnmanagedFriend", "xid", "getProfile", "Lcom/disney/wdpro/friendsservices/model/Profile;", "inviteManagedGuest", "myManagedFriend", "theirManagedFriend", "inviteRegisteredGuest", "friend", "rejectInvite", "resendInvite", "retrieveFriends", "Lcom/disney/wdpro/friendsservices/model/FriendEntries;", "groupClassificationTypes", "Lcom/disney/wdpro/friendsservices/model/GroupClassificationType;", "retrieveFriendsByPlans", "Lcom/disney/wdpro/friendsservices/model/FriendsByPlans;", FriendApiClientImpl.AGE_BAND_PARAM, "Lcom/disney/wdpro/service/model/AgeBand;", "retrieveFriendsIdentifiers", "Lcom/disney/wdpro/friendsservices/model/FriendIdentifierContainer;", "swid", "retrievePendingReceivedInvites", "Lcom/disney/wdpro/friendsservices/model/Invite;", "retrieveShareSetting", "retrieveSuggestedFriendsList", "Lcom/disney/wdpro/friendsservices/model/SuggestedFriendEntries;", "revokeInvite", "updateManagedFriend", "updateShareSetting", "shareFriendsWithOthers", "updateUnmanagedFriend", "Companion", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public interface FriendApiClient extends CacheContextModifier<FriendApiClient> {
    public static final String BLOCK_ALL = "BLOCK_ALL";
    public static final String BLOCK_NONE = "BLOCK_NONE";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String FRIEND_REGION = "FriendApiClient";

    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/business/FriendApiClient$Companion;", "", "()V", "BLOCK_ALL", "", "BLOCK_NONE", "FRIEND_REGION", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String BLOCK_ALL = "BLOCK_ALL";
        public static final String BLOCK_NONE = "BLOCK_NONE";
        public static final String FRIEND_REGION = "FriendApiClient";

        private Companion() {
        }
    }

    @CacheEvict
    void acceptInvite(String issuedByXid, String invitationId, String accessClassificationCode, String groupClassificationCode) throws IOException;

    @CacheEvict
    boolean createBulkInviteRequest(List<? extends Friend> friendsToBeInvited) throws IOException;

    @CacheEvict(regions = {CheckoutConstants.COMPONENT_FASTPASS, "FriendApiClient"})
    Friend createManagedFriend(Friend newFriend) throws IOException, CloneNotSupportedException;

    @CacheEvict
    void deleteManagedFriend(String guid) throws IOException;

    @CacheEvict
    void deleteUnmanagedFriend(String xid) throws IOException;

    @Cacheable
    Profile getProfile() throws IOException;

    @CacheEvict
    boolean inviteManagedGuest(Friend myManagedFriend, Friend theirManagedFriend) throws IOException;

    @CacheEvict
    Friend inviteRegisteredGuest(Friend friend) throws IOException;

    @CacheEvict
    void rejectInvite(String invitationId) throws IOException;

    @CacheEvict
    void resendInvite(String invitationId) throws IOException;

    @Cacheable
    FriendEntries retrieveFriends() throws IOException;

    @Cacheable
    FriendEntries retrieveFriends(List<? extends GroupClassificationType> groupClassificationTypes) throws IOException;

    @Cacheable
    FriendsByPlans retrieveFriendsByPlans() throws IOException;

    @Cacheable
    FriendsByPlans retrieveFriendsByPlans(AgeBand ageBand) throws IOException;

    @Cacheable
    FriendIdentifierContainer retrieveFriendsIdentifiers(String swid) throws IOException;

    @Cacheable
    List<Invite> retrievePendingReceivedInvites() throws IOException;

    @Cacheable
    String retrieveShareSetting() throws IOException;

    @Cacheable
    SuggestedFriendEntries retrieveSuggestedFriendsList(String swid) throws Exception;

    @CacheEvict
    void revokeInvite(String invitationId) throws IOException;

    @CacheEvict
    Friend updateManagedFriend(Friend friend) throws IOException;

    @CacheEvict
    String updateShareSetting(boolean shareFriendsWithOthers) throws IOException;

    @CacheEvict
    Friend updateUnmanagedFriend(Friend friend) throws IOException;
}