package com.disney.wdpro.httpclient;

import com.disney.wdpro.recommender.core.RecommenderConstants;
import com.disney.wdpro.service.utils.Constants;
import com.google.common.base.C22452c;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import p1162.C35266;

/* renamed from: com.disney.wdpro.httpclient.b0 */
/* loaded from: classes23.dex */
public abstract class AbstractC13329b0 implements Comparable<AbstractC13329b0> {
    private static final String DEFAULT_ENCODING = "UTF-8";
    public static final AbstractC13329b0 EMPTY;
    private static final char[] HEX_DIGITS;
    private static final String LOG = "b0";
    private static final String NOT_CACHED = "NOT CACHED";
    private static final int NOT_CALCULATED = -2;
    private static final int NOT_FOUND = -1;
    private static final String NOT_HIERARCHICAL = "This isn't a hierarchical URI.";
    private static final int NULL_TYPE_ID = 0;

    /* renamed from: com.disney.wdpro.httpclient.b0$a */
    private static abstract class a extends AbstractC13329b0 {
        private volatile String host;
        private volatile int port;
        private f userInfo;

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(AbstractC13329b0 abstractC13329b0) {
            return super.compareTo(abstractC13329b0);
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: k */
        public String mo55587k() {
            List<String> listMo55588l = mo55588l();
            int size = listMo55588l.size();
            if (size == 0) {
                return null;
            }
            return listMo55588l.get(size - 1);
        }

        private a() {
            super();
            this.host = AbstractC13329b0.NOT_CACHED;
            this.port = -2;
        }
    }

    /* renamed from: com.disney.wdpro.httpclient.b0$b */
    static abstract class b {
        volatile String decoded;
        volatile String encoded;

        b(String str, String str2) {
            this.encoded = str;
            this.decoded = str2;
        }

        /* renamed from: a */
        final String m55593a() {
            if (!AbstractC13329b0.NOT_CACHED.equals(this.decoded)) {
                return this.decoded;
            }
            String strM55577d = AbstractC13329b0.m55577d(this.encoded);
            this.decoded = strM55577d;
            return strM55577d;
        }
    }

    /* renamed from: com.disney.wdpro.httpclient.b0$c */
    public static final class c {
        private f authority;
        private f fragment;
        private f opaquePart;
        private g path;
        private f query;
        private String scheme;

        /* renamed from: d */
        private c m55594d(String str, String str2, String str3) {
            this.opaquePart = null;
            String str4 = AbstractC13329b0.m55580h(str, null) + "=" + AbstractC13329b0.m55580h(str2, null);
            f fVar = this.query;
            if (fVar == null) {
                this.query = f.m55613d(str4);
                return this;
            }
            String strM55615e = fVar.m55615e();
            if (strM55615e == null || strM55615e.length() == 0) {
                this.query = f.m55613d(str4);
                return this;
            }
            this.query = f.m55613d(strM55615e + str3 + str4);
            return this;
        }

        /* renamed from: j */
        private boolean m55595j() {
            if (this.scheme != null) {
                return true;
            }
            f fVar = this.authority;
            return (fVar == null || fVar == f.NULL) ? false : true;
        }

        /* renamed from: a */
        public c m55596a(String str) {
            return m55605l(g.m55618c(this.path, str));
        }

        /* renamed from: b */
        public c m55597b(String str) {
            return m55605l(g.m55617b(this.path, str));
        }

        /* renamed from: c */
        public c m55598c(String str, String str2) {
            return m55594d(str, str2, Constants.AMPERSAND);
        }

        /* renamed from: e */
        c m55599e(f fVar) {
            this.opaquePart = null;
            this.authority = fVar;
            return this;
        }

        /* renamed from: f */
        public c m55600f(String str) {
            return m55599e(f.m55612c(str));
        }

