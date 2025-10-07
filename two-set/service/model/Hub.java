package com.disney.wdpro.virtualqueue.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.google.common.collect.Lists;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006 "}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/model/Hub;", "Landroid/os/Parcelable;", "id", "", "name", "tabContentId", VirtualQueueConstants.CONTENT_ID, "externalDefinitionId", "categoryContentId", "description", "disclaimer", "queues", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCategoryContentId", "()Ljava/lang/String;", "getContentId", "getDescription", "getDisclaimer", "getExternalDefinitionId", "getId", "getName", "getQueues", "()Ljava/util/List;", "getTabContentId", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class Hub implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Hub> CREATOR = new Creator();
    private final String categoryContentId;
    private final String contentId;
    private final String description;
    private final String disclaimer;
    private final String externalDefinitionId;
    private final String id;
    private final String name;
    private final List<String> queues;
    private final String tabContentId;

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Creator implements Parcelable.Creator<Hub> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Hub createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Hub(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Hub[] newArray(int i10) {
            return new Hub[i10];
        }
    }

    public Hub() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getCategoryContentId() {
        return this.categoryContentId;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getExternalDefinitionId() {
        return this.externalDefinitionId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getQueues() {
        return this.queues;
    }

    public final String getTabContentId() {
        return this.tabContentId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.tabContentId);
        parcel.writeString(this.contentId);
        parcel.writeString(this.externalDefinitionId);
        parcel.writeString(this.categoryContentId);
        parcel.writeString(this.description);
        parcel.writeString(this.disclaimer);
        parcel.writeStringList(this.queues);
    }

    public Hub(String id2, String name, String tabContentId, String str, String externalDefinitionId, String str2, String str3, String str4, List<String> queues) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tabContentId, "tabContentId");
        Intrinsics.checkNotNullParameter(externalDefinitionId, "externalDefinitionId");
        Intrinsics.checkNotNullParameter(queues, "queues");
        this.id = id2;
        this.name = name;
        this.tabContentId = tabContentId;
        this.contentId = str;
        this.externalDefinitionId = externalDefinitionId;
        this.categoryContentId = str2;
        this.description = str3;
        this.disclaimer = str4;
        this.queues = queues;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Hub(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i10 & 1) != 0 ? "" : str;
        str2 = (i10 & 2) != 0 ? "" : str2;
        str3 = (i10 & 4) != 0 ? "" : str3;
        str4 = (i10 & 8) != 0 ? null : str4;
        str5 = (i10 & 16) != 0 ? "" : str5;
        str6 = (i10 & 32) != 0 ? null : str6;
        str7 = (i10 & 64) != 0 ? null : str7;
        str8 = (i10 & 128) != 0 ? null : str8;
        if ((i10 & 256) != 0) {
            list = Lists.m69272m();
            Intrinsics.checkNotNullExpressionValue(list, "newLinkedList()");
        }
        this(str, str2, str3, str4, str5, str6, str7, str8, list);
    }
}