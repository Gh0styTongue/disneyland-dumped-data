package com.disney.wdpro.ticket_sales_base_lib.business.httpclient;

import com.disney.wdpro.httpclient.InterfaceC13334f;
import com.google.common.base.C22452c;
import com.google.common.p466io.C22826c;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

/* loaded from: classes18.dex */
public class StringDecoder implements InterfaceC13334f {
    @Override // com.disney.wdpro.httpclient.InterfaceC13334f
    public Object decode(InputStream inputStream, Type type) throws IOException {
        return C22826c.m69732f(new InputStreamReader(inputStream, C22452c.f48480c));
    }
}