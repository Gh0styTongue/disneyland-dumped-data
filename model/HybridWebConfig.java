package com.wdpr.p479ee.p480ra.rahybrid.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Instrumented
/* loaded from: classes21.dex */
public class HybridWebConfig implements Parcelable {
    public static final Parcelable.Creator<HybridWebConfig> CREATOR = new Parcelable.Creator<HybridWebConfig>() { // from class: com.wdpr.ee.ra.rahybrid.model.HybridWebConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HybridWebConfig createFromParcel(Parcel parcel) {
            return new HybridWebConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HybridWebConfig[] newArray(int i10) {
            return new HybridWebConfig[i10];
        }
    };

    @SerializedName(OrionDeepLinkConstants.PAM_MODIFY_BUNDLE)
    private Bundle bundle;

    @SerializedName("entryPoints")
    private List<EntryPointsConfig> entryPoints;

    /* renamed from: id */
    @SerializedName("id")
    private String f71771id;

    @SerializedName("plugins")
    private List<PluginConfig> plugins;

    public HybridWebConfig() {
        this.entryPoints = new ArrayList();
        this.plugins = new ArrayList();
    }

    public static HybridWebConfig loadConfigFile(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            HybridWebConfig hybridWebConfig = (HybridWebConfig) GsonInstrumentation.fromJson(new Gson(), (Reader) bufferedReader, HybridWebConfig.class);
            bufferedReader.close();
            return hybridWebConfig;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static HybridWebConfig loadConfigFileFromInputStream(InputStream inputStream) throws JsonSyntaxException, JsonIOException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            HybridWebConfig hybridWebConfig = (HybridWebConfig) GsonInstrumentation.fromJson(new Gson(), (Reader) bufferedReader, HybridWebConfig.class);
            bufferedReader.close();
            return hybridWebConfig;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static HybridWebConfig loadConfigFileFromUrl(URL url) throws URISyntaxException, IOException {
        return loadConfigFile(new File(url.toURI()));
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof HybridWebConfig;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HybridWebConfig)) {
            return false;
        }
        HybridWebConfig hybridWebConfig = (HybridWebConfig) obj;
        if (!hybridWebConfig.canEqual(this)) {
            return false;
        }
        String id2 = getId();
        String id3 = hybridWebConfig.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        List<EntryPointsConfig> entryPoints = getEntryPoints();
        List<EntryPointsConfig> entryPoints2 = hybridWebConfig.getEntryPoints();
        if (entryPoints != null ? !entryPoints.equals(entryPoints2) : entryPoints2 != null) {
            return false;
        }
        List<PluginConfig> plugins = getPlugins();
        List<PluginConfig> plugins2 = hybridWebConfig.getPlugins();
        if (plugins != null ? !plugins.equals(plugins2) : plugins2 != null) {
            return false;
        }
        Bundle bundle = getBundle();
        Bundle bundle2 = hybridWebConfig.getBundle();
        return bundle != null ? bundle.equals(bundle2) : bundle2 == null;
    }

    public Bundle getBundle() {
        return this.bundle;
    }

    public List<EntryPointsConfig> getEntryPoints() {
        return this.entryPoints;
    }

    public String getId() {
        return this.f71771id;
    }

    public List<PluginConfig> getPlugins() {
        return this.plugins;
    }

    public int hashCode() {
        String id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        List<EntryPointsConfig> entryPoints = getEntryPoints();
        int iHashCode2 = ((iHashCode + 59) * 59) + (entryPoints == null ? 43 : entryPoints.hashCode());
        List<PluginConfig> plugins = getPlugins();
        int i10 = iHashCode2 * 59;
        int iHashCode3 = plugins == null ? 43 : plugins.hashCode();
        Bundle bundle = getBundle();
        return ((i10 + iHashCode3) * 59) + (bundle != null ? bundle.hashCode() : 43);
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public void setEntryPoints(List<EntryPointsConfig> list) {
        this.entryPoints = list;
    }

    public void setId(String str) {
        this.f71771id = str;
    }

    public void setPlugins(List<PluginConfig> list) {
        this.plugins = list;
    }

    public String toString() {
        return "HybridWebConfig(id=" + getId() + ", entryPoints=" + getEntryPoints() + ", plugins=" + getPlugins() + ", bundle=" + getBundle() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f71771id);
        parcel.writeTypedList(this.entryPoints);
        parcel.writeTypedList(this.plugins);
        parcel.writeParcelable(this.bundle, i10);
    }

    protected HybridWebConfig(Parcel parcel) {
        this.entryPoints = new ArrayList();
        this.plugins = new ArrayList();
        this.f71771id = parcel.readString();
        this.entryPoints = parcel.createTypedArrayList(EntryPointsConfig.CREATOR);
        this.plugins = parcel.createTypedArrayList(PluginConfig.CREATOR);
        this.bundle = (Bundle) parcel.readParcelable(Bundle.class.getClassLoader());
    }
}