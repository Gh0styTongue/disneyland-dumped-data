package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.service.business.APIConstants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/SuggestedFriendEntries;", "Ljava/io/Serializable;", APIConstants.JsonKeys.ENTRIES, "", "Lcom/disney/wdpro/friendsservices/model/SuggestedFriend;", "(Ljava/util/List;)V", "getEntries", "()Ljava/util/List;", "setEntries", "isEmpty", "", "()Z", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "", "hashCode", "", "toString", "", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class SuggestedFriendEntries implements Serializable {
    private List<SuggestedFriend> entries;

    public SuggestedFriendEntries() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuggestedFriendEntries copy$default(SuggestedFriendEntries suggestedFriendEntries, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = suggestedFriendEntries.entries;
        }
        return suggestedFriendEntries.copy(list);
    }

    public final List<SuggestedFriend> component1() {
        return this.entries;
    }

    public final SuggestedFriendEntries copy(List<SuggestedFriend> entries) {
        return new SuggestedFriendEntries(entries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SuggestedFriendEntries) && Intrinsics.areEqual(this.entries, ((SuggestedFriendEntries) other).entries);
    }

    public final List<SuggestedFriend> getEntries() {
        return this.entries;
    }

    public int hashCode() {
        List<SuggestedFriend> list = this.entries;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final boolean isEmpty() {
        List<SuggestedFriend> list = this.entries;
        return list == null || list.isEmpty();
    }

    public final void setEntries(List<SuggestedFriend> list) {
        this.entries = list;
    }

    public String toString() {
        return "SuggestedFriendEntries(entries=" + this.entries + ")";
    }

    public SuggestedFriendEntries(List<SuggestedFriend> list) {
        this.entries = list;
    }

    public /* synthetic */ SuggestedFriendEntries(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}