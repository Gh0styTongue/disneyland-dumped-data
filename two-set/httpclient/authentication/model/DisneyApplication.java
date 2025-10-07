package com.disney.wdpro.httpclient.authentication.model;

import com.google.common.base.C22459j;

/* loaded from: classes23.dex */
public class DisneyApplication {
    private final String clientId;

    /* renamed from: id */
    private final String f33417id;
    private final boolean informationRequired;

    public DisneyApplication(String str, String str2, boolean z10) {
        this.f33417id = str;
        this.clientId = str2;
        this.informationRequired = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C22459j.m68660a(this.f33417id, ((DisneyApplication) obj).f33417id);
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getId() {
        return this.f33417id;
    }

    public int hashCode() {
        return C22459j.m68661b(this.f33417id);
    }

    public boolean isInformationRequired() {
        return this.informationRequired;
    }
}