package com.disney.wdpro.geofence.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.disney.wdpro.geofence.util.GeofenceUtils;
import java.security.InvalidParameterException;
import java.util.List;

/* loaded from: classes28.dex */
public class GeofenceWrapper implements Parcelable {
    public static final Parcelable.Creator<GeofenceWrapper> CREATOR = new Parcelable.Creator<GeofenceWrapper>() { // from class: com.disney.wdpro.geofence.model.GeofenceWrapper.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GeofenceWrapper createFromParcel(Parcel parcel) {
            return new GeofenceWrapper(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GeofenceWrapper[] newArray(int i10) {
            return new GeofenceWrapper[i10];
        }
    };
    private final long createdAt;
    private final long expiration;
    private final List<GeofenceWrapper> geofences;
    private final String groupId;

    /* renamed from: id */
    private final String f32889id;
    private final double lat;
    private final double lng;
    private final int loitering;
    private final int occurrence;
    private int occurrences;
    private final long radius;
    private final int transition;

    public static class Builder {
        private long expiration;
        private List<GeofenceWrapper> geofences;
        private String groupId;

        /* renamed from: id */
        private String f32890id;
        private double lat;
        private double lng;
        private int loitering;
        private int occurrence;
        private long radius;
        private int transition;

        public GeofenceWrapper build() {
            String str = this.f32890id;
            if (str == null || str.isEmpty() || this.lat == 0.0d || this.lng == 0.0d || this.radius == 0 || this.transition == 0 || this.expiration == 0) {
                throw new InvalidParameterException("There are required parameters: id, lat, lng, radius, expiration and transition.");
            }
            return new GeofenceWrapper(this.f32890id, this.groupId, this.lat, this.lng, this.radius, this.transition, this.expiration, this.loitering, this.occurrence, this.geofences);
        }

        public Builder setCircularRegion(double d10, double d11, long j10) {
            this.lat = d10;
            this.lng = d11;
            this.radius = j10;
            return this;
        }

        public Builder setExpiration(long j10) {
            this.expiration = j10;
            return this;
        }

        public Builder setGeofences(List<GeofenceWrapper> list) {
            this.geofences = list;
            return this;
        }

        public Builder setGroupId(String str) {
            this.groupId = str;
            return this;
        }

        public Builder setId(String str) {
            this.f32890id = str;
            return this;
        }

        public Builder setLoitering(int i10) {
            this.loitering = i10;
            return this;
        }

        public Builder setOccurrence(int i10) {
            this.occurrence = i10;
            return this;
        }

        public Builder setTransition(int i10) {
            this.transition = i10;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GeofenceWrapper geofenceWrapper = (GeofenceWrapper) obj;
            String str = this.f32889id;
            if (str != null) {
                return str.equals(geofenceWrapper.f32889id);
            }
            if (geofenceWrapper.f32889id == null) {
                return true;
            }
        }
        return false;
    }

    public long getExpiration() {
        return this.expiration;
    }

    public List<GeofenceWrapper> getGeofences() {
        return this.geofences;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getId() {
        return this.f32889id;
    }

    public String getInternalId() {
        return GeofenceUtils.concatId(this.groupId, this.f32889id);
    }

    public double getLat() {
        return this.lat;
    }

    public double getLng() {
        return this.lng;
    }

    public int getLoitering() {
        return this.loitering;
    }

    public int getOccurrence() {
        return this.occurrence;
    }

    public int getOccurrences() {
        return this.occurrences;
    }

    public long getRadius() {
        return this.radius;
    }

    public int getTransition() {
        return this.transition;
    }

    public boolean hasExpired() {
        return System.currentTimeMillis() - this.createdAt >= this.expiration;
    }

    public boolean hasReachedOccurrenceLimit() {
        int i10 = this.occurrence;
        return i10 != 0 && this.occurrences >= i10;
    }

    public int hashCode() {
        String str = this.f32889id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public void incrementOccurrences() {
        this.occurrences++;
    }

    public boolean isValid() {
        return (hasExpired() || hasReachedOccurrenceLimit()) ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f32889id);
        parcel.writeString(this.groupId);
        parcel.writeDouble(this.lat);
        parcel.writeDouble(this.lng);
        parcel.writeLong(this.radius);
        parcel.writeInt(this.transition);
        parcel.writeLong(this.expiration);
        parcel.writeInt(this.loitering);
        parcel.writeInt(this.occurrence);
        parcel.writeTypedList(this.geofences);
        parcel.writeLong(this.createdAt);
        parcel.writeInt(this.occurrences);
    }

    private GeofenceWrapper(String str, String str2, double d10, double d11, long j10, int i10, long j11, int i11, int i12, List<GeofenceWrapper> list) {
        this.f32889id = str;
        this.groupId = str2;
        this.lat = d10;
        this.lng = d11;
        this.radius = j10;
        this.transition = i10;
        this.expiration = j11;
        this.loitering = i11;
        this.geofences = list;
        this.occurrence = i12;
        this.createdAt = System.currentTimeMillis();
    }

    protected GeofenceWrapper(Parcel parcel) {
        this.f32889id = parcel.readString();
        this.groupId = parcel.readString();
        this.lat = parcel.readDouble();
        this.lng = parcel.readDouble();
        this.radius = parcel.readLong();
        this.transition = parcel.readInt();
        this.expiration = parcel.readLong();
        this.loitering = parcel.readInt();
        this.occurrence = parcel.readInt();
        this.geofences = parcel.createTypedArrayList(CREATOR);
        this.createdAt = parcel.readLong();
        this.occurrences = parcel.readInt();
    }
}