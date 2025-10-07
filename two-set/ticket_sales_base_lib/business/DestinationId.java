package com.disney.wdpro.ticket_sales_base_lib.business;

import com.google.common.base.C22462m;
import java.io.Serializable;

/* loaded from: classes18.dex */
public class DestinationId implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: id */
    private final String f43899id;

    public DestinationId(String str) {
        C22462m.m68685q(str, "id == null");
        this.f43899id = str;
    }

    public String getId() {
        return this.f43899id;
    }

    public String toString() {
        return this.f43899id;
    }
}