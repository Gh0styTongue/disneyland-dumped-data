package com.disney.wdpro.payments.models;

import com.disney.wdpro.payments.models.enums.CardTypeEnum;
import java.io.Serializable;

/* loaded from: classes15.dex */
public class TokenizeRequest implements Serializable {
    private static final long serialVersionUID = 8966048283853184126L;
    private String pan;
    private CardTypeEnum type;

    public TokenizeRequest(String str) {
        this.pan = str;
    }

    public String getPan() {
        return this.pan;
    }

    public CardTypeEnum getType() {
        return this.type;
    }

    public void setPan(String str) {
        this.pan = str;
    }

    public void setType(CardTypeEnum cardTypeEnum) {
        this.type = cardTypeEnum;
    }

    public TokenizeRequest(String str, CardTypeEnum cardTypeEnum) {
        this.pan = str;
        this.type = cardTypeEnum;
    }
}