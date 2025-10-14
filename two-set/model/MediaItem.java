package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.photopasslib.analytics.AnalyticsTrackActions;
import com.disney.wdpro.photopasslib.p419ui.util.PhotoPassNewRelic;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J«\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u00108\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006="}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/MediaItem;", "", PhotoPassNewRelic.DownloadMetrics.MEDIA_ID, "", PhotoPassNewRelic.DownloadMetrics.GUEST_MEDIA_ID, "mediaCategory", "mediaType", PhotoPassNewRelic.DownloadMetrics.MIME_TYPE, "captureDate", "Ljava/util/Date;", "expirationDate", "guestEntitledToMedia", "", AnalyticsTrackActions.SUBJECTS, "", "mediaThumb", "Lcom/disney/wdpro/photopass/services/model/MediaData;", "mediaMedium", "mediaBase", "artCardThumb", "artCardMedium", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLjava/util/List;Lcom/disney/wdpro/photopass/services/model/MediaData;Lcom/disney/wdpro/photopass/services/model/MediaData;Lcom/disney/wdpro/photopass/services/model/MediaData;Lcom/disney/wdpro/photopass/services/model/MediaData;Lcom/disney/wdpro/photopass/services/model/MediaData;)V", "getArtCardMedium", "()Lcom/disney/wdpro/photopass/services/model/MediaData;", "getArtCardThumb", "getCaptureDate", "()Ljava/util/Date;", "getExpirationDate", "getGuestEntitledToMedia", "()Z", "getGuestMediaId", "()Ljava/lang/String;", "getMediaBase", "getMediaCategory", "getMediaId", "getMediaMedium", "getMediaThumb", "getMediaType", "getMimeType", "getSubjects", "()Ljava/util/List;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "hashCode", "", "toString", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MediaItem {
    private final MediaData artCardMedium;
    private final MediaData artCardThumb;
    private final Date captureDate;
    private final Date expirationDate;
    private final boolean guestEntitledToMedia;
    private final String guestMediaId;
    private final MediaData mediaBase;
    private final String mediaCategory;
    private final String mediaId;
    private final MediaData mediaMedium;
    private final MediaData mediaThumb;
    private final String mediaType;
    private final String mimeType;
    private final List<String> subjects;

    public MediaItem(String mediaId, String guestMediaId, String mediaCategory, String mediaType, String str, Date date, Date date2, boolean z10, List<String> subjects, MediaData mediaData, MediaData mediaData2, MediaData mediaData3, MediaData mediaData4, MediaData mediaData5) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        Intrinsics.checkNotNullParameter(guestMediaId, "guestMediaId");
        Intrinsics.checkNotNullParameter(mediaCategory, "mediaCategory");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(subjects, "subjects");
        this.mediaId = mediaId;
        this.guestMediaId = guestMediaId;
        this.mediaCategory = mediaCategory;
        this.mediaType = mediaType;
        this.mimeType = str;
        this.captureDate = date;
        this.expirationDate = date2;
        this.guestEntitledToMedia = z10;
        this.subjects = subjects;
        this.mediaThumb = mediaData;
        this.mediaMedium = mediaData2;
        this.mediaBase = mediaData3;
        this.artCardThumb = mediaData4;
        this.artCardMedium = mediaData5;
    }

    /* renamed from: component1, reason: from getter */
    public final String getMediaId() {
        return this.mediaId;
    }

    /* renamed from: component10, reason: from getter */
    public final MediaData getMediaThumb() {
        return this.mediaThumb;
    }

    /* renamed from: component11, reason: from getter */
    public final MediaData getMediaMedium() {
        return this.mediaMedium;
    }

    /* renamed from: component12, reason: from getter */
    public final MediaData getMediaBase() {
        return this.mediaBase;
    }

    /* renamed from: component13, reason: from getter */
    public final MediaData getArtCardThumb() {
        return this.artCardThumb;
    }

    /* renamed from: component14, reason: from getter */
    public final MediaData getArtCardMedium() {
        return this.artCardMedium;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGuestMediaId() {
        return this.guestMediaId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMediaCategory() {
        return this.mediaCategory;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getCaptureDate() {
        return this.captureDate;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getGuestEntitledToMedia() {
        return this.guestEntitledToMedia;
    }

    public final List<String> component9() {
        return this.subjects;
    }

    public final MediaItem copy(String mediaId, String guestMediaId, String mediaCategory, String mediaType, String mimeType, Date captureDate, Date expirationDate, boolean guestEntitledToMedia, List<String> subjects, MediaData mediaThumb, MediaData mediaMedium, MediaData mediaBase, MediaData artCardThumb, MediaData artCardMedium) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        Intrinsics.checkNotNullParameter(guestMediaId, "guestMediaId");
        Intrinsics.checkNotNullParameter(mediaCategory, "mediaCategory");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(subjects, "subjects");
        return new MediaItem(mediaId, guestMediaId, mediaCategory, mediaType, mimeType, captureDate, expirationDate, guestEntitledToMedia, subjects, mediaThumb, mediaMedium, mediaBase, artCardThumb, artCardMedium);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) other;
        return Intrinsics.areEqual(this.mediaId, mediaItem.mediaId) && Intrinsics.areEqual(this.guestMediaId, mediaItem.guestMediaId) && Intrinsics.areEqual(this.mediaCategory, mediaItem.mediaCategory) && Intrinsics.areEqual(this.mediaType, mediaItem.mediaType) && Intrinsics.areEqual(this.mimeType, mediaItem.mimeType) && Intrinsics.areEqual(this.captureDate, mediaItem.captureDate) && Intrinsics.areEqual(this.expirationDate, mediaItem.expirationDate) && this.guestEntitledToMedia == mediaItem.guestEntitledToMedia && Intrinsics.areEqual(this.subjects, mediaItem.subjects) && Intrinsics.areEqual(this.mediaThumb, mediaItem.mediaThumb) && Intrinsics.areEqual(this.mediaMedium, mediaItem.mediaMedium) && Intrinsics.areEqual(this.mediaBase, mediaItem.mediaBase) && Intrinsics.areEqual(this.artCardThumb, mediaItem.artCardThumb) && Intrinsics.areEqual(this.artCardMedium, mediaItem.artCardMedium);
    }

    public final MediaData getArtCardMedium() {
        return this.artCardMedium;
    }

    public final MediaData getArtCardThumb() {
        return this.artCardThumb;
    }

    public final Date getCaptureDate() {
        return this.captureDate;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final boolean getGuestEntitledToMedia() {
        return this.guestEntitledToMedia;
    }

    public final String getGuestMediaId() {
        return this.guestMediaId;
    }

    public final MediaData getMediaBase() {
        return this.mediaBase;
    }

    public final String getMediaCategory() {
        return this.mediaCategory;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final MediaData getMediaMedium() {
        return this.mediaMedium;
    }

    public final MediaData getMediaThumb() {
        return this.mediaThumb;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final List<String> getSubjects() {
        return this.subjects;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((this.mediaId.hashCode() * 31) + this.guestMediaId.hashCode()) * 31) + this.mediaCategory.hashCode()) * 31) + this.mediaType.hashCode()) * 31;
        String str = this.mimeType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.captureDate;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationDate;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        boolean z10 = this.guestEntitledToMedia;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int iHashCode5 = (((iHashCode4 + i10) * 31) + this.subjects.hashCode()) * 31;
        MediaData mediaData = this.mediaThumb;
        int iHashCode6 = (iHashCode5 + (mediaData == null ? 0 : mediaData.hashCode())) * 31;
        MediaData mediaData2 = this.mediaMedium;
        int iHashCode7 = (iHashCode6 + (mediaData2 == null ? 0 : mediaData2.hashCode())) * 31;
        MediaData mediaData3 = this.mediaBase;
        int iHashCode8 = (iHashCode7 + (mediaData3 == null ? 0 : mediaData3.hashCode())) * 31;
        MediaData mediaData4 = this.artCardThumb;
        int iHashCode9 = (iHashCode8 + (mediaData4 == null ? 0 : mediaData4.hashCode())) * 31;
        MediaData mediaData5 = this.artCardMedium;
        return iHashCode9 + (mediaData5 != null ? mediaData5.hashCode() : 0);
    }

    public String toString() {
        return "MediaItem(mediaId=" + this.mediaId + ", guestMediaId=" + this.guestMediaId + ", mediaCategory=" + this.mediaCategory + ", mediaType=" + this.mediaType + ", mimeType=" + this.mimeType + ", captureDate=" + this.captureDate + ", expirationDate=" + this.expirationDate + ", guestEntitledToMedia=" + this.guestEntitledToMedia + ", subjects=" + this.subjects + ", mediaThumb=" + this.mediaThumb + ", mediaMedium=" + this.mediaMedium + ", mediaBase=" + this.mediaBase + ", artCardThumb=" + this.artCardThumb + ", artCardMedium=" + this.artCardMedium + ")";
    }

    public /* synthetic */ MediaItem(String str, String str2, String str3, String str4, String str5, Date date, Date date2, boolean z10, List list, MediaData mediaData, MediaData mediaData2, MediaData mediaData3, MediaData mediaData4, MediaData mediaData5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, date, date2, (i10 & 128) != 0 ? false : z10, (i10 & 256) != 0 ? CollectionsKt.emptyList() : list, mediaData, mediaData2, mediaData3, mediaData4, mediaData5);
    }
}