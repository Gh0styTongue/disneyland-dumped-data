package com.wdpr.p479ee.p480ra.rahybrid.contentbundle;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.manager.FileManager;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.model.ContentManifestModel;
import com.wdpr.p479ee.p480ra.rahybrid.model.Bundle;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

@Instrumented
/* loaded from: classes21.dex */
public class ContentBundle {
    private static final String TAG = "ContentBundle";
    private Bundle bundle;
    private String contentID;
    private Context context;
    private FileManager fileManager;
    private boolean isSyncing = false;
    private String localManifestName;

    public ContentBundle(Context context, String str, String str2, Bundle bundle) {
        this.context = context;
        this.contentID = str;
        this.localManifestName = str2;
        this.bundle = bundle;
        this.fileManager = FileManager.getInstance(context);
    }

    public void activateContent(String str) throws Exception {
        String path = getPath(str);
        if (!this.fileManager.directoryExists(path)) {
            throw ContentBundleError.getContentUnavailableException(this.contentID, path);
        }
        this.fileManager.setActiveVersion(this.contentID, str);
        RAHybridLog.m85711d(TAG, String.format("[ContentID %s] Set active version to %s", this.contentID, str));
    }

    public void deleteContent(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equalsIgnoreCase(this.fileManager.getActiveVersion(this.contentID))) {
            throw ContentBundleError.getAttemptToDeleteActiveVersionException(this.contentID, str);
        }
        this.fileManager.deleteLocalDirectory(new File(getPath(str)));
        RAHybridLog.m85711d(TAG, String.format("[ContentID %s] Deleted version %s", this.contentID, str));
    }

    public String getActiveVersionPath() {
        String activeVersion = FileManager.getInstance(this.context).getActiveVersion(this.contentID);
        if (TextUtils.isEmpty(activeVersion)) {
            return null;
        }
        return getPath(activeVersion);
    }

    public Bundle getBundle() {
        return this.bundle;
    }

    public String getContentID() {
        return this.contentID;
    }

    public ContentManifestModel getContentManifestModelByCurrentContentID() throws Exception {
        String str = this.contentID + File.separator + this.localManifestName;
        try {
            return (ContentManifestModel) GsonInstrumentation.fromJson(new Gson(), (Reader) new BufferedReader(new InputStreamReader(this.context.getAssets().open(str))), ContentManifestModel.class);
        } catch (IOException e10) {
            e10.printStackTrace();
            throw ContentBundleError.getContentUnavailableException(this.contentID, str);
        }
    }

    public String getLocalManifestName() {
        return this.localManifestName;
    }

    public String getPath(String str) {
        return this.fileManager.getBaseLocation(this.contentID) + str;
    }

    public boolean isSyncing() {
        return this.isSyncing;
    }

    public void setSyncing(boolean z10) {
        this.isSyncing = z10;
    }

    public void activateContent() throws Exception {
        ContentManifestModel contentManifestModelByCurrentContentID = getContentManifestModelByCurrentContentID();
        if (contentManifestModelByCurrentContentID != null) {
            String version = contentManifestModelByCurrentContentID.getVersion();
            this.fileManager.setActiveVersion(this.contentID, version);
            String path = getPath(version);
            if (this.fileManager.directoryExists(path)) {
                this.fileManager.deleteLocalDirectory(new File(path));
            }
            new File(path).mkdirs();
            this.fileManager.copyAssetFolder(this.context.getAssets(), this.contentID, path);
            String str = TAG;
            String str2 = this.contentID;
            RAHybridLog.m85711d(str, String.format("[ContentID %s] Copied bundled content from %s to %s", str2, str2, path));
            return;
        }
        throw ContentBundleError.getContentManifestInvalidException(this.contentID, this.localManifestName);
    }
}