package com.wdpr.p479ee.p480ra.rahybrid.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.wdpr.ee.ra.rahybrid.contentbundle.model.ContentManifestModel.Resource;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.model.ContentManifestModel;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebContentSyncConfig;
import com.wdpr.p479ee.p480ra.rahybrid.webContentSync.PublicKeyReadException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jose4j.jwa.AlgorithmConstraints;
import org.jose4j.jwt.consumer.C31247h;
import p1160zy.C34087b;

/* loaded from: classes21.dex */
public class JWTUtil {
    private static final String TAG = "JWTUtil";

    public static byte[] convertPEMStringToByteArray(String str) throws IOException {
        return readReaderFromPEMFormatIntoByteArray(new StringReader(str));
    }

    public static byte[] getByteArray(Context context, String str, HybridWebContentSyncConfig hybridWebContentSyncConfig) {
        String publicKey = hybridWebContentSyncConfig.getPublicKey();
        if (TextUtils.isEmpty(publicKey)) {
            return getPublicKeyFromAssetsIfExists(context, str);
        }
        try {
            return convertPEMStringToByteArray(publicKey);
        } catch (Exception e10) {
            RAHybridLog.m85713e(TAG, e10.getLocalizedMessage(), e10);
            return null;
        }
    }

    protected static KeyFactory getKeyFactory(String str) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(str);
    }

    protected static EncodedKeySpec getKeySpecFromKeyBytes(byte[] bArr) {
        return new X509EncodedKeySpec(bArr);
    }

    public static byte[] getPublicKeyFromAssetsIfExists(Context context, String str) {
        try {
            return readPEMAssetFileIntoByteArray(context, str + Constants.PEM_FILE_EXTENSION);
        } catch (IOException e10) {
            RAHybridLog.m85713e(TAG, e10.getLocalizedMessage(), e10);
            return null;
        }
    }

    public static PublicKey getPublicKeyFromString(String str) throws InvalidKeySpecException, NoSuchAlgorithmException, IOException {
        if (!TextUtils.isEmpty(str)) {
            return getRSAPublicKeyFromByteArray(convertPEMStringToByteArray(str));
        }
        RAHybridLog.m85712e(TAG, "Public key given is empty string");
        return null;
    }

    public static String getPublicKeyStringFromAssetsIfExists(Context context, String str) throws IOException {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str + Constants.PEM_FILE_EXTENSION);
            try {
                String strM102998h = C34087b.m102998h(inputStreamOpen);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                return strM102998h;
            } finally {
            }
        } catch (Exception e10) {
            RAHybridLog.m85713e(TAG, e10.getLocalizedMessage(), e10);
            return null;
        }
    }

    public static PublicKey getRSAPublicKeyFromByteArray(byte[] bArr) throws InvalidKeySpecException, NoSuchAlgorithmException, IOException {
        if (bArr != null) {
            return getKeyFactory("RSA").generatePublic(getKeySpecFromKeyBytes(bArr));
        }
        throw new PublicKeyReadException("RSA byte array of public key null");
    }

    public static HashSet<ContentManifestModel.Resource> getSetFromArrayList(List<LinkedHashMap<String, String>> list) {
        HashSet<ContentManifestModel.Resource> hashSet = new HashSet<>();
        if (list != null && !list.isEmpty()) {
            for (LinkedHashMap<String, String> linkedHashMap : list) {
                ContentManifestModel.Resource resource = new ContentManifestModel().new Resource();
                resource.setMd5(linkedHashMap.get(Constants.resourceMD5Key));
                resource.setPath(linkedHashMap.get(Constants.resourcePathKey));
                hashSet.add(resource);
            }
        }
        return hashSet;
    }

    protected static byte[] readPEMAssetFileIntoByteArray(Context context, String str) throws IOException {
        return readReaderFromPEMFormatIntoByteArray(new InputStreamReader(context.getAssets().open(str)));
    }

    public static PublicKey readRSAPublicKeyFromPemKeyNameInAssets(Context context, String str) throws InvalidKeySpecException, NoSuchAlgorithmException, IOException {
        byte[] pEMAssetFileIntoByteArray = readPEMAssetFileIntoByteArray(context, str);
        if (pEMAssetFileIntoByteArray != null) {
            return getRSAPublicKeyFromByteArray(pEMAssetFileIntoByteArray);
        }
        throw new PublicKeyReadException("Key bytes null");
    }

    protected static byte[] readReaderFromPEMFormatIntoByteArray(Reader reader) throws IOException {
        if (reader == null) {
            throw new PublicKeyReadException("Public Key input reader null");
        }
        BufferedReader bufferedReader = new BufferedReader(reader);
        String str = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return Base64.decode(str.replace("-----BEGIN PUBLIC KEY-----\n", "").replace("-----END PUBLIC KEY-----", ""), 0);
            }
            str = str + line + "\n";
        }
    }

    public static boolean validateManifest(Map<String, Object> map, ContentManifestModel contentManifestModel) {
        try {
            if (contentManifestModel.contentUrlMatches((String) map.get(Constants.contentURLKey)) && contentManifestModel.versionMatches((String) map.get("version")) && contentManifestModel.userAgentMatches((String) map.get(Constants.userAgentKey))) {
                return contentManifestModel.resourcesMatches(getSetFromArrayList((List) map.get(Constants.resourcesKey)));
            }
            return false;
        } catch (ClassCastException e10) {
            RAHybridLog.m85713e(TAG, "unexpected type in manifestFromJWT map", e10);
            return false;
        }
    }

    public static boolean validateToken(ContentManifestModel contentManifestModel, byte[] bArr) {
        if (contentManifestModel == null) {
            return false;
        }
        try {
            Map<String, Object> mapM91284e = new C31247h().m95953b(30).m95955d(getRSAPublicKeyFromByteArray(bArr)).m95954c(new AlgorithmConstraints(AlgorithmConstraints.ConstraintType.WHITELIST, "RS256")).m95952a().m95932d(contentManifestModel.getHashJwt()).m91284e();
            RAHybridLog.m85714i(TAG, "JWT verified");
            return mapM91284e != null && validateManifest(mapM91284e, contentManifestModel);
        } catch (Exception e10) {
            RAHybridLog.m85713e(TAG, "Invalid token or an error occurred", e10);
            return false;
        }
    }
}