package com.disney.wdpro.payments.models.enums;

import com.disney.wdpro.paymentsui.constants.PaymentsAnalyticsEventKt;

/* loaded from: classes15.dex */
public enum CardTypeEnum {
    CREDIT_CARD(PaymentsAnalyticsEventKt.CREDIT_PAYMENT_TYPE),
    DEBIT_CARD("DebitCard"),
    GIFT_CARD(PaymentsAnalyticsEventKt.GIFT_PAYMENT_TYPE),
    REWARDS_CARD("RewardsCard"),
    DVIC("DisneyVisaInstantCredit");

    private final String value;

    CardTypeEnum(String str) {
        this.value = str;
    }

    public static CardTypeEnum fromValue(String str) {
        for (CardTypeEnum cardTypeEnum : values()) {
            if (cardTypeEnum.value.equals(str)) {
                return cardTypeEnum;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}