package com.wdpr.p479ee.p480ra.rahybrid;

import android.net.Uri;
import cc.C6148a;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes21.dex */
public class WhiteList {
    private static final String REGEX_ESCAPED_CHARACTERS = "\\.[]{}()^$?+|";
    private static final String SUBDOMAIN_WITH_HOST_REGEX_STRING = "([a-z0-9.-]*\\.)?";
    private static final String TAG = "WhiteList";
    private ArrayList<URLPattern> whiteList = new ArrayList<>();
    private static final String URL_PARTS_MATCHING_STRING = "^((\\*|[A-Za-z-]+):(//)?)?(\\*|((\\*\\.)?[^*/:]+))?(:(\\d+))?(/.*)?";
    private static final Pattern URL_PARTS_MATCHER_PATTERN = Pattern.compile(URL_PARTS_MATCHING_STRING);

    private static class URLPattern {
        private Pattern host;
        private Pattern path;
        private Integer port;
        private Pattern scheme;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean matches(Uri uri) {
            Integer num;
            try {
                Pattern pattern = this.scheme;
                if (pattern == null || pattern.matcher(uri.getScheme()).matches()) {
                    Pattern pattern2 = this.host;
                    if ((pattern2 == null || pattern2.matcher(uri.getHost()).matches()) && ((num = this.port) == null || num.equals(Integer.valueOf(uri.getPort())))) {
                        Pattern pattern3 = this.path;
                        if (pattern3 == null) {
                            return true;
                        }
                        if (pattern3.matcher(uri.getPath()).matches()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Exception e10) {
                RAHybridLog.m85713e(WhiteList.TAG, e10.getLocalizedMessage(), e10);
                return false;
            }
        }

        private String regexFromPattern(String str, boolean z10) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '*' && z10) {
                    sb2.append(".");
                } else if (WhiteList.REGEX_ESCAPED_CHARACTERS.indexOf(cCharAt) > -1) {
                    sb2.append(AbstractJsonLexerKt.STRING_ESC);
                }
                sb2.append(cCharAt);
            }
            return sb2.toString();
        }

        private URLPattern(String str, String str2, String str3, String str4) throws MalformedURLException {
            if (str != null) {
                try {
                    if ("*".equals(str)) {
                        this.scheme = null;
                    } else {
                        this.scheme = Pattern.compile(regexFromPattern(str, false), 2);
                    }
                } catch (NumberFormatException unused) {
                    throw new MalformedURLException("Port must be a number");
                }
            } else {
                this.scheme = null;
            }
            if ("*".equals(str2)) {
                this.host = null;
            } else if (str2.startsWith("*.")) {
                this.host = Pattern.compile(WhiteList.SUBDOMAIN_WITH_HOST_REGEX_STRING + regexFromPattern(str2.substring(2), false), 2);
            } else {
                this.host = Pattern.compile(regexFromPattern(str2, false), 2);
            }
            if (str3 == null || "*".equals(str3)) {
                this.port = null;
            } else {
                this.port = Integer.valueOf(Integer.parseInt(str3, 10));
            }
            if (str4 != null && !"/*".equals(str4)) {
                this.path = Pattern.compile(regexFromPattern(str4, true));
                return;
            }
            this.path = null;
        }
    }

    public void addWhiteListEntry(String str) {
        if (this.whiteList == null) {
            return;
        }
        try {
            Matcher matcher = URL_PARTS_MATCHER_PATTERN.matcher(str);
            if (matcher.matches()) {
                String strGroup = matcher.group(2);
                String strGroup2 = matcher.group(4);
                if ((C6148a.FILE_KEY.equals(strGroup) || "content".equals(strGroup)) && strGroup2 == null) {
                    strGroup2 = "*";
                }
                String str2 = strGroup2;
                String strGroup3 = matcher.group(8);
                String strGroup4 = matcher.group(9);
                if (strGroup != null) {
                    this.whiteList.add(new URLPattern(strGroup, str2, strGroup3, strGroup4));
                } else {
                    this.whiteList.add(new URLPattern("http", str2, strGroup3, strGroup4));
                    this.whiteList.add(new URLPattern("https", str2, strGroup3, strGroup4));
                }
            }
        } catch (Exception e10) {
            RAHybridLog.m85713e(TAG, "adding to whitelist failed", e10);
        }
    }

    public boolean isUrlWhiteListed(String str) {
        ArrayList<URLPattern> arrayList = this.whiteList;
        if (arrayList != null && !arrayList.isEmpty()) {
            Uri uri = Uri.parse(str);
            Iterator<URLPattern> it = this.whiteList.iterator();
            while (it.hasNext()) {
                if (it.next().matches(uri)) {
                    return true;
                }
            }
        }
        return false;
    }
}