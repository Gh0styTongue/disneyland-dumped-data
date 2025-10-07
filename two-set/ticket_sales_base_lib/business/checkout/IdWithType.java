package com.disney.wdpro.ticket_sales_base_lib.business.checkout;

import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserDataContainer;
import java.io.Serializable;

/* loaded from: classes18.dex */
public final class IdWithType implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: id */
    private final String f43900id;
    private final UserDataContainer.IdType type;

    public IdWithType(UserDataContainer.IdType idType, String str) {
        this.type = idType;
        this.f43900id = str;
    }

    public String getId() {
        return this.f43900id;
    }

    public UserDataContainer.IdType getType() {
        return this.type;
    }
}