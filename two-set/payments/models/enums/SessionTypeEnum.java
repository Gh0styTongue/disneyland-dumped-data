package com.disney.wdpro.payments.models.enums;

import com.disney.wdpro.paymentsui.constants.PaymentsAnalyticsEventKt;

/* loaded from: classes15.dex */
public enum SessionTypeEnum {
    PAYMENT(PaymentsAnalyticsEventKt.PAYMENT_ALERT_TYPE),
    REFUND("Refund"),
    RECURRING_PAYMENT("RecurringPayment"),
    VALIDATE_CARD("ValidateCard");

    private final String value;

    SessionTypeEnum(String str) {
        this.value = str;
    }

    public static SessionTypeEnum fromValue(String str) {
        for (SessionTypeEnum sessionTypeEnum : values()) {
            if (sessionTypeEnum.value.equals(str)) {
                return sessionTypeEnum;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}