package com.disney.wdpro.payments.models;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes15.dex */
public class ClientConfig implements Serializable {
    private static final long serialVersionUID = -3216638336859094202L;
    private final List<PaymentTypeEnum> allowedPaymentMethods;
    private final PaymentTypeEnum defaultPaymentType;

    public enum PaymentTypeEnum {
        CREDIT("credit"),
        GIFT("gift"),
        REWARD("reward");

        private String name;

        PaymentTypeEnum(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    public ClientConfig(PaymentTypeEnum paymentTypeEnum, List<PaymentTypeEnum> list) {
        this.defaultPaymentType = paymentTypeEnum;
        this.allowedPaymentMethods = list;
    }

    public List<PaymentTypeEnum> getAllowedPaymentMethods() {
        return this.allowedPaymentMethods;
    }

    public PaymentTypeEnum getDefaultPaymentType() {
        return this.defaultPaymentType;
    }
}