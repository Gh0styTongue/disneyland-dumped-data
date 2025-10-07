package com.disney.wdpro.queueit;

/* renamed from: com.disney.wdpro.queueit.n */
/* loaded from: classes16.dex */
public class C19474n {
    private final RedirectType _RedirectType;
    private final boolean _isPassedThrough;
    private final String _queueItToken;
    private final String _queueUrl;
    private final String _targetUrl;
    private final int _urlTTLInMinutes;

    public C19474n(String str, String str2, String str3, int i10, boolean z10, RedirectType redirectType) {
        this._queueItToken = str;
        this._queueUrl = str2;
        this._targetUrl = str3;
        this._urlTTLInMinutes = i10;
        this._isPassedThrough = z10;
        this._RedirectType = redirectType;
    }

    /* renamed from: a */
    public String m61116a() {
        return this._queueItToken;
    }

    /* renamed from: b */
    public String m61117b() {
        return this._queueUrl;
    }

    /* renamed from: c */
    public RedirectType m61118c() {
        return this._RedirectType;
    }

    /* renamed from: d */
    public String m61119d() {
        return this._targetUrl;
    }
}