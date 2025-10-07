package com.disney.wdpro.payments.models;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes15.dex */
public class CardsToProcess implements Serializable {
    private static final long serialVersionUID = 8071548981045317573L;
    private final List<CardDetails> cards;
    private List<FraudParameter> fraudParameters;
    private Boolean retry;
    private Long ttp;

    public CardsToProcess(List<CardDetails> list, Boolean bool, Long l10, FraudParameter... fraudParameterArr) {
        this.retry = Boolean.FALSE;
        this.ttp = null;
        this.cards = list;
        if (fraudParameterArr.length > 0) {
            this.fraudParameters = Arrays.asList(fraudParameterArr);
        }
        if (l10 != null) {
            this.ttp = l10;
        }
        this.retry = bool;
    }

    public List<CardDetails> getCards() {
        return this.cards;
    }

    public List<FraudParameter> getFraudParameters() {
        return this.fraudParameters;
    }

    public Boolean getRetry() {
        return this.retry;
    }

    public Long getTtp() {
        return this.ttp;
    }

    public void setTtp(Long l10) {
        this.ttp = l10;
    }
}