package com.wdpr.p479ee.p480ra.rahybrid.contentbundle.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.wdpr.p479ee.p480ra.rahybrid.util.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes21.dex */
public class ContentManifestModel {
    private static final String TAG = "ContentManifestModel";

    @SerializedName(Constants.contentURLKey)
    private String contentUrl;

    @SerializedName("hashJwt")
    private String hashJwt;

    @SerializedName(Constants.resourcesKey)
    private List<Resource> resourceList = new ArrayList();

    @SerializedName(Constants.userAgentKey)
    private String userAgent;

    @SerializedName("version")
    private String version;

    public class Resource {

        @SerializedName(Constants.resourceMD5Key)
        private String md5;

        @SerializedName(Constants.resourcePathKey)
        private String path;

        public Resource() {
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Resource)) {
                return false;
            }
            Resource resource = (Resource) obj;
            return this.md5.equals(resource.md5) && this.path.equals(resource.path);
        }

        public String getMd5() {
            return this.md5;
        }

        public String getPath() {
            return this.path;
        }

        public int hashCode() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.md5);
            sb2.append(this.path);
            return sb2.hashCode();
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setPath(String str) {
            this.path = str;
        }

        public String toString() {
            return "path :" + this.path + "\nmd5 :" + this.md5;
        }
    }

    public boolean containsResource(Resource resource) {
        return this.resourceList.contains(resource);
    }

    public boolean contentUrlMatches(String str) {
        return TextUtils.isEmpty(this.contentUrl) ? TextUtils.isEmpty(str) : this.contentUrl.equals(str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContentManifestModel)) {
            return false;
        }
        ContentManifestModel contentManifestModel = (ContentManifestModel) obj;
        return this.resourceList.equals(contentManifestModel.resourceList) && this.hashJwt.equals(contentManifestModel.hashJwt) && this.userAgent.equals(contentManifestModel.userAgent) && this.contentUrl.equals(contentManifestModel.contentUrl) && this.version.equals(contentManifestModel.version);
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public String getHashJwt() {
        return this.hashJwt;
    }

    public List<Resource> getResourceList() {
        return this.resourceList;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.resourceList);
        sb2.append(this.hashJwt);
        sb2.append(this.userAgent);
        sb2.append(this.contentUrl);
        sb2.append(this.version);
        return sb2.hashCode();
    }

    public boolean resourcesMatches(Collection<Resource> collection) {
        return this.resourceList.containsAll(collection);
    }

    public void setContentUrl(String str) {
        this.contentUrl = str;
    }

    public void setHashJwt(String str) {
        this.hashJwt = str;
    }

    public void setResourceList(List<Resource> list) {
        this.resourceList = list;
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return Constants.contentURLKey + this.contentUrl + "\nversion" + this.version + "\nuserAgent" + this.userAgent + "\nresourceList" + this.resourceList + "\nhashJwt" + this.hashJwt;
    }

    public boolean userAgentMatches(String str) {
        return TextUtils.isEmpty(this.userAgent) ? TextUtils.isEmpty(str) : this.userAgent.equals(str);
    }

    public boolean versionMatches(String str) {
        return TextUtils.isEmpty(this.version) ? TextUtils.isEmpty(str) : this.version.equals(str);
    }
}