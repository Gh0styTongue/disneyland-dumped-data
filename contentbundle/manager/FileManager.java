package com.wdpr.p479ee.p480ra.rahybrid.contentbundle.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.wdpr.p479ee.p480ra.rahybrid.C26961R;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.ContentBundleError;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.model.ContentManifestModel;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.model.ContentVersionModel;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebContentSyncConfig;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.ref.WeakReference;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p1160zy.C34087b;

@Instrumented
/* loaded from: classes21.dex */
public class FileManager {
    private static final int BUFFER_SIZE = 8192;
    private static final String TAG = "FileManager";
    private static FileManager fileManager;
    private WeakReference<Context> contextWeakReference;

    private FileManager() {
    }

    private Map<String, ContentVersionModel> getContentVersionModelMap(String str) {
        String string = this.contextWeakReference.get().getSharedPreferences(this.contextWeakReference.get().getString(C26961R.string.web_content_bundle_versions_key), 0).getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return (Map) GsonInstrumentation.fromJson(new Gson(), string, new TypeToken<HashMap<String, ContentVersionModel>>() { // from class: com.wdpr.ee.ra.rahybrid.contentbundle.manager.FileManager.1
            }.getType());
        } catch (JsonSyntaxException e10) {
            e10.printStackTrace();
            RAHybridLog.m85713e(TAG, "getContentVersionModel() JsonSyntaxException " + e10.getMessage(), e10);
            return null;
        }
    }

    public static FileManager getInstance(Context context) {
        if (fileManager == null) {
            synchronized (FileManager.class) {
                try {
                    if (fileManager == null) {
                        fileManager = new FileManager();
                    }
                } finally {
                }
            }
        }
        fileManager.contextWeakReference = new WeakReference<>(context);
        return fileManager;
    }

    private void saveContentVersionModelMap(String str, Map<String, ContentVersionModel> map) {
        String json = GsonInstrumentation.toJson(new Gson(), map);
        SharedPreferences.Editor editorEdit = this.contextWeakReference.get().getSharedPreferences(this.contextWeakReference.get().getString(C26961R.string.web_content_bundle_versions_key), 0).edit();
        editorEdit.putString(str, json);
        editorEdit.apply();
    }

    public boolean checkSum(String str, String str2) throws NoSuchAlgorithmException {
        String strComputeMD5;
        try {
            strComputeMD5 = computeMD5(str);
            try {
                RAHybridLog.m85714i(TAG, String.format("Computed: %s; given: %s", strComputeMD5, str2));
            } catch (IOException e10) {
                e = e10;
                RAHybridLog.m85713e(TAG, "Error computing MD5", e);
                return TextUtils.equals(strComputeMD5, str2);
            }
        } catch (IOException e11) {
            e = e11;
            strComputeMD5 = null;
        }
        return TextUtils.equals(strComputeMD5, str2);
    }

    public int compare(String str, String str2) {
        int iCompareTo;
        int i10;
        int i11;
        if (str.equals(str2)) {
            return 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int iIndexOf = str.indexOf(46, i12);
            int iIndexOf2 = str2.indexOf(46, i13);
            iCompareTo = Integer.valueOf(Integer.parseInt(iIndexOf < 0 ? str.substring(i12) : str.substring(i12, iIndexOf))).compareTo(Integer.valueOf(Integer.parseInt(iIndexOf2 < 0 ? str2.substring(i13) : str2.substring(i13, iIndexOf2))));
            i10 = iIndexOf + 1;
            i11 = iIndexOf2 + 1;
            if (iCompareTo != 0 || i10 <= 0 || i11 <= 0) {
                break;
            }
            i12 = i10;
            i13 = i11;
        }
        if (iCompareTo == 0) {
            if (i10 > i11) {
                return containsNonZeroValue(str, i10) ? 1 : 0;
            }
            if (i10 < i11) {
                return containsNonZeroValue(str2, i11) ? -1 : 0;
            }
        }
        return iCompareTo;
    }

    public String computeMD5(String str) throws NoSuchAlgorithmException, IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            DigestInputStream digestInputStream = new DigestInputStream(new FileInputStream(str), messageDigest);
            try {
                do {
                } while (digestInputStream.read(new byte[8192]) != -1);
                digestInputStream.close();
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : messageDigest.digest()) {
                    sb2.append(String.format("%02x", Byte.valueOf(b10)));
                }
                return sb2.toString();
            } catch (Throwable th2) {
                try {
                    digestInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (NoSuchAlgorithmException e10) {
            RAHybridLog.m85713e(TAG, "Error initializing MD5 checker", e10);
            return null;
        }
    }

    public boolean containsNonZeroValue(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '0' && cCharAt != '.') {
                return true;
            }
            i10++;
        }
        return false;
    }

    public boolean copyAsset(AssetManager assetManager, String str, String str2) throws IOException {
        try {
            InputStream inputStreamOpen = assetManager.open(str);
            new File(str2).createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            copyFile(inputStreamOpen, fileOutputStream);
            inputStreamOpen.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (Exception e10) {
            RAHybridLog.m85713e(TAG, e10.getLocalizedMessage(), e10);
            return false;
        }
    }

    public boolean copyAssetFolder(AssetManager assetManager, String str, String str2) {
        try {
            String[] list = assetManager.list(str);
            new File(str2).mkdirs();
            for (String str3 : list) {
                if (str3.contains(".")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    String str4 = File.separator;
                    sb2.append(str4);
                    sb2.append(str3);
                    copyAsset(assetManager, sb2.toString(), str2 + str4 + str3);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    String str5 = File.separator;
                    sb3.append(str5);
                    sb3.append(str3);
                    copyAssetFolder(assetManager, sb3.toString(), str2 + str5 + str3);
                }
            }
            return false;
        } catch (Exception e10) {
            RAHybridLog.m85713e(TAG, e10.getLocalizedMessage(), e10);
            return false;
        }
    }

    public void copyContent(String str, String str2, List<ContentManifestModel.Resource> list) {
        for (ContentManifestModel.Resource resource : list) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            String str3 = File.separator;
            sb2.append(str3);
            sb2.append(resource.getPath());
            try {
                copyResource(sb2.toString(), str2 + str3 + resource.getPath(), resource.getMd5());
            } catch (Exception e10) {
                e10.printStackTrace();
                RAHybridLog.m85713e(TAG, "copyResource() Exception", e10);
            }
        }
    }

    public void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    public boolean copyResource(String str, String str2, String str3) throws Exception {
        File parentFile = new File(str2).getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        RAHybridLog.m85714i(TAG, String.format("Copying %s to %s", str, str2));
        FileInputStream fileInputStream = new FileInputStream(str);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
        int iM102991a = C34087b.m102991a(fileInputStream, bufferedOutputStream);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        fileInputStream.close();
        if (str3 == null || checkSum(str2, str3)) {
            return iM102991a != 0;
        }
        throw ContentBundleError.getChecksumMismatchException(str, str2, str3);
    }

    public InputStream createInputStreamFromFile(String str) throws IOException {
        return new FileInputStream(new File(str));
    }

    public boolean deleteLocalDirectory(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (!deleteLocalDirectory(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public boolean directoryExists(String str) {
        File file = new File(str);
        return file.isDirectory() && file.exists();
    }

    public String getActiveVersion(String str) {
        ContentVersionModel contentVersionModel;
        Map<String, ContentVersionModel> contentVersionModelMap = getContentVersionModelMap(str);
        if (contentVersionModelMap == null || (contentVersionModel = contentVersionModelMap.get(str)) == null) {
            return null;
        }
        return contentVersionModel.getActive();
    }

    public String getBaseLocation(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getDataDir());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public String getDataDir() {
        try {
            return this.contextWeakReference.get().getPackageManager().getPackageInfo(this.contextWeakReference.get().getPackageName(), 0).applicationInfo.dataDir;
        } catch (PackageManager.NameNotFoundException e10) {
            RAHybridLog.m85713e(TAG, "Couldn't read the package information to get data dir", e10);
            return null;
        }
    }

    public String getDownloadedVersion(String str) {
        ContentVersionModel contentVersionModel;
        Map<String, ContentVersionModel> contentVersionModelMap = getContentVersionModelMap(str);
        if (contentVersionModelMap == null || (contentVersionModel = contentVersionModelMap.get(str)) == null) {
            return null;
        }
        return contentVersionModel.getDownloaded();
    }

    public ContentManifestModel getLocalManifest(String str, String str2, HybridWebContentSyncConfig hybridWebContentSyncConfig) throws Exception {
        try {
            File file = new File(str2, hybridWebContentSyncConfig.getLocalManifestName());
            if (file.exists()) {
                return getLocalManifest(new FileInputStream(file.getPath()));
            }
            throw ContentBundleError.getManifestNotAvailableException(str, file.getPath());
        } catch (IOException e10) {
            RAHybridLog.m85713e(TAG, "getLocalManifest() IOException" + e10.getLocalizedMessage(), e10);
            return null;
        }
    }

    public String getLocalServerLocation(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getDataDir());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public String getLocalServerLocationWithVersion(String str, String str2) {
        if (str2 == null) {
            str2 = getActiveVersion(str);
        }
        if (str2 == null) {
            return null;
        }
        return getLocalServerLocation(str) + str2;
    }

    public void setActiveVersion(String str, String str2) {
        ContentVersionModel contentVersionModel;
        Map<String, ContentVersionModel> contentVersionModelMap = getContentVersionModelMap(str);
        if (contentVersionModelMap != null) {
            contentVersionModel = contentVersionModelMap.get(str);
            contentVersionModel.setActive(str2);
        } else {
            contentVersionModelMap = new HashMap<>();
            contentVersionModel = new ContentVersionModel(str2, null);
        }
        contentVersionModelMap.put(str, contentVersionModel);
        saveContentVersionModelMap(str, contentVersionModelMap);
    }

    public void setDownloadedVersion(String str, String str2) {
        ContentVersionModel contentVersionModel;
        Map<String, ContentVersionModel> contentVersionModelMap = getContentVersionModelMap(str);
        if (contentVersionModelMap != null) {
            contentVersionModel = contentVersionModelMap.get(str);
            contentVersionModel.setDownloaded(str2);
        } else {
            contentVersionModelMap = new HashMap<>();
            contentVersionModel = new ContentVersionModel(null, str2);
        }
        contentVersionModelMap.put(str, contentVersionModel);
        saveContentVersionModelMap(str, contentVersionModelMap);
    }

    public ContentManifestModel getLocalManifest(InputStream inputStream) throws JsonSyntaxException, JsonIOException {
        try {
            return (ContentManifestModel) GsonInstrumentation.fromJson(new Gson(), (Reader) new BufferedReader(new InputStreamReader(inputStream)), ContentManifestModel.class);
        } catch (JsonIOException | JsonSyntaxException e10) {
            RAHybridLog.m85713e(TAG, "getLocalManifest() IOException" + e10.getLocalizedMessage(), e10);
            return null;
        }
    }
}