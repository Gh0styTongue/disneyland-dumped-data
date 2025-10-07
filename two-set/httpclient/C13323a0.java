package com.disney.wdpro.httpclient;

import com.disney.wdpro.httpclient.InterfaceC13354z;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.disney.wdpro.httpclient.a0 */
/* loaded from: classes23.dex */
public class C13323a0 implements InterfaceC13354z {
    private String errorMessage;
    private List<a> errors = Collections.EMPTY_LIST;

    /* renamed from: com.disney.wdpro.httpclient.a0$a */
    public static class a implements InterfaceC13354z.a {
        private String message;
        private String systemErrorCode;
        private String typeId;

        static a build(String str, String str2, String str3) {
            a aVar = new a();
            aVar.message = str;
            aVar.systemErrorCode = str3;
            aVar.typeId = str2;
            return aVar;
        }

        @Override // com.disney.wdpro.httpclient.InterfaceC13354z.a
        public String getMessage() {
            return this.message;
        }

        @Override // com.disney.wdpro.httpclient.InterfaceC13354z.a
        public String getSystemErrorCode() {
            return this.systemErrorCode;
        }

        @Override // com.disney.wdpro.httpclient.InterfaceC13354z.a
        public String getTypeId() {
            return this.typeId;
        }
    }

    static C13323a0 build(String str, List<a> list) {
        C13323a0 c13323a0 = new C13323a0();
        c13323a0.errorMessage = str;
        c13323a0.errors = list;
        return c13323a0;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13354z
    public List<a> getErrors() {
        return this.errors;
    }

    void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (a aVar : this.errors) {
            sb2.append(String.format(Locale.US, "Error - type: %s - message: %s", aVar.typeId, aVar.message));
        }
        return sb2.toString();
    }
}