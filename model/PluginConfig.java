package com.wdpr.p479ee.p480ra.rahybrid.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes21.dex */
public class PluginConfig implements Parcelable {
    public static final Parcelable.Creator<PluginConfig> CREATOR = new Parcelable.Creator<PluginConfig>() { // from class: com.wdpr.ee.ra.rahybrid.model.PluginConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PluginConfig createFromParcel(Parcel parcel) {
            return new PluginConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PluginConfig[] newArray(int i10) {
            return new PluginConfig[i10];
        }
    };

    @SerializedName("config")
    private Map<String, Object> config;

    /* renamed from: id */
    @SerializedName("id")
    private String f71772id;

    public PluginConfig() {
        this.config = new HashMap();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, Object> getConfig() {
        return this.config;
    }

    public String getId() {
        return this.f71772id;
    }

    public void setConfig(Map<String, Object> map) {
        this.config = map;
    }

    public void setId(String str) {
        this.f71772id = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f71772id);
        parcel.writeInt(this.config.size());
        for (Map.Entry<String, Object> entry : this.config.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeValue(entry.getValue());
        }
    }

    public PluginConfig(String str, Map<String, Object> map) {
        new HashMap();
        this.f71772id = str;
        this.config = map;
    }

    protected PluginConfig(Parcel parcel) {
        this.config = new HashMap();
        this.f71772id = parcel.readString();
        int i10 = parcel.readInt();
        this.config = new HashMap(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.config.put(parcel.readString(), parcel.readValue(Object.class.getClassLoader()));
        }
    }
}