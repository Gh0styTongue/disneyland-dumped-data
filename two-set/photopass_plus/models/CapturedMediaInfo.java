package com.disney.wdpro.photopass_plus.models;

import com.google.common.base.C22462m;
import java.io.Serializable;
import java.util.Date;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes15.dex */
public final class CapturedMediaInfo implements Serializable {
    private static final long serialVersionUID = -7060210544600464481L;
    private String assetId;
    private Date captureDate;
    private String experienceId;
    private String guestMediaId;
    private String location;
    private String mediaCategory;
    private String mediaType;
    private long searchWindow;

    public static class Builder {
        private String assetId;
        private Date captureDate;
        private String experienceId;
        private String guestMediaId;
        private String location;
        private String mediaCategory;
        private String mediaType;
        private long searchWindow;

        public CapturedMediaInfo build() {
            C22462m.m68685q(this.guestMediaId, "GuestMediaId cannot be null");
            C22462m.m68685q(this.captureDate, "captureDate cannot be null");
            C22462m.m68685q(this.mediaType, "mediaType cannot be null");
            return new CapturedMediaInfo(this);
        }

        public Builder setAssetId(String str) {
            this.assetId = str;
            return this;
        }

        public Builder setCaptureDate(Date date) {
            this.captureDate = date;
            return this;
        }

        public Builder setExperienceId(String str) {
            this.experienceId = str;
            return this;
        }

        public Builder setGuestMediaId(String str) {
            this.guestMediaId = str;
            return this;
        }

        public Builder setLocation(String str) {
            this.location = str;
            return this;
        }

        public Builder setMediaCategory(String str) {
            this.mediaCategory = str;
            return this;
        }

        public Builder setMediaType(String str) {
            this.mediaType = str;
            return this;
        }

        public Builder setSearchWindow(long j10) {
            this.searchWindow = j10;
            return this;
        }
    }

    private enum MediaTypes {
        PICTURE,
        VIDEO
    }

    public String getAssetId() {
        return this.assetId;
    }

    public Date getCaptureDate() {
        return this.captureDate;
    }

    public String getExperienceId() {
        return this.experienceId;
    }

    public String getGuestMediaId() {
        return this.guestMediaId;
    }

    public String getLocation() {
        return this.location;
    }

    public String getMediaCategory() {
        return this.mediaCategory;
    }

    public long getSearchWindow() {
        return this.searchWindow;
    }

    public boolean isPicture() {
        return MediaTypes.PICTURE.name().equalsIgnoreCase(this.mediaType);
    }

    public String toString() {
        return "CapturedMediaInfo{searchWindow=" + this.searchWindow + ", experienceId='" + this.experienceId + "', location='" + this.location + "', assetId='" + this.assetId + "', mediaCategory='" + this.mediaCategory + "', mediaType='" + this.mediaType + "', guestMediaId='" + this.guestMediaId + "', captureDate=" + this.captureDate + AbstractJsonLexerKt.END_OBJ;
    }

    private CapturedMediaInfo(Builder builder) {
        this.searchWindow = builder.searchWindow;
        this.experienceId = builder.experienceId;
        this.location = builder.location;
        this.assetId = builder.assetId;
        this.mediaCategory = builder.mediaCategory;
        this.mediaType = builder.mediaType;
        this.guestMediaId = builder.guestMediaId;
        this.captureDate = builder.captureDate;
    }
}