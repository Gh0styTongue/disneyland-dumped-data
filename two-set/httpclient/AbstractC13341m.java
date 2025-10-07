package com.disney.wdpro.httpclient;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.disney.wdpro.httpclient.m */
/* loaded from: classes23.dex */
public abstract class AbstractC13341m {
    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(4);

    /* renamed from: a */
    public abstract <T> C13352x<T> mo55656a(Request<T> request, InterfaceC13334f interfaceC13334f, InterfaceC13336h interfaceC13336h, List<InterfaceC13351w> list, List<InterfaceC13353y> list2) throws IOException;
}