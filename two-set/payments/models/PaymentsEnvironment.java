package com.disney.wdpro.payments.models;

import com.google.android.gms.common.internal.ImagesContract;

/* loaded from: classes15.dex */
public interface PaymentsEnvironment {

    public enum PaymentServiceEnv {
        LOCAL(ImagesContract.LOCAL),
        LATEST("latest"),
        STAGE("stage"),
        LOAD("load"),
        SHADOW("shadow"),
        TEST("test"),
        PROD("prod");

        private final String name;

        PaymentServiceEnv(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum PaymentSheetChannelType {
        CNP_GUEST("CNP_GUEST"),
        CNP_CAST("CNP_CAST"),
        ENT("ENT");

        private final String name;

        PaymentSheetChannelType(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    PaymentServiceEnv getPaymentServiceEnvironment();

    default PaymentSheetChannelType getPaymentSheetChannelType() {
        return PaymentSheetChannelType.CNP_GUEST;
    }
}