        /* renamed from: g */
        public AbstractC13329b0 m55601g() {
            if (this.opaquePart != null) {
                if (this.scheme != null) {
                    return new e(this.scheme, this.opaquePart, this.fragment);
                }
                throw new UnsupportedOperationException("An opaque URI must have a scheme.");
            }
            g gVarM55621h = this.path;
            if (gVarM55621h == null || gVarM55621h == g.NULL) {
                gVarM55621h = g.EMPTY;
            } else if (m55595j()) {
                gVarM55621h = g.m55621h(gVarM55621h);
            }
            return new d(this.scheme, this.authority, gVarM55621h, this.query, this.fragment);
        }

        /* renamed from: h */
        public c m55602h(String str) {
            return m55605l(g.m55620e(str));
        }

        /* renamed from: i */
        c m55603i(f fVar) {
            this.fragment = fVar;
            return this;
        }

        /* renamed from: k */
        c m55604k(f fVar) {
            this.opaquePart = fVar;
            return this;
        }

        /* renamed from: l */
        c m55605l(g gVar) {
            this.opaquePart = null;
            this.path = gVar;
            return this;
        }

        /* renamed from: m */
        c m55606m(f fVar) {
            this.opaquePart = null;
            this.query = fVar;
            return this;
        }

        /* renamed from: n */
        public c m55607n(String str) {
            this.scheme = str;
            return this;
        }

        public String toString() {
            return m55601g().toString();
        }
    }

    /* renamed from: com.disney.wdpro.httpclient.b0$d */
    private static class d extends a {
        static final int TYPE_ID = 3;
        private final f authority;
        private final f fragment;
        private final g path;
        private final f query;
        private final String scheme;
        private f ssp;
        private volatile String uriString;

        /* renamed from: t */
        private void m55608t(StringBuilder sb2) throws UnsupportedEncodingException {
            String strM55615e = this.authority.m55615e();
            if (strM55615e != null) {
                sb2.append(RecommenderConstants.DOUBLE_SLASH);
                sb2.append(strM55615e);
            }
            String strM55622f = this.path.m55622f();
            if (strM55622f != null) {
                sb2.append(strM55622f);
            }
            if (this.query.mo55616f()) {
                return;
            }
            sb2.append('?');
            sb2.append(this.query.m55615e());
        }

