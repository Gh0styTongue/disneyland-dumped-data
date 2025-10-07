package com.wdpr.p479ee.p480ra.rahybrid.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.wdpr.p479ee.p480ra.rahybrid.util.Constants;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes21.dex */
public class HybridWebManifest {
    private String contentUrl;
    private String hashJwt;
    private String minNativeAppVersion;

    @SerializedName(Constants.resourcesKey)
    private HashSet<HybridWebManifestResource> resources;
    private String userAgent;
    private String version;

    protected boolean canEqual(Object obj) {
        return obj instanceof HybridWebManifest;
    }

    public boolean contentUrlMatches(String str) {
        return TextUtils.isEmpty(getContentUrl()) ? TextUtils.isEmpty(str) : getContentUrl().equals(str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HybridWebManifest)) {
            return false;
        }
        HybridWebManifest hybridWebManifest = (HybridWebManifest) obj;
        if (!hybridWebManifest.canEqual(this)) {
            return false;
        }
        String contentUrl = getContentUrl();
        String contentUrl2 = hybridWebManifest.getContentUrl();
        if (contentUrl != null ? !contentUrl.equals(contentUrl2) : contentUrl2 != null) {
            return false;
        }
        String version = getVersion();
        String version2 = hybridWebManifest.getVersion();
        if (version != null ? !version.equals(version2) : version2 != null) {
            return false;
        }
        String userAgent = getUserAgent();
        String userAgent2 = hybridWebManifest.getUserAgent();
        if (userAgent != null ? !userAgent.equals(userAgent2) : userAgent2 != null) {
            return false;
        }
        String minNativeAppVersion = getMinNativeAppVersion();
        String minNativeAppVersion2 = hybridWebManifest.getMinNativeAppVersion();
        if (minNativeAppVersion != null ? !minNativeAppVersion.equals(minNativeAppVersion2) : minNativeAppVersion2 != null) {
            return false;
        }
        String hashJwt = getHashJwt();
        String hashJwt2 = hybridWebManifest.getHashJwt();
        if (hashJwt != null ? !hashJwt.equals(hashJwt2) : hashJwt2 != null) {
            return false;
        }
        HashSet<HybridWebManifestResource> resources = getResources();
        HashSet<HybridWebManifestResource> resources2 = hybridWebManifest.getResources();
        return resources != null ? resources.equals(resources2) : resources2 == null;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public String getHashJwt() {
        return this.hashJwt;
    }

    public String getMinNativeAppVersion() {
        return this.minNativeAppVersion;
    }

    public HybridWebManifestResource getResource(String str, String str2) {
        Iterator<HybridWebManifestResource> it = this.resources.iterator();
        while (it.hasNext()) {
            HybridWebManifestResource next = it.next();
            if (str.equals(next.getPath()) && str2.equals(next.getMd5())) {
                return next;
            }
        }
        return null;
    }

    public HashSet<HybridWebManifestResource> getResources() {
        return this.resources;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String contentUrl = getContentUrl();
        int iHashCode = contentUrl == null ? 43 : contentUrl.hashCode();
        String version = getVersion();
        int iHashCode2 = ((iHashCode + 59) * 59) + (version == null ? 43 : version.hashCode());
        String userAgent = getUserAgent();
        int iHashCode3 = (iHashCode2 * 59) + (userAgent == null ? 43 : userAgent.hashCode());
        String minNativeAppVersion = getMinNativeAppVersion();
        int iHashCode4 = (iHashCode3 * 59) + (minNativeAppVersion == null ? 43 : minNativeAppVersion.hashCode());
        String hashJwt = getHashJwt();
        int i10 = iHashCode4 * 59;
        int iHashCode5 = hashJwt == null ? 43 : hashJwt.hashCode();
        HashSet<HybridWebManifestResource> resources = getResources();
        return ((i10 + iHashCode5) * 59) + (resources != null ? resources.hashCode() : 43);
    }

    public boolean resourcesMatches(Collection<HybridWebManifestResource> collection) {
        if (collection == null || collection.isEmpty()) {
            return getResources() == null || getResources().isEmpty();
        }
        return getResources().equals(new HashSet(collection));
    }

    public void setContentUrl(String str) {
        this.contentUrl = str;
    }

    public void setHashJwt(String str) {
        this.hashJwt = str;
    }

    public void setMinNativeAppVersion(String str) {
        this.minNativeAppVersion = str;
    }

    public void setResources(HashSet<HybridWebManifestResource> hashSet) {
        this.resources = hashSet;
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return "HybridWebManifest(contentUrl=" + getContentUrl() + ", version=" + getVersion() + ", userAgent=" + getUserAgent() + ", minNativeAppVersion=" + getMinNativeAppVersion() + ", hashJwt=" + getHashJwt() + ", resources=" + getResources() + ")";
    }

    public boolean userAgentMatches(String str) {
        return TextUtils.isEmpty(getUserAgent()) ? TextUtils.isEmpty(str) : getUserAgent().equals(str);
    }

    public boolean versionMatches(String str) {
        return TextUtils.isEmpty(getVersion()) ? TextUtils.isEmpty(str) : getVersion().equals(str);
    }
}