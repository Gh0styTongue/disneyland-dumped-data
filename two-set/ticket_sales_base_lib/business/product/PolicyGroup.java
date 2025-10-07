package com.disney.wdpro.ticket_sales_base_lib.business.product;

/* loaded from: classes18.dex */
public enum PolicyGroup {
    MATCH_ALL,
    GUEST_POLICY,
    TERMS_OF_USE,
    ORDER_CONFIRMATION,
    TICKET_SELECTION;

    public enum PolicyDescriptionKey {
        MATCH_ALL,
        GUEST_POLICY_DESCRIPTION,
        TERMS_OF_USE_DESCRIPTION,
        MAX_PASS_TOGGLE_HEADER,
        MAX_PASS_TOGGLE_BODY,
        TOGGLE_DESCRIPTION,
        ORDER_CONFIRMATION_DELIVERY_INSTRUCTIONS_TITLE_DESCRIPTION,
        ORDER_CONFIRMATION_DELIVERY_INSTRUCTIONS_BODY_DESCRIPTION,
        ORDER_CONFIRMATION_TICKET_FINE_PRINT_DESCRIPTION,
        TICKET_SELECTION_DAY_POLICY_DESCRIPTION
    }

    public enum PolicySubGroup {
        MATCH_ALL,
        MOBILE_RESTRICTION,
        EXPIRATION_RESTRICTION,
        PARK_RESTRICTION,
        GENERAL_CONDITION
    }
}