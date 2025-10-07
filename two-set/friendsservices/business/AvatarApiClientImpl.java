package com.disney.wdpro.friendsservices.business;

import com.disney.wdpro.facility.model.Avatar;
import com.disney.wdpro.facility.model.AvatarEntries;
import com.disney.wdpro.facility.model.MobileThumbnailUrl;
import com.disney.wdpro.friendsservices.model.Profile;
import com.disney.wdpro.service.business.APIConstants;
import com.disney.wdpro.service.business.UserApiClient;
import com.disney.wdpro.service.model.Avatar;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1034wa.C32862a;

@Metadata(m92037d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ'\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006#"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/business/AvatarApiClientImpl;", "Lcom/disney/wdpro/friendsservices/business/AvatarApiClient;", "Lwa/a;", "avatarDAO", "Lcom/disney/wdpro/service/business/UserApiClient;", "userApiClient", "<init>", "(Lwa/a;Lcom/disney/wdpro/service/business/UserApiClient;)V", "Lcom/disney/wdpro/facility/model/AvatarEntries;", "getAvatarsFromService", "()Lcom/disney/wdpro/facility/model/AvatarEntries;", "Lcom/disney/wdpro/facility/model/Avatar$AvatarMedia;", "avatarMedia", "retrieveAvatarsByMediaSync", "(Lcom/disney/wdpro/facility/model/Avatar$AvatarMedia;)Lcom/disney/wdpro/facility/model/AvatarEntries;", "retrieveAvatarsSync", "", APIConstants.JsonKeys.AVATAR_ID, "avatarMediaKey", "Lcom/disney/wdpro/facility/model/Avatar;", "kotlin.jvm.PlatformType", "retrieveAvatarByIdAndMediaKeySync", "(Ljava/lang/String;Lcom/disney/wdpro/facility/model/Avatar$AvatarMedia;)Lcom/disney/wdpro/facility/model/Avatar;", "retrieveAvatarByIdSync", "(Ljava/lang/String;)Lcom/disney/wdpro/facility/model/Avatar;", "", "Lcom/disney/wdpro/friendsservices/model/Profile;", "guests", "matchAvatarsFromDB", "(Ljava/util/List;)Ljava/util/List;", "", "loadAvatars", "()V", "Lwa/a;", "Lcom/disney/wdpro/service/business/UserApiClient;", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nAvatarApiClientImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarApiClientImpl.kt\ncom/disney/wdpro/friendsservices/business/AvatarApiClientImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1549#2:90\n1620#2,3:91\n1855#2,2:94\n*S KotlinDebug\n*F\n+ 1 AvatarApiClientImpl.kt\ncom/disney/wdpro/friendsservices/business/AvatarApiClientImpl\n*L\n29#1:90\n29#1:91,3\n70#1:94,2\n*E\n"})
/* loaded from: classes28.dex */
public final class AvatarApiClientImpl implements AvatarApiClient {
    private final C32862a avatarDAO;
    private final UserApiClient userApiClient;

    @Inject
    public AvatarApiClientImpl(C32862a avatarDAO, UserApiClient userApiClient) {
        Intrinsics.checkNotNullParameter(avatarDAO, "avatarDAO");
        Intrinsics.checkNotNullParameter(userApiClient, "userApiClient");
        this.avatarDAO = avatarDAO;
        this.userApiClient = userApiClient;
    }

    @Override // com.disney.wdpro.friendsservices.business.AvatarApiClient
    public AvatarEntries getAvatarsFromService() throws IOException {
        List<Avatar> allAvatars = this.userApiClient.getAllAvatars("80007798;entityType=destination");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(allAvatars, 10));
        for (Avatar avatar : allAvatars) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Avatar.AvatarMedia avatarMedia = Avatar.AvatarMedia.AVATAR_MOBILE_SQUARE;
            String key = avatarMedia.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "AVATAR_MOBILE_SQUARE.key");
            linkedHashMap.put(key, new MobileThumbnailUrl(avatar.getImageAvatar(), avatarMedia.getKey(), ""));
            arrayList.add(new com.disney.wdpro.facility.model.Avatar(avatar.getId(), avatar.getName(), linkedHashMap));
        }
        return new AvatarEntries(arrayList);
    }

    @Override // com.disney.wdpro.friendsservices.business.AvatarApiClient
    public void loadAvatars() throws IOException {
        this.avatarDAO.m100395g(getAvatarsFromService().filterDefaultEmptyAvatars());
    }

    @Override // com.disney.wdpro.friendsservices.business.AvatarApiClient
    public List<Profile> matchAvatarsFromDB(List<? extends Profile> guests) {
        String id2;
        Intrinsics.checkNotNullParameter(guests, "guests");
        List<? extends Profile> list = guests;
        for (Profile profile : list) {
            com.disney.wdpro.facility.model.Avatar avatar = profile.getAvatar();
            if (avatar != null && (id2 = avatar.getId()) != null) {
                Intrinsics.checkNotNullExpressionValue(id2, "id");
                com.disney.wdpro.facility.model.Avatar avatarRetrieveAvatarByIdAndMediaKeySync = retrieveAvatarByIdAndMediaKeySync(id2, Avatar.AvatarMedia.AVATAR_MOBILE_SQUARE);
                if (avatarRetrieveAvatarByIdAndMediaKeySync != null) {
                    Intrinsics.checkNotNullExpressionValue(avatarRetrieveAvatarByIdAndMediaKeySync, "retrieveAvatarByIdAndMed…Id, AVATAR_MOBILE_SQUARE)");
                    profile.setAvatar(avatarRetrieveAvatarByIdAndMediaKeySync);
                }
            }
        }
        ArrayList arrayListM69269j = Lists.m69269j(list);
        Intrinsics.checkNotNullExpressionValue(arrayListM69269j, "newArrayList(guests)");
        return arrayListM69269j;
    }

    @Override // com.disney.wdpro.friendsservices.business.AvatarApiClient
    public com.disney.wdpro.facility.model.Avatar retrieveAvatarByIdAndMediaKeySync(String avatarId, Avatar.AvatarMedia avatarMediaKey) {
        Intrinsics.checkNotNullParameter(avatarId, "avatarId");
        Intrinsics.checkNotNullParameter(avatarMediaKey, "avatarMediaKey");
        return this.avatarDAO.m100394d(avatarId, avatarMediaKey);
    }

    @Override // com.disney.wdpro.friendsservices.business.AvatarApiClient
    public com.disney.wdpro.facility.model.Avatar retrieveAvatarByIdSync(String avatarId) {
        Intrinsics.checkNotNullParameter(avatarId, "avatarId");
        return this.avatarDAO.m100393c(avatarId);
    }

    @Override // com.disney.wdpro.friendsservices.business.AvatarApiClient
    public AvatarEntries retrieveAvatarsByMediaSync(Avatar.AvatarMedia avatarMedia) throws IOException {
        Intrinsics.checkNotNullParameter(avatarMedia, "avatarMedia");
        AvatarEntries avatarEntries = this.avatarDAO.m100392b(avatarMedia);
        List<com.disney.wdpro.facility.model.Avatar> entries = avatarEntries != null ? avatarEntries.getEntries() : null;
        if (entries == null || entries.isEmpty()) {
            avatarEntries = getAvatarsFromService();
            this.avatarDAO.m100395g(avatarEntries.getEntries());
        }
        Intrinsics.checkNotNullExpressionValue(avatarEntries, "avatarEntries");
        return avatarEntries;
    }

    @Override // com.disney.wdpro.friendsservices.business.AvatarApiClient
    public AvatarEntries retrieveAvatarsSync() throws Exception {
        AvatarEntries avatarEntries = this.avatarDAO.m100391a();
        List<com.disney.wdpro.facility.model.Avatar> entries = avatarEntries != null ? avatarEntries.getEntries() : null;
        if (entries == null || entries.isEmpty()) {
            avatarEntries = getAvatarsFromService();
            this.avatarDAO.m100395g(avatarEntries.getEntries());
        }
        Intrinsics.checkNotNullExpressionValue(avatarEntries, "avatarEntries");
        return avatarEntries;
    }
}