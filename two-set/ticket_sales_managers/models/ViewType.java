package com.disney.wdpro.ticket_sales_managers.models;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes19.dex */
public interface ViewType {
    public static final int PARTY_MEMBER = 0;
    public static final int PARTY_MEMBERS_SECTION = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewTypes {
    }

    int getViewType();
}