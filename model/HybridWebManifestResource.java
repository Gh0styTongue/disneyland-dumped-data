package com.wdpr.p479ee.p480ra.rahybrid.model;

/* loaded from: classes21.dex */
public class HybridWebManifestResource {
    private String md5;
    private String path;

    protected boolean canEqual(Object obj) {
        return obj instanceof HybridWebManifestResource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HybridWebManifestResource)) {
            return false;
        }
        HybridWebManifestResource hybridWebManifestResource = (HybridWebManifestResource) obj;
        if (!hybridWebManifestResource.canEqual(this)) {
            return false;
        }
        String path = getPath();
        String path2 = hybridWebManifestResource.getPath();
        if (path != null ? !path.equals(path2) : path2 != null) {
            return false;
        }
        String md5 = getMd5();
        String md52 = hybridWebManifestResource.getMd5();
        return md5 != null ? md5.equals(md52) : md52 == null;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getPath() {
        return this.path;
    }

    public int hashCode() {
        String path = getPath();
        int iHashCode = path == null ? 43 : path.hashCode();
        String md5 = getMd5();
        return ((iHashCode + 59) * 59) + (md5 != null ? md5.hashCode() : 43);
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String toString() {
        return "HybridWebManifestResource(path=" + getPath() + ", md5=" + getMd5() + ")";
    }
}