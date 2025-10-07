package com.wdpr.p479ee.p480ra.rahybrid.contentbundle;

/* loaded from: classes21.dex */
public final class ContentBundleError {
    private ContentBundleError() {
    }

    public static Exception getAttemptToDeleteActiveVersionException(String str, String str2) {
        return getException("Cannot delete active version " + str2 + " for content with id: " + str);
    }

    public static Exception getBundlePathUnavailableException(String str) {
        return getException("Bundle path \"" + str + "\" not available in the app or framework dependencies");
    }

    public static Exception getChecksumMismatchException(String str, String str2, String str3) {
        return getException("Checksum did not match for content at " + str + "; file: " + str2 + "; expected MD5: " + str3);
    }

    public static Exception getContentManifestInvalidException(String str, String str2) {
        return getException("Manifest at path " + str2 + " for content with id:" + str + " is invalid");
    }

    public static Exception getContentUnavailableException(String str, String str2) {
        return getException("Content for id:" + str + " not available at " + str2);
    }

    public static Exception getContentVersionUnavailableException(String str, String str2) {
        return getException("Version [" + str2 + "] of content with id:" + str + " not available");
    }

    private static Exception getException(String str) {
        return new Exception(str);
    }

    public static Exception getJWTInvalidException(String str, String str2) {
        return getException("JWT validation failed for manifest at " + str2 + " with content id:" + str);
    }

    public static Exception getManifestNotAvailableException(String str, String str2) {
        return getException("Manifest for content with id:" + str + " is not available at " + str2);
    }

    public static Exception getPublicKeyNotFoundException(String str, String str2) {
        return getException("Public key not available at bundle path " + str2 + " for content id:" + str);
    }

    public static Exception getSyncAlreadyInProgressException(String str) {
        return getException("Content sync already in progress for content with id:" + str);
    }
}