package com.disney.wdpro.payments.models;

import com.disney.wdpro.payments.models.enums.CardTypeEnum;
import java.io.Serializable;

/* loaded from: classes15.dex */
public class BalanceCheckRequest implements Serializable {
    private static final long serialVersionUID = 1;

    class BalanceCheckToken implements Serializable {
        private static final long serialVersionUID = 1;
        private String cardToken;
        private CardTypeEnum type;

        public BalanceCheckToken(String str, CardTypeEnum cardTypeEnum) {
            this.cardToken = str;
            this.type = cardTypeEnum;
        }

        public String getToken() {
            return this.cardToken;
        }

        public CardTypeEnum getType() {
            return this.type;
        }

        public void setToken(String str) {
            this.cardToken = str;
        }

        public void setType(CardTypeEnum cardTypeEnum) {
            this.type = cardTypeEnum;
        }
    }
}