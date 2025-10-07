package com.wdpr.p479ee.p480ra.rahybrid.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

/* loaded from: classes21.dex */
public class Constants {
    public static final String ABOUT_SCHEME = "about";
    public static final String ACCESS_TOKEN_MISSING = "AccessTokenEmpty";
    public static final String ACTION_WEB_CONTENT_SYNC_COMPLETE = "com.wdpr.ee.ra.hybridweb.downloader.action.WEB_CONTENT_SYNC_COMPLETE";
    public static final String ALREADY_UP_TO_DATE = "ALREADY UP_TO DATE";
    public static final String AUTHORIZATION = "Authorization";
    public static final String CONFIG_ID = "config_id";
    public static final String CONTENT_SYNC_RESULT_RECEIVER = "content_sync_manager_result_receiver";
    public static final String DEFAULT = "DEFAULT";
    public static final String EMPTY_COOKIES = "EmptyCookies";
    public static final int ERROR_AUTHENTICATION = -4;
    public static final int ERROR_BAD_URL = -12;
    public static final int ERROR_CONNECT = -6;
    public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
    public static final int ERROR_FILE = -13;
    public static final int ERROR_FILE_NOT_FOUND = -14;
    public static final int ERROR_HOST_LOOKUP = -2;
    public static final int ERROR_IO = -7;
    public static final int ERROR_PROXY_AUTHENTICATION = -5;
    public static final int ERROR_REDIRECT_LOOP = -9;
    public static final int ERROR_TIMEOUT = -8;
    public static final int ERROR_TOO_MANY_REQUESTS = -15;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_UNSAFE_RESOURCE = -16;
    public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
    public static final int ERROR_UNSUPPORTED_SCHEME = -10;
    public static final String FAILED_TO_CREATE_REFRESH_AUTH_URL = "Failed To Create Refresh Auth URL";
    public static final String HTTPS_SCHEME = "https";
    public static final String HTTP_SCHEME = "http";
    public static final String INJECTION_FAILURE = "CookieInjectionFailure";
    public static final String JWT_PUBLIC_KEY_STRING = "JWTPublicKeyString";
    public static final String JWT_TOKEN_NAME = "pep_jwt_token";
    public static final int LOGIN_CALLED_FOR_RESULT = 1001;
    public static final String MALFORMED_RESPONSE = "Malformed Response";
    public static final String MALFORMED_URL = "MalformedURL";
    public static final String MANIFEST_NEW_VERSION = "manifestNewVersion";
    public static final String MANIFEST_OLD_VERSION = "manifestOldVersion";
    public static final String PEM_FILE_EXTENSION = ".public.pem";
    public static final String PLUGIN_ANALYTICS = "AnalyticsPlugin";
    public static final String PLUGIN_CUSTOM = "CustomPlugin";
    public static final String PLUGIN_SSO = "SSOPlugin";
    public static final String PLUGIN_WEBVIEW_LOAD_PLUGIN = "WebViewLoadPlugin";
    public static final String PUBLIC_KEY_NOT_PROVIDED_MSG = "Public Key not provided";
    public static final String RAHYBRID_SCHEME = "rahybrid";
    public static final String REFRESH_TOKEN_MISSING = "RefreshTokenEmpty";
    public static final String REMOTE_MANIFEST_SYNC_FAILED_MSG = "Remote Manifest failed validation";
    public static final String RSA_ALGORITHM = "RSA";
    public static final int SECONDS_OF_ALLOWED_CLOCK_SKEW = 30;
    public static final String SEPARATOR = "/";
    public static final String SESSION_TIMEOUT = "SESSION_TIMEOUT";
    public static final String SINGLE_SPACE = " ";
    public static final String TOKENSTORE_NULL = "TokenStoreNull";
    public static final String TOKEN_CALL_FAILURE = "TokenCallFailure";
    public static final String TOKEN_RESPONSE_FAILURE = "TokenResponseFailure";
    public static final String TOKEN_RESPONSE_NULL = "TokenResponseNull";
    public static final String TOKEN_URL_MALFORMED = "TokenUrlMalformed";
    public static final String TOKEN_URL_NULL = "TokenUrlEmpty";
    public static final String UNKNOWN_ERROR = "UnknownError";
    public static final String UNKNOWN_ERROR_REASON = "ErrorUnknown";
    public static final String UPDATE_AVAILABLE = "UPDATE AVAILABLE";
    public static final String URL_TOKEN_CHARACTER_END = "}";
    public static final String URL_TOKEN_CHARACTER_START = "{";
    public static final String USER_AGENT = "user_agent";
    public static final String UTF_8 = "UTF-8";
    public static final String WEB_CONTENT_SYNC_CONFIG = "web_content_sync";
    public static final String WEB_CONTENT_SYNC_ERROR = "webContentSyncError";
    public static final String WEB_VIEW_BUNDLE = "WebViewBundleKey";
    public static final String WEB_VIEW_COOKIES = "WebViewCookiesMapKey";
    public static final String contentURLKey = "contentUrl";
    public static final String resourceMD5Key = "md5";
    public static final String resourcePathKey = "path";
    public static final String resourcesKey = "resources";
    public static final String userAgentKey = "userAgent";
    public static final String versionKey = "version";
    public static final Pattern IMAGE_PATTERN = Pattern.compile("(?:([^:/?#]+):)?(?://([^/?#]*))?([^?#]*\\.(?:jpg|gif|png))(?:\\?([^#]*))?(?:#(.*))?");
    public static final Pattern JS_PATTERN = Pattern.compile("(?:([^:/?#]+):)?(?://([^/?#]*))?([^?#]*\\.(?:js))(?:\\?([^#]*))?(?:#(.*))?");
    public static final Pattern CSS_PATTERN = Pattern.compile("(?:([^:/?#]+):)?(?://([^/?#]*))?([^?#]*\\.(?:css))(?:\\?([^#]*))?(?:#(.*))?");

    public @interface CookieInjectionErrorCode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SSOErrorCode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface WebViewClientErrorCode {
    }

    public static String getSSOErrorCode(String str) {
        return str;
    }
}