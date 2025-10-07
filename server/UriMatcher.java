package com.wdpr.p479ee.p480ra.rahybrid.server;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes21.dex */
public class UriMatcher {
    private static final int EXACT = 0;
    static final Pattern PATH_SPLIT_PATTERN = Pattern.compile("/");
    private static final int REST = 2;
    private static final int TEXT = 1;
    private ArrayList<UriMatcher> mChildren;
    private Object mCode;
    private String mText;
    private int mWhich;

    public UriMatcher(Object obj) {
        this.mCode = obj;
        this.mWhich = -1;
        this.mChildren = new ArrayList<>();
        this.mText = null;
    }

    public void addURI(String str, String str2, String str3, Object obj) {
        String[] strArrSplit;
        if (obj == null) {
            throw new IllegalArgumentException("Code can't be null");
        }
        if (str3 != null) {
            if (str3.length() > 0 && str3.charAt(0) == '/') {
                str3 = str3.substring(1);
            }
            strArrSplit = PATH_SPLIT_PATTERN.split(str3);
        } else {
            strArrSplit = null;
        }
        int length = strArrSplit != null ? strArrSplit.length : 0;
        int i10 = -2;
        while (i10 < length) {
            String str4 = i10 == -2 ? str : i10 == -1 ? str2 : strArrSplit[i10];
            ArrayList<UriMatcher> arrayList = this.mChildren;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                UriMatcher uriMatcher = arrayList.get(i11);
                if (str4.equals(uriMatcher.mText)) {
                    this = uriMatcher;
                    break;
                }
                i11++;
            }
            if (i11 == size) {
                UriMatcher uriMatcher2 = new UriMatcher();
                if (str4.equals("**")) {
                    uriMatcher2.mWhich = 2;
                } else if (str4.equals("*")) {
                    uriMatcher2.mWhich = 1;
                } else {
                    uriMatcher2.mWhich = 0;
                }
                uriMatcher2.mText = str4;
                this.mChildren.add(uriMatcher2);
                this = uriMatcher2;
            }
            i10++;
        }
        this.mCode = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[LOOP:1: B:20:0x0038->B:35:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0059 A[EDGE_INSN: B:45:0x0059->B:34:0x0059 BREAK  A[LOOP:1: B:20:0x0038->B:35:0x005b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object match(android.net.Uri r13) {
        /*
            r12 = this;
            java.util.List r0 = r13.getPathSegments()
            int r1 = r0.size()
            if (r1 != 0) goto L13
            java.lang.String r2 = r13.getAuthority()
            if (r2 != 0) goto L13
            java.lang.Object r12 = r12.mCode
            return r12
        L13:
            r2 = -2
            r3 = r2
        L15:
            if (r3 >= r1) goto L64
            if (r3 != r2) goto L1e
            java.lang.String r4 = r13.getScheme()
            goto L2c
        L1e:
            r4 = -1
            if (r3 != r4) goto L26
            java.lang.String r4 = r13.getAuthority()
            goto L2c
        L26:
            java.lang.Object r4 = r0.get(r3)
            java.lang.String r4 = (java.lang.String) r4
        L2c:
            java.util.ArrayList<com.wdpr.ee.ra.rahybrid.server.UriMatcher> r5 = r12.mChildren
            if (r5 != 0) goto L31
            goto L64
        L31:
            int r12 = r5.size()
            r6 = 0
            r7 = 0
            r8 = r6
        L38:
            if (r7 >= r12) goto L59
            java.lang.Object r9 = r5.get(r7)
            com.wdpr.ee.ra.rahybrid.server.UriMatcher r9 = (com.wdpr.p479ee.p480ra.rahybrid.server.UriMatcher) r9
            int r10 = r9.mWhich
            if (r10 == 0) goto L4e
            r11 = 1
            if (r10 == r11) goto L56
            r11 = 2
            if (r10 == r11) goto L4b
            goto L57
        L4b:
            java.lang.Object r12 = r9.mCode
            return r12
        L4e:
            java.lang.String r10 = r9.mText
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L57
        L56:
            r8 = r9
        L57:
            if (r8 == 0) goto L5b
        L59:
            r12 = r8
            goto L5e
        L5b:
            int r7 = r7 + 1
            goto L38
        L5e:
            if (r12 != 0) goto L61
            return r6
        L61:
            int r3 = r3 + 1
            goto L15
        L64:
            java.lang.Object r12 = r12.mCode
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wdpr.p479ee.p480ra.rahybrid.server.UriMatcher.match(android.net.Uri):java.lang.Object");
    }

    private UriMatcher() {
        this.mCode = null;
        this.mWhich = -1;
        this.mChildren = new ArrayList<>();
        this.mText = null;
    }
}