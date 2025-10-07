package com.disney.wdpro.httpclient;

import android.accounts.AuthenticatorException;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.google.common.base.C22466q;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.disney.wdpro.httpclient.c */
/* loaded from: classes23.dex */
public class C13330c implements InterfaceC13343o {
    private static final int MAX_AUTH_RETRIES = 2;
    protected final AuthenticationManager authManager;
    private final String authenticationType;
    private Request<?> request;
    private final String requesterSwid;
    private boolean requiresSecureScope;
    private final ArrayList<Integer> statusCodes;
    private boolean stopRetry;

    public C13330c(AuthenticationManager authenticationManager, String str, String str2) {
        this(authenticationManager, str, str2, Collections.EMPTY_LIST);
    }

    protected String getToken(String str, String str2) throws AuthenticatorException {
        try {
            try {
                return this.authManager.getAuthToken(str, str2, this.requiresSecureScope);
            } catch (AuthenticatorException e10) {
                throw e10;
            }
        } finally {
            this.requiresSecureScope = false;
        }
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13351w
    public void intercept(Request<?> request) throws InterceptException {
        this.request = request;
        if (C22466q.m68722b(this.authenticationType)) {
            return;
        }
        try {
            request.m55548k("Authorization", "BEARER " + getToken(this.authenticationType, this.requesterSwid));
        } catch (AuthenticatorException e10) {
            throw new InterceptException(e10);
        }
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public boolean interceptResponse(int i10) {
        return this.statusCodes.contains(Integer.valueOf(i10));
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public boolean shouldRetryRequest() {
        return !this.stopRetry && this.request.m55545h() < 2;
    }

    public C13330c(AuthenticationManager authenticationManager, String str, String str2, List<Integer> list) {
        ArrayList<Integer> arrayListM69271l = Lists.m69271l(401, 403);
        this.statusCodes = arrayListM69271l;
        this.authenticationType = str;
        this.requesterSwid = str2;
        this.authManager = authenticationManager;
        if (list == null || list.size() <= 0) {
            return;
        }
        arrayListM69271l.removeAll(list);
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public void intercept(C13352x<?> c13352x) throws InterceptException {
        int iM55684d = c13352x.m55684d();
        if (iM55684d == 401) {
            this.authManager.invalidateAuthToken(this.authenticationType);
        } else {
            if (iM55684d != 403) {
                return;
            }
            if ("com.disney.android.guest".equals(this.authenticationType)) {
                this.requiresSecureScope = true;
            } else {
                this.authManager.invalidateAuthToken("com.disney.android.public");
            }
        }
    }
}