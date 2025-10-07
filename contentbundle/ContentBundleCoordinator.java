package com.wdpr.p479ee.p480ra.rahybrid.contentbundle;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.disney.wdpro.service.utils.Constants;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.interfaces.ContentBundleSyncListener;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.manager.ContentSyncManager;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.manager.FileManager;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.model.ContentManifestModel;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebContentSyncConfig;
import com.wdpr.p479ee.p480ra.rahybrid.server.HybridContentServer;
import com.wdpr.p479ee.p480ra.rahybrid.util.JWTUtil;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p1160zy.C34087b;

@Instrumented
/* loaded from: classes21.dex */
public class ContentBundleCoordinator {
    private static final String TAG = "ContentBundleCoordinator";
    public static int httpConnectionTimeoutMS = 20000;
    public static int httpReadTimeoutMS = 20000;
    private ContentBundle contentBundle;
    private Context context;
    private String customUserAgentValue;
    private FileManager fileManager;
    private HybridWebContentSyncConfig webContentSyncConfig;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckManifestVersionResult {
        public static final int ALREADY_UP_TO_DATE = 101;
        public static final int UPDATE_AVAILABLE = 102;
    }

    public ContentBundleCoordinator(Context context, ContentBundle contentBundle, String str) {
        this.context = context;
        this.contentBundle = contentBundle;
        this.webContentSyncConfig = contentBundle.getBundle().getWebContentSyncConfig();
        this.customUserAgentValue = str;
        this.fileManager = FileManager.getInstance(context);
    }

    public int checkManifestVersion(String str, String str2) {
        return str2.equalsIgnoreCase(str) ? 101 : 102;
    }

