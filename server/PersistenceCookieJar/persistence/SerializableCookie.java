package com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence;

import com.newrelic.agent.android.instrumentation.Instrumented;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import okhttp3.Cookie;

@Instrumented
/* loaded from: classes21.dex */
public class SerializableCookie implements Serializable {
    private static long NON_VALID_EXPIRES_AT = -1;
    private static final String TAG = "SerializableCookie";
    private static final long serialVersionUID = -8594045714036645534L;
    private transient Cookie cookie;

    private static String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            if (i10 < 16) {
                sb2.append('0');
            }
            sb2.append(Integer.toHexString(i10));
        }
        return sb2.toString();
    }

    private static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Cookie.Builder builder = new Cookie.Builder();
        builder.name((String) objectInputStream.readObject());
        builder.value((String) objectInputStream.readObject());
        long j10 = objectInputStream.readLong();
        if (j10 != NON_VALID_EXPIRES_AT) {
            builder.expiresAt(j10);
        }
        String str = (String) objectInputStream.readObject();
        builder.domain(str);
        builder.path((String) objectInputStream.readObject());
        if (objectInputStream.readBoolean()) {
            builder.secure();
        }
        if (objectInputStream.readBoolean()) {
            builder.httpOnly();
        }
        if (objectInputStream.readBoolean()) {
            builder.hostOnlyDomain(str);
        }
        this.cookie = builder.build();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.cookie.name());
        objectOutputStream.writeObject(this.cookie.value());
        objectOutputStream.writeLong(this.cookie.persistent() ? this.cookie.expiresAt() : NON_VALID_EXPIRES_AT);
        objectOutputStream.writeObject(this.cookie.domain());
        objectOutputStream.writeObject(this.cookie.path());
        objectOutputStream.writeBoolean(this.cookie.secure());
        objectOutputStream.writeBoolean(this.cookie.httpOnly());
        objectOutputStream.writeBoolean(this.cookie.hostOnly());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001e -> B:35:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public okhttp3.Cookie decode(java.lang.String r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.String r4 = "Stream not closed in decodeCookie"
            byte[] r5 = hexStringToByteArray(r5)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L2a java.lang.ClassNotFoundException -> L2e java.io.IOException -> L31
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2a java.lang.ClassNotFoundException -> L2e java.io.IOException -> L31
            java.lang.Object r0 = r1.readObject()     // Catch: java.lang.Throwable -> L24 java.lang.ClassNotFoundException -> L26 java.io.IOException -> L28
            com.wdpr.ee.ra.rahybrid.server.PersistenceCookieJar.persistence.SerializableCookie r0 = (com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.SerializableCookie) r0     // Catch: java.lang.Throwable -> L24 java.lang.ClassNotFoundException -> L26 java.io.IOException -> L28
            okhttp3.Cookie r5 = r0.cookie     // Catch: java.lang.Throwable -> L24 java.lang.ClassNotFoundException -> L26 java.io.IOException -> L28
            r1.close()     // Catch: java.io.IOException -> L1d
            goto L4d
        L1d:
            r0 = move-exception
            java.lang.String r1 = com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.SerializableCookie.TAG
            com.newrelic.agent.android.instrumentation.LogInstrumentation.m79025d(r1, r4, r0)
            goto L4d
        L24:
            r5 = move-exception
            goto L4e
        L26:
            r0 = move-exception
            goto L34
        L28:
            r0 = move-exception
            goto L41
        L2a:
            r0 = move-exception
            r1 = r5
            r5 = r0
            goto L4e
        L2e:
            r0 = move-exception
            r1 = r5
            goto L34
        L31:
            r0 = move-exception
            r1 = r5
            goto L41
        L34:
            java.lang.String r2 = com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.SerializableCookie.TAG     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "ClassNotFoundException in decodeCookie"
            com.newrelic.agent.android.instrumentation.LogInstrumentation.m79025d(r2, r3, r0)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.io.IOException -> L1d
            goto L4d
        L41:
            java.lang.String r2 = com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.SerializableCookie.TAG     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "IOException in decodeCookie"
            com.newrelic.agent.android.instrumentation.LogInstrumentation.m79025d(r2, r3, r0)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.io.IOException -> L1d
        L4d:
            return r5
        L4e:
            if (r1 == 0) goto L5a
            r1.close()     // Catch: java.io.IOException -> L54
            goto L5a
        L54:
            r0 = move-exception
            java.lang.String r1 = com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.SerializableCookie.TAG
            com.newrelic.agent.android.instrumentation.LogInstrumentation.m79025d(r1, r4, r0)
        L5a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.SerializableCookie.decode(java.lang.String):okhttp3.Cookie");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String encode(okhttp3.Cookie r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.String r0 = "Stream not closed in encodeCookie"
            r4.cookie = r5
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r2.writeObject(r4)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            r2.close()     // Catch: java.io.IOException -> L16
            goto L1c
        L16:
            r4 = move-exception
            java.lang.String r1 = com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.SerializableCookie.TAG
            com.newrelic.agent.android.instrumentation.LogInstrumentation.m79025d(r1, r0, r4)
        L1c:
            byte[] r4 = r5.toByteArray()
            java.lang.String r4 = byteArrayToHexString(r4)
            return r4
        L25:
            r4 = move-exception
            r1 = r2
            goto L42
        L28:
            r4 = move-exception
            goto L2e
        L2a:
            r4 = move-exception
            goto L42
        L2c:
            r4 = move-exception
            r2 = r1
        L2e:
            java.lang.String r5 = com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.SerializableCookie.TAG     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "IOException in encodeCookie"
            com.newrelic.agent.android.instrumentation.LogInstrumentation.m79025d(r5, r3, r4)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L41
            r2.close()     // Catch: java.io.IOException -> L3b
            goto L41
        L3b:
            r4 = move-exception
            java.lang.String r5 = com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.SerializableCookie.TAG
            com.newrelic.agent.android.instrumentation.LogInstrumentation.m79025d(r5, r0, r4)
        L41:
            return r1
        L42:
            if (r1 == 0) goto L4e
            r1.close()     // Catch: java.io.IOException -> L48
            goto L4e
        L48:
            r5 = move-exception
            java.lang.String r1 = com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.SerializableCookie.TAG
            com.newrelic.agent.android.instrumentation.LogInstrumentation.m79025d(r1, r0, r5)
        L4e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.SerializableCookie.encode(okhttp3.Cookie):java.lang.String");
    }
}