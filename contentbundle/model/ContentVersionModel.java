package com.wdpr.p479ee.p480ra.rahybrid.contentbundle.model;

/* loaded from: classes21.dex */
public class ContentVersionModel {
    private String active;
    private String downloaded;

    public ContentVersionModel(String str, String str2) {
        this.active = str;
        this.downloaded = str2;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof ContentVersionModel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContentVersionModel)) {
            return false;
        }
        ContentVersionModel contentVersionModel = (ContentVersionModel) obj;
        if (!contentVersionModel.canEqual(this)) {
            return false;
        }
        String active = getActive();
        String active2 = contentVersionModel.getActive();
        if (active != null ? !active.equals(active2) : active2 != null) {
            return false;
        }
        String downloaded = getDownloaded();
        String downloaded2 = contentVersionModel.getDownloaded();
        return downloaded != null ? downloaded.equals(downloaded2) : downloaded2 == null;
    }

    public String getActive() {
        return this.active;
    }

    public String getDownloaded() {
        return this.downloaded;
    }

    public int hashCode() {
        String active = getActive();
        int iHashCode = active == null ? 43 : active.hashCode();
        String downloaded = getDownloaded();
        return ((iHashCode + 59) * 59) + (downloaded != null ? downloaded.hashCode() : 43);
    }

    public void setActive(String str) {
        this.active = str;
    }

    public void setDownloaded(String str) {
        this.downloaded = str;
    }

    public String toString() {
        return "ContentVersionModel(active=" + getActive() + ", downloaded=" + getDownloaded() + ")";
    }
}