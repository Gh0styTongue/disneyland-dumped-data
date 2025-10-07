package com.disney.wdpro.queueit;

import android.net.Uri;
import com.disney.wdpro.service.utils.Constants;
import okhttp3.HttpUrl;

/* renamed from: com.disney.wdpro.queueit.o */
/* loaded from: classes16.dex */
public abstract class AbstractC19475o {
    /* renamed from: a */
    public static Uri m61120a(Uri uri, String str) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            encodedQuery = "";
        }
        if (!encodedQuery.contains("userId=")) {
            encodedQuery = "userId=" + str + Constants.AMPERSAND + encodedQuery;
        }
        return Uri.parse(new HttpUrl.Builder().scheme(uri.getScheme()).host(uri.getHost()).encodedPath(uri.getPath()).encodedQuery(encodedQuery).build().url().toString());
    }

    /* renamed from: b */
    public static Uri m61121b(String str, String str2) {
        try {
            return m61120a(Uri.parse(str), str2);
        } catch (Exception e10) {
            e10.printStackTrace();
            return Uri.parse(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m61122c(android.net.Uri r4, java.lang.String r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r4 = r4.getQuery()
            if (r4 != 0) goto Lc
            java.lang.String r4 = ""
        Lc:
            java.lang.String r1 = "userId=%s"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r5 = java.lang.String.format(r1, r5)
            boolean r1 = r4.startsWith(r5)
            r2 = 1
            if (r1 != 0) goto L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "&"
            r1.append(r3)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L35
        L34:
            r0 = r2
        L35:
            r4 = r0 ^ 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.queueit.AbstractC19475o.m61122c(android.net.Uri, java.lang.String):boolean");
    }

    /* renamed from: d */
    public static boolean m61123d(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return m61122c(Uri.parse(str), str2);
    }
}