package com.disney.wdpro.httpclient;

import java.util.List;

/* renamed from: com.disney.wdpro.httpclient.z */
/* loaded from: classes23.dex */
public interface InterfaceC13354z {

    /* renamed from: com.disney.wdpro.httpclient.z$a */
    public interface a {
        String getMessage();

        String getSystemErrorCode();

        String getTypeId();
    }

    List<? extends a> getErrors();
}