    public void deleteContent(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                this.contentBundle.deleteContent(it.next());
            } catch (Exception e10) {
                e10.printStackTrace();
                RAHybridLog.m85713e(TAG, "DeleteContent Exception: " + e10.getMessage(), e10);
            }
        }
    }

    public void downloadContent(String str, String str2, String str3) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) URLConnectionInstrumentation.openConnection(new URL(str).openConnection());
        httpURLConnection.setConnectTimeout(httpConnectionTimeoutMS);
        httpURLConnection.setReadTimeout(httpReadTimeoutMS);
        httpURLConnection.setRequestMethod(HybridContentServer.WebRequestMethodType.GET);
        httpURLConnection.setRequestProperty("User-Agent", this.customUserAgentValue);
        httpURLConnection.setDoInput(true);
        httpURLConnection.addRequestProperty("Cache-Control", Constants.X_CACHE_CONTROL_TYPE_NO_CACHE);
        try {
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            File fileCreateTempFile = File.createTempFile(new File(str2).getName(), null, this.context.getCacheDir());
            RAHybridLog.m85714i(TAG, String.format("Downloading %s to %s", str, fileCreateTempFile.getPath()));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileCreateTempFile));
            C34087b.m102991a(inputStream, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            inputStream.close();
            this.fileManager.copyResource(fileCreateTempFile.getPath(), str2, str3);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public String getActiveVersion() {
        return this.fileManager.getActiveVersion(this.contentBundle.getContentID());
    }

    public String getDownloadedVersion() {
        return this.fileManager.getDownloadedVersion(this.contentBundle.getContentID());
    }

    public ContentManifestModel getLocalManifest(String str) throws Exception {
        String contentID = this.contentBundle.getContentID();
        return this.fileManager.getLocalManifest(contentID, this.fileManager.getLocalServerLocationWithVersion(contentID, str), this.webContentSyncConfig);
    }

    public ContentManifestModel getRemoteManifest(String str, HybridWebContentSyncConfig hybridWebContentSyncConfig) throws IOException {
        try {
            URL url = new URL(hybridWebContentSyncConfig.getRemoteContentUrl());
            URLConnection uRLConnectionOpenConnection = URLConnectionInstrumentation.openConnection(url.openConnection());
            uRLConnectionOpenConnection.setConnectTimeout(httpConnectionTimeoutMS);
            uRLConnectionOpenConnection.setReadTimeout(httpReadTimeoutMS);
            uRLConnectionOpenConnection.setRequestProperty("User-Agent", str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnectionOpenConnection.getInputStream()));
                try {
                    try {
                        ContentManifestModel contentManifestModel = (ContentManifestModel) GsonInstrumentation.fromJson(new Gson(), (Reader) bufferedReader, ContentManifestModel.class);
                        bufferedReader.close();
                        return contentManifestModel;
                    } catch (JsonIOException | JsonSyntaxException e10) {
                        RAHybridLog.m85713e(TAG, e10.getLocalizedMessage(), e10);
                        throw ContentBundleError.getContentManifestInvalidException(this.contentBundle.getContentID(), url.toString());
                    }
                } finally {
                }
            } catch (Exception e11) {
                RAHybridLog.m85713e(TAG, e11.getLocalizedMessage(), e11);
                return null;
            }
        } catch (IOException e12) {
            RAHybridLog.m85713e(TAG, e12.getLocalizedMessage(), e12);
            return null;
        }
    }

    public void startSync(final ContentBundleSyncListener contentBundleSyncListener) {
        if (contentBundleSyncListener == null) {
            RAHybridLog.m85712e(TAG, "ContentBundleSyncListener can not be null");
            return;
        }
        try {
            Intent intent = new Intent(this.context, (Class<?>) ContentSyncManager.class);
            intent.putExtra(com.wdpr.p479ee.p480ra.rahybrid.util.Constants.CONTENT_SYNC_RESULT_RECEIVER, new ResultReceiver(new Handler()) { // from class: com.wdpr.ee.ra.rahybrid.contentbundle.ContentBundleCoordinator.1
                @Override // android.os.ResultReceiver
                protected void onReceiveResult(int i10, Bundle bundle) {
                    switch (i10) {
                        case 101:
                            String string = bundle.getString(com.wdpr.p479ee.p480ra.rahybrid.util.Constants.MANIFEST_NEW_VERSION);
                            String string2 = bundle.getString(com.wdpr.p479ee.p480ra.rahybrid.util.Constants.MANIFEST_OLD_VERSION);
                            contentBundleSyncListener.onSuccess(string, string2);
                            if (string != null) {
                                try {
                                    ContentBundleCoordinator.this.switchContent(string, Collections.singletonList(string2));
                                    break;
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                    RAHybridLog.m85713e(ContentBundleCoordinator.TAG, "startSync : " + e10.getMessage(), e10);
                                    return;
                                }
                            }
                            break;
                        case 102:
                            contentBundleSyncListener.onNoChange(bundle.getString(com.wdpr.p479ee.p480ra.rahybrid.util.Constants.MANIFEST_OLD_VERSION));
                            break;
                        case 103:
                            contentBundleSyncListener.onFailure(bundle.getStringArrayList(com.wdpr.p479ee.p480ra.rahybrid.util.Constants.WEB_CONTENT_SYNC_ERROR));
                            break;
                    }
                }
            });
            ContentSyncManager.enqueueWork(this.context, this, intent);
        } catch (Exception e10) {
            RAHybridLog.m85712e(TAG, e10.getMessage());
            contentBundleSyncListener.onFailure(Collections.singletonList(e10.getMessage()));
        }
    }

    public void switchContent(String str, List<String> list) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception("newVersion should not be null or empty");
        }
        this.contentBundle.activateContent(str);
        deleteContent(list);
    }

    public void sync(ContentBundleSyncListener contentBundleSyncListener) throws Exception {
        if (this.contentBundle.isSyncing()) {
            throw ContentBundleError.getSyncAlreadyInProgressException(this.contentBundle.getContentID());
        }
        this.contentBundle.setSyncing(true);
        if (this.fileManager.getActiveVersion(this.contentBundle.getContentID()) == null) {
            this.contentBundle.activateContent();
        }
        String activeVersion = this.fileManager.getActiveVersion(this.contentBundle.getContentID());
        if (TextUtils.isEmpty(activeVersion)) {
            throw ContentBundleError.getContentVersionUnavailableException(this.contentBundle.getContentID(), activeVersion);
        }
        ContentManifestModel localManifest = getLocalManifest(activeVersion);
        if (localManifest == null) {
            throw ContentBundleError.getContentManifestInvalidException(this.contentBundle.getContentID(), activeVersion);
        }
        if (TextUtils.isEmpty(this.customUserAgentValue)) {
            this.customUserAgentValue = localManifest.getUserAgent();
        }
        ContentManifestModel remoteManifest = getRemoteManifest(this.customUserAgentValue, this.webContentSyncConfig);
        if (remoteManifest == null) {
            throw ContentBundleError.getManifestNotAvailableException(this.contentBundle.getContentID(), activeVersion);
        }
        int iCheckManifestVersion = checkManifestVersion(localManifest.getVersion(), remoteManifest.getVersion());
        if (iCheckManifestVersion == 101) {
            RAHybridLog.m85714i(TAG, "Already up-to-date");
            contentBundleSyncListener.onNoChange(localManifest.getVersion());
        } else if (iCheckManifestVersion == 102) {
            String str = TAG;
            RAHybridLog.m85714i(str, "Update available");
            byte[] byteArray = JWTUtil.getByteArray(this.context, this.contentBundle.getContentID(), this.webContentSyncConfig);
            if (byteArray == null) {
                RAHybridLog.m85714i(str, "No Public Key provided to validate JWT");
                contentBundleSyncListener.onFailure(Collections.singletonList(ContentBundleError.getPublicKeyNotFoundException(this.contentBundle.getContentID(), this.webContentSyncConfig.getRemoteContentUrl()).getMessage()));
            } else if (JWTUtil.validateToken(remoteManifest, byteArray)) {
                File file = new File(this.fileManager.getBaseLocation(this.contentBundle.getContentID()), remoteManifest.getVersion());
                String path = file.getPath();
                String str2 = path + ".bak";
                File file2 = new File(str2);
                if (file.exists()) {
                    RAHybridLog.m85714i(str, "Backing up " + path + " to " + str2);
                    file.renameTo(file2);
                }
                List<String> listUpdateWebContent = updateWebContent(path, localManifest, remoteManifest);
                if (listUpdateWebContent.size() > 0) {
                    if (file2.exists()) {
                        file.delete();
                        file2.renameTo(file);
                    }
                    contentBundleSyncListener.onFailure(listUpdateWebContent);
                } else {
                    this.fileManager.setDownloadedVersion(this.contentBundle.getContentID(), remoteManifest.getVersion());
                    contentBundleSyncListener.onSuccess(remoteManifest.getVersion(), localManifest.getVersion());
                }
            } else {
                RAHybridLog.m85714i(str, "JWT failed verification or claims failed validation");
                contentBundleSyncListener.onFailure(Collections.singletonList(ContentBundleError.getJWTInvalidException(this.contentBundle.getContentID(), this.webContentSyncConfig.getRemoteContentUrl()).getMessage()));
            }
        }
        this.contentBundle.setSyncing(false);
    }

    public List<String> updateWebContent(String str, ContentManifestModel contentManifestModel, ContentManifestModel contentManifestModel2) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            RAHybridLog.m85712e(TAG, "Required parameters not set correctly for downloading resources");
            arrayList.add("destPath can not be null");
            return arrayList;
        }
        for (ContentManifestModel.Resource resource : contentManifestModel2.getResourceList()) {
            String path = new File(str, resource.getPath()).getPath();
            if (contentManifestModel.containsResource(resource)) {
                String path2 = new File(this.fileManager.getLocalServerLocationWithVersion(this.contentBundle.getContentID(), null), resource.getPath()).getPath();
                RAHybridLog.m85711d(TAG, "Source Path: " + path2);
                try {
                    this.fileManager.copyResource(path2, path, resource.getMd5());
                } catch (Exception e10) {
                    RAHybridLog.m85713e(TAG, "Error copying file" + path2, e10);
                    arrayList.add(e10.getMessage());
                }
            } else {
                Uri uriWithAppendedPath = Uri.withAppendedPath(Uri.parse(contentManifestModel2.getContentUrl()), resource.getPath());
                try {
                    downloadContent(uriWithAppendedPath.toString(), path, resource.getMd5());
                } catch (Exception e11) {
                    RAHybridLog.m85713e(TAG, "Error downloading file " + uriWithAppendedPath, e11);
                    arrayList.add(e11.getMessage());
                }
            }
        }
        try {
            downloadContent(this.webContentSyncConfig.getRemoteContentUrl(), new File(str, this.webContentSyncConfig.getLocalManifestName()).getPath(), null);
        } catch (Exception e12) {
            RAHybridLog.m85713e(TAG, "Error downloading file " + this.webContentSyncConfig.getRemoteContentUrl(), e12);
            arrayList.add(e12.getMessage());
        }
        return arrayList;
    }
}