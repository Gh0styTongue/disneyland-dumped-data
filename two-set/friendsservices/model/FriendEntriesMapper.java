package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.friendsservices.model.dto.FriendDTO;
import com.disney.wdpro.friendsservices.model.dto.FriendEntriesDTO;
import com.disney.wdpro.friendsservices.utils.BaseMapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/FriendEntriesMapper;", "Lcom/disney/wdpro/friendsservices/utils/BaseMapper;", "Lcom/disney/wdpro/friendsservices/model/dto/FriendEntriesDTO;", "Lcom/disney/wdpro/friendsservices/model/FriendEntries;", "friendMapper", "Lcom/disney/wdpro/friendsservices/model/FriendMapper;", "(Lcom/disney/wdpro/friendsservices/model/FriendMapper;)V", "map", "friendEntriesDTO", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nFriendEntriesMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendEntriesMapper.kt\ncom/disney/wdpro/friendsservices/model/FriendEntriesMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n1855#2,2:22\n*S KotlinDebug\n*F\n+ 1 FriendEntriesMapper.kt\ncom/disney/wdpro/friendsservices/model/FriendEntriesMapper\n*L\n15#1:22,2\n*E\n"})
/* loaded from: classes28.dex */
public final class FriendEntriesMapper implements BaseMapper<FriendEntriesDTO, FriendEntries> {
    private final FriendMapper friendMapper;

    public FriendEntriesMapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public FriendEntriesMapper(FriendMapper friendMapper) {
        Intrinsics.checkNotNullParameter(friendMapper, "friendMapper");
        this.friendMapper = friendMapper;
    }

    @Override // com.disney.wdpro.friendsservices.utils.BaseMapper
    public FriendEntries map(FriendEntriesDTO friendEntriesDTO) {
        Intrinsics.checkNotNullParameter(friendEntriesDTO, "friendEntriesDTO");
        ArrayList arrayList = new ArrayList();
        List<FriendDTO> friends = friendEntriesDTO.getFriends();
        if (friends != null) {
            Iterator<T> it = friends.iterator();
            while (it.hasNext()) {
                arrayList.add(this.friendMapper.map((FriendDTO) it.next()));
            }
        }
        return new FriendEntries(arrayList);
    }

    public /* synthetic */ FriendEntriesMapper(FriendMapper friendMapper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new FriendMapper() : friendMapper);
    }
}