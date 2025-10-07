package com.disney.wdpro.friendsservices.business;

import com.disney.wdpro.facility.model.Avatar;
import com.disney.wdpro.facility.model.AvatarEntries;
import com.disney.wdpro.friendsservices.model.Profile;
import com.disney.wdpro.service.business.APIConstants;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000fH&J\b\u0010\u0013\u001a\u00020\u0003H&¨\u0006\u0014"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/business/AvatarApiClient;", "", "getAvatarsFromService", "Lcom/disney/wdpro/facility/model/AvatarEntries;", "loadAvatars", "", "matchAvatarsFromDB", "", "Lcom/disney/wdpro/friendsservices/model/Profile;", "guests", "retrieveAvatarByIdAndMediaKeySync", "Lcom/disney/wdpro/facility/model/Avatar;", APIConstants.JsonKeys.AVATAR_ID, "", "avatarMediaKey", "Lcom/disney/wdpro/facility/model/Avatar$AvatarMedia;", "retrieveAvatarByIdSync", "retrieveAvatarsByMediaSync", "avatarMedia", "retrieveAvatarsSync", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public interface AvatarApiClient {
    AvatarEntries getAvatarsFromService() throws IOException;

    void loadAvatars() throws IOException;

    List<Profile> matchAvatarsFromDB(List<? extends Profile> guests);

    Avatar retrieveAvatarByIdAndMediaKeySync(String avatarId, Avatar.AvatarMedia avatarMediaKey);

    Avatar retrieveAvatarByIdSync(String avatarId);

    AvatarEntries retrieveAvatarsByMediaSync(Avatar.AvatarMedia avatarMedia) throws IOException;

    AvatarEntries retrieveAvatarsSync() throws Exception;
}