        /* renamed from: u */
        private String m55609u() throws UnsupportedEncodingException {
            StringBuilder sb2 = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb2.append(str);
                sb2.append(':');
            }
            m55608t(sb2);
            if (!this.fragment.mo55616f()) {
                sb2.append('#');
                sb2.append(this.fragment.m55615e());
            }
            return sb2.toString();
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: a */
        public c mo55584a() {
            return new c().m55607n(this.scheme).m55599e(this.authority).m55605l(this.path).m55606m(this.query).m55603i(this.fragment);
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: j */
        public String mo55586j() {
            return this.query.m55615e();
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: l */
        public List<String> mo55588l() {
            return this.path.m55623g();
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: m */
        public String mo55589m() {
            return this.query.m55593a();
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: q */
        public boolean mo55591q() {
            return true;
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        public String toString() throws UnsupportedEncodingException {
            if (!AbstractC13329b0.NOT_CACHED.equals(this.uriString)) {
                return this.uriString;
            }
            String strM55609u = m55609u();
            this.uriString = strM55609u;
            return strM55609u;
        }

        private d(String str, f fVar, g gVar, f fVar2, f fVar3) {
            super();
            this.uriString = AbstractC13329b0.NOT_CACHED;
            this.scheme = str;
            this.authority = f.m55614g(fVar);
            this.path = gVar == null ? g.NULL : gVar;
            this.query = f.m55614g(fVar2);
            this.fragment = f.m55614g(fVar3);
        }
    }

    /* renamed from: com.disney.wdpro.httpclient.b0$e */
    private static class e extends AbstractC13329b0 {
        static final int TYPE_ID = 2;
        private volatile String cachedString;
        private final f fragment;
        private final String scheme;
        private final f ssp;

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: a */
        public c mo55584a() {
            return new c().m55607n(this.scheme).m55604k(this.ssp).m55603i(this.fragment);
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(AbstractC13329b0 abstractC13329b0) {
            return super.compareTo(abstractC13329b0);
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: j */
        public String mo55586j() {
            return null;
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: k */
        public String mo55587k() {
            return null;
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: m */
        public String mo55589m() {
            return null;
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: q */
        public boolean mo55591q() {
            return false;
        }

        /* renamed from: t */
        public String m55610t() {
            return this.ssp.m55615e();
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        public String toString() {
            if (!AbstractC13329b0.NOT_CACHED.equals(this.scheme)) {
                return this.cachedString;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.scheme);
            sb2.append(':');
            sb2.append(m55610t());
            if (!this.fragment.mo55616f()) {
                sb2.append('#');
                sb2.append(this.fragment.m55615e());
            }
            String string = sb2.toString();
            this.cachedString = string;
            return string;
        }

        private e(String str, f fVar, f fVar2) {
            super();
            this.cachedString = AbstractC13329b0.NOT_CACHED;
            this.scheme = str;
            this.ssp = fVar;
            this.fragment = fVar2 == null ? f.NULL : fVar2;
        }
    }

    /* renamed from: com.disney.wdpro.httpclient.b0$f */
    static class f extends b {
        static final f NULL = new a(null);
        static final f EMPTY = new a("");

        /* renamed from: com.disney.wdpro.httpclient.b0$f$a */
        private static class a extends f {
            public a(String str) {
                super(str, str);
            }

            @Override // com.disney.wdpro.httpclient.AbstractC13329b0.f
            /* renamed from: f */
            boolean mo55616f() {
                return true;
            }
        }

        /* renamed from: b */
        static f m55611b(String str, String str2) {
            return str == null ? NULL : str.length() == 0 ? EMPTY : str2 == null ? NULL : str2.length() == 0 ? EMPTY : new f(str, str2);
        }

        /* renamed from: c */
        static f m55612c(String str) {
            return m55611b(AbstractC13329b0.NOT_CACHED, str);
        }

        /* renamed from: d */
        static f m55613d(String str) {
            return m55611b(str, AbstractC13329b0.NOT_CACHED);
        }

        /* renamed from: g */
        static f m55614g(f fVar) {
            return fVar == null ? NULL : fVar;
        }

        /* renamed from: e */
        String m55615e() {
            if (!AbstractC13329b0.NOT_CACHED.equals(this.encoded)) {
                return this.encoded;
            }
            String strM55579g = AbstractC13329b0.m55579g(this.decoded);
            this.encoded = strM55579g;
            return strM55579g;
        }

        /* renamed from: f */
        boolean mo55616f() {
            return false;
        }

        private f(String str, String str2) {
            super(str, str2);
        }
    }

    /* renamed from: com.disney.wdpro.httpclient.b0$g */
    static class g extends b {
        private h pathSegments;
        static final g NULL = new g(null, null);
        static final g EMPTY = new g("", "");

        private g(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: b */
        static g m55617b(g gVar, String str) {
            return m55618c(gVar, AbstractC13329b0.m55579g(str));
        }

        /* renamed from: c */
        static g m55618c(g gVar, String str) throws UnsupportedEncodingException {
            String str2;
            if (gVar == null) {
                return m55620e("/" + str);
            }
            String strM55622f = gVar.m55622f();
            if (strM55622f == null) {
                strM55622f = "";
            }
            int length = strM55622f.length();
            if (length == 0) {
                str2 = "/" + str;
            } else if (strM55622f.charAt(length - 1) == '/') {
                str2 = strM55622f + str;
            } else {
                str2 = strM55622f + "/" + str;
            }
            return m55620e(str2);
        }

        /* renamed from: d */
        static g m55619d(String str, String str2) {
            return str == null ? NULL : str.length() == 0 ? EMPTY : new g(str, str2);
        }

        /* renamed from: e */
        static g m55620e(String str) {
            return m55619d(str, AbstractC13329b0.NOT_CACHED);
        }

        /* renamed from: h */
        static g m55621h(g gVar) {
            String str;
            String str2 = gVar.encoded;
            String str3 = AbstractC13329b0.NOT_CACHED;
            boolean zEquals = AbstractC13329b0.NOT_CACHED.equals(str2);
            String str4 = !zEquals ? gVar.encoded : gVar.decoded;
            if (str4 == null || str4.length() == 0 || str4.startsWith("/")) {
                return gVar;
            }
            if (zEquals) {
                str = AbstractC13329b0.NOT_CACHED;
            } else {
                str = "/" + gVar.encoded;
            }
            if (!AbstractC13329b0.NOT_CACHED.equals(gVar.decoded)) {
                str3 = "/" + gVar.decoded;
            }
            return new g(str, str3);
        }

        /* renamed from: f */
        String m55622f() throws UnsupportedEncodingException {
            if (!AbstractC13329b0.NOT_CACHED.equals(this.encoded)) {
                return this.encoded;
            }
            String strM55580h = AbstractC13329b0.m55580h(this.decoded, "/");
            this.encoded = strM55580h;
            return strM55580h;
        }

        /* renamed from: g */
        h m55623g() throws UnsupportedEncodingException {
            h hVar = this.pathSegments;
            if (hVar != null) {
                return hVar;
            }
            String strM55622f = m55622f();
            if (strM55622f == null) {
                h hVar2 = h.EMPTY;
                this.pathSegments = hVar2;
                return hVar2;
            }
            i iVar = new i();
            int i10 = 0;
            while (true) {
                int iIndexOf = strM55622f.indexOf(47, i10);
                if (iIndexOf <= -1) {
                    break;
                }
                if (i10 < iIndexOf) {
                    iVar.m55624a(AbstractC13329b0.m55577d(strM55622f.substring(i10, iIndexOf)));
                }
                i10 = iIndexOf + 1;
            }
            if (i10 < strM55622f.length()) {
                iVar.m55624a(AbstractC13329b0.m55577d(strM55622f.substring(i10)));
            }
            h hVarM55625b = iVar.m55625b();
            this.pathSegments = hVarM55625b;
            return hVarM55625b;
        }
    }

    /* renamed from: com.disney.wdpro.httpclient.b0$h */
    static class h extends AbstractList<String> implements RandomAccess {
        static final h EMPTY = new h(null, 0);
        final String[] segments;
        final int size;

        h(String[] strArr, int i10) {
            this.segments = strArr;
            this.size = i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }

        @Override // java.util.AbstractList, java.util.List
        public String get(int i10) {
            if (i10 < this.size) {
                return this.segments[i10];
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: com.disney.wdpro.httpclient.b0$i */
    static class i {
        String[] segments;
        int size = 0;

        i() {
        }

        /* renamed from: a */
        void m55624a(String str) {
            String[] strArr = this.segments;
            if (strArr == null) {
                this.segments = new String[4];
            } else if (this.size + 1 == strArr.length) {
                String[] strArr2 = new String[strArr.length * 2];
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                this.segments = strArr2;
            }
            String[] strArr3 = this.segments;
            int i10 = this.size;
            this.size = i10 + 1;
            strArr3[i10] = str;
        }

        /* renamed from: b */
        h m55625b() {
            if (this.segments == null) {
                return h.EMPTY;
            }
            try {
                return new h(this.segments, this.size);
            } finally {
                this.segments = null;
            }
        }
    }

    /* renamed from: com.disney.wdpro.httpclient.b0$j */
    private static class j extends a {
        static final int TYPE_ID = 1;
        private f authority;
        private volatile int cachedFsi;
        private volatile int cachedSsi;
        private f fragment;
        private g path;
        private f query;
        private volatile String scheme;
        private f ssp;
        private final String uriString;

        /* renamed from: A */
        private f m55626A() {
            f fVar = this.ssp;
            if (fVar != null) {
                return fVar;
            }
            f fVarM55613d = f.m55613d(m55633H());
            this.ssp = fVarM55613d;
            return fVarM55613d;
        }

        /* renamed from: B */
        static String m55627B(String str, int i10) {
            int length = str.length();
            int i11 = i10 + 2;
            if (length <= i11 || str.charAt(i10 + 1) != '/' || str.charAt(i11) != '/') {
                return null;
            }
            int i12 = i10 + 3;
            int i13 = i12;
            while (i13 < length) {
                char cCharAt = str.charAt(i13);
                if (cCharAt == '#' || cCharAt == '/' || cCharAt == '?') {
                    break;
                }
                i13++;
            }
            return str.substring(i12, i13);
        }

        /* renamed from: C */
        private String m55628C() {
            int iM55634t = m55634t();
            if (iM55634t == -1) {
                return null;
            }
            return this.uriString.substring(iM55634t + 1);
        }

        /* renamed from: D */
        private String m55629D() {
            int i10;
            String str = this.uriString;
            int iM55635u = m55635u();
            if (iM55635u <= -1 || ((i10 = iM55635u + 1) != str.length() && str.charAt(i10) == '/')) {
                return m55630E(str, iM55635u);
            }
            return null;
        }

        /* renamed from: E */
        static String m55630E(String str, int i10) {
            int i11;
            int length = str.length();
            int i12 = i10 + 2;
            if (length > i12 && str.charAt(i10 + 1) == '/' && str.charAt(i12) == '/') {
                i11 = i10 + 3;
                while (i11 < length) {
                    char cCharAt = str.charAt(i11);
                    if (cCharAt == '#') {
                        return "";
                    }
                    if (cCharAt == '/') {
                        break;
                    }
                    if (cCharAt == '?') {
                        return "";
                    }
                    i11++;
                }
            } else {
                i11 = i10 + 1;
            }
            int i13 = i11;
            while (i13 < length) {
                char cCharAt2 = str.charAt(i13);
                if (cCharAt2 == '#' || cCharAt2 == '?') {
                    break;
                }
                i13++;
            }
            return str.substring(i11, i13);
        }

        /* renamed from: F */
        private String m55631F() {
            int iIndexOf = this.uriString.indexOf(63, m55635u());
            if (iIndexOf == -1) {
                return null;
            }
            int iM55634t = m55634t();
            if (iM55634t == -1) {
                return this.uriString.substring(iIndexOf + 1);
            }
            if (iM55634t < iIndexOf) {
                return null;
            }
            return this.uriString.substring(iIndexOf + 1, iM55634t);
        }

        /* renamed from: G */
        private String m55632G() {
            int iM55635u = m55635u();
            if (iM55635u == -1) {
                return null;
            }
            return this.uriString.substring(0, iM55635u);
        }

        /* renamed from: H */
        private String m55633H() {
            int iM55635u = m55635u();
            int iM55634t = m55634t();
            return iM55634t == -1 ? this.uriString.substring(iM55635u + 1) : this.uriString.substring(iM55635u + 1, iM55634t);
        }

        /* renamed from: t */
        private int m55634t() {
            if (this.cachedFsi != -2) {
                return this.cachedFsi;
            }
            int iIndexOf = this.uriString.indexOf(35, m55635u());
            this.cachedFsi = iIndexOf;
            return iIndexOf;
        }

        /* renamed from: u */
        private int m55635u() {
            if (this.cachedSsi != -2) {
                return this.cachedSsi;
            }
            int iIndexOf = this.uriString.indexOf(58);
            this.cachedSsi = iIndexOf;
            return iIndexOf;
        }

        /* renamed from: v */
        private f m55636v() {
            f fVar = this.authority;
            if (fVar != null) {
                return fVar;
            }
            f fVarM55613d = f.m55613d(m55627B(this.uriString, m55635u()));
            this.authority = fVarM55613d;
            return fVarM55613d;
        }

        /* renamed from: w */
        private f m55637w() {
            f fVar = this.fragment;
            if (fVar != null) {
                return fVar;
            }
            f fVarM55613d = f.m55613d(m55628C());
            this.fragment = fVarM55613d;
            return fVarM55613d;
        }

        /* renamed from: x */
        private g m55638x() {
            g gVar = this.path;
            if (gVar != null) {
                return gVar;
            }
            g gVarM55620e = g.m55620e(m55629D());
            this.path = gVarM55620e;
            return gVarM55620e;
        }

        /* renamed from: y */
        private f m55639y() {
            f fVar = this.query;
            if (fVar != null) {
                return fVar;
            }
            f fVarM55613d = f.m55613d(m55631F());
            this.query = fVarM55613d;
            return fVarM55613d;
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: a */
        public c mo55584a() {
            return mo55591q() ? new c().m55607n(m55640z()).m55599e(m55636v()).m55605l(m55638x()).m55606m(m55639y()).m55603i(m55637w()) : new c().m55607n(m55640z()).m55604k(m55626A()).m55603i(m55637w());
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: j */
        public String mo55586j() {
            return m55639y().m55615e();
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: l */
        public List<String> mo55588l() {
            return m55638x().m55623g();
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: m */
        public String mo55589m() {
            return m55639y().m55593a();
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        /* renamed from: q */
        public boolean mo55591q() {
            int iM55635u = m55635u();
            if (iM55635u == -1) {
                return true;
            }
            int i10 = iM55635u + 1;
            return this.uriString.length() != i10 && this.uriString.charAt(i10) == '/';
        }

        @Override // com.disney.wdpro.httpclient.AbstractC13329b0
        public String toString() {
            return this.uriString;
        }

        /* renamed from: z */
        public String m55640z() {
            if (!AbstractC13329b0.NOT_CACHED.equals(this.scheme)) {
                return this.scheme;
            }
            String strM55632G = m55632G();
            this.scheme = strM55632G;
            return strM55632G;
        }

        private j(String str) {
            super();
            this.cachedSsi = -2;
            this.cachedFsi = -2;
            this.scheme = AbstractC13329b0.NOT_CACHED;
            if (str == null) {
                throw new NullPointerException("uriString");
            }
            this.uriString = str;
        }
    }

    static {
        f fVar = f.NULL;
        EMPTY = new d(null, fVar, g.EMPTY, fVar, fVar);
        HEX_DIGITS = "0123456789ABCDEF".toCharArray();
    }

    /* renamed from: d */
    public static String m55577d(String str) {
        if (str == null) {
            return null;
        }
        return m55578e(str, false, C22452c.f48480c, false);
    }

    /* renamed from: e */
    public static String m55578e(String str, boolean z10, Charset charset, boolean z11) {
        int iM55581o;
        int iM55581o2;
        if (str.indexOf(37) == -1 && (!z10 || str.indexOf(43) == -1)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '%') {
                do {
                    int i11 = i10 + 2;
                    if (i11 < str.length() && (iM55581o = m55581o(str.charAt(i10 + 1))) != -1 && (iM55581o2 = m55581o(str.charAt(i11))) != -1) {
                        byteArrayOutputStream.write((byte) ((iM55581o << 4) + iM55581o2));
                    } else {
                        if (z11) {
                            throw new IllegalArgumentException("Invalid % sequence at " + i10 + ": " + str);
                        }
                        byte[] bytes = "�".getBytes(charset);
                        byteArrayOutputStream.write(bytes, 0, bytes.length);
                    }
                    i10 += 3;
                    if (i10 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i10) == '%');
                sb2.append(new String(byteArrayOutputStream.toByteArray(), charset));
                byteArrayOutputStream.reset();
            } else {
                if (z10 && cCharAt == '+') {
                    cCharAt = ' ';
                }
                sb2.append(cCharAt);
                i10++;
            }
        }
        return sb2.toString();
    }

    /* renamed from: g */
    public static String m55579g(String str) {
        return m55580h(str, null);
    }

    /* renamed from: h */
    public static String m55580h(String str, String str2) throws UnsupportedEncodingException {
        StringBuilder sb2 = null;
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                int i11 = i10;
                while (i11 < length && m55582p(str.charAt(i11), str2)) {
                    i11++;
                }
                if (i11 != length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    if (i11 > i10) {
                        sb2.append((CharSequence) str, i10, i11);
                    }
                    i10 = i11 + 1;
                    while (i10 < length && !m55582p(str.charAt(i10), str2)) {
                        i10++;
                    }
                    try {
                        byte[] bytes = str.substring(i11, i10).getBytes("UTF-8");
                        int length2 = bytes.length;
                        for (int i12 = 0; i12 < length2; i12++) {
                            sb2.append('%');
                            char[] cArr = HEX_DIGITS;
                            sb2.append(cArr[(bytes[i12] & C35266.f897490463046304630463) >> 4]);
                            sb2.append(cArr[bytes[i12] & 15]);
                        }
                    } catch (UnsupportedEncodingException e10) {
                        throw new AssertionError(e10);
                    }
                } else if (i10 != 0) {
                    sb2.append((CharSequence) str, i10, length);
                    return sb2.toString();
                }
            } else if (sb2 != null) {
                return sb2.toString();
            }
        }
        return str;
    }

    /* renamed from: o */
    private static int m55581o(char c10) {
        if ('0' <= c10 && c10 <= '9') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 <= 'f') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    /* renamed from: p */
    private static boolean m55582p(char c10, String str) {
        if (c10 >= 'A' && c10 <= 'Z') {
            return true;
        }
        if (c10 >= 'a' && c10 <= 'z') {
            return true;
        }
        if ((c10 < '0' || c10 > '9') && "_-!.~'()*".indexOf(c10) == -1) {
            return (str == null || str.indexOf(c10) == -1) ? false : true;
        }
        return true;
    }

    /* renamed from: s */
    public static AbstractC13329b0 m55583s(String str) {
        return new j(str);
    }

    /* renamed from: a */
    public abstract c mo55584a();

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC13329b0 abstractC13329b0) {
        return toString().compareTo(abstractC13329b0.toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC13329b0) {
            return toString().equals(((AbstractC13329b0) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    /* renamed from: j */
    public abstract String mo55586j();

    /* renamed from: k */
    public abstract String mo55587k();

    /* renamed from: l */
    public abstract List<String> mo55588l();

    /* renamed from: m */
    public abstract String mo55589m();

    /* renamed from: n */
    public String m55590n(String str) throws UnsupportedEncodingException {
        if (m55592r()) {
            throw new UnsupportedOperationException(NOT_HIERARCHICAL);
        }
        if (str == null) {
            throw new NullPointerException("key");
        }
        String strMo55586j = mo55586j();
        if (strMo55586j == null) {
            return null;
        }
        String strM55580h = m55580h(str, null);
        int length = strMo55586j.length();
        int i10 = 0;
        while (true) {
            int iIndexOf = strMo55586j.indexOf(38, i10);
            int i11 = iIndexOf != -1 ? iIndexOf : length;
            int iIndexOf2 = strMo55586j.indexOf(61, i10);
            if (iIndexOf2 > i11 || iIndexOf2 == -1) {
                iIndexOf2 = i11;
            }
            if (iIndexOf2 - i10 == strM55580h.length() && strMo55586j.regionMatches(i10, strM55580h, 0, strM55580h.length())) {
                return iIndexOf2 == i11 ? "" : m55578e(strMo55586j.substring(iIndexOf2 + 1, i11), true, C22452c.f48480c, false);
            }
            if (iIndexOf == -1) {
                return null;
            }
            i10 = iIndexOf + 1;
        }
    }

    /* renamed from: q */
    public abstract boolean mo55591q();

    /* renamed from: r */
    public boolean m55592r() {
        return !mo55591q();
    }

    public abstract String toString();

    private AbstractC13329b0() {
    